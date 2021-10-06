package com.company;

public class Main {
    public static String encrypt(String word, int key) {

            char[] charArray = word.toCharArray();
            int diff = (int) 'z' - (int) 'a';
                key = key % diff;

            for (int i = 0; i < charArray.length; i++) {
                int newChar = charArray[i] + key;
                if (newChar > (int) 'z') {
                    newChar = (int) 'a' + (newChar) %diff;
                }else if (newChar < (int) 'a') {
                    newChar = newChar%diff;
                }
                charArray[i] = (char) newChar;
            }
            return new String(charArray);
        }
        public static String decrypt(String word, int key){
        return encrypt(word, key);
        }

    public static void main (String[]args){
        String word = "ahoj";
        int key=1;

        String encrypted = encrypt(word, key);
        System.out.println(encrypted);
        System.out.println(decrypt(encrypted, key));
        }
    }
