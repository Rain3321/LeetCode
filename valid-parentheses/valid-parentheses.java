class Solution {
  public boolean isValid(String s) {

    if(s.length() == 1) {
      return false;
    }
    Stack<Character> stack = new Stack<>();
    stack.push(s.charAt(0));
    for (int i = 1; i < s.length(); i++) {
      char c = s.charAt(i);
      if(c == '(' || c == '{' || c == '[') {
        stack.push(c);
      }
      else {
        if(stack.empty()) return false;
        if(c == ')') {
          char top = stack.pop();
          if(top != '(') return false;
        }
        else if(c == '}') {
          char top = stack.pop();
          if(top != '{') return false;
        }
        else if(c == ']') {
          char top = stack.pop();
          if(top != '[') return false;
        }
      }
    }
    return stack.empty();
  }
}