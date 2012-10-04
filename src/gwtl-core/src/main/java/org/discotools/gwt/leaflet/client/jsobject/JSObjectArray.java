package org.discotools.gwt.leaflet.client.jsobject;


/**
 * Wraps a Javascript array that contains "non-basic type" of elements or
 * elements of mixed type. "Basic type" elements are wrapped in the following
 * array classes:
 * <ul>
 *  <li>{@link JIntArray}</li>
 *  <li>{@link JBooleanArray}</li>
 *  <li>{@link JFloatArray}</li>
 *  <li>{@link JDoubleArray}</li>
 *  <li>{@link JStringArray}</li>
 * </ul>
 */
public class JSObjectArray extends JSArrayBase
{

    public static JSObjectArray narrowToJObjectArray(JSObject element)
    {
        return (element == null) ? null : new JSObjectArray(element);
    }

    protected JSObjectArray(JSObject element)
    {
        super(element);
    }

    public JSObjectArray(JSObject[] array)
    {
        super(array.length);

        for (int i = 0; i < array.length; i++)
        {
            set(i, array[i]);
        }
    }

    public JSObjectArray(JSObjectWrapper[] array)
    {
        super(array.length);

        for (int i = 0; i < array.length; i++)
        {
            set(i, array[i].getJSObject());
        }
    }

    public void set(int index, JSObject value)
    {
        JSObjectArrayImpl.arraySet(getJSObject(), index, value);
    }

    public JSObject get(int index)
    {
        return JSObjectArrayImpl.getAsJSObject(getJSObject(), index);
    }

    public JSObject[] toArray()
    {
        JSObject[] rtn = new JSObject[length()];

        for (int i = 0; i < rtn.length; i++)
        {
            if (JSObjectArrayImpl.isNumber(getJSObject(), i))
            {
                rtn[i] = JSObjectArrayImpl.getNumberAsJSObject(getJSObject(), i);
            }
            else if (JSObjectArrayImpl.isBoolean(getJSObject(), i))
            {
                rtn[i] = JSObjectArrayImpl.getBooleanAsJSObject(getJSObject(), i);
            }
            else
            {
                rtn[i] = JSObjectArrayImpl.getAsJSObject(getJSObject(), i);
            }
        }

        return rtn;
    }

}
