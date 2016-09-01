/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.SubClienteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class SubClienteDetalleFormJInternalFrame extends SubClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSubCliente;
	
	protected JMenuBar jmenuBarDetalleSubCliente;
	
	protected JMenu jmenuDetalleSubCliente;
	protected JMenu jmenuDetalleArchivoSubCliente;
	protected JMenu jmenuDetalleAccionesSubCliente;
	protected JMenu jmenuDetalleDatosSubCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSubCliente;	
	protected GridBagConstraints gridBagConstraintsSubCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SubClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleSubCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoidentificacion="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected PaisBeanSwingJInternalFrame paisnacionalidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_paisnacionalidad="";

	protected TipoGeneroBeanSwingJInternalFrame tipogeneroBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogenero="";

	protected EstadoCivilBeanSwingJInternalFrame estadocivilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocivil="";

	protected EstadoLegalBeanSwingJInternalFrame estadolegalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadolegal="";

	protected TipoNivelEduBeanSwingJInternalFrame tiponiveleduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiponiveledu="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public SubClienteSessionBean subclienteSessionBean;
	
	

	public FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame=null;
	public FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFactura=false;
	public FacturaSessionBean facturaSessionBean;

	public ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame=null;
	public ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteConsignacion=false;
	public ConsignacionSessionBean consignacionSessionBean;

	public GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFrame=null;
	public GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteGuiaRemision=false;
	public GuiaRemisionSessionBean guiaremisionSessionBean;

	public ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame=null;
	public ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProforma=false;
	public ProformaSessionBean proformaSessionBean;

	public PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame=null;
	public PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoExpor=false;
	public PedidoExporSessionBean pedidoexporSessionBean;

	public PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame=null;
	public PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedido=false;
	public PedidoSessionBean pedidoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoIdentificacionSessionBean tipoidentificacionSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public PaisSessionBean paisnacionalidadSessionBean;
	public TipoGeneroSessionBean tipogeneroSessionBean;
	public EstadoCivilSessionBean estadocivilSessionBean;
	public EstadoLegalSessionBean estadolegalSessionBean;
	public TipoNivelEduSessionBean tiponiveleduSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;	
	
	public SubClienteLogic subclienteLogic;
	
	public JScrollPane jScrollPanelDatosSubCliente;
	public JScrollPane jScrollPanelDatosEdicionSubCliente;
	public JScrollPane jScrollPanelDatosGeneralSubCliente;
	
	protected JPanel jPanelCamposSubCliente;    
	protected JPanel jPanelCamposOcultosSubCliente;    	
	protected JPanel jPanelAccionesSubCliente;
	protected JPanel jPanelAccionesFormularioSubCliente;
    
	
	
	protected JTabbedPane jTabbedPaneCamposSubCliente;	
	protected Integer iXPanelCamposSubCliente=0;
	protected Integer iYPanelCamposSubCliente=0;
	
	protected Integer iXPanelCamposOcultosSubCliente=0;
	protected Integer iYPanelCamposOcultosSubCliente=0;
	
	

	protected JPanel jPanelCamposIniciogeneralSubCliente;
	protected Integer iXPanelCamposIniciogeneralSubCliente=0;
	protected Integer iYPanelCamposIniciogeneralSubCliente=0;

	protected JPanel jPanelCamposInicioubicacionSubCliente;
	protected Integer iXPanelCamposInicioubicacionSubCliente=0;
	protected Integer iYPanelCamposInicioubicacionSubCliente=0;

	protected JPanel jPanelCamposIniciopersonalSubCliente;
	protected Integer iXPanelCamposIniciopersonalSubCliente=0;
	protected Integer iYPanelCamposIniciopersonalSubCliente=0;

	protected JPanel jPanelCamposIniciocontableSubCliente;
	protected Integer iXPanelCamposIniciocontableSubCliente=0;
	protected Integer iYPanelCamposIniciocontableSubCliente=0;

	protected JPanel jPanelCamposIniciocontratoSubCliente;
	protected Integer iXPanelCamposIniciocontratoSubCliente=0;
	protected Integer iYPanelCamposIniciocontratoSubCliente=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSubCliente;
	public JButton jButtonModificarSubCliente;
	public JButton jButtonActualizarSubCliente;
    public JButton jButtonEliminarSubCliente;
	public JButton jButtonCancelarSubCliente;
    public JButton jButtonGuardarCambiosSubCliente;
	public JButton jButtonGuardarCambiosTablaSubCliente;
	protected JButton jButtonCerrarSubCliente;
	
	
	protected JButton jButtonProcesarInformacionSubCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSubCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSubCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSubCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSubCliente;
	protected JButton jButtonModificarToolBarSubCliente;
	protected JButton jButtonActualizarToolBarSubCliente;
    protected JButton jButtonEliminarToolBarSubCliente;
	protected JButton jButtonCancelarToolBarSubCliente;
    protected JButton jButtonGuardarCambiosToolBarSubCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarSubCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarSubCliente;
	protected JButton jButtonCerrarToolBarSubCliente;
	
	protected JButton jButtonProcesarInformacionToolBarSubCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSubCliente;
	protected JMenuItem jMenuItemModificarSubCliente;
	protected JMenuItem jMenuItemActualizarSubCliente;
    protected JMenuItem jMenuItemEliminarSubCliente;
	protected JMenuItem jMenuItemCancelarSubCliente;
    protected JMenuItem jMenuItemGuardarCambiosSubCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaSubCliente;
	protected JMenuItem jMenuItemCerrarSubCliente;
	protected JMenuItem jMenuItemDetalleCerrarSubCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarSubCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionSubCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSubCliente;
	protected JMenuItem jMenuItemMostrarOcultarSubCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSubCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSubCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSubCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSubCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSubCliente;
	public JLabel jLabelIdSubCliente;
	public JLabel jLabelidSubCliente;
	public JButton jButtonidSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelidentificacionSubCliente;
	public JLabel jLabelidentificacionSubCliente;
	public JTextField jTextFieldidentificacionSubCliente;
	public JButton jButtonidentificacionSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelrucSubCliente;
	public JLabel jLabelrucSubCliente;
	public JTextField jTextFieldrucSubCliente;
	public JButton jButtonrucSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombreSubCliente;
	public JLabel jLabelnombreSubCliente;
	public JTextArea jTextAreanombreSubCliente;
	public JScrollPane jscrollPanenombreSubCliente;
	public JButton jButtonnombreSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelapellidoSubCliente;
	public JLabel jLabelapellidoSubCliente;
	public JTextArea jTextAreaapellidoSubCliente;
	public JScrollPane jscrollPaneapellidoSubCliente;
	public JButton jButtonapellidoSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoSubCliente;
	public JLabel jLabelnombre_completoSubCliente;
	public JTextArea jTextAreanombre_completoSubCliente;
	public JScrollPane jscrollPanenombre_completoSubCliente;
	public JButton jButtonnombre_completoSubClienteBusqueda= new JButtonMe();

	public JPanel jPaneldireccionSubCliente;
	public JLabel jLabeldireccionSubCliente;
	public JTextArea jTextAreadireccionSubCliente;
	public JScrollPane jscrollPanedireccionSubCliente;
	public JButton jButtondireccionSubClienteBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoSubCliente;
	public JLabel jLabeltelefonoSubCliente;
	public JTextArea jTextAreatelefonoSubCliente;
	public JScrollPane jscrollPanetelefonoSubCliente;
	public JButton jButtontelefonoSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelnumero_celularSubCliente;
	public JLabel jLabelnumero_celularSubCliente;
	public JTextArea jTextAreanumero_celularSubCliente;
	public JScrollPane jscrollPanenumero_celularSubCliente;
	public JButton jButtonnumero_celularSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelmailSubCliente;
	public JLabel jLabelmailSubCliente;
	public JTextArea jTextAreamailSubCliente;
	public JScrollPane jscrollPanemailSubCliente;
	public JButton jButtonmailSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelfecha_nacimientoSubCliente;
	public JLabel jLabelfecha_nacimientoSubCliente;
	//public JFormattedTextField jDateChooserfecha_nacimientoSubCliente;

	public JDateChooser jDateChooserfecha_nacimientoSubCliente;
	public JButton jButtonfecha_nacimientoSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelfechaoSubCliente;
	public JLabel jLabelfechaoSubCliente;
	//public JFormattedTextField jDateChooserfechaoSubCliente;

	public JDateChooser jDateChooserfechaoSubCliente;
	public JButton jButtonfechaoSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelobservacionSubCliente;
	public JLabel jLabelobservacionSubCliente;
	public JTextArea jTextAreaobservacionSubCliente;
	public JScrollPane jscrollPaneobservacionSubCliente;
	public JButton jButtonobservacionSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelpath_imagen_firmaSubCliente;
	public JLabel jLabelpath_imagen_firmaSubCliente;
	public JTextArea jTextAreapath_imagen_firmaSubCliente;
	public JScrollPane jscrollPanepath_imagen_firmaSubCliente;
	public JButton jButtonpath_imagen_firmaSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cargaSubCliente;
	public JLabel jLabelnumero_cargaSubCliente;
	public JTextField jTextFieldnumero_cargaSubCliente;
	public JButton jButtonnumero_cargaSubClienteBusqueda= new JButtonMe();

	public JPanel jPanellimite_creditoSubCliente;
	public JLabel jLabellimite_creditoSubCliente;
	public JTextField jTextFieldlimite_creditoSubCliente;
	public JButton jButtonlimite_creditoSubClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoSubCliente;
	public JLabel jLabeldescuentoSubCliente;
	public JTextField jTextFielddescuentoSubCliente;
	public JButton jButtondescuentoSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_contratoSubCliente;
	public JLabel jLabelcodigo_contratoSubCliente;
	public JTextField jTextFieldcodigo_contratoSubCliente;
	public JButton jButtoncodigo_contratoSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelvalor_contratoSubCliente;
	public JLabel jLabelvalor_contratoSubCliente;
	public JTextField jTextFieldvalor_contratoSubCliente;
	public JButton jButtonvalor_contratoSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioSubCliente;
	public JLabel jLabelfecha_inicioSubCliente;
	//public JFormattedTextField jDateChooserfecha_inicioSubCliente;

	public JDateChooser jDateChooserfecha_inicioSubCliente;
	public JButton jButtonfecha_inicioSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finSubCliente;
	public JLabel jLabelfecha_finSubCliente;
	//public JFormattedTextField jDateChooserfecha_finSubCliente;

	public JDateChooser jDateChooserfecha_finSubCliente;
	public JButton jButtonfecha_finSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelplazoSubCliente;
	public JLabel jLabelplazoSubCliente;
	public JTextField jTextFieldplazoSubCliente;
	public JButton jButtonplazoSubClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSubCliente;
	public JLabel jLabelid_empresaSubCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSubCliente;
	public JButton jButtonid_empresaSubCliente= new JButtonMe();
	public JButton jButtonid_empresaSubClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteSubCliente;
	public JLabel jLabelid_clienteSubCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteSubCliente;
	public JButton jButtonid_clienteSubCliente= new JButtonMe();
	public JButton jButtonid_clienteSubClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalSubCliente;
	public JLabel jLabelid_sucursalSubCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalSubCliente;
	public JButton jButtonid_sucursalSubCliente= new JButtonMe();
	public JButton jButtonid_sucursalSubClienteUpdate= new JButtonMe();
	public JButton jButtonid_sucursalSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_identificacionSubCliente;
	public JLabel jLabelid_tipo_identificacionSubCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_identificacionSubCliente;
	public JButton jButtonid_tipo_identificacionSubCliente= new JButtonMe();
	public JButton jButtonid_tipo_identificacionSubClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_identificacionSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_paisSubCliente;
	public JLabel jLabelid_paisSubCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisSubCliente;
	public JButton jButtonid_paisSubCliente= new JButtonMe();
	public JButton jButtonid_paisSubClienteUpdate= new JButtonMe();
	public JButton jButtonid_paisSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadSubCliente;
	public JLabel jLabelid_ciudadSubCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadSubCliente;
	public JButton jButtonid_ciudadSubCliente= new JButtonMe();
	public JButton jButtonid_ciudadSubClienteUpdate= new JButtonMe();
	public JButton jButtonid_ciudadSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_zonaSubCliente;
	public JLabel jLabelid_zonaSubCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaSubCliente;
	public JButton jButtonid_zonaSubCliente= new JButtonMe();
	public JButton jButtonid_zonaSubClienteUpdate= new JButtonMe();
	public JButton jButtonid_zonaSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_pais_nacionalidadSubCliente;
	public JLabel jLabelid_pais_nacionalidadSubCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pais_nacionalidadSubCliente;
	public JButton jButtonid_pais_nacionalidadSubCliente= new JButtonMe();
	public JButton jButtonid_pais_nacionalidadSubClienteUpdate= new JButtonMe();
	public JButton jButtonid_pais_nacionalidadSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_generoSubCliente;
	public JLabel jLabelid_tipo_generoSubCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_generoSubCliente;
	public JButton jButtonid_tipo_generoSubCliente= new JButtonMe();
	public JButton jButtonid_tipo_generoSubClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_generoSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_civilSubCliente;
	public JLabel jLabelid_estado_civilSubCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_civilSubCliente;
	public JButton jButtonid_estado_civilSubCliente= new JButtonMe();
	public JButton jButtonid_estado_civilSubClienteUpdate= new JButtonMe();
	public JButton jButtonid_estado_civilSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_legalSubCliente;
	public JLabel jLabelid_estado_legalSubCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_legalSubCliente;
	public JButton jButtonid_estado_legalSubCliente= new JButtonMe();
	public JButton jButtonid_estado_legalSubClienteUpdate= new JButtonMe();
	public JButton jButtonid_estado_legalSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_nivel_eduSubCliente;
	public JLabel jLabelid_tipo_nivel_eduSubCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_nivel_eduSubCliente;
	public JButton jButtonid_tipo_nivel_eduSubCliente= new JButtonMe();
	public JButton jButtonid_tipo_nivel_eduSubClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_nivel_eduSubClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableSubCliente;
	public JLabel jLabelid_cuenta_contableSubCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableSubCliente;
	public JButton jButtonid_cuenta_contableSubCliente= new JButtonMe();
	public JButton jButtonid_cuenta_contableSubClienteUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableSubClienteBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableSubClienteArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSubCliente;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=1364;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SubClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSubCliente=new JPanel();
				this.jPanelAccionesFormularioSubCliente=new JPanel();
				this.jmenuBarDetalleSubCliente=new JMenuBar();
				this.jTtoolBarDetalleSubCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SubCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SubClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SubCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SubCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarSubCliente() {
		return this.jButtonActualizarToolBarSubCliente;
	}
	
	public JButton getjButtonEliminarToolBarSubCliente() {
		return this.jButtonEliminarToolBarSubCliente;
	}
	
	public JButton getjButtonCancelarToolBarSubCliente() {
		return this.jButtonCancelarToolBarSubCliente;
	}		
	
	public JButton getjButtonProcesarInformacionSubCliente() {
		return this.jButtonProcesarInformacionSubCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSubCliente)	{
		this.jButtonProcesarInformacionSubCliente = jButtonProcesarInformacionSubCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSubCliente() {
		return this.jComboBoxTiposAccionesSubCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSubCliente(
			JComboBox jComboBoxTiposRelacionesSubCliente) {
		this.jComboBoxTiposRelacionesSubCliente = jComboBoxTiposRelacionesSubCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSubCliente(
			JComboBox jComboBoxTiposAccionesSubCliente) {
		this.jComboBoxTiposAccionesSubCliente = jComboBoxTiposAccionesSubCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSubCliente() {
		return this.jComboBoxTiposAccionesFormularioSubCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSubCliente(
			JComboBox jComboBoxTiposAccionesFormularioSubCliente) {
		this.jComboBoxTiposAccionesFormularioSubCliente = jComboBoxTiposAccionesFormularioSubCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.subclienteSessionBean=new SubClienteSessionBean();
		
		this.subclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.subclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.subclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.facturaSessionBean=new FacturaSessionBean();
		//this.consignacionSessionBean=new ConsignacionSessionBean();
		//this.guiaremisionSessionBean=new GuiaRemisionSessionBean();
		//this.proformaSessionBean=new ProformaSessionBean();
		//this.pedidoexporSessionBean=new PedidoExporSessionBean();
		//this.pedidoSessionBean=new PedidoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SubClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sub Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 3450) {
			iWidth=3450;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.subclienteSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSubCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSubCliente=new JButtonMe();
				this.jButtonModificarToolBarSubCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSubCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSubCliente,this.jTtoolBarDetalleSubCliente,
							"actualizar","actualizar","Actualizar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSubCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSubCliente,this.jTtoolBarDetalleSubCliente,
							"eliminar","eliminar","Eliminar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSubCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSubCliente,this.jTtoolBarDetalleSubCliente,
							"cancelar","cancelar","Cancelar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSubCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSubCliente,this.jTtoolBarDetalleSubCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSubCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSubCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSubCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSubCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSubCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSubCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSubCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSubCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSubCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSubCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSubCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSubCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSubCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSubCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSubCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSubCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSubCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSubCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSubCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSubCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSubCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSubCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSubCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSubCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSubCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSubCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSubCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSubCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSubCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSubCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSubCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSubCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSubCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSubCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSubCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSubCliente.add(this.jMenuItemDetalleCerrarSubCliente);
		
		this.jmenuDetalleAccionesSubCliente.add(this.jMenuItemActualizarSubCliente);
		this.jmenuDetalleAccionesSubCliente.add(this.jMenuItemEliminarSubCliente);
		this.jmenuDetalleAccionesSubCliente.add(this.jMenuItemCancelarSubCliente);		
		
		//this.jmenuDetalleDatosSubCliente.add(this.jMenuItemDetalleAbrirOrderBySubCliente);				
		this.jmenuDetalleDatosSubCliente.add(this.jMenuItemDetalleMostarOcultarSubCliente);				
				
		//this.jmenuDetalleAccionesSubCliente.add(this.jMenuItemGuardarCambiosSubCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSubCliente.add(this.jmenuDetalleArchivoSubCliente);		
		this.jmenuBarDetalleSubCliente.add(this.jmenuDetalleAccionesSubCliente);		
		this.jmenuBarDetalleSubCliente.add(this.jmenuDetalleDatosSubCliente);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleSubCliente.add(this.jmenuDetalleSubCliente);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSubCliente);				
	}
	
	
	public void inicializarElementosCamposSubCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSubCliente = new JLabelMe();
		jLabelIdSubCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSubCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSubCliente= new GridBagLayout();

		this.jPanelidSubCliente.setLayout(this.gridaBagLayoutSubCliente);

		jLabelidSubCliente = new JLabel();
		jLabelidSubCliente.setText("Id");

		jLabelidSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelidentificacionSubCliente = new JLabelMe();
		this.jLabelidentificacionSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_IDENTIFICACION+" : *");
		this.jLabelidentificacionSubCliente.setToolTipText("Identificacion");
		this.jLabelidentificacionSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidentificacionSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidentificacionSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidentificacionSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_IDENTIFICACION);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelidentificacionSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jTextFieldidentificacionSubCliente= new JTextFieldMe();

		jTextFieldidentificacionSubCliente.setEnabled(false);
		jTextFieldidentificacionSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldidentificacionSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidentificacionSubClienteBusqueda= new JButtonMe();
		this.jButtonidentificacionSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidentificacionSubClienteBusqueda.setText("U");
		this.jButtonidentificacionSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidentificacionSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidentificacionSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldidentificacionSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldidentificacionSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"identificacionSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidentificacionSubClienteBusqueda.setVisible(false);		}


					
		this.jLabelrucSubCliente = new JLabelMe();
		this.jLabelrucSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucSubCliente.setToolTipText("Ruc");
		this.jLabelrucSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelrucSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jTextFieldrucSubCliente= new JTextFieldMe();

		jTextFieldrucSubCliente.setEnabled(false);
		jTextFieldrucSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucSubClienteBusqueda= new JButtonMe();
		this.jButtonrucSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucSubClienteBusqueda.setText("U");
		this.jButtonrucSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucSubClienteBusqueda.setVisible(false);		}


					
		this.jLabelnombreSubCliente = new JLabelMe();
		this.jLabelnombreSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreSubCliente.setToolTipText("Nombre");
		this.jLabelnombreSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelnombreSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jTextAreanombreSubCliente= new JTextAreaMe();
		jTextAreanombreSubCliente.setEnabled(false);
		jTextAreanombreSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSubCliente.setLineWrap(true);
		jTextAreanombreSubCliente.setWrapStyleWord(true);
		jTextAreanombreSubCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreSubCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreSubCliente = new JScrollPane(jTextAreanombreSubCliente);
		jscrollPanenombreSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreSubClienteBusqueda= new JButtonMe();
		this.jButtonnombreSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreSubClienteBusqueda.setText("U");
		this.jButtonnombreSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreSubClienteBusqueda.setVisible(false);		}


					
		this.jLabelapellidoSubCliente = new JLabelMe();
		this.jLabelapellidoSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_APELLIDO+" : *");
		this.jLabelapellidoSubCliente.setToolTipText("Apellido");
		this.jLabelapellidoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidoSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidoSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_APELLIDO);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelapellidoSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jTextAreaapellidoSubCliente= new JTextAreaMe();
		jTextAreaapellidoSubCliente.setEnabled(false);
		jTextAreaapellidoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoSubCliente.setLineWrap(true);
		jTextAreaapellidoSubCliente.setWrapStyleWord(true);
		jTextAreaapellidoSubCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidoSubCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidoSubCliente = new JScrollPane(jTextAreaapellidoSubCliente);
		jscrollPaneapellidoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidoSubClienteBusqueda= new JButtonMe();
		this.jButtonapellidoSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidoSubClienteBusqueda.setText("U");
		this.jButtonapellidoSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidoSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidoSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidoSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidoSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidoSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidoSubClienteBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoSubCliente = new JLabelMe();
		this.jLabelnombre_completoSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_NOMBRECOMPLETO+" :");
		this.jLabelnombre_completoSubCliente.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelnombre_completoSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jTextAreanombre_completoSubCliente= new JTextAreaMe();
		jTextAreanombre_completoSubCliente.setEnabled(false);
		jTextAreanombre_completoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoSubCliente.setLineWrap(true);
		jTextAreanombre_completoSubCliente.setWrapStyleWord(true);
		jTextAreanombre_completoSubCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoSubCliente.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoSubCliente = new JScrollPane(jTextAreanombre_completoSubCliente);
		jscrollPanenombre_completoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),70 + FuncionesSwing.getValorProporcion(70,0)));

		jTextAreanombre_completoSubCliente.setEnabled(false);
		this.jButtonnombre_completoSubClienteBusqueda= new JButtonMe();
		this.jButtonnombre_completoSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoSubClienteBusqueda.setText("U");
		this.jButtonnombre_completoSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoSubClienteBusqueda.setVisible(false);		}


					
		this.jLabeldireccionSubCliente = new JLabelMe();
		this.jLabeldireccionSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionSubCliente.setToolTipText("Direccion");
		this.jLabeldireccionSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPaneldireccionSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jTextAreadireccionSubCliente= new JTextAreaMe();
		jTextAreadireccionSubCliente.setEnabled(false);
		jTextAreadireccionSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionSubCliente.setLineWrap(true);
		jTextAreadireccionSubCliente.setWrapStyleWord(true);
		jTextAreadireccionSubCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionSubCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionSubCliente = new JScrollPane(jTextAreadireccionSubCliente);
		jscrollPanedireccionSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccionSubClienteBusqueda= new JButtonMe();
		this.jButtondireccionSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionSubClienteBusqueda.setText("U");
		this.jButtondireccionSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionSubClienteBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoSubCliente = new JLabelMe();
		this.jLabeltelefonoSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoSubCliente.setToolTipText("Telefono");
		this.jLabeltelefonoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPaneltelefonoSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jTextAreatelefonoSubCliente= new JTextAreaMe();
		jTextAreatelefonoSubCliente.setEnabled(false);
		jTextAreatelefonoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoSubCliente.setLineWrap(true);
		jTextAreatelefonoSubCliente.setWrapStyleWord(true);
		jTextAreatelefonoSubCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonoSubCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonoSubCliente = new JScrollPane(jTextAreatelefonoSubCliente);
		jscrollPanetelefonoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontelefonoSubClienteBusqueda= new JButtonMe();
		this.jButtontelefonoSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoSubClienteBusqueda.setText("U");
		this.jButtontelefonoSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonoSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonoSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoSubClienteBusqueda.setVisible(false);		}


					
		this.jLabelnumero_celularSubCliente = new JLabelMe();
		this.jLabelnumero_celularSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_NUMEROCELULAR+" :");
		this.jLabelnumero_celularSubCliente.setToolTipText("Numero Celular");
		this.jLabelnumero_celularSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_celularSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_celularSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_celularSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_celularSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_celularSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_NUMEROCELULAR);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelnumero_celularSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jTextAreanumero_celularSubCliente= new JTextAreaMe();
		jTextAreanumero_celularSubCliente.setEnabled(false);
		jTextAreanumero_celularSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_celularSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_celularSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_celularSubCliente.setLineWrap(true);
		jTextAreanumero_celularSubCliente.setWrapStyleWord(true);
		jTextAreanumero_celularSubCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_celularSubCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_celularSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_celularSubCliente = new JScrollPane(jTextAreanumero_celularSubCliente);
		jscrollPanenumero_celularSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_celularSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_celularSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnumero_celularSubClienteBusqueda= new JButtonMe();
		this.jButtonnumero_celularSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_celularSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_celularSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_celularSubClienteBusqueda.setText("U");
		this.jButtonnumero_celularSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_celularSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_celularSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_celularSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_celularSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_celularSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_celularSubClienteBusqueda.setVisible(false);		}


					
		this.jLabelmailSubCliente = new JLabelMe();
		this.jLabelmailSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_MAIL+" :");
		this.jLabelmailSubCliente.setToolTipText("Mail");
		this.jLabelmailSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmailSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmailSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmailSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmailSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmailSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_MAIL);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelmailSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jTextAreamailSubCliente= new JTextAreaMe();
		jTextAreamailSubCliente.setEnabled(false);
		jTextAreamailSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamailSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamailSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamailSubCliente.setLineWrap(true);
		jTextAreamailSubCliente.setWrapStyleWord(true);
		jTextAreamailSubCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamailSubCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreamailSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemailSubCliente = new JScrollPane(jTextAreamailSubCliente);
		jscrollPanemailSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemailSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemailSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonmailSubClienteBusqueda= new JButtonMe();
		this.jButtonmailSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmailSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmailSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmailSubClienteBusqueda.setText("U");
		this.jButtonmailSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmailSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmailSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamailSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamailSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"mailSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmailSubClienteBusqueda.setVisible(false);		}


					
		this.jLabelfecha_nacimientoSubCliente = new JLabelMe();
		this.jLabelfecha_nacimientoSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_FECHANACIMIENTO+" : *");
		this.jLabelfecha_nacimientoSubCliente.setToolTipText("Fecha Nacimiento");
		this.jLabelfecha_nacimientoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_nacimientoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_nacimientoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_nacimientoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_nacimientoSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_nacimientoSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_FECHANACIMIENTO);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelfecha_nacimientoSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		//jFormattedTextFieldfecha_nacimientoSubCliente= new JFormattedTextFieldMe();

		jDateChooserfecha_nacimientoSubCliente= new JDateChooser();
		jDateChooserfecha_nacimientoSubCliente.setEnabled(false);
		jDateChooserfecha_nacimientoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_nacimientoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_nacimientoSubCliente.setDate(new Date());
		jDateChooserfecha_nacimientoSubCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_nacimientoSubCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_nacimientoSubClienteBusqueda= new JButtonMe();
		this.jButtonfecha_nacimientoSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimientoSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimientoSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_nacimientoSubClienteBusqueda.setText("U");
		this.jButtonfecha_nacimientoSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_nacimientoSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_nacimientoSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_nacimientoSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_nacimientoSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_nacimientoSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_nacimientoSubClienteBusqueda.setVisible(false);		}


					
		this.jLabelfechaoSubCliente = new JLabelMe();
		this.jLabelfechaoSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaoSubCliente.setToolTipText("Fecha");
		this.jLabelfechaoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaoSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaoSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelfechaoSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		//jFormattedTextFieldfechaoSubCliente= new JFormattedTextFieldMe();

		jDateChooserfechaoSubCliente= new JDateChooser();
		jDateChooserfechaoSubCliente.setEnabled(false);
		jDateChooserfechaoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaoSubCliente.setDate(new Date());
		jDateChooserfechaoSubCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaoSubCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaoSubClienteBusqueda= new JButtonMe();
		this.jButtonfechaoSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaoSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaoSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaoSubClienteBusqueda.setText("U");
		this.jButtonfechaoSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaoSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaoSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaoSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaoSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaoSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaoSubClienteBusqueda.setVisible(false);		}


					
		this.jLabelobservacionSubCliente = new JLabelMe();
		this.jLabelobservacionSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_OBSERVACION+" :");
		this.jLabelobservacionSubCliente.setToolTipText("Observacion");
		this.jLabelobservacionSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_OBSERVACION);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelobservacionSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jTextAreaobservacionSubCliente= new JTextAreaMe();
		jTextAreaobservacionSubCliente.setEnabled(false);
		jTextAreaobservacionSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionSubCliente.setLineWrap(true);
		jTextAreaobservacionSubCliente.setWrapStyleWord(true);
		jTextAreaobservacionSubCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionSubCliente.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionSubCliente = new JScrollPane(jTextAreaobservacionSubCliente);
		jscrollPaneobservacionSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonobservacionSubClienteBusqueda= new JButtonMe();
		this.jButtonobservacionSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionSubClienteBusqueda.setText("U");
		this.jButtonobservacionSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionSubClienteBusqueda.setVisible(false);		}


					
		this.jLabelpath_imagen_firmaSubCliente = new JLabelMe();
		this.jLabelpath_imagen_firmaSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_PATHIMAGENFIRMA+" :");
		this.jLabelpath_imagen_firmaSubCliente.setToolTipText("Path Imagen Firma");
		this.jLabelpath_imagen_firmaSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpath_imagen_firmaSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpath_imagen_firmaSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelpath_imagen_firmaSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpath_imagen_firmaSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpath_imagen_firmaSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_PATHIMAGENFIRMA);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelpath_imagen_firmaSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jTextAreapath_imagen_firmaSubCliente= new JTextAreaMe();
		jTextAreapath_imagen_firmaSubCliente.setEnabled(false);
		jTextAreapath_imagen_firmaSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_imagen_firmaSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_imagen_firmaSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_imagen_firmaSubCliente.setLineWrap(true);
		jTextAreapath_imagen_firmaSubCliente.setWrapStyleWord(true);
		jTextAreapath_imagen_firmaSubCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreapath_imagen_firmaSubCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreapath_imagen_firmaSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanepath_imagen_firmaSubCliente = new JScrollPane(jTextAreapath_imagen_firmaSubCliente);
		jscrollPanepath_imagen_firmaSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepath_imagen_firmaSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepath_imagen_firmaSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonpath_imagen_firmaSubClienteBusqueda= new JButtonMe();
		this.jButtonpath_imagen_firmaSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpath_imagen_firmaSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpath_imagen_firmaSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpath_imagen_firmaSubClienteBusqueda.setText("U");
		this.jButtonpath_imagen_firmaSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpath_imagen_firmaSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpath_imagen_firmaSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreapath_imagen_firmaSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreapath_imagen_firmaSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"path_imagen_firmaSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpath_imagen_firmaSubClienteBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cargaSubCliente = new JLabelMe();
		this.jLabelnumero_cargaSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_NUMEROCARGA+" : *");
		this.jLabelnumero_cargaSubCliente.setToolTipText("Numero Carga");
		this.jLabelnumero_cargaSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cargaSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cargaSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cargaSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cargaSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cargaSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_NUMEROCARGA);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelnumero_cargaSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jTextFieldnumero_cargaSubCliente= new JTextFieldMe();
		jTextFieldnumero_cargaSubCliente.setEnabled(false);
		jTextFieldnumero_cargaSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cargaSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cargaSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cargaSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_cargaSubCliente.setText("0");

		this.jButtonnumero_cargaSubClienteBusqueda= new JButtonMe();
		this.jButtonnumero_cargaSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cargaSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cargaSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cargaSubClienteBusqueda.setText("U");
		this.jButtonnumero_cargaSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cargaSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cargaSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cargaSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cargaSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cargaSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cargaSubClienteBusqueda.setVisible(false);		}


					
		this.jLabellimite_creditoSubCliente = new JLabelMe();
		this.jLabellimite_creditoSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_LIMITECREDITO+" : *");
		this.jLabellimite_creditoSubCliente.setToolTipText("Limite Credito");
		this.jLabellimite_creditoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellimite_creditoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellimite_creditoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellimite_creditoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellimite_creditoSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellimite_creditoSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_LIMITECREDITO);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanellimite_creditoSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jTextFieldlimite_creditoSubCliente= new JTextFieldMe();
		jTextFieldlimite_creditoSubCliente.setEnabled(false);
		jTextFieldlimite_creditoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlimite_creditoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlimite_creditoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlimite_creditoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldlimite_creditoSubCliente.setText("0.0");

		this.jButtonlimite_creditoSubClienteBusqueda= new JButtonMe();
		this.jButtonlimite_creditoSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlimite_creditoSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlimite_creditoSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlimite_creditoSubClienteBusqueda.setText("U");
		this.jButtonlimite_creditoSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlimite_creditoSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlimite_creditoSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlimite_creditoSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlimite_creditoSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"limite_creditoSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlimite_creditoSubClienteBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoSubCliente = new JLabelMe();
		this.jLabeldescuentoSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoSubCliente.setToolTipText("Descuento");
		this.jLabeldescuentoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPaneldescuentoSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jTextFielddescuentoSubCliente= new JTextFieldMe();
		jTextFielddescuentoSubCliente.setEnabled(false);
		jTextFielddescuentoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoSubCliente.setText("0.0");

		this.jButtondescuentoSubClienteBusqueda= new JButtonMe();
		this.jButtondescuentoSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoSubClienteBusqueda.setText("U");
		this.jButtondescuentoSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoSubClienteBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_contratoSubCliente = new JLabelMe();
		this.jLabelcodigo_contratoSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_CODIGOCONTRATO+" :");
		this.jLabelcodigo_contratoSubCliente.setToolTipText("Codigo Contrato");
		this.jLabelcodigo_contratoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_contratoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_contratoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_contratoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_contratoSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_contratoSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_CODIGOCONTRATO);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelcodigo_contratoSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jTextFieldcodigo_contratoSubCliente= new JTextFieldMe();

		jTextFieldcodigo_contratoSubCliente.setEnabled(false);
		jTextFieldcodigo_contratoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_contratoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_contratoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_contratoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_contratoSubClienteBusqueda= new JButtonMe();
		this.jButtoncodigo_contratoSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_contratoSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_contratoSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_contratoSubClienteBusqueda.setText("U");
		this.jButtoncodigo_contratoSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_contratoSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_contratoSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_contratoSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_contratoSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_contratoSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_contratoSubClienteBusqueda.setVisible(false);		}


					
		this.jLabelvalor_contratoSubCliente = new JLabelMe();
		this.jLabelvalor_contratoSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_VALORCONTRATO+" : *");
		this.jLabelvalor_contratoSubCliente.setToolTipText("Valor Contrato");
		this.jLabelvalor_contratoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_contratoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_contratoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_contratoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_contratoSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_contratoSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_VALORCONTRATO);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelvalor_contratoSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jTextFieldvalor_contratoSubCliente= new JTextFieldMe();
		jTextFieldvalor_contratoSubCliente.setEnabled(false);
		jTextFieldvalor_contratoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_contratoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_contratoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_contratoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_contratoSubCliente.setText("0.0");

		this.jButtonvalor_contratoSubClienteBusqueda= new JButtonMe();
		this.jButtonvalor_contratoSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_contratoSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_contratoSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_contratoSubClienteBusqueda.setText("U");
		this.jButtonvalor_contratoSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_contratoSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_contratoSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_contratoSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_contratoSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_contratoSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_contratoSubClienteBusqueda.setVisible(false);		}


					
		this.jLabelfecha_inicioSubCliente = new JLabelMe();
		this.jLabelfecha_inicioSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioSubCliente.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelfecha_inicioSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		//jFormattedTextFieldfecha_inicioSubCliente= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioSubCliente= new JDateChooser();
		jDateChooserfecha_inicioSubCliente.setEnabled(false);
		jDateChooserfecha_inicioSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioSubCliente.setDate(new Date());
		jDateChooserfecha_inicioSubCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioSubCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioSubClienteBusqueda= new JButtonMe();
		this.jButtonfecha_inicioSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioSubClienteBusqueda.setText("U");
		this.jButtonfecha_inicioSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioSubClienteBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finSubCliente = new JLabelMe();
		this.jLabelfecha_finSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finSubCliente.setToolTipText("Fecha Fin");
		this.jLabelfecha_finSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelfecha_finSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		//jFormattedTextFieldfecha_finSubCliente= new JFormattedTextFieldMe();

		jDateChooserfecha_finSubCliente= new JDateChooser();
		jDateChooserfecha_finSubCliente.setEnabled(false);
		jDateChooserfecha_finSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finSubCliente.setDate(new Date());
		jDateChooserfecha_finSubCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finSubCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finSubClienteBusqueda= new JButtonMe();
		this.jButtonfecha_finSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finSubClienteBusqueda.setText("U");
		this.jButtonfecha_finSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finSubClienteBusqueda.setVisible(false);		}


					
		this.jLabelplazoSubCliente = new JLabelMe();
		this.jLabelplazoSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_PLAZO+" : *");
		this.jLabelplazoSubCliente.setToolTipText("Plazo");
		this.jLabelplazoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelplazoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelplazoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelplazoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelplazoSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelplazoSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_PLAZO);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelplazoSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jTextFieldplazoSubCliente= new JTextFieldMe();
		jTextFieldplazoSubCliente.setEnabled(false);
		jTextFieldplazoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldplazoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldplazoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldplazoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldplazoSubCliente.setText("0");

		this.jButtonplazoSubClienteBusqueda= new JButtonMe();
		this.jButtonplazoSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonplazoSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonplazoSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonplazoSubClienteBusqueda.setText("U");
		this.jButtonplazoSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonplazoSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonplazoSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldplazoSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldplazoSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"plazoSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonplazoSubClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSubCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSubCliente = new JLabelMe();
		this.jLabelid_empresaSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSubCliente.setToolTipText("Empresa");
		this.jLabelid_empresaSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelid_empresaSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jComboBoxid_empresaSubCliente= new JComboBoxMe();
		jComboBoxid_empresaSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSubCliente.setEnabled(false);

		this.jButtonid_empresaSubCliente= new JButtonMe();
		this.jButtonid_empresaSubCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSubCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSubCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSubCliente.setText("Buscar");
		this.jButtonid_empresaSubCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSubCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSubCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSubCliente"));

		this.jButtonid_empresaSubClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSubClienteBusqueda.setText("U");
		this.jButtonid_empresaSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSubClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaSubClienteUpdate= new JButtonMe();
		this.jButtonid_empresaSubClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSubClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSubClienteUpdate.setText("U");
		this.jButtonid_empresaSubClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSubClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSubClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSubClienteUpdate"));



					
		this.jLabelid_clienteSubCliente = new JLabelMe();
		this.jLabelid_clienteSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteSubCliente.setToolTipText("Cliente");
		this.jLabelid_clienteSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelid_clienteSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jComboBoxid_clienteSubCliente= new JComboBoxMe();
		jComboBoxid_clienteSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteSubCliente= new JButtonMe();
		this.jButtonid_clienteSubCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteSubCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteSubCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteSubCliente.setText("Buscar");
		this.jButtonid_clienteSubCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteSubCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteSubCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteSubCliente"));

		this.jButtonid_clienteSubClienteBusqueda= new JButtonMe();
		this.jButtonid_clienteSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteSubClienteBusqueda.setText("U");
		this.jButtonid_clienteSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteSubClienteBusqueda.setVisible(false);		}

		this.jButtonid_clienteSubClienteUpdate= new JButtonMe();
		this.jButtonid_clienteSubClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSubClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSubClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteSubClienteUpdate.setText("U");
		this.jButtonid_clienteSubClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteSubClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteSubClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteSubClienteUpdate"));



					
		this.jLabelid_sucursalSubCliente = new JLabelMe();
		this.jLabelid_sucursalSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalSubCliente.setToolTipText("Sucursal");
		this.jLabelid_sucursalSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelid_sucursalSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jComboBoxid_sucursalSubCliente= new JComboBoxMe();
		jComboBoxid_sucursalSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalSubCliente.setEnabled(false);

		this.jButtonid_sucursalSubCliente= new JButtonMe();
		this.jButtonid_sucursalSubCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSubCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSubCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSubCliente.setText("Buscar");
		this.jButtonid_sucursalSubCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalSubCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSubCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSubCliente"));

		this.jButtonid_sucursalSubClienteBusqueda= new JButtonMe();
		this.jButtonid_sucursalSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSubClienteBusqueda.setText("U");
		this.jButtonid_sucursalSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalSubClienteBusqueda.setVisible(false);		}

		this.jButtonid_sucursalSubClienteUpdate= new JButtonMe();
		this.jButtonid_sucursalSubClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSubClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSubClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSubClienteUpdate.setText("U");
		this.jButtonid_sucursalSubClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalSubClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSubClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSubClienteUpdate"));



					
		this.jLabelid_tipo_identificacionSubCliente = new JLabelMe();
		this.jLabelid_tipo_identificacionSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_IDTIPOIDENTIFICACION+" : *");
		this.jLabelid_tipo_identificacionSubCliente.setToolTipText("Tipo Identificacion");
		this.jLabelid_tipo_identificacionSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_identificacionSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_identificacionSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_identificacionSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_identificacionSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_identificacionSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelid_tipo_identificacionSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jComboBoxid_tipo_identificacionSubCliente= new JComboBoxMe();
		jComboBoxid_tipo_identificacionSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_identificacionSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_identificacionSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_identificacionSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_identificacionSubCliente= new JButtonMe();
		this.jButtonid_tipo_identificacionSubCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_identificacionSubCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_identificacionSubCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_identificacionSubCliente.setText("Buscar");
		this.jButtonid_tipo_identificacionSubCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_identificacionSubCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_identificacionSubCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_identificacionSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_identificacionSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_identificacionSubCliente"));

		this.jButtonid_tipo_identificacionSubClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_identificacionSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_identificacionSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_identificacionSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_identificacionSubClienteBusqueda.setText("U");
		this.jButtonid_tipo_identificacionSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_identificacionSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_identificacionSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_identificacionSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_identificacionSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_identificacionSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_identificacionSubClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_identificacionSubClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_identificacionSubClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_identificacionSubClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_identificacionSubClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_identificacionSubClienteUpdate.setText("U");
		this.jButtonid_tipo_identificacionSubClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_identificacionSubClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_identificacionSubClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_identificacionSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_identificacionSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_identificacionSubClienteUpdate"));



					
		this.jLabelid_paisSubCliente = new JLabelMe();
		this.jLabelid_paisSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisSubCliente.setToolTipText("Pais");
		this.jLabelid_paisSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelid_paisSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jComboBoxid_paisSubCliente= new JComboBoxMe();
		jComboBoxid_paisSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisSubCliente= new JButtonMe();
		this.jButtonid_paisSubCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisSubCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisSubCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisSubCliente.setText("Buscar");
		this.jButtonid_paisSubCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisSubCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisSubCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisSubCliente"));

		this.jButtonid_paisSubClienteBusqueda= new JButtonMe();
		this.jButtonid_paisSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisSubClienteBusqueda.setText("U");
		this.jButtonid_paisSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisSubClienteBusqueda.setVisible(false);		}

		this.jButtonid_paisSubClienteUpdate= new JButtonMe();
		this.jButtonid_paisSubClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisSubClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisSubClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisSubClienteUpdate.setText("U");
		this.jButtonid_paisSubClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisSubClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisSubClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisSubClienteUpdate"));



					
		this.jLabelid_ciudadSubCliente = new JLabelMe();
		this.jLabelid_ciudadSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadSubCliente.setToolTipText("Ciudad");
		this.jLabelid_ciudadSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelid_ciudadSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jComboBoxid_ciudadSubCliente= new JComboBoxMe();
		jComboBoxid_ciudadSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadSubCliente= new JButtonMe();
		this.jButtonid_ciudadSubCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadSubCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadSubCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadSubCliente.setText("Buscar");
		this.jButtonid_ciudadSubCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadSubCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadSubCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadSubCliente"));

		this.jButtonid_ciudadSubClienteBusqueda= new JButtonMe();
		this.jButtonid_ciudadSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadSubClienteBusqueda.setText("U");
		this.jButtonid_ciudadSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadSubClienteBusqueda.setVisible(false);		}

		this.jButtonid_ciudadSubClienteUpdate= new JButtonMe();
		this.jButtonid_ciudadSubClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadSubClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadSubClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadSubClienteUpdate.setText("U");
		this.jButtonid_ciudadSubClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadSubClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadSubClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadSubClienteUpdate"));



					
		this.jLabelid_zonaSubCliente = new JLabelMe();
		this.jLabelid_zonaSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_IDZONA+" : *");
		this.jLabelid_zonaSubCliente.setToolTipText("Zona");
		this.jLabelid_zonaSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_zonaSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_zonaSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_zonaSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_IDZONA);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelid_zonaSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jComboBoxid_zonaSubCliente= new JComboBoxMe();
		jComboBoxid_zonaSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_zonaSubCliente= new JButtonMe();
		this.jButtonid_zonaSubCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaSubCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaSubCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaSubCliente.setText("Buscar");
		this.jButtonid_zonaSubCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_zonaSubCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaSubCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_zonaSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaSubCliente"));

		this.jButtonid_zonaSubClienteBusqueda= new JButtonMe();
		this.jButtonid_zonaSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaSubClienteBusqueda.setText("U");
		this.jButtonid_zonaSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_zonaSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_zonaSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_zonaSubClienteBusqueda.setVisible(false);		}

		this.jButtonid_zonaSubClienteUpdate= new JButtonMe();
		this.jButtonid_zonaSubClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaSubClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaSubClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaSubClienteUpdate.setText("U");
		this.jButtonid_zonaSubClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_zonaSubClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaSubClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_zonaSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaSubClienteUpdate"));



					
		this.jLabelid_pais_nacionalidadSubCliente = new JLabelMe();
		this.jLabelid_pais_nacionalidadSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_IDPAISNACIONALIDAD+" : *");
		this.jLabelid_pais_nacionalidadSubCliente.setToolTipText("Pais Nacionalad");
		this.jLabelid_pais_nacionalidadSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_pais_nacionalidadSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_pais_nacionalidadSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_pais_nacionalidadSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_pais_nacionalidadSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_pais_nacionalidadSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_IDPAISNACIONALIDAD);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelid_pais_nacionalidadSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jComboBoxid_pais_nacionalidadSubCliente= new JComboBoxMe();
		jComboBoxid_pais_nacionalidadSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pais_nacionalidadSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pais_nacionalidadSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pais_nacionalidadSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_pais_nacionalidadSubCliente= new JButtonMe();
		this.jButtonid_pais_nacionalidadSubCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pais_nacionalidadSubCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pais_nacionalidadSubCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pais_nacionalidadSubCliente.setText("Buscar");
		this.jButtonid_pais_nacionalidadSubCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_pais_nacionalidadSubCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pais_nacionalidadSubCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_pais_nacionalidadSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pais_nacionalidadSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pais_nacionalidadSubCliente"));

		this.jButtonid_pais_nacionalidadSubClienteBusqueda= new JButtonMe();
		this.jButtonid_pais_nacionalidadSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pais_nacionalidadSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pais_nacionalidadSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pais_nacionalidadSubClienteBusqueda.setText("U");
		this.jButtonid_pais_nacionalidadSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_pais_nacionalidadSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pais_nacionalidadSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_pais_nacionalidadSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pais_nacionalidadSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pais_nacionalidadSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_pais_nacionalidadSubClienteBusqueda.setVisible(false);		}

		this.jButtonid_pais_nacionalidadSubClienteUpdate= new JButtonMe();
		this.jButtonid_pais_nacionalidadSubClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pais_nacionalidadSubClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pais_nacionalidadSubClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pais_nacionalidadSubClienteUpdate.setText("U");
		this.jButtonid_pais_nacionalidadSubClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_pais_nacionalidadSubClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pais_nacionalidadSubClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_pais_nacionalidadSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pais_nacionalidadSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pais_nacionalidadSubClienteUpdate"));



					
		this.jLabelid_tipo_generoSubCliente = new JLabelMe();
		this.jLabelid_tipo_generoSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_IDTIPOGENERO+" : *");
		this.jLabelid_tipo_generoSubCliente.setToolTipText("Tipo Genero");
		this.jLabelid_tipo_generoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_generoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_generoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_generoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_generoSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_generoSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_IDTIPOGENERO);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelid_tipo_generoSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jComboBoxid_tipo_generoSubCliente= new JComboBoxMe();
		jComboBoxid_tipo_generoSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_generoSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_generoSubCliente= new JButtonMe();
		this.jButtonid_tipo_generoSubCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoSubCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoSubCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoSubCliente.setText("Buscar");
		this.jButtonid_tipo_generoSubCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_generoSubCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoSubCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_generoSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoSubCliente"));

		this.jButtonid_tipo_generoSubClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_generoSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_generoSubClienteBusqueda.setText("U");
		this.jButtonid_tipo_generoSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_generoSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_generoSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_generoSubClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_generoSubClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_generoSubClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoSubClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoSubClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_generoSubClienteUpdate.setText("U");
		this.jButtonid_tipo_generoSubClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_generoSubClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoSubClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_generoSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoSubClienteUpdate"));



					
		this.jLabelid_estado_civilSubCliente = new JLabelMe();
		this.jLabelid_estado_civilSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_IDESTADOCIVIL+" : *");
		this.jLabelid_estado_civilSubCliente.setToolTipText("Estado Civil");
		this.jLabelid_estado_civilSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_civilSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_civilSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_civilSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_civilSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_civilSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_IDESTADOCIVIL);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelid_estado_civilSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jComboBoxid_estado_civilSubCliente= new JComboBoxMe();
		jComboBoxid_estado_civilSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_civilSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_civilSubCliente= new JButtonMe();
		this.jButtonid_estado_civilSubCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilSubCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilSubCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilSubCliente.setText("Buscar");
		this.jButtonid_estado_civilSubCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_civilSubCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilSubCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_civilSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilSubCliente"));

		this.jButtonid_estado_civilSubClienteBusqueda= new JButtonMe();
		this.jButtonid_estado_civilSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_civilSubClienteBusqueda.setText("U");
		this.jButtonid_estado_civilSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_civilSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_civilSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_civilSubClienteBusqueda.setVisible(false);		}

		this.jButtonid_estado_civilSubClienteUpdate= new JButtonMe();
		this.jButtonid_estado_civilSubClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilSubClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilSubClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_civilSubClienteUpdate.setText("U");
		this.jButtonid_estado_civilSubClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_civilSubClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilSubClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_civilSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilSubClienteUpdate"));



					
		this.jLabelid_estado_legalSubCliente = new JLabelMe();
		this.jLabelid_estado_legalSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_IDESTADOLEGAL+" : *");
		this.jLabelid_estado_legalSubCliente.setToolTipText("Estado Legal");
		this.jLabelid_estado_legalSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_legalSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_legalSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_legalSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_legalSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_legalSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_IDESTADOLEGAL);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelid_estado_legalSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jComboBoxid_estado_legalSubCliente= new JComboBoxMe();
		jComboBoxid_estado_legalSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_legalSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_legalSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_legalSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_legalSubCliente= new JButtonMe();
		this.jButtonid_estado_legalSubCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_legalSubCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_legalSubCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_legalSubCliente.setText("Buscar");
		this.jButtonid_estado_legalSubCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_legalSubCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_legalSubCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_legalSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_legalSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_legalSubCliente"));

		this.jButtonid_estado_legalSubClienteBusqueda= new JButtonMe();
		this.jButtonid_estado_legalSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_legalSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_legalSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_legalSubClienteBusqueda.setText("U");
		this.jButtonid_estado_legalSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_legalSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_legalSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_legalSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_legalSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_legalSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_legalSubClienteBusqueda.setVisible(false);		}

		this.jButtonid_estado_legalSubClienteUpdate= new JButtonMe();
		this.jButtonid_estado_legalSubClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_legalSubClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_legalSubClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_legalSubClienteUpdate.setText("U");
		this.jButtonid_estado_legalSubClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_legalSubClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_legalSubClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_legalSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_legalSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_legalSubClienteUpdate"));



					
		this.jLabelid_tipo_nivel_eduSubCliente = new JLabelMe();
		this.jLabelid_tipo_nivel_eduSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_IDTIPONIVELEDU+" : *");
		this.jLabelid_tipo_nivel_eduSubCliente.setToolTipText("Tipo Nivel Educativo");
		this.jLabelid_tipo_nivel_eduSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_nivel_eduSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_nivel_eduSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_nivel_eduSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_nivel_eduSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_nivel_eduSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_IDTIPONIVELEDU);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelid_tipo_nivel_eduSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jComboBoxid_tipo_nivel_eduSubCliente= new JComboBoxMe();
		jComboBoxid_tipo_nivel_eduSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_nivel_eduSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_nivel_eduSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_nivel_eduSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_nivel_eduSubCliente= new JButtonMe();
		this.jButtonid_tipo_nivel_eduSubCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_nivel_eduSubCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_nivel_eduSubCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_nivel_eduSubCliente.setText("Buscar");
		this.jButtonid_tipo_nivel_eduSubCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_nivel_eduSubCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_nivel_eduSubCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_nivel_eduSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_nivel_eduSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_nivel_eduSubCliente"));

		this.jButtonid_tipo_nivel_eduSubClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_nivel_eduSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_nivel_eduSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_nivel_eduSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_nivel_eduSubClienteBusqueda.setText("U");
		this.jButtonid_tipo_nivel_eduSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_nivel_eduSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_nivel_eduSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_nivel_eduSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_nivel_eduSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_nivel_eduSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_nivel_eduSubClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_nivel_eduSubClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_nivel_eduSubClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_nivel_eduSubClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_nivel_eduSubClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_nivel_eduSubClienteUpdate.setText("U");
		this.jButtonid_tipo_nivel_eduSubClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_nivel_eduSubClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_nivel_eduSubClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_nivel_eduSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_nivel_eduSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_nivel_eduSubClienteUpdate"));



					
		this.jLabelid_cuenta_contableSubCliente = new JLabelMe();
		this.jLabelid_cuenta_contableSubCliente.setText(""+SubClienteConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableSubCliente.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableSubCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableSubCliente.setToolTipText(SubClienteConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutSubCliente = new GridBagLayout();
		this.jPanelid_cuenta_contableSubCliente.setLayout(this.gridaBagLayoutSubCliente);


		jComboBoxid_cuenta_contableSubCliente= new JComboBoxMe();
		jComboBoxid_cuenta_contableSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableSubCliente= new JButtonMe();
		this.jButtonid_cuenta_contableSubCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableSubCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableSubCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableSubCliente.setText("Buscar");
		this.jButtonid_cuenta_contableSubCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableSubCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableSubCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableSubCliente"));

		this.jButtonid_cuenta_contableSubClienteBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableSubClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableSubClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableSubClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableSubClienteBusqueda.setText("U");
		this.jButtonid_cuenta_contableSubClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableSubClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableSubClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableSubClienteBusqueda"));

		if(this.subclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableSubClienteBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableSubClienteUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableSubClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableSubClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableSubClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableSubClienteUpdate.setText("U");
		this.jButtonid_cuenta_contableSubClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableSubClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableSubClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableSubClienteUpdate"));


		jButtonid_cuenta_contableSubClienteArbol= new JButtonMe();
		jButtonid_cuenta_contableSubClienteArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableSubClienteArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableSubClienteArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableSubClienteArbol.setText("Arbol");
		jButtonid_cuenta_contableSubClienteArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableSubClienteArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableSubClienteArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableSubCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableSubCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableSubClienteArbol"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleSubCliente = new SubClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Sub Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSubCliente= new GridBagLayout();
		

		
		String sToolTipSubCliente="";
		sToolTipSubCliente=SubClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSubCliente+="(Cartera.SubCliente)";
		}
		
		if(!this.subclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipSubCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSubCliente = new JButtonMe();
		this.jButtonModificarSubCliente = new JButtonMe();
        this.jButtonActualizarSubCliente = new JButtonMe();
        this.jButtonEliminarSubCliente = new JButtonMe();
        this.jButtonCancelarSubCliente = new JButtonMe();
        this.jButtonGuardarCambiosSubCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaSubCliente = new JButtonMe();
		this.jButtonCerrarSubCliente = new JButtonMe();
		
		this.jScrollPanelDatosSubCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionSubCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralSubCliente = new JScrollPane();
				
		
		
		this.jPanelCamposSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposSubCliente=new JTabbedPane();
		
		
		this.jTabbedPaneCamposSubCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioubicacionSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciopersonalSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontableSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontratoSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Sub Cliente";
		
		if(!this.subclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosSubCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSubCliente.setName("jPanelCamposSubCliente"); 

		this.jPanelCamposOcultosSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSubCliente.setName("jPanelCamposOcultosSubCliente"); 

        this.jPanelAccionesSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSubCliente.setToolTipText("Acciones");
        this.jPanelAccionesSubCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSubCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSubCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralSubCliente.setName("jPanelCamposFingeneralSubCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioubicacionSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Ubicacion"));
		this.jPanelCamposInicioubicacionSubCliente.setName("jPanelCamposFinubicacionSubCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioubicacionSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciopersonalSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal"));
		this.jPanelCamposIniciopersonalSubCliente.setName("jPanelCamposFinpersonalSubCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciopersonalSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocontableSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Contable"));
		this.jPanelCamposIniciocontableSubCliente.setName("jPanelCamposFincontableSubCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontableSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocontratoSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Contrato"));
		this.jPanelCamposIniciocontratoSubCliente.setName("jPanelCamposFincontratoSubCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontratoSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSubCliente.setText("Nuevo");
		this.jButtonModificarSubCliente.setText("Editar");
        this.jButtonActualizarSubCliente.setText("Actualizar");
        this.jButtonEliminarSubCliente.setText("Eliminar");
        this.jButtonCancelarSubCliente.setText("Cancelar");
        this.jButtonGuardarCambiosSubCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaSubCliente.setText("Guardar");
		this.jButtonCerrarSubCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSubCliente,"nuevo_button","Nuevo",this.subclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSubCliente,"modificar_button","Editar",this.subclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSubCliente,"actualizar_button","Actualizar",this.subclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSubCliente,"eliminar_button","Eliminar",this.subclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSubCliente,"cancelar_button","Cancelar",this.subclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSubCliente,"guardarcambios_button","Guardar",this.subclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSubCliente,"guardarcambiostabla_button","Guardar",this.subclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSubCliente,"cerrar_button","Salir",this.subclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSubCliente.setToolTipText("Nuevo"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSubCliente.setToolTipText("Editar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSubCliente.setToolTipText("Actualizar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSubCliente.setToolTipText("Eliminar)"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSubCliente.setToolTipText("Cancelar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSubCliente.setToolTipText("Guardar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSubCliente.setToolTipText("Guardar"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSubCliente.setToolTipText("Salir"+" "+SubClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoSubCliente";
		inputMap = this.jButtonNuevoSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSubCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSubCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSubCliente";
		inputMap = this.jButtonActualizarSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSubCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSubCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarSubCliente";
		inputMap = this.jButtonEliminarSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSubCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSubCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarSubCliente";
		inputMap = this.jButtonCancelarSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSubCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSubCliente"));
		
		//CERRAR		
		sMapKey = "CerrarSubCliente";
		inputMap = this.jButtonCerrarSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSubCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSubCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSubCliente";
		inputMap = this.jButtonGuardarCambiosTablaSubCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSubCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSubCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSubCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSubCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSubCliente.setToolTipText("Nuevo SubCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSubCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSubCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSubCliente.setToolTipText("Sin Cerrar Ventana SubCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSubCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSubCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSubCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSubCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSubCliente.setText("Accion");
		this.jComboBoxTiposAccionesSubCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSubCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSubCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSubCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSubCliente = new JLabelMe();
		
		this.jLabelAccionesSubCliente.setText("Acciones");		
		this.jLabelAccionesSubCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSubCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSubCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSubCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesSubCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSubCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSubCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSubCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSubCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSubCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSubCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSubCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSubCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSubCliente = new GridBagLayout();
		
		this.jPanelCamposSubCliente.setLayout(gridaBagLayoutCamposSubCliente);
		this.jPanelCamposOcultosSubCliente.setLayout(gridaBagLayoutCamposOcultosSubCliente);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralSubCliente= new GridBagLayout();
		this.jPanelCamposIniciogeneralSubCliente.setLayout(gridaBagLayoutCamposIniciogeneralSubCliente);

		GridBagLayout gridaBagLayoutCamposInicioubicacionSubCliente= new GridBagLayout();
		this.jPanelCamposInicioubicacionSubCliente.setLayout(gridaBagLayoutCamposInicioubicacionSubCliente);

		GridBagLayout gridaBagLayoutCamposIniciopersonalSubCliente= new GridBagLayout();
		this.jPanelCamposIniciopersonalSubCliente.setLayout(gridaBagLayoutCamposIniciopersonalSubCliente);

		GridBagLayout gridaBagLayoutCamposIniciocontableSubCliente= new GridBagLayout();
		this.jPanelCamposIniciocontableSubCliente.setLayout(gridaBagLayoutCamposIniciocontableSubCliente);

		GridBagLayout gridaBagLayoutCamposIniciocontratoSubCliente= new GridBagLayout();
		this.jPanelCamposIniciocontratoSubCliente.setLayout(gridaBagLayoutCamposIniciocontratoSubCliente);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSubCliente.add(jLabelIdSubCliente, this.gridBagConstraintsSubCliente);



	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSubCliente.add(jLabelidSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSubCliente.add(jLabelid_empresaSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSubCliente.add(jButtonid_empresaSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 3;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSubCliente.add(jButtonid_empresaSubClienteUpdate, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSubCliente.add(jComboBoxid_empresaSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteSubCliente.add(jLabelid_clienteSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 2;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteSubCliente.add(jButtonid_clienteSubCliente, this.gridBagConstraintsSubCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 3;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteSubCliente.add(jButtonid_clienteSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 4;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteSubCliente.add(jButtonid_clienteSubClienteUpdate, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteSubCliente.add(jComboBoxid_clienteSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalSubCliente.add(jLabelid_sucursalSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSubCliente.add(jButtonid_sucursalSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 3;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSubCliente.add(jButtonid_sucursalSubClienteUpdate, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalSubCliente.add(jComboBoxid_sucursalSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_identificacionSubCliente.add(jLabelid_tipo_identificacionSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_identificacionSubCliente.add(jButtonid_tipo_identificacionSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 3;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_identificacionSubCliente.add(jButtonid_tipo_identificacionSubClienteUpdate, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_identificacionSubCliente.add(jComboBoxid_tipo_identificacionSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidentificacionSubCliente.add(jLabelidentificacionSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelidentificacionSubCliente.add(jButtonidentificacionSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidentificacionSubCliente.add(jTextFieldidentificacionSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucSubCliente.add(jLabelrucSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucSubCliente.add(jButtonrucSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucSubCliente.add(jTextFieldrucSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreSubCliente.add(jLabelnombreSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreSubCliente.add(jButtonnombreSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreSubCliente.add(jscrollPanenombreSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidoSubCliente.add(jLabelapellidoSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidoSubCliente.add(jButtonapellidoSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidoSubCliente.add(jscrollPaneapellidoSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoSubCliente.add(jLabelnombre_completoSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoSubCliente.add(jButtonnombre_completoSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoSubCliente.add(jscrollPanenombre_completoSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionSubCliente.add(jLabeldireccionSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionSubCliente.add(jButtondireccionSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionSubCliente.add(jscrollPanedireccionSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoSubCliente.add(jLabeltelefonoSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoSubCliente.add(jButtontelefonoSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoSubCliente.add(jscrollPanetelefonoSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_celularSubCliente.add(jLabelnumero_celularSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_celularSubCliente.add(jButtonnumero_celularSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_celularSubCliente.add(jscrollPanenumero_celularSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmailSubCliente.add(jLabelmailSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelmailSubCliente.add(jButtonmailSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmailSubCliente.add(jscrollPanemailSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_nacimientoSubCliente.add(jLabelfecha_nacimientoSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_nacimientoSubCliente.add(jButtonfecha_nacimientoSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_nacimientoSubCliente.add(jDateChooserfecha_nacimientoSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaoSubCliente.add(jLabelfechaoSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaoSubCliente.add(jButtonfechaoSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaoSubCliente.add(jDateChooserfechaoSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionSubCliente.add(jLabelobservacionSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionSubCliente.add(jButtonobservacionSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionSubCliente.add(jscrollPaneobservacionSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisSubCliente.add(jLabelid_paisSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisSubCliente.add(jButtonid_paisSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 3;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisSubCliente.add(jButtonid_paisSubClienteUpdate, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisSubCliente.add(jComboBoxid_paisSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadSubCliente.add(jLabelid_ciudadSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadSubCliente.add(jButtonid_ciudadSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 3;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadSubCliente.add(jButtonid_ciudadSubClienteUpdate, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadSubCliente.add(jComboBoxid_ciudadSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_zonaSubCliente.add(jLabelid_zonaSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaSubCliente.add(jButtonid_zonaSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 3;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaSubCliente.add(jButtonid_zonaSubClienteUpdate, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_zonaSubCliente.add(jComboBoxid_zonaSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_pais_nacionalidadSubCliente.add(jLabelid_pais_nacionalidadSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pais_nacionalidadSubCliente.add(jButtonid_pais_nacionalidadSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 3;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pais_nacionalidadSubCliente.add(jButtonid_pais_nacionalidadSubClienteUpdate, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_pais_nacionalidadSubCliente.add(jComboBoxid_pais_nacionalidadSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_generoSubCliente.add(jLabelid_tipo_generoSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_generoSubCliente.add(jButtonid_tipo_generoSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 3;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_generoSubCliente.add(jButtonid_tipo_generoSubClienteUpdate, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_generoSubCliente.add(jComboBoxid_tipo_generoSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_civilSubCliente.add(jLabelid_estado_civilSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_civilSubCliente.add(jButtonid_estado_civilSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 3;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_civilSubCliente.add(jButtonid_estado_civilSubClienteUpdate, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_civilSubCliente.add(jComboBoxid_estado_civilSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_legalSubCliente.add(jLabelid_estado_legalSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_legalSubCliente.add(jButtonid_estado_legalSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 3;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_legalSubCliente.add(jButtonid_estado_legalSubClienteUpdate, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_legalSubCliente.add(jComboBoxid_estado_legalSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_nivel_eduSubCliente.add(jLabelid_tipo_nivel_eduSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_nivel_eduSubCliente.add(jButtonid_tipo_nivel_eduSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 3;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_nivel_eduSubCliente.add(jButtonid_tipo_nivel_eduSubClienteUpdate, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_nivel_eduSubCliente.add(jComboBoxid_tipo_nivel_eduSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpath_imagen_firmaSubCliente.add(jLabelpath_imagen_firmaSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelpath_imagen_firmaSubCliente.add(jButtonpath_imagen_firmaSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpath_imagen_firmaSubCliente.add(jscrollPanepath_imagen_firmaSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableSubCliente.add(jLabelid_cuenta_contableSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 2;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableSubCliente.add(jButtonid_cuenta_contableSubCliente, this.gridBagConstraintsSubCliente);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 3;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableSubCliente.add(jButtonid_cuenta_contableSubClienteArbol, this.gridBagConstraintsSubCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 4;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableSubCliente.add(jButtonid_cuenta_contableSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 5;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableSubCliente.add(jButtonid_cuenta_contableSubClienteUpdate, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableSubCliente.add(jComboBoxid_cuenta_contableSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cargaSubCliente.add(jLabelnumero_cargaSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cargaSubCliente.add(jButtonnumero_cargaSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cargaSubCliente.add(jTextFieldnumero_cargaSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellimite_creditoSubCliente.add(jLabellimite_creditoSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanellimite_creditoSubCliente.add(jButtonlimite_creditoSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellimite_creditoSubCliente.add(jTextFieldlimite_creditoSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoSubCliente.add(jLabeldescuentoSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoSubCliente.add(jButtondescuentoSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoSubCliente.add(jTextFielddescuentoSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_contratoSubCliente.add(jLabelcodigo_contratoSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_contratoSubCliente.add(jButtoncodigo_contratoSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_contratoSubCliente.add(jTextFieldcodigo_contratoSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_contratoSubCliente.add(jLabelvalor_contratoSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_contratoSubCliente.add(jButtonvalor_contratoSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_contratoSubCliente.add(jTextFieldvalor_contratoSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioSubCliente.add(jLabelfecha_inicioSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioSubCliente.add(jButtonfecha_inicioSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioSubCliente.add(jDateChooserfecha_inicioSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finSubCliente.add(jLabelfecha_finSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finSubCliente.add(jButtonfecha_finSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finSubCliente.add(jDateChooserfecha_finSubCliente, this.gridBagConstraintsSubCliente);


	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 0;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelplazoSubCliente.add(jLabelplazoSubCliente, this.gridBagConstraintsSubCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		//this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = 2;
		this.gridBagConstraintsSubCliente.ipadx = 0;
		this.gridBagConstraintsSubCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelplazoSubCliente.add(jButtonplazoSubClienteBusqueda, this.gridBagConstraintsSubCliente);
	}

	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSubCliente.gridy = 0;
	this.gridBagConstraintsSubCliente.gridx = 1;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelplazoSubCliente.add(jTextFieldplazoSubCliente, this.gridBagConstraintsSubCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposOcultosSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposOcultosSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSubCliente.add(this.jPanelid_empresaSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposOcultosSubCliente % 2==0) {
		iXPanelCamposOcultosSubCliente=0;
		iYPanelCamposOcultosSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposOcultosSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposOcultosSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSubCliente.add(this.jPanelid_sucursalSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposOcultosSubCliente % 2==0) {
		iXPanelCamposOcultosSubCliente=0;
		iYPanelCamposOcultosSubCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciogeneralSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciogeneralSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSubCliente.add(this.jPanelidSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciogeneralSubCliente % 2==0) {
		iXPanelCamposIniciogeneralSubCliente=0;
		iYPanelCamposIniciogeneralSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciogeneralSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciogeneralSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSubCliente.add(this.jPanelid_clienteSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciogeneralSubCliente % 2==0) {
		iXPanelCamposIniciogeneralSubCliente=0;
		iYPanelCamposIniciogeneralSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciogeneralSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciogeneralSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSubCliente.add(this.jPanelid_tipo_identificacionSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciogeneralSubCliente % 2==0) {
		iXPanelCamposIniciogeneralSubCliente=0;
		iYPanelCamposIniciogeneralSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciogeneralSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciogeneralSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSubCliente.add(this.jPanelidentificacionSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciogeneralSubCliente % 2==0) {
		iXPanelCamposIniciogeneralSubCliente=0;
		iYPanelCamposIniciogeneralSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciogeneralSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciogeneralSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSubCliente.add(this.jPanelrucSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciogeneralSubCliente % 2==0) {
		iXPanelCamposIniciogeneralSubCliente=0;
		iYPanelCamposIniciogeneralSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciogeneralSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciogeneralSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSubCliente.add(this.jPanelnombreSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciogeneralSubCliente % 2==0) {
		iXPanelCamposIniciogeneralSubCliente=0;
		iYPanelCamposIniciogeneralSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciogeneralSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciogeneralSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSubCliente.add(this.jPanelapellidoSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciogeneralSubCliente % 2==0) {
		iXPanelCamposIniciogeneralSubCliente=0;
		iYPanelCamposIniciogeneralSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciogeneralSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciogeneralSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSubCliente.add(this.jPanelnombre_completoSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciogeneralSubCliente % 2==0) {
		iXPanelCamposIniciogeneralSubCliente=0;
		iYPanelCamposIniciogeneralSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciogeneralSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciogeneralSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSubCliente.add(this.jPaneldireccionSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciogeneralSubCliente % 2==0) {
		iXPanelCamposIniciogeneralSubCliente=0;
		iYPanelCamposIniciogeneralSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciogeneralSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciogeneralSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSubCliente.add(this.jPaneltelefonoSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciogeneralSubCliente % 2==0) {
		iXPanelCamposIniciogeneralSubCliente=0;
		iYPanelCamposIniciogeneralSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciogeneralSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciogeneralSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSubCliente.add(this.jPanelnumero_celularSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciogeneralSubCliente % 2==0) {
		iXPanelCamposIniciogeneralSubCliente=0;
		iYPanelCamposIniciogeneralSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciogeneralSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciogeneralSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSubCliente.add(this.jPanelmailSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciogeneralSubCliente % 2==0) {
		iXPanelCamposIniciogeneralSubCliente=0;
		iYPanelCamposIniciogeneralSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciogeneralSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciogeneralSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSubCliente.add(this.jPanelfecha_nacimientoSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciogeneralSubCliente % 2==0) {
		iXPanelCamposIniciogeneralSubCliente=0;
		iYPanelCamposIniciogeneralSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciogeneralSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciogeneralSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSubCliente.add(this.jPanelfechaoSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciogeneralSubCliente % 2==0) {
		iXPanelCamposIniciogeneralSubCliente=0;
		iYPanelCamposIniciogeneralSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciogeneralSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciogeneralSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralSubCliente.add(this.jPanelobservacionSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciogeneralSubCliente % 2==0) {
		iXPanelCamposIniciogeneralSubCliente=0;
		iYPanelCamposIniciogeneralSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposInicioubicacionSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposInicioubicacionSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioubicacionSubCliente.add(this.jPanelid_paisSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposInicioubicacionSubCliente % 2==0) {
		iXPanelCamposInicioubicacionSubCliente=0;
		iYPanelCamposInicioubicacionSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposInicioubicacionSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposInicioubicacionSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioubicacionSubCliente.add(this.jPanelid_ciudadSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposInicioubicacionSubCliente % 2==0) {
		iXPanelCamposInicioubicacionSubCliente=0;
		iYPanelCamposInicioubicacionSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposInicioubicacionSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposInicioubicacionSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioubicacionSubCliente.add(this.jPanelid_zonaSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposInicioubicacionSubCliente % 2==0) {
		iXPanelCamposInicioubicacionSubCliente=0;
		iYPanelCamposInicioubicacionSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposInicioubicacionSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposInicioubicacionSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioubicacionSubCliente.add(this.jPanelid_pais_nacionalidadSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposInicioubicacionSubCliente % 2==0) {
		iXPanelCamposInicioubicacionSubCliente=0;
		iYPanelCamposInicioubicacionSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciopersonalSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciopersonalSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopersonalSubCliente.add(this.jPanelid_tipo_generoSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciopersonalSubCliente % 2==0) {
		iXPanelCamposIniciopersonalSubCliente=0;
		iYPanelCamposIniciopersonalSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciopersonalSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciopersonalSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopersonalSubCliente.add(this.jPanelid_estado_civilSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciopersonalSubCliente % 2==0) {
		iXPanelCamposIniciopersonalSubCliente=0;
		iYPanelCamposIniciopersonalSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciopersonalSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciopersonalSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopersonalSubCliente.add(this.jPanelid_estado_legalSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciopersonalSubCliente % 2==0) {
		iXPanelCamposIniciopersonalSubCliente=0;
		iYPanelCamposIniciopersonalSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciopersonalSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciopersonalSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopersonalSubCliente.add(this.jPanelid_tipo_nivel_eduSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciopersonalSubCliente % 2==0) {
		iXPanelCamposIniciopersonalSubCliente=0;
		iYPanelCamposIniciopersonalSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciopersonalSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciopersonalSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopersonalSubCliente.add(this.jPanelpath_imagen_firmaSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciopersonalSubCliente % 2==0) {
		iXPanelCamposIniciopersonalSubCliente=0;
		iYPanelCamposIniciopersonalSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciocontableSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciocontableSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableSubCliente.add(this.jPanelid_cuenta_contableSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciocontableSubCliente % 2==0) {
		iXPanelCamposIniciocontableSubCliente=0;
		iYPanelCamposIniciocontableSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciocontableSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciocontableSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableSubCliente.add(this.jPanelnumero_cargaSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciocontableSubCliente % 2==0) {
		iXPanelCamposIniciocontableSubCliente=0;
		iYPanelCamposIniciocontableSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciocontableSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciocontableSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableSubCliente.add(this.jPanellimite_creditoSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciocontableSubCliente % 2==0) {
		iXPanelCamposIniciocontableSubCliente=0;
		iYPanelCamposIniciocontableSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciocontableSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciocontableSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableSubCliente.add(this.jPaneldescuentoSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciocontableSubCliente % 2==0) {
		iXPanelCamposIniciocontableSubCliente=0;
		iYPanelCamposIniciocontableSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciocontratoSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciocontratoSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontratoSubCliente.add(this.jPanelcodigo_contratoSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciocontratoSubCliente % 2==0) {
		iXPanelCamposIniciocontratoSubCliente=0;
		iYPanelCamposIniciocontratoSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciocontratoSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciocontratoSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontratoSubCliente.add(this.jPanelvalor_contratoSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciocontratoSubCliente % 2==0) {
		iXPanelCamposIniciocontratoSubCliente=0;
		iYPanelCamposIniciocontratoSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciocontratoSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciocontratoSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontratoSubCliente.add(this.jPanelfecha_inicioSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciocontratoSubCliente % 2==0) {
		iXPanelCamposIniciocontratoSubCliente=0;
		iYPanelCamposIniciocontratoSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciocontratoSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciocontratoSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontratoSubCliente.add(this.jPanelfecha_finSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciocontratoSubCliente % 2==0) {
		iXPanelCamposIniciocontratoSubCliente=0;
		iYPanelCamposIniciocontratoSubCliente++;
	}
	this.gridBagConstraintsSubCliente = new GridBagConstraints();
	this.gridBagConstraintsSubCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSubCliente.gridy = iYPanelCamposIniciocontratoSubCliente;
	this.gridBagConstraintsSubCliente.gridx = iXPanelCamposIniciocontratoSubCliente++;
	this.gridBagConstraintsSubCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSubCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontratoSubCliente.add(this.jPanelplazoSubCliente, this.gridBagConstraintsSubCliente);



	if(iXPanelCamposIniciocontratoSubCliente % 2==0) {
		iXPanelCamposIniciocontratoSubCliente=0;
		iYPanelCamposIniciocontratoSubCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSubCliente= new GridBagLayout();
		this.jPanelAccionesSubCliente.setLayout(gridaBagLayoutAccionesSubCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSubCliente= new GridBagLayout();
		this.jPanelAccionesFormularioSubCliente.setLayout(gridaBagLayoutAccionesFormularioSubCliente);
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSubCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSubCliente.add(this.jComboBoxTiposAccionesFormularioSubCliente, this.gridBagConstraintsSubCliente);

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSubCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSubCliente.add(this.jCheckBoxPostAccionNuevoSubCliente, this.gridBagConstraintsSubCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.subclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSubCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSubCliente.add(this.jCheckBoxPostAccionSinCerrarSubCliente, this.gridBagConstraintsSubCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.subclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.subclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSubCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSubCliente.add(this.jCheckBoxPostAccionSinMensajeSubCliente, this.gridBagConstraintsSubCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesSubCliente.add(this.jButtonModificarSubCliente, this.gridBagConstraintsSubCliente);							

		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubCliente.gridy = 0;
		this.gridBagConstraintsSubCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesSubCliente.add(this.jButtonEliminarSubCliente, this.gridBagConstraintsSubCliente);
		
			
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy = 0;		
		this.gridBagConstraintsSubCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesSubCliente.add(this.jButtonActualizarSubCliente, this.gridBagConstraintsSubCliente);


		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy = 0;		
		this.gridBagConstraintsSubCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesSubCliente.add(this.jButtonGuardarCambiosSubCliente, this.gridBagConstraintsSubCliente);	
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy = 0;		
		this.gridBagConstraintsSubCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesSubCliente.add(this.jButtonCancelarSubCliente, this.gridBagConstraintsSubCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSubCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSubCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.subclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSubCliente = new GridBagConstraints();						
			this.gridBagConstraintsSubCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSubCliente.gridx = 0;		
			//this.gridBagConstraintsSubCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSubCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSubCliente.gridx =0;
		this.gridBagConstraintsSubCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSubCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSubCliente, this.gridBagConstraintsSubCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SubClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSubCliente = new SubClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Sub Cliente DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Sub Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sub Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SubClienteModel subclienteModel=new SubClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//SubClienteModel.SubClienteFocusTraversalPolicy subclienteFocusTraversalPolicy = subclienteModel.new SubClienteFocusTraversalPolicy(this);
			
			//subclienteFocusTraversalPolicy.setsubclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(subclienteModel);
			
			
			this.jContentPaneDetalleSubCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSubCliente = new GridBagLayout();	
			this.jContentPaneDetalleSubCliente.setLayout(gridaBagLayoutDetalleSubCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSubCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSubCliente = new GridBagConstraints();
				this.gridBagConstraintsSubCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSubCliente.gridx = 0;
					
				
				this.jContentPaneDetalleSubCliente.add(jTtoolBarDetalleSubCliente, gridBagConstraintsSubCliente);								
				
}
			
			this.jScrollPanelDatosEdicionSubCliente=   new JScrollPane(jContentPaneDetalleSubCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSubCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSubCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSubCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposSubCliente.add("General",this.jPanelCamposIniciogeneralSubCliente);
		this.jTabbedPaneCamposSubCliente.add("Ubicacion",this.jPanelCamposInicioubicacionSubCliente);
		this.jTabbedPaneCamposSubCliente.add("Personal",this.jPanelCamposIniciopersonalSubCliente);
		this.jTabbedPaneCamposSubCliente.add("Contable",this.jPanelCamposIniciocontableSubCliente);
		this.jTabbedPaneCamposSubCliente.add("Contrato",this.jPanelCamposIniciocontratoSubCliente);
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
						
			this.gridBagConstraintsSubCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSubCliente.gridx = 0;
	        
			this.jContentPaneDetalleSubCliente.add(jTabbedPaneCamposSubCliente, gridBagConstraintsSubCliente);
			
			
			//if(!this.conCargarMinimo) {
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& subclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameConsignacion(this.puedeCargarPorParteConsignacion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFactura(this.puedeCargarPorParteFactura,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGuiaRemision(this.puedeCargarPorParteGuiaRemision,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedido(this.puedeCargarPorPartePedido,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoExpor(this.puedeCargarPorPartePedidoExpor,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProforma(this.puedeCargarPorParteProforma,false,-1);
					
					if(this.subclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSubCliente= new GridBagConstraints();
						this.gridBagConstraintsSubCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSubCliente.gridx = 0;
						this.jContentPaneDetalleSubCliente.add(this.jTabbedPaneRelacionesSubCliente, this.gridBagConstraintsSubCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSubCliente.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameConsignacion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFactura(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGuiaRemision(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedido(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoExpor(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProforma(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSubCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSubCliente = new GridBagConstraints();
					this.gridBagConstraintsSubCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSubCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSubCliente.gridx = 0;
					
				
					this.jContentPaneDetalleSubCliente.add(jPanelCamposOcultosSubCliente, gridBagConstraintsSubCliente);
				
					this.jPanelCamposOcultosSubCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.gridy = iGridyRelaciones++;//19;		
	        this.gridBagConstraintsSubCliente.gridx = 0;
	        this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSubCliente.add(this.jPanelAccionesFormularioSubCliente, this.gridBagConstraintsSubCliente);							
			
			
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
	        this.gridBagConstraintsSubCliente.gridy = iGridyRelaciones;//19;		
	        this.gridBagConstraintsSubCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleSubCliente.add(this.jPanelAccionesSubCliente, this.gridBagConstraintsSubCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSubCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSubCliente=   new JScrollPane(this.jPanelCamposSubCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSubCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSubCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSubCliente.gridx = 0;
			this.gridBagConstraintsSubCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSubCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSubCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSubCliente, this.gridBagConstraintsSubCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSubCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSubCliente, this.gridBagConstraintsSubCliente);			
			
			this.gridBagConstraintsSubCliente = new GridBagConstraints();
			this.gridBagConstraintsSubCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSubCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSubCliente, this.gridBagConstraintsSubCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSubCliente, this.gridBagConstraintsSubCliente);
			
			
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSubCliente, this.gridBagConstraintsSubCliente);
		
			
		this.gridBagConstraintsSubCliente = new GridBagConstraints();
		this.gridBagConstraintsSubCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSubCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSubCliente, this.gridBagConstraintsSubCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSubCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionSubCliente;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameConsignacion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.consignacionSessionBean=new ConsignacionSessionBean();
		this.consignacionSessionBean.setConGuardarRelaciones(true);
		this.consignacionSessionBean.setEsGuardarRelacionado(true);

		this.consignacionBeanSwingJInternalFrame=null;//new ConsignacionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.consignacionBeanSwingJInternalFramePopup=new ConsignacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.consignacionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.consignacionSessionBean.getEsGuardarRelacionado()) {

				ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL=SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.consignacionSessionBean.setEsGuardarRelacionado(true);

				this.consignacionBeanSwingJInternalFrame=new ConsignacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.consignacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.consignacionBeanSwingJInternalFrame.setconsignacionSessionBean(this.consignacionSessionBean);

				//this.gridBagConstraintsSubCliente = new GridBagConstraints();
				//this.gridBagConstraintsSubCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSubCliente.gridx = 0;
				//this.jContentPaneDetalleSubCliente.add(this.consignacionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSubCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSubCliente.add("Consignacions",this.consignacionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSubCliente.setComponentAt(iIndexTab,this.consignacionBeanSwingJInternalFrame.getContentPane());
				}

				//ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.consignacionSessionBean.setEsGuardarRelacionado(false);
				this.consignacionBeanSwingJInternalFrame=null;//new ConsignacionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.consignacionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteConsignacion) {
					this.jTabbedPaneRelacionesSubCliente.add("Consignacions",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFactura(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.facturaSessionBean=new FacturaSessionBean();
		this.facturaSessionBean.setConGuardarRelaciones(true);
		this.facturaSessionBean.setEsGuardarRelacionado(true);

		this.facturaBeanSwingJInternalFrame=null;//new FacturaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.facturaBeanSwingJInternalFramePopup=new FacturaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.facturaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.facturaSessionBean.getEsGuardarRelacionado()) {

				FacturaJInternalFrame.STIPO_TAMANIO_GENERAL=SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				FacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.facturaSessionBean.setEsGuardarRelacionado(true);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.facturaBeanSwingJInternalFrame.setfacturaSessionBean(this.facturaSessionBean);

				//this.gridBagConstraintsSubCliente = new GridBagConstraints();
				//this.gridBagConstraintsSubCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSubCliente.gridx = 0;
				//this.jContentPaneDetalleSubCliente.add(this.facturaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSubCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSubCliente.add("Facturas",this.facturaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSubCliente.setComponentAt(iIndexTab,this.facturaBeanSwingJInternalFrame.getContentPane());
				}

				//FacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.facturaSessionBean.setEsGuardarRelacionado(false);
				this.facturaBeanSwingJInternalFrame=null;//new FacturaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.facturaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFactura) {
					this.jTabbedPaneRelacionesSubCliente.add("Facturas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameGuiaRemision(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.guiaremisionSessionBean=new GuiaRemisionSessionBean();
		this.guiaremisionSessionBean.setConGuardarRelaciones(true);
		this.guiaremisionSessionBean.setEsGuardarRelacionado(true);

		this.guiaremisionBeanSwingJInternalFrame=null;//new GuiaRemisionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.guiaremisionBeanSwingJInternalFramePopup=new GuiaRemisionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.guiaremisionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.guiaremisionSessionBean.getEsGuardarRelacionado()) {

				GuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL=SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				GuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.guiaremisionSessionBean.setEsGuardarRelacionado(true);

				this.guiaremisionBeanSwingJInternalFrame=new GuiaRemisionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.guiaremisionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.guiaremisionBeanSwingJInternalFrame.setguiaremisionSessionBean(this.guiaremisionSessionBean);

				//this.gridBagConstraintsSubCliente = new GridBagConstraints();
				//this.gridBagConstraintsSubCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSubCliente.gridx = 0;
				//this.jContentPaneDetalleSubCliente.add(this.guiaremisionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSubCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSubCliente.add("Guia Remisiones",this.guiaremisionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSubCliente.setComponentAt(iIndexTab,this.guiaremisionBeanSwingJInternalFrame.getContentPane());
				}

				//GuiaRemisionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.guiaremisionSessionBean.setEsGuardarRelacionado(false);
				this.guiaremisionBeanSwingJInternalFrame=null;//new GuiaRemisionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.guiaremisionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteGuiaRemision) {
					this.jTabbedPaneRelacionesSubCliente.add("Guia Remisiones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePedido(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidoSessionBean=new PedidoSessionBean();
		this.pedidoSessionBean.setConGuardarRelaciones(true);
		this.pedidoSessionBean.setEsGuardarRelacionado(true);

		this.pedidoBeanSwingJInternalFrame=null;//new PedidoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidoBeanSwingJInternalFramePopup=new PedidoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidoSessionBean.getEsGuardarRelacionado()) {

				PedidoJInternalFrame.STIPO_TAMANIO_GENERAL=SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidoSessionBean.setEsGuardarRelacionado(true);

				this.pedidoBeanSwingJInternalFrame=new PedidoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidoBeanSwingJInternalFrame.setpedidoSessionBean(this.pedidoSessionBean);

				//this.gridBagConstraintsSubCliente = new GridBagConstraints();
				//this.gridBagConstraintsSubCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSubCliente.gridx = 0;
				//this.jContentPaneDetalleSubCliente.add(this.pedidoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSubCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSubCliente.add("Pedidos",this.pedidoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSubCliente.setComponentAt(iIndexTab,this.pedidoBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidoSessionBean.setEsGuardarRelacionado(false);
				this.pedidoBeanSwingJInternalFrame=null;//new PedidoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedido) {
					this.jTabbedPaneRelacionesSubCliente.add("Pedidos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePedidoExpor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidoexporSessionBean=new PedidoExporSessionBean();
		this.pedidoexporSessionBean.setConGuardarRelaciones(true);
		this.pedidoexporSessionBean.setEsGuardarRelacionado(true);

		this.pedidoexporBeanSwingJInternalFrame=null;//new PedidoExporBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidoexporBeanSwingJInternalFramePopup=new PedidoExporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidoexporBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidoexporSessionBean.getEsGuardarRelacionado()) {

				PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL=SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidoexporSessionBean.setEsGuardarRelacionado(true);

				this.pedidoexporBeanSwingJInternalFrame=new PedidoExporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidoexporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidoexporBeanSwingJInternalFrame.setpedidoexporSessionBean(this.pedidoexporSessionBean);

				//this.gridBagConstraintsSubCliente = new GridBagConstraints();
				//this.gridBagConstraintsSubCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSubCliente.gridx = 0;
				//this.jContentPaneDetalleSubCliente.add(this.pedidoexporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSubCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSubCliente.add("Pedido Exportacions",this.pedidoexporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSubCliente.setComponentAt(iIndexTab,this.pedidoexporBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidoexporSessionBean.setEsGuardarRelacionado(false);
				this.pedidoexporBeanSwingJInternalFrame=null;//new PedidoExporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidoexporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoExpor) {
					this.jTabbedPaneRelacionesSubCliente.add("Pedido Exportacions",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProforma(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.proformaSessionBean=new ProformaSessionBean();
		this.proformaSessionBean.setConGuardarRelaciones(true);
		this.proformaSessionBean.setEsGuardarRelacionado(true);

		this.proformaBeanSwingJInternalFrame=null;//new ProformaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.proformaBeanSwingJInternalFramePopup=new ProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.proformaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.proformaSessionBean.getEsGuardarRelacionado()) {

				ProformaJInternalFrame.STIPO_TAMANIO_GENERAL=SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.proformaSessionBean.setEsGuardarRelacionado(true);

				this.proformaBeanSwingJInternalFrame=new ProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.proformaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.proformaBeanSwingJInternalFrame.setproformaSessionBean(this.proformaSessionBean);

				//this.gridBagConstraintsSubCliente = new GridBagConstraints();
				//this.gridBagConstraintsSubCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsSubCliente.gridx = 0;
				//this.jContentPaneDetalleSubCliente.add(this.proformaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsSubCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesSubCliente.add("Proformas",this.proformaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesSubCliente.setComponentAt(iIndexTab,this.proformaBeanSwingJInternalFrame.getContentPane());
				}

				//ProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.proformaSessionBean.setEsGuardarRelacionado(false);
				this.proformaBeanSwingJInternalFrame=null;//new ProformaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.proformaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProforma) {
					this.jTabbedPaneRelacionesSubCliente.add("Proformas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFacturaBeanSwingJInternalFrame(List<SubCliente> subclientes,SubCliente subcliente,FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.subclienteLogic.getConnexion());

					facturaBeanSwingJInternalFrame.setsubclientesForeignKey(subclientes);
					facturaBeanSwingJInternalFrame.setsubclienteForeignKey(subcliente);
					facturaBeanSwingJInternalFrame.facturaSessionBean.setisBusquedaDesdeForeignKeySesionSubCliente(true);
					facturaBeanSwingJInternalFrame.facturaSessionBean.setlidSubClienteActual(subcliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					facturaBeanSwingJInternalFrame.cargarCombosForeignKeyFactura(facturaBeanSwingJInternalFrame.isCargarCombosDependencia);
					facturaBeanSwingJInternalFrame.setVisibilidadBusquedasParaSubCliente(true);
					facturaBeanSwingJInternalFrame.setid_sub_clienteFK_IdSubCliente(subcliente.getId());

					if(!this.conCargarFormDetalle) {
						facturaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					facturaBeanSwingJInternalFrame.setSelectedItemCombosFrameSubClienteForeignKey(subcliente,1,false,true,true);
					facturaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					facturaBeanSwingJInternalFrame.procesarBusqueda("FK_IdSubCliente");
					facturaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSubCliente");
					facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura(true);
					facturaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFactura("n",facturaBeanSwingJInternalFrame.isGuardarCambiosEnLote, facturaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					facturaBeanSwingJInternalFrame.setAutoscrolls(true);
					facturaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						facturaBeanSwingJInternalFrame.actualizarEstadoPanelsFactura("relacionado");
					} else {
						facturaBeanSwingJInternalFrame.actualizarEstadoPanelsFactura("no_relacionado");
					}

					facturaBeanSwingJInternalFrame.getjButtonRecargarInformacionFactura().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarConsignacionBeanSwingJInternalFrame(List<SubCliente> subclientes,SubCliente subcliente,ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//consignacionBeanSwingJInternalFrame=new ConsignacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					consignacionBeanSwingJInternalFrame.getConsignacionLogic().setConnexion(this.subclienteLogic.getConnexion());

					consignacionBeanSwingJInternalFrame.setsubclientesForeignKey(subclientes);
					consignacionBeanSwingJInternalFrame.setsubclienteForeignKey(subcliente);
					consignacionBeanSwingJInternalFrame.consignacionSessionBean.setisBusquedaDesdeForeignKeySesionSubCliente(true);
					consignacionBeanSwingJInternalFrame.consignacionSessionBean.setlidSubClienteActual(subcliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					consignacionBeanSwingJInternalFrame.cargarCombosForeignKeyConsignacion(consignacionBeanSwingJInternalFrame.isCargarCombosDependencia);
					consignacionBeanSwingJInternalFrame.setVisibilidadBusquedasParaSubCliente(true);
					consignacionBeanSwingJInternalFrame.setid_sub_clienteFK_IdSubCliente(subcliente.getId());

					if(!this.conCargarFormDetalle) {
						consignacionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					consignacionBeanSwingJInternalFrame.setSelectedItemCombosFrameSubClienteForeignKey(subcliente,1,false,true,true);
					consignacionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					consignacionBeanSwingJInternalFrame.procesarBusqueda("FK_IdSubCliente");
					consignacionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSubCliente");
					consignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaConsignacion(true);
					consignacionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesConsignacion("n",consignacionBeanSwingJInternalFrame.isGuardarCambiosEnLote, consignacionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					consignacionBeanSwingJInternalFrame.setAutoscrolls(true);
					consignacionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						consignacionBeanSwingJInternalFrame.actualizarEstadoPanelsConsignacion("relacionado");
					} else {
						consignacionBeanSwingJInternalFrame.actualizarEstadoPanelsConsignacion("no_relacionado");
					}

					consignacionBeanSwingJInternalFrame.getjButtonRecargarInformacionConsignacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarGuiaRemisionBeanSwingJInternalFrame(List<SubCliente> subclientes,SubCliente subcliente,GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//guiaremisionBeanSwingJInternalFrame=new GuiaRemisionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					guiaremisionBeanSwingJInternalFrame.getGuiaRemisionLogic().setConnexion(this.subclienteLogic.getConnexion());

					guiaremisionBeanSwingJInternalFrame.setsubclientesForeignKey(subclientes);
					guiaremisionBeanSwingJInternalFrame.setsubclienteForeignKey(subcliente);
					guiaremisionBeanSwingJInternalFrame.guiaremisionSessionBean.setisBusquedaDesdeForeignKeySesionSubCliente(true);
					guiaremisionBeanSwingJInternalFrame.guiaremisionSessionBean.setlidSubClienteActual(subcliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					guiaremisionBeanSwingJInternalFrame.cargarCombosForeignKeyGuiaRemision(guiaremisionBeanSwingJInternalFrame.isCargarCombosDependencia);
					guiaremisionBeanSwingJInternalFrame.setVisibilidadBusquedasParaSubCliente(true);
					guiaremisionBeanSwingJInternalFrame.setid_sub_clienteFK_IdSubCliente(subcliente.getId());

					if(!this.conCargarFormDetalle) {
						guiaremisionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					guiaremisionBeanSwingJInternalFrame.setSelectedItemCombosFrameSubClienteForeignKey(subcliente,1,false,true,true);
					guiaremisionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					guiaremisionBeanSwingJInternalFrame.procesarBusqueda("FK_IdSubCliente");
					guiaremisionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSubCliente");
					guiaremisionBeanSwingJInternalFrame.inicializarActualizarBindingTablaGuiaRemision(true);
					guiaremisionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesGuiaRemision("n",guiaremisionBeanSwingJInternalFrame.isGuardarCambiosEnLote, guiaremisionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					guiaremisionBeanSwingJInternalFrame.setAutoscrolls(true);
					guiaremisionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						guiaremisionBeanSwingJInternalFrame.actualizarEstadoPanelsGuiaRemision("relacionado");
					} else {
						guiaremisionBeanSwingJInternalFrame.actualizarEstadoPanelsGuiaRemision("no_relacionado");
					}

					guiaremisionBeanSwingJInternalFrame.getjButtonRecargarInformacionGuiaRemision().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProformaBeanSwingJInternalFrame(List<SubCliente> subclientes,SubCliente subcliente,ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//proformaBeanSwingJInternalFrame=new ProformaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					proformaBeanSwingJInternalFrame.getProformaLogic().setConnexion(this.subclienteLogic.getConnexion());

					proformaBeanSwingJInternalFrame.setsubclientesForeignKey(subclientes);
					proformaBeanSwingJInternalFrame.setsubclienteForeignKey(subcliente);
					proformaBeanSwingJInternalFrame.proformaSessionBean.setisBusquedaDesdeForeignKeySesionSubCliente(true);
					proformaBeanSwingJInternalFrame.proformaSessionBean.setlidSubClienteActual(subcliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					proformaBeanSwingJInternalFrame.cargarCombosForeignKeyProforma(proformaBeanSwingJInternalFrame.isCargarCombosDependencia);
					proformaBeanSwingJInternalFrame.setVisibilidadBusquedasParaSubCliente(true);
					proformaBeanSwingJInternalFrame.setid_sub_clienteFK_IdSubCliente(subcliente.getId());

					if(!this.conCargarFormDetalle) {
						proformaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					proformaBeanSwingJInternalFrame.setSelectedItemCombosFrameSubClienteForeignKey(subcliente,1,false,true,true);
					proformaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					proformaBeanSwingJInternalFrame.procesarBusqueda("FK_IdSubCliente");
					proformaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSubCliente");
					proformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProforma(true);
					proformaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProforma("n",proformaBeanSwingJInternalFrame.isGuardarCambiosEnLote, proformaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					proformaBeanSwingJInternalFrame.setAutoscrolls(true);
					proformaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						proformaBeanSwingJInternalFrame.actualizarEstadoPanelsProforma("relacionado");
					} else {
						proformaBeanSwingJInternalFrame.actualizarEstadoPanelsProforma("no_relacionado");
					}

					proformaBeanSwingJInternalFrame.getjButtonRecargarInformacionProforma().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPedidoExporBeanSwingJInternalFrame(List<SubCliente> subclientes,SubCliente subcliente,PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidoexporBeanSwingJInternalFrame=new PedidoExporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidoexporBeanSwingJInternalFrame.getPedidoExporLogic().setConnexion(this.subclienteLogic.getConnexion());

					pedidoexporBeanSwingJInternalFrame.setsubclientesForeignKey(subclientes);
					pedidoexporBeanSwingJInternalFrame.setsubclienteForeignKey(subcliente);
					pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setisBusquedaDesdeForeignKeySesionSubCliente(true);
					pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setlidSubClienteActual(subcliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidoexporBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoExpor(pedidoexporBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidoexporBeanSwingJInternalFrame.setVisibilidadBusquedasParaSubCliente(true);
					pedidoexporBeanSwingJInternalFrame.setid_sub_clienteFK_IdSubCliente(subcliente.getId());

					if(!this.conCargarFormDetalle) {
						pedidoexporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidoexporBeanSwingJInternalFrame.setSelectedItemCombosFrameSubClienteForeignKey(subcliente,1,false,true,true);
					pedidoexporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidoexporBeanSwingJInternalFrame.procesarBusqueda("FK_IdSubCliente");
					pedidoexporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSubCliente");
					pedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoExpor(true);
					pedidoexporBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedidoExpor("n",pedidoexporBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidoexporBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidoexporBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidoexporBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoExpor("relacionado");
					} else {
						pedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoExpor("no_relacionado");
					}

					pedidoexporBeanSwingJInternalFrame.getjButtonRecargarInformacionPedidoExpor().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPedidoBeanSwingJInternalFrame(List<SubCliente> subclientes,SubCliente subcliente,PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidoBeanSwingJInternalFrame=new PedidoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidoBeanSwingJInternalFrame.getPedidoLogic().setConnexion(this.subclienteLogic.getConnexion());

					pedidoBeanSwingJInternalFrame.setsubclientesForeignKey(subclientes);
					pedidoBeanSwingJInternalFrame.setsubclienteForeignKey(subcliente);
					pedidoBeanSwingJInternalFrame.pedidoSessionBean.setisBusquedaDesdeForeignKeySesionSubCliente(true);
					pedidoBeanSwingJInternalFrame.pedidoSessionBean.setlidSubClienteActual(subcliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidoBeanSwingJInternalFrame.cargarCombosForeignKeyPedido(pedidoBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidoBeanSwingJInternalFrame.setVisibilidadBusquedasParaSubCliente(true);
					pedidoBeanSwingJInternalFrame.setid_sub_clienteFK_IdSubCliente(subcliente.getId());

					if(!this.conCargarFormDetalle) {
						pedidoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidoBeanSwingJInternalFrame.setSelectedItemCombosFrameSubClienteForeignKey(subcliente,1,false,true,true);
					pedidoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidoBeanSwingJInternalFrame.procesarBusqueda("FK_IdSubCliente");
					pedidoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdSubCliente");
					pedidoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedido(true);
					pedidoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedido("n",pedidoBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidoBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidoBeanSwingJInternalFrame.actualizarEstadoPanelsPedido("relacionado");
					} else {
						pedidoBeanSwingJInternalFrame.actualizarEstadoPanelsPedido("no_relacionado");
					}

					pedidoBeanSwingJInternalFrame.getjButtonRecargarInformacionPedido().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
