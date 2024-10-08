package com.example.project;

public class String1 {
	private char[] str;
	private int size;

	public String1 () {
	   size = -1;
	   str = new char[80];
	}
	public void append(char c) {
        str[++size] = c;
    }
    public char remove() {
        return str[size--];
    }
    public char getChar(int i) {
        return str[i];
    }
    public int length() {
        return size+1;
    }
    public void makeEmpty()
    {
        size = -1;
    }
    public void concat(String1 s)
    {
        for(int i = 0; i < s.length(); i++)
            append(s.getChar(i));
    }
    public boolean equal(String1 s) {
        if (this.length() != s.length()) {
            return false;
        }

        for (int i = 0; i <= size; i++) {
            if (str[i] != s.getChar(i)) {
                return false;
            }
        }

        return true;
    }
    public void reverse() {
        if (size<0) {
            return;
        }
        for (int i = 0; i <= size/2; i++) {
            char temp = str[i];
            str[i] = str[size-i];
            str[size-i] = temp;
        }
    }
}


// class Test {
//     public static void main(String args[]) {
//         String1 s1 = new String1();
//         s1.append('a');
//         s1.append('b');
//         s1.append('c');

//         String1 s2 = new String1();
//         s2.append('a');
//         s2.append('b');
//         s2.append('d');
//         s1.reverse();
        
//         String1 s3 = new String1();
//         s3.reverse();
//         s1.reverse();
//         for (int i = 0; i < s1.length(); i++) {
//             System.out.print(s1.getChar(i));
//         }
//     }
// }