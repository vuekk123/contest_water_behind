package com.example.new_projecr_behind.entity.router;

import java.util.ArrayList;

public class routerreturn {
    private Boolean success;
    private ArrayList<routermain> data;

    public routerreturn(Boolean success, ArrayList<routermain> data) {
        this.success = success;
        this.data = data;
    }

    public routerreturn() {
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ArrayList<routermain> getData() {
        return data;
    }

    public void setData(ArrayList<routermain> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "routerreturn{" +
                "success=" + success +
                ", data=" + data +
                '}';
    }
}
