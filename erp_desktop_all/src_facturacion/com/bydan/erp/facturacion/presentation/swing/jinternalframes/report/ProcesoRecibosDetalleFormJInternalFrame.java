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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.ProcesoRecibosConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class ProcesoRecibosDetalleFormJInternalFrame extends ProcesoRecibosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoRecibos;
	
	protected JMenuBar jmenuBarDetalleProcesoRecibos;
	
	protected JMenu jmenuDetalleProcesoRecibos;
	protected JMenu jmenuDetalleArchivoProcesoRecibos;
	protected JMenu jmenuDetalleAccionesProcesoRecibos;
	protected JMenu jmenuDetalleDatosProcesoRecibos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoRecibos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoRecibos;	
	protected GridBagConstraints gridBagConstraintsProcesoRecibos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoRecibosBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoRecibos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";
	
	public ProcesoRecibosSessionBean procesorecibosSessionBean;
	
	
	
	
	public ProvinciaSessionBean provinciaSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public VendedorSessionBean vendedorSessionBean;	
	
	public ProcesoRecibosLogic procesorecibosLogic;
	
	public JScrollPane jScrollPanelDatosProcesoRecibos;
	public JScrollPane jScrollPanelDatosEdicionProcesoRecibos;
	public JScrollPane jScrollPanelDatosGeneralProcesoRecibos;
	
	protected JPanel jPanelCamposProcesoRecibos;    
	protected JPanel jPanelCamposOcultosProcesoRecibos;    	
	protected JPanel jPanelAccionesProcesoRecibos;
	protected JPanel jPanelAccionesFormularioProcesoRecibos;
    
	
	
	protected Integer iXPanelCamposProcesoRecibos=0;
	protected Integer iYPanelCamposProcesoRecibos=0;
	
	protected Integer iXPanelCamposOcultosProcesoRecibos=0;
	protected Integer iYPanelCamposOcultosProcesoRecibos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoRecibos;
	public JButton jButtonModificarProcesoRecibos;
	public JButton jButtonActualizarProcesoRecibos;
    public JButton jButtonEliminarProcesoRecibos;
	public JButton jButtonCancelarProcesoRecibos;
    public JButton jButtonGuardarCambiosProcesoRecibos;
	public JButton jButtonGuardarCambiosTablaProcesoRecibos;
	protected JButton jButtonCerrarProcesoRecibos;
	
	
	protected JButton jButtonProcesarInformacionProcesoRecibos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoRecibos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoRecibos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoRecibos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoRecibos;
	protected JButton jButtonModificarToolBarProcesoRecibos;
	protected JButton jButtonActualizarToolBarProcesoRecibos;
    protected JButton jButtonEliminarToolBarProcesoRecibos;
	protected JButton jButtonCancelarToolBarProcesoRecibos;
    protected JButton jButtonGuardarCambiosToolBarProcesoRecibos;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoRecibos;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoRecibos;
	protected JButton jButtonCerrarToolBarProcesoRecibos;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoRecibos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoRecibos;
	protected JMenuItem jMenuItemModificarProcesoRecibos;
	protected JMenuItem jMenuItemActualizarProcesoRecibos;
    protected JMenuItem jMenuItemEliminarProcesoRecibos;
	protected JMenuItem jMenuItemCancelarProcesoRecibos;
    protected JMenuItem jMenuItemGuardarCambiosProcesoRecibos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoRecibos;
	protected JMenuItem jMenuItemCerrarProcesoRecibos;
	protected JMenuItem jMenuItemDetalleCerrarProcesoRecibos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoRecibos;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoRecibos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoRecibos;
	protected JMenuItem jMenuItemMostrarOcultarProcesoRecibos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoRecibos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoRecibos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoRecibos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoRecibos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoRecibos;
	public JLabel jLabelIdProcesoRecibos;
	public JLabel jLabelidProcesoRecibos;
	public JButton jButtonidProcesoRecibosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_provinciaProcesoRecibos;
	public JLabel jLabelnombre_provinciaProcesoRecibos;
	public JTextArea jTextAreanombre_provinciaProcesoRecibos;
	public JScrollPane jscrollPanenombre_provinciaProcesoRecibos;
	public JButton jButtonnombre_provinciaProcesoRecibosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_ciudadProcesoRecibos;
	public JLabel jLabelnombre_ciudadProcesoRecibos;
	public JTextArea jTextAreanombre_ciudadProcesoRecibos;
	public JScrollPane jscrollPanenombre_ciudadProcesoRecibos;
	public JButton jButtonnombre_ciudadProcesoRecibosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_zonaProcesoRecibos;
	public JLabel jLabelnombre_zonaProcesoRecibos;
	public JTextField jTextFieldnombre_zonaProcesoRecibos;
	public JButton jButtonnombre_zonaProcesoRecibosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_grupo_clienteProcesoRecibos;
	public JLabel jLabelnombre_grupo_clienteProcesoRecibos;
	public JTextArea jTextAreanombre_grupo_clienteProcesoRecibos;
	public JScrollPane jscrollPanenombre_grupo_clienteProcesoRecibos;
	public JButton jButtonnombre_grupo_clienteProcesoRecibosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_vendedorProcesoRecibos;
	public JLabel jLabelnombre_vendedorProcesoRecibos;
	public JTextArea jTextAreanombre_vendedorProcesoRecibos;
	public JScrollPane jscrollPanenombre_vendedorProcesoRecibos;
	public JButton jButtonnombre_vendedorProcesoRecibosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProcesoRecibos;
	public JLabel jLabelcodigoProcesoRecibos;
	public JTextField jTextFieldcodigoProcesoRecibos;
	public JButton jButtoncodigoProcesoRecibosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoProcesoRecibos;
	public JLabel jLabelnombre_completoProcesoRecibos;
	public JTextArea jTextAreanombre_completoProcesoRecibos;
	public JScrollPane jscrollPanenombre_completoProcesoRecibos;
	public JButton jButtonnombre_completoProcesoRecibosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_asientoProcesoRecibos;
	public JLabel jLabelcodigo_asientoProcesoRecibos;
	public JTextArea jTextAreacodigo_asientoProcesoRecibos;
	public JScrollPane jscrollPanecodigo_asientoProcesoRecibos;
	public JButton jButtoncodigo_asientoProcesoRecibosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorProcesoRecibos;
	public JLabel jLabelnumero_mayorProcesoRecibos;
	public JTextArea jTextAreanumero_mayorProcesoRecibos;
	public JScrollPane jscrollPanenumero_mayorProcesoRecibos;
	public JButton jButtonnumero_mayorProcesoRecibosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_provinciaProcesoRecibos;
	public JLabel jLabelid_provinciaProcesoRecibos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaProcesoRecibos;
	public JButton jButtonid_provinciaProcesoRecibos= new JButtonMe();
	public JButton jButtonid_provinciaProcesoRecibosUpdate= new JButtonMe();
	public JButton jButtonid_provinciaProcesoRecibosBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadProcesoRecibos;
	public JLabel jLabelid_ciudadProcesoRecibos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadProcesoRecibos;
	public JButton jButtonid_ciudadProcesoRecibos= new JButtonMe();
	public JButton jButtonid_ciudadProcesoRecibosUpdate= new JButtonMe();
	public JButton jButtonid_ciudadProcesoRecibosBusqueda= new JButtonMe();

	public JPanel jPanelid_zonaProcesoRecibos;
	public JLabel jLabelid_zonaProcesoRecibos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaProcesoRecibos;
	public JButton jButtonid_zonaProcesoRecibos= new JButtonMe();
	public JButton jButtonid_zonaProcesoRecibosUpdate= new JButtonMe();
	public JButton jButtonid_zonaProcesoRecibosBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_clienteProcesoRecibos;
	public JLabel jLabelid_grupo_clienteProcesoRecibos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteProcesoRecibos;
	public JButton jButtonid_grupo_clienteProcesoRecibos= new JButtonMe();
	public JButton jButtonid_grupo_clienteProcesoRecibosUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteProcesoRecibosBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorProcesoRecibos;
	public JLabel jLabelid_vendedorProcesoRecibos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorProcesoRecibos;
	public JButton jButtonid_vendedorProcesoRecibos= new JButtonMe();
	public JButton jButtonid_vendedorProcesoRecibosUpdate= new JButtonMe();
	public JButton jButtonid_vendedorProcesoRecibosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoRecibos;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public int iHeightFormulario=836;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoRecibosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoRecibos=new JPanel();
				this.jPanelAccionesFormularioProcesoRecibos=new JPanel();
				this.jmenuBarDetalleProcesoRecibos=new JMenuBar();
				this.jTtoolBarDetalleProcesoRecibos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoRecibosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoRecibos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoRecibosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoRecibos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoRecibosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoRecibos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoRecibosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoRecibos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoRecibosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoRecibos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoRecibos() {
		return this.jButtonActualizarToolBarProcesoRecibos;
	}
	
	public JButton getjButtonEliminarToolBarProcesoRecibos() {
		return this.jButtonEliminarToolBarProcesoRecibos;
	}
	
	public JButton getjButtonCancelarToolBarProcesoRecibos() {
		return this.jButtonCancelarToolBarProcesoRecibos;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoRecibos() {
		return this.jButtonProcesarInformacionProcesoRecibos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoRecibos)	{
		this.jButtonProcesarInformacionProcesoRecibos = jButtonProcesarInformacionProcesoRecibos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoRecibos() {
		return this.jComboBoxTiposAccionesProcesoRecibos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoRecibos(
			JComboBox jComboBoxTiposRelacionesProcesoRecibos) {
		this.jComboBoxTiposRelacionesProcesoRecibos = jComboBoxTiposRelacionesProcesoRecibos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoRecibos(
			JComboBox jComboBoxTiposAccionesProcesoRecibos) {
		this.jComboBoxTiposAccionesProcesoRecibos = jComboBoxTiposAccionesProcesoRecibos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoRecibos() {
		return this.jComboBoxTiposAccionesFormularioProcesoRecibos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoRecibos(
			JComboBox jComboBoxTiposAccionesFormularioProcesoRecibos) {
		this.jComboBoxTiposAccionesFormularioProcesoRecibos = jComboBoxTiposAccionesFormularioProcesoRecibos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesorecibosSessionBean=new ProcesoRecibosSessionBean();
		
		this.procesorecibosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesorecibosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesorecibosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoRecibosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoRecibosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoRecibosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Recibos MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoRecibosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoRecibos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoRecibos=new JButtonMe();
				this.jButtonModificarToolBarProcesoRecibos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoRecibos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoRecibos,this.jTtoolBarDetalleProcesoRecibos,
							"actualizar","actualizar","Actualizar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoRecibos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoRecibos,this.jTtoolBarDetalleProcesoRecibos,
							"eliminar","eliminar","Eliminar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoRecibos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoRecibos,this.jTtoolBarDetalleProcesoRecibos,
							"cancelar","cancelar","Cancelar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoRecibos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoRecibos,this.jTtoolBarDetalleProcesoRecibos,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoRecibos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoRecibos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoRecibos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoRecibos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoRecibos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoRecibos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoRecibos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoRecibos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoRecibos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoRecibos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoRecibos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoRecibos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoRecibos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoRecibos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoRecibos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoRecibos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoRecibos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoRecibos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoRecibos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoRecibos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoRecibos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoRecibos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoRecibos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoRecibos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoRecibos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoRecibos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoRecibos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoRecibos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoRecibos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoRecibos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoRecibos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoRecibos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoRecibos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoRecibos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoRecibos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoRecibos.add(this.jMenuItemDetalleCerrarProcesoRecibos);
		
		this.jmenuDetalleAccionesProcesoRecibos.add(this.jMenuItemActualizarProcesoRecibos);
		this.jmenuDetalleAccionesProcesoRecibos.add(this.jMenuItemEliminarProcesoRecibos);
		this.jmenuDetalleAccionesProcesoRecibos.add(this.jMenuItemCancelarProcesoRecibos);		
		
		//this.jmenuDetalleDatosProcesoRecibos.add(this.jMenuItemDetalleAbrirOrderByProcesoRecibos);				
		this.jmenuDetalleDatosProcesoRecibos.add(this.jMenuItemDetalleMostarOcultarProcesoRecibos);				
				
		//this.jmenuDetalleAccionesProcesoRecibos.add(this.jMenuItemGuardarCambiosProcesoRecibos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoRecibos.add(this.jmenuDetalleArchivoProcesoRecibos);		
		this.jmenuBarDetalleProcesoRecibos.add(this.jmenuDetalleAccionesProcesoRecibos);		
		this.jmenuBarDetalleProcesoRecibos.add(this.jmenuDetalleDatosProcesoRecibos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoRecibos);				
	}
	
	
	public void inicializarElementosCamposProcesoRecibos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoRecibos = new JLabelMe();
		jLabelIdProcesoRecibos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoRecibos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoRecibos.setToolTipText(ProcesoRecibosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoRecibos= new GridBagLayout();

		this.jPanelidProcesoRecibos.setLayout(this.gridaBagLayoutProcesoRecibos);

		jLabelidProcesoRecibos = new JLabel();
		jLabelidProcesoRecibos.setText("Id");

		jLabelidProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_provinciaProcesoRecibos = new JLabelMe();
		this.jLabelnombre_provinciaProcesoRecibos.setText(""+ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA+" : *");
		this.jLabelnombre_provinciaProcesoRecibos.setToolTipText("Nombre Provincia");
		this.jLabelnombre_provinciaProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_provinciaProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_provinciaProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_provinciaProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_provinciaProcesoRecibos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_provinciaProcesoRecibos.setToolTipText(ProcesoRecibosConstantesFunciones.LABEL_NOMBREPROVINCIA);
		this.gridaBagLayoutProcesoRecibos = new GridBagLayout();
		this.jPanelnombre_provinciaProcesoRecibos.setLayout(this.gridaBagLayoutProcesoRecibos);


		jTextAreanombre_provinciaProcesoRecibos= new JTextAreaMe();
		jTextAreanombre_provinciaProcesoRecibos.setEnabled(false);
		jTextAreanombre_provinciaProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_provinciaProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_provinciaProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_provinciaProcesoRecibos.setLineWrap(true);
		jTextAreanombre_provinciaProcesoRecibos.setWrapStyleWord(true);
		jTextAreanombre_provinciaProcesoRecibos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_provinciaProcesoRecibos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_provinciaProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_provinciaProcesoRecibos = new JScrollPane(jTextAreanombre_provinciaProcesoRecibos);
		jscrollPanenombre_provinciaProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_provinciaProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_provinciaProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_provinciaProcesoRecibosBusqueda= new JButtonMe();
		this.jButtonnombre_provinciaProcesoRecibosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_provinciaProcesoRecibosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_provinciaProcesoRecibosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_provinciaProcesoRecibosBusqueda.setText("U");
		this.jButtonnombre_provinciaProcesoRecibosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_provinciaProcesoRecibosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_provinciaProcesoRecibosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_provinciaProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_provinciaProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_provinciaProcesoRecibosBusqueda"));

		if(this.procesorecibosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_provinciaProcesoRecibosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_ciudadProcesoRecibos = new JLabelMe();
		this.jLabelnombre_ciudadProcesoRecibos.setText(""+ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD+" : *");
		this.jLabelnombre_ciudadProcesoRecibos.setToolTipText("Nombre Ciudad");
		this.jLabelnombre_ciudadProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_ciudadProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_ciudadProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_ciudadProcesoRecibos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_ciudadProcesoRecibos.setToolTipText(ProcesoRecibosConstantesFunciones.LABEL_NOMBRECIUDAD);
		this.gridaBagLayoutProcesoRecibos = new GridBagLayout();
		this.jPanelnombre_ciudadProcesoRecibos.setLayout(this.gridaBagLayoutProcesoRecibos);


		jTextAreanombre_ciudadProcesoRecibos= new JTextAreaMe();
		jTextAreanombre_ciudadProcesoRecibos.setEnabled(false);
		jTextAreanombre_ciudadProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_ciudadProcesoRecibos.setLineWrap(true);
		jTextAreanombre_ciudadProcesoRecibos.setWrapStyleWord(true);
		jTextAreanombre_ciudadProcesoRecibos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_ciudadProcesoRecibos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_ciudadProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_ciudadProcesoRecibos = new JScrollPane(jTextAreanombre_ciudadProcesoRecibos);
		jscrollPanenombre_ciudadProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_ciudadProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_ciudadProcesoRecibosBusqueda= new JButtonMe();
		this.jButtonnombre_ciudadProcesoRecibosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadProcesoRecibosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_ciudadProcesoRecibosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_ciudadProcesoRecibosBusqueda.setText("U");
		this.jButtonnombre_ciudadProcesoRecibosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_ciudadProcesoRecibosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_ciudadProcesoRecibosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_ciudadProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_ciudadProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_ciudadProcesoRecibosBusqueda"));

		if(this.procesorecibosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_ciudadProcesoRecibosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_zonaProcesoRecibos = new JLabelMe();
		this.jLabelnombre_zonaProcesoRecibos.setText(""+ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA+" : *");
		this.jLabelnombre_zonaProcesoRecibos.setToolTipText("Nombre Zona");
		this.jLabelnombre_zonaProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_zonaProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_zonaProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_zonaProcesoRecibos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_zonaProcesoRecibos.setToolTipText(ProcesoRecibosConstantesFunciones.LABEL_NOMBREZONA);
		this.gridaBagLayoutProcesoRecibos = new GridBagLayout();
		this.jPanelnombre_zonaProcesoRecibos.setLayout(this.gridaBagLayoutProcesoRecibos);


		jTextFieldnombre_zonaProcesoRecibos= new JTextFieldMe();

		jTextFieldnombre_zonaProcesoRecibos.setEnabled(false);
		jTextFieldnombre_zonaProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_zonaProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_zonaProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_zonaProcesoRecibosBusqueda= new JButtonMe();
		this.jButtonnombre_zonaProcesoRecibosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaProcesoRecibosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_zonaProcesoRecibosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_zonaProcesoRecibosBusqueda.setText("U");
		this.jButtonnombre_zonaProcesoRecibosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_zonaProcesoRecibosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_zonaProcesoRecibosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_zonaProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_zonaProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_zonaProcesoRecibosBusqueda"));

		if(this.procesorecibosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_zonaProcesoRecibosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_grupo_clienteProcesoRecibos = new JLabelMe();
		this.jLabelnombre_grupo_clienteProcesoRecibos.setText(""+ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE+" : *");
		this.jLabelnombre_grupo_clienteProcesoRecibos.setToolTipText("Nombre Grupo Cliente");
		this.jLabelnombre_grupo_clienteProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_grupo_clienteProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_grupo_clienteProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_grupo_clienteProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_grupo_clienteProcesoRecibos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_grupo_clienteProcesoRecibos.setToolTipText(ProcesoRecibosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
		this.gridaBagLayoutProcesoRecibos = new GridBagLayout();
		this.jPanelnombre_grupo_clienteProcesoRecibos.setLayout(this.gridaBagLayoutProcesoRecibos);


		jTextAreanombre_grupo_clienteProcesoRecibos= new JTextAreaMe();
		jTextAreanombre_grupo_clienteProcesoRecibos.setEnabled(false);
		jTextAreanombre_grupo_clienteProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupo_clienteProcesoRecibos.setLineWrap(true);
		jTextAreanombre_grupo_clienteProcesoRecibos.setWrapStyleWord(true);
		jTextAreanombre_grupo_clienteProcesoRecibos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_grupo_clienteProcesoRecibos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_grupo_clienteProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_grupo_clienteProcesoRecibos = new JScrollPane(jTextAreanombre_grupo_clienteProcesoRecibos);
		jscrollPanenombre_grupo_clienteProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupo_clienteProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupo_clienteProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_grupo_clienteProcesoRecibosBusqueda= new JButtonMe();
		this.jButtonnombre_grupo_clienteProcesoRecibosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupo_clienteProcesoRecibosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupo_clienteProcesoRecibosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_grupo_clienteProcesoRecibosBusqueda.setText("U");
		this.jButtonnombre_grupo_clienteProcesoRecibosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_grupo_clienteProcesoRecibosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_grupo_clienteProcesoRecibosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_grupo_clienteProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_grupo_clienteProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_grupo_clienteProcesoRecibosBusqueda"));

		if(this.procesorecibosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_grupo_clienteProcesoRecibosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_vendedorProcesoRecibos = new JLabelMe();
		this.jLabelnombre_vendedorProcesoRecibos.setText(""+ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR+" : *");
		this.jLabelnombre_vendedorProcesoRecibos.setToolTipText("Nombre Vendedor");
		this.jLabelnombre_vendedorProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_vendedorProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_vendedorProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_vendedorProcesoRecibos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_vendedorProcesoRecibos.setToolTipText(ProcesoRecibosConstantesFunciones.LABEL_NOMBREVENDEDOR);
		this.gridaBagLayoutProcesoRecibos = new GridBagLayout();
		this.jPanelnombre_vendedorProcesoRecibos.setLayout(this.gridaBagLayoutProcesoRecibos);


		jTextAreanombre_vendedorProcesoRecibos= new JTextAreaMe();
		jTextAreanombre_vendedorProcesoRecibos.setEnabled(false);
		jTextAreanombre_vendedorProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_vendedorProcesoRecibos.setLineWrap(true);
		jTextAreanombre_vendedorProcesoRecibos.setWrapStyleWord(true);
		jTextAreanombre_vendedorProcesoRecibos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_vendedorProcesoRecibos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_vendedorProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_vendedorProcesoRecibos = new JScrollPane(jTextAreanombre_vendedorProcesoRecibos);
		jscrollPanenombre_vendedorProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_vendedorProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_vendedorProcesoRecibosBusqueda= new JButtonMe();
		this.jButtonnombre_vendedorProcesoRecibosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorProcesoRecibosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_vendedorProcesoRecibosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_vendedorProcesoRecibosBusqueda.setText("U");
		this.jButtonnombre_vendedorProcesoRecibosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_vendedorProcesoRecibosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_vendedorProcesoRecibosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_vendedorProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_vendedorProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_vendedorProcesoRecibosBusqueda"));

		if(this.procesorecibosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_vendedorProcesoRecibosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoProcesoRecibos = new JLabelMe();
		this.jLabelcodigoProcesoRecibos.setText(""+ProcesoRecibosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProcesoRecibos.setToolTipText("Codigo");
		this.jLabelcodigoProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProcesoRecibos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProcesoRecibos.setToolTipText(ProcesoRecibosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProcesoRecibos = new GridBagLayout();
		this.jPanelcodigoProcesoRecibos.setLayout(this.gridaBagLayoutProcesoRecibos);


		jTextFieldcodigoProcesoRecibos= new JTextFieldMe();

		jTextFieldcodigoProcesoRecibos.setEnabled(false);
		jTextFieldcodigoProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoProcesoRecibosBusqueda= new JButtonMe();
		this.jButtoncodigoProcesoRecibosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoRecibosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProcesoRecibosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProcesoRecibosBusqueda.setText("U");
		this.jButtoncodigoProcesoRecibosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProcesoRecibosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProcesoRecibosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProcesoRecibosBusqueda"));

		if(this.procesorecibosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProcesoRecibosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoProcesoRecibos = new JLabelMe();
		this.jLabelnombre_completoProcesoRecibos.setText(""+ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoProcesoRecibos.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoProcesoRecibos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoProcesoRecibos.setToolTipText(ProcesoRecibosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutProcesoRecibos = new GridBagLayout();
		this.jPanelnombre_completoProcesoRecibos.setLayout(this.gridaBagLayoutProcesoRecibos);


		jTextAreanombre_completoProcesoRecibos= new JTextAreaMe();
		jTextAreanombre_completoProcesoRecibos.setEnabled(false);
		jTextAreanombre_completoProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoProcesoRecibos.setLineWrap(true);
		jTextAreanombre_completoProcesoRecibos.setWrapStyleWord(true);
		jTextAreanombre_completoProcesoRecibos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoProcesoRecibos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoProcesoRecibos = new JScrollPane(jTextAreanombre_completoProcesoRecibos);
		jscrollPanenombre_completoProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completoProcesoRecibosBusqueda= new JButtonMe();
		this.jButtonnombre_completoProcesoRecibosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoProcesoRecibosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoProcesoRecibosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoProcesoRecibosBusqueda.setText("U");
		this.jButtonnombre_completoProcesoRecibosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoProcesoRecibosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoProcesoRecibosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoProcesoRecibosBusqueda"));

		if(this.procesorecibosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoProcesoRecibosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_asientoProcesoRecibos = new JLabelMe();
		this.jLabelcodigo_asientoProcesoRecibos.setText(""+ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO+" : *");
		this.jLabelcodigo_asientoProcesoRecibos.setToolTipText("Codigo Asiento");
		this.jLabelcodigo_asientoProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_asientoProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_asientoProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_asientoProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_asientoProcesoRecibos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_asientoProcesoRecibos.setToolTipText(ProcesoRecibosConstantesFunciones.LABEL_CODIGOASIENTO);
		this.gridaBagLayoutProcesoRecibos = new GridBagLayout();
		this.jPanelcodigo_asientoProcesoRecibos.setLayout(this.gridaBagLayoutProcesoRecibos);


		jTextAreacodigo_asientoProcesoRecibos= new JTextAreaMe();
		jTextAreacodigo_asientoProcesoRecibos.setEnabled(false);
		jTextAreacodigo_asientoProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigo_asientoProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigo_asientoProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigo_asientoProcesoRecibos.setLineWrap(true);
		jTextAreacodigo_asientoProcesoRecibos.setWrapStyleWord(true);
		jTextAreacodigo_asientoProcesoRecibos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigo_asientoProcesoRecibos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreacodigo_asientoProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigo_asientoProcesoRecibos = new JScrollPane(jTextAreacodigo_asientoProcesoRecibos);
		jscrollPanecodigo_asientoProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigo_asientoProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigo_asientoProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigo_asientoProcesoRecibosBusqueda= new JButtonMe();
		this.jButtoncodigo_asientoProcesoRecibosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asientoProcesoRecibosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asientoProcesoRecibosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_asientoProcesoRecibosBusqueda.setText("U");
		this.jButtoncodigo_asientoProcesoRecibosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_asientoProcesoRecibosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_asientoProcesoRecibosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigo_asientoProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigo_asientoProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_asientoProcesoRecibosBusqueda"));

		if(this.procesorecibosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_asientoProcesoRecibosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorProcesoRecibos = new JLabelMe();
		this.jLabelnumero_mayorProcesoRecibos.setText(""+ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR+" : *");
		this.jLabelnumero_mayorProcesoRecibos.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorProcesoRecibos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorProcesoRecibos.setToolTipText(ProcesoRecibosConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutProcesoRecibos = new GridBagLayout();
		this.jPanelnumero_mayorProcesoRecibos.setLayout(this.gridaBagLayoutProcesoRecibos);


		jTextAreanumero_mayorProcesoRecibos= new JTextAreaMe();
		jTextAreanumero_mayorProcesoRecibos.setEnabled(false);
		jTextAreanumero_mayorProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorProcesoRecibos.setLineWrap(true);
		jTextAreanumero_mayorProcesoRecibos.setWrapStyleWord(true);
		jTextAreanumero_mayorProcesoRecibos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_mayorProcesoRecibos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_mayorProcesoRecibos = new JScrollPane(jTextAreanumero_mayorProcesoRecibos);
		jscrollPanenumero_mayorProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnumero_mayorProcesoRecibosBusqueda= new JButtonMe();
		this.jButtonnumero_mayorProcesoRecibosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorProcesoRecibosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorProcesoRecibosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorProcesoRecibosBusqueda.setText("U");
		this.jButtonnumero_mayorProcesoRecibosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorProcesoRecibosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorProcesoRecibosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_mayorProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_mayorProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorProcesoRecibosBusqueda"));

		if(this.procesorecibosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorProcesoRecibosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoRecibos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_provinciaProcesoRecibos = new JLabelMe();
		this.jLabelid_provinciaProcesoRecibos.setText(""+ProcesoRecibosConstantesFunciones.LABEL_IDPROVINCIA+" : *");
		this.jLabelid_provinciaProcesoRecibos.setToolTipText("Provincia");
		this.jLabelid_provinciaProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_provinciaProcesoRecibos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_provinciaProcesoRecibos.setToolTipText(ProcesoRecibosConstantesFunciones.LABEL_IDPROVINCIA);
		this.gridaBagLayoutProcesoRecibos = new GridBagLayout();
		this.jPanelid_provinciaProcesoRecibos.setLayout(this.gridaBagLayoutProcesoRecibos);


		jComboBoxid_provinciaProcesoRecibos= new JComboBoxMe();
		jComboBoxid_provinciaProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_provinciaProcesoRecibos= new JButtonMe();
		this.jButtonid_provinciaProcesoRecibos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaProcesoRecibos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaProcesoRecibos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaProcesoRecibos.setText("Buscar");
		this.jButtonid_provinciaProcesoRecibos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_provinciaProcesoRecibos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaProcesoRecibos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_provinciaProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaProcesoRecibos"));

		this.jButtonid_provinciaProcesoRecibosBusqueda= new JButtonMe();
		this.jButtonid_provinciaProcesoRecibosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaProcesoRecibosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaProcesoRecibosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaProcesoRecibosBusqueda.setText("U");
		this.jButtonid_provinciaProcesoRecibosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_provinciaProcesoRecibosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaProcesoRecibosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_provinciaProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaProcesoRecibosBusqueda"));

		if(this.procesorecibosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_provinciaProcesoRecibosBusqueda.setVisible(false);		}

		this.jButtonid_provinciaProcesoRecibosUpdate= new JButtonMe();
		this.jButtonid_provinciaProcesoRecibosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaProcesoRecibosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaProcesoRecibosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaProcesoRecibosUpdate.setText("U");
		this.jButtonid_provinciaProcesoRecibosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_provinciaProcesoRecibosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaProcesoRecibosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_provinciaProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaProcesoRecibosUpdate"));



					
		this.jLabelid_ciudadProcesoRecibos = new JLabelMe();
		this.jLabelid_ciudadProcesoRecibos.setText(""+ProcesoRecibosConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadProcesoRecibos.setToolTipText("Ciudad");
		this.jLabelid_ciudadProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadProcesoRecibos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadProcesoRecibos.setToolTipText(ProcesoRecibosConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutProcesoRecibos = new GridBagLayout();
		this.jPanelid_ciudadProcesoRecibos.setLayout(this.gridaBagLayoutProcesoRecibos);


		jComboBoxid_ciudadProcesoRecibos= new JComboBoxMe();
		jComboBoxid_ciudadProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadProcesoRecibos= new JButtonMe();
		this.jButtonid_ciudadProcesoRecibos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadProcesoRecibos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadProcesoRecibos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadProcesoRecibos.setText("Buscar");
		this.jButtonid_ciudadProcesoRecibos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadProcesoRecibos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadProcesoRecibos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadProcesoRecibos"));

		this.jButtonid_ciudadProcesoRecibosBusqueda= new JButtonMe();
		this.jButtonid_ciudadProcesoRecibosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadProcesoRecibosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadProcesoRecibosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadProcesoRecibosBusqueda.setText("U");
		this.jButtonid_ciudadProcesoRecibosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadProcesoRecibosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadProcesoRecibosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadProcesoRecibosBusqueda"));

		if(this.procesorecibosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadProcesoRecibosBusqueda.setVisible(false);		}

		this.jButtonid_ciudadProcesoRecibosUpdate= new JButtonMe();
		this.jButtonid_ciudadProcesoRecibosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadProcesoRecibosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadProcesoRecibosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadProcesoRecibosUpdate.setText("U");
		this.jButtonid_ciudadProcesoRecibosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadProcesoRecibosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadProcesoRecibosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadProcesoRecibosUpdate"));



					
		this.jLabelid_zonaProcesoRecibos = new JLabelMe();
		this.jLabelid_zonaProcesoRecibos.setText(""+ProcesoRecibosConstantesFunciones.LABEL_IDZONA+" : *");
		this.jLabelid_zonaProcesoRecibos.setToolTipText("Zona");
		this.jLabelid_zonaProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_zonaProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_zonaProcesoRecibos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_zonaProcesoRecibos.setToolTipText(ProcesoRecibosConstantesFunciones.LABEL_IDZONA);
		this.gridaBagLayoutProcesoRecibos = new GridBagLayout();
		this.jPanelid_zonaProcesoRecibos.setLayout(this.gridaBagLayoutProcesoRecibos);


		jComboBoxid_zonaProcesoRecibos= new JComboBoxMe();
		jComboBoxid_zonaProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_zonaProcesoRecibos= new JButtonMe();
		this.jButtonid_zonaProcesoRecibos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaProcesoRecibos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaProcesoRecibos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaProcesoRecibos.setText("Buscar");
		this.jButtonid_zonaProcesoRecibos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_zonaProcesoRecibos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaProcesoRecibos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_zonaProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaProcesoRecibos"));

		this.jButtonid_zonaProcesoRecibosBusqueda= new JButtonMe();
		this.jButtonid_zonaProcesoRecibosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaProcesoRecibosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaProcesoRecibosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaProcesoRecibosBusqueda.setText("U");
		this.jButtonid_zonaProcesoRecibosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_zonaProcesoRecibosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaProcesoRecibosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_zonaProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaProcesoRecibosBusqueda"));

		if(this.procesorecibosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_zonaProcesoRecibosBusqueda.setVisible(false);		}

		this.jButtonid_zonaProcesoRecibosUpdate= new JButtonMe();
		this.jButtonid_zonaProcesoRecibosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaProcesoRecibosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaProcesoRecibosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaProcesoRecibosUpdate.setText("U");
		this.jButtonid_zonaProcesoRecibosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_zonaProcesoRecibosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaProcesoRecibosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_zonaProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaProcesoRecibosUpdate"));



					
		this.jLabelid_grupo_clienteProcesoRecibos = new JLabelMe();
		this.jLabelid_grupo_clienteProcesoRecibos.setText(""+ProcesoRecibosConstantesFunciones.LABEL_IDGRUPOCLIENTE+" : *");
		this.jLabelid_grupo_clienteProcesoRecibos.setToolTipText("Grupo Cliente");
		this.jLabelid_grupo_clienteProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_clienteProcesoRecibos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_clienteProcesoRecibos.setToolTipText(ProcesoRecibosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		this.gridaBagLayoutProcesoRecibos = new GridBagLayout();
		this.jPanelid_grupo_clienteProcesoRecibos.setLayout(this.gridaBagLayoutProcesoRecibos);


		jComboBoxid_grupo_clienteProcesoRecibos= new JComboBoxMe();
		jComboBoxid_grupo_clienteProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_clienteProcesoRecibos= new JButtonMe();
		this.jButtonid_grupo_clienteProcesoRecibos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteProcesoRecibos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteProcesoRecibos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteProcesoRecibos.setText("Buscar");
		this.jButtonid_grupo_clienteProcesoRecibos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_clienteProcesoRecibos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteProcesoRecibos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_clienteProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteProcesoRecibos"));

		this.jButtonid_grupo_clienteProcesoRecibosBusqueda= new JButtonMe();
		this.jButtonid_grupo_clienteProcesoRecibosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteProcesoRecibosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteProcesoRecibosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteProcesoRecibosBusqueda.setText("U");
		this.jButtonid_grupo_clienteProcesoRecibosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_clienteProcesoRecibosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteProcesoRecibosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_clienteProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteProcesoRecibosBusqueda"));

		if(this.procesorecibosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_clienteProcesoRecibosBusqueda.setVisible(false);		}

		this.jButtonid_grupo_clienteProcesoRecibosUpdate= new JButtonMe();
		this.jButtonid_grupo_clienteProcesoRecibosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteProcesoRecibosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteProcesoRecibosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteProcesoRecibosUpdate.setText("U");
		this.jButtonid_grupo_clienteProcesoRecibosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_clienteProcesoRecibosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteProcesoRecibosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_clienteProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteProcesoRecibosUpdate"));



					
		this.jLabelid_vendedorProcesoRecibos = new JLabelMe();
		this.jLabelid_vendedorProcesoRecibos.setText(""+ProcesoRecibosConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorProcesoRecibos.setToolTipText("Vendedor");
		this.jLabelid_vendedorProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorProcesoRecibos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorProcesoRecibos.setToolTipText(ProcesoRecibosConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutProcesoRecibos = new GridBagLayout();
		this.jPanelid_vendedorProcesoRecibos.setLayout(this.gridaBagLayoutProcesoRecibos);


		jComboBoxid_vendedorProcesoRecibos= new JComboBoxMe();
		jComboBoxid_vendedorProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorProcesoRecibos= new JButtonMe();
		this.jButtonid_vendedorProcesoRecibos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorProcesoRecibos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorProcesoRecibos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorProcesoRecibos.setText("Buscar");
		this.jButtonid_vendedorProcesoRecibos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorProcesoRecibos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorProcesoRecibos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorProcesoRecibos"));

		this.jButtonid_vendedorProcesoRecibosBusqueda= new JButtonMe();
		this.jButtonid_vendedorProcesoRecibosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorProcesoRecibosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorProcesoRecibosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorProcesoRecibosBusqueda.setText("U");
		this.jButtonid_vendedorProcesoRecibosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorProcesoRecibosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorProcesoRecibosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorProcesoRecibosBusqueda"));

		if(this.procesorecibosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorProcesoRecibosBusqueda.setVisible(false);		}

		this.jButtonid_vendedorProcesoRecibosUpdate= new JButtonMe();
		this.jButtonid_vendedorProcesoRecibosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorProcesoRecibosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorProcesoRecibosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorProcesoRecibosUpdate.setText("U");
		this.jButtonid_vendedorProcesoRecibosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorProcesoRecibosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorProcesoRecibosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorProcesoRecibos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorProcesoRecibos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorProcesoRecibosUpdate"));



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
		//this.jInternalFrameDetalleProcesoRecibos = new ProcesoRecibosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Recibos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoRecibos= new GridBagLayout();
		

		
		String sToolTipProcesoRecibos="";
		sToolTipProcesoRecibos=ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoRecibos+="(Facturacion.ProcesoRecibos)";
		}
		
		if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoRecibos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoRecibos = new JButtonMe();
		this.jButtonModificarProcesoRecibos = new JButtonMe();
        this.jButtonActualizarProcesoRecibos = new JButtonMe();
        this.jButtonEliminarProcesoRecibos = new JButtonMe();
        this.jButtonCancelarProcesoRecibos = new JButtonMe();
        this.jButtonGuardarCambiosProcesoRecibos = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoRecibos = new JButtonMe();
		this.jButtonCerrarProcesoRecibos = new JButtonMe();
		
		this.jScrollPanelDatosProcesoRecibos = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoRecibos = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoRecibos = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoRecibos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoRecibos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoRecibos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoRecibos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Recibos";
		
		if(!this.procesorecibosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Reciboses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoRecibos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoRecibos.setName("jPanelCamposProcesoRecibos"); 

		this.jPanelCamposOcultosProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoRecibos.setName("jPanelCamposOcultosProcesoRecibos"); 

        this.jPanelAccionesProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoRecibos.setToolTipText("Acciones");
        this.jPanelAccionesProcesoRecibos.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoRecibos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoRecibos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoRecibos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoRecibos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoRecibos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoRecibos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoRecibos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoRecibos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoRecibos.setText("Nuevo");
		this.jButtonModificarProcesoRecibos.setText("Editar");
        this.jButtonActualizarProcesoRecibos.setText("Actualizar");
        this.jButtonEliminarProcesoRecibos.setText("Eliminar");
        this.jButtonCancelarProcesoRecibos.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoRecibos.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoRecibos.setText("Guardar");
		this.jButtonCerrarProcesoRecibos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoRecibos,"nuevo_button","Nuevo",this.procesorecibosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoRecibos,"modificar_button","Editar",this.procesorecibosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoRecibos,"actualizar_button","Actualizar",this.procesorecibosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoRecibos,"eliminar_button","Eliminar",this.procesorecibosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoRecibos,"cancelar_button","Cancelar",this.procesorecibosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoRecibos,"guardarcambios_button","Guardar",this.procesorecibosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoRecibos,"guardarcambiostabla_button","Guardar",this.procesorecibosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoRecibos,"cerrar_button","Salir",this.procesorecibosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoRecibos.setToolTipText("Nuevo"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoRecibos.setToolTipText("Editar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoRecibos.setToolTipText("Actualizar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoRecibos.setToolTipText("Eliminar)"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoRecibos.setToolTipText("Cancelar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoRecibos.setToolTipText("Guardar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoRecibos.setToolTipText("Guardar"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoRecibos.setToolTipText("Salir"+" "+ProcesoRecibosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoRecibos";
		inputMap = this.jButtonNuevoProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoRecibos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoRecibos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoRecibos";
		inputMap = this.jButtonActualizarProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoRecibos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoRecibos"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoRecibos";
		inputMap = this.jButtonEliminarProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoRecibos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoRecibos"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoRecibos";
		inputMap = this.jButtonCancelarProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoRecibos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoRecibos"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoRecibos";
		inputMap = this.jButtonCerrarProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoRecibos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoRecibos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoRecibos";
		inputMap = this.jButtonGuardarCambiosTablaProcesoRecibos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoRecibos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoRecibos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoRecibos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoRecibos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoRecibos.setToolTipText("Nuevo ProcesoRecibos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoRecibos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoRecibos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoRecibos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoRecibos.setToolTipText("Sin Cerrar Ventana ProcesoRecibos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoRecibos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoRecibos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoRecibos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoRecibos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoRecibos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoRecibos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoRecibos.setText("Accion");
		this.jComboBoxTiposAccionesProcesoRecibos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoRecibos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoRecibos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoRecibos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoRecibos = new JLabelMe();
		
		this.jLabelAccionesProcesoRecibos.setText("Acciones");		
		this.jLabelAccionesProcesoRecibos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoRecibos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoRecibos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoRecibos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoRecibos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoRecibos=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoRecibos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoRecibos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoRecibos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoRecibos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoRecibos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoRecibos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoRecibos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoRecibos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoRecibos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoRecibos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoRecibos = new GridBagLayout();
		
		this.jPanelCamposProcesoRecibos.setLayout(gridaBagLayoutCamposProcesoRecibos);
		this.jPanelCamposOcultosProcesoRecibos.setLayout(gridaBagLayoutCamposOcultosProcesoRecibos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 0;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoRecibos.add(jLabelIdProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 1;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoRecibos.add(jLabelidProcesoRecibos, this.gridBagConstraintsProcesoRecibos);


	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 0;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_provinciaProcesoRecibos.add(jLabelid_provinciaProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 2;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaProcesoRecibos.add(jButtonid_provinciaProcesoRecibosBusqueda, this.gridBagConstraintsProcesoRecibos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 3;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaProcesoRecibos.add(jButtonid_provinciaProcesoRecibosUpdate, this.gridBagConstraintsProcesoRecibos);
	}

	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 1;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_provinciaProcesoRecibos.add(jComboBoxid_provinciaProcesoRecibos, this.gridBagConstraintsProcesoRecibos);


	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 0;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadProcesoRecibos.add(jLabelid_ciudadProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 2;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadProcesoRecibos.add(jButtonid_ciudadProcesoRecibosBusqueda, this.gridBagConstraintsProcesoRecibos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 3;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadProcesoRecibos.add(jButtonid_ciudadProcesoRecibosUpdate, this.gridBagConstraintsProcesoRecibos);
	}

	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 1;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadProcesoRecibos.add(jComboBoxid_ciudadProcesoRecibos, this.gridBagConstraintsProcesoRecibos);


	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 0;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_zonaProcesoRecibos.add(jLabelid_zonaProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 2;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaProcesoRecibos.add(jButtonid_zonaProcesoRecibosBusqueda, this.gridBagConstraintsProcesoRecibos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 3;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaProcesoRecibos.add(jButtonid_zonaProcesoRecibosUpdate, this.gridBagConstraintsProcesoRecibos);
	}

	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 1;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_zonaProcesoRecibos.add(jComboBoxid_zonaProcesoRecibos, this.gridBagConstraintsProcesoRecibos);


	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 0;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_clienteProcesoRecibos.add(jLabelid_grupo_clienteProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 2;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteProcesoRecibos.add(jButtonid_grupo_clienteProcesoRecibosBusqueda, this.gridBagConstraintsProcesoRecibos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 3;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteProcesoRecibos.add(jButtonid_grupo_clienteProcesoRecibosUpdate, this.gridBagConstraintsProcesoRecibos);
	}

	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 1;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_clienteProcesoRecibos.add(jComboBoxid_grupo_clienteProcesoRecibos, this.gridBagConstraintsProcesoRecibos);


	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 0;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorProcesoRecibos.add(jLabelid_vendedorProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 2;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorProcesoRecibos.add(jButtonid_vendedorProcesoRecibosBusqueda, this.gridBagConstraintsProcesoRecibos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 3;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorProcesoRecibos.add(jButtonid_vendedorProcesoRecibosUpdate, this.gridBagConstraintsProcesoRecibos);
	}

	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 1;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorProcesoRecibos.add(jComboBoxid_vendedorProcesoRecibos, this.gridBagConstraintsProcesoRecibos);


	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 0;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_provinciaProcesoRecibos.add(jLabelnombre_provinciaProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 2;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_provinciaProcesoRecibos.add(jButtonnombre_provinciaProcesoRecibosBusqueda, this.gridBagConstraintsProcesoRecibos);
	}

	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 1;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_provinciaProcesoRecibos.add(jscrollPanenombre_provinciaProcesoRecibos, this.gridBagConstraintsProcesoRecibos);


	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 0;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_ciudadProcesoRecibos.add(jLabelnombre_ciudadProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 2;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_ciudadProcesoRecibos.add(jButtonnombre_ciudadProcesoRecibosBusqueda, this.gridBagConstraintsProcesoRecibos);
	}

	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 1;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_ciudadProcesoRecibos.add(jscrollPanenombre_ciudadProcesoRecibos, this.gridBagConstraintsProcesoRecibos);


	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 0;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_zonaProcesoRecibos.add(jLabelnombre_zonaProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 2;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_zonaProcesoRecibos.add(jButtonnombre_zonaProcesoRecibosBusqueda, this.gridBagConstraintsProcesoRecibos);
	}

	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 1;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_zonaProcesoRecibos.add(jTextFieldnombre_zonaProcesoRecibos, this.gridBagConstraintsProcesoRecibos);


	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 0;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_grupo_clienteProcesoRecibos.add(jLabelnombre_grupo_clienteProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 2;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_grupo_clienteProcesoRecibos.add(jButtonnombre_grupo_clienteProcesoRecibosBusqueda, this.gridBagConstraintsProcesoRecibos);
	}

	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 1;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_grupo_clienteProcesoRecibos.add(jscrollPanenombre_grupo_clienteProcesoRecibos, this.gridBagConstraintsProcesoRecibos);


	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 0;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_vendedorProcesoRecibos.add(jLabelnombre_vendedorProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 2;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_vendedorProcesoRecibos.add(jButtonnombre_vendedorProcesoRecibosBusqueda, this.gridBagConstraintsProcesoRecibos);
	}

	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 1;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_vendedorProcesoRecibos.add(jscrollPanenombre_vendedorProcesoRecibos, this.gridBagConstraintsProcesoRecibos);


	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 0;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProcesoRecibos.add(jLabelcodigoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 2;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProcesoRecibos.add(jButtoncodigoProcesoRecibosBusqueda, this.gridBagConstraintsProcesoRecibos);
	}

	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 1;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProcesoRecibos.add(jTextFieldcodigoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);


	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 0;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoProcesoRecibos.add(jLabelnombre_completoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 2;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoProcesoRecibos.add(jButtonnombre_completoProcesoRecibosBusqueda, this.gridBagConstraintsProcesoRecibos);
	}

	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 1;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoProcesoRecibos.add(jscrollPanenombre_completoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);


	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 0;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_asientoProcesoRecibos.add(jLabelcodigo_asientoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 2;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_asientoProcesoRecibos.add(jButtoncodigo_asientoProcesoRecibosBusqueda, this.gridBagConstraintsProcesoRecibos);
	}

	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 1;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_asientoProcesoRecibos.add(jscrollPanecodigo_asientoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);


	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 0;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mayorProcesoRecibos.add(jLabelnumero_mayorProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = 2;
		this.gridBagConstraintsProcesoRecibos.ipadx = 0;
		this.gridBagConstraintsProcesoRecibos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorProcesoRecibos.add(jButtonnumero_mayorProcesoRecibosBusqueda, this.gridBagConstraintsProcesoRecibos);
	}

	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecibos.gridy = 0;
	this.gridBagConstraintsProcesoRecibos.gridx = 1;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mayorProcesoRecibos.add(jscrollPanenumero_mayorProcesoRecibos, this.gridBagConstraintsProcesoRecibos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecibos.gridy = iYPanelCamposProcesoRecibos;
	this.gridBagConstraintsProcesoRecibos.gridx = iXPanelCamposProcesoRecibos++;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecibos.add(this.jPanelidProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(iXPanelCamposProcesoRecibos % 2==0) {
		iXPanelCamposProcesoRecibos=0;
		iYPanelCamposProcesoRecibos++;
	}
	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecibos.gridy = iYPanelCamposProcesoRecibos;
	this.gridBagConstraintsProcesoRecibos.gridx = iXPanelCamposProcesoRecibos++;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecibos.add(this.jPanelid_provinciaProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(iXPanelCamposProcesoRecibos % 2==0) {
		iXPanelCamposProcesoRecibos=0;
		iYPanelCamposProcesoRecibos++;
	}
	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecibos.gridy = iYPanelCamposProcesoRecibos;
	this.gridBagConstraintsProcesoRecibos.gridx = iXPanelCamposProcesoRecibos++;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecibos.add(this.jPanelid_ciudadProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(iXPanelCamposProcesoRecibos % 2==0) {
		iXPanelCamposProcesoRecibos=0;
		iYPanelCamposProcesoRecibos++;
	}
	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecibos.gridy = iYPanelCamposProcesoRecibos;
	this.gridBagConstraintsProcesoRecibos.gridx = iXPanelCamposProcesoRecibos++;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecibos.add(this.jPanelid_zonaProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(iXPanelCamposProcesoRecibos % 2==0) {
		iXPanelCamposProcesoRecibos=0;
		iYPanelCamposProcesoRecibos++;
	}
	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecibos.gridy = iYPanelCamposProcesoRecibos;
	this.gridBagConstraintsProcesoRecibos.gridx = iXPanelCamposProcesoRecibos++;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecibos.add(this.jPanelid_grupo_clienteProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(iXPanelCamposProcesoRecibos % 2==0) {
		iXPanelCamposProcesoRecibos=0;
		iYPanelCamposProcesoRecibos++;
	}
	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecibos.gridy = iYPanelCamposProcesoRecibos;
	this.gridBagConstraintsProcesoRecibos.gridx = iXPanelCamposProcesoRecibos++;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecibos.add(this.jPanelid_vendedorProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(iXPanelCamposProcesoRecibos % 2==0) {
		iXPanelCamposProcesoRecibos=0;
		iYPanelCamposProcesoRecibos++;
	}
	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecibos.gridy = iYPanelCamposProcesoRecibos;
	this.gridBagConstraintsProcesoRecibos.gridx = iXPanelCamposProcesoRecibos++;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecibos.add(this.jPanelnombre_provinciaProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(iXPanelCamposProcesoRecibos % 2==0) {
		iXPanelCamposProcesoRecibos=0;
		iYPanelCamposProcesoRecibos++;
	}
	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecibos.gridy = iYPanelCamposProcesoRecibos;
	this.gridBagConstraintsProcesoRecibos.gridx = iXPanelCamposProcesoRecibos++;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecibos.add(this.jPanelnombre_ciudadProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(iXPanelCamposProcesoRecibos % 2==0) {
		iXPanelCamposProcesoRecibos=0;
		iYPanelCamposProcesoRecibos++;
	}
	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecibos.gridy = iYPanelCamposProcesoRecibos;
	this.gridBagConstraintsProcesoRecibos.gridx = iXPanelCamposProcesoRecibos++;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecibos.add(this.jPanelnombre_zonaProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(iXPanelCamposProcesoRecibos % 2==0) {
		iXPanelCamposProcesoRecibos=0;
		iYPanelCamposProcesoRecibos++;
	}
	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecibos.gridy = iYPanelCamposProcesoRecibos;
	this.gridBagConstraintsProcesoRecibos.gridx = iXPanelCamposProcesoRecibos++;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecibos.add(this.jPanelnombre_grupo_clienteProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(iXPanelCamposProcesoRecibos % 2==0) {
		iXPanelCamposProcesoRecibos=0;
		iYPanelCamposProcesoRecibos++;
	}
	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecibos.gridy = iYPanelCamposProcesoRecibos;
	this.gridBagConstraintsProcesoRecibos.gridx = iXPanelCamposProcesoRecibos++;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecibos.add(this.jPanelnombre_vendedorProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(iXPanelCamposProcesoRecibos % 2==0) {
		iXPanelCamposProcesoRecibos=0;
		iYPanelCamposProcesoRecibos++;
	}
	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecibos.gridy = iYPanelCamposProcesoRecibos;
	this.gridBagConstraintsProcesoRecibos.gridx = iXPanelCamposProcesoRecibos++;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecibos.add(this.jPanelcodigoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(iXPanelCamposProcesoRecibos % 2==0) {
		iXPanelCamposProcesoRecibos=0;
		iYPanelCamposProcesoRecibos++;
	}
	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecibos.gridy = iYPanelCamposProcesoRecibos;
	this.gridBagConstraintsProcesoRecibos.gridx = iXPanelCamposProcesoRecibos++;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecibos.add(this.jPanelnombre_completoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(iXPanelCamposProcesoRecibos % 2==0) {
		iXPanelCamposProcesoRecibos=0;
		iYPanelCamposProcesoRecibos++;
	}
	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecibos.gridy = iYPanelCamposProcesoRecibos;
	this.gridBagConstraintsProcesoRecibos.gridx = iXPanelCamposProcesoRecibos++;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecibos.add(this.jPanelcodigo_asientoProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(iXPanelCamposProcesoRecibos % 2==0) {
		iXPanelCamposProcesoRecibos=0;
		iYPanelCamposProcesoRecibos++;
	}
	this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecibos.gridy = iYPanelCamposProcesoRecibos;
	this.gridBagConstraintsProcesoRecibos.gridx = iXPanelCamposProcesoRecibos++;
	this.gridBagConstraintsProcesoRecibos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecibos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecibos.add(this.jPanelnumero_mayorProcesoRecibos, this.gridBagConstraintsProcesoRecibos);



	if(iXPanelCamposProcesoRecibos % 2==0) {
		iXPanelCamposProcesoRecibos=0;
		iYPanelCamposProcesoRecibos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoRecibos= new GridBagLayout();
		this.jPanelAccionesProcesoRecibos.setLayout(gridaBagLayoutAccionesProcesoRecibos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoRecibos= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoRecibos.setLayout(gridaBagLayoutAccionesFormularioProcesoRecibos);
		
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoRecibos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoRecibos.add(this.jComboBoxTiposAccionesFormularioProcesoRecibos, this.gridBagConstraintsProcesoRecibos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoRecibos.add(this.jButtonModificarProcesoRecibos, this.gridBagConstraintsProcesoRecibos);							

		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecibos.gridy = 0;
		this.gridBagConstraintsProcesoRecibos.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoRecibos.add(this.jButtonEliminarProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		
			
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy = 0;		
		this.gridBagConstraintsProcesoRecibos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoRecibos.add(this.jButtonActualizarProcesoRecibos, this.gridBagConstraintsProcesoRecibos);


		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy = 0;		
		this.gridBagConstraintsProcesoRecibos.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoRecibos.add(this.jButtonGuardarCambiosProcesoRecibos, this.gridBagConstraintsProcesoRecibos);	
		
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy = 0;		
		this.gridBagConstraintsProcesoRecibos.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoRecibos.add(this.jButtonCancelarProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoRecibos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoRecibos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesorecibosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();						
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoRecibos.gridx = 0;		
			//this.gridBagConstraintsProcesoRecibos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoRecibos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoRecibos.gridx =0;
		this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoRecibos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoRecibosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoRecibos = new ProcesoRecibosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Recibos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Recibos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Recibos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoRecibosModel procesorecibosModel=new ProcesoRecibosModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoRecibosModel.ProcesoRecibosFocusTraversalPolicy procesorecibosFocusTraversalPolicy = procesorecibosModel.new ProcesoRecibosFocusTraversalPolicy(this);
			
			//procesorecibosFocusTraversalPolicy.setprocesorecibosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesorecibosModel);
			
			
			this.jContentPaneDetalleProcesoRecibos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoRecibos = new GridBagLayout();	
			this.jContentPaneDetalleProcesoRecibos.setLayout(gridaBagLayoutDetalleProcesoRecibos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoRecibos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
				this.gridBagConstraintsProcesoRecibos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoRecibos.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoRecibos.add(jTtoolBarDetalleProcesoRecibos, gridBagConstraintsProcesoRecibos);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoRecibos=   new JScrollPane(jContentPaneDetalleProcesoRecibos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoRecibos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoRecibos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoRecibos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoRecibos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoRecibos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoRecibos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoRecibos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoRecibos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoRecibos.gridx = 0;
	        
			this.jContentPaneDetalleProcesoRecibos.add(jPanelCamposProcesoRecibos, gridBagConstraintsProcesoRecibos);
			
			
			
			
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
						//&& procesorecibosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesorecibosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoRecibos= new GridBagConstraints();
						this.gridBagConstraintsProcesoRecibos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoRecibos.gridx = 0;
						this.jContentPaneDetalleProcesoRecibos.add(this.jTabbedPaneRelacionesProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoRecibos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoRecibos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
					this.gridBagConstraintsProcesoRecibos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoRecibos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoRecibos.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoRecibos.add(jPanelCamposOcultosProcesoRecibos, gridBagConstraintsProcesoRecibos);
				
					this.jPanelCamposOcultosProcesoRecibos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoRecibos.gridx = 0;
	        this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoRecibos.add(this.jPanelAccionesFormularioProcesoRecibos, this.gridBagConstraintsProcesoRecibos);							
			
			
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
	        this.gridBagConstraintsProcesoRecibos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoRecibos.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoRecibos.add(this.jPanelAccionesProcesoRecibos, this.gridBagConstraintsProcesoRecibos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoRecibos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoRecibos=   new JScrollPane(this.jPanelCamposProcesoRecibos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoRecibos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoRecibos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoRecibos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoRecibos.gridx = 0;
			this.gridBagConstraintsProcesoRecibos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoRecibos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoRecibos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoRecibos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoRecibos, this.gridBagConstraintsProcesoRecibos);			
			
			this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecibos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoRecibos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoRecibos, this.gridBagConstraintsProcesoRecibos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecibos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
			
			
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecibos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		
			
		this.gridBagConstraintsProcesoRecibos = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecibos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecibos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoRecibos, this.gridBagConstraintsProcesoRecibos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProcesoRecibos;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoRecibos;
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
