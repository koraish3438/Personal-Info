package com.example.personalinfo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.personalinfo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listItem: List<SampleModel>
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()
        setupRecyclerView()
        
    }

    private fun setupRecyclerView() {
        binding.recyclerView.adapter = MyAdapter(listItem)
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun loadData() {
        listItem = listOf(
            SampleModel("https://randomuser.me/api/portraits/men/1.jpg", "Koraish", "01711111111"),
            SampleModel("https://randomuser.me/api/portraits/men/2.jpg", "Ashraf", "01722222222"),
            SampleModel("https://randomuser.me/api/portraits/men/3.jpg", "Rohit", "01733333333"),
            SampleModel("https://randomuser.me/api/portraits/men/4.jpg", "Sami", "01744444444"),
            SampleModel("https://randomuser.me/api/portraits/men/5.jpg", "Jamil", "01755555555"),
            SampleModel("https://randomuser.me/api/portraits/women/1.jpg", "Lina", "01766666666"),
            SampleModel("https://randomuser.me/api/portraits/women/2.jpg", "Mina", "01777777777"),
            SampleModel("https://randomuser.me/api/portraits/men/6.jpg", "Fahim", "01788888888"),
            SampleModel("https://randomuser.me/api/portraits/men/7.jpg", "Shakil", "01799999999"),
            SampleModel("https://randomuser.me/api/portraits/women/3.jpg", "Tania", "01800000000"),
            SampleModel("https://randomuser.me/api/portraits/men/8.jpg", "Rashed", "01811111111"),
            SampleModel("https://randomuser.me/api/portraits/women/4.jpg", "Sofia", "01822222222"),
            SampleModel("https://randomuser.me/api/portraits/men/9.jpg", "Kamal", "01833333333"),
            SampleModel("https://randomuser.me/api/portraits/men/10.jpg", "Imran", "01844444444"),
            SampleModel("https://randomuser.me/api/portraits/men/11.jpg", "Shuvo", "01855555555"),
            SampleModel("https://randomuser.me/api/portraits/men/12.jpg", "Rony", "01866666666"),
            SampleModel("https://randomuser.me/api/portraits/men/13.jpg", "Sabbir", "01877777777"),
            SampleModel("https://randomuser.me/api/portraits/men/14.jpg", "Tanvir", "01888888888"),
            SampleModel("https://randomuser.me/api/portraits/women/5.jpg", "Nabila", "01899999999"),
            SampleModel("https://randomuser.me/api/portraits/women/6.jpg", "Farah", "01900000001"),
            SampleModel("https://randomuser.me/api/portraits/men/15.jpg", "Junaid", "01911111111"),
            SampleModel("https://randomuser.me/api/portraits/men/16.jpg", "Rashid", "01922222222"),
            SampleModel("https://randomuser.me/api/portraits/women/7.jpg", "Samira", "01933333333"),
            SampleModel("https://randomuser.me/api/portraits/men/17.jpg", "Fahad", "01944444444"),
            SampleModel("https://randomuser.me/api/portraits/men/18.jpg", "Tariq", "01955555555"),
            SampleModel("https://randomuser.me/api/portraits/women/8.jpg", "Sadia", "01966666666"),
            SampleModel("https://randomuser.me/api/portraits/men/19.jpg", "Arif", "01977777777"),
            SampleModel("https://randomuser.me/api/portraits/men/20.jpg", "Nayeem", "01988888888"),
            SampleModel("https://randomuser.me/api/portraits/women/9.jpg", "Rumana", "01999999999"),
            SampleModel("https://randomuser.me/api/portraits/men/21.jpg", "Hridoy", "01712345678"),
            SampleModel("https://randomuser.me/api/portraits/men/22.jpg", "Shahin", "01723456789"),
            SampleModel("https://randomuser.me/api/portraits/women/10.jpg", "Rina", "01734567890"),
            SampleModel("https://randomuser.me/api/portraits/men/23.jpg", "Bappy", "01745678901")

        )

    }
}