package struts2.demo.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QueryAction.Answer[] getOptions() {
        return QueryAction.Answer.values();
    }

    public String execute() {
        if ("ANONYMOUS".equals(name)) {
            addFieldError("name", "Anonymous login not supported. Please give your real name");
            return INPUT;
        }
        return SUCCESS;
    }
}
