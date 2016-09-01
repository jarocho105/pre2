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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.inventario.util.EstadoBodegaProductoConstantesFunciones;
import com.bydan.erp.inventario.util.EstadoBodegaProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.EstadoBodegaProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.EstadoBodegaProductoBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;




@SuppressWarnings("unused")
public class EstadoBodegaProductoBeanSwingJInternalFrame extends EstadoBodegaProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoBodegaProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoBodegaProducto> estadobodegaproductoValidator = new ClassValidator<EstadoBodegaProducto>(EstadoBodegaProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoBodegaProducto estadobodegaproducto;	
	public EstadoBodegaProducto estadobodegaproductoAux;
	public EstadoBodegaProducto estadobodegaproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoBodegaProducto estadobodegaproductoTotales;
	public Long idEstadoBodegaProductoActual;
	public Long iIdNuevoEstadoBodegaProducto=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoEstadoBodegaProducto;
	public Boolean isPermisoNuevoEstadoBodegaProducto;
	public Boolean isPermisoActualizarEstadoBodegaProducto;
	public Boolean isPermisoActualizarOriginalEstadoBodegaProducto;
	public Boolean isPermisoEliminarEstadoBodegaProducto;
	public Boolean isPermisoGuardarCambiosEstadoBodegaProducto;
	public Boolean isPermisoConsultaEstadoBodegaProducto;
	public Boolean isPermisoBusquedaEstadoBodegaProducto;
	public Boolean isPermisoReporteEstadoBodegaProducto;
	public Boolean isPermisoPaginacionMedioEstadoBodegaProducto;
	public Boolean isPermisoPaginacionAltoEstadoBodegaProducto;
	public Boolean isPermisoPaginacionTodoEstadoBodegaProducto;
	public Boolean isPermisoCopiarEstadoBodegaProducto;
	public Boolean isPermisoVerFormEstadoBodegaProducto;
	public Boolean isPermisoDuplicarEstadoBodegaProducto;
	public Boolean isPermisoOrdenEstadoBodegaProducto;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public EstadoBodegaProductoParameterReturnGeneral estadobodegaproductoReturnGeneral;
	public EstadoBodegaProductoParameterReturnGeneral estadobodegaproductoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoBodegaProducto=false;
	public Boolean esParaAccionDesdeFormularioEstadoBodegaProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoBodegaProductoLogic estadobodegaproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoBodegaProducto estadobodegaproductoBean;
	public EstadoBodegaProductoConstantesFunciones estadobodegaproductoConstantesFunciones;
	//public EstadoBodegaProductoParameterReturnGeneral estadobodegaproductoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoBodegaProducto> estadobodegaproductos;	
	//public List<EstadoBodegaProducto> estadobodegaproductosEliminados;
	//public List<EstadoBodegaProducto> estadobodegaproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoBodegaProducto=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoBodegaProducto=true;
	public Boolean isVisibilidadCeldaCopiarEstadoBodegaProducto=true;
	public Boolean isVisibilidadCeldaVerFormEstadoBodegaProducto=true;
	public Boolean isVisibilidadCeldaOrdenEstadoBodegaProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto=false;
	public Boolean isVisibilidadCeldaModificarEstadoBodegaProducto=false;
	public Boolean isVisibilidadCeldaActualizarEstadoBodegaProducto=false;
	public Boolean isVisibilidadCeldaEliminarEstadoBodegaProducto=false;
	public Boolean isVisibilidadCeldaCancelarEstadoBodegaProducto=false;
	public Boolean isVisibilidadCeldaGuardarEstadoBodegaProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto=false;	
	
	
	
	public Long getiIdNuevoEstadoBodegaProducto() {
		return this.iIdNuevoEstadoBodegaProducto;
	}

	public void setiIdNuevoEstadoBodegaProducto(Long iIdNuevoEstadoBodegaProducto) {
		this.iIdNuevoEstadoBodegaProducto = iIdNuevoEstadoBodegaProducto;
	}
	
	public Long getidEstadoBodegaProductoActual() {
		return this.idEstadoBodegaProductoActual;
	}

	public void setidEstadoBodegaProductoActual(Long idEstadoBodegaProductoActual) {
		this.idEstadoBodegaProductoActual = idEstadoBodegaProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoBodegaProducto getestadobodegaproducto() {
		return this.estadobodegaproducto;
	}

	public void setestadobodegaproducto(EstadoBodegaProducto estadobodegaproducto) {
		this.estadobodegaproducto = estadobodegaproducto;
	}
	
	public EstadoBodegaProducto getestadobodegaproductoAux() {
		return this.estadobodegaproductoAux;
	}

	public void setestadobodegaproductoAux(EstadoBodegaProducto estadobodegaproductoAux) {
		this.estadobodegaproductoAux = estadobodegaproductoAux;
	}				
	
	public EstadoBodegaProducto getestadobodegaproductoAnterior() {
		return this.estadobodegaproductoAnterior;
	}

	public void setestadobodegaproductoAnterior(EstadoBodegaProducto estadobodegaproductoAnterior) {
		this.estadobodegaproductoAnterior = estadobodegaproductoAnterior;
	}	
	
	public EstadoBodegaProducto getestadobodegaproductoTotales() {
		return this.estadobodegaproductoTotales;
	}

	public void setestadobodegaproductoTotales(EstadoBodegaProducto estadobodegaproductoTotales) {
		this.estadobodegaproductoTotales = estadobodegaproductoTotales;
	}	
	
	public EstadoBodegaProducto getestadobodegaproductoBean() {
		return this.estadobodegaproductoBean;
	}

	public void setestadobodegaproductoBean(EstadoBodegaProducto estadobodegaproductoBean) {
		this.estadobodegaproductoBean = estadobodegaproductoBean;
	}	
	
	public EstadoBodegaProductoParameterReturnGeneral getestadobodegaproductoReturnGeneral() {
		return this.estadobodegaproductoReturnGeneral;
	}

	public void setestadobodegaproductoReturnGeneral(EstadoBodegaProductoParameterReturnGeneral estadobodegaproductoReturnGeneral) {
		this.estadobodegaproductoReturnGeneral = estadobodegaproductoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoBodegaProductoLogic getEstadoBodegaProductoLogic()	{		
		return estadobodegaproductoLogic;
	}

	public void setEstadoBodegaProductoLogic(EstadoBodegaProductoLogic estadobodegaproductoLogic) {
		this.estadobodegaproductoLogic = estadobodegaproductoLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoEstadoBodegaProducto() {
		return isEsNuevoEstadoBodegaProducto;
	}

	public void setIsEsNuevoEstadoBodegaProducto(Boolean isEsNuevoEstadoBodegaProducto) {
		this.isEsNuevoEstadoBodegaProducto = isEsNuevoEstadoBodegaProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoBodegaProducto() {
		return esParaAccionDesdeFormularioEstadoBodegaProducto;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoBodegaProducto(Boolean esParaAccionDesdeFormularioEstadoBodegaProducto) {
		this.esParaAccionDesdeFormularioEstadoBodegaProducto = esParaAccionDesdeFormularioEstadoBodegaProducto;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoBodegaProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoBodegaProductoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoBodegaProducto(this.estadobodegaproductoLogic.getEstadoBodegaProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoBodegaProductoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoBodegaProducto(this.estadobodegaproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadobodegaproductoLogic.setEstadoBodegaProductos(this.estadobodegaproductos);
			estadobodegaproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public EstadoBodegaProductoParameterReturnGeneral getEstadoBodegaProductoParameterGeneral() {
		return this.estadobodegaproductoParameterGeneral;
	}
	
	public void setEstadoBodegaProductoParameterGeneral(EstadoBodegaProductoParameterReturnGeneral estadobodegaproductoParameterGeneral) {
		this.estadobodegaproductoParameterGeneral = estadobodegaproductoParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoEstadoBodegaProducto() {
		return isPermisoTodoEstadoBodegaProducto;
	}

	public void setIsPermisoTodoEstadoBodegaProducto(Boolean isPermisoTodoEstadoBodegaProducto) {
		this.isPermisoTodoEstadoBodegaProducto = isPermisoTodoEstadoBodegaProducto;
	}

	public Boolean getIsPermisoNuevoEstadoBodegaProducto() {
		return isPermisoNuevoEstadoBodegaProducto;
	}

	public void setIsPermisoNuevoEstadoBodegaProducto(Boolean isPermisoNuevoEstadoBodegaProducto) {
		this.isPermisoNuevoEstadoBodegaProducto = isPermisoNuevoEstadoBodegaProducto;
	}

	public Boolean getIsPermisoActualizarEstadoBodegaProducto() {
		return isPermisoActualizarEstadoBodegaProducto;
	}

	public void setIsPermisoActualizarEstadoBodegaProducto(Boolean isPermisoActualizarEstadoBodegaProducto) {
		this.isPermisoActualizarEstadoBodegaProducto = isPermisoActualizarEstadoBodegaProducto;
	}

	public Boolean getIsPermisoEliminarEstadoBodegaProducto() {
		return isPermisoEliminarEstadoBodegaProducto;
	}

	public void setIsPermisoEliminarEstadoBodegaProducto(Boolean isPermisoEliminarEstadoBodegaProducto) {
		this.isPermisoEliminarEstadoBodegaProducto = isPermisoEliminarEstadoBodegaProducto;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoBodegaProducto() {
		return isPermisoGuardarCambiosEstadoBodegaProducto;
	}

	public void setIsPermisoGuardarCambiosEstadoBodegaProducto(Boolean isPermisoGuardarCambiosEstadoBodegaProducto) {
		this.isPermisoGuardarCambiosEstadoBodegaProducto = isPermisoGuardarCambiosEstadoBodegaProducto;
	}
	
	public Boolean getIsPermisoConsultaEstadoBodegaProducto() {
		return isPermisoConsultaEstadoBodegaProducto;
	}

	public void setIsPermisoConsultaEstadoBodegaProducto(Boolean isPermisoConsultaEstadoBodegaProducto) {
		this.isPermisoConsultaEstadoBodegaProducto = isPermisoConsultaEstadoBodegaProducto;
	}

	public Boolean getIsPermisoBusquedaEstadoBodegaProducto() {
		return isPermisoBusquedaEstadoBodegaProducto;
	}

	public void setIsPermisoBusquedaEstadoBodegaProducto(Boolean isPermisoBusquedaEstadoBodegaProducto) {
		this.isPermisoBusquedaEstadoBodegaProducto = isPermisoBusquedaEstadoBodegaProducto;
	}

	public Boolean getIsPermisoReporteEstadoBodegaProducto() {
		return isPermisoReporteEstadoBodegaProducto;
	}

	public void setIsPermisoReporteEstadoBodegaProducto(Boolean isPermisoReporteEstadoBodegaProducto) {
		this.isPermisoReporteEstadoBodegaProducto = isPermisoReporteEstadoBodegaProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoBodegaProducto() {
		return isPermisoPaginacionMedioEstadoBodegaProducto;
	}

	public void setIsPermisoPaginacionMedioEstadoBodegaProducto(Boolean isPermisoPaginacionMedioEstadoBodegaProducto) {
		this.isPermisoPaginacionMedioEstadoBodegaProducto = isPermisoPaginacionMedioEstadoBodegaProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoBodegaProducto() {
		return isPermisoPaginacionTodoEstadoBodegaProducto;
	}

	public void setIsPermisoPaginacionTodoEstadoBodegaProducto(Boolean isPermisoPaginacionTodoEstadoBodegaProducto) {
		this.isPermisoPaginacionTodoEstadoBodegaProducto = isPermisoPaginacionTodoEstadoBodegaProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoBodegaProducto() {
		return isPermisoPaginacionAltoEstadoBodegaProducto;
	}

	public void setIsPermisoPaginacionAltoEstadoBodegaProducto(Boolean isPermisoPaginacionAltoEstadoBodegaProducto) {
		this.isPermisoPaginacionAltoEstadoBodegaProducto = isPermisoPaginacionAltoEstadoBodegaProducto;
	}
	
	public Boolean getIsPermisoCopiarEstadoBodegaProducto() {
		return isPermisoCopiarEstadoBodegaProducto;
	}

	public void setIsPermisoCopiarEstadoBodegaProducto(Boolean isPermisoCopiarEstadoBodegaProducto) {
		this.isPermisoCopiarEstadoBodegaProducto = isPermisoCopiarEstadoBodegaProducto;
	}
	
	public Boolean getIsPermisoVerFormEstadoBodegaProducto() {
		return isPermisoVerFormEstadoBodegaProducto;
	}

	public void setIsPermisoVerFormEstadoBodegaProducto(Boolean isPermisoVerFormEstadoBodegaProducto) {
		this.isPermisoVerFormEstadoBodegaProducto = isPermisoVerFormEstadoBodegaProducto;
	}
	
	public Boolean getIsPermisoDuplicarEstadoBodegaProducto() {
		return isPermisoDuplicarEstadoBodegaProducto;
	}

	public void setIsPermisoDuplicarEstadoBodegaProducto(Boolean isPermisoDuplicarEstadoBodegaProducto) {
		this.isPermisoDuplicarEstadoBodegaProducto = isPermisoDuplicarEstadoBodegaProducto;
	}
	
	public Boolean getIsPermisoOrdenEstadoBodegaProducto() {
		return isPermisoOrdenEstadoBodegaProducto;
	}

	public void setIsPermisoOrdenEstadoBodegaProducto(Boolean isPermisoOrdenEstadoBodegaProducto) {
		this.isPermisoOrdenEstadoBodegaProducto = isPermisoOrdenEstadoBodegaProducto;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoBodegaProducto() {
		return isVisibilidadCeldaNuevoEstadoBodegaProducto;
	}

	public void setIsVisibilidadCeldaNuevoEstadoBodegaProducto(Boolean isVisibilidadCeldaNuevoEstadoBodegaProducto) {
		this.isVisibilidadCeldaNuevoEstadoBodegaProducto = isVisibilidadCeldaNuevoEstadoBodegaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoBodegaProducto() {
		return isVisibilidadCeldaDuplicarEstadoBodegaProducto;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoBodegaProducto(Boolean isVisibilidadCeldaDuplicarEstadoBodegaProducto) {
		this.isVisibilidadCeldaDuplicarEstadoBodegaProducto = isVisibilidadCeldaDuplicarEstadoBodegaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoBodegaProducto() {
		return isVisibilidadCeldaCopiarEstadoBodegaProducto;
	}

	public void setIsVisibilidadCeldaCopiarEstadoBodegaProducto(Boolean isVisibilidadCeldaCopiarEstadoBodegaProducto) {
		this.isVisibilidadCeldaCopiarEstadoBodegaProducto = isVisibilidadCeldaCopiarEstadoBodegaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoBodegaProducto() {
		return isVisibilidadCeldaVerFormEstadoBodegaProducto;
	}

	public void setIsVisibilidadCeldaVerFormEstadoBodegaProducto(Boolean isVisibilidadCeldaVerFormEstadoBodegaProducto) {
		this.isVisibilidadCeldaVerFormEstadoBodegaProducto = isVisibilidadCeldaVerFormEstadoBodegaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoBodegaProducto() {
		return isVisibilidadCeldaOrdenEstadoBodegaProducto;
	}

	public void setIsVisibilidadCeldaOrdenEstadoBodegaProducto(Boolean isVisibilidadCeldaOrdenEstadoBodegaProducto) {
		this.isVisibilidadCeldaOrdenEstadoBodegaProducto = isVisibilidadCeldaOrdenEstadoBodegaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto() {
		return isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto(Boolean isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto = isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoBodegaProducto() {
		return isVisibilidadCeldaModificarEstadoBodegaProducto;
	}

	public void setIsVisibilidadCeldaModificarEstadoBodegaProducto(Boolean isVisibilidadCeldaModificarEstadoBodegaProducto) {
		this.isVisibilidadCeldaModificarEstadoBodegaProducto = isVisibilidadCeldaModificarEstadoBodegaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoBodegaProducto() {
		return isVisibilidadCeldaActualizarEstadoBodegaProducto;
	}

	public void setIsVisibilidadCeldaActualizarEstadoBodegaProducto(Boolean isVisibilidadCeldaActualizarEstadoBodegaProducto) {
		this.isVisibilidadCeldaActualizarEstadoBodegaProducto = isVisibilidadCeldaActualizarEstadoBodegaProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoBodegaProducto() {
		return isVisibilidadCeldaEliminarEstadoBodegaProducto;
	}

	public void setIsVisibilidadCeldaEliminarEstadoBodegaProducto(Boolean isVisibilidadCeldaEliminarEstadoBodegaProducto) {
		this.isVisibilidadCeldaEliminarEstadoBodegaProducto = isVisibilidadCeldaEliminarEstadoBodegaProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoBodegaProducto() {
		return isVisibilidadCeldaCancelarEstadoBodegaProducto;
	}

	public void setIsVisibilidadCeldaCancelarEstadoBodegaProducto(Boolean isVisibilidadCeldaCancelarEstadoBodegaProducto) {
		this.isVisibilidadCeldaCancelarEstadoBodegaProducto = isVisibilidadCeldaCancelarEstadoBodegaProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoBodegaProducto() {
		return isVisibilidadCeldaGuardarEstadoBodegaProducto;
	}

	public void setIsVisibilidadCeldaGuardarEstadoBodegaProducto(Boolean isVisibilidadCeldaGuardarEstadoBodegaProducto) {
		this.isVisibilidadCeldaGuardarEstadoBodegaProducto = isVisibilidadCeldaGuardarEstadoBodegaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoBodegaProducto() {
		return isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoBodegaProducto(Boolean isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto) {
		this.isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto = isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto;
	}
		
	public EstadoBodegaProductoSessionBean getestadobodegaproductoSessionBean() {
		return this.estadobodegaproductoSessionBean;
	}
	
	public void setestadobodegaproductoSessionBean(EstadoBodegaProductoSessionBean estadobodegaproductoSessionBean) {
		this.estadobodegaproductoSessionBean=estadobodegaproductoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproducto)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(EstadoBodegaProducto estadobodegaproducto,EstadoBodegaProducto estadobodegaproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoBodegaProducto(estadobodegaproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadobodegaproductoAux.setId(estadobodegaproducto.getId());
		estadobodegaproductoAux.setVersionRow(estadobodegaproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoBodegaProducto();
		
			int intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoBodegaProducto(this.estadobodegaproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoBodegaProducto(this.estadobodegaproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadobodegaproductoValidator.getInvalidValues(this.estadobodegaproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadobodegaproductoLogic.setDatosCliente(datosCliente);
			estadobodegaproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadobodegaproductoAux=new  EstadoBodegaProducto();
				
				estadobodegaproductoAux.setIsNew(true);
				estadobodegaproductoAux.setIsChanged(true);
				
				estadobodegaproductoAux.setEstadoBodegaProductoOriginal(this.estadobodegaproducto);
				
				estadobodegaproductoAux.setId(this.estadobodegaproducto.getId());	
				estadobodegaproductoAux.setVersionRow(this.estadobodegaproducto.getVersionRow());	
				estadobodegaproductoAux.setcodigo(this.estadobodegaproducto.getcodigo());	
				estadobodegaproductoAux.setnombre(this.estadobodegaproducto.getnombre());	
				estadobodegaproductoAux.setes_defecto(this.estadobodegaproducto.getes_defecto());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadobodegaproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadobodegaproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadobodegaproductoAux,estadobodegaproductoLogic.getEstadoBodegaProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadobodegaproductoAux,estadobodegaproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadobodegaproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadobodegaproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadobodegaproductoLogic.saveEstadoBodegaProductos();//WithConnection
						//estadobodegaproductoLogic.getSetVersionRowEstadoBodegaProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadobodegaproducto,estadobodegaproductoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadobodegaproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadobodegaproductoAux=new  EstadoBodegaProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.estadobodegaproductoSessionBean.getEsGuardarRelacionado() && this.estadobodegaproducto.getId()>=0)) {
						
					estadobodegaproductoAux.setIsNew(false);
				}
				
				estadobodegaproductoAux.setIsDeleted(false);
			
				estadobodegaproductoAux.setId(this.estadobodegaproducto.getId());	
				estadobodegaproductoAux.setVersionRow(this.estadobodegaproducto.getVersionRow());	
				estadobodegaproductoAux.setcodigo(this.estadobodegaproducto.getcodigo());	
				estadobodegaproductoAux.setnombre(this.estadobodegaproducto.getnombre());	
				estadobodegaproductoAux.setes_defecto(this.estadobodegaproducto.getes_defecto());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadobodegaproductoAux,estadobodegaproductoLogic.getEstadoBodegaProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadobodegaproductoAux,estadobodegaproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadobodegaproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadobodegaproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadobodegaproductoLogic.saveEstadoBodegaProductos();//WithConnection
						//estadobodegaproductoLogic.getSetVersionRowEstadoBodegaProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadobodegaproducto,estadobodegaproductoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadobodegaproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadobodegaproductoAux=new  EstadoBodegaProducto();
				
				estadobodegaproductoAux.setIsNew(false);
				estadobodegaproductoAux.setIsChanged(false);
				
				estadobodegaproductoAux.setIsDeleted(true);
				
				estadobodegaproductoAux.setId(this.estadobodegaproducto.getId());	
				estadobodegaproductoAux.setVersionRow(this.estadobodegaproducto.getVersionRow());	
				estadobodegaproductoAux.setcodigo(this.estadobodegaproducto.getcodigo());	
				estadobodegaproductoAux.setnombre(this.estadobodegaproducto.getnombre());	
				estadobodegaproductoAux.setes_defecto(this.estadobodegaproducto.getes_defecto());	
				
				if(this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadobodegaproductoAux.getId()>=0) {	
						this.estadobodegaproductosEliminados.add(estadobodegaproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadobodegaproductoAux,estadobodegaproductoLogic.getEstadoBodegaProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadobodegaproductoAux,estadobodegaproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadobodegaproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadobodegaproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadobodegaproductoLogic.saveEstadoBodegaProductos();//WithConnection
						//estadobodegaproductoLogic.getSetVersionRowEstadoBodegaProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadobodegaproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadobodegaproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadobodegaproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadobodegaproductoAux,estadobodegaproductoLogic.getEstadoBodegaProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadobodegaproductoAux,estadobodegaproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoLogic.getEstadoBodegaProductos().addAll(this.estadobodegaproductosEliminados);
					
					estadobodegaproductoLogic.saveEstadoBodegaProductos();//WithConnection
					//estadobodegaproductoLogic.getSetVersionRowEstadoBodegaProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadobodegaproductosEliminados= new ArrayList<EstadoBodegaProducto>();		
			}
			
			if(this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Bodega Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Bodega Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadobodegaproducto=estadobodegaproductoAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessEstadoBodegaProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoBodegaProducto estadobodegaproductoLocal) throws Exception {
		
		if(this.estadobodegaproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoBodegaProducto estadobodegaproductoLocal) throws Exception {	
		if(this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoBodegaProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadobodegaproductoValidator.getInvalidValues(this.estadobodegaproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoBodegaProducto estadobodegaproducto,List<EstadoBodegaProducto> estadobodegaproductos) throws Exception {
		try	{		
			EstadoBodegaProductoConstantesFunciones.actualizarLista(estadobodegaproducto,estadobodegaproductos,this.estadobodegaproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoBodegaProducto estadobodegaproducto,List<EstadoBodegaProducto> estadobodegaproductos) throws Exception {
		try	{			
			EstadoBodegaProductoConstantesFunciones.actualizarSelectedLista(estadobodegaproducto,estadobodegaproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoBodegaProducto> estadobodegaproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadobodegaproductosLocal=this.estadobodegaproductoLogic.getEstadoBodegaProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadobodegaproductosLocal=this.estadobodegaproductos;
			}
			//ARCHITECTURE
		
			for(EstadoBodegaProducto estadobodegaproductoLocal:estadobodegaproductosLocal) {
				if(this.permiteMantenimiento(estadobodegaproductoLocal) && estadobodegaproductoLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+EstadoBodegaProductoConstantesFunciones.getEstadoBodegaProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoBodegaProductoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoBodegaProducto.jLabelcodigoEstadoBodegaProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoBodegaProductoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoBodegaProducto.jLabelnombreEstadoBodegaProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoBodegaProductoConstantesFunciones.ESDEFECTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoBodegaProducto.jLabeles_defectoEstadoBodegaProducto,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoBodegaProducto.jLabelcodigoEstadoBodegaProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoBodegaProducto.jLabelnombreEstadoBodegaProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoBodegaProducto.jLabeles_defectoEstadoBodegaProducto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoBodegaProducto--;	
		
		
		this.estadobodegaproductoAux=new EstadoBodegaProducto();
		
		this.estadobodegaproductoAux.setId(this.iIdNuevoEstadoBodegaProducto);
		this.estadobodegaproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadobodegaproductoLogic.getEstadoBodegaProductos().add(this.estadobodegaproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadobodegaproductos.add(this.estadobodegaproductoAux);
		}
		//ARCHITECTURE
		
		this.estadobodegaproducto=this.estadobodegaproductoAux;
		
		if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoBodegaProducto(this.estadobodegaproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoBodegaProducto(this.estadobodegaproducto);
		}
				
		//this.setDefaultControlesEstadoBodegaProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoBodegaProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoBodegaProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoBodegaProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoBodegaProducto(this.estadobodegaproductoBean,this.estadobodegaproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoBodegaProducto(this.estadobodegaproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadobodegaproductoSessionBean.getConGuardarRelaciones()) {
			classes=EstadoBodegaProductoConstantesFunciones.getClassesRelationshipsOfEstadoBodegaProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadobodegaproductoReturnGeneral=estadobodegaproductoLogic.procesarEventosEstadoBodegaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadobodegaproductoLogic.getEstadoBodegaProductos(),this.estadobodegaproducto,this.estadobodegaproductoParameterGeneral,this.isEsNuevoEstadoBodegaProducto,classes);//this.estadobodegaproductoLogic.getEstadoBodegaProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoBodegaProducto(this.estadobodegaproductoReturnGeneral,this.estadobodegaproductoBean,false);
		
		if(this.estadobodegaproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoBodegaProducto(this.estadobodegaproductoReturnGeneral.getEstadoBodegaProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoBodegaProducto(this.estadobodegaproductoReturnGeneral.getEstadoBodegaProducto());
		}
		
		if(this.estadobodegaproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoBodegaProducto(this.estadobodegaproductoReturnGeneral.getEstadoBodegaProducto(),classes);//this.estadobodegaproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoBodegaProducto(this.estadobodegaproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoBodegaProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoBodegaProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoBodegaProducto(false);
						
			if(estadobodegaproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoBodegaProducto();
			}
			
			this.actualizarVisualTableDatosEstadoBodegaProducto();
			
			this.jTableDatosEstadoBodegaProducto.setRowSelectionInterval(this.getIndiceNuevoEstadoBodegaProducto(), this.getIndiceNuevoEstadoBodegaProducto());
			
			this.seleccionarFilaTablaEstadoBodegaProductoActual();
						
			this.actualizarEstadoCeldasBotonesEstadoBodegaProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoBodegaProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldcodigoEstadoBodegaProducto.setEnabled(isHabilitar && this.estadobodegaproductoConstantesFunciones.activarcodigoEstadoBodegaProducto);
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextAreanombreEstadoBodegaProducto.setEnabled(isHabilitar && this.estadobodegaproductoConstantesFunciones.activarnombreEstadoBodegaProducto);
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jCheckBoxes_defectoEstadoBodegaProducto.setEnabled(isHabilitar && this.estadobodegaproductoConstantesFunciones.activares_defectoEstadoBodegaProducto);	
		
	};
	
	public void setDefaultControlesEstadoBodegaProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoBodegaProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadobodegaproductoSessionBean.setConGuardarRelaciones(true);			
			this.estadobodegaproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jTabbedPaneRelacionesEstadoBodegaProducto.setVisible(true);
			
					
		} else {
			//this.estadobodegaproductoSessionBean.setConGuardarRelaciones(false);			
			this.estadobodegaproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jTabbedPaneRelacionesEstadoBodegaProducto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEstadoBodegaProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoBodegaProducto estadobodegaproductoAux:this.estadobodegaproductoLogic.getEstadoBodegaProductos()) {
				if(estadobodegaproductoAux.getId().equals(this.iIdNuevoEstadoBodegaProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoBodegaProducto estadobodegaproductoAux:this.estadobodegaproductos) {
				if(estadobodegaproductoAux.getId().equals(this.iIdNuevoEstadoBodegaProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoBodegaProducto estadobodegaproductoAux:this.estadobodegaproductoLogic.getEstadoBodegaProductos()) {
				if(estadobodegaproductoAux.getId().equals(estadobodegaproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoBodegaProducto estadobodegaproductoAux:this.estadobodegaproductos) {
				if(estadobodegaproductoAux.getId().equals(estadobodegaproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoBodegaProducto estadobodegaproductoAux:this.estadobodegaproductoLogic.getEstadoBodegaProductos()) {
				if(estadobodegaproductoAux.getEstadoBodegaProductoOriginal().getId().equals(estadobodegaproductoOriginal.getId())) {
					existe=true;
					estadobodegaproductoOriginal.setId(estadobodegaproductoAux.getId());
					estadobodegaproductoOriginal.setVersionRow(estadobodegaproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoBodegaProducto estadobodegaproductoAux:this.estadobodegaproductos) {
				if(estadobodegaproductoAux.getEstadoBodegaProductoOriginal().getId().equals(estadobodegaproductoOriginal.getId())) {
					existe=true;
					estadobodegaproductoOriginal.setId(estadobodegaproductoAux.getId());
					estadobodegaproductoOriginal.setVersionRow(estadobodegaproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoBodegaProducto(Boolean esParaCancelar) throws Exception {
		estadobodegaproductosAux=new ArrayList<EstadoBodegaProducto>();
		estadobodegaproductoAux=new EstadoBodegaProducto();
		
		if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoBodegaProducto estadobodegaproductoAux:this.estadobodegaproductoLogic.getEstadoBodegaProductos()) {
					if(estadobodegaproductoAux.getId()<0) {
						estadobodegaproductosAux.add(estadobodegaproductoAux);
					}		
				}
				this.iIdNuevoEstadoBodegaProducto=0L;
				this.estadobodegaproductoLogic.getEstadoBodegaProductos().removeAll(estadobodegaproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoBodegaProducto estadobodegaproductoAux:this.estadobodegaproductos) {
					if(estadobodegaproductoAux.getId()<0) {
						estadobodegaproductosAux.add(estadobodegaproductoAux);
					}		
				}
				this.iIdNuevoEstadoBodegaProducto=0L;
				this.estadobodegaproductos.removeAll(estadobodegaproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoBodegaProducto 
					&& this.estadobodegaproductoLogic.getEstadoBodegaProductos().size()>0
					) {
					estadobodegaproductoAux=this.estadobodegaproductoLogic.getEstadoBodegaProductos().get(this.estadobodegaproductoLogic.getEstadoBodegaProductos().size() - 1);
				
					if(estadobodegaproductoAux.getId()<0) {
						this.estadobodegaproductoLogic.getEstadoBodegaProductos().remove(estadobodegaproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoBodegaProducto && this.estadobodegaproductos.size()>0) {
					estadobodegaproductoAux=this.estadobodegaproductos.get(this.estadobodegaproductos.size() - 1);
				
					if(estadobodegaproductoAux.getId()<0) {
						this.estadobodegaproductos.remove(estadobodegaproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoBodegaProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadobodegaproducto.getId()<0) {
				this.estadobodegaproductoLogic.getEstadoBodegaProductos().remove(this.estadobodegaproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadobodegaproducto.getId()<0) {
				this.estadobodegaproductos.remove(this.estadobodegaproducto);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoBodegaProducto(List<EstadoBodegaProducto> estadobodegaproductosAux) throws Exception {
		EstadoBodegaProductoConstantesFunciones.setEstadosInicialesEstadoBodegaProducto(estadobodegaproductosAux);
	}
	
	public void setEstadosInicialesEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproductoAux) throws Exception {
		EstadoBodegaProductoConstantesFunciones.setEstadosInicialesEstadoBodegaProducto(estadobodegaproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoBodegaProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoBodegaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoBodegaProductoActual()) {
				if(!this.isEsNuevoEstadoBodegaProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoBodegaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoBodegaProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoBodegaProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Bodega Producto ?", "MANTENIMIENTO DE Estado Bodega Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoBodegaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoBodegaProducto estadobodegaproducto) throws Exception {
		EstadoBodegaProductoConstantesFunciones.seleccionarAsignar(this.estadobodegaproducto,estadobodegaproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoBodegaProducto=this.isPermisoActualizarOriginalEstadoBodegaProducto;
			
			
			this.seleccionarAsignar(estadobodegaproducto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoBodegaProductoConstantesFunciones.quitarEspaciosEstadoBodegaProducto(this.estadobodegaproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoBodegaProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadobodegaproductoSessionBean.setsFuncionBusquedaRapida(this.estadobodegaproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoBodegaProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoBodegaProducto(esParaCancelar);				
				this.cancelarNuevoEstadoBodegaProducto(esParaCancelar);								
			}
			
			this.estadobodegaproducto=new EstadoBodegaProducto();
			
			this.inicializarEstadoBodegaProducto();
			
			this.actualizarEstadoCeldasBotonesEstadoBodegaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoBodegaProducto() throws Exception {
		try {
			EstadoBodegaProductoConstantesFunciones.inicializarEstadoBodegaProducto(this.estadobodegaproducto);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadobodegaproductoLogic.getEstadoBodegaProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoBodegaProductos(String sAccionBusqueda,List<EstadoBodegaProducto> estadobodegaproductosParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="EstadoBodegaProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoBodegaProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoBodegaProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoBodegaProducto"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Estado Bodega Productos");		
		parameters.put("busquedapor", EstadoBodegaProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoBodegaProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoBodegaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoBodegaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoBodegaProducto=new JRBeanArrayDataSource(EstadoBodegaProductoJInternalFrame.TraerEstadoBodegaProductoBeans(estadobodegaproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoBodegaProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoBodegaProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoBodegaProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoBodegaProductoBean.TraerEstadoBodegaProductoBeans(estadobodegaproductosParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteEstadoBodegaProductos(sAccionBusqueda,sTipoArchivoReporte,estadobodegaproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoBodegaProductos(sAccionBusqueda,sTipoArchivoReporte,estadobodegaproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoBodegaProductoActionPerformed(null);
					//this.generarExcelReporteEstadoBodegaProductos(sAccionBusqueda,sTipoArchivoReporte,estadobodegaproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoBodegaProductos(sAccionBusqueda,sTipoArchivoReporte,estadobodegaproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoBodegaProductos(sAccionBusqueda,sTipoArchivoReporte,estadobodegaproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoBodegaProductos(sAccionBusqueda,sTipoArchivoReporte,estadobodegaproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoBodegaProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoBodegaProducto> estadobodegaproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadobodegaproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoBodegaProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoBodegaProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoBodegaProducto estadobodegaproducto : estadobodegaproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoBodegaProductoConstantesFunciones.generarExcelReporteDataEstadoBodegaProducto("NORMAL",row,workbook,estadobodegaproducto,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Bodega Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoBodegaProducto(String sTipo,Row row,Workbook workbook) {
		
		EstadoBodegaProductoConstantesFunciones.generarExcelReporteHeaderEstadoBodegaProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoBodegaProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoBodegaProducto> estadobodegaproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadobodegaproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoBodegaProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoBodegaProducto estadobodegaproducto : estadobodegaproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoBodegaProductoConstantesFunciones.getEstadoBodegaProductoDescripcion(estadobodegaproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadobodegaproducto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadobodegaproducto.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(estadobodegaproducto.getes_defecto()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Bodega Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoBodegaProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoBodegaProducto> estadobodegaproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoBodegaProducto> estadobodegaproductosRespaldo=null;
		
		classes=EstadoBodegaProductoConstantesFunciones.getClassesRelationshipsOfEstadoBodegaProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadobodegaproductoLogic.setDatosCliente(this.datosCliente);
		this.estadobodegaproductoLogic.setDatosDeep(this.datosDeep);
		this.estadobodegaproductoLogic.setIsConDeep(true);
		
		estadobodegaproductosRespaldo=this.estadobodegaproductoLogic.getEstadoBodegaProductos();
		
		this.estadobodegaproductoLogic.setEstadoBodegaProductos(estadobodegaproductosParaReportes);	
		this.estadobodegaproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadobodegaproductosParaReportes=this.estadobodegaproductoLogic.getEstadoBodegaProductos();
		this.estadobodegaproductoLogic.setEstadoBodegaProductos(estadobodegaproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadobodegaproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoBodegaProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoBodegaProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoBodegaProducto estadobodegaproducto : estadobodegaproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoBodegaProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoBodegaProductoConstantesFunciones.generarExcelReporteDataEstadoBodegaProducto("NORMAL",row,workbook,estadobodegaproducto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoBodegaProductoConstantesFunciones.getEstadoBodegaProductoDescripcion(estadobodegaproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Bodega Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoBodegaProducto() throws Exception {		
		this.startProcessEstadoBodegaProducto(true);
	}
	
	public void startProcessEstadoBodegaProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoBodegaProducto, this.jScrollPanelDatosEstadoBodegaProducto,this.jPanelPaginacionEstadoBodegaProducto, this.jScrollPanelDatosEdicionEstadoBodegaProducto, this.jPanelAccionesEstadoBodegaProducto,this.jPanelAccionesFormularioEstadoBodegaProducto,this.jmenuBarEstadoBodegaProducto,this.jmenuBarDetalleEstadoBodegaProducto,this.jTtoolBarEstadoBodegaProducto,this.jTtoolBarDetalleEstadoBodegaProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoBodegaProducto=null; 
		
		final JPanel jPanelParametrosReportesEstadoBodegaProducto=this.jPanelParametrosReportesEstadoBodegaProducto;
		//final JScrollPane jScrollPanelDatosEstadoBodegaProducto=this.jScrollPanelDatosEstadoBodegaProducto;
		final JTable jTableDatosEstadoBodegaProducto=this.jTableDatosEstadoBodegaProducto;		
		final JPanel jPanelPaginacionEstadoBodegaProducto=this.jPanelPaginacionEstadoBodegaProducto;
		//final JScrollPane jScrollPanelDatosEdicionEstadoBodegaProducto=this.jScrollPanelDatosEdicionEstadoBodegaProducto;
		final JPanel jPanelAccionesEstadoBodegaProducto=this.jPanelAccionesEstadoBodegaProducto;
		
		JPanel jPanelCamposAuxiliarEstadoBodegaProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoBodegaProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
			jPanelCamposAuxiliarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jPanelCamposEstadoBodegaProducto;
			jPanelAccionesFormularioAuxiliarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jPanelAccionesFormularioEstadoBodegaProducto;
		}
		
		final JPanel jPanelCamposEstadoBodegaProducto=jPanelCamposAuxiliarEstadoBodegaProducto;
		final JPanel jPanelAccionesFormularioEstadoBodegaProducto=jPanelAccionesFormularioAuxiliarEstadoBodegaProducto;
		
		
		final JMenuBar jmenuBarEstadoBodegaProducto=this.jmenuBarEstadoBodegaProducto;
		final JToolBar jTtoolBarEstadoBodegaProducto=this.jTtoolBarEstadoBodegaProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoBodegaProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoBodegaProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
			jmenuBarDetalleAuxiliarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jmenuBarDetalleEstadoBodegaProducto;
			jTtoolBarDetalleAuxiliarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jTtoolBarDetalleEstadoBodegaProducto;
		}
		
		final JMenuBar jmenuBarDetalleEstadoBodegaProducto=jmenuBarDetalleAuxiliarEstadoBodegaProducto;
		final JToolBar jTtoolBarDetalleEstadoBodegaProducto=jTtoolBarDetalleAuxiliarEstadoBodegaProducto;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoBodegaProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoBodegaProducto;
			processRunnable.jTableDatos=jTableDatosEstadoBodegaProducto;
			processRunnable.jPanelCampos=jPanelCamposEstadoBodegaProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoBodegaProducto;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoBodegaProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoBodegaProducto;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoBodegaProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoBodegaProducto;
			processRunnable.jTtoolBar=jTtoolBarEstadoBodegaProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoBodegaProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoBodegaProducto ,jPanelParametrosReportesEstadoBodegaProducto,jTableDatosEstadoBodegaProducto, /*jScrollPanelDatosEstadoBodegaProducto,*/jPanelCamposEstadoBodegaProducto,jPanelPaginacionEstadoBodegaProducto, /*jScrollPanelDatosEdicionEstadoBodegaProducto,*/ jPanelAccionesEstadoBodegaProducto,jPanelAccionesFormularioEstadoBodegaProducto,jmenuBarEstadoBodegaProducto,jmenuBarDetalleEstadoBodegaProducto,jTtoolBarEstadoBodegaProducto,jTtoolBarDetalleEstadoBodegaProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoBodegaProducto, jScrollPanelDatosEstadoBodegaProducto,jPanelPaginacionEstadoBodegaProducto, jScrollPanelDatosEdicionEstadoBodegaProducto, jPanelAccionesEstadoBodegaProducto,jPanelAccionesFormularioEstadoBodegaProducto,jmenuBarEstadoBodegaProducto,jmenuBarDetalleEstadoBodegaProducto,jTtoolBarEstadoBodegaProducto,jTtoolBarDetalleEstadoBodegaProducto);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessEstadoBodegaProducto() {// throws Exception 
		this.finishProcessEstadoBodegaProducto(true);
	}
	
	public void finishProcessEstadoBodegaProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoBodegaProducto, this.jScrollPanelDatosEstadoBodegaProducto,this.jPanelPaginacionEstadoBodegaProducto, this.jScrollPanelDatosEdicionEstadoBodegaProducto, this.jPanelAccionesEstadoBodegaProducto,this.jPanelAccionesFormularioEstadoBodegaProducto,this.jmenuBarEstadoBodegaProducto,this.jmenuBarDetalleEstadoBodegaProducto,this.jTtoolBarEstadoBodegaProducto,this.jTtoolBarDetalleEstadoBodegaProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoBodegaProducto=null; 
		
		final JPanel jPanelParametrosReportesEstadoBodegaProducto=this.jPanelParametrosReportesEstadoBodegaProducto;
		//final JScrollPane jScrollPanelDatosEstadoBodegaProducto=this.jScrollPanelDatosEstadoBodegaProducto;
		final JTable jTableDatosEstadoBodegaProducto=this.jTableDatosEstadoBodegaProducto;		
		final JPanel jPanelPaginacionEstadoBodegaProducto=this.jPanelPaginacionEstadoBodegaProducto;
		//final JScrollPane jScrollPanelDatosEdicionEstadoBodegaProducto=this.jScrollPanelDatosEdicionEstadoBodegaProducto;
		final JPanel jPanelAccionesEstadoBodegaProducto=this.jPanelAccionesEstadoBodegaProducto;
		
		JPanel jPanelCamposAuxiliarEstadoBodegaProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoBodegaProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
			jPanelCamposAuxiliarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jPanelCamposEstadoBodegaProducto;
			jPanelAccionesFormularioAuxiliarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jPanelAccionesFormularioEstadoBodegaProducto;
		}
		
		final JPanel jPanelCamposEstadoBodegaProducto=jPanelCamposAuxiliarEstadoBodegaProducto;
		final JPanel jPanelAccionesFormularioEstadoBodegaProducto=jPanelAccionesFormularioAuxiliarEstadoBodegaProducto;
		
		
		final JMenuBar jmenuBarEstadoBodegaProducto=this.jmenuBarEstadoBodegaProducto;		
		final JToolBar jTtoolBarEstadoBodegaProducto=this.jTtoolBarEstadoBodegaProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoBodegaProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoBodegaProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
			jmenuBarDetalleAuxiliarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jmenuBarDetalleEstadoBodegaProducto;
			jTtoolBarDetalleAuxiliarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jTtoolBarDetalleEstadoBodegaProducto;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoBodegaProducto=jmenuBarDetalleAuxiliarEstadoBodegaProducto;
		final JToolBar jTtoolBarDetalleEstadoBodegaProducto=jTtoolBarDetalleAuxiliarEstadoBodegaProducto;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoBodegaProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoBodegaProducto;
			processRunnable.jTableDatos=jTableDatosEstadoBodegaProducto;
			processRunnable.jPanelCampos=jPanelCamposEstadoBodegaProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoBodegaProducto;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoBodegaProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoBodegaProducto;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoBodegaProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoBodegaProducto;
			processRunnable.jTtoolBar=jTtoolBarEstadoBodegaProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoBodegaProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoBodegaProducto ,jPanelParametrosReportesEstadoBodegaProducto, jTableDatosEstadoBodegaProducto,/*jScrollPanelDatosEstadoBodegaProducto,*/jPanelCamposEstadoBodegaProducto,jPanelPaginacionEstadoBodegaProducto, /*jScrollPanelDatosEdicionEstadoBodegaProducto,*/ jPanelAccionesEstadoBodegaProducto,jPanelAccionesFormularioEstadoBodegaProducto,jmenuBarEstadoBodegaProducto,jmenuBarDetalleEstadoBodegaProducto,jTtoolBarEstadoBodegaProducto,jTtoolBarDetalleEstadoBodegaProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoBodegaProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoBodegaProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoBodegaProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoBodegaProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoBodegaProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoBodegaProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoBodegaProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoBodegaProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoBodegaProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadobodegaproductoConstantesFunciones.getsFinalQueryEstadoBodegaProducto();
		String  finalQueryPaginacionTodos=this.estadobodegaproductoConstantesFunciones.getsFinalQueryEstadoBodegaProducto();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoBodegaProductoConstantesFunciones.getArrayColumnasGlobalesNoEstadoBodegaProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoBodegaProductoConstantesFunciones.getArrayColumnasGlobalesEstadoBodegaProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoBodegaProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadobodegaproductosEliminados= new ArrayList<EstadoBodegaProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoBodegaProducto();
		
				///*EstadoBodegaProductoSessionBean*/this.estadobodegaproductoSessionBean=new EstadoBodegaProductoSessionBean();
			
			if(this.estadobodegaproductoSessionBean==null) {
				this.estadobodegaproductoSessionBean=new EstadoBodegaProductoSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=EstadoBodegaProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoBodegaProductoConstantesFunciones.getClassesForeignKeysOfEstadoBodegaProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadobodegaproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadobodegaproductosAux= new ArrayList<EstadoBodegaProducto>();
			
				
			estadobodegaproductoLogic.setDatosCliente(this.datosCliente);
			estadobodegaproductoLogic.setDatosDeep(this.datosDeep);
			estadobodegaproductoLogic.setIsConDeep(true);
			
			
			estadobodegaproductoLogic.getEstadoBodegaProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadobodegaproductoLogic.getTodosEstadoBodegaProductos(finalQueryGlobal,pagination);
					
					//estadobodegaproductoLogic.getTodosEstadoBodegaProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadobodegaproductoLogic.getEstadoBodegaProductos()==null|| estadobodegaproductoLogic.getEstadoBodegaProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadobodegaproductosAux= new ArrayList<EstadoBodegaProducto>();
							estadobodegaproductosAux.addAll(estadobodegaproductoLogic.getEstadoBodegaProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadobodegaproductosAux= new ArrayList<EstadoBodegaProducto>();
							estadobodegaproductosAux.addAll(estadobodegaproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadobodegaproductoLogic.getTodosEstadoBodegaProductos(finalQueryGlobal+"",this.pagination);												
							
							//estadobodegaproductoLogic.getTodosEstadoBodegaProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoBodegaProductos("Todos",estadobodegaproductoLogic.getEstadoBodegaProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadobodegaproductoLogic.setEstadoBodegaProductos(new ArrayList<EstadoBodegaProducto>());					
							estadobodegaproductoLogic.getEstadoBodegaProductos().addAll(estadobodegaproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadobodegaproductos=new ArrayList<EstadoBodegaProducto>();
							estadobodegaproductos.addAll(estadobodegaproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoBodegaProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoBodegaProducto=this.idActual;
				
				} else if(this.idEstadoBodegaProductoActual!=null && this.idEstadoBodegaProductoActual!=0L) {
					idEstadoBodegaProducto=idEstadoBodegaProductoActual;
				}
				
					
				this.sDetalleReporte=EstadoBodegaProductoConstantesFunciones.getDetalleIndicePorId(idEstadoBodegaProducto);
				
				this.estadobodegaproductos=new ArrayList<EstadoBodegaProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadobodegaproductoLogic.getEntity(idEstadoBodegaProducto);
					
					//estadobodegaproductoLogic.getEntityWithConnection(idEstadoBodegaProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadobodegaproductoLogic.setEstadoBodegaProductos(new ArrayList<EstadoBodegaProducto>());
					estadobodegaproductoLogic.getEstadoBodegaProductos().add(estadobodegaproductoLogic.getEstadoBodegaProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadobodegaproductos=new ArrayList<EstadoBodegaProducto>();
					this.estadobodegaproductos.add(estadobodegaproducto);
				}
				
				if(estadobodegaproductoLogic.getEstadoBodegaProducto()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoBodegaProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoBodegaProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadobodegaproductoLogic.getEstadoBodegaProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadobodegaproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadobodegaproductoLogic.getEstadoBodegaProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadobodegaproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoBodegaProducto estadobodegaproducto) {
		Boolean permite=true;
		
		if(this.estadobodegaproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoBodegaProductoConstantesFunciones.getOrderByListaEstadoBodegaProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoBodegaProductoConstantesFunciones.getOrderByListaEstadoBodegaProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoBodegaProducto estadobodegaproducto:estadobodegaproductoLogic.getEstadoBodegaProductos()) {
				if(estadobodegaproducto.getsType().equals(Constantes2.S_TOTALES)) {
					estadobodegaproductoTotales=estadobodegaproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoBodegaProducto estadobodegaproducto:this.estadobodegaproductos) {
				if(estadobodegaproducto.getsType().equals(Constantes2.S_TOTALES)) {
					estadobodegaproductoTotales=estadobodegaproducto;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.estadobodegaproductoAux=new EstadoBodegaProducto();
			this.estadobodegaproductoAux.setsType(Constantes2.S_TOTALES);
			this.estadobodegaproductoAux.setIsNew(false);
			this.estadobodegaproductoAux.setIsChanged(false);
			this.estadobodegaproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoBodegaProductoConstantesFunciones.TotalizarValoresFilaEstadoBodegaProducto(this.estadobodegaproductoLogic.getEstadoBodegaProductos(),this.estadobodegaproductoAux);
				
				this.estadobodegaproductoLogic.getEstadoBodegaProductos().add(this.estadobodegaproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoBodegaProductoConstantesFunciones.TotalizarValoresFilaEstadoBodegaProducto(this.estadobodegaproductos,this.estadobodegaproductoAux);
				
				this.estadobodegaproductos.add(this.estadobodegaproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadobodegaproductoTotales=new EstadoBodegaProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadobodegaproductoLogic.getEstadoBodegaProductos().remove(estadobodegaproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadobodegaproductos.remove(estadobodegaproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadobodegaproductoTotales=new EstadoBodegaProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoBodegaProducto estadobodegaproducto:estadobodegaproductoLogic.getEstadoBodegaProductos()) {
				if(estadobodegaproducto.getsType().equals(Constantes2.S_TOTALES)) {
					estadobodegaproductoTotales=estadobodegaproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoBodegaProductoConstantesFunciones.TotalizarValoresFilaEstadoBodegaProducto(this.estadobodegaproductoLogic.getEstadoBodegaProductos(),estadobodegaproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoBodegaProducto estadobodegaproducto:this.estadobodegaproductos) {
				if(estadobodegaproducto.getsType().equals(Constantes2.S_TOTALES)) {
					estadobodegaproductoTotales=estadobodegaproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoBodegaProductoConstantesFunciones.TotalizarValoresFilaEstadoBodegaProducto(this.estadobodegaproductos,estadobodegaproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoBodegaProductoPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoBodegaProductoPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadobodegaproductoLogic.getEstadoBodegaProductoPorCodigo(codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosEstadoBodegaProducto() {
		this.isPermisoTodoEstadoBodegaProducto=false;
		this.isPermisoNuevoEstadoBodegaProducto=false;
		this.isPermisoActualizarEstadoBodegaProducto=false;
		this.isPermisoActualizarOriginalEstadoBodegaProducto=false;
		this.isPermisoEliminarEstadoBodegaProducto=false;
		this.isPermisoGuardarCambiosEstadoBodegaProducto=false;
		this.isPermisoConsultaEstadoBodegaProducto=false;
		this.isPermisoBusquedaEstadoBodegaProducto=false;
		this.isPermisoReporteEstadoBodegaProducto=false;		
		this.isPermisoOrdenEstadoBodegaProducto=false;		
		this.isPermisoPaginacionMedioEstadoBodegaProducto=false;		
		this.isPermisoPaginacionAltoEstadoBodegaProducto=false;
		this.isPermisoPaginacionTodoEstadoBodegaProducto=false;
		this.isPermisoCopiarEstadoBodegaProducto=false;		
		this.isPermisoVerFormEstadoBodegaProducto=false;		
		this.isPermisoDuplicarEstadoBodegaProducto=false;		
		this.isPermisoOrdenEstadoBodegaProducto=false;		
	}
	
	public void setPermisosUsuarioEstadoBodegaProducto(Boolean isPermiso) {
		this.isPermisoTodoEstadoBodegaProducto=isPermiso;
		this.isPermisoNuevoEstadoBodegaProducto=isPermiso;
		this.isPermisoActualizarEstadoBodegaProducto=isPermiso;
		this.isPermisoActualizarOriginalEstadoBodegaProducto=isPermiso;
		this.isPermisoEliminarEstadoBodegaProducto=isPermiso;
		this.isPermisoGuardarCambiosEstadoBodegaProducto=isPermiso;
		this.isPermisoConsultaEstadoBodegaProducto=isPermiso;
		this.isPermisoBusquedaEstadoBodegaProducto=isPermiso;
		this.isPermisoReporteEstadoBodegaProducto=isPermiso;
		this.isPermisoOrdenEstadoBodegaProducto=isPermiso;		
		this.isPermisoPaginacionMedioEstadoBodegaProducto=isPermiso;		
		this.isPermisoPaginacionAltoEstadoBodegaProducto=isPermiso;		
		this.isPermisoPaginacionTodoEstadoBodegaProducto=isPermiso;		
		this.isPermisoCopiarEstadoBodegaProducto=isPermiso;		
		this.isPermisoVerFormEstadoBodegaProducto=isPermiso;		
		this.isPermisoDuplicarEstadoBodegaProducto=isPermiso;
		this.isPermisoOrdenEstadoBodegaProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoBodegaProducto(Boolean isPermiso) {
		//this.isPermisoTodoEstadoBodegaProducto=isPermiso;
		this.isPermisoNuevoEstadoBodegaProducto=isPermiso;
		this.isPermisoActualizarEstadoBodegaProducto=isPermiso;
		this.isPermisoActualizarOriginalEstadoBodegaProducto=isPermiso;
		this.isPermisoEliminarEstadoBodegaProducto=isPermiso;
		this.isPermisoGuardarCambiosEstadoBodegaProducto=isPermiso;
		//this.isPermisoConsultaEstadoBodegaProducto=isPermiso;
		//this.isPermisoBusquedaEstadoBodegaProducto=isPermiso;
		//this.isPermisoReporteEstadoBodegaProducto=isPermiso;
		//this.isPermisoOrdenEstadoBodegaProducto=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoBodegaProducto=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoBodegaProducto=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoBodegaProducto=isPermiso;		
		//this.isPermisoCopiarEstadoBodegaProducto=isPermiso;		
		//this.isPermisoDuplicarEstadoBodegaProducto=isPermiso;
		//this.isPermisoOrdenEstadoBodegaProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoBodegaProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EstadoBodegaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoBodegaProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoBodegaProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoBodegaProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoBodegaProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoBodegaProductoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEstadoBodegaProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoBodegaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoBodegaProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoBodegaProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoBodegaProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoBodegaProducto=this.isPermisoActualizarEstadoBodegaProducto;
			this.isPermisoEliminarEstadoBodegaProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoBodegaProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoBodegaProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoBodegaProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoBodegaProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoBodegaProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoBodegaProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoBodegaProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoBodegaProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoBodegaProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoBodegaProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoBodegaProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoBodegaProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoBodegaProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoBodegaProducto.setToolTipText(this.jTableDatosEstadoBodegaProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoBodegaProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoBodegaProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoBodegaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(EstadoBodegaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioEstadoBodegaProducto() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeyEstadoBodegaProductoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoBodegaProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoBodegaProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoBodegaProductoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoBodegaProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoBodegaProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoBodegaProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoBodegaProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoBodegaProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoBodegaProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproducto)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproducto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoBodegaProducto()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoBodegaProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoBodegaProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoBodegaProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoBodegaProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoBodegaProducto()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoBodegaProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoBodegaProducto()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoBodegaProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoBodegaProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoBodegaProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadobodegaproductoSessionBean=new EstadoBodegaProductoSessionBean(); 
		this.estadobodegaproductoConstantesFunciones=new EstadoBodegaProductoConstantesFunciones(); 
		this.estadobodegaproductoBean=new EstadoBodegaProducto();//(this.estadobodegaproductoConstantesFunciones); 		
		this.estadobodegaproductoReturnGeneral=new EstadoBodegaProductoParameterReturnGeneral(); 
		
		this.estadobodegaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadobodegaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoBodegaProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoBodegaProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoBodegaProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoBodegaProducto(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.estadobodegaproductoConstantesFunciones=new EstadoBodegaProductoConstantesFunciones(); 
			this.estadobodegaproductoBean=new EstadoBodegaProducto();//this.estadobodegaproductoConstantesFunciones); 			
			this.estadobodegaproductoReturnGeneral=new EstadoBodegaProductoParameterReturnGeneral(); 
		
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Bodega Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadobodegaproducto=new EstadoBodegaProducto();
			this.estadobodegaproductos = new ArrayList<EstadoBodegaProducto>();
			this.estadobodegaproductosAux = new ArrayList<EstadoBodegaProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic=new EstadoBodegaProductoLogic();
				this.estadobodegaproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estadobodegaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadobodegaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoBodegaProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoBodegaProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoBodegaProducto);	
					}
					
					if(this.jInternalFrameImportacionEstadoBodegaProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoBodegaProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoBodegaProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoBodegaProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoBodegaProducto);
				this.jInternalFrameDetalleFormEstadoBodegaProducto.setVisible(false);
				this.jInternalFrameDetalleFormEstadoBodegaProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoBodegaProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoBodegaProducto);
					this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoBodegaProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoBodegaProducto);
					this.jInternalFrameImportacionEstadoBodegaProducto.setVisible(false);
					this.jInternalFrameImportacionEstadoBodegaProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoBodegaProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoBodegaProducto);
					this.jInternalFrameOrderByEstadoBodegaProducto.setVisible(false);
					this.jInternalFrameOrderByEstadoBodegaProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoBodegaProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoBodegaProductoConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.estadobodegaproductoReturnGeneral=new EstadoBodegaProductoParameterReturnGeneral();
			
			this.estadobodegaproductoParameterGeneral=new EstadoBodegaProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadobodegaproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(EstadoBodegaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoBodegaProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadobodegaproductoSessionBean.getEsGuardarRelacionado(),this.estadobodegaproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoBodegaProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadobodegaproductoSessionBean.getEsGuardarRelacionado(),this.estadobodegaproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoEstadoBodegaProducto=false;
			this.isVisibilidadCeldaDuplicarEstadoBodegaProducto=true;
			this.isVisibilidadCeldaCopiarEstadoBodegaProducto=true;
			this.isVisibilidadCeldaVerFormEstadoBodegaProducto=true;
			this.isVisibilidadCeldaOrdenEstadoBodegaProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto=false;
			this.isVisibilidadCeldaModificarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaActualizarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaEliminarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaCancelarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaGuardarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoBodegaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoBodegaProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoBodegaProducto(false);
			
			this.setPermisosUsuarioEstadoBodegaProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.estadobodegaproductoSessionBean.getEsGuardarRelacionado() && this.estadobodegaproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoBodegaProductoClasesRelacionadas();
			}
			
			if(this.estadobodegaproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoBodegaProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoBodegaProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoBodegaProducto();
			}
			
			if(!this.isPermisoBusquedaEstadoBodegaProducto) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoBodegaProducto,this.isPermisoPaginacionMedioEstadoBodegaProducto,this.isPermisoPaginacionTodoEstadoBodegaProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoBodegaProductoConstantesFunciones.getTiposSeleccionarEstadoBodegaProducto());
				
				this.tiposColumnasSelect=EstadoBodegaProductoConstantesFunciones.getTiposSeleccionarEstadoBodegaProducto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoBodegaProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoBodegaProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoBodegaProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoBodegaProducto() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadobodegaproductoImplementable= (EstadoBodegaProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoBodegaProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadobodegaproductoImplementableHome= (EstadoBodegaProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoBodegaProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadobodegaproductos= new ArrayList<EstadoBodegaProducto>();
			this.estadobodegaproductosEliminados= new ArrayList<EstadoBodegaProducto>();
						
			this.isEsNuevoEstadoBodegaProducto=false;
			this.esParaAccionDesdeFormularioEstadoBodegaProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoBodegaProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoBodegaProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoBodegaProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoBodegaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoBodegaProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoBodegaProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoBodegaProducto();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoBodegaProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoBodegaProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoBodegaProducto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoBodegaProducto")) {
				iIndex=this.jInternalFrameDetalleFormEstadoBodegaProducto.jTabbedPaneRelacionesEstadoBodegaProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoBodegaProducto.jTabbedPaneRelacionesEstadoBodegaProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoBodegaProducto();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyEstadoBodegaProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoBodegaProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoBodegaProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoBodegaProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoBodegaProducto();
		
		this.cargarCombosFrameForeignKeyEstadoBodegaProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoBodegaProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoBodegaProducto();
		}
	}
	
	
	
	public void jButtonNuevoEstadoBodegaProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadobodegaproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
			
			
			if(jTableDatosEstadoBodegaProducto.getRowCount()>=1) {
				jTableDatosEstadoBodegaProducto.removeRowSelectionInterval(0, jTableDatosEstadoBodegaProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoBodegaProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoBodegaProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoBodegaProducto(true);			
			//this.estadobodegaproducto=new EstadoBodegaProducto();
			//this.estadobodegaproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoBodegaProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoBodegaProducto() ;
			
			if(EstadoBodegaProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoBodegaProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadobodegaproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadobodegaproducto);				
			
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
			
			if(this.estadobodegaproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoBodegaProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoBodegaProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoBodegaProducto> estadobodegaproductosSeleccionados=new ArrayList<EstadoBodegaProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoBodegaProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoBodegaProducto.getSelectedRows().length;			
			}
			
			estadobodegaproductosSeleccionados=this.getEstadoBodegaProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoBodegaProducto--;			
				//EstadoBodegaProducto estadobodegaproductoAux= new EstadoBodegaProducto();			
				//estadobodegaproductoAux.setId(this.iIdNuevoEstadoBodegaProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoBodegaProducto estadobodegaproductoOrigen=new EstadoBodegaProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoBodegaProducto estadobodegaproductoOrigen : estadobodegaproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadobodegaproductoOrigen =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadobodegaproductoOrigen =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoBodegaProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadobodegaproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoBodegaProducto(estadobodegaproductoOrigen,this.estadobodegaproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoBodegaProducto(this.estadobodegaproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadobodegaproductoLogic.getEstadoBodegaProductos().add(this.estadobodegaproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadobodegaproductos.add(this.estadobodegaproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoBodegaProducto(false);
				
				this.jTableDatosEstadoBodegaProducto.setRowSelectionInterval(this.getIndiceNuevoEstadoBodegaProducto(), this.getIndiceNuevoEstadoBodegaProducto());
				
				int iLastRow =  this.jTableDatosEstadoBodegaProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoBodegaProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoBodegaProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoBodegaProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoBodegaProducto> estadobodegaproductosSeleccionados=new ArrayList<EstadoBodegaProducto>();									
		
			EstadoBodegaProducto estadobodegaproductoOrigen=new EstadoBodegaProducto();
			EstadoBodegaProducto estadobodegaproductoDestino=new EstadoBodegaProducto();
				
			estadobodegaproductosSeleccionados=this.getEstadoBodegaProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoBodegaProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadobodegaproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoBodegaProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadobodegaproductoOrigen =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadobodegaproductoOrigen =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadobodegaproductoDestino =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadobodegaproductoDestino =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadobodegaproductoOrigen =estadobodegaproductosSeleccionados.get(0);
				estadobodegaproductoDestino =estadobodegaproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoBodegaProducto(estadobodegaproductoOrigen,estadobodegaproductoDestino,true,false);
				
				estadobodegaproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadobodegaproductoDestino,estadobodegaproductoLogic.getEstadoBodegaProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadobodegaproductoDestino,estadobodegaproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoBodegaProducto(false);
				
				//this.jTableDatosEstadoBodegaProducto.setRowSelectionInterval(this.getIndiceNuevoEstadoBodegaProducto(), this.getIndiceNuevoEstadoBodegaProducto());
				
				int iLastRow =  this.jTableDatosEstadoBodegaProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoBodegaProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoBodegaProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoBodegaProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoBodegaProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoBodegaProducto.isVisible();
			
			
			this.jPanelParametrosReportesEstadoBodegaProducto.setVisible(!isVisible);
			this.jPanelPaginacionEstadoBodegaProducto.setVisible(!isVisible);
			this.jPanelAccionesEstadoBodegaProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoBodegaProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoBodegaProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoBodegaProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoBodegaProducto();
			
			this.abrirFrameOrderByEstadoBodegaProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoBodegaProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoBodegaProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoBodegaProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoBodegaProducto.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoBodegaProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoBodegaProducto.setSize(this.jInternalFrameDetalleFormEstadoBodegaProducto.iWidthFormulario,this.jInternalFrameDetalleFormEstadoBodegaProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoBodegaProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoBodegaProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoBodegaProducto.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoBodegaProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoBodegaProducto.jContentPaneDetalleEstadoBodegaProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoBodegaProducto.jTabbedPaneRelacionesEstadoBodegaProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoBodegaProducto.jContentPaneDetalleEstadoBodegaProducto.getWidth(),EstadoBodegaProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoBodegaProducto.jTabbedPaneRelacionesEstadoBodegaProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoBodegaProducto.jContentPaneDetalleEstadoBodegaProducto.getWidth(),EstadoBodegaProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoBodegaProducto.jTabbedPaneRelacionesEstadoBodegaProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoBodegaProducto.jContentPaneDetalleEstadoBodegaProducto.getWidth(),EstadoBodegaProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoBodegaProducto.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoBodegaProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoBodegaProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoBodegaProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoBodegaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoBodegaProducto,false,this);
				} else {
					this.jInternalFrameOrderByEstadoBodegaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoBodegaProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoBodegaProducto);
				this.jInternalFrameOrderByEstadoBodegaProducto.setVisible(false);
				this.jInternalFrameOrderByEstadoBodegaProducto.setSelected(false);
				
				this.jInternalFrameOrderByEstadoBodegaProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoBodegaProducto"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoBodegaProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoBodegaProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoBodegaProducto==null) {
				
				this.jInternalFrameImportacionEstadoBodegaProducto=new ImportacionJInternalFrame(EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoBodegaProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoBodegaProducto);
				this.jInternalFrameImportacionEstadoBodegaProducto.setVisible(false);
				this.jInternalFrameImportacionEstadoBodegaProducto.setSelected(false);


				this.jInternalFrameImportacionEstadoBodegaProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoBodegaProducto"));
				this.jInternalFrameImportacionEstadoBodegaProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoBodegaProducto"));
				this.jInternalFrameImportacionEstadoBodegaProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoBodegaProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoBodegaProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoBodegaProducto==null) {
				this.jInternalFrameReporteDinamicoEstadoBodegaProducto=new ReporteDinamicoJInternalFrame(EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoBodegaProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoBodegaProducto);
				this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoBodegaProducto"));
				this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoBodegaProducto"));
				this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoBodegaProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoBodegaProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEstadoBodegaProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoBodegaProducto);
			
	       	this.jInternalFrameDetalleFormEstadoBodegaProducto.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoBodegaProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoBodegaProducto.dispose();
			//this.jInternalFrameDetalleFormEstadoBodegaProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoBodegaProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoBodegaProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoBodegaProducto.setVisible(true);
	        this.jInternalFrameImportacionEstadoBodegaProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoBodegaProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoBodegaProducto.setVisible(true);
	        this.jInternalFrameOrderByEstadoBodegaProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoBodegaProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoBodegaProducto.setVisible(false);
	        this.jInternalFrameOrderByEstadoBodegaProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoBodegaProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoBodegaProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoBodegaProducto.setVisible(false);
	        this.jInternalFrameImportacionEstadoBodegaProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoBodegaProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoBodegaProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoBodegaProducto(true);
			//this.isEsNuevoEstadoBodegaProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoBodegaProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoBodegaProducto(false) ;
			
			if(estadobodegaproductoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EstadoBodegaProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoBodegaProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoBodegaProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoBodegaProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoBodegaProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoBodegaProducto(true);
			//this.isEsNuevoEstadoBodegaProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadobodegaproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoBodegaProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoBodegaProducto(false) ;
			
			if(EstadoBodegaProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoBodegaProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoBodegaProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoBodegaProducto(false);
			
			//if(!this.isEsNuevoEstadoBodegaProducto) {								
				int intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoBodegaProducto(this.estadobodegaproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoBodegaProducto(this.estadobodegaproducto);
				
			}
			
			if(this.permiteMantenimiento(this.estadobodegaproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoBodegaProducto=true;
					this.inicializarActualizarBindingTablaEstadoBodegaProducto(false);
					this.isEsNuevoEstadoBodegaProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoBodegaProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoBodegaProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoBodegaProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoBodegaProducto(false);
				
				this.habilitarDeshabilitarControlesEstadoBodegaProducto(false);
			
												
				
				if(EstadoBodegaProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoBodegaProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoBodegaProductoActionPerformed(evt,estadobodegaproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoBodegaProducto(this.estadobodegaproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoBodegaProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadobodegaproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadobodegaproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoBodegaProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoBodegaProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				this.estadobodegaproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				this.estadobodegaproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadobodegaproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoBodegaProductoModel) this.jTableDatosEstadoBodegaProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoBodegaProducto=true;
				this.inicializarActualizarBindingTablaEstadoBodegaProducto(false);
				this.isEsNuevoEstadoBodegaProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoBodegaProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoBodegaProducto(false);
				
				this.habilitarDeshabilitarControlesEstadoBodegaProducto(false);
				
				
				
				if(EstadoBodegaProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoBodegaProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoBodegaProducto.getRowCount()>=1) {
				jTableDatosEstadoBodegaProducto.removeRowSelectionInterval(0, jTableDatosEstadoBodegaProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoBodegaProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoBodegaProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoBodegaProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoBodegaProducto(false) ;
			
			this.isEsNuevoEstadoBodegaProducto=false;
			
			if(EstadoBodegaProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoBodegaProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoBodegaProducto(false);
				
				//SI ES MANUAL
				if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoBodegaProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoBodegaProducto--;			
			//EstadoBodegaProducto estadobodegaproductoAux= new EstadoBodegaProducto();			
			//estadobodegaproductoAux.setId(this.iIdNuevoEstadoBodegaProducto);
			
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoBodegaProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoBodegaProducto(this.estadobodegaproducto);
			
			this.estadobodegaproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadobodegaproductoLogic.getEstadoBodegaProductos().add(this.estadobodegaproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadobodegaproductos.add(this.estadobodegaproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoBodegaProducto(false);
			
			this.jTableDatosEstadoBodegaProducto.setRowSelectionInterval(this.getIndiceNuevoEstadoBodegaProducto(), this.getIndiceNuevoEstadoBodegaProducto());
			
			int iLastRow =  this.jTableDatosEstadoBodegaProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoBodegaProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoBodegaProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoBodegaProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoBodegaProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoBodegaProducto(false);
			
			//SI ES MANUAL
			if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoBodegaProducto();
			}
			
			//this.abrirFrameTreeEstadoBodegaProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Bodega ProductoS ?", "MANTENIMIENTO DE Estado Bodega Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoBodegaProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoBodegaProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadobodegaproductoReturnGeneral=estadobodegaproductoLogic.procesarImportacionEstadoBodegaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadobodegaproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoBodegaProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoBodegaProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoBodegaProducto.setFileImportacion(this.jInternalFrameImportacionEstadoBodegaProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoBodegaProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoBodegaProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoBodegaProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoBodegaProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoBodegaProducto> estadobodegaproductosSeleccionados=new ArrayList<EstadoBodegaProducto>();		

		estadobodegaproductosSeleccionados=this.getEstadoBodegaProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoBodegaProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoBodegaProductoBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteEstadoBodegaProductos("Todos",estadobodegaproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Bodega Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Defecto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Defecto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Defecto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Defecto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoria="es_defecto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoriaValor="es_defecto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Defecto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_defecto");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoBodegaProducto> estadobodegaproductosSeleccionados=new ArrayList<EstadoBodegaProducto>();		
		
		estadobodegaproductosSeleccionados=this.getEstadoBodegaProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadobodegaproducto";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("EstadoBodegaProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoBodegaProducto estadobodegaproducto:estadobodegaproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadobodegaproducto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoBodegaProducto estadobodegaproducto:estadobodegaproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadobodegaproducto.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO);
					iRow++;

					for(EstadoBodegaProducto estadobodegaproducto:estadobodegaproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadobodegaproducto.getes_defecto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelEstadoBodegaProducto(row);				
			//	iRow++;
			//}				
			
			//for(EstadoBodegaProducto estadobodegaproductoAux:estadobodegaproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoBodegaProducto(estadobodegaproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Bodega Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoBodegaProducto(false);
			
			//SI ES MANUAL
			if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoBodegaProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoBodegaProducto(false);
			
			//SI ES MANUAL
			if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoBodegaProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoBodegaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoBodegaProducto(false);
			
			//SI ES MANUAL
			if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoBodegaProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadobodegaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoBodegaProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoBodegaProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoBodegaProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoBodegaProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoBodegaProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoBodegaProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoBodegaProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoBodegaProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoBodegaProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoBodegaProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoBodegaProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoBodegaProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoBodegaProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoBodegaProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoBodegaProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoBodegaProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoBodegaProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoBodegaProducto();
		
		this.inicializarActualizarBindingBotonesManualEstadoBodegaProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoBodegaProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoBodegaProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoBodegaProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoBodegaProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoBodegaProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoBodegaProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoBodegaProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoBodegaProducto.jCheckBoxPostAccionNuevoEstadoBodegaProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoBodegaProducto.jCheckBoxPostAccionSinCerrarEstadoBodegaProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoBodegaProducto.jCheckBoxPostAccionSinMensajeEstadoBodegaProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoBodegaProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoBodegaProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoBodegaProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
				this.jInternalFrameDetalleFormEstadoBodegaProducto.jCheckBoxPostAccionNuevoEstadoBodegaProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoBodegaProducto.jCheckBoxPostAccionSinCerrarEstadoBodegaProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoBodegaProducto.jCheckBoxPostAccionSinMensajeEstadoBodegaProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoBodegaProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoBodegaProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoBodegaProducto.jComboBoxTiposAccionesFormularioEstadoBodegaProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoBodegaProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoBodegaProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoBodegaProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoBodegaProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoBodegaProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoBodegaProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoBodegaProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoBodegaProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoBodegaProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoBodegaProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoBodegaProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoBodegaProducto() throws Exception {
		try	{
			if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoBodegaProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoBodegaProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jComboBoxTiposAccionesFormularioEstadoBodegaProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jComboBoxTiposAccionesFormularioEstadoBodegaProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoBodegaProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoBodegaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoBodegaProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoBodegaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoBodegaProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoBodegaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoBodegaProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoBodegaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoBodegaProducto.addItem(reporte);
			}
			
			
			if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoBodegaProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoBodegaProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoBodegaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoBodegaProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoBodegaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoBodegaProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoBodegaProducto.jComboBoxTiposAccionesFormularioEstadoBodegaProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoBodegaProducto.jComboBoxTiposAccionesFormularioEstadoBodegaProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoBodegaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoBodegaProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoBodegaProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoBodegaProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoBodegaProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoBodegaProducto!=null) {
				this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoBodegaProducto!=null) {
				this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoBodegaProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoBodegaProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoBodegaProducto(Boolean esInicializar) throws Exception {				
		if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoBodegaProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoBodegaProducto() throws Exception {
		this.inicializarActualizarBindingTablaEstadoBodegaProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoBodegaProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoBodegaProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoBodegaProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoBodegaProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoBodegaProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoBodegaProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoBodegaProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoBodegaProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoBodegaProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoBodegaProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoBodegaProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoBodegaProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoBodegaProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoBodegaProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoBodegaProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoBodegaProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadobodegaproductoLogic.getEstadoBodegaProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadobodegaproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoBodegaProducto.setModel(new EstadoBodegaProductoModel(this.estadobodegaproductoLogic.getEstadoBodegaProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoBodegaProducto.setModel(new EstadoBodegaProductoModel(this.estadobodegaproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoBodegaProducto!=null && this.jInternalFrameOrderByEstadoBodegaProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoBodegaProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoBodegaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoBodegaProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoBodegaProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO,estadobodegaproductoConstantesFunciones.resaltarSeleccionarEstadoBodegaProducto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoBodegaProductoConstantesFunciones.SCLASSWEBTITULO,estadobodegaproductoConstantesFunciones.resaltarSeleccionarEstadoBodegaProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoBodegaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoBodegaProducto,EstadoBodegaProductoConstantesFunciones.LABEL_ID));

		if(this.estadobodegaproductoConstantesFunciones.mostraridEstadoBodegaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoBodegaProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadobodegaproductoConstantesFunciones.resaltaridEstadoBodegaProducto,this.estadobodegaproductoConstantesFunciones.activaridEstadoBodegaProducto,this,true,"idEstadoBodegaProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadobodegaproductoConstantesFunciones.resaltaridEstadoBodegaProducto,this.estadobodegaproductoConstantesFunciones.activaridEstadoBodegaProducto,this,true,"idEstadoBodegaProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoBodegaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoBodegaProducto,EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO));

		if(this.estadobodegaproductoConstantesFunciones.mostrarcodigoEstadoBodegaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadobodegaproductoConstantesFunciones.resaltarcodigoEstadoBodegaProducto,this.estadobodegaproductoConstantesFunciones.activarcodigoEstadoBodegaProducto,this,true,"codigoEstadoBodegaProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadobodegaproductoConstantesFunciones.resaltarcodigoEstadoBodegaProducto,this.estadobodegaproductoConstantesFunciones.activarcodigoEstadoBodegaProducto,this,true,"codigoEstadoBodegaProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoBodegaProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoBodegaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoBodegaProducto,EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE));

		if(this.estadobodegaproductoConstantesFunciones.mostrarnombreEstadoBodegaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadobodegaproductoConstantesFunciones.resaltarnombreEstadoBodegaProducto,this.estadobodegaproductoConstantesFunciones.activarnombreEstadoBodegaProducto,this,true,"nombreEstadoBodegaProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadobodegaproductoConstantesFunciones.resaltarnombreEstadoBodegaProducto,this.estadobodegaproductoConstantesFunciones.activarnombreEstadoBodegaProducto,this,true,"nombreEstadoBodegaProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoBodegaProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoBodegaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoBodegaProducto,EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO));

		if(this.estadobodegaproductoConstantesFunciones.mostrares_defectoEstadoBodegaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.estadobodegaproductoConstantesFunciones.resaltares_defectoEstadoBodegaProducto,this.estadobodegaproductoConstantesFunciones.activares_defectoEstadoBodegaProducto));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.estadobodegaproductoConstantesFunciones.resaltares_defectoEstadoBodegaProducto,this.estadobodegaproductoConstantesFunciones.activares_defectoEstadoBodegaProducto,this,true,"es_defectoEstadoBodegaProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EstadoBodegaProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoBodegaProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoBodegaProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoBodegaProducto && this.isPermisoGuardarCambiosEstadoBodegaProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoBodegaProducto.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosEstadoBodegaProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoBodegaProducto && this.isPermisoGuardarCambiosEstadoBodegaProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoBodegaProducto && this.isPermisoGuardarCambiosEstadoBodegaProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoBodegaProducto.moveColumn(this.jTableDatosEstadoBodegaProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoBodegaProducto.moveColumn(this.jTableDatosEstadoBodegaProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoBodegaProducto.moveColumn(this.jTableDatosEstadoBodegaProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoBodegaProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoBodegaProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoBodegaProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoBodegaProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoBodegaProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoBodegaProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoBodegaProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoBodegaProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=estadobodegaproductoLogic.getEstadoBodegaProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadobodegaproductos.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosEstadoBodegaProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoBodegaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoBodegaProducto();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoEstadoBodegaProducto=false;
					
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
			
				if(this.estadobodegaproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoBodegaProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoBodegaProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoBodegaProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadobodegaproducto.getsType().equals("DUPLICADO")
				   || this.estadobodegaproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoBodegaProducto=true;
				
				} else {
					this.isEsNuevoEstadoBodegaProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.estadobodegaproducto.getId()>=0 && !this.estadobodegaproducto.getIsNew()) {						
						this.isEsNuevoEstadoBodegaProducto=false;
						
					} else {
						this.isEsNuevoEstadoBodegaProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoBodegaProducto(esRelaciones);						
				
				this.seleccionarEstadoBodegaProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadobodegaproducto.getId()<0) {
					this.isEsNuevoEstadoBodegaProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoBodegaProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoBodegaProducto(evt,rowIndex);
				}	
				
				if(this.estadobodegaproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoBodegaProducto: " + this.dDif); 
					}
				}								
				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoBodegaProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadobodegaproducto)) {
					if(this.estadobodegaproducto.getId()>0) {
						this.estadobodegaproducto.setIsDeleted(true);
						
						this.estadobodegaproductosEliminados.add(this.estadobodegaproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadobodegaproductoLogic.getEstadoBodegaProductos().remove(this.estadobodegaproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadobodegaproductos.remove(this.estadobodegaproducto);				
					}
					
					
					((EstadoBodegaProductoModel) this.jTableDatosEstadoBodegaProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoBodegaProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoBodegaProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoBodegaProducto) {
			
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoBodegaProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoBodegaProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoBodegaProducto(this.estadobodegaproducto);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoBodegaProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoBodegaProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoBodegaProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoBodegaProducto(estadobodegaproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoBodegaProducto(estadobodegaproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoBodegaProducto(estadobodegaproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoBodegaProducto(estadobodegaproducto);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldidEstadoBodegaProducto.setText(estadobodegaproducto.getId().toString());
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldcodigoEstadoBodegaProducto.setText(estadobodegaproducto.getcodigo());
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextAreanombreEstadoBodegaProducto.setText(estadobodegaproducto.getnombre());
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jCheckBoxes_defectoEstadoBodegaProducto.setSelected(estadobodegaproducto.getes_defecto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoBodegaProducto estadobodegaproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadobodegaproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoBodegaProducto estadobodegaproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadobodegaproductoLocal=this.estadobodegaproducto;
			} else {
				estadobodegaproductoLocal=this.estadobodegaproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadobodegaproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoBodegaProducto(estadobodegaproductoLocal,true);
					
					if(estadobodegaproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadobodegaproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadobodegaproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoBodegaProducto(estadobodegaproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoBodegaProducto(estadobodegaproducto);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoBodegaProducto(estadobodegaproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldidEstadoBodegaProducto.getText()==null || this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldidEstadoBodegaProducto.getText()=="" || this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldidEstadoBodegaProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldidEstadoBodegaProducto.setText("0");
			}

			if(conColumnasBase) {estadobodegaproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldidEstadoBodegaProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoBodegaProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoBodegaProducto.jLabelIdEstadoBodegaProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadobodegaproducto.setcodigo(this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldcodigoEstadoBodegaProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoBodegaProducto.jLabelcodigoEstadoBodegaProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadobodegaproducto.setnombre(this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextAreanombreEstadoBodegaProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoBodegaProducto.jLabelnombreEstadoBodegaProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadobodegaproducto.setes_defecto(this.jInternalFrameDetalleFormEstadoBodegaProducto.jCheckBoxes_defectoEstadoBodegaProducto.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoBodegaProducto.jLabeles_defectoEstadoBodegaProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproductoBean,EstadoBodegaProducto estadobodegaproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproductoOrigen,EstadoBodegaProducto estadobodegaproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadobodegaproductoOrigen.getId()!=null && !estadobodegaproductoOrigen.getId().equals(0L))) {estadobodegaproducto.setId(estadobodegaproductoOrigen.getId());}}
			if(conDefault || (!conDefault && estadobodegaproductoOrigen.getcodigo()!=null && !estadobodegaproductoOrigen.getcodigo().equals(""))) {estadobodegaproducto.setcodigo(estadobodegaproductoOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadobodegaproductoOrigen.getnombre()!=null && !estadobodegaproductoOrigen.getnombre().equals(""))) {estadobodegaproducto.setnombre(estadobodegaproductoOrigen.getnombre());}
			if(conDefault || (!conDefault && estadobodegaproductoOrigen.getes_defecto()!=null && !estadobodegaproductoOrigen.getes_defecto().equals(false))) {estadobodegaproducto.setes_defecto(estadobodegaproductoOrigen.getes_defecto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldidEstadoBodegaProducto.setText(estadobodegaproducto.getId().toString());
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldcodigoEstadoBodegaProducto.setText(estadobodegaproducto.getcodigo());
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextAreanombreEstadoBodegaProducto.setText(estadobodegaproducto.getnombre());
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jCheckBoxes_defectoEstadoBodegaProducto.setSelected(estadobodegaproducto.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoBodegaProducto(EstadoBodegaProductoBean estadobodegaproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldidEstadoBodegaProducto.setText(estadobodegaproductoBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldcodigoEstadoBodegaProducto.setText(estadobodegaproductoBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextAreanombreEstadoBodegaProducto.setText(estadobodegaproductoBean.getnombre());
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jCheckBoxes_defectoEstadoBodegaProducto.setSelected(estadobodegaproductoBean.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoBodegaProducto(EstadoBodegaProductoParameterReturnGeneral estadobodegaproductoReturnGeneral,EstadoBodegaProductoBean estadobodegaproductoBean,Boolean conDefault) throws Exception { 
		try {
			EstadoBodegaProducto estadobodegaproductoLocal=new EstadoBodegaProducto();
			
			estadobodegaproductoLocal=estadobodegaproductoReturnGeneral.getEstadoBodegaProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadobodegaproductoLocal.getId()!=null && !estadobodegaproductoLocal.getId().equals(0L))) {estadobodegaproductoBean.setId(estadobodegaproductoLocal.getId());}}
			if(conDefault || (!conDefault && estadobodegaproductoLocal.getcodigo()!=null && !estadobodegaproductoLocal.getcodigo().equals(""))) {estadobodegaproductoBean.setcodigo(estadobodegaproductoLocal.getcodigo());}
			if(conDefault || (!conDefault && estadobodegaproductoLocal.getnombre()!=null && !estadobodegaproductoLocal.getnombre().equals(""))) {estadobodegaproductoBean.setnombre(estadobodegaproductoLocal.getnombre());}
			if(conDefault || (!conDefault && estadobodegaproductoLocal.getes_defecto()!=null && !estadobodegaproductoLocal.getes_defecto().equals(false))) {estadobodegaproductoBean.setes_defecto(estadobodegaproductoLocal.getes_defecto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoBodegaProductoGenerico(Long idEstadoBodegaProductoSeleccionado,JComboBox jComboBoxEstadoBodegaProducto,List<EstadoBodegaProducto> estadobodegaproductosLocal)throws Exception {
		try {
			EstadoBodegaProducto  estadobodegaproductoTemp=null;

			for(EstadoBodegaProducto estadobodegaproductoAux:estadobodegaproductosLocal) {
				if(estadobodegaproductoAux.getId()!=null && estadobodegaproductoAux.getId().equals(idEstadoBodegaProductoSeleccionado)) {
					estadobodegaproductoTemp=estadobodegaproductoAux;
					break;
				}
			}

			jComboBoxEstadoBodegaProducto.setSelectedItem(estadobodegaproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoBodegaProductoGenerico(JComboBox jComboBoxEstadoBodegaProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxEstadoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoBodegaProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoBodegaProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoBodegaProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoBodegaProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoBodegaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoBodegaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadobodegaproducto=(EstadoBodegaProducto) estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadobodegaproducto =(EstadoBodegaProducto) estadobodegaproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoBodegaProducto estadobodegaproductoRow=new EstadoBodegaProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadobodegaproductoRow=(EstadoBodegaProducto) estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadobodegaproductoRow=(EstadoBodegaProducto) estadobodegaproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoBodegaProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaNuevoEstadoBodegaProducto && this.isPermisoNuevoEstadoBodegaProducto));			
			this.jButtonDuplicarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaDuplicarEstadoBodegaProducto && this.isPermisoDuplicarEstadoBodegaProducto));			
			this.jButtonCopiarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaCopiarEstadoBodegaProducto && this.isPermisoCopiarEstadoBodegaProducto));
			this.jButtonVerFormEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaVerFormEstadoBodegaProducto && this.isPermisoVerFormEstadoBodegaProducto));
			
			this.jButtonAbrirOrderByEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaOrdenEstadoBodegaProducto && this.isPermisoOrdenEstadoBodegaProducto));			
			
			this.jButtonNuevoRelacionesEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto && this.isPermisoNuevoEstadoBodegaProducto));			
			this.jButtonNuevoGuardarCambiosEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaNuevoEstadoBodegaProducto && this.isPermisoNuevoEstadoBodegaProducto && this.isPermisoGuardarCambiosEstadoBodegaProducto));
			
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonModificarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaModificarEstadoBodegaProducto && this.isPermisoActualizarEstadoBodegaProducto));	
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonActualizarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaActualizarEstadoBodegaProducto && this.isPermisoActualizarEstadoBodegaProducto));	
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonEliminarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaEliminarEstadoBodegaProducto && this.isPermisoEliminarEstadoBodegaProducto));
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonCancelarEstadoBodegaProducto.setVisible(this.isVisibilidadCeldaCancelarEstadoBodegaProducto);							
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonGuardarCambiosEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaGuardarEstadoBodegaProducto && this.isPermisoGuardarCambiosEstadoBodegaProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto && this.isPermisoGuardarCambiosEstadoBodegaProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaNuevoEstadoBodegaProducto && this.isPermisoNuevoEstadoBodegaProducto));						
			this.jButtonDuplicarToolBarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaDuplicarEstadoBodegaProducto && this.isPermisoDuplicarEstadoBodegaProducto));						
			this.jButtonCopiarToolBarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaCopiarEstadoBodegaProducto && this.isPermisoCopiarEstadoBodegaProducto));			
			this.jButtonVerFormToolBarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaVerFormEstadoBodegaProducto && this.isPermisoVerFormEstadoBodegaProducto));			
			this.jButtonAbrirOrderByToolBarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaOrdenEstadoBodegaProducto && this.isPermisoOrdenEstadoBodegaProducto));
			this.jButtonNuevoRelacionesToolBarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto && this.isPermisoNuevoEstadoBodegaProducto));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaNuevoEstadoBodegaProducto && this.isPermisoNuevoEstadoBodegaProducto && this.isPermisoGuardarCambiosEstadoBodegaProducto));			
			
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonModificarToolBarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaModificarEstadoBodegaProducto && this.isPermisoActualizarEstadoBodegaProducto));	
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonActualizarToolBarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaActualizarEstadoBodegaProducto  && this.isPermisoActualizarEstadoBodegaProducto));	
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonEliminarToolBarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaEliminarEstadoBodegaProducto && this.isPermisoEliminarEstadoBodegaProducto));
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonCancelarToolBarEstadoBodegaProducto.setVisible(this.isVisibilidadCeldaCancelarEstadoBodegaProducto);				
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonGuardarCambiosToolBarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaGuardarEstadoBodegaProducto && this.isPermisoGuardarCambiosEstadoBodegaProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto && this.isPermisoGuardarCambiosEstadoBodegaProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaNuevoEstadoBodegaProducto && this.isPermisoNuevoEstadoBodegaProducto));			
			this.jMenuItemDuplicarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaDuplicarEstadoBodegaProducto && this.isPermisoDuplicarEstadoBodegaProducto));			
			this.jMenuItemCopiarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaCopiarEstadoBodegaProducto && this.isPermisoCopiarEstadoBodegaProducto));			
			this.jMenuItemVerFormEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaVerFormEstadoBodegaProducto && this.isPermisoVerFormEstadoBodegaProducto));			
			this.jMenuItemAbrirOrderByEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaOrdenEstadoBodegaProducto && this.isPermisoOrdenEstadoBodegaProducto));			
			//this.jMenuItemMostrarOcultarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaOrdenEstadoBodegaProducto && this.isPermisoOrdenEstadoBodegaProducto));
			this.jMenuItemDetalleAbrirOrderByEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaOrdenEstadoBodegaProducto && this.isPermisoOrdenEstadoBodegaProducto));			
			//this.jMenuItemDetalleMostrarOcultarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaOrdenEstadoBodegaProducto && this.isPermisoOrdenEstadoBodegaProducto));			
			this.jMenuItemNuevoRelacionesEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto && this.isPermisoNuevoEstadoBodegaProducto));			
			this.jMenuItemNuevoGuardarCambiosEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaNuevoEstadoBodegaProducto && this.isPermisoNuevoEstadoBodegaProducto && this.isPermisoGuardarCambiosEstadoBodegaProducto));									
			
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemModificarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaModificarEstadoBodegaProducto && this.isPermisoActualizarEstadoBodegaProducto));	
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemActualizarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaActualizarEstadoBodegaProducto && this.isPermisoActualizarEstadoBodegaProducto));	
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemEliminarEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaEliminarEstadoBodegaProducto && this.isPermisoEliminarEstadoBodegaProducto));
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemCancelarEstadoBodegaProducto.setVisible(this.isVisibilidadCeldaCancelarEstadoBodegaProducto);				
			}
			
			this.jMenuItemGuardarCambiosEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaGuardarEstadoBodegaProducto && this.isPermisoGuardarCambiosEstadoBodegaProducto));						
			this.jMenuItemGuardarCambiosTablaEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto && this.isPermisoGuardarCambiosEstadoBodegaProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoBodegaProducto=this.jButtonNuevoEstadoBodegaProducto.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoBodegaProducto=this.jButtonDuplicarEstadoBodegaProducto.isVisible();
			this.isVisibilidadCeldaCopiarEstadoBodegaProducto=this.jButtonCopiarEstadoBodegaProducto.isVisible();
			this.isVisibilidadCeldaVerFormEstadoBodegaProducto=this.jButtonVerFormEstadoBodegaProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoBodegaProducto=this.jButtonAbrirOrderByEstadoBodegaProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto=this.jButtonNuevoRelacionesEstadoBodegaProducto.isVisible();
			this.isVisibilidadCeldaModificarEstadoBodegaProducto=this.jButtonModificarEstadoBodegaProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
			this.isVisibilidadCeldaActualizarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonActualizarEstadoBodegaProducto.isVisible();
			this.isVisibilidadCeldaEliminarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonEliminarEstadoBodegaProducto.isVisible();
			this.isVisibilidadCeldaCancelarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonCancelarEstadoBodegaProducto.isVisible();
			this.isVisibilidadCeldaGuardarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonGuardarCambiosEstadoBodegaProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto=this.jButtonGuardarCambiosTablaEstadoBodegaProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoBodegaProducto=this.jButtonNuevoToolBarEstadoBodegaProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto=this.jButtonNuevoRelacionesToolBarEstadoBodegaProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
			this.isVisibilidadCeldaModificarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonModificarToolBarEstadoBodegaProducto.isVisible();
			this.isVisibilidadCeldaActualizarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonActualizarToolBarEstadoBodegaProducto.isVisible();
			this.isVisibilidadCeldaEliminarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonEliminarToolBarEstadoBodegaProducto.isVisible();
			this.isVisibilidadCeldaCancelarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonCancelarToolBarEstadoBodegaProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoBodegaProducto=this.jButtonGuardarCambiosToolBarEstadoBodegaProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto=this.jButtonGuardarCambiosTablaToolBarEstadoBodegaProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoBodegaProducto=this.jMenuItemNuevoEstadoBodegaProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto=this.jMenuItemNuevoRelacionesEstadoBodegaProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
			this.isVisibilidadCeldaModificarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemModificarEstadoBodegaProducto.isVisible();
			this.isVisibilidadCeldaActualizarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemActualizarEstadoBodegaProducto.isVisible();
			this.isVisibilidadCeldaEliminarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemEliminarEstadoBodegaProducto.isVisible();
			this.isVisibilidadCeldaCancelarEstadoBodegaProducto=this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemCancelarEstadoBodegaProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoBodegaProducto=this.jMenuItemGuardarCambiosEstadoBodegaProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto=this.jMenuItemGuardarCambiosTablaEstadoBodegaProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoBodegaProducto(Boolean esInicializar) {
		if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadobodegaproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoBodegaProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoBodegaProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoBodegaProducto() {
		this.jButtonNuevoEstadoBodegaProducto.setVisible(this.isPermisoNuevoEstadoBodegaProducto);			
		this.jButtonDuplicarEstadoBodegaProducto.setVisible(this.isPermisoDuplicarEstadoBodegaProducto);			
		this.jButtonCopiarEstadoBodegaProducto.setVisible(this.isPermisoCopiarEstadoBodegaProducto);			
		this.jButtonVerFormEstadoBodegaProducto.setVisible(this.isPermisoVerFormEstadoBodegaProducto);			
		
		this.jButtonAbrirOrderByEstadoBodegaProducto.setVisible(this.isPermisoOrdenEstadoBodegaProducto);					
		
		this.jButtonNuevoRelacionesEstadoBodegaProducto.setVisible(this.isPermisoNuevoEstadoBodegaProducto);			
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonModificarEstadoBodegaProducto.setVisible(this.isPermisoActualizarEstadoBodegaProducto);	
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonActualizarEstadoBodegaProducto.setVisible(this.isPermisoActualizarEstadoBodegaProducto);	
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonEliminarEstadoBodegaProducto.setVisible(this.isPermisoEliminarEstadoBodegaProducto);
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonCancelarEstadoBodegaProducto.setVisible(this.isVisibilidadCeldaCancelarEstadoBodegaProducto);						
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonGuardarCambiosEstadoBodegaProducto.setVisible(this.isPermisoGuardarCambiosEstadoBodegaProducto);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoBodegaProducto.setVisible(this.isPermisoActualizarEstadoBodegaProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoBodegaProducto() {
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonModificarEstadoBodegaProducto.setVisible(this.isPermisoActualizarEstadoBodegaProducto);	
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonActualizarEstadoBodegaProducto.setVisible(this.isPermisoActualizarEstadoBodegaProducto);	
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonEliminarEstadoBodegaProducto.setVisible(this.isPermisoEliminarEstadoBodegaProducto);
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonCancelarEstadoBodegaProducto.setVisible(this.isVisibilidadCeldaCancelarEstadoBodegaProducto);							
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonGuardarCambiosEstadoBodegaProducto.setVisible((this.isVisibilidadCeldaGuardarEstadoBodegaProducto && this.isPermisoGuardarCambiosEstadoBodegaProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoBodegaProducto() {
		if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoBodegaProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoBodegaProducto() {
	}
	
	public void jTableDatosEstadoBodegaProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoBodegaProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoBodegaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoBodegaProducto(this.getestadobodegaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoBodegaProducto(this.estadobodegaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadobodegaproducto==null) {
						this.estadobodegaproducto = new EstadoBodegaProducto();
					}

					this.setVariablesFormularioToObjetoActualEstadoBodegaProducto(this.estadobodegaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoBodegaProducto(this.estadobodegaproducto);
				}

				if(this.estadobodegaproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadobodegaproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoBodegaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoBodegaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoBodegaProducto(this.getestadobodegaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoBodegaProducto(this.estadobodegaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadobodegaproducto==null) {
						this.estadobodegaproducto = new EstadoBodegaProducto();
					}

					this.setVariablesFormularioToObjetoActualEstadoBodegaProducto(this.estadobodegaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoBodegaProducto(this.estadobodegaproducto);
				}

				if(this.estadobodegaproducto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadobodegaproducto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoBodegaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoBodegaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoBodegaProducto(this.getestadobodegaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoBodegaProducto(this.estadobodegaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadobodegaproducto==null) {
						this.estadobodegaproducto = new EstadoBodegaProducto();
					}

					this.setVariablesFormularioToObjetoActualEstadoBodegaProducto(this.estadobodegaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoBodegaProducto(this.estadobodegaproducto);
				}

				if(this.estadobodegaproducto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadobodegaproducto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoBodegaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_defectoEstadoBodegaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoBodegaProducto(this.getestadobodegaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoBodegaProducto(this.estadobodegaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadobodegaproducto==null) {
						this.estadobodegaproducto = new EstadoBodegaProducto();
					}

					this.setVariablesFormularioToObjetoActualEstadoBodegaProducto(this.estadobodegaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoBodegaProducto(this.estadobodegaproducto);
				}

				if(this.estadobodegaproducto.getes_defecto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_defecto = "+this.estadobodegaproducto.getes_defecto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoBodegaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoBodegaProducto() {
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoBodegaProducto.dispose();
			this.jInternalFrameDetalleFormEstadoBodegaProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoBodegaProducto!=null) {
			this.jInternalFrameReporteDinamicoEstadoBodegaProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoBodegaProducto.dispose();
			this.jInternalFrameReporteDinamicoEstadoBodegaProducto=null;
		}
		
		if(this.jInternalFrameImportacionEstadoBodegaProducto!=null) {
			this.jInternalFrameImportacionEstadoBodegaProducto.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoBodegaProducto.dispose();
			this.jInternalFrameImportacionEstadoBodegaProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoBodegaProducto();
			
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoBodegaProducto")) {
				jButtonNuevoEstadoBodegaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoBodegaProducto")) {
				jButtonDuplicarEstadoBodegaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoBodegaProducto")) {
				jButtonCopiarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoBodegaProducto")) {
				jButtonVerFormEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoBodegaProducto")) {
				jButtonNuevoEstadoBodegaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoBodegaProducto")) {
				jButtonDuplicarEstadoBodegaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoBodegaProducto")) {
				jButtonNuevoEstadoBodegaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoBodegaProducto")) {
				jButtonDuplicarEstadoBodegaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoBodegaProducto")) {
				jButtonNuevoEstadoBodegaProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoBodegaProducto")) {
				jButtonNuevoEstadoBodegaProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoBodegaProducto")) {
				jButtonNuevoEstadoBodegaProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoBodegaProducto")) {
				jButtonModificarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoBodegaProducto")) {
				jButtonModificarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoBodegaProducto")) {
				jButtonModificarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoBodegaProducto")) {
				jButtonActualizarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoBodegaProducto")) {
				jButtonActualizarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoBodegaProducto")) {
				jButtonActualizarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoBodegaProducto")) {
				jButtonEliminarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoBodegaProducto")) {
				jButtonEliminarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoBodegaProducto")) {
				jButtonEliminarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoBodegaProducto")) {
				jButtonCancelarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoBodegaProducto")) {
				jButtonCancelarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoBodegaProducto")) {
				jButtonCancelarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoBodegaProducto")) {
				jButtonCerrarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoBodegaProducto")) {
				jButtonCerrarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoBodegaProducto")) {
				jButtonCerrarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoBodegaProducto")) {
				jButtonMostrarOcultarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoBodegaProducto")) {
				jButtonCancelarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoBodegaProducto")) {
				jButtonGuardarCambiosEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoBodegaProducto")) {
				jButtonGuardarCambiosEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoBodegaProducto")) {
				jButtonCopiarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoBodegaProducto")) {
				jButtonVerFormEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoBodegaProducto")) {
				jButtonGuardarCambiosEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoBodegaProducto")) {
				jButtonCopiarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoBodegaProducto")) {
				jButtonVerFormEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoBodegaProducto")) {
				jButtonGuardarCambiosEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoBodegaProducto")) {
				jButtonGuardarCambiosEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoBodegaProducto")) {
				jButtonGuardarCambiosEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoBodegaProducto")) {
				jButtonRecargarInformacionEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoBodegaProducto")) {
				jButtonRecargarInformacionEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoBodegaProducto")) {
				jButtonRecargarInformacionEstadoBodegaProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoBodegaProducto")) {
				jButtonAnterioresEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoBodegaProducto")) {
				jButtonAnterioresEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoBodegaProducto")) {
				jButtonAnterioresEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoBodegaProducto")) {
				jButtonSiguientesEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoBodegaProducto")) {
				jButtonSiguientesEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoBodegaProducto")) {
				jButtonSiguientesEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoBodegaProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoBodegaProducto")) {
				jButtonAbrirOrderByEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoBodegaProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoBodegaProducto")) {
				jButtonMostrarOcultarEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoBodegaProducto")) {
				jButtonNuevoGuardarCambiosEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoBodegaProducto")) {
				jButtonNuevoGuardarCambiosEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoBodegaProducto")) {
				jButtonNuevoGuardarCambiosEstadoBodegaProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoBodegaProducto")) {
				jButtonCerrarReporteDinamicoEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoBodegaProducto")) {
				jButtonGenerarReporteDinamicoEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoBodegaProducto")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoBodegaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoBodegaProducto")) {
				jButtonCerrarImportacionEstadoBodegaProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoBodegaProducto")) {
				
				jButtonGenerarImportacionEstadoBodegaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoBodegaProducto")) {
				
				jButtonAbrirImportacionEstadoBodegaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoBodegaProducto")) {
				jComboBoxTiposAccionesEstadoBodegaProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoBodegaProducto")) {
				jComboBoxTiposRelacionesEstadoBodegaProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoBodegaProducto")) {
				jComboBoxTiposAccionesEstadoBodegaProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoBodegaProducto")) {
				
				jComboBoxTiposSeleccionarEstadoBodegaProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoBodegaProducto")) {
				jTextFieldValorCampoGeneralEstadoBodegaProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoBodegaProducto")) {
				jButtonAbrirOrderByEstadoBodegaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoBodegaProducto")) {
				jButtonAbrirOrderByEstadoBodegaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoBodegaProducto")) {
				jButtonCerrarOrderByEstadoBodegaProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoBodegaProductoBusqueda")) {
				this.jButtonidEstadoBodegaProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoBodegaProductoBusqueda")) {
				this.jButtoncodigoEstadoBodegaProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoBodegaProductoBusqueda")) {
				this.jButtonnombreEstadoBodegaProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoEstadoBodegaProductoBusqueda")) {
				this.jButtones_defectoEstadoBodegaProductoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoBodegaProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoBodegaProductoActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadobodegaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadobodegaproducto);
				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
				
				


				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoBodegaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoBodegaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoBodegaProducto estadobodegaproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadobodegaproductoLocal=this.estadobodegaproducto;
			} else {
				estadobodegaproductoLocal=this.estadobodegaproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadobodegaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadobodegaproducto);
				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
							
				
				


				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoBodegaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoBodegaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoBodegaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoAnterior =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadobodegaproductoAnterior =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoBodegaProductoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadobodegaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadobodegaproducto);
				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
								
						
				


				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoBodegaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoBodegaProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadobodegaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadobodegaproducto);
				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
								
				
				


				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoBodegaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoBodegaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoBodegaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoAnterior =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadobodegaproductoAnterior =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadobodegaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadobodegaproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoBodegaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoAnterior =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadobodegaproductoAnterior =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoBodegaProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadobodegaproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadobodegaproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadobodegaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadobodegaproducto);
				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
							
				
				


				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoBodegaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoBodegaProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoBodegaProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadobodegaproductoAnterior =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadobodegaproductoAnterior =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoBodegaProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadobodegaproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadobodegaproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadobodegaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadobodegaproducto);
				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
								
				
				


				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoBodegaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoBodegaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoBodegaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoAnterior =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadobodegaproductoAnterior =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoBodegaProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadobodegaproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadobodegaproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoBodegaProductoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadobodegaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadobodegaproducto);
				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoBodegaProducto")) {
					jCheckBoxSeleccionarTodosEstadoBodegaProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoBodegaProducto")) {
					jCheckBoxSeleccionadosEstadoBodegaProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoBodegaProducto")) {
					
				}
				
				


				
				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoBodegaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoBodegaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadobodegaproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadobodegaproducto);
				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
												
				
				


				
				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoBodegaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoBodegaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoBodegaProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadobodegaproductoAnterior =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadobodegaproductoAnterior =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoBodegaProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadobodegaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadobodegaproducto);
				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
				
				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoBodegaProductoActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadobodegaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadobodegaproducto);
				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoBodegaProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoBodegaProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadobodegaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadobodegaproducto);
				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoBodegaProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoBodegaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoBodegaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadobodegaproductoAnterior =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadobodegaproductoAnterior =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoBodegaProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoBodegaProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoBodegaProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadobodegaproducto =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadobodegaproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoBodegaProducto")) {
				
				}
				
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoBodegaProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoBodegaProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoBodegaProducto")) {
			
			}
			
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoBodegaProducto();
			
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoBodegaProducto")) {
				jButtonNuevoEstadoBodegaProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoBodegaProducto")) {
				jButtonDuplicarEstadoBodegaProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoBodegaProducto")) {
				jButtonCopiarEstadoBodegaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoBodegaProducto")) {
				jButtonVerFormEstadoBodegaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoBodegaProducto")) {
				jButtonNuevoEstadoBodegaProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoBodegaProducto")) {
				jButtonModificarEstadoBodegaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoBodegaProducto")) {
				jButtonActualizarEstadoBodegaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoBodegaProducto")) {
				jButtonEliminarEstadoBodegaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoBodegaProducto")) {
				jButtonGuardarCambiosEstadoBodegaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoBodegaProducto")) {
				jButtonCancelarEstadoBodegaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoBodegaProducto")) {
				jButtonCerrarEstadoBodegaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoBodegaProducto")) {
				jButtonGuardarCambiosEstadoBodegaProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoBodegaProducto")) {
				jButtonNuevoGuardarCambiosEstadoBodegaProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoBodegaProducto")) {
				jButtonAbrirOrderByEstadoBodegaProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoBodegaProducto")) {
				jButtonRecargarInformacionEstadoBodegaProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoBodegaProducto")) {
				jButtonAnterioresEstadoBodegaProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoBodegaProducto")) {
				jButtonSiguientesEstadoBodegaProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoBodegaProductoBusqueda")) {
				this.jButtonidEstadoBodegaProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoBodegaProductoBusqueda")) {
				this.jButtoncodigoEstadoBodegaProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoBodegaProductoBusqueda")) {
				this.jButtonnombreEstadoBodegaProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoEstadoBodegaProductoBusqueda")) {
				this.jButtones_defectoEstadoBodegaProductoBusquedaActionPerformed(evt);
			}
			
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoBodegaProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoBodegaProducto")) {
				closingInternalFrameEstadoBodegaProducto();
				
			} else if(sTipo.equals("jButtonCancelarEstadoBodegaProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoBodegaProducto = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoBodegaProductoBeanSwingJInternalFrame jInternalFrameParent=(EstadoBodegaProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoBodegaProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoBodegaProductoActionPerformed(null);
			}
			
			EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadobodegaproducto,new Object(),this.estadobodegaproductoParameterGeneral,this.estadobodegaproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoBodegaProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoBodegaProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoBodegaProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadobodegaproducto)) {
			if(!esControlTabla) {
				if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoBodegaProducto(this.estadobodegaproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoBodegaProducto(this.estadobodegaproducto);			
				}
				
				if(this.estadobodegaproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoBodegaProducto(this.estadobodegaproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadobodegaproductoReturnGeneral=estadobodegaproductoLogic.procesarEventosEstadoBodegaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadobodegaproductoLogic.getEstadoBodegaProductos(),this.estadobodegaproducto,this.estadobodegaproductoParameterGeneral,this.isEsNuevoEstadoBodegaProducto,classes);//this.estadobodegaproductoLogic.getEstadoBodegaProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoBodegaProducto(this.estadobodegaproductoReturnGeneral,this.estadobodegaproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadobodegaproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoBodegaProducto(classes,this.estadobodegaproductoReturnGeneral,this.estadobodegaproductoBean,false);
					}
						
					if(this.estadobodegaproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoBodegaProducto(this.estadobodegaproductoReturnGeneral.getEstadoBodegaProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoBodegaProducto(this.estadobodegaproductoReturnGeneral.getEstadoBodegaProducto());	
					}
						
					if(this.estadobodegaproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoBodegaProducto(this.estadobodegaproductoReturnGeneral.getEstadoBodegaProducto(),classes);//this.estadobodegaproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoBodegaProducto(this.estadobodegaproducto,classes);//this.estadobodegaproductoBean);									
				}
			
				if(EstadoBodegaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoBodegaProducto(this.estadobodegaproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoBodegaProducto(this.estadobodegaproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadobodegaproductoAnterior!=null) {
						this.estadobodegaproducto=this.estadobodegaproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadobodegaproductoReturnGeneral=estadobodegaproductoLogic.procesarEventosEstadoBodegaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadobodegaproductoLogic.getEstadoBodegaProductos(),this.estadobodegaproducto,this.estadobodegaproductoParameterGeneral,this.isEsNuevoEstadoBodegaProducto,classes);//this.estadobodegaproductoLogic.getEstadoBodegaProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadobodegaproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadobodegaproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadobodegaproductoReturnGeneral.getEstadoBodegaProducto(),estadobodegaproductoLogic.getEstadoBodegaProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadobodegaproductoReturnGeneral.getEstadoBodegaProducto(),this.estadobodegaproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoBodegaProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoBodegaProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoBodegaProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoBodegaProducto() throws Exception {
		
		EstadoBodegaProductoModel estadobodegaproductoModel=(EstadoBodegaProductoModel)this.jTableDatosEstadoBodegaProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadobodegaproductoModel.estadobodegaproductos=this.estadobodegaproductoLogic.getEstadoBodegaProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadobodegaproductoModel.estadobodegaproductos=this.estadobodegaproductos;
		}
		
		
		((EstadoBodegaProductoModel) this.jTableDatosEstadoBodegaProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoBodegaProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadobodegaproductoAnterior(),this.estadobodegaproductoLogic.getEstadoBodegaProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadobodegaproductoAnterior(),this.estadobodegaproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoBodegaProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadobodegaproducto,new Object(),generalEntityParameterGeneral,this.estadobodegaproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadobodegaproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoBodegaProductoConstantesFunciones.getClassesRelationshipsOfEstadoBodegaProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoBodegaProductoConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoBodegaProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoBodegaProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoBodegaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadobodegaproducto,new Object(),generalEntityParameterGeneral,this.estadobodegaproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoBodegaProducto(EstadoBodegaProductoBean estadobodegaproductoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoBodegaProducto(ArrayList<Classe> classes,EstadoBodegaProductoReturnGeneral estadobodegaproductoReturnGeneral,EstadoBodegaProductoBean estadobodegaproductoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproducto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadobodegaproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto = new EstadoBodegaProductoDetalleFormJInternalFrame(jDesktopPane,this.estadobodegaproductoSessionBean.getConGuardarRelaciones(),this.estadobodegaproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoBodegaProducto);
		this.jInternalFrameDetalleFormEstadoBodegaProducto.setVisible(false);
		this.jInternalFrameDetalleFormEstadoBodegaProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.estadobodegaproductoLogic=this.estadobodegaproductoLogic;
		
		this.cargarCombosFrameForeignKeyEstadoBodegaProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoBodegaProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoBodegaProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoBodegaProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoBodegaProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoBodegaProducto"));
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonModificarEstadoBodegaProducto.addActionListener(new ButtonActionListener(this,"ModificarEstadoBodegaProducto"));

		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonModificarToolBarEstadoBodegaProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoBodegaProducto"));
					
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemModificarEstadoBodegaProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoBodegaProducto"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonActualizarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"ActualizarEstadoBodegaProducto"));
		
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonActualizarToolBarEstadoBodegaProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoBodegaProducto"));
						
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemActualizarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoBodegaProducto"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonEliminarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"EliminarEstadoBodegaProducto"));
		
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonEliminarToolBarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoBodegaProducto"));
								
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemEliminarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoBodegaProducto"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonCancelarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"CancelarEstadoBodegaProducto"));
		
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonCancelarToolBarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoBodegaProducto"));
					
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemCancelarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoBodegaProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemDetalleCerrarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoBodegaProducto"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonGuardarCambiosToolBarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoBodegaProducto"));
		
		
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonGuardarCambiosToolBarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoBodegaProducto"));
		
		
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jComboBoxTiposAccionesFormularioEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoBodegaProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonidEstadoBodegaProductoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoBodegaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtoncodigoEstadoBodegaProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoBodegaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonnombreEstadoBodegaProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoBodegaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtones_defectoEstadoBodegaProductoBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoEstadoBodegaProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jTabbedPaneRelacionesEstadoBodegaProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoBodegaProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoBodegaProducto"));
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoBodegaProducto"));
		}
		
		this.jTableDatosEstadoBodegaProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoBodegaProducto"));
		
		this.jTableDatosEstadoBodegaProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoBodegaProducto"));
		
		this.jButtonNuevoEstadoBodegaProducto.addActionListener(new ButtonActionListener(this,"NuevoEstadoBodegaProducto"));
		
		this.jButtonDuplicarEstadoBodegaProducto.addActionListener(new ButtonActionListener(this,"DuplicarEstadoBodegaProducto"));
		
		this.jButtonCopiarEstadoBodegaProducto.addActionListener(new ButtonActionListener(this,"CopiarEstadoBodegaProducto"));
		
		this.jButtonVerFormEstadoBodegaProducto.addActionListener(new ButtonActionListener(this,"VerFormEstadoBodegaProducto"));
		
		
		this.jButtonNuevoToolBarEstadoBodegaProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoBodegaProducto"));
			
		this.jButtonDuplicarToolBarEstadoBodegaProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoBodegaProducto"));
			
		this.jMenuItemNuevoEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoBodegaProducto"));
			
		this.jMenuItemDuplicarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoBodegaProducto"));		
		
		
		this.jButtonNuevoRelacionesEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoBodegaProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoBodegaProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoBodegaProducto"));
			
		this.jMenuItemNuevoRelacionesEstadoBodegaProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoBodegaProducto"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonModificarEstadoBodegaProducto.addActionListener(new ButtonActionListener(this,"ModificarEstadoBodegaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonModificarToolBarEstadoBodegaProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoBodegaProducto"));
			
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemModificarEstadoBodegaProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoBodegaProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonActualizarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"ActualizarEstadoBodegaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonActualizarToolBarEstadoBodegaProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoBodegaProducto"));
				
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemActualizarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoBodegaProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonEliminarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"EliminarEstadoBodegaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonEliminarToolBarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoBodegaProducto"));
						
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemEliminarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoBodegaProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonCancelarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"CancelarEstadoBodegaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonCancelarToolBarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoBodegaProducto"));
			
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemCancelarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoBodegaProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoBodegaProducto"));		
		
		
		this.jButtonCerrarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"CerrarEstadoBodegaProducto"));
		
		
		this.jButtonCerrarToolBarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoBodegaProducto"));
			
		this.jMenuItemCerrarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoBodegaProducto"));
			
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jMenuItemDetalleCerrarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoBodegaProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonGuardarCambiosEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoBodegaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonGuardarCambiosToolBarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoBodegaProducto"));
		}
		
		this.jButtonCopiarToolBarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoBodegaProducto"));
			
		this.jButtonVerFormToolBarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoBodegaProducto"));
		
		this.jMenuItemGuardarCambiosEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoBodegaProducto"));
			
		this.jMenuItemCopiarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoBodegaProducto"));		
		
		this.jMenuItemVerFormEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoBodegaProducto"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoBodegaProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoBodegaProducto"));
			
		this.jMenuItemGuardarCambiosTablaEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoBodegaProducto"));		
		
		
		
		this.jButtonRecargarInformacionEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoBodegaProducto"));
					
		this.jButtonRecargarInformacionToolBarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoBodegaProducto"));
		
		this.jMenuItemRecargarInformacionEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoBodegaProducto"));		
		
		
		
		this.jButtonAnterioresEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"AnterioresEstadoBodegaProducto"));
		
		
		this.jButtonAnterioresToolBarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoBodegaProducto"));
		
		this.jMenuItemAnterioresEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoBodegaProducto"));		
		
		
		this.jButtonSiguientesEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"SiguientesEstadoBodegaProducto"));
		
		
		this.jButtonSiguientesToolBarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoBodegaProducto"));
			
		this.jMenuItemSiguientesEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoBodegaProducto"));
			
		this.jMenuItemAbrirOrderByEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoBodegaProducto"));
			
		this.jMenuItemMostrarOcultarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoBodegaProducto"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoBodegaProducto"));
			
		this.jMenuItemDetalleMostarOcultarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoBodegaProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoBodegaProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoBodegaProducto"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoBodegaProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoBodegaProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoBodegaProducto"));

		this.jCheckBoxSeleccionadosEstadoBodegaProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoBodegaProducto"));
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jComboBoxTiposAccionesFormularioEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoBodegaProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoBodegaProducto"));
			
		this.jComboBoxTiposAccionesEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoBodegaProducto"));
					
		this.jComboBoxTiposSeleccionarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoBodegaProducto"));
			
		this.jTextFieldValorCampoGeneralEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoBodegaProducto"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonidEstadoBodegaProductoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoBodegaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtoncodigoEstadoBodegaProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoBodegaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonnombreEstadoBodegaProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoBodegaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtones_defectoEstadoBodegaProductoBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoEstadoBodegaProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoBodegaProducto!=null) {
				this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoBodegaProducto"));
				this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoBodegaProducto"));
				this.jInternalFrameReporteDinamicoEstadoBodegaProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoBodegaProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoBodegaProducto"));				
			//this.jButtonGenerarReporteDinamicoEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoBodegaProducto"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoBodegaProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoBodegaProducto!=null) {
				this.jInternalFrameImportacionEstadoBodegaProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoBodegaProducto"));
				this.jInternalFrameImportacionEstadoBodegaProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoBodegaProducto"));
				this.jInternalFrameImportacionEstadoBodegaProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoBodegaProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoBodegaProducto"));
			
			this.jButtonAbrirOrderByToolBarEstadoBodegaProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoBodegaProducto"));			
			
			if(this.jInternalFrameOrderByEstadoBodegaProducto!=null) {
				this.jInternalFrameOrderByEstadoBodegaProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoBodegaProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoBodegaProducto.jTabbedPaneRelacionesEstadoBodegaProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoBodegaProducto"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameEstadoBodegaProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoBodegaProducto = (JInternalFrameBase)event.getSource();
	            	
	            EstadoBodegaProductoBeanSwingJInternalFrame jInternalFrameParent=(EstadoBodegaProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoBodegaProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoBodegaProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoBodegaProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoBodegaProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoBodegaProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoBodegaProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoBodegaProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoBodegaProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoBodegaProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoBodegaProducto";
		inputMap = this.jButtonNuevoEstadoBodegaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoBodegaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoBodegaProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoBodegaProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoBodegaProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoBodegaProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoBodegaProducto";
		inputMap = this.jButtonNuevoRelacionesEstadoBodegaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoBodegaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoBodegaProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoBodegaProducto";
		inputMap = this.jButtonModificarEstadoBodegaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoBodegaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoBodegaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoBodegaProducto";
		inputMap = this.jButtonActualizarEstadoBodegaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoBodegaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoBodegaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoBodegaProducto";
		inputMap = this.jButtonEliminarEstadoBodegaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoBodegaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoBodegaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoBodegaProducto";
		inputMap = this.jButtonCancelarEstadoBodegaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoBodegaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoBodegaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoBodegaProducto";
		inputMap = this.jButtonCerrarEstadoBodegaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoBodegaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoBodegaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonGuardarCambiosEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoBodegaProducto";
		inputMap = this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonGuardarCambiosEstadoBodegaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonGuardarCambiosEstadoBodegaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoBodegaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoBodegaProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoBodegaProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoBodegaProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoBodegaProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoBodegaProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoBodegaProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoBodegaProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoBodegaProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonidEstadoBodegaProductoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoBodegaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtoncodigoEstadoBodegaProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoBodegaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtonnombreEstadoBodegaProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoBodegaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jButtones_defectoEstadoBodegaProductoBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoEstadoBodegaProductoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoBodegaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoBodegaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoBodegaProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoBodegaProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoBodegaProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoBodegaProducto estadobodegaproductoAux:this.estadobodegaproductoLogic.getEstadoBodegaProductos()) {
					estadobodegaproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoBodegaProducto estadobodegaproductoAux:estadobodegaproductos) {
					estadobodegaproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoBodegaProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoBodegaProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoBodegaProducto estadobodegaproductoAux:this.estadobodegaproductoLogic.getEstadoBodegaProductos()) {
						estadobodegaproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoBodegaProducto estadobodegaproductoAux:estadobodegaproductos) {
						estadobodegaproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoBodegaProducto estadobodegaproductoAux:this.estadobodegaproductoLogic.getEstadoBodegaProductos()) {
					
						if(sTipoSeleccionar.equals(EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							estadobodegaproductoAux.setes_defecto(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoBodegaProducto estadobodegaproductoAux:estadobodegaproductos) {
						
						if(sTipoSeleccionar.equals(EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							estadobodegaproductoAux.setes_defecto(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoBodegaProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoBodegaProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoBodegaProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoBodegaProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoBodegaProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoBodegaProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoBodegaProducto.getSelectedRows();
			
			EstadoBodegaProducto estadobodegaproductoLocal=new EstadoBodegaProducto();
			
			//this.seleccionarTodosEstadoBodegaProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadobodegaproductoLocal =(EstadoBodegaProducto) this.estadobodegaproductoLogic.getEstadoBodegaProductos().toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadobodegaproductoLocal =(EstadoBodegaProducto) this.estadobodegaproductos.toArray()[this.jTableDatosEstadoBodegaProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadobodegaproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoBodegaProducto estadobodegaproductoAux:this.estadobodegaproductoLogic.getEstadoBodegaProductos()) {
						estadobodegaproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoBodegaProducto estadobodegaproductoAux:estadobodegaproductos) {
						estadobodegaproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoBodegaProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoBodegaProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoBodegaProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoBodegaProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoBodegaProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoBodegaProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoBodegaProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoBodegaProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoBodegaProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoBodegaProducto estadobodegaproductoAux:this.estadobodegaproductoLogic.getEstadoBodegaProductos()) {
				
						if(sTipoSeleccionar.equals(EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadobodegaproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadobodegaproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoBodegaProducto estadobodegaproductoAux:estadobodegaproductos) {
					
						if(sTipoSeleccionar.equals(EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadobodegaproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadobodegaproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoBodegaProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoBodegaProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoBodegaProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoBodegaProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoBodegaProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoBodegaProducto.jComboBoxTiposAccionesFormularioEstadoBodegaProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoBodegaProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoBodegaProducto(conSplash);
				
					this.generarReporteEstadoBodegaProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoBodegaProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoBodegaProducto.jComboBoxTiposAccionesFormularioEstadoBodegaProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoBodegaProductosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoBodegaProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoBodegaProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoBodegaProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoBodegaProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoBodegaProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoBodegaProducto();
				
				this.exportarEstadoBodegaProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoBodegaProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoBodegaProducto.jComboBoxTiposAccionesFormularioEstadoBodegaProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoBodegaProductos();
				//this.importarEstadoBodegaProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoBodegaProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoBodegaProducto.jComboBoxTiposAccionesFormularioEstadoBodegaProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoBodegaProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoBodegaProductosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoBodegaProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Bodega Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoBodegaProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoBodegaProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoBodegaProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Bodega Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoBodegaProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoBodegaProducto.jComboBoxTiposAccionesFormularioEstadoBodegaProducto.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoBodegaProducto();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoBodegaProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoBodegaProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoBodegaProducto();
			
			if(this.jInternalFrameDetalleFormEstadoBodegaProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoBodegaProducto> estadobodegaproductosSeleccionados=new ArrayList<EstadoBodegaProducto>();		
			EstadoBodegaProducto estadobodegaproducto=new EstadoBodegaProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoBodegaProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoBodegaProducto.getSelectedItem();
			
			
			
			
			estadobodegaproductosSeleccionados=this.getEstadoBodegaProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadobodegaproductosSeleccionados.size()==1) {
				for(EstadoBodegaProducto estadobodegaproductoAux:estadobodegaproductosSeleccionados) {
					estadobodegaproducto=estadobodegaproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoBodegaProducto();
			
      		//this.finishProcessEstadoBodegaProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoBodegaProductoReturnGeneral() throws Exception {
		if(this.estadobodegaproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadobodegaproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadobodegaproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadobodegaproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadobodegaproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadobodegaproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoBodegaProducto(false);
		}
		
		if(this.estadobodegaproductoReturnGeneral.getConRetornoLista() || this.estadobodegaproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.estadobodegaproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadobodegaproductoLogic.setEstadoBodegaProductos(this.estadobodegaproductoReturnGeneral.getEstadoBodegaProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadobodegaproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadobodegaproductoLogic.setEstadoBodegaProducto(this.estadobodegaproductoReturnGeneral.getEstadoBodegaProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoBodegaProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoBodegaProducto() throws Exception {
		
		
	}
	
	public ArrayList<EstadoBodegaProducto> getEstadoBodegaProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoBodegaProducto> estadobodegaproductosSeleccionados=new ArrayList<EstadoBodegaProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoBodegaProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoBodegaProducto estadobodegaproductoAux:estadobodegaproductoLogic.getEstadoBodegaProductos()) {
					if(estadobodegaproductoAux.getIsSelected()) {
						estadobodegaproductosSeleccionados.add(estadobodegaproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoBodegaProducto estadobodegaproductoAux:this.estadobodegaproductos) {
					if(estadobodegaproductoAux.getIsSelected()) {
						estadobodegaproductosSeleccionados.add(estadobodegaproductoAux);				
					}
				}
			}
			
			if(estadobodegaproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadobodegaproductosSeleccionados.addAll(this.estadobodegaproductoLogic.getEstadoBodegaProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadobodegaproductosSeleccionados.addAll(this.estadobodegaproductos);				
					}
				}
			}
		} else {
			estadobodegaproductosSeleccionados.add(this.estadobodegaproducto);
		}
		
		return estadobodegaproductosSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteEstadoBodegaProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoBodegaProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoBodegaProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoBodegaProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoBodegaProductosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Bodega Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoBodegaProductosSeleccionados() throws Exception {
		ArrayList<EstadoBodegaProducto> estadobodegaproductosSeleccionados=new ArrayList<EstadoBodegaProducto>();		
		
		estadobodegaproductosSeleccionados=this.getEstadoBodegaProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoBodegaProductos("Todos",estadobodegaproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoBodegaProductosSeleccionados() throws Exception {
		ArrayList<EstadoBodegaProducto> estadobodegaproductosSeleccionados=new ArrayList<EstadoBodegaProducto>();		
		
		estadobodegaproductosSeleccionados=this.getEstadoBodegaProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoBodegaProductos("Todos",estadobodegaproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoBodegaProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoBodegaProducto> estadobodegaproductosSeleccionados=new ArrayList<EstadoBodegaProducto>();
		
		estadobodegaproductosSeleccionados=this.getEstadoBodegaProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoBodegaProductos("Todos",estadobodegaproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoBodegaProductosSeleccionados() throws Exception {
		ArrayList<EstadoBodegaProducto> estadobodegaproductosSeleccionados=new ArrayList<EstadoBodegaProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoBodegaProducto();
		
		
		estadobodegaproductosSeleccionados=this.getEstadoBodegaProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoBodegaProducto();
		
		
		//this.generarReporteEstadoBodegaProductos("Todos",estadobodegaproductosSeleccionados ,estadobodegaproductoImplementable,estadobodegaproductoImplementableHome);
	}
	
	public void mostrarImportacionEstadoBodegaProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoBodegaProducto();
		
		this.abrirFrameImportacionEstadoBodegaProducto();		
		
			
		//this.generarReporteEstadoBodegaProductos("Todos",estadobodegaproductosSeleccionados ,estadobodegaproductoImplementable,estadobodegaproductoImplementableHome);
	}
	
	public void importarEstadoBodegaProductos() throws Exception {		
	
	}
	
	public void exportarEstadoBodegaProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoBodegaProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoBodegaProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoBodegaProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Bodega Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoBodegaProductosSeleccionados() throws Exception {
		ArrayList<EstadoBodegaProducto> estadobodegaproductosSeleccionados=new ArrayList<EstadoBodegaProducto>();		
		
		estadobodegaproductosSeleccionados=this.getEstadoBodegaProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadobodegaproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoBodegaProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoBodegaProducto estadobodegaproductoAux:estadobodegaproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoBodegaProducto(estadobodegaproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadobodegaproductoAux.setsDetalleGeneralEntityReporte(estadobodegaproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Bodega Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoBodegaProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoBodegaProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoBodegaProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadobodegaproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadobodegaproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadobodegaproducto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadobodegaproducto.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadobodegaproducto.getes_defecto().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoBodegaProductosSeleccionados() throws Exception {
		ArrayList<EstadoBodegaProducto> estadobodegaproductosSeleccionados=new ArrayList<EstadoBodegaProducto>();		
		
		estadobodegaproductosSeleccionados=this.getEstadoBodegaProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadobodegaproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoBodegaProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoBodegaProducto(row);				
				iRow++;
			}				
			
			for(EstadoBodegaProducto estadobodegaproductoAux:estadobodegaproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoBodegaProducto(estadobodegaproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Bodega Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoBodegaProductosSeleccionados() throws Exception {
		ArrayList<EstadoBodegaProducto> estadobodegaproductosSeleccionados=new ArrayList<EstadoBodegaProducto>();		
		
		estadobodegaproductosSeleccionados=this.getEstadoBodegaProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadobodegaproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadobodegaproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadobodegaproducto");
			//elementRoot.appendChild(element);
		
			for(EstadoBodegaProducto estadobodegaproductoAux:estadobodegaproductosSeleccionados) {
				element = document.createElement("estadobodegaproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoBodegaProducto(estadobodegaproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Bodega Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoBodegaProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoBodegaProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoBodegaProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadobodegaproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadobodegaproducto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadobodegaproducto.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(estadobodegaproducto.getes_defecto());				
	}
	
	public void setFilaDatosExportarXmlEstadoBodegaProducto(EstadoBodegaProducto estadobodegaproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoBodegaProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadobodegaproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoBodegaProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadobodegaproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoBodegaProductoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadobodegaproducto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoBodegaProductoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadobodegaproducto.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementes_defecto = document.createElement(EstadoBodegaProductoConstantesFunciones.ESDEFECTO);
		elementes_defecto.appendChild(document.createTextNode(estadobodegaproducto.getes_defecto().toString().trim()));
		element.appendChild(elementes_defecto);
	}
	
	public void generarReporteGroupGenericoEstadoBodegaProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoBodegaProducto> estadobodegaproductosSeleccionados=new ArrayList<EstadoBodegaProducto>();
		
		estadobodegaproductosSeleccionados=this.getEstadoBodegaProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoBodegaProducto(estadobodegaproductosSeleccionados);
		
		this.generarReporteEstadoBodegaProductos("Todos",estadobodegaproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoBodegaProducto(ArrayList<EstadoBodegaProducto> estadobodegaproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoBodegaProducto estadobodegaproductoAux:estadobodegaproductosSeleccionados) {
				estadobodegaproductoAux.setsDetalleGeneralEntityReporte(estadobodegaproductoAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoBodegaProductoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadobodegaproductoAux.setsDescripcionGeneralEntityReporte1(estadobodegaproductoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoBodegaProductoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadobodegaproductoAux.setsDescripcionGeneralEntityReporte1(estadobodegaproductoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(EstadoBodegaProductoConstantesFunciones.LABEL_ESDEFECTO)) {
					existe=true;
					estadobodegaproductoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(estadobodegaproductoAux.getes_defecto()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoBodegaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoBodegaProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoBodegaProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaActualizarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaEliminarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaCancelarEstadoBodegaProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoBodegaProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoBodegaProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoBodegaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto=false;
			this.isVisibilidadCeldaModificarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaActualizarEstadoBodegaProducto=true;
			this.isVisibilidadCeldaEliminarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaCancelarEstadoBodegaProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoBodegaProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoBodegaProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoBodegaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto=false;
			this.isVisibilidadCeldaModificarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaActualizarEstadoBodegaProducto=true;
			this.isVisibilidadCeldaEliminarEstadoBodegaProducto=true;
			this.isVisibilidadCeldaCancelarEstadoBodegaProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoBodegaProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoBodegaProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoBodegaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto=false;
			this.isVisibilidadCeldaModificarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaActualizarEstadoBodegaProducto=true;
			this.isVisibilidadCeldaEliminarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaCancelarEstadoBodegaProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoBodegaProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoBodegaProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoBodegaProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto=true;
			this.isVisibilidadCeldaModificarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaActualizarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaEliminarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaCancelarEstadoBodegaProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoBodegaProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoBodegaProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoBodegaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto=false;
			this.isVisibilidadCeldaActualizarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaEliminarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaCancelarEstadoBodegaProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoBodegaProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoBodegaProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoBodegaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto=false;
			this.isVisibilidadCeldaModificarEstadoBodegaProducto=true;
			this.isVisibilidadCeldaActualizarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaEliminarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaCancelarEstadoBodegaProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoBodegaProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoBodegaProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoBodegaProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoBodegaProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto=true;
		} else {
			this.actualizarEstadoPanelsEstadoBodegaProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoBodegaProducto=false;
			//this.isVisibilidadCeldaVerFormEstadoBodegaProducto=false;
			this.isVisibilidadCeldaDuplicarEstadoBodegaProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadobodegaproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoBodegaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoBodegaProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
			if(!estadobodegaproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto=false;												
			}
			
			this.jButtonCerrarEstadoBodegaProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoBodegaProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.estadobodegaproducto)) {
			this.isVisibilidadCeldaActualizarEstadoBodegaProducto=false;
			this.isVisibilidadCeldaEliminarEstadoBodegaProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoBodegaProducto() {
	}
	
	public void actualizarEstadoPanelsEstadoBodegaProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoBodegaProducto!=null) {
				this.jScrollPanelDatosEdicionEstadoBodegaProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoBodegaProducto!=null) {
				this.jScrollPanelDatosEstadoBodegaProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoBodegaProducto!=null) {
				this.jPanelPaginacionEstadoBodegaProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoBodegaProducto!=null) {
				this.jPanelParametrosReportesEstadoBodegaProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoBodegaProducto!=null) {
				this.jScrollPanelDatosEdicionEstadoBodegaProducto.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoBodegaProducto!=null) {
				this.jScrollPanelDatosEstadoBodegaProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoBodegaProducto!=null) {
				this.jPanelPaginacionEstadoBodegaProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoBodegaProducto!=null) {
				this.jPanelParametrosReportesEstadoBodegaProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoBodegaProducto!=null) {
				this.jScrollPanelDatosEdicionEstadoBodegaProducto.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoBodegaProducto!=null) {
				this.jScrollPanelDatosEstadoBodegaProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoBodegaProducto!=null) {
				this.jPanelPaginacionEstadoBodegaProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoBodegaProducto!=null) {
				this.jPanelParametrosReportesEstadoBodegaProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoBodegaProducto!=null) {
				this.jScrollPanelDatosEdicionEstadoBodegaProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoBodegaProducto!=null) {
				this.jScrollPanelDatosEstadoBodegaProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoBodegaProducto!=null) {
				this.jPanelPaginacionEstadoBodegaProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoBodegaProducto!=null) {
				this.jPanelParametrosReportesEstadoBodegaProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoBodegaProducto!=null) {
				this.jScrollPanelDatosEdicionEstadoBodegaProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoBodegaProducto!=null) {
				this.jScrollPanelDatosEstadoBodegaProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoBodegaProducto!=null) {
				this.jPanelPaginacionEstadoBodegaProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoBodegaProducto!=null) {
				this.jPanelParametrosReportesEstadoBodegaProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoBodegaProducto!=null) {
				this.jScrollPanelDatosEdicionEstadoBodegaProducto.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoBodegaProducto!=null) {
				this.jScrollPanelDatosEstadoBodegaProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoBodegaProducto!=null) {
				this.jPanelPaginacionEstadoBodegaProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoBodegaProducto!=null) {
				this.jPanelParametrosReportesEstadoBodegaProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoBodegaProducto!=null) {
				this.jScrollPanelDatosEdicionEstadoBodegaProducto.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoBodegaProducto!=null) {
				this.jScrollPanelDatosEstadoBodegaProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoBodegaProducto!=null) {
				this.jPanelPaginacionEstadoBodegaProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoBodegaProducto!=null) {
				this.jPanelParametrosReportesEstadoBodegaProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadobodegaproductoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoBodegaProductoSessionBean estadobodegaproductoSessionBean=new EstadoBodegaProductoSessionBean();
		
		if(this.estadobodegaproductoSessionBean==null) {
			this.estadobodegaproductoSessionBean=new EstadoBodegaProductoSessionBean();
		}
		
		this.estadobodegaproductoSessionBean.setsUltimaBusquedaEstadoBodegaProducto(this.getsAccionBusqueda());
		this.estadobodegaproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadobodegaproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoBodegaProductoSessionBean estadobodegaproductoSessionBean=new EstadoBodegaProductoSessionBean();
		
		if(this.estadobodegaproductoSessionBean==null) {
			this.estadobodegaproductoSessionBean=new EstadoBodegaProductoSessionBean();
		}
		
		if(this.estadobodegaproductoSessionBean.getsUltimaBusquedaEstadoBodegaProducto()!=null&&!this.estadobodegaproductoSessionBean.getsUltimaBusquedaEstadoBodegaProducto().equals("")) {
			this.setsAccionBusqueda(estadobodegaproductoSessionBean.getsUltimaBusquedaEstadoBodegaProducto());
			this.setiNumeroPaginacion(estadobodegaproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadobodegaproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadobodegaproductoSessionBean.setsUltimaBusquedaEstadoBodegaProducto("");
		this.estadobodegaproductoSessionBean.setiNumeroPaginacion(EstadoBodegaProductoConstantesFunciones.INUMEROPAGINACION);
		this.estadobodegaproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoBodegaProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoBodegaProducto() {
		this.updateBorderResaltarBusquedasFormularioEstadoBodegaProducto();
		this.updateVisibilidadBusquedasFormularioEstadoBodegaProducto();
		this.updateHabilitarBusquedasFormularioEstadoBodegaProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoBodegaProducto() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoBodegaProducto() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoBodegaProducto() {
	}
	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioEstadoBodegaProducto() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoBodegaProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoBodegaProducto();
		this.updateVisibilidadResaltarControlesFormularioEstadoBodegaProducto();
		this.updateHabilitarResaltarControlesFormularioEstadoBodegaProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoBodegaProducto() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadobodegaproductoConstantesFunciones.resaltaridEstadoBodegaProducto!=null && this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldidEstadoBodegaProducto.setBorder(this.estadobodegaproductoConstantesFunciones.resaltaridEstadoBodegaProducto);}
		if(this.estadobodegaproductoConstantesFunciones.resaltarcodigoEstadoBodegaProducto!=null && this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldcodigoEstadoBodegaProducto.setBorder(this.estadobodegaproductoConstantesFunciones.resaltarcodigoEstadoBodegaProducto);}
		if(this.estadobodegaproductoConstantesFunciones.resaltarnombreEstadoBodegaProducto!=null && this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextAreanombreEstadoBodegaProducto.setBorder(this.estadobodegaproductoConstantesFunciones.resaltarnombreEstadoBodegaProducto);}
		if(this.estadobodegaproductoConstantesFunciones.resaltares_defectoEstadoBodegaProducto!=null && this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {this.jInternalFrameDetalleFormEstadoBodegaProducto.jCheckBoxes_defectoEstadoBodegaProducto.setBorderPainted(true);this.jInternalFrameDetalleFormEstadoBodegaProducto.jCheckBoxes_defectoEstadoBodegaProducto.setBorder(this.estadobodegaproductoConstantesFunciones.resaltares_defectoEstadoBodegaProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoBodegaProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
	
		//this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldidEstadoBodegaProducto.setVisible(this.estadobodegaproductoConstantesFunciones.mostraridEstadoBodegaProducto);
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jPanelidEstadoBodegaProducto.setVisible(this.estadobodegaproductoConstantesFunciones.mostraridEstadoBodegaProducto);
		//this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldcodigoEstadoBodegaProducto.setVisible(this.estadobodegaproductoConstantesFunciones.mostrarcodigoEstadoBodegaProducto);
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jPanelcodigoEstadoBodegaProducto.setVisible(this.estadobodegaproductoConstantesFunciones.mostrarcodigoEstadoBodegaProducto);
		//this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextAreanombreEstadoBodegaProducto.setVisible(this.estadobodegaproductoConstantesFunciones.mostrarnombreEstadoBodegaProducto);
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jPanelnombreEstadoBodegaProducto.setVisible(this.estadobodegaproductoConstantesFunciones.mostrarnombreEstadoBodegaProducto);
		//this.jInternalFrameDetalleFormEstadoBodegaProducto.jCheckBoxes_defectoEstadoBodegaProducto.setVisible(this.estadobodegaproductoConstantesFunciones.mostrares_defectoEstadoBodegaProducto);
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jPaneles_defectoEstadoBodegaProducto.setVisible(this.estadobodegaproductoConstantesFunciones.mostrares_defectoEstadoBodegaProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoBodegaProducto() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoBodegaProducto!=null) {
	
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldidEstadoBodegaProducto.setEnabled(this.estadobodegaproductoConstantesFunciones.activaridEstadoBodegaProducto);
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextFieldcodigoEstadoBodegaProducto.setEnabled(this.estadobodegaproductoConstantesFunciones.activarcodigoEstadoBodegaProducto);
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jTextAreanombreEstadoBodegaProducto.setEnabled(this.estadobodegaproductoConstantesFunciones.activarnombreEstadoBodegaProducto);
		this.jInternalFrameDetalleFormEstadoBodegaProducto.jCheckBoxes_defectoEstadoBodegaProducto.setEnabled(this.estadobodegaproductoConstantesFunciones.activares_defectoEstadoBodegaProducto);
		}
	}
	
		
}