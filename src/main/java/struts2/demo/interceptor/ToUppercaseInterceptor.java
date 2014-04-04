package struts2.demo.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Interceptor to set name parameter to upper case letters
 */
public class ToUppercaseInterceptor extends AbstractInterceptor {

    public String intercept(ActionInvocation invocation) throws Exception {
        String name = invocation.getStack().findString("name");
        if (name != null)
            invocation.getStack().setValue("name", name.toUpperCase());
        return invocation.invoke();
    }
}
