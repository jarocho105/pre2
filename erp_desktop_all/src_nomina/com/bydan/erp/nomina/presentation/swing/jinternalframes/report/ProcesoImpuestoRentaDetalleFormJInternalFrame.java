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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.ProcesoImpuestoRentaConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class ProcesoImpuestoRentaDetalleFormJInternalFrame extends ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoImpuestoRenta;
	
	protected JMenuBar jmenuBarDetalleProcesoImpuestoRenta;
	
	protected JMenu jmenuDetalleProcesoImpuestoRenta;
	protected JMenu jmenuDetalleArchivoProcesoImpuestoRenta;
	protected JMenu jmenuDetalleAccionesProcesoImpuestoRenta;
	protected JMenu jmenuDetalleDatosProcesoImpuestoRenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoImpuestoRenta;	
	protected GridBagConstraints gridBagConstraintsProcesoImpuestoRenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoImpuestoRenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";
	
	public ProcesoImpuestoRentaSessionBean procesoimpuestorentaSessionBean;
	
	
	
	
	public AnioSessionBean anioSessionBean;	
	
	public ProcesoImpuestoRentaLogic procesoimpuestorentaLogic;
	
	public JScrollPane jScrollPanelDatosProcesoImpuestoRenta;
	public JScrollPane jScrollPanelDatosEdicionProcesoImpuestoRenta;
	public JScrollPane jScrollPanelDatosGeneralProcesoImpuestoRenta;
	
	protected JPanel jPanelCamposProcesoImpuestoRenta;    
	protected JPanel jPanelCamposOcultosProcesoImpuestoRenta;    	
	protected JPanel jPanelAccionesProcesoImpuestoRenta;
	protected JPanel jPanelAccionesFormularioProcesoImpuestoRenta;
    
	
	
	protected Integer iXPanelCamposProcesoImpuestoRenta=0;
	protected Integer iYPanelCamposProcesoImpuestoRenta=0;
	
	protected Integer iXPanelCamposOcultosProcesoImpuestoRenta=0;
	protected Integer iYPanelCamposOcultosProcesoImpuestoRenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoImpuestoRenta;
	public JButton jButtonModificarProcesoImpuestoRenta;
	public JButton jButtonActualizarProcesoImpuestoRenta;
    public JButton jButtonEliminarProcesoImpuestoRenta;
	public JButton jButtonCancelarProcesoImpuestoRenta;
    public JButton jButtonGuardarCambiosProcesoImpuestoRenta;
	public JButton jButtonGuardarCambiosTablaProcesoImpuestoRenta;
	protected JButton jButtonCerrarProcesoImpuestoRenta;
	
	
	protected JButton jButtonProcesarInformacionProcesoImpuestoRenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoImpuestoRenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoImpuestoRenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoImpuestoRenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoImpuestoRenta;
	protected JButton jButtonModificarToolBarProcesoImpuestoRenta;
	protected JButton jButtonActualizarToolBarProcesoImpuestoRenta;
    protected JButton jButtonEliminarToolBarProcesoImpuestoRenta;
	protected JButton jButtonCancelarToolBarProcesoImpuestoRenta;
    protected JButton jButtonGuardarCambiosToolBarProcesoImpuestoRenta;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoImpuestoRenta;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoImpuestoRenta;
	protected JButton jButtonCerrarToolBarProcesoImpuestoRenta;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoImpuestoRenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoImpuestoRenta;
	protected JMenuItem jMenuItemModificarProcesoImpuestoRenta;
	protected JMenuItem jMenuItemActualizarProcesoImpuestoRenta;
    protected JMenuItem jMenuItemEliminarProcesoImpuestoRenta;
	protected JMenuItem jMenuItemCancelarProcesoImpuestoRenta;
    protected JMenuItem jMenuItemGuardarCambiosProcesoImpuestoRenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoImpuestoRenta;
	protected JMenuItem jMenuItemCerrarProcesoImpuestoRenta;
	protected JMenuItem jMenuItemDetalleCerrarProcesoImpuestoRenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoImpuestoRenta;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoImpuestoRenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoImpuestoRenta;
	protected JMenuItem jMenuItemMostrarOcultarProcesoImpuestoRenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoImpuestoRenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoImpuestoRenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoImpuestoRenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoImpuestoRenta;
	public JLabel jLabelIdProcesoImpuestoRenta;
	public JLabel jLabelidProcesoImpuestoRenta;
	public JButton jButtonidProcesoImpuestoRentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioProcesoImpuestoRenta;
	public JLabel jLabelid_anioProcesoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioProcesoImpuestoRenta;
	public JButton jButtonid_anioProcesoImpuestoRenta= new JButtonMe();
	public JButton jButtonid_anioProcesoImpuestoRentaUpdate= new JButtonMe();
	public JButton jButtonid_anioProcesoImpuestoRentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoImpuestoRenta;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=198;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoImpuestoRentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoImpuestoRenta=new JPanel();
				this.jPanelAccionesFormularioProcesoImpuestoRenta=new JPanel();
				this.jmenuBarDetalleProcesoImpuestoRenta=new JMenuBar();
				this.jTtoolBarDetalleProcesoImpuestoRenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoImpuestoRentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoImpuestoRentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoImpuestoRentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoImpuestoRentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoImpuestoRentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoImpuestoRenta() {
		return this.jButtonActualizarToolBarProcesoImpuestoRenta;
	}
	
	public JButton getjButtonEliminarToolBarProcesoImpuestoRenta() {
		return this.jButtonEliminarToolBarProcesoImpuestoRenta;
	}
	
	public JButton getjButtonCancelarToolBarProcesoImpuestoRenta() {
		return this.jButtonCancelarToolBarProcesoImpuestoRenta;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoImpuestoRenta() {
		return this.jButtonProcesarInformacionProcesoImpuestoRenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoImpuestoRenta)	{
		this.jButtonProcesarInformacionProcesoImpuestoRenta = jButtonProcesarInformacionProcesoImpuestoRenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoImpuestoRenta() {
		return this.jComboBoxTiposAccionesProcesoImpuestoRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoImpuestoRenta(
			JComboBox jComboBoxTiposRelacionesProcesoImpuestoRenta) {
		this.jComboBoxTiposRelacionesProcesoImpuestoRenta = jComboBoxTiposRelacionesProcesoImpuestoRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoImpuestoRenta(
			JComboBox jComboBoxTiposAccionesProcesoImpuestoRenta) {
		this.jComboBoxTiposAccionesProcesoImpuestoRenta = jComboBoxTiposAccionesProcesoImpuestoRenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoImpuestoRenta() {
		return this.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoImpuestoRenta(
			JComboBox jComboBoxTiposAccionesFormularioProcesoImpuestoRenta) {
		this.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta = jComboBoxTiposAccionesFormularioProcesoImpuestoRenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesoimpuestorentaSessionBean=new ProcesoImpuestoRentaSessionBean();
		
		this.procesoimpuestorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoimpuestorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoImpuestoRentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Impuesto Renta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoImpuestoRentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoImpuestoRenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoImpuestoRenta=new JButtonMe();
				this.jButtonModificarToolBarProcesoImpuestoRenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoImpuestoRenta,this.jTtoolBarDetalleProcesoImpuestoRenta,
							"actualizar","actualizar","Actualizar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoImpuestoRenta,this.jTtoolBarDetalleProcesoImpuestoRenta,
							"eliminar","eliminar","Eliminar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoImpuestoRenta,this.jTtoolBarDetalleProcesoImpuestoRenta,
							"cancelar","cancelar","Cancelar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoImpuestoRenta,this.jTtoolBarDetalleProcesoImpuestoRenta,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoImpuestoRenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoImpuestoRenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoImpuestoRenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoImpuestoRenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoImpuestoRenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoImpuestoRenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoImpuestoRenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoImpuestoRenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoImpuestoRenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoImpuestoRenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoImpuestoRenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoImpuestoRenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoImpuestoRenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoImpuestoRenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoImpuestoRenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoImpuestoRenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoImpuestoRenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoImpuestoRenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoImpuestoRenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoImpuestoRenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoImpuestoRenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoImpuestoRenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoImpuestoRenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoImpuestoRenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoImpuestoRenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoImpuestoRenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoImpuestoRenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoImpuestoRenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoImpuestoRenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoImpuestoRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoImpuestoRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoImpuestoRenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoImpuestoRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoImpuestoRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoImpuestoRenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoImpuestoRenta.add(this.jMenuItemDetalleCerrarProcesoImpuestoRenta);
		
		this.jmenuDetalleAccionesProcesoImpuestoRenta.add(this.jMenuItemActualizarProcesoImpuestoRenta);
		this.jmenuDetalleAccionesProcesoImpuestoRenta.add(this.jMenuItemEliminarProcesoImpuestoRenta);
		this.jmenuDetalleAccionesProcesoImpuestoRenta.add(this.jMenuItemCancelarProcesoImpuestoRenta);		
		
		//this.jmenuDetalleDatosProcesoImpuestoRenta.add(this.jMenuItemDetalleAbrirOrderByProcesoImpuestoRenta);				
		this.jmenuDetalleDatosProcesoImpuestoRenta.add(this.jMenuItemDetalleMostarOcultarProcesoImpuestoRenta);				
				
		//this.jmenuDetalleAccionesProcesoImpuestoRenta.add(this.jMenuItemGuardarCambiosProcesoImpuestoRenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoImpuestoRenta.add(this.jmenuDetalleArchivoProcesoImpuestoRenta);		
		this.jmenuBarDetalleProcesoImpuestoRenta.add(this.jmenuDetalleAccionesProcesoImpuestoRenta);		
		this.jmenuBarDetalleProcesoImpuestoRenta.add(this.jmenuDetalleDatosProcesoImpuestoRenta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoImpuestoRenta);				
	}
	
	
	public void inicializarElementosCamposProcesoImpuestoRenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoImpuestoRenta = new JLabelMe();
		jLabelIdProcesoImpuestoRenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoImpuestoRenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoImpuestoRenta.setToolTipText(ProcesoImpuestoRentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoImpuestoRenta= new GridBagLayout();

		this.jPanelidProcesoImpuestoRenta.setLayout(this.gridaBagLayoutProcesoImpuestoRenta);

		jLabelidProcesoImpuestoRenta = new JLabel();
		jLabelidProcesoImpuestoRenta.setText("Id");

		jLabelidProcesoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysProcesoImpuestoRenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_anioProcesoImpuestoRenta = new JLabelMe();
		this.jLabelid_anioProcesoImpuestoRenta.setText(""+ProcesoImpuestoRentaConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioProcesoImpuestoRenta.setToolTipText("Anio");
		this.jLabelid_anioProcesoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProcesoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProcesoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioProcesoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioProcesoImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioProcesoImpuestoRenta.setToolTipText(ProcesoImpuestoRentaConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutProcesoImpuestoRenta = new GridBagLayout();
		this.jPanelid_anioProcesoImpuestoRenta.setLayout(this.gridaBagLayoutProcesoImpuestoRenta);


		jComboBoxid_anioProcesoImpuestoRenta= new JComboBoxMe();
		jComboBoxid_anioProcesoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProcesoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProcesoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioProcesoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioProcesoImpuestoRenta= new JButtonMe();
		this.jButtonid_anioProcesoImpuestoRenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoImpuestoRenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoImpuestoRenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProcesoImpuestoRenta.setText("Procesar");
		this.jButtonid_anioProcesoImpuestoRenta.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioProcesoImpuestoRenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoImpuestoRenta,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioProcesoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoImpuestoRenta"));

		this.jButtonid_anioProcesoImpuestoRentaBusqueda= new JButtonMe();
		this.jButtonid_anioProcesoImpuestoRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoImpuestoRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoImpuestoRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProcesoImpuestoRentaBusqueda.setText("U");
		this.jButtonid_anioProcesoImpuestoRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioProcesoImpuestoRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoImpuestoRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioProcesoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoImpuestoRentaBusqueda"));

		if(this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioProcesoImpuestoRentaBusqueda.setVisible(false);		}

		this.jButtonid_anioProcesoImpuestoRentaUpdate= new JButtonMe();
		this.jButtonid_anioProcesoImpuestoRentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoImpuestoRentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProcesoImpuestoRentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProcesoImpuestoRentaUpdate.setText("U");
		this.jButtonid_anioProcesoImpuestoRentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioProcesoImpuestoRentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProcesoImpuestoRentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioProcesoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProcesoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProcesoImpuestoRentaUpdate"));



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
		//this.jInternalFrameDetalleProcesoImpuestoRenta = new ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Impuesto Renta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoImpuestoRenta= new GridBagLayout();
		

		
		String sToolTipProcesoImpuestoRenta="";
		sToolTipProcesoImpuestoRenta=ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoImpuestoRenta+="(Nomina.ProcesoImpuestoRenta)";
		}
		
		if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoImpuestoRenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoImpuestoRenta = new JButtonMe();
		this.jButtonModificarProcesoImpuestoRenta = new JButtonMe();
        this.jButtonActualizarProcesoImpuestoRenta = new JButtonMe();
        this.jButtonEliminarProcesoImpuestoRenta = new JButtonMe();
        this.jButtonCancelarProcesoImpuestoRenta = new JButtonMe();
        this.jButtonGuardarCambiosProcesoImpuestoRenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoImpuestoRenta = new JButtonMe();
		this.jButtonCerrarProcesoImpuestoRenta = new JButtonMe();
		
		this.jScrollPanelDatosProcesoImpuestoRenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoImpuestoRenta = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoImpuestoRenta = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Impuesto Renta";
		
		if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Impuesto Rentas" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoImpuestoRenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoImpuestoRenta.setName("jPanelCamposProcesoImpuestoRenta"); 

		this.jPanelCamposOcultosProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoImpuestoRenta.setName("jPanelCamposOcultosProcesoImpuestoRenta"); 

        this.jPanelAccionesProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoImpuestoRenta.setToolTipText("Acciones");
        this.jPanelAccionesProcesoImpuestoRenta.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoImpuestoRenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoImpuestoRenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoImpuestoRenta.setText("Nuevo");
		this.jButtonModificarProcesoImpuestoRenta.setText("Editar");
        this.jButtonActualizarProcesoImpuestoRenta.setText("Actualizar");
        this.jButtonEliminarProcesoImpuestoRenta.setText("Eliminar");
        this.jButtonCancelarProcesoImpuestoRenta.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoImpuestoRenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoImpuestoRenta.setText("Guardar");
		this.jButtonCerrarProcesoImpuestoRenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoImpuestoRenta,"nuevo_button","Nuevo",this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoImpuestoRenta,"modificar_button","Editar",this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoImpuestoRenta,"actualizar_button","Actualizar",this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoImpuestoRenta,"eliminar_button","Eliminar",this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoImpuestoRenta,"cancelar_button","Cancelar",this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoImpuestoRenta,"guardarcambios_button","Guardar",this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoImpuestoRenta,"guardarcambiostabla_button","Guardar",this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoImpuestoRenta,"cerrar_button","Salir",this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoImpuestoRenta.setToolTipText("Nuevo"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoImpuestoRenta.setToolTipText("Editar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoImpuestoRenta.setToolTipText("Actualizar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoImpuestoRenta.setToolTipText("Eliminar)"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoImpuestoRenta.setToolTipText("Cancelar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoImpuestoRenta.setToolTipText("Guardar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoImpuestoRenta.setToolTipText("Guardar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoImpuestoRenta.setToolTipText("Salir"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoImpuestoRenta";
		inputMap = this.jButtonNuevoProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoImpuestoRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoImpuestoRenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoImpuestoRenta";
		inputMap = this.jButtonActualizarProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoImpuestoRenta"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoImpuestoRenta";
		inputMap = this.jButtonEliminarProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoImpuestoRenta"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoImpuestoRenta";
		inputMap = this.jButtonCancelarProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoImpuestoRenta"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoImpuestoRenta";
		inputMap = this.jButtonCerrarProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoImpuestoRenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoImpuestoRenta";
		inputMap = this.jButtonGuardarCambiosTablaProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoImpuestoRenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoImpuestoRenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoImpuestoRenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoImpuestoRenta.setToolTipText("Nuevo ProcesoImpuestoRenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoImpuestoRenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoImpuestoRenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoImpuestoRenta.setToolTipText("Sin Cerrar Ventana ProcesoImpuestoRenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoImpuestoRenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoImpuestoRenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoImpuestoRenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoImpuestoRenta.setText("Accion");
		this.jComboBoxTiposAccionesProcesoImpuestoRenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoImpuestoRenta = new JLabelMe();
		
		this.jLabelAccionesProcesoImpuestoRenta.setText("Acciones");		
		this.jLabelAccionesProcesoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoImpuestoRenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoImpuestoRenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoImpuestoRenta=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoImpuestoRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoImpuestoRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoImpuestoRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoImpuestoRenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoImpuestoRenta = new GridBagLayout();
		
		this.jPanelCamposProcesoImpuestoRenta.setLayout(gridaBagLayoutCamposProcesoImpuestoRenta);
		this.jPanelCamposOcultosProcesoImpuestoRenta.setLayout(gridaBagLayoutCamposOcultosProcesoImpuestoRenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
	this.gridBagConstraintsProcesoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsProcesoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoImpuestoRenta.add(jLabelIdProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);



	this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsProcesoImpuestoRenta.gridx = 1;
	this.gridBagConstraintsProcesoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsProcesoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoImpuestoRenta.add(jLabelidProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);


	this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
	this.gridBagConstraintsProcesoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsProcesoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioProcesoImpuestoRenta.add(jLabelid_anioProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = 2;
		this.gridBagConstraintsProcesoImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsProcesoImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProcesoImpuestoRenta.add(jButtonid_anioProcesoImpuestoRentaBusqueda, this.gridBagConstraintsProcesoImpuestoRenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = 3;
		this.gridBagConstraintsProcesoImpuestoRenta.ipadx = 0;
		this.gridBagConstraintsProcesoImpuestoRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProcesoImpuestoRenta.add(jButtonid_anioProcesoImpuestoRentaUpdate, this.gridBagConstraintsProcesoImpuestoRenta);
	}

	this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoImpuestoRenta.gridy = 0;
	this.gridBagConstraintsProcesoImpuestoRenta.gridx = 1;
	this.gridBagConstraintsProcesoImpuestoRenta.ipadx = 0;
	this.gridBagConstraintsProcesoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioProcesoImpuestoRenta.add(jComboBoxid_anioProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoImpuestoRenta.gridy = iYPanelCamposProcesoImpuestoRenta;
	this.gridBagConstraintsProcesoImpuestoRenta.gridx = iXPanelCamposProcesoImpuestoRenta++;
	this.gridBagConstraintsProcesoImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoImpuestoRenta.add(this.jPanelidProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);



	if(iXPanelCamposProcesoImpuestoRenta % 1==0) {
		iXPanelCamposProcesoImpuestoRenta=0;
		iYPanelCamposProcesoImpuestoRenta++;
	}
	this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
	this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoImpuestoRenta.gridy = iYPanelCamposProcesoImpuestoRenta;
	this.gridBagConstraintsProcesoImpuestoRenta.gridx = iXPanelCamposProcesoImpuestoRenta++;
	this.gridBagConstraintsProcesoImpuestoRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoImpuestoRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoImpuestoRenta.add(this.jPanelid_anioProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);



	if(iXPanelCamposProcesoImpuestoRenta % 1==0) {
		iXPanelCamposProcesoImpuestoRenta=0;
		iYPanelCamposProcesoImpuestoRenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoImpuestoRenta= new GridBagLayout();
		this.jPanelAccionesProcesoImpuestoRenta.setLayout(gridaBagLayoutAccionesProcesoImpuestoRenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoImpuestoRenta= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoImpuestoRenta.setLayout(gridaBagLayoutAccionesFormularioProcesoImpuestoRenta);
		
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoImpuestoRenta.add(this.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoImpuestoRenta.add(this.jButtonModificarProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);							

		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoImpuestoRenta.add(this.jButtonEliminarProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		
			
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = 0;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoImpuestoRenta.add(this.jButtonActualizarProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);


		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = 0;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoImpuestoRenta.add(this.jButtonGuardarCambiosProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);	
		
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = 0;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoImpuestoRenta.add(this.jButtonCancelarProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoImpuestoRenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoImpuestoRenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();						
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;		
			//this.gridBagConstraintsProcesoImpuestoRenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoImpuestoRenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx =0;
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoImpuestoRenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoImpuestoRenta = new ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Impuesto Renta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Impuesto Renta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Impuesto Renta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoImpuestoRentaModel procesoimpuestorentaModel=new ProcesoImpuestoRentaModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoImpuestoRentaModel.ProcesoImpuestoRentaFocusTraversalPolicy procesoimpuestorentaFocusTraversalPolicy = procesoimpuestorentaModel.new ProcesoImpuestoRentaFocusTraversalPolicy(this);
			
			//procesoimpuestorentaFocusTraversalPolicy.setprocesoimpuestorentaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesoimpuestorentaModel);
			
			
			this.jContentPaneDetalleProcesoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoImpuestoRenta = new GridBagLayout();	
			this.jContentPaneDetalleProcesoImpuestoRenta.setLayout(gridaBagLayoutDetalleProcesoImpuestoRenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoImpuestoRenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
				this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoImpuestoRenta.add(jTtoolBarDetalleProcesoImpuestoRenta, gridBagConstraintsProcesoImpuestoRenta);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoImpuestoRenta=   new JScrollPane(jContentPaneDetalleProcesoImpuestoRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoImpuestoRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoImpuestoRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoImpuestoRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoImpuestoRenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoImpuestoRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoImpuestoRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoImpuestoRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
	        
			this.jContentPaneDetalleProcesoImpuestoRenta.add(jPanelCamposProcesoImpuestoRenta, gridBagConstraintsProcesoImpuestoRenta);
			
			
			
			
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
						//&& procesoimpuestorentaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesoimpuestorentaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoImpuestoRenta= new GridBagConstraints();
						this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
						this.jContentPaneDetalleProcesoImpuestoRenta.add(this.jTabbedPaneRelacionesProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoImpuestoRenta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoImpuestoRenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
					this.gridBagConstraintsProcesoImpuestoRenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoImpuestoRenta.add(jPanelCamposOcultosProcesoImpuestoRenta, gridBagConstraintsProcesoImpuestoRenta);
				
					this.jPanelCamposOcultosProcesoImpuestoRenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
	        this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoImpuestoRenta.add(this.jPanelAccionesFormularioProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);							
			
			
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
	        this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoImpuestoRenta.add(this.jPanelAccionesProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoImpuestoRenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoImpuestoRenta=   new JScrollPane(this.jPanelCamposProcesoImpuestoRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoImpuestoRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoImpuestoRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoImpuestoRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoImpuestoRenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);			
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
			
			
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		
			
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoImpuestoRenta.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoImpuestoRenta.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoImpuestoRenta.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoImpuestoRenta.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoImpuestoRenta.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoImpuestoRenta;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoImpuestoRenta;
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
