struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    struct ListNode* head = (struct ListNode*) malloc (sizeof(struct ListNode));
    bool flag = true;
    head->val = 0;
    head->next = NULL;
    struct ListNode* iter = head;
    int n1 = 0;
    int n2 = 0;
    int tot = 0;
    int c = 0;
    while (l1 || l2 || c) {
        if(l1) {
            n1 = l1->val;
            l1 = l1->next;
        }
        if (l2) {
            n2 = l2->val;
            l2 = l2->next;
        }
        tot = n1+n2 + c;
        if (c)
            c = 0;
        if (tot > 9) {
            c = 1;
            tot = tot%10;
        }
        if (flag) {
            flag = false;
            iter->val = tot;
        } else {
            struct ListNode* node = (struct ListNode*) malloc (sizeof(struct ListNode));
            node->next = NULL;
            iter->next = node;
            node->val = tot;
            iter = iter->next;
        }   
        n1 = 0;
        n2 = 0;
    }
    return head;
}
