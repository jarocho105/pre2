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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.IdiomaConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class IdiomaDetalleFormJInternalFrame extends IdiomaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleIdioma;
	
	protected JMenuBar jmenuBarDetalleIdioma;
	
	protected JMenu jmenuDetalleIdioma;
	protected JMenu jmenuDetalleArchivoIdioma;
	protected JMenu jmenuDetalleAccionesIdioma;
	protected JMenu jmenuDetalleDatosIdioma;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutIdioma;	
	protected GridBagConstraints gridBagConstraintsIdioma;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected IdiomaBeanSwingJInternalFrameAdditional jInternalFrameDetalleIdioma;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public IdiomaSessionBean idiomaSessionBean;
	
	

	public EmpleadoIdiomaBeanSwingJInternalFrame empleadoidiomaBeanSwingJInternalFrame=null;
	public EmpleadoIdiomaBeanSwingJInternalFrame empleadoidiomaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoIdioma=false;
	public EmpleadoIdiomaSessionBean empleadoidiomaSessionBean;
	
		
	
	public IdiomaLogic idiomaLogic;
	
	public JScrollPane jScrollPanelDatosIdioma;
	public JScrollPane jScrollPanelDatosEdicionIdioma;
	public JScrollPane jScrollPanelDatosGeneralIdioma;
	
	protected JPanel jPanelCamposIdioma;    
	protected JPanel jPanelCamposOcultosIdioma;    	
	protected JPanel jPanelAccionesIdioma;
	protected JPanel jPanelAccionesFormularioIdioma;
    
	
	
	protected Integer iXPanelCamposIdioma=0;
	protected Integer iYPanelCamposIdioma=0;
	
	protected Integer iXPanelCamposOcultosIdioma=0;
	protected Integer iYPanelCamposOcultosIdioma=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoIdioma;
	public JButton jButtonModificarIdioma;
	public JButton jButtonActualizarIdioma;
    public JButton jButtonEliminarIdioma;
	public JButton jButtonCancelarIdioma;
    public JButton jButtonGuardarCambiosIdioma;
	public JButton jButtonGuardarCambiosTablaIdioma;
	protected JButton jButtonCerrarIdioma;
	
	
	protected JButton jButtonProcesarInformacionIdioma;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoIdioma;
	protected JCheckBox jCheckBoxPostAccionSinCerrarIdioma;
	protected JCheckBox jCheckBoxPostAccionSinMensajeIdioma;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarIdioma;
	protected JButton jButtonModificarToolBarIdioma;
	protected JButton jButtonActualizarToolBarIdioma;
    protected JButton jButtonEliminarToolBarIdioma;
	protected JButton jButtonCancelarToolBarIdioma;
    protected JButton jButtonGuardarCambiosToolBarIdioma;
	protected JButton jButtonGuardarCambiosTablaToolBarIdioma;
	protected JButton jButtonMostrarOcultarTablaToolBarIdioma;
	protected JButton jButtonCerrarToolBarIdioma;
	
	protected JButton jButtonProcesarInformacionToolBarIdioma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoIdioma;
	protected JMenuItem jMenuItemModificarIdioma;
	protected JMenuItem jMenuItemActualizarIdioma;
    protected JMenuItem jMenuItemEliminarIdioma;
	protected JMenuItem jMenuItemCancelarIdioma;
    protected JMenuItem jMenuItemGuardarCambiosIdioma;
	protected JMenuItem jMenuItemGuardarCambiosTablaIdioma;
	protected JMenuItem jMenuItemCerrarIdioma;
	protected JMenuItem jMenuItemDetalleCerrarIdioma;
	protected JMenuItem jMenuItemDetalleMostarOcultarIdioma;
	
	protected JMenuItem jMenuItemProcesarInformacionIdioma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosIdioma;
	protected JMenuItem jMenuItemMostrarOcultarIdioma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesIdioma;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesIdioma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesIdioma;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioIdioma;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidIdioma;
	public JLabel jLabelIdIdioma;
	public JTextFieldMe jTextFieldidIdioma;
	public JButton jButtonidIdiomaBusqueda= new JButtonMe();

	public JPanel jPanelnombreIdioma;
	public JLabel jLabelnombreIdioma;
	public JTextArea jTextAreanombreIdioma;
	public JScrollPane jscrollPanenombreIdioma;
	public JButton jButtonnombreIdiomaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionIdioma;
	public JLabel jLabeldescripcionIdioma;
	public JTextArea jTextAreadescripcionIdioma;
	public JScrollPane jscrollPanedescripcionIdioma;
	public JButton jButtondescripcionIdiomaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesIdioma;
	
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
	
	public IdiomaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposIdioma=new JPanel();
				this.jPanelAccionesFormularioIdioma=new JPanel();
				this.jmenuBarDetalleIdioma=new JMenuBar();
				this.jTtoolBarDetalleIdioma=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IdiomaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Idioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public IdiomaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Idioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IdiomaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Idioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IdiomaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Idioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IdiomaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Idioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarIdioma() {
		return this.jButtonActualizarToolBarIdioma;
	}
	
	public JButton getjButtonEliminarToolBarIdioma() {
		return this.jButtonEliminarToolBarIdioma;
	}
	
	public JButton getjButtonCancelarToolBarIdioma() {
		return this.jButtonCancelarToolBarIdioma;
	}		
	
	public JButton getjButtonProcesarInformacionIdioma() {
		return this.jButtonProcesarInformacionIdioma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionIdioma)	{
		this.jButtonProcesarInformacionIdioma = jButtonProcesarInformacionIdioma;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesIdioma() {
		return this.jComboBoxTiposAccionesIdioma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesIdioma(
			JComboBox jComboBoxTiposRelacionesIdioma) {
		this.jComboBoxTiposRelacionesIdioma = jComboBoxTiposRelacionesIdioma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesIdioma(
			JComboBox jComboBoxTiposAccionesIdioma) {
		this.jComboBoxTiposAccionesIdioma = jComboBoxTiposAccionesIdioma;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioIdioma() {
		return this.jComboBoxTiposAccionesFormularioIdioma;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioIdioma(
			JComboBox jComboBoxTiposAccionesFormularioIdioma) {
		this.jComboBoxTiposAccionesFormularioIdioma = jComboBoxTiposAccionesFormularioIdioma;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.idiomaSessionBean=new IdiomaSessionBean();
		
		this.idiomaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.idiomaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.idiomaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		IdiomaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		IdiomaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		IdiomaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Idioma MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
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
	
		IdiomaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleIdioma= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarIdioma=new JButtonMe();
				this.jButtonModificarToolBarIdioma=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarIdioma,this.jTtoolBarDetalleIdioma,
							"actualizar","actualizar","Actualizar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarIdioma,this.jTtoolBarDetalleIdioma,
							"eliminar","eliminar","Eliminar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarIdioma,this.jTtoolBarDetalleIdioma,
							"cancelar","cancelar","Cancelar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarIdioma,this.jTtoolBarDetalleIdioma,
							"guardarcambios","guardarcambios","Guardar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarIdioma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarIdioma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarIdioma,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleIdioma=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleIdioma=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoIdioma=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesIdioma=new JMenuMe("Acciones");
		this.jmenuDetalleDatosIdioma=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoIdioma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoIdioma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoIdioma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarIdioma= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarIdioma.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarIdioma,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarIdioma= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarIdioma.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarIdioma,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarIdioma= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarIdioma.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarIdioma,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarIdioma= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarIdioma.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarIdioma,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosIdioma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosIdioma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosIdioma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarIdioma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarIdioma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarIdioma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarIdioma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarIdioma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarIdioma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarIdioma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarIdioma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarIdioma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarIdioma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarIdioma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarIdioma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoIdioma.add(this.jMenuItemDetalleCerrarIdioma);
		
		this.jmenuDetalleAccionesIdioma.add(this.jMenuItemActualizarIdioma);
		this.jmenuDetalleAccionesIdioma.add(this.jMenuItemEliminarIdioma);
		this.jmenuDetalleAccionesIdioma.add(this.jMenuItemCancelarIdioma);		
		
		//this.jmenuDetalleDatosIdioma.add(this.jMenuItemDetalleAbrirOrderByIdioma);				
		this.jmenuDetalleDatosIdioma.add(this.jMenuItemDetalleMostarOcultarIdioma);				
				
		//this.jmenuDetalleAccionesIdioma.add(this.jMenuItemGuardarCambiosIdioma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleIdioma.add(this.jmenuDetalleArchivoIdioma);		
		this.jmenuBarDetalleIdioma.add(this.jmenuDetalleAccionesIdioma);		
		this.jmenuBarDetalleIdioma.add(this.jmenuDetalleDatosIdioma);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleIdioma.add(this.jmenuDetalleIdioma);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleIdioma);				
	}
	
	
	public void inicializarElementosCamposIdioma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdIdioma = new JLabelMe();
		jLabelIdIdioma.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidIdioma = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidIdioma.setToolTipText(IdiomaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutIdioma= new GridBagLayout();

		this.jPanelidIdioma.setLayout(this.gridaBagLayoutIdioma);

		jTextFieldidIdioma = new JTextFieldMe();
		jTextFieldidIdioma.setText("Id");

		jTextFieldidIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreIdioma = new JLabelMe();
		this.jLabelnombreIdioma.setText(""+IdiomaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreIdioma.setToolTipText("Nombre");
		this.jLabelnombreIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreIdioma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreIdioma.setToolTipText(IdiomaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutIdioma = new GridBagLayout();
		this.jPanelnombreIdioma.setLayout(this.gridaBagLayoutIdioma);


		jTextAreanombreIdioma= new JTextAreaMe();
		jTextAreanombreIdioma.setEnabled(false);
		jTextAreanombreIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreIdioma.setLineWrap(true);
		jTextAreanombreIdioma.setWrapStyleWord(true);
		jTextAreanombreIdioma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreIdioma.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreIdioma = new JScrollPane(jTextAreanombreIdioma);
		jscrollPanenombreIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreIdiomaBusqueda= new JButtonMe();
		this.jButtonnombreIdiomaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreIdiomaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreIdiomaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreIdiomaBusqueda.setText("U");
		this.jButtonnombreIdiomaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreIdiomaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreIdiomaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreIdiomaBusqueda"));

		if(this.idiomaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreIdiomaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionIdioma = new JLabelMe();
		this.jLabeldescripcionIdioma.setText(""+IdiomaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionIdioma.setToolTipText("Descripcion");
		this.jLabeldescripcionIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionIdioma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionIdioma.setToolTipText(IdiomaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutIdioma = new GridBagLayout();
		this.jPaneldescripcionIdioma.setLayout(this.gridaBagLayoutIdioma);


		jTextAreadescripcionIdioma= new JTextAreaMe();
		jTextAreadescripcionIdioma.setEnabled(false);
		jTextAreadescripcionIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionIdioma.setLineWrap(true);
		jTextAreadescripcionIdioma.setWrapStyleWord(true);
		jTextAreadescripcionIdioma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionIdioma.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionIdioma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionIdioma = new JScrollPane(jTextAreadescripcionIdioma);
		jscrollPanedescripcionIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionIdiomaBusqueda= new JButtonMe();
		this.jButtondescripcionIdiomaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionIdiomaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionIdiomaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionIdiomaBusqueda.setText("U");
		this.jButtondescripcionIdiomaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionIdiomaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionIdiomaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionIdiomaBusqueda"));

		if(this.idiomaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionIdiomaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysIdioma() {
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
		//this.jInternalFrameDetalleIdioma = new IdiomaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Idioma DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutIdioma= new GridBagLayout();
		

		
		String sToolTipIdioma="";
		sToolTipIdioma=IdiomaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipIdioma+="(Nomina.Idioma)";
		}
		
		if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
			sToolTipIdioma+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoIdioma = new JButtonMe();
		this.jButtonModificarIdioma = new JButtonMe();
        this.jButtonActualizarIdioma = new JButtonMe();
        this.jButtonEliminarIdioma = new JButtonMe();
        this.jButtonCancelarIdioma = new JButtonMe();
        this.jButtonGuardarCambiosIdioma = new JButtonMe();
		this.jButtonGuardarCambiosTablaIdioma = new JButtonMe();
		this.jButtonCerrarIdioma = new JButtonMe();
		
		this.jScrollPanelDatosIdioma = new JScrollPane();   
        this.jScrollPanelDatosEdicionIdioma = new JScrollPane();
		this.jScrollPanelDatosGeneralIdioma = new JScrollPane();
				
		
		
		this.jPanelCamposIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Idioma";
		
		if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Idiomas" + this.sPath));
		} else {
			this.jScrollPanelDatosIdioma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposIdioma.setName("jPanelCamposIdioma"); 

		this.jPanelCamposOcultosIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosIdioma.setName("jPanelCamposOcultosIdioma"); 

        this.jPanelAccionesIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesIdioma.setToolTipText("Acciones");
        this.jPanelAccionesIdioma.setName("Acciones"); 

		this.jPanelAccionesFormularioIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioIdioma.setToolTipText("Acciones");
        this.jPanelAccionesFormularioIdioma.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosIdioma, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoIdioma.setText("Nuevo");
		this.jButtonModificarIdioma.setText("Editar");
        this.jButtonActualizarIdioma.setText("Actualizar");
        this.jButtonEliminarIdioma.setText("Eliminar");
        this.jButtonCancelarIdioma.setText("Cancelar");
        this.jButtonGuardarCambiosIdioma.setText("Guardar");
		this.jButtonGuardarCambiosTablaIdioma.setText("Guardar");
		this.jButtonCerrarIdioma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoIdioma,"nuevo_button","Nuevo",this.idiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarIdioma,"modificar_button","Editar",this.idiomaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarIdioma,"actualizar_button","Actualizar",this.idiomaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarIdioma,"eliminar_button","Eliminar",this.idiomaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarIdioma,"cancelar_button","Cancelar",this.idiomaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosIdioma,"guardarcambios_button","Guardar",this.idiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaIdioma,"guardarcambiostabla_button","Guardar",this.idiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarIdioma,"cerrar_button","Salir",this.idiomaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoIdioma.setToolTipText("Nuevo"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarIdioma.setToolTipText("Editar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarIdioma.setToolTipText("Actualizar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarIdioma.setToolTipText("Eliminar)"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarIdioma.setToolTipText("Cancelar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosIdioma.setToolTipText("Guardar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaIdioma.setToolTipText("Guardar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarIdioma.setToolTipText("Salir"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoIdioma";
		inputMap = this.jButtonNuevoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoIdioma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoIdioma"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarIdioma";
		inputMap = this.jButtonActualizarIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarIdioma"));
		
		//ELIMINAR
		sMapKey = "EliminarIdioma";
		inputMap = this.jButtonEliminarIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarIdioma"));
		
		//CANCELAR	
		sMapKey = "CancelarIdioma";
		inputMap = this.jButtonCancelarIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarIdioma"));
		
		//CERRAR		
		sMapKey = "CerrarIdioma";
		inputMap = this.jButtonCerrarIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarIdioma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaIdioma";
		inputMap = this.jButtonGuardarCambiosTablaIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaIdioma"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoIdioma = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoIdioma.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoIdioma.setToolTipText("Nuevo Idioma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarIdioma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarIdioma.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarIdioma.setToolTipText("Sin Cerrar Ventana Idioma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeIdioma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeIdioma.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeIdioma.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeIdioma, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesIdioma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesIdioma.setText("Accion");
		this.jComboBoxTiposAccionesIdioma.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioIdioma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioIdioma.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioIdioma.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesIdioma = new JLabelMe();
		
		this.jLabelAccionesIdioma.setText("Acciones");		
		this.jLabelAccionesIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposIdioma();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysIdioma();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesIdioma=new JTabbedPane();
		this.jTabbedPaneRelacionesIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesIdioma,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesIdioma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIdioma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIdioma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioIdioma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioIdioma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioIdioma.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioIdioma, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposIdioma = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosIdioma = new GridBagLayout();
		
		this.jPanelCamposIdioma.setLayout(gridaBagLayoutCamposIdioma);
		this.jPanelCamposOcultosIdioma.setLayout(gridaBagLayoutCamposOcultosIdioma);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsIdioma = new GridBagConstraints();
	this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIdioma.gridy = 0;
	this.gridBagConstraintsIdioma.gridx = 0;
	this.gridBagConstraintsIdioma.ipadx = 0;
	this.gridBagConstraintsIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidIdioma.add(jLabelIdIdioma, this.gridBagConstraintsIdioma);



	this.gridBagConstraintsIdioma = new GridBagConstraints();
	this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIdioma.gridy = 0;
	this.gridBagConstraintsIdioma.gridx = 1;
	this.gridBagConstraintsIdioma.ipadx = 0;
	this.gridBagConstraintsIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidIdioma.add(jTextFieldidIdioma, this.gridBagConstraintsIdioma);


	this.gridBagConstraintsIdioma = new GridBagConstraints();
	this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIdioma.gridy = 0;
	this.gridBagConstraintsIdioma.gridx = 0;
	this.gridBagConstraintsIdioma.ipadx = 0;
	this.gridBagConstraintsIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreIdioma.add(jLabelnombreIdioma, this.gridBagConstraintsIdioma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIdioma = new GridBagConstraints();
		//this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIdioma.gridy = 0;
		this.gridBagConstraintsIdioma.gridx = 2;
		this.gridBagConstraintsIdioma.ipadx = 0;
		this.gridBagConstraintsIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreIdioma.add(jButtonnombreIdiomaBusqueda, this.gridBagConstraintsIdioma);
	}

	this.gridBagConstraintsIdioma = new GridBagConstraints();
	this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIdioma.gridy = 0;
	this.gridBagConstraintsIdioma.gridx = 1;
	this.gridBagConstraintsIdioma.ipadx = 0;
	this.gridBagConstraintsIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreIdioma.add(jscrollPanenombreIdioma, this.gridBagConstraintsIdioma);


	this.gridBagConstraintsIdioma = new GridBagConstraints();
	this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIdioma.gridy = 0;
	this.gridBagConstraintsIdioma.gridx = 0;
	this.gridBagConstraintsIdioma.ipadx = 0;
	this.gridBagConstraintsIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionIdioma.add(jLabeldescripcionIdioma, this.gridBagConstraintsIdioma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIdioma = new GridBagConstraints();
		//this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIdioma.gridy = 0;
		this.gridBagConstraintsIdioma.gridx = 2;
		this.gridBagConstraintsIdioma.ipadx = 0;
		this.gridBagConstraintsIdioma.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionIdioma.add(jButtondescripcionIdiomaBusqueda, this.gridBagConstraintsIdioma);
	}

	this.gridBagConstraintsIdioma = new GridBagConstraints();
	this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIdioma.gridy = 0;
	this.gridBagConstraintsIdioma.gridx = 1;
	this.gridBagConstraintsIdioma.ipadx = 0;
	this.gridBagConstraintsIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionIdioma.add(jscrollPanedescripcionIdioma, this.gridBagConstraintsIdioma);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsIdioma = new GridBagConstraints();
	this.gridBagConstraintsIdioma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIdioma.gridy = iYPanelCamposIdioma;
	this.gridBagConstraintsIdioma.gridx = iXPanelCamposIdioma++;
	this.gridBagConstraintsIdioma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIdioma.add(this.jPanelidIdioma, this.gridBagConstraintsIdioma);



	if(iXPanelCamposIdioma % 1==0) {
		iXPanelCamposIdioma=0;
		iYPanelCamposIdioma++;
	}
	this.gridBagConstraintsIdioma = new GridBagConstraints();
	this.gridBagConstraintsIdioma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIdioma.gridy = iYPanelCamposIdioma;
	this.gridBagConstraintsIdioma.gridx = iXPanelCamposIdioma++;
	this.gridBagConstraintsIdioma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIdioma.add(this.jPanelnombreIdioma, this.gridBagConstraintsIdioma);



	if(iXPanelCamposIdioma % 1==0) {
		iXPanelCamposIdioma=0;
		iYPanelCamposIdioma++;
	}
	this.gridBagConstraintsIdioma = new GridBagConstraints();
	this.gridBagConstraintsIdioma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIdioma.gridy = iYPanelCamposIdioma;
	this.gridBagConstraintsIdioma.gridx = iXPanelCamposIdioma++;
	this.gridBagConstraintsIdioma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIdioma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIdioma.add(this.jPaneldescripcionIdioma, this.gridBagConstraintsIdioma);



	if(iXPanelCamposIdioma % 1==0) {
		iXPanelCamposIdioma=0;
		iYPanelCamposIdioma++;
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
			
		GridBagLayout gridaBagLayoutAccionesIdioma= new GridBagLayout();
		this.jPanelAccionesIdioma.setLayout(gridaBagLayoutAccionesIdioma);
		
		GridBagLayout gridaBagLayoutAccionesFormularioIdioma= new GridBagLayout();
		this.jPanelAccionesFormularioIdioma.setLayout(gridaBagLayoutAccionesFormularioIdioma);
		
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsIdioma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioIdioma.add(this.jComboBoxTiposAccionesFormularioIdioma, this.gridBagConstraintsIdioma);

		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsIdioma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioIdioma.add(this.jCheckBoxPostAccionNuevoIdioma, this.gridBagConstraintsIdioma);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.idiomaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsIdioma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioIdioma.add(this.jCheckBoxPostAccionSinCerrarIdioma, this.gridBagConstraintsIdioma);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.idiomaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.idiomaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsIdioma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioIdioma.add(this.jCheckBoxPostAccionSinMensajeIdioma, this.gridBagConstraintsIdioma);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIdioma.gridy = 0;
		this.gridBagConstraintsIdioma.gridx = iPosXAccion++;
			
		this.jPanelAccionesIdioma.add(this.jButtonModificarIdioma, this.gridBagConstraintsIdioma);							

		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIdioma.gridy = 0;
		this.gridBagConstraintsIdioma.gridx =iPosXAccion++;
			
		this.jPanelAccionesIdioma.add(this.jButtonEliminarIdioma, this.gridBagConstraintsIdioma);
		
			
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy = 0;		
		this.gridBagConstraintsIdioma.gridx = iPosXAccion++;
		
		this.jPanelAccionesIdioma.add(this.jButtonActualizarIdioma, this.gridBagConstraintsIdioma);


		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy = 0;		
		this.gridBagConstraintsIdioma.gridx = iPosXAccion++;
		
		this.jPanelAccionesIdioma.add(this.jButtonGuardarCambiosIdioma, this.gridBagConstraintsIdioma);	
		
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy = 0;		
		this.gridBagConstraintsIdioma.gridx =iPosXAccion++;
		
		this.jPanelAccionesIdioma.add(this.jButtonCancelarIdioma, this.gridBagConstraintsIdioma);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutIdioma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutIdioma);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.idiomaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsIdioma = new GridBagConstraints();						
			this.gridBagConstraintsIdioma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsIdioma.gridx = 0;		
			//this.gridBagConstraintsIdioma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIdioma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsIdioma.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsIdioma.gridx =0;
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsIdioma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosIdioma, this.gridBagConstraintsIdioma);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(IdiomaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleIdioma = new IdiomaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Idioma DATOS");
			
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
			
	        //this.setTitle("[FOR] - Idioma DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Idioma Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			IdiomaModel idiomaModel=new IdiomaModel(this);
			
			//SI USARA CLASE INTERNA
			//IdiomaModel.IdiomaFocusTraversalPolicy idiomaFocusTraversalPolicy = idiomaModel.new IdiomaFocusTraversalPolicy(this);
			
			//idiomaFocusTraversalPolicy.setidiomaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(idiomaModel);
			
			
			this.jContentPaneDetalleIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleIdioma = new GridBagLayout();	
			this.jContentPaneDetalleIdioma.setLayout(gridaBagLayoutDetalleIdioma);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosIdioma = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsIdioma = new GridBagConstraints();
				this.gridBagConstraintsIdioma.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsIdioma.gridx = 0;
					
				
				this.jContentPaneDetalleIdioma.add(jTtoolBarDetalleIdioma, gridBagConstraintsIdioma);								
				
}
			
			this.jScrollPanelDatosEdicionIdioma=   new JScrollPane(jContentPaneDetalleIdioma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionIdioma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIdioma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIdioma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralIdioma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralIdioma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIdioma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIdioma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			
			
	        this.gridBagConstraintsIdioma.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsIdioma.gridx = 0;
	        
			this.jContentPaneDetalleIdioma.add(jPanelCamposIdioma, gridBagConstraintsIdioma);
			
			
			
			
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
						&& idiomaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoIdioma(this.puedeCargarPorParteEmpleadoIdioma,false,-1);
					
					if(this.idiomaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsIdioma= new GridBagConstraints();
						this.gridBagConstraintsIdioma.gridy = iGridyRelaciones++;
						this.gridBagConstraintsIdioma.gridx = 0;
						this.jContentPaneDetalleIdioma.add(this.jTabbedPaneRelacionesIdioma, this.gridBagConstraintsIdioma);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesIdioma.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoIdioma(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosIdioma.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsIdioma = new GridBagConstraints();
					this.gridBagConstraintsIdioma.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsIdioma.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsIdioma.gridx = 0;
					
				
					this.jContentPaneDetalleIdioma.add(jPanelCamposOcultosIdioma, gridBagConstraintsIdioma);
				
					this.jPanelCamposOcultosIdioma.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsIdioma.gridx = 0;
	        this.gridBagConstraintsIdioma.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleIdioma.add(this.jPanelAccionesFormularioIdioma, this.gridBagConstraintsIdioma);							
			
			
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
	        this.gridBagConstraintsIdioma.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsIdioma.gridx = 0;
	        
			
			this.jContentPaneDetalleIdioma.add(this.jPanelAccionesIdioma, this.gridBagConstraintsIdioma);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionIdioma);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionIdioma=   new JScrollPane(this.jPanelCamposIdioma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionIdioma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIdioma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIdioma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsIdioma.gridx = 0;
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsIdioma.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionIdioma, this.gridBagConstraintsIdioma);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsIdioma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioIdioma, this.gridBagConstraintsIdioma);			
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsIdioma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesIdioma, this.gridBagConstraintsIdioma);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIdioma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposIdioma, this.gridBagConstraintsIdioma);
			
			
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIdioma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosIdioma, this.gridBagConstraintsIdioma);
		
			
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsIdioma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesIdioma, this.gridBagConstraintsIdioma);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralIdioma;//jContentPane;
		
		return jScrollPanelDatosEdicionIdioma;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoIdioma(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
		this.empleadoidiomaSessionBean.setConGuardarRelaciones(false);
		this.empleadoidiomaSessionBean.setEsGuardarRelacionado(true);

		this.empleadoidiomaBeanSwingJInternalFrame=null;//new EmpleadoIdiomaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoidiomaBeanSwingJInternalFramePopup=new EmpleadoIdiomaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoidiomaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {

				EmpleadoIdiomaJInternalFrame.STIPO_TAMANIO_GENERAL=IdiomaJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoIdiomaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=IdiomaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoidiomaSessionBean.setEsGuardarRelacionado(true);

				this.empleadoidiomaBeanSwingJInternalFrame=new EmpleadoIdiomaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoidiomaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoidiomaBeanSwingJInternalFrame.setempleadoidiomaSessionBean(this.empleadoidiomaSessionBean);

				//this.gridBagConstraintsIdioma = new GridBagConstraints();
				//this.gridBagConstraintsIdioma.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsIdioma.gridx = 0;
				//this.jContentPaneDetalleIdioma.add(this.empleadoidiomaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsIdioma);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesIdioma.add("Empleado Idiomas",this.empleadoidiomaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesIdioma.setComponentAt(iIndexTab,this.empleadoidiomaBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoIdiomaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoidiomaSessionBean.setEsGuardarRelacionado(false);
				this.empleadoidiomaBeanSwingJInternalFrame=null;//new EmpleadoIdiomaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoIdioma) {
					this.jTabbedPaneRelacionesIdioma.add("Empleado Idiomas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarEmpleadoIdiomaBeanSwingJInternalFrame(List<Idioma> idiomas,Idioma idioma,EmpleadoIdiomaBeanSwingJInternalFrame empleadoidiomaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoidiomaBeanSwingJInternalFrame=new EmpleadoIdiomaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoidiomaBeanSwingJInternalFrame.getEmpleadoIdiomaLogic().setConnexion(this.idiomaLogic.getConnexion());

					empleadoidiomaBeanSwingJInternalFrame.setidiomasForeignKey(idiomas);
					empleadoidiomaBeanSwingJInternalFrame.setidiomaForeignKey(idioma);
					empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaSessionBean.setisBusquedaDesdeForeignKeySesionIdioma(true);
					empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaSessionBean.setlidIdiomaActual(idioma.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoidiomaBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoIdioma(empleadoidiomaBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoidiomaBeanSwingJInternalFrame.setVisibilidadBusquedasParaIdioma(true);
					empleadoidiomaBeanSwingJInternalFrame.setid_idiomaFK_IdIdioma(idioma.getId());

					if(!this.conCargarFormDetalle) {
						empleadoidiomaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoidiomaBeanSwingJInternalFrame.setSelectedItemCombosFrameIdiomaForeignKey(idioma,1,false,true,true);
					empleadoidiomaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoidiomaBeanSwingJInternalFrame.procesarBusqueda("FK_IdIdioma");
					empleadoidiomaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdIdioma");
					empleadoidiomaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoIdioma(true);
					empleadoidiomaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoIdioma("n",empleadoidiomaBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoidiomaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoidiomaBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoidiomaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoidiomaBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoIdioma("relacionado");
					} else {
						empleadoidiomaBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoIdioma("no_relacionado");
					}

					empleadoidiomaBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoIdioma().setVisible(false);

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
