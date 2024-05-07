package org.depinfo.demorecyclerviewcontexte

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import org.depinfo.demorecyclerviewcontexte.adapters.MonAdapter
import org.depinfo.demorecyclerviewcontexte.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        setupRecycler()
        fillRecycler()
    }

    private fun setupRecycler() {
        adapter = MonAdapter() // Créer l'adapteur
        binding.rvMonAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvMonAdapter.setHasFixedSize(true) // Option pour améliorer les performances
        binding.rvMonAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvMonAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler() {
        val items: MutableList<String> = mutableListOf()
        for (i in 1..10000) {
            items.add("Item #$i")
        }
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}