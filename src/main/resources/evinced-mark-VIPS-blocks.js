const nodesMap = {};
const createMap = node => {
  if (node.nodeType === 1) {
    id = node.getAttribute("evinced_id");
    nodesMap[id] = node;
  }

  node.childNodes.forEach(child => {
    createMap(child);
  });
};

createMap(document.body);

const evincedIdsStr = "<put-blocks-ids-here>";
const evincedIds = evincedIdsStr.split(";");
evincedIds.forEach(id => {
  let node = nodesMap[id];
  if (node) {
    node.style = node.style + ";border: 5px red solid";
  }
});
