public void reverseString(char[] s) {
char [] temp = new char[s.length];
int j=s.length-1;
    for (int i = 0; i < temp.length; i++) {
        temp[i]=s[j];
        j--;
    }
    for (int z = 0; z < temp.length; z++) {
        s[z]=temp[z];
    }
    System.out.println(s);
}

void main(){
char[] s = {'s','e','r'};
reverseString(s);
}