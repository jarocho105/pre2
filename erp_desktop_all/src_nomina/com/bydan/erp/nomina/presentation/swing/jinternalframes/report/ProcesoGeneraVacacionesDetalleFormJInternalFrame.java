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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;



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
import com.bydan.erp.nomina.util.report.ProcesoGeneraVacacionesConstantesFunciones;

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
public class ProcesoGeneraVacacionesDetalleFormJInternalFrame extends ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoGeneraVacaciones;
	
	protected JMenuBar jmenuBarDetalleProcesoGeneraVacaciones;
	
	protected JMenu jmenuDetalleProcesoGeneraVacaciones;
	protected JMenu jmenuDetalleArchivoProcesoGeneraVacaciones;
	protected JMenu jmenuDetalleAccionesProcesoGeneraVacaciones;
	protected JMenu jmenuDetalleDatosProcesoGeneraVacaciones;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoGeneraVacaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoGeneraVacaciones;	
	protected GridBagConstraints gridBagConstraintsProcesoGeneraVacaciones;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoGeneraVacaciones;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ProcesoGeneraVacacionesSessionBean procesogeneravacacionesSessionBean;
	
	
	
		
	
	public ProcesoGeneraVacacionesLogic procesogeneravacacionesLogic;
	
	public JScrollPane jScrollPanelDatosProcesoGeneraVacaciones;
	public JScrollPane jScrollPanelDatosEdicionProcesoGeneraVacaciones;
	public JScrollPane jScrollPanelDatosGeneralProcesoGeneraVacaciones;
	
	protected JPanel jPanelCamposProcesoGeneraVacaciones;    
	protected JPanel jPanelCamposOcultosProcesoGeneraVacaciones;    	
	protected JPanel jPanelAccionesProcesoGeneraVacaciones;
	protected JPanel jPanelAccionesFormularioProcesoGeneraVacaciones;
    
	
	
	protected Integer iXPanelCamposProcesoGeneraVacaciones=0;
	protected Integer iYPanelCamposProcesoGeneraVacaciones=0;
	
	protected Integer iXPanelCamposOcultosProcesoGeneraVacaciones=0;
	protected Integer iYPanelCamposOcultosProcesoGeneraVacaciones=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoGeneraVacaciones;
	public JButton jButtonModificarProcesoGeneraVacaciones;
	public JButton jButtonActualizarProcesoGeneraVacaciones;
    public JButton jButtonEliminarProcesoGeneraVacaciones;
	public JButton jButtonCancelarProcesoGeneraVacaciones;
    public JButton jButtonGuardarCambiosProcesoGeneraVacaciones;
	public JButton jButtonGuardarCambiosTablaProcesoGeneraVacaciones;
	protected JButton jButtonCerrarProcesoGeneraVacaciones;
	
	
	protected JButton jButtonProcesarInformacionProcesoGeneraVacaciones;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoGeneraVacaciones;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoGeneraVacaciones;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoGeneraVacaciones;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoGeneraVacaciones;
	protected JButton jButtonModificarToolBarProcesoGeneraVacaciones;
	protected JButton jButtonActualizarToolBarProcesoGeneraVacaciones;
    protected JButton jButtonEliminarToolBarProcesoGeneraVacaciones;
	protected JButton jButtonCancelarToolBarProcesoGeneraVacaciones;
    protected JButton jButtonGuardarCambiosToolBarProcesoGeneraVacaciones;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoGeneraVacaciones;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoGeneraVacaciones;
	protected JButton jButtonCerrarToolBarProcesoGeneraVacaciones;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoGeneraVacaciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemModificarProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemActualizarProcesoGeneraVacaciones;
    protected JMenuItem jMenuItemEliminarProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemCancelarProcesoGeneraVacaciones;
    protected JMenuItem jMenuItemGuardarCambiosProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemCerrarProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemDetalleCerrarProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoGeneraVacaciones;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoGeneraVacaciones;
	protected JMenuItem jMenuItemMostrarOcultarProcesoGeneraVacaciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoGeneraVacaciones;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoGeneraVacaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoGeneraVacaciones;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoGeneraVacaciones;
	public JLabel jLabelIdProcesoGeneraVacaciones;
	public JLabel jLabelidProcesoGeneraVacaciones;
	public JButton jButtonidProcesoGeneraVacacionesBusqueda= new JButtonMe();

	public JPanel jPanelfechaProcesoGeneraVacaciones;
	public JLabel jLabelfechaProcesoGeneraVacaciones;
	//public JFormattedTextField jDateChooserfechaProcesoGeneraVacaciones;

	public JDateChooser jDateChooserfechaProcesoGeneraVacaciones;
	public JButton jButtonfechaProcesoGeneraVacacionesBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoGeneraVacaciones;
	
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
	
	public ProcesoGeneraVacacionesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoGeneraVacaciones=new JPanel();
				this.jPanelAccionesFormularioProcesoGeneraVacaciones=new JPanel();
				this.jmenuBarDetalleProcesoGeneraVacaciones=new JMenuBar();
				this.jTtoolBarDetalleProcesoGeneraVacaciones=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGeneraVacacionesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoGeneraVacaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoGeneraVacacionesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoGeneraVacaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGeneraVacacionesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoGeneraVacaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGeneraVacacionesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoGeneraVacaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGeneraVacacionesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoGeneraVacaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoGeneraVacaciones() {
		return this.jButtonActualizarToolBarProcesoGeneraVacaciones;
	}
	
	public JButton getjButtonEliminarToolBarProcesoGeneraVacaciones() {
		return this.jButtonEliminarToolBarProcesoGeneraVacaciones;
	}
	
	public JButton getjButtonCancelarToolBarProcesoGeneraVacaciones() {
		return this.jButtonCancelarToolBarProcesoGeneraVacaciones;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoGeneraVacaciones() {
		return this.jButtonProcesarInformacionProcesoGeneraVacaciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoGeneraVacaciones)	{
		this.jButtonProcesarInformacionProcesoGeneraVacaciones = jButtonProcesarInformacionProcesoGeneraVacaciones;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoGeneraVacaciones() {
		return this.jComboBoxTiposAccionesProcesoGeneraVacaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoGeneraVacaciones(
			JComboBox jComboBoxTiposRelacionesProcesoGeneraVacaciones) {
		this.jComboBoxTiposRelacionesProcesoGeneraVacaciones = jComboBoxTiposRelacionesProcesoGeneraVacaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoGeneraVacaciones(
			JComboBox jComboBoxTiposAccionesProcesoGeneraVacaciones) {
		this.jComboBoxTiposAccionesProcesoGeneraVacaciones = jComboBoxTiposAccionesProcesoGeneraVacaciones;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoGeneraVacaciones() {
		return this.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoGeneraVacaciones(
			JComboBox jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones) {
		this.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones = jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesogeneravacacionesSessionBean=new ProcesoGeneraVacacionesSessionBean();
		
		this.procesogeneravacacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesogeneravacacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoGeneraVacacionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoGeneraVacacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoGeneraVacacionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Genera Vacaciones MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoGeneraVacacionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoGeneraVacaciones= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoGeneraVacaciones=new JButtonMe();
				this.jButtonModificarToolBarProcesoGeneraVacaciones=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoGeneraVacaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoGeneraVacaciones,this.jTtoolBarDetalleProcesoGeneraVacaciones,
							"actualizar","actualizar","Actualizar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoGeneraVacaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoGeneraVacaciones,this.jTtoolBarDetalleProcesoGeneraVacaciones,
							"eliminar","eliminar","Eliminar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoGeneraVacaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoGeneraVacaciones,this.jTtoolBarDetalleProcesoGeneraVacaciones,
							"cancelar","cancelar","Cancelar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoGeneraVacaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoGeneraVacaciones,this.jTtoolBarDetalleProcesoGeneraVacaciones,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoGeneraVacaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoGeneraVacaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoGeneraVacaciones,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoGeneraVacaciones=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoGeneraVacaciones=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoGeneraVacaciones=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoGeneraVacaciones=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoGeneraVacaciones=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoGeneraVacaciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoGeneraVacaciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoGeneraVacaciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoGeneraVacaciones= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoGeneraVacaciones.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoGeneraVacaciones,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoGeneraVacaciones= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoGeneraVacaciones.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoGeneraVacaciones,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoGeneraVacaciones= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoGeneraVacaciones.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoGeneraVacaciones,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoGeneraVacaciones= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoGeneraVacaciones.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoGeneraVacaciones,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoGeneraVacaciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoGeneraVacaciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoGeneraVacaciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoGeneraVacaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoGeneraVacaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoGeneraVacaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoGeneraVacaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoGeneraVacaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoGeneraVacaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoGeneraVacaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoGeneraVacaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoGeneraVacaciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoGeneraVacaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoGeneraVacaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoGeneraVacaciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoGeneraVacaciones.add(this.jMenuItemDetalleCerrarProcesoGeneraVacaciones);
		
		this.jmenuDetalleAccionesProcesoGeneraVacaciones.add(this.jMenuItemActualizarProcesoGeneraVacaciones);
		this.jmenuDetalleAccionesProcesoGeneraVacaciones.add(this.jMenuItemEliminarProcesoGeneraVacaciones);
		this.jmenuDetalleAccionesProcesoGeneraVacaciones.add(this.jMenuItemCancelarProcesoGeneraVacaciones);		
		
		//this.jmenuDetalleDatosProcesoGeneraVacaciones.add(this.jMenuItemDetalleAbrirOrderByProcesoGeneraVacaciones);				
		this.jmenuDetalleDatosProcesoGeneraVacaciones.add(this.jMenuItemDetalleMostarOcultarProcesoGeneraVacaciones);				
				
		//this.jmenuDetalleAccionesProcesoGeneraVacaciones.add(this.jMenuItemGuardarCambiosProcesoGeneraVacaciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoGeneraVacaciones.add(this.jmenuDetalleArchivoProcesoGeneraVacaciones);		
		this.jmenuBarDetalleProcesoGeneraVacaciones.add(this.jmenuDetalleAccionesProcesoGeneraVacaciones);		
		this.jmenuBarDetalleProcesoGeneraVacaciones.add(this.jmenuDetalleDatosProcesoGeneraVacaciones);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoGeneraVacaciones);				
	}
	
	
	public void inicializarElementosCamposProcesoGeneraVacaciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoGeneraVacaciones = new JLabelMe();
		jLabelIdProcesoGeneraVacaciones.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoGeneraVacaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoGeneraVacaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoGeneraVacaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoGeneraVacaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoGeneraVacaciones = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoGeneraVacaciones.setToolTipText(ProcesoGeneraVacacionesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoGeneraVacaciones= new GridBagLayout();

		this.jPanelidProcesoGeneraVacaciones.setLayout(this.gridaBagLayoutProcesoGeneraVacaciones);

		jLabelidProcesoGeneraVacaciones = new JLabel();
		jLabelidProcesoGeneraVacaciones.setText("Id");

		jLabelidProcesoGeneraVacaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoGeneraVacaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoGeneraVacaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaProcesoGeneraVacaciones = new JLabelMe();
		this.jLabelfechaProcesoGeneraVacaciones.setText(""+ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaProcesoGeneraVacaciones.setToolTipText("Fecha");
		this.jLabelfechaProcesoGeneraVacaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProcesoGeneraVacaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProcesoGeneraVacaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaProcesoGeneraVacaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaProcesoGeneraVacaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaProcesoGeneraVacaciones.setToolTipText(ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutProcesoGeneraVacaciones = new GridBagLayout();
		this.jPanelfechaProcesoGeneraVacaciones.setLayout(this.gridaBagLayoutProcesoGeneraVacaciones);


		//jFormattedTextFieldfechaProcesoGeneraVacaciones= new JFormattedTextFieldMe();

		jDateChooserfechaProcesoGeneraVacaciones= new JDateChooser();
		jDateChooserfechaProcesoGeneraVacaciones.setEnabled(false);
		jDateChooserfechaProcesoGeneraVacaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProcesoGeneraVacaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProcesoGeneraVacaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaProcesoGeneraVacaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaProcesoGeneraVacaciones.setDate(new Date());
		jDateChooserfechaProcesoGeneraVacaciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaProcesoGeneraVacaciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaProcesoGeneraVacacionesBusqueda= new JButtonMe();
		this.jButtonfechaProcesoGeneraVacacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProcesoGeneraVacacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProcesoGeneraVacacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaProcesoGeneraVacacionesBusqueda.setText("U");
		this.jButtonfechaProcesoGeneraVacacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaProcesoGeneraVacacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaProcesoGeneraVacacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaProcesoGeneraVacaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaProcesoGeneraVacaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaProcesoGeneraVacacionesBusqueda"));

		if(this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaProcesoGeneraVacacionesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoGeneraVacaciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
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
		//this.jInternalFrameDetalleProcesoGeneraVacaciones = new ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Genera Vacaciones DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoGeneraVacaciones= new GridBagLayout();
		

		
		String sToolTipProcesoGeneraVacaciones="";
		sToolTipProcesoGeneraVacaciones=ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoGeneraVacaciones+="(Nomina.ProcesoGeneraVacaciones)";
		}
		
		if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoGeneraVacaciones+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoGeneraVacaciones = new JButtonMe();
		this.jButtonModificarProcesoGeneraVacaciones = new JButtonMe();
        this.jButtonActualizarProcesoGeneraVacaciones = new JButtonMe();
        this.jButtonEliminarProcesoGeneraVacaciones = new JButtonMe();
        this.jButtonCancelarProcesoGeneraVacaciones = new JButtonMe();
        this.jButtonGuardarCambiosProcesoGeneraVacaciones = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones = new JButtonMe();
		this.jButtonCerrarProcesoGeneraVacaciones = new JButtonMe();
		
		this.jScrollPanelDatosProcesoGeneraVacaciones = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoGeneraVacaciones = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoGeneraVacaciones = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoGeneraVacaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoGeneraVacaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoGeneraVacaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoGeneraVacaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Genera Vacaciones";
		
		if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Genera Vacacioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoGeneraVacaciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoGeneraVacaciones.setName("jPanelCamposProcesoGeneraVacaciones"); 

		this.jPanelCamposOcultosProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoGeneraVacaciones.setName("jPanelCamposOcultosProcesoGeneraVacaciones"); 

        this.jPanelAccionesProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoGeneraVacaciones.setToolTipText("Acciones");
        this.jPanelAccionesProcesoGeneraVacaciones.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoGeneraVacaciones.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoGeneraVacaciones.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoGeneraVacaciones.setText("Nuevo");
		this.jButtonModificarProcesoGeneraVacaciones.setText("Editar");
        this.jButtonActualizarProcesoGeneraVacaciones.setText("Actualizar");
        this.jButtonEliminarProcesoGeneraVacaciones.setText("Eliminar");
        this.jButtonCancelarProcesoGeneraVacaciones.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoGeneraVacaciones.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones.setText("Guardar");
		this.jButtonCerrarProcesoGeneraVacaciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoGeneraVacaciones,"nuevo_button","Nuevo",this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoGeneraVacaciones,"modificar_button","Editar",this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoGeneraVacaciones,"actualizar_button","Actualizar",this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoGeneraVacaciones,"eliminar_button","Eliminar",this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoGeneraVacaciones,"cancelar_button","Cancelar",this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoGeneraVacaciones,"guardarcambios_button","Guardar",this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones,"guardarcambiostabla_button","Guardar",this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoGeneraVacaciones,"cerrar_button","Salir",this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoGeneraVacaciones.setToolTipText("Nuevo"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoGeneraVacaciones.setToolTipText("Editar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoGeneraVacaciones.setToolTipText("Actualizar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoGeneraVacaciones.setToolTipText("Eliminar)"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoGeneraVacaciones.setToolTipText("Cancelar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoGeneraVacaciones.setToolTipText("Guardar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones.setToolTipText("Guardar"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoGeneraVacaciones.setToolTipText("Salir"+" "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoGeneraVacaciones";
		inputMap = this.jButtonNuevoProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoGeneraVacaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoGeneraVacaciones"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoGeneraVacaciones";
		inputMap = this.jButtonActualizarProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoGeneraVacaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoGeneraVacaciones"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoGeneraVacaciones";
		inputMap = this.jButtonEliminarProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoGeneraVacaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoGeneraVacaciones"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoGeneraVacaciones";
		inputMap = this.jButtonCancelarProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoGeneraVacaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoGeneraVacaciones"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoGeneraVacaciones";
		inputMap = this.jButtonCerrarProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoGeneraVacaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoGeneraVacaciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoGeneraVacaciones";
		inputMap = this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoGeneraVacaciones"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoGeneraVacaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoGeneraVacaciones.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoGeneraVacaciones.setToolTipText("Nuevo ProcesoGeneraVacaciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoGeneraVacaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoGeneraVacaciones.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoGeneraVacaciones.setToolTipText("Sin Cerrar Ventana ProcesoGeneraVacaciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoGeneraVacaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoGeneraVacaciones.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoGeneraVacaciones.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoGeneraVacaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setText("Accion");
		this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoGeneraVacaciones = new JLabelMe();
		
		this.jLabelAccionesProcesoGeneraVacaciones.setText("Acciones");		
		this.jLabelAccionesProcesoGeneraVacaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoGeneraVacaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoGeneraVacaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoGeneraVacaciones();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoGeneraVacaciones();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoGeneraVacaciones=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoGeneraVacaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoGeneraVacaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoGeneraVacaciones = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoGeneraVacaciones = new GridBagLayout();
		
		this.jPanelCamposProcesoGeneraVacaciones.setLayout(gridaBagLayoutCamposProcesoGeneraVacaciones);
		this.jPanelCamposOcultosProcesoGeneraVacaciones.setLayout(gridaBagLayoutCamposOcultosProcesoGeneraVacaciones);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 0;
	this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
	this.gridBagConstraintsProcesoGeneraVacaciones.ipadx = 0;
	this.gridBagConstraintsProcesoGeneraVacaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoGeneraVacaciones.add(jLabelIdProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);



	this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 0;
	this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 1;
	this.gridBagConstraintsProcesoGeneraVacaciones.ipadx = 0;
	this.gridBagConstraintsProcesoGeneraVacaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoGeneraVacaciones.add(jLabelidProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);


	this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 0;
	this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
	this.gridBagConstraintsProcesoGeneraVacaciones.ipadx = 0;
	this.gridBagConstraintsProcesoGeneraVacaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaProcesoGeneraVacaciones.add(jLabelfechaProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 0;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 2;
		this.gridBagConstraintsProcesoGeneraVacaciones.ipadx = 0;
		this.gridBagConstraintsProcesoGeneraVacaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaProcesoGeneraVacaciones.add(jButtonfechaProcesoGeneraVacacionesBusqueda, this.gridBagConstraintsProcesoGeneraVacaciones);
	}

	this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 0;
	this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 1;
	this.gridBagConstraintsProcesoGeneraVacaciones.ipadx = 0;
	this.gridBagConstraintsProcesoGeneraVacaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaProcesoGeneraVacaciones.add(jDateChooserfechaProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iYPanelCamposProcesoGeneraVacaciones;
	this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iXPanelCamposProcesoGeneraVacaciones++;
	this.gridBagConstraintsProcesoGeneraVacaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGeneraVacaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGeneraVacaciones.add(this.jPanelidProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);



	if(iXPanelCamposProcesoGeneraVacaciones % 1==0) {
		iXPanelCamposProcesoGeneraVacaciones=0;
		iYPanelCamposProcesoGeneraVacaciones++;
	}
	this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
	this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iYPanelCamposProcesoGeneraVacaciones;
	this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iXPanelCamposProcesoGeneraVacaciones++;
	this.gridBagConstraintsProcesoGeneraVacaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoGeneraVacaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoGeneraVacaciones.add(this.jPanelfechaProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);



	if(iXPanelCamposProcesoGeneraVacaciones % 1==0) {
		iXPanelCamposProcesoGeneraVacaciones=0;
		iYPanelCamposProcesoGeneraVacaciones++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoGeneraVacaciones= new GridBagLayout();
		this.jPanelAccionesProcesoGeneraVacaciones.setLayout(gridaBagLayoutAccionesProcesoGeneraVacaciones);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoGeneraVacaciones= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoGeneraVacaciones.setLayout(gridaBagLayoutAccionesFormularioProcesoGeneraVacaciones);
		
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoGeneraVacaciones.add(this.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 0;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoGeneraVacaciones.add(this.jButtonModificarProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);							

		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 0;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoGeneraVacaciones.add(this.jButtonEliminarProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		
			
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 0;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoGeneraVacaciones.add(this.jButtonActualizarProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);


		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 0;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoGeneraVacaciones.add(this.jButtonGuardarCambiosProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);	
		
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = 0;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoGeneraVacaciones.add(this.jButtonCancelarProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoGeneraVacaciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoGeneraVacaciones);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();						
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;		
			//this.gridBagConstraintsProcesoGeneraVacaciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoGeneraVacaciones.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx =0;
		this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoGeneraVacaciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoGeneraVacacionesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoGeneraVacaciones = new ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Genera Vacaciones DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Genera Vacaciones DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Genera Vacaciones Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoGeneraVacacionesModel procesogeneravacacionesModel=new ProcesoGeneraVacacionesModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoGeneraVacacionesModel.ProcesoGeneraVacacionesFocusTraversalPolicy procesogeneravacacionesFocusTraversalPolicy = procesogeneravacacionesModel.new ProcesoGeneraVacacionesFocusTraversalPolicy(this);
			
			//procesogeneravacacionesFocusTraversalPolicy.setprocesogeneravacacionesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesogeneravacacionesModel);
			
			
			this.jContentPaneDetalleProcesoGeneraVacaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoGeneraVacaciones = new GridBagLayout();	
			this.jContentPaneDetalleProcesoGeneraVacaciones.setLayout(gridaBagLayoutDetalleProcesoGeneraVacaciones);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoGeneraVacaciones = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
				this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoGeneraVacaciones.add(jTtoolBarDetalleProcesoGeneraVacaciones, gridBagConstraintsProcesoGeneraVacaciones);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoGeneraVacaciones=   new JScrollPane(jContentPaneDetalleProcesoGeneraVacaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoGeneraVacaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoGeneraVacaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoGeneraVacaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoGeneraVacaciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoGeneraVacaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoGeneraVacaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoGeneraVacaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
	        
			this.jContentPaneDetalleProcesoGeneraVacaciones.add(jPanelCamposProcesoGeneraVacaciones, gridBagConstraintsProcesoGeneraVacaciones);
			
			
			
			
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
						//&& procesogeneravacacionesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesogeneravacacionesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoGeneraVacaciones= new GridBagConstraints();
						this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
						this.jContentPaneDetalleProcesoGeneraVacaciones.add(this.jTabbedPaneRelacionesProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoGeneraVacaciones.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoGeneraVacaciones.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
					this.gridBagConstraintsProcesoGeneraVacaciones.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoGeneraVacaciones.add(jPanelCamposOcultosProcesoGeneraVacaciones, gridBagConstraintsProcesoGeneraVacaciones);
				
					this.jPanelCamposOcultosProcesoGeneraVacaciones.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
	        this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoGeneraVacaciones.add(this.jPanelAccionesFormularioProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);							
			
			
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
	        this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoGeneraVacaciones.add(this.jPanelAccionesProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoGeneraVacaciones);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoGeneraVacaciones=   new JScrollPane(this.jPanelCamposProcesoGeneraVacaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoGeneraVacaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoGeneraVacaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoGeneraVacaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
			this.gridBagConstraintsProcesoGeneraVacaciones.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoGeneraVacaciones.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoGeneraVacaciones.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);			
			
			this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoGeneraVacaciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
			
			
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		
			
		this.gridBagConstraintsProcesoGeneraVacaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoGeneraVacaciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGeneraVacaciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoGeneraVacaciones, this.gridBagConstraintsProcesoGeneraVacaciones);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoGeneraVacaciones.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoGeneraVacaciones.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoGeneraVacaciones.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoGeneraVacaciones;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoGeneraVacaciones;
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
