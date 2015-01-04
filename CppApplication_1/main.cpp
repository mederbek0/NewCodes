/* 
 * File:   main.cpp
 * Author: mederbekbegmatov
 *
 * Created on December 26, 2014, 12:34 AM
 */

#include <cstdlib>
#include <string>
#include <iostream>
#include <sstream>
#include <stack>

using namespace std;

struct node
{
    int val;
    node *left, *right;
    node(int tmp){ val=tmp; left=NULL; right=NULL;}
};

void insert(node **root, int val)
{
    if (*root==NULL){
        *root=new node(val);
        return;
    }
    if (val>(*root)->val)
        insert(&((*root)->right),val);
    else
        insert(&((*root)->left),val);
}


void traverseTree(node *root)
{
    if (root==NULL)
        return;
    

    
    traverseTree(root->right);
    cout<<root->val<<",";
    traverseTree(root->left);

}

void nonRecursiveInOrder(node *root)
{
    if(root==NULL)
        return;
    stack<node*> st;
    st.push(root);
    node *nd;
    while(!st.empty()){
        nd=st.top();
        if (nd->left!=NULL){
            st.push(nd->left);
            continue;
        }
        cout<<nd->val<<",";
        st.pop();
        if (!st.empty()){
            node *tmp=st.top();
            st.pop();
            tmp->left=NULL;
            st.push(tmp);
        }
        if (nd->right!=NULL)
            st.push(nd->right);
    }

}

int main() {
    int arr[]={5,2,7,1,3,6,8};
    int n=sizeof(arr)/sizeof(int);
    node *head=NULL;
    for (int i=0; i<n; i++)
        insert(&head,arr[i]);
    nonRecursiveInOrder(head);
}

