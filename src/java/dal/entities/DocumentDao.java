/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal.entities;

import dal.commons.DaoEclipseLink;
//import javax.enterprise.context.ApplicationScoped;
import entities.Document;

/**
 *
 * @author Javier
 *//*
public class DocumentDao {
*/
public class DocumentDao  extends DaoEclipseLink<Document, Integer>
{
    
    public DocumentDao() {
        super(Document.class);
    }

    public Long getAmountDocuments() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
