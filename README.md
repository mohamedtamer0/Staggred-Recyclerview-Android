# Staggred-Recyclerview-Android

## Preview
<div align="center">
<br/>
  


App            
:-------------------------:
<img src="https://user-images.githubusercontent.com/51374446/152911064-23b901c3-0782-4335-aa3c-c3efda577160.gif" width="200" height="400" />  |

 </div>
  
```groovy
implementation(Deps.coreKts)
implementation(Deps.appCompat)
implementation(Deps.material)
implementation(Deps.constraintLayout)
testImplementation(Deps.jUnit)
androidTestImplementation(Deps.jUnitExt)
androidTestImplementation(Deps.espresso)
implementation (Deps.tensorflowSupport)
implementation (Deps.tensorflowMetaData)

```

```kotlin
data class AvengersModel(val name: String, val image: Int)
```


```kotlin
class AvengersAdapter(private val context: Context, private var avengersList: List<AvengersModel>) :
    RecyclerView.Adapter<AvengersAdapter.AvengersViewModel>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AvengersViewModel {
        return AvengersViewModel(
            ItemRowBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: AvengersViewModel, position: Int) {
        val avengersList = avengersList[position]
        holder.binding.ivAvengers.setImageResource(avengersList.image)
        holder.binding.tvName.text = avengersList.name


    }

    override fun getItemCount(): Int {
        return avengersList.size
    }


    class AvengersViewModel(val binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root)
}
```

```kotlin
  private lateinit var adapter: AvengersAdapter
  private var avengersList = ArrayList<AvengersModel>()
```

```kotlin
  binding.rvAvengers.layoutManager =
      StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
  adapter = AvengersAdapter(this, avengersList)
  binding.rvAvengers.adapter = adapter
  avengersShow()
```

```kotlin
private fun avengersShow() {
    val avenger1 = AvengersModel("Avenger1", R.drawable.wallpaper1)
    avengersList.add(avenger1)

    val avenger2 = AvengersModel("Avenger2", R.drawable.wallpaper2)
    avengersList.add(avenger2)

    val avenger3 = AvengersModel("Avenger3", R.drawable.wallpaper3)
    avengersList.add(avenger3)

    val avenger4 = AvengersModel("Avenger4", R.drawable.wallpaper4)
    avengersList.add(avenger4)

    val avenger5 = AvengersModel("Avenger5", R.drawable.wallpaper5)
    avengersList.add(avenger5)

    val avenger6 = AvengersModel("Avenger6", R.drawable.wallpaper6)
    avengersList.add(avenger6)

    val avenger7 = AvengersModel("Avenger7", R.drawable.wallpaper7)
    avengersList.add(avenger7)

    val avenger8 = AvengersModel("Avenger8", R.drawable.wallpaper8)
    avengersList.add(avenger8)
}
```
