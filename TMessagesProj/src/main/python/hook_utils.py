from java import jclass


def find_class(name):
    try:
        return jclass(name)
    except Exception:
        return None


def get_private_field(obj, name):
    cls = obj.getClass()
    while cls is not None:
        try:
            f = cls.getDeclaredField(name)
            f.setAccessible(True)
            return f.get(obj)
        except Exception:
            cls = cls.getSuperclass()
    return None


def set_private_field(obj, name, value):
    cls = obj.getClass()
    while cls is not None:
        try:
            f = cls.getDeclaredField(name)
            f.setAccessible(True)
            f.set(obj, value)
            return True
        except Exception:
            cls = cls.getSuperclass()
    return False


def get_static_private_field(clazz, name):
    return get_private_field_of_class(clazz, name, None)


def set_static_private_field(clazz, name, value):
    cls = clazz
    while cls is not None:
        try:
            f = cls.getDeclaredField(name)
            f.setAccessible(True)
            f.set(None, value)
            return True
        except Exception:
            cls = cls.getSuperclass()
    return False


def get_private_field_of_class(clazz, name, obj):
    cls = clazz
    while cls is not None:
        try:
            f = cls.getDeclaredField(name)
            f.setAccessible(True)
            return f.get(obj)
        except Exception:
            cls = cls.getSuperclass()
    return None
