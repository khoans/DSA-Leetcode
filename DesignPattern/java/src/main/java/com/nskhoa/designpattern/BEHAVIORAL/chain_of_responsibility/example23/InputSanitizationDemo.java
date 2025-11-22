package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example23;

// Client runner
public class InputSanitizationDemo {
    public static void main(String[] args) {
        Sanitizer htmlSanitizer = new HtmlSanitizer();
        Sanitizer sqlSanitizer = new SqlSanitizer();
        Sanitizer scriptSanitizer = new ScriptSanitizer();

        htmlSanitizer.setNextSanitizer(sqlSanitizer);
        sqlSanitizer.setNextSanitizer(scriptSanitizer);

        Input input = new Input("<div>Hello'; DROP TABLE users; --</div><script>alert('Hi')</script>");
        htmlSanitizer.sanitize(input);
    }
}

