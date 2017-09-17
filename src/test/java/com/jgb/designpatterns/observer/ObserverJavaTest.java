package com.jgb.designpatterns.observer;

import com.jgb.designpatterns.observer.java.CommentaryObjectObservable;
import com.jgb.designpatterns.observer.java.SMSUserObserver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

/**
 * @author jgb
 * @since 9/17/17 12:02 PM
 */
@RunWith(MockitoJUnitRunner.class)
public class ObserverJavaTest {

    @Test
    public void testObserverSubscribeAndUnsubscribe() throws Exception {
        CommentaryObjectObservable obj = mock(CommentaryObjectObservable.class, "Soccer Match [2014AUG24]");
        SMSUserObserver observer = new SMSUserObserver("Adam Warner [New York]");
        SMSUserObserver observer2 = new SMSUserObserver("Tim Ronney [London]");
        observer.subscribe(obj);

        verify(obj, times(1)).addObserver(any(SMSUserObserver.class));

        observer2.subscribe(obj);

        obj.setMessage("Welcome to live Soccer match");
        obj.setMessage("Current score 0-0");

        observer.unSubscribe(obj);

        verify(obj, times(1)).deleteObserver(any(SMSUserObserver.class));

        obj.setMessage("It's a goal!!");
        obj.setMessage("Current score 1-0");
    }

    @Test
    public void testObserver() throws Exception {
        CommentaryObjectObservable obj = new CommentaryObjectObservable("Soccer Match [2014AUG24]");
        SMSUserObserver observer = new SMSUserObserver("Adam Warner [New York]");
        SMSUserObserver observer2 = new SMSUserObserver("Tim Ronney [London]");
        observer.subscribe(obj);
        observer2.subscribe(obj);
        System.out.println("------------------------------------------------------");
        obj.setMessage("Welcome to live Soccer match");
        obj.setMessage("Current score 0-0");

        observer.unSubscribe(obj);

        obj.setMessage("It's a goal!!");
        obj.setMessage("Current score 1-0");
    }
}