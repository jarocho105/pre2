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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.inventario.util.ExistenciasCostosConstantesFunciones;
import com.bydan.erp.inventario.util.report.ExistenciasCostosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.ExistenciasCostosParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.ExistenciasCostosBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.inventario.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.inventario.util.*;

import com.bydan.erp.inventario.util.report.*;
import com.bydan.erp.inventario.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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

//import org.hibernate.collection.PersistentBag;

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
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;

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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ExistenciasCostosBeanSwingJInternalFrame extends ExistenciasCostosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ExistenciasCostosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ExistenciasCostos> existenciascostosValidator = new ClassValidator<ExistenciasCostos>(ExistenciasCostos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ExistenciasCostos existenciascostos;	
	public ExistenciasCostos existenciascostosAux;
	public ExistenciasCostos existenciascostosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ExistenciasCostos existenciascostosTotales;
	public Long idExistenciasCostosActual;
	public Long iIdNuevoExistenciasCostos=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboLinea="";

	public List<Linea> lineasForeignKey;

	public List<Linea> getlineasForeignKey() {
		return lineasForeignKey;
	}

	public void setlineasForeignKey(List<Linea> lineasForeignKey) {
		this.lineasForeignKey = lineasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineaForeignKey;

	public Linea getlineaForeignKey() {
		return lineaForeignKey;
	}

	public void setlineaForeignKey(Linea lineaForeignKey) {
		this.lineaForeignKey = lineaForeignKey;
	}

	public String sFinalQueryComboLineaGrupo="";

	public List<Linea> lineagruposForeignKey;

	public List<Linea> getlineagruposForeignKey() {
		return lineagruposForeignKey;
	}

	public void setlineagruposForeignKey(List<Linea> lineagruposForeignKey) {
		this.lineagruposForeignKey = lineagruposForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineagrupoForeignKey;

	public Linea getlineagrupoForeignKey() {
		return lineagrupoForeignKey;
	}

	public void setlineagrupoForeignKey(Linea lineagrupoForeignKey) {
		this.lineagrupoForeignKey = lineagrupoForeignKey;
	}

	public String sFinalQueryComboLineaCategoria="";

	public List<Linea> lineacategoriasForeignKey;

	public List<Linea> getlineacategoriasForeignKey() {
		return lineacategoriasForeignKey;
	}

	public void setlineacategoriasForeignKey(List<Linea> lineacategoriasForeignKey) {
		this.lineacategoriasForeignKey = lineacategoriasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineacategoriaForeignKey;

	public Linea getlineacategoriaForeignKey() {
		return lineacategoriaForeignKey;
	}

	public void setlineacategoriaForeignKey(Linea lineacategoriaForeignKey) {
		this.lineacategoriaForeignKey = lineacategoriaForeignKey;
	}

	public String sFinalQueryComboLineaMarca="";

	public List<Linea> lineamarcasForeignKey;

	public List<Linea> getlineamarcasForeignKey() {
		return lineamarcasForeignKey;
	}

	public void setlineamarcasForeignKey(List<Linea> lineamarcasForeignKey) {
		this.lineamarcasForeignKey = lineamarcasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineamarcaForeignKey;

	public Linea getlineamarcaForeignKey() {
		return lineamarcaForeignKey;
	}

	public void setlineamarcaForeignKey(Linea lineamarcaForeignKey) {
		this.lineamarcaForeignKey = lineamarcaForeignKey;
	}

		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoExistenciasCostos;
	public Boolean isPermisoNuevoExistenciasCostos;
	public Boolean isPermisoActualizarExistenciasCostos;
	public Boolean isPermisoActualizarOriginalExistenciasCostos;
	public Boolean isPermisoEliminarExistenciasCostos;
	public Boolean isPermisoGuardarCambiosExistenciasCostos;
	public Boolean isPermisoConsultaExistenciasCostos;
	public Boolean isPermisoBusquedaExistenciasCostos;
	public Boolean isPermisoReporteExistenciasCostos;
	public Boolean isPermisoPaginacionMedioExistenciasCostos;
	public Boolean isPermisoPaginacionAltoExistenciasCostos;
	public Boolean isPermisoPaginacionTodoExistenciasCostos;
	public Boolean isPermisoCopiarExistenciasCostos;
	public Boolean isPermisoVerFormExistenciasCostos;
	public Boolean isPermisoDuplicarExistenciasCostos;
	public Boolean isPermisoOrdenExistenciasCostos;
	
	
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
	
	public ExistenciasCostosParameterReturnGeneral existenciascostosReturnGeneral;
	public ExistenciasCostosParameterReturnGeneral existenciascostosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoExistenciasCostos=false;
	public Boolean esParaAccionDesdeFormularioExistenciasCostos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ExistenciasCostosSessionBeanAdditional existenciascostosSessionBeanAdditional=null;
	
	public ExistenciasCostosSessionBeanAdditional getExistenciasCostosSessionBeanAdditional() {
		return this.existenciascostosSessionBeanAdditional;
	}
	
	public void setExistenciasCostosSessionBeanAdditional(ExistenciasCostosSessionBeanAdditional existenciascostosSessionBeanAdditional) {
		try {
			this.existenciascostosSessionBeanAdditional=existenciascostosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ExistenciasCostosBeanSwingJInternalFrameAdditional existenciascostosBeanSwingJInternalFrameAdditional=null;
	//public class ExistenciasCostosBeanSwingJInternalFrame
	
	public ExistenciasCostosBeanSwingJInternalFrameAdditional getExistenciasCostosBeanSwingJInternalFrameAdditional() {
		return this.existenciascostosBeanSwingJInternalFrameAdditional;
	}
	
	public void setExistenciasCostosBeanSwingJInternalFrameAdditional(ExistenciasCostosBeanSwingJInternalFrameAdditional existenciascostosBeanSwingJInternalFrameAdditional) {
		try {
			this.existenciascostosBeanSwingJInternalFrameAdditional=existenciascostosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ExistenciasCostosLogic existenciascostosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ExistenciasCostos existenciascostosBean;
	public ExistenciasCostosConstantesFunciones existenciascostosConstantesFunciones;
	//public ExistenciasCostosParameterReturnGeneral existenciascostosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	
	//PARAMETROS
	
	
	//public List<ExistenciasCostos> existenciascostoss;	
	//public List<ExistenciasCostos> existenciascostossEliminados;
	//public List<ExistenciasCostos> existenciascostossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoExistenciasCostos=false;
	public Boolean isVisibilidadCeldaDuplicarExistenciasCostos=true;
	public Boolean isVisibilidadCeldaCopiarExistenciasCostos=true;
	public Boolean isVisibilidadCeldaVerFormExistenciasCostos=true;
	public Boolean isVisibilidadCeldaOrdenExistenciasCostos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesExistenciasCostos=false;
	public Boolean isVisibilidadCeldaModificarExistenciasCostos=false;
	public Boolean isVisibilidadCeldaActualizarExistenciasCostos=false;
	public Boolean isVisibilidadCeldaEliminarExistenciasCostos=false;
	public Boolean isVisibilidadCeldaCancelarExistenciasCostos=false;
	public Boolean isVisibilidadCeldaGuardarExistenciasCostos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosExistenciasCostos=false;	
	
	
	public Boolean isVisibilidadBusquedaExistenciasCostos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	
	public Long getiIdNuevoExistenciasCostos() {
		return this.iIdNuevoExistenciasCostos;
	}

	public void setiIdNuevoExistenciasCostos(Long iIdNuevoExistenciasCostos) {
		this.iIdNuevoExistenciasCostos = iIdNuevoExistenciasCostos;
	}
	
	public Long getidExistenciasCostosActual() {
		return this.idExistenciasCostosActual;
	}

	public void setidExistenciasCostosActual(Long idExistenciasCostosActual) {
		this.idExistenciasCostosActual = idExistenciasCostosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ExistenciasCostos getexistenciascostos() {
		return this.existenciascostos;
	}

	public void setexistenciascostos(ExistenciasCostos existenciascostos) {
		this.existenciascostos = existenciascostos;
	}
	
	public ExistenciasCostos getexistenciascostosAux() {
		return this.existenciascostosAux;
	}

	public void setexistenciascostosAux(ExistenciasCostos existenciascostosAux) {
		this.existenciascostosAux = existenciascostosAux;
	}				
	
	public ExistenciasCostos getexistenciascostosAnterior() {
		return this.existenciascostosAnterior;
	}

	public void setexistenciascostosAnterior(ExistenciasCostos existenciascostosAnterior) {
		this.existenciascostosAnterior = existenciascostosAnterior;
	}	
	
	public ExistenciasCostos getexistenciascostosTotales() {
		return this.existenciascostosTotales;
	}

	public void setexistenciascostosTotales(ExistenciasCostos existenciascostosTotales) {
		this.existenciascostosTotales = existenciascostosTotales;
	}	
	
	public ExistenciasCostos getexistenciascostosBean() {
		return this.existenciascostosBean;
	}

	public void setexistenciascostosBean(ExistenciasCostos existenciascostosBean) {
		this.existenciascostosBean = existenciascostosBean;
	}	
	
	public ExistenciasCostosParameterReturnGeneral getexistenciascostosReturnGeneral() {
		return this.existenciascostosReturnGeneral;
	}

	public void setexistenciascostosReturnGeneral(ExistenciasCostosParameterReturnGeneral existenciascostosReturnGeneral) {
		this.existenciascostosReturnGeneral = existenciascostosReturnGeneral;
	}	
	
	
	public Long id_lineaBusquedaExistenciasCostos=-1L;

	public Long getid_lineaBusquedaExistenciasCostos() {
		return this.id_lineaBusquedaExistenciasCostos;
	}

	public void setid_lineaBusquedaExistenciasCostos(Long id_lineaBusquedaExistenciasCostos) {
		this.id_lineaBusquedaExistenciasCostos = id_lineaBusquedaExistenciasCostos;
	}

;
	public Long id_linea_grupoBusquedaExistenciasCostos=-1L;

	public Long getid_linea_grupoBusquedaExistenciasCostos() {
		return this.id_linea_grupoBusquedaExistenciasCostos;
	}

	public void setid_linea_grupoBusquedaExistenciasCostos(Long id_linea_grupoBusquedaExistenciasCostos) {
		this.id_linea_grupoBusquedaExistenciasCostos = id_linea_grupoBusquedaExistenciasCostos;
	}

;
	public Long id_linea_categoriaBusquedaExistenciasCostos=-1L;

	public Long getid_linea_categoriaBusquedaExistenciasCostos() {
		return this.id_linea_categoriaBusquedaExistenciasCostos;
	}

	public void setid_linea_categoriaBusquedaExistenciasCostos(Long id_linea_categoriaBusquedaExistenciasCostos) {
		this.id_linea_categoriaBusquedaExistenciasCostos = id_linea_categoriaBusquedaExistenciasCostos;
	}

;
	public Long id_linea_marcaBusquedaExistenciasCostos=-1L;

	public Long getid_linea_marcaBusquedaExistenciasCostos() {
		return this.id_linea_marcaBusquedaExistenciasCostos;
	}

	public void setid_linea_marcaBusquedaExistenciasCostos(Long id_linea_marcaBusquedaExistenciasCostos) {
		this.id_linea_marcaBusquedaExistenciasCostos = id_linea_marcaBusquedaExistenciasCostos;
	}

;
	public Date fecha_emision_hastaBusquedaExistenciasCostos=new Date();

	public Date getfecha_emision_hastaBusquedaExistenciasCostos() {
		return this.fecha_emision_hastaBusquedaExistenciasCostos;
	}

	public void setfecha_emision_hastaBusquedaExistenciasCostos(Date fecha_emision_hastaBusquedaExistenciasCostos) {
		this.fecha_emision_hastaBusquedaExistenciasCostos = fecha_emision_hastaBusquedaExistenciasCostos;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_lineaFK_IdLinea=-1L;

	public Long getid_lineaFK_IdLinea() {
		return this.id_lineaFK_IdLinea;
	}

	public void setid_lineaFK_IdLinea(Long id_lineaFK_IdLinea) {
		this.id_lineaFK_IdLinea = id_lineaFK_IdLinea;
	}

	public Long id_linea_categoriaFK_IdLineaCategoria=-1L;

	public Long getid_linea_categoriaFK_IdLineaCategoria() {
		return this.id_linea_categoriaFK_IdLineaCategoria;
	}

	public void setid_linea_categoriaFK_IdLineaCategoria(Long id_linea_categoriaFK_IdLineaCategoria) {
		this.id_linea_categoriaFK_IdLineaCategoria = id_linea_categoriaFK_IdLineaCategoria;
	}

	public Long id_linea_grupoFK_IdLineaGrupo=-1L;

	public Long getid_linea_grupoFK_IdLineaGrupo() {
		return this.id_linea_grupoFK_IdLineaGrupo;
	}

	public void setid_linea_grupoFK_IdLineaGrupo(Long id_linea_grupoFK_IdLineaGrupo) {
		this.id_linea_grupoFK_IdLineaGrupo = id_linea_grupoFK_IdLineaGrupo;
	}

	public Long id_linea_marcaFK_IdLineaMarca=-1L;

	public Long getid_linea_marcaFK_IdLineaMarca() {
		return this.id_linea_marcaFK_IdLineaMarca;
	}

	public void setid_linea_marcaFK_IdLineaMarca(Long id_linea_marcaFK_IdLineaMarca) {
		this.id_linea_marcaFK_IdLineaMarca = id_linea_marcaFK_IdLineaMarca;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ExistenciasCostosLogic getExistenciasCostosLogic()	{		
		return existenciascostosLogic;
	}

	public void setExistenciasCostosLogic(ExistenciasCostosLogic existenciascostosLogic) {
		this.existenciascostosLogic = existenciascostosLogic;
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
	
	public Boolean getIsEsNuevoExistenciasCostos() {
		return isEsNuevoExistenciasCostos;
	}

	public void setIsEsNuevoExistenciasCostos(Boolean isEsNuevoExistenciasCostos) {
		this.isEsNuevoExistenciasCostos = isEsNuevoExistenciasCostos;
	}

	public Boolean getEsParaAccionDesdeFormularioExistenciasCostos() {
		return esParaAccionDesdeFormularioExistenciasCostos;
	}
	
	public void setEsParaAccionDesdeFormularioExistenciasCostos(Boolean esParaAccionDesdeFormularioExistenciasCostos) {
		this.esParaAccionDesdeFormularioExistenciasCostos = esParaAccionDesdeFormularioExistenciasCostos;
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
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.existenciascostosSessionBean==null) {
				this.existenciascostosSessionBean=new ExistenciasCostosSessionBean();
			}

			if(!this.existenciascostosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(existenciascostosSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosLineasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.existenciascostosSessionBean==null) {
				this.existenciascostosSessionBean=new ExistenciasCostosSessionBean();
			}

			if(!this.existenciascostosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLinea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(existenciascostosSessionBean.getlidLineaActual());
					this.lineasForeignKey.add(lineaLogic.getLinea());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosLineaGruposForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineagruposForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.existenciascostosSessionBean==null) {
				this.existenciascostosSessionBean=new ExistenciasCostosSessionBean();
			}

			if(!this.existenciascostosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineagrupoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineagruposForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaGrupo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(existenciascostosSessionBean.getlidLineaGrupoActual());
					this.lineagruposForeignKey.add(lineaLogic.getLinea());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosLineaCategoriasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineacategoriasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.existenciascostosSessionBean==null) {
				this.existenciascostosSessionBean=new ExistenciasCostosSessionBean();
			}

			if(!this.existenciascostosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineacategoriaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineacategoriasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaCategoria(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(existenciascostosSessionBean.getlidLineaCategoriaActual());
					this.lineacategoriasForeignKey.add(lineaLogic.getLinea());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosLineaMarcasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineamarcasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.existenciascostosSessionBean==null) {
				this.existenciascostosSessionBean=new ExistenciasCostosSessionBean();
			}

			if(!this.existenciascostosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineamarcaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineamarcasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaMarca(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(existenciascostosSessionBean.getlidLineaMarcaActual());
					this.lineamarcasForeignKey.add(lineaLogic.getLinea());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.existenciascostos!=null) {
						this.existenciascostos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
						this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_empresaExistenciasCostos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaExistenciasCostos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
						if(this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_empresaExistenciasCostos.getItemCount()>0) {
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_empresaExistenciasCostos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaExistenciasCostosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaExistenciasCostosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaExistenciasCostosGenerico!=null && jComboBoxid_empresaExistenciasCostosGenerico.getItemCount()>0) {
					jComboBoxid_empresaExistenciasCostosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaForeignKey(Long idLineaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineaTemp!=null) {

					if(this.existenciascostos!=null) {
						this.existenciascostos.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
						this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_lineaExistenciasCostos.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaExistenciasCostos.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
						if(this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_lineaExistenciasCostos.getItemCount()>0) {
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_lineaExistenciasCostos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaExistenciasCostos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos!=null) {
						jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos!=null) {
							//jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos.getItemCount()>0) {
								jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualLineaForeignKeyDescripcion(Long idLineaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaExistenciasCostosGenerico)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(lineaTemp!=null) {
				jComboBoxid_lineaExistenciasCostosGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaExistenciasCostosGenerico!=null && jComboBoxid_lineaExistenciasCostosGenerico.getItemCount()>0) {
					jComboBoxid_lineaExistenciasCostosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaGrupoForeignKey(Long idLineaGrupoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineagrupoTemp!=null) {

					if(this.existenciascostos!=null) {
						this.existenciascostos.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
						this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_grupoExistenciasCostos.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoExistenciasCostos.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
						if(this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_grupoExistenciasCostos.getItemCount()>0) {
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_grupoExistenciasCostos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaExistenciasCostos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos!=null) {
						jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos!=null) {
							//jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualLineaGrupoForeignKeyDescripcion(Long idLineaGrupoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineagrupoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoExistenciasCostosGenerico)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(lineagrupoTemp!=null) {
				jComboBoxid_linea_grupoExistenciasCostosGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoExistenciasCostosGenerico!=null && jComboBoxid_linea_grupoExistenciasCostosGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoExistenciasCostosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaCategoriaForeignKey(Long idLineaCategoriaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineacategoriaTemp!=null) {

					if(this.existenciascostos!=null) {
						this.existenciascostos.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
						this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_categoriaExistenciasCostos.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaExistenciasCostos.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
						if(this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_categoriaExistenciasCostos.getItemCount()>0) {
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_categoriaExistenciasCostos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaExistenciasCostos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos!=null) {
						jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos!=null) {
							//jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualLineaCategoriaForeignKeyDescripcion(Long idLineaCategoriaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineacategoriaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaExistenciasCostosGenerico)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(lineacategoriaTemp!=null) {
				jComboBoxid_linea_categoriaExistenciasCostosGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaExistenciasCostosGenerico!=null && jComboBoxid_linea_categoriaExistenciasCostosGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaExistenciasCostosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaMarcaForeignKey(Long idLineaMarcaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineamarcaTemp!=null) {

					if(this.existenciascostos!=null) {
						this.existenciascostos.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
						this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_marcaExistenciasCostos.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaExistenciasCostos.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
						if(this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_marcaExistenciasCostos.getItemCount()>0) {
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_marcaExistenciasCostos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaExistenciasCostos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos!=null) {
						jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos!=null) {
							//jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualLineaMarcaForeignKeyDescripcion(Long idLineaMarcaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineamarcaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaExistenciasCostosGenerico)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(lineamarcaTemp!=null) {
				jComboBoxid_linea_marcaExistenciasCostosGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaExistenciasCostosGenerico!=null && jComboBoxid_linea_marcaExistenciasCostosGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaExistenciasCostosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ExistenciasCostos existenciascostos,JComboBox jComboBoxid_empresaExistenciasCostosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaExistenciasCostosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_empresaExistenciasCostos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaExistenciasCostosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				existenciascostos.setid_empresa(empresaAux.getId());
				existenciascostos.setempresa_descripcion(ExistenciasCostosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				existenciascostos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ExistenciasCostos existenciascostos,JComboBox jComboBoxid_lineaExistenciasCostosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaExistenciasCostosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_lineaExistenciasCostos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaExistenciasCostosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				existenciascostos.setid_linea(lineaAux.getId());
				existenciascostos.setlinea_descripcion(ExistenciasCostosConstantesFunciones.getLineaDescripcion(lineaAux));
				existenciascostos.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ExistenciasCostos existenciascostos,JComboBox jComboBoxid_linea_grupoExistenciasCostosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoExistenciasCostosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_grupoExistenciasCostos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoExistenciasCostosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				existenciascostos.setid_linea_grupo(lineaAux.getId());
				existenciascostos.setlineagrupo_descripcion(ExistenciasCostosConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				existenciascostos.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ExistenciasCostos existenciascostos,JComboBox jComboBoxid_linea_categoriaExistenciasCostosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaExistenciasCostosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_categoriaExistenciasCostos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaExistenciasCostosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				existenciascostos.setid_linea_categoria(lineaAux.getId());
				existenciascostos.setlineacategoria_descripcion(ExistenciasCostosConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				existenciascostos.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ExistenciasCostos existenciascostos,JComboBox jComboBoxid_linea_marcaExistenciasCostosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaExistenciasCostosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_marcaExistenciasCostos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaExistenciasCostosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				existenciascostos.setid_linea_marca(lineaAux.getId());
				existenciascostos.setlineamarca_descripcion(ExistenciasCostosConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				existenciascostos.setLineaMarca(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { 
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_empresaExistenciasCostos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_empresaExistenciasCostos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { 
					}

					if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { 
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_lineaExistenciasCostos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_lineaExistenciasCostos.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { 
					}

					if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaExistenciasCostos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos.addItem(linea);
							}
						}

						if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaGruposForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { 
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_grupoExistenciasCostos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_grupoExistenciasCostos.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { 
					}

					if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaExistenciasCostos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.addItem(lineagrupo);
							}
						}

						if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaCategoriasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { 
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_categoriaExistenciasCostos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_categoriaExistenciasCostos.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { 
					}

					if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaExistenciasCostos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.addItem(lineacategoria);
							}
						}

						if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaMarcasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { 
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_marcaExistenciasCostos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_marcaExistenciasCostos.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { 
					}

					if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaExistenciasCostos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.addItem(lineamarca);
							}
						}

						if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_empresaExistenciasCostos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_empresaExistenciasCostos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaForeignKey(Linea linea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_lineaExistenciasCostos.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_lineaExistenciasCostos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaGrupoForeignKey(Linea lineagrupo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_grupoExistenciasCostos.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_grupoExistenciasCostos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaCategoriaForeignKey(Linea lineacategoria,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_categoriaExistenciasCostos.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_categoriaExistenciasCostos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaMarcaForeignKey(Linea lineamarca,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_marcaExistenciasCostos.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_marcaExistenciasCostos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesExistenciasCostos() throws Exception {
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
		
	public ExistenciasCostosParameterReturnGeneral getExistenciasCostosParameterGeneral() {
		return this.existenciascostosParameterGeneral;
	}
	
	public void setExistenciasCostosParameterGeneral(ExistenciasCostosParameterReturnGeneral existenciascostosParameterGeneral) {
		this.existenciascostosParameterGeneral = existenciascostosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoExistenciasCostos() {
		return isPermisoTodoExistenciasCostos;
	}

	public void setIsPermisoTodoExistenciasCostos(Boolean isPermisoTodoExistenciasCostos) {
		this.isPermisoTodoExistenciasCostos = isPermisoTodoExistenciasCostos;
	}

	public Boolean getIsPermisoNuevoExistenciasCostos() {
		return isPermisoNuevoExistenciasCostos;
	}

	public void setIsPermisoNuevoExistenciasCostos(Boolean isPermisoNuevoExistenciasCostos) {
		this.isPermisoNuevoExistenciasCostos = isPermisoNuevoExistenciasCostos;
	}

	public Boolean getIsPermisoActualizarExistenciasCostos() {
		return isPermisoActualizarExistenciasCostos;
	}

	public void setIsPermisoActualizarExistenciasCostos(Boolean isPermisoActualizarExistenciasCostos) {
		this.isPermisoActualizarExistenciasCostos = isPermisoActualizarExistenciasCostos;
	}

	public Boolean getIsPermisoEliminarExistenciasCostos() {
		return isPermisoEliminarExistenciasCostos;
	}

	public void setIsPermisoEliminarExistenciasCostos(Boolean isPermisoEliminarExistenciasCostos) {
		this.isPermisoEliminarExistenciasCostos = isPermisoEliminarExistenciasCostos;
	}

	public Boolean getIsPermisoGuardarCambiosExistenciasCostos() {
		return isPermisoGuardarCambiosExistenciasCostos;
	}

	public void setIsPermisoGuardarCambiosExistenciasCostos(Boolean isPermisoGuardarCambiosExistenciasCostos) {
		this.isPermisoGuardarCambiosExistenciasCostos = isPermisoGuardarCambiosExistenciasCostos;
	}
	
	public Boolean getIsPermisoConsultaExistenciasCostos() {
		return isPermisoConsultaExistenciasCostos;
	}

	public void setIsPermisoConsultaExistenciasCostos(Boolean isPermisoConsultaExistenciasCostos) {
		this.isPermisoConsultaExistenciasCostos = isPermisoConsultaExistenciasCostos;
	}

	public Boolean getIsPermisoBusquedaExistenciasCostos() {
		return isPermisoBusquedaExistenciasCostos;
	}

	public void setIsPermisoBusquedaExistenciasCostos(Boolean isPermisoBusquedaExistenciasCostos) {
		this.isPermisoBusquedaExistenciasCostos = isPermisoBusquedaExistenciasCostos;
	}

	public Boolean getIsPermisoReporteExistenciasCostos() {
		return isPermisoReporteExistenciasCostos;
	}

	public void setIsPermisoReporteExistenciasCostos(Boolean isPermisoReporteExistenciasCostos) {
		this.isPermisoReporteExistenciasCostos = isPermisoReporteExistenciasCostos;
	}
	
	public Boolean getIsPermisoPaginacionMedioExistenciasCostos() {
		return isPermisoPaginacionMedioExistenciasCostos;
	}

	public void setIsPermisoPaginacionMedioExistenciasCostos(Boolean isPermisoPaginacionMedioExistenciasCostos) {
		this.isPermisoPaginacionMedioExistenciasCostos = isPermisoPaginacionMedioExistenciasCostos;
	}
	
	public Boolean getIsPermisoPaginacionTodoExistenciasCostos() {
		return isPermisoPaginacionTodoExistenciasCostos;
	}

	public void setIsPermisoPaginacionTodoExistenciasCostos(Boolean isPermisoPaginacionTodoExistenciasCostos) {
		this.isPermisoPaginacionTodoExistenciasCostos = isPermisoPaginacionTodoExistenciasCostos;
	}
	
	public Boolean getIsPermisoPaginacionAltoExistenciasCostos() {
		return isPermisoPaginacionAltoExistenciasCostos;
	}

	public void setIsPermisoPaginacionAltoExistenciasCostos(Boolean isPermisoPaginacionAltoExistenciasCostos) {
		this.isPermisoPaginacionAltoExistenciasCostos = isPermisoPaginacionAltoExistenciasCostos;
	}
	
	public Boolean getIsPermisoCopiarExistenciasCostos() {
		return isPermisoCopiarExistenciasCostos;
	}

	public void setIsPermisoCopiarExistenciasCostos(Boolean isPermisoCopiarExistenciasCostos) {
		this.isPermisoCopiarExistenciasCostos = isPermisoCopiarExistenciasCostos;
	}
	
	public Boolean getIsPermisoVerFormExistenciasCostos() {
		return isPermisoVerFormExistenciasCostos;
	}

	public void setIsPermisoVerFormExistenciasCostos(Boolean isPermisoVerFormExistenciasCostos) {
		this.isPermisoVerFormExistenciasCostos = isPermisoVerFormExistenciasCostos;
	}
	
	public Boolean getIsPermisoDuplicarExistenciasCostos() {
		return isPermisoDuplicarExistenciasCostos;
	}

	public void setIsPermisoDuplicarExistenciasCostos(Boolean isPermisoDuplicarExistenciasCostos) {
		this.isPermisoDuplicarExistenciasCostos = isPermisoDuplicarExistenciasCostos;
	}
	
	public Boolean getIsPermisoOrdenExistenciasCostos() {
		return isPermisoOrdenExistenciasCostos;
	}

	public void setIsPermisoOrdenExistenciasCostos(Boolean isPermisoOrdenExistenciasCostos) {
		this.isPermisoOrdenExistenciasCostos = isPermisoOrdenExistenciasCostos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoExistenciasCostos() {
		return isVisibilidadCeldaNuevoExistenciasCostos;
	}

	public void setIsVisibilidadCeldaNuevoExistenciasCostos(Boolean isVisibilidadCeldaNuevoExistenciasCostos) {
		this.isVisibilidadCeldaNuevoExistenciasCostos = isVisibilidadCeldaNuevoExistenciasCostos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarExistenciasCostos() {
		return isVisibilidadCeldaDuplicarExistenciasCostos;
	}

	public void setIsVisibilidadCeldaDuplicarExistenciasCostos(Boolean isVisibilidadCeldaDuplicarExistenciasCostos) {
		this.isVisibilidadCeldaDuplicarExistenciasCostos = isVisibilidadCeldaDuplicarExistenciasCostos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarExistenciasCostos() {
		return isVisibilidadCeldaCopiarExistenciasCostos;
	}

	public void setIsVisibilidadCeldaCopiarExistenciasCostos(Boolean isVisibilidadCeldaCopiarExistenciasCostos) {
		this.isVisibilidadCeldaCopiarExistenciasCostos = isVisibilidadCeldaCopiarExistenciasCostos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormExistenciasCostos() {
		return isVisibilidadCeldaVerFormExistenciasCostos;
	}

	public void setIsVisibilidadCeldaVerFormExistenciasCostos(Boolean isVisibilidadCeldaVerFormExistenciasCostos) {
		this.isVisibilidadCeldaVerFormExistenciasCostos = isVisibilidadCeldaVerFormExistenciasCostos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenExistenciasCostos() {
		return isVisibilidadCeldaOrdenExistenciasCostos;
	}

	public void setIsVisibilidadCeldaOrdenExistenciasCostos(Boolean isVisibilidadCeldaOrdenExistenciasCostos) {
		this.isVisibilidadCeldaOrdenExistenciasCostos = isVisibilidadCeldaOrdenExistenciasCostos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesExistenciasCostos() {
		return isVisibilidadCeldaNuevoRelacionesExistenciasCostos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesExistenciasCostos(Boolean isVisibilidadCeldaNuevoRelacionesExistenciasCostos) {
		this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos = isVisibilidadCeldaNuevoRelacionesExistenciasCostos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarExistenciasCostos() {
		return isVisibilidadCeldaModificarExistenciasCostos;
	}

	public void setIsVisibilidadCeldaModificarExistenciasCostos(Boolean isVisibilidadCeldaModificarExistenciasCostos) {
		this.isVisibilidadCeldaModificarExistenciasCostos = isVisibilidadCeldaModificarExistenciasCostos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarExistenciasCostos() {
		return isVisibilidadCeldaActualizarExistenciasCostos;
	}

	public void setIsVisibilidadCeldaActualizarExistenciasCostos(Boolean isVisibilidadCeldaActualizarExistenciasCostos) {
		this.isVisibilidadCeldaActualizarExistenciasCostos = isVisibilidadCeldaActualizarExistenciasCostos;
	}

	public Boolean getIsVisibilidadCeldaEliminarExistenciasCostos() {
		return isVisibilidadCeldaEliminarExistenciasCostos;
	}

	public void setIsVisibilidadCeldaEliminarExistenciasCostos(Boolean isVisibilidadCeldaEliminarExistenciasCostos) {
		this.isVisibilidadCeldaEliminarExistenciasCostos = isVisibilidadCeldaEliminarExistenciasCostos;
	}

	public Boolean getIsVisibilidadCeldaCancelarExistenciasCostos() {
		return isVisibilidadCeldaCancelarExistenciasCostos;
	}

	public void setIsVisibilidadCeldaCancelarExistenciasCostos(Boolean isVisibilidadCeldaCancelarExistenciasCostos) {
		this.isVisibilidadCeldaCancelarExistenciasCostos = isVisibilidadCeldaCancelarExistenciasCostos;
	}

	public Boolean getIsVisibilidadCeldaGuardarExistenciasCostos() {
		return isVisibilidadCeldaGuardarExistenciasCostos;
	}

	public void setIsVisibilidadCeldaGuardarExistenciasCostos(Boolean isVisibilidadCeldaGuardarExistenciasCostos) {
		this.isVisibilidadCeldaGuardarExistenciasCostos = isVisibilidadCeldaGuardarExistenciasCostos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosExistenciasCostos() {
		return isVisibilidadCeldaGuardarCambiosExistenciasCostos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosExistenciasCostos(Boolean isVisibilidadCeldaGuardarCambiosExistenciasCostos) {
		this.isVisibilidadCeldaGuardarCambiosExistenciasCostos = isVisibilidadCeldaGuardarCambiosExistenciasCostos;
	}
		
	public ExistenciasCostosSessionBean getexistenciascostosSessionBean() {
		return this.existenciascostosSessionBean;
	}
	
	public void setexistenciascostosSessionBean(ExistenciasCostosSessionBean existenciascostosSessionBean) {
		this.existenciascostosSessionBean=existenciascostosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaExistenciasCostos() {
		return this.isVisibilidadBusquedaExistenciasCostos;
	}

	public void setisVisibilidadBusquedaExistenciasCostos(Boolean isVisibilidadBusquedaExistenciasCostos) {
		this.isVisibilidadBusquedaExistenciasCostos=isVisibilidadBusquedaExistenciasCostos;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdLinea() {
		return this.isVisibilidadFK_IdLinea;
	}

	public void setisVisibilidadFK_IdLinea(Boolean isVisibilidadFK_IdLinea) {
		this.isVisibilidadFK_IdLinea=isVisibilidadFK_IdLinea;
	}

	public Boolean getisVisibilidadFK_IdLineaCategoria() {
		return this.isVisibilidadFK_IdLineaCategoria;
	}

	public void setisVisibilidadFK_IdLineaCategoria(Boolean isVisibilidadFK_IdLineaCategoria) {
		this.isVisibilidadFK_IdLineaCategoria=isVisibilidadFK_IdLineaCategoria;
	}

	public Boolean getisVisibilidadFK_IdLineaGrupo() {
		return this.isVisibilidadFK_IdLineaGrupo;
	}

	public void setisVisibilidadFK_IdLineaGrupo(Boolean isVisibilidadFK_IdLineaGrupo) {
		this.isVisibilidadFK_IdLineaGrupo=isVisibilidadFK_IdLineaGrupo;
	}

	public Boolean getisVisibilidadFK_IdLineaMarca() {
		return this.isVisibilidadFK_IdLineaMarca;
	}

	public void setisVisibilidadFK_IdLineaMarca(Boolean isVisibilidadFK_IdLineaMarca) {
		this.isVisibilidadFK_IdLineaMarca=isVisibilidadFK_IdLineaMarca;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(ExistenciasCostos existenciascostos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(existenciascostos,null);
				this.setActualParaGuardarLineaForeignKey(existenciascostos,null);
				this.setActualParaGuardarLineaGrupoForeignKey(existenciascostos,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(existenciascostos,null);
				this.setActualParaGuardarLineaMarcaForeignKey(existenciascostos,null);
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
	
	public void bugActualizarReferenciaActual(ExistenciasCostos existenciascostos,ExistenciasCostos existenciascostosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalExistenciasCostos(existenciascostos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		existenciascostosAux.setId(existenciascostos.getId());
		existenciascostosAux.setVersionRow(existenciascostos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ExistenciasCostos existenciascostosLocal) throws Exception {
		
		if(this.existenciascostosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ExistenciasCostos existenciascostosLocal) throws Exception {	
		if(this.existenciascostosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				existenciascostosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				existenciascostosLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				existenciascostosLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				existenciascostosLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				existenciascostosLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarExistenciasCostosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = existenciascostosValidator.getInvalidValues(this.existenciascostos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ExistenciasCostos existenciascostos,List<ExistenciasCostos> existenciascostoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ExistenciasCostos existenciascostos,List<ExistenciasCostos> existenciascostoss) throws Exception {
		try	{			
			ExistenciasCostosConstantesFunciones.actualizarSelectedLista(existenciascostos,existenciascostoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ExistenciasCostos> existenciascostossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				existenciascostossLocal=this.existenciascostosLogic.getExistenciasCostoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				existenciascostossLocal=this.existenciascostoss;
			}
			//ARCHITECTURE
		
			for(ExistenciasCostos existenciascostosLocal:existenciascostossLocal) {
				if(this.permiteMantenimiento(existenciascostosLocal) && existenciascostosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ExistenciasCostosConstantesFunciones.getExistenciasCostosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ExistenciasCostosConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_productoExistenciasCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ExistenciasCostosConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_unidadExistenciasCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ExistenciasCostosConstantesFunciones.NOMBRELINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_lineaExistenciasCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ExistenciasCostosConstantesFunciones.NOMBRELINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_linea_grupoExistenciasCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ExistenciasCostosConstantesFunciones.NOMBRELINEACATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_linea_categoriaExistenciasCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ExistenciasCostosConstantesFunciones.NOMBRELINEAMARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_linea_marcaExistenciasCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ExistenciasCostosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasCostos.jLabelcodigoExistenciasCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ExistenciasCostosConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasCostos.jLabelcosto_totalExistenciasCostos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_productoExistenciasCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_unidadExistenciasCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_lineaExistenciasCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_linea_grupoExistenciasCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_linea_categoriaExistenciasCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_linea_marcaExistenciasCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasCostos.jLabelcodigoExistenciasCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormExistenciasCostos.jLabelcosto_totalExistenciasCostos,"");
		
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
		this.iIdNuevoExistenciasCostos--;	
		
		
		this.existenciascostosAux=new ExistenciasCostos();
		
		this.existenciascostosAux.setId(this.iIdNuevoExistenciasCostos);
		this.existenciascostosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.existenciascostosLogic.getExistenciasCostoss().add(this.existenciascostosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.existenciascostoss.add(this.existenciascostosAux);
		}
		//ARCHITECTURE
		
		this.existenciascostos=this.existenciascostosAux;
		
		if(ExistenciasCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioExistenciasCostos(this.existenciascostos);
			this.setVariablesObjetoActualToFormularioForeignKeyExistenciasCostos(this.existenciascostos);
		}
				
		//this.setDefaultControlesExistenciasCostos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyExistenciasCostos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyExistenciasCostos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyExistenciasCostos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualExistenciasCostos(this.existenciascostosBean,this.existenciascostos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanExistenciasCostos(this.existenciascostosReturnGeneral,this.existenciascostosBean,false);
		
		if(this.existenciascostosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyExistenciasCostos(this.existenciascostosReturnGeneral.getExistenciasCostos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioExistenciasCostos(this.existenciascostosReturnGeneral.getExistenciasCostos());
		}
		
		if(this.existenciascostosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioExistenciasCostos(this.existenciascostosReturnGeneral.getExistenciasCostos(),classes);//this.existenciascostosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyExistenciasCostos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyExistenciasCostos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ExistenciasCostosBeanSwingJInternalFrameAdditional.RecargarFormExistenciasCostos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingExistenciasCostos(false);
						
			if(existenciascostosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualExistenciasCostos();
			}
			
			this.actualizarVisualTableDatosExistenciasCostos();
			
			this.jTableDatosExistenciasCostos.setRowSelectionInterval(this.getIndiceNuevoExistenciasCostos(), this.getIndiceNuevoExistenciasCostos());
			
			this.seleccionarFilaTablaExistenciasCostosActual();
						
			this.actualizarEstadoCeldasBotonesExistenciasCostos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesExistenciasCostos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormExistenciasCostos.jDateChooserfecha_emision_hastaExistenciasCostos.setEnabled(isHabilitar && this.existenciascostosConstantesFunciones.activarfecha_emision_hastaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_productoExistenciasCostos.setEnabled(isHabilitar && this.existenciascostosConstantesFunciones.activarnombre_productoExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldnombre_unidadExistenciasCostos.setEnabled(isHabilitar && this.existenciascostosConstantesFunciones.activarnombre_unidadExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_lineaExistenciasCostos.setEnabled(isHabilitar && this.existenciascostosConstantesFunciones.activarnombre_lineaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_grupoExistenciasCostos.setEnabled(isHabilitar && this.existenciascostosConstantesFunciones.activarnombre_linea_grupoExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_categoriaExistenciasCostos.setEnabled(isHabilitar && this.existenciascostosConstantesFunciones.activarnombre_linea_categoriaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_marcaExistenciasCostos.setEnabled(isHabilitar && this.existenciascostosConstantesFunciones.activarnombre_linea_marcaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldcodigoExistenciasCostos.setEnabled(isHabilitar && this.existenciascostosConstantesFunciones.activarcodigoExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldcosto_totalExistenciasCostos.setEnabled(isHabilitar && this.existenciascostosConstantesFunciones.activarcosto_totalExistenciasCostos);	
		//
		this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_empresaExistenciasCostos.setEnabled(isHabilitar && this.existenciascostosConstantesFunciones.activarid_empresaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_lineaExistenciasCostos.setEnabled(isHabilitar && this.existenciascostosConstantesFunciones.activarid_lineaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_grupoExistenciasCostos.setEnabled(isHabilitar && this.existenciascostosConstantesFunciones.activarid_linea_grupoExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_categoriaExistenciasCostos.setEnabled(isHabilitar && this.existenciascostosConstantesFunciones.activarid_linea_categoriaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_marcaExistenciasCostos.setEnabled(isHabilitar && this.existenciascostosConstantesFunciones.activarid_linea_marcaExistenciasCostos);
	};
	
	public void setDefaultControlesExistenciasCostos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoExistenciasCostos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.existenciascostosSessionBean.setConGuardarRelaciones(true);			
			this.existenciascostosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormExistenciasCostos.jTabbedPaneRelacionesExistenciasCostos.setVisible(true);
			
					
		} else {
			//this.existenciascostosSessionBean.setConGuardarRelaciones(false);			
			this.existenciascostosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormExistenciasCostos.jTabbedPaneRelacionesExistenciasCostos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoExistenciasCostos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ExistenciasCostos existenciascostosAux:this.existenciascostosLogic.getExistenciasCostoss()) {
				if(existenciascostosAux.getId().equals(this.iIdNuevoExistenciasCostos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ExistenciasCostos existenciascostosAux:this.existenciascostoss) {
				if(existenciascostosAux.getId().equals(this.iIdNuevoExistenciasCostos)) {
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
	
	public int getIndiceActualExistenciasCostos(ExistenciasCostos existenciascostos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ExistenciasCostos existenciascostosAux:this.existenciascostosLogic.getExistenciasCostoss()) {
				if(existenciascostosAux.getId().equals(existenciascostos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ExistenciasCostos existenciascostosAux:this.existenciascostoss) {
				if(existenciascostosAux.getId().equals(existenciascostos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalExistenciasCostos(ExistenciasCostos existenciascostosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ExistenciasCostos existenciascostosAux:this.existenciascostosLogic.getExistenciasCostoss()) {
				if(existenciascostosAux.getExistenciasCostosOriginal().getId().equals(existenciascostosOriginal.getId())) {
					existe=true;
					existenciascostosOriginal.setId(existenciascostosAux.getId());
					existenciascostosOriginal.setVersionRow(existenciascostosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ExistenciasCostos existenciascostosAux:this.existenciascostoss) {
				if(existenciascostosAux.getExistenciasCostosOriginal().getId().equals(existenciascostosOriginal.getId())) {
					existe=true;
					existenciascostosOriginal.setId(existenciascostosAux.getId());
					existenciascostosOriginal.setVersionRow(existenciascostosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosExistenciasCostos(Boolean esParaCancelar) throws Exception {
		existenciascostossAux=new ArrayList<ExistenciasCostos>();
		existenciascostosAux=new ExistenciasCostos();
		
		if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ExistenciasCostos existenciascostosAux:this.existenciascostosLogic.getExistenciasCostoss()) {
					if(existenciascostosAux.getId()<0) {
						existenciascostossAux.add(existenciascostosAux);
					}		
				}
				this.iIdNuevoExistenciasCostos=0L;
				this.existenciascostosLogic.getExistenciasCostoss().removeAll(existenciascostossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ExistenciasCostos existenciascostosAux:this.existenciascostoss) {
					if(existenciascostosAux.getId()<0) {
						existenciascostossAux.add(existenciascostosAux);
					}		
				}
				this.iIdNuevoExistenciasCostos=0L;
				this.existenciascostoss.removeAll(existenciascostossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoExistenciasCostos 
					&& this.existenciascostosLogic.getExistenciasCostoss().size()>0
					) {
					existenciascostosAux=this.existenciascostosLogic.getExistenciasCostoss().get(this.existenciascostosLogic.getExistenciasCostoss().size() - 1);
				
					if(existenciascostosAux.getId()<0) {
						this.existenciascostosLogic.getExistenciasCostoss().remove(existenciascostosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoExistenciasCostos && this.existenciascostoss.size()>0) {
					existenciascostosAux=this.existenciascostoss.get(this.existenciascostoss.size() - 1);
				
					if(existenciascostosAux.getId()<0) {
						this.existenciascostoss.remove(existenciascostosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoExistenciasCostos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(existenciascostos.getId()<0) {
				this.existenciascostosLogic.getExistenciasCostoss().remove(this.existenciascostos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(existenciascostos.getId()<0) {
				this.existenciascostoss.remove(this.existenciascostos);
			}
		}			
	}
	
	public void setEstadosInicialesExistenciasCostos(List<ExistenciasCostos> existenciascostossAux) throws Exception {
		ExistenciasCostosConstantesFunciones.setEstadosInicialesExistenciasCostos(existenciascostossAux);
	}
	
	public void setEstadosInicialesExistenciasCostos(ExistenciasCostos existenciascostosAux) throws Exception {
		ExistenciasCostosConstantesFunciones.setEstadosInicialesExistenciasCostos(existenciascostosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarExistenciasCostosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesExistenciasCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarExistenciasCostosActual()) {
				if(!this.isEsNuevoExistenciasCostos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesExistenciasCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoExistenciasCostos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarExistenciasCostosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Existencias Costos ?", "MANTENIMIENTO DE Existencias Costos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesExistenciasCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ExistenciasCostos existenciascostos) throws Exception {
		ExistenciasCostosConstantesFunciones.seleccionarAsignar(this.existenciascostos,existenciascostos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarExistenciasCostos=this.isPermisoActualizarOriginalExistenciasCostos;
			
			
			this.seleccionarAsignar(existenciascostos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesExistenciasCostos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.existenciascostosSessionBean.setsFuncionBusquedaRapida(this.existenciascostosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoExistenciasCostos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosExistenciasCostos(esParaCancelar);				
				this.cancelarNuevoExistenciasCostos(esParaCancelar);								
			}
			
			this.existenciascostos=new ExistenciasCostos();
			
			this.inicializarExistenciasCostos();
			
			this.actualizarEstadoCeldasBotonesExistenciasCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarExistenciasCostos() throws Exception {
		try {
			ExistenciasCostosConstantesFunciones.inicializarExistenciasCostos(this.existenciascostos);
			
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
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.existenciascostosLogic.getExistenciasCostoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteExistenciasCostoss(String sAccionBusqueda,List<ExistenciasCostos> existenciascostossParaReportes) throws Exception {
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
					sPathReporteFinal="ExistenciasCostos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ExistenciasCostosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ExistenciasCostosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ExistenciasCostos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Existencias Costoses");		
		parameters.put("busquedapor", ExistenciasCostosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceExistenciasCostos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ExistenciasCostosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ExistenciasCostosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceExistenciasCostos=new JRBeanArrayDataSource(ExistenciasCostosJInternalFrame.TraerExistenciasCostosBeans(existenciascostossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceExistenciasCostos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ExistenciasCostosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ExistenciasCostosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ExistenciasCostosBean.TraerExistenciasCostosBeans(existenciascostossParaReportes).toArray()));
							
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
				this.generarExcelReporteExistenciasCostoss(sAccionBusqueda,sTipoArchivoReporte,existenciascostossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalExistenciasCostoss(sAccionBusqueda,sTipoArchivoReporte,existenciascostossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoExistenciasCostosActionPerformed(null);
					//this.generarExcelReporteExistenciasCostoss(sAccionBusqueda,sTipoArchivoReporte,existenciascostossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalExistenciasCostoss(sAccionBusqueda,sTipoArchivoReporte,existenciascostossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesExistenciasCostoss(sAccionBusqueda,sTipoArchivoReporte,existenciascostossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesExistenciasCostoss(sAccionBusqueda,sTipoArchivoReporte,existenciascostossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteExistenciasCostoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ExistenciasCostos> existenciascostossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"existenciascostos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ExistenciasCostoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderExistenciasCostos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ExistenciasCostos existenciascostos : existenciascostossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ExistenciasCostosConstantesFunciones.generarExcelReporteDataExistenciasCostos("NORMAL",row,workbook,existenciascostos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.existenciascostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Existencias Costos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderExistenciasCostos(String sTipo,Row row,Workbook workbook) {
		
		ExistenciasCostosConstantesFunciones.generarExcelReporteHeaderExistenciasCostos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalExistenciasCostoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ExistenciasCostos> existenciascostossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"existenciascostos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ExistenciasCostoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ExistenciasCostos existenciascostos : existenciascostossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ExistenciasCostosConstantesFunciones.getExistenciasCostosDescripcion(existenciascostos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasCostosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciascostos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasCostosConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciascostos.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasCostosConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciascostos.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasCostosConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciascostos.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasCostosConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciascostos.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciascostos.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciascostos.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciascostos.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciascostos.getnombre_linea());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciascostos.getnombre_linea_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciascostos.getnombre_linea_categoria());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciascostos.getnombre_linea_marca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasCostosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciascostos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ExistenciasCostosConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(existenciascostos.getcosto_total());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.existenciascostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Existencias Costos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesExistenciasCostoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ExistenciasCostos> existenciascostossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ExistenciasCostos> existenciascostossRespaldo=null;
		
		classes=ExistenciasCostosConstantesFunciones.getClassesRelationshipsOfExistenciasCostos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.existenciascostosLogic.setDatosCliente(this.datosCliente);
		this.existenciascostosLogic.setDatosDeep(this.datosDeep);
		this.existenciascostosLogic.setIsConDeep(true);
		
		existenciascostossRespaldo=this.existenciascostosLogic.getExistenciasCostoss();
		
		this.existenciascostosLogic.setExistenciasCostoss(existenciascostossParaReportes);	
		this.existenciascostosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		existenciascostossParaReportes=this.existenciascostosLogic.getExistenciasCostoss();
		this.existenciascostosLogic.setExistenciasCostoss(existenciascostossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"existenciascostos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ExistenciasCostoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderExistenciasCostos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ExistenciasCostos existenciascostos : existenciascostossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderExistenciasCostos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ExistenciasCostosConstantesFunciones.generarExcelReporteDataExistenciasCostos("NORMAL",row,workbook,existenciascostos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ExistenciasCostosConstantesFunciones.getExistenciasCostosDescripcion(existenciascostos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.existenciascostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Existencias Costos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoExistenciasCostos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoExistenciasCostos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoExistenciasCostos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoExistenciasCostos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessExistenciasCostos() throws Exception {		
		this.startProcessExistenciasCostos(true);
	}
	
	public void startProcessExistenciasCostos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasExistenciasCostos ,this.jPanelParametrosReportesExistenciasCostos, this.jScrollPanelDatosExistenciasCostos,this.jPanelPaginacionExistenciasCostos, this.jScrollPanelDatosEdicionExistenciasCostos, this.jPanelAccionesExistenciasCostos,this.jPanelAccionesFormularioExistenciasCostos,this.jmenuBarExistenciasCostos,this.jmenuBarDetalleExistenciasCostos,this.jTtoolBarExistenciasCostos,this.jTtoolBarDetalleExistenciasCostos);		
		
		final JTabbedPane jTabbedPaneBusquedasExistenciasCostos=this.jTabbedPaneBusquedasExistenciasCostos; 
		
		final JPanel jPanelParametrosReportesExistenciasCostos=this.jPanelParametrosReportesExistenciasCostos;
		//final JScrollPane jScrollPanelDatosExistenciasCostos=this.jScrollPanelDatosExistenciasCostos;
		final JTable jTableDatosExistenciasCostos=this.jTableDatosExistenciasCostos;		
		final JPanel jPanelPaginacionExistenciasCostos=this.jPanelPaginacionExistenciasCostos;
		//final JScrollPane jScrollPanelDatosEdicionExistenciasCostos=this.jScrollPanelDatosEdicionExistenciasCostos;
		final JPanel jPanelAccionesExistenciasCostos=this.jPanelAccionesExistenciasCostos;
		
		JPanel jPanelCamposAuxiliarExistenciasCostos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarExistenciasCostos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
			jPanelCamposAuxiliarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jPanelCamposExistenciasCostos;
			jPanelAccionesFormularioAuxiliarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jPanelAccionesFormularioExistenciasCostos;
		}
		
		final JPanel jPanelCamposExistenciasCostos=jPanelCamposAuxiliarExistenciasCostos;
		final JPanel jPanelAccionesFormularioExistenciasCostos=jPanelAccionesFormularioAuxiliarExistenciasCostos;
		
		
		final JMenuBar jmenuBarExistenciasCostos=this.jmenuBarExistenciasCostos;
		final JToolBar jTtoolBarExistenciasCostos=this.jTtoolBarExistenciasCostos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarExistenciasCostos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarExistenciasCostos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
			jmenuBarDetalleAuxiliarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jmenuBarDetalleExistenciasCostos;
			jTtoolBarDetalleAuxiliarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jTtoolBarDetalleExistenciasCostos;
		}
		
		final JMenuBar jmenuBarDetalleExistenciasCostos=jmenuBarDetalleAuxiliarExistenciasCostos;
		final JToolBar jTtoolBarDetalleExistenciasCostos=jTtoolBarDetalleAuxiliarExistenciasCostos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasExistenciasCostos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesExistenciasCostos;
			processRunnable.jTableDatos=jTableDatosExistenciasCostos;
			processRunnable.jPanelCampos=jPanelCamposExistenciasCostos;
			processRunnable.jPanelPaginacion=jPanelPaginacionExistenciasCostos;
			processRunnable.jPanelAcciones=jPanelAccionesExistenciasCostos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioExistenciasCostos;
			
			
			processRunnable.jmenuBar=jmenuBarExistenciasCostos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleExistenciasCostos;
			processRunnable.jTtoolBar=jTtoolBarExistenciasCostos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleExistenciasCostos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasExistenciasCostos ,jPanelParametrosReportesExistenciasCostos,jTableDatosExistenciasCostos, /*jScrollPanelDatosExistenciasCostos,*/jPanelCamposExistenciasCostos,jPanelPaginacionExistenciasCostos, /*jScrollPanelDatosEdicionExistenciasCostos,*/ jPanelAccionesExistenciasCostos,jPanelAccionesFormularioExistenciasCostos,jmenuBarExistenciasCostos,jmenuBarDetalleExistenciasCostos,jTtoolBarExistenciasCostos,jTtoolBarDetalleExistenciasCostos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasExistenciasCostos ,jPanelParametrosReportesExistenciasCostos, jScrollPanelDatosExistenciasCostos,jPanelPaginacionExistenciasCostos, jScrollPanelDatosEdicionExistenciasCostos, jPanelAccionesExistenciasCostos,jPanelAccionesFormularioExistenciasCostos,jmenuBarExistenciasCostos,jmenuBarDetalleExistenciasCostos,jTtoolBarExistenciasCostos,jTtoolBarDetalleExistenciasCostos);
						
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
	
	public void finishProcessExistenciasCostos() {// throws Exception 
		this.finishProcessExistenciasCostos(true);
	}
	
	public void finishProcessExistenciasCostos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasExistenciasCostos ,this.jPanelParametrosReportesExistenciasCostos, this.jScrollPanelDatosExistenciasCostos,this.jPanelPaginacionExistenciasCostos, this.jScrollPanelDatosEdicionExistenciasCostos, this.jPanelAccionesExistenciasCostos,this.jPanelAccionesFormularioExistenciasCostos,this.jmenuBarExistenciasCostos,this.jmenuBarDetalleExistenciasCostos,this.jTtoolBarExistenciasCostos,this.jTtoolBarDetalleExistenciasCostos);		
		
		final JTabbedPane jTabbedPaneBusquedasExistenciasCostos=this.jTabbedPaneBusquedasExistenciasCostos; 
		
		final JPanel jPanelParametrosReportesExistenciasCostos=this.jPanelParametrosReportesExistenciasCostos;
		//final JScrollPane jScrollPanelDatosExistenciasCostos=this.jScrollPanelDatosExistenciasCostos;
		final JTable jTableDatosExistenciasCostos=this.jTableDatosExistenciasCostos;		
		final JPanel jPanelPaginacionExistenciasCostos=this.jPanelPaginacionExistenciasCostos;
		//final JScrollPane jScrollPanelDatosEdicionExistenciasCostos=this.jScrollPanelDatosEdicionExistenciasCostos;
		final JPanel jPanelAccionesExistenciasCostos=this.jPanelAccionesExistenciasCostos;
		
		JPanel jPanelCamposAuxiliarExistenciasCostos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarExistenciasCostos=new JPanel();
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
			jPanelCamposAuxiliarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jPanelCamposExistenciasCostos;
			jPanelAccionesFormularioAuxiliarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jPanelAccionesFormularioExistenciasCostos;
		}
		
		final JPanel jPanelCamposExistenciasCostos=jPanelCamposAuxiliarExistenciasCostos;
		final JPanel jPanelAccionesFormularioExistenciasCostos=jPanelAccionesFormularioAuxiliarExistenciasCostos;
		
		
		final JMenuBar jmenuBarExistenciasCostos=this.jmenuBarExistenciasCostos;		
		final JToolBar jTtoolBarExistenciasCostos=this.jTtoolBarExistenciasCostos;
				
		JMenuBar jmenuBarDetalleAuxiliarExistenciasCostos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarExistenciasCostos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
			jmenuBarDetalleAuxiliarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jmenuBarDetalleExistenciasCostos;
			jTtoolBarDetalleAuxiliarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jTtoolBarDetalleExistenciasCostos;		
		}
		
		final JMenuBar jmenuBarDetalleExistenciasCostos=jmenuBarDetalleAuxiliarExistenciasCostos;
		final JToolBar jTtoolBarDetalleExistenciasCostos=jTtoolBarDetalleAuxiliarExistenciasCostos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasExistenciasCostos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesExistenciasCostos;
			processRunnable.jTableDatos=jTableDatosExistenciasCostos;
			processRunnable.jPanelCampos=jPanelCamposExistenciasCostos;
			processRunnable.jPanelPaginacion=jPanelPaginacionExistenciasCostos;
			processRunnable.jPanelAcciones=jPanelAccionesExistenciasCostos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioExistenciasCostos;
			
			
			processRunnable.jmenuBar=jmenuBarExistenciasCostos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleExistenciasCostos;
			processRunnable.jTtoolBar=jTtoolBarExistenciasCostos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleExistenciasCostos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasExistenciasCostos ,jPanelParametrosReportesExistenciasCostos, jTableDatosExistenciasCostos,/*jScrollPanelDatosExistenciasCostos,*/jPanelCamposExistenciasCostos,jPanelPaginacionExistenciasCostos, /*jScrollPanelDatosEdicionExistenciasCostos,*/ jPanelAccionesExistenciasCostos,jPanelAccionesFormularioExistenciasCostos,jmenuBarExistenciasCostos,jmenuBarDetalleExistenciasCostos,jTtoolBarExistenciasCostos,jTtoolBarDetalleExistenciasCostos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesExistenciasCostos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarExistenciasCostos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuExistenciasCostos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarExistenciasCostos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarExistenciasCostos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleExistenciasCostos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuExistenciasCostos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarExistenciasCostos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleExistenciasCostos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.existenciascostosConstantesFunciones.getsFinalQueryExistenciasCostos();
		String  finalQueryPaginacionTodos=this.existenciascostosConstantesFunciones.getsFinalQueryExistenciasCostos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ExistenciasCostosConstantesFunciones.getArrayColumnasGlobalesNoExistenciasCostos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ExistenciasCostosConstantesFunciones.getArrayColumnasGlobalesExistenciasCostos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ExistenciasCostosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.existenciascostossEliminados= new ArrayList<ExistenciasCostos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessExistenciasCostos();
		
				///*ExistenciasCostosSessionBean*/this.existenciascostosSessionBean=new ExistenciasCostosSessionBean();
			
			if(this.existenciascostosSessionBean==null) {
				this.existenciascostosSessionBean=new ExistenciasCostosSessionBean();
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
					this.iNumeroPaginacion=ExistenciasCostosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ExistenciasCostosConstantesFunciones.getClassesForeignKeysOfExistenciasCostos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/existenciascostos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			existenciascostossAux= new ArrayList<ExistenciasCostos>();
			
				
			existenciascostosLogic.setDatosCliente(this.datosCliente);
			existenciascostosLogic.setDatosDeep(this.datosDeep);
			existenciascostosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaExistenciasCostos")) {
				this.sDetalleReporte=ExistenciasCostosConstantesFunciones.getDetalleIndiceBusquedaExistenciasCostos(id_lineaBusquedaExistenciasCostos,id_linea_grupoBusquedaExistenciasCostos,id_linea_categoriaBusquedaExistenciasCostos,id_linea_marcaBusquedaExistenciasCostos,fecha_emision_hastaBusquedaExistenciasCostos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					existenciascostosLogic.getExistenciasCostossBusquedaExistenciasCostos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_lineaBusquedaExistenciasCostos,id_linea_grupoBusquedaExistenciasCostos,id_linea_categoriaBusquedaExistenciasCostos,id_linea_marcaBusquedaExistenciasCostos,fecha_emision_hastaBusquedaExistenciasCostos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ExistenciasCostosConstantesFunciones.getDetalleIndiceBusquedaExistenciasCostos(id_lineaBusquedaExistenciasCostos,id_linea_grupoBusquedaExistenciasCostos,id_linea_categoriaBusquedaExistenciasCostos,id_linea_marcaBusquedaExistenciasCostos,fecha_emision_hastaBusquedaExistenciasCostos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ExistenciasCostosConstantesFunciones.getDetalleIndiceBusquedaExistenciasCostos(id_lineaBusquedaExistenciasCostos,id_linea_grupoBusquedaExistenciasCostos,id_linea_categoriaBusquedaExistenciasCostos,id_linea_marcaBusquedaExistenciasCostos,fecha_emision_hastaBusquedaExistenciasCostos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=existenciascostosLogic.getExistenciasCostoss()==null||existenciascostosLogic.getExistenciasCostoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=existenciascostoss==null|| existenciascostoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						existenciascostossAux=new ArrayList<ExistenciasCostos>();
						existenciascostossAux.addAll(existenciascostosLogic.getExistenciasCostoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							existenciascostossAux=new ArrayList<ExistenciasCostos>();
							existenciascostossAux.addAll(existenciascostoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							existenciascostosLogic.getExistenciasCostossBusquedaExistenciasCostos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_lineaBusquedaExistenciasCostos,id_linea_grupoBusquedaExistenciasCostos,id_linea_categoriaBusquedaExistenciasCostos,id_linea_marcaBusquedaExistenciasCostos,fecha_emision_hastaBusquedaExistenciasCostos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ExistenciasCostosConstantesFunciones.getDetalleIndiceBusquedaExistenciasCostos(id_lineaBusquedaExistenciasCostos,id_linea_grupoBusquedaExistenciasCostos,id_linea_categoriaBusquedaExistenciasCostos,id_linea_marcaBusquedaExistenciasCostos,fecha_emision_hastaBusquedaExistenciasCostos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ExistenciasCostosConstantesFunciones.getDetalleIndiceBusquedaExistenciasCostos(id_lineaBusquedaExistenciasCostos,id_linea_grupoBusquedaExistenciasCostos,id_linea_categoriaBusquedaExistenciasCostos,id_linea_marcaBusquedaExistenciasCostos,fecha_emision_hastaBusquedaExistenciasCostos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteExistenciasCostoss("BusquedaExistenciasCostos",existenciascostosLogic.getExistenciasCostoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteExistenciasCostoss("BusquedaExistenciasCostos",existenciascostoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						existenciascostosLogic.setExistenciasCostoss(new ArrayList<ExistenciasCostos>());
						existenciascostosLogic.getExistenciasCostoss().addAll(existenciascostossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							existenciascostoss=new ArrayList<ExistenciasCostos>();
							existenciascostoss.addAll(existenciascostossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesExistenciasCostos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessExistenciasCostos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=existenciascostosLogic.getExistenciasCostoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=existenciascostoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=existenciascostosLogic.getExistenciasCostoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=existenciascostoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ExistenciasCostos existenciascostos) {
		Boolean permite=true;
		
		if(this.existenciascostos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ExistenciasCostosConstantesFunciones.getOrderByListaExistenciasCostos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ExistenciasCostosConstantesFunciones.getOrderByListaExistenciasCostos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ExistenciasCostos existenciascostos:existenciascostosLogic.getExistenciasCostoss()) {
				if(existenciascostos.getsType().equals(Constantes2.S_TOTALES)) {
					existenciascostosTotales=existenciascostos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ExistenciasCostos existenciascostos:this.existenciascostoss) {
				if(existenciascostos.getsType().equals(Constantes2.S_TOTALES)) {
					existenciascostosTotales=existenciascostos;
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
			this.existenciascostosAux=new ExistenciasCostos();
			this.existenciascostosAux.setsType(Constantes2.S_TOTALES);
			this.existenciascostosAux.setIsNew(false);
			this.existenciascostosAux.setIsChanged(false);
			this.existenciascostosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ExistenciasCostosConstantesFunciones.TotalizarValoresFilaExistenciasCostos(this.existenciascostosLogic.getExistenciasCostoss(),this.existenciascostosAux);
				
				//this.existenciascostosLogic.getExistenciasCostoss().add(this.existenciascostosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ExistenciasCostosConstantesFunciones.TotalizarValoresFilaExistenciasCostos(this.existenciascostoss,this.existenciascostosAux);
				
				this.existenciascostoss.add(this.existenciascostosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		existenciascostosTotales=new ExistenciasCostos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.existenciascostosLogic.getExistenciasCostoss().remove(existenciascostosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.existenciascostoss.remove(existenciascostosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		existenciascostosTotales=new ExistenciasCostos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ExistenciasCostos existenciascostos:existenciascostosLogic.getExistenciasCostoss()) {
				if(existenciascostos.getsType().equals(Constantes2.S_TOTALES)) {
					existenciascostosTotales=existenciascostos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ExistenciasCostosConstantesFunciones.TotalizarValoresFilaExistenciasCostos(this.existenciascostosLogic.getExistenciasCostoss(),existenciascostosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ExistenciasCostos existenciascostos:this.existenciascostoss) {
				if(existenciascostos.getsType().equals(Constantes2.S_TOTALES)) {
					existenciascostosTotales=existenciascostos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ExistenciasCostosConstantesFunciones.TotalizarValoresFilaExistenciasCostos(this.existenciascostoss,existenciascostosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getExistenciasCostossBusquedaExistenciasCostos()throws Exception {
		try {
			sAccionBusqueda="BusquedaExistenciasCostos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getExistenciasCostossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getExistenciasCostossFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getExistenciasCostossFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getExistenciasCostossFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getExistenciasCostossFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getExistenciasCostossBusquedaExistenciasCostos(String sFinalQuery,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//existenciascostosLogic.getExistenciasCostossBusquedaExistenciasCostos(sFinalQuery,this.pagination,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getExistenciasCostossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//existenciascostosLogic.getExistenciasCostossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getExistenciasCostossFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//existenciascostosLogic.getExistenciasCostossFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getExistenciasCostossFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//existenciascostosLogic.getExistenciasCostossFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getExistenciasCostossFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//existenciascostosLogic.getExistenciasCostossFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getExistenciasCostossFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//existenciascostosLogic.getExistenciasCostossFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosExistenciasCostos() {
		this.isPermisoTodoExistenciasCostos=false;
		this.isPermisoNuevoExistenciasCostos=false;
		this.isPermisoActualizarExistenciasCostos=false;
		this.isPermisoActualizarOriginalExistenciasCostos=false;
		this.isPermisoEliminarExistenciasCostos=false;
		this.isPermisoGuardarCambiosExistenciasCostos=false;
		this.isPermisoConsultaExistenciasCostos=true;
		this.isPermisoBusquedaExistenciasCostos=true;
		this.isPermisoReporteExistenciasCostos=true;
		this.isPermisoOrdenExistenciasCostos=false;		
		this.isPermisoPaginacionMedioExistenciasCostos=false;		
		this.isPermisoPaginacionAltoExistenciasCostos=false;		
		this.isPermisoPaginacionTodoExistenciasCostos=false;		
		this.isPermisoCopiarExistenciasCostos=false;		
		this.isPermisoVerFormExistenciasCostos=false;		
		this.isPermisoDuplicarExistenciasCostos=false;
		this.isPermisoOrdenExistenciasCostos=false;
	}
	
	public void setPermisosUsuarioExistenciasCostos(Boolean isPermiso) {
		this.isPermisoTodoExistenciasCostos=isPermiso;
		this.isPermisoNuevoExistenciasCostos=isPermiso;
		this.isPermisoActualizarExistenciasCostos=isPermiso;
		this.isPermisoActualizarOriginalExistenciasCostos=isPermiso;
		this.isPermisoEliminarExistenciasCostos=isPermiso;
		this.isPermisoGuardarCambiosExistenciasCostos=isPermiso;
		this.isPermisoConsultaExistenciasCostos=isPermiso;
		this.isPermisoBusquedaExistenciasCostos=isPermiso;
		this.isPermisoReporteExistenciasCostos=isPermiso;
		this.isPermisoOrdenExistenciasCostos=isPermiso;		
		this.isPermisoPaginacionMedioExistenciasCostos=isPermiso;		
		this.isPermisoPaginacionAltoExistenciasCostos=isPermiso;		
		this.isPermisoPaginacionTodoExistenciasCostos=isPermiso;		
		this.isPermisoCopiarExistenciasCostos=isPermiso;		
		this.isPermisoVerFormExistenciasCostos=isPermiso;		
		this.isPermisoDuplicarExistenciasCostos=isPermiso;
		this.isPermisoOrdenExistenciasCostos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioExistenciasCostos(Boolean isPermiso) {
		//this.isPermisoTodoExistenciasCostos=isPermiso;
		this.isPermisoNuevoExistenciasCostos=isPermiso;
		this.isPermisoActualizarExistenciasCostos=isPermiso;
		this.isPermisoActualizarOriginalExistenciasCostos=isPermiso;
		this.isPermisoEliminarExistenciasCostos=isPermiso;
		this.isPermisoGuardarCambiosExistenciasCostos=isPermiso;
		//this.isPermisoConsultaExistenciasCostos=isPermiso;
		//this.isPermisoBusquedaExistenciasCostos=isPermiso;
		//this.isPermisoReporteExistenciasCostos=isPermiso;
		//this.isPermisoOrdenExistenciasCostos=isPermiso;		
		//this.isPermisoPaginacionMedioExistenciasCostos=isPermiso;		
		//this.isPermisoPaginacionAltoExistenciasCostos=isPermiso;		
		//this.isPermisoPaginacionTodoExistenciasCostos=isPermiso;		
		//this.isPermisoCopiarExistenciasCostos=isPermiso;		
		//this.isPermisoDuplicarExistenciasCostos=isPermiso;
		//this.isPermisoOrdenExistenciasCostos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioExistenciasCostosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ExistenciasCostosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebExistenciasCostos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioExistenciasCostosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioExistenciasCostosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionExistenciasCostosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioExistenciasCostosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioExistenciasCostos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ExistenciasCostosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ExistenciasCostosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoExistenciasCostos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarExistenciasCostos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalExistenciasCostos=this.isPermisoActualizarExistenciasCostos;
			this.isPermisoEliminarExistenciasCostos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosExistenciasCostos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaExistenciasCostos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaExistenciasCostos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoExistenciasCostos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteExistenciasCostos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenExistenciasCostos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioExistenciasCostos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoExistenciasCostos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoExistenciasCostos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarExistenciasCostos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormExistenciasCostos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarExistenciasCostos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenExistenciasCostos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosExistenciasCostos.setToolTipText(this.jTableDatosExistenciasCostos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioExistenciasCostos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioExistenciasCostos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ExistenciasCostosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ExistenciasCostosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioExistenciasCostos() throws Exception {
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyExistenciasCostosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyExistenciasCostosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ExistenciasCostosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoriaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineacategoriasForeignKey==null||this.lineacategoriasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaCategoriasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarcaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineamarcasForeignKey==null||this.lineamarcasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaMarcasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyExistenciasCostos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.existenciascostosSessionBean==null) {
				this.existenciascostosSessionBean=new ExistenciasCostosSessionBean();
			}

			if(!this.existenciascostosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.existenciascostosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				Linea linea=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(linea,Constantes.SMENSAJE_ESCOJA_OPCION);
				linea.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineasForeignKey,linea,true)) {

					this.lineasForeignKey.add(0,linea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaGrupo()throws Exception {
		try {

			if(!this.existenciascostosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				Linea lineagrupo=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineagrupo,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineagrupo.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineagruposForeignKey,lineagrupo,true)) {

					this.lineagruposForeignKey.add(0,lineagrupo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaCategoria()throws Exception {
		try {

			if(!this.existenciascostosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				Linea lineacategoria=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineacategoria,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineacategoria.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineacategoriasForeignKey,lineacategoria,true)) {

					this.lineacategoriasForeignKey.add(0,lineacategoria);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaMarca()throws Exception {
		try {

			if(!this.existenciascostosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				Linea lineamarca=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineamarca,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineamarca.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineamarcasForeignKey,lineamarca,true)) {

					this.lineamarcasForeignKey.add(0,lineamarca);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyExistenciasCostos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyExistenciasCostos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyExistenciasCostos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyExistenciasCostos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyExistenciasCostos(ExistenciasCostos existenciascostos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyExistenciasCostos(ExistenciasCostos existenciascostos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyExistenciasCostos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyExistenciasCostos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyExistenciasCostos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyExistenciasCostos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroExistenciasCostos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyExistenciasCostos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyExistenciasCostos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyExistenciasCostos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_empresaExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_empresaExistenciasCostos.getItemCount()>0) {
				this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_empresaExistenciasCostos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_lineaExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_lineaExistenciasCostos.getItemCount()>0) {
				this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_lineaExistenciasCostos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_grupoExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_grupoExistenciasCostos.getItemCount()>0) {
				this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_grupoExistenciasCostos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_categoriaExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_categoriaExistenciasCostos.getItemCount()>0) {
				this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_categoriaExistenciasCostos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_marcaExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_marcaExistenciasCostos.getItemCount()>0) {
				this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_marcaExistenciasCostos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public ExistenciasCostosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ExistenciasCostosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ExistenciasCostosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.existenciascostosSessionBean=new ExistenciasCostosSessionBean(); 
		this.existenciascostosConstantesFunciones=new ExistenciasCostosConstantesFunciones(); 
		this.existenciascostosBean=new ExistenciasCostos();//(this.existenciascostosConstantesFunciones); 		
		this.existenciascostosReturnGeneral=new ExistenciasCostosParameterReturnGeneral(); 
		
		this.existenciascostosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.existenciascostosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ExistenciasCostosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ExistenciasCostosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ExistenciasCostosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessExistenciasCostos(true);
			
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
			
			this.existenciascostosConstantesFunciones=new ExistenciasCostosConstantesFunciones(); 
			this.existenciascostosBean=new ExistenciasCostos();//this.existenciascostosConstantesFunciones); 			
			this.existenciascostosReturnGeneral=new ExistenciasCostosParameterReturnGeneral(); 
		
			ExistenciasCostosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Existencias Costos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.existenciascostos=new ExistenciasCostos();
			this.existenciascostoss = new ArrayList<ExistenciasCostos>();
			this.existenciascostossAux = new ArrayList<ExistenciasCostos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic=new ExistenciasCostosLogic();
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}
			
			//this.existenciascostosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.existenciascostosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormExistenciasCostos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoExistenciasCostos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoExistenciasCostos);	
					}
					
					if(this.jInternalFrameImportacionExistenciasCostos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionExistenciasCostos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByExistenciasCostos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByExistenciasCostos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormExistenciasCostos);
				this.jInternalFrameDetalleFormExistenciasCostos.setVisible(false);
				this.jInternalFrameDetalleFormExistenciasCostos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoExistenciasCostos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoExistenciasCostos);
					this.jInternalFrameReporteDinamicoExistenciasCostos.setVisible(false);
					this.jInternalFrameReporteDinamicoExistenciasCostos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionExistenciasCostos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionExistenciasCostos);
					this.jInternalFrameImportacionExistenciasCostos.setVisible(false);
					this.jInternalFrameImportacionExistenciasCostos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByExistenciasCostos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByExistenciasCostos);
					this.jInternalFrameOrderByExistenciasCostos.setVisible(false);
					this.jInternalFrameOrderByExistenciasCostos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idExistenciasCostosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ExistenciasCostosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.existenciascostosReturnGeneral=new ExistenciasCostosParameterReturnGeneral();
			
			this.existenciascostosParameterGeneral=new ExistenciasCostosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.existenciascostosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ExistenciasCostosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ExistenciasCostosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.existenciascostosSessionBean.getEsGuardarRelacionado(),this.existenciascostosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ExistenciasCostosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.existenciascostosSessionBean.getEsGuardarRelacionado(),this.existenciascostosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoExistenciasCostos=false;
			this.isVisibilidadCeldaDuplicarExistenciasCostos=true;
			this.isVisibilidadCeldaCopiarExistenciasCostos=true;
			this.isVisibilidadCeldaVerFormExistenciasCostos=true;
			this.isVisibilidadCeldaOrdenExistenciasCostos=true;
			this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos=false;
			this.isVisibilidadCeldaModificarExistenciasCostos=false;
			this.isVisibilidadCeldaActualizarExistenciasCostos=false;
			this.isVisibilidadCeldaEliminarExistenciasCostos=false;
			this.isVisibilidadCeldaCancelarExistenciasCostos=false;
			this.isVisibilidadCeldaGuardarExistenciasCostos=false;
			this.isVisibilidadCeldaGuardarCambiosExistenciasCostos=false;
			
			
			this.isVisibilidadBusquedaExistenciasCostos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesExistenciasCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosExistenciasCostos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioExistenciasCostos(false);
			
			this.setPermisosUsuarioExistenciasCostos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.existenciascostosSessionBean.getEsGuardarRelacionado() 
				|| (this.existenciascostosSessionBean.getEsGuardarRelacionado() && this.existenciascostosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioExistenciasCostosClasesRelacionadas();
			}
			
			if(this.existenciascostosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioExistenciasCostosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosExistenciasCostos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualExistenciasCostos();
			}
			
			if(!this.isPermisoBusquedaExistenciasCostos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasExistenciasCostos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ExistenciasCostosConstantesFunciones.getTiposSeleccionarExistenciasCostos());
				
				this.tiposColumnasSelect=ExistenciasCostosConstantesFunciones.getTiposSeleccionarExistenciasCostos(true);
				
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
			//if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioExistenciasCostos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioExistenciasCostos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioExistenciasCostos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesExistenciasCostos() ;
			
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
			
			this.empresaLogic=new EmpresaLogic();
			this.lineaLogic=new LineaLogic();
			this.lineagrupoLogic=new LineaLogic();
			this.lineacategoriaLogic=new LineaLogic();
			this.lineamarcaLogic=new LineaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				existenciascostosImplementable= (ExistenciasCostosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ExistenciasCostosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				existenciascostosImplementableHome= (ExistenciasCostosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ExistenciasCostosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.existenciascostoss= new ArrayList<ExistenciasCostos>();
			this.existenciascostossEliminados= new ArrayList<ExistenciasCostos>();
						
			this.isEsNuevoExistenciasCostos=false;
			this.esParaAccionDesdeFormularioExistenciasCostos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyExistenciasCostos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroExistenciasCostos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ExistenciasCostosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ExistenciasCostosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesExistenciasCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingExistenciasCostos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioExistenciasCostos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioExistenciasCostos();
			}
			
			ExistenciasCostosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasExistenciasCostos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasExistenciasCostos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasExistenciasCostos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessExistenciasCostos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ExistenciasCostos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectExistenciasCostos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesExistenciasCostos")) {
				iIndex=this.jInternalFrameDetalleFormExistenciasCostos.jTabbedPaneRelacionesExistenciasCostos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormExistenciasCostos.jTabbedPaneRelacionesExistenciasCostos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessExistenciasCostos();	
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
	
	public void cargarCombosForeignKeyExistenciasCostos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyExistenciasCostos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyExistenciasCostos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyExistenciasCostosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyExistenciasCostos();
		
		this.cargarCombosFrameForeignKeyExistenciasCostos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyExistenciasCostos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyExistenciasCostos();
		}
	}
	
	

	public void cargarCombosForeignKeyLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLinea(this.lineasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaGrupo(this.lineagruposForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoria(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaCategoria(this.lineacategoriasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarca(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaMarca(this.lineamarcasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoExistenciasCostosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.existenciascostosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormExistenciasCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
			
			
			if(jTableDatosExistenciasCostos.getRowCount()>=1) {
				jTableDatosExistenciasCostos.removeRowSelectionInterval(0, jTableDatosExistenciasCostos.getRowCount()-1);						
			}
			
			this.isEsNuevoExistenciasCostos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoExistenciasCostos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesExistenciasCostos(true);			
			//this.existenciascostos=new ExistenciasCostos();
			//this.existenciascostos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesExistenciasCostos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualExistenciasCostos() ;
			
			if(ExistenciasCostosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleExistenciasCostos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.existenciascostos);	
			this.actualizarInformacion("INFO_PADRE",false,this.existenciascostos);				
			
			ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
			
			if(this.existenciascostosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ExistenciasCostos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarExistenciasCostosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ExistenciasCostos> existenciascostossSeleccionados=new ArrayList<ExistenciasCostos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosExistenciasCostos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosExistenciasCostos.getSelectedRows().length;			
			}
			
			existenciascostossSeleccionados=this.getExistenciasCostossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoExistenciasCostos--;			
				//ExistenciasCostos existenciascostosAux= new ExistenciasCostos();			
				//existenciascostosAux.setId(this.iIdNuevoExistenciasCostos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ExistenciasCostos existenciascostosOrigen=new ExistenciasCostos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ExistenciasCostos existenciascostosOrigen : existenciascostossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							existenciascostosOrigen =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							existenciascostosOrigen =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaExistenciasCostos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.existenciascostos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosExistenciasCostos(existenciascostosOrigen,this.existenciascostos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.existenciascostosLogic.getExistenciasCostoss().add(this.existenciascostosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.existenciascostoss.add(this.existenciascostosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaExistenciasCostos(false);
				
				this.jTableDatosExistenciasCostos.setRowSelectionInterval(this.getIndiceNuevoExistenciasCostos(), this.getIndiceNuevoExistenciasCostos());
				
				int iLastRow =  this.jTableDatosExistenciasCostos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosExistenciasCostos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosExistenciasCostos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaExistenciasCostos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ExistenciasCostos> existenciascostossSeleccionados=new ArrayList<ExistenciasCostos>();									
		
			ExistenciasCostos existenciascostosOrigen=new ExistenciasCostos();
			ExistenciasCostos existenciascostosDestino=new ExistenciasCostos();
				
			existenciascostossSeleccionados=this.getExistenciasCostossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosExistenciasCostos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || existenciascostossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosExistenciasCostos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						existenciascostosOrigen =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						existenciascostosOrigen =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						existenciascostosDestino =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						existenciascostosDestino =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				existenciascostosOrigen =existenciascostossSeleccionados.get(0);
				existenciascostosDestino =existenciascostossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosExistenciasCostos(existenciascostosOrigen,existenciascostosDestino,true,false);
				
				existenciascostosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(existenciascostosDestino,existenciascostosLogic.getExistenciasCostoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(existenciascostosDestino,existenciascostoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaExistenciasCostos(false);
				
				//this.jTableDatosExistenciasCostos.setRowSelectionInterval(this.getIndiceNuevoExistenciasCostos(), this.getIndiceNuevoExistenciasCostos());
				
				int iLastRow =  this.jTableDatosExistenciasCostos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosExistenciasCostos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosExistenciasCostos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaExistenciasCostos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormExistenciasCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormExistenciasCostos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesExistenciasCostos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasExistenciasCostos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesExistenciasCostos.setVisible(!isVisible);
			this.jPanelPaginacionExistenciasCostos.setVisible(!isVisible);
			this.jPanelAccionesExistenciasCostos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameExistenciasCostos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoExistenciasCostos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionExistenciasCostos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByExistenciasCostos();
			
			this.abrirFrameOrderByExistenciasCostos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByExistenciasCostos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleExistenciasCostos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormExistenciasCostos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormExistenciasCostos.isMaximum()) {
					this.jInternalFrameDetalleFormExistenciasCostos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormExistenciasCostos.setSize(this.jInternalFrameDetalleFormExistenciasCostos.iWidthFormulario,this.jInternalFrameDetalleFormExistenciasCostos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormExistenciasCostos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormExistenciasCostos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormExistenciasCostos.isMaximum()) {
						this.jInternalFrameDetalleFormExistenciasCostos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormExistenciasCostos.jContentPaneDetalleExistenciasCostos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormExistenciasCostos.jTabbedPaneRelacionesExistenciasCostos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormExistenciasCostos.jContentPaneDetalleExistenciasCostos.getWidth(),ExistenciasCostosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormExistenciasCostos.jTabbedPaneRelacionesExistenciasCostos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormExistenciasCostos.jContentPaneDetalleExistenciasCostos.getWidth(),ExistenciasCostosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormExistenciasCostos.jTabbedPaneRelacionesExistenciasCostos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormExistenciasCostos.jContentPaneDetalleExistenciasCostos.getWidth(),ExistenciasCostosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormExistenciasCostos.setVisible(true);
	        this.jInternalFrameDetalleFormExistenciasCostos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByExistenciasCostos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByExistenciasCostos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByExistenciasCostos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByExistenciasCostos,false,this);
				} else {
					this.jInternalFrameOrderByExistenciasCostos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByExistenciasCostos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByExistenciasCostos);
				this.jInternalFrameOrderByExistenciasCostos.setVisible(false);
				this.jInternalFrameOrderByExistenciasCostos.setSelected(false);
				
				this.jInternalFrameOrderByExistenciasCostos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByExistenciasCostos"));
				
				this.inicializarActualizarBindingTablaOrderByExistenciasCostos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionExistenciasCostos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionExistenciasCostos==null) {
				
				this.jInternalFrameImportacionExistenciasCostos=new ImportacionJInternalFrame(ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionExistenciasCostos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionExistenciasCostos);
				this.jInternalFrameImportacionExistenciasCostos.setVisible(false);
				this.jInternalFrameImportacionExistenciasCostos.setSelected(false);


				this.jInternalFrameImportacionExistenciasCostos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionExistenciasCostos"));
				this.jInternalFrameImportacionExistenciasCostos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionExistenciasCostos"));
				this.jInternalFrameImportacionExistenciasCostos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionExistenciasCostos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoExistenciasCostos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoExistenciasCostos==null) {
				this.jInternalFrameReporteDinamicoExistenciasCostos=new ReporteDinamicoJInternalFrame(ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoExistenciasCostos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoExistenciasCostos);
				this.jInternalFrameReporteDinamicoExistenciasCostos.setVisible(false);
				this.jInternalFrameReporteDinamicoExistenciasCostos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoExistenciasCostos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoExistenciasCostos"));
				this.jInternalFrameReporteDinamicoExistenciasCostos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoExistenciasCostos"));
				this.jInternalFrameReporteDinamicoExistenciasCostos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoExistenciasCostos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualExistenciasCostos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleExistenciasCostos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormExistenciasCostos);
			
	       	this.jInternalFrameDetalleFormExistenciasCostos.setVisible(false);
	        this.jInternalFrameDetalleFormExistenciasCostos.setSelected(false);
			
			//this.jInternalFrameDetalleFormExistenciasCostos.dispose();
			//this.jInternalFrameDetalleFormExistenciasCostos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoExistenciasCostos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoExistenciasCostos.setVisible(true);
	        this.jInternalFrameReporteDinamicoExistenciasCostos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionExistenciasCostos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionExistenciasCostos.setVisible(true);
	        this.jInternalFrameImportacionExistenciasCostos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByExistenciasCostos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByExistenciasCostos.setVisible(true);
	        this.jInternalFrameOrderByExistenciasCostos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByExistenciasCostos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByExistenciasCostos.setVisible(false);
	        this.jInternalFrameOrderByExistenciasCostos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoExistenciasCostos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoExistenciasCostos.setVisible(false);
	        this.jInternalFrameReporteDinamicoExistenciasCostos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionExistenciasCostos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionExistenciasCostos.setVisible(false);
	        this.jInternalFrameImportacionExistenciasCostos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarExistenciasCostos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarExistenciasCostos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesExistenciasCostos(true);
			//this.isEsNuevoExistenciasCostos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesExistenciasCostos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesExistenciasCostos(false) ;
			
			if(existenciascostosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ExistenciasCostosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleExistenciasCostos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualExistenciasCostos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaExistenciasCostosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarExistenciasCostos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormExistenciasCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesExistenciasCostos(true);
			//this.isEsNuevoExistenciasCostos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.existenciascostos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesExistenciasCostos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesExistenciasCostos(false) ;
			
			if(ExistenciasCostosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleExistenciasCostos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualExistenciasCostos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosExistenciasCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasCostos,ExistenciasCostosConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosExistenciasCostos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaGrupo(List<Linea> lineagruposForeignKey)throws Exception{
		TableColumn tableColumnLineaGrupo=this.jTableDatosExistenciasCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasCostos,ExistenciasCostosConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosExistenciasCostos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineagruposForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaCategoria(List<Linea> lineacategoriasForeignKey)throws Exception{
		TableColumn tableColumnLineaCategoria=this.jTableDatosExistenciasCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasCostos,ExistenciasCostosConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosExistenciasCostos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineacategoriasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaMarca(List<Linea> lineamarcasForeignKey)throws Exception{
		TableColumn tableColumnLineaMarca=this.jTableDatosExistenciasCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasCostos,ExistenciasCostosConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosExistenciasCostos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesExistenciasCostos(false);
			
			//if(!this.isEsNuevoExistenciasCostos) {								
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ExistenciasCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
				
			}
			
			if(this.permiteMantenimiento(this.existenciascostos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoExistenciasCostos=true;
					this.inicializarActualizarBindingTablaExistenciasCostos(false);
					this.isEsNuevoExistenciasCostos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoExistenciasCostos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoExistenciasCostos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesExistenciasCostos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualExistenciasCostos(false);
				
				this.habilitarDeshabilitarControlesExistenciasCostos(false);
			
												
				
				if(ExistenciasCostosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleExistenciasCostos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoExistenciasCostosActionPerformed(evt,existenciascostosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualExistenciasCostos(this.existenciascostos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosExistenciasCostos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,existenciascostosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.existenciascostos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ExistenciasCostos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasCostos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				this.existenciascostos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				this.existenciascostos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.existenciascostos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ExistenciasCostosModel) this.jTableDatosExistenciasCostos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoExistenciasCostos=true;
				this.inicializarActualizarBindingTablaExistenciasCostos(false);
				this.isEsNuevoExistenciasCostos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesExistenciasCostos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualExistenciasCostos(false);
				
				this.habilitarDeshabilitarControlesExistenciasCostos(false);
				
				
				
				if(ExistenciasCostosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleExistenciasCostos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosExistenciasCostos.getRowCount()>=1) {
				jTableDatosExistenciasCostos.removeRowSelectionInterval(0, jTableDatosExistenciasCostos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesExistenciasCostos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaExistenciasCostos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesExistenciasCostos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualExistenciasCostos(false) ;
			
			this.isEsNuevoExistenciasCostos=false;
			
			if(ExistenciasCostosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleExistenciasCostos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingExistenciasCostos(false);
				
				//SI ES MANUAL
				if(ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualExistenciasCostos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoExistenciasCostos--;			
			//ExistenciasCostos existenciascostosAux= new ExistenciasCostos();			
			//existenciascostosAux.setId(this.iIdNuevoExistenciasCostos);
			
			if(this.jInternalFrameDetalleFormExistenciasCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaExistenciasCostos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
			
			this.existenciascostos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.existenciascostosLogic.getExistenciasCostoss().add(this.existenciascostosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.existenciascostoss.add(this.existenciascostosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaExistenciasCostos(false);
			
			this.jTableDatosExistenciasCostos.setRowSelectionInterval(this.getIndiceNuevoExistenciasCostos(), this.getIndiceNuevoExistenciasCostos());
			
			int iLastRow =  this.jTableDatosExistenciasCostos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosExistenciasCostos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosExistenciasCostos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaExistenciasCostos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingExistenciasCostos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingExistenciasCostos(false);
			
			//SI ES MANUAL
			if(ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualExistenciasCostos();
			}
			
			//this.abrirFrameTreeExistenciasCostos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionExistenciasCostos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionExistenciasCostos.setFileImportacion(this.jInternalFrameImportacionExistenciasCostos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionExistenciasCostos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionExistenciasCostos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionExistenciasCostos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionExistenciasCostos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ExistenciasCostos> existenciascostossSeleccionados=new ArrayList<ExistenciasCostos>();		

		existenciascostossSeleccionados=this.getExistenciasCostossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ExistenciasCostosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ExistenciasCostosBaseDesign.jrxml";
			
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
			
			this.generarReporteExistenciasCostoss("Todos",existenciascostossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.existenciascostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Existencias Costos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoExistenciasCostos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoExistenciasCostos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLinea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLinea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLinea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLinea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaMarca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaMarca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaMarca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaMarca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ExistenciasCostosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ExistenciasCostosConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoExistenciasCostos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoria="nombre_linea";
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoria="nombre_linea_grupo";
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoria="nombre_linea_categoria";
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoria="nombre_linea_marca";
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoriaValor="nombre_linea";
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoriaValor="nombre_linea_grupo";
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoriaValor="nombre_linea_categoria";
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoriaValor="nombre_linea_marca";
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoExistenciasCostos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoExistenciasCostos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea");
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_grupo");
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_categoria");
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_marca");
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
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
	
	public void jButtonGenerarExcelReporteDinamicoExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ExistenciasCostos> existenciascostossSeleccionados=new ArrayList<ExistenciasCostos>();		
		
		existenciascostossSeleccionados=this.getExistenciasCostossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"existenciascostos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ExistenciasCostoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoExistenciasCostos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoExistenciasCostos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ExistenciasCostosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ExistenciasCostos existenciascostos:existenciascostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciascostos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ExistenciasCostos existenciascostos:existenciascostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciascostos.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ExistenciasCostos existenciascostos:existenciascostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciascostos.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ExistenciasCostos existenciascostos:existenciascostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciascostos.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ExistenciasCostos existenciascostos:existenciascostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciascostos.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(ExistenciasCostos existenciascostos:existenciascostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciascostos.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(ExistenciasCostos existenciascostos:existenciascostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciascostos.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(ExistenciasCostos existenciascostos:existenciascostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciascostos.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA);
					iRow++;

					for(ExistenciasCostos existenciascostos:existenciascostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciascostos.getnombre_linea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
					iRow++;

					for(ExistenciasCostos existenciascostos:existenciascostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciascostos.getnombre_linea_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
					iRow++;

					for(ExistenciasCostos existenciascostos:existenciascostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciascostos.getnombre_linea_categoria());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
					iRow++;

					for(ExistenciasCostos existenciascostos:existenciascostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciascostos.getnombre_linea_marca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ExistenciasCostos existenciascostos:existenciascostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciascostos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ExistenciasCostosConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(ExistenciasCostos existenciascostos:existenciascostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(existenciascostos.getcosto_total());
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
			//	this.getFilaCabeceraExportarExcelExistenciasCostos(row);				
			//	iRow++;
			//}				
			
			//for(ExistenciasCostos existenciascostosAux:existenciascostossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelExistenciasCostos(existenciascostosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.existenciascostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Existencias Costos",JOptionPane.INFORMATION_MESSAGE);
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
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingExistenciasCostos(false);
			
			//SI ES MANUAL
			if(ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualExistenciasCostos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingExistenciasCostos(false);
			
			//SI ES MANUAL
			if(ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualExistenciasCostos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingExistenciasCostos(false);
			
			//SI ES MANUAL
			if(ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualExistenciasCostos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaExistenciasCostos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosExistenciasCostos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosExistenciasCostos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosExistenciasCostos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosExistenciasCostos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosExistenciasCostos.setMinimumSize(dimensionMinimum);
		this.jTableDatosExistenciasCostos.setMaximumSize(dimensionMaximum);
		this.jTableDatosExistenciasCostos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingExistenciasCostos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingExistenciasCostos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingExistenciasCostos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaExistenciasCostos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesExistenciasCostos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasExistenciasCostos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesExistenciasCostos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesExistenciasCostos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ExistenciasCostosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualExistenciasCostos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaExistenciasCostos();
		
		this.inicializarActualizarBindingBotonesManualExistenciasCostos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualExistenciasCostos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesExistenciasCostos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualExistenciasCostos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualExistenciasCostos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosExistenciasCostos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosExistenciasCostos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteExistenciasCostos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormExistenciasCostos.jCheckBoxPostAccionNuevoExistenciasCostos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormExistenciasCostos.jCheckBoxPostAccionSinCerrarExistenciasCostos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormExistenciasCostos.jCheckBoxPostAccionSinMensajeExistenciasCostos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosExistenciasCostos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosExistenciasCostos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteExistenciasCostos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
				this.jInternalFrameDetalleFormExistenciasCostos.jCheckBoxPostAccionNuevoExistenciasCostos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormExistenciasCostos.jCheckBoxPostAccionSinCerrarExistenciasCostos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormExistenciasCostos.jCheckBoxPostAccionSinMensajeExistenciasCostos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionExistenciasCostos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionExistenciasCostos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxTiposAccionesFormularioExistenciasCostos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesExistenciasCostos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoExistenciasCostos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesExistenciasCostos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesExistenciasCostos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarExistenciasCostos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesExistenciasCostos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoExistenciasCostos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesExistenciasCostos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralExistenciasCostos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesExistenciasCostos(Boolean esInicializar) throws Exception {
		try	{	
			if(ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualExistenciasCostos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesExistenciasCostos() throws Exception {
		try	{
			if(ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualExistenciasCostos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleExistenciasCostos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxTiposAccionesFormularioExistenciasCostos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxTiposAccionesFormularioExistenciasCostos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualExistenciasCostos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesExistenciasCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesExistenciasCostos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesExistenciasCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesExistenciasCostos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesExistenciasCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesExistenciasCostos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionExistenciasCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionExistenciasCostos.addItem(reporte);
			}
			
			
			if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionExistenciasCostos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionExistenciasCostos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesExistenciasCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesExistenciasCostos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesExistenciasCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesExistenciasCostos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxTiposAccionesFormularioExistenciasCostos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxTiposAccionesFormularioExistenciasCostos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarExistenciasCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarExistenciasCostos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarExistenciasCostos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualExistenciasCostos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualExistenciasCostos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoExistenciasCostos!=null) {
				this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoExistenciasCostos!=null) {
				this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoExistenciasCostos!=null) {
				
				if(this.jInternalFrameReporteDinamicoExistenciasCostos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoExistenciasCostos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoExistenciasCostos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoExistenciasCostos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoExistenciasCostos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoExistenciasCostos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ExistenciasCostosConstantesFunciones.getTiposSeleccionarExistenciasCostos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ExistenciasCostosConstantesFunciones.getTiposSeleccionarExistenciasCostos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoExistenciasCostos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoExistenciasCostos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ExistenciasCostosConstantesFunciones.getTiposSeleccionarExistenciasCostos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoExistenciasCostos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoExistenciasCostos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualExistenciasCostos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos.getSelectedItem()!=null){this.id_lineaBusquedaExistenciasCostos=((Linea)this.jComboBoxid_lineaBusquedaExistenciasCostosExistenciasCostos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.getSelectedItem()!=null){this.id_linea_grupoBusquedaExistenciasCostos=((Linea)this.jComboBoxid_linea_grupoBusquedaExistenciasCostosExistenciasCostos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.getSelectedItem()!=null){this.id_linea_categoriaBusquedaExistenciasCostos=((Linea)this.jComboBoxid_linea_categoriaBusquedaExistenciasCostosExistenciasCostos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.getSelectedItem()!=null){this.id_linea_marcaBusquedaExistenciasCostos=((Linea)this.jComboBoxid_linea_marcaBusquedaExistenciasCostosExistenciasCostos.getSelectedItem()).getId();}
		this.fecha_emision_hastaBusquedaExistenciasCostos=new Date(this.jDateChooserfecha_emision_hastaBusquedaExistenciasCostosExistenciasCostos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasExistenciasCostos(Boolean esInicializar) throws Exception {				
		if(ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualExistenciasCostos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaExistenciasCostos() throws Exception {
		this.inicializarActualizarBindingTablaExistenciasCostos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByExistenciasCostos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByExistenciasCostos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByExistenciasCostos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByExistenciasCostos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ExistenciasCostosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByExistenciasCostos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByExistenciasCostos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ExistenciasCostosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosExistenciasCostosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasCostosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ExistenciasCostosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByExistenciasCostos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByExistenciasCostos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ExistenciasCostosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByExistenciasCostos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaExistenciasCostos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=existenciascostosLogic.getExistenciasCostoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=existenciascostoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ExistenciasCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosExistenciasCostos.setModel(new ExistenciasCostosModel(this.existenciascostosLogic.getExistenciasCostoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosExistenciasCostos.setModel(new ExistenciasCostosModel(this.existenciascostoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByExistenciasCostos!=null && this.jInternalFrameOrderByExistenciasCostos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByExistenciasCostos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosExistenciasCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasCostos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ExistenciasCostosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO,existenciascostosConstantesFunciones.resaltarSeleccionarExistenciasCostos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO,existenciascostosConstantesFunciones.resaltarSeleccionarExistenciasCostos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosExistenciasCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasCostos,ExistenciasCostosConstantesFunciones.LABEL_ID));

		if(this.existenciascostosConstantesFunciones.mostraridExistenciasCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasCostosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.existenciascostosConstantesFunciones.resaltaridExistenciasCostos,this.existenciascostosConstantesFunciones.activaridExistenciasCostos,iSizeTabla,this,true,"idExistenciasCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciascostosConstantesFunciones.resaltaridExistenciasCostos,this.existenciascostosConstantesFunciones.activaridExistenciasCostos,this,true,"idExistenciasCostos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasCostos,ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.existenciascostosConstantesFunciones.mostrarnombre_productoExistenciasCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.existenciascostosConstantesFunciones.resaltarnombre_productoExistenciasCostos,this.existenciascostosConstantesFunciones.activarnombre_productoExistenciasCostos,iSizeTabla,this,true,"nombre_productoExistenciasCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciascostosConstantesFunciones.resaltarnombre_productoExistenciasCostos,this.existenciascostosConstantesFunciones.activarnombre_productoExistenciasCostos,this,true,"nombre_productoExistenciasCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ExistenciasCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasCostos,ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.existenciascostosConstantesFunciones.mostrarnombre_unidadExistenciasCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.existenciascostosConstantesFunciones.resaltarnombre_unidadExistenciasCostos,this.existenciascostosConstantesFunciones.activarnombre_unidadExistenciasCostos,iSizeTabla,this,true,"nombre_unidadExistenciasCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciascostosConstantesFunciones.resaltarnombre_unidadExistenciasCostos,this.existenciascostosConstantesFunciones.activarnombre_unidadExistenciasCostos,this,true,"nombre_unidadExistenciasCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ExistenciasCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasCostos,ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA));

		if(this.existenciascostosConstantesFunciones.mostrarnombre_lineaExistenciasCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.existenciascostosConstantesFunciones.resaltarnombre_lineaExistenciasCostos,this.existenciascostosConstantesFunciones.activarnombre_lineaExistenciasCostos,iSizeTabla,this,true,"nombre_lineaExistenciasCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciascostosConstantesFunciones.resaltarnombre_lineaExistenciasCostos,this.existenciascostosConstantesFunciones.activarnombre_lineaExistenciasCostos,this,true,"nombre_lineaExistenciasCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ExistenciasCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasCostos,ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO));

		if(this.existenciascostosConstantesFunciones.mostrarnombre_linea_grupoExistenciasCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.existenciascostosConstantesFunciones.resaltarnombre_linea_grupoExistenciasCostos,this.existenciascostosConstantesFunciones.activarnombre_linea_grupoExistenciasCostos,iSizeTabla,this,true,"nombre_linea_grupoExistenciasCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciascostosConstantesFunciones.resaltarnombre_linea_grupoExistenciasCostos,this.existenciascostosConstantesFunciones.activarnombre_linea_grupoExistenciasCostos,this,true,"nombre_linea_grupoExistenciasCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ExistenciasCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasCostos,ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA));

		if(this.existenciascostosConstantesFunciones.mostrarnombre_linea_categoriaExistenciasCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.existenciascostosConstantesFunciones.resaltarnombre_linea_categoriaExistenciasCostos,this.existenciascostosConstantesFunciones.activarnombre_linea_categoriaExistenciasCostos,iSizeTabla,this,true,"nombre_linea_categoriaExistenciasCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciascostosConstantesFunciones.resaltarnombre_linea_categoriaExistenciasCostos,this.existenciascostosConstantesFunciones.activarnombre_linea_categoriaExistenciasCostos,this,true,"nombre_linea_categoriaExistenciasCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ExistenciasCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasCostos,ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA));

		if(this.existenciascostosConstantesFunciones.mostrarnombre_linea_marcaExistenciasCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.existenciascostosConstantesFunciones.resaltarnombre_linea_marcaExistenciasCostos,this.existenciascostosConstantesFunciones.activarnombre_linea_marcaExistenciasCostos,iSizeTabla,this,true,"nombre_linea_marcaExistenciasCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciascostosConstantesFunciones.resaltarnombre_linea_marcaExistenciasCostos,this.existenciascostosConstantesFunciones.activarnombre_linea_marcaExistenciasCostos,this,true,"nombre_linea_marcaExistenciasCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ExistenciasCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasCostos,ExistenciasCostosConstantesFunciones.LABEL_CODIGO));

		if(this.existenciascostosConstantesFunciones.mostrarcodigoExistenciasCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasCostosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.existenciascostosConstantesFunciones.resaltarcodigoExistenciasCostos,this.existenciascostosConstantesFunciones.activarcodigoExistenciasCostos,iSizeTabla,this,true,"codigoExistenciasCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciascostosConstantesFunciones.resaltarcodigoExistenciasCostos,this.existenciascostosConstantesFunciones.activarcodigoExistenciasCostos,this,true,"codigoExistenciasCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ExistenciasCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosExistenciasCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosExistenciasCostos,ExistenciasCostosConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.existenciascostosConstantesFunciones.mostrarcosto_totalExistenciasCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ExistenciasCostosConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.existenciascostosConstantesFunciones.resaltarcosto_totalExistenciasCostos,this.existenciascostosConstantesFunciones.activarcosto_totalExistenciasCostos,iSizeTabla,this,true,"costo_totalExistenciasCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.existenciascostosConstantesFunciones.resaltarcosto_totalExistenciasCostos,this.existenciascostosConstantesFunciones.activarcosto_totalExistenciasCostos,this,true,"costo_totalExistenciasCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ExistenciasCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.existenciascostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.existenciascostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosExistenciasCostos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.existenciascostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.existenciascostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosExistenciasCostos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarExistenciasCostos && this.isPermisoGuardarCambiosExistenciasCostos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.existenciascostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.existenciascostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosExistenciasCostos.addColumn(tableColumn);
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
			
			this.jTableDatosExistenciasCostos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarExistenciasCostos && this.isPermisoGuardarCambiosExistenciasCostos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarExistenciasCostos && this.isPermisoGuardarCambiosExistenciasCostos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosExistenciasCostos.moveColumn(this.jTableDatosExistenciasCostos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosExistenciasCostos.moveColumn(this.jTableDatosExistenciasCostos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosExistenciasCostos.moveColumn(this.jTableDatosExistenciasCostos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosExistenciasCostos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosExistenciasCostos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosExistenciasCostos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosExistenciasCostos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosExistenciasCostos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ExistenciasCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosExistenciasCostos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosExistenciasCostos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosExistenciasCostos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=existenciascostosLogic.getExistenciasCostoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=existenciascostoss.size()-1;
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
		//this.jTableDatosExistenciasCostos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosExistenciasCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosExistenciasCostos();
			
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
				
				//this.isEsNuevoExistenciasCostos=false;
					
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
			
				if(this.existenciascostosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormExistenciasCostos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosExistenciasCostos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosExistenciasCostos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.existenciascostos.getsType().equals("DUPLICADO")
				   || this.existenciascostos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoExistenciasCostos=true;
				
				} else {
					this.isEsNuevoExistenciasCostos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
					if(this.existenciascostos.getId()>=0 && !this.existenciascostos.getIsNew()) {						
						this.isEsNuevoExistenciasCostos=false;
						
					} else {
						this.isEsNuevoExistenciasCostos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoExistenciasCostos(esRelaciones);						
				
				this.seleccionarExistenciasCostos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.existenciascostos.getId()<0) {
					this.isEsNuevoExistenciasCostos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarExistenciasCostos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarExistenciasCostos(evt,rowIndex);
				}	
				
				if(this.existenciascostosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ExistenciasCostos: " + this.dDif); 
					}
				}								
				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarExistenciasCostos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.existenciascostos)) {
					if(this.existenciascostos.getId()>0) {
						this.existenciascostos.setIsDeleted(true);
						
						this.existenciascostossEliminados.add(this.existenciascostos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.existenciascostosLogic.getExistenciasCostoss().remove(this.existenciascostos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.existenciascostoss.remove(this.existenciascostos);				
					}
					
					
					((ExistenciasCostosModel) this.jTableDatosExistenciasCostos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaExistenciasCostos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarExistenciasCostos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoExistenciasCostos) {
			
			if(this.jInternalFrameDetalleFormExistenciasCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosExistenciasCostos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosExistenciasCostos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ExistenciasCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioExistenciasCostos(this.existenciascostos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesExistenciasCostos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesExistenciasCostos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualExistenciasCostos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoExistenciasCostos(ExistenciasCostos existenciascostos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoExistenciasCostos(existenciascostos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoExistenciasCostos(ExistenciasCostos existenciascostos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioExistenciasCostos(existenciascostos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyExistenciasCostos(existenciascostos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyExistenciasCostos(existenciascostos);
	}
	
	public void setVariablesObjetoActualToFormularioExistenciasCostos(ExistenciasCostos existenciascostos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormExistenciasCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormExistenciasCostos.jLabelidExistenciasCostos.setText(existenciascostos.getId().toString());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_productoExistenciasCostos.setText(existenciascostos.getnombre_producto());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldnombre_unidadExistenciasCostos.setText(existenciascostos.getnombre_unidad());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_lineaExistenciasCostos.setText(existenciascostos.getnombre_linea());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_grupoExistenciasCostos.setText(existenciascostos.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_categoriaExistenciasCostos.setText(existenciascostos.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_marcaExistenciasCostos.setText(existenciascostos.getnombre_linea_marca());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldcodigoExistenciasCostos.setText(existenciascostos.getcodigo());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldcosto_totalExistenciasCostos.setText(existenciascostos.getcosto_total().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ExistenciasCostos existenciascostosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,existenciascostosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ExistenciasCostos existenciascostosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				existenciascostosLocal=this.existenciascostos;
			} else {
				existenciascostosLocal=this.existenciascostosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(existenciascostosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoExistenciasCostos(existenciascostosLocal,true);
					
					if(existenciascostosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(existenciascostosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(existenciascostosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoExistenciasCostos(ExistenciasCostos existenciascostos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualExistenciasCostos(existenciascostos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(existenciascostos);
	}
	
	public void setVariablesFormularioToObjetoActualExistenciasCostos(ExistenciasCostos existenciascostos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualExistenciasCostos(existenciascostos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualExistenciasCostos(ExistenciasCostos existenciascostos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormExistenciasCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormExistenciasCostos.jLabelidExistenciasCostos.getText()==null || this.jInternalFrameDetalleFormExistenciasCostos.jLabelidExistenciasCostos.getText()=="" || this.jInternalFrameDetalleFormExistenciasCostos.jLabelidExistenciasCostos.getText()=="Id") {
				this.jInternalFrameDetalleFormExistenciasCostos.jLabelidExistenciasCostos.setText("0");
			}

			if(conColumnasBase) {existenciascostos.setId(Long.parseLong(this.jInternalFrameDetalleFormExistenciasCostos.jLabelidExistenciasCostos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasCostosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasCostos.jLabelIdExistenciasCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciascostos.setnombre_producto(this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_productoExistenciasCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_productoExistenciasCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciascostos.setnombre_unidad(this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldnombre_unidadExistenciasCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_unidadExistenciasCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciascostos.setnombre_linea(this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_lineaExistenciasCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_lineaExistenciasCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciascostos.setnombre_linea_grupo(this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_grupoExistenciasCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_linea_grupoExistenciasCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciascostos.setnombre_linea_categoria(this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_categoriaExistenciasCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_linea_categoriaExistenciasCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciascostos.setnombre_linea_marca(this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_marcaExistenciasCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasCostos.jLabelnombre_linea_marcaExistenciasCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciascostos.setcodigo(this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldcodigoExistenciasCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasCostosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasCostos.jLabelcodigoExistenciasCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			existenciascostos.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldcosto_totalExistenciasCostos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ExistenciasCostosConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormExistenciasCostos.jLabelcosto_totalExistenciasCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualExistenciasCostos(ExistenciasCostos existenciascostosBean,ExistenciasCostos existenciascostos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosExistenciasCostos(ExistenciasCostos existenciascostosOrigen,ExistenciasCostos existenciascostos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && existenciascostosOrigen.getId()!=null && !existenciascostosOrigen.getId().equals(0L))) {existenciascostos.setId(existenciascostosOrigen.getId());}}
			if(conDefault || (!conDefault && existenciascostosOrigen.getfecha_emision_hasta()!=null && !existenciascostosOrigen.getfecha_emision_hasta().equals(new Date()))) {existenciascostos.setfecha_emision_hasta(existenciascostosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && existenciascostosOrigen.getnombre_producto()!=null && !existenciascostosOrigen.getnombre_producto().equals(""))) {existenciascostos.setnombre_producto(existenciascostosOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && existenciascostosOrigen.getnombre_unidad()!=null && !existenciascostosOrigen.getnombre_unidad().equals(""))) {existenciascostos.setnombre_unidad(existenciascostosOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && existenciascostosOrigen.getnombre_linea()!=null && !existenciascostosOrigen.getnombre_linea().equals(""))) {existenciascostos.setnombre_linea(existenciascostosOrigen.getnombre_linea());}
			if(conDefault || (!conDefault && existenciascostosOrigen.getnombre_linea_grupo()!=null && !existenciascostosOrigen.getnombre_linea_grupo().equals(""))) {existenciascostos.setnombre_linea_grupo(existenciascostosOrigen.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && existenciascostosOrigen.getnombre_linea_categoria()!=null && !existenciascostosOrigen.getnombre_linea_categoria().equals(""))) {existenciascostos.setnombre_linea_categoria(existenciascostosOrigen.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && existenciascostosOrigen.getnombre_linea_marca()!=null && !existenciascostosOrigen.getnombre_linea_marca().equals(""))) {existenciascostos.setnombre_linea_marca(existenciascostosOrigen.getnombre_linea_marca());}
			if(conDefault || (!conDefault && existenciascostosOrigen.getcodigo()!=null && !existenciascostosOrigen.getcodigo().equals(""))) {existenciascostos.setcodigo(existenciascostosOrigen.getcodigo());}
			if(conDefault || (!conDefault && existenciascostosOrigen.getcosto_total()!=null && !existenciascostosOrigen.getcosto_total().equals(0.0))) {existenciascostos.setcosto_total(existenciascostosOrigen.getcosto_total());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioExistenciasCostos(ExistenciasCostos existenciascostos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormExistenciasCostos.jLabelidExistenciasCostos.setText(existenciascostos.getId().toString());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_productoExistenciasCostos.setText(existenciascostos.getnombre_producto());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldnombre_unidadExistenciasCostos.setText(existenciascostos.getnombre_unidad());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_lineaExistenciasCostos.setText(existenciascostos.getnombre_linea());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_grupoExistenciasCostos.setText(existenciascostos.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_categoriaExistenciasCostos.setText(existenciascostos.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_marcaExistenciasCostos.setText(existenciascostos.getnombre_linea_marca());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldcodigoExistenciasCostos.setText(existenciascostos.getcodigo());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldcosto_totalExistenciasCostos.setText(existenciascostos.getcosto_total().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioExistenciasCostos(ExistenciasCostosBean existenciascostosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormExistenciasCostos.jLabelidExistenciasCostos.setText(existenciascostosBean.getId().toString());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_productoExistenciasCostos.setText(existenciascostosBean.getnombre_producto());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldnombre_unidadExistenciasCostos.setText(existenciascostosBean.getnombre_unidad());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_lineaExistenciasCostos.setText(existenciascostosBean.getnombre_linea());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_grupoExistenciasCostos.setText(existenciascostosBean.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_categoriaExistenciasCostos.setText(existenciascostosBean.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_marcaExistenciasCostos.setText(existenciascostosBean.getnombre_linea_marca());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldcodigoExistenciasCostos.setText(existenciascostosBean.getcodigo());
			this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldcosto_totalExistenciasCostos.setText(existenciascostosBean.getcosto_total().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanExistenciasCostos(ExistenciasCostosParameterReturnGeneral existenciascostosReturnGeneral,ExistenciasCostosBean existenciascostosBean,Boolean conDefault) throws Exception { 
		try {
			ExistenciasCostos existenciascostosLocal=new ExistenciasCostos();
			
			existenciascostosLocal=existenciascostosReturnGeneral.getExistenciasCostos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && existenciascostosLocal.getId()!=null && !existenciascostosLocal.getId().equals(0L))) {existenciascostosBean.setId(existenciascostosLocal.getId());}}
			if(conDefault || (!conDefault && existenciascostosLocal.getnombre_producto()!=null && !existenciascostosLocal.getnombre_producto().equals(""))) {existenciascostosBean.setnombre_producto(existenciascostosLocal.getnombre_producto());}
			if(conDefault || (!conDefault && existenciascostosLocal.getnombre_unidad()!=null && !existenciascostosLocal.getnombre_unidad().equals(""))) {existenciascostosBean.setnombre_unidad(existenciascostosLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && existenciascostosLocal.getnombre_linea()!=null && !existenciascostosLocal.getnombre_linea().equals(""))) {existenciascostosBean.setnombre_linea(existenciascostosLocal.getnombre_linea());}
			if(conDefault || (!conDefault && existenciascostosLocal.getnombre_linea_grupo()!=null && !existenciascostosLocal.getnombre_linea_grupo().equals(""))) {existenciascostosBean.setnombre_linea_grupo(existenciascostosLocal.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && existenciascostosLocal.getnombre_linea_categoria()!=null && !existenciascostosLocal.getnombre_linea_categoria().equals(""))) {existenciascostosBean.setnombre_linea_categoria(existenciascostosLocal.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && existenciascostosLocal.getnombre_linea_marca()!=null && !existenciascostosLocal.getnombre_linea_marca().equals(""))) {existenciascostosBean.setnombre_linea_marca(existenciascostosLocal.getnombre_linea_marca());}
			if(conDefault || (!conDefault && existenciascostosLocal.getcodigo()!=null && !existenciascostosLocal.getcodigo().equals(""))) {existenciascostosBean.setcodigo(existenciascostosLocal.getcodigo());}
			if(conDefault || (!conDefault && existenciascostosLocal.getcosto_total()!=null && !existenciascostosLocal.getcosto_total().equals(0.0))) {existenciascostosBean.setcosto_total(existenciascostosLocal.getcosto_total());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxExistenciasCostosGenerico(Long idExistenciasCostosSeleccionado,JComboBox jComboBoxExistenciasCostos,List<ExistenciasCostos> existenciascostossLocal)throws Exception {
		try {
			ExistenciasCostos  existenciascostosTemp=null;

			for(ExistenciasCostos existenciascostosAux:existenciascostossLocal) {
				if(existenciascostosAux.getId()!=null && existenciascostosAux.getId().equals(idExistenciasCostosSeleccionado)) {
					existenciascostosTemp=existenciascostosAux;
					break;
				}
			}

			jComboBoxExistenciasCostos.setSelectedItem(existenciascostosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxExistenciasCostosGenerico(JComboBox jComboBoxExistenciasCostos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxExistenciasCostos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxExistenciasCostos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxExistenciasCostos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxExistenciasCostos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existenciascostos=(ExistenciasCostos) existenciascostosLogic.getExistenciasCostoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			existenciascostos =(ExistenciasCostos) existenciascostoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!existenciascostos.getIsNew() && !existenciascostos.getIsChanged() && !existenciascostos.getIsDeleted()) {
				sDescripcion=existenciascostos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=existenciascostos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!existenciascostos.getIsNew() && !existenciascostos.getIsChanged() && !existenciascostos.getIsDeleted()) {
				sDescripcion=existenciascostos.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=existenciascostos.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!existenciascostos.getIsNew() && !existenciascostos.getIsChanged() && !existenciascostos.getIsDeleted()) {
				sDescripcion=existenciascostos.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=existenciascostos.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!existenciascostos.getIsNew() && !existenciascostos.getIsChanged() && !existenciascostos.getIsDeleted()) {
				sDescripcion=existenciascostos.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=existenciascostos.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!existenciascostos.getIsNew() && !existenciascostos.getIsChanged() && !existenciascostos.getIsDeleted()) {
				sDescripcion=existenciascostos.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=existenciascostos.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ExistenciasCostos existenciascostosRow=new ExistenciasCostos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existenciascostosRow=(ExistenciasCostos) existenciascostosLogic.getExistenciasCostoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			existenciascostosRow=(ExistenciasCostos) existenciascostoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualExistenciasCostos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoExistenciasCostos.setVisible((this.isVisibilidadCeldaNuevoExistenciasCostos && this.isPermisoNuevoExistenciasCostos));			
			this.jButtonDuplicarExistenciasCostos.setVisible((this.isVisibilidadCeldaDuplicarExistenciasCostos && this.isPermisoDuplicarExistenciasCostos));			
			this.jButtonCopiarExistenciasCostos.setVisible((this.isVisibilidadCeldaCopiarExistenciasCostos && this.isPermisoCopiarExistenciasCostos));
			this.jButtonVerFormExistenciasCostos.setVisible((this.isVisibilidadCeldaVerFormExistenciasCostos && this.isPermisoVerFormExistenciasCostos));
			
			this.jButtonAbrirOrderByExistenciasCostos.setVisible((this.isVisibilidadCeldaOrdenExistenciasCostos && this.isPermisoOrdenExistenciasCostos));			
			
			this.jButtonNuevoRelacionesExistenciasCostos.setVisible((this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos && this.isPermisoNuevoExistenciasCostos));			
			this.jButtonNuevoGuardarCambiosExistenciasCostos.setVisible((this.isVisibilidadCeldaNuevoExistenciasCostos && this.isPermisoNuevoExistenciasCostos && this.isPermisoGuardarCambiosExistenciasCostos));
			
			if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonModificarExistenciasCostos.setVisible((this.isVisibilidadCeldaModificarExistenciasCostos && this.isPermisoActualizarExistenciasCostos));	
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonActualizarExistenciasCostos.setVisible((this.isVisibilidadCeldaActualizarExistenciasCostos && this.isPermisoActualizarExistenciasCostos));	
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonEliminarExistenciasCostos.setVisible((this.isVisibilidadCeldaEliminarExistenciasCostos && this.isPermisoEliminarExistenciasCostos));
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonCancelarExistenciasCostos.setVisible(this.isVisibilidadCeldaCancelarExistenciasCostos);							
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonGuardarCambiosExistenciasCostos.setVisible((this.isVisibilidadCeldaGuardarExistenciasCostos && this.isPermisoGuardarCambiosExistenciasCostos));			
			
			}
						
			this.jButtonGuardarCambiosTablaExistenciasCostos.setVisible((this.isVisibilidadCeldaGuardarCambiosExistenciasCostos && this.isPermisoGuardarCambiosExistenciasCostos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarExistenciasCostos.setVisible((this.isVisibilidadCeldaNuevoExistenciasCostos && this.isPermisoNuevoExistenciasCostos));						
			this.jButtonDuplicarToolBarExistenciasCostos.setVisible((this.isVisibilidadCeldaDuplicarExistenciasCostos && this.isPermisoDuplicarExistenciasCostos));						
			this.jButtonCopiarToolBarExistenciasCostos.setVisible((this.isVisibilidadCeldaCopiarExistenciasCostos && this.isPermisoCopiarExistenciasCostos));			
			this.jButtonVerFormToolBarExistenciasCostos.setVisible((this.isVisibilidadCeldaVerFormExistenciasCostos && this.isPermisoVerFormExistenciasCostos));			
			this.jButtonAbrirOrderByToolBarExistenciasCostos.setVisible((this.isVisibilidadCeldaOrdenExistenciasCostos && this.isPermisoOrdenExistenciasCostos));
			this.jButtonNuevoRelacionesToolBarExistenciasCostos.setVisible((this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos && this.isPermisoNuevoExistenciasCostos));			
			this.jButtonNuevoGuardarCambiosToolBarExistenciasCostos.setVisible((this.isVisibilidadCeldaNuevoExistenciasCostos && this.isPermisoNuevoExistenciasCostos && this.isPermisoGuardarCambiosExistenciasCostos));			
			
			if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonModificarToolBarExistenciasCostos.setVisible((this.isVisibilidadCeldaModificarExistenciasCostos && this.isPermisoActualizarExistenciasCostos));	
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonActualizarToolBarExistenciasCostos.setVisible((this.isVisibilidadCeldaActualizarExistenciasCostos  && this.isPermisoActualizarExistenciasCostos));	
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonEliminarToolBarExistenciasCostos.setVisible((this.isVisibilidadCeldaEliminarExistenciasCostos && this.isPermisoEliminarExistenciasCostos));
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonCancelarToolBarExistenciasCostos.setVisible(this.isVisibilidadCeldaCancelarExistenciasCostos);				
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonGuardarCambiosToolBarExistenciasCostos.setVisible((this.isVisibilidadCeldaGuardarExistenciasCostos && this.isPermisoGuardarCambiosExistenciasCostos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarExistenciasCostos.setVisible((this.isVisibilidadCeldaGuardarCambiosExistenciasCostos && this.isPermisoGuardarCambiosExistenciasCostos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoExistenciasCostos.setVisible((this.isVisibilidadCeldaNuevoExistenciasCostos && this.isPermisoNuevoExistenciasCostos));			
			this.jMenuItemDuplicarExistenciasCostos.setVisible((this.isVisibilidadCeldaDuplicarExistenciasCostos && this.isPermisoDuplicarExistenciasCostos));			
			this.jMenuItemCopiarExistenciasCostos.setVisible((this.isVisibilidadCeldaCopiarExistenciasCostos && this.isPermisoCopiarExistenciasCostos));			
			this.jMenuItemVerFormExistenciasCostos.setVisible((this.isVisibilidadCeldaVerFormExistenciasCostos && this.isPermisoVerFormExistenciasCostos));			
			this.jMenuItemAbrirOrderByExistenciasCostos.setVisible((this.isVisibilidadCeldaOrdenExistenciasCostos && this.isPermisoOrdenExistenciasCostos));			
			//this.jMenuItemMostrarOcultarExistenciasCostos.setVisible((this.isVisibilidadCeldaOrdenExistenciasCostos && this.isPermisoOrdenExistenciasCostos));
			this.jMenuItemDetalleAbrirOrderByExistenciasCostos.setVisible((this.isVisibilidadCeldaOrdenExistenciasCostos && this.isPermisoOrdenExistenciasCostos));			
			//this.jMenuItemDetalleMostrarOcultarExistenciasCostos.setVisible((this.isVisibilidadCeldaOrdenExistenciasCostos && this.isPermisoOrdenExistenciasCostos));			
			this.jMenuItemNuevoRelacionesExistenciasCostos.setVisible((this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos && this.isPermisoNuevoExistenciasCostos));			
			this.jMenuItemNuevoGuardarCambiosExistenciasCostos.setVisible((this.isVisibilidadCeldaNuevoExistenciasCostos && this.isPermisoNuevoExistenciasCostos && this.isPermisoGuardarCambiosExistenciasCostos));									
			
			if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
			this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemModificarExistenciasCostos.setVisible((this.isVisibilidadCeldaModificarExistenciasCostos && this.isPermisoActualizarExistenciasCostos));	
			this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemActualizarExistenciasCostos.setVisible((this.isVisibilidadCeldaActualizarExistenciasCostos && this.isPermisoActualizarExistenciasCostos));	
			this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemEliminarExistenciasCostos.setVisible((this.isVisibilidadCeldaEliminarExistenciasCostos && this.isPermisoEliminarExistenciasCostos));
			this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemCancelarExistenciasCostos.setVisible(this.isVisibilidadCeldaCancelarExistenciasCostos);				
			}
			
			this.jMenuItemGuardarCambiosExistenciasCostos.setVisible((this.isVisibilidadCeldaGuardarExistenciasCostos && this.isPermisoGuardarCambiosExistenciasCostos));						
			this.jMenuItemGuardarCambiosTablaExistenciasCostos.setVisible((this.isVisibilidadCeldaGuardarCambiosExistenciasCostos && this.isPermisoGuardarCambiosExistenciasCostos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoExistenciasCostos=this.jButtonNuevoExistenciasCostos.isVisible();
			this.isVisibilidadCeldaDuplicarExistenciasCostos=this.jButtonDuplicarExistenciasCostos.isVisible();
			this.isVisibilidadCeldaCopiarExistenciasCostos=this.jButtonCopiarExistenciasCostos.isVisible();
			this.isVisibilidadCeldaVerFormExistenciasCostos=this.jButtonVerFormExistenciasCostos.isVisible();
			
			this.isVisibilidadCeldaOrdenExistenciasCostos=this.jButtonAbrirOrderByExistenciasCostos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos=this.jButtonNuevoRelacionesExistenciasCostos.isVisible();
			this.isVisibilidadCeldaModificarExistenciasCostos=this.jButtonModificarExistenciasCostos.isVisible();
			
			if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
			this.isVisibilidadCeldaActualizarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jButtonActualizarExistenciasCostos.isVisible();
			this.isVisibilidadCeldaEliminarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jButtonEliminarExistenciasCostos.isVisible();
			this.isVisibilidadCeldaCancelarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jButtonCancelarExistenciasCostos.isVisible();
			this.isVisibilidadCeldaGuardarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jButtonGuardarCambiosExistenciasCostos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosExistenciasCostos=this.jButtonGuardarCambiosTablaExistenciasCostos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoExistenciasCostos=this.jButtonNuevoToolBarExistenciasCostos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos=this.jButtonNuevoRelacionesToolBarExistenciasCostos.isVisible();
			
			if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
			this.isVisibilidadCeldaModificarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jButtonModificarToolBarExistenciasCostos.isVisible();
			this.isVisibilidadCeldaActualizarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jButtonActualizarToolBarExistenciasCostos.isVisible();
			this.isVisibilidadCeldaEliminarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jButtonEliminarToolBarExistenciasCostos.isVisible();
			this.isVisibilidadCeldaCancelarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jButtonCancelarToolBarExistenciasCostos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarExistenciasCostos=this.jButtonGuardarCambiosToolBarExistenciasCostos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosExistenciasCostos=this.jButtonGuardarCambiosTablaToolBarExistenciasCostos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoExistenciasCostos=this.jMenuItemNuevoExistenciasCostos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos=this.jMenuItemNuevoRelacionesExistenciasCostos.isVisible();
			
			if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
			this.isVisibilidadCeldaModificarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemModificarExistenciasCostos.isVisible();
			this.isVisibilidadCeldaActualizarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemActualizarExistenciasCostos.isVisible();
			this.isVisibilidadCeldaEliminarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemEliminarExistenciasCostos.isVisible();
			this.isVisibilidadCeldaCancelarExistenciasCostos=this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemCancelarExistenciasCostos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarExistenciasCostos=this.jMenuItemGuardarCambiosExistenciasCostos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosExistenciasCostos=this.jMenuItemGuardarCambiosTablaExistenciasCostos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesExistenciasCostos(Boolean esInicializar) {
		if(ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.existenciascostosSessionBean.getConGuardarRelaciones()) {
				//if(this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesExistenciasCostos();
			}
			
			this.inicializarActualizarBindingBotonesManualExistenciasCostos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualExistenciasCostos() {
		this.jButtonNuevoExistenciasCostos.setVisible(this.isPermisoNuevoExistenciasCostos);			
		this.jButtonDuplicarExistenciasCostos.setVisible(this.isPermisoDuplicarExistenciasCostos);			
		this.jButtonCopiarExistenciasCostos.setVisible(this.isPermisoCopiarExistenciasCostos);			
		this.jButtonVerFormExistenciasCostos.setVisible(this.isPermisoVerFormExistenciasCostos);			
		
		this.jButtonAbrirOrderByExistenciasCostos.setVisible(this.isPermisoOrdenExistenciasCostos);					
		
		this.jButtonNuevoRelacionesExistenciasCostos.setVisible(this.isPermisoNuevoExistenciasCostos);			
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonModificarExistenciasCostos.setVisible(this.isPermisoActualizarExistenciasCostos);	
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonActualizarExistenciasCostos.setVisible(this.isPermisoActualizarExistenciasCostos);	
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonEliminarExistenciasCostos.setVisible(this.isPermisoEliminarExistenciasCostos);
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonCancelarExistenciasCostos.setVisible(this.isVisibilidadCeldaCancelarExistenciasCostos);						
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonGuardarCambiosExistenciasCostos.setVisible(this.isPermisoGuardarCambiosExistenciasCostos);							
		}
		
		this.jButtonGuardarCambiosTablaExistenciasCostos.setVisible(this.isPermisoActualizarExistenciasCostos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleExistenciasCostos() {
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonModificarExistenciasCostos.setVisible(this.isPermisoActualizarExistenciasCostos);	
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonActualizarExistenciasCostos.setVisible(this.isPermisoActualizarExistenciasCostos);	
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonEliminarExistenciasCostos.setVisible(this.isPermisoEliminarExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonCancelarExistenciasCostos.setVisible(this.isVisibilidadCeldaCancelarExistenciasCostos);							
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonGuardarCambiosExistenciasCostos.setVisible((this.isVisibilidadCeldaGuardarExistenciasCostos && this.isPermisoGuardarCambiosExistenciasCostos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosExistenciasCostos() {
		if(ExistenciasCostosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualExistenciasCostos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesExistenciasCostos() {
	}
	
	public void jTableDatosExistenciasCostosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarExistenciasCostos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidExistenciasCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciascostos==null) {
						this.existenciascostos = new ExistenciasCostos();
					}

					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
				}

				if(this.existenciascostos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.existenciascostos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaExistenciasCostosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebExistenciasCostos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosExistenciasCostos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosExistenciasCostos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.existenciascostosLogic.getConnexion());

				if(this.existenciascostos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.existenciascostos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderExistenciasCostos=(TitledBorder)this.jScrollPanelDatosExistenciasCostos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderExistenciasCostos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaExistenciasCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciascostos==null) {
						this.existenciascostos = new ExistenciasCostos();
					}

					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
				}

				if(this.existenciascostos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.existenciascostos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaExistenciasCostosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebExistenciasCostos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosExistenciasCostos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosExistenciasCostos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.existenciascostosLogic.getConnexion());

				if(this.existenciascostos.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.existenciascostos.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderExistenciasCostos=(TitledBorder)this.jScrollPanelDatosExistenciasCostos.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderExistenciasCostos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaExistenciasCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciascostos==null) {
						this.existenciascostos = new ExistenciasCostos();
					}

					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
				}

				if(this.existenciascostos.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.existenciascostos.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoExistenciasCostosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebExistenciasCostos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosExistenciasCostos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosExistenciasCostos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.existenciascostosLogic.getConnexion());

				if(this.existenciascostos.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.existenciascostos.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderExistenciasCostos=(TitledBorder)this.jScrollPanelDatosExistenciasCostos.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderExistenciasCostos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoExistenciasCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciascostos==null) {
						this.existenciascostos = new ExistenciasCostos();
					}

					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
				}

				if(this.existenciascostos.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.existenciascostos.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaExistenciasCostosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebExistenciasCostos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosExistenciasCostos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosExistenciasCostos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.existenciascostosLogic.getConnexion());

				if(this.existenciascostos.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.existenciascostos.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderExistenciasCostos=(TitledBorder)this.jScrollPanelDatosExistenciasCostos.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderExistenciasCostos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaExistenciasCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciascostos==null) {
						this.existenciascostos = new ExistenciasCostos();
					}

					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
				}

				if(this.existenciascostos.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.existenciascostos.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaExistenciasCostosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebExistenciasCostos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosExistenciasCostos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosExistenciasCostos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.existenciascostosLogic.getConnexion());

				if(this.existenciascostos.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.existenciascostos.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderExistenciasCostos=(TitledBorder)this.jScrollPanelDatosExistenciasCostos.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderExistenciasCostos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaExistenciasCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciascostos==null) {
						this.existenciascostos = new ExistenciasCostos();
					}

					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
				}

				if(this.existenciascostos.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.existenciascostos.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaExistenciasCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciascostos==null) {
						this.existenciascostos = new ExistenciasCostos();
					}

					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
				}

				if(this.existenciascostos.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.existenciascostos.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoExistenciasCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciascostos==null) {
						this.existenciascostos = new ExistenciasCostos();
					}

					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
				}

				if(this.existenciascostos.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.existenciascostos.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadExistenciasCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciascostos==null) {
						this.existenciascostos = new ExistenciasCostos();
					}

					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
				}

				if(this.existenciascostos.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.existenciascostos.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_lineaExistenciasCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciascostos==null) {
						this.existenciascostos = new ExistenciasCostos();
					}

					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
				}

				if(this.existenciascostos.getnombre_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea like '%"+this.existenciascostos.getnombre_linea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_grupoExistenciasCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciascostos==null) {
						this.existenciascostos = new ExistenciasCostos();
					}

					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
				}

				if(this.existenciascostos.getnombre_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_grupo like '%"+this.existenciascostos.getnombre_linea_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_categoriaExistenciasCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciascostos==null) {
						this.existenciascostos = new ExistenciasCostos();
					}

					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
				}

				if(this.existenciascostos.getnombre_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_categoria like '%"+this.existenciascostos.getnombre_linea_categoria()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_marcaExistenciasCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciascostos==null) {
						this.existenciascostos = new ExistenciasCostos();
					}

					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
				}

				if(this.existenciascostos.getnombre_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_marca like '%"+this.existenciascostos.getnombre_linea_marca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoExistenciasCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciascostos==null) {
						this.existenciascostos = new ExistenciasCostos();
					}

					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
				}

				if(this.existenciascostos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.existenciascostos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalExistenciasCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.getexistenciascostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.existenciascostos==null) {
						this.existenciascostos = new ExistenciasCostos();
					}

					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);
				}

				if(this.existenciascostos.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.existenciascostos.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingExistenciasCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaExistenciasCostosExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingExistenciasCostos(false,false);

			this.getExistenciasCostossBusquedaExistenciasCostos();

			this.inicializarActualizarBindingExistenciasCostos(false);

			//if(ExistenciasCostosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingExistenciasCostos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingExistenciasCostos(false,false);

			this.getExistenciasCostossFK_IdEmpresa();

			this.inicializarActualizarBindingExistenciasCostos(false);

			//if(ExistenciasCostosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingExistenciasCostos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingExistenciasCostos(false,false);

			this.getExistenciasCostossFK_IdLinea();

			this.inicializarActualizarBindingExistenciasCostos(false);

			//if(ExistenciasCostosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingExistenciasCostos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingExistenciasCostos(false,false);

			this.getExistenciasCostossFK_IdLineaCategoria();

			this.inicializarActualizarBindingExistenciasCostos(false);

			//if(ExistenciasCostosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingExistenciasCostos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingExistenciasCostos(false,false);

			this.getExistenciasCostossFK_IdLineaGrupo();

			this.inicializarActualizarBindingExistenciasCostos(false);

			//if(ExistenciasCostosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingExistenciasCostos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaExistenciasCostosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingExistenciasCostos(false,false);

			this.getExistenciasCostossFK_IdLineaMarca();

			this.inicializarActualizarBindingExistenciasCostos(false);

			//if(ExistenciasCostosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingExistenciasCostos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.existenciascostosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameExistenciasCostos() {
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
			this.jInternalFrameDetalleFormExistenciasCostos.setVisible(false);	    			
			this.jInternalFrameDetalleFormExistenciasCostos.dispose();
			this.jInternalFrameDetalleFormExistenciasCostos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoExistenciasCostos!=null) {
			this.jInternalFrameReporteDinamicoExistenciasCostos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoExistenciasCostos.dispose();
			this.jInternalFrameReporteDinamicoExistenciasCostos=null;
		}
		
		if(this.jInternalFrameImportacionExistenciasCostos!=null) {
			this.jInternalFrameImportacionExistenciasCostos.setVisible(false);	    			
			this.jInternalFrameImportacionExistenciasCostos.dispose();
			this.jInternalFrameImportacionExistenciasCostos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessExistenciasCostos();
			
			ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
			
			
			if(sTipo.equals("NuevoExistenciasCostos")) {
				jButtonNuevoExistenciasCostosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarExistenciasCostos")) {
				jButtonDuplicarExistenciasCostosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarExistenciasCostos")) {
				jButtonCopiarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("VerFormExistenciasCostos")) {
				jButtonVerFormExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarExistenciasCostos")) {
				jButtonNuevoExistenciasCostosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarExistenciasCostos")) {
				jButtonDuplicarExistenciasCostosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoExistenciasCostos")) {
				jButtonNuevoExistenciasCostosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarExistenciasCostos")) {
				jButtonDuplicarExistenciasCostosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesExistenciasCostos")) {
				jButtonNuevoExistenciasCostosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarExistenciasCostos")) {
				jButtonNuevoExistenciasCostosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesExistenciasCostos")) {
				jButtonNuevoExistenciasCostosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarExistenciasCostos")) {
				jButtonModificarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarExistenciasCostos")) {
				jButtonModificarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarExistenciasCostos")) {
				jButtonModificarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarExistenciasCostos")) {
				jButtonActualizarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarExistenciasCostos")) {
				jButtonActualizarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarExistenciasCostos")) {
				jButtonActualizarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("EliminarExistenciasCostos")) {
				jButtonEliminarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarExistenciasCostos")) {
				jButtonEliminarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarExistenciasCostos")) {
				jButtonEliminarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("CancelarExistenciasCostos")) {
				jButtonCancelarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarExistenciasCostos")) {
				jButtonCancelarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarExistenciasCostos")) {
				jButtonCancelarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("CerrarExistenciasCostos")) {
				jButtonCerrarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarExistenciasCostos")) {
				jButtonCerrarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarExistenciasCostos")) {
				jButtonCerrarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarExistenciasCostos")) {
				jButtonMostrarOcultarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarExistenciasCostos")) {
				jButtonCancelarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosExistenciasCostos")) {
				jButtonGuardarCambiosExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarExistenciasCostos")) {
				jButtonGuardarCambiosExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarExistenciasCostos")) {
				jButtonCopiarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarExistenciasCostos")) {
				jButtonVerFormExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosExistenciasCostos")) {
				jButtonGuardarCambiosExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarExistenciasCostos")) {
				jButtonCopiarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormExistenciasCostos")) {
				jButtonVerFormExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaExistenciasCostos")) {
				jButtonGuardarCambiosExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarExistenciasCostos")) {
				jButtonGuardarCambiosExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaExistenciasCostos")) {
				jButtonGuardarCambiosExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionExistenciasCostos")) {
				jButtonRecargarInformacionExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarExistenciasCostos")) {
				jButtonRecargarInformacionExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionExistenciasCostos")) {
				jButtonRecargarInformacionExistenciasCostosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresExistenciasCostos")) {
				jButtonAnterioresExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarExistenciasCostos")) {
				jButtonAnterioresExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreExistenciasCostos")) {
				jButtonAnterioresExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesExistenciasCostos")) {
				jButtonSiguientesExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarExistenciasCostos")) {
				jButtonSiguientesExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesExistenciasCostos")) {
				jButtonSiguientesExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByExistenciasCostos") || sTipo.equals("MenuItemDetalleAbrirOrderByExistenciasCostos")) {
				jButtonAbrirOrderByExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarExistenciasCostos") || sTipo.equals("MenuItemDetalleMostrarOcultarExistenciasCostos")) {
				jButtonMostrarOcultarExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosExistenciasCostos")) {
				jButtonNuevoGuardarCambiosExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarExistenciasCostos")) {
				jButtonNuevoGuardarCambiosExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosExistenciasCostos")) {
				jButtonNuevoGuardarCambiosExistenciasCostosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoExistenciasCostos")) {
				jButtonCerrarReporteDinamicoExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoExistenciasCostos")) {
				jButtonGenerarReporteDinamicoExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoExistenciasCostos")) {
				
				jButtonGenerarExcelReporteDinamicoExistenciasCostosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionExistenciasCostos")) {
				jButtonCerrarImportacionExistenciasCostosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionExistenciasCostos")) {
				
				jButtonGenerarImportacionExistenciasCostosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionExistenciasCostos")) {
				
				jButtonAbrirImportacionExistenciasCostosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesExistenciasCostos")) {
				jComboBoxTiposAccionesExistenciasCostosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesExistenciasCostos")) {
				jComboBoxTiposRelacionesExistenciasCostosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioExistenciasCostos")) {
				jComboBoxTiposAccionesExistenciasCostosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarExistenciasCostos")) {
				
				jComboBoxTiposSeleccionarExistenciasCostosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralExistenciasCostos")) {
				jTextFieldValorCampoGeneralExistenciasCostosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByExistenciasCostos")) {
				jButtonAbrirOrderByExistenciasCostosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarExistenciasCostos")) {
				jButtonAbrirOrderByExistenciasCostosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByExistenciasCostos")) {
				jButtonCerrarOrderByExistenciasCostosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idExistenciasCostosBusqueda")) {
				this.jButtonidExistenciasCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaExistenciasCostosUpdate")) {
				this.jButtonid_empresaExistenciasCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaExistenciasCostosBusqueda")) {
				this.jButtonid_empresaExistenciasCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaExistenciasCostosUpdate")) {
				this.jButtonid_lineaExistenciasCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaExistenciasCostosBusqueda")) {
				this.jButtonid_lineaExistenciasCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoExistenciasCostosUpdate")) {
				this.jButtonid_linea_grupoExistenciasCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoExistenciasCostosBusqueda")) {
				this.jButtonid_linea_grupoExistenciasCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaExistenciasCostosUpdate")) {
				this.jButtonid_linea_categoriaExistenciasCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaExistenciasCostosBusqueda")) {
				this.jButtonid_linea_categoriaExistenciasCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaExistenciasCostosUpdate")) {
				this.jButtonid_linea_marcaExistenciasCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaExistenciasCostosBusqueda")) {
				this.jButtonid_linea_marcaExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaExistenciasCostosBusqueda")) {
				this.jButtonfecha_emision_hastaExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoExistenciasCostosBusqueda")) {
				this.jButtonnombre_productoExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadExistenciasCostosBusqueda")) {
				this.jButtonnombre_unidadExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaExistenciasCostosBusqueda")) {
				this.jButtonnombre_lineaExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoExistenciasCostosBusqueda")) {
				this.jButtonnombre_linea_grupoExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaExistenciasCostosBusqueda")) {
				this.jButtonnombre_linea_categoriaExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaExistenciasCostosBusqueda")) {
				this.jButtonnombre_linea_marcaExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoExistenciasCostosBusqueda")) {
				this.jButtoncodigoExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalExistenciasCostosBusqueda")) {
				this.jButtoncosto_totalExistenciasCostosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaExistenciasCostosExistenciasCostos")) {
				this.jButtonBusquedaExistenciasCostosExistenciasCostosActionPerformed(evt);
			}
			
			;
			
			
			ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessExistenciasCostos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaExistenciasCostosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciascostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciascostos);
				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
				
				


				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ExistenciasCostos existenciascostosLocal=null;
			
			if(!this.getEsControlTabla()) {
				existenciascostosLocal=this.existenciascostos;
			} else {
				existenciascostosLocal=this.existenciascostosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciascostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciascostos);
				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
							
				
				


				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaExistenciasCostosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosAnterior =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.existenciascostosAnterior =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
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
			
			ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
			
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
			
			


			
			ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaExistenciasCostosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciascostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciascostos);
				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
								
						
				


				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasCostos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciascostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciascostos);
				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
								
				
				


				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaExistenciasCostosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosAnterior =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.existenciascostosAnterior =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciascostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciascostos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaExistenciasCostosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosAnterior =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.existenciascostosAnterior =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaExistenciasCostosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciascostos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.existenciascostos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciascostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciascostos);
				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
							
				
				


				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasCostos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaExistenciasCostosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciascostosAnterior =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.existenciascostosAnterior =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
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
			
			ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
			
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
			
			


			
			ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaExistenciasCostosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciascostos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.existenciascostos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciascostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciascostos);
				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
								
				
				


				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaExistenciasCostosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosAnterior =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.existenciascostosAnterior =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaExistenciasCostosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciascostos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.existenciascostos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaExistenciasCostosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciascostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciascostos);
				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosExistenciasCostos")) {
					jCheckBoxSeleccionarTodosExistenciasCostosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosExistenciasCostos")) {
					jCheckBoxSeleccionadosExistenciasCostosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarExistenciasCostos")) {
					
				}
				
				


				
				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciascostos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.existenciascostos);
				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
												
				
				


				
				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaExistenciasCostosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.existenciascostosAnterior =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.existenciascostosAnterior =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaExistenciasCostosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciascostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciascostos);
				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
				
				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
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
			
			ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
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
			
			


			
			ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaExistenciasCostosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciascostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciascostos);
				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasCostos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasCostos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.existenciascostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.existenciascostos);
				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
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
				
				


				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ExistenciasCostos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ExistenciasCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaExistenciasCostosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.existenciascostosAnterior =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.existenciascostosAnterior =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarExistenciasCostos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosExistenciasCostosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosExistenciasCostos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.existenciascostos =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.existenciascostos =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.existenciascostos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarExistenciasCostos")) {
				
				}
				
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarExistenciasCostos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosExistenciasCostos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarExistenciasCostos")) {
			
			}
			
			ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessExistenciasCostos();
			
			ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
			
			if(sTipo.equals("NuevoExistenciasCostos")) {
				jButtonNuevoExistenciasCostosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarExistenciasCostos")) {
				jButtonDuplicarExistenciasCostosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarExistenciasCostos")) {
				jButtonCopiarExistenciasCostosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormExistenciasCostos")) {
				jButtonVerFormExistenciasCostosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesExistenciasCostos")) {
				jButtonNuevoExistenciasCostosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarExistenciasCostos")) {
				jButtonModificarExistenciasCostosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarExistenciasCostos")) {
				jButtonActualizarExistenciasCostosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarExistenciasCostos")) {
				jButtonEliminarExistenciasCostosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaExistenciasCostos")) {
				jButtonGuardarCambiosExistenciasCostosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarExistenciasCostos")) {
				jButtonCancelarExistenciasCostosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarExistenciasCostos")) {
				jButtonCerrarExistenciasCostosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosExistenciasCostos")) {
				jButtonGuardarCambiosExistenciasCostosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosExistenciasCostos")) {
				jButtonNuevoGuardarCambiosExistenciasCostosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByExistenciasCostos")) {
				jButtonAbrirOrderByExistenciasCostosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionExistenciasCostos")) {
				jButtonRecargarInformacionExistenciasCostosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresExistenciasCostos")) {
				jButtonAnterioresExistenciasCostosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesExistenciasCostos")) {
				jButtonSiguientesExistenciasCostosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idExistenciasCostosBusqueda")) {
				this.jButtonidExistenciasCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaExistenciasCostosUpdate")) {
				this.jButtonid_empresaExistenciasCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaExistenciasCostosBusqueda")) {
				this.jButtonid_empresaExistenciasCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaExistenciasCostosUpdate")) {
				this.jButtonid_lineaExistenciasCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaExistenciasCostosBusqueda")) {
				this.jButtonid_lineaExistenciasCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoExistenciasCostosUpdate")) {
				this.jButtonid_linea_grupoExistenciasCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoExistenciasCostosBusqueda")) {
				this.jButtonid_linea_grupoExistenciasCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaExistenciasCostosUpdate")) {
				this.jButtonid_linea_categoriaExistenciasCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaExistenciasCostosBusqueda")) {
				this.jButtonid_linea_categoriaExistenciasCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaExistenciasCostosUpdate")) {
				this.jButtonid_linea_marcaExistenciasCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaExistenciasCostosBusqueda")) {
				this.jButtonid_linea_marcaExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaExistenciasCostosBusqueda")) {
				this.jButtonfecha_emision_hastaExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoExistenciasCostosBusqueda")) {
				this.jButtonnombre_productoExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadExistenciasCostosBusqueda")) {
				this.jButtonnombre_unidadExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaExistenciasCostosBusqueda")) {
				this.jButtonnombre_lineaExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoExistenciasCostosBusqueda")) {
				this.jButtonnombre_linea_grupoExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaExistenciasCostosBusqueda")) {
				this.jButtonnombre_linea_categoriaExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaExistenciasCostosBusqueda")) {
				this.jButtonnombre_linea_marcaExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoExistenciasCostosBusqueda")) {
				this.jButtoncodigoExistenciasCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalExistenciasCostosBusqueda")) {
				this.jButtoncosto_totalExistenciasCostosBusquedaActionPerformed(evt);
			}
			
			ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessExistenciasCostos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameExistenciasCostos")) {
				closingInternalFrameExistenciasCostos();
				
			} else if(sTipo.equals("jButtonCancelarExistenciasCostos")) {
				JInternalFrameBase jInternalFrameDetalleFormExistenciasCostos = (JInternalFrameBase)evt.getSource();
	            	
	            ExistenciasCostosBeanSwingJInternalFrame jInternalFrameParent=(ExistenciasCostosBeanSwingJInternalFrame)jInternalFrameDetalleFormExistenciasCostos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarExistenciasCostosActionPerformed(null);
			}
			
			ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.existenciascostos,new Object(),this.existenciascostosParameterGeneral,this.existenciascostosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormExistenciasCostos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormExistenciasCostos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormExistenciasCostos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.existenciascostos)) {
			if(!esControlTabla) {
				if(ExistenciasCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);			
				}
				
				if(this.existenciascostosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualExistenciasCostos(this.existenciascostos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanExistenciasCostos(this.existenciascostosReturnGeneral,this.existenciascostosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.existenciascostosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanExistenciasCostos(classes,this.existenciascostosReturnGeneral,this.existenciascostosBean,false);
					}
						
					if(this.existenciascostosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyExistenciasCostos(this.existenciascostosReturnGeneral.getExistenciasCostos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioExistenciasCostos(this.existenciascostosReturnGeneral.getExistenciasCostos());	
					}
						
					if(this.existenciascostosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioExistenciasCostos(this.existenciascostosReturnGeneral.getExistenciasCostos(),classes);//this.existenciascostosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioExistenciasCostos(this.existenciascostos,classes);//this.existenciascostosBean);									
				}
			
				if(ExistenciasCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualExistenciasCostos(this.existenciascostos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysExistenciasCostos(this.existenciascostos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.existenciascostosAnterior!=null) {
						this.existenciascostos=this.existenciascostosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.existenciascostosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.existenciascostosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.existenciascostosReturnGeneral.getExistenciasCostos(),existenciascostosLogic.getExistenciasCostoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.existenciascostosReturnGeneral.getExistenciasCostos(),this.existenciascostoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosExistenciasCostos.repaint();
				
				//((AbstractTableModel) this.jTableDatosExistenciasCostos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosExistenciasCostos();
			}
		}
	}
	
	public void actualizarVisualTableDatosExistenciasCostos() throws Exception {
		
		ExistenciasCostosModel existenciascostosModel=(ExistenciasCostosModel)this.jTableDatosExistenciasCostos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existenciascostosModel.existenciascostoss=this.existenciascostosLogic.getExistenciasCostoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			existenciascostosModel.existenciascostoss=this.existenciascostoss;
		}
		
		
		((ExistenciasCostosModel) this.jTableDatosExistenciasCostos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaExistenciasCostos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getexistenciascostosAnterior(),this.existenciascostosLogic.getExistenciasCostoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getexistenciascostosAnterior(),this.existenciascostoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosExistenciasCostos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioExistenciasCostos(ExistenciasCostos existenciascostos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
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
										
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.existenciascostos,new Object(),generalEntityParameterGeneral,this.existenciascostosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.existenciascostosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ExistenciasCostosConstantesFunciones.getClassesRelationshipsOfExistenciasCostos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ExistenciasCostosConstantesFunciones.getClassesRelationshipsFromStringsOfExistenciasCostos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormExistenciasCostos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ExistenciasCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.existenciascostos,new Object(),generalEntityParameterGeneral,this.existenciascostosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioExistenciasCostos(ExistenciasCostosBean existenciascostosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanExistenciasCostos(ArrayList<Classe> classes,ExistenciasCostosReturnGeneral existenciascostosReturnGeneral,ExistenciasCostosBean existenciascostosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualExistenciasCostos(ExistenciasCostos existenciascostos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.existenciascostos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormExistenciasCostos = new ExistenciasCostosDetalleFormJInternalFrame(jDesktopPane,this.existenciascostosSessionBean.getConGuardarRelaciones(),this.existenciascostosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.setVisible(false);
		this.jInternalFrameDetalleFormExistenciasCostos.setSelected(false);						
		
		this.jInternalFrameDetalleFormExistenciasCostos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormExistenciasCostos.existenciascostosLogic=this.existenciascostosLogic;
		
		this.cargarCombosFrameForeignKeyExistenciasCostos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleExistenciasCostos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleExistenciasCostos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyExistenciasCostos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyExistenciasCostos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormExistenciasCostos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarExistenciasCostos"));
		
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonModificarExistenciasCostos.addActionListener(new ButtonActionListener(this,"ModificarExistenciasCostos"));

		
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonModificarToolBarExistenciasCostos.addActionListener(new ButtonActionListener(this,"ModificarToolBarExistenciasCostos"));
					
		this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemModificarExistenciasCostos.addActionListener(new ButtonActionListener(this,"MenuItemModificarExistenciasCostos"));		
		
		
		
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonActualizarExistenciasCostos.addActionListener (new ButtonActionListener(this,"ActualizarExistenciasCostos"));
		
		
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonActualizarToolBarExistenciasCostos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarExistenciasCostos"));
						
		this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemActualizarExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarExistenciasCostos"));		
		
		
		
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonEliminarExistenciasCostos.addActionListener (new ButtonActionListener(this,"EliminarExistenciasCostos"));
		
		
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonEliminarToolBarExistenciasCostos.addActionListener (new ButtonActionListener(this,"EliminarToolBarExistenciasCostos"));
								
		this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemEliminarExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarExistenciasCostos"));		
		
		
		
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonCancelarExistenciasCostos.addActionListener (new ButtonActionListener(this,"CancelarExistenciasCostos"));
		
		
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonCancelarToolBarExistenciasCostos.addActionListener (new ButtonActionListener(this,"CancelarToolBarExistenciasCostos"));
					
		this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemCancelarExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarExistenciasCostos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemDetalleCerrarExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarExistenciasCostos"));		
		
		
		
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonGuardarCambiosToolBarExistenciasCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarExistenciasCostos"));
		
		
		
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonGuardarCambiosToolBarExistenciasCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarExistenciasCostos"));
		
		
		
		this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxTiposAccionesFormularioExistenciasCostos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioExistenciasCostos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonidExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"idExistenciasCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_empresaExistenciasCostosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaExistenciasCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_empresaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaExistenciasCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_lineaExistenciasCostosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaExistenciasCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_lineaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaExistenciasCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_grupoExistenciasCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoExistenciasCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_grupoExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoExistenciasCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_categoriaExistenciasCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaExistenciasCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_categoriaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaExistenciasCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_marcaExistenciasCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaExistenciasCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_marcaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonfecha_emision_hastaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_productoExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_unidadExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_lineaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_linea_grupoExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_linea_categoriaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_linea_marcaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtoncodigoExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"codigoExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtoncosto_totalExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalExistenciasCostosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormExistenciasCostos.jTabbedPaneRelacionesExistenciasCostos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesExistenciasCostos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameExistenciasCostos"));
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasCostos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarExistenciasCostos"));
		}
		
		this.jTableDatosExistenciasCostos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarExistenciasCostos"));
		
		this.jTableDatosExistenciasCostos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarExistenciasCostos"));
		
		this.jButtonNuevoExistenciasCostos.addActionListener(new ButtonActionListener(this,"NuevoExistenciasCostos"));
		
		this.jButtonDuplicarExistenciasCostos.addActionListener(new ButtonActionListener(this,"DuplicarExistenciasCostos"));
		
		this.jButtonCopiarExistenciasCostos.addActionListener(new ButtonActionListener(this,"CopiarExistenciasCostos"));
		
		this.jButtonVerFormExistenciasCostos.addActionListener(new ButtonActionListener(this,"VerFormExistenciasCostos"));
		
		
		this.jButtonNuevoToolBarExistenciasCostos.addActionListener(new ButtonActionListener(this,"NuevoToolBarExistenciasCostos"));
			
		this.jButtonDuplicarToolBarExistenciasCostos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarExistenciasCostos"));
			
		this.jMenuItemNuevoExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoExistenciasCostos"));
			
		this.jMenuItemDuplicarExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarExistenciasCostos"));		
		
		
		this.jButtonNuevoRelacionesExistenciasCostos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesExistenciasCostos"));
		
		
		this.jButtonNuevoRelacionesToolBarExistenciasCostos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarExistenciasCostos"));
			
		this.jMenuItemNuevoRelacionesExistenciasCostos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesExistenciasCostos"));		
		
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonModificarExistenciasCostos.addActionListener(new ButtonActionListener(this,"ModificarExistenciasCostos"));
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonModificarToolBarExistenciasCostos.addActionListener(new ButtonActionListener(this,"ModificarToolBarExistenciasCostos"));
			
			this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemModificarExistenciasCostos.addActionListener(new ButtonActionListener(this,"MenuItemModificarExistenciasCostos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonActualizarExistenciasCostos.addActionListener (new ButtonActionListener(this,"ActualizarExistenciasCostos"));
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonActualizarToolBarExistenciasCostos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarExistenciasCostos"));
				
			this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemActualizarExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarExistenciasCostos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonEliminarExistenciasCostos.addActionListener (new ButtonActionListener(this,"EliminarExistenciasCostos"));
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonEliminarToolBarExistenciasCostos.addActionListener (new ButtonActionListener(this,"EliminarToolBarExistenciasCostos"));
						
			this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemEliminarExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarExistenciasCostos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonCancelarExistenciasCostos.addActionListener (new ButtonActionListener(this,"CancelarExistenciasCostos"));
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonCancelarToolBarExistenciasCostos.addActionListener (new ButtonActionListener(this,"CancelarToolBarExistenciasCostos"));
			
			this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemCancelarExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarExistenciasCostos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarExistenciasCostos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarExistenciasCostos"));		
		
		
		this.jButtonCerrarExistenciasCostos.addActionListener (new ButtonActionListener(this,"CerrarExistenciasCostos"));
		
		
		this.jButtonCerrarToolBarExistenciasCostos.addActionListener (new ButtonActionListener(this,"CerrarToolBarExistenciasCostos"));
			
		this.jMenuItemCerrarExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarExistenciasCostos"));
			
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasCostos.jMenuItemDetalleCerrarExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarExistenciasCostos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonGuardarCambiosExistenciasCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosExistenciasCostos"));
		}
		
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasCostos.jButtonGuardarCambiosToolBarExistenciasCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarExistenciasCostos"));
		}
		
		this.jButtonCopiarToolBarExistenciasCostos.addActionListener (new ButtonActionListener(this,"CopiarToolBarExistenciasCostos"));
			
		this.jButtonVerFormToolBarExistenciasCostos.addActionListener (new ButtonActionListener(this,"VerFormToolBarExistenciasCostos"));
		
		this.jMenuItemGuardarCambiosExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosExistenciasCostos"));
			
		this.jMenuItemCopiarExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarExistenciasCostos"));		
		
		this.jMenuItemVerFormExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormExistenciasCostos"));		
		
		
		this.jButtonGuardarCambiosTablaExistenciasCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaExistenciasCostos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarExistenciasCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarExistenciasCostos"));
			
		this.jMenuItemGuardarCambiosTablaExistenciasCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaExistenciasCostos"));		
		
		
		
		this.jButtonRecargarInformacionExistenciasCostos.addActionListener (new ButtonActionListener(this,"RecargarInformacionExistenciasCostos"));
					
		this.jButtonRecargarInformacionToolBarExistenciasCostos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarExistenciasCostos"));
		
		this.jMenuItemRecargarInformacionExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionExistenciasCostos"));		
		
		
		
		this.jButtonAnterioresExistenciasCostos.addActionListener (new ButtonActionListener(this,"AnterioresExistenciasCostos"));
		
		
		this.jButtonAnterioresToolBarExistenciasCostos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarExistenciasCostos"));
		
		this.jMenuItemAnterioresExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresExistenciasCostos"));		
		
		
		this.jButtonSiguientesExistenciasCostos.addActionListener (new ButtonActionListener(this,"SiguientesExistenciasCostos"));
		
		
		this.jButtonSiguientesToolBarExistenciasCostos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarExistenciasCostos"));
			
		this.jMenuItemSiguientesExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesExistenciasCostos"));
			
		this.jMenuItemAbrirOrderByExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByExistenciasCostos"));
			
		this.jMenuItemMostrarOcultarExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarExistenciasCostos"));
			
		this.jMenuItemDetalleAbrirOrderByExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByExistenciasCostos"));
			
		this.jMenuItemDetalleMostarOcultarExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarExistenciasCostos"));		
		
		
		this.jButtonNuevoGuardarCambiosExistenciasCostos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosExistenciasCostos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarExistenciasCostos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarExistenciasCostos"));
			
		this.jMenuItemNuevoGuardarCambiosExistenciasCostos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosExistenciasCostos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosExistenciasCostos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosExistenciasCostos"));

		this.jCheckBoxSeleccionadosExistenciasCostos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosExistenciasCostos"));
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxTiposAccionesFormularioExistenciasCostos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioExistenciasCostos"));
		}
		
		
		this.jComboBoxTiposRelacionesExistenciasCostos.addActionListener (new ButtonActionListener(this,"TiposRelacionesExistenciasCostos"));
			
		this.jComboBoxTiposAccionesExistenciasCostos.addActionListener (new ButtonActionListener(this,"TiposAccionesExistenciasCostos"));
					
		this.jComboBoxTiposSeleccionarExistenciasCostos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarExistenciasCostos"));
			
		this.jTextFieldValorCampoGeneralExistenciasCostos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralExistenciasCostos"));		
		
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonidExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"idExistenciasCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_empresaExistenciasCostosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaExistenciasCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_empresaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaExistenciasCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_lineaExistenciasCostosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaExistenciasCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_lineaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaExistenciasCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_grupoExistenciasCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoExistenciasCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_grupoExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoExistenciasCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_categoriaExistenciasCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaExistenciasCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_categoriaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaExistenciasCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_marcaExistenciasCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaExistenciasCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_marcaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonfecha_emision_hastaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_productoExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_unidadExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_lineaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_linea_grupoExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_linea_categoriaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_linea_marcaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtoncodigoExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"codigoExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtoncosto_totalExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalExistenciasCostosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaExistenciasCostosExistenciasCostos.addActionListener(new ButtonActionListener(this,"BusquedaExistenciasCostosExistenciasCostos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoExistenciasCostos!=null) {
				this.jInternalFrameReporteDinamicoExistenciasCostos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoExistenciasCostos"));
				this.jInternalFrameReporteDinamicoExistenciasCostos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoExistenciasCostos"));
				this.jInternalFrameReporteDinamicoExistenciasCostos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoExistenciasCostos"));
			}
			
			//this.jButtonCerrarReporteDinamicoExistenciasCostos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoExistenciasCostos"));				
			//this.jButtonGenerarReporteDinamicoExistenciasCostos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoExistenciasCostos"));
			//this.jButtonGenerarExcelReporteDinamicoExistenciasCostos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoExistenciasCostos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionExistenciasCostos!=null) {
				this.jInternalFrameImportacionExistenciasCostos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionExistenciasCostos"));
				this.jInternalFrameImportacionExistenciasCostos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionExistenciasCostos"));
				this.jInternalFrameImportacionExistenciasCostos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionExistenciasCostos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByExistenciasCostos.addActionListener (new ButtonActionListener(this,"AbrirOrderByExistenciasCostos"));
			
			this.jButtonAbrirOrderByToolBarExistenciasCostos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarExistenciasCostos"));			
			
			if(this.jInternalFrameOrderByExistenciasCostos!=null) {
				this.jInternalFrameOrderByExistenciasCostos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByExistenciasCostos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormExistenciasCostos.jTabbedPaneRelacionesExistenciasCostos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesExistenciasCostos"));
		
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
            		closingInternalFrameExistenciasCostos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormExistenciasCostos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormExistenciasCostos = (JInternalFrameBase)event.getSource();
	            	
	            ExistenciasCostosBeanSwingJInternalFrame jInternalFrameParent=(ExistenciasCostosBeanSwingJInternalFrame)jInternalFrameDetalleFormExistenciasCostos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarExistenciasCostosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosExistenciasCostos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosExistenciasCostosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosExistenciasCostos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosExistenciasCostos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoExistenciasCostosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoExistenciasCostosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoExistenciasCostosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoExistenciasCostos";
		inputMap = this.jButtonNuevoExistenciasCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoExistenciasCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoExistenciasCostosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoExistenciasCostosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoExistenciasCostosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoExistenciasCostosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesExistenciasCostos";
		inputMap = this.jButtonNuevoRelacionesExistenciasCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesExistenciasCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoExistenciasCostosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarExistenciasCostos";
		inputMap = this.jButtonModificarExistenciasCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarExistenciasCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarExistenciasCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarExistenciasCostos";
		inputMap = this.jButtonActualizarExistenciasCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarExistenciasCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarExistenciasCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarExistenciasCostos";
		inputMap = this.jButtonEliminarExistenciasCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarExistenciasCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarExistenciasCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarExistenciasCostos";
		inputMap = this.jButtonCancelarExistenciasCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarExistenciasCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarExistenciasCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarExistenciasCostos";
		inputMap = this.jButtonCerrarExistenciasCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarExistenciasCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarExistenciasCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonGuardarCambiosExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosExistenciasCostos";
		inputMap = this.jInternalFrameDetalleFormExistenciasCostos.jButtonGuardarCambiosExistenciasCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonGuardarCambiosExistenciasCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosExistenciasCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosExistenciasCostos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosExistenciasCostosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesExistenciasCostos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesExistenciasCostosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarExistenciasCostos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarExistenciasCostosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralExistenciasCostos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralExistenciasCostosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonidExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"idExistenciasCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_empresaExistenciasCostosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaExistenciasCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_empresaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaExistenciasCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_lineaExistenciasCostosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaExistenciasCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_lineaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaExistenciasCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_grupoExistenciasCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoExistenciasCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_grupoExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoExistenciasCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_categoriaExistenciasCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaExistenciasCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_categoriaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaExistenciasCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_marcaExistenciasCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaExistenciasCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonid_linea_marcaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonfecha_emision_hastaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_productoExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_unidadExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_lineaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_linea_grupoExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_linea_categoriaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtonnombre_linea_marcaExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtoncodigoExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"codigoExistenciasCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormExistenciasCostos.jButtoncosto_totalExistenciasCostosBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalExistenciasCostosBusqueda"));
		
		
		this.jButtonBusquedaExistenciasCostosExistenciasCostos.addActionListener(new ButtonActionListener(this,"BusquedaExistenciasCostosExistenciasCostos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionExistenciasCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionExistenciasCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarExistenciasCostosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarExistenciasCostos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosExistenciasCostos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ExistenciasCostos existenciascostosAux:this.existenciascostosLogic.getExistenciasCostoss()) {
					existenciascostosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ExistenciasCostos existenciascostosAux:existenciascostoss) {
					existenciascostosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosExistenciasCostosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingExistenciasCostos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ExistenciasCostos existenciascostosAux:this.existenciascostosLogic.getExistenciasCostoss()) {
						existenciascostosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ExistenciasCostos existenciascostosAux:existenciascostoss) {
						existenciascostosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ExistenciasCostos existenciascostosAux:this.existenciascostosLogic.getExistenciasCostoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ExistenciasCostos existenciascostosAux:existenciascostoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaExistenciasCostos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosExistenciasCostos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosExistenciasCostos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosExistenciasCostos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosExistenciasCostosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingExistenciasCostos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosExistenciasCostos.getSelectedRows();
			
			ExistenciasCostos existenciascostosLocal=new ExistenciasCostos();
			
			//this.seleccionarTodosExistenciasCostos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					existenciascostosLocal =(ExistenciasCostos) this.existenciascostosLogic.getExistenciasCostoss().toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					existenciascostosLocal =(ExistenciasCostos) this.existenciascostoss.toArray()[this.jTableDatosExistenciasCostos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				existenciascostosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ExistenciasCostos existenciascostosAux:this.existenciascostosLogic.getExistenciasCostoss()) {
						existenciascostosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ExistenciasCostos existenciascostosAux:existenciascostoss) {
						existenciascostosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaExistenciasCostos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosExistenciasCostos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosExistenciasCostos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosExistenciasCostos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualExistenciasCostosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarExistenciasCostosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralExistenciasCostosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingExistenciasCostos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralExistenciasCostos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ExistenciasCostos existenciascostosAux:this.existenciascostosLogic.getExistenciasCostoss()) {
				
						if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							existenciascostosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							existenciascostosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							existenciascostosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							existenciascostosAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							existenciascostosAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							existenciascostosAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							existenciascostosAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							existenciascostosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							existenciascostosAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ExistenciasCostos existenciascostosAux:existenciascostoss) {
					
						if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							existenciascostosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							existenciascostosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							existenciascostosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							existenciascostosAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							existenciascostosAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							existenciascostosAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							existenciascostosAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							existenciascostosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							existenciascostosAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaExistenciasCostos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesExistenciasCostosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingExistenciasCostos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioExistenciasCostos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesExistenciasCostos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxTiposAccionesFormularioExistenciasCostos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteExistenciasCostos) {				
					conSplash=true;//false;										
					
					//this.startProcessExistenciasCostos(conSplash);
				
					this.generarReporteExistenciasCostossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesExistenciasCostos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxTiposAccionesFormularioExistenciasCostos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoExistenciasCostossSeleccionados();
				//this.jComboBoxTiposAccionesExistenciasCostos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoExistenciasCostossSeleccionados(false);
				//this.jComboBoxTiposAccionesExistenciasCostos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoExistenciasCostossSeleccionados(true);
				//this.jComboBoxTiposAccionesExistenciasCostos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessExistenciasCostos();
				
				this.exportarExistenciasCostossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesExistenciasCostos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxTiposAccionesFormularioExistenciasCostos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionExistenciasCostoss();
				//this.importarExistenciasCostoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesExistenciasCostos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxTiposAccionesFormularioExistenciasCostos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessExistenciasCostos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelExistenciasCostossSeleccionados();
				//this.jComboBoxTiposAccionesExistenciasCostos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Existencias Costos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessExistenciasCostos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoExistenciasCostos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyExistenciasCostos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Existencias Costos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesExistenciasCostos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxTiposAccionesFormularioExistenciasCostos.setSelectedIndex(0);					
				}	
			} 			
			else if(ExistenciasCostosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteExistenciasCostos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessExistenciasCostos(conSplash);
					
						//this.actualizarParametrosGeneralExistenciasCostos();
						
						this.generarReporteProcesoAccionExistenciasCostossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesExistenciasCostos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxTiposAccionesFormularioExistenciasCostos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ExistenciasCostosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Existencias CostosES SELECCIONADOS?", "MANTENIMIENTO DE Existencias Costos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessExistenciasCostos();
				
						this.actualizarParametrosGeneralExistenciasCostos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.existenciascostosReturnGeneral=existenciascostosLogic.procesarAccionExistenciasCostossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.existenciascostosLogic.getExistenciasCostoss(),this.existenciascostosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarExistenciasCostosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesExistenciasCostos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxTiposAccionesFormularioExistenciasCostos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralExistenciasCostos();
					
					ExistenciasCostosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarExistenciasCostosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesExistenciasCostos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxTiposAccionesFormularioExistenciasCostos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessExistenciasCostos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesExistenciasCostosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessExistenciasCostos();
			
			if(this.jInternalFrameDetalleFormExistenciasCostos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ExistenciasCostos> existenciascostossSeleccionados=new ArrayList<ExistenciasCostos>();		
			ExistenciasCostos existenciascostos=new ExistenciasCostos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingExistenciasCostos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesExistenciasCostos.getSelectedItem();
			
			
			
			
			existenciascostossSeleccionados=this.getExistenciasCostossSeleccionados(true);
			//this.sTipoAccion;
			
			if(existenciascostossSeleccionados.size()==1) {
				for(ExistenciasCostos existenciascostosAux:existenciascostossSeleccionados) {
					existenciascostos=existenciascostosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessExistenciasCostos();
			
      		//this.finishProcessExistenciasCostos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarExistenciasCostosReturnGeneral() throws Exception {
		if(this.existenciascostosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.existenciascostosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.existenciascostosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.existenciascostosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.existenciascostosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.existenciascostosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingExistenciasCostos(false);
		}
		
		if(this.existenciascostosReturnGeneral.getConRetornoLista() || this.existenciascostosReturnGeneral.getConRetornoObjeto()) {
			if(this.existenciascostosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.existenciascostosLogic.setExistenciasCostoss(this.existenciascostosReturnGeneral.getExistenciasCostoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingExistenciasCostos(false);
		}
	}
	
	public void actualizarParametrosGeneralExistenciasCostos() throws Exception {
		
		
	}
	
	public ArrayList<ExistenciasCostos> getExistenciasCostossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ExistenciasCostos> existenciascostossSeleccionados=new ArrayList<ExistenciasCostos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioExistenciasCostos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ExistenciasCostos existenciascostosAux:existenciascostosLogic.getExistenciasCostoss()) {
					if(existenciascostosAux.getIsSelected()) {
						existenciascostossSeleccionados.add(existenciascostosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ExistenciasCostos existenciascostosAux:this.existenciascostoss) {
					if(existenciascostosAux.getIsSelected()) {
						existenciascostossSeleccionados.add(existenciascostosAux);				
					}
				}
			}
			
			if(existenciascostossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						existenciascostossSeleccionados.addAll(this.existenciascostosLogic.getExistenciasCostoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						existenciascostossSeleccionados.addAll(this.existenciascostoss);				
					}
				}
			}
		} else {
			existenciascostossSeleccionados.add(this.existenciascostos);
		}
		
		return existenciascostossSeleccionados;
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
	
	public void generarReporteExistenciasCostossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalExistenciasCostossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoExistenciasCostossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoExistenciasCostossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoExistenciasCostossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Existencias Costos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesExistenciasCostossSeleccionados() throws Exception {
		ArrayList<ExistenciasCostos> existenciascostossSeleccionados=new ArrayList<ExistenciasCostos>();		
		
		existenciascostossSeleccionados=this.getExistenciasCostossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteExistenciasCostoss("Todos",existenciascostossSeleccionados);
		
	}	
	
	public void generarReporteNormalExistenciasCostossSeleccionados() throws Exception {
		ArrayList<ExistenciasCostos> existenciascostossSeleccionados=new ArrayList<ExistenciasCostos>();		
		
		existenciascostossSeleccionados=this.getExistenciasCostossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteExistenciasCostoss("Todos",existenciascostossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionExistenciasCostossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ExistenciasCostos> existenciascostossSeleccionados=new ArrayList<ExistenciasCostos>();
		
		existenciascostossSeleccionados=this.getExistenciasCostossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteExistenciasCostoss("Todos",existenciascostossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoExistenciasCostossSeleccionados() throws Exception {
		ArrayList<ExistenciasCostos> existenciascostossSeleccionados=new ArrayList<ExistenciasCostos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoExistenciasCostos();
		
		
		existenciascostossSeleccionados=this.getExistenciasCostossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoExistenciasCostos();
		
		
		//this.generarReporteExistenciasCostoss("Todos",existenciascostossSeleccionados ,existenciascostosImplementable,existenciascostosImplementableHome);
	}
	
	public void mostrarImportacionExistenciasCostoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionExistenciasCostos();
		
		this.abrirFrameImportacionExistenciasCostos();		
		
			
		//this.generarReporteExistenciasCostoss("Todos",existenciascostossSeleccionados ,existenciascostosImplementable,existenciascostosImplementableHome);
	}
	
	public void importarExistenciasCostoss() throws Exception {		
	
	}
	
	public void exportarExistenciasCostossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelExistenciasCostossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoExistenciasCostossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlExistenciasCostossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Existencias Costos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoExistenciasCostossSeleccionados() throws Exception {
		ArrayList<ExistenciasCostos> existenciascostossSeleccionados=new ArrayList<ExistenciasCostos>();		
		
		existenciascostossSeleccionados=this.getExistenciasCostossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"existenciascostos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarExistenciasCostos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ExistenciasCostos existenciascostosAux:existenciascostossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarExistenciasCostos(existenciascostosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//existenciascostosAux.setsDetalleGeneralEntityReporte(existenciascostosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.existenciascostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Existencias Costos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarExistenciasCostos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ExistenciasCostosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasCostosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasCostosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasCostosConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasCostosConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasCostosConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasCostosConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasCostosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ExistenciasCostosConstantesFunciones.LABEL_COSTOTOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarExistenciasCostos(ExistenciasCostos existenciascostos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=existenciascostos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciascostos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciascostos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciascostos.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciascostos.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciascostos.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciascostos.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciascostos.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciascostos.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciascostos.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciascostos.getnombre_linea();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciascostos.getnombre_linea_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciascostos.getnombre_linea_categoria();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciascostos.getnombre_linea_marca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciascostos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=existenciascostos.getcosto_total().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelExistenciasCostossSeleccionados() throws Exception {
		ArrayList<ExistenciasCostos> existenciascostossSeleccionados=new ArrayList<ExistenciasCostos>();		
		
		existenciascostossSeleccionados=this.getExistenciasCostossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"existenciascostos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ExistenciasCostoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelExistenciasCostos(row);				
				iRow++;
			}				
			
			for(ExistenciasCostos existenciascostosAux:existenciascostossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelExistenciasCostos(existenciascostosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.existenciascostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Existencias Costos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlExistenciasCostossSeleccionados() throws Exception {
		ArrayList<ExistenciasCostos> existenciascostossSeleccionados=new ArrayList<ExistenciasCostos>();		
		
		existenciascostossSeleccionados=this.getExistenciasCostossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"existenciascostos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("existenciascostoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("existenciascostos");
			//elementRoot.appendChild(element);
		
			for(ExistenciasCostos existenciascostosAux:existenciascostossSeleccionados) {
				element = document.createElement("existenciascostos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlExistenciasCostos(existenciascostosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.existenciascostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Existencias Costos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelExistenciasCostos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ExistenciasCostosConstantesFunciones.LABEL_COSTOTOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelExistenciasCostos(ExistenciasCostos existenciascostos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(existenciascostos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciascostos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciascostos.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciascostos.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciascostos.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciascostos.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciascostos.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciascostos.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciascostos.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciascostos.getnombre_linea());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciascostos.getnombre_linea_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciascostos.getnombre_linea_categoria());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciascostos.getnombre_linea_marca());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciascostos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(existenciascostos.getcosto_total());				
	}
	
	public void setFilaDatosExportarXmlExistenciasCostos(ExistenciasCostos existenciascostos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ExistenciasCostosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(existenciascostos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ExistenciasCostosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(existenciascostos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ExistenciasCostosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(existenciascostos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementlinea_descripcion = document.createElement(ExistenciasCostosConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(existenciascostos.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ExistenciasCostosConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(existenciascostos.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ExistenciasCostosConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(existenciascostos.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ExistenciasCostosConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(existenciascostos.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementfecha_emision_hasta = document.createElement(ExistenciasCostosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(existenciascostos.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_producto = document.createElement(ExistenciasCostosConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(existenciascostos.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementnombre_unidad = document.createElement(ExistenciasCostosConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(existenciascostos.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementnombre_linea = document.createElement(ExistenciasCostosConstantesFunciones.NOMBRELINEA);
		elementnombre_linea.appendChild(document.createTextNode(existenciascostos.getnombre_linea().trim()));
		element.appendChild(elementnombre_linea);

		Element elementnombre_linea_grupo = document.createElement(ExistenciasCostosConstantesFunciones.NOMBRELINEAGRUPO);
		elementnombre_linea_grupo.appendChild(document.createTextNode(existenciascostos.getnombre_linea_grupo().trim()));
		element.appendChild(elementnombre_linea_grupo);

		Element elementnombre_linea_categoria = document.createElement(ExistenciasCostosConstantesFunciones.NOMBRELINEACATEGORIA);
		elementnombre_linea_categoria.appendChild(document.createTextNode(existenciascostos.getnombre_linea_categoria().trim()));
		element.appendChild(elementnombre_linea_categoria);

		Element elementnombre_linea_marca = document.createElement(ExistenciasCostosConstantesFunciones.NOMBRELINEAMARCA);
		elementnombre_linea_marca.appendChild(document.createTextNode(existenciascostos.getnombre_linea_marca().trim()));
		element.appendChild(elementnombre_linea_marca);

		Element elementcodigo = document.createElement(ExistenciasCostosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(existenciascostos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementcosto_total = document.createElement(ExistenciasCostosConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(existenciascostos.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);
	}
	
	public void generarReporteGroupGenericoExistenciasCostossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ExistenciasCostos> existenciascostossSeleccionados=new ArrayList<ExistenciasCostos>();
		
		existenciascostossSeleccionados=this.getExistenciasCostossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoExistenciasCostos(existenciascostossSeleccionados);
		
		this.generarReporteExistenciasCostoss("Todos",existenciascostossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoExistenciasCostos(ArrayList<ExistenciasCostos> existenciascostossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ExistenciasCostos existenciascostosAux:existenciascostossSeleccionados) {
				existenciascostosAux.setsDetalleGeneralEntityReporte(existenciascostosAux.toString());
			
				if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					existenciascostosAux.setsDescripcionGeneralEntityReporte1(existenciascostosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					existenciascostosAux.setsDescripcionGeneralEntityReporte1(existenciascostosAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					existenciascostosAux.setsDescripcionGeneralEntityReporte1(existenciascostosAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					existenciascostosAux.setsDescripcionGeneralEntityReporte1(existenciascostosAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					existenciascostosAux.setsDescripcionGeneralEntityReporte1(existenciascostosAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					existenciascostosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(existenciascostosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					existenciascostosAux.setsDescripcionGeneralEntityReporte1(existenciascostosAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					existenciascostosAux.setsDescripcionGeneralEntityReporte1(existenciascostosAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA)) {
					existe=true;
					existenciascostosAux.setsDescripcionGeneralEntityReporte1(existenciascostosAux.getnombre_linea());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
					existe=true;
					existenciascostosAux.setsDescripcionGeneralEntityReporte1(existenciascostosAux.getnombre_linea_grupo());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
					existe=true;
					existenciascostosAux.setsDescripcionGeneralEntityReporte1(existenciascostosAux.getnombre_linea_categoria());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
					existe=true;
					existenciascostosAux.setsDescripcionGeneralEntityReporte1(existenciascostosAux.getnombre_linea_marca());
				}
				 else if(sTipoSeleccionar.equals(ExistenciasCostosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					existenciascostosAux.setsDescripcionGeneralEntityReporte1(existenciascostosAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ExistenciasCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesExistenciasCostos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoExistenciasCostos=true;
				this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos=true;
				this.isVisibilidadCeldaGuardarCambiosExistenciasCostos=true;
			}
			
			this.isVisibilidadCeldaModificarExistenciasCostos=false;
			this.isVisibilidadCeldaActualizarExistenciasCostos=false;
			this.isVisibilidadCeldaEliminarExistenciasCostos=false;
			this.isVisibilidadCeldaCancelarExistenciasCostos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarExistenciasCostos=true;
				} else {
					this.isVisibilidadCeldaGuardarExistenciasCostos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoExistenciasCostos=false;
			this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos=false;
			this.isVisibilidadCeldaGuardarCambiosExistenciasCostos=false;
			this.isVisibilidadCeldaModificarExistenciasCostos=false;
			this.isVisibilidadCeldaActualizarExistenciasCostos=true;
			this.isVisibilidadCeldaEliminarExistenciasCostos=false;
			this.isVisibilidadCeldaCancelarExistenciasCostos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarExistenciasCostos=true;
				} else {
					this.isVisibilidadCeldaGuardarExistenciasCostos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoExistenciasCostos=false;
			this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos=false;
			this.isVisibilidadCeldaGuardarCambiosExistenciasCostos=false;
			this.isVisibilidadCeldaModificarExistenciasCostos=false;
			this.isVisibilidadCeldaActualizarExistenciasCostos=true;
			this.isVisibilidadCeldaEliminarExistenciasCostos=true;
			this.isVisibilidadCeldaCancelarExistenciasCostos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarExistenciasCostos=true;
				} else {
					this.isVisibilidadCeldaGuardarExistenciasCostos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoExistenciasCostos=false;
			this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos=false;
			this.isVisibilidadCeldaGuardarCambiosExistenciasCostos=false;
			this.isVisibilidadCeldaModificarExistenciasCostos=false;
			this.isVisibilidadCeldaActualizarExistenciasCostos=true;
			this.isVisibilidadCeldaEliminarExistenciasCostos=false;
			this.isVisibilidadCeldaCancelarExistenciasCostos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarExistenciasCostos=false;
				} else {
					this.isVisibilidadCeldaGuardarExistenciasCostos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoExistenciasCostos=true;
			this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos=true;
			this.isVisibilidadCeldaGuardarCambiosExistenciasCostos=true;
			this.isVisibilidadCeldaModificarExistenciasCostos=false;
			this.isVisibilidadCeldaActualizarExistenciasCostos=false;
			this.isVisibilidadCeldaEliminarExistenciasCostos=false;
			this.isVisibilidadCeldaCancelarExistenciasCostos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarExistenciasCostos=true;
				} else {
					this.isVisibilidadCeldaGuardarExistenciasCostos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoExistenciasCostos=false;
			this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos=false;
			this.isVisibilidadCeldaGuardarCambiosExistenciasCostos=false;
			this.isVisibilidadCeldaActualizarExistenciasCostos=false;
			this.isVisibilidadCeldaEliminarExistenciasCostos=false;
			this.isVisibilidadCeldaCancelarExistenciasCostos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarExistenciasCostos=false;
				} else {
					this.isVisibilidadCeldaGuardarExistenciasCostos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoExistenciasCostos=false;
			this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos=false;
			this.isVisibilidadCeldaGuardarCambiosExistenciasCostos=false;
			this.isVisibilidadCeldaModificarExistenciasCostos=true;
			this.isVisibilidadCeldaActualizarExistenciasCostos=false;
			this.isVisibilidadCeldaEliminarExistenciasCostos=false;
			this.isVisibilidadCeldaCancelarExistenciasCostos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarExistenciasCostos=false;
				} else {
					this.isVisibilidadCeldaGuardarExistenciasCostos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ExistenciasCostosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoExistenciasCostos=true;
			this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos=true;
			this.isVisibilidadCeldaGuardarCambiosExistenciasCostos=true;
		} else {
			this.actualizarEstadoPanelsExistenciasCostos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarExistenciasCostos=false;
			//this.isVisibilidadCeldaVerFormExistenciasCostos=false;
			this.isVisibilidadCeldaDuplicarExistenciasCostos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!existenciascostosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos=false;
		} else {
			this.isVisibilidadCeldaNuevoExistenciasCostos=false;
			this.isVisibilidadCeldaGuardarCambiosExistenciasCostos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(existenciascostosSessionBean.getEsGuardarRelacionado()) {
			if(!existenciascostosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos=false;												
			}
			
			this.jButtonCerrarExistenciasCostos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos=false;
		}
		
		if(!this.permiteMantenimiento(this.existenciascostos)) {
			this.isVisibilidadCeldaActualizarExistenciasCostos=false;
			this.isVisibilidadCeldaEliminarExistenciasCostos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoExistenciasCostos=false;
		this.isVisibilidadCeldaNuevoRelacionesExistenciasCostos=false;
		this.isVisibilidadCeldaGuardarCambiosExistenciasCostos=false;
		//this.isVisibilidadCeldaModificarExistenciasCostos=true;
		this.isVisibilidadCeldaActualizarExistenciasCostos=false;
		this.isVisibilidadCeldaEliminarExistenciasCostos=false;
		//this.isVisibilidadCeldaCancelarExistenciasCostos=true;			
		this.isVisibilidadCeldaGuardarExistenciasCostos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesExistenciasCostos() {
	}
	
	public void actualizarEstadoPanelsExistenciasCostos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionExistenciasCostos!=null) {
				this.jScrollPanelDatosEdicionExistenciasCostos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasExistenciasCostos!=null) {
				this.jTabbedPaneBusquedasExistenciasCostos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosExistenciasCostos!=null) {
				this.jScrollPanelDatosExistenciasCostos.setVisible(true);
			}
			
			if(this.jPanelPaginacionExistenciasCostos!=null) {
				this.jPanelPaginacionExistenciasCostos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesExistenciasCostos!=null) {
				this.jPanelParametrosReportesExistenciasCostos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionExistenciasCostos!=null) {
				this.jScrollPanelDatosEdicionExistenciasCostos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasExistenciasCostos!=null) {
				this.jTabbedPaneBusquedasExistenciasCostos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosExistenciasCostos!=null) {
				this.jScrollPanelDatosExistenciasCostos.setVisible(false);
			}
			
			if(this.jPanelPaginacionExistenciasCostos!=null) {
				this.jPanelPaginacionExistenciasCostos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesExistenciasCostos!=null) {
				this.jPanelParametrosReportesExistenciasCostos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionExistenciasCostos!=null) {
				this.jScrollPanelDatosEdicionExistenciasCostos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasExistenciasCostos!=null) {
				this.jTabbedPaneBusquedasExistenciasCostos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosExistenciasCostos!=null) {
				this.jScrollPanelDatosExistenciasCostos.setVisible(false);
			}
			
			if(this.jPanelPaginacionExistenciasCostos!=null) {
				this.jPanelPaginacionExistenciasCostos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesExistenciasCostos!=null) {
				this.jPanelParametrosReportesExistenciasCostos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionExistenciasCostos!=null) {
				this.jScrollPanelDatosEdicionExistenciasCostos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasExistenciasCostos!=null) {
				this.jTabbedPaneBusquedasExistenciasCostos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosExistenciasCostos!=null) {
				this.jScrollPanelDatosExistenciasCostos.setVisible(false);
			}
			
			if(this.jPanelPaginacionExistenciasCostos!=null) {
				this.jPanelPaginacionExistenciasCostos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesExistenciasCostos!=null) {
				this.jPanelParametrosReportesExistenciasCostos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionExistenciasCostos!=null) {
				this.jScrollPanelDatosEdicionExistenciasCostos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasExistenciasCostos!=null) {
				this.jTabbedPaneBusquedasExistenciasCostos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosExistenciasCostos!=null) {
				this.jScrollPanelDatosExistenciasCostos.setVisible(true);
			}
			
			if(this.jPanelPaginacionExistenciasCostos!=null) {
				this.jPanelPaginacionExistenciasCostos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesExistenciasCostos!=null) {
				this.jPanelParametrosReportesExistenciasCostos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionExistenciasCostos!=null) {
				this.jScrollPanelDatosEdicionExistenciasCostos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasExistenciasCostos!=null) {
				this.jTabbedPaneBusquedasExistenciasCostos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosExistenciasCostos!=null) {
				this.jScrollPanelDatosExistenciasCostos.setVisible(true);
			}
			
			if(this.jPanelPaginacionExistenciasCostos!=null) {
				this.jPanelPaginacionExistenciasCostos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesExistenciasCostos!=null) {
				this.jPanelParametrosReportesExistenciasCostos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionExistenciasCostos!=null) {
				this.jScrollPanelDatosEdicionExistenciasCostos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasExistenciasCostos!=null) {
				this.jTabbedPaneBusquedasExistenciasCostos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosExistenciasCostos!=null) {
				this.jScrollPanelDatosExistenciasCostos.setVisible(true);
			}
			
			if(this.jPanelPaginacionExistenciasCostos!=null) {
				this.jPanelPaginacionExistenciasCostos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesExistenciasCostos!=null) {
				this.jPanelParametrosReportesExistenciasCostos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasExistenciasCostos!=null) {
					this.jTabbedPaneBusquedasExistenciasCostos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesExistenciasCostos!=null) {
				this.jPanelParametrosReportesExistenciasCostos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasExistenciasCostos!=null) {
				this.jTabbedPaneBusquedasExistenciasCostos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesExistenciasCostos!=null) {
				this.jPanelParametrosReportesExistenciasCostos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaExistenciasCostos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaExistenciasCostos) {this.jTabbedPaneBusquedasExistenciasCostos.remove(jPanelBusquedaExistenciasCostosExistenciasCostos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaExistenciasCostos=isParaLinea;
			if(!this.isVisibilidadBusquedaExistenciasCostos) {this.jTabbedPaneBusquedasExistenciasCostos.remove(jPanelBusquedaExistenciasCostosExistenciasCostos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaExistenciasCostos=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaExistenciasCostos) {this.jTabbedPaneBusquedasExistenciasCostos.remove(jPanelBusquedaExistenciasCostosExistenciasCostos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaExistenciasCostos=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaExistenciasCostos) {this.jTabbedPaneBusquedasExistenciasCostos.remove(jPanelBusquedaExistenciasCostosExistenciasCostos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaExistenciasCostos=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaExistenciasCostos) {this.jTabbedPaneBusquedasExistenciasCostos.remove(jPanelBusquedaExistenciasCostosExistenciasCostos);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaExistenciasCostos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioExistenciasCostos() {
		this.updateBorderResaltarBusquedasFormularioExistenciasCostos();
		this.updateVisibilidadBusquedasFormularioExistenciasCostos();
		this.updateHabilitarBusquedasFormularioExistenciasCostos();
	}
	
	public void updateBorderResaltarBusquedasFormularioExistenciasCostos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasExistenciasCostos.getComponents().length>0) {
	

		if(this.existenciascostosConstantesFunciones.resaltarBusquedaExistenciasCostosExistenciasCostos!=null) {
			index= this.jTabbedPaneBusquedasExistenciasCostos.indexOfComponent(this.jPanelBusquedaExistenciasCostosExistenciasCostos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasExistenciasCostos.getComponent(index);
				jPanel.setBorder(this.existenciascostosConstantesFunciones.resaltarBusquedaExistenciasCostosExistenciasCostos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioExistenciasCostos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasExistenciasCostos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasExistenciasCostos.indexOfComponent(this.jPanelBusquedaExistenciasCostosExistenciasCostos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasExistenciasCostos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.existenciascostosConstantesFunciones.mostrarBusquedaExistenciasCostosExistenciasCostos);
			if(!this.existenciascostosConstantesFunciones.mostrarBusquedaExistenciasCostosExistenciasCostos && index>-1) {
				this.jTabbedPaneBusquedasExistenciasCostos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioExistenciasCostos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasExistenciasCostos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasExistenciasCostos.indexOfComponent(this.jPanelBusquedaExistenciasCostosExistenciasCostos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasExistenciasCostos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.existenciascostosConstantesFunciones.activarBusquedaExistenciasCostosExistenciasCostos);
				this.jTabbedPaneBusquedasExistenciasCostos.setEnabledAt(index,this.existenciascostosConstantesFunciones.activarBusquedaExistenciasCostosExistenciasCostos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaExistenciasCostos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaExistenciasCostos")) {
			index= this.jTabbedPaneBusquedasExistenciasCostos.indexOfComponent(this.jPanelBusquedaExistenciasCostosExistenciasCostos);

			this.jTabbedPaneBusquedasExistenciasCostos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasExistenciasCostos.getComponent(index);

			this.existenciascostosConstantesFunciones.setResaltarBusquedaExistenciasCostosExistenciasCostos(resaltar);

			jPanel.setBorder(this.existenciascostosConstantesFunciones.resaltarBusquedaExistenciasCostosExistenciasCostos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarExistenciasCostos.setBorder(resaltar);
			
		}
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
	
	public void updateControlesFormularioExistenciasCostos() throws Exception {

		if(this.jInternalFrameDetalleFormExistenciasCostos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioExistenciasCostos();
		this.updateVisibilidadResaltarControlesFormularioExistenciasCostos();
		this.updateHabilitarResaltarControlesFormularioExistenciasCostos();
		
	}
	
	public void updateBorderResaltarControlesFormularioExistenciasCostos() throws Exception {
		if(this.jInternalFrameDetalleFormExistenciasCostos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.existenciascostosConstantesFunciones.resaltaridExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos!=null) {this.jInternalFrameDetalleFormExistenciasCostos.jLabelidExistenciasCostos.setBorder(this.existenciascostosConstantesFunciones.resaltaridExistenciasCostos);}
		if(this.existenciascostosConstantesFunciones.resaltarid_empresaExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos!=null) {this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_empresaExistenciasCostos.setBorder(this.existenciascostosConstantesFunciones.resaltarid_empresaExistenciasCostos);}
		if(this.existenciascostosConstantesFunciones.resaltarid_lineaExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos!=null) {this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_lineaExistenciasCostos.setBorder(this.existenciascostosConstantesFunciones.resaltarid_lineaExistenciasCostos);}
		if(this.existenciascostosConstantesFunciones.resaltarid_linea_grupoExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos!=null) {this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_grupoExistenciasCostos.setBorder(this.existenciascostosConstantesFunciones.resaltarid_linea_grupoExistenciasCostos);}
		if(this.existenciascostosConstantesFunciones.resaltarid_linea_categoriaExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos!=null) {this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_categoriaExistenciasCostos.setBorder(this.existenciascostosConstantesFunciones.resaltarid_linea_categoriaExistenciasCostos);}
		if(this.existenciascostosConstantesFunciones.resaltarid_linea_marcaExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos!=null) {this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_marcaExistenciasCostos.setBorder(this.existenciascostosConstantesFunciones.resaltarid_linea_marcaExistenciasCostos);}
		if(this.existenciascostosConstantesFunciones.resaltarfecha_emision_hastaExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos!=null) {this.jInternalFrameDetalleFormExistenciasCostos.jDateChooserfecha_emision_hastaExistenciasCostos.setBorder(this.existenciascostosConstantesFunciones.resaltarfecha_emision_hastaExistenciasCostos);}
		if(this.existenciascostosConstantesFunciones.resaltarnombre_productoExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos!=null) {this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_productoExistenciasCostos.setBorder(this.existenciascostosConstantesFunciones.resaltarnombre_productoExistenciasCostos);}
		if(this.existenciascostosConstantesFunciones.resaltarnombre_unidadExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos!=null) {this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldnombre_unidadExistenciasCostos.setBorder(this.existenciascostosConstantesFunciones.resaltarnombre_unidadExistenciasCostos);}
		if(this.existenciascostosConstantesFunciones.resaltarnombre_lineaExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos!=null) {this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_lineaExistenciasCostos.setBorder(this.existenciascostosConstantesFunciones.resaltarnombre_lineaExistenciasCostos);}
		if(this.existenciascostosConstantesFunciones.resaltarnombre_linea_grupoExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos!=null) {this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_grupoExistenciasCostos.setBorder(this.existenciascostosConstantesFunciones.resaltarnombre_linea_grupoExistenciasCostos);}
		if(this.existenciascostosConstantesFunciones.resaltarnombre_linea_categoriaExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos!=null) {this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_categoriaExistenciasCostos.setBorder(this.existenciascostosConstantesFunciones.resaltarnombre_linea_categoriaExistenciasCostos);}
		if(this.existenciascostosConstantesFunciones.resaltarnombre_linea_marcaExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos!=null) {this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_marcaExistenciasCostos.setBorder(this.existenciascostosConstantesFunciones.resaltarnombre_linea_marcaExistenciasCostos);}
		if(this.existenciascostosConstantesFunciones.resaltarcodigoExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos!=null) {this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldcodigoExistenciasCostos.setBorder(this.existenciascostosConstantesFunciones.resaltarcodigoExistenciasCostos);}
		if(this.existenciascostosConstantesFunciones.resaltarcosto_totalExistenciasCostos!=null && this.jInternalFrameDetalleFormExistenciasCostos!=null) {this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldcosto_totalExistenciasCostos.setBorder(this.existenciascostosConstantesFunciones.resaltarcosto_totalExistenciasCostos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioExistenciasCostos() throws Exception {		
		if(this.jInternalFrameDetalleFormExistenciasCostos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
	
		//this.jInternalFrameDetalleFormExistenciasCostos.jLabelidExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostraridExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jPanelidExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostraridExistenciasCostos);
		//this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_empresaExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarid_empresaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jPanelid_empresaExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarid_empresaExistenciasCostos);
		//this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_lineaExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarid_lineaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jPanelid_lineaExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarid_lineaExistenciasCostos);
		//this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_grupoExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarid_linea_grupoExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jPanelid_linea_grupoExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarid_linea_grupoExistenciasCostos);
		//this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_categoriaExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarid_linea_categoriaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jPanelid_linea_categoriaExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarid_linea_categoriaExistenciasCostos);
		//this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_marcaExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarid_linea_marcaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jPanelid_linea_marcaExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarid_linea_marcaExistenciasCostos);
		//this.jInternalFrameDetalleFormExistenciasCostos.jDateChooserfecha_emision_hastaExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarfecha_emision_hastaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jPanelfecha_emision_hastaExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarfecha_emision_hastaExistenciasCostos);
		//this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_productoExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarnombre_productoExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jPanelnombre_productoExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarnombre_productoExistenciasCostos);
		//this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldnombre_unidadExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarnombre_unidadExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jPanelnombre_unidadExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarnombre_unidadExistenciasCostos);
		//this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_lineaExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarnombre_lineaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jPanelnombre_lineaExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarnombre_lineaExistenciasCostos);
		//this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_grupoExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarnombre_linea_grupoExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jPanelnombre_linea_grupoExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarnombre_linea_grupoExistenciasCostos);
		//this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_categoriaExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarnombre_linea_categoriaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jPanelnombre_linea_categoriaExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarnombre_linea_categoriaExistenciasCostos);
		//this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_marcaExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarnombre_linea_marcaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jPanelnombre_linea_marcaExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarnombre_linea_marcaExistenciasCostos);
		//this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldcodigoExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarcodigoExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jPanelcodigoExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarcodigoExistenciasCostos);
		//this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldcosto_totalExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarcosto_totalExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jPanelcosto_totalExistenciasCostos.setVisible(this.existenciascostosConstantesFunciones.mostrarcosto_totalExistenciasCostos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioExistenciasCostos() throws Exception {
		if(this.jInternalFrameDetalleFormExistenciasCostos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormExistenciasCostos!=null) {
	
		this.jInternalFrameDetalleFormExistenciasCostos.jLabelidExistenciasCostos.setEnabled(this.existenciascostosConstantesFunciones.activaridExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_empresaExistenciasCostos.setEnabled(this.existenciascostosConstantesFunciones.activarid_empresaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_lineaExistenciasCostos.setEnabled(this.existenciascostosConstantesFunciones.activarid_lineaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_grupoExistenciasCostos.setEnabled(this.existenciascostosConstantesFunciones.activarid_linea_grupoExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_categoriaExistenciasCostos.setEnabled(this.existenciascostosConstantesFunciones.activarid_linea_categoriaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jComboBoxid_linea_marcaExistenciasCostos.setEnabled(this.existenciascostosConstantesFunciones.activarid_linea_marcaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jDateChooserfecha_emision_hastaExistenciasCostos.setEnabled(this.existenciascostosConstantesFunciones.activarfecha_emision_hastaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_productoExistenciasCostos.setEnabled(this.existenciascostosConstantesFunciones.activarnombre_productoExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldnombre_unidadExistenciasCostos.setEnabled(this.existenciascostosConstantesFunciones.activarnombre_unidadExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_lineaExistenciasCostos.setEnabled(this.existenciascostosConstantesFunciones.activarnombre_lineaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_grupoExistenciasCostos.setEnabled(this.existenciascostosConstantesFunciones.activarnombre_linea_grupoExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_categoriaExistenciasCostos.setEnabled(this.existenciascostosConstantesFunciones.activarnombre_linea_categoriaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jTextAreanombre_linea_marcaExistenciasCostos.setEnabled(this.existenciascostosConstantesFunciones.activarnombre_linea_marcaExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldcodigoExistenciasCostos.setEnabled(this.existenciascostosConstantesFunciones.activarcodigoExistenciasCostos);
		this.jInternalFrameDetalleFormExistenciasCostos.jTextFieldcosto_totalExistenciasCostos.setEnabled(this.existenciascostosConstantesFunciones.activarcosto_totalExistenciasCostos);
		}
	}
	
		
}