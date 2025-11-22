package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example23;

public class ScriptSanitizer extends Sanitizer {
    @Override
    public void sanitize(Input input) {
        input.setData(input.getData().replaceAll("(?i)<script.*?</script>", ""));
        System.out.println("Script sanitized: " + input.getData());
    }
}
