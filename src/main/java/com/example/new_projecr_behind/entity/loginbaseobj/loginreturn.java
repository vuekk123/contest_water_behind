package com.example.new_projecr_behind.entity.loginbaseobj;
public class loginreturn {
    private Boolean success;
    private loginobj data;

    public loginreturn(Boolean success, loginobj data) {
        this.success = success;
        this.data = data;
    }

    public loginreturn() {
    }

    public Boolean getSuccess() {
        return success;
    }

    @Override
    public String toString() {
        return "loginreturn{" +
                "success=" + success +
                ", data=" + data +
                '}';
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public loginobj getData() {
        return data;
    }

    public void setData(loginobj data) {
        this.data = data;
    }
}
