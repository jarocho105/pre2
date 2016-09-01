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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.ParametroGenericoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class ParametroGenericoDetalleFormJInternalFrame extends ParametroGenericoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroGenerico;
	
	protected JMenuBar jmenuBarDetalleParametroGenerico;
	
	protected JMenu jmenuDetalleParametroGenerico;
	protected JMenu jmenuDetalleArchivoParametroGenerico;
	protected JMenu jmenuDetalleAccionesParametroGenerico;
	protected JMenu jmenuDetalleDatosParametroGenerico;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroGenerico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroGenerico;	
	protected GridBagConstraints gridBagConstraintsParametroGenerico;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroGenericoBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroGenerico;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TransaccionBeanSwingJInternalFrame transaccionreciboBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionrecibo="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ServicioBeanSwingJInternalFrame servicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_servicio="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected FormatoBeanSwingJInternalFrame formatoreciboBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatorecibo="";
	
	public ParametroGenericoSessionBean parametrogenericoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TransaccionSessionBean transaccionreciboSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ServicioSessionBean servicioSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public FormatoSessionBean formatoreciboSessionBean;	
	
	public ParametroGenericoLogic parametrogenericoLogic;
	
	public JScrollPane jScrollPanelDatosParametroGenerico;
	public JScrollPane jScrollPanelDatosEdicionParametroGenerico;
	public JScrollPane jScrollPanelDatosGeneralParametroGenerico;
	
	protected JPanel jPanelCamposParametroGenerico;    
	protected JPanel jPanelCamposOcultosParametroGenerico;    	
	protected JPanel jPanelAccionesParametroGenerico;
	protected JPanel jPanelAccionesFormularioParametroGenerico;
    
	
	
	protected Integer iXPanelCamposParametroGenerico=0;
	protected Integer iYPanelCamposParametroGenerico=0;
	
	protected Integer iXPanelCamposOcultosParametroGenerico=0;
	protected Integer iYPanelCamposOcultosParametroGenerico=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroGenerico;
	public JButton jButtonModificarParametroGenerico;
	public JButton jButtonActualizarParametroGenerico;
    public JButton jButtonEliminarParametroGenerico;
	public JButton jButtonCancelarParametroGenerico;
    public JButton jButtonGuardarCambiosParametroGenerico;
	public JButton jButtonGuardarCambiosTablaParametroGenerico;
	protected JButton jButtonCerrarParametroGenerico;
	
	
	protected JButton jButtonProcesarInformacionParametroGenerico;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroGenerico;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroGenerico;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroGenerico;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroGenerico;
	protected JButton jButtonModificarToolBarParametroGenerico;
	protected JButton jButtonActualizarToolBarParametroGenerico;
    protected JButton jButtonEliminarToolBarParametroGenerico;
	protected JButton jButtonCancelarToolBarParametroGenerico;
    protected JButton jButtonGuardarCambiosToolBarParametroGenerico;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroGenerico;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroGenerico;
	protected JButton jButtonCerrarToolBarParametroGenerico;
	
	protected JButton jButtonProcesarInformacionToolBarParametroGenerico;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroGenerico;
	protected JMenuItem jMenuItemModificarParametroGenerico;
	protected JMenuItem jMenuItemActualizarParametroGenerico;
    protected JMenuItem jMenuItemEliminarParametroGenerico;
	protected JMenuItem jMenuItemCancelarParametroGenerico;
    protected JMenuItem jMenuItemGuardarCambiosParametroGenerico;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroGenerico;
	protected JMenuItem jMenuItemCerrarParametroGenerico;
	protected JMenuItem jMenuItemDetalleCerrarParametroGenerico;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroGenerico;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroGenerico;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroGenerico;
	protected JMenuItem jMenuItemMostrarOcultarParametroGenerico;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroGenerico;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroGenerico;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroGenerico;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroGenerico;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroGenerico;
	public JLabel jLabelIdParametroGenerico;
	public JLabel jLabelidParametroGenerico;
	public JButton jButtonidParametroGenericoBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialParametroGenerico;
	public JLabel jLabelsecuencialParametroGenerico;
	public JTextField jTextFieldsecuencialParametroGenerico;
	public JButton jButtonsecuencialParametroGenericoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoParametroGenerico;
	public JLabel jLabelcodigoParametroGenerico;
	public JCheckBox jCheckBoxcodigoParametroGenerico;
	public JButton jButtoncodigoParametroGenericoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroGenerico;
	public JLabel jLabelid_empresaParametroGenerico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroGenerico;
	public JButton jButtonid_empresaParametroGenerico= new JButtonMe();
	public JButton jButtonid_empresaParametroGenericoUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroGenericoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalParametroGenerico;
	public JLabel jLabelid_sucursalParametroGenerico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalParametroGenerico;
	public JButton jButtonid_sucursalParametroGenerico= new JButtonMe();
	public JButton jButtonid_sucursalParametroGenericoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalParametroGenericoBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloParametroGenerico;
	public JLabel jLabelid_moduloParametroGenerico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloParametroGenerico;
	public JButton jButtonid_moduloParametroGenerico= new JButtonMe();
	public JButton jButtonid_moduloParametroGenericoUpdate= new JButtonMe();
	public JButton jButtonid_moduloParametroGenericoBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionParametroGenerico;
	public JLabel jLabelid_transaccionParametroGenerico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionParametroGenerico;
	public JButton jButtonid_transaccionParametroGenerico= new JButtonMe();
	public JButton jButtonid_transaccionParametroGenericoUpdate= new JButtonMe();
	public JButton jButtonid_transaccionParametroGenericoBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_reciboParametroGenerico;
	public JLabel jLabelid_transaccion_reciboParametroGenerico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_reciboParametroGenerico;
	public JButton jButtonid_transaccion_reciboParametroGenerico= new JButtonMe();
	public JButton jButtonid_transaccion_reciboParametroGenericoUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_reciboParametroGenericoBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaParametroGenerico;
	public JLabel jLabelid_bodegaParametroGenerico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaParametroGenerico;
	public JButton jButtonid_bodegaParametroGenerico= new JButtonMe();
	public JButton jButtonid_bodegaParametroGenericoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaParametroGenericoBusqueda= new JButtonMe();

	public JPanel jPanelid_servicioParametroGenerico;
	public JLabel jLabelid_servicioParametroGenerico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_servicioParametroGenerico;
	public JButton jButtonid_servicioParametroGenerico= new JButtonMe();
	public JButton jButtonid_servicioParametroGenericoUpdate= new JButtonMe();
	public JButton jButtonid_servicioParametroGenericoBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoParametroGenerico;
	public JLabel jLabelid_formatoParametroGenerico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoParametroGenerico;
	public JButton jButtonid_formatoParametroGenerico= new JButtonMe();
	public JButton jButtonid_formatoParametroGenericoUpdate= new JButtonMe();
	public JButton jButtonid_formatoParametroGenericoBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_reciboParametroGenerico;
	public JLabel jLabelid_formato_reciboParametroGenerico;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_reciboParametroGenerico;
	public JButton jButtonid_formato_reciboParametroGenerico= new JButtonMe();
	public JButton jButtonid_formato_reciboParametroGenericoUpdate= new JButtonMe();
	public JButton jButtonid_formato_reciboParametroGenericoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroGenerico;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroGenericoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroGenerico=new JPanel();
				this.jPanelAccionesFormularioParametroGenerico=new JPanel();
				this.jmenuBarDetalleParametroGenerico=new JMenuBar();
				this.jTtoolBarDetalleParametroGenerico=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGenericoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroGenerico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroGenericoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroGenerico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGenericoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGenerico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGenericoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGenerico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGenericoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroGenerico No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroGenerico() {
		return this.jButtonActualizarToolBarParametroGenerico;
	}
	
	public JButton getjButtonEliminarToolBarParametroGenerico() {
		return this.jButtonEliminarToolBarParametroGenerico;
	}
	
	public JButton getjButtonCancelarToolBarParametroGenerico() {
		return this.jButtonCancelarToolBarParametroGenerico;
	}		
	
	public JButton getjButtonProcesarInformacionParametroGenerico() {
		return this.jButtonProcesarInformacionParametroGenerico;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroGenerico)	{
		this.jButtonProcesarInformacionParametroGenerico = jButtonProcesarInformacionParametroGenerico;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroGenerico() {
		return this.jComboBoxTiposAccionesParametroGenerico;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroGenerico(
			JComboBox jComboBoxTiposRelacionesParametroGenerico) {
		this.jComboBoxTiposRelacionesParametroGenerico = jComboBoxTiposRelacionesParametroGenerico;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroGenerico(
			JComboBox jComboBoxTiposAccionesParametroGenerico) {
		this.jComboBoxTiposAccionesParametroGenerico = jComboBoxTiposAccionesParametroGenerico;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroGenerico() {
		return this.jComboBoxTiposAccionesFormularioParametroGenerico;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroGenerico(
			JComboBox jComboBoxTiposAccionesFormularioParametroGenerico) {
		this.jComboBoxTiposAccionesFormularioParametroGenerico = jComboBoxTiposAccionesFormularioParametroGenerico;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrogenericoSessionBean=new ParametroGenericoSessionBean();
		
		this.parametrogenericoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrogenericoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrogenericoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroGenericoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroGenericoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroGenericoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Generico MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroGenericoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroGenerico= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroGenerico=new JButtonMe();
				this.jButtonModificarToolBarParametroGenerico=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroGenerico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroGenerico,this.jTtoolBarDetalleParametroGenerico,
							"actualizar","actualizar","Actualizar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroGenerico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroGenerico,this.jTtoolBarDetalleParametroGenerico,
							"eliminar","eliminar","Eliminar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroGenerico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroGenerico,this.jTtoolBarDetalleParametroGenerico,
							"cancelar","cancelar","Cancelar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroGenerico=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroGenerico,this.jTtoolBarDetalleParametroGenerico,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroGenerico=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroGenerico=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroGenerico=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroGenerico=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroGenerico=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroGenerico= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroGenerico.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroGenerico,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroGenerico= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroGenerico.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroGenerico,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroGenerico= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroGenerico.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroGenerico,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroGenerico= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroGenerico.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroGenerico,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroGenerico= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroGenerico.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroGenerico,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroGenerico= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroGenerico.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroGenerico,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroGenerico= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroGenerico.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroGenerico,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroGenerico= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroGenerico.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroGenerico,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroGenerico= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroGenerico.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroGenerico,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroGenerico= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroGenerico.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroGenerico,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroGenerico.add(this.jMenuItemDetalleCerrarParametroGenerico);
		
		this.jmenuDetalleAccionesParametroGenerico.add(this.jMenuItemActualizarParametroGenerico);
		this.jmenuDetalleAccionesParametroGenerico.add(this.jMenuItemEliminarParametroGenerico);
		this.jmenuDetalleAccionesParametroGenerico.add(this.jMenuItemCancelarParametroGenerico);		
		
		//this.jmenuDetalleDatosParametroGenerico.add(this.jMenuItemDetalleAbrirOrderByParametroGenerico);				
		this.jmenuDetalleDatosParametroGenerico.add(this.jMenuItemDetalleMostarOcultarParametroGenerico);				
				
		//this.jmenuDetalleAccionesParametroGenerico.add(this.jMenuItemGuardarCambiosParametroGenerico);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroGenerico.add(this.jmenuDetalleArchivoParametroGenerico);		
		this.jmenuBarDetalleParametroGenerico.add(this.jmenuDetalleAccionesParametroGenerico);		
		this.jmenuBarDetalleParametroGenerico.add(this.jmenuDetalleDatosParametroGenerico);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroGenerico);				
	}
	
	
	public void inicializarElementosCamposParametroGenerico() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroGenerico = new JLabelMe();
		jLabelIdParametroGenerico.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroGenerico = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroGenerico.setToolTipText(ParametroGenericoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroGenerico= new GridBagLayout();

		this.jPanelidParametroGenerico.setLayout(this.gridaBagLayoutParametroGenerico);

		jLabelidParametroGenerico = new JLabel();
		jLabelidParametroGenerico.setText("Id");

		jLabelidParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuencialParametroGenerico = new JLabelMe();
		this.jLabelsecuencialParametroGenerico.setText(""+ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialParametroGenerico.setToolTipText("Secuencial");
		this.jLabelsecuencialParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialParametroGenerico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialParametroGenerico.setToolTipText(ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutParametroGenerico = new GridBagLayout();
		this.jPanelsecuencialParametroGenerico.setLayout(this.gridaBagLayoutParametroGenerico);


		jTextFieldsecuencialParametroGenerico= new JTextFieldMe();

		jTextFieldsecuencialParametroGenerico.setEnabled(false);
		jTextFieldsecuencialParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialParametroGenericoBusqueda= new JButtonMe();
		this.jButtonsecuencialParametroGenericoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialParametroGenericoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialParametroGenericoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialParametroGenericoBusqueda.setText("U");
		this.jButtonsecuencialParametroGenericoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialParametroGenericoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialParametroGenericoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialParametroGenericoBusqueda"));

		if(this.parametrogenericoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialParametroGenericoBusqueda.setVisible(false);		}


					
		this.jLabelcodigoParametroGenerico = new JLabelMe();
		this.jLabelcodigoParametroGenerico.setText(""+ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD+" : *");
		this.jLabelcodigoParametroGenerico.setToolTipText("Presupuesto Ciudad");
		this.jLabelcodigoParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigoParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigoParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoParametroGenerico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoParametroGenerico.setToolTipText(ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD);
		this.gridaBagLayoutParametroGenerico = new GridBagLayout();
		this.jPanelcodigoParametroGenerico.setLayout(this.gridaBagLayoutParametroGenerico);


		jCheckBoxcodigoParametroGenerico= new JCheckBoxMe();
		jCheckBoxcodigoParametroGenerico.setEnabled(false);

		jCheckBoxcodigoParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcodigoParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcodigoParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcodigoParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoParametroGenericoBusqueda= new JButtonMe();
		this.jButtoncodigoParametroGenericoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoParametroGenericoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoParametroGenericoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoParametroGenericoBusqueda.setText("U");
		this.jButtoncodigoParametroGenericoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoParametroGenericoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoParametroGenericoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcodigoParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcodigoParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoParametroGenericoBusqueda"));

		if(this.parametrogenericoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoParametroGenericoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroGenerico() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroGenerico = new JLabelMe();
		this.jLabelid_empresaParametroGenerico.setText(""+ParametroGenericoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroGenerico.setToolTipText("Empresa");
		this.jLabelid_empresaParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroGenerico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroGenerico.setToolTipText(ParametroGenericoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroGenerico = new GridBagLayout();
		this.jPanelid_empresaParametroGenerico.setLayout(this.gridaBagLayoutParametroGenerico);


		jComboBoxid_empresaParametroGenerico= new JComboBoxMe();
		jComboBoxid_empresaParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroGenerico.setEnabled(false);

		this.jButtonid_empresaParametroGenerico= new JButtonMe();
		this.jButtonid_empresaParametroGenerico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroGenerico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroGenerico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroGenerico.setText("Buscar");
		this.jButtonid_empresaParametroGenerico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroGenerico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroGenerico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroGenerico"));

		this.jButtonid_empresaParametroGenericoBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroGenericoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroGenericoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroGenericoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroGenericoBusqueda.setText("U");
		this.jButtonid_empresaParametroGenericoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroGenericoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroGenericoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroGenericoBusqueda"));

		if(this.parametrogenericoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroGenericoBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroGenericoUpdate= new JButtonMe();
		this.jButtonid_empresaParametroGenericoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroGenericoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroGenericoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroGenericoUpdate.setText("U");
		this.jButtonid_empresaParametroGenericoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroGenericoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroGenericoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroGenericoUpdate"));



					
		this.jLabelid_sucursalParametroGenerico = new JLabelMe();
		this.jLabelid_sucursalParametroGenerico.setText(""+ParametroGenericoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalParametroGenerico.setToolTipText("Sucursal");
		this.jLabelid_sucursalParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalParametroGenerico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalParametroGenerico.setToolTipText(ParametroGenericoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutParametroGenerico = new GridBagLayout();
		this.jPanelid_sucursalParametroGenerico.setLayout(this.gridaBagLayoutParametroGenerico);


		jComboBoxid_sucursalParametroGenerico= new JComboBoxMe();
		jComboBoxid_sucursalParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalParametroGenerico.setEnabled(false);

		this.jButtonid_sucursalParametroGenerico= new JButtonMe();
		this.jButtonid_sucursalParametroGenerico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroGenerico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroGenerico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroGenerico.setText("Buscar");
		this.jButtonid_sucursalParametroGenerico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalParametroGenerico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroGenerico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroGenerico"));

		this.jButtonid_sucursalParametroGenericoBusqueda= new JButtonMe();
		this.jButtonid_sucursalParametroGenericoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroGenericoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroGenericoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroGenericoBusqueda.setText("U");
		this.jButtonid_sucursalParametroGenericoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalParametroGenericoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroGenericoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroGenericoBusqueda"));

		if(this.parametrogenericoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalParametroGenericoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalParametroGenericoUpdate= new JButtonMe();
		this.jButtonid_sucursalParametroGenericoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroGenericoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroGenericoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroGenericoUpdate.setText("U");
		this.jButtonid_sucursalParametroGenericoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalParametroGenericoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroGenericoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroGenericoUpdate"));



					
		this.jLabelid_moduloParametroGenerico = new JLabelMe();
		this.jLabelid_moduloParametroGenerico.setText(""+ParametroGenericoConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloParametroGenerico.setToolTipText("Modulo");
		this.jLabelid_moduloParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloParametroGenerico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloParametroGenerico.setToolTipText(ParametroGenericoConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutParametroGenerico = new GridBagLayout();
		this.jPanelid_moduloParametroGenerico.setLayout(this.gridaBagLayoutParametroGenerico);


		jComboBoxid_moduloParametroGenerico= new JComboBoxMe();
		jComboBoxid_moduloParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_moduloParametroGenerico= new JButtonMe();
		this.jButtonid_moduloParametroGenerico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloParametroGenerico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloParametroGenerico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloParametroGenerico.setText("Buscar");
		this.jButtonid_moduloParametroGenerico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloParametroGenerico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloParametroGenerico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloParametroGenerico"));

		this.jButtonid_moduloParametroGenericoBusqueda= new JButtonMe();
		this.jButtonid_moduloParametroGenericoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloParametroGenericoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloParametroGenericoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloParametroGenericoBusqueda.setText("U");
		this.jButtonid_moduloParametroGenericoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloParametroGenericoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloParametroGenericoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloParametroGenericoBusqueda"));

		if(this.parametrogenericoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloParametroGenericoBusqueda.setVisible(false);		}

		this.jButtonid_moduloParametroGenericoUpdate= new JButtonMe();
		this.jButtonid_moduloParametroGenericoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloParametroGenericoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloParametroGenericoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloParametroGenericoUpdate.setText("U");
		this.jButtonid_moduloParametroGenericoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloParametroGenericoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloParametroGenericoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloParametroGenericoUpdate"));



					
		this.jLabelid_transaccionParametroGenerico = new JLabelMe();
		this.jLabelid_transaccionParametroGenerico.setText(""+ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionParametroGenerico.setToolTipText("Transaccion");
		this.jLabelid_transaccionParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionParametroGenerico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionParametroGenerico.setToolTipText(ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutParametroGenerico = new GridBagLayout();
		this.jPanelid_transaccionParametroGenerico.setLayout(this.gridaBagLayoutParametroGenerico);


		jComboBoxid_transaccionParametroGenerico= new JComboBoxMe();
		jComboBoxid_transaccionParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionParametroGenerico= new JButtonMe();
		this.jButtonid_transaccionParametroGenerico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionParametroGenerico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionParametroGenerico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionParametroGenerico.setText("Buscar");
		this.jButtonid_transaccionParametroGenerico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionParametroGenerico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionParametroGenerico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionParametroGenerico"));

		this.jButtonid_transaccionParametroGenericoBusqueda= new JButtonMe();
		this.jButtonid_transaccionParametroGenericoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionParametroGenericoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionParametroGenericoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionParametroGenericoBusqueda.setText("U");
		this.jButtonid_transaccionParametroGenericoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionParametroGenericoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionParametroGenericoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionParametroGenericoBusqueda"));

		if(this.parametrogenericoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionParametroGenericoBusqueda.setVisible(false);		}

		this.jButtonid_transaccionParametroGenericoUpdate= new JButtonMe();
		this.jButtonid_transaccionParametroGenericoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionParametroGenericoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionParametroGenericoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionParametroGenericoUpdate.setText("U");
		this.jButtonid_transaccionParametroGenericoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionParametroGenericoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionParametroGenericoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionParametroGenericoUpdate"));



					
		this.jLabelid_transaccion_reciboParametroGenerico = new JLabelMe();
		this.jLabelid_transaccion_reciboParametroGenerico.setText(""+ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCIONRECIBO+" :");
		this.jLabelid_transaccion_reciboParametroGenerico.setToolTipText("Transaccion Recibo");
		this.jLabelid_transaccion_reciboParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_reciboParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_reciboParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_reciboParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_reciboParametroGenerico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_reciboParametroGenerico.setToolTipText(ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCIONRECIBO);
		this.gridaBagLayoutParametroGenerico = new GridBagLayout();
		this.jPanelid_transaccion_reciboParametroGenerico.setLayout(this.gridaBagLayoutParametroGenerico);


		jComboBoxid_transaccion_reciboParametroGenerico= new JComboBoxMe();
		jComboBoxid_transaccion_reciboParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_reciboParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_reciboParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_reciboParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_reciboParametroGenerico= new JButtonMe();
		this.jButtonid_transaccion_reciboParametroGenerico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_reciboParametroGenerico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_reciboParametroGenerico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_reciboParametroGenerico.setText("Buscar");
		this.jButtonid_transaccion_reciboParametroGenerico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_reciboParametroGenerico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_reciboParametroGenerico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_reciboParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_reciboParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_reciboParametroGenerico"));

		this.jButtonid_transaccion_reciboParametroGenericoBusqueda= new JButtonMe();
		this.jButtonid_transaccion_reciboParametroGenericoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_reciboParametroGenericoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_reciboParametroGenericoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_reciboParametroGenericoBusqueda.setText("U");
		this.jButtonid_transaccion_reciboParametroGenericoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_reciboParametroGenericoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_reciboParametroGenericoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_reciboParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_reciboParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_reciboParametroGenericoBusqueda"));

		if(this.parametrogenericoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_reciboParametroGenericoBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_reciboParametroGenericoUpdate= new JButtonMe();
		this.jButtonid_transaccion_reciboParametroGenericoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_reciboParametroGenericoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_reciboParametroGenericoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_reciboParametroGenericoUpdate.setText("U");
		this.jButtonid_transaccion_reciboParametroGenericoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_reciboParametroGenericoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_reciboParametroGenericoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_reciboParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_reciboParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_reciboParametroGenericoUpdate"));



					
		this.jLabelid_bodegaParametroGenerico = new JLabelMe();
		this.jLabelid_bodegaParametroGenerico.setText(""+ParametroGenericoConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaParametroGenerico.setToolTipText("Bodega");
		this.jLabelid_bodegaParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaParametroGenerico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaParametroGenerico.setToolTipText(ParametroGenericoConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutParametroGenerico = new GridBagLayout();
		this.jPanelid_bodegaParametroGenerico.setLayout(this.gridaBagLayoutParametroGenerico);


		jComboBoxid_bodegaParametroGenerico= new JComboBoxMe();
		jComboBoxid_bodegaParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaParametroGenerico= new JButtonMe();
		this.jButtonid_bodegaParametroGenerico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroGenerico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroGenerico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroGenerico.setText("Buscar");
		this.jButtonid_bodegaParametroGenerico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaParametroGenerico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroGenerico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroGenerico"));

		this.jButtonid_bodegaParametroGenericoBusqueda= new JButtonMe();
		this.jButtonid_bodegaParametroGenericoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroGenericoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroGenericoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaParametroGenericoBusqueda.setText("U");
		this.jButtonid_bodegaParametroGenericoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaParametroGenericoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroGenericoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroGenericoBusqueda"));

		if(this.parametrogenericoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaParametroGenericoBusqueda.setVisible(false);		}

		this.jButtonid_bodegaParametroGenericoUpdate= new JButtonMe();
		this.jButtonid_bodegaParametroGenericoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroGenericoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroGenericoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaParametroGenericoUpdate.setText("U");
		this.jButtonid_bodegaParametroGenericoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaParametroGenericoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroGenericoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroGenericoUpdate"));



					
		this.jLabelid_servicioParametroGenerico = new JLabelMe();
		this.jLabelid_servicioParametroGenerico.setText(""+ParametroGenericoConstantesFunciones.LABEL_IDSERVICIO+" : *");
		this.jLabelid_servicioParametroGenerico.setToolTipText("Servicio");
		this.jLabelid_servicioParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_servicioParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_servicioParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_servicioParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_servicioParametroGenerico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_servicioParametroGenerico.setToolTipText(ParametroGenericoConstantesFunciones.LABEL_IDSERVICIO);
		this.gridaBagLayoutParametroGenerico = new GridBagLayout();
		this.jPanelid_servicioParametroGenerico.setLayout(this.gridaBagLayoutParametroGenerico);


		jComboBoxid_servicioParametroGenerico= new JComboBoxMe();
		jComboBoxid_servicioParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_servicioParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_servicioParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_servicioParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_servicioParametroGenerico= new JButtonMe();
		this.jButtonid_servicioParametroGenerico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_servicioParametroGenerico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_servicioParametroGenerico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_servicioParametroGenerico.setText("Buscar");
		this.jButtonid_servicioParametroGenerico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_servicioParametroGenerico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_servicioParametroGenerico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_servicioParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_servicioParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_servicioParametroGenerico"));

		this.jButtonid_servicioParametroGenericoBusqueda= new JButtonMe();
		this.jButtonid_servicioParametroGenericoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_servicioParametroGenericoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_servicioParametroGenericoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_servicioParametroGenericoBusqueda.setText("U");
		this.jButtonid_servicioParametroGenericoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_servicioParametroGenericoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_servicioParametroGenericoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_servicioParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_servicioParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_servicioParametroGenericoBusqueda"));

		if(this.parametrogenericoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_servicioParametroGenericoBusqueda.setVisible(false);		}

		this.jButtonid_servicioParametroGenericoUpdate= new JButtonMe();
		this.jButtonid_servicioParametroGenericoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_servicioParametroGenericoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_servicioParametroGenericoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_servicioParametroGenericoUpdate.setText("U");
		this.jButtonid_servicioParametroGenericoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_servicioParametroGenericoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_servicioParametroGenericoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_servicioParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_servicioParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_servicioParametroGenericoUpdate"));



					
		this.jLabelid_formatoParametroGenerico = new JLabelMe();
		this.jLabelid_formatoParametroGenerico.setText(""+ParametroGenericoConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoParametroGenerico.setToolTipText("Formato");
		this.jLabelid_formatoParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoParametroGenerico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoParametroGenerico.setToolTipText(ParametroGenericoConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutParametroGenerico = new GridBagLayout();
		this.jPanelid_formatoParametroGenerico.setLayout(this.gridaBagLayoutParametroGenerico);


		jComboBoxid_formatoParametroGenerico= new JComboBoxMe();
		jComboBoxid_formatoParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoParametroGenerico= new JButtonMe();
		this.jButtonid_formatoParametroGenerico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoParametroGenerico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoParametroGenerico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoParametroGenerico.setText("Buscar");
		this.jButtonid_formatoParametroGenerico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoParametroGenerico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoParametroGenerico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoParametroGenerico"));

		this.jButtonid_formatoParametroGenericoBusqueda= new JButtonMe();
		this.jButtonid_formatoParametroGenericoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoParametroGenericoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoParametroGenericoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoParametroGenericoBusqueda.setText("U");
		this.jButtonid_formatoParametroGenericoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoParametroGenericoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoParametroGenericoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoParametroGenericoBusqueda"));

		if(this.parametrogenericoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoParametroGenericoBusqueda.setVisible(false);		}

		this.jButtonid_formatoParametroGenericoUpdate= new JButtonMe();
		this.jButtonid_formatoParametroGenericoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoParametroGenericoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoParametroGenericoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoParametroGenericoUpdate.setText("U");
		this.jButtonid_formatoParametroGenericoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoParametroGenericoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoParametroGenericoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoParametroGenericoUpdate"));



					
		this.jLabelid_formato_reciboParametroGenerico = new JLabelMe();
		this.jLabelid_formato_reciboParametroGenerico.setText(""+ParametroGenericoConstantesFunciones.LABEL_IDFORMATORECIBO+" :");
		this.jLabelid_formato_reciboParametroGenerico.setToolTipText("Formato Recibo");
		this.jLabelid_formato_reciboParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_reciboParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_reciboParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_reciboParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_reciboParametroGenerico=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_reciboParametroGenerico.setToolTipText(ParametroGenericoConstantesFunciones.LABEL_IDFORMATORECIBO);
		this.gridaBagLayoutParametroGenerico = new GridBagLayout();
		this.jPanelid_formato_reciboParametroGenerico.setLayout(this.gridaBagLayoutParametroGenerico);


		jComboBoxid_formato_reciboParametroGenerico= new JComboBoxMe();
		jComboBoxid_formato_reciboParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_reciboParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_reciboParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_reciboParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_reciboParametroGenerico= new JButtonMe();
		this.jButtonid_formato_reciboParametroGenerico.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_reciboParametroGenerico.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_reciboParametroGenerico.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_reciboParametroGenerico.setText("Buscar");
		this.jButtonid_formato_reciboParametroGenerico.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_reciboParametroGenerico.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_reciboParametroGenerico,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_reciboParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_reciboParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_reciboParametroGenerico"));

		this.jButtonid_formato_reciboParametroGenericoBusqueda= new JButtonMe();
		this.jButtonid_formato_reciboParametroGenericoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_reciboParametroGenericoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_reciboParametroGenericoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_reciboParametroGenericoBusqueda.setText("U");
		this.jButtonid_formato_reciboParametroGenericoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_reciboParametroGenericoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_reciboParametroGenericoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_reciboParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_reciboParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_reciboParametroGenericoBusqueda"));

		if(this.parametrogenericoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_reciboParametroGenericoBusqueda.setVisible(false);		}

		this.jButtonid_formato_reciboParametroGenericoUpdate= new JButtonMe();
		this.jButtonid_formato_reciboParametroGenericoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_reciboParametroGenericoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_reciboParametroGenericoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_reciboParametroGenericoUpdate.setText("U");
		this.jButtonid_formato_reciboParametroGenericoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_reciboParametroGenericoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_reciboParametroGenericoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_reciboParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_reciboParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_reciboParametroGenericoUpdate"));



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
		//this.jInternalFrameDetalleParametroGenerico = new ParametroGenericoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Generico DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroGenerico= new GridBagLayout();
		

		
		String sToolTipParametroGenerico="";
		sToolTipParametroGenerico=ParametroGenericoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroGenerico+="(Facturacion.ParametroGenerico)";
		}
		
		if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroGenerico+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroGenerico = new JButtonMe();
		this.jButtonModificarParametroGenerico = new JButtonMe();
        this.jButtonActualizarParametroGenerico = new JButtonMe();
        this.jButtonEliminarParametroGenerico = new JButtonMe();
        this.jButtonCancelarParametroGenerico = new JButtonMe();
        this.jButtonGuardarCambiosParametroGenerico = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroGenerico = new JButtonMe();
		this.jButtonCerrarParametroGenerico = new JButtonMe();
		
		this.jScrollPanelDatosParametroGenerico = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroGenerico = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroGenerico = new JScrollPane();
				
		
		
		this.jPanelCamposParametroGenerico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroGenerico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroGenerico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroGenerico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Generico";
		
		if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Genericos" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroGenerico.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroGenerico.setName("jPanelCamposParametroGenerico"); 

		this.jPanelCamposOcultosParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroGenerico.setName("jPanelCamposOcultosParametroGenerico"); 

        this.jPanelAccionesParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroGenerico.setToolTipText("Acciones");
        this.jPanelAccionesParametroGenerico.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroGenerico.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroGenerico.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroGenerico, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroGenerico, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroGenerico, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroGenerico, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroGenerico, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroGenerico, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroGenerico.setText("Nuevo");
		this.jButtonModificarParametroGenerico.setText("Editar");
        this.jButtonActualizarParametroGenerico.setText("Actualizar");
        this.jButtonEliminarParametroGenerico.setText("Eliminar");
        this.jButtonCancelarParametroGenerico.setText("Cancelar");
        this.jButtonGuardarCambiosParametroGenerico.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroGenerico.setText("Guardar");
		this.jButtonCerrarParametroGenerico.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroGenerico,"nuevo_button","Nuevo",this.parametrogenericoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroGenerico,"modificar_button","Editar",this.parametrogenericoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroGenerico,"actualizar_button","Actualizar",this.parametrogenericoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroGenerico,"eliminar_button","Eliminar",this.parametrogenericoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroGenerico,"cancelar_button","Cancelar",this.parametrogenericoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroGenerico,"guardarcambios_button","Guardar",this.parametrogenericoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroGenerico,"guardarcambiostabla_button","Guardar",this.parametrogenericoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroGenerico,"cerrar_button","Salir",this.parametrogenericoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroGenerico, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroGenerico, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroGenerico, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroGenerico.setToolTipText("Nuevo"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroGenerico.setToolTipText("Editar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroGenerico.setToolTipText("Actualizar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroGenerico.setToolTipText("Eliminar)"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroGenerico.setToolTipText("Cancelar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroGenerico.setToolTipText("Guardar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroGenerico.setToolTipText("Guardar"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroGenerico.setToolTipText("Salir"+" "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroGenerico";
		inputMap = this.jButtonNuevoParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroGenerico.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroGenerico"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroGenerico";
		inputMap = this.jButtonActualizarParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroGenerico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroGenerico"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroGenerico";
		inputMap = this.jButtonEliminarParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroGenerico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroGenerico"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroGenerico";
		inputMap = this.jButtonCancelarParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroGenerico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroGenerico"));
		
		//CERRAR		
		sMapKey = "CerrarParametroGenerico";
		inputMap = this.jButtonCerrarParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroGenerico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroGenerico"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroGenerico";
		inputMap = this.jButtonGuardarCambiosTablaParametroGenerico.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroGenerico.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroGenerico"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroGenerico = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroGenerico.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroGenerico.setToolTipText("Nuevo ParametroGenerico");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroGenerico, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroGenerico = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroGenerico.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroGenerico.setToolTipText("Sin Cerrar Ventana ParametroGenerico");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroGenerico, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroGenerico = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroGenerico.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroGenerico.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroGenerico, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroGenerico = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroGenerico.setText("Accion");
		this.jComboBoxTiposAccionesParametroGenerico.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroGenerico = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroGenerico.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroGenerico.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroGenerico = new JLabelMe();
		
		this.jLabelAccionesParametroGenerico.setText("Acciones");		
		this.jLabelAccionesParametroGenerico.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGenerico.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGenerico.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroGenerico();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroGenerico();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroGenerico=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroGenerico.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroGenerico,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroGenerico.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGenerico.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGenerico.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroGenerico, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroGenerico.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroGenerico.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroGenerico.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroGenerico, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroGenerico = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroGenerico = new GridBagLayout();
		
		this.jPanelCamposParametroGenerico.setLayout(gridaBagLayoutCamposParametroGenerico);
		this.jPanelCamposOcultosParametroGenerico.setLayout(gridaBagLayoutCamposOcultosParametroGenerico);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 0;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroGenerico.add(jLabelIdParametroGenerico, this.gridBagConstraintsParametroGenerico);



	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 1;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroGenerico.add(jLabelidParametroGenerico, this.gridBagConstraintsParametroGenerico);


	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 0;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroGenerico.add(jLabelid_empresaParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 2;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroGenerico.add(jButtonid_empresaParametroGenericoBusqueda, this.gridBagConstraintsParametroGenerico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 3;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroGenerico.add(jButtonid_empresaParametroGenericoUpdate, this.gridBagConstraintsParametroGenerico);
	}

	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 1;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroGenerico.add(jComboBoxid_empresaParametroGenerico, this.gridBagConstraintsParametroGenerico);


	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 0;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalParametroGenerico.add(jLabelid_sucursalParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 2;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroGenerico.add(jButtonid_sucursalParametroGenericoBusqueda, this.gridBagConstraintsParametroGenerico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 3;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroGenerico.add(jButtonid_sucursalParametroGenericoUpdate, this.gridBagConstraintsParametroGenerico);
	}

	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 1;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalParametroGenerico.add(jComboBoxid_sucursalParametroGenerico, this.gridBagConstraintsParametroGenerico);


	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 0;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloParametroGenerico.add(jLabelid_moduloParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 2;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloParametroGenerico.add(jButtonid_moduloParametroGenericoBusqueda, this.gridBagConstraintsParametroGenerico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 3;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloParametroGenerico.add(jButtonid_moduloParametroGenericoUpdate, this.gridBagConstraintsParametroGenerico);
	}

	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 1;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloParametroGenerico.add(jComboBoxid_moduloParametroGenerico, this.gridBagConstraintsParametroGenerico);


	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 0;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialParametroGenerico.add(jLabelsecuencialParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 2;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialParametroGenerico.add(jButtonsecuencialParametroGenericoBusqueda, this.gridBagConstraintsParametroGenerico);
	}

	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 1;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialParametroGenerico.add(jTextFieldsecuencialParametroGenerico, this.gridBagConstraintsParametroGenerico);


	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 0;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoParametroGenerico.add(jLabelcodigoParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 2;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoParametroGenerico.add(jButtoncodigoParametroGenericoBusqueda, this.gridBagConstraintsParametroGenerico);
	}

	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 1;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoParametroGenerico.add(jCheckBoxcodigoParametroGenerico, this.gridBagConstraintsParametroGenerico);


	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 0;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionParametroGenerico.add(jLabelid_transaccionParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 2;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionParametroGenerico.add(jButtonid_transaccionParametroGenericoBusqueda, this.gridBagConstraintsParametroGenerico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 3;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionParametroGenerico.add(jButtonid_transaccionParametroGenericoUpdate, this.gridBagConstraintsParametroGenerico);
	}

	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 1;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionParametroGenerico.add(jComboBoxid_transaccionParametroGenerico, this.gridBagConstraintsParametroGenerico);


	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 0;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_reciboParametroGenerico.add(jLabelid_transaccion_reciboParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 2;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_reciboParametroGenerico.add(jButtonid_transaccion_reciboParametroGenericoBusqueda, this.gridBagConstraintsParametroGenerico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 3;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_reciboParametroGenerico.add(jButtonid_transaccion_reciboParametroGenericoUpdate, this.gridBagConstraintsParametroGenerico);
	}

	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 1;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_reciboParametroGenerico.add(jComboBoxid_transaccion_reciboParametroGenerico, this.gridBagConstraintsParametroGenerico);


	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 0;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaParametroGenerico.add(jLabelid_bodegaParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 2;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaParametroGenerico.add(jButtonid_bodegaParametroGenericoBusqueda, this.gridBagConstraintsParametroGenerico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 3;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaParametroGenerico.add(jButtonid_bodegaParametroGenericoUpdate, this.gridBagConstraintsParametroGenerico);
	}

	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 1;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaParametroGenerico.add(jComboBoxid_bodegaParametroGenerico, this.gridBagConstraintsParametroGenerico);


	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 0;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_servicioParametroGenerico.add(jLabelid_servicioParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 2;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_servicioParametroGenerico.add(jButtonid_servicioParametroGenericoBusqueda, this.gridBagConstraintsParametroGenerico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 3;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_servicioParametroGenerico.add(jButtonid_servicioParametroGenericoUpdate, this.gridBagConstraintsParametroGenerico);
	}

	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 1;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_servicioParametroGenerico.add(jComboBoxid_servicioParametroGenerico, this.gridBagConstraintsParametroGenerico);


	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 0;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoParametroGenerico.add(jLabelid_formatoParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 2;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoParametroGenerico.add(jButtonid_formatoParametroGenericoBusqueda, this.gridBagConstraintsParametroGenerico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 3;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoParametroGenerico.add(jButtonid_formatoParametroGenericoUpdate, this.gridBagConstraintsParametroGenerico);
	}

	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 1;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoParametroGenerico.add(jComboBoxid_formatoParametroGenerico, this.gridBagConstraintsParametroGenerico);


	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 0;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_reciboParametroGenerico.add(jLabelid_formato_reciboParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 2;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_reciboParametroGenerico.add(jButtonid_formato_reciboParametroGenericoBusqueda, this.gridBagConstraintsParametroGenerico);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		//this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = 3;
		this.gridBagConstraintsParametroGenerico.ipadx = 0;
		this.gridBagConstraintsParametroGenerico.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_reciboParametroGenerico.add(jButtonid_formato_reciboParametroGenericoUpdate, this.gridBagConstraintsParametroGenerico);
	}

	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGenerico.gridy = 0;
	this.gridBagConstraintsParametroGenerico.gridx = 1;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_reciboParametroGenerico.add(jComboBoxid_formato_reciboParametroGenerico, this.gridBagConstraintsParametroGenerico);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGenerico.gridy = iYPanelCamposParametroGenerico;
	this.gridBagConstraintsParametroGenerico.gridx = iXPanelCamposParametroGenerico++;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGenerico.add(this.jPanelidParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(iXPanelCamposParametroGenerico % 1==0) {
		iXPanelCamposParametroGenerico=0;
		iYPanelCamposParametroGenerico++;
	}
	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGenerico.gridy = iYPanelCamposParametroGenerico;
	this.gridBagConstraintsParametroGenerico.gridx = iXPanelCamposParametroGenerico++;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGenerico.add(this.jPanelid_moduloParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(iXPanelCamposParametroGenerico % 1==0) {
		iXPanelCamposParametroGenerico=0;
		iYPanelCamposParametroGenerico++;
	}
	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGenerico.gridy = iYPanelCamposParametroGenerico;
	this.gridBagConstraintsParametroGenerico.gridx = iXPanelCamposParametroGenerico++;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGenerico.add(this.jPanelsecuencialParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(iXPanelCamposParametroGenerico % 1==0) {
		iXPanelCamposParametroGenerico=0;
		iYPanelCamposParametroGenerico++;
	}
	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGenerico.gridy = iYPanelCamposParametroGenerico;
	this.gridBagConstraintsParametroGenerico.gridx = iXPanelCamposParametroGenerico++;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGenerico.add(this.jPanelcodigoParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(iXPanelCamposParametroGenerico % 1==0) {
		iXPanelCamposParametroGenerico=0;
		iYPanelCamposParametroGenerico++;
	}
	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGenerico.gridy = iYPanelCamposParametroGenerico;
	this.gridBagConstraintsParametroGenerico.gridx = iXPanelCamposParametroGenerico++;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGenerico.add(this.jPanelid_transaccionParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(iXPanelCamposParametroGenerico % 1==0) {
		iXPanelCamposParametroGenerico=0;
		iYPanelCamposParametroGenerico++;
	}
	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGenerico.gridy = iYPanelCamposParametroGenerico;
	this.gridBagConstraintsParametroGenerico.gridx = iXPanelCamposParametroGenerico++;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGenerico.add(this.jPanelid_transaccion_reciboParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(iXPanelCamposParametroGenerico % 1==0) {
		iXPanelCamposParametroGenerico=0;
		iYPanelCamposParametroGenerico++;
	}
	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGenerico.gridy = iYPanelCamposParametroGenerico;
	this.gridBagConstraintsParametroGenerico.gridx = iXPanelCamposParametroGenerico++;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGenerico.add(this.jPanelid_bodegaParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(iXPanelCamposParametroGenerico % 1==0) {
		iXPanelCamposParametroGenerico=0;
		iYPanelCamposParametroGenerico++;
	}
	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGenerico.gridy = iYPanelCamposParametroGenerico;
	this.gridBagConstraintsParametroGenerico.gridx = iXPanelCamposParametroGenerico++;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGenerico.add(this.jPanelid_servicioParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(iXPanelCamposParametroGenerico % 1==0) {
		iXPanelCamposParametroGenerico=0;
		iYPanelCamposParametroGenerico++;
	}
	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGenerico.gridy = iYPanelCamposParametroGenerico;
	this.gridBagConstraintsParametroGenerico.gridx = iXPanelCamposParametroGenerico++;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGenerico.add(this.jPanelid_formatoParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(iXPanelCamposParametroGenerico % 1==0) {
		iXPanelCamposParametroGenerico=0;
		iYPanelCamposParametroGenerico++;
	}
	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGenerico.gridy = iYPanelCamposParametroGenerico;
	this.gridBagConstraintsParametroGenerico.gridx = iXPanelCamposParametroGenerico++;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGenerico.add(this.jPanelid_formato_reciboParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(iXPanelCamposParametroGenerico % 1==0) {
		iXPanelCamposParametroGenerico=0;
		iYPanelCamposParametroGenerico++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGenerico.gridy = iYPanelCamposOcultosParametroGenerico;
	this.gridBagConstraintsParametroGenerico.gridx = iXPanelCamposOcultosParametroGenerico++;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroGenerico.add(this.jPanelid_empresaParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(iXPanelCamposOcultosParametroGenerico % 1==0) {
		iXPanelCamposOcultosParametroGenerico=0;
		iYPanelCamposOcultosParametroGenerico++;
	}
	this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGenerico.gridy = iYPanelCamposOcultosParametroGenerico;
	this.gridBagConstraintsParametroGenerico.gridx = iXPanelCamposOcultosParametroGenerico++;
	this.gridBagConstraintsParametroGenerico.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGenerico.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroGenerico.add(this.jPanelid_sucursalParametroGenerico, this.gridBagConstraintsParametroGenerico);



	if(iXPanelCamposOcultosParametroGenerico % 1==0) {
		iXPanelCamposOcultosParametroGenerico=0;
		iYPanelCamposOcultosParametroGenerico++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroGenerico= new GridBagLayout();
		this.jPanelAccionesParametroGenerico.setLayout(gridaBagLayoutAccionesParametroGenerico);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroGenerico= new GridBagLayout();
		this.jPanelAccionesFormularioParametroGenerico.setLayout(gridaBagLayoutAccionesFormularioParametroGenerico);
		
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroGenerico.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroGenerico.add(this.jComboBoxTiposAccionesFormularioParametroGenerico, this.gridBagConstraintsParametroGenerico);

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroGenerico.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroGenerico.add(this.jCheckBoxPostAccionNuevoParametroGenerico, this.gridBagConstraintsParametroGenerico);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrogenericoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroGenerico.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroGenerico.add(this.jCheckBoxPostAccionSinCerrarParametroGenerico, this.gridBagConstraintsParametroGenerico);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrogenericoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroGenerico.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroGenerico.add(this.jCheckBoxPostAccionSinMensajeParametroGenerico, this.gridBagConstraintsParametroGenerico);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroGenerico.add(this.jButtonModificarParametroGenerico, this.gridBagConstraintsParametroGenerico);							

		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGenerico.gridy = 0;
		this.gridBagConstraintsParametroGenerico.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroGenerico.add(this.jButtonEliminarParametroGenerico, this.gridBagConstraintsParametroGenerico);
		
			
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy = 0;		
		this.gridBagConstraintsParametroGenerico.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroGenerico.add(this.jButtonActualizarParametroGenerico, this.gridBagConstraintsParametroGenerico);


		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy = 0;		
		this.gridBagConstraintsParametroGenerico.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroGenerico.add(this.jButtonGuardarCambiosParametroGenerico, this.gridBagConstraintsParametroGenerico);	
		
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy = 0;		
		this.gridBagConstraintsParametroGenerico.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroGenerico.add(this.jButtonCancelarParametroGenerico, this.gridBagConstraintsParametroGenerico);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroGenerico = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroGenerico);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();						
			this.gridBagConstraintsParametroGenerico.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroGenerico.gridx = 0;		
			//this.gridBagConstraintsParametroGenerico.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroGenerico.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroGenerico.gridx =0;
		this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroGenerico.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroGenerico, this.gridBagConstraintsParametroGenerico);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroGenericoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroGenerico = new ParametroGenericoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Generico DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Generico DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Generico Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroGenericoModel parametrogenericoModel=new ParametroGenericoModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroGenericoModel.ParametroGenericoFocusTraversalPolicy parametrogenericoFocusTraversalPolicy = parametrogenericoModel.new ParametroGenericoFocusTraversalPolicy(this);
			
			//parametrogenericoFocusTraversalPolicy.setparametrogenericoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrogenericoModel);
			
			
			this.jContentPaneDetalleParametroGenerico = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroGenerico = new GridBagLayout();	
			this.jContentPaneDetalleParametroGenerico.setLayout(gridaBagLayoutDetalleParametroGenerico);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroGenerico = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
				this.gridBagConstraintsParametroGenerico.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroGenerico.gridx = 0;
					
				
				this.jContentPaneDetalleParametroGenerico.add(jTtoolBarDetalleParametroGenerico, gridBagConstraintsParametroGenerico);								
				
}
			
			this.jScrollPanelDatosEdicionParametroGenerico=   new JScrollPane(jContentPaneDetalleParametroGenerico,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroGenerico.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGenerico.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGenerico.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroGenerico=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroGenerico.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGenerico.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGenerico.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroGenerico.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroGenerico.gridx = 0;
	        
			this.jContentPaneDetalleParametroGenerico.add(jPanelCamposParametroGenerico, gridBagConstraintsParametroGenerico);
			
			
			
			
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
						&& parametrogenericoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametrogenericoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroGenerico= new GridBagConstraints();
						this.gridBagConstraintsParametroGenerico.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroGenerico.gridx = 0;
						this.jContentPaneDetalleParametroGenerico.add(this.jTabbedPaneRelacionesParametroGenerico, this.gridBagConstraintsParametroGenerico);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroGenerico.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroGenerico.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
					this.gridBagConstraintsParametroGenerico.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroGenerico.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroGenerico.gridx = 0;
					
				
					this.jContentPaneDetalleParametroGenerico.add(jPanelCamposOcultosParametroGenerico, gridBagConstraintsParametroGenerico);
				
					this.jPanelCamposOcultosParametroGenerico.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroGenerico.gridx = 0;
	        this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroGenerico.add(this.jPanelAccionesFormularioParametroGenerico, this.gridBagConstraintsParametroGenerico);							
			
			
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
	        this.gridBagConstraintsParametroGenerico.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroGenerico.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroGenerico.add(this.jPanelAccionesParametroGenerico, this.gridBagConstraintsParametroGenerico);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroGenerico);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroGenerico=   new JScrollPane(this.jPanelCamposParametroGenerico,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroGenerico.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGenerico.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGenerico.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroGenerico.gridx = 0;
			this.gridBagConstraintsParametroGenerico.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroGenerico.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroGenerico.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroGenerico, this.gridBagConstraintsParametroGenerico);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroGenerico.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroGenerico, this.gridBagConstraintsParametroGenerico);			
			
			this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
			this.gridBagConstraintsParametroGenerico.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroGenerico.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroGenerico, this.gridBagConstraintsParametroGenerico);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGenerico.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroGenerico, this.gridBagConstraintsParametroGenerico);
			
			
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGenerico.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroGenerico, this.gridBagConstraintsParametroGenerico);
		
			
		this.gridBagConstraintsParametroGenerico = new GridBagConstraints();
		this.gridBagConstraintsParametroGenerico.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroGenerico.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroGenerico, this.gridBagConstraintsParametroGenerico);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroGenerico;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroGenerico;
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
