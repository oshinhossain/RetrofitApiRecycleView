


package com.example.retrofitapirecycleview;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


//akta new class pojo name then (json to pojo convert model class copy kore  paste
//korbo pojo name class then daka jabe 3ta file creat hoice API ar mode thike
// Datum ,pojo main class,support onek error thakbe ai class a
//then error jaor jono delete korbo sob gulo import file ke
//pojo class mode dia dibo  last (}) aga public class Datum{...} and public class support{...}



public class pojo {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("per_page")
    @Expose
    private Integer perPage;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("support")
    @Expose
    private Support support;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public pojo withPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public pojo withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public pojo withTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public pojo withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public pojo withData(List<Datum> data) {
        this.data = data;
        return this;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public pojo withSupport(Support support) {
        this.support = support;
        return this;
    }
    public class Datum {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("first_name")
        @Expose
        private String firstName;
        @SerializedName("last_name")
        @Expose
        private String lastName;
        @SerializedName("avatar")
        @Expose
        private String avatar;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Datum withId(Integer id) {
            this.id = id;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Datum withEmail(String email) {
            this.email = email;
            return this;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public Datum withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Datum withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public Datum withAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

    }


    public class Support {

        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("text")
        @Expose
        private String text;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Support withUrl(String url) {
            this.url = url;
            return this;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public Support withText(String text) {
            this.text = text;
            return this;
        }

    }


}

