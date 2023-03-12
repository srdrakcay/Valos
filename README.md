# Valos

This is a Valorant app with multi module. The app has Navigation, Feature, Data, Domain, Common, App and buildSrc for better gradle control.

## Project Screens
SPLASH SCREEN |AGENTS SCREEN |  WEAPONS SCREEN |   MAPS SCREEN |    FAVORİTE SCREEN | 
--- | --- | --- | --- |  --- | 
![Uygulama Ekran Görüntüsü](https://i.hizliresim.com/pd8acte.png) |![Uygulama Ekran Görüntüsü](https://i.hizliresim.com/qt4obr3.png) |![Uygulama Ekran Görüntüsü](https://i.hizliresim.com/m7nhqa7.png)|![Uygulama Ekran Görüntüsü](https://i.hizliresim.com/g27mkn5.png)|![Uygulama Ekran Görüntüsü](https://i.hizliresim.com/dzwmq47.png)
## Project Tech stack & Open-source libraries

- This app made %100 with  [Kotlin](https://developer.android.com/kotlin)

- Made with [Android Architecture Components ](https://developer.android.com/topic/architecture)for the Collection of libraries that help you design robust, testable, and maintainable apps.

- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel):The ViewModel class is a business logic or screen level state holder. It exposes state to the UI and encapsulates related business logic. Its principal advantage is that it caches state and persists it through configuration changes. This means that your UI doesn’t have to fetch data again when navigating between activities, or following configuration changes, such as when rotating the screen.

- [Kotlin Flow](https://developer.android.com/kotlin/flow):In coroutines, a flow is a type that can emit multiple values sequentially, as opposed to suspend functions that return only a single value. For example, you can use a flow to receive live updates from a database.

- [Kotlin Coroutine](https://developer.android.com/kotlin/coroutines):On Android, coroutines help to manage long-running tasks that might otherwise block the main thread and cause your app to become unresponsive. Over 50% of professional developers who use coroutines have reported seeing increased productivity. This topic describes how you can use Kotlin coroutines to address these problems, enabling you to write cleaner and more concise app code.

- [Dependency Injection with Hilt](https://developer.android.com/training/dependency-injection/hilt-android):Hilt is a dependency injection library for Android that reduces the boilerplate of doing manual dependency injection in your project. Doing manual dependency injection requires you to construct every class and its dependencies by hand, and to use containers to reuse and manage dependencies.

- [Navigation Componenet](https://developer.android.com/guide/navigation):Navigation refers to the interactions that allow users to navigate across, into, and back out from the different pieces of content within your app. Android Jetpack's Navigation component helps you implement navigation, from simple button clicks to more complex patterns, such as app bars and the navigation drawer.

- [Retrofit](https://square.github.io/retrofit/):Retrofit is the class through which your API interfaces are turned into callable objects. By default, Retrofit will give you sane defaults for your platform but it allows for customization.

- [UseCase](https://developer.android.com/topic/architecture/domain-layer):Located domain layer that sits between the UI layer and the data layer.

- [Repository](https://developer.android.com/topic/architecture/data-layer):Located in data layer that contains application data and business logic.

- [Glide ](https://github.com/bumptech/glide):A library for imageView.

- [Lottie ](https://lottiefiles.com/):A library for animations.



 ## Project Graph

- This app uses [MVVM (Model View View-Model)](https://developer.android.com/topic/architecture#recommended-app-arch)architecture

                                   
![Logo](https://i.hizliresim.com/h8kd4u6.png)

This project has 7 Module ;

- App

- buildSrc

- Data

- Domain

- Feature

- Navigation

- Common

### DATA MODULE

![Logo](https://i.hizliresim.com/nwc3k8i.png)


  [Data Layer](https://developer.android.com/topic/architecture/data-layer): While the UI layer contains UI-related state and UI logic, the data layer contains application data and business logic. The business logic is what gives value to your app—it's made of real-world business rules that determine how application data must be created, stored, and changed.
  
  inside the DATA Module:
  
  -- Repository
  
  -- Dto
  
  -- Service
  
  -- Source
  
  -- DataStore
  
  -- Mapper
  
  -- Di
  
  ### DOMAİN MODULE
  
  ![Logo](https://i.hizliresim.com/2rjsrvu.png)
  
   [Domain Layer](https://developer.android.com/topic/architecture/data-layer): The domain layer is responsible for encapsulating complex business logic, or simple business logic that is reused by multiple ViewModels. This layer is optional because not all apps will have these requirements. You should only use it when needed-for example, to handle complexity or favor reusability. 
   
   inside the DOMAİN Module:
  
  -- Di
  
  -- UseCase
  
 
  
   ### FEATURE MODULE

  ![Logo](https://i.hizliresim.com/ot2jcbj.png)
   
  
  [UI Layer](https://developer.android.com/topic/architecture/ui-layer): The role of the UI is to display the application data on the screen and also to serve as the primary point of user interaction. Whenever the data changes, either due to user interaction (like pressing a button) or external input (like a network response), the UI should update to reflect those changes. Effectively, the UI is a visual representation of the application state as retrieved from the data layer.

   inside the FEATURE Module:
  
  -- Fragments
  
  -- Components
  
  -- Di
  
  -- Mapper
  
  -- Utility
  
  ### COMMON MODULE

  ![Logo]( https://i.hizliresim.com/9q5sq7q.png)
  
   inside the COMMON Module:
  
  -- Fragments
  
  -- Components
  
  -- Di
  
  -- Mapper
  
  -- Utility
  
  ### NAVİGATİON MODULE

  
   inside the NAVİGATİON Module:
  
  -- NavGraph
  
  ### buildSrc MODULE

  
   inside the buildSrc Module:
  
  -- Dependency
  
  ### APP MODULE

  
   inside the APP Module:
  
  -- MainActivity
  
  -- Application Class
  
  


 
 
