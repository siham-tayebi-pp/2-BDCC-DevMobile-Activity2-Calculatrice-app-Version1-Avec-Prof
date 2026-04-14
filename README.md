# Activie dapp de calcul
## 1. on commence par  modifier les colors  dans colors dans values stings.xml

![img1.png](images/img1.png)

## 2. Modifier dans themes thems.xml dans folder themes
theme:Theme.AppCompat.DayNight.DarkActionBar
sstyle= my stayle par exple
```xml
    <style name="Mystyle" parent="Theme.AppCompat.DayNight.DarkActionBar">

```
et ajouter les items
ms avant on va dans colors pour ajoute rles colors.xml
par exple
```xml
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>
    <color name="colorPrimary">#673AB7</color>
    <color name="colorPrimaryDark">#512DFF</color>
    <color name="colorAccent">#9C27B0</color>
```

et on retourne a themes.xml pour ajoutr les items
```xml
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Mystyle" parent="Theme.AppCompat.DayNight.DarkActionBar">
        <!-- Customize your light theme here. -->
         <item name="colorPrimary">@color/colorPrimary</item>
         <item name="colorAccent">@color/colorAccent</item>
         <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
         
    </style>

    <style name="Theme._2BDCCDevMobileActivity2CalculatriceappVersion1AvecProf" parent="Base.Theme._2BDCCDevMobileActivity2CalculatriceappVersion1AvecProf" />
</resources>
```
## 3. modifer nom dapp dans strings.xml
```xml
<resources>
    <string name="app_name">Calculatrice app</string>
</resources>
```

## 4. modifier le nom de style dans android manifest avec celui quon arrive a mettre Mystyle c  le nom de mon style dans themes.xml

```xml
      <application
    android:theme="@style/Mystyle">

```

## 5.Creer linterface activty main dans laquel va se faire le calcul

- commencer par faire show interface ui pour voir vos composants 
- click drit+convert view linear view
- cliquer sur le mode split pour ajouter manuellement ou via code les cmpsts et dans palette a gauche vous piuvez ajoutez vos cmpsts manuellemtn 
- number
- btn 
- txtview
- lsit view
- en met le linear layout en  vrtical
- et dans les elts on met match_parent dans width pour quelle prenne tt largeur et on ajoute les id 
- et on met en eux id aussi