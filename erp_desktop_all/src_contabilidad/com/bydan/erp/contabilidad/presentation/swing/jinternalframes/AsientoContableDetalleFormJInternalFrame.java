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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.AsientoContableConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class AsientoContableDetalleFormJInternalFrame extends AsientoContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAsientoContable;
	
	protected JMenuBar jmenuBarDetalleAsientoContable;
	
	protected JMenu jmenuDetalleAsientoContable;
	protected JMenu jmenuDetalleArchivoAsientoContable;
	protected JMenu jmenuDetalleAccionesAsientoContable;
	protected JMenu jmenuDetalleDatosAsientoContable;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAsientoContable;	
	protected GridBagConstraints gridBagConstraintsAsientoContable;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AsientoContableBeanSwingJInternalFrameAdditional jInternalFrameDetalleAsientoContable;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoDescripcionAsientoBeanSwingJInternalFrame tipodescripcionasientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodescripcionasiento="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected EstadoAsientoContableBeanSwingJInternalFrame estadoasientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoasientocontable="";

	protected TipoMovimientoModuloBeanSwingJInternalFrame tipomovimientomoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimientomodulo="";
	
	public AsientoContableSessionBean asientocontableSessionBean;
	
	

	public SriBeanSwingJInternalFrame sriBeanSwingJInternalFrame=null;
	public SriBeanSwingJInternalFrame sriBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSri=false;
	public SriSessionBean sriSessionBean;

	public ImportarExportarBeanSwingJInternalFrame importarexportarBeanSwingJInternalFrame=null;
	public ImportarExportarBeanSwingJInternalFrame importarexportarBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteImportarExportar=false;
	public ImportarExportarSessionBean importarexportarSessionBean;

	public DetalleMoviClienProveBeanSwingJInternalFrame detallemoviclienproveBeanSwingJInternalFrame=null;
	public DetalleMoviClienProveBeanSwingJInternalFrame detallemoviclienproveBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleMoviClienProve=false;
	public DetalleMoviClienProveSessionBean detallemoviclienproveSessionBean;

	public PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrame=null;
	public PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePrestamo=false;
	public PrestamoSessionBean prestamoSessionBean;

	public DetalleAsientoContableBeanSwingJInternalFrame detalleasientocontableBeanSwingJInternalFrame=null;
	public DetalleAsientoContableBeanSwingJInternalFrame detalleasientocontableBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleAsientoContable=false;
	public DetalleAsientoContableSessionBean detalleasientocontableSessionBean;

	public RetencionBeanSwingJInternalFrame retencionBeanSwingJInternalFrame=null;
	public RetencionBeanSwingJInternalFrame retencionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRetencion=false;
	public RetencionSessionBean retencionSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoDescripcionAsientoSessionBean tipodescripcionasientoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public EstadoAsientoContableSessionBean estadoasientocontableSessionBean;
	public TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean;	
	
	public AsientoContableLogic asientocontableLogic;
	
	public JScrollPane jScrollPanelDatosAsientoContable;
	public JScrollPane jScrollPanelDatosEdicionAsientoContable;
	public JScrollPane jScrollPanelDatosGeneralAsientoContable;
	
	protected JPanel jPanelCamposAsientoContable;    
	protected JPanel jPanelCamposOcultosAsientoContable;    	
	protected JPanel jPanelAccionesAsientoContable;
	protected JPanel jPanelAccionesFormularioAsientoContable;
    
	
	
	protected Integer iXPanelCamposAsientoContable=0;
	protected Integer iYPanelCamposAsientoContable=0;
	
	protected Integer iXPanelCamposOcultosAsientoContable=0;
	protected Integer iYPanelCamposOcultosAsientoContable=0;
	
	;
	
	protected JTabbedPane jTabbedPaneRelacionesFinformas_de_pagoAsientoContable;
	protected JButton jButtonRelacionesFinformas_de_pagoAsientoContable;
	protected JPanel jPanelAccionesRelacionesFinAsientoContable;
	protected JButton jButtonRelacionesFinNormalAsientoContable;
	Integer iPosXAccionesRelacionesFin=0;;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAsientoContable;
	public JButton jButtonModificarAsientoContable;
	public JButton jButtonActualizarAsientoContable;
    public JButton jButtonEliminarAsientoContable;
	public JButton jButtonCancelarAsientoContable;
    public JButton jButtonGuardarCambiosAsientoContable;
	public JButton jButtonGuardarCambiosTablaAsientoContable;
	protected JButton jButtonCerrarAsientoContable;
	
	
	protected JButton jButtonProcesarInformacionAsientoContable;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAsientoContable;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAsientoContable;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAsientoContable;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAsientoContable;
	protected JButton jButtonModificarToolBarAsientoContable;
	protected JButton jButtonActualizarToolBarAsientoContable;
    protected JButton jButtonEliminarToolBarAsientoContable;
	protected JButton jButtonCancelarToolBarAsientoContable;
    protected JButton jButtonGuardarCambiosToolBarAsientoContable;
	protected JButton jButtonGuardarCambiosTablaToolBarAsientoContable;
	protected JButton jButtonMostrarOcultarTablaToolBarAsientoContable;
	protected JButton jButtonCerrarToolBarAsientoContable;
	
	protected JButton jButtonProcesarInformacionToolBarAsientoContable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAsientoContable;
	protected JMenuItem jMenuItemModificarAsientoContable;
	protected JMenuItem jMenuItemActualizarAsientoContable;
    protected JMenuItem jMenuItemEliminarAsientoContable;
	protected JMenuItem jMenuItemCancelarAsientoContable;
    protected JMenuItem jMenuItemGuardarCambiosAsientoContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaAsientoContable;
	protected JMenuItem jMenuItemCerrarAsientoContable;
	protected JMenuItem jMenuItemDetalleCerrarAsientoContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarAsientoContable;
	
	protected JMenuItem jMenuItemProcesarInformacionAsientoContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAsientoContable;
	protected JMenuItem jMenuItemMostrarOcultarAsientoContable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAsientoContable;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAsientoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAsientoContable;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAsientoContable;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAsientoContable;
	public JLabel jLabelIdAsientoContable;
	public JLabel jLabelidAsientoContable;
	public JButton jButtonidAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelcodigoAsientoContable;
	public JLabel jLabelcodigoAsientoContable;
	public JTextField jTextFieldcodigoAsientoContable;
	public JButton jButtoncodigoAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelfechaAsientoContable;
	public JLabel jLabelfechaAsientoContable;
	//public JFormattedTextField jDateChooserfechaAsientoContable;

	public JDateChooser jDateChooserfechaAsientoContable;
	public JButton jButtonfechaAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorAsientoContable;
	public JLabel jLabelnumero_mayorAsientoContable;
	public JTextArea jTextAreanumero_mayorAsientoContable;
	public JScrollPane jscrollPanenumero_mayorAsientoContable;
	public JButton jButtonnumero_mayorAsientoContableBusqueda= new JButtonMe();

	public JPanel jPaneles_retencionAsientoContable;
	public JLabel jLabeles_retencionAsientoContable;
	public JCheckBox jCheckBoxes_retencionAsientoContable;
	public JButton jButtones_retencionAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelnumero_retencionAsientoContable;
	public JLabel jLabelnumero_retencionAsientoContable;
	public JTextField jTextFieldnumero_retencionAsientoContable;
	public JButton jButtonnumero_retencionAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelvalorAsientoContable;
	public JLabel jLabelvalorAsientoContable;
	public JTextField jTextFieldvalorAsientoContable;
	public JButton jButtonvalorAsientoContableBusqueda= new JButtonMe();

	public JPanel jPaneles_retencion_ivaAsientoContable;
	public JLabel jLabeles_retencion_ivaAsientoContable;
	public JCheckBox jCheckBoxes_retencion_ivaAsientoContable;
	public JButton jButtones_retencion_ivaAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelnumero_retencion_ivaAsientoContable;
	public JLabel jLabelnumero_retencion_ivaAsientoContable;
	public JTextField jTextFieldnumero_retencion_ivaAsientoContable;
	public JButton jButtonnumero_retencion_ivaAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelcotizacionAsientoContable;
	public JLabel jLabelcotizacionAsientoContable;
	public JTextField jTextFieldcotizacionAsientoContable;
	public JButton jButtoncotizacionAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiarioAsientoContable;
	public JLabel jLabelbeneficiarioAsientoContable;
	public JTextArea jTextAreabeneficiarioAsientoContable;
	public JScrollPane jscrollPanebeneficiarioAsientoContable;
	public JButton jButtonbeneficiarioAsientoContableBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionAsientoContable;
	public JLabel jLabeldescripcionAsientoContable;
	public JTextArea jTextAreadescripcionAsientoContable;
	public JScrollPane jscrollPanedescripcionAsientoContable;
	public JButton jButtondescripcionAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionAsientoContable;
	public JLabel jLabelfecha_emisionAsientoContable;
	//public JFormattedTextField jDateChooserfecha_emisionAsientoContable;

	public JDateChooser jDateChooserfecha_emisionAsientoContable;
	public JButton jButtonfecha_emisionAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finalizacionAsientoContable;
	public JLabel jLabelfecha_finalizacionAsientoContable;
	//public JFormattedTextField jDateChooserfecha_finalizacionAsientoContable;

	public JDateChooser jDateChooserfecha_finalizacionAsientoContable;
	public JButton jButtonfecha_finalizacionAsientoContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaAsientoContable;
	public JLabel jLabelid_empresaAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAsientoContable;
	public JButton jButtonid_empresaAsientoContable= new JButtonMe();
	public JButton jButtonid_empresaAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_empresaAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalAsientoContable;
	public JLabel jLabelid_sucursalAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalAsientoContable;
	public JButton jButtonid_sucursalAsientoContable= new JButtonMe();
	public JButton jButtonid_sucursalAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_sucursalAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioAsientoContable;
	public JLabel jLabelid_ejercicioAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioAsientoContable;
	public JButton jButtonid_ejercicioAsientoContable= new JButtonMe();
	public JButton jButtonid_ejercicioAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoAsientoContable;
	public JLabel jLabelid_periodoAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoAsientoContable;
	public JButton jButtonid_periodoAsientoContable= new JButtonMe();
	public JButton jButtonid_periodoAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_periodoAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_anioAsientoContable;
	public JLabel jLabelid_anioAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioAsientoContable;
	public JButton jButtonid_anioAsientoContable= new JButtonMe();
	public JButton jButtonid_anioAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_anioAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_mesAsientoContable;
	public JLabel jLabelid_mesAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesAsientoContable;
	public JButton jButtonid_mesAsientoContable= new JButtonMe();
	public JButton jButtonid_mesAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_mesAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloAsientoContable;
	public JLabel jLabelid_moduloAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloAsientoContable;
	public JButton jButtonid_moduloAsientoContable= new JButtonMe();
	public JButton jButtonid_moduloAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_moduloAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioAsientoContable;
	public JLabel jLabelid_usuarioAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioAsientoContable;
	public JButton jButtonid_usuarioAsientoContable= new JButtonMe();
	public JButton jButtonid_usuarioAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_usuarioAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documentoAsientoContable;
	public JLabel jLabelid_tipo_documentoAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoAsientoContable;
	public JButton jButtonid_tipo_documentoAsientoContable= new JButtonMe();
	public JButton jButtonid_tipo_documentoAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoAsientoContable;
	public JLabel jLabelid_tipo_movimientoAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoAsientoContable;
	public JButton jButtonid_tipo_movimientoAsientoContable= new JButtonMe();
	public JButton jButtonid_tipo_movimientoAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaAsientoContable;
	public JLabel jLabelid_monedaAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaAsientoContable;
	public JButton jButtonid_monedaAsientoContable= new JButtonMe();
	public JButton jButtonid_monedaAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_monedaAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteAsientoContable;
	public JLabel jLabelid_clienteAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteAsientoContable;
	public JButton jButtonid_clienteAsientoContable= new JButtonMe();
	public JButton jButtonid_clienteAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_clienteAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_descripcion_asientoAsientoContable;
	public JLabel jLabelid_tipo_descripcion_asientoAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_descripcion_asientoAsientoContable;
	public JButton jButtonid_tipo_descripcion_asientoAsientoContable= new JButtonMe();
	public JButton jButtonid_tipo_descripcion_asientoAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_tipo_descripcion_asientoAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoAsientoContable;
	public JLabel jLabelid_formatoAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoAsientoContable;
	public JButton jButtonid_formatoAsientoContable= new JButtonMe();
	public JButton jButtonid_formatoAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_formatoAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_asiento_contableAsientoContable;
	public JLabel jLabelid_estado_asiento_contableAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_asiento_contableAsientoContable;
	public JButton jButtonid_estado_asiento_contableAsientoContable= new JButtonMe();
	public JButton jButtonid_estado_asiento_contableAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_estado_asiento_contableAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimiento_moduloAsientoContable;
	public JLabel jLabelid_tipo_movimiento_moduloAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimiento_moduloAsientoContable;
	public JButton jButtonid_tipo_movimiento_moduloAsientoContable= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloAsientoContableBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAsientoContable;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AsientoContableDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAsientoContable=new JPanel();
				this.jPanelAccionesFormularioAsientoContable=new JPanel();
				this.jmenuBarDetalleAsientoContable=new JMenuBar();
				this.jTtoolBarDetalleAsientoContable=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsientoContableDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AsientoContableDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsientoContableDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsientoContableDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsientoContableDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	public JButton getjButtonActualizarToolBarAsientoContable() {
		return this.jButtonActualizarToolBarAsientoContable;
	}
	
	public JButton getjButtonEliminarToolBarAsientoContable() {
		return this.jButtonEliminarToolBarAsientoContable;
	}
	
	public JButton getjButtonCancelarToolBarAsientoContable() {
		return this.jButtonCancelarToolBarAsientoContable;
	}		
	
	public JButton getjButtonProcesarInformacionAsientoContable() {
		return this.jButtonProcesarInformacionAsientoContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAsientoContable)	{
		this.jButtonProcesarInformacionAsientoContable = jButtonProcesarInformacionAsientoContable;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAsientoContable() {
		return this.jComboBoxTiposAccionesAsientoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAsientoContable(
			JComboBox jComboBoxTiposRelacionesAsientoContable) {
		this.jComboBoxTiposRelacionesAsientoContable = jComboBoxTiposRelacionesAsientoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAsientoContable(
			JComboBox jComboBoxTiposAccionesAsientoContable) {
		this.jComboBoxTiposAccionesAsientoContable = jComboBoxTiposAccionesAsientoContable;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAsientoContable() {
		return this.jComboBoxTiposAccionesFormularioAsientoContable;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAsientoContable(
			JComboBox jComboBoxTiposAccionesFormularioAsientoContable) {
		this.jComboBoxTiposAccionesFormularioAsientoContable = jComboBoxTiposAccionesFormularioAsientoContable;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.asientocontableSessionBean=new AsientoContableSessionBean();
		
		this.asientocontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.asientocontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.asientocontableSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.sriSessionBean=new SriSessionBean();
		//this.importarexportarSessionBean=new ImportarExportarSessionBean();
		//this.detallemoviclienproveSessionBean=new DetalleMoviClienProveSessionBean();
		//this.prestamoSessionBean=new PrestamoSessionBean();
		//this.detalleasientocontableSessionBean=new DetalleAsientoContableSessionBean();
		//this.retencionSessionBean=new RetencionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AsientoContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Asiento Contable MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.asientocontableSessionBean.getEsGuardarRelacionado()) {
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
	
		AsientoContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAsientoContable= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAsientoContable=new JButtonMe();
				this.jButtonModificarToolBarAsientoContable=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAsientoContable,this.jTtoolBarDetalleAsientoContable,
							"actualizar","actualizar","Actualizar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAsientoContable,this.jTtoolBarDetalleAsientoContable,
							"eliminar","eliminar","Eliminar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAsientoContable,this.jTtoolBarDetalleAsientoContable,
							"cancelar","cancelar","Cancelar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAsientoContable,this.jTtoolBarDetalleAsientoContable,
							"guardarcambios","guardarcambios","Guardar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAsientoContable=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAsientoContable=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAsientoContable=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAsientoContable=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAsientoContable=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAsientoContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAsientoContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAsientoContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAsientoContable= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAsientoContable.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAsientoContable,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAsientoContable= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAsientoContable.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAsientoContable,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAsientoContable= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAsientoContable.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAsientoContable,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAsientoContable= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAsientoContable.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAsientoContable,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAsientoContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAsientoContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAsientoContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAsientoContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAsientoContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAsientoContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAsientoContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAsientoContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAsientoContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAsientoContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAsientoContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAsientoContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAsientoContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAsientoContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAsientoContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAsientoContable.add(this.jMenuItemDetalleCerrarAsientoContable);
		
		this.jmenuDetalleAccionesAsientoContable.add(this.jMenuItemActualizarAsientoContable);
		this.jmenuDetalleAccionesAsientoContable.add(this.jMenuItemEliminarAsientoContable);
		this.jmenuDetalleAccionesAsientoContable.add(this.jMenuItemCancelarAsientoContable);		
		
		//this.jmenuDetalleDatosAsientoContable.add(this.jMenuItemDetalleAbrirOrderByAsientoContable);				
		this.jmenuDetalleDatosAsientoContable.add(this.jMenuItemDetalleMostarOcultarAsientoContable);				
				
		//this.jmenuDetalleAccionesAsientoContable.add(this.jMenuItemGuardarCambiosAsientoContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAsientoContable.add(this.jmenuDetalleArchivoAsientoContable);		
		this.jmenuBarDetalleAsientoContable.add(this.jmenuDetalleAccionesAsientoContable);		
		this.jmenuBarDetalleAsientoContable.add(this.jmenuDetalleDatosAsientoContable);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleAsientoContable.add(this.jmenuDetalleAsientoContable);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAsientoContable);				
	}
	
	
	public void inicializarElementosCamposAsientoContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAsientoContable = new JLabelMe();
		jLabelIdAsientoContable.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAsientoContable = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAsientoContable= new GridBagLayout();

		this.jPanelidAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);

		jLabelidAsientoContable = new JLabel();
		jLabelidAsientoContable.setText("Id");

		jLabelidAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoAsientoContable = new JLabelMe();
		this.jLabelcodigoAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_CODIGO+" :");
		this.jLabelcodigoAsientoContable.setToolTipText("Codigo");
		this.jLabelcodigoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelcodigoAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jTextFieldcodigoAsientoContable= new JTextFieldMe();

		jTextFieldcodigoAsientoContable.setEnabled(false);
		jTextFieldcodigoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcodigoAsientoContable.setEnabled(false);
		this.jButtoncodigoAsientoContableBusqueda= new JButtonMe();
		this.jButtoncodigoAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoAsientoContableBusqueda.setText("U");
		this.jButtoncodigoAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabelfechaAsientoContable = new JLabelMe();
		this.jLabelfechaAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaAsientoContable.setToolTipText("Fecha");
		this.jLabelfechaAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelfechaAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		//jFormattedTextFieldfechaAsientoContable= new JFormattedTextFieldMe();

		jDateChooserfechaAsientoContable= new JDateChooser();
		jDateChooserfechaAsientoContable.setEnabled(false);
		jDateChooserfechaAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaAsientoContable.setDate(new Date());
		jDateChooserfechaAsientoContable.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaAsientoContable.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaAsientoContableBusqueda= new JButtonMe();
		this.jButtonfechaAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaAsientoContableBusqueda.setText("U");
		this.jButtonfechaAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorAsientoContable = new JLabelMe();
		this.jLabelnumero_mayorAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_NUMEROMAYOR+" : *");
		this.jLabelnumero_mayorAsientoContable.setToolTipText("No Comp.");
		this.jLabelnumero_mayorAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelnumero_mayorAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jTextAreanumero_mayorAsientoContable= new JTextAreaMe();
		jTextAreanumero_mayorAsientoContable.setEnabled(false);
		jTextAreanumero_mayorAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorAsientoContable.setLineWrap(true);
		jTextAreanumero_mayorAsientoContable.setWrapStyleWord(true);
		jTextAreanumero_mayorAsientoContable.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_mayorAsientoContable.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_mayorAsientoContable = new JScrollPane(jTextAreanumero_mayorAsientoContable);
		jscrollPanenumero_mayorAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenumero_mayorAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenumero_mayorAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnumero_mayorAsientoContableBusqueda= new JButtonMe();
		this.jButtonnumero_mayorAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorAsientoContableBusqueda.setText("U");
		this.jButtonnumero_mayorAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_mayorAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_mayorAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabeles_retencionAsientoContable = new JLabelMe();
		this.jLabeles_retencionAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_ESRETENCION+" : *");
		this.jLabeles_retencionAsientoContable.setToolTipText("Ret.");
		this.jLabeles_retencionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_retencionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_retencionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_retencionAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_retencionAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_retencionAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_ESRETENCION);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPaneles_retencionAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jCheckBoxes_retencionAsientoContable= new JCheckBoxMe();
		jCheckBoxes_retencionAsientoContable.setEnabled(false);

		jCheckBoxes_retencionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-80),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_retencionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-80),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_retencionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-80),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_retencionAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_retencionAsientoContableBusqueda= new JButtonMe();
		this.jButtones_retencionAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_retencionAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_retencionAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_retencionAsientoContableBusqueda.setText("U");
		this.jButtones_retencionAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_retencionAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_retencionAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_retencionAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_retencionAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_retencionAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_retencionAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabelnumero_retencionAsientoContable = new JLabelMe();
		this.jLabelnumero_retencionAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_NUMERORETENCION+" :");
		this.jLabelnumero_retencionAsientoContable.setToolTipText("Num. Ret.");
		this.jLabelnumero_retencionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_retencionAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_retencionAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_retencionAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_NUMERORETENCION);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelnumero_retencionAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jTextFieldnumero_retencionAsientoContable= new JTextFieldMe();

		jTextFieldnumero_retencionAsientoContable.setEnabled(false);
		jTextFieldnumero_retencionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_retencionAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_retencionAsientoContable.setEnabled(false);
		this.jButtonnumero_retencionAsientoContableBusqueda= new JButtonMe();
		this.jButtonnumero_retencionAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_retencionAsientoContableBusqueda.setText("U");
		this.jButtonnumero_retencionAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_retencionAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_retencionAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_retencionAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_retencionAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_retencionAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_retencionAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabelvalorAsientoContable = new JLabelMe();
		this.jLabelvalorAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorAsientoContable.setToolTipText("Valor");
		this.jLabelvalorAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelvalorAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jTextFieldvalorAsientoContable= new JTextFieldMe();
		jTextFieldvalorAsientoContable.setEnabled(false);
		jTextFieldvalorAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorAsientoContable.setText("0.0");

		this.jButtonvalorAsientoContableBusqueda= new JButtonMe();
		this.jButtonvalorAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorAsientoContableBusqueda.setText("U");
		this.jButtonvalorAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabeles_retencion_ivaAsientoContable = new JLabelMe();
		this.jLabeles_retencion_ivaAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_ESRETENCIONIVA+" : *");
		this.jLabeles_retencion_ivaAsientoContable.setToolTipText("Ret.Iva");
		this.jLabeles_retencion_ivaAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_retencion_ivaAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_retencion_ivaAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_retencion_ivaAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_retencion_ivaAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_retencion_ivaAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_ESRETENCIONIVA);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPaneles_retencion_ivaAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jCheckBoxes_retencion_ivaAsientoContable= new JCheckBoxMe();
		jCheckBoxes_retencion_ivaAsientoContable.setEnabled(false);

		jCheckBoxes_retencion_ivaAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-80),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_retencion_ivaAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-80),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_retencion_ivaAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-80),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_retencion_ivaAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_retencion_ivaAsientoContableBusqueda= new JButtonMe();
		this.jButtones_retencion_ivaAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_retencion_ivaAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_retencion_ivaAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_retencion_ivaAsientoContableBusqueda.setText("U");
		this.jButtones_retencion_ivaAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_retencion_ivaAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_retencion_ivaAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_retencion_ivaAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_retencion_ivaAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_retencion_ivaAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_retencion_ivaAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabelnumero_retencion_ivaAsientoContable = new JLabelMe();
		this.jLabelnumero_retencion_ivaAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_NUMERORETENCIONIVA+" :");
		this.jLabelnumero_retencion_ivaAsientoContable.setToolTipText("Num. Ret.Iva");
		this.jLabelnumero_retencion_ivaAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencion_ivaAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencion_ivaAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_retencion_ivaAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_retencion_ivaAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_retencion_ivaAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_NUMERORETENCIONIVA);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelnumero_retencion_ivaAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jTextFieldnumero_retencion_ivaAsientoContable= new JTextFieldMe();

		jTextFieldnumero_retencion_ivaAsientoContable.setEnabled(false);
		jTextFieldnumero_retencion_ivaAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencion_ivaAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencion_ivaAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_retencion_ivaAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_retencion_ivaAsientoContable.setEnabled(false);
		this.jButtonnumero_retencion_ivaAsientoContableBusqueda= new JButtonMe();
		this.jButtonnumero_retencion_ivaAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencion_ivaAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencion_ivaAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_retencion_ivaAsientoContableBusqueda.setText("U");
		this.jButtonnumero_retencion_ivaAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_retencion_ivaAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_retencion_ivaAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_retencion_ivaAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_retencion_ivaAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_retencion_ivaAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_retencion_ivaAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabelcotizacionAsientoContable = new JLabelMe();
		this.jLabelcotizacionAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_COTIZACION+" : *");
		this.jLabelcotizacionAsientoContable.setToolTipText("Cotizacion");
		this.jLabelcotizacionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcotizacionAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcotizacionAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcotizacionAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_COTIZACION);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelcotizacionAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jTextFieldcotizacionAsientoContable= new JTextFieldMe();
		jTextFieldcotizacionAsientoContable.setEnabled(false);
		jTextFieldcotizacionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcotizacionAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcotizacionAsientoContable.setText("0.0");

		jTextFieldcotizacionAsientoContable.setEnabled(false);
		this.jButtoncotizacionAsientoContableBusqueda= new JButtonMe();
		this.jButtoncotizacionAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncotizacionAsientoContableBusqueda.setText("U");
		this.jButtoncotizacionAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncotizacionAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncotizacionAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcotizacionAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcotizacionAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cotizacionAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncotizacionAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiarioAsientoContable = new JLabelMe();
		this.jLabelbeneficiarioAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_BENEFICIARIO+" : *");
		this.jLabelbeneficiarioAsientoContable.setToolTipText("Beneficiario");
		this.jLabelbeneficiarioAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiarioAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiarioAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiarioAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_BENEFICIARIO);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelbeneficiarioAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jTextAreabeneficiarioAsientoContable= new JTextAreaMe();
		jTextAreabeneficiarioAsientoContable.setEnabled(false);
		jTextAreabeneficiarioAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioAsientoContable.setLineWrap(true);
		jTextAreabeneficiarioAsientoContable.setWrapStyleWord(true);
		jTextAreabeneficiarioAsientoContable.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiarioAsientoContable.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiarioAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiarioAsientoContable = new JScrollPane(jTextAreabeneficiarioAsientoContable);
		jscrollPanebeneficiarioAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanebeneficiarioAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanebeneficiarioAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),35 + FuncionesSwing.getValorProporcion(35,0)));

		this.jButtonbeneficiarioAsientoContableBusqueda= new JButtonMe();
		this.jButtonbeneficiarioAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiarioAsientoContableBusqueda.setText("U");
		this.jButtonbeneficiarioAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiarioAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiarioAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiarioAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiarioAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiarioAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiarioAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionAsientoContable = new JLabelMe();
		this.jLabeldescripcionAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionAsientoContable.setToolTipText("Descripcion");
		this.jLabeldescripcionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPaneldescripcionAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jTextAreadescripcionAsientoContable= new JTextAreaMe();
		jTextAreadescripcionAsientoContable.setEnabled(false);
		jTextAreadescripcionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,50)));
		jTextAreadescripcionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,50)));
		jTextAreadescripcionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,50)));
		jTextAreadescripcionAsientoContable.setLineWrap(true);
		jTextAreadescripcionAsientoContable.setWrapStyleWord(true);
		jTextAreadescripcionAsientoContable.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionAsientoContable.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionAsientoContable = new JScrollPane(jTextAreadescripcionAsientoContable);
		jscrollPanedescripcionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),35 + FuncionesSwing.getValorProporcion(35,50)));
		jscrollPanedescripcionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),35 + FuncionesSwing.getValorProporcion(35,50)));
		jscrollPanedescripcionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),35 + FuncionesSwing.getValorProporcion(35,50)));

		this.jButtondescripcionAsientoContableBusqueda= new JButtonMe();
		this.jButtondescripcionAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionAsientoContableBusqueda.setText("U");
		this.jButtondescripcionAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionAsientoContable = new JLabelMe();
		this.jLabelfecha_emisionAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionAsientoContable.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelfecha_emisionAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		//jFormattedTextFieldfecha_emisionAsientoContable= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionAsientoContable= new JDateChooser();
		jDateChooserfecha_emisionAsientoContable.setEnabled(false);
		jDateChooserfecha_emisionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionAsientoContable.setDate(new Date());
		jDateChooserfecha_emisionAsientoContable.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionAsientoContable.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionAsientoContableBusqueda= new JButtonMe();
		this.jButtonfecha_emisionAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionAsientoContableBusqueda.setText("U");
		this.jButtonfecha_emisionAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finalizacionAsientoContable = new JLabelMe();
		this.jLabelfecha_finalizacionAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_FECHAFINALIZACION+" : *");
		this.jLabelfecha_finalizacionAsientoContable.setToolTipText("Fecha Finalizacion");
		this.jLabelfecha_finalizacionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_finalizacionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_finalizacionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finalizacionAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finalizacionAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finalizacionAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_FECHAFINALIZACION);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelfecha_finalizacionAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		//jFormattedTextFieldfecha_finalizacionAsientoContable= new JFormattedTextFieldMe();

		jDateChooserfecha_finalizacionAsientoContable= new JDateChooser();
		jDateChooserfecha_finalizacionAsientoContable.setEnabled(false);
		jDateChooserfecha_finalizacionAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finalizacionAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finalizacionAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finalizacionAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finalizacionAsientoContable.setDate(new Date());
		jDateChooserfecha_finalizacionAsientoContable.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finalizacionAsientoContable.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finalizacionAsientoContableBusqueda= new JButtonMe();
		this.jButtonfecha_finalizacionAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finalizacionAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finalizacionAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finalizacionAsientoContableBusqueda.setText("U");
		this.jButtonfecha_finalizacionAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finalizacionAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finalizacionAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finalizacionAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finalizacionAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finalizacionAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finalizacionAsientoContableBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAsientoContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaAsientoContable = new JLabelMe();
		this.jLabelid_empresaAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAsientoContable.setToolTipText("Empresa");
		this.jLabelid_empresaAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelid_empresaAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jComboBoxid_empresaAsientoContable= new JComboBoxMe();
		jComboBoxid_empresaAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAsientoContable.setEnabled(false);

		this.jButtonid_empresaAsientoContable= new JButtonMe();
		this.jButtonid_empresaAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAsientoContable.setText("Buscar");
		this.jButtonid_empresaAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAsientoContable"));

		this.jButtonid_empresaAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_empresaAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAsientoContableBusqueda.setText("U");
		this.jButtonid_empresaAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_empresaAsientoContableUpdate= new JButtonMe();
		this.jButtonid_empresaAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAsientoContableUpdate.setText("U");
		this.jButtonid_empresaAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAsientoContableUpdate"));



					
		this.jLabelid_sucursalAsientoContable = new JLabelMe();
		this.jLabelid_sucursalAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalAsientoContable.setToolTipText("Sucursal");
		this.jLabelid_sucursalAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelid_sucursalAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jComboBoxid_sucursalAsientoContable= new JComboBoxMe();
		jComboBoxid_sucursalAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalAsientoContable.setEnabled(false);

		this.jButtonid_sucursalAsientoContable= new JButtonMe();
		this.jButtonid_sucursalAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAsientoContable.setText("Buscar");
		this.jButtonid_sucursalAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAsientoContable"));

		this.jButtonid_sucursalAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_sucursalAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAsientoContableBusqueda.setText("U");
		this.jButtonid_sucursalAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_sucursalAsientoContableUpdate= new JButtonMe();
		this.jButtonid_sucursalAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAsientoContableUpdate.setText("U");
		this.jButtonid_sucursalAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAsientoContableUpdate"));



					
		this.jLabelid_ejercicioAsientoContable = new JLabelMe();
		this.jLabelid_ejercicioAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioAsientoContable.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelid_ejercicioAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jComboBoxid_ejercicioAsientoContable= new JComboBoxMe();
		jComboBoxid_ejercicioAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioAsientoContable.setEnabled(false);

		this.jButtonid_ejercicioAsientoContable= new JButtonMe();
		this.jButtonid_ejercicioAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioAsientoContable.setText("Buscar");
		this.jButtonid_ejercicioAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioAsientoContable"));

		this.jButtonid_ejercicioAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_ejercicioAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioAsientoContableBusqueda.setText("U");
		this.jButtonid_ejercicioAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioAsientoContableUpdate= new JButtonMe();
		this.jButtonid_ejercicioAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioAsientoContableUpdate.setText("U");
		this.jButtonid_ejercicioAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioAsientoContableUpdate"));



					
		this.jLabelid_periodoAsientoContable = new JLabelMe();
		this.jLabelid_periodoAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoAsientoContable.setToolTipText("Periodo");
		this.jLabelid_periodoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelid_periodoAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jComboBoxid_periodoAsientoContable= new JComboBoxMe();
		jComboBoxid_periodoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoAsientoContable.setEnabled(false);

		this.jButtonid_periodoAsientoContable= new JButtonMe();
		this.jButtonid_periodoAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoAsientoContable.setText("Buscar");
		this.jButtonid_periodoAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoAsientoContable"));

		this.jButtonid_periodoAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_periodoAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoAsientoContableBusqueda.setText("U");
		this.jButtonid_periodoAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_periodoAsientoContableUpdate= new JButtonMe();
		this.jButtonid_periodoAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoAsientoContableUpdate.setText("U");
		this.jButtonid_periodoAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoAsientoContableUpdate"));



					
		this.jLabelid_anioAsientoContable = new JLabelMe();
		this.jLabelid_anioAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioAsientoContable.setToolTipText("Anio");
		this.jLabelid_anioAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelid_anioAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jComboBoxid_anioAsientoContable= new JComboBoxMe();
		jComboBoxid_anioAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioAsientoContable.setEnabled(false);

		this.jButtonid_anioAsientoContable= new JButtonMe();
		this.jButtonid_anioAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioAsientoContable.setText("Buscar");
		this.jButtonid_anioAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioAsientoContable"));

		this.jButtonid_anioAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_anioAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioAsientoContableBusqueda.setText("U");
		this.jButtonid_anioAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_anioAsientoContableUpdate= new JButtonMe();
		this.jButtonid_anioAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioAsientoContableUpdate.setText("U");
		this.jButtonid_anioAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioAsientoContableUpdate"));



					
		this.jLabelid_mesAsientoContable = new JLabelMe();
		this.jLabelid_mesAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesAsientoContable.setToolTipText("Mes");
		this.jLabelid_mesAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelid_mesAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jComboBoxid_mesAsientoContable= new JComboBoxMe();
		jComboBoxid_mesAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesAsientoContable.setEnabled(false);

		this.jButtonid_mesAsientoContable= new JButtonMe();
		this.jButtonid_mesAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesAsientoContable.setText("Buscar");
		this.jButtonid_mesAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesAsientoContable"));

		this.jButtonid_mesAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_mesAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesAsientoContableBusqueda.setText("U");
		this.jButtonid_mesAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_mesAsientoContableUpdate= new JButtonMe();
		this.jButtonid_mesAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesAsientoContableUpdate.setText("U");
		this.jButtonid_mesAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesAsientoContableUpdate"));



					
		this.jLabelid_moduloAsientoContable = new JLabelMe();
		this.jLabelid_moduloAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloAsientoContable.setToolTipText("Modulo");
		this.jLabelid_moduloAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelid_moduloAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jComboBoxid_moduloAsientoContable= new JComboBoxMe();
		jComboBoxid_moduloAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloAsientoContable.setEnabled(false);

		this.jButtonid_moduloAsientoContable= new JButtonMe();
		this.jButtonid_moduloAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloAsientoContable.setText("Buscar");
		this.jButtonid_moduloAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloAsientoContable"));

		this.jButtonid_moduloAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_moduloAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloAsientoContableBusqueda.setText("U");
		this.jButtonid_moduloAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_moduloAsientoContableUpdate= new JButtonMe();
		this.jButtonid_moduloAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloAsientoContableUpdate.setText("U");
		this.jButtonid_moduloAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloAsientoContableUpdate"));



					
		this.jLabelid_usuarioAsientoContable = new JLabelMe();
		this.jLabelid_usuarioAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioAsientoContable.setToolTipText("Usuario");
		this.jLabelid_usuarioAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelid_usuarioAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jComboBoxid_usuarioAsientoContable= new JComboBoxMe();
		jComboBoxid_usuarioAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioAsientoContable.setEnabled(false);

		this.jButtonid_usuarioAsientoContable= new JButtonMe();
		this.jButtonid_usuarioAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAsientoContable.setText("Buscar");
		this.jButtonid_usuarioAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAsientoContable"));

		this.jButtonid_usuarioAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_usuarioAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioAsientoContableBusqueda.setText("U");
		this.jButtonid_usuarioAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_usuarioAsientoContableUpdate= new JButtonMe();
		this.jButtonid_usuarioAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioAsientoContableUpdate.setText("U");
		this.jButtonid_usuarioAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAsientoContableUpdate"));



					
		this.jLabelid_tipo_documentoAsientoContable = new JLabelMe();
		this.jLabelid_tipo_documentoAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_IDTIPODOCUMENTO+" : *");
		this.jLabelid_tipo_documentoAsientoContable.setToolTipText("Documento");
		this.jLabelid_tipo_documentoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documentoAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documentoAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelid_tipo_documentoAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jComboBoxid_tipo_documentoAsientoContable= new JComboBoxMe();
		jComboBoxid_tipo_documentoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documentoAsientoContable= new JButtonMe();
		this.jButtonid_tipo_documentoAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoAsientoContable.setText("Buscar");
		this.jButtonid_tipo_documentoAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documentoAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documentoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoAsientoContable"));

		this.jButtonid_tipo_documentoAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_tipo_documentoAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoAsientoContableBusqueda.setText("U");
		this.jButtonid_tipo_documentoAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documentoAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documentoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documentoAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documentoAsientoContableUpdate= new JButtonMe();
		this.jButtonid_tipo_documentoAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoAsientoContableUpdate.setText("U");
		this.jButtonid_tipo_documentoAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documentoAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documentoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoAsientoContableUpdate"));



					
		this.jLabelid_tipo_movimientoAsientoContable = new JLabelMe();
		this.jLabelid_tipo_movimientoAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoAsientoContable.setToolTipText("T. Movimiento");
		this.jLabelid_tipo_movimientoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_movimientoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_movimientoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelid_tipo_movimientoAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jComboBoxid_tipo_movimientoAsientoContable= new JComboBoxMe();
		jComboBoxid_tipo_movimientoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_movimientoAsientoContable= new JButtonMe();
		this.jButtonid_tipo_movimientoAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoAsientoContable.setText("Buscar");
		this.jButtonid_tipo_movimientoAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoAsientoContable"));

		this.jButtonid_tipo_movimientoAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoAsientoContableBusqueda.setText("U");
		this.jButtonid_tipo_movimientoAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoAsientoContableUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoAsientoContableUpdate.setText("U");
		this.jButtonid_tipo_movimientoAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoAsientoContableUpdate"));



					
		this.jLabelid_monedaAsientoContable = new JLabelMe();
		this.jLabelid_monedaAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaAsientoContable.setToolTipText("Moneda");
		this.jLabelid_monedaAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelid_monedaAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jComboBoxid_monedaAsientoContable= new JComboBoxMe();
		jComboBoxid_monedaAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaAsientoContable= new JButtonMe();
		this.jButtonid_monedaAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaAsientoContable.setText("Buscar");
		this.jButtonid_monedaAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaAsientoContable"));

		this.jButtonid_monedaAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_monedaAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaAsientoContableBusqueda.setText("U");
		this.jButtonid_monedaAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_monedaAsientoContableUpdate= new JButtonMe();
		this.jButtonid_monedaAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaAsientoContableUpdate.setText("U");
		this.jButtonid_monedaAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaAsientoContableUpdate"));



					
		this.jLabelid_clienteAsientoContable = new JLabelMe();
		this.jLabelid_clienteAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteAsientoContable.setToolTipText("Cliente");
		this.jLabelid_clienteAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelid_clienteAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jComboBoxid_clienteAsientoContable= new JComboBoxMe();
		jComboBoxid_clienteAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteAsientoContable= new JButtonMe();
		this.jButtonid_clienteAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteAsientoContable.setText("Buscar");
		this.jButtonid_clienteAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteAsientoContable"));

		this.jButtonid_clienteAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_clienteAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteAsientoContableBusqueda.setText("U");
		this.jButtonid_clienteAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_clienteAsientoContableUpdate= new JButtonMe();
		this.jButtonid_clienteAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteAsientoContableUpdate.setText("U");
		this.jButtonid_clienteAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteAsientoContableUpdate"));



					
		this.jLabelid_tipo_descripcion_asientoAsientoContable = new JLabelMe();
		this.jLabelid_tipo_descripcion_asientoAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_IDTIPODESCRIPCIONASIENTO+" : *");
		this.jLabelid_tipo_descripcion_asientoAsientoContable.setToolTipText("T. Descripcion");
		this.jLabelid_tipo_descripcion_asientoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_descripcion_asientoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_descripcion_asientoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_descripcion_asientoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_descripcion_asientoAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_descripcion_asientoAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_IDTIPODESCRIPCIONASIENTO);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelid_tipo_descripcion_asientoAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jComboBoxid_tipo_descripcion_asientoAsientoContable= new JComboBoxMe();
		jComboBoxid_tipo_descripcion_asientoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_descripcion_asientoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_descripcion_asientoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_descripcion_asientoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_descripcion_asientoAsientoContable= new JButtonMe();
		this.jButtonid_tipo_descripcion_asientoAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_descripcion_asientoAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_descripcion_asientoAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_descripcion_asientoAsientoContable.setText("Buscar");
		this.jButtonid_tipo_descripcion_asientoAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_descripcion_asientoAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_descripcion_asientoAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_descripcion_asientoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_descripcion_asientoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_descripcion_asientoAsientoContable"));

		this.jButtonid_tipo_descripcion_asientoAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_tipo_descripcion_asientoAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_descripcion_asientoAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_descripcion_asientoAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_descripcion_asientoAsientoContableBusqueda.setText("U");
		this.jButtonid_tipo_descripcion_asientoAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_descripcion_asientoAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_descripcion_asientoAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_descripcion_asientoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_descripcion_asientoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_descripcion_asientoAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_descripcion_asientoAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_tipo_descripcion_asientoAsientoContableUpdate= new JButtonMe();
		this.jButtonid_tipo_descripcion_asientoAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_descripcion_asientoAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_descripcion_asientoAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_descripcion_asientoAsientoContableUpdate.setText("U");
		this.jButtonid_tipo_descripcion_asientoAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_descripcion_asientoAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_descripcion_asientoAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_descripcion_asientoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_descripcion_asientoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_descripcion_asientoAsientoContableUpdate"));



					
		this.jLabelid_formatoAsientoContable = new JLabelMe();
		this.jLabelid_formatoAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoAsientoContable.setToolTipText("Formato");
		this.jLabelid_formatoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelid_formatoAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jComboBoxid_formatoAsientoContable= new JComboBoxMe();
		jComboBoxid_formatoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoAsientoContable= new JButtonMe();
		this.jButtonid_formatoAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoAsientoContable.setText("Buscar");
		this.jButtonid_formatoAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoAsientoContable"));

		this.jButtonid_formatoAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_formatoAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoAsientoContableBusqueda.setText("U");
		this.jButtonid_formatoAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_formatoAsientoContableUpdate= new JButtonMe();
		this.jButtonid_formatoAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoAsientoContableUpdate.setText("U");
		this.jButtonid_formatoAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoAsientoContableUpdate"));



					
		this.jLabelid_estado_asiento_contableAsientoContable = new JLabelMe();
		this.jLabelid_estado_asiento_contableAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE+" : *");
		this.jLabelid_estado_asiento_contableAsientoContable.setToolTipText("Estado Asiento Contable");
		this.jLabelid_estado_asiento_contableAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_asiento_contableAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_asiento_contableAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_asiento_contableAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_asiento_contableAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_asiento_contableAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelid_estado_asiento_contableAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jComboBoxid_estado_asiento_contableAsientoContable= new JComboBoxMe();
		jComboBoxid_estado_asiento_contableAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_asiento_contableAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_asiento_contableAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_asiento_contableAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_estado_asiento_contableAsientoContable.setEnabled(false);

		this.jButtonid_estado_asiento_contableAsientoContable= new JButtonMe();
		this.jButtonid_estado_asiento_contableAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_asiento_contableAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_asiento_contableAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_asiento_contableAsientoContable.setText("Buscar");
		this.jButtonid_estado_asiento_contableAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_asiento_contableAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_asiento_contableAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_asiento_contableAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_asiento_contableAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_asiento_contableAsientoContable"));

		this.jButtonid_estado_asiento_contableAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_estado_asiento_contableAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_asiento_contableAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_asiento_contableAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_asiento_contableAsientoContableBusqueda.setText("U");
		this.jButtonid_estado_asiento_contableAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_asiento_contableAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_asiento_contableAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_asiento_contableAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_asiento_contableAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_asiento_contableAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_asiento_contableAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_estado_asiento_contableAsientoContableUpdate= new JButtonMe();
		this.jButtonid_estado_asiento_contableAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_asiento_contableAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_asiento_contableAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_asiento_contableAsientoContableUpdate.setText("U");
		this.jButtonid_estado_asiento_contableAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_asiento_contableAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_asiento_contableAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_asiento_contableAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_asiento_contableAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_asiento_contableAsientoContableUpdate"));



					
		this.jLabelid_tipo_movimiento_moduloAsientoContable = new JLabelMe();
		this.jLabelid_tipo_movimiento_moduloAsientoContable.setText(""+AsientoContableConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO+" : *");
		this.jLabelid_tipo_movimiento_moduloAsientoContable.setToolTipText("Tipo Movimiento Modulo");
		this.jLabelid_tipo_movimiento_moduloAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimiento_moduloAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimiento_moduloAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimiento_moduloAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimiento_moduloAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimiento_moduloAsientoContable.setToolTipText(AsientoContableConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO);
		this.gridaBagLayoutAsientoContable = new GridBagLayout();
		this.jPanelid_tipo_movimiento_moduloAsientoContable.setLayout(this.gridaBagLayoutAsientoContable);


		jComboBoxid_tipo_movimiento_moduloAsientoContable= new JComboBoxMe();
		jComboBoxid_tipo_movimiento_moduloAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimiento_moduloAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_movimiento_moduloAsientoContable.setEnabled(false);

		this.jButtonid_tipo_movimiento_moduloAsientoContable= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloAsientoContable.setText("Buscar");
		this.jButtonid_tipo_movimiento_moduloAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimiento_moduloAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimiento_moduloAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloAsientoContable"));

		this.jButtonid_tipo_movimiento_moduloAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimiento_moduloAsientoContableBusqueda.setText("U");
		this.jButtonid_tipo_movimiento_moduloAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimiento_moduloAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimiento_moduloAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloAsientoContableBusqueda"));

		if(this.asientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimiento_moduloAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimiento_moduloAsientoContableUpdate= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimiento_moduloAsientoContableUpdate.setText("U");
		this.jButtonid_tipo_movimiento_moduloAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimiento_moduloAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimiento_moduloAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloAsientoContableUpdate"));



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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleAsientoContable = new AsientoContableBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Asiento Contable DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAsientoContable= new GridBagLayout();
		

		
		String sToolTipAsientoContable="";
		sToolTipAsientoContable=AsientoContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAsientoContable+="(Contabilidad.AsientoContable)";
		}
		
		if(!this.asientocontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipAsientoContable+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAsientoContable = new JButtonMe();
		this.jButtonModificarAsientoContable = new JButtonMe();
        this.jButtonActualizarAsientoContable = new JButtonMe();
        this.jButtonEliminarAsientoContable = new JButtonMe();
        this.jButtonCancelarAsientoContable = new JButtonMe();
        this.jButtonGuardarCambiosAsientoContable = new JButtonMe();
		this.jButtonGuardarCambiosTablaAsientoContable = new JButtonMe();
		this.jButtonCerrarAsientoContable = new JButtonMe();
		
		this.jScrollPanelDatosAsientoContable = new JScrollPane();   
        this.jScrollPanelDatosEdicionAsientoContable = new JScrollPane();
		this.jScrollPanelDatosGeneralAsientoContable = new JScrollPane();
				
		
		
		this.jPanelCamposAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		
		this.jTabbedPaneRelacionesFinformas_de_pagoAsientoContable=new JTabbedPane();
		this.jTabbedPaneRelacionesFinformas_de_pagoAsientoContable.add("",new JPanel());
		this.jButtonRelacionesFinformas_de_pagoAsientoContable=new JButtonMe();
		this.jPanelAccionesRelacionesFinAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jButtonRelacionesFinNormalAsientoContable=new JButtonMe();;
		//}
		
		this.sPath=" <---> Acceso: Asiento Contable";
		
		if(!this.asientocontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asiento Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosAsientoContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposAsientoContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposAsientoContable.setName("jPanelCamposAsientoContable"); 

		this.jPanelCamposOcultosAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAsientoContable.setName("jPanelCamposOcultosAsientoContable"); 

        this.jPanelAccionesAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAsientoContable.setToolTipText("Acciones");
        this.jPanelAccionesAsientoContable.setName("Acciones"); 

		this.jPanelAccionesFormularioAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAsientoContable.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAsientoContable.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		
		this.jTabbedPaneRelacionesFinformas_de_pagoAsientoContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jTabbedPaneRelacionesFinformas_de_pagoAsientoContable.setName("jTabbedPaneRelacionesFinformas_de_pagoAsientoContable");
		this.jButtonRelacionesFinformas_de_pagoAsientoContable.setText("FORMAS DE PAGO");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRelacionesFinformas_de_pagoAsientoContable,"relaciones_fin_button","FORMAS DE PAGO",true);
		this.jButtonRelacionesFinformas_de_pagoAsientoContable.setToolTipText("FORMAS DE PAGO");

		this.jPanelAccionesRelacionesFinAsientoContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelAccionesRelacionesFinAsientoContable.setName("jPanelAccionesRelacionesFinAsientoContable");
		this.jButtonRelacionesFinNormalAsientoContable.setText("NORMAL");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRelacionesFinNormalAsientoContable,"relaciones_fin_button","NORMAL",true);
		this.jButtonRelacionesFinNormalAsientoContable.setToolTipText("NORMAL");;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAsientoContable.setText("Nuevo");
		this.jButtonModificarAsientoContable.setText("Editar");
        this.jButtonActualizarAsientoContable.setText("Actualizar");
        this.jButtonEliminarAsientoContable.setText("Eliminar");
        this.jButtonCancelarAsientoContable.setText("Cancelar");
        this.jButtonGuardarCambiosAsientoContable.setText("Guardar");
		this.jButtonGuardarCambiosTablaAsientoContable.setText("Guardar");
		this.jButtonCerrarAsientoContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAsientoContable,"nuevo_button","Nuevo",this.asientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAsientoContable,"modificar_button","Editar",this.asientocontableSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAsientoContable,"actualizar_button","Actualizar",this.asientocontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAsientoContable,"eliminar_button","Eliminar",this.asientocontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAsientoContable,"cancelar_button","Cancelar",this.asientocontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAsientoContable,"guardarcambios_button","Guardar",this.asientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAsientoContable,"guardarcambiostabla_button","Guardar",this.asientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAsientoContable,"cerrar_button","Salir",this.asientocontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAsientoContable.setToolTipText("Nuevo"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAsientoContable.setToolTipText("Editar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAsientoContable.setToolTipText("Actualizar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAsientoContable.setToolTipText("Eliminar)"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAsientoContable.setToolTipText("Cancelar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAsientoContable.setToolTipText("Guardar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAsientoContable.setToolTipText("Guardar"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAsientoContable.setToolTipText("Salir"+" "+AsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAsientoContable";
		inputMap = this.jButtonNuevoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAsientoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAsientoContable"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAsientoContable";
		inputMap = this.jButtonActualizarAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAsientoContable"));
		
		//ELIMINAR
		sMapKey = "EliminarAsientoContable";
		inputMap = this.jButtonEliminarAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAsientoContable"));
		
		//CANCELAR	
		sMapKey = "CancelarAsientoContable";
		inputMap = this.jButtonCancelarAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAsientoContable"));
		
		//CERRAR		
		sMapKey = "CerrarAsientoContable";
		inputMap = this.jButtonCerrarAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAsientoContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAsientoContable";
		inputMap = this.jButtonGuardarCambiosTablaAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAsientoContable"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAsientoContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAsientoContable.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAsientoContable.setToolTipText("Nuevo AsientoContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAsientoContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAsientoContable.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAsientoContable.setToolTipText("Sin Cerrar Ventana AsientoContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAsientoContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAsientoContable.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAsientoContable.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAsientoContable.setText("Accion");
		this.jComboBoxTiposAccionesAsientoContable.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAsientoContable.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAsientoContable.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAsientoContable = new JLabelMe();
		
		this.jLabelAccionesAsientoContable.setText("Acciones");		
		this.jLabelAccionesAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAsientoContable();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAsientoContable();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAsientoContable=new JTabbedPane();
		this.jTabbedPaneRelacionesAsientoContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAsientoContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsientoContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsientoContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAsientoContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAsientoContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAsientoContable.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAsientoContable = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAsientoContable = new GridBagLayout();
		
		this.jPanelCamposAsientoContable.setLayout(gridaBagLayoutCamposAsientoContable);
		this.jPanelCamposOcultosAsientoContable.setLayout(gridaBagLayoutCamposOcultosAsientoContable);
		
		;
		
		this.jTabbedPaneRelacionesFinformas_de_pagoAsientoContable.setMinimumSize(new Dimension(this.getWidth(),AsientoContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
		this.jTabbedPaneRelacionesFinformas_de_pagoAsientoContable.setMaximumSize(new Dimension(this.getWidth(),AsientoContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
		this.jTabbedPaneRelacionesFinformas_de_pagoAsientoContable.setPreferredSize(new Dimension(this.getWidth(),AsientoContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
		GridBagLayout gridaBagLayoutAccionesRelacionesFinAsientoContable= new GridBagLayout();
		this.jPanelAccionesRelacionesFinAsientoContable.setLayout(gridaBagLayoutAccionesRelacionesFinAsientoContable);;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidAsientoContable.add(jLabelIdAsientoContable, this.gridBagConstraintsAsientoContable);



	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidAsientoContable.add(jLabelidAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaAsientoContable.add(jLabelid_empresaAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAsientoContable.add(jButtonid_empresaAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 3;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAsientoContable.add(jButtonid_empresaAsientoContableUpdate, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaAsientoContable.add(jComboBoxid_empresaAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalAsientoContable.add(jLabelid_sucursalAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAsientoContable.add(jButtonid_sucursalAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 3;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAsientoContable.add(jButtonid_sucursalAsientoContableUpdate, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalAsientoContable.add(jComboBoxid_sucursalAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ejercicioAsientoContable.add(jLabelid_ejercicioAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioAsientoContable.add(jButtonid_ejercicioAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 3;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioAsientoContable.add(jButtonid_ejercicioAsientoContableUpdate, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ejercicioAsientoContable.add(jComboBoxid_ejercicioAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodoAsientoContable.add(jLabelid_periodoAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoAsientoContable.add(jButtonid_periodoAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 3;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoAsientoContable.add(jButtonid_periodoAsientoContableUpdate, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodoAsientoContable.add(jComboBoxid_periodoAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_anioAsientoContable.add(jLabelid_anioAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioAsientoContable.add(jButtonid_anioAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 3;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioAsientoContable.add(jButtonid_anioAsientoContableUpdate, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_anioAsientoContable.add(jComboBoxid_anioAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesAsientoContable.add(jLabelid_mesAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesAsientoContable.add(jButtonid_mesAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 3;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesAsientoContable.add(jButtonid_mesAsientoContableUpdate, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesAsientoContable.add(jComboBoxid_mesAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_moduloAsientoContable.add(jLabelid_moduloAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloAsientoContable.add(jButtonid_moduloAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 3;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloAsientoContable.add(jButtonid_moduloAsientoContableUpdate, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_moduloAsientoContable.add(jComboBoxid_moduloAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_usuarioAsientoContable.add(jLabelid_usuarioAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioAsientoContable.add(jButtonid_usuarioAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 3;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioAsientoContable.add(jButtonid_usuarioAsientoContableUpdate, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_usuarioAsientoContable.add(jComboBoxid_usuarioAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_documentoAsientoContable.add(jLabelid_tipo_documentoAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoAsientoContable.add(jButtonid_tipo_documentoAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 3;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoAsientoContable.add(jButtonid_tipo_documentoAsientoContableUpdate, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_documentoAsientoContable.add(jComboBoxid_tipo_documentoAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcodigoAsientoContable.add(jLabelcodigoAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoAsientoContable.add(jButtoncodigoAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcodigoAsientoContable.add(jTextFieldcodigoAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfechaAsientoContable.add(jLabelfechaAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaAsientoContable.add(jButtonfechaAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfechaAsientoContable.add(jDateChooserfechaAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_movimientoAsientoContable.add(jLabelid_tipo_movimientoAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoAsientoContable.add(jButtonid_tipo_movimientoAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 3;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoAsientoContable.add(jButtonid_tipo_movimientoAsientoContableUpdate, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_movimientoAsientoContable.add(jComboBoxid_tipo_movimientoAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_mayorAsientoContable.add(jLabelnumero_mayorAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorAsientoContable.add(jButtonnumero_mayorAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_mayorAsientoContable.add(jscrollPanenumero_mayorAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_monedaAsientoContable.add(jLabelid_monedaAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaAsientoContable.add(jButtonid_monedaAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 3;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaAsientoContable.add(jButtonid_monedaAsientoContableUpdate, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_monedaAsientoContable.add(jComboBoxid_monedaAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneles_retencionAsientoContable.add(jLabeles_retencionAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_retencionAsientoContable.add(jButtones_retencionAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneles_retencionAsientoContable.add(jCheckBoxes_retencionAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_retencionAsientoContable.add(jLabelnumero_retencionAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_retencionAsientoContable.add(jButtonnumero_retencionAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_retencionAsientoContable.add(jTextFieldnumero_retencionAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelvalorAsientoContable.add(jLabelvalorAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorAsientoContable.add(jButtonvalorAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelvalorAsientoContable.add(jTextFieldvalorAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneles_retencion_ivaAsientoContable.add(jLabeles_retencion_ivaAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_retencion_ivaAsientoContable.add(jButtones_retencion_ivaAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneles_retencion_ivaAsientoContable.add(jCheckBoxes_retencion_ivaAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_retencion_ivaAsientoContable.add(jLabelnumero_retencion_ivaAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_retencion_ivaAsientoContable.add(jButtonnumero_retencion_ivaAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_retencion_ivaAsientoContable.add(jTextFieldnumero_retencion_ivaAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcotizacionAsientoContable.add(jLabelcotizacionAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelcotizacionAsientoContable.add(jButtoncotizacionAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcotizacionAsientoContable.add(jTextFieldcotizacionAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_clienteAsientoContable.add(jLabelid_clienteAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 2;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteAsientoContable.add(jButtonid_clienteAsientoContable, this.gridBagConstraintsAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 3;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteAsientoContable.add(jButtonid_clienteAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 4;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteAsientoContable.add(jButtonid_clienteAsientoContableUpdate, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_clienteAsientoContable.add(jComboBoxid_clienteAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_descripcion_asientoAsientoContable.add(jLabelid_tipo_descripcion_asientoAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_descripcion_asientoAsientoContable.add(jButtonid_tipo_descripcion_asientoAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 3;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_descripcion_asientoAsientoContable.add(jButtonid_tipo_descripcion_asientoAsientoContableUpdate, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_descripcion_asientoAsientoContable.add(jComboBoxid_tipo_descripcion_asientoAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_formatoAsientoContable.add(jLabelid_formatoAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoAsientoContable.add(jButtonid_formatoAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 3;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoAsientoContable.add(jButtonid_formatoAsientoContableUpdate, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_formatoAsientoContable.add(jComboBoxid_formatoAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelbeneficiarioAsientoContable.add(jLabelbeneficiarioAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiarioAsientoContable.add(jButtonbeneficiarioAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelbeneficiarioAsientoContable.add(jscrollPanebeneficiarioAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescripcionAsientoContable.add(jLabeldescripcionAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionAsientoContable.add(jButtondescripcionAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescripcionAsientoContable.add(jscrollPanedescripcionAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_emisionAsientoContable.add(jLabelfecha_emisionAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionAsientoContable.add(jButtonfecha_emisionAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_emisionAsientoContable.add(jDateChooserfecha_emisionAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_finalizacionAsientoContable.add(jLabelfecha_finalizacionAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finalizacionAsientoContable.add(jButtonfecha_finalizacionAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_finalizacionAsientoContable.add(jDateChooserfecha_finalizacionAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_estado_asiento_contableAsientoContable.add(jLabelid_estado_asiento_contableAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_asiento_contableAsientoContable.add(jButtonid_estado_asiento_contableAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 3;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_asiento_contableAsientoContable.add(jButtonid_estado_asiento_contableAsientoContableUpdate, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_estado_asiento_contableAsientoContable.add(jComboBoxid_estado_asiento_contableAsientoContable, this.gridBagConstraintsAsientoContable);


	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 0;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_movimiento_moduloAsientoContable.add(jLabelid_tipo_movimiento_moduloAsientoContable, this.gridBagConstraintsAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 2;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimiento_moduloAsientoContable.add(jButtonid_tipo_movimiento_moduloAsientoContableBusqueda, this.gridBagConstraintsAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = 3;
		this.gridBagConstraintsAsientoContable.ipadx = 0;
		this.gridBagConstraintsAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimiento_moduloAsientoContable.add(jButtonid_tipo_movimiento_moduloAsientoContableUpdate, this.gridBagConstraintsAsientoContable);
	}

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContable.gridy = 0;
	this.gridBagConstraintsAsientoContable.gridx = 1;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_movimiento_moduloAsientoContable.add(jComboBoxid_tipo_movimiento_moduloAsientoContable, this.gridBagConstraintsAsientoContable);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAsientoContable.add(this.jPanelidAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAsientoContable.add(this.jPanelid_tipo_documentoAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAsientoContable.add(this.jPanelcodigoAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAsientoContable.add(this.jPanelfechaAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAsientoContable.add(this.jPanelid_tipo_movimientoAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAsientoContable.add(this.jPanelnumero_mayorAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAsientoContable.add(this.jPanelid_monedaAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.EAST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAsientoContable.add(this.jPaneles_retencionAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAsientoContable.add(this.jPanelnumero_retencionAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAsientoContable.add(this.jPanelvalorAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.EAST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAsientoContable.add(this.jPaneles_retencion_ivaAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAsientoContable.add(this.jPanelnumero_retencion_ivaAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAsientoContable.add(this.jPanelcotizacionAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAsientoContable.add(this.jPanelid_clienteAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAsientoContable.add(this.jPanelid_tipo_descripcion_asientoAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposAsientoContable.add(this.jPanelid_formatoAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.gridBagConstraintsAsientoContable.gridwidth = 2;

	this.jPanelCamposAsientoContable.add(this.jPanelbeneficiarioAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}

	iXPanelCamposAsientoContable=0;
	iYPanelCamposAsientoContable++;

	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.gridBagConstraintsAsientoContable.gridwidth = 3;

	this.jPanelCamposAsientoContable.add(this.jPaneldescripcionAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposAsientoContable % 3==0) {
		iXPanelCamposAsientoContable=0;
		iYPanelCamposAsientoContable++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposOcultosAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposOcultosAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosAsientoContable.add(this.jPanelid_empresaAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposOcultosAsientoContable % 3==0) {
		iXPanelCamposOcultosAsientoContable=0;
		iYPanelCamposOcultosAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposOcultosAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposOcultosAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosAsientoContable.add(this.jPanelid_sucursalAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposOcultosAsientoContable % 3==0) {
		iXPanelCamposOcultosAsientoContable=0;
		iYPanelCamposOcultosAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposOcultosAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposOcultosAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosAsientoContable.add(this.jPanelid_ejercicioAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposOcultosAsientoContable % 3==0) {
		iXPanelCamposOcultosAsientoContable=0;
		iYPanelCamposOcultosAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposOcultosAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposOcultosAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosAsientoContable.add(this.jPanelid_periodoAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposOcultosAsientoContable % 3==0) {
		iXPanelCamposOcultosAsientoContable=0;
		iYPanelCamposOcultosAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposOcultosAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposOcultosAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosAsientoContable.add(this.jPanelid_anioAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposOcultosAsientoContable % 3==0) {
		iXPanelCamposOcultosAsientoContable=0;
		iYPanelCamposOcultosAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposOcultosAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposOcultosAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosAsientoContable.add(this.jPanelid_mesAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposOcultosAsientoContable % 3==0) {
		iXPanelCamposOcultosAsientoContable=0;
		iYPanelCamposOcultosAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposOcultosAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposOcultosAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosAsientoContable.add(this.jPanelid_moduloAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposOcultosAsientoContable % 3==0) {
		iXPanelCamposOcultosAsientoContable=0;
		iYPanelCamposOcultosAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposOcultosAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposOcultosAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosAsientoContable.add(this.jPanelid_usuarioAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposOcultosAsientoContable % 3==0) {
		iXPanelCamposOcultosAsientoContable=0;
		iYPanelCamposOcultosAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposOcultosAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposOcultosAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosAsientoContable.add(this.jPanelfecha_emisionAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposOcultosAsientoContable % 3==0) {
		iXPanelCamposOcultosAsientoContable=0;
		iYPanelCamposOcultosAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposOcultosAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposOcultosAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosAsientoContable.add(this.jPanelfecha_finalizacionAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposOcultosAsientoContable % 3==0) {
		iXPanelCamposOcultosAsientoContable=0;
		iYPanelCamposOcultosAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposOcultosAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposOcultosAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosAsientoContable.add(this.jPanelid_estado_asiento_contableAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposOcultosAsientoContable % 3==0) {
		iXPanelCamposOcultosAsientoContable=0;
		iYPanelCamposOcultosAsientoContable++;
	}
	this.gridBagConstraintsAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContable.gridy = iYPanelCamposOcultosAsientoContable;
	this.gridBagConstraintsAsientoContable.gridx = iXPanelCamposOcultosAsientoContable++;
	this.gridBagConstraintsAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosAsientoContable.add(this.jPanelid_tipo_movimiento_moduloAsientoContable, this.gridBagConstraintsAsientoContable);



	if(iXPanelCamposOcultosAsientoContable % 3==0) {
		iXPanelCamposOcultosAsientoContable=0;
		iYPanelCamposOcultosAsientoContable++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesAsientoContable= new GridBagLayout();
		this.jPanelAccionesAsientoContable.setLayout(gridaBagLayoutAccionesAsientoContable);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAsientoContable= new GridBagLayout();
		this.jPanelAccionesFormularioAsientoContable.setLayout(gridaBagLayoutAccionesFormularioAsientoContable);
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAsientoContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAsientoContable.add(this.jComboBoxTiposAccionesFormularioAsientoContable, this.gridBagConstraintsAsientoContable);

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAsientoContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAsientoContable.add(this.jCheckBoxPostAccionNuevoAsientoContable, this.gridBagConstraintsAsientoContable);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.asientocontableSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAsientoContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAsientoContable.add(this.jCheckBoxPostAccionSinCerrarAsientoContable, this.gridBagConstraintsAsientoContable);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.asientocontableSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.asientocontableSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAsientoContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAsientoContable.add(this.jCheckBoxPostAccionSinMensajeAsientoContable, this.gridBagConstraintsAsientoContable);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx = iPosXAccion++;
			
		this.jPanelAccionesAsientoContable.add(this.jButtonModificarAsientoContable, this.gridBagConstraintsAsientoContable);							

		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContable.gridy = 0;
		this.gridBagConstraintsAsientoContable.gridx =iPosXAccion++;
			
		this.jPanelAccionesAsientoContable.add(this.jButtonEliminarAsientoContable, this.gridBagConstraintsAsientoContable);
		
			
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy = 0;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesAsientoContable.add(this.jButtonActualizarAsientoContable, this.gridBagConstraintsAsientoContable);


		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy = 0;		
		this.gridBagConstraintsAsientoContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesAsientoContable.add(this.jButtonGuardarCambiosAsientoContable, this.gridBagConstraintsAsientoContable);	
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy = 0;		
		this.gridBagConstraintsAsientoContable.gridx =iPosXAccion++;
		
		this.jPanelAccionesAsientoContable.add(this.jButtonCancelarAsientoContable, this.gridBagConstraintsAsientoContable);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAsientoContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAsientoContable);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.asientocontableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();						
			this.gridBagConstraintsAsientoContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAsientoContable.gridx = 0;		
			//this.gridBagConstraintsAsientoContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAsientoContable.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAsientoContable.gridx =0;
		this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAsientoContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAsientoContable, this.gridBagConstraintsAsientoContable);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AsientoContableJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAsientoContable = new AsientoContableBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Asiento Contable DATOS");
			
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
			
	        //this.setTitle("[FOR] - Asiento Contable DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Asiento Contable Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AsientoContableModel asientocontableModel=new AsientoContableModel(this);
			
			//SI USARA CLASE INTERNA
			//AsientoContableModel.AsientoContableFocusTraversalPolicy asientocontableFocusTraversalPolicy = asientocontableModel.new AsientoContableFocusTraversalPolicy(this);
			
			//asientocontableFocusTraversalPolicy.setasientocontableJInternalFrame(this);
			
			this.setFocusTraversalPolicy(asientocontableModel);
			
			
			this.jContentPaneDetalleAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAsientoContable = new GridBagLayout();	
			this.jContentPaneDetalleAsientoContable.setLayout(gridaBagLayoutDetalleAsientoContable);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAsientoContable = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAsientoContable = new GridBagConstraints();
				this.gridBagConstraintsAsientoContable.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAsientoContable.gridx = 0;
					
				
				this.jContentPaneDetalleAsientoContable.add(jTtoolBarDetalleAsientoContable, gridBagConstraintsAsientoContable);								
				
}
			
			this.jScrollPanelDatosEdicionAsientoContable=   new JScrollPane(jContentPaneDetalleAsientoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAsientoContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsientoContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsientoContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAsientoContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAsientoContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsientoContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsientoContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsAsientoContable.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAsientoContable.gridx = 0;
	        
			this.jContentPaneDetalleAsientoContable.add(jPanelCamposAsientoContable, gridBagConstraintsAsientoContable);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			
				this.gridBagConstraintsAsientoContable = new GridBagConstraints();
				//this.gridBagConstraintsAsientoContable.fill=GridBagConstraints.NONE;
				//this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;

				this.gridBagConstraintsAsientoContable.gridy = iGridyRelaciones++;
				this.gridBagConstraintsAsientoContable.gridx = 0;

				this.jContentPaneDetalleAsientoContable.add(this.jPanelAccionesRelacionesFinAsientoContable, gridBagConstraintsAsientoContable);;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				

				if(!PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.puedeCargarPorPartePrestamo=true;
				}

				if(!SriJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.puedeCargarPorParteSri=true;
				}

				if(!ImportarExportarJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.puedeCargarPorParteImportarExportar=true;
				}
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& asientocontableSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleAsientoContable(this.puedeCargarPorParteDetalleAsientoContable,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRetencion(this.puedeCargarPorParteRetencion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleMoviClienProve(this.puedeCargarPorParteDetalleMoviClienProve,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePrestamo(this.puedeCargarPorPartePrestamo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSri(this.puedeCargarPorParteSri,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameImportarExportar(this.puedeCargarPorParteImportarExportar,false,-1);
					
					if(this.asientocontableSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAsientoContable= new GridBagConstraints();
						this.gridBagConstraintsAsientoContable.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAsientoContable.gridx = 0;
						this.jContentPaneDetalleAsientoContable.add(this.jTabbedPaneRelacionesAsientoContable, this.gridBagConstraintsAsientoContable);
					}
					
					//RELACIONES OTROS AGRUPADOS
					
				this.gridBagConstraintsAsientoContable = new GridBagConstraints();
				//this.gridBagConstraintsAsientoContable.fill=GridBagConstraints.NONE;
				//this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;

				this.gridBagConstraintsAsientoContable.gridy = iGridyRelaciones++;
				this.gridBagConstraintsAsientoContable.gridx = 0;

				this.jContentPaneDetalleAsientoContable.add(this.jTabbedPaneRelacionesFinformas_de_pagoAsientoContable, gridBagConstraintsAsientoContable);

				this.jTabbedPaneRelacionesFinformas_de_pagoAsientoContable.setVisible(false);

				this.gridBagConstraintsAsientoContable = new GridBagConstraints();
				this.gridBagConstraintsAsientoContable.gridy = 0;
				this.gridBagConstraintsAsientoContable.gridx = iPosXAccionesRelacionesFin++;
				this.jPanelAccionesRelacionesFinAsientoContable.add(this.jButtonRelacionesFinNormalAsientoContable, this.gridBagConstraintsAsientoContable);
				this.gridBagConstraintsAsientoContable = new GridBagConstraints();
				this.gridBagConstraintsAsientoContable.gridy = 0;
				this.gridBagConstraintsAsientoContable.gridx = iPosXAccionesRelacionesFin++;
				this.jPanelAccionesRelacionesFinAsientoContable.add(this.jButtonRelacionesFinformas_de_pagoAsientoContable, this.gridBagConstraintsAsientoContable);;
					
					} else {
						//this.jButtonNuevoRelacionesAsientoContable.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleAsientoContable(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRetencion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleMoviClienProve(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePrestamo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSri(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameImportarExportar(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAsientoContable.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAsientoContable = new GridBagConstraints();
					this.gridBagConstraintsAsientoContable.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAsientoContable.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAsientoContable.gridx = 0;
					
				
					this.jContentPaneDetalleAsientoContable.add(jPanelCamposOcultosAsientoContable, gridBagConstraintsAsientoContable);
				
					this.jPanelCamposOcultosAsientoContable.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.gridy = iGridyRelaciones++;//19;		
	        this.gridBagConstraintsAsientoContable.gridx = 0;
	        this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAsientoContable.add(this.jPanelAccionesFormularioAsientoContable, this.gridBagConstraintsAsientoContable);							
			
			
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsAsientoContable.gridy = iGridyRelaciones;//19;		
	        this.gridBagConstraintsAsientoContable.gridx = 0;
	        
			
			this.jContentPaneDetalleAsientoContable.add(this.jPanelAccionesAsientoContable, this.gridBagConstraintsAsientoContable);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAsientoContable);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAsientoContable=   new JScrollPane(this.jPanelCamposAsientoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAsientoContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsientoContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsientoContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAsientoContable.gridx = 0;
			this.gridBagConstraintsAsientoContable.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAsientoContable.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAsientoContable.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAsientoContable, this.gridBagConstraintsAsientoContable);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAsientoContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAsientoContable, this.gridBagConstraintsAsientoContable);			
			
			this.gridBagConstraintsAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsAsientoContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAsientoContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAsientoContable, this.gridBagConstraintsAsientoContable);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAsientoContable, this.gridBagConstraintsAsientoContable);
			
			
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAsientoContable, this.gridBagConstraintsAsientoContable);
		
			
		this.gridBagConstraintsAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsAsientoContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAsientoContable, this.gridBagConstraintsAsientoContable);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAsientoContable;//jContentPane;
		
		return jScrollPanelDatosEdicionAsientoContable;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleAsientoContable(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleasientocontableSessionBean=new DetalleAsientoContableSessionBean();
		this.detalleasientocontableSessionBean.setConGuardarRelaciones(false);
		this.detalleasientocontableSessionBean.setEsGuardarRelacionado(true);

		this.detalleasientocontableBeanSwingJInternalFrame=null;//new DetalleAsientoContableBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleasientocontableBeanSwingJInternalFramePopup=new DetalleAsientoContableBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleasientocontableBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado()) {

				DetalleAsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL=AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleAsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleasientocontableSessionBean.setEsGuardarRelacionado(true);

				this.detalleasientocontableBeanSwingJInternalFrame=new DetalleAsientoContableBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleasientocontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleasientocontableBeanSwingJInternalFrame.setdetalleasientocontableSessionBean(this.detalleasientocontableSessionBean);

				//this.gridBagConstraintsAsientoContable = new GridBagConstraints();
				//this.gridBagConstraintsAsientoContable.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsAsientoContable.gridx = 0;
				//this.jContentPaneDetalleAsientoContable.add(this.detalleasientocontableBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsAsientoContable);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesAsientoContable.add("Detalle Asiento Contables",this.detalleasientocontableBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesAsientoContable.setComponentAt(iIndexTab,this.detalleasientocontableBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleAsientoContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleasientocontableSessionBean.setEsGuardarRelacionado(false);
				this.detalleasientocontableBeanSwingJInternalFrame=null;//new DetalleAsientoContableBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleAsientoContable) {
					this.jTabbedPaneRelacionesAsientoContable.add("Detalle Asiento Contables",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRetencion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.retencionSessionBean=new RetencionSessionBean();
		this.retencionSessionBean.setConGuardarRelaciones(false);
		this.retencionSessionBean.setEsGuardarRelacionado(true);

		this.retencionBeanSwingJInternalFrame=null;//new RetencionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.retencionBeanSwingJInternalFramePopup=new RetencionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.retencionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.retencionSessionBean.getEsGuardarRelacionado()) {

				RetencionJInternalFrame.STIPO_TAMANIO_GENERAL=AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL;
				RetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.retencionSessionBean.setEsGuardarRelacionado(true);

				this.retencionBeanSwingJInternalFrame=new RetencionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.retencionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.retencionBeanSwingJInternalFrame.setretencionSessionBean(this.retencionSessionBean);

				//this.gridBagConstraintsAsientoContable = new GridBagConstraints();
				//this.gridBagConstraintsAsientoContable.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsAsientoContable.gridx = 0;
				//this.jContentPaneDetalleAsientoContable.add(this.retencionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsAsientoContable);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesAsientoContable.add("Retenciones",this.retencionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesAsientoContable.setComponentAt(iIndexTab,this.retencionBeanSwingJInternalFrame.getContentPane());
				}

				//RetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.retencionSessionBean.setEsGuardarRelacionado(false);
				this.retencionBeanSwingJInternalFrame=null;//new RetencionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.retencionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRetencion) {
					this.jTabbedPaneRelacionesAsientoContable.add("Retenciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetalleMoviClienProve(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallemoviclienproveSessionBean=new DetalleMoviClienProveSessionBean();
		this.detallemoviclienproveSessionBean.setConGuardarRelaciones(false);
		this.detallemoviclienproveSessionBean.setEsGuardarRelacionado(true);

		this.detallemoviclienproveBeanSwingJInternalFrame=null;//new DetalleMoviClienProveBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallemoviclienproveBeanSwingJInternalFramePopup=new DetalleMoviClienProveBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallemoviclienproveBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado()) {

				DetalleMoviClienProveJInternalFrame.STIPO_TAMANIO_GENERAL=AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleMoviClienProveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallemoviclienproveSessionBean.setEsGuardarRelacionado(true);

				this.detallemoviclienproveBeanSwingJInternalFrame=new DetalleMoviClienProveBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallemoviclienproveBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallemoviclienproveBeanSwingJInternalFrame.setdetallemoviclienproveSessionBean(this.detallemoviclienproveSessionBean);

				//this.gridBagConstraintsAsientoContable = new GridBagConstraints();
				//this.gridBagConstraintsAsientoContable.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsAsientoContable.gridx = 0;
				//this.jContentPaneDetalleAsientoContable.add(this.detallemoviclienproveBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsAsientoContable);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesAsientoContable.add("Detalle Clientes",this.detallemoviclienproveBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesAsientoContable.setComponentAt(iIndexTab,this.detallemoviclienproveBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleMoviClienProveJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallemoviclienproveSessionBean.setEsGuardarRelacionado(false);
				this.detallemoviclienproveBeanSwingJInternalFrame=null;//new DetalleMoviClienProveBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleMoviClienProve) {
					this.jTabbedPaneRelacionesAsientoContable.add("Detalle Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePrestamo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.prestamoSessionBean=new PrestamoSessionBean();
		this.prestamoSessionBean.setConGuardarRelaciones(true);
		this.prestamoSessionBean.setEsGuardarRelacionado(true);

		this.prestamoBeanSwingJInternalFrame=null;//new PrestamoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.prestamoBeanSwingJInternalFramePopup=new PrestamoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.prestamoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.prestamoSessionBean.getEsGuardarRelacionado()) {

				PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL=AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL;
				PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.prestamoSessionBean.setEsGuardarRelacionado(true);

				this.prestamoBeanSwingJInternalFrame=new PrestamoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.prestamoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.prestamoBeanSwingJInternalFrame.setprestamoSessionBean(this.prestamoSessionBean);

				//this.gridBagConstraintsAsientoContable = new GridBagConstraints();
				//this.gridBagConstraintsAsientoContable.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsAsientoContable.gridx = 0;
				//this.jContentPaneDetalleAsientoContable.add(this.prestamoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsAsientoContable);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFinformas_de_pagoAsientoContable.add("Prestamos",this.prestamoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFinformas_de_pagoAsientoContable.setComponentAt(iIndexTab,this.prestamoBeanSwingJInternalFrame.getContentPane());
				}

				//PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.prestamoSessionBean.setEsGuardarRelacionado(false);
				this.prestamoBeanSwingJInternalFrame=null;//new PrestamoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.prestamoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePrestamo) {
					this.jTabbedPaneRelacionesFinformas_de_pagoAsientoContable.add("Prestamos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSri(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.sriSessionBean=new SriSessionBean();
		this.sriSessionBean.setConGuardarRelaciones(false);
		this.sriSessionBean.setEsGuardarRelacionado(true);

		this.sriBeanSwingJInternalFrame=null;//new SriBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.sriBeanSwingJInternalFramePopup=new SriBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.sriBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.sriSessionBean.getEsGuardarRelacionado()) {

				SriJInternalFrame.STIPO_TAMANIO_GENERAL=AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL;
				SriJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.sriSessionBean.setEsGuardarRelacionado(true);

				this.sriBeanSwingJInternalFrame=new SriBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.sriBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.sriBeanSwingJInternalFrame.setsriSessionBean(this.sriSessionBean);

				//this.gridBagConstraintsAsientoContable = new GridBagConstraints();
				//this.gridBagConstraintsAsientoContable.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsAsientoContable.gridx = 0;
				//this.jContentPaneDetalleAsientoContable.add(this.sriBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsAsientoContable);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesAsientoContable.add("Sris",this.sriBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesAsientoContable.setComponentAt(iIndexTab,this.sriBeanSwingJInternalFrame.getContentPane());
				}

				//SriJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.sriSessionBean.setEsGuardarRelacionado(false);
				this.sriBeanSwingJInternalFrame=null;//new SriBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.sriSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSri) {
					this.jTabbedPaneRelacionesAsientoContable.add("Sris",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameImportarExportar(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.importarexportarSessionBean=new ImportarExportarSessionBean();
		this.importarexportarSessionBean.setConGuardarRelaciones(false);
		this.importarexportarSessionBean.setEsGuardarRelacionado(true);

		this.importarexportarBeanSwingJInternalFrame=null;//new ImportarExportarBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.importarexportarBeanSwingJInternalFramePopup=new ImportarExportarBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.importarexportarBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.importarexportarSessionBean.getEsGuardarRelacionado()) {

				ImportarExportarJInternalFrame.STIPO_TAMANIO_GENERAL=AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL;
				ImportarExportarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=AsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.importarexportarSessionBean.setEsGuardarRelacionado(true);

				this.importarexportarBeanSwingJInternalFrame=new ImportarExportarBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.importarexportarBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.importarexportarBeanSwingJInternalFrame.setimportarexportarSessionBean(this.importarexportarSessionBean);

				//this.gridBagConstraintsAsientoContable = new GridBagConstraints();
				//this.gridBagConstraintsAsientoContable.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsAsientoContable.gridx = 0;
				//this.jContentPaneDetalleAsientoContable.add(this.importarexportarBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsAsientoContable);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesAsientoContable.add("Importar Exportars",this.importarexportarBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesAsientoContable.setComponentAt(iIndexTab,this.importarexportarBeanSwingJInternalFrame.getContentPane());
				}

				//ImportarExportarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.importarexportarSessionBean.setEsGuardarRelacionado(false);
				this.importarexportarBeanSwingJInternalFrame=null;//new ImportarExportarBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.importarexportarSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteImportarExportar) {
					this.jTabbedPaneRelacionesAsientoContable.add("Importar Exportars",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarSriBeanSwingJInternalFrame(List<AsientoContable> asientocontables,AsientoContable asientocontable,SriBeanSwingJInternalFrame sriBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//sriBeanSwingJInternalFrame=new SriBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					sriBeanSwingJInternalFrame.getSriLogic().setConnexion(this.asientocontableLogic.getConnexion());

					sriBeanSwingJInternalFrame.setasientocontablesForeignKey(asientocontables);
					sriBeanSwingJInternalFrame.setasientocontableForeignKey(asientocontable);
					sriBeanSwingJInternalFrame.sriSessionBean.setisBusquedaDesdeForeignKeySesionAsientoContable(true);
					sriBeanSwingJInternalFrame.sriSessionBean.setlidAsientoContableActual(asientocontable.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					sriBeanSwingJInternalFrame.cargarCombosForeignKeySri(sriBeanSwingJInternalFrame.isCargarCombosDependencia);
					sriBeanSwingJInternalFrame.setVisibilidadBusquedasParaAsientoContable(true);
					sriBeanSwingJInternalFrame.setid_asiento_contableFK_IdAsientoContable(asientocontable.getId());

					if(!this.conCargarFormDetalle) {
						sriBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					sriBeanSwingJInternalFrame.setSelectedItemCombosFrameAsientoContableForeignKey(asientocontable,1,false,true,true);
					sriBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					sriBeanSwingJInternalFrame.procesarBusqueda("FK_IdAsientoContable");
					sriBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdAsientoContable");
					sriBeanSwingJInternalFrame.inicializarActualizarBindingTablaSri(true);
					sriBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSri("n",sriBeanSwingJInternalFrame.isGuardarCambiosEnLote, sriBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					sriBeanSwingJInternalFrame.setAutoscrolls(true);
					sriBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						sriBeanSwingJInternalFrame.actualizarEstadoPanelsSri("relacionado");
					} else {
						sriBeanSwingJInternalFrame.actualizarEstadoPanelsSri("no_relacionado");
					}

					sriBeanSwingJInternalFrame.getjButtonRecargarInformacionSri().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarImportarExportarBeanSwingJInternalFrame(List<AsientoContable> asientocontables,AsientoContable asientocontable,ImportarExportarBeanSwingJInternalFrame importarexportarBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//importarexportarBeanSwingJInternalFrame=new ImportarExportarBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					importarexportarBeanSwingJInternalFrame.getImportarExportarLogic().setConnexion(this.asientocontableLogic.getConnexion());

					importarexportarBeanSwingJInternalFrame.setasientocontablesForeignKey(asientocontables);
					importarexportarBeanSwingJInternalFrame.setasientocontableForeignKey(asientocontable);
					importarexportarBeanSwingJInternalFrame.importarexportarSessionBean.setisBusquedaDesdeForeignKeySesionAsientoContable(true);
					importarexportarBeanSwingJInternalFrame.importarexportarSessionBean.setlidAsientoContableActual(asientocontable.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					importarexportarBeanSwingJInternalFrame.cargarCombosForeignKeyImportarExportar(importarexportarBeanSwingJInternalFrame.isCargarCombosDependencia);
					importarexportarBeanSwingJInternalFrame.setVisibilidadBusquedasParaAsientoContable(true);
					importarexportarBeanSwingJInternalFrame.setid_asiento_contableFK_IdAsientoContable(asientocontable.getId());

					if(!this.conCargarFormDetalle) {
						importarexportarBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					importarexportarBeanSwingJInternalFrame.setSelectedItemCombosFrameAsientoContableForeignKey(asientocontable,1,false,true,true);
					importarexportarBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					importarexportarBeanSwingJInternalFrame.procesarBusqueda("FK_IdAsientoContable");
					importarexportarBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdAsientoContable");
					importarexportarBeanSwingJInternalFrame.inicializarActualizarBindingTablaImportarExportar(true);
					importarexportarBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesImportarExportar("n",importarexportarBeanSwingJInternalFrame.isGuardarCambiosEnLote, importarexportarBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					importarexportarBeanSwingJInternalFrame.setAutoscrolls(true);
					importarexportarBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						importarexportarBeanSwingJInternalFrame.actualizarEstadoPanelsImportarExportar("relacionado");
					} else {
						importarexportarBeanSwingJInternalFrame.actualizarEstadoPanelsImportarExportar("no_relacionado");
					}

					importarexportarBeanSwingJInternalFrame.getjButtonRecargarInformacionImportarExportar().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleMoviClienProveBeanSwingJInternalFrame(List<AsientoContable> asientocontables,AsientoContable asientocontable,DetalleMoviClienProveBeanSwingJInternalFrame detallemoviclienproveBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallemoviclienproveBeanSwingJInternalFrame=new DetalleMoviClienProveBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallemoviclienproveBeanSwingJInternalFrame.getDetalleMoviClienProveLogic().setConnexion(this.asientocontableLogic.getConnexion());

					detallemoviclienproveBeanSwingJInternalFrame.setasientocontablesForeignKey(asientocontables);
					detallemoviclienproveBeanSwingJInternalFrame.setasientocontableForeignKey(asientocontable);
					detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveSessionBean.setisBusquedaDesdeForeignKeySesionAsientoContable(true);
					detallemoviclienproveBeanSwingJInternalFrame.detallemoviclienproveSessionBean.setlidAsientoContableActual(asientocontable.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallemoviclienproveBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleMoviClienProve(detallemoviclienproveBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallemoviclienproveBeanSwingJInternalFrame.setVisibilidadBusquedasParaAsientoContable(true);
					detallemoviclienproveBeanSwingJInternalFrame.setid_asiento_contableFK_IdAsientoContable(asientocontable.getId());

					if(!this.conCargarFormDetalle) {
						detallemoviclienproveBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallemoviclienproveBeanSwingJInternalFrame.setSelectedItemCombosFrameAsientoContableForeignKey(asientocontable,1,false,true,true);
					detallemoviclienproveBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallemoviclienproveBeanSwingJInternalFrame.procesarBusqueda("FK_IdAsientoContable");
					detallemoviclienproveBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdAsientoContable");
					detallemoviclienproveBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMoviClienProve(true);
					detallemoviclienproveBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleMoviClienProve("n",detallemoviclienproveBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallemoviclienproveBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallemoviclienproveBeanSwingJInternalFrame.setAutoscrolls(true);
					detallemoviclienproveBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallemoviclienproveBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMoviClienProve("relacionado");
					} else {
						detallemoviclienproveBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMoviClienProve("no_relacionado");
					}

					detallemoviclienproveBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleMoviClienProve().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPrestamoBeanSwingJInternalFrame(List<AsientoContable> asientocontables,AsientoContable asientocontable,PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//prestamoBeanSwingJInternalFrame=new PrestamoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					prestamoBeanSwingJInternalFrame.getPrestamoLogic().setConnexion(this.asientocontableLogic.getConnexion());

					prestamoBeanSwingJInternalFrame.setasientocontablesForeignKey(asientocontables);
					prestamoBeanSwingJInternalFrame.setasientocontableForeignKey(asientocontable);
					prestamoBeanSwingJInternalFrame.prestamoSessionBean.setisBusquedaDesdeForeignKeySesionAsientoContable(true);
					prestamoBeanSwingJInternalFrame.prestamoSessionBean.setlidAsientoContableActual(asientocontable.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					prestamoBeanSwingJInternalFrame.cargarCombosForeignKeyPrestamo(prestamoBeanSwingJInternalFrame.isCargarCombosDependencia);
					prestamoBeanSwingJInternalFrame.setVisibilidadBusquedasParaAsientoContable(true);
					prestamoBeanSwingJInternalFrame.setid_asiento_contableFK_IdAsientoContable(asientocontable.getId());

					if(!this.conCargarFormDetalle) {
						prestamoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					prestamoBeanSwingJInternalFrame.setSelectedItemCombosFrameAsientoContableForeignKey(asientocontable,1,false,true,true);
					prestamoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					prestamoBeanSwingJInternalFrame.procesarBusqueda("FK_IdAsientoContable");
					prestamoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdAsientoContable");
					prestamoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrestamo(true);
					prestamoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPrestamo("n",prestamoBeanSwingJInternalFrame.isGuardarCambiosEnLote, prestamoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					prestamoBeanSwingJInternalFrame.setAutoscrolls(true);
					prestamoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						prestamoBeanSwingJInternalFrame.actualizarEstadoPanelsPrestamo("relacionado");
					} else {
						prestamoBeanSwingJInternalFrame.actualizarEstadoPanelsPrestamo("no_relacionado");
					}

					prestamoBeanSwingJInternalFrame.getjButtonRecargarInformacionPrestamo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleAsientoContableBeanSwingJInternalFrame(List<AsientoContable> asientocontables,AsientoContable asientocontable,DetalleAsientoContableBeanSwingJInternalFrame detalleasientocontableBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleasientocontableBeanSwingJInternalFrame=new DetalleAsientoContableBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleasientocontableBeanSwingJInternalFrame.getDetalleAsientoContableLogic().setConnexion(this.asientocontableLogic.getConnexion());

					detalleasientocontableBeanSwingJInternalFrame.setasientocontablesForeignKey(asientocontables);
					detalleasientocontableBeanSwingJInternalFrame.setasientocontableForeignKey(asientocontable);
					detalleasientocontableBeanSwingJInternalFrame.detalleasientocontableSessionBean.setisBusquedaDesdeForeignKeySesionAsientoContable(true);
					detalleasientocontableBeanSwingJInternalFrame.detalleasientocontableSessionBean.setlidAsientoContableActual(asientocontable.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleasientocontableBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleAsientoContable(detalleasientocontableBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleasientocontableBeanSwingJInternalFrame.setVisibilidadBusquedasParaAsientoContable(true);
					detalleasientocontableBeanSwingJInternalFrame.setid_asiento_contableFK_IdAsientoContable(asientocontable.getId());

					if(!this.conCargarFormDetalle) {
						detalleasientocontableBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleasientocontableBeanSwingJInternalFrame.setSelectedItemCombosFrameAsientoContableForeignKey(asientocontable,1,false,true,true);
					detalleasientocontableBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleasientocontableBeanSwingJInternalFrame.procesarBusqueda("FK_IdAsientoContable");
					detalleasientocontableBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdAsientoContable");
					detalleasientocontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleAsientoContable(true);
					detalleasientocontableBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleAsientoContable("n",detalleasientocontableBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleasientocontableBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleasientocontableBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleasientocontableBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleasientocontableBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleAsientoContable("relacionado");
					} else {
						detalleasientocontableBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleAsientoContable("no_relacionado");
					}

					detalleasientocontableBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleAsientoContable().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarRetencionBeanSwingJInternalFrame(List<AsientoContable> asientocontables,AsientoContable asientocontable,RetencionBeanSwingJInternalFrame retencionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//retencionBeanSwingJInternalFrame=new RetencionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					retencionBeanSwingJInternalFrame.getRetencionLogic().setConnexion(this.asientocontableLogic.getConnexion());

					retencionBeanSwingJInternalFrame.setasientocontablesForeignKey(asientocontables);
					retencionBeanSwingJInternalFrame.setasientocontableForeignKey(asientocontable);
					retencionBeanSwingJInternalFrame.retencionSessionBean.setisBusquedaDesdeForeignKeySesionAsientoContable(true);
					retencionBeanSwingJInternalFrame.retencionSessionBean.setlidAsientoContableActual(asientocontable.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					retencionBeanSwingJInternalFrame.cargarCombosForeignKeyRetencion(retencionBeanSwingJInternalFrame.isCargarCombosDependencia);
					retencionBeanSwingJInternalFrame.setVisibilidadBusquedasParaAsientoContable(true);
					retencionBeanSwingJInternalFrame.setid_asiento_contableFK_IdAsientoContable(asientocontable.getId());

					if(!this.conCargarFormDetalle) {
						retencionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					retencionBeanSwingJInternalFrame.setSelectedItemCombosFrameAsientoContableForeignKey(asientocontable,1,false,true,true);
					retencionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					retencionBeanSwingJInternalFrame.procesarBusqueda("FK_IdAsientoContable");
					retencionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdAsientoContable");
					retencionBeanSwingJInternalFrame.inicializarActualizarBindingTablaRetencion(true);
					retencionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRetencion("n",retencionBeanSwingJInternalFrame.isGuardarCambiosEnLote, retencionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					retencionBeanSwingJInternalFrame.setAutoscrolls(true);
					retencionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						retencionBeanSwingJInternalFrame.actualizarEstadoPanelsRetencion("relacionado");
					} else {
						retencionBeanSwingJInternalFrame.actualizarEstadoPanelsRetencion("no_relacionado");
					}

					retencionBeanSwingJInternalFrame.getjButtonRecargarInformacionRetencion().setVisible(false);

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
