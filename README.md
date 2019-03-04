# Android-Content-Provider-in-Kotlin
Android Content Provider in Kotlin
What is a Content Provider?
When we need to access the data of other application or when we need to make our application data available for other applications to access securely, Content Provider comes in the scene. We have a class called ContentResolver, which helps us to manage the requests of data. The data can be a stored file, a database or maybe over a network. Content Provider responds with the data in the cursor format.

Let’s take a real-time example to understand the Content Provider. We all use WhatsApp application. The list of contact which we save get synced with WhatsApp according to the user using WhatsApp or not. But, how the WhatsApp is accessing our contacts from our phones? The answer is — Using the Content Provider.

So, our contact application has a Content Provider which shares it’s data to other application and WhatsApp request to the contact app to get access of list of contacts. It makes the contact app a provider and WhatsApp as a client which will use the data provided by the provider.
