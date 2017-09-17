package com.jgb.designpatterns.observer;

import com.jgb.designpatterns.observer.impl.CommentaryObject;
import com.jgb.designpatterns.observer.impl.SMSUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

/**
 * @author jgb
 * @since 9/16/17 1:55 PM
 */
@RunWith(MockitoJUnitRunner.class)
public class ObserverTest {

    @Test
    public void testObserverSubscribeAndUnsubscribe() throws Exception {
        Subject subject = mock(CommentaryObject.class, "Soccer Match [2014AUG24]");
        Observer observer = new SMSUser("Adam Warner [New York]");
        observer.subscribe(subject);

        verify(subject, times(1)).subscribeObserver(any(Observer.class));

        Observer observer2 = new SMSUser("Tim Ronney [London]");
        observer2.subscribe(subject);

        Commentary cObject = ((Commentary) subject);
        cObject.setMessage("Welcome to live Soccer match");
        cObject.setMessage("Current score 0-0");

        observer2.unSubscribe(subject);

        verify(subject, times(1)).unSubscribeObserver(any(Observer.class));
    }

    @Test
    public void testObserver() throws Exception {
        Subject subject = new CommentaryObject("Soccer Match [2014AUG24]");
        Observer observer = new SMSUser("Adam Warner [New York]");
        observer.subscribe(subject);

        Observer observer2 = new SMSUser("Tim Ronney [London]");
        observer2.subscribe(subject);

        Commentary cObject = ((Commentary) subject);
        cObject.setMessage("Welcome to live Soccer match");
        cObject.setMessage("Current score 0-0");

        observer2.unSubscribe(subject);

        cObject.setMessage("It's a goal!!");
        cObject.setMessage("Current score 1-0");

        Observer observer3 = new SMSUser("Marrie [Paris]");
        observer3.subscribe(subject);

        cObject.setMessage("It's another goal!!");
        cObject.setMessage("Half-time score 2-0");
    }
}