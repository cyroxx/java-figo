//
// Copyright (c) 2013 figo GmbH
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
//

package me.figo.models;

import java.util.List;

/***
 * Object representing a configured notification, e.g a webhook or email hook
 * 
 * @author Stefan Richter <stefan.richter@figo.me>
 */
public class Notification {

	/***
	 * Internal figo Connect notification ID from the notification registration response
	 */
    private String notification_id;
    
    /***
     * Notification key: see http://developer.figo.me/#notification_keys
     */
    private String observe_key;
    
    /***
     * Notification messages will be sent to this URL
     */
    private String notify_uri;
    
    /***
     * State similar to sync and login process. It will passed as POST payload for webhooks
     */
    private String state;
    
    public Notification() {}
    
    public Notification(String observe_key, String notify_uri, String state) {
    	this.observe_key = observe_key;
    	this.notify_uri = notify_uri;
    	this.state = state;
    }
    
    /***
     * Internal figo Connect notification ID from the notification registration response
     */
    public String getNotificationId() {
    	return notification_id;
    }
    
    /***
     * Notification key: see http://developer.figo.me/#notification_keys
     */
    public String getObserveKey() {
    	return observe_key;
    }

    /***
     * Notification key: see http://developer.figo.me/#notification_keys
     */
    public void setObserveKey(String key) {
    	observe_key = key;
    }
    
    /***
     * Notification messages will be sent to this URL
     */
    public String getNotifyURI() {
    	return notify_uri;
    }

    /***
     * Notification messages will be sent to this URL
     */
    public void setNotifyURI(String uri) {
    	notify_uri = uri;
    }
    
    /***
     * State similar to sync and login process. It will passed as POST payload for webhooks
     */
    public String getState() {
    	return state;
    }

    /***
     * State similar to sync and login process. It will passed as POST payload for webhooks
     */
    public void setState(String state) {
    	this.state = state;
    }
    
    /***
     * Helper type to match actual response from figo API
     */
    public class NotificationsResponse {
    	/***
    	 * List of notifications asked for
    	 */
    	private List<Notification> notifications;
    	
    	public NotificationsResponse() {}

    	/***
    	 * List of notifications asked for
    	 */
    	public List<Notification> getNotifications() {
    		return notifications;
    	}
    }
}
