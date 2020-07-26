package it.facebook.univpm.Facebook.Post.Model;
import java.util.Vector;


import org.springframework.social.ApiBinding;

import org.springframework.social.facebook.api.FeedOperations;
import org.springframework.social.facebook.api.GraphApi;
import org.springframework.social.facebook.api.OpenGraphOperations;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.social.facebook.api.PagingParameters;
import org.springframework.social.facebook.api.TestUserOperations;
import org.springframework.social.facebook.api.UserOperations;
import org.springframework.social.facebook.api.impl.FacebookTemplate;

import org.springframework.web.client.RestOperations;

import it.facebook.univpm.Facebook.Post.Exceptions.InvalidToken;

// Mio: EAAjCznvVZCs4BAOlZAuzJHaj0tPkwkDfNyLjC6e1IzOtg2aopEwVfCTPGc2cLQeioMX8dUoRFQvWX503YFKwcUgVL525BXEeONybbcIiJi4SbZCYCVXd6myUouIcZB75YTbJ0AGcZAS7M6vspZAbilnqpWezMvK4SKeZAfeAtTZASQZDZD
// Lox : EAAKdS6UMQ6QBAMb3oNDOmZA1n7e2ZAoAGkJcbmDfuKtKnIDX4C4gZBIsSmhaCbYOUUuG3PPSLovKG36tPeyAyiNyHuedicxd8DDlfKwUVZCny8crH27QYQ94tZAn0kZB4OarWnwim7QcZA9v9AXWX17gFqduUlmZCMIFgAfIsuZCZBcwZDZD
// Mario: EAAksDd12x1IBAAMzh6vsYtRDaZCfUOqKs3a3bYuN1un4IHCbZCTGkhi7jjFNevd8IOpLdydy3ZBDmQZBM2ie2ED0fhofpOKYV4flaLGrRGpPblcxWNSuj4nkIsgI6jAgSi4UX8HqVX0VVFTFiXeiHeauAaeybQ8jgmgXziwG0eDOo1pEZC6QT
public class Posts {
	private Metadata[] metadata;
	private Vector<Info> p;
	private String AccessToken = "EAAksDd12x1IBAAMzh6vsYtRDaZCfUOqKs3a3bYuN1un4IHCbZCTGkhi7jjFNevd8IOpLdydy3ZBDmQZBM2ie2ED0fhofpOKYV4flaLGrRGpPblcxWNSuj4nkIsgI6jAgSi4UX8HqVX0VVFTFiXeiHeauAaeybQ8jgmgXziwG0eDOo1pEZC6QT";
	private PagedList<org.springframework.social.facebook.api.Post> L;
	


	public Posts ()  throws InvalidToken{
		metadata = new Metadata[5];
		p= new Vector<Info>();
		metadata[0] = new Metadata("text","Testo del post","String");
		metadata[1] = new Metadata("length","Lunghezza del testo del post","Integer");
		metadata[2] = new Metadata("hashtag","Presenza di hashtag nel post","Boolean");
		metadata[3] = new Metadata("maiusc","Testo solamente in maiuscolo","Boolean");
		metadata[4] = new Metadata("mention","Presenza di menzioni nel post","Boolean");
		
		
		FacebookTemplate facebook = new FacebookTemplate(AccessToken);
		L= facebook.feedOperations().getFeed(new PagingParameters(1,0,null,null)); 
	
		while(L.size()>0) {
			PagingParameters pp= L.getNextPage();
			L = facebook.feedOperations().getFeed(pp);
			for(Post P : L) {
				if(P.getMessage()!=null) {
					Info i = new Info(P.getMessage());				
					p.add(i);				
				}
			}		
		}		
	}	
	
	
	
	public interface Facebook extends GraphApi, ApiBinding {
		
		FeedOperations feedOperations();
		OpenGraphOperations openGraphOperations();
		TestUserOperations testUserOperations();
		UserOperations userOperations();
		RestOperations restOperations();
		
		String getApplicationNamespace();
	}
	
	
	@Override
	public String toString() {
		String s=null;
		for (Info p : this.p)
			s += p.toString() + '\n';
		return s;
	}
	
	public PagedList<org.springframework.social.facebook.api.Post> getL() {
		return L;
	}

	public void setL(PagedList<org.springframework.social.facebook.api.Post> L) {
		this.L = L;
	}
	
	public Metadata[] getMetadata() {
		return metadata;
	}

	public Vector<Info> getPost() {
		return p;
	}

}
