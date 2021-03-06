package examples.trimchain.blockchain

import scorex.core.NodeViewModifier._
import scorex.core.consensus.History.ModifierIds
import scorex.core.consensus.SyncInfo
import scorex.core.serialization.Serializer

class TrimChainSyncInfo(override val answer: Boolean,
                        lastBlockIds: Seq[ModifierId]) extends SyncInfo {
  override def startingPoints: ModifierIds = ???

  override type M = this.type

  override def serializer: Serializer[TrimChainSyncInfo.this.type] = ???
}
