package com.hoc.flowmvi.core

import android.content.Context
import com.hoc.flowmvi.core.navigator.IntentProviders
import com.hoc.flowmvi.core.navigator.Navigator
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview

@ExperimentalCoroutinesApi
@FlowPreview
class NavigatorImpl(
  private val add: IntentProviders.Add,
  private val search: IntentProviders.Search,
) : Navigator {
  override fun Context.navigateToAdd() =
    startActivity(add.makeIntent(this))

  override fun Context.navigateToSearch() {
    startActivity(search.makeIntent(this))
  }
}
