/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Candidate;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author BLAISE
 */
public class CandidateDao {
    
    public String save_candidate(Candidate candidate){
        
        Session ss =  HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.save(candidate);
        tr.commit();
        ss.close();
        return "saved successfully...";
    }
    
    public String update_candidate(Candidate candidate){
        
        Session ss =  HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.update(candidate);
        tr.commit();
        ss.close();
        return "updated successfully...";
    }
    public String delete_candidate(Candidate candidate){
        
        Session ss =  HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.delete(candidate);
        tr.commit();
        ss.close();
        return "deleted successfully...";
    }
    
    //reading from db
    
    public List<Candidate> allCandidates(){
    
        Session ss =  HibernateUtil.getSessionFactory().openSession();
        List<Candidate> candidateList = ss.createQuery("select cand from Candidate cand").list();
        ss.close();
        return candidateList;
    }
    
    public Candidate getCandidateById(Candidate candidate){
    
        Session ss =  HibernateUtil.getSessionFactory().openSession();
        Candidate cand = (Candidate)ss.get(Candidate.class, candidate.getCandidate_id());
        ss.close();
        return cand;
    }
    
}
