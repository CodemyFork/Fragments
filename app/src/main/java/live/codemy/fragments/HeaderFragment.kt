package live.codemy.fragments


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class HeaderFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        "onCreate" logError HeaderFragment::class.java.name
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        "onCreateView" logError HeaderFragment::class.java.name
//        "onCreateView" logError(HeaderFragment::class.java.name)
//        "onCreateView".logError(HeaderFragment::class.java.name)

        return inflater.inflate(R.layout.fragment_header, container, false)
    }

    override fun onStart() {
        super.onStart()

        "onStart" logError HeaderFragment::class.java.name
    }

    override fun onResume() {
        super.onResume()

        "onResume" logError HeaderFragment::class.java.name
    }

    override fun onPause() {
        super.onPause()

        "onPause" logError HeaderFragment::class.java.name
    }

    override fun onStop() {
        super.onStop()

        "onStop" logError HeaderFragment::class.java.name
    }

    override fun onDestroy() {
        super.onDestroy()

        "onDestroy" logError HeaderFragment::class.java.name
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        "onAttach" logError HeaderFragment::class.java.name
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        "onActivityCreated" logError HeaderFragment::class.java.name
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        "onViewCreated" logError HeaderFragment::class.java.name
    }

    override fun onDestroyView() {
        super.onDestroyView()

        "onDestroyView" logError HeaderFragment::class.java.name
    }

    override fun onDetach() {
        super.onDetach()

        "onDetach" logError HeaderFragment::class.java.name
    }
}
