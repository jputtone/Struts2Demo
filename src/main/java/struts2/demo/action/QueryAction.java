package struts2.demo.action;

public class QueryAction extends LoginAction {
    private Answer answer;
    private String suggestion;

    public enum Answer {
        ICE_CREAM("ice cream"),
        CANDY("candy"),
        CHOCOLATE("chocolate");

        private String displayName;

        Answer(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return this.displayName;
        }
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public String getSuggestion() {
        return suggestion;
    }

    @Override
    public String execute() {
        switch (answer) {
            case CANDY:
                suggestion = "Jelly beans";
                break;
            case CHOCOLATE:
                suggestion = "Toblerone";
                break;
            case ICE_CREAM:
                suggestion = "Banana split";
                break;
        }
        return SUCCESS;
    }
}
