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
package com.bydan.erp.sris.presentation.swing.jinternalframes;



import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.sris.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.TipoSalarioNetoConstantesFunciones;

import com.bydan.erp.sris.business.logic.*;
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
public class TipoSalarioNetoDetalleFormJInternalFrame extends TipoSalarioNetoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoSalarioNeto;
	
	protected JMenuBar jmenuBarDetalleTipoSalarioNeto;
	
	protected JMenu jmenuDetalleTipoSalarioNeto;
	protected JMenu jmenuDetalleArchivoTipoSalarioNeto;
	protected JMenu jmenuDetalleAccionesTipoSalarioNeto;
	protected JMenu jmenuDetalleDatosTipoSalarioNeto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoSalarioNeto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoSalarioNeto;	
	protected GridBagConstraints gridBagConstraintsTipoSalarioNeto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoSalarioNetoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoSalarioNeto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoSalarioNetoSessionBean tiposalarionetoSessionBean;
	
	
	
		
	
	public TipoSalarioNetoLogic tiposalarionetoLogic;
	
	public JScrollPane jScrollPanelDatosTipoSalarioNeto;
	public JScrollPane jScrollPanelDatosEdicionTipoSalarioNeto;
	public JScrollPane jScrollPanelDatosGeneralTipoSalarioNeto;
	
	protected JPanel jPanelCamposTipoSalarioNeto;    
	protected JPanel jPanelCamposOcultosTipoSalarioNeto;    	
	protected JPanel jPanelAccionesTipoSalarioNeto;
	protected JPanel jPanelAccionesFormularioTipoSalarioNeto;
    
	
	
	protected Integer iXPanelCamposTipoSalarioNeto=0;
	protected Integer iYPanelCamposTipoSalarioNeto=0;
	
	protected Integer iXPanelCamposOcultosTipoSalarioNeto=0;
	protected Integer iYPanelCamposOcultosTipoSalarioNeto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoSalarioNeto;
	public JButton jButtonModificarTipoSalarioNeto;
	public JButton jButtonActualizarTipoSalarioNeto;
    public JButton jButtonEliminarTipoSalarioNeto;
	public JButton jButtonCancelarTipoSalarioNeto;
    public JButton jButtonGuardarCambiosTipoSalarioNeto;
	public JButton jButtonGuardarCambiosTablaTipoSalarioNeto;
	protected JButton jButtonCerrarTipoSalarioNeto;
	
	
	protected JButton jButtonProcesarInformacionTipoSalarioNeto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoSalarioNeto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoSalarioNeto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoSalarioNeto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoSalarioNeto;
	protected JButton jButtonModificarToolBarTipoSalarioNeto;
	protected JButton jButtonActualizarToolBarTipoSalarioNeto;
    protected JButton jButtonEliminarToolBarTipoSalarioNeto;
	protected JButton jButtonCancelarToolBarTipoSalarioNeto;
    protected JButton jButtonGuardarCambiosToolBarTipoSalarioNeto;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoSalarioNeto;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoSalarioNeto;
	protected JButton jButtonCerrarToolBarTipoSalarioNeto;
	
	protected JButton jButtonProcesarInformacionToolBarTipoSalarioNeto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoSalarioNeto;
	protected JMenuItem jMenuItemModificarTipoSalarioNeto;
	protected JMenuItem jMenuItemActualizarTipoSalarioNeto;
    protected JMenuItem jMenuItemEliminarTipoSalarioNeto;
	protected JMenuItem jMenuItemCancelarTipoSalarioNeto;
    protected JMenuItem jMenuItemGuardarCambiosTipoSalarioNeto;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoSalarioNeto;
	protected JMenuItem jMenuItemCerrarTipoSalarioNeto;
	protected JMenuItem jMenuItemDetalleCerrarTipoSalarioNeto;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoSalarioNeto;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoSalarioNeto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoSalarioNeto;
	protected JMenuItem jMenuItemMostrarOcultarTipoSalarioNeto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoSalarioNeto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoSalarioNeto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoSalarioNeto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoSalarioNeto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoSalarioNeto;
	public JLabel jLabelIdTipoSalarioNeto;
	public JTextFieldMe jTextFieldidTipoSalarioNeto;
	public JButton jButtonidTipoSalarioNetoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoSalarioNeto;
	public JLabel jLabelnombreTipoSalarioNeto;
	public JTextArea jTextAreanombreTipoSalarioNeto;
	public JScrollPane jscrollPanenombreTipoSalarioNeto;
	public JButton jButtonnombreTipoSalarioNetoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoSalarioNeto;
	public JLabel jLabeldescripcionTipoSalarioNeto;
	public JTextArea jTextAreadescripcionTipoSalarioNeto;
	public JScrollPane jscrollPanedescripcionTipoSalarioNeto;
	public JButton jButtondescripcionTipoSalarioNetoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoSalarioNeto;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoSalarioNetoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoSalarioNeto=new JPanel();
				this.jPanelAccionesFormularioTipoSalarioNeto=new JPanel();
				this.jmenuBarDetalleTipoSalarioNeto=new JMenuBar();
				this.jTtoolBarDetalleTipoSalarioNeto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSalarioNetoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoSalarioNeto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoSalarioNetoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoSalarioNeto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSalarioNetoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSalarioNeto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSalarioNetoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSalarioNeto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSalarioNetoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoSalarioNeto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoSalarioNeto() {
		return this.jButtonActualizarToolBarTipoSalarioNeto;
	}
	
	public JButton getjButtonEliminarToolBarTipoSalarioNeto() {
		return this.jButtonEliminarToolBarTipoSalarioNeto;
	}
	
	public JButton getjButtonCancelarToolBarTipoSalarioNeto() {
		return this.jButtonCancelarToolBarTipoSalarioNeto;
	}		
	
	public JButton getjButtonProcesarInformacionTipoSalarioNeto() {
		return this.jButtonProcesarInformacionTipoSalarioNeto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoSalarioNeto)	{
		this.jButtonProcesarInformacionTipoSalarioNeto = jButtonProcesarInformacionTipoSalarioNeto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoSalarioNeto() {
		return this.jComboBoxTiposAccionesTipoSalarioNeto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoSalarioNeto(
			JComboBox jComboBoxTiposRelacionesTipoSalarioNeto) {
		this.jComboBoxTiposRelacionesTipoSalarioNeto = jComboBoxTiposRelacionesTipoSalarioNeto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoSalarioNeto(
			JComboBox jComboBoxTiposAccionesTipoSalarioNeto) {
		this.jComboBoxTiposAccionesTipoSalarioNeto = jComboBoxTiposAccionesTipoSalarioNeto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoSalarioNeto() {
		return this.jComboBoxTiposAccionesFormularioTipoSalarioNeto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoSalarioNeto(
			JComboBox jComboBoxTiposAccionesFormularioTipoSalarioNeto) {
		this.jComboBoxTiposAccionesFormularioTipoSalarioNeto = jComboBoxTiposAccionesFormularioTipoSalarioNeto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiposalarionetoSessionBean=new TipoSalarioNetoSessionBean();
		
		this.tiposalarionetoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposalarionetoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiposalarionetoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoSalarioNetoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoSalarioNetoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoSalarioNetoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Salario Neto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoSalarioNetoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoSalarioNeto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoSalarioNeto=new JButtonMe();
				this.jButtonModificarToolBarTipoSalarioNeto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoSalarioNeto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoSalarioNeto,this.jTtoolBarDetalleTipoSalarioNeto,
							"actualizar","actualizar","Actualizar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoSalarioNeto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoSalarioNeto,this.jTtoolBarDetalleTipoSalarioNeto,
							"eliminar","eliminar","Eliminar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoSalarioNeto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoSalarioNeto,this.jTtoolBarDetalleTipoSalarioNeto,
							"cancelar","cancelar","Cancelar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoSalarioNeto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoSalarioNeto,this.jTtoolBarDetalleTipoSalarioNeto,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoSalarioNeto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoSalarioNeto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoSalarioNeto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoSalarioNeto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoSalarioNeto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoSalarioNeto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoSalarioNeto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoSalarioNeto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoSalarioNeto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoSalarioNeto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoSalarioNeto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoSalarioNeto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoSalarioNeto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoSalarioNeto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoSalarioNeto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoSalarioNeto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoSalarioNeto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoSalarioNeto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoSalarioNeto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoSalarioNeto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoSalarioNeto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoSalarioNeto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoSalarioNeto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoSalarioNeto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoSalarioNeto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoSalarioNeto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoSalarioNeto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoSalarioNeto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoSalarioNeto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoSalarioNeto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoSalarioNeto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoSalarioNeto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoSalarioNeto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoSalarioNeto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoSalarioNeto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoSalarioNeto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoSalarioNeto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoSalarioNeto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoSalarioNeto.add(this.jMenuItemDetalleCerrarTipoSalarioNeto);
		
		this.jmenuDetalleAccionesTipoSalarioNeto.add(this.jMenuItemActualizarTipoSalarioNeto);
		this.jmenuDetalleAccionesTipoSalarioNeto.add(this.jMenuItemEliminarTipoSalarioNeto);
		this.jmenuDetalleAccionesTipoSalarioNeto.add(this.jMenuItemCancelarTipoSalarioNeto);		
		
		//this.jmenuDetalleDatosTipoSalarioNeto.add(this.jMenuItemDetalleAbrirOrderByTipoSalarioNeto);				
		this.jmenuDetalleDatosTipoSalarioNeto.add(this.jMenuItemDetalleMostarOcultarTipoSalarioNeto);				
				
		//this.jmenuDetalleAccionesTipoSalarioNeto.add(this.jMenuItemGuardarCambiosTipoSalarioNeto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoSalarioNeto.add(this.jmenuDetalleArchivoTipoSalarioNeto);		
		this.jmenuBarDetalleTipoSalarioNeto.add(this.jmenuDetalleAccionesTipoSalarioNeto);		
		this.jmenuBarDetalleTipoSalarioNeto.add(this.jmenuDetalleDatosTipoSalarioNeto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoSalarioNeto);				
	}
	
	
	public void inicializarElementosCamposTipoSalarioNeto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoSalarioNeto = new JLabelMe();
		jLabelIdTipoSalarioNeto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoSalarioNeto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoSalarioNeto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoSalarioNeto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoSalarioNeto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoSalarioNeto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoSalarioNeto.setToolTipText(TipoSalarioNetoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoSalarioNeto= new GridBagLayout();

		this.jPanelidTipoSalarioNeto.setLayout(this.gridaBagLayoutTipoSalarioNeto);

		jTextFieldidTipoSalarioNeto = new JTextFieldMe();
		jTextFieldidTipoSalarioNeto.setText("Id");

		jTextFieldidTipoSalarioNeto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoSalarioNeto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoSalarioNeto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoSalarioNeto = new JLabelMe();
		this.jLabelnombreTipoSalarioNeto.setText(""+TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoSalarioNeto.setToolTipText("Nombre");
		this.jLabelnombreTipoSalarioNeto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoSalarioNeto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoSalarioNeto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoSalarioNeto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoSalarioNeto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoSalarioNeto.setToolTipText(TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoSalarioNeto = new GridBagLayout();
		this.jPanelnombreTipoSalarioNeto.setLayout(this.gridaBagLayoutTipoSalarioNeto);


		jTextAreanombreTipoSalarioNeto= new JTextAreaMe();
		jTextAreanombreTipoSalarioNeto.setEnabled(false);
		jTextAreanombreTipoSalarioNeto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoSalarioNeto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoSalarioNeto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoSalarioNeto.setLineWrap(true);
		jTextAreanombreTipoSalarioNeto.setWrapStyleWord(true);
		jTextAreanombreTipoSalarioNeto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoSalarioNeto.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoSalarioNeto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoSalarioNeto = new JScrollPane(jTextAreanombreTipoSalarioNeto);
		jscrollPanenombreTipoSalarioNeto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoSalarioNeto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoSalarioNeto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoSalarioNetoBusqueda= new JButtonMe();
		this.jButtonnombreTipoSalarioNetoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoSalarioNetoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoSalarioNetoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoSalarioNetoBusqueda.setText("U");
		this.jButtonnombreTipoSalarioNetoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoSalarioNetoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoSalarioNetoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoSalarioNeto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoSalarioNeto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoSalarioNetoBusqueda"));

		if(this.tiposalarionetoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoSalarioNetoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoSalarioNeto = new JLabelMe();
		this.jLabeldescripcionTipoSalarioNeto.setText(""+TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionTipoSalarioNeto.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoSalarioNeto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoSalarioNeto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoSalarioNeto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoSalarioNeto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoSalarioNeto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoSalarioNeto.setToolTipText(TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoSalarioNeto = new GridBagLayout();
		this.jPaneldescripcionTipoSalarioNeto.setLayout(this.gridaBagLayoutTipoSalarioNeto);


		jTextAreadescripcionTipoSalarioNeto= new JTextAreaMe();
		jTextAreadescripcionTipoSalarioNeto.setEnabled(false);
		jTextAreadescripcionTipoSalarioNeto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoSalarioNeto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoSalarioNeto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoSalarioNeto.setLineWrap(true);
		jTextAreadescripcionTipoSalarioNeto.setWrapStyleWord(true);
		jTextAreadescripcionTipoSalarioNeto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoSalarioNeto.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoSalarioNeto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoSalarioNeto = new JScrollPane(jTextAreadescripcionTipoSalarioNeto);
		jscrollPanedescripcionTipoSalarioNeto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionTipoSalarioNeto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionTipoSalarioNeto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionTipoSalarioNetoBusqueda= new JButtonMe();
		this.jButtondescripcionTipoSalarioNetoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoSalarioNetoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoSalarioNetoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoSalarioNetoBusqueda.setText("U");
		this.jButtondescripcionTipoSalarioNetoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoSalarioNetoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoSalarioNetoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoSalarioNeto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoSalarioNeto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoSalarioNetoBusqueda"));

		if(this.tiposalarionetoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoSalarioNetoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoSalarioNeto() {
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
		//this.jInternalFrameDetalleTipoSalarioNeto = new TipoSalarioNetoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Salario Neto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoSalarioNeto= new GridBagLayout();
		

		
		String sToolTipTipoSalarioNeto="";
		sToolTipTipoSalarioNeto=TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoSalarioNeto+="(Sris.TipoSalarioNeto)";
		}
		
		if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoSalarioNeto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoSalarioNeto = new JButtonMe();
		this.jButtonModificarTipoSalarioNeto = new JButtonMe();
        this.jButtonActualizarTipoSalarioNeto = new JButtonMe();
        this.jButtonEliminarTipoSalarioNeto = new JButtonMe();
        this.jButtonCancelarTipoSalarioNeto = new JButtonMe();
        this.jButtonGuardarCambiosTipoSalarioNeto = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoSalarioNeto = new JButtonMe();
		this.jButtonCerrarTipoSalarioNeto = new JButtonMe();
		
		this.jScrollPanelDatosTipoSalarioNeto = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoSalarioNeto = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoSalarioNeto = new JScrollPane();
				
		
		
		this.jPanelCamposTipoSalarioNeto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoSalarioNeto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoSalarioNeto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoSalarioNeto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Salario Neto";
		
		if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Salario Netos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoSalarioNeto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoSalarioNeto.setName("jPanelCamposTipoSalarioNeto"); 

		this.jPanelCamposOcultosTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoSalarioNeto.setName("jPanelCamposOcultosTipoSalarioNeto"); 

        this.jPanelAccionesTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoSalarioNeto.setToolTipText("Acciones");
        this.jPanelAccionesTipoSalarioNeto.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoSalarioNeto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoSalarioNeto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoSalarioNeto.setText("Nuevo");
		this.jButtonModificarTipoSalarioNeto.setText("Editar");
        this.jButtonActualizarTipoSalarioNeto.setText("Actualizar");
        this.jButtonEliminarTipoSalarioNeto.setText("Eliminar");
        this.jButtonCancelarTipoSalarioNeto.setText("Cancelar");
        this.jButtonGuardarCambiosTipoSalarioNeto.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoSalarioNeto.setText("Guardar");
		this.jButtonCerrarTipoSalarioNeto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoSalarioNeto,"nuevo_button","Nuevo",this.tiposalarionetoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoSalarioNeto,"modificar_button","Editar",this.tiposalarionetoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoSalarioNeto,"actualizar_button","Actualizar",this.tiposalarionetoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoSalarioNeto,"eliminar_button","Eliminar",this.tiposalarionetoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoSalarioNeto,"cancelar_button","Cancelar",this.tiposalarionetoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoSalarioNeto,"guardarcambios_button","Guardar",this.tiposalarionetoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoSalarioNeto,"guardarcambiostabla_button","Guardar",this.tiposalarionetoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoSalarioNeto,"cerrar_button","Salir",this.tiposalarionetoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoSalarioNeto.setToolTipText("Nuevo"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoSalarioNeto.setToolTipText("Editar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoSalarioNeto.setToolTipText("Actualizar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoSalarioNeto.setToolTipText("Eliminar)"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoSalarioNeto.setToolTipText("Cancelar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoSalarioNeto.setToolTipText("Guardar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoSalarioNeto.setToolTipText("Guardar"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoSalarioNeto.setToolTipText("Salir"+" "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoSalarioNeto";
		inputMap = this.jButtonNuevoTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoSalarioNeto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoSalarioNeto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoSalarioNeto";
		inputMap = this.jButtonActualizarTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoSalarioNeto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoSalarioNeto"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoSalarioNeto";
		inputMap = this.jButtonEliminarTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoSalarioNeto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoSalarioNeto"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoSalarioNeto";
		inputMap = this.jButtonCancelarTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoSalarioNeto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoSalarioNeto"));
		
		//CERRAR		
		sMapKey = "CerrarTipoSalarioNeto";
		inputMap = this.jButtonCerrarTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoSalarioNeto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoSalarioNeto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoSalarioNeto";
		inputMap = this.jButtonGuardarCambiosTablaTipoSalarioNeto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoSalarioNeto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoSalarioNeto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoSalarioNeto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoSalarioNeto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoSalarioNeto.setToolTipText("Nuevo TipoSalarioNeto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoSalarioNeto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoSalarioNeto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoSalarioNeto.setToolTipText("Sin Cerrar Ventana TipoSalarioNeto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoSalarioNeto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoSalarioNeto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoSalarioNeto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoSalarioNeto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoSalarioNeto.setText("Accion");
		this.jComboBoxTiposAccionesTipoSalarioNeto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoSalarioNeto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoSalarioNeto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoSalarioNeto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoSalarioNeto = new JLabelMe();
		
		this.jLabelAccionesTipoSalarioNeto.setText("Acciones");		
		this.jLabelAccionesTipoSalarioNeto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSalarioNeto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSalarioNeto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoSalarioNeto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoSalarioNeto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoSalarioNeto=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoSalarioNeto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoSalarioNeto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSalarioNeto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSalarioNeto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoSalarioNeto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoSalarioNeto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoSalarioNeto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoSalarioNeto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoSalarioNeto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoSalarioNeto = new GridBagLayout();
		
		this.jPanelCamposTipoSalarioNeto.setLayout(gridaBagLayoutCamposTipoSalarioNeto);
		this.jPanelCamposOcultosTipoSalarioNeto.setLayout(gridaBagLayoutCamposOcultosTipoSalarioNeto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
	this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSalarioNeto.gridy = 0;
	this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
	this.gridBagConstraintsTipoSalarioNeto.ipadx = 0;
	this.gridBagConstraintsTipoSalarioNeto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoSalarioNeto.add(jLabelIdTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);



	this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
	this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSalarioNeto.gridy = 0;
	this.gridBagConstraintsTipoSalarioNeto.gridx = 1;
	this.gridBagConstraintsTipoSalarioNeto.ipadx = 0;
	this.gridBagConstraintsTipoSalarioNeto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoSalarioNeto.add(jTextFieldidTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);


	this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
	this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSalarioNeto.gridy = 0;
	this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
	this.gridBagConstraintsTipoSalarioNeto.ipadx = 0;
	this.gridBagConstraintsTipoSalarioNeto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoSalarioNeto.add(jLabelnombreTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		//this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = 0;
		this.gridBagConstraintsTipoSalarioNeto.gridx = 2;
		this.gridBagConstraintsTipoSalarioNeto.ipadx = 0;
		this.gridBagConstraintsTipoSalarioNeto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoSalarioNeto.add(jButtonnombreTipoSalarioNetoBusqueda, this.gridBagConstraintsTipoSalarioNeto);
	}

	this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
	this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSalarioNeto.gridy = 0;
	this.gridBagConstraintsTipoSalarioNeto.gridx = 1;
	this.gridBagConstraintsTipoSalarioNeto.ipadx = 0;
	this.gridBagConstraintsTipoSalarioNeto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoSalarioNeto.add(jscrollPanenombreTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);


	this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
	this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSalarioNeto.gridy = 0;
	this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
	this.gridBagConstraintsTipoSalarioNeto.ipadx = 0;
	this.gridBagConstraintsTipoSalarioNeto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoSalarioNeto.add(jLabeldescripcionTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		//this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = 0;
		this.gridBagConstraintsTipoSalarioNeto.gridx = 2;
		this.gridBagConstraintsTipoSalarioNeto.ipadx = 0;
		this.gridBagConstraintsTipoSalarioNeto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoSalarioNeto.add(jButtondescripcionTipoSalarioNetoBusqueda, this.gridBagConstraintsTipoSalarioNeto);
	}

	this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
	this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSalarioNeto.gridy = 0;
	this.gridBagConstraintsTipoSalarioNeto.gridx = 1;
	this.gridBagConstraintsTipoSalarioNeto.ipadx = 0;
	this.gridBagConstraintsTipoSalarioNeto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoSalarioNeto.add(jscrollPanedescripcionTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
	this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSalarioNeto.gridy = iYPanelCamposTipoSalarioNeto;
	this.gridBagConstraintsTipoSalarioNeto.gridx = iXPanelCamposTipoSalarioNeto++;
	this.gridBagConstraintsTipoSalarioNeto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSalarioNeto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoSalarioNeto.add(this.jPanelidTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);



	if(iXPanelCamposTipoSalarioNeto % 1==0) {
		iXPanelCamposTipoSalarioNeto=0;
		iYPanelCamposTipoSalarioNeto++;
	}
	this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
	this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSalarioNeto.gridy = iYPanelCamposTipoSalarioNeto;
	this.gridBagConstraintsTipoSalarioNeto.gridx = iXPanelCamposTipoSalarioNeto++;
	this.gridBagConstraintsTipoSalarioNeto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSalarioNeto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoSalarioNeto.add(this.jPanelnombreTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);



	if(iXPanelCamposTipoSalarioNeto % 1==0) {
		iXPanelCamposTipoSalarioNeto=0;
		iYPanelCamposTipoSalarioNeto++;
	}
	this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
	this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSalarioNeto.gridy = iYPanelCamposTipoSalarioNeto;
	this.gridBagConstraintsTipoSalarioNeto.gridx = iXPanelCamposTipoSalarioNeto++;
	this.gridBagConstraintsTipoSalarioNeto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSalarioNeto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoSalarioNeto.add(this.jPaneldescripcionTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);



	if(iXPanelCamposTipoSalarioNeto % 1==0) {
		iXPanelCamposTipoSalarioNeto=0;
		iYPanelCamposTipoSalarioNeto++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoSalarioNeto= new GridBagLayout();
		this.jPanelAccionesTipoSalarioNeto.setLayout(gridaBagLayoutAccionesTipoSalarioNeto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoSalarioNeto= new GridBagLayout();
		this.jPanelAccionesFormularioTipoSalarioNeto.setLayout(gridaBagLayoutAccionesFormularioTipoSalarioNeto);
		
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoSalarioNeto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoSalarioNeto.add(this.jComboBoxTiposAccionesFormularioTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);

		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoSalarioNeto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoSalarioNeto.add(this.jCheckBoxPostAccionNuevoTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiposalarionetoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoSalarioNeto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoSalarioNeto.add(this.jCheckBoxPostAccionSinCerrarTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiposalarionetoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoSalarioNeto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoSalarioNeto.add(this.jCheckBoxPostAccionSinMensajeTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = 0;
		this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoSalarioNeto.add(this.jButtonModificarTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);							

		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSalarioNeto.gridy = 0;
		this.gridBagConstraintsTipoSalarioNeto.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoSalarioNeto.add(this.jButtonEliminarTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		
			
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy = 0;		
		this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoSalarioNeto.add(this.jButtonActualizarTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);


		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy = 0;		
		this.gridBagConstraintsTipoSalarioNeto.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoSalarioNeto.add(this.jButtonGuardarCambiosTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);	
		
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy = 0;		
		this.gridBagConstraintsTipoSalarioNeto.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoSalarioNeto.add(this.jButtonCancelarTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoSalarioNeto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoSalarioNeto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();						
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoSalarioNeto.gridx = 0;		
			//this.gridBagConstraintsTipoSalarioNeto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoSalarioNeto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoSalarioNeto.gridx =0;
		this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoSalarioNeto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoSalarioNetoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoSalarioNeto = new TipoSalarioNetoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Salario Neto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Salario Neto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Salario Neto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoSalarioNetoModel tiposalarionetoModel=new TipoSalarioNetoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoSalarioNetoModel.TipoSalarioNetoFocusTraversalPolicy tiposalarionetoFocusTraversalPolicy = tiposalarionetoModel.new TipoSalarioNetoFocusTraversalPolicy(this);
			
			//tiposalarionetoFocusTraversalPolicy.settiposalarionetoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiposalarionetoModel);
			
			
			this.jContentPaneDetalleTipoSalarioNeto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoSalarioNeto = new GridBagLayout();	
			this.jContentPaneDetalleTipoSalarioNeto.setLayout(gridaBagLayoutDetalleTipoSalarioNeto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoSalarioNeto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
				this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
					
				
				this.jContentPaneDetalleTipoSalarioNeto.add(jTtoolBarDetalleTipoSalarioNeto, gridBagConstraintsTipoSalarioNeto);								
				
}
			
			this.jScrollPanelDatosEdicionTipoSalarioNeto=   new JScrollPane(jContentPaneDetalleTipoSalarioNeto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoSalarioNeto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSalarioNeto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSalarioNeto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoSalarioNeto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoSalarioNeto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSalarioNeto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSalarioNeto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
	        
			this.jContentPaneDetalleTipoSalarioNeto.add(jPanelCamposTipoSalarioNeto, gridBagConstraintsTipoSalarioNeto);
			
			
			
			
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
						&& tiposalarionetoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tiposalarionetoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoSalarioNeto= new GridBagConstraints();
						this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
						this.jContentPaneDetalleTipoSalarioNeto.add(this.jTabbedPaneRelacionesTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoSalarioNeto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoSalarioNeto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
					this.gridBagConstraintsTipoSalarioNeto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
					
				
					this.jContentPaneDetalleTipoSalarioNeto.add(jPanelCamposOcultosTipoSalarioNeto, gridBagConstraintsTipoSalarioNeto);
				
					this.jPanelCamposOcultosTipoSalarioNeto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
	        this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoSalarioNeto.add(this.jPanelAccionesFormularioTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);							
			
			
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
	        this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoSalarioNeto.add(this.jPanelAccionesTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoSalarioNeto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoSalarioNeto=   new JScrollPane(this.jPanelCamposTipoSalarioNeto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoSalarioNeto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSalarioNeto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSalarioNeto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
			this.gridBagConstraintsTipoSalarioNeto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoSalarioNeto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoSalarioNeto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);			
			
			this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
			this.gridBagConstraintsTipoSalarioNeto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
			
			
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSalarioNeto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		
			
		this.gridBagConstraintsTipoSalarioNeto = new GridBagConstraints();
		this.gridBagConstraintsTipoSalarioNeto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoSalarioNeto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoSalarioNeto, this.gridBagConstraintsTipoSalarioNeto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoSalarioNeto;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoSalarioNeto;
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
