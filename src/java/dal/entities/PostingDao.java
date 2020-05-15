/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal.entities;

import dal.commons.DaoEclipseLink;
import entities.Posting;
import entities.PostingPK;
import java.util.List;

/**
 *
 * @author Javier
 */
public class PostingDao extends DaoEclipseLink<Posting, PostingPK>
{
    
    public PostingDao() {
        super(Posting.class);
    }

    public List<Posting> retrievePostingList(Integer termID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getAmountDocumentsByTerm(Integer termID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

