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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.DetalleActivoFijoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class DetalleActivoFijoDetalleFormJInternalFrame extends DetalleActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleActivoFijo;
	
	protected JMenuBar jmenuBarDetalleDetalleActivoFijo;
	
	protected JMenu jmenuDetalleDetalleActivoFijo;
	protected JMenu jmenuDetalleArchivoDetalleActivoFijo;
	protected JMenu jmenuDetalleAccionesDetalleActivoFijo;
	protected JMenu jmenuDetalleDatosDetalleActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleActivoFijo;	
	protected GridBagConstraints gridBagConstraintsDetalleActivoFijo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleActivoFijoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleActivoFijo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected DetalleGrupoActivoFijoBeanSwingJInternalFrame detallegrupoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detallegrupoactivofijo="";

	protected SubGrupoActivoFijoBeanSwingJInternalFrame subgrupoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subgrupoactivofijo="";

	protected TipoRamoActivoFijoBeanSwingJInternalFrame tiporamoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporamoactivofijo="";

	protected TipoActivoFijoEmpresaBeanSwingJInternalFrame tipoactivofijoempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoactivofijoempresa="";

	protected TipoDepreciacionEmpresaBeanSwingJInternalFrame tipodepreciacionempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodepreciacionempresa="";

	protected EstadoActivoFijoBeanSwingJInternalFrame estadoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoactivofijo="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected PartidaPresuBeanSwingJInternalFrame partidapresuBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_partidapresu="";
	
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	
	

	public MantenimientoActivoFijoBeanSwingJInternalFrame mantenimientoactivofijoBeanSwingJInternalFrame=null;
	public MantenimientoActivoFijoBeanSwingJInternalFrame mantenimientoactivofijoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteMantenimientoActivoFijo=false;
	public MantenimientoActivoFijoSessionBean mantenimientoactivofijoSessionBean;

	public ServicioTransporteBeanSwingJInternalFrame serviciotransporteBeanSwingJInternalFrame=null;
	public ServicioTransporteBeanSwingJInternalFrame serviciotransporteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteServicioTransporte=false;
	public ServicioTransporteSessionBean serviciotransporteSessionBean;

	public MovimientoActivoFijoBeanSwingJInternalFrame movimientoactivofijoBeanSwingJInternalFrame=null;
	public MovimientoActivoFijoBeanSwingJInternalFrame movimientoactivofijoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteMovimientoActivoFijo=false;
	public MovimientoActivoFijoSessionBean movimientoactivofijoSessionBean;

	public VehiculoBeanSwingJInternalFrame vehiculoBeanSwingJInternalFrame=null;
	public VehiculoBeanSwingJInternalFrame vehiculoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteVehiculo=false;
	public VehiculoSessionBean vehiculoSessionBean;

	public MetodoDepreciacionBeanSwingJInternalFrame metododepreciacionBeanSwingJInternalFrame=null;
	public MetodoDepreciacionBeanSwingJInternalFrame metododepreciacionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteMetodoDepreciacion=false;
	public MetodoDepreciacionSessionBean metododepreciacionSessionBean;

	public ResponsableActivoFijoBeanSwingJInternalFrame responsableactivofijoBeanSwingJInternalFrame=null;
	public ResponsableActivoFijoBeanSwingJInternalFrame responsableactivofijoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteResponsableActivoFijo=false;
	public ResponsableActivoFijoSessionBean responsableactivofijoSessionBean;

	public DepreciacionActivoFijoBeanSwingJInternalFrame depreciacionactivofijoBeanSwingJInternalFrame=null;
	public DepreciacionActivoFijoBeanSwingJInternalFrame depreciacionactivofijoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDepreciacionActivoFijo=false;
	public DepreciacionActivoFijoSessionBean depreciacionactivofijoSessionBean;

	public GastoDepreciacionCentroCostoBeanSwingJInternalFrame gastodepreciacioncentrocostoBeanSwingJInternalFrame=null;
	public GastoDepreciacionCentroCostoBeanSwingJInternalFrame gastodepreciacioncentrocostoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteGastoDepreciacionCentroCosto=false;
	public GastoDepreciacionCentroCostoSessionBean gastodepreciacioncentrocostoSessionBean;

	public ParteActivoFijoBeanSwingJInternalFrame parteactivofijoBeanSwingJInternalFrame=null;
	public ParteActivoFijoBeanSwingJInternalFrame parteactivofijoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParteActivoFijo=false;
	public ParteActivoFijoSessionBean parteactivofijoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public DetalleGrupoActivoFijoSessionBean detallegrupoactivofijoSessionBean;
	public SubGrupoActivoFijoSessionBean subgrupoactivofijoSessionBean;
	public TipoRamoActivoFijoSessionBean tiporamoactivofijoSessionBean;
	public TipoActivoFijoEmpresaSessionBean tipoactivofijoempresaSessionBean;
	public TipoDepreciacionEmpresaSessionBean tipodepreciacionempresaSessionBean;
	public EstadoActivoFijoSessionBean estadoactivofijoSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public PartidaPresuSessionBean partidapresuSessionBean;	
	
	public DetalleActivoFijoLogic detalleactivofijoLogic;
	
	public JScrollPane jScrollPanelDatosDetalleActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionDetalleActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralDetalleActivoFijo;
	
	protected JPanel jPanelCamposDetalleActivoFijo;    
	protected JPanel jPanelCamposOcultosDetalleActivoFijo;    	
	protected JPanel jPanelAccionesDetalleActivoFijo;
	protected JPanel jPanelAccionesFormularioDetalleActivoFijo;
    
	
	
	protected Integer iXPanelCamposDetalleActivoFijo=0;
	protected Integer iYPanelCamposDetalleActivoFijo=0;
	
	protected Integer iXPanelCamposOcultosDetalleActivoFijo=0;
	protected Integer iYPanelCamposOcultosDetalleActivoFijo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleActivoFijo;
	public JButton jButtonModificarDetalleActivoFijo;
	public JButton jButtonActualizarDetalleActivoFijo;
    public JButton jButtonEliminarDetalleActivoFijo;
	public JButton jButtonCancelarDetalleActivoFijo;
    public JButton jButtonGuardarCambiosDetalleActivoFijo;
	public JButton jButtonGuardarCambiosTablaDetalleActivoFijo;
	protected JButton jButtonCerrarDetalleActivoFijo;
	
	
	protected JButton jButtonProcesarInformacionDetalleActivoFijo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleActivoFijo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleActivoFijo;
	protected JButton jButtonModificarToolBarDetalleActivoFijo;
	protected JButton jButtonActualizarToolBarDetalleActivoFijo;
    protected JButton jButtonEliminarToolBarDetalleActivoFijo;
	protected JButton jButtonCancelarToolBarDetalleActivoFijo;
    protected JButton jButtonGuardarCambiosToolBarDetalleActivoFijo;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleActivoFijo;
	protected JButton jButtonCerrarToolBarDetalleActivoFijo;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleActivoFijo;
	protected JMenuItem jMenuItemModificarDetalleActivoFijo;
	protected JMenuItem jMenuItemActualizarDetalleActivoFijo;
    protected JMenuItem jMenuItemEliminarDetalleActivoFijo;
	protected JMenuItem jMenuItemCancelarDetalleActivoFijo;
    protected JMenuItem jMenuItemGuardarCambiosDetalleActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleActivoFijo;
	protected JMenuItem jMenuItemCerrarDetalleActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarDetalleActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleActivoFijo;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarDetalleActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleActivoFijo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleActivoFijo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleActivoFijo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleActivoFijo;
	public JLabel jLabelIdDetalleActivoFijo;
	public JLabel jLabelidDetalleActivoFijo;
	public JButton jButtonidDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoDetalleActivoFijo;
	public JLabel jLabelcodigoDetalleActivoFijo;
	public JTextField jTextFieldcodigoDetalleActivoFijo;
	public JButton jButtoncodigoDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelnombreDetalleActivoFijo;
	public JLabel jLabelnombreDetalleActivoFijo;
	public JTextArea jTextAreanombreDetalleActivoFijo;
	public JScrollPane jscrollPanenombreDetalleActivoFijo;
	public JButton jButtonnombreDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelserieDetalleActivoFijo;
	public JLabel jLabelserieDetalleActivoFijo;
	public JTextField jTextFieldserieDetalleActivoFijo;
	public JButton jButtonserieDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_compraDetalleActivoFijo;
	public JLabel jLabelfecha_compraDetalleActivoFijo;
	//public JFormattedTextField jDateChooserfecha_compraDetalleActivoFijo;

	public JDateChooser jDateChooserfecha_compraDetalleActivoFijo;
	public JButton jButtonfecha_compraDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_mantenimientoDetalleActivoFijo;
	public JLabel jLabelfecha_mantenimientoDetalleActivoFijo;
	//public JFormattedTextField jDateChooserfecha_mantenimientoDetalleActivoFijo;

	public JDateChooser jDateChooserfecha_mantenimientoDetalleActivoFijo;
	public JButton jButtonfecha_mantenimientoDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_correccionDetalleActivoFijo;
	public JLabel jLabelfecha_correccionDetalleActivoFijo;
	//public JFormattedTextField jDateChooserfecha_correccionDetalleActivoFijo;

	public JDateChooser jDateChooserfecha_correccionDetalleActivoFijo;
	public JButton jButtonfecha_correccionDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_depreciacionDetalleActivoFijo;
	public JLabel jLabelfecha_depreciacionDetalleActivoFijo;
	//public JFormattedTextField jDateChooserfecha_depreciacionDetalleActivoFijo;

	public JDateChooser jDateChooserfecha_depreciacionDetalleActivoFijo;
	public JButton jButtonfecha_depreciacionDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelclaveDetalleActivoFijo;
	public JLabel jLabelclaveDetalleActivoFijo;
	public JTextField jTextFieldclaveDetalleActivoFijo;
	public JButton jButtonclaveDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelmarcaDetalleActivoFijo;
	public JLabel jLabelmarcaDetalleActivoFijo;
	public JTextArea jTextAreamarcaDetalleActivoFijo;
	public JScrollPane jscrollPanemarcaDetalleActivoFijo;
	public JButton jButtonmarcaDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelmodeloDetalleActivoFijo;
	public JLabel jLabelmodeloDetalleActivoFijo;
	public JTextArea jTextAreamodeloDetalleActivoFijo;
	public JScrollPane jscrollPanemodeloDetalleActivoFijo;
	public JButton jButtonmodeloDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelcolorDetalleActivoFijo;
	public JLabel jLabelcolorDetalleActivoFijo;
	public JTextField jTextFieldcolorDetalleActivoFijo;
	public JButton jButtoncolorDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelfechaDetalleActivoFijo;
	public JLabel jLabelfechaDetalleActivoFijo;
	//public JFormattedTextField jDateChooserfechaDetalleActivoFijo;

	public JDateChooser jDateChooserfechaDetalleActivoFijo;
	public JButton jButtonfechaDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_utilDetalleActivoFijo;
	public JLabel jLabelvalor_utilDetalleActivoFijo;
	public JTextField jTextFieldvalor_utilDetalleActivoFijo;
	public JButton jButtonvalor_utilDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelcosto_de_compraDetalleActivoFijo;
	public JLabel jLabelcosto_de_compraDetalleActivoFijo;
	public JTextField jTextFieldcosto_de_compraDetalleActivoFijo;
	public JButton jButtoncosto_de_compraDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelvida_utilDetalleActivoFijo;
	public JLabel jLabelvida_utilDetalleActivoFijo;
	public JTextField jTextFieldvida_utilDetalleActivoFijo;
	public JButton jButtonvida_utilDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_residualDetalleActivoFijo;
	public JLabel jLabelvalor_residualDetalleActivoFijo;
	public JTextField jTextFieldvalor_residualDetalleActivoFijo;
	public JButton jButtonvalor_residualDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetalleActivoFijo;
	public JLabel jLabelcantidadDetalleActivoFijo;
	public JTextField jTextFieldcantidadDetalleActivoFijo;
	public JButton jButtoncantidadDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_propietarioDetalleActivoFijo;
	public JLabel jLabelnombre_propietarioDetalleActivoFijo;
	public JTextArea jTextAreanombre_propietarioDetalleActivoFijo;
	public JScrollPane jscrollPanenombre_propietarioDetalleActivoFijo;
	public JButton jButtonnombre_propietarioDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelresponsableDetalleActivoFijo;
	public JLabel jLabelresponsableDetalleActivoFijo;
	public JTextArea jTextArearesponsableDetalleActivoFijo;
	public JScrollPane jscrollPaneresponsableDetalleActivoFijo;
	public JButton jButtonresponsableDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelpath_fotoDetalleActivoFijo;
	public JLabel jLabelpath_fotoDetalleActivoFijo;
	public JTextArea jTextAreapath_fotoDetalleActivoFijo;
	public JScrollPane jscrollPanepath_fotoDetalleActivoFijo;
	public JButton jButtonpath_fotoDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteDetalleActivoFijo;
	public JLabel jLabelnumero_comprobanteDetalleActivoFijo;
	public JTextField jTextFieldnumero_comprobanteDetalleActivoFijo;
	public JButton jButtonnumero_comprobanteDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelreferenciaDetalleActivoFijo;
	public JLabel jLabelreferenciaDetalleActivoFijo;
	public JTextArea jTextAreareferenciaDetalleActivoFijo;
	public JScrollPane jscrollPanereferenciaDetalleActivoFijo;
	public JButton jButtonreferenciaDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_cotizacionDetalleActivoFijo;
	public JLabel jLabelvalor_cotizacionDetalleActivoFijo;
	public JTextField jTextFieldvalor_cotizacionDetalleActivoFijo;
	public JButton jButtonvalor_cotizacionDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelcon_partesDetalleActivoFijo;
	public JLabel jLabelcon_partesDetalleActivoFijo;
	public JCheckBox jCheckBoxcon_partesDetalleActivoFijo;
	public JButton jButtoncon_partesDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelcon_garantiaDetalleActivoFijo;
	public JLabel jLabelcon_garantiaDetalleActivoFijo;
	public JCheckBox jCheckBoxcon_garantiaDetalleActivoFijo;
	public JButton jButtoncon_garantiaDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelcon_existenciaDetalleActivoFijo;
	public JLabel jLabelcon_existenciaDetalleActivoFijo;
	public JCheckBox jCheckBoxcon_existenciaDetalleActivoFijo;
	public JButton jButtoncon_existenciaDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_bajaDetalleActivoFijo;
	public JLabel jLabelfecha_bajaDetalleActivoFijo;
	//public JFormattedTextField jDateChooserfecha_bajaDetalleActivoFijo;

	public JDateChooser jDateChooserfecha_bajaDetalleActivoFijo;
	public JButton jButtonfecha_bajaDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelpath_foto2DetalleActivoFijo;
	public JLabel jLabelpath_foto2DetalleActivoFijo;
	public JTextArea jTextAreapath_foto2DetalleActivoFijo;
	public JScrollPane jscrollPanepath_foto2DetalleActivoFijo;
	public JButton jButtonpath_foto2DetalleActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleActivoFijo;
	public JLabel jLabelid_empresaDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleActivoFijo;
	public JButton jButtonid_empresaDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_empresaDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleActivoFijo;
	public JLabel jLabelid_sucursalDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleActivoFijo;
	public JButton jButtonid_sucursalDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_sucursalDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_grupo_activo_fijoDetalleActivoFijo;
	public JLabel jLabelid_detalle_grupo_activo_fijoDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_grupo_activo_fijoDetalleActivoFijo;
	public JButton jButtonid_detalle_grupo_activo_fijoDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_sub_grupo_activo_fijoDetalleActivoFijo;
	public JLabel jLabelid_sub_grupo_activo_fijoDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_grupo_activo_fijoDetalleActivoFijo;
	public JButton jButtonid_sub_grupo_activo_fijoDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_sub_grupo_activo_fijoDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_sub_grupo_activo_fijoDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_ramo_activo_fijoDetalleActivoFijo;
	public JLabel jLabelid_tipo_ramo_activo_fijoDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_ramo_activo_fijoDetalleActivoFijo;
	public JButton jButtonid_tipo_ramo_activo_fijoDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_activo_fijo_empresaDetalleActivoFijo;
	public JLabel jLabelid_tipo_activo_fijo_empresaDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_activo_fijo_empresaDetalleActivoFijo;
	public JButton jButtonid_tipo_activo_fijo_empresaDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_depreciacion_empresaDetalleActivoFijo;
	public JLabel jLabelid_tipo_depreciacion_empresaDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_depreciacion_empresaDetalleActivoFijo;
	public JButton jButtonid_tipo_depreciacion_empresaDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_tipo_depreciacion_empresaDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_depreciacion_empresaDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_activo_fijoDetalleActivoFijo;
	public JLabel jLabelid_estado_activo_fijoDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_activo_fijoDetalleActivoFijo;
	public JButton jButtonid_estado_activo_fijoDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_estado_activo_fijoDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_estado_activo_fijoDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteDetalleActivoFijo;
	public JLabel jLabelid_clienteDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteDetalleActivoFijo;
	public JButton jButtonid_clienteDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_clienteDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_clienteDetalleActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_partida_presuDetalleActivoFijo;
	public JLabel jLabelid_partida_presuDetalleActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_partida_presuDetalleActivoFijo;
	public JButton jButtonid_partida_presuDetalleActivoFijo= new JButtonMe();
	public JButton jButtonid_partida_presuDetalleActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_partida_presuDetalleActivoFijoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleActivoFijo;
	
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
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=1496;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleActivoFijoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleActivoFijo=new JPanel();
				this.jPanelAccionesFormularioDetalleActivoFijo=new JPanel();
				this.jmenuBarDetalleDetalleActivoFijo=new JMenuBar();
				this.jTtoolBarDetalleDetalleActivoFijo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleActivoFijoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleActivoFijoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleActivoFijoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleActivoFijoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleActivoFijoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleActivoFijo() {
		return this.jButtonActualizarToolBarDetalleActivoFijo;
	}
	
	public JButton getjButtonEliminarToolBarDetalleActivoFijo() {
		return this.jButtonEliminarToolBarDetalleActivoFijo;
	}
	
	public JButton getjButtonCancelarToolBarDetalleActivoFijo() {
		return this.jButtonCancelarToolBarDetalleActivoFijo;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleActivoFijo() {
		return this.jButtonProcesarInformacionDetalleActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleActivoFijo)	{
		this.jButtonProcesarInformacionDetalleActivoFijo = jButtonProcesarInformacionDetalleActivoFijo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleActivoFijo() {
		return this.jComboBoxTiposAccionesDetalleActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleActivoFijo(
			JComboBox jComboBoxTiposRelacionesDetalleActivoFijo) {
		this.jComboBoxTiposRelacionesDetalleActivoFijo = jComboBoxTiposRelacionesDetalleActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleActivoFijo(
			JComboBox jComboBoxTiposAccionesDetalleActivoFijo) {
		this.jComboBoxTiposAccionesDetalleActivoFijo = jComboBoxTiposAccionesDetalleActivoFijo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleActivoFijo() {
		return this.jComboBoxTiposAccionesFormularioDetalleActivoFijo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleActivoFijo(
			JComboBox jComboBoxTiposAccionesFormularioDetalleActivoFijo) {
		this.jComboBoxTiposAccionesFormularioDetalleActivoFijo = jComboBoxTiposAccionesFormularioDetalleActivoFijo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
		
		this.detalleactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleactivofijoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.mantenimientoactivofijoSessionBean=new MantenimientoActivoFijoSessionBean();
		//this.serviciotransporteSessionBean=new ServicioTransporteSessionBean();
		//this.movimientoactivofijoSessionBean=new MovimientoActivoFijoSessionBean();
		//this.vehiculoSessionBean=new VehiculoSessionBean();
		//this.metododepreciacionSessionBean=new MetodoDepreciacionSessionBean();
		//this.responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
		//this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
		//this.gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
		//this.parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 3850) {
			iWidth=3850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleActivoFijo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleActivoFijo=new JButtonMe();
				this.jButtonModificarToolBarDetalleActivoFijo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleActivoFijo,this.jTtoolBarDetalleDetalleActivoFijo,
							"actualizar","actualizar","Actualizar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleActivoFijo,this.jTtoolBarDetalleDetalleActivoFijo,
							"eliminar","eliminar","Eliminar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleActivoFijo,this.jTtoolBarDetalleDetalleActivoFijo,
							"cancelar","cancelar","Cancelar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleActivoFijo,this.jTtoolBarDetalleDetalleActivoFijo,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleActivoFijo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleActivoFijo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleActivoFijo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleActivoFijo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleActivoFijo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleActivoFijo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleActivoFijo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleActivoFijo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleActivoFijo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleActivoFijo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleActivoFijo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleActivoFijo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleActivoFijo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleActivoFijo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleActivoFijo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleActivoFijo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleActivoFijo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleActivoFijo.add(this.jMenuItemDetalleCerrarDetalleActivoFijo);
		
		this.jmenuDetalleAccionesDetalleActivoFijo.add(this.jMenuItemActualizarDetalleActivoFijo);
		this.jmenuDetalleAccionesDetalleActivoFijo.add(this.jMenuItemEliminarDetalleActivoFijo);
		this.jmenuDetalleAccionesDetalleActivoFijo.add(this.jMenuItemCancelarDetalleActivoFijo);		
		
		//this.jmenuDetalleDatosDetalleActivoFijo.add(this.jMenuItemDetalleAbrirOrderByDetalleActivoFijo);				
		this.jmenuDetalleDatosDetalleActivoFijo.add(this.jMenuItemDetalleMostarOcultarDetalleActivoFijo);				
				
		//this.jmenuDetalleAccionesDetalleActivoFijo.add(this.jMenuItemGuardarCambiosDetalleActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleActivoFijo.add(this.jmenuDetalleArchivoDetalleActivoFijo);		
		this.jmenuBarDetalleDetalleActivoFijo.add(this.jmenuDetalleAccionesDetalleActivoFijo);		
		this.jmenuBarDetalleDetalleActivoFijo.add(this.jmenuDetalleDatosDetalleActivoFijo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleDetalleActivoFijo.add(this.jmenuDetalleDetalleActivoFijo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleActivoFijo);				
	}
	
	
	public void inicializarElementosCamposDetalleActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleActivoFijo = new JLabelMe();
		jLabelIdDetalleActivoFijo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleActivoFijo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleActivoFijo= new GridBagLayout();

		this.jPanelidDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);

		jLabelidDetalleActivoFijo = new JLabel();
		jLabelidDetalleActivoFijo.setText("Id");

		jLabelidDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoDetalleActivoFijo = new JLabelMe();
		this.jLabelcodigoDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoDetalleActivoFijo.setToolTipText("Codigo");
		this.jLabelcodigoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelcodigoDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextFieldcodigoDetalleActivoFijo= new JTextFieldMe();

		jTextFieldcodigoDetalleActivoFijo.setEnabled(false);
		jTextFieldcodigoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtoncodigoDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoDetalleActivoFijoBusqueda.setText("U");
		this.jButtoncodigoDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelnombreDetalleActivoFijo = new JLabelMe();
		this.jLabelnombreDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreDetalleActivoFijo.setToolTipText("Nombre");
		this.jLabelnombreDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelnombreDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextAreanombreDetalleActivoFijo= new JTextAreaMe();
		jTextAreanombreDetalleActivoFijo.setEnabled(false);
		jTextAreanombreDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetalleActivoFijo.setLineWrap(true);
		jTextAreanombreDetalleActivoFijo.setWrapStyleWord(true);
		jTextAreanombreDetalleActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreDetalleActivoFijo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreDetalleActivoFijo = new JScrollPane(jTextAreanombreDetalleActivoFijo);
		jscrollPanenombreDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonnombreDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreDetalleActivoFijoBusqueda.setText("U");
		this.jButtonnombreDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelserieDetalleActivoFijo = new JLabelMe();
		this.jLabelserieDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_SERIE+" : *");
		this.jLabelserieDetalleActivoFijo.setToolTipText("Serie");
		this.jLabelserieDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelserieDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelserieDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelserieDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_SERIE);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelserieDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextFieldserieDetalleActivoFijo= new JTextFieldMe();

		jTextFieldserieDetalleActivoFijo.setEnabled(false);
		jTextFieldserieDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserieDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonserieDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonserieDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonserieDetalleActivoFijoBusqueda.setText("U");
		this.jButtonserieDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonserieDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonserieDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldserieDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldserieDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"serieDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonserieDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_compraDetalleActivoFijo = new JLabelMe();
		this.jLabelfecha_compraDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_FECHACOMPRA+" : *");
		this.jLabelfecha_compraDetalleActivoFijo.setToolTipText("Fecha Compra");
		this.jLabelfecha_compraDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_compraDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_compraDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_compraDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_FECHACOMPRA);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelfecha_compraDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		//jFormattedTextFieldfecha_compraDetalleActivoFijo= new JFormattedTextFieldMe();

		jDateChooserfecha_compraDetalleActivoFijo= new JDateChooser();
		jDateChooserfecha_compraDetalleActivoFijo.setEnabled(false);
		jDateChooserfecha_compraDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_compraDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_compraDetalleActivoFijo.setDate(new Date());
		jDateChooserfecha_compraDetalleActivoFijo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_compraDetalleActivoFijo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_compraDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonfecha_compraDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_compraDetalleActivoFijoBusqueda.setText("U");
		this.jButtonfecha_compraDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_compraDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_compraDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_compraDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_compraDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_compraDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_compraDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_mantenimientoDetalleActivoFijo = new JLabelMe();
		this.jLabelfecha_mantenimientoDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_FECHAMANTENIMIENTO+" : *");
		this.jLabelfecha_mantenimientoDetalleActivoFijo.setToolTipText("Fecha Mantenimiento");
		this.jLabelfecha_mantenimientoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_mantenimientoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_mantenimientoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_mantenimientoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_mantenimientoDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_mantenimientoDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_FECHAMANTENIMIENTO);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelfecha_mantenimientoDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		//jFormattedTextFieldfecha_mantenimientoDetalleActivoFijo= new JFormattedTextFieldMe();

		jDateChooserfecha_mantenimientoDetalleActivoFijo= new JDateChooser();
		jDateChooserfecha_mantenimientoDetalleActivoFijo.setEnabled(false);
		jDateChooserfecha_mantenimientoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_mantenimientoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_mantenimientoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_mantenimientoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_mantenimientoDetalleActivoFijo.setDate(new Date());
		jDateChooserfecha_mantenimientoDetalleActivoFijo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_mantenimientoDetalleActivoFijo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_mantenimientoDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonfecha_mantenimientoDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_mantenimientoDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_mantenimientoDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_mantenimientoDetalleActivoFijoBusqueda.setText("U");
		this.jButtonfecha_mantenimientoDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_mantenimientoDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_mantenimientoDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_mantenimientoDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_mantenimientoDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_mantenimientoDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_mantenimientoDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_correccionDetalleActivoFijo = new JLabelMe();
		this.jLabelfecha_correccionDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_FECHACORRECCION+" : *");
		this.jLabelfecha_correccionDetalleActivoFijo.setToolTipText("Fecha Correccion");
		this.jLabelfecha_correccionDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_correccionDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_correccionDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_correccionDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_correccionDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_correccionDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_FECHACORRECCION);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelfecha_correccionDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		//jFormattedTextFieldfecha_correccionDetalleActivoFijo= new JFormattedTextFieldMe();

		jDateChooserfecha_correccionDetalleActivoFijo= new JDateChooser();
		jDateChooserfecha_correccionDetalleActivoFijo.setEnabled(false);
		jDateChooserfecha_correccionDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_correccionDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_correccionDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_correccionDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_correccionDetalleActivoFijo.setDate(new Date());
		jDateChooserfecha_correccionDetalleActivoFijo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_correccionDetalleActivoFijo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_correccionDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonfecha_correccionDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_correccionDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_correccionDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_correccionDetalleActivoFijoBusqueda.setText("U");
		this.jButtonfecha_correccionDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_correccionDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_correccionDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_correccionDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_correccionDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_correccionDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_correccionDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_depreciacionDetalleActivoFijo = new JLabelMe();
		this.jLabelfecha_depreciacionDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_FECHADEPRECIACION+" : *");
		this.jLabelfecha_depreciacionDetalleActivoFijo.setToolTipText("Fecha Depreciacion");
		this.jLabelfecha_depreciacionDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_depreciacionDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_depreciacionDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_depreciacionDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_depreciacionDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_depreciacionDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_FECHADEPRECIACION);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelfecha_depreciacionDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		//jFormattedTextFieldfecha_depreciacionDetalleActivoFijo= new JFormattedTextFieldMe();

		jDateChooserfecha_depreciacionDetalleActivoFijo= new JDateChooser();
		jDateChooserfecha_depreciacionDetalleActivoFijo.setEnabled(false);
		jDateChooserfecha_depreciacionDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_depreciacionDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_depreciacionDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_depreciacionDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_depreciacionDetalleActivoFijo.setDate(new Date());
		jDateChooserfecha_depreciacionDetalleActivoFijo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_depreciacionDetalleActivoFijo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_depreciacionDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonfecha_depreciacionDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_depreciacionDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_depreciacionDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_depreciacionDetalleActivoFijoBusqueda.setText("U");
		this.jButtonfecha_depreciacionDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_depreciacionDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_depreciacionDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_depreciacionDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_depreciacionDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_depreciacionDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_depreciacionDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelclaveDetalleActivoFijo = new JLabelMe();
		this.jLabelclaveDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_CLAVE+" : *");
		this.jLabelclaveDetalleActivoFijo.setToolTipText("Clave");
		this.jLabelclaveDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelclaveDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelclaveDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelclaveDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_CLAVE);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelclaveDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextFieldclaveDetalleActivoFijo= new JTextFieldMe();

		jTextFieldclaveDetalleActivoFijo.setEnabled(false);
		jTextFieldclaveDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldclaveDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonclaveDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonclaveDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonclaveDetalleActivoFijoBusqueda.setText("U");
		this.jButtonclaveDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonclaveDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonclaveDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldclaveDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldclaveDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"claveDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonclaveDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelmarcaDetalleActivoFijo = new JLabelMe();
		this.jLabelmarcaDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_MARCA+" : *");
		this.jLabelmarcaDetalleActivoFijo.setToolTipText("Marca");
		this.jLabelmarcaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmarcaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmarcaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmarcaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmarcaDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmarcaDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_MARCA);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelmarcaDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextAreamarcaDetalleActivoFijo= new JTextAreaMe();
		jTextAreamarcaDetalleActivoFijo.setEnabled(false);
		jTextAreamarcaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamarcaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamarcaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamarcaDetalleActivoFijo.setLineWrap(true);
		jTextAreamarcaDetalleActivoFijo.setWrapStyleWord(true);
		jTextAreamarcaDetalleActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamarcaDetalleActivoFijo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreamarcaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemarcaDetalleActivoFijo = new JScrollPane(jTextAreamarcaDetalleActivoFijo);
		jscrollPanemarcaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemarcaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemarcaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonmarcaDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonmarcaDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmarcaDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmarcaDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmarcaDetalleActivoFijoBusqueda.setText("U");
		this.jButtonmarcaDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmarcaDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmarcaDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamarcaDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamarcaDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"marcaDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmarcaDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelmodeloDetalleActivoFijo = new JLabelMe();
		this.jLabelmodeloDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_MODELO+" : *");
		this.jLabelmodeloDetalleActivoFijo.setToolTipText("Modelo");
		this.jLabelmodeloDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmodeloDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmodeloDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmodeloDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmodeloDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmodeloDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_MODELO);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelmodeloDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextAreamodeloDetalleActivoFijo= new JTextAreaMe();
		jTextAreamodeloDetalleActivoFijo.setEnabled(false);
		jTextAreamodeloDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamodeloDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamodeloDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamodeloDetalleActivoFijo.setLineWrap(true);
		jTextAreamodeloDetalleActivoFijo.setWrapStyleWord(true);
		jTextAreamodeloDetalleActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamodeloDetalleActivoFijo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreamodeloDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemodeloDetalleActivoFijo = new JScrollPane(jTextAreamodeloDetalleActivoFijo);
		jscrollPanemodeloDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemodeloDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemodeloDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonmodeloDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonmodeloDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmodeloDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmodeloDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmodeloDetalleActivoFijoBusqueda.setText("U");
		this.jButtonmodeloDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmodeloDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmodeloDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamodeloDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamodeloDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"modeloDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmodeloDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelcolorDetalleActivoFijo = new JLabelMe();
		this.jLabelcolorDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_COLOR+" : *");
		this.jLabelcolorDetalleActivoFijo.setToolTipText("Color");
		this.jLabelcolorDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcolorDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcolorDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcolorDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcolorDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcolorDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_COLOR);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelcolorDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextFieldcolorDetalleActivoFijo= new JTextFieldMe();

		jTextFieldcolorDetalleActivoFijo.setEnabled(false);
		jTextFieldcolorDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcolorDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcolorDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcolorDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncolorDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtoncolorDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncolorDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncolorDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncolorDetalleActivoFijoBusqueda.setText("U");
		this.jButtoncolorDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncolorDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncolorDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcolorDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcolorDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"colorDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncolorDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelfechaDetalleActivoFijo = new JLabelMe();
		this.jLabelfechaDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaDetalleActivoFijo.setToolTipText("Fecha");
		this.jLabelfechaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelfechaDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		//jFormattedTextFieldfechaDetalleActivoFijo= new JFormattedTextFieldMe();

		jDateChooserfechaDetalleActivoFijo= new JDateChooser();
		jDateChooserfechaDetalleActivoFijo.setEnabled(false);
		jDateChooserfechaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaDetalleActivoFijo.setDate(new Date());
		jDateChooserfechaDetalleActivoFijo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaDetalleActivoFijo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonfechaDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaDetalleActivoFijoBusqueda.setText("U");
		this.jButtonfechaDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_utilDetalleActivoFijo = new JLabelMe();
		this.jLabelvalor_utilDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_VALORUTIL+" : *");
		this.jLabelvalor_utilDetalleActivoFijo.setToolTipText("Valor Util");
		this.jLabelvalor_utilDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_utilDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_utilDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_utilDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_utilDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_utilDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_VALORUTIL);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelvalor_utilDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextFieldvalor_utilDetalleActivoFijo= new JTextFieldMe();
		jTextFieldvalor_utilDetalleActivoFijo.setEnabled(false);
		jTextFieldvalor_utilDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_utilDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_utilDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_utilDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_utilDetalleActivoFijo.setText("0.0");

		this.jButtonvalor_utilDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonvalor_utilDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_utilDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_utilDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_utilDetalleActivoFijoBusqueda.setText("U");
		this.jButtonvalor_utilDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_utilDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_utilDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_utilDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_utilDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_utilDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_utilDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelcosto_de_compraDetalleActivoFijo = new JLabelMe();
		this.jLabelcosto_de_compraDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_COSTODECOMPRA+" : *");
		this.jLabelcosto_de_compraDetalleActivoFijo.setToolTipText("Costo De Compra");
		this.jLabelcosto_de_compraDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcosto_de_compraDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcosto_de_compraDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_de_compraDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_de_compraDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_de_compraDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_COSTODECOMPRA);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelcosto_de_compraDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextFieldcosto_de_compraDetalleActivoFijo= new JTextFieldMe();
		jTextFieldcosto_de_compraDetalleActivoFijo.setEnabled(false);
		jTextFieldcosto_de_compraDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_de_compraDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_de_compraDetalleActivoFijo.setText("0.0");

		this.jButtoncosto_de_compraDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtoncosto_de_compraDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_de_compraDetalleActivoFijoBusqueda.setText("U");
		this.jButtoncosto_de_compraDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_de_compraDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_de_compraDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_de_compraDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_de_compraDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_de_compraDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_de_compraDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelvida_utilDetalleActivoFijo = new JLabelMe();
		this.jLabelvida_utilDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_VIDAUTIL+" : *");
		this.jLabelvida_utilDetalleActivoFijo.setToolTipText("Vida Util");
		this.jLabelvida_utilDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvida_utilDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvida_utilDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvida_utilDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_VIDAUTIL);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelvida_utilDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextFieldvida_utilDetalleActivoFijo= new JTextFieldMe();
		jTextFieldvida_utilDetalleActivoFijo.setEnabled(false);
		jTextFieldvida_utilDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvida_utilDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvida_utilDetalleActivoFijo.setText("0.0");

		this.jButtonvida_utilDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonvida_utilDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvida_utilDetalleActivoFijoBusqueda.setText("U");
		this.jButtonvida_utilDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvida_utilDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvida_utilDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvida_utilDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvida_utilDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"vida_utilDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvida_utilDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_residualDetalleActivoFijo = new JLabelMe();
		this.jLabelvalor_residualDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_VALORRESIDUAL+" : *");
		this.jLabelvalor_residualDetalleActivoFijo.setToolTipText("Valor Residual");
		this.jLabelvalor_residualDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_residualDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_residualDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_residualDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_residualDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_residualDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_VALORRESIDUAL);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelvalor_residualDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextFieldvalor_residualDetalleActivoFijo= new JTextFieldMe();
		jTextFieldvalor_residualDetalleActivoFijo.setEnabled(false);
		jTextFieldvalor_residualDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_residualDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_residualDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_residualDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_residualDetalleActivoFijo.setText("0.0");

		this.jButtonvalor_residualDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonvalor_residualDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_residualDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_residualDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_residualDetalleActivoFijoBusqueda.setText("U");
		this.jButtonvalor_residualDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_residualDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_residualDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_residualDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_residualDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_residualDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_residualDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelcantidadDetalleActivoFijo = new JLabelMe();
		this.jLabelcantidadDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetalleActivoFijo.setToolTipText("Cantidad");
		this.jLabelcantidadDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelcantidadDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextFieldcantidadDetalleActivoFijo= new JTextFieldMe();
		jTextFieldcantidadDetalleActivoFijo.setEnabled(false);
		jTextFieldcantidadDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetalleActivoFijo.setText("0");

		this.jButtoncantidadDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtoncantidadDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetalleActivoFijoBusqueda.setText("U");
		this.jButtoncantidadDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelnombre_propietarioDetalleActivoFijo = new JLabelMe();
		this.jLabelnombre_propietarioDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_NOMBREPROPIETARIO+" : *");
		this.jLabelnombre_propietarioDetalleActivoFijo.setToolTipText("Nombre Propietario");
		this.jLabelnombre_propietarioDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_propietarioDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_propietarioDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_propietarioDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_propietarioDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_propietarioDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_NOMBREPROPIETARIO);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelnombre_propietarioDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextAreanombre_propietarioDetalleActivoFijo= new JTextAreaMe();
		jTextAreanombre_propietarioDetalleActivoFijo.setEnabled(false);
		jTextAreanombre_propietarioDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_propietarioDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_propietarioDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_propietarioDetalleActivoFijo.setLineWrap(true);
		jTextAreanombre_propietarioDetalleActivoFijo.setWrapStyleWord(true);
		jTextAreanombre_propietarioDetalleActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_propietarioDetalleActivoFijo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_propietarioDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_propietarioDetalleActivoFijo = new JScrollPane(jTextAreanombre_propietarioDetalleActivoFijo);
		jscrollPanenombre_propietarioDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_propietarioDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_propietarioDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_propietarioDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonnombre_propietarioDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_propietarioDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_propietarioDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_propietarioDetalleActivoFijoBusqueda.setText("U");
		this.jButtonnombre_propietarioDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_propietarioDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_propietarioDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_propietarioDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_propietarioDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_propietarioDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_propietarioDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelresponsableDetalleActivoFijo = new JLabelMe();
		this.jLabelresponsableDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_RESPONSABLE+" : *");
		this.jLabelresponsableDetalleActivoFijo.setToolTipText("Responsable Propietario");
		this.jLabelresponsableDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelresponsableDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelresponsableDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelresponsableDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelresponsableDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelresponsableDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_RESPONSABLE);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelresponsableDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextArearesponsableDetalleActivoFijo= new JTextAreaMe();
		jTextArearesponsableDetalleActivoFijo.setEnabled(false);
		jTextArearesponsableDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableDetalleActivoFijo.setLineWrap(true);
		jTextArearesponsableDetalleActivoFijo.setWrapStyleWord(true);
		jTextArearesponsableDetalleActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearesponsableDetalleActivoFijo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextArearesponsableDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneresponsableDetalleActivoFijo = new JScrollPane(jTextArearesponsableDetalleActivoFijo);
		jscrollPaneresponsableDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneresponsableDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneresponsableDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonresponsableDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonresponsableDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsableDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsableDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonresponsableDetalleActivoFijoBusqueda.setText("U");
		this.jButtonresponsableDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonresponsableDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonresponsableDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearesponsableDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearesponsableDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"responsableDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonresponsableDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelpath_fotoDetalleActivoFijo = new JLabelMe();
		this.jLabelpath_fotoDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_PATHFOTO+" : *");
		this.jLabelpath_fotoDetalleActivoFijo.setToolTipText("Path Foto");
		this.jLabelpath_fotoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpath_fotoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpath_fotoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpath_fotoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpath_fotoDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpath_fotoDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_PATHFOTO);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelpath_fotoDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextAreapath_fotoDetalleActivoFijo= new JTextAreaMe();
		jTextAreapath_fotoDetalleActivoFijo.setEnabled(false);
		jTextAreapath_fotoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_fotoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_fotoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_fotoDetalleActivoFijo.setLineWrap(true);
		jTextAreapath_fotoDetalleActivoFijo.setWrapStyleWord(true);
		jTextAreapath_fotoDetalleActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreapath_fotoDetalleActivoFijo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreapath_fotoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanepath_fotoDetalleActivoFijo = new JScrollPane(jTextAreapath_fotoDetalleActivoFijo);
		jscrollPanepath_fotoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepath_fotoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepath_fotoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonpath_fotoDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonpath_fotoDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpath_fotoDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpath_fotoDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpath_fotoDetalleActivoFijoBusqueda.setText("U");
		this.jButtonpath_fotoDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpath_fotoDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpath_fotoDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreapath_fotoDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreapath_fotoDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"path_fotoDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpath_fotoDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteDetalleActivoFijo = new JLabelMe();
		this.jLabelnumero_comprobanteDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteDetalleActivoFijo.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelnumero_comprobanteDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextFieldnumero_comprobanteDetalleActivoFijo= new JTextFieldMe();

		jTextFieldnumero_comprobanteDetalleActivoFijo.setEnabled(false);
		jTextFieldnumero_comprobanteDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteDetalleActivoFijoBusqueda.setText("U");
		this.jButtonnumero_comprobanteDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelreferenciaDetalleActivoFijo = new JLabelMe();
		this.jLabelreferenciaDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_REFERENCIA+" : *");
		this.jLabelreferenciaDetalleActivoFijo.setToolTipText("Referencia");
		this.jLabelreferenciaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelreferenciaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelreferenciaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelreferenciaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelreferenciaDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelreferenciaDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_REFERENCIA);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelreferenciaDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextAreareferenciaDetalleActivoFijo= new JTextAreaMe();
		jTextAreareferenciaDetalleActivoFijo.setEnabled(false);
		jTextAreareferenciaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreareferenciaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreareferenciaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreareferenciaDetalleActivoFijo.setLineWrap(true);
		jTextAreareferenciaDetalleActivoFijo.setWrapStyleWord(true);
		jTextAreareferenciaDetalleActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreareferenciaDetalleActivoFijo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreareferenciaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanereferenciaDetalleActivoFijo = new JScrollPane(jTextAreareferenciaDetalleActivoFijo);
		jscrollPanereferenciaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanereferenciaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanereferenciaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonreferenciaDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonreferenciaDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonreferenciaDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonreferenciaDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonreferenciaDetalleActivoFijoBusqueda.setText("U");
		this.jButtonreferenciaDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonreferenciaDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonreferenciaDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreareferenciaDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreareferenciaDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"referenciaDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonreferenciaDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_cotizacionDetalleActivoFijo = new JLabelMe();
		this.jLabelvalor_cotizacionDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_VALORCOTIZACION+" : *");
		this.jLabelvalor_cotizacionDetalleActivoFijo.setToolTipText("Valor Cotizacion");
		this.jLabelvalor_cotizacionDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_cotizacionDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_cotizacionDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_cotizacionDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_cotizacionDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_cotizacionDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_VALORCOTIZACION);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelvalor_cotizacionDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextFieldvalor_cotizacionDetalleActivoFijo= new JTextFieldMe();
		jTextFieldvalor_cotizacionDetalleActivoFijo.setEnabled(false);
		jTextFieldvalor_cotizacionDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_cotizacionDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_cotizacionDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_cotizacionDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_cotizacionDetalleActivoFijo.setText("0.0");

		this.jButtonvalor_cotizacionDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonvalor_cotizacionDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_cotizacionDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_cotizacionDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_cotizacionDetalleActivoFijoBusqueda.setText("U");
		this.jButtonvalor_cotizacionDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_cotizacionDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_cotizacionDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_cotizacionDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_cotizacionDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_cotizacionDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_cotizacionDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelcon_partesDetalleActivoFijo = new JLabelMe();
		this.jLabelcon_partesDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_CONPARTES+" : *");
		this.jLabelcon_partesDetalleActivoFijo.setToolTipText("Con Partes");
		this.jLabelcon_partesDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_partesDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_partesDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_partesDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_partesDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_partesDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_CONPARTES);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelcon_partesDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jCheckBoxcon_partesDetalleActivoFijo= new JCheckBoxMe();
		jCheckBoxcon_partesDetalleActivoFijo.setEnabled(false);

		jCheckBoxcon_partesDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_partesDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_partesDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_partesDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_partesDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtoncon_partesDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_partesDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_partesDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_partesDetalleActivoFijoBusqueda.setText("U");
		this.jButtoncon_partesDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_partesDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_partesDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_partesDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_partesDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_partesDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_partesDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelcon_garantiaDetalleActivoFijo = new JLabelMe();
		this.jLabelcon_garantiaDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_CONGARANTIA+" : *");
		this.jLabelcon_garantiaDetalleActivoFijo.setToolTipText("Con Garantia");
		this.jLabelcon_garantiaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_garantiaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_garantiaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_garantiaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_garantiaDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_garantiaDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_CONGARANTIA);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelcon_garantiaDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jCheckBoxcon_garantiaDetalleActivoFijo= new JCheckBoxMe();
		jCheckBoxcon_garantiaDetalleActivoFijo.setEnabled(false);

		jCheckBoxcon_garantiaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_garantiaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_garantiaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_garantiaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_garantiaDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtoncon_garantiaDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_garantiaDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_garantiaDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_garantiaDetalleActivoFijoBusqueda.setText("U");
		this.jButtoncon_garantiaDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_garantiaDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_garantiaDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_garantiaDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_garantiaDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_garantiaDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_garantiaDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelcon_existenciaDetalleActivoFijo = new JLabelMe();
		this.jLabelcon_existenciaDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_CONEXISTENCIA+" : *");
		this.jLabelcon_existenciaDetalleActivoFijo.setToolTipText("Con Existencia");
		this.jLabelcon_existenciaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_existenciaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_existenciaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_existenciaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_existenciaDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_existenciaDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_CONEXISTENCIA);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelcon_existenciaDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jCheckBoxcon_existenciaDetalleActivoFijo= new JCheckBoxMe();
		jCheckBoxcon_existenciaDetalleActivoFijo.setEnabled(false);

		jCheckBoxcon_existenciaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_existenciaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_existenciaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_existenciaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_existenciaDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtoncon_existenciaDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_existenciaDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_existenciaDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_existenciaDetalleActivoFijoBusqueda.setText("U");
		this.jButtoncon_existenciaDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_existenciaDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_existenciaDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_existenciaDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_existenciaDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_existenciaDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_existenciaDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_bajaDetalleActivoFijo = new JLabelMe();
		this.jLabelfecha_bajaDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_FECHABAJA+" : *");
		this.jLabelfecha_bajaDetalleActivoFijo.setToolTipText("Fecha Baja");
		this.jLabelfecha_bajaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_bajaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_bajaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_bajaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_bajaDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_bajaDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_FECHABAJA);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelfecha_bajaDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		//jFormattedTextFieldfecha_bajaDetalleActivoFijo= new JFormattedTextFieldMe();

		jDateChooserfecha_bajaDetalleActivoFijo= new JDateChooser();
		jDateChooserfecha_bajaDetalleActivoFijo.setEnabled(false);
		jDateChooserfecha_bajaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_bajaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_bajaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_bajaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_bajaDetalleActivoFijo.setDate(new Date());
		jDateChooserfecha_bajaDetalleActivoFijo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_bajaDetalleActivoFijo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_bajaDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonfecha_bajaDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_bajaDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_bajaDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_bajaDetalleActivoFijoBusqueda.setText("U");
		this.jButtonfecha_bajaDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_bajaDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_bajaDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_bajaDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_bajaDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_bajaDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_bajaDetalleActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelpath_foto2DetalleActivoFijo = new JLabelMe();
		this.jLabelpath_foto2DetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_PATHFOTO2+" : *");
		this.jLabelpath_foto2DetalleActivoFijo.setToolTipText("Path Foto2");
		this.jLabelpath_foto2DetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpath_foto2DetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpath_foto2DetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpath_foto2DetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpath_foto2DetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpath_foto2DetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_PATHFOTO2);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelpath_foto2DetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jTextAreapath_foto2DetalleActivoFijo= new JTextAreaMe();
		jTextAreapath_foto2DetalleActivoFijo.setEnabled(false);
		jTextAreapath_foto2DetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_foto2DetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_foto2DetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_foto2DetalleActivoFijo.setLineWrap(true);
		jTextAreapath_foto2DetalleActivoFijo.setWrapStyleWord(true);
		jTextAreapath_foto2DetalleActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreapath_foto2DetalleActivoFijo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreapath_foto2DetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanepath_foto2DetalleActivoFijo = new JScrollPane(jTextAreapath_foto2DetalleActivoFijo);
		jscrollPanepath_foto2DetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepath_foto2DetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepath_foto2DetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonpath_foto2DetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonpath_foto2DetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpath_foto2DetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpath_foto2DetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpath_foto2DetalleActivoFijoBusqueda.setText("U");
		this.jButtonpath_foto2DetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpath_foto2DetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpath_foto2DetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreapath_foto2DetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreapath_foto2DetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"path_foto2DetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpath_foto2DetalleActivoFijoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleActivoFijo = new JLabelMe();
		this.jLabelid_empresaDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleActivoFijo.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelid_empresaDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jComboBoxid_empresaDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_empresaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleActivoFijo.setEnabled(false);

		this.jButtonid_empresaDetalleActivoFijo= new JButtonMe();
		this.jButtonid_empresaDetalleActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleActivoFijo.setText("Buscar");
		this.jButtonid_empresaDetalleActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleActivoFijo"));

		this.jButtonid_empresaDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleActivoFijoBusqueda.setText("U");
		this.jButtonid_empresaDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleActivoFijoUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleActivoFijoUpdate.setText("U");
		this.jButtonid_empresaDetalleActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleActivoFijoUpdate"));



					
		this.jLabelid_sucursalDetalleActivoFijo = new JLabelMe();
		this.jLabelid_sucursalDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleActivoFijo.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelid_sucursalDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jComboBoxid_sucursalDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_sucursalDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleActivoFijo.setEnabled(false);

		this.jButtonid_sucursalDetalleActivoFijo= new JButtonMe();
		this.jButtonid_sucursalDetalleActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleActivoFijo.setText("Buscar");
		this.jButtonid_sucursalDetalleActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleActivoFijo"));

		this.jButtonid_sucursalDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleActivoFijoBusqueda.setText("U");
		this.jButtonid_sucursalDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleActivoFijoUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleActivoFijoUpdate.setText("U");
		this.jButtonid_sucursalDetalleActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleActivoFijoUpdate"));



					
		this.jLabelid_detalle_grupo_activo_fijoDetalleActivoFijo = new JLabelMe();
		this.jLabelid_detalle_grupo_activo_fijoDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO+" : *");
		this.jLabelid_detalle_grupo_activo_fijoDetalleActivoFijo.setToolTipText("Detalle Grupo Activo Fijo");
		this.jLabelid_detalle_grupo_activo_fijoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_grupo_activo_fijoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_grupo_activo_fijoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_grupo_activo_fijoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_grupo_activo_fijoDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_grupo_activo_fijoDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelid_detalle_grupo_activo_fijoDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jComboBoxid_detalle_grupo_activo_fijoDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_detalle_grupo_activo_fijoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_grupo_activo_fijoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijo= new JButtonMe();
		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijo.setText("Buscar");
		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_grupo_activo_fijoDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_grupo_activo_fijoDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_grupo_activo_fijoDetalleActivoFijo"));

		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoBusqueda.setText("U");
		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_grupo_activo_fijoDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_grupo_activo_fijoDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_grupo_activo_fijoDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoUpdate= new JButtonMe();
		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoUpdate.setText("U");
		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_grupo_activo_fijoDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_grupo_activo_fijoDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_grupo_activo_fijoDetalleActivoFijoUpdate"));



					
		this.jLabelid_sub_grupo_activo_fijoDetalleActivoFijo = new JLabelMe();
		this.jLabelid_sub_grupo_activo_fijoDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO+" : *");
		this.jLabelid_sub_grupo_activo_fijoDetalleActivoFijo.setToolTipText("Sub Grupo Activo Fijo");
		this.jLabelid_sub_grupo_activo_fijoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_sub_grupo_activo_fijoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_sub_grupo_activo_fijoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sub_grupo_activo_fijoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sub_grupo_activo_fijoDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sub_grupo_activo_fijoDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_IDSUBGRUPOACTIVOFIJO);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelid_sub_grupo_activo_fijoDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jComboBoxid_sub_grupo_activo_fijoDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_sub_grupo_activo_fijoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_grupo_activo_fijoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_grupo_activo_fijoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_grupo_activo_fijoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijo= new JButtonMe();
		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijo.setText("Buscar");
		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sub_grupo_activo_fijoDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_grupo_activo_fijoDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_grupo_activo_fijoDetalleActivoFijo"));

		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijoBusqueda.setText("U");
		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sub_grupo_activo_fijoDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_grupo_activo_fijoDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_grupo_activo_fijoDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijoUpdate= new JButtonMe();
		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijoUpdate.setText("U");
		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_grupo_activo_fijoDetalleActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sub_grupo_activo_fijoDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_grupo_activo_fijoDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_grupo_activo_fijoDetalleActivoFijoUpdate"));



					
		this.jLabelid_tipo_ramo_activo_fijoDetalleActivoFijo = new JLabelMe();
		this.jLabelid_tipo_ramo_activo_fijoDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_IDTIPORAMOACTIVOFIJO+" : *");
		this.jLabelid_tipo_ramo_activo_fijoDetalleActivoFijo.setToolTipText("Tipo Ramo Activo Fijo");
		this.jLabelid_tipo_ramo_activo_fijoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_ramo_activo_fijoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_ramo_activo_fijoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_ramo_activo_fijoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_ramo_activo_fijoDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_ramo_activo_fijoDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_IDTIPORAMOACTIVOFIJO);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelid_tipo_ramo_activo_fijoDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jComboBoxid_tipo_ramo_activo_fijoDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_tipo_ramo_activo_fijoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ramo_activo_fijoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ramo_activo_fijoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_ramo_activo_fijoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijo= new JButtonMe();
		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijo.setText("Buscar");
		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_ramo_activo_fijoDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ramo_activo_fijoDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ramo_activo_fijoDetalleActivoFijo"));

		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoBusqueda.setText("U");
		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_ramo_activo_fijoDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ramo_activo_fijoDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ramo_activo_fijoDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoUpdate= new JButtonMe();
		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoUpdate.setText("U");
		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_ramo_activo_fijoDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ramo_activo_fijoDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ramo_activo_fijoDetalleActivoFijoUpdate"));



					
		this.jLabelid_tipo_activo_fijo_empresaDetalleActivoFijo = new JLabelMe();
		this.jLabelid_tipo_activo_fijo_empresaDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_IDTIPOACTIVOFIJOEMPRESA+" : *");
		this.jLabelid_tipo_activo_fijo_empresaDetalleActivoFijo.setToolTipText("Tipo Activo Fijo Empresa");
		this.jLabelid_tipo_activo_fijo_empresaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_activo_fijo_empresaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_activo_fijo_empresaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_activo_fijo_empresaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_activo_fijo_empresaDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_activo_fijo_empresaDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_IDTIPOACTIVOFIJOEMPRESA);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelid_tipo_activo_fijo_empresaDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jComboBoxid_tipo_activo_fijo_empresaDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_tipo_activo_fijo_empresaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_activo_fijo_empresaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_activo_fijo_empresaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_activo_fijo_empresaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijo= new JButtonMe();
		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijo.setText("Buscar");
		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_activo_fijo_empresaDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_activo_fijo_empresaDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_activo_fijo_empresaDetalleActivoFijo"));

		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoBusqueda.setText("U");
		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_activo_fijo_empresaDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_activo_fijo_empresaDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_activo_fijo_empresaDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoUpdate= new JButtonMe();
		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoUpdate.setText("U");
		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_activo_fijo_empresaDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_activo_fijo_empresaDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_activo_fijo_empresaDetalleActivoFijoUpdate"));



					
		this.jLabelid_tipo_depreciacion_empresaDetalleActivoFijo = new JLabelMe();
		this.jLabelid_tipo_depreciacion_empresaDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA+" : *");
		this.jLabelid_tipo_depreciacion_empresaDetalleActivoFijo.setToolTipText("Tipo Depreciacion Empresa");
		this.jLabelid_tipo_depreciacion_empresaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_depreciacion_empresaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_depreciacion_empresaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_depreciacion_empresaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_depreciacion_empresaDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_depreciacion_empresaDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelid_tipo_depreciacion_empresaDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jComboBoxid_tipo_depreciacion_empresaDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_tipo_depreciacion_empresaDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_depreciacion_empresaDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_depreciacion_empresaDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_depreciacion_empresaDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijo= new JButtonMe();
		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijo.setText("Buscar");
		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_depreciacion_empresaDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_depreciacion_empresaDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_depreciacion_empresaDetalleActivoFijo"));

		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijoBusqueda.setText("U");
		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_depreciacion_empresaDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_depreciacion_empresaDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_depreciacion_empresaDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijoUpdate= new JButtonMe();
		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijoUpdate.setText("U");
		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_depreciacion_empresaDetalleActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_depreciacion_empresaDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_depreciacion_empresaDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_depreciacion_empresaDetalleActivoFijoUpdate"));



					
		this.jLabelid_estado_activo_fijoDetalleActivoFijo = new JLabelMe();
		this.jLabelid_estado_activo_fijoDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO+" : *");
		this.jLabelid_estado_activo_fijoDetalleActivoFijo.setToolTipText("Estado Activo Fijo");
		this.jLabelid_estado_activo_fijoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_activo_fijoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_activo_fijoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_activo_fijoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_activo_fijoDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_activo_fijoDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_IDESTADOACTIVOFIJO);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelid_estado_activo_fijoDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jComboBoxid_estado_activo_fijoDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_estado_activo_fijoDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_activo_fijoDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_activo_fijoDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_activo_fijoDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_activo_fijoDetalleActivoFijo= new JButtonMe();
		this.jButtonid_estado_activo_fijoDetalleActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_activo_fijoDetalleActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_activo_fijoDetalleActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_activo_fijoDetalleActivoFijo.setText("Buscar");
		this.jButtonid_estado_activo_fijoDetalleActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_activo_fijoDetalleActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_activo_fijoDetalleActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_activo_fijoDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_activo_fijoDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_activo_fijoDetalleActivoFijo"));

		this.jButtonid_estado_activo_fijoDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_estado_activo_fijoDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_activo_fijoDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_activo_fijoDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_activo_fijoDetalleActivoFijoBusqueda.setText("U");
		this.jButtonid_estado_activo_fijoDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_activo_fijoDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_activo_fijoDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_activo_fijoDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_activo_fijoDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_activo_fijoDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_activo_fijoDetalleActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_estado_activo_fijoDetalleActivoFijoUpdate= new JButtonMe();
		this.jButtonid_estado_activo_fijoDetalleActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_activo_fijoDetalleActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_activo_fijoDetalleActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_activo_fijoDetalleActivoFijoUpdate.setText("U");
		this.jButtonid_estado_activo_fijoDetalleActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_activo_fijoDetalleActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_activo_fijoDetalleActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_activo_fijoDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_activo_fijoDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_activo_fijoDetalleActivoFijoUpdate"));



					
		this.jLabelid_clienteDetalleActivoFijo = new JLabelMe();
		this.jLabelid_clienteDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteDetalleActivoFijo.setToolTipText("Cliente");
		this.jLabelid_clienteDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelid_clienteDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jComboBoxid_clienteDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_clienteDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteDetalleActivoFijo= new JButtonMe();
		this.jButtonid_clienteDetalleActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleActivoFijo.setText("Buscar");
		this.jButtonid_clienteDetalleActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteDetalleActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleActivoFijo"));

		this.jButtonid_clienteDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_clienteDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteDetalleActivoFijoBusqueda.setText("U");
		this.jButtonid_clienteDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteDetalleActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_clienteDetalleActivoFijoUpdate= new JButtonMe();
		this.jButtonid_clienteDetalleActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteDetalleActivoFijoUpdate.setText("U");
		this.jButtonid_clienteDetalleActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteDetalleActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleActivoFijoUpdate"));



					
		this.jLabelid_partida_presuDetalleActivoFijo = new JLabelMe();
		this.jLabelid_partida_presuDetalleActivoFijo.setText(""+DetalleActivoFijoConstantesFunciones.LABEL_IDPARTIDAPRESU+" : *");
		this.jLabelid_partida_presuDetalleActivoFijo.setToolTipText("Parta Presu");
		this.jLabelid_partida_presuDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_partida_presuDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_partida_presuDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_partida_presuDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_partida_presuDetalleActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_partida_presuDetalleActivoFijo.setToolTipText(DetalleActivoFijoConstantesFunciones.LABEL_IDPARTIDAPRESU);
		this.gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		this.jPanelid_partida_presuDetalleActivoFijo.setLayout(this.gridaBagLayoutDetalleActivoFijo);


		jComboBoxid_partida_presuDetalleActivoFijo= new JComboBoxMe();
		jComboBoxid_partida_presuDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_partida_presuDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_partida_presuDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_partida_presuDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_partida_presuDetalleActivoFijo= new JButtonMe();
		this.jButtonid_partida_presuDetalleActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_partida_presuDetalleActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_partida_presuDetalleActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_partida_presuDetalleActivoFijo.setText("Buscar");
		this.jButtonid_partida_presuDetalleActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_partida_presuDetalleActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_partida_presuDetalleActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_partida_presuDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_partida_presuDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_partida_presuDetalleActivoFijo"));

		this.jButtonid_partida_presuDetalleActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_partida_presuDetalleActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_partida_presuDetalleActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_partida_presuDetalleActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_partida_presuDetalleActivoFijoBusqueda.setText("U");
		this.jButtonid_partida_presuDetalleActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_partida_presuDetalleActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_partida_presuDetalleActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_partida_presuDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_partida_presuDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_partida_presuDetalleActivoFijoBusqueda"));

		if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_partida_presuDetalleActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_partida_presuDetalleActivoFijoUpdate= new JButtonMe();
		this.jButtonid_partida_presuDetalleActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_partida_presuDetalleActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_partida_presuDetalleActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_partida_presuDetalleActivoFijoUpdate.setText("U");
		this.jButtonid_partida_presuDetalleActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_partida_presuDetalleActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_partida_presuDetalleActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_partida_presuDetalleActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_partida_presuDetalleActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_partida_presuDetalleActivoFijoUpdate"));



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
		//this.jInternalFrameDetalleDetalleActivoFijo = new DetalleActivoFijoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Activo Fijo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleActivoFijo= new GridBagLayout();
		

		
		String sToolTipDetalleActivoFijo="";
		sToolTipDetalleActivoFijo=DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleActivoFijo+="(ActivosFijos.DetalleActivoFijo)";
		}
		
		if(!this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleActivoFijo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleActivoFijo = new JButtonMe();
		this.jButtonModificarDetalleActivoFijo = new JButtonMe();
        this.jButtonActualizarDetalleActivoFijo = new JButtonMe();
        this.jButtonEliminarDetalleActivoFijo = new JButtonMe();
        this.jButtonCancelarDetalleActivoFijo = new JButtonMe();
        this.jButtonGuardarCambiosDetalleActivoFijo = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleActivoFijo = new JButtonMe();
		this.jButtonCerrarDetalleActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosDetalleActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleActivoFijo = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleActivoFijo = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Activo Fijo";
		
		if(!this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleActivoFijo.setName("jPanelCamposDetalleActivoFijo"); 

		this.jPanelCamposOcultosDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleActivoFijo.setName("jPanelCamposOcultosDetalleActivoFijo"); 

        this.jPanelAccionesDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesDetalleActivoFijo.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleActivoFijo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleActivoFijo.setText("Nuevo");
		this.jButtonModificarDetalleActivoFijo.setText("Editar");
        this.jButtonActualizarDetalleActivoFijo.setText("Actualizar");
        this.jButtonEliminarDetalleActivoFijo.setText("Eliminar");
        this.jButtonCancelarDetalleActivoFijo.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleActivoFijo.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleActivoFijo.setText("Guardar");
		this.jButtonCerrarDetalleActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleActivoFijo,"nuevo_button","Nuevo",this.detalleactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleActivoFijo,"modificar_button","Editar",this.detalleactivofijoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleActivoFijo,"actualizar_button","Actualizar",this.detalleactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleActivoFijo,"eliminar_button","Eliminar",this.detalleactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleActivoFijo,"cancelar_button","Cancelar",this.detalleactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleActivoFijo,"guardarcambios_button","Guardar",this.detalleactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleActivoFijo,"guardarcambiostabla_button","Guardar",this.detalleactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleActivoFijo,"cerrar_button","Salir",this.detalleactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleActivoFijo.setToolTipText("Nuevo"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleActivoFijo.setToolTipText("Editar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleActivoFijo.setToolTipText("Actualizar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleActivoFijo.setToolTipText("Eliminar)"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleActivoFijo.setToolTipText("Cancelar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleActivoFijo.setToolTipText("Guardar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleActivoFijo.setToolTipText("Guardar"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleActivoFijo.setToolTipText("Salir"+" "+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleActivoFijo";
		inputMap = this.jButtonNuevoDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleActivoFijo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleActivoFijo";
		inputMap = this.jButtonActualizarDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleActivoFijo"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleActivoFijo";
		inputMap = this.jButtonEliminarDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleActivoFijo"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleActivoFijo";
		inputMap = this.jButtonCancelarDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleActivoFijo"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleActivoFijo";
		inputMap = this.jButtonCerrarDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaDetalleActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleActivoFijo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleActivoFijo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleActivoFijo.setToolTipText("Nuevo DetalleActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleActivoFijo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleActivoFijo.setToolTipText("Sin Cerrar Ventana DetalleActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleActivoFijo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleActivoFijo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesDetalleActivoFijo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleActivoFijo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleActivoFijo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleActivoFijo = new JLabelMe();
		
		this.jLabelAccionesDetalleActivoFijo.setText("Acciones");		
		this.jLabelAccionesDetalleActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleActivoFijo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleActivoFijo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleActivoFijo=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleActivoFijo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleActivoFijo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleActivoFijo = new GridBagLayout();
		
		this.jPanelCamposDetalleActivoFijo.setLayout(gridaBagLayoutCamposDetalleActivoFijo);
		this.jPanelCamposOcultosDetalleActivoFijo.setLayout(gridaBagLayoutCamposOcultosDetalleActivoFijo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleActivoFijo.add(jLabelIdDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleActivoFijo.add(jLabelidDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleActivoFijo.add(jLabelid_empresaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleActivoFijo.add(jButtonid_empresaDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 3;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleActivoFijo.add(jButtonid_empresaDetalleActivoFijoUpdate, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleActivoFijo.add(jComboBoxid_empresaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleActivoFijo.add(jLabelid_sucursalDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleActivoFijo.add(jButtonid_sucursalDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 3;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleActivoFijo.add(jButtonid_sucursalDetalleActivoFijoUpdate, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleActivoFijo.add(jComboBoxid_sucursalDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_grupo_activo_fijoDetalleActivoFijo.add(jLabelid_detalle_grupo_activo_fijoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_grupo_activo_fijoDetalleActivoFijo.add(jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 3;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_grupo_activo_fijoDetalleActivoFijo.add(jButtonid_detalle_grupo_activo_fijoDetalleActivoFijoUpdate, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_grupo_activo_fijoDetalleActivoFijo.add(jComboBoxid_detalle_grupo_activo_fijoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sub_grupo_activo_fijoDetalleActivoFijo.add(jLabelid_sub_grupo_activo_fijoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_grupo_activo_fijoDetalleActivoFijo.add(jButtonid_sub_grupo_activo_fijoDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 3;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_grupo_activo_fijoDetalleActivoFijo.add(jButtonid_sub_grupo_activo_fijoDetalleActivoFijoUpdate, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sub_grupo_activo_fijoDetalleActivoFijo.add(jComboBoxid_sub_grupo_activo_fijoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_ramo_activo_fijoDetalleActivoFijo.add(jLabelid_tipo_ramo_activo_fijoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ramo_activo_fijoDetalleActivoFijo.add(jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 3;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ramo_activo_fijoDetalleActivoFijo.add(jButtonid_tipo_ramo_activo_fijoDetalleActivoFijoUpdate, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_ramo_activo_fijoDetalleActivoFijo.add(jComboBoxid_tipo_ramo_activo_fijoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_activo_fijo_empresaDetalleActivoFijo.add(jLabelid_tipo_activo_fijo_empresaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_activo_fijo_empresaDetalleActivoFijo.add(jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 3;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_activo_fijo_empresaDetalleActivoFijo.add(jButtonid_tipo_activo_fijo_empresaDetalleActivoFijoUpdate, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_activo_fijo_empresaDetalleActivoFijo.add(jComboBoxid_tipo_activo_fijo_empresaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_depreciacion_empresaDetalleActivoFijo.add(jLabelid_tipo_depreciacion_empresaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_depreciacion_empresaDetalleActivoFijo.add(jButtonid_tipo_depreciacion_empresaDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 3;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_depreciacion_empresaDetalleActivoFijo.add(jButtonid_tipo_depreciacion_empresaDetalleActivoFijoUpdate, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_depreciacion_empresaDetalleActivoFijo.add(jComboBoxid_tipo_depreciacion_empresaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_activo_fijoDetalleActivoFijo.add(jLabelid_estado_activo_fijoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_activo_fijoDetalleActivoFijo.add(jButtonid_estado_activo_fijoDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 3;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_activo_fijoDetalleActivoFijo.add(jButtonid_estado_activo_fijoDetalleActivoFijoUpdate, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_activo_fijoDetalleActivoFijo.add(jComboBoxid_estado_activo_fijoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteDetalleActivoFijo.add(jLabelid_clienteDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteDetalleActivoFijo.add(jButtonid_clienteDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 3;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteDetalleActivoFijo.add(jButtonid_clienteDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 4;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteDetalleActivoFijo.add(jButtonid_clienteDetalleActivoFijoUpdate, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteDetalleActivoFijo.add(jComboBoxid_clienteDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_partida_presuDetalleActivoFijo.add(jLabelid_partida_presuDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_partida_presuDetalleActivoFijo.add(jButtonid_partida_presuDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 3;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_partida_presuDetalleActivoFijo.add(jButtonid_partida_presuDetalleActivoFijoUpdate, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_partida_presuDetalleActivoFijo.add(jComboBoxid_partida_presuDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoDetalleActivoFijo.add(jLabelcodigoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoDetalleActivoFijo.add(jButtoncodigoDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoDetalleActivoFijo.add(jTextFieldcodigoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreDetalleActivoFijo.add(jLabelnombreDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreDetalleActivoFijo.add(jButtonnombreDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreDetalleActivoFijo.add(jscrollPanenombreDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelserieDetalleActivoFijo.add(jLabelserieDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelserieDetalleActivoFijo.add(jButtonserieDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelserieDetalleActivoFijo.add(jTextFieldserieDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_compraDetalleActivoFijo.add(jLabelfecha_compraDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_compraDetalleActivoFijo.add(jButtonfecha_compraDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_compraDetalleActivoFijo.add(jDateChooserfecha_compraDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_mantenimientoDetalleActivoFijo.add(jLabelfecha_mantenimientoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_mantenimientoDetalleActivoFijo.add(jButtonfecha_mantenimientoDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_mantenimientoDetalleActivoFijo.add(jDateChooserfecha_mantenimientoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_correccionDetalleActivoFijo.add(jLabelfecha_correccionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_correccionDetalleActivoFijo.add(jButtonfecha_correccionDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_correccionDetalleActivoFijo.add(jDateChooserfecha_correccionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_depreciacionDetalleActivoFijo.add(jLabelfecha_depreciacionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_depreciacionDetalleActivoFijo.add(jButtonfecha_depreciacionDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_depreciacionDetalleActivoFijo.add(jDateChooserfecha_depreciacionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelclaveDetalleActivoFijo.add(jLabelclaveDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelclaveDetalleActivoFijo.add(jButtonclaveDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelclaveDetalleActivoFijo.add(jTextFieldclaveDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmarcaDetalleActivoFijo.add(jLabelmarcaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelmarcaDetalleActivoFijo.add(jButtonmarcaDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmarcaDetalleActivoFijo.add(jscrollPanemarcaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmodeloDetalleActivoFijo.add(jLabelmodeloDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelmodeloDetalleActivoFijo.add(jButtonmodeloDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmodeloDetalleActivoFijo.add(jscrollPanemodeloDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcolorDetalleActivoFijo.add(jLabelcolorDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcolorDetalleActivoFijo.add(jButtoncolorDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcolorDetalleActivoFijo.add(jTextFieldcolorDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaDetalleActivoFijo.add(jLabelfechaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaDetalleActivoFijo.add(jButtonfechaDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaDetalleActivoFijo.add(jDateChooserfechaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_utilDetalleActivoFijo.add(jLabelvalor_utilDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_utilDetalleActivoFijo.add(jButtonvalor_utilDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_utilDetalleActivoFijo.add(jTextFieldvalor_utilDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_de_compraDetalleActivoFijo.add(jLabelcosto_de_compraDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_de_compraDetalleActivoFijo.add(jButtoncosto_de_compraDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_de_compraDetalleActivoFijo.add(jTextFieldcosto_de_compraDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvida_utilDetalleActivoFijo.add(jLabelvida_utilDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelvida_utilDetalleActivoFijo.add(jButtonvida_utilDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvida_utilDetalleActivoFijo.add(jTextFieldvida_utilDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_residualDetalleActivoFijo.add(jLabelvalor_residualDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_residualDetalleActivoFijo.add(jButtonvalor_residualDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_residualDetalleActivoFijo.add(jTextFieldvalor_residualDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetalleActivoFijo.add(jLabelcantidadDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetalleActivoFijo.add(jButtoncantidadDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetalleActivoFijo.add(jTextFieldcantidadDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_propietarioDetalleActivoFijo.add(jLabelnombre_propietarioDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_propietarioDetalleActivoFijo.add(jButtonnombre_propietarioDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_propietarioDetalleActivoFijo.add(jscrollPanenombre_propietarioDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelresponsableDetalleActivoFijo.add(jLabelresponsableDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelresponsableDetalleActivoFijo.add(jButtonresponsableDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelresponsableDetalleActivoFijo.add(jscrollPaneresponsableDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpath_fotoDetalleActivoFijo.add(jLabelpath_fotoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelpath_fotoDetalleActivoFijo.add(jButtonpath_fotoDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpath_fotoDetalleActivoFijo.add(jscrollPanepath_fotoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteDetalleActivoFijo.add(jLabelnumero_comprobanteDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteDetalleActivoFijo.add(jButtonnumero_comprobanteDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteDetalleActivoFijo.add(jTextFieldnumero_comprobanteDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelreferenciaDetalleActivoFijo.add(jLabelreferenciaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelreferenciaDetalleActivoFijo.add(jButtonreferenciaDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelreferenciaDetalleActivoFijo.add(jscrollPanereferenciaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_cotizacionDetalleActivoFijo.add(jLabelvalor_cotizacionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_cotizacionDetalleActivoFijo.add(jButtonvalor_cotizacionDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_cotizacionDetalleActivoFijo.add(jTextFieldvalor_cotizacionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_partesDetalleActivoFijo.add(jLabelcon_partesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_partesDetalleActivoFijo.add(jButtoncon_partesDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_partesDetalleActivoFijo.add(jCheckBoxcon_partesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_garantiaDetalleActivoFijo.add(jLabelcon_garantiaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_garantiaDetalleActivoFijo.add(jButtoncon_garantiaDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_garantiaDetalleActivoFijo.add(jCheckBoxcon_garantiaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_existenciaDetalleActivoFijo.add(jLabelcon_existenciaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_existenciaDetalleActivoFijo.add(jButtoncon_existenciaDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_existenciaDetalleActivoFijo.add(jCheckBoxcon_existenciaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_bajaDetalleActivoFijo.add(jLabelfecha_bajaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_bajaDetalleActivoFijo.add(jButtonfecha_bajaDetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_bajaDetalleActivoFijo.add(jDateChooserfecha_bajaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpath_foto2DetalleActivoFijo.add(jLabelpath_foto2DetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelpath_foto2DetalleActivoFijo.add(jButtonpath_foto2DetalleActivoFijoBusqueda, this.gridBagConstraintsDetalleActivoFijo);
	}

	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpath_foto2DetalleActivoFijo.add(jscrollPanepath_foto2DetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelidDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelid_detalle_grupo_activo_fijoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelid_sub_grupo_activo_fijoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelid_tipo_ramo_activo_fijoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelid_tipo_activo_fijo_empresaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelid_tipo_depreciacion_empresaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelid_estado_activo_fijoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelid_clienteDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelid_partida_presuDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelcodigoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelnombreDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelserieDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelfecha_compraDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelfecha_mantenimientoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelfecha_correccionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelfecha_depreciacionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelclaveDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelmarcaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelmodeloDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelcolorDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelfechaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelvalor_utilDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelcosto_de_compraDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelvida_utilDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelvalor_residualDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelcantidadDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelnombre_propietarioDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelresponsableDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelpath_fotoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelnumero_comprobanteDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelreferenciaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelvalor_cotizacionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelcon_partesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelcon_garantiaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelcon_existenciaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelfecha_bajaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleActivoFijo.add(this.jPanelpath_foto2DetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposDetalleActivoFijo % 2==0) {
		iXPanelCamposDetalleActivoFijo=0;
		iYPanelCamposDetalleActivoFijo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposOcultosDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposOcultosDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleActivoFijo.add(this.jPanelid_empresaDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposOcultosDetalleActivoFijo % 2==0) {
		iXPanelCamposOcultosDetalleActivoFijo=0;
		iYPanelCamposOcultosDetalleActivoFijo++;
	}
	this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleActivoFijo.gridy = iYPanelCamposOcultosDetalleActivoFijo;
	this.gridBagConstraintsDetalleActivoFijo.gridx = iXPanelCamposOcultosDetalleActivoFijo++;
	this.gridBagConstraintsDetalleActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleActivoFijo.add(this.jPanelid_sucursalDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);



	if(iXPanelCamposOcultosDetalleActivoFijo % 2==0) {
		iXPanelCamposOcultosDetalleActivoFijo=0;
		iYPanelCamposOcultosDetalleActivoFijo++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleActivoFijo= new GridBagLayout();
		this.jPanelAccionesDetalleActivoFijo.setLayout(gridaBagLayoutAccionesDetalleActivoFijo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleActivoFijo= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleActivoFijo.setLayout(gridaBagLayoutAccionesFormularioDetalleActivoFijo);
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleActivoFijo.add(this.jComboBoxTiposAccionesFormularioDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleActivoFijo.add(this.jCheckBoxPostAccionNuevoDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleactivofijoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleActivoFijo.add(this.jCheckBoxPostAccionSinCerrarDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleactivofijoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleActivoFijo.add(this.jCheckBoxPostAccionSinMensajeDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleActivoFijo.add(this.jButtonModificarDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);							

		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleActivoFijo.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleActivoFijo.add(this.jButtonEliminarDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		
			
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleActivoFijo.add(this.jButtonActualizarDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);


		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleActivoFijo.add(this.jButtonGuardarCambiosDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);	
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy = 0;		
		this.gridBagConstraintsDetalleActivoFijo.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleActivoFijo.add(this.jButtonCancelarDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleActivoFijo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleActivoFijo.gridx = 0;		
			//this.gridBagConstraintsDetalleActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleActivoFijo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleActivoFijo.gridx =0;
		this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleActivoFijo = new DetalleActivoFijoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Activo Fijo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Activo Fijo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Activo Fijo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleActivoFijoModel detalleactivofijoModel=new DetalleActivoFijoModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleActivoFijoModel.DetalleActivoFijoFocusTraversalPolicy detalleactivofijoFocusTraversalPolicy = detalleactivofijoModel.new DetalleActivoFijoFocusTraversalPolicy(this);
			
			//detalleactivofijoFocusTraversalPolicy.setdetalleactivofijoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleactivofijoModel);
			
			
			this.jContentPaneDetalleDetalleActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleActivoFijo = new GridBagLayout();	
			this.jContentPaneDetalleDetalleActivoFijo.setLayout(gridaBagLayoutDetalleDetalleActivoFijo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleActivoFijo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleActivoFijo.add(jTtoolBarDetalleDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleActivoFijo=   new JScrollPane(jContentPaneDetalleDetalleActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	        
			this.jContentPaneDetalleDetalleActivoFijo.add(jPanelCamposDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);
			
			
			
			
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
						&& detalleactivofijoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDepreciacionActivoFijo(this.puedeCargarPorParteDepreciacionActivoFijo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGastoDepreciacionCentroCosto(this.puedeCargarPorParteGastoDepreciacionCentroCosto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameMantenimientoActivoFijo(this.puedeCargarPorParteMantenimientoActivoFijo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameMetodoDepreciacion(this.puedeCargarPorParteMetodoDepreciacion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameMovimientoActivoFijo(this.puedeCargarPorParteMovimientoActivoFijo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParteActivoFijo(this.puedeCargarPorParteParteActivoFijo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameResponsableActivoFijo(this.puedeCargarPorParteResponsableActivoFijo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameServicioTransporte(this.puedeCargarPorParteServicioTransporte,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameVehiculo(this.puedeCargarPorParteVehiculo,false,-1);
					
					if(this.detalleactivofijoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleActivoFijo= new GridBagConstraints();
						this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
						this.jContentPaneDetalleDetalleActivoFijo.add(this.jTabbedPaneRelacionesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleActivoFijo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDepreciacionActivoFijo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGastoDepreciacionCentroCosto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameMantenimientoActivoFijo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameMetodoDepreciacion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameMovimientoActivoFijo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParteActivoFijo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameResponsableActivoFijo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameServicioTransporte(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameVehiculo(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleActivoFijo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
					this.gridBagConstraintsDetalleActivoFijo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleActivoFijo.add(jPanelCamposOcultosDetalleActivoFijo, gridBagConstraintsDetalleActivoFijo);
				
					this.jPanelCamposOcultosDetalleActivoFijo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyRelaciones++;//28;		
	        this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	        this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleActivoFijo.add(this.jPanelAccionesFormularioDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);							
			
			
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
	        this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyRelaciones;//28;		
	        this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleActivoFijo.add(this.jPanelAccionesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleActivoFijo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleActivoFijo=   new JScrollPane(this.jPanelCamposDetalleActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
			this.gridBagConstraintsDetalleActivoFijo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleActivoFijo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleActivoFijo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);			
			
			this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
			
			
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		
			
		this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleActivoFijo, this.gridBagConstraintsDetalleActivoFijo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleActivoFijo;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleActivoFijo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDepreciacionActivoFijo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
		this.depreciacionactivofijoSessionBean.setConGuardarRelaciones(false);
		this.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(true);

		this.depreciacionactivofijoBeanSwingJInternalFrame=null;//new DepreciacionActivoFijoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.depreciacionactivofijoBeanSwingJInternalFramePopup=new DepreciacionActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.depreciacionactivofijoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {

				DepreciacionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DepreciacionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(true);

				this.depreciacionactivofijoBeanSwingJInternalFrame=new DepreciacionActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.depreciacionactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.depreciacionactivofijoBeanSwingJInternalFrame.setdepreciacionactivofijoSessionBean(this.depreciacionactivofijoSessionBean);

				//this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
				//this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
				//this.jContentPaneDetalleDetalleActivoFijo.add(this.depreciacionactivofijoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetalleActivoFijo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Depreciacion Activo Fijos",this.depreciacionactivofijoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetalleActivoFijo.setComponentAt(iIndexTab,this.depreciacionactivofijoBeanSwingJInternalFrame.getContentPane());
				}

				//DepreciacionActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(false);
				this.depreciacionactivofijoBeanSwingJInternalFrame=null;//new DepreciacionActivoFijoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDepreciacionActivoFijo) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Depreciacion Activo Fijos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameGastoDepreciacionCentroCosto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.gastodepreciacioncentrocostoSessionBean=new GastoDepreciacionCentroCostoSessionBean();
		this.gastodepreciacioncentrocostoSessionBean.setConGuardarRelaciones(false);
		this.gastodepreciacioncentrocostoSessionBean.setEsGuardarRelacionado(true);

		this.gastodepreciacioncentrocostoBeanSwingJInternalFrame=null;//new GastoDepreciacionCentroCostoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.gastodepreciacioncentrocostoBeanSwingJInternalFramePopup=new GastoDepreciacionCentroCostoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.gastodepreciacioncentrocostoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {

				GastoDepreciacionCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
				GastoDepreciacionCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.gastodepreciacioncentrocostoSessionBean.setEsGuardarRelacionado(true);

				this.gastodepreciacioncentrocostoBeanSwingJInternalFrame=new GastoDepreciacionCentroCostoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.gastodepreciacioncentrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.gastodepreciacioncentrocostoBeanSwingJInternalFrame.setgastodepreciacioncentrocostoSessionBean(this.gastodepreciacioncentrocostoSessionBean);

				//this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
				//this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
				//this.jContentPaneDetalleDetalleActivoFijo.add(this.gastodepreciacioncentrocostoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetalleActivoFijo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Gasto Depreciacion Centro Costos",this.gastodepreciacioncentrocostoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetalleActivoFijo.setComponentAt(iIndexTab,this.gastodepreciacioncentrocostoBeanSwingJInternalFrame.getContentPane());
				}

				//GastoDepreciacionCentroCostoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.gastodepreciacioncentrocostoSessionBean.setEsGuardarRelacionado(false);
				this.gastodepreciacioncentrocostoBeanSwingJInternalFrame=null;//new GastoDepreciacionCentroCostoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.gastodepreciacioncentrocostoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteGastoDepreciacionCentroCosto) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Gasto Depreciacion Centro Costos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameMantenimientoActivoFijo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.mantenimientoactivofijoSessionBean=new MantenimientoActivoFijoSessionBean();
		this.mantenimientoactivofijoSessionBean.setConGuardarRelaciones(false);
		this.mantenimientoactivofijoSessionBean.setEsGuardarRelacionado(true);

		this.mantenimientoactivofijoBeanSwingJInternalFrame=null;//new MantenimientoActivoFijoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.mantenimientoactivofijoBeanSwingJInternalFramePopup=new MantenimientoActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.mantenimientoactivofijoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {

				MantenimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
				MantenimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.mantenimientoactivofijoSessionBean.setEsGuardarRelacionado(true);

				this.mantenimientoactivofijoBeanSwingJInternalFrame=new MantenimientoActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.mantenimientoactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.mantenimientoactivofijoBeanSwingJInternalFrame.setmantenimientoactivofijoSessionBean(this.mantenimientoactivofijoSessionBean);

				//this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
				//this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
				//this.jContentPaneDetalleDetalleActivoFijo.add(this.mantenimientoactivofijoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetalleActivoFijo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Mantenimiento Activo Fijos",this.mantenimientoactivofijoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetalleActivoFijo.setComponentAt(iIndexTab,this.mantenimientoactivofijoBeanSwingJInternalFrame.getContentPane());
				}

				//MantenimientoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.mantenimientoactivofijoSessionBean.setEsGuardarRelacionado(false);
				this.mantenimientoactivofijoBeanSwingJInternalFrame=null;//new MantenimientoActivoFijoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteMantenimientoActivoFijo) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Mantenimiento Activo Fijos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameMetodoDepreciacion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.metododepreciacionSessionBean=new MetodoDepreciacionSessionBean();
		this.metododepreciacionSessionBean.setConGuardarRelaciones(false);
		this.metododepreciacionSessionBean.setEsGuardarRelacionado(true);

		this.metododepreciacionBeanSwingJInternalFrame=null;//new MetodoDepreciacionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.metododepreciacionBeanSwingJInternalFramePopup=new MetodoDepreciacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.metododepreciacionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {

				MetodoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
				MetodoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.metododepreciacionSessionBean.setEsGuardarRelacionado(true);

				this.metododepreciacionBeanSwingJInternalFrame=new MetodoDepreciacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.metododepreciacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.metododepreciacionBeanSwingJInternalFrame.setmetododepreciacionSessionBean(this.metododepreciacionSessionBean);

				//this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
				//this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
				//this.jContentPaneDetalleDetalleActivoFijo.add(this.metododepreciacionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetalleActivoFijo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Metodo Depreciaciones",this.metododepreciacionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetalleActivoFijo.setComponentAt(iIndexTab,this.metododepreciacionBeanSwingJInternalFrame.getContentPane());
				}

				//MetodoDepreciacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.metododepreciacionSessionBean.setEsGuardarRelacionado(false);
				this.metododepreciacionBeanSwingJInternalFrame=null;//new MetodoDepreciacionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteMetodoDepreciacion) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Metodo Depreciaciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameMovimientoActivoFijo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.movimientoactivofijoSessionBean=new MovimientoActivoFijoSessionBean();
		this.movimientoactivofijoSessionBean.setConGuardarRelaciones(false);
		this.movimientoactivofijoSessionBean.setEsGuardarRelacionado(true);

		this.movimientoactivofijoBeanSwingJInternalFrame=null;//new MovimientoActivoFijoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.movimientoactivofijoBeanSwingJInternalFramePopup=new MovimientoActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.movimientoactivofijoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado()) {

				MovimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
				MovimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.movimientoactivofijoSessionBean.setEsGuardarRelacionado(true);

				this.movimientoactivofijoBeanSwingJInternalFrame=new MovimientoActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.movimientoactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.movimientoactivofijoBeanSwingJInternalFrame.setmovimientoactivofijoSessionBean(this.movimientoactivofijoSessionBean);

				//this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
				//this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
				//this.jContentPaneDetalleDetalleActivoFijo.add(this.movimientoactivofijoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetalleActivoFijo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Movimiento Activo Fijos",this.movimientoactivofijoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetalleActivoFijo.setComponentAt(iIndexTab,this.movimientoactivofijoBeanSwingJInternalFrame.getContentPane());
				}

				//MovimientoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.movimientoactivofijoSessionBean.setEsGuardarRelacionado(false);
				this.movimientoactivofijoBeanSwingJInternalFrame=null;//new MovimientoActivoFijoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.movimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteMovimientoActivoFijo) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Movimiento Activo Fijos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParteActivoFijo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
		this.parteactivofijoSessionBean.setConGuardarRelaciones(false);
		this.parteactivofijoSessionBean.setEsGuardarRelacionado(true);

		this.parteactivofijoBeanSwingJInternalFrame=null;//new ParteActivoFijoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parteactivofijoBeanSwingJInternalFramePopup=new ParteActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parteactivofijoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {

				ParteActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParteActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parteactivofijoSessionBean.setEsGuardarRelacionado(true);

				this.parteactivofijoBeanSwingJInternalFrame=new ParteActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parteactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parteactivofijoBeanSwingJInternalFrame.setparteactivofijoSessionBean(this.parteactivofijoSessionBean);

				//this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
				//this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
				//this.jContentPaneDetalleDetalleActivoFijo.add(this.parteactivofijoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetalleActivoFijo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Parte Activo Fijos",this.parteactivofijoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetalleActivoFijo.setComponentAt(iIndexTab,this.parteactivofijoBeanSwingJInternalFrame.getContentPane());
				}

				//ParteActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parteactivofijoSessionBean.setEsGuardarRelacionado(false);
				this.parteactivofijoBeanSwingJInternalFrame=null;//new ParteActivoFijoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParteActivoFijo) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Parte Activo Fijos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameResponsableActivoFijo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
		this.responsableactivofijoSessionBean.setConGuardarRelaciones(false);
		this.responsableactivofijoSessionBean.setEsGuardarRelacionado(true);

		this.responsableactivofijoBeanSwingJInternalFrame=null;//new ResponsableActivoFijoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.responsableactivofijoBeanSwingJInternalFramePopup=new ResponsableActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.responsableactivofijoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {

				ResponsableActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ResponsableActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.responsableactivofijoSessionBean.setEsGuardarRelacionado(true);

				this.responsableactivofijoBeanSwingJInternalFrame=new ResponsableActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.responsableactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.responsableactivofijoBeanSwingJInternalFrame.setresponsableactivofijoSessionBean(this.responsableactivofijoSessionBean);

				//this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
				//this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
				//this.jContentPaneDetalleDetalleActivoFijo.add(this.responsableactivofijoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetalleActivoFijo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Responsable Activo Fijos",this.responsableactivofijoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetalleActivoFijo.setComponentAt(iIndexTab,this.responsableactivofijoBeanSwingJInternalFrame.getContentPane());
				}

				//ResponsableActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.responsableactivofijoSessionBean.setEsGuardarRelacionado(false);
				this.responsableactivofijoBeanSwingJInternalFrame=null;//new ResponsableActivoFijoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteResponsableActivoFijo) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Responsable Activo Fijos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameServicioTransporte(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.serviciotransporteSessionBean=new ServicioTransporteSessionBean();
		this.serviciotransporteSessionBean.setConGuardarRelaciones(false);
		this.serviciotransporteSessionBean.setEsGuardarRelacionado(true);

		this.serviciotransporteBeanSwingJInternalFrame=null;//new ServicioTransporteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.serviciotransporteBeanSwingJInternalFramePopup=new ServicioTransporteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.serviciotransporteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.serviciotransporteSessionBean.getEsGuardarRelacionado()) {

				ServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.serviciotransporteSessionBean.setEsGuardarRelacionado(true);

				this.serviciotransporteBeanSwingJInternalFrame=new ServicioTransporteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.serviciotransporteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.serviciotransporteBeanSwingJInternalFrame.setserviciotransporteSessionBean(this.serviciotransporteSessionBean);

				//this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
				//this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
				//this.jContentPaneDetalleDetalleActivoFijo.add(this.serviciotransporteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetalleActivoFijo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Servicio Transportes",this.serviciotransporteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetalleActivoFijo.setComponentAt(iIndexTab,this.serviciotransporteBeanSwingJInternalFrame.getContentPane());
				}

				//ServicioTransporteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.serviciotransporteSessionBean.setEsGuardarRelacionado(false);
				this.serviciotransporteBeanSwingJInternalFrame=null;//new ServicioTransporteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.serviciotransporteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteServicioTransporte) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Servicio Transportes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameVehiculo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.vehiculoSessionBean=new VehiculoSessionBean();
		this.vehiculoSessionBean.setConGuardarRelaciones(false);
		this.vehiculoSessionBean.setEsGuardarRelacionado(true);

		this.vehiculoBeanSwingJInternalFrame=null;//new VehiculoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.vehiculoBeanSwingJInternalFramePopup=new VehiculoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.vehiculoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.vehiculoSessionBean.getEsGuardarRelacionado()) {

				VehiculoJInternalFrame.STIPO_TAMANIO_GENERAL=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
				VehiculoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.vehiculoSessionBean.setEsGuardarRelacionado(true);

				this.vehiculoBeanSwingJInternalFrame=new VehiculoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.vehiculoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.vehiculoBeanSwingJInternalFrame.setvehiculoSessionBean(this.vehiculoSessionBean);

				//this.gridBagConstraintsDetalleActivoFijo = new GridBagConstraints();
				//this.gridBagConstraintsDetalleActivoFijo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetalleActivoFijo.gridx = 0;
				//this.jContentPaneDetalleDetalleActivoFijo.add(this.vehiculoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetalleActivoFijo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Vehiculos",this.vehiculoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetalleActivoFijo.setComponentAt(iIndexTab,this.vehiculoBeanSwingJInternalFrame.getContentPane());
				}

				//VehiculoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.vehiculoSessionBean.setEsGuardarRelacionado(false);
				this.vehiculoBeanSwingJInternalFrame=null;//new VehiculoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.vehiculoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteVehiculo) {
					this.jTabbedPaneRelacionesDetalleActivoFijo.add("Vehiculos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarMantenimientoActivoFijoBeanSwingJInternalFrame(List<DetalleActivoFijo> detalleactivofijos,DetalleActivoFijo detalleactivofijo,MantenimientoActivoFijoBeanSwingJInternalFrame mantenimientoactivofijoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//mantenimientoactivofijoBeanSwingJInternalFrame=new MantenimientoActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					mantenimientoactivofijoBeanSwingJInternalFrame.getMantenimientoActivoFijoLogic().setConnexion(this.detalleactivofijoLogic.getConnexion());

					mantenimientoactivofijoBeanSwingJInternalFrame.setdetalleactivofijosForeignKey(detalleactivofijos);
					mantenimientoactivofijoBeanSwingJInternalFrame.setdetalleactivofijoForeignKey(detalleactivofijo);
					mantenimientoactivofijoBeanSwingJInternalFrame.mantenimientoactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleActivoFijo(true);
					mantenimientoactivofijoBeanSwingJInternalFrame.mantenimientoactivofijoSessionBean.setlidDetalleActivoFijoActual(detalleactivofijo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					mantenimientoactivofijoBeanSwingJInternalFrame.cargarCombosForeignKeyMantenimientoActivoFijo(mantenimientoactivofijoBeanSwingJInternalFrame.isCargarCombosDependencia);
					mantenimientoactivofijoBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetalleActivoFijo(true);
					mantenimientoactivofijoBeanSwingJInternalFrame.setid_detalle_activo_fijoFK_IdDetalleActivoFijo(detalleactivofijo.getId());

					if(!this.conCargarFormDetalle) {
						mantenimientoactivofijoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					mantenimientoactivofijoBeanSwingJInternalFrame.setSelectedItemCombosFrameDetalleActivoFijoForeignKey(detalleactivofijo,1,false,true,true);
					mantenimientoactivofijoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					mantenimientoactivofijoBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetalleActivoFijo");
					mantenimientoactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetalleActivoFijo");
					mantenimientoactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaMantenimientoActivoFijo(true);
					mantenimientoactivofijoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesMantenimientoActivoFijo("n",mantenimientoactivofijoBeanSwingJInternalFrame.isGuardarCambiosEnLote, mantenimientoactivofijoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					mantenimientoactivofijoBeanSwingJInternalFrame.setAutoscrolls(true);
					mantenimientoactivofijoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						mantenimientoactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsMantenimientoActivoFijo("relacionado");
					} else {
						mantenimientoactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsMantenimientoActivoFijo("no_relacionado");
					}

					mantenimientoactivofijoBeanSwingJInternalFrame.getjButtonRecargarInformacionMantenimientoActivoFijo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarServicioTransporteBeanSwingJInternalFrame(List<DetalleActivoFijo> detalleactivofijos,DetalleActivoFijo detalleactivofijo,ServicioTransporteBeanSwingJInternalFrame serviciotransporteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//serviciotransporteBeanSwingJInternalFrame=new ServicioTransporteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					serviciotransporteBeanSwingJInternalFrame.getServicioTransporteLogic().setConnexion(this.detalleactivofijoLogic.getConnexion());

					serviciotransporteBeanSwingJInternalFrame.setdetalleactivofijosForeignKey(detalleactivofijos);
					serviciotransporteBeanSwingJInternalFrame.setdetalleactivofijoForeignKey(detalleactivofijo);
					serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.setisBusquedaDesdeForeignKeySesionDetalleActivoFijo(true);
					serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.setlidDetalleActivoFijoActual(detalleactivofijo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					serviciotransporteBeanSwingJInternalFrame.cargarCombosForeignKeyServicioTransporte(serviciotransporteBeanSwingJInternalFrame.isCargarCombosDependencia);
					serviciotransporteBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetalleActivoFijo(true);
					serviciotransporteBeanSwingJInternalFrame.setid_detalle_activo_fijoFK_IdDetalleActivoFijo(detalleactivofijo.getId());

					if(!this.conCargarFormDetalle) {
						serviciotransporteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					serviciotransporteBeanSwingJInternalFrame.setSelectedItemCombosFrameDetalleActivoFijoForeignKey(detalleactivofijo,1,false,true,true);
					serviciotransporteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					serviciotransporteBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetalleActivoFijo");
					serviciotransporteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetalleActivoFijo");
					serviciotransporteBeanSwingJInternalFrame.inicializarActualizarBindingTablaServicioTransporte(true);
					serviciotransporteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesServicioTransporte("n",serviciotransporteBeanSwingJInternalFrame.isGuardarCambiosEnLote, serviciotransporteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					serviciotransporteBeanSwingJInternalFrame.setAutoscrolls(true);
					serviciotransporteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						serviciotransporteBeanSwingJInternalFrame.actualizarEstadoPanelsServicioTransporte("relacionado");
					} else {
						serviciotransporteBeanSwingJInternalFrame.actualizarEstadoPanelsServicioTransporte("no_relacionado");
					}

					serviciotransporteBeanSwingJInternalFrame.getjButtonRecargarInformacionServicioTransporte().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarMovimientoActivoFijoBeanSwingJInternalFrame(List<DetalleActivoFijo> detalleactivofijos,DetalleActivoFijo detalleactivofijo,MovimientoActivoFijoBeanSwingJInternalFrame movimientoactivofijoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//movimientoactivofijoBeanSwingJInternalFrame=new MovimientoActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					movimientoactivofijoBeanSwingJInternalFrame.getMovimientoActivoFijoLogic().setConnexion(this.detalleactivofijoLogic.getConnexion());

					movimientoactivofijoBeanSwingJInternalFrame.setdetalleactivofijodestinosForeignKey(detalleactivofijos);
					movimientoactivofijoBeanSwingJInternalFrame.setdetalleactivofijodestinoForeignKey(detalleactivofijo);
					movimientoactivofijoBeanSwingJInternalFrame.movimientoactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleActivoFijoDestino(true);
					movimientoactivofijoBeanSwingJInternalFrame.movimientoactivofijoSessionBean.setlidDetalleActivoFijoDestinoActual(detalleactivofijo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					movimientoactivofijoBeanSwingJInternalFrame.cargarCombosForeignKeyMovimientoActivoFijo(movimientoactivofijoBeanSwingJInternalFrame.isCargarCombosDependencia);
					movimientoactivofijoBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetalleActivoFijoDestino(true);
					movimientoactivofijoBeanSwingJInternalFrame.setid_detalle_activo_fijo_destinoFK_IdDetalleActivoFijoDestino(detalleactivofijo.getId());

					if(!this.conCargarFormDetalle) {
						movimientoactivofijoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					movimientoactivofijoBeanSwingJInternalFrame.setSelectedItemCombosFrameDetalleActivoFijoDestinoForeignKey(detalleactivofijo,1,false,true,true);
					movimientoactivofijoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					movimientoactivofijoBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetalleActivoFijo");
					movimientoactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetalleActivoFijo");
					movimientoactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaMovimientoActivoFijo(true);
					movimientoactivofijoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesMovimientoActivoFijo("n",movimientoactivofijoBeanSwingJInternalFrame.isGuardarCambiosEnLote, movimientoactivofijoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					movimientoactivofijoBeanSwingJInternalFrame.setAutoscrolls(true);
					movimientoactivofijoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						movimientoactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsMovimientoActivoFijo("relacionado");
					} else {
						movimientoactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsMovimientoActivoFijo("no_relacionado");
					}

					movimientoactivofijoBeanSwingJInternalFrame.getjButtonRecargarInformacionMovimientoActivoFijo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarVehiculoBeanSwingJInternalFrame(List<DetalleActivoFijo> detalleactivofijos,DetalleActivoFijo detalleactivofijo,VehiculoBeanSwingJInternalFrame vehiculoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//vehiculoBeanSwingJInternalFrame=new VehiculoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					vehiculoBeanSwingJInternalFrame.getVehiculoLogic().setConnexion(this.detalleactivofijoLogic.getConnexion());

					vehiculoBeanSwingJInternalFrame.setdetalleactivofijosForeignKey(detalleactivofijos);
					vehiculoBeanSwingJInternalFrame.setdetalleactivofijoForeignKey(detalleactivofijo);
					vehiculoBeanSwingJInternalFrame.vehiculoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleActivoFijo(true);
					vehiculoBeanSwingJInternalFrame.vehiculoSessionBean.setlidDetalleActivoFijoActual(detalleactivofijo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					vehiculoBeanSwingJInternalFrame.cargarCombosForeignKeyVehiculo(vehiculoBeanSwingJInternalFrame.isCargarCombosDependencia);
					vehiculoBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetalleActivoFijo(true);
					vehiculoBeanSwingJInternalFrame.setid_detalle_activo_fijoFK_IdDetalleActivoFijo(detalleactivofijo.getId());

					if(!this.conCargarFormDetalle) {
						vehiculoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					vehiculoBeanSwingJInternalFrame.setSelectedItemCombosFrameDetalleActivoFijoForeignKey(detalleactivofijo,1,false,true,true);
					vehiculoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					vehiculoBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetalleActivoFijo");
					vehiculoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetalleActivoFijo");
					vehiculoBeanSwingJInternalFrame.inicializarActualizarBindingTablaVehiculo(true);
					vehiculoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesVehiculo("n",vehiculoBeanSwingJInternalFrame.isGuardarCambiosEnLote, vehiculoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					vehiculoBeanSwingJInternalFrame.setAutoscrolls(true);
					vehiculoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						vehiculoBeanSwingJInternalFrame.actualizarEstadoPanelsVehiculo("relacionado");
					} else {
						vehiculoBeanSwingJInternalFrame.actualizarEstadoPanelsVehiculo("no_relacionado");
					}

					vehiculoBeanSwingJInternalFrame.getjButtonRecargarInformacionVehiculo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarMetodoDepreciacionBeanSwingJInternalFrame(List<DetalleActivoFijo> detalleactivofijos,DetalleActivoFijo detalleactivofijo,MetodoDepreciacionBeanSwingJInternalFrame metododepreciacionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//metododepreciacionBeanSwingJInternalFrame=new MetodoDepreciacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					metododepreciacionBeanSwingJInternalFrame.getMetodoDepreciacionLogic().setConnexion(this.detalleactivofijoLogic.getConnexion());

					metododepreciacionBeanSwingJInternalFrame.setdetalleactivofijosForeignKey(detalleactivofijos);
					metododepreciacionBeanSwingJInternalFrame.setdetalleactivofijoForeignKey(detalleactivofijo);
					metododepreciacionBeanSwingJInternalFrame.metododepreciacionSessionBean.setisBusquedaDesdeForeignKeySesionDetalleActivoFijo(true);
					metododepreciacionBeanSwingJInternalFrame.metododepreciacionSessionBean.setlidDetalleActivoFijoActual(detalleactivofijo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					metododepreciacionBeanSwingJInternalFrame.cargarCombosForeignKeyMetodoDepreciacion(metododepreciacionBeanSwingJInternalFrame.isCargarCombosDependencia);
					metododepreciacionBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetalleActivoFijo(true);
					metododepreciacionBeanSwingJInternalFrame.setid_detalle_activo_fijoFK_IdDetalleActivoFijo(detalleactivofijo.getId());

					if(!this.conCargarFormDetalle) {
						metododepreciacionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					metododepreciacionBeanSwingJInternalFrame.setSelectedItemCombosFrameDetalleActivoFijoForeignKey(detalleactivofijo,1,false,true,true);
					metododepreciacionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					metododepreciacionBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetalleActivoFijo");
					metododepreciacionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetalleActivoFijo");
					metododepreciacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaMetodoDepreciacion(true);
					metododepreciacionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesMetodoDepreciacion("n",metododepreciacionBeanSwingJInternalFrame.isGuardarCambiosEnLote, metododepreciacionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					metododepreciacionBeanSwingJInternalFrame.setAutoscrolls(true);
					metododepreciacionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						metododepreciacionBeanSwingJInternalFrame.actualizarEstadoPanelsMetodoDepreciacion("relacionado");
					} else {
						metododepreciacionBeanSwingJInternalFrame.actualizarEstadoPanelsMetodoDepreciacion("no_relacionado");
					}

					metododepreciacionBeanSwingJInternalFrame.getjButtonRecargarInformacionMetodoDepreciacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarResponsableActivoFijoBeanSwingJInternalFrame(List<DetalleActivoFijo> detalleactivofijos,DetalleActivoFijo detalleactivofijo,ResponsableActivoFijoBeanSwingJInternalFrame responsableactivofijoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//responsableactivofijoBeanSwingJInternalFrame=new ResponsableActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					responsableactivofijoBeanSwingJInternalFrame.getResponsableActivoFijoLogic().setConnexion(this.detalleactivofijoLogic.getConnexion());

					responsableactivofijoBeanSwingJInternalFrame.setdetalleactivofijosForeignKey(detalleactivofijos);
					responsableactivofijoBeanSwingJInternalFrame.setdetalleactivofijoForeignKey(detalleactivofijo);
					responsableactivofijoBeanSwingJInternalFrame.responsableactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleActivoFijo(true);
					responsableactivofijoBeanSwingJInternalFrame.responsableactivofijoSessionBean.setlidDetalleActivoFijoActual(detalleactivofijo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					responsableactivofijoBeanSwingJInternalFrame.cargarCombosForeignKeyResponsableActivoFijo(responsableactivofijoBeanSwingJInternalFrame.isCargarCombosDependencia);
					responsableactivofijoBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetalleActivoFijo(true);
					responsableactivofijoBeanSwingJInternalFrame.setid_detalle_activo_fijoFK_IdDetalleActivoFijo(detalleactivofijo.getId());

					if(!this.conCargarFormDetalle) {
						responsableactivofijoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					responsableactivofijoBeanSwingJInternalFrame.setSelectedItemCombosFrameDetalleActivoFijoForeignKey(detalleactivofijo,1,false,true,true);
					responsableactivofijoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					responsableactivofijoBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetalleActivoFijo");
					responsableactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetalleActivoFijo");
					responsableactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaResponsableActivoFijo(true);
					responsableactivofijoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesResponsableActivoFijo("n",responsableactivofijoBeanSwingJInternalFrame.isGuardarCambiosEnLote, responsableactivofijoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					responsableactivofijoBeanSwingJInternalFrame.setAutoscrolls(true);
					responsableactivofijoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						responsableactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsResponsableActivoFijo("relacionado");
					} else {
						responsableactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsResponsableActivoFijo("no_relacionado");
					}

					responsableactivofijoBeanSwingJInternalFrame.getjButtonRecargarInformacionResponsableActivoFijo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDepreciacionActivoFijoBeanSwingJInternalFrame(List<DetalleActivoFijo> detalleactivofijos,DetalleActivoFijo detalleactivofijo,DepreciacionActivoFijoBeanSwingJInternalFrame depreciacionactivofijoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//depreciacionactivofijoBeanSwingJInternalFrame=new DepreciacionActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					depreciacionactivofijoBeanSwingJInternalFrame.getDepreciacionActivoFijoLogic().setConnexion(this.detalleactivofijoLogic.getConnexion());

					depreciacionactivofijoBeanSwingJInternalFrame.setdetalleactivofijosForeignKey(detalleactivofijos);
					depreciacionactivofijoBeanSwingJInternalFrame.setdetalleactivofijoForeignKey(detalleactivofijo);
					depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleActivoFijo(true);
					depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.setlidDetalleActivoFijoActual(detalleactivofijo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					depreciacionactivofijoBeanSwingJInternalFrame.cargarCombosForeignKeyDepreciacionActivoFijo(depreciacionactivofijoBeanSwingJInternalFrame.isCargarCombosDependencia);
					depreciacionactivofijoBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetalleActivoFijo(true);
					depreciacionactivofijoBeanSwingJInternalFrame.setid_detalle_activo_fijoFK_IdDetalleActivoFijo(detalleactivofijo.getId());

					if(!this.conCargarFormDetalle) {
						depreciacionactivofijoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					depreciacionactivofijoBeanSwingJInternalFrame.setSelectedItemCombosFrameDetalleActivoFijoForeignKey(detalleactivofijo,1,false,true,true);
					depreciacionactivofijoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					depreciacionactivofijoBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetalleActivoFijo");
					depreciacionactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetalleActivoFijo");
					depreciacionactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDepreciacionActivoFijo(true);
					depreciacionactivofijoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDepreciacionActivoFijo("n",depreciacionactivofijoBeanSwingJInternalFrame.isGuardarCambiosEnLote, depreciacionactivofijoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					depreciacionactivofijoBeanSwingJInternalFrame.setAutoscrolls(true);
					depreciacionactivofijoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						depreciacionactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDepreciacionActivoFijo("relacionado");
					} else {
						depreciacionactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDepreciacionActivoFijo("no_relacionado");
					}

					depreciacionactivofijoBeanSwingJInternalFrame.getjButtonRecargarInformacionDepreciacionActivoFijo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarGastoDepreciacionCentroCostoBeanSwingJInternalFrame(List<DetalleActivoFijo> detalleactivofijos,DetalleActivoFijo detalleactivofijo,GastoDepreciacionCentroCostoBeanSwingJInternalFrame gastodepreciacioncentrocostoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//gastodepreciacioncentrocostoBeanSwingJInternalFrame=new GastoDepreciacionCentroCostoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					gastodepreciacioncentrocostoBeanSwingJInternalFrame.getGastoDepreciacionCentroCostoLogic().setConnexion(this.detalleactivofijoLogic.getConnexion());

					gastodepreciacioncentrocostoBeanSwingJInternalFrame.setdetalleactivofijosForeignKey(detalleactivofijos);
					gastodepreciacioncentrocostoBeanSwingJInternalFrame.setdetalleactivofijoForeignKey(detalleactivofijo);
					gastodepreciacioncentrocostoBeanSwingJInternalFrame.gastodepreciacioncentrocostoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleActivoFijo(true);
					gastodepreciacioncentrocostoBeanSwingJInternalFrame.gastodepreciacioncentrocostoSessionBean.setlidDetalleActivoFijoActual(detalleactivofijo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					gastodepreciacioncentrocostoBeanSwingJInternalFrame.cargarCombosForeignKeyGastoDepreciacionCentroCosto(gastodepreciacioncentrocostoBeanSwingJInternalFrame.isCargarCombosDependencia);
					gastodepreciacioncentrocostoBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetalleActivoFijo(true);
					gastodepreciacioncentrocostoBeanSwingJInternalFrame.setid_detalle_activo_fijoFK_IdDetalleActivoFijo(detalleactivofijo.getId());

					if(!this.conCargarFormDetalle) {
						gastodepreciacioncentrocostoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					gastodepreciacioncentrocostoBeanSwingJInternalFrame.setSelectedItemCombosFrameDetalleActivoFijoForeignKey(detalleactivofijo,1,false,true,true);
					gastodepreciacioncentrocostoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					gastodepreciacioncentrocostoBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetalleActivoFijo");
					gastodepreciacioncentrocostoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetalleActivoFijo");
					gastodepreciacioncentrocostoBeanSwingJInternalFrame.inicializarActualizarBindingTablaGastoDepreciacionCentroCosto(true);
					gastodepreciacioncentrocostoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesGastoDepreciacionCentroCosto("n",gastodepreciacioncentrocostoBeanSwingJInternalFrame.isGuardarCambiosEnLote, gastodepreciacioncentrocostoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					gastodepreciacioncentrocostoBeanSwingJInternalFrame.setAutoscrolls(true);
					gastodepreciacioncentrocostoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						gastodepreciacioncentrocostoBeanSwingJInternalFrame.actualizarEstadoPanelsGastoDepreciacionCentroCosto("relacionado");
					} else {
						gastodepreciacioncentrocostoBeanSwingJInternalFrame.actualizarEstadoPanelsGastoDepreciacionCentroCosto("no_relacionado");
					}

					gastodepreciacioncentrocostoBeanSwingJInternalFrame.getjButtonRecargarInformacionGastoDepreciacionCentroCosto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParteActivoFijoBeanSwingJInternalFrame(List<DetalleActivoFijo> detalleactivofijos,DetalleActivoFijo detalleactivofijo,ParteActivoFijoBeanSwingJInternalFrame parteactivofijoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parteactivofijoBeanSwingJInternalFrame=new ParteActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parteactivofijoBeanSwingJInternalFrame.getParteActivoFijoLogic().setConnexion(this.detalleactivofijoLogic.getConnexion());

					parteactivofijoBeanSwingJInternalFrame.setdetalleactivofijosForeignKey(detalleactivofijos);
					parteactivofijoBeanSwingJInternalFrame.setdetalleactivofijoForeignKey(detalleactivofijo);
					parteactivofijoBeanSwingJInternalFrame.parteactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleActivoFijo(true);
					parteactivofijoBeanSwingJInternalFrame.parteactivofijoSessionBean.setlidDetalleActivoFijoActual(detalleactivofijo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parteactivofijoBeanSwingJInternalFrame.cargarCombosForeignKeyParteActivoFijo(parteactivofijoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parteactivofijoBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetalleActivoFijo(true);
					parteactivofijoBeanSwingJInternalFrame.setid_detalle_activo_fijoFK_IdDetalleActivoFijo(detalleactivofijo.getId());

					if(!this.conCargarFormDetalle) {
						parteactivofijoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parteactivofijoBeanSwingJInternalFrame.setSelectedItemCombosFrameDetalleActivoFijoForeignKey(detalleactivofijo,1,false,true,true);
					parteactivofijoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parteactivofijoBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetalleActivoFijo");
					parteactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetalleActivoFijo");
					parteactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParteActivoFijo(true);
					parteactivofijoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParteActivoFijo("n",parteactivofijoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parteactivofijoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parteactivofijoBeanSwingJInternalFrame.setAutoscrolls(true);
					parteactivofijoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parteactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsParteActivoFijo("relacionado");
					} else {
						parteactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsParteActivoFijo("no_relacionado");
					}

					parteactivofijoBeanSwingJInternalFrame.getjButtonRecargarInformacionParteActivoFijo().setVisible(false);

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
