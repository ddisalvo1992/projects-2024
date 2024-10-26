/* Sample C++ code */
#include <iostream>
#include <cctype>
#include <cstring>
#include <vector>
#include <algorithm>
using namespace std;

struct Word{
    string english;
    string piglatin;
};
Word *splitSentence(const string words, int &size){
    size=0;
    char *str=new char[words.length()+1];
    strcpy(str,words.c_str());
    char *token=strtok(str," ");
    while (token!=NULL){
        size++;
        token=strtok(NULL," ");
    }
    Word *wordArr=new Word[size];
    strcpy(str,words.c_str());
    token=strtok(str," ");
    for(int i=0;i<size;i++){
        string word=token;
        for(char &c:word){
            c=tolower(c);
            if(!isalpha(c)){
                c=' ';
            }
        }
        word.erase(std::remove_if(word.begin(),word.end(),::isspace),word.end());
        wordArr[i].english=word;
        token=strtok(NULL," ");
    }
    delete[] str;
    return wordArr;
}
void convertToPigLatin(Word wordArr[],int size){
    for(int i=0;i<size;i++){
        string& word=wordArr[i].english;
        if(word[0]=='a'){
            wordArr[i].piglatin=word+"way";
        }
        else if(word[0]=='e'){
            wordArr[i].piglatin=word+"way";
        }
        else if(word[0]=='i'){
            wordArr[i].piglatin=word+"way";
        }
        else if(word[0]=='o'){
            wordArr[i].piglatin=word+"way";
        }
        else if(word[0]=='u'){
            wordArr[i].piglatin=word+"way";
        }
        else{
            wordArr[i].piglatin=word.substr(1)+word[0]+"ay";
        }
    }
}
void displayPigLatin(const Word wordArr[],int size){
    for(int i=0;i<size;i++){
        cout<<wordArr[i].piglatin<<" ";
    }
    cout<<endl;
}
int main(){
    cout<<"Enter a sentence to convert to Pig Latin: "<<endl;
    string sentence;
    getline(cin,sentence);

    int size;
    Word *words=splitSentence(sentence,size);
    convertToPigLatin(words,size);
    displayPigLatin(words,size);

    delete[] words;
    return 0;
};