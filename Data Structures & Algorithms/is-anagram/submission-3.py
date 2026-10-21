class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        else:
            s_dic={}
            t_dic={}
            for index in range(len(s)):
                if s[index] not in s_dic:
                    s_dic[s[index]]=1
                else:
                    s_dic[s[index]]+=1

                if t[index] not in t_dic:
                    t_dic[t[index]]=1
                else:
                    t_dic[t[index]]+=1
            for key in s_dic.keys():
                if key not in t_dic.keys():
                    return False
                elif s_dic[key] != t_dic[key]:
                    return False
            return True

           