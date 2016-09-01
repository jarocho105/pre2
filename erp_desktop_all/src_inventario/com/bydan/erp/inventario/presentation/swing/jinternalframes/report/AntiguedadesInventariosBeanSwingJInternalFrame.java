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

//import com.bydan.erp.inventario.util.AntiguedadesInventariosConstantesFunciones;
import com.bydan.erp.inventario.util.report.AntiguedadesInventariosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.AntiguedadesInventariosParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.AntiguedadesInventariosBean;
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

import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class AntiguedadesInventariosBeanSwingJInternalFrame extends AntiguedadesInventariosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AntiguedadesInventariosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<AntiguedadesInventarios> antiguedadesinventariosValidator = new ClassValidator<AntiguedadesInventarios>(AntiguedadesInventarios.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public AntiguedadesInventarios antiguedadesinventarios;	
	public AntiguedadesInventarios antiguedadesinventariosAux;
	public AntiguedadesInventarios antiguedadesinventariosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public AntiguedadesInventarios antiguedadesinventariosTotales;
	public Long idAntiguedadesInventariosActual;
	public Long iIdNuevoAntiguedadesInventarios=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboBodega="";

	public List<Bodega> bodegasForeignKey;

	public List<Bodega> getbodegasForeignKey() {
		return bodegasForeignKey;
	}

	public void setbodegasForeignKey(List<Bodega> bodegasForeignKey) {
		this.bodegasForeignKey = bodegasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Bodega bodegaForeignKey;

	public Bodega getbodegaForeignKey() {
		return bodegaForeignKey;
	}

	public void setbodegaForeignKey(Bodega bodegaForeignKey) {
		this.bodegaForeignKey = bodegaForeignKey;
	}

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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
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
	
	public Boolean isPermisoTodoAntiguedadesInventarios;
	public Boolean isPermisoNuevoAntiguedadesInventarios;
	public Boolean isPermisoActualizarAntiguedadesInventarios;
	public Boolean isPermisoActualizarOriginalAntiguedadesInventarios;
	public Boolean isPermisoEliminarAntiguedadesInventarios;
	public Boolean isPermisoGuardarCambiosAntiguedadesInventarios;
	public Boolean isPermisoConsultaAntiguedadesInventarios;
	public Boolean isPermisoBusquedaAntiguedadesInventarios;
	public Boolean isPermisoReporteAntiguedadesInventarios;
	public Boolean isPermisoPaginacionMedioAntiguedadesInventarios;
	public Boolean isPermisoPaginacionAltoAntiguedadesInventarios;
	public Boolean isPermisoPaginacionTodoAntiguedadesInventarios;
	public Boolean isPermisoCopiarAntiguedadesInventarios;
	public Boolean isPermisoVerFormAntiguedadesInventarios;
	public Boolean isPermisoDuplicarAntiguedadesInventarios;
	public Boolean isPermisoOrdenAntiguedadesInventarios;
	
	
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
	
	public AntiguedadesInventariosParameterReturnGeneral antiguedadesinventariosReturnGeneral;
	public AntiguedadesInventariosParameterReturnGeneral antiguedadesinventariosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAntiguedadesInventarios=false;
	public Boolean esParaAccionDesdeFormularioAntiguedadesInventarios=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AntiguedadesInventariosSessionBeanAdditional antiguedadesinventariosSessionBeanAdditional=null;
	
	public AntiguedadesInventariosSessionBeanAdditional getAntiguedadesInventariosSessionBeanAdditional() {
		return this.antiguedadesinventariosSessionBeanAdditional;
	}
	
	public void setAntiguedadesInventariosSessionBeanAdditional(AntiguedadesInventariosSessionBeanAdditional antiguedadesinventariosSessionBeanAdditional) {
		try {
			this.antiguedadesinventariosSessionBeanAdditional=antiguedadesinventariosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AntiguedadesInventariosBeanSwingJInternalFrameAdditional antiguedadesinventariosBeanSwingJInternalFrameAdditional=null;
	//public class AntiguedadesInventariosBeanSwingJInternalFrame
	
	public AntiguedadesInventariosBeanSwingJInternalFrameAdditional getAntiguedadesInventariosBeanSwingJInternalFrameAdditional() {
		return this.antiguedadesinventariosBeanSwingJInternalFrameAdditional;
	}
	
	public void setAntiguedadesInventariosBeanSwingJInternalFrameAdditional(AntiguedadesInventariosBeanSwingJInternalFrameAdditional antiguedadesinventariosBeanSwingJInternalFrameAdditional) {
		try {
			this.antiguedadesinventariosBeanSwingJInternalFrameAdditional=antiguedadesinventariosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AntiguedadesInventariosLogic antiguedadesinventariosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public AntiguedadesInventarios antiguedadesinventariosBean;
	public AntiguedadesInventariosConstantesFunciones antiguedadesinventariosConstantesFunciones;
	//public AntiguedadesInventariosParameterReturnGeneral antiguedadesinventariosReturnGeneral;
	
	//FK
	
	public BodegaLogic bodegaLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	
	//PARAMETROS
	
	
	//public List<AntiguedadesInventarios> antiguedadesinventarioss;	
	//public List<AntiguedadesInventarios> antiguedadesinventariossEliminados;
	//public List<AntiguedadesInventarios> antiguedadesinventariossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAntiguedadesInventarios=false;
	public Boolean isVisibilidadCeldaDuplicarAntiguedadesInventarios=true;
	public Boolean isVisibilidadCeldaCopiarAntiguedadesInventarios=true;
	public Boolean isVisibilidadCeldaVerFormAntiguedadesInventarios=true;
	public Boolean isVisibilidadCeldaOrdenAntiguedadesInventarios=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios=false;
	public Boolean isVisibilidadCeldaModificarAntiguedadesInventarios=false;
	public Boolean isVisibilidadCeldaActualizarAntiguedadesInventarios=false;
	public Boolean isVisibilidadCeldaEliminarAntiguedadesInventarios=false;
	public Boolean isVisibilidadCeldaCancelarAntiguedadesInventarios=false;
	public Boolean isVisibilidadCeldaGuardarAntiguedadesInventarios=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios=false;	
	
	
	public Boolean isVisibilidadBusquedaAntiguedadesInventarios=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoAntiguedadesInventarios() {
		return this.iIdNuevoAntiguedadesInventarios;
	}

	public void setiIdNuevoAntiguedadesInventarios(Long iIdNuevoAntiguedadesInventarios) {
		this.iIdNuevoAntiguedadesInventarios = iIdNuevoAntiguedadesInventarios;
	}
	
	public Long getidAntiguedadesInventariosActual() {
		return this.idAntiguedadesInventariosActual;
	}

	public void setidAntiguedadesInventariosActual(Long idAntiguedadesInventariosActual) {
		this.idAntiguedadesInventariosActual = idAntiguedadesInventariosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public AntiguedadesInventarios getantiguedadesinventarios() {
		return this.antiguedadesinventarios;
	}

	public void setantiguedadesinventarios(AntiguedadesInventarios antiguedadesinventarios) {
		this.antiguedadesinventarios = antiguedadesinventarios;
	}
	
	public AntiguedadesInventarios getantiguedadesinventariosAux() {
		return this.antiguedadesinventariosAux;
	}

	public void setantiguedadesinventariosAux(AntiguedadesInventarios antiguedadesinventariosAux) {
		this.antiguedadesinventariosAux = antiguedadesinventariosAux;
	}				
	
	public AntiguedadesInventarios getantiguedadesinventariosAnterior() {
		return this.antiguedadesinventariosAnterior;
	}

	public void setantiguedadesinventariosAnterior(AntiguedadesInventarios antiguedadesinventariosAnterior) {
		this.antiguedadesinventariosAnterior = antiguedadesinventariosAnterior;
	}	
	
	public AntiguedadesInventarios getantiguedadesinventariosTotales() {
		return this.antiguedadesinventariosTotales;
	}

	public void setantiguedadesinventariosTotales(AntiguedadesInventarios antiguedadesinventariosTotales) {
		this.antiguedadesinventariosTotales = antiguedadesinventariosTotales;
	}	
	
	public AntiguedadesInventarios getantiguedadesinventariosBean() {
		return this.antiguedadesinventariosBean;
	}

	public void setantiguedadesinventariosBean(AntiguedadesInventarios antiguedadesinventariosBean) {
		this.antiguedadesinventariosBean = antiguedadesinventariosBean;
	}	
	
	public AntiguedadesInventariosParameterReturnGeneral getantiguedadesinventariosReturnGeneral() {
		return this.antiguedadesinventariosReturnGeneral;
	}

	public void setantiguedadesinventariosReturnGeneral(AntiguedadesInventariosParameterReturnGeneral antiguedadesinventariosReturnGeneral) {
		this.antiguedadesinventariosReturnGeneral = antiguedadesinventariosReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaAntiguedadesInventarios=-1L;

	public Long getid_bodegaBusquedaAntiguedadesInventarios() {
		return this.id_bodegaBusquedaAntiguedadesInventarios;
	}

	public void setid_bodegaBusquedaAntiguedadesInventarios(Long id_bodegaBusquedaAntiguedadesInventarios) {
		this.id_bodegaBusquedaAntiguedadesInventarios = id_bodegaBusquedaAntiguedadesInventarios;
	}

;
	public Long id_lineaBusquedaAntiguedadesInventarios=-1L;

	public Long getid_lineaBusquedaAntiguedadesInventarios() {
		return this.id_lineaBusquedaAntiguedadesInventarios;
	}

	public void setid_lineaBusquedaAntiguedadesInventarios(Long id_lineaBusquedaAntiguedadesInventarios) {
		this.id_lineaBusquedaAntiguedadesInventarios = id_lineaBusquedaAntiguedadesInventarios;
	}

;
	public Long id_linea_grupoBusquedaAntiguedadesInventarios=-1L;

	public Long getid_linea_grupoBusquedaAntiguedadesInventarios() {
		return this.id_linea_grupoBusquedaAntiguedadesInventarios;
	}

	public void setid_linea_grupoBusquedaAntiguedadesInventarios(Long id_linea_grupoBusquedaAntiguedadesInventarios) {
		this.id_linea_grupoBusquedaAntiguedadesInventarios = id_linea_grupoBusquedaAntiguedadesInventarios;
	}

;
	public Long id_linea_categoriaBusquedaAntiguedadesInventarios=-1L;

	public Long getid_linea_categoriaBusquedaAntiguedadesInventarios() {
		return this.id_linea_categoriaBusquedaAntiguedadesInventarios;
	}

	public void setid_linea_categoriaBusquedaAntiguedadesInventarios(Long id_linea_categoriaBusquedaAntiguedadesInventarios) {
		this.id_linea_categoriaBusquedaAntiguedadesInventarios = id_linea_categoriaBusquedaAntiguedadesInventarios;
	}

;
	public Long id_linea_marcaBusquedaAntiguedadesInventarios=-1L;

	public Long getid_linea_marcaBusquedaAntiguedadesInventarios() {
		return this.id_linea_marcaBusquedaAntiguedadesInventarios;
	}

	public void setid_linea_marcaBusquedaAntiguedadesInventarios(Long id_linea_marcaBusquedaAntiguedadesInventarios) {
		this.id_linea_marcaBusquedaAntiguedadesInventarios = id_linea_marcaBusquedaAntiguedadesInventarios;
	}

;
	public Date fecha_ultima_venta_hastaBusquedaAntiguedadesInventarios=new Date();

	public Date getfecha_ultima_venta_hastaBusquedaAntiguedadesInventarios() {
		return this.fecha_ultima_venta_hastaBusquedaAntiguedadesInventarios;
	}

	public void setfecha_ultima_venta_hastaBusquedaAntiguedadesInventarios(Date fecha_ultima_venta_hastaBusquedaAntiguedadesInventarios) {
		this.fecha_ultima_venta_hastaBusquedaAntiguedadesInventarios = fecha_ultima_venta_hastaBusquedaAntiguedadesInventarios;
	}

	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public AntiguedadesInventariosLogic getAntiguedadesInventariosLogic()	{		
		return antiguedadesinventariosLogic;
	}

	public void setAntiguedadesInventariosLogic(AntiguedadesInventariosLogic antiguedadesinventariosLogic) {
		this.antiguedadesinventariosLogic = antiguedadesinventariosLogic;
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
	
	public Boolean getIsEsNuevoAntiguedadesInventarios() {
		return isEsNuevoAntiguedadesInventarios;
	}

	public void setIsEsNuevoAntiguedadesInventarios(Boolean isEsNuevoAntiguedadesInventarios) {
		this.isEsNuevoAntiguedadesInventarios = isEsNuevoAntiguedadesInventarios;
	}

	public Boolean getEsParaAccionDesdeFormularioAntiguedadesInventarios() {
		return esParaAccionDesdeFormularioAntiguedadesInventarios;
	}
	
	public void setEsParaAccionDesdeFormularioAntiguedadesInventarios(Boolean esParaAccionDesdeFormularioAntiguedadesInventarios) {
		this.esParaAccionDesdeFormularioAntiguedadesInventarios = esParaAccionDesdeFormularioAntiguedadesInventarios;
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
	
	
	public void cargarCombosBodegasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bodegasForeignKey=new ArrayList<Bodega>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BodegaLogic bodegaLogic=new BodegaLogic();

			bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.antiguedadesinventariosSessionBean==null) {
				this.antiguedadesinventariosSessionBean=new AntiguedadesInventariosSessionBean();
			}

			if(!this.antiguedadesinventariosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

					bodegaLogic.getTodosBodegasWithConnection(sFinalQuery,new Pagination());

					this.bodegasForeignKey=bodegaLogic.getBodegas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBodega(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getEntityWithConnection(antiguedadesinventariosSessionBean.getlidBodegaActual());
					this.bodegasForeignKey.add(bodegaLogic.getBodega());
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

			if(this.antiguedadesinventariosSessionBean==null) {
				this.antiguedadesinventariosSessionBean=new AntiguedadesInventariosSessionBean();
			}

			if(!this.antiguedadesinventariosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(antiguedadesinventariosSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.antiguedadesinventariosSessionBean==null) {
				this.antiguedadesinventariosSessionBean=new AntiguedadesInventariosSessionBean();
			}

			if(!this.antiguedadesinventariosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(antiguedadesinventariosSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

			if(this.antiguedadesinventariosSessionBean==null) {
				this.antiguedadesinventariosSessionBean=new AntiguedadesInventariosSessionBean();
			}

			if(!this.antiguedadesinventariosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(antiguedadesinventariosSessionBean.getlidLineaActual());
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

			if(this.antiguedadesinventariosSessionBean==null) {
				this.antiguedadesinventariosSessionBean=new AntiguedadesInventariosSessionBean();
			}

			if(!this.antiguedadesinventariosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(antiguedadesinventariosSessionBean.getlidLineaGrupoActual());
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

			if(this.antiguedadesinventariosSessionBean==null) {
				this.antiguedadesinventariosSessionBean=new AntiguedadesInventariosSessionBean();
			}

			if(!this.antiguedadesinventariosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(antiguedadesinventariosSessionBean.getlidLineaCategoriaActual());
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

			if(this.antiguedadesinventariosSessionBean==null) {
				this.antiguedadesinventariosSessionBean=new AntiguedadesInventariosSessionBean();
			}

			if(!this.antiguedadesinventariosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
					lineaLogic.getEntityWithConnection(antiguedadesinventariosSessionBean.getlidLineaMarcaActual());
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

	
	
	public void setActualBodegaForeignKey(Long idBodegaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bodegaTemp!=null) {

					if(this.antiguedadesinventarios!=null) {
						this.antiguedadesinventarios.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
						this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_bodegaAntiguedadesInventarios.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaAntiguedadesInventarios.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_bodegaAntiguedadesInventarios.getItemCount()>0) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_bodegaAntiguedadesInventarios.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaAntiguedadesInventarios") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios!=null) {
						jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios!=null) {
							//jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedIndex(0);
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

	public String getActualBodegaForeignKeyDescripcion(Long idBodegaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}


			sDescripcion=BodegaConstantesFunciones.getBodegaDescripcion(bodegaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaAntiguedadesInventariosGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(bodegaTemp!=null) {
				jComboBoxid_bodegaAntiguedadesInventariosGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaAntiguedadesInventariosGenerico!=null && jComboBoxid_bodegaAntiguedadesInventariosGenerico.getItemCount()>0) {
					jComboBoxid_bodegaAntiguedadesInventariosGenerico.setSelectedIndex(0);
				}
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

					if(this.antiguedadesinventarios!=null) {
						this.antiguedadesinventarios.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
						this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_empresaAntiguedadesInventarios.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaAntiguedadesInventarios.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_empresaAntiguedadesInventarios.getItemCount()>0) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_empresaAntiguedadesInventarios.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaAntiguedadesInventariosGenerico)throws Exception
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
				jComboBoxid_empresaAntiguedadesInventariosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaAntiguedadesInventariosGenerico!=null && jComboBoxid_empresaAntiguedadesInventariosGenerico.getItemCount()>0) {
					jComboBoxid_empresaAntiguedadesInventariosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.antiguedadesinventarios!=null) {
						this.antiguedadesinventarios.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
						this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_sucursalAntiguedadesInventarios.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalAntiguedadesInventarios.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_sucursalAntiguedadesInventarios.getItemCount()>0) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_sucursalAntiguedadesInventarios.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalAntiguedadesInventariosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalAntiguedadesInventariosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalAntiguedadesInventariosGenerico!=null && jComboBoxid_sucursalAntiguedadesInventariosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalAntiguedadesInventariosGenerico.setSelectedIndex(0);
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

					if(this.antiguedadesinventarios!=null) {
						this.antiguedadesinventarios.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
						this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_lineaAntiguedadesInventarios.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaAntiguedadesInventarios.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_lineaAntiguedadesInventarios.getItemCount()>0) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_lineaAntiguedadesInventarios.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaAntiguedadesInventarios") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios!=null) {
						jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios!=null) {
							//jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.getItemCount()>0) {
								jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaAntiguedadesInventariosGenerico)throws Exception
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
				jComboBoxid_lineaAntiguedadesInventariosGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaAntiguedadesInventariosGenerico!=null && jComboBoxid_lineaAntiguedadesInventariosGenerico.getItemCount()>0) {
					jComboBoxid_lineaAntiguedadesInventariosGenerico.setSelectedIndex(0);
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

					if(this.antiguedadesinventarios!=null) {
						this.antiguedadesinventarios.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
						this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_grupoAntiguedadesInventarios.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoAntiguedadesInventarios.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_grupoAntiguedadesInventarios.getItemCount()>0) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_grupoAntiguedadesInventarios.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaAntiguedadesInventarios") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios!=null) {
						jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios!=null) {
							//jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoAntiguedadesInventariosGenerico)throws Exception
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
				jComboBoxid_linea_grupoAntiguedadesInventariosGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoAntiguedadesInventariosGenerico!=null && jComboBoxid_linea_grupoAntiguedadesInventariosGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoAntiguedadesInventariosGenerico.setSelectedIndex(0);
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

					if(this.antiguedadesinventarios!=null) {
						this.antiguedadesinventarios.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
						this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_categoriaAntiguedadesInventarios.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaAntiguedadesInventarios.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_categoriaAntiguedadesInventarios.getItemCount()>0) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_categoriaAntiguedadesInventarios.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaAntiguedadesInventarios") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios!=null) {
						jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios!=null) {
							//jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaAntiguedadesInventariosGenerico)throws Exception
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
				jComboBoxid_linea_categoriaAntiguedadesInventariosGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaAntiguedadesInventariosGenerico!=null && jComboBoxid_linea_categoriaAntiguedadesInventariosGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaAntiguedadesInventariosGenerico.setSelectedIndex(0);
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

					if(this.antiguedadesinventarios!=null) {
						this.antiguedadesinventarios.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
						this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_marcaAntiguedadesInventarios.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaAntiguedadesInventarios.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_marcaAntiguedadesInventarios.getItemCount()>0) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_marcaAntiguedadesInventarios.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaAntiguedadesInventarios") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios!=null) {
						jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios!=null) {
							//jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaAntiguedadesInventariosGenerico)throws Exception
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
				jComboBoxid_linea_marcaAntiguedadesInventariosGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaAntiguedadesInventariosGenerico!=null && jComboBoxid_linea_marcaAntiguedadesInventariosGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaAntiguedadesInventariosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(AntiguedadesInventarios antiguedadesinventarios,JComboBox jComboBoxid_bodegaAntiguedadesInventariosGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaAntiguedadesInventariosGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_bodegaAntiguedadesInventarios.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaAntiguedadesInventariosGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				antiguedadesinventarios.setid_bodega(bodegaAux.getId());
				antiguedadesinventarios.setbodega_descripcion(AntiguedadesInventariosConstantesFunciones.getBodegaDescripcion(bodegaAux));
				antiguedadesinventarios.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(AntiguedadesInventarios antiguedadesinventarios,JComboBox jComboBoxid_empresaAntiguedadesInventariosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaAntiguedadesInventariosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_empresaAntiguedadesInventarios.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaAntiguedadesInventariosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				antiguedadesinventarios.setid_empresa(empresaAux.getId());
				antiguedadesinventarios.setempresa_descripcion(AntiguedadesInventariosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				antiguedadesinventarios.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(AntiguedadesInventarios antiguedadesinventarios,JComboBox jComboBoxid_sucursalAntiguedadesInventariosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalAntiguedadesInventariosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_sucursalAntiguedadesInventarios.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalAntiguedadesInventariosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				antiguedadesinventarios.setid_sucursal(sucursalAux.getId());
				antiguedadesinventarios.setsucursal_descripcion(AntiguedadesInventariosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				antiguedadesinventarios.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(AntiguedadesInventarios antiguedadesinventarios,JComboBox jComboBoxid_lineaAntiguedadesInventariosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaAntiguedadesInventariosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_lineaAntiguedadesInventarios.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaAntiguedadesInventariosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				antiguedadesinventarios.setid_linea(lineaAux.getId());
				antiguedadesinventarios.setlinea_descripcion(AntiguedadesInventariosConstantesFunciones.getLineaDescripcion(lineaAux));
				antiguedadesinventarios.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(AntiguedadesInventarios antiguedadesinventarios,JComboBox jComboBoxid_linea_grupoAntiguedadesInventariosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoAntiguedadesInventariosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_grupoAntiguedadesInventarios.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoAntiguedadesInventariosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				antiguedadesinventarios.setid_linea_grupo(lineaAux.getId());
				antiguedadesinventarios.setlineagrupo_descripcion(AntiguedadesInventariosConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				antiguedadesinventarios.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(AntiguedadesInventarios antiguedadesinventarios,JComboBox jComboBoxid_linea_categoriaAntiguedadesInventariosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaAntiguedadesInventariosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_categoriaAntiguedadesInventarios.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaAntiguedadesInventariosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				antiguedadesinventarios.setid_linea_categoria(lineaAux.getId());
				antiguedadesinventarios.setlineacategoria_descripcion(AntiguedadesInventariosConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				antiguedadesinventarios.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(AntiguedadesInventarios antiguedadesinventarios,JComboBox jComboBoxid_linea_marcaAntiguedadesInventariosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaAntiguedadesInventariosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_marcaAntiguedadesInventarios.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaAntiguedadesInventariosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				antiguedadesinventarios.setid_linea_marca(lineaAux.getId());
				antiguedadesinventarios.setlineamarca_descripcion(AntiguedadesInventariosConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				antiguedadesinventarios.setLineaMarca(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { 
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_bodegaAntiguedadesInventarios.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_bodegaAntiguedadesInventarios.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { 
					}

					if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaAntiguedadesInventarios") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.addItem(bodega);
							}
						}

						if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { 
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_empresaAntiguedadesInventarios.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_empresaAntiguedadesInventarios.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { 
					}

					if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { 
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_sucursalAntiguedadesInventarios.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_sucursalAntiguedadesInventarios.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { 
					}

					if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { 
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_lineaAntiguedadesInventarios.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_lineaAntiguedadesInventarios.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { 
					}

					if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaAntiguedadesInventarios") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.addItem(linea);
							}
						}

						if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { 
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_grupoAntiguedadesInventarios.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_grupoAntiguedadesInventarios.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { 
					}

					if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaAntiguedadesInventarios") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.addItem(lineagrupo);
							}
						}

						if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { 
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_categoriaAntiguedadesInventarios.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_categoriaAntiguedadesInventarios.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { 
					}

					if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaAntiguedadesInventarios") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.addItem(lineacategoria);
							}
						}

						if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { 
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_marcaAntiguedadesInventarios.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_marcaAntiguedadesInventarios.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { 
					}

					if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaAntiguedadesInventarios") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.addItem(lineamarca);
							}
						}

						if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameBodegaForeignKey(Bodega bodega,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_bodegaAntiguedadesInventarios.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_bodegaAntiguedadesInventarios.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_empresaAntiguedadesInventarios.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_empresaAntiguedadesInventarios.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_sucursalAntiguedadesInventarios.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_sucursalAntiguedadesInventarios.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_lineaAntiguedadesInventarios.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_lineaAntiguedadesInventarios.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_grupoAntiguedadesInventarios.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_grupoAntiguedadesInventarios.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_categoriaAntiguedadesInventarios.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_categoriaAntiguedadesInventarios.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_marcaAntiguedadesInventarios.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_marcaAntiguedadesInventarios.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesAntiguedadesInventarios() throws Exception {
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
		
	public AntiguedadesInventariosParameterReturnGeneral getAntiguedadesInventariosParameterGeneral() {
		return this.antiguedadesinventariosParameterGeneral;
	}
	
	public void setAntiguedadesInventariosParameterGeneral(AntiguedadesInventariosParameterReturnGeneral antiguedadesinventariosParameterGeneral) {
		this.antiguedadesinventariosParameterGeneral = antiguedadesinventariosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAntiguedadesInventarios() {
		return isPermisoTodoAntiguedadesInventarios;
	}

	public void setIsPermisoTodoAntiguedadesInventarios(Boolean isPermisoTodoAntiguedadesInventarios) {
		this.isPermisoTodoAntiguedadesInventarios = isPermisoTodoAntiguedadesInventarios;
	}

	public Boolean getIsPermisoNuevoAntiguedadesInventarios() {
		return isPermisoNuevoAntiguedadesInventarios;
	}

	public void setIsPermisoNuevoAntiguedadesInventarios(Boolean isPermisoNuevoAntiguedadesInventarios) {
		this.isPermisoNuevoAntiguedadesInventarios = isPermisoNuevoAntiguedadesInventarios;
	}

	public Boolean getIsPermisoActualizarAntiguedadesInventarios() {
		return isPermisoActualizarAntiguedadesInventarios;
	}

	public void setIsPermisoActualizarAntiguedadesInventarios(Boolean isPermisoActualizarAntiguedadesInventarios) {
		this.isPermisoActualizarAntiguedadesInventarios = isPermisoActualizarAntiguedadesInventarios;
	}

	public Boolean getIsPermisoEliminarAntiguedadesInventarios() {
		return isPermisoEliminarAntiguedadesInventarios;
	}

	public void setIsPermisoEliminarAntiguedadesInventarios(Boolean isPermisoEliminarAntiguedadesInventarios) {
		this.isPermisoEliminarAntiguedadesInventarios = isPermisoEliminarAntiguedadesInventarios;
	}

	public Boolean getIsPermisoGuardarCambiosAntiguedadesInventarios() {
		return isPermisoGuardarCambiosAntiguedadesInventarios;
	}

	public void setIsPermisoGuardarCambiosAntiguedadesInventarios(Boolean isPermisoGuardarCambiosAntiguedadesInventarios) {
		this.isPermisoGuardarCambiosAntiguedadesInventarios = isPermisoGuardarCambiosAntiguedadesInventarios;
	}
	
	public Boolean getIsPermisoConsultaAntiguedadesInventarios() {
		return isPermisoConsultaAntiguedadesInventarios;
	}

	public void setIsPermisoConsultaAntiguedadesInventarios(Boolean isPermisoConsultaAntiguedadesInventarios) {
		this.isPermisoConsultaAntiguedadesInventarios = isPermisoConsultaAntiguedadesInventarios;
	}

	public Boolean getIsPermisoBusquedaAntiguedadesInventarios() {
		return isPermisoBusquedaAntiguedadesInventarios;
	}

	public void setIsPermisoBusquedaAntiguedadesInventarios(Boolean isPermisoBusquedaAntiguedadesInventarios) {
		this.isPermisoBusquedaAntiguedadesInventarios = isPermisoBusquedaAntiguedadesInventarios;
	}

	public Boolean getIsPermisoReporteAntiguedadesInventarios() {
		return isPermisoReporteAntiguedadesInventarios;
	}

	public void setIsPermisoReporteAntiguedadesInventarios(Boolean isPermisoReporteAntiguedadesInventarios) {
		this.isPermisoReporteAntiguedadesInventarios = isPermisoReporteAntiguedadesInventarios;
	}
	
	public Boolean getIsPermisoPaginacionMedioAntiguedadesInventarios() {
		return isPermisoPaginacionMedioAntiguedadesInventarios;
	}

	public void setIsPermisoPaginacionMedioAntiguedadesInventarios(Boolean isPermisoPaginacionMedioAntiguedadesInventarios) {
		this.isPermisoPaginacionMedioAntiguedadesInventarios = isPermisoPaginacionMedioAntiguedadesInventarios;
	}
	
	public Boolean getIsPermisoPaginacionTodoAntiguedadesInventarios() {
		return isPermisoPaginacionTodoAntiguedadesInventarios;
	}

	public void setIsPermisoPaginacionTodoAntiguedadesInventarios(Boolean isPermisoPaginacionTodoAntiguedadesInventarios) {
		this.isPermisoPaginacionTodoAntiguedadesInventarios = isPermisoPaginacionTodoAntiguedadesInventarios;
	}
	
	public Boolean getIsPermisoPaginacionAltoAntiguedadesInventarios() {
		return isPermisoPaginacionAltoAntiguedadesInventarios;
	}

	public void setIsPermisoPaginacionAltoAntiguedadesInventarios(Boolean isPermisoPaginacionAltoAntiguedadesInventarios) {
		this.isPermisoPaginacionAltoAntiguedadesInventarios = isPermisoPaginacionAltoAntiguedadesInventarios;
	}
	
	public Boolean getIsPermisoCopiarAntiguedadesInventarios() {
		return isPermisoCopiarAntiguedadesInventarios;
	}

	public void setIsPermisoCopiarAntiguedadesInventarios(Boolean isPermisoCopiarAntiguedadesInventarios) {
		this.isPermisoCopiarAntiguedadesInventarios = isPermisoCopiarAntiguedadesInventarios;
	}
	
	public Boolean getIsPermisoVerFormAntiguedadesInventarios() {
		return isPermisoVerFormAntiguedadesInventarios;
	}

	public void setIsPermisoVerFormAntiguedadesInventarios(Boolean isPermisoVerFormAntiguedadesInventarios) {
		this.isPermisoVerFormAntiguedadesInventarios = isPermisoVerFormAntiguedadesInventarios;
	}
	
	public Boolean getIsPermisoDuplicarAntiguedadesInventarios() {
		return isPermisoDuplicarAntiguedadesInventarios;
	}

	public void setIsPermisoDuplicarAntiguedadesInventarios(Boolean isPermisoDuplicarAntiguedadesInventarios) {
		this.isPermisoDuplicarAntiguedadesInventarios = isPermisoDuplicarAntiguedadesInventarios;
	}
	
	public Boolean getIsPermisoOrdenAntiguedadesInventarios() {
		return isPermisoOrdenAntiguedadesInventarios;
	}

	public void setIsPermisoOrdenAntiguedadesInventarios(Boolean isPermisoOrdenAntiguedadesInventarios) {
		this.isPermisoOrdenAntiguedadesInventarios = isPermisoOrdenAntiguedadesInventarios;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAntiguedadesInventarios() {
		return isVisibilidadCeldaNuevoAntiguedadesInventarios;
	}

	public void setIsVisibilidadCeldaNuevoAntiguedadesInventarios(Boolean isVisibilidadCeldaNuevoAntiguedadesInventarios) {
		this.isVisibilidadCeldaNuevoAntiguedadesInventarios = isVisibilidadCeldaNuevoAntiguedadesInventarios;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAntiguedadesInventarios() {
		return isVisibilidadCeldaDuplicarAntiguedadesInventarios;
	}

	public void setIsVisibilidadCeldaDuplicarAntiguedadesInventarios(Boolean isVisibilidadCeldaDuplicarAntiguedadesInventarios) {
		this.isVisibilidadCeldaDuplicarAntiguedadesInventarios = isVisibilidadCeldaDuplicarAntiguedadesInventarios;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAntiguedadesInventarios() {
		return isVisibilidadCeldaCopiarAntiguedadesInventarios;
	}

	public void setIsVisibilidadCeldaCopiarAntiguedadesInventarios(Boolean isVisibilidadCeldaCopiarAntiguedadesInventarios) {
		this.isVisibilidadCeldaCopiarAntiguedadesInventarios = isVisibilidadCeldaCopiarAntiguedadesInventarios;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAntiguedadesInventarios() {
		return isVisibilidadCeldaVerFormAntiguedadesInventarios;
	}

	public void setIsVisibilidadCeldaVerFormAntiguedadesInventarios(Boolean isVisibilidadCeldaVerFormAntiguedadesInventarios) {
		this.isVisibilidadCeldaVerFormAntiguedadesInventarios = isVisibilidadCeldaVerFormAntiguedadesInventarios;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAntiguedadesInventarios() {
		return isVisibilidadCeldaOrdenAntiguedadesInventarios;
	}

	public void setIsVisibilidadCeldaOrdenAntiguedadesInventarios(Boolean isVisibilidadCeldaOrdenAntiguedadesInventarios) {
		this.isVisibilidadCeldaOrdenAntiguedadesInventarios = isVisibilidadCeldaOrdenAntiguedadesInventarios;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios() {
		return isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios(Boolean isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios) {
		this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios = isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAntiguedadesInventarios() {
		return isVisibilidadCeldaModificarAntiguedadesInventarios;
	}

	public void setIsVisibilidadCeldaModificarAntiguedadesInventarios(Boolean isVisibilidadCeldaModificarAntiguedadesInventarios) {
		this.isVisibilidadCeldaModificarAntiguedadesInventarios = isVisibilidadCeldaModificarAntiguedadesInventarios;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAntiguedadesInventarios() {
		return isVisibilidadCeldaActualizarAntiguedadesInventarios;
	}

	public void setIsVisibilidadCeldaActualizarAntiguedadesInventarios(Boolean isVisibilidadCeldaActualizarAntiguedadesInventarios) {
		this.isVisibilidadCeldaActualizarAntiguedadesInventarios = isVisibilidadCeldaActualizarAntiguedadesInventarios;
	}

	public Boolean getIsVisibilidadCeldaEliminarAntiguedadesInventarios() {
		return isVisibilidadCeldaEliminarAntiguedadesInventarios;
	}

	public void setIsVisibilidadCeldaEliminarAntiguedadesInventarios(Boolean isVisibilidadCeldaEliminarAntiguedadesInventarios) {
		this.isVisibilidadCeldaEliminarAntiguedadesInventarios = isVisibilidadCeldaEliminarAntiguedadesInventarios;
	}

	public Boolean getIsVisibilidadCeldaCancelarAntiguedadesInventarios() {
		return isVisibilidadCeldaCancelarAntiguedadesInventarios;
	}

	public void setIsVisibilidadCeldaCancelarAntiguedadesInventarios(Boolean isVisibilidadCeldaCancelarAntiguedadesInventarios) {
		this.isVisibilidadCeldaCancelarAntiguedadesInventarios = isVisibilidadCeldaCancelarAntiguedadesInventarios;
	}

	public Boolean getIsVisibilidadCeldaGuardarAntiguedadesInventarios() {
		return isVisibilidadCeldaGuardarAntiguedadesInventarios;
	}

	public void setIsVisibilidadCeldaGuardarAntiguedadesInventarios(Boolean isVisibilidadCeldaGuardarAntiguedadesInventarios) {
		this.isVisibilidadCeldaGuardarAntiguedadesInventarios = isVisibilidadCeldaGuardarAntiguedadesInventarios;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAntiguedadesInventarios() {
		return isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAntiguedadesInventarios(Boolean isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios) {
		this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios = isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios;
	}
		
	public AntiguedadesInventariosSessionBean getantiguedadesinventariosSessionBean() {
		return this.antiguedadesinventariosSessionBean;
	}
	
	public void setantiguedadesinventariosSessionBean(AntiguedadesInventariosSessionBean antiguedadesinventariosSessionBean) {
		this.antiguedadesinventariosSessionBean=antiguedadesinventariosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaAntiguedadesInventarios() {
		return this.isVisibilidadBusquedaAntiguedadesInventarios;
	}

	public void setisVisibilidadBusquedaAntiguedadesInventarios(Boolean isVisibilidadBusquedaAntiguedadesInventarios) {
		this.isVisibilidadBusquedaAntiguedadesInventarios=isVisibilidadBusquedaAntiguedadesInventarios;
	}

	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventarios)throws Exception {
		try {
			
				this.setActualParaGuardarBodegaForeignKey(antiguedadesinventarios,null);
				this.setActualParaGuardarEmpresaForeignKey(antiguedadesinventarios,null);
				this.setActualParaGuardarSucursalForeignKey(antiguedadesinventarios,null);
				this.setActualParaGuardarLineaForeignKey(antiguedadesinventarios,null);
				this.setActualParaGuardarLineaGrupoForeignKey(antiguedadesinventarios,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(antiguedadesinventarios,null);
				this.setActualParaGuardarLineaMarcaForeignKey(antiguedadesinventarios,null);
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
	
	public void bugActualizarReferenciaActual(AntiguedadesInventarios antiguedadesinventarios,AntiguedadesInventarios antiguedadesinventariosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAntiguedadesInventarios(antiguedadesinventarios);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		antiguedadesinventariosAux.setId(antiguedadesinventarios.getId());
		antiguedadesinventariosAux.setVersionRow(antiguedadesinventarios.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(AntiguedadesInventarios antiguedadesinventariosLocal) throws Exception {
		
		if(this.antiguedadesinventariosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(AntiguedadesInventarios antiguedadesinventariosLocal) throws Exception {	
		if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				antiguedadesinventariosLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				antiguedadesinventariosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				antiguedadesinventariosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				antiguedadesinventariosLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				antiguedadesinventariosLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				antiguedadesinventariosLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				antiguedadesinventariosLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAntiguedadesInventariosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = antiguedadesinventariosValidator.getInvalidValues(this.antiguedadesinventarios);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(AntiguedadesInventarios antiguedadesinventarios,List<AntiguedadesInventarios> antiguedadesinventarioss) throws Exception {
	}		
	
	public void actualizarSelectedLista(AntiguedadesInventarios antiguedadesinventarios,List<AntiguedadesInventarios> antiguedadesinventarioss) throws Exception {
		try	{			
			AntiguedadesInventariosConstantesFunciones.actualizarSelectedLista(antiguedadesinventarios,antiguedadesinventarioss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<AntiguedadesInventarios> antiguedadesinventariossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				antiguedadesinventariossLocal=this.antiguedadesinventariosLogic.getAntiguedadesInventarioss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				antiguedadesinventariossLocal=this.antiguedadesinventarioss;
			}
			//ARCHITECTURE
		
			for(AntiguedadesInventarios antiguedadesinventariosLocal:antiguedadesinventariossLocal) {
				if(this.permiteMantenimiento(antiguedadesinventariosLocal) && antiguedadesinventariosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AntiguedadesInventariosConstantesFunciones.getAntiguedadesInventariosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AntiguedadesInventariosConstantesFunciones.NOMBRESUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_sucursalAntiguedadesInventarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AntiguedadesInventariosConstantesFunciones.NOMBRELINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_lineaAntiguedadesInventarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AntiguedadesInventariosConstantesFunciones.NOMBRELINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_linea_grupoAntiguedadesInventarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AntiguedadesInventariosConstantesFunciones.NOMBRELINEACATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_linea_categoriaAntiguedadesInventarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AntiguedadesInventariosConstantesFunciones.NOMBRELINEAMARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_linea_marcaAntiguedadesInventarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AntiguedadesInventariosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelcodigoAntiguedadesInventarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AntiguedadesInventariosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombreAntiguedadesInventarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AntiguedadesInventariosConstantesFunciones.NOMBREBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_bodegaAntiguedadesInventarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AntiguedadesInventariosConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_unidadAntiguedadesInventarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AntiguedadesInventariosConstantesFunciones.CANTIDADDISPONIBLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelcantidad_disponibleAntiguedadesInventarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AntiguedadesInventariosConstantesFunciones.FECHAULTIMACOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelfecha_ultima_compraAntiguedadesInventarios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AntiguedadesInventariosConstantesFunciones.FECHAULTIMAVENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelfecha_ultima_ventaAntiguedadesInventarios,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_sucursalAntiguedadesInventarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_lineaAntiguedadesInventarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_linea_grupoAntiguedadesInventarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_linea_categoriaAntiguedadesInventarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_linea_marcaAntiguedadesInventarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelcodigoAntiguedadesInventarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombreAntiguedadesInventarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_bodegaAntiguedadesInventarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_unidadAntiguedadesInventarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelcantidad_disponibleAntiguedadesInventarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelfecha_ultima_compraAntiguedadesInventarios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelfecha_ultima_ventaAntiguedadesInventarios,"");
		
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
		this.iIdNuevoAntiguedadesInventarios--;	
		
		
		this.antiguedadesinventariosAux=new AntiguedadesInventarios();
		
		this.antiguedadesinventariosAux.setId(this.iIdNuevoAntiguedadesInventarios);
		this.antiguedadesinventariosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().add(this.antiguedadesinventariosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.antiguedadesinventarioss.add(this.antiguedadesinventariosAux);
		}
		//ARCHITECTURE
		
		this.antiguedadesinventarios=this.antiguedadesinventariosAux;
		
		if(AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAntiguedadesInventarios(this.antiguedadesinventarios);
			this.setVariablesObjetoActualToFormularioForeignKeyAntiguedadesInventarios(this.antiguedadesinventarios);
		}
				
		//this.setDefaultControlesAntiguedadesInventarios();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAntiguedadesInventarios();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAntiguedadesInventarios();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAntiguedadesInventarios();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAntiguedadesInventarios(this.antiguedadesinventariosBean,this.antiguedadesinventarios,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAntiguedadesInventarios(this.antiguedadesinventariosReturnGeneral,this.antiguedadesinventariosBean,false);
		
		if(this.antiguedadesinventariosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAntiguedadesInventarios(this.antiguedadesinventariosReturnGeneral.getAntiguedadesInventarios());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAntiguedadesInventarios(this.antiguedadesinventariosReturnGeneral.getAntiguedadesInventarios());
		}
		
		if(this.antiguedadesinventariosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAntiguedadesInventarios(this.antiguedadesinventariosReturnGeneral.getAntiguedadesInventarios(),classes);//this.antiguedadesinventariosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAntiguedadesInventarios();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAntiguedadesInventarios();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.RecargarFormAntiguedadesInventarios(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAntiguedadesInventarios(false);
						
			if(antiguedadesinventariosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAntiguedadesInventarios();
			}
			
			this.actualizarVisualTableDatosAntiguedadesInventarios();
			
			this.jTableDatosAntiguedadesInventarios.setRowSelectionInterval(this.getIndiceNuevoAntiguedadesInventarios(), this.getIndiceNuevoAntiguedadesInventarios());
			
			this.seleccionarFilaTablaAntiguedadesInventariosActual();
						
			this.actualizarEstadoCeldasBotonesAntiguedadesInventarios("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAntiguedadesInventarios(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_venta_hastaAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarfecha_ultima_venta_hastaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_sucursalAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarnombre_sucursalAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_lineaAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarnombre_lineaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_grupoAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarnombre_linea_grupoAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_categoriaAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarnombre_linea_categoriaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_marcaAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarnombre_linea_marcaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldcodigoAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarcodigoAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombreAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarnombreAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_bodegaAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarnombre_bodegaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldnombre_unidadAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarnombre_unidadAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldcantidad_disponibleAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarcantidad_disponibleAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_compraAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarfecha_ultima_compraAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_ventaAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarfecha_ultima_ventaAntiguedadesInventarios);	
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_bodegaAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarid_bodegaAntiguedadesInventarios);//
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_empresaAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarid_empresaAntiguedadesInventarios);//
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_sucursalAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarid_sucursalAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_lineaAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarid_lineaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_grupoAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarid_linea_grupoAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_categoriaAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarid_linea_categoriaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_marcaAntiguedadesInventarios.setEnabled(isHabilitar && this.antiguedadesinventariosConstantesFunciones.activarid_linea_marcaAntiguedadesInventarios);
	};
	
	public void setDefaultControlesAntiguedadesInventarios() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAntiguedadesInventarios(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.antiguedadesinventariosSessionBean.setConGuardarRelaciones(true);			
			this.antiguedadesinventariosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTabbedPaneRelacionesAntiguedadesInventarios.setVisible(true);
			
					
		} else {
			//this.antiguedadesinventariosSessionBean.setConGuardarRelaciones(false);			
			this.antiguedadesinventariosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTabbedPaneRelacionesAntiguedadesInventarios.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoAntiguedadesInventarios() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AntiguedadesInventarios antiguedadesinventariosAux:this.antiguedadesinventariosLogic.getAntiguedadesInventarioss()) {
				if(antiguedadesinventariosAux.getId().equals(this.iIdNuevoAntiguedadesInventarios)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AntiguedadesInventarios antiguedadesinventariosAux:this.antiguedadesinventarioss) {
				if(antiguedadesinventariosAux.getId().equals(this.iIdNuevoAntiguedadesInventarios)) {
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
	
	public int getIndiceActualAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventarios,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AntiguedadesInventarios antiguedadesinventariosAux:this.antiguedadesinventariosLogic.getAntiguedadesInventarioss()) {
				if(antiguedadesinventariosAux.getId().equals(antiguedadesinventarios.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AntiguedadesInventarios antiguedadesinventariosAux:this.antiguedadesinventarioss) {
				if(antiguedadesinventariosAux.getId().equals(antiguedadesinventarios.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventariosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AntiguedadesInventarios antiguedadesinventariosAux:this.antiguedadesinventariosLogic.getAntiguedadesInventarioss()) {
				if(antiguedadesinventariosAux.getAntiguedadesInventariosOriginal().getId().equals(antiguedadesinventariosOriginal.getId())) {
					existe=true;
					antiguedadesinventariosOriginal.setId(antiguedadesinventariosAux.getId());
					antiguedadesinventariosOriginal.setVersionRow(antiguedadesinventariosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AntiguedadesInventarios antiguedadesinventariosAux:this.antiguedadesinventarioss) {
				if(antiguedadesinventariosAux.getAntiguedadesInventariosOriginal().getId().equals(antiguedadesinventariosOriginal.getId())) {
					existe=true;
					antiguedadesinventariosOriginal.setId(antiguedadesinventariosAux.getId());
					antiguedadesinventariosOriginal.setVersionRow(antiguedadesinventariosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAntiguedadesInventarios(Boolean esParaCancelar) throws Exception {
		antiguedadesinventariossAux=new ArrayList<AntiguedadesInventarios>();
		antiguedadesinventariosAux=new AntiguedadesInventarios();
		
		if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AntiguedadesInventarios antiguedadesinventariosAux:this.antiguedadesinventariosLogic.getAntiguedadesInventarioss()) {
					if(antiguedadesinventariosAux.getId()<0) {
						antiguedadesinventariossAux.add(antiguedadesinventariosAux);
					}		
				}
				this.iIdNuevoAntiguedadesInventarios=0L;
				this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().removeAll(antiguedadesinventariossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AntiguedadesInventarios antiguedadesinventariosAux:this.antiguedadesinventarioss) {
					if(antiguedadesinventariosAux.getId()<0) {
						antiguedadesinventariossAux.add(antiguedadesinventariosAux);
					}		
				}
				this.iIdNuevoAntiguedadesInventarios=0L;
				this.antiguedadesinventarioss.removeAll(antiguedadesinventariossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAntiguedadesInventarios 
					&& this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().size()>0
					) {
					antiguedadesinventariosAux=this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().get(this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().size() - 1);
				
					if(antiguedadesinventariosAux.getId()<0) {
						this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().remove(antiguedadesinventariosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAntiguedadesInventarios && this.antiguedadesinventarioss.size()>0) {
					antiguedadesinventariosAux=this.antiguedadesinventarioss.get(this.antiguedadesinventarioss.size() - 1);
				
					if(antiguedadesinventariosAux.getId()<0) {
						this.antiguedadesinventarioss.remove(antiguedadesinventariosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAntiguedadesInventarios(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(antiguedadesinventarios.getId()<0) {
				this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().remove(this.antiguedadesinventarios);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(antiguedadesinventarios.getId()<0) {
				this.antiguedadesinventarioss.remove(this.antiguedadesinventarios);
			}
		}			
	}
	
	public void setEstadosInicialesAntiguedadesInventarios(List<AntiguedadesInventarios> antiguedadesinventariossAux) throws Exception {
		AntiguedadesInventariosConstantesFunciones.setEstadosInicialesAntiguedadesInventarios(antiguedadesinventariossAux);
	}
	
	public void setEstadosInicialesAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventariosAux) throws Exception {
		AntiguedadesInventariosConstantesFunciones.setEstadosInicialesAntiguedadesInventarios(antiguedadesinventariosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAntiguedadesInventariosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAntiguedadesInventarios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAntiguedadesInventariosActual()) {
				if(!this.isEsNuevoAntiguedadesInventarios) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAntiguedadesInventarios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAntiguedadesInventarios=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAntiguedadesInventariosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Antiguedades Inventarios ?", "MANTENIMIENTO DE Antiguedades Inventarios", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAntiguedadesInventarios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(AntiguedadesInventarios antiguedadesinventarios) throws Exception {
		AntiguedadesInventariosConstantesFunciones.seleccionarAsignar(this.antiguedadesinventarios,antiguedadesinventarios);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAntiguedadesInventarios=this.isPermisoActualizarOriginalAntiguedadesInventarios;
			
			
			this.seleccionarAsignar(antiguedadesinventarios);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesAntiguedadesInventarios("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.antiguedadesinventariosSessionBean.setsFuncionBusquedaRapida(this.antiguedadesinventariosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoAntiguedadesInventarios) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAntiguedadesInventarios(esParaCancelar);				
				this.cancelarNuevoAntiguedadesInventarios(esParaCancelar);								
			}
			
			this.antiguedadesinventarios=new AntiguedadesInventarios();
			
			this.inicializarAntiguedadesInventarios();
			
			this.actualizarEstadoCeldasBotonesAntiguedadesInventarios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAntiguedadesInventarios() throws Exception {
		try {
			AntiguedadesInventariosConstantesFunciones.inicializarAntiguedadesInventarios(this.antiguedadesinventarios);
			
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
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAntiguedadesInventarioss(String sAccionBusqueda,List<AntiguedadesInventarios> antiguedadesinventariossParaReportes) throws Exception {
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
					sPathReporteFinal="AntiguedadesInventarios"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AntiguedadesInventariosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AntiguedadesInventariosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="AntiguedadesInventarios"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Antiguedades Inventarioses");		
		parameters.put("busquedapor", AntiguedadesInventariosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAntiguedadesInventarios=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AntiguedadesInventariosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AntiguedadesInventariosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAntiguedadesInventarios=new JRBeanArrayDataSource(AntiguedadesInventariosJInternalFrame.TraerAntiguedadesInventariosBeans(antiguedadesinventariossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAntiguedadesInventarios);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AntiguedadesInventariosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AntiguedadesInventariosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AntiguedadesInventariosBean.TraerAntiguedadesInventariosBeans(antiguedadesinventariossParaReportes).toArray()));
							
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
				this.generarExcelReporteAntiguedadesInventarioss(sAccionBusqueda,sTipoArchivoReporte,antiguedadesinventariossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAntiguedadesInventarioss(sAccionBusqueda,sTipoArchivoReporte,antiguedadesinventariossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAntiguedadesInventariosActionPerformed(null);
					//this.generarExcelReporteAntiguedadesInventarioss(sAccionBusqueda,sTipoArchivoReporte,antiguedadesinventariossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAntiguedadesInventarioss(sAccionBusqueda,sTipoArchivoReporte,antiguedadesinventariossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAntiguedadesInventarioss(sAccionBusqueda,sTipoArchivoReporte,antiguedadesinventariossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAntiguedadesInventarioss(sAccionBusqueda,sTipoArchivoReporte,antiguedadesinventariossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAntiguedadesInventarioss(String sAccionBusqueda,String sTipoArchivoReporte,List<AntiguedadesInventarios> antiguedadesinventariossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"antiguedadesinventarios";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AntiguedadesInventarioss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAntiguedadesInventarios("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(AntiguedadesInventarios antiguedadesinventarios : antiguedadesinventariossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AntiguedadesInventariosConstantesFunciones.generarExcelReporteDataAntiguedadesInventarios("NORMAL",row,workbook,antiguedadesinventarios,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Antiguedades Inventarios",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAntiguedadesInventarios(String sTipo,Row row,Workbook workbook) {
		
		AntiguedadesInventariosConstantesFunciones.generarExcelReporteHeaderAntiguedadesInventarios(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAntiguedadesInventarioss(String sAccionBusqueda,String sTipoArchivoReporte,List<AntiguedadesInventarios> antiguedadesinventariossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"antiguedadesinventarios_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AntiguedadesInventarioss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(AntiguedadesInventarios antiguedadesinventarios : antiguedadesinventariossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AntiguedadesInventariosConstantesFunciones.getAntiguedadesInventariosDescripcion(antiguedadesinventarios));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getfecha_ultima_venta_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getnombre_sucursal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getnombre_linea());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getnombre_linea_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getnombre_linea_categoria());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getnombre_linea_marca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getnombre_bodega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getcantidad_disponible());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getfecha_ultima_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(antiguedadesinventarios.getfecha_ultima_venta());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Antiguedades Inventarios",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAntiguedadesInventarioss(String sAccionBusqueda,String sTipoArchivoReporte,List<AntiguedadesInventarios> antiguedadesinventariossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<AntiguedadesInventarios> antiguedadesinventariossRespaldo=null;
		
		classes=AntiguedadesInventariosConstantesFunciones.getClassesRelationshipsOfAntiguedadesInventarios(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.antiguedadesinventariosLogic.setDatosCliente(this.datosCliente);
		this.antiguedadesinventariosLogic.setDatosDeep(this.datosDeep);
		this.antiguedadesinventariosLogic.setIsConDeep(true);
		
		antiguedadesinventariossRespaldo=this.antiguedadesinventariosLogic.getAntiguedadesInventarioss();
		
		this.antiguedadesinventariosLogic.setAntiguedadesInventarioss(antiguedadesinventariossParaReportes);	
		this.antiguedadesinventariosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		antiguedadesinventariossParaReportes=this.antiguedadesinventariosLogic.getAntiguedadesInventarioss();
		this.antiguedadesinventariosLogic.setAntiguedadesInventarioss(antiguedadesinventariossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"antiguedadesinventarios_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AntiguedadesInventarioss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAntiguedadesInventarios("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(AntiguedadesInventarios antiguedadesinventarios : antiguedadesinventariossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAntiguedadesInventarios("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AntiguedadesInventariosConstantesFunciones.generarExcelReporteDataAntiguedadesInventarios("NORMAL",row,workbook,antiguedadesinventarios,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(AntiguedadesInventariosConstantesFunciones.getAntiguedadesInventariosDescripcion(antiguedadesinventarios));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Antiguedades Inventarios",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAntiguedadesInventarios() throws Exception {		
		this.startProcessAntiguedadesInventarios(true);
	}
	
	public void startProcessAntiguedadesInventarios(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAntiguedadesInventarios ,this.jPanelParametrosReportesAntiguedadesInventarios, this.jScrollPanelDatosAntiguedadesInventarios,this.jPanelPaginacionAntiguedadesInventarios, this.jScrollPanelDatosEdicionAntiguedadesInventarios, this.jPanelAccionesAntiguedadesInventarios,this.jPanelAccionesFormularioAntiguedadesInventarios,this.jmenuBarAntiguedadesInventarios,this.jmenuBarDetalleAntiguedadesInventarios,this.jTtoolBarAntiguedadesInventarios,this.jTtoolBarDetalleAntiguedadesInventarios);		
		
		final JTabbedPane jTabbedPaneBusquedasAntiguedadesInventarios=this.jTabbedPaneBusquedasAntiguedadesInventarios; 
		
		final JPanel jPanelParametrosReportesAntiguedadesInventarios=this.jPanelParametrosReportesAntiguedadesInventarios;
		//final JScrollPane jScrollPanelDatosAntiguedadesInventarios=this.jScrollPanelDatosAntiguedadesInventarios;
		final JTable jTableDatosAntiguedadesInventarios=this.jTableDatosAntiguedadesInventarios;		
		final JPanel jPanelPaginacionAntiguedadesInventarios=this.jPanelPaginacionAntiguedadesInventarios;
		//final JScrollPane jScrollPanelDatosEdicionAntiguedadesInventarios=this.jScrollPanelDatosEdicionAntiguedadesInventarios;
		final JPanel jPanelAccionesAntiguedadesInventarios=this.jPanelAccionesAntiguedadesInventarios;
		
		JPanel jPanelCamposAuxiliarAntiguedadesInventarios=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAntiguedadesInventarios=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
			jPanelCamposAuxiliarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelCamposAntiguedadesInventarios;
			jPanelAccionesFormularioAuxiliarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelAccionesFormularioAntiguedadesInventarios;
		}
		
		final JPanel jPanelCamposAntiguedadesInventarios=jPanelCamposAuxiliarAntiguedadesInventarios;
		final JPanel jPanelAccionesFormularioAntiguedadesInventarios=jPanelAccionesFormularioAuxiliarAntiguedadesInventarios;
		
		
		final JMenuBar jmenuBarAntiguedadesInventarios=this.jmenuBarAntiguedadesInventarios;
		final JToolBar jTtoolBarAntiguedadesInventarios=this.jTtoolBarAntiguedadesInventarios;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAntiguedadesInventarios=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAntiguedadesInventarios=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
			jmenuBarDetalleAuxiliarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jmenuBarDetalleAntiguedadesInventarios;
			jTtoolBarDetalleAuxiliarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jTtoolBarDetalleAntiguedadesInventarios;
		}
		
		final JMenuBar jmenuBarDetalleAntiguedadesInventarios=jmenuBarDetalleAuxiliarAntiguedadesInventarios;
		final JToolBar jTtoolBarDetalleAntiguedadesInventarios=jTtoolBarDetalleAuxiliarAntiguedadesInventarios;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAntiguedadesInventarios;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAntiguedadesInventarios;
			processRunnable.jTableDatos=jTableDatosAntiguedadesInventarios;
			processRunnable.jPanelCampos=jPanelCamposAntiguedadesInventarios;
			processRunnable.jPanelPaginacion=jPanelPaginacionAntiguedadesInventarios;
			processRunnable.jPanelAcciones=jPanelAccionesAntiguedadesInventarios;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAntiguedadesInventarios;
			
			
			processRunnable.jmenuBar=jmenuBarAntiguedadesInventarios;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAntiguedadesInventarios;
			processRunnable.jTtoolBar=jTtoolBarAntiguedadesInventarios;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAntiguedadesInventarios;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAntiguedadesInventarios ,jPanelParametrosReportesAntiguedadesInventarios,jTableDatosAntiguedadesInventarios, /*jScrollPanelDatosAntiguedadesInventarios,*/jPanelCamposAntiguedadesInventarios,jPanelPaginacionAntiguedadesInventarios, /*jScrollPanelDatosEdicionAntiguedadesInventarios,*/ jPanelAccionesAntiguedadesInventarios,jPanelAccionesFormularioAntiguedadesInventarios,jmenuBarAntiguedadesInventarios,jmenuBarDetalleAntiguedadesInventarios,jTtoolBarAntiguedadesInventarios,jTtoolBarDetalleAntiguedadesInventarios);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAntiguedadesInventarios ,jPanelParametrosReportesAntiguedadesInventarios, jScrollPanelDatosAntiguedadesInventarios,jPanelPaginacionAntiguedadesInventarios, jScrollPanelDatosEdicionAntiguedadesInventarios, jPanelAccionesAntiguedadesInventarios,jPanelAccionesFormularioAntiguedadesInventarios,jmenuBarAntiguedadesInventarios,jmenuBarDetalleAntiguedadesInventarios,jTtoolBarAntiguedadesInventarios,jTtoolBarDetalleAntiguedadesInventarios);
						
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
	
	public void finishProcessAntiguedadesInventarios() {// throws Exception 
		this.finishProcessAntiguedadesInventarios(true);
	}
	
	public void finishProcessAntiguedadesInventarios(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAntiguedadesInventarios ,this.jPanelParametrosReportesAntiguedadesInventarios, this.jScrollPanelDatosAntiguedadesInventarios,this.jPanelPaginacionAntiguedadesInventarios, this.jScrollPanelDatosEdicionAntiguedadesInventarios, this.jPanelAccionesAntiguedadesInventarios,this.jPanelAccionesFormularioAntiguedadesInventarios,this.jmenuBarAntiguedadesInventarios,this.jmenuBarDetalleAntiguedadesInventarios,this.jTtoolBarAntiguedadesInventarios,this.jTtoolBarDetalleAntiguedadesInventarios);		
		
		final JTabbedPane jTabbedPaneBusquedasAntiguedadesInventarios=this.jTabbedPaneBusquedasAntiguedadesInventarios; 
		
		final JPanel jPanelParametrosReportesAntiguedadesInventarios=this.jPanelParametrosReportesAntiguedadesInventarios;
		//final JScrollPane jScrollPanelDatosAntiguedadesInventarios=this.jScrollPanelDatosAntiguedadesInventarios;
		final JTable jTableDatosAntiguedadesInventarios=this.jTableDatosAntiguedadesInventarios;		
		final JPanel jPanelPaginacionAntiguedadesInventarios=this.jPanelPaginacionAntiguedadesInventarios;
		//final JScrollPane jScrollPanelDatosEdicionAntiguedadesInventarios=this.jScrollPanelDatosEdicionAntiguedadesInventarios;
		final JPanel jPanelAccionesAntiguedadesInventarios=this.jPanelAccionesAntiguedadesInventarios;
		
		JPanel jPanelCamposAuxiliarAntiguedadesInventarios=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAntiguedadesInventarios=new JPanel();
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
			jPanelCamposAuxiliarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelCamposAntiguedadesInventarios;
			jPanelAccionesFormularioAuxiliarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelAccionesFormularioAntiguedadesInventarios;
		}
		
		final JPanel jPanelCamposAntiguedadesInventarios=jPanelCamposAuxiliarAntiguedadesInventarios;
		final JPanel jPanelAccionesFormularioAntiguedadesInventarios=jPanelAccionesFormularioAuxiliarAntiguedadesInventarios;
		
		
		final JMenuBar jmenuBarAntiguedadesInventarios=this.jmenuBarAntiguedadesInventarios;		
		final JToolBar jTtoolBarAntiguedadesInventarios=this.jTtoolBarAntiguedadesInventarios;
				
		JMenuBar jmenuBarDetalleAuxiliarAntiguedadesInventarios=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAntiguedadesInventarios=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
			jmenuBarDetalleAuxiliarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jmenuBarDetalleAntiguedadesInventarios;
			jTtoolBarDetalleAuxiliarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jTtoolBarDetalleAntiguedadesInventarios;		
		}
		
		final JMenuBar jmenuBarDetalleAntiguedadesInventarios=jmenuBarDetalleAuxiliarAntiguedadesInventarios;
		final JToolBar jTtoolBarDetalleAntiguedadesInventarios=jTtoolBarDetalleAuxiliarAntiguedadesInventarios;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAntiguedadesInventarios;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAntiguedadesInventarios;
			processRunnable.jTableDatos=jTableDatosAntiguedadesInventarios;
			processRunnable.jPanelCampos=jPanelCamposAntiguedadesInventarios;
			processRunnable.jPanelPaginacion=jPanelPaginacionAntiguedadesInventarios;
			processRunnable.jPanelAcciones=jPanelAccionesAntiguedadesInventarios;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAntiguedadesInventarios;
			
			
			processRunnable.jmenuBar=jmenuBarAntiguedadesInventarios;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAntiguedadesInventarios;
			processRunnable.jTtoolBar=jTtoolBarAntiguedadesInventarios;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAntiguedadesInventarios;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAntiguedadesInventarios ,jPanelParametrosReportesAntiguedadesInventarios, jTableDatosAntiguedadesInventarios,/*jScrollPanelDatosAntiguedadesInventarios,*/jPanelCamposAntiguedadesInventarios,jPanelPaginacionAntiguedadesInventarios, /*jScrollPanelDatosEdicionAntiguedadesInventarios,*/ jPanelAccionesAntiguedadesInventarios,jPanelAccionesFormularioAntiguedadesInventarios,jmenuBarAntiguedadesInventarios,jmenuBarDetalleAntiguedadesInventarios,jTtoolBarAntiguedadesInventarios,jTtoolBarDetalleAntiguedadesInventarios));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAntiguedadesInventarios(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAntiguedadesInventarios(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAntiguedadesInventarios(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAntiguedadesInventarios(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAntiguedadesInventarios,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAntiguedadesInventarios,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAntiguedadesInventarios(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAntiguedadesInventarios,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAntiguedadesInventarios,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.antiguedadesinventariosConstantesFunciones.getsFinalQueryAntiguedadesInventarios();
		String  finalQueryPaginacionTodos=this.antiguedadesinventariosConstantesFunciones.getsFinalQueryAntiguedadesInventarios();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AntiguedadesInventariosConstantesFunciones.getArrayColumnasGlobalesNoAntiguedadesInventarios(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AntiguedadesInventariosConstantesFunciones.getArrayColumnasGlobalesAntiguedadesInventarios(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AntiguedadesInventariosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.antiguedadesinventariossEliminados= new ArrayList<AntiguedadesInventarios>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAntiguedadesInventarios();
		
				///*AntiguedadesInventariosSessionBean*/this.antiguedadesinventariosSessionBean=new AntiguedadesInventariosSessionBean();
			
			if(this.antiguedadesinventariosSessionBean==null) {
				this.antiguedadesinventariosSessionBean=new AntiguedadesInventariosSessionBean();
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
					this.iNumeroPaginacion=AntiguedadesInventariosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AntiguedadesInventariosConstantesFunciones.getClassesForeignKeysOfAntiguedadesInventarios(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/antiguedadesinventarios."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			antiguedadesinventariossAux= new ArrayList<AntiguedadesInventarios>();
			
				
			antiguedadesinventariosLogic.setDatosCliente(this.datosCliente);
			antiguedadesinventariosLogic.setDatosDeep(this.datosDeep);
			antiguedadesinventariosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaAntiguedadesInventarios")) {
				this.sDetalleReporte=AntiguedadesInventariosConstantesFunciones.getDetalleIndiceBusquedaAntiguedadesInventarios(id_bodegaBusquedaAntiguedadesInventarios,id_lineaBusquedaAntiguedadesInventarios,id_linea_grupoBusquedaAntiguedadesInventarios,id_linea_categoriaBusquedaAntiguedadesInventarios,id_linea_marcaBusquedaAntiguedadesInventarios,fecha_ultima_venta_hastaBusquedaAntiguedadesInventarios);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					antiguedadesinventariosLogic.getAntiguedadesInventariossBusquedaAntiguedadesInventarios(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaAntiguedadesInventarios,id_lineaBusquedaAntiguedadesInventarios,id_linea_grupoBusquedaAntiguedadesInventarios,id_linea_categoriaBusquedaAntiguedadesInventarios,id_linea_marcaBusquedaAntiguedadesInventarios,fecha_ultima_venta_hastaBusquedaAntiguedadesInventarios);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AntiguedadesInventariosConstantesFunciones.getDetalleIndiceBusquedaAntiguedadesInventarios(id_bodegaBusquedaAntiguedadesInventarios,id_lineaBusquedaAntiguedadesInventarios,id_linea_grupoBusquedaAntiguedadesInventarios,id_linea_categoriaBusquedaAntiguedadesInventarios,id_linea_marcaBusquedaAntiguedadesInventarios,fecha_ultima_venta_hastaBusquedaAntiguedadesInventarios);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AntiguedadesInventariosConstantesFunciones.getDetalleIndiceBusquedaAntiguedadesInventarios(id_bodegaBusquedaAntiguedadesInventarios,id_lineaBusquedaAntiguedadesInventarios,id_linea_grupoBusquedaAntiguedadesInventarios,id_linea_categoriaBusquedaAntiguedadesInventarios,id_linea_marcaBusquedaAntiguedadesInventarios,fecha_ultima_venta_hastaBusquedaAntiguedadesInventarios);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=antiguedadesinventariosLogic.getAntiguedadesInventarioss()==null||antiguedadesinventariosLogic.getAntiguedadesInventarioss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=antiguedadesinventarioss==null|| antiguedadesinventarioss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						antiguedadesinventariossAux=new ArrayList<AntiguedadesInventarios>();
						antiguedadesinventariossAux.addAll(antiguedadesinventariosLogic.getAntiguedadesInventarioss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							antiguedadesinventariossAux=new ArrayList<AntiguedadesInventarios>();
							antiguedadesinventariossAux.addAll(antiguedadesinventarioss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							antiguedadesinventariosLogic.getAntiguedadesInventariossBusquedaAntiguedadesInventarios(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaAntiguedadesInventarios,id_lineaBusquedaAntiguedadesInventarios,id_linea_grupoBusquedaAntiguedadesInventarios,id_linea_categoriaBusquedaAntiguedadesInventarios,id_linea_marcaBusquedaAntiguedadesInventarios,fecha_ultima_venta_hastaBusquedaAntiguedadesInventarios);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AntiguedadesInventariosConstantesFunciones.getDetalleIndiceBusquedaAntiguedadesInventarios(id_bodegaBusquedaAntiguedadesInventarios,id_lineaBusquedaAntiguedadesInventarios,id_linea_grupoBusquedaAntiguedadesInventarios,id_linea_categoriaBusquedaAntiguedadesInventarios,id_linea_marcaBusquedaAntiguedadesInventarios,fecha_ultima_venta_hastaBusquedaAntiguedadesInventarios);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AntiguedadesInventariosConstantesFunciones.getDetalleIndiceBusquedaAntiguedadesInventarios(id_bodegaBusquedaAntiguedadesInventarios,id_lineaBusquedaAntiguedadesInventarios,id_linea_grupoBusquedaAntiguedadesInventarios,id_linea_categoriaBusquedaAntiguedadesInventarios,id_linea_marcaBusquedaAntiguedadesInventarios,fecha_ultima_venta_hastaBusquedaAntiguedadesInventarios);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAntiguedadesInventarioss("BusquedaAntiguedadesInventarios",antiguedadesinventariosLogic.getAntiguedadesInventarioss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAntiguedadesInventarioss("BusquedaAntiguedadesInventarios",antiguedadesinventarioss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						antiguedadesinventariosLogic.setAntiguedadesInventarioss(new ArrayList<AntiguedadesInventarios>());
						antiguedadesinventariosLogic.getAntiguedadesInventarioss().addAll(antiguedadesinventariossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							antiguedadesinventarioss=new ArrayList<AntiguedadesInventarios>();
							antiguedadesinventarioss.addAll(antiguedadesinventariossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAntiguedadesInventarios();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAntiguedadesInventarios();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=antiguedadesinventariosLogic.getAntiguedadesInventarioss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=antiguedadesinventarioss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=antiguedadesinventariosLogic.getAntiguedadesInventarioss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=antiguedadesinventarioss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(AntiguedadesInventarios antiguedadesinventarios) {
		Boolean permite=true;
		
		if(this.antiguedadesinventarios.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AntiguedadesInventariosConstantesFunciones.getOrderByListaAntiguedadesInventarios();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AntiguedadesInventariosConstantesFunciones.getOrderByListaAntiguedadesInventarios();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariosLogic.getAntiguedadesInventarioss()) {
				if(antiguedadesinventarios.getsType().equals(Constantes2.S_TOTALES)) {
					antiguedadesinventariosTotales=antiguedadesinventarios;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AntiguedadesInventarios antiguedadesinventarios:this.antiguedadesinventarioss) {
				if(antiguedadesinventarios.getsType().equals(Constantes2.S_TOTALES)) {
					antiguedadesinventariosTotales=antiguedadesinventarios;
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
			this.antiguedadesinventariosAux=new AntiguedadesInventarios();
			this.antiguedadesinventariosAux.setsType(Constantes2.S_TOTALES);
			this.antiguedadesinventariosAux.setIsNew(false);
			this.antiguedadesinventariosAux.setIsChanged(false);
			this.antiguedadesinventariosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//AntiguedadesInventariosConstantesFunciones.TotalizarValoresFilaAntiguedadesInventarios(this.antiguedadesinventariosLogic.getAntiguedadesInventarioss(),this.antiguedadesinventariosAux);
				
				//this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().add(this.antiguedadesinventariosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AntiguedadesInventariosConstantesFunciones.TotalizarValoresFilaAntiguedadesInventarios(this.antiguedadesinventarioss,this.antiguedadesinventariosAux);
				
				this.antiguedadesinventarioss.add(this.antiguedadesinventariosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		antiguedadesinventariosTotales=new AntiguedadesInventarios();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().remove(antiguedadesinventariosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.antiguedadesinventarioss.remove(antiguedadesinventariosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		antiguedadesinventariosTotales=new AntiguedadesInventarios();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariosLogic.getAntiguedadesInventarioss()) {
				if(antiguedadesinventarios.getsType().equals(Constantes2.S_TOTALES)) {
					antiguedadesinventariosTotales=antiguedadesinventarios;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AntiguedadesInventariosConstantesFunciones.TotalizarValoresFilaAntiguedadesInventarios(this.antiguedadesinventariosLogic.getAntiguedadesInventarioss(),antiguedadesinventariosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AntiguedadesInventarios antiguedadesinventarios:this.antiguedadesinventarioss) {
				if(antiguedadesinventarios.getsType().equals(Constantes2.S_TOTALES)) {
					antiguedadesinventariosTotales=antiguedadesinventarios;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AntiguedadesInventariosConstantesFunciones.TotalizarValoresFilaAntiguedadesInventarios(this.antiguedadesinventarioss,antiguedadesinventariosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAntiguedadesInventariossBusquedaAntiguedadesInventarios()throws Exception {
		try {
			sAccionBusqueda="BusquedaAntiguedadesInventarios";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAntiguedadesInventariossFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAntiguedadesInventariossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAntiguedadesInventariossFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAntiguedadesInventariossFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAntiguedadesInventariossFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAntiguedadesInventariossFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAntiguedadesInventariossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAntiguedadesInventariossBusquedaAntiguedadesInventarios(String sFinalQuery,Long id_bodega,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Date fecha_ultima_venta_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//antiguedadesinventariosLogic.getAntiguedadesInventariossBusquedaAntiguedadesInventarios(sFinalQuery,this.pagination,id_bodega,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,fecha_ultima_venta_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAntiguedadesInventariossFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//antiguedadesinventariosLogic.getAntiguedadesInventariossFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAntiguedadesInventariossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//antiguedadesinventariosLogic.getAntiguedadesInventariossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAntiguedadesInventariossFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//antiguedadesinventariosLogic.getAntiguedadesInventariossFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAntiguedadesInventariossFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//antiguedadesinventariosLogic.getAntiguedadesInventariossFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAntiguedadesInventariossFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//antiguedadesinventariosLogic.getAntiguedadesInventariossFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAntiguedadesInventariossFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//antiguedadesinventariosLogic.getAntiguedadesInventariossFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAntiguedadesInventariossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//antiguedadesinventariosLogic.getAntiguedadesInventariossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosAntiguedadesInventarios() {
		this.isPermisoTodoAntiguedadesInventarios=false;
		this.isPermisoNuevoAntiguedadesInventarios=false;
		this.isPermisoActualizarAntiguedadesInventarios=false;
		this.isPermisoActualizarOriginalAntiguedadesInventarios=false;
		this.isPermisoEliminarAntiguedadesInventarios=false;
		this.isPermisoGuardarCambiosAntiguedadesInventarios=false;
		this.isPermisoConsultaAntiguedadesInventarios=true;
		this.isPermisoBusquedaAntiguedadesInventarios=true;
		this.isPermisoReporteAntiguedadesInventarios=true;
		this.isPermisoOrdenAntiguedadesInventarios=false;		
		this.isPermisoPaginacionMedioAntiguedadesInventarios=false;		
		this.isPermisoPaginacionAltoAntiguedadesInventarios=false;		
		this.isPermisoPaginacionTodoAntiguedadesInventarios=false;		
		this.isPermisoCopiarAntiguedadesInventarios=false;		
		this.isPermisoVerFormAntiguedadesInventarios=false;		
		this.isPermisoDuplicarAntiguedadesInventarios=false;
		this.isPermisoOrdenAntiguedadesInventarios=false;
	}
	
	public void setPermisosUsuarioAntiguedadesInventarios(Boolean isPermiso) {
		this.isPermisoTodoAntiguedadesInventarios=isPermiso;
		this.isPermisoNuevoAntiguedadesInventarios=isPermiso;
		this.isPermisoActualizarAntiguedadesInventarios=isPermiso;
		this.isPermisoActualizarOriginalAntiguedadesInventarios=isPermiso;
		this.isPermisoEliminarAntiguedadesInventarios=isPermiso;
		this.isPermisoGuardarCambiosAntiguedadesInventarios=isPermiso;
		this.isPermisoConsultaAntiguedadesInventarios=isPermiso;
		this.isPermisoBusquedaAntiguedadesInventarios=isPermiso;
		this.isPermisoReporteAntiguedadesInventarios=isPermiso;
		this.isPermisoOrdenAntiguedadesInventarios=isPermiso;		
		this.isPermisoPaginacionMedioAntiguedadesInventarios=isPermiso;		
		this.isPermisoPaginacionAltoAntiguedadesInventarios=isPermiso;		
		this.isPermisoPaginacionTodoAntiguedadesInventarios=isPermiso;		
		this.isPermisoCopiarAntiguedadesInventarios=isPermiso;		
		this.isPermisoVerFormAntiguedadesInventarios=isPermiso;		
		this.isPermisoDuplicarAntiguedadesInventarios=isPermiso;
		this.isPermisoOrdenAntiguedadesInventarios=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAntiguedadesInventarios(Boolean isPermiso) {
		//this.isPermisoTodoAntiguedadesInventarios=isPermiso;
		this.isPermisoNuevoAntiguedadesInventarios=isPermiso;
		this.isPermisoActualizarAntiguedadesInventarios=isPermiso;
		this.isPermisoActualizarOriginalAntiguedadesInventarios=isPermiso;
		this.isPermisoEliminarAntiguedadesInventarios=isPermiso;
		this.isPermisoGuardarCambiosAntiguedadesInventarios=isPermiso;
		//this.isPermisoConsultaAntiguedadesInventarios=isPermiso;
		//this.isPermisoBusquedaAntiguedadesInventarios=isPermiso;
		//this.isPermisoReporteAntiguedadesInventarios=isPermiso;
		//this.isPermisoOrdenAntiguedadesInventarios=isPermiso;		
		//this.isPermisoPaginacionMedioAntiguedadesInventarios=isPermiso;		
		//this.isPermisoPaginacionAltoAntiguedadesInventarios=isPermiso;		
		//this.isPermisoPaginacionTodoAntiguedadesInventarios=isPermiso;		
		//this.isPermisoCopiarAntiguedadesInventarios=isPermiso;		
		//this.isPermisoDuplicarAntiguedadesInventarios=isPermiso;
		//this.isPermisoOrdenAntiguedadesInventarios=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAntiguedadesInventariosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(AntiguedadesInventariosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebAntiguedadesInventarios(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAntiguedadesInventariosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioAntiguedadesInventariosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAntiguedadesInventariosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAntiguedadesInventariosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioAntiguedadesInventarios() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AntiguedadesInventariosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AntiguedadesInventariosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAntiguedadesInventarios=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAntiguedadesInventarios=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAntiguedadesInventarios=this.isPermisoActualizarAntiguedadesInventarios;
			this.isPermisoEliminarAntiguedadesInventarios=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAntiguedadesInventarios=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAntiguedadesInventarios=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAntiguedadesInventarios=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAntiguedadesInventarios=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAntiguedadesInventarios=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAntiguedadesInventarios=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAntiguedadesInventarios=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAntiguedadesInventarios=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAntiguedadesInventarios=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAntiguedadesInventarios=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAntiguedadesInventarios=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAntiguedadesInventarios=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAntiguedadesInventarios=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAntiguedadesInventarios.setToolTipText(this.jTableDatosAntiguedadesInventarios.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAntiguedadesInventarios(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAntiguedadesInventarios(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AntiguedadesInventariosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AntiguedadesInventariosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAntiguedadesInventarios() throws Exception {
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
	public void inicializarCombosForeignKeyAntiguedadesInventariosListas()throws Exception {
		try	{						
			
				this.bodegasForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAntiguedadesInventariosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AntiguedadesInventariosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyBodegaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BodegaConstantesFunciones.SFINALQUERY;

				this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyAntiguedadesInventarios()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {
			if(this.antiguedadesinventariosSessionBean==null) {
				this.antiguedadesinventariosSessionBean=new AntiguedadesInventariosSessionBean();
			}

			if(!this.antiguedadesinventariosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				Bodega bodega=new Bodega();
				BodegaConstantesFunciones.setBodegaDescripcion(bodega,Constantes.SMENSAJE_ESCOJA_OPCION);
				bodega.setId(null);

				if(!BodegaConstantesFunciones.ExisteEnLista(this.bodegasForeignKey,bodega,true)) {

					this.bodegasForeignKey.add(0,bodega);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.antiguedadesinventariosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.antiguedadesinventariosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.antiguedadesinventariosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.antiguedadesinventariosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.antiguedadesinventariosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.antiguedadesinventariosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
	
	public void initActionsCombosTodosForeignKeyAntiguedadesInventarios()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAntiguedadesInventarios(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAntiguedadesInventarios()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAntiguedadesInventarios();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventarios)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventarios,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAntiguedadesInventarios()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAntiguedadesInventarios()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAntiguedadesInventarios()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAntiguedadesInventarios()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAntiguedadesInventarios()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAntiguedadesInventarios()throws Exception {
		try {
			

			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAntiguedadesInventarios(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAntiguedadesInventarios()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_bodegaAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_bodegaAntiguedadesInventarios.getItemCount()>0) {
				this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_bodegaAntiguedadesInventarios.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_empresaAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_empresaAntiguedadesInventarios.getItemCount()>0) {
				this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_empresaAntiguedadesInventarios.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_sucursalAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_sucursalAntiguedadesInventarios.getItemCount()>0) {
				this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_sucursalAntiguedadesInventarios.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_lineaAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_lineaAntiguedadesInventarios.getItemCount()>0) {
				this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_lineaAntiguedadesInventarios.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_grupoAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_grupoAntiguedadesInventarios.getItemCount()>0) {
				this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_grupoAntiguedadesInventarios.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_categoriaAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_categoriaAntiguedadesInventarios.getItemCount()>0) {
				this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_categoriaAntiguedadesInventarios.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_marcaAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_marcaAntiguedadesInventarios.getItemCount()>0) {
				this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_marcaAntiguedadesInventarios.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public AntiguedadesInventariosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AntiguedadesInventariosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AntiguedadesInventariosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.antiguedadesinventariosSessionBean=new AntiguedadesInventariosSessionBean(); 
		this.antiguedadesinventariosConstantesFunciones=new AntiguedadesInventariosConstantesFunciones(); 
		this.antiguedadesinventariosBean=new AntiguedadesInventarios();//(this.antiguedadesinventariosConstantesFunciones); 		
		this.antiguedadesinventariosReturnGeneral=new AntiguedadesInventariosParameterReturnGeneral(); 
		
		this.antiguedadesinventariosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.antiguedadesinventariosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AntiguedadesInventariosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AntiguedadesInventariosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AntiguedadesInventariosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAntiguedadesInventarios(true);
			
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
			
			this.antiguedadesinventariosConstantesFunciones=new AntiguedadesInventariosConstantesFunciones(); 
			this.antiguedadesinventariosBean=new AntiguedadesInventarios();//this.antiguedadesinventariosConstantesFunciones); 			
			this.antiguedadesinventariosReturnGeneral=new AntiguedadesInventariosParameterReturnGeneral(); 
		
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Antiguedades Inventarios Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.antiguedadesinventarios=new AntiguedadesInventarios();
			this.antiguedadesinventarioss = new ArrayList<AntiguedadesInventarios>();
			this.antiguedadesinventariossAux = new ArrayList<AntiguedadesInventarios>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic=new AntiguedadesInventariosLogic();
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}
			
			//this.antiguedadesinventariosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.antiguedadesinventariosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAntiguedadesInventarios);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAntiguedadesInventarios!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAntiguedadesInventarios);	
					}
					
					if(this.jInternalFrameImportacionAntiguedadesInventarios!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAntiguedadesInventarios);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAntiguedadesInventarios!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAntiguedadesInventarios);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAntiguedadesInventarios);
				this.jInternalFrameDetalleFormAntiguedadesInventarios.setVisible(false);
				this.jInternalFrameDetalleFormAntiguedadesInventarios.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAntiguedadesInventarios!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAntiguedadesInventarios);
					this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setVisible(false);
					this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAntiguedadesInventarios!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAntiguedadesInventarios);
					this.jInternalFrameImportacionAntiguedadesInventarios.setVisible(false);
					this.jInternalFrameImportacionAntiguedadesInventarios.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAntiguedadesInventarios!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAntiguedadesInventarios);
					this.jInternalFrameOrderByAntiguedadesInventarios.setVisible(false);
					this.jInternalFrameOrderByAntiguedadesInventarios.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAntiguedadesInventariosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AntiguedadesInventariosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.antiguedadesinventariosReturnGeneral=new AntiguedadesInventariosParameterReturnGeneral();
			
			this.antiguedadesinventariosParameterGeneral=new AntiguedadesInventariosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.antiguedadesinventariosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AntiguedadesInventariosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AntiguedadesInventariosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado(),this.antiguedadesinventariosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AntiguedadesInventariosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado(),this.antiguedadesinventariosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAntiguedadesInventarios=false;
			this.isVisibilidadCeldaDuplicarAntiguedadesInventarios=true;
			this.isVisibilidadCeldaCopiarAntiguedadesInventarios=true;
			this.isVisibilidadCeldaVerFormAntiguedadesInventarios=true;
			this.isVisibilidadCeldaOrdenAntiguedadesInventarios=true;
			this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios=false;
			this.isVisibilidadCeldaModificarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaActualizarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaEliminarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaCancelarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaGuardarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios=false;
			
			
			this.isVisibilidadBusquedaAntiguedadesInventarios=true;
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAntiguedadesInventarios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAntiguedadesInventarios();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAntiguedadesInventarios(false);
			
			this.setPermisosUsuarioAntiguedadesInventarios();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() 
				|| (this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado() && this.antiguedadesinventariosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAntiguedadesInventariosClasesRelacionadas();
			}
			
			if(this.antiguedadesinventariosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAntiguedadesInventariosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAntiguedadesInventarios();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAntiguedadesInventarios();
			}
			
			if(!this.isPermisoBusquedaAntiguedadesInventarios) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAntiguedadesInventarios.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AntiguedadesInventariosConstantesFunciones.getTiposSeleccionarAntiguedadesInventarios());
				
				this.tiposColumnasSelect=AntiguedadesInventariosConstantesFunciones.getTiposSeleccionarAntiguedadesInventarios(true);
				
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
			//if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAntiguedadesInventarios();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioAntiguedadesInventarios(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioAntiguedadesInventarios(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAntiguedadesInventarios() ;
			
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
			
			this.bodegaLogic=new BodegaLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
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
				antiguedadesinventariosImplementable= (AntiguedadesInventariosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AntiguedadesInventariosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				antiguedadesinventariosImplementableHome= (AntiguedadesInventariosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AntiguedadesInventariosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.antiguedadesinventarioss= new ArrayList<AntiguedadesInventarios>();
			this.antiguedadesinventariossEliminados= new ArrayList<AntiguedadesInventarios>();
						
			this.isEsNuevoAntiguedadesInventarios=false;
			this.esParaAccionDesdeFormularioAntiguedadesInventarios=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAntiguedadesInventarios(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAntiguedadesInventarios();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AntiguedadesInventariosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAntiguedadesInventarios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAntiguedadesInventarios(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAntiguedadesInventarios();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAntiguedadesInventarios();
			}
			
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAntiguedadesInventarios.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAntiguedadesInventarios.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAntiguedadesInventarios.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAntiguedadesInventarios(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga AntiguedadesInventarios: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAntiguedadesInventarios() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAntiguedadesInventarios")) {
				iIndex=this.jInternalFrameDetalleFormAntiguedadesInventarios.jTabbedPaneRelacionesAntiguedadesInventarios.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAntiguedadesInventarios.jTabbedPaneRelacionesAntiguedadesInventarios.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAntiguedadesInventarios();	
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
	
	public void cargarCombosForeignKeyAntiguedadesInventarios(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAntiguedadesInventarios(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAntiguedadesInventarios(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAntiguedadesInventariosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAntiguedadesInventarios();
		
		this.cargarCombosFrameForeignKeyAntiguedadesInventarios();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAntiguedadesInventarios();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAntiguedadesInventarios();
		}
	}
	
	

	public void cargarCombosForeignKeyBodega(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBodega(this.bodegasForeignKey);

		} catch(Exception e) {
			throw e;
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
	
	public void jButtonNuevoAntiguedadesInventariosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.antiguedadesinventariosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
			
			
			if(jTableDatosAntiguedadesInventarios.getRowCount()>=1) {
				jTableDatosAntiguedadesInventarios.removeRowSelectionInterval(0, jTableDatosAntiguedadesInventarios.getRowCount()-1);						
			}
			
			this.isEsNuevoAntiguedadesInventarios=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAntiguedadesInventarios(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAntiguedadesInventarios(true);			
			//this.antiguedadesinventarios=new AntiguedadesInventarios();
			//this.antiguedadesinventarios.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAntiguedadesInventarios(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAntiguedadesInventarios() ;
			
			if(AntiguedadesInventariosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAntiguedadesInventarios(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.antiguedadesinventarios);	
			this.actualizarInformacion("INFO_PADRE",false,this.antiguedadesinventarios);				
			
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
			
			if(this.antiguedadesinventariosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar AntiguedadesInventarios: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAntiguedadesInventariosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<AntiguedadesInventarios> antiguedadesinventariossSeleccionados=new ArrayList<AntiguedadesInventarios>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAntiguedadesInventarios.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAntiguedadesInventarios.getSelectedRows().length;			
			}
			
			antiguedadesinventariossSeleccionados=this.getAntiguedadesInventariossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAntiguedadesInventarios--;			
				//AntiguedadesInventarios antiguedadesinventariosAux= new AntiguedadesInventarios();			
				//antiguedadesinventariosAux.setId(this.iIdNuevoAntiguedadesInventarios);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//AntiguedadesInventarios antiguedadesinventariosOrigen=new AntiguedadesInventarios();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(AntiguedadesInventarios antiguedadesinventariosOrigen : antiguedadesinventariossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							antiguedadesinventariosOrigen =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							antiguedadesinventariosOrigen =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAntiguedadesInventarios();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.antiguedadesinventarios.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAntiguedadesInventarios(antiguedadesinventariosOrigen,this.antiguedadesinventarios,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().add(this.antiguedadesinventariosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarioss.add(this.antiguedadesinventariosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAntiguedadesInventarios(false);
				
				this.jTableDatosAntiguedadesInventarios.setRowSelectionInterval(this.getIndiceNuevoAntiguedadesInventarios(), this.getIndiceNuevoAntiguedadesInventarios());
				
				int iLastRow =  this.jTableDatosAntiguedadesInventarios.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAntiguedadesInventarios.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAntiguedadesInventarios.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAntiguedadesInventarios(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<AntiguedadesInventarios> antiguedadesinventariossSeleccionados=new ArrayList<AntiguedadesInventarios>();									
		
			AntiguedadesInventarios antiguedadesinventariosOrigen=new AntiguedadesInventarios();
			AntiguedadesInventarios antiguedadesinventariosDestino=new AntiguedadesInventarios();
				
			antiguedadesinventariossSeleccionados=this.getAntiguedadesInventariossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAntiguedadesInventarios.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || antiguedadesinventariossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAntiguedadesInventarios.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						antiguedadesinventariosOrigen =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						antiguedadesinventariosOrigen =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						antiguedadesinventariosDestino =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						antiguedadesinventariosDestino =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				antiguedadesinventariosOrigen =antiguedadesinventariossSeleccionados.get(0);
				antiguedadesinventariosDestino =antiguedadesinventariossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAntiguedadesInventarios(antiguedadesinventariosOrigen,antiguedadesinventariosDestino,true,false);
				
				antiguedadesinventariosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(antiguedadesinventariosDestino,antiguedadesinventariosLogic.getAntiguedadesInventarioss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(antiguedadesinventariosDestino,antiguedadesinventarioss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAntiguedadesInventarios(false);
				
				//this.jTableDatosAntiguedadesInventarios.setRowSelectionInterval(this.getIndiceNuevoAntiguedadesInventarios(), this.getIndiceNuevoAntiguedadesInventarios());
				
				int iLastRow =  this.jTableDatosAntiguedadesInventarios.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAntiguedadesInventarios.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAntiguedadesInventarios.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAntiguedadesInventarios(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAntiguedadesInventarios.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAntiguedadesInventarios.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAntiguedadesInventarios.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAntiguedadesInventarios.setVisible(!isVisible);
			this.jPanelPaginacionAntiguedadesInventarios.setVisible(!isVisible);
			this.jPanelAccionesAntiguedadesInventarios.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAntiguedadesInventarios();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAntiguedadesInventarios();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAntiguedadesInventarios();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAntiguedadesInventarios();
			
			this.abrirFrameOrderByAntiguedadesInventarios();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAntiguedadesInventarios();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAntiguedadesInventarios(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAntiguedadesInventarios);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAntiguedadesInventarios.isMaximum()) {
					this.jInternalFrameDetalleFormAntiguedadesInventarios.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAntiguedadesInventarios.setSize(this.jInternalFrameDetalleFormAntiguedadesInventarios.iWidthFormulario,this.jInternalFrameDetalleFormAntiguedadesInventarios.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAntiguedadesInventarios.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAntiguedadesInventarios.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAntiguedadesInventarios.isMaximum()) {
						this.jInternalFrameDetalleFormAntiguedadesInventarios.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAntiguedadesInventarios.jContentPaneDetalleAntiguedadesInventarios.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAntiguedadesInventarios.jTabbedPaneRelacionesAntiguedadesInventarios.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAntiguedadesInventarios.jContentPaneDetalleAntiguedadesInventarios.getWidth(),AntiguedadesInventariosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAntiguedadesInventarios.jTabbedPaneRelacionesAntiguedadesInventarios.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAntiguedadesInventarios.jContentPaneDetalleAntiguedadesInventarios.getWidth(),AntiguedadesInventariosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAntiguedadesInventarios.jTabbedPaneRelacionesAntiguedadesInventarios.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAntiguedadesInventarios.jContentPaneDetalleAntiguedadesInventarios.getWidth(),AntiguedadesInventariosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAntiguedadesInventarios.setVisible(true);
	        this.jInternalFrameDetalleFormAntiguedadesInventarios.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAntiguedadesInventarios() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAntiguedadesInventarios==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAntiguedadesInventarios=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAntiguedadesInventarios,false,this);
				} else {
					this.jInternalFrameOrderByAntiguedadesInventarios=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAntiguedadesInventarios,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAntiguedadesInventarios);
				this.jInternalFrameOrderByAntiguedadesInventarios.setVisible(false);
				this.jInternalFrameOrderByAntiguedadesInventarios.setSelected(false);
				
				this.jInternalFrameOrderByAntiguedadesInventarios.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAntiguedadesInventarios"));
				
				this.inicializarActualizarBindingTablaOrderByAntiguedadesInventarios();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAntiguedadesInventarios() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAntiguedadesInventarios==null) {
				
				this.jInternalFrameImportacionAntiguedadesInventarios=new ImportacionJInternalFrame(AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAntiguedadesInventarios);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAntiguedadesInventarios);
				this.jInternalFrameImportacionAntiguedadesInventarios.setVisible(false);
				this.jInternalFrameImportacionAntiguedadesInventarios.setSelected(false);


				this.jInternalFrameImportacionAntiguedadesInventarios.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAntiguedadesInventarios"));
				this.jInternalFrameImportacionAntiguedadesInventarios.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAntiguedadesInventarios"));
				this.jInternalFrameImportacionAntiguedadesInventarios.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAntiguedadesInventarios"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAntiguedadesInventarios() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAntiguedadesInventarios==null) {
				this.jInternalFrameReporteDinamicoAntiguedadesInventarios=new ReporteDinamicoJInternalFrame(AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAntiguedadesInventarios);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAntiguedadesInventarios);
				this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setVisible(false);
				this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAntiguedadesInventarios"));
				this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAntiguedadesInventarios"));
				this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAntiguedadesInventarios"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAntiguedadesInventarios();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleAntiguedadesInventarios() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAntiguedadesInventarios);
			
	       	this.jInternalFrameDetalleFormAntiguedadesInventarios.setVisible(false);
	        this.jInternalFrameDetalleFormAntiguedadesInventarios.setSelected(false);
			
			//this.jInternalFrameDetalleFormAntiguedadesInventarios.dispose();
			//this.jInternalFrameDetalleFormAntiguedadesInventarios=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAntiguedadesInventarios() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setVisible(true);
	        this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAntiguedadesInventarios() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAntiguedadesInventarios.setVisible(true);
	        this.jInternalFrameImportacionAntiguedadesInventarios.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAntiguedadesInventarios() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAntiguedadesInventarios.setVisible(true);
	        this.jInternalFrameOrderByAntiguedadesInventarios.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAntiguedadesInventarios() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAntiguedadesInventarios.setVisible(false);
	        this.jInternalFrameOrderByAntiguedadesInventarios.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAntiguedadesInventarios() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setVisible(false);
	        this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAntiguedadesInventarios() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAntiguedadesInventarios.setVisible(false);
	        this.jInternalFrameImportacionAntiguedadesInventarios.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAntiguedadesInventarios(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAntiguedadesInventarios(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAntiguedadesInventarios(true);
			//this.isEsNuevoAntiguedadesInventarios=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAntiguedadesInventarios("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAntiguedadesInventarios(false) ;
			
			if(antiguedadesinventariosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(AntiguedadesInventariosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAntiguedadesInventarios(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAntiguedadesInventarios(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAntiguedadesInventariosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAntiguedadesInventarios(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAntiguedadesInventarios(true);
			//this.isEsNuevoAntiguedadesInventarios=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.antiguedadesinventarios.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAntiguedadesInventarios("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAntiguedadesInventarios(false) ;
			
			if(AntiguedadesInventariosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAntiguedadesInventarios(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAntiguedadesInventarios(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAntiguedadesInventarios.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAntiguedadesInventarios.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAntiguedadesInventarios.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAntiguedadesInventarios.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAntiguedadesInventarios.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAntiguedadesInventarios(false);
			
			//if(!this.isEsNuevoAntiguedadesInventarios) {								
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				
			}
			
			if(this.permiteMantenimiento(this.antiguedadesinventarios)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAntiguedadesInventarios=true;
					this.inicializarActualizarBindingTablaAntiguedadesInventarios(false);
					this.isEsNuevoAntiguedadesInventarios=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAntiguedadesInventarios=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAntiguedadesInventarios=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAntiguedadesInventarios(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAntiguedadesInventarios(false);
				
				this.habilitarDeshabilitarControlesAntiguedadesInventarios(false);
			
												
				
				if(AntiguedadesInventariosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAntiguedadesInventarios();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAntiguedadesInventariosActionPerformed(evt,antiguedadesinventariosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAntiguedadesInventarios(this.antiguedadesinventarios,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAntiguedadesInventarios.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,antiguedadesinventariosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.antiguedadesinventarios.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(AntiguedadesInventarios.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AntiguedadesInventarios.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				this.antiguedadesinventarios.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				this.antiguedadesinventarios.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.antiguedadesinventarios)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AntiguedadesInventariosModel) this.jTableDatosAntiguedadesInventarios.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAntiguedadesInventarios=true;
				this.inicializarActualizarBindingTablaAntiguedadesInventarios(false);
				this.isEsNuevoAntiguedadesInventarios=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAntiguedadesInventarios(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAntiguedadesInventarios(false);
				
				this.habilitarDeshabilitarControlesAntiguedadesInventarios(false);
				
				
				
				if(AntiguedadesInventariosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAntiguedadesInventarios();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAntiguedadesInventarios.getRowCount()>=1) {
				jTableDatosAntiguedadesInventarios.removeRowSelectionInterval(0, jTableDatosAntiguedadesInventarios.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAntiguedadesInventarios(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAntiguedadesInventarios(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAntiguedadesInventarios(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAntiguedadesInventarios(false) ;
			
			this.isEsNuevoAntiguedadesInventarios=false;
			
			if(AntiguedadesInventariosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAntiguedadesInventarios();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAntiguedadesInventarios(false);
				
				//SI ES MANUAL
				if(AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAntiguedadesInventarios();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAntiguedadesInventarios--;			
			//AntiguedadesInventarios antiguedadesinventariosAux= new AntiguedadesInventarios();			
			//antiguedadesinventariosAux.setId(this.iIdNuevoAntiguedadesInventarios);
			
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAntiguedadesInventarios();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
			
			this.antiguedadesinventarios.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().add(this.antiguedadesinventariosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.antiguedadesinventarioss.add(this.antiguedadesinventariosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAntiguedadesInventarios(false);
			
			this.jTableDatosAntiguedadesInventarios.setRowSelectionInterval(this.getIndiceNuevoAntiguedadesInventarios(), this.getIndiceNuevoAntiguedadesInventarios());
			
			int iLastRow =  this.jTableDatosAntiguedadesInventarios.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAntiguedadesInventarios.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAntiguedadesInventarios.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAntiguedadesInventarios(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAntiguedadesInventarios(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAntiguedadesInventarios(false);
			
			//SI ES MANUAL
			if(AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAntiguedadesInventarios();
			}
			
			//this.abrirFrameTreeAntiguedadesInventarios();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAntiguedadesInventarios.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAntiguedadesInventarios.setFileImportacion(this.jInternalFrameImportacionAntiguedadesInventarios.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAntiguedadesInventarios.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAntiguedadesInventarios.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAntiguedadesInventarios.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAntiguedadesInventarios.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<AntiguedadesInventarios> antiguedadesinventariossSeleccionados=new ArrayList<AntiguedadesInventarios>();		

		antiguedadesinventariossSeleccionados=this.getAntiguedadesInventariossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AntiguedadesInventariosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AntiguedadesInventariosBaseDesign.jrxml";
			
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
			
			this.generarReporteAntiguedadesInventarioss("Todos",antiguedadesinventariossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Antiguedades Inventarios",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLinea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLinea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLinea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLinea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaMarca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaMarca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaMarca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaMarca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadDisponible_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadDisponible_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadDisponible_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadDisponible_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaUltimaCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaUltimaCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaUltimaCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaUltimaCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaUltimaVenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaUltimaVenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaUltimaVenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaUltimaVenta_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoria="nombre_sucursal";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoria="nombre_linea";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoria="nombre_linea_grupo";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoria="nombre_linea_categoria";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoria="nombre_linea_marca";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoria="nombre_bodega";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					sNombreCampoCategoria="cantidad_disponible";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA:
					sNombreCampoCategoria="fecha_ultima_compra";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA:
					sNombreCampoCategoria="fecha_ultima_venta";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoriaValor="nombre_sucursal";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoriaValor="nombre_linea";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoriaValor="nombre_linea_grupo";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoriaValor="nombre_linea_categoria";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoriaValor="nombre_linea_marca";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoriaValor="nombre_bodega";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					sNombreCampoCategoriaValor="cantidad_disponible";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA:
					sNombreCampoCategoriaValor="fecha_ultima_compra";
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA:
					sNombreCampoCategoriaValor="fecha_ultima_venta";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sucursal");
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea");
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_grupo");
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_categoria");
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_marca");
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_bodega");
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad Disponible",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_disponible");
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Ultima Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_ultima_compra");
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Ultima Venta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_ultima_venta");
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
	
	public void jButtonGenerarExcelReporteDinamicoAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<AntiguedadesInventarios> antiguedadesinventariossSeleccionados=new ArrayList<AntiguedadesInventarios>();		
		
		antiguedadesinventariossSeleccionados=this.getAntiguedadesInventariossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"antiguedadesinventarios";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("AntiguedadesInventarioss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AntiguedadesInventariosConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getfecha_ultima_venta_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getnombre_sucursal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getnombre_linea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getnombre_linea_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getnombre_linea_categoria());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getnombre_linea_marca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getnombre_bodega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getcantidad_disponible());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getfecha_ultima_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA);
					iRow++;

					for(AntiguedadesInventarios antiguedadesinventarios:antiguedadesinventariossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(antiguedadesinventarios.getfecha_ultima_venta());
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
			//	this.getFilaCabeceraExportarExcelAntiguedadesInventarios(row);				
			//	iRow++;
			//}				
			
			//for(AntiguedadesInventarios antiguedadesinventariosAux:antiguedadesinventariossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAntiguedadesInventarios(antiguedadesinventariosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Antiguedades Inventarios",JOptionPane.INFORMATION_MESSAGE);
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
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAntiguedadesInventarios(false);
			
			//SI ES MANUAL
			if(AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAntiguedadesInventarios();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAntiguedadesInventarios(false);
			
			//SI ES MANUAL
			if(AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAntiguedadesInventarios();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAntiguedadesInventarios(false);
			
			//SI ES MANUAL
			if(AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAntiguedadesInventarios();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAntiguedadesInventarios() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAntiguedadesInventarios.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAntiguedadesInventarios.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAntiguedadesInventarios.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAntiguedadesInventarios.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAntiguedadesInventarios.setMinimumSize(dimensionMinimum);
		this.jTableDatosAntiguedadesInventarios.setMaximumSize(dimensionMaximum);
		this.jTableDatosAntiguedadesInventarios.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAntiguedadesInventarios(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAntiguedadesInventarios(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAntiguedadesInventarios(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAntiguedadesInventarios(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAntiguedadesInventarios(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAntiguedadesInventarios(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAntiguedadesInventarios(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAntiguedadesInventarios(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAntiguedadesInventarios() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAntiguedadesInventarios();
		
		this.inicializarActualizarBindingBotonesManualAntiguedadesInventarios(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAntiguedadesInventarios();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAntiguedadesInventarios() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAntiguedadesInventarios(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAntiguedadesInventarios(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAntiguedadesInventarios.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAntiguedadesInventarios.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAntiguedadesInventarios.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAntiguedadesInventarios.jCheckBoxPostAccionNuevoAntiguedadesInventarios.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAntiguedadesInventarios.jCheckBoxPostAccionSinCerrarAntiguedadesInventarios.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAntiguedadesInventarios.jCheckBoxPostAccionSinMensajeAntiguedadesInventarios.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAntiguedadesInventarios.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAntiguedadesInventarios.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAntiguedadesInventarios.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
				this.jInternalFrameDetalleFormAntiguedadesInventarios.jCheckBoxPostAccionNuevoAntiguedadesInventarios.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAntiguedadesInventarios.jCheckBoxPostAccionSinCerrarAntiguedadesInventarios.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAntiguedadesInventarios.jCheckBoxPostAccionSinMensajeAntiguedadesInventarios.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAntiguedadesInventarios.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAntiguedadesInventarios.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAntiguedadesInventarios.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAntiguedadesInventarios!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAntiguedadesInventarios.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAntiguedadesInventarios.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAntiguedadesInventarios.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAntiguedadesInventarios.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAntiguedadesInventarios!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAntiguedadesInventarios.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAntiguedadesInventarios.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAntiguedadesInventarios(Boolean esInicializar) throws Exception {
		try	{	
			if(AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAntiguedadesInventarios(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAntiguedadesInventarios() throws Exception {
		try	{
			if(AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAntiguedadesInventarios();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAntiguedadesInventarios() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAntiguedadesInventarios() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAntiguedadesInventarios.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAntiguedadesInventarios.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAntiguedadesInventarios.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAntiguedadesInventarios.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAntiguedadesInventarios.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAntiguedadesInventarios.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAntiguedadesInventarios.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAntiguedadesInventarios.addItem(reporte);
			}
			
			
			if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAntiguedadesInventarios.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAntiguedadesInventarios.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAntiguedadesInventarios.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAntiguedadesInventarios.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAntiguedadesInventarios.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAntiguedadesInventarios.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAntiguedadesInventarios.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAntiguedadesInventarios.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAntiguedadesInventarios.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAntiguedadesInventarios();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAntiguedadesInventarios() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAntiguedadesInventarios!=null) {
				this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAntiguedadesInventarios!=null) {
				this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAntiguedadesInventarios!=null) {
				
				if(this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAntiguedadesInventarios()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.getSelectedItem()!=null){this.id_bodegaBusquedaAntiguedadesInventarios=((Bodega)this.jComboBoxid_bodegaBusquedaAntiguedadesInventariosAntiguedadesInventarios.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.getSelectedItem()!=null){this.id_lineaBusquedaAntiguedadesInventarios=((Linea)this.jComboBoxid_lineaBusquedaAntiguedadesInventariosAntiguedadesInventarios.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.getSelectedItem()!=null){this.id_linea_grupoBusquedaAntiguedadesInventarios=((Linea)this.jComboBoxid_linea_grupoBusquedaAntiguedadesInventariosAntiguedadesInventarios.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.getSelectedItem()!=null){this.id_linea_categoriaBusquedaAntiguedadesInventarios=((Linea)this.jComboBoxid_linea_categoriaBusquedaAntiguedadesInventariosAntiguedadesInventarios.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.getSelectedItem()!=null){this.id_linea_marcaBusquedaAntiguedadesInventarios=((Linea)this.jComboBoxid_linea_marcaBusquedaAntiguedadesInventariosAntiguedadesInventarios.getSelectedItem()).getId();}
		this.fecha_ultima_venta_hastaBusquedaAntiguedadesInventarios=new Date(this.jDateChooserfecha_ultima_venta_hastaBusquedaAntiguedadesInventariosAntiguedadesInventarios.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAntiguedadesInventarios(Boolean esInicializar) throws Exception {				
		if(AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAntiguedadesInventarios();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAntiguedadesInventarios() throws Exception {
		this.inicializarActualizarBindingTablaAntiguedadesInventarios(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAntiguedadesInventarios() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAntiguedadesInventarios.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAntiguedadesInventarios.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAntiguedadesInventarios.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AntiguedadesInventariosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAntiguedadesInventarios.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAntiguedadesInventarios.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AntiguedadesInventariosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAntiguedadesInventariosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventariosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AntiguedadesInventariosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAntiguedadesInventarios.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAntiguedadesInventarios.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AntiguedadesInventariosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAntiguedadesInventarios.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAntiguedadesInventarios(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=antiguedadesinventariosLogic.getAntiguedadesInventarioss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=antiguedadesinventarioss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAntiguedadesInventarios.setModel(new AntiguedadesInventariosModel(this.antiguedadesinventariosLogic.getAntiguedadesInventarioss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAntiguedadesInventarios.setModel(new AntiguedadesInventariosModel(this.antiguedadesinventarioss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAntiguedadesInventarios!=null && this.jInternalFrameOrderByAntiguedadesInventarios.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAntiguedadesInventarios();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AntiguedadesInventariosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO,antiguedadesinventariosConstantesFunciones.resaltarSeleccionarAntiguedadesInventarios,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AntiguedadesInventariosConstantesFunciones.SCLASSWEBTITULO,antiguedadesinventariosConstantesFunciones.resaltarSeleccionarAntiguedadesInventarios,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_ID));

		if(this.antiguedadesinventariosConstantesFunciones.mostraridAntiguedadesInventarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AntiguedadesInventariosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.antiguedadesinventariosConstantesFunciones.resaltaridAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activaridAntiguedadesInventarios,this,true,"idAntiguedadesInventarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.antiguedadesinventariosConstantesFunciones.resaltaridAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activaridAntiguedadesInventarios,this,true,"idAntiguedadesInventarios","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL));

		if(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_sucursalAntiguedadesInventarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_sucursalAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarnombre_sucursalAntiguedadesInventarios,this,true,"nombre_sucursalAntiguedadesInventarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_sucursalAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarnombre_sucursalAntiguedadesInventarios,this,true,"nombre_sucursalAntiguedadesInventarios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AntiguedadesInventariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA));

		if(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_lineaAntiguedadesInventarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_lineaAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarnombre_lineaAntiguedadesInventarios,this,true,"nombre_lineaAntiguedadesInventarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_lineaAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarnombre_lineaAntiguedadesInventarios,this,true,"nombre_lineaAntiguedadesInventarios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AntiguedadesInventariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO));

		if(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_linea_grupoAntiguedadesInventarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_linea_grupoAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarnombre_linea_grupoAntiguedadesInventarios,this,true,"nombre_linea_grupoAntiguedadesInventarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_linea_grupoAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarnombre_linea_grupoAntiguedadesInventarios,this,true,"nombre_linea_grupoAntiguedadesInventarios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AntiguedadesInventariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA));

		if(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_linea_categoriaAntiguedadesInventarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_linea_categoriaAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarnombre_linea_categoriaAntiguedadesInventarios,this,true,"nombre_linea_categoriaAntiguedadesInventarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_linea_categoriaAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarnombre_linea_categoriaAntiguedadesInventarios,this,true,"nombre_linea_categoriaAntiguedadesInventarios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AntiguedadesInventariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA));

		if(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_linea_marcaAntiguedadesInventarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_linea_marcaAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarnombre_linea_marcaAntiguedadesInventarios,this,true,"nombre_linea_marcaAntiguedadesInventarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_linea_marcaAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarnombre_linea_marcaAntiguedadesInventarios,this,true,"nombre_linea_marcaAntiguedadesInventarios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AntiguedadesInventariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO));

		if(this.antiguedadesinventariosConstantesFunciones.mostrarcodigoAntiguedadesInventarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarcodigoAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarcodigoAntiguedadesInventarios,this,true,"codigoAntiguedadesInventarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarcodigoAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarcodigoAntiguedadesInventarios,this,true,"codigoAntiguedadesInventarios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AntiguedadesInventariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE));

		if(this.antiguedadesinventariosConstantesFunciones.mostrarnombreAntiguedadesInventarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarnombreAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarnombreAntiguedadesInventarios,this,true,"nombreAntiguedadesInventarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarnombreAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarnombreAntiguedadesInventarios,this,true,"nombreAntiguedadesInventarios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AntiguedadesInventariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA));

		if(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_bodegaAntiguedadesInventarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_bodegaAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarnombre_bodegaAntiguedadesInventarios,this,true,"nombre_bodegaAntiguedadesInventarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_bodegaAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarnombre_bodegaAntiguedadesInventarios,this,true,"nombre_bodegaAntiguedadesInventarios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AntiguedadesInventariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_unidadAntiguedadesInventarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_unidadAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarnombre_unidadAntiguedadesInventarios,this,true,"nombre_unidadAntiguedadesInventarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_unidadAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarnombre_unidadAntiguedadesInventarios,this,true,"nombre_unidadAntiguedadesInventarios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AntiguedadesInventariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE));

		if(this.antiguedadesinventariosConstantesFunciones.mostrarcantidad_disponibleAntiguedadesInventarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarcantidad_disponibleAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarcantidad_disponibleAntiguedadesInventarios,this,true,"cantidad_disponibleAntiguedadesInventarios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarcantidad_disponibleAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarcantidad_disponibleAntiguedadesInventarios,this,true,"cantidad_disponibleAntiguedadesInventarios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AntiguedadesInventariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA));

		if(this.antiguedadesinventariosConstantesFunciones.mostrarfecha_ultima_compraAntiguedadesInventarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarfecha_ultima_compraAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarfecha_ultima_compraAntiguedadesInventarios,this,true,"fecha_ultima_compraAntiguedadesInventarios","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarfecha_ultima_compraAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarfecha_ultima_compraAntiguedadesInventarios,this,true,"fecha_ultima_compraAntiguedadesInventarios","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AntiguedadesInventariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA));

		if(this.antiguedadesinventariosConstantesFunciones.mostrarfecha_ultima_ventaAntiguedadesInventarios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarfecha_ultima_ventaAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarfecha_ultima_ventaAntiguedadesInventarios,this,true,"fecha_ultima_ventaAntiguedadesInventarios","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.antiguedadesinventariosConstantesFunciones.resaltarfecha_ultima_ventaAntiguedadesInventarios,this.antiguedadesinventariosConstantesFunciones.activarfecha_ultima_ventaAntiguedadesInventarios,this,true,"fecha_ultima_ventaAntiguedadesInventarios","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AntiguedadesInventariosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAntiguedadesInventarios.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAntiguedadesInventarios.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAntiguedadesInventarios && this.isPermisoGuardarCambiosAntiguedadesInventarios) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAntiguedadesInventarios.addColumn(tableColumn);
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
			
			this.jTableDatosAntiguedadesInventarios.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAntiguedadesInventarios && this.isPermisoGuardarCambiosAntiguedadesInventarios) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAntiguedadesInventarios && this.isPermisoGuardarCambiosAntiguedadesInventarios) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAntiguedadesInventarios.moveColumn(this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAntiguedadesInventarios.moveColumn(this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAntiguedadesInventarios.moveColumn(this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAntiguedadesInventarios.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAntiguedadesInventarios.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAntiguedadesInventarios,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAntiguedadesInventarios.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAntiguedadesInventarios.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAntiguedadesInventarios.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=antiguedadesinventariosLogic.getAntiguedadesInventarioss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=antiguedadesinventarioss.size()-1;
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
		//this.jTableDatosAntiguedadesInventarios.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAntiguedadesInventarios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAntiguedadesInventarios();
			
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
				
				//this.isEsNuevoAntiguedadesInventarios=false;
					
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
			
				if(this.antiguedadesinventariosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAntiguedadesInventarios==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAntiguedadesInventarios.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAntiguedadesInventarios.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.antiguedadesinventarios.getsType().equals("DUPLICADO")
				   || this.antiguedadesinventarios.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAntiguedadesInventarios=true;
				
				} else {
					this.isEsNuevoAntiguedadesInventarios=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
					if(this.antiguedadesinventarios.getId()>=0 && !this.antiguedadesinventarios.getIsNew()) {						
						this.isEsNuevoAntiguedadesInventarios=false;
						
					} else {
						this.isEsNuevoAntiguedadesInventarios=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAntiguedadesInventarios(esRelaciones);						
				
				this.seleccionarAntiguedadesInventarios(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.antiguedadesinventarios.getId()<0) {
					this.isEsNuevoAntiguedadesInventarios=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAntiguedadesInventarios(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAntiguedadesInventarios(evt,rowIndex);
				}	
				
				if(this.antiguedadesinventariosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion AntiguedadesInventarios: " + this.dDif); 
					}
				}								
				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAntiguedadesInventarios(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.antiguedadesinventarios)) {
					if(this.antiguedadesinventarios.getId()>0) {
						this.antiguedadesinventarios.setIsDeleted(true);
						
						this.antiguedadesinventariossEliminados.add(this.antiguedadesinventarios);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().remove(this.antiguedadesinventarios);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarioss.remove(this.antiguedadesinventarios);				
					}
					
					
					((AntiguedadesInventariosModel) this.jTableDatosAntiguedadesInventarios.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAntiguedadesInventarios(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAntiguedadesInventarios(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAntiguedadesInventarios) {
			
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAntiguedadesInventarios.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAntiguedadesInventarios.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAntiguedadesInventarios(this.antiguedadesinventarios);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAntiguedadesInventarios("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAntiguedadesInventarios(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAntiguedadesInventarios() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventarios) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAntiguedadesInventarios(antiguedadesinventarios,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventarios,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAntiguedadesInventarios(antiguedadesinventarios);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAntiguedadesInventarios(antiguedadesinventarios,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAntiguedadesInventarios(antiguedadesinventarios);
	}
	
	public void setVariablesObjetoActualToFormularioAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventarios) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelidAntiguedadesInventarios.setText(antiguedadesinventarios.getId().toString());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_sucursalAntiguedadesInventarios.setText(antiguedadesinventarios.getnombre_sucursal());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_lineaAntiguedadesInventarios.setText(antiguedadesinventarios.getnombre_linea());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_grupoAntiguedadesInventarios.setText(antiguedadesinventarios.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_categoriaAntiguedadesInventarios.setText(antiguedadesinventarios.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_marcaAntiguedadesInventarios.setText(antiguedadesinventarios.getnombre_linea_marca());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldcodigoAntiguedadesInventarios.setText(antiguedadesinventarios.getcodigo());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombreAntiguedadesInventarios.setText(antiguedadesinventarios.getnombre());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_bodegaAntiguedadesInventarios.setText(antiguedadesinventarios.getnombre_bodega());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldnombre_unidadAntiguedadesInventarios.setText(antiguedadesinventarios.getnombre_unidad());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldcantidad_disponibleAntiguedadesInventarios.setText(antiguedadesinventarios.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_compraAntiguedadesInventarios.setDate(antiguedadesinventarios.getfecha_ultima_compra());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_ventaAntiguedadesInventarios.setDate(antiguedadesinventarios.getfecha_ultima_venta());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,AntiguedadesInventarios antiguedadesinventariosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,antiguedadesinventariosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,AntiguedadesInventarios antiguedadesinventariosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				antiguedadesinventariosLocal=this.antiguedadesinventarios;
			} else {
				antiguedadesinventariosLocal=this.antiguedadesinventariosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(antiguedadesinventariosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAntiguedadesInventarios(antiguedadesinventariosLocal,true);
					
					if(antiguedadesinventariosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(antiguedadesinventariosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(antiguedadesinventariosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventarios,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(antiguedadesinventarios,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(antiguedadesinventarios);
	}
	
	public void setVariablesFormularioToObjetoActualAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventarios,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(antiguedadesinventarios,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventarios,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelidAntiguedadesInventarios.getText()==null || this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelidAntiguedadesInventarios.getText()=="" || this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelidAntiguedadesInventarios.getText()=="Id") {
				this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelidAntiguedadesInventarios.setText("0");
			}

			if(conColumnasBase) {antiguedadesinventarios.setId(Long.parseLong(this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelidAntiguedadesInventarios.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AntiguedadesInventariosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelIdAntiguedadesInventarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			antiguedadesinventarios.setnombre_sucursal(this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_sucursalAntiguedadesInventarios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_sucursalAntiguedadesInventarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			antiguedadesinventarios.setnombre_linea(this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_lineaAntiguedadesInventarios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_lineaAntiguedadesInventarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			antiguedadesinventarios.setnombre_linea_grupo(this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_grupoAntiguedadesInventarios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_linea_grupoAntiguedadesInventarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			antiguedadesinventarios.setnombre_linea_categoria(this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_categoriaAntiguedadesInventarios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_linea_categoriaAntiguedadesInventarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			antiguedadesinventarios.setnombre_linea_marca(this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_marcaAntiguedadesInventarios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_linea_marcaAntiguedadesInventarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			antiguedadesinventarios.setcodigo(this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldcodigoAntiguedadesInventarios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelcodigoAntiguedadesInventarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			antiguedadesinventarios.setnombre(this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombreAntiguedadesInventarios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombreAntiguedadesInventarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			antiguedadesinventarios.setnombre_bodega(this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_bodegaAntiguedadesInventarios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_bodegaAntiguedadesInventarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			antiguedadesinventarios.setnombre_unidad(this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldnombre_unidadAntiguedadesInventarios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelnombre_unidadAntiguedadesInventarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			antiguedadesinventarios.setcantidad_disponible(Integer.parseInt(this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldcantidad_disponibleAntiguedadesInventarios.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelcantidad_disponibleAntiguedadesInventarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			antiguedadesinventarios.setfecha_ultima_compra(this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_compraAntiguedadesInventarios.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelfecha_ultima_compraAntiguedadesInventarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			antiguedadesinventarios.setfecha_ultima_venta(this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_ventaAntiguedadesInventarios.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelfecha_ultima_ventaAntiguedadesInventarios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventariosBean,AntiguedadesInventarios antiguedadesinventarios,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventariosOrigen,AntiguedadesInventarios antiguedadesinventarios,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && antiguedadesinventariosOrigen.getId()!=null && !antiguedadesinventariosOrigen.getId().equals(0L))) {antiguedadesinventarios.setId(antiguedadesinventariosOrigen.getId());}}
			if(conDefault || (!conDefault && antiguedadesinventariosOrigen.getfecha_ultima_venta_hasta()!=null && !antiguedadesinventariosOrigen.getfecha_ultima_venta_hasta().equals(new Date()))) {antiguedadesinventarios.setfecha_ultima_venta_hasta(antiguedadesinventariosOrigen.getfecha_ultima_venta_hasta());}
			if(conDefault || (!conDefault && antiguedadesinventariosOrigen.getnombre_sucursal()!=null && !antiguedadesinventariosOrigen.getnombre_sucursal().equals(""))) {antiguedadesinventarios.setnombre_sucursal(antiguedadesinventariosOrigen.getnombre_sucursal());}
			if(conDefault || (!conDefault && antiguedadesinventariosOrigen.getnombre_linea()!=null && !antiguedadesinventariosOrigen.getnombre_linea().equals(""))) {antiguedadesinventarios.setnombre_linea(antiguedadesinventariosOrigen.getnombre_linea());}
			if(conDefault || (!conDefault && antiguedadesinventariosOrigen.getnombre_linea_grupo()!=null && !antiguedadesinventariosOrigen.getnombre_linea_grupo().equals(""))) {antiguedadesinventarios.setnombre_linea_grupo(antiguedadesinventariosOrigen.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && antiguedadesinventariosOrigen.getnombre_linea_categoria()!=null && !antiguedadesinventariosOrigen.getnombre_linea_categoria().equals(""))) {antiguedadesinventarios.setnombre_linea_categoria(antiguedadesinventariosOrigen.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && antiguedadesinventariosOrigen.getnombre_linea_marca()!=null && !antiguedadesinventariosOrigen.getnombre_linea_marca().equals(""))) {antiguedadesinventarios.setnombre_linea_marca(antiguedadesinventariosOrigen.getnombre_linea_marca());}
			if(conDefault || (!conDefault && antiguedadesinventariosOrigen.getcodigo()!=null && !antiguedadesinventariosOrigen.getcodigo().equals(""))) {antiguedadesinventarios.setcodigo(antiguedadesinventariosOrigen.getcodigo());}
			if(conDefault || (!conDefault && antiguedadesinventariosOrigen.getnombre()!=null && !antiguedadesinventariosOrigen.getnombre().equals(""))) {antiguedadesinventarios.setnombre(antiguedadesinventariosOrigen.getnombre());}
			if(conDefault || (!conDefault && antiguedadesinventariosOrigen.getnombre_bodega()!=null && !antiguedadesinventariosOrigen.getnombre_bodega().equals(""))) {antiguedadesinventarios.setnombre_bodega(antiguedadesinventariosOrigen.getnombre_bodega());}
			if(conDefault || (!conDefault && antiguedadesinventariosOrigen.getnombre_unidad()!=null && !antiguedadesinventariosOrigen.getnombre_unidad().equals(""))) {antiguedadesinventarios.setnombre_unidad(antiguedadesinventariosOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && antiguedadesinventariosOrigen.getcantidad_disponible()!=null && !antiguedadesinventariosOrigen.getcantidad_disponible().equals(0))) {antiguedadesinventarios.setcantidad_disponible(antiguedadesinventariosOrigen.getcantidad_disponible());}
			if(conDefault || (!conDefault && antiguedadesinventariosOrigen.getfecha_ultima_compra()!=null && !antiguedadesinventariosOrigen.getfecha_ultima_compra().equals(new Date()))) {antiguedadesinventarios.setfecha_ultima_compra(antiguedadesinventariosOrigen.getfecha_ultima_compra());}
			if(conDefault || (!conDefault && antiguedadesinventariosOrigen.getfecha_ultima_venta()!=null && !antiguedadesinventariosOrigen.getfecha_ultima_venta().equals(new Date()))) {antiguedadesinventarios.setfecha_ultima_venta(antiguedadesinventariosOrigen.getfecha_ultima_venta());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventarios) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelidAntiguedadesInventarios.setText(antiguedadesinventarios.getId().toString());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_sucursalAntiguedadesInventarios.setText(antiguedadesinventarios.getnombre_sucursal());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_lineaAntiguedadesInventarios.setText(antiguedadesinventarios.getnombre_linea());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_grupoAntiguedadesInventarios.setText(antiguedadesinventarios.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_categoriaAntiguedadesInventarios.setText(antiguedadesinventarios.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_marcaAntiguedadesInventarios.setText(antiguedadesinventarios.getnombre_linea_marca());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldcodigoAntiguedadesInventarios.setText(antiguedadesinventarios.getcodigo());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombreAntiguedadesInventarios.setText(antiguedadesinventarios.getnombre());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_bodegaAntiguedadesInventarios.setText(antiguedadesinventarios.getnombre_bodega());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldnombre_unidadAntiguedadesInventarios.setText(antiguedadesinventarios.getnombre_unidad());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldcantidad_disponibleAntiguedadesInventarios.setText(antiguedadesinventarios.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_compraAntiguedadesInventarios.setDate(antiguedadesinventarios.getfecha_ultima_compra());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_ventaAntiguedadesInventarios.setDate(antiguedadesinventarios.getfecha_ultima_venta());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAntiguedadesInventarios(AntiguedadesInventariosBean antiguedadesinventariosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelidAntiguedadesInventarios.setText(antiguedadesinventariosBean.getId().toString());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_sucursalAntiguedadesInventarios.setText(antiguedadesinventariosBean.getnombre_sucursal());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_lineaAntiguedadesInventarios.setText(antiguedadesinventariosBean.getnombre_linea());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_grupoAntiguedadesInventarios.setText(antiguedadesinventariosBean.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_categoriaAntiguedadesInventarios.setText(antiguedadesinventariosBean.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_marcaAntiguedadesInventarios.setText(antiguedadesinventariosBean.getnombre_linea_marca());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldcodigoAntiguedadesInventarios.setText(antiguedadesinventariosBean.getcodigo());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombreAntiguedadesInventarios.setText(antiguedadesinventariosBean.getnombre());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_bodegaAntiguedadesInventarios.setText(antiguedadesinventariosBean.getnombre_bodega());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldnombre_unidadAntiguedadesInventarios.setText(antiguedadesinventariosBean.getnombre_unidad());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldcantidad_disponibleAntiguedadesInventarios.setText(antiguedadesinventariosBean.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_compraAntiguedadesInventarios.setDate(antiguedadesinventariosBean.getfecha_ultima_compra());
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_ventaAntiguedadesInventarios.setDate(antiguedadesinventariosBean.getfecha_ultima_venta());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAntiguedadesInventarios(AntiguedadesInventariosParameterReturnGeneral antiguedadesinventariosReturnGeneral,AntiguedadesInventariosBean antiguedadesinventariosBean,Boolean conDefault) throws Exception { 
		try {
			AntiguedadesInventarios antiguedadesinventariosLocal=new AntiguedadesInventarios();
			
			antiguedadesinventariosLocal=antiguedadesinventariosReturnGeneral.getAntiguedadesInventarios();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && antiguedadesinventariosLocal.getId()!=null && !antiguedadesinventariosLocal.getId().equals(0L))) {antiguedadesinventariosBean.setId(antiguedadesinventariosLocal.getId());}}
			if(conDefault || (!conDefault && antiguedadesinventariosLocal.getnombre_sucursal()!=null && !antiguedadesinventariosLocal.getnombre_sucursal().equals(""))) {antiguedadesinventariosBean.setnombre_sucursal(antiguedadesinventariosLocal.getnombre_sucursal());}
			if(conDefault || (!conDefault && antiguedadesinventariosLocal.getnombre_linea()!=null && !antiguedadesinventariosLocal.getnombre_linea().equals(""))) {antiguedadesinventariosBean.setnombre_linea(antiguedadesinventariosLocal.getnombre_linea());}
			if(conDefault || (!conDefault && antiguedadesinventariosLocal.getnombre_linea_grupo()!=null && !antiguedadesinventariosLocal.getnombre_linea_grupo().equals(""))) {antiguedadesinventariosBean.setnombre_linea_grupo(antiguedadesinventariosLocal.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && antiguedadesinventariosLocal.getnombre_linea_categoria()!=null && !antiguedadesinventariosLocal.getnombre_linea_categoria().equals(""))) {antiguedadesinventariosBean.setnombre_linea_categoria(antiguedadesinventariosLocal.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && antiguedadesinventariosLocal.getnombre_linea_marca()!=null && !antiguedadesinventariosLocal.getnombre_linea_marca().equals(""))) {antiguedadesinventariosBean.setnombre_linea_marca(antiguedadesinventariosLocal.getnombre_linea_marca());}
			if(conDefault || (!conDefault && antiguedadesinventariosLocal.getcodigo()!=null && !antiguedadesinventariosLocal.getcodigo().equals(""))) {antiguedadesinventariosBean.setcodigo(antiguedadesinventariosLocal.getcodigo());}
			if(conDefault || (!conDefault && antiguedadesinventariosLocal.getnombre()!=null && !antiguedadesinventariosLocal.getnombre().equals(""))) {antiguedadesinventariosBean.setnombre(antiguedadesinventariosLocal.getnombre());}
			if(conDefault || (!conDefault && antiguedadesinventariosLocal.getnombre_bodega()!=null && !antiguedadesinventariosLocal.getnombre_bodega().equals(""))) {antiguedadesinventariosBean.setnombre_bodega(antiguedadesinventariosLocal.getnombre_bodega());}
			if(conDefault || (!conDefault && antiguedadesinventariosLocal.getnombre_unidad()!=null && !antiguedadesinventariosLocal.getnombre_unidad().equals(""))) {antiguedadesinventariosBean.setnombre_unidad(antiguedadesinventariosLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && antiguedadesinventariosLocal.getcantidad_disponible()!=null && !antiguedadesinventariosLocal.getcantidad_disponible().equals(0))) {antiguedadesinventariosBean.setcantidad_disponible(antiguedadesinventariosLocal.getcantidad_disponible());}
			if(conDefault || (!conDefault && antiguedadesinventariosLocal.getfecha_ultima_compra()!=null && !antiguedadesinventariosLocal.getfecha_ultima_compra().equals(new Date()))) {antiguedadesinventariosBean.setfecha_ultima_compra(antiguedadesinventariosLocal.getfecha_ultima_compra());}
			if(conDefault || (!conDefault && antiguedadesinventariosLocal.getfecha_ultima_venta()!=null && !antiguedadesinventariosLocal.getfecha_ultima_venta().equals(new Date()))) {antiguedadesinventariosBean.setfecha_ultima_venta(antiguedadesinventariosLocal.getfecha_ultima_venta());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAntiguedadesInventariosGenerico(Long idAntiguedadesInventariosSeleccionado,JComboBox jComboBoxAntiguedadesInventarios,List<AntiguedadesInventarios> antiguedadesinventariossLocal)throws Exception {
		try {
			AntiguedadesInventarios  antiguedadesinventariosTemp=null;

			for(AntiguedadesInventarios antiguedadesinventariosAux:antiguedadesinventariossLocal) {
				if(antiguedadesinventariosAux.getId()!=null && antiguedadesinventariosAux.getId().equals(idAntiguedadesInventariosSeleccionado)) {
					antiguedadesinventariosTemp=antiguedadesinventariosAux;
					break;
				}
			}

			jComboBoxAntiguedadesInventarios.setSelectedItem(antiguedadesinventariosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAntiguedadesInventariosGenerico(JComboBox jComboBoxAntiguedadesInventarios,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAntiguedadesInventarios.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAntiguedadesInventarios.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAntiguedadesInventarios.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAntiguedadesInventarios.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAntiguedadesInventarios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAntiguedadesInventarios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			antiguedadesinventarios=(AntiguedadesInventarios) antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			antiguedadesinventarios =(AntiguedadesInventarios) antiguedadesinventarioss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!antiguedadesinventarios.getIsNew() && !antiguedadesinventarios.getIsChanged() && !antiguedadesinventarios.getIsDeleted()) {
				sDescripcion=antiguedadesinventarios.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=antiguedadesinventarios.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!antiguedadesinventarios.getIsNew() && !antiguedadesinventarios.getIsChanged() && !antiguedadesinventarios.getIsDeleted()) {
				sDescripcion=antiguedadesinventarios.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=antiguedadesinventarios.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!antiguedadesinventarios.getIsNew() && !antiguedadesinventarios.getIsChanged() && !antiguedadesinventarios.getIsDeleted()) {
				sDescripcion=antiguedadesinventarios.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=antiguedadesinventarios.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!antiguedadesinventarios.getIsNew() && !antiguedadesinventarios.getIsChanged() && !antiguedadesinventarios.getIsDeleted()) {
				sDescripcion=antiguedadesinventarios.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=antiguedadesinventarios.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!antiguedadesinventarios.getIsNew() && !antiguedadesinventarios.getIsChanged() && !antiguedadesinventarios.getIsDeleted()) {
				sDescripcion=antiguedadesinventarios.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=antiguedadesinventarios.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!antiguedadesinventarios.getIsNew() && !antiguedadesinventarios.getIsChanged() && !antiguedadesinventarios.getIsDeleted()) {
				sDescripcion=antiguedadesinventarios.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=antiguedadesinventarios.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!antiguedadesinventarios.getIsNew() && !antiguedadesinventarios.getIsChanged() && !antiguedadesinventarios.getIsDeleted()) {
				sDescripcion=antiguedadesinventarios.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=antiguedadesinventarios.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		AntiguedadesInventarios antiguedadesinventariosRow=new AntiguedadesInventarios();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			antiguedadesinventariosRow=(AntiguedadesInventarios) antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			antiguedadesinventariosRow=(AntiguedadesInventarios) antiguedadesinventarioss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAntiguedadesInventarios(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaNuevoAntiguedadesInventarios && this.isPermisoNuevoAntiguedadesInventarios));			
			this.jButtonDuplicarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaDuplicarAntiguedadesInventarios && this.isPermisoDuplicarAntiguedadesInventarios));			
			this.jButtonCopiarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaCopiarAntiguedadesInventarios && this.isPermisoCopiarAntiguedadesInventarios));
			this.jButtonVerFormAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaVerFormAntiguedadesInventarios && this.isPermisoVerFormAntiguedadesInventarios));
			
			this.jButtonAbrirOrderByAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaOrdenAntiguedadesInventarios && this.isPermisoOrdenAntiguedadesInventarios));			
			
			this.jButtonNuevoRelacionesAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios && this.isPermisoNuevoAntiguedadesInventarios));			
			this.jButtonNuevoGuardarCambiosAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaNuevoAntiguedadesInventarios && this.isPermisoNuevoAntiguedadesInventarios && this.isPermisoGuardarCambiosAntiguedadesInventarios));
			
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonModificarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaModificarAntiguedadesInventarios && this.isPermisoActualizarAntiguedadesInventarios));	
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonActualizarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaActualizarAntiguedadesInventarios && this.isPermisoActualizarAntiguedadesInventarios));	
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonEliminarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaEliminarAntiguedadesInventarios && this.isPermisoEliminarAntiguedadesInventarios));
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonCancelarAntiguedadesInventarios.setVisible(this.isVisibilidadCeldaCancelarAntiguedadesInventarios);							
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonGuardarCambiosAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaGuardarAntiguedadesInventarios && this.isPermisoGuardarCambiosAntiguedadesInventarios));			
			
			}
						
			this.jButtonGuardarCambiosTablaAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios && this.isPermisoGuardarCambiosAntiguedadesInventarios));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaNuevoAntiguedadesInventarios && this.isPermisoNuevoAntiguedadesInventarios));						
			this.jButtonDuplicarToolBarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaDuplicarAntiguedadesInventarios && this.isPermisoDuplicarAntiguedadesInventarios));						
			this.jButtonCopiarToolBarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaCopiarAntiguedadesInventarios && this.isPermisoCopiarAntiguedadesInventarios));			
			this.jButtonVerFormToolBarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaVerFormAntiguedadesInventarios && this.isPermisoVerFormAntiguedadesInventarios));			
			this.jButtonAbrirOrderByToolBarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaOrdenAntiguedadesInventarios && this.isPermisoOrdenAntiguedadesInventarios));
			this.jButtonNuevoRelacionesToolBarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios && this.isPermisoNuevoAntiguedadesInventarios));			
			this.jButtonNuevoGuardarCambiosToolBarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaNuevoAntiguedadesInventarios && this.isPermisoNuevoAntiguedadesInventarios && this.isPermisoGuardarCambiosAntiguedadesInventarios));			
			
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonModificarToolBarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaModificarAntiguedadesInventarios && this.isPermisoActualizarAntiguedadesInventarios));	
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonActualizarToolBarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaActualizarAntiguedadesInventarios  && this.isPermisoActualizarAntiguedadesInventarios));	
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonEliminarToolBarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaEliminarAntiguedadesInventarios && this.isPermisoEliminarAntiguedadesInventarios));
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonCancelarToolBarAntiguedadesInventarios.setVisible(this.isVisibilidadCeldaCancelarAntiguedadesInventarios);				
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonGuardarCambiosToolBarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaGuardarAntiguedadesInventarios && this.isPermisoGuardarCambiosAntiguedadesInventarios));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios && this.isPermisoGuardarCambiosAntiguedadesInventarios));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaNuevoAntiguedadesInventarios && this.isPermisoNuevoAntiguedadesInventarios));			
			this.jMenuItemDuplicarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaDuplicarAntiguedadesInventarios && this.isPermisoDuplicarAntiguedadesInventarios));			
			this.jMenuItemCopiarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaCopiarAntiguedadesInventarios && this.isPermisoCopiarAntiguedadesInventarios));			
			this.jMenuItemVerFormAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaVerFormAntiguedadesInventarios && this.isPermisoVerFormAntiguedadesInventarios));			
			this.jMenuItemAbrirOrderByAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaOrdenAntiguedadesInventarios && this.isPermisoOrdenAntiguedadesInventarios));			
			//this.jMenuItemMostrarOcultarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaOrdenAntiguedadesInventarios && this.isPermisoOrdenAntiguedadesInventarios));
			this.jMenuItemDetalleAbrirOrderByAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaOrdenAntiguedadesInventarios && this.isPermisoOrdenAntiguedadesInventarios));			
			//this.jMenuItemDetalleMostrarOcultarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaOrdenAntiguedadesInventarios && this.isPermisoOrdenAntiguedadesInventarios));			
			this.jMenuItemNuevoRelacionesAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios && this.isPermisoNuevoAntiguedadesInventarios));			
			this.jMenuItemNuevoGuardarCambiosAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaNuevoAntiguedadesInventarios && this.isPermisoNuevoAntiguedadesInventarios && this.isPermisoGuardarCambiosAntiguedadesInventarios));									
			
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemModificarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaModificarAntiguedadesInventarios && this.isPermisoActualizarAntiguedadesInventarios));	
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemActualizarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaActualizarAntiguedadesInventarios && this.isPermisoActualizarAntiguedadesInventarios));	
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemEliminarAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaEliminarAntiguedadesInventarios && this.isPermisoEliminarAntiguedadesInventarios));
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemCancelarAntiguedadesInventarios.setVisible(this.isVisibilidadCeldaCancelarAntiguedadesInventarios);				
			}
			
			this.jMenuItemGuardarCambiosAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaGuardarAntiguedadesInventarios && this.isPermisoGuardarCambiosAntiguedadesInventarios));						
			this.jMenuItemGuardarCambiosTablaAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios && this.isPermisoGuardarCambiosAntiguedadesInventarios));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAntiguedadesInventarios=this.jButtonNuevoAntiguedadesInventarios.isVisible();
			this.isVisibilidadCeldaDuplicarAntiguedadesInventarios=this.jButtonDuplicarAntiguedadesInventarios.isVisible();
			this.isVisibilidadCeldaCopiarAntiguedadesInventarios=this.jButtonCopiarAntiguedadesInventarios.isVisible();
			this.isVisibilidadCeldaVerFormAntiguedadesInventarios=this.jButtonVerFormAntiguedadesInventarios.isVisible();
			
			this.isVisibilidadCeldaOrdenAntiguedadesInventarios=this.jButtonAbrirOrderByAntiguedadesInventarios.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios=this.jButtonNuevoRelacionesAntiguedadesInventarios.isVisible();
			this.isVisibilidadCeldaModificarAntiguedadesInventarios=this.jButtonModificarAntiguedadesInventarios.isVisible();
			
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
			this.isVisibilidadCeldaActualizarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonActualizarAntiguedadesInventarios.isVisible();
			this.isVisibilidadCeldaEliminarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonEliminarAntiguedadesInventarios.isVisible();
			this.isVisibilidadCeldaCancelarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonCancelarAntiguedadesInventarios.isVisible();
			this.isVisibilidadCeldaGuardarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonGuardarCambiosAntiguedadesInventarios.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios=this.jButtonGuardarCambiosTablaAntiguedadesInventarios.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAntiguedadesInventarios=this.jButtonNuevoToolBarAntiguedadesInventarios.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios=this.jButtonNuevoRelacionesToolBarAntiguedadesInventarios.isVisible();
			
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
			this.isVisibilidadCeldaModificarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonModificarToolBarAntiguedadesInventarios.isVisible();
			this.isVisibilidadCeldaActualizarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonActualizarToolBarAntiguedadesInventarios.isVisible();
			this.isVisibilidadCeldaEliminarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonEliminarToolBarAntiguedadesInventarios.isVisible();
			this.isVisibilidadCeldaCancelarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonCancelarToolBarAntiguedadesInventarios.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAntiguedadesInventarios=this.jButtonGuardarCambiosToolBarAntiguedadesInventarios.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios=this.jButtonGuardarCambiosTablaToolBarAntiguedadesInventarios.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAntiguedadesInventarios=this.jMenuItemNuevoAntiguedadesInventarios.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios=this.jMenuItemNuevoRelacionesAntiguedadesInventarios.isVisible();
			
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
			this.isVisibilidadCeldaModificarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemModificarAntiguedadesInventarios.isVisible();
			this.isVisibilidadCeldaActualizarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemActualizarAntiguedadesInventarios.isVisible();
			this.isVisibilidadCeldaEliminarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemEliminarAntiguedadesInventarios.isVisible();
			this.isVisibilidadCeldaCancelarAntiguedadesInventarios=this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemCancelarAntiguedadesInventarios.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAntiguedadesInventarios=this.jMenuItemGuardarCambiosAntiguedadesInventarios.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios=this.jMenuItemGuardarCambiosTablaAntiguedadesInventarios.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAntiguedadesInventarios(Boolean esInicializar) {
		if(AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.antiguedadesinventariosSessionBean.getConGuardarRelaciones()) {
				//if(this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAntiguedadesInventarios();
			}
			
			this.inicializarActualizarBindingBotonesManualAntiguedadesInventarios(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAntiguedadesInventarios() {
		this.jButtonNuevoAntiguedadesInventarios.setVisible(this.isPermisoNuevoAntiguedadesInventarios);			
		this.jButtonDuplicarAntiguedadesInventarios.setVisible(this.isPermisoDuplicarAntiguedadesInventarios);			
		this.jButtonCopiarAntiguedadesInventarios.setVisible(this.isPermisoCopiarAntiguedadesInventarios);			
		this.jButtonVerFormAntiguedadesInventarios.setVisible(this.isPermisoVerFormAntiguedadesInventarios);			
		
		this.jButtonAbrirOrderByAntiguedadesInventarios.setVisible(this.isPermisoOrdenAntiguedadesInventarios);					
		
		this.jButtonNuevoRelacionesAntiguedadesInventarios.setVisible(this.isPermisoNuevoAntiguedadesInventarios);			
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonModificarAntiguedadesInventarios.setVisible(this.isPermisoActualizarAntiguedadesInventarios);	
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonActualizarAntiguedadesInventarios.setVisible(this.isPermisoActualizarAntiguedadesInventarios);	
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonEliminarAntiguedadesInventarios.setVisible(this.isPermisoEliminarAntiguedadesInventarios);
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonCancelarAntiguedadesInventarios.setVisible(this.isVisibilidadCeldaCancelarAntiguedadesInventarios);						
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonGuardarCambiosAntiguedadesInventarios.setVisible(this.isPermisoGuardarCambiosAntiguedadesInventarios);							
		}
		
		this.jButtonGuardarCambiosTablaAntiguedadesInventarios.setVisible(this.isPermisoActualizarAntiguedadesInventarios);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAntiguedadesInventarios() {
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonModificarAntiguedadesInventarios.setVisible(this.isPermisoActualizarAntiguedadesInventarios);	
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonActualizarAntiguedadesInventarios.setVisible(this.isPermisoActualizarAntiguedadesInventarios);	
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonEliminarAntiguedadesInventarios.setVisible(this.isPermisoEliminarAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonCancelarAntiguedadesInventarios.setVisible(this.isVisibilidadCeldaCancelarAntiguedadesInventarios);							
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonGuardarCambiosAntiguedadesInventarios.setVisible((this.isVisibilidadCeldaGuardarAntiguedadesInventarios && this.isPermisoGuardarCambiosAntiguedadesInventarios));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAntiguedadesInventarios() {
		if(AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAntiguedadesInventarios();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAntiguedadesInventarios() {
	}
	
	public void jTableDatosAntiguedadesInventariosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAntiguedadesInventarios(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.antiguedadesinventarios.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaAntiguedadesInventariosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebAntiguedadesInventarios(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAntiguedadesInventarios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAntiguedadesInventarios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.antiguedadesinventariosLogic.getConnexion());

				if(this.antiguedadesinventarios.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.antiguedadesinventarios.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAntiguedadesInventarios=(TitledBorder)this.jScrollPanelDatosAntiguedadesInventarios.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderAntiguedadesInventarios.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.antiguedadesinventarios.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaAntiguedadesInventariosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebAntiguedadesInventarios(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAntiguedadesInventarios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAntiguedadesInventarios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.antiguedadesinventariosLogic.getConnexion());

				if(this.antiguedadesinventarios.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.antiguedadesinventarios.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAntiguedadesInventarios=(TitledBorder)this.jScrollPanelDatosAntiguedadesInventarios.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderAntiguedadesInventarios.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.antiguedadesinventarios.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalAntiguedadesInventariosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebAntiguedadesInventarios(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAntiguedadesInventarios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAntiguedadesInventarios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.antiguedadesinventariosLogic.getConnexion());

				if(this.antiguedadesinventarios.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.antiguedadesinventarios.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAntiguedadesInventarios=(TitledBorder)this.jScrollPanelDatosAntiguedadesInventarios.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderAntiguedadesInventarios.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.antiguedadesinventarios.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaAntiguedadesInventariosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebAntiguedadesInventarios(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAntiguedadesInventarios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAntiguedadesInventarios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.antiguedadesinventariosLogic.getConnexion());

				if(this.antiguedadesinventarios.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.antiguedadesinventarios.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAntiguedadesInventarios=(TitledBorder)this.jScrollPanelDatosAntiguedadesInventarios.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderAntiguedadesInventarios.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.antiguedadesinventarios.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoAntiguedadesInventariosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebAntiguedadesInventarios(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAntiguedadesInventarios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAntiguedadesInventarios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.antiguedadesinventariosLogic.getConnexion());

				if(this.antiguedadesinventarios.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.antiguedadesinventarios.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAntiguedadesInventarios=(TitledBorder)this.jScrollPanelDatosAntiguedadesInventarios.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderAntiguedadesInventarios.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.antiguedadesinventarios.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaAntiguedadesInventariosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebAntiguedadesInventarios(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAntiguedadesInventarios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAntiguedadesInventarios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.antiguedadesinventariosLogic.getConnexion());

				if(this.antiguedadesinventarios.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.antiguedadesinventarios.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAntiguedadesInventarios=(TitledBorder)this.jScrollPanelDatosAntiguedadesInventarios.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderAntiguedadesInventarios.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.antiguedadesinventarios.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaAntiguedadesInventariosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebAntiguedadesInventarios(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAntiguedadesInventarios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAntiguedadesInventarios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.antiguedadesinventariosLogic.getConnexion());

				if(this.antiguedadesinventarios.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.antiguedadesinventarios.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAntiguedadesInventarios=(TitledBorder)this.jScrollPanelDatosAntiguedadesInventarios.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderAntiguedadesInventarios.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.antiguedadesinventarios.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ultima_venta_hastaAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getfecha_ultima_venta_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ultima_venta_hasta = '"+Funciones2.getStringPostgresDate(this.antiguedadesinventarios.getfecha_ultima_venta_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sucursalAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getnombre_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sucursal like '%"+this.antiguedadesinventarios.getnombre_sucursal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_lineaAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getnombre_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea like '%"+this.antiguedadesinventarios.getnombre_linea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_grupoAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getnombre_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_grupo like '%"+this.antiguedadesinventarios.getnombre_linea_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_categoriaAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getnombre_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_categoria like '%"+this.antiguedadesinventarios.getnombre_linea_categoria()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_marcaAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getnombre_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_marca like '%"+this.antiguedadesinventarios.getnombre_linea_marca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.antiguedadesinventarios.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.antiguedadesinventarios.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bodegaAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getnombre_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_bodega like '%"+this.antiguedadesinventarios.getnombre_bodega()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.antiguedadesinventarios.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_disponibleAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getcantidad_disponible()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_disponible = "+this.antiguedadesinventarios.getcantidad_disponible().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ultima_compraAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getfecha_ultima_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ultima_compra = '"+Funciones2.getStringPostgresDate(this.antiguedadesinventarios.getfecha_ultima_compra())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ultima_ventaAntiguedadesInventariosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.getantiguedadesinventarios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.antiguedadesinventarios==null) {
						this.antiguedadesinventarios = new AntiguedadesInventarios();
					}

					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);
				}

				if(this.antiguedadesinventarios.getfecha_ultima_venta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ultima_venta = '"+Funciones2.getStringPostgresDate(this.antiguedadesinventarios.getfecha_ultima_venta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAntiguedadesInventarios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaAntiguedadesInventariosAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAntiguedadesInventarios(false,false);

			this.getAntiguedadesInventariossBusquedaAntiguedadesInventarios();

			this.inicializarActualizarBindingAntiguedadesInventarios(false);

			//if(AntiguedadesInventariosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAntiguedadesInventarios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAntiguedadesInventarios(false,false);

			this.getAntiguedadesInventariossFK_IdBodega();

			this.inicializarActualizarBindingAntiguedadesInventarios(false);

			//if(AntiguedadesInventariosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAntiguedadesInventarios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAntiguedadesInventarios(false,false);

			this.getAntiguedadesInventariossFK_IdEmpresa();

			this.inicializarActualizarBindingAntiguedadesInventarios(false);

			//if(AntiguedadesInventariosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAntiguedadesInventarios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAntiguedadesInventarios(false,false);

			this.getAntiguedadesInventariossFK_IdLinea();

			this.inicializarActualizarBindingAntiguedadesInventarios(false);

			//if(AntiguedadesInventariosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAntiguedadesInventarios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAntiguedadesInventarios(false,false);

			this.getAntiguedadesInventariossFK_IdLineaCategoria();

			this.inicializarActualizarBindingAntiguedadesInventarios(false);

			//if(AntiguedadesInventariosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAntiguedadesInventarios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAntiguedadesInventarios(false,false);

			this.getAntiguedadesInventariossFK_IdLineaGrupo();

			this.inicializarActualizarBindingAntiguedadesInventarios(false);

			//if(AntiguedadesInventariosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAntiguedadesInventarios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAntiguedadesInventarios(false,false);

			this.getAntiguedadesInventariossFK_IdLineaMarca();

			this.inicializarActualizarBindingAntiguedadesInventarios(false);

			//if(AntiguedadesInventariosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAntiguedadesInventarios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalAntiguedadesInventariosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAntiguedadesInventarios(false,false);

			this.getAntiguedadesInventariossFK_IdSucursal();

			this.inicializarActualizarBindingAntiguedadesInventarios(false);

			//if(AntiguedadesInventariosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAntiguedadesInventarios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.antiguedadesinventariosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAntiguedadesInventarios() {
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.setVisible(false);	    			
			this.jInternalFrameDetalleFormAntiguedadesInventarios.dispose();
			this.jInternalFrameDetalleFormAntiguedadesInventarios=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAntiguedadesInventarios!=null) {
			this.jInternalFrameReporteDinamicoAntiguedadesInventarios.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAntiguedadesInventarios.dispose();
			this.jInternalFrameReporteDinamicoAntiguedadesInventarios=null;
		}
		
		if(this.jInternalFrameImportacionAntiguedadesInventarios!=null) {
			this.jInternalFrameImportacionAntiguedadesInventarios.setVisible(false);	    			
			this.jInternalFrameImportacionAntiguedadesInventarios.dispose();
			this.jInternalFrameImportacionAntiguedadesInventarios=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAntiguedadesInventarios();
			
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
			
			
			if(sTipo.equals("NuevoAntiguedadesInventarios")) {
				jButtonNuevoAntiguedadesInventariosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAntiguedadesInventarios")) {
				jButtonDuplicarAntiguedadesInventariosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAntiguedadesInventarios")) {
				jButtonCopiarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("VerFormAntiguedadesInventarios")) {
				jButtonVerFormAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAntiguedadesInventarios")) {
				jButtonNuevoAntiguedadesInventariosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAntiguedadesInventarios")) {
				jButtonDuplicarAntiguedadesInventariosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAntiguedadesInventarios")) {
				jButtonNuevoAntiguedadesInventariosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAntiguedadesInventarios")) {
				jButtonDuplicarAntiguedadesInventariosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAntiguedadesInventarios")) {
				jButtonNuevoAntiguedadesInventariosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAntiguedadesInventarios")) {
				jButtonNuevoAntiguedadesInventariosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAntiguedadesInventarios")) {
				jButtonNuevoAntiguedadesInventariosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAntiguedadesInventarios")) {
				jButtonModificarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAntiguedadesInventarios")) {
				jButtonModificarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAntiguedadesInventarios")) {
				jButtonModificarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAntiguedadesInventarios")) {
				jButtonActualizarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAntiguedadesInventarios")) {
				jButtonActualizarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAntiguedadesInventarios")) {
				jButtonActualizarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("EliminarAntiguedadesInventarios")) {
				jButtonEliminarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAntiguedadesInventarios")) {
				jButtonEliminarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAntiguedadesInventarios")) {
				jButtonEliminarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("CancelarAntiguedadesInventarios")) {
				jButtonCancelarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAntiguedadesInventarios")) {
				jButtonCancelarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAntiguedadesInventarios")) {
				jButtonCancelarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("CerrarAntiguedadesInventarios")) {
				jButtonCerrarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAntiguedadesInventarios")) {
				jButtonCerrarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAntiguedadesInventarios")) {
				jButtonCerrarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAntiguedadesInventarios")) {
				jButtonMostrarOcultarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAntiguedadesInventarios")) {
				jButtonCancelarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAntiguedadesInventarios")) {
				jButtonGuardarCambiosAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAntiguedadesInventarios")) {
				jButtonGuardarCambiosAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAntiguedadesInventarios")) {
				jButtonCopiarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAntiguedadesInventarios")) {
				jButtonVerFormAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAntiguedadesInventarios")) {
				jButtonGuardarCambiosAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAntiguedadesInventarios")) {
				jButtonCopiarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAntiguedadesInventarios")) {
				jButtonVerFormAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAntiguedadesInventarios")) {
				jButtonGuardarCambiosAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAntiguedadesInventarios")) {
				jButtonGuardarCambiosAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAntiguedadesInventarios")) {
				jButtonGuardarCambiosAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAntiguedadesInventarios")) {
				jButtonRecargarInformacionAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAntiguedadesInventarios")) {
				jButtonRecargarInformacionAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAntiguedadesInventarios")) {
				jButtonRecargarInformacionAntiguedadesInventariosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAntiguedadesInventarios")) {
				jButtonAnterioresAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAntiguedadesInventarios")) {
				jButtonAnterioresAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAntiguedadesInventarios")) {
				jButtonAnterioresAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAntiguedadesInventarios")) {
				jButtonSiguientesAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAntiguedadesInventarios")) {
				jButtonSiguientesAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAntiguedadesInventarios")) {
				jButtonSiguientesAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAntiguedadesInventarios") || sTipo.equals("MenuItemDetalleAbrirOrderByAntiguedadesInventarios")) {
				jButtonAbrirOrderByAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAntiguedadesInventarios") || sTipo.equals("MenuItemDetalleMostrarOcultarAntiguedadesInventarios")) {
				jButtonMostrarOcultarAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAntiguedadesInventarios")) {
				jButtonNuevoGuardarCambiosAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAntiguedadesInventarios")) {
				jButtonNuevoGuardarCambiosAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAntiguedadesInventarios")) {
				jButtonNuevoGuardarCambiosAntiguedadesInventariosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAntiguedadesInventarios")) {
				jButtonCerrarReporteDinamicoAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAntiguedadesInventarios")) {
				jButtonGenerarReporteDinamicoAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAntiguedadesInventarios")) {
				
				jButtonGenerarExcelReporteDinamicoAntiguedadesInventariosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAntiguedadesInventarios")) {
				jButtonCerrarImportacionAntiguedadesInventariosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAntiguedadesInventarios")) {
				
				jButtonGenerarImportacionAntiguedadesInventariosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAntiguedadesInventarios")) {
				
				jButtonAbrirImportacionAntiguedadesInventariosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAntiguedadesInventarios")) {
				jComboBoxTiposAccionesAntiguedadesInventariosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAntiguedadesInventarios")) {
				jComboBoxTiposRelacionesAntiguedadesInventariosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAntiguedadesInventarios")) {
				jComboBoxTiposAccionesAntiguedadesInventariosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAntiguedadesInventarios")) {
				
				jComboBoxTiposSeleccionarAntiguedadesInventariosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAntiguedadesInventarios")) {
				jTextFieldValorCampoGeneralAntiguedadesInventariosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAntiguedadesInventarios")) {
				jButtonAbrirOrderByAntiguedadesInventariosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAntiguedadesInventarios")) {
				jButtonAbrirOrderByAntiguedadesInventariosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAntiguedadesInventarios")) {
				jButtonCerrarOrderByAntiguedadesInventariosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAntiguedadesInventariosBusqueda")) {
				this.jButtonidAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaAntiguedadesInventariosUpdate")) {
				this.jButtonid_bodegaAntiguedadesInventariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaAntiguedadesInventariosBusqueda")) {
				this.jButtonid_bodegaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAntiguedadesInventariosUpdate")) {
				this.jButtonid_empresaAntiguedadesInventariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAntiguedadesInventariosBusqueda")) {
				this.jButtonid_empresaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalAntiguedadesInventariosUpdate")) {
				this.jButtonid_sucursalAntiguedadesInventariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalAntiguedadesInventariosBusqueda")) {
				this.jButtonid_sucursalAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaAntiguedadesInventariosUpdate")) {
				this.jButtonid_lineaAntiguedadesInventariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaAntiguedadesInventariosBusqueda")) {
				this.jButtonid_lineaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoAntiguedadesInventariosUpdate")) {
				this.jButtonid_linea_grupoAntiguedadesInventariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoAntiguedadesInventariosBusqueda")) {
				this.jButtonid_linea_grupoAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaAntiguedadesInventariosUpdate")) {
				this.jButtonid_linea_categoriaAntiguedadesInventariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaAntiguedadesInventariosBusqueda")) {
				this.jButtonid_linea_categoriaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaAntiguedadesInventariosUpdate")) {
				this.jButtonid_linea_marcaAntiguedadesInventariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaAntiguedadesInventariosBusqueda")) {
				this.jButtonid_linea_marcaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultima_venta_hastaAntiguedadesInventariosBusqueda")) {
				this.jButtonfecha_ultima_venta_hastaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalAntiguedadesInventariosBusqueda")) {
				this.jButtonnombre_sucursalAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaAntiguedadesInventariosBusqueda")) {
				this.jButtonnombre_lineaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoAntiguedadesInventariosBusqueda")) {
				this.jButtonnombre_linea_grupoAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaAntiguedadesInventariosBusqueda")) {
				this.jButtonnombre_linea_categoriaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaAntiguedadesInventariosBusqueda")) {
				this.jButtonnombre_linea_marcaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoAntiguedadesInventariosBusqueda")) {
				this.jButtoncodigoAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreAntiguedadesInventariosBusqueda")) {
				this.jButtonnombreAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaAntiguedadesInventariosBusqueda")) {
				this.jButtonnombre_bodegaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadAntiguedadesInventariosBusqueda")) {
				this.jButtonnombre_unidadAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_disponibleAntiguedadesInventariosBusqueda")) {
				this.jButtoncantidad_disponibleAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultima_compraAntiguedadesInventariosBusqueda")) {
				this.jButtonfecha_ultima_compraAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultima_ventaAntiguedadesInventariosBusqueda")) {
				this.jButtonfecha_ultima_ventaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaAntiguedadesInventariosAntiguedadesInventarios")) {
				this.jButtonBusquedaAntiguedadesInventariosAntiguedadesInventariosActionPerformed(evt);
			}
			
			;
			
			
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAntiguedadesInventarios();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAntiguedadesInventariosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.antiguedadesinventarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.antiguedadesinventarios);
				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
				
				


				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AntiguedadesInventarios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AntiguedadesInventarios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			AntiguedadesInventarios antiguedadesinventariosLocal=null;
			
			if(!this.getEsControlTabla()) {
				antiguedadesinventariosLocal=this.antiguedadesinventarios;
			} else {
				antiguedadesinventariosLocal=this.antiguedadesinventariosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.antiguedadesinventarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.antiguedadesinventarios);
				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
							
				
				


				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AntiguedadesInventarios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AntiguedadesInventarios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAntiguedadesInventariosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosAnterior =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.antiguedadesinventariosAnterior =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
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
			
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
			
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
			
			


			
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAntiguedadesInventariosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.antiguedadesinventarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.antiguedadesinventarios);
				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
								
						
				


				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AntiguedadesInventarios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AntiguedadesInventarios.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.antiguedadesinventarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.antiguedadesinventarios);
				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
								
				
				


				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AntiguedadesInventarios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AntiguedadesInventarios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAntiguedadesInventariosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosAnterior =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.antiguedadesinventariosAnterior =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.antiguedadesinventarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.antiguedadesinventarios);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAntiguedadesInventariosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosAnterior =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.antiguedadesinventariosAnterior =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAntiguedadesInventariosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.antiguedadesinventarios);
			
			this.actualizarInformacion("INFO_PADRE",false,this.antiguedadesinventarios);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.antiguedadesinventarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.antiguedadesinventarios);
				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
							
				
				


				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AntiguedadesInventarios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AntiguedadesInventarios.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAntiguedadesInventariosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventariosAnterior =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.antiguedadesinventariosAnterior =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
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
			
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
			
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
			
			


			
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAntiguedadesInventariosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.antiguedadesinventarios);
			
			this.actualizarInformacion("INFO_PADRE",false,this.antiguedadesinventarios);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.antiguedadesinventarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.antiguedadesinventarios);
				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
								
				
				


				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AntiguedadesInventarios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AntiguedadesInventarios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAntiguedadesInventariosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosAnterior =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.antiguedadesinventariosAnterior =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAntiguedadesInventariosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.antiguedadesinventarios);
			
			this.actualizarInformacion("INFO_PADRE",false,this.antiguedadesinventarios);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAntiguedadesInventariosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.antiguedadesinventarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.antiguedadesinventarios);
				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAntiguedadesInventarios")) {
					jCheckBoxSeleccionarTodosAntiguedadesInventariosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAntiguedadesInventarios")) {
					jCheckBoxSeleccionadosAntiguedadesInventariosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAntiguedadesInventarios")) {
					
				}
				
				


				
				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AntiguedadesInventarios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AntiguedadesInventarios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.antiguedadesinventarios);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.antiguedadesinventarios);
				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
												
				
				


				
				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AntiguedadesInventarios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AntiguedadesInventarios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAntiguedadesInventariosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.antiguedadesinventariosAnterior =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.antiguedadesinventariosAnterior =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAntiguedadesInventariosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.antiguedadesinventarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.antiguedadesinventarios);
				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
				
				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
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
			
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
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
			
			


			
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAntiguedadesInventariosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.antiguedadesinventarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.antiguedadesinventarios);
				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AntiguedadesInventarios.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AntiguedadesInventarios.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.antiguedadesinventarios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.antiguedadesinventarios);
				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
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
				
				


				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AntiguedadesInventarios.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AntiguedadesInventarios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAntiguedadesInventariosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.antiguedadesinventariosAnterior =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.antiguedadesinventariosAnterior =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAntiguedadesInventarios")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAntiguedadesInventariosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAntiguedadesInventarios.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.antiguedadesinventarios =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.antiguedadesinventarios);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAntiguedadesInventarios")) {
				
				}
				
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAntiguedadesInventarios")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAntiguedadesInventarios.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAntiguedadesInventarios")) {
			
			}
			
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAntiguedadesInventarios();
			
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
			
			if(sTipo.equals("NuevoAntiguedadesInventarios")) {
				jButtonNuevoAntiguedadesInventariosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAntiguedadesInventarios")) {
				jButtonDuplicarAntiguedadesInventariosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAntiguedadesInventarios")) {
				jButtonCopiarAntiguedadesInventariosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAntiguedadesInventarios")) {
				jButtonVerFormAntiguedadesInventariosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAntiguedadesInventarios")) {
				jButtonNuevoAntiguedadesInventariosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAntiguedadesInventarios")) {
				jButtonModificarAntiguedadesInventariosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAntiguedadesInventarios")) {
				jButtonActualizarAntiguedadesInventariosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAntiguedadesInventarios")) {
				jButtonEliminarAntiguedadesInventariosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAntiguedadesInventarios")) {
				jButtonGuardarCambiosAntiguedadesInventariosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAntiguedadesInventarios")) {
				jButtonCancelarAntiguedadesInventariosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAntiguedadesInventarios")) {
				jButtonCerrarAntiguedadesInventariosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAntiguedadesInventarios")) {
				jButtonGuardarCambiosAntiguedadesInventariosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAntiguedadesInventarios")) {
				jButtonNuevoGuardarCambiosAntiguedadesInventariosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAntiguedadesInventarios")) {
				jButtonAbrirOrderByAntiguedadesInventariosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAntiguedadesInventarios")) {
				jButtonRecargarInformacionAntiguedadesInventariosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAntiguedadesInventarios")) {
				jButtonAnterioresAntiguedadesInventariosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAntiguedadesInventarios")) {
				jButtonSiguientesAntiguedadesInventariosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAntiguedadesInventariosBusqueda")) {
				this.jButtonidAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaAntiguedadesInventariosUpdate")) {
				this.jButtonid_bodegaAntiguedadesInventariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaAntiguedadesInventariosBusqueda")) {
				this.jButtonid_bodegaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAntiguedadesInventariosUpdate")) {
				this.jButtonid_empresaAntiguedadesInventariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAntiguedadesInventariosBusqueda")) {
				this.jButtonid_empresaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalAntiguedadesInventariosUpdate")) {
				this.jButtonid_sucursalAntiguedadesInventariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalAntiguedadesInventariosBusqueda")) {
				this.jButtonid_sucursalAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaAntiguedadesInventariosUpdate")) {
				this.jButtonid_lineaAntiguedadesInventariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaAntiguedadesInventariosBusqueda")) {
				this.jButtonid_lineaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoAntiguedadesInventariosUpdate")) {
				this.jButtonid_linea_grupoAntiguedadesInventariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoAntiguedadesInventariosBusqueda")) {
				this.jButtonid_linea_grupoAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaAntiguedadesInventariosUpdate")) {
				this.jButtonid_linea_categoriaAntiguedadesInventariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaAntiguedadesInventariosBusqueda")) {
				this.jButtonid_linea_categoriaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaAntiguedadesInventariosUpdate")) {
				this.jButtonid_linea_marcaAntiguedadesInventariosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaAntiguedadesInventariosBusqueda")) {
				this.jButtonid_linea_marcaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultima_venta_hastaAntiguedadesInventariosBusqueda")) {
				this.jButtonfecha_ultima_venta_hastaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalAntiguedadesInventariosBusqueda")) {
				this.jButtonnombre_sucursalAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaAntiguedadesInventariosBusqueda")) {
				this.jButtonnombre_lineaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoAntiguedadesInventariosBusqueda")) {
				this.jButtonnombre_linea_grupoAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaAntiguedadesInventariosBusqueda")) {
				this.jButtonnombre_linea_categoriaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaAntiguedadesInventariosBusqueda")) {
				this.jButtonnombre_linea_marcaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoAntiguedadesInventariosBusqueda")) {
				this.jButtoncodigoAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreAntiguedadesInventariosBusqueda")) {
				this.jButtonnombreAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaAntiguedadesInventariosBusqueda")) {
				this.jButtonnombre_bodegaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadAntiguedadesInventariosBusqueda")) {
				this.jButtonnombre_unidadAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_disponibleAntiguedadesInventariosBusqueda")) {
				this.jButtoncantidad_disponibleAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultima_compraAntiguedadesInventariosBusqueda")) {
				this.jButtonfecha_ultima_compraAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultima_ventaAntiguedadesInventariosBusqueda")) {
				this.jButtonfecha_ultima_ventaAntiguedadesInventariosBusquedaActionPerformed(evt);
			}
			
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAntiguedadesInventarios();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAntiguedadesInventarios")) {
				closingInternalFrameAntiguedadesInventarios();
				
			} else if(sTipo.equals("jButtonCancelarAntiguedadesInventarios")) {
				JInternalFrameBase jInternalFrameDetalleFormAntiguedadesInventarios = (JInternalFrameBase)evt.getSource();
	            	
	            AntiguedadesInventariosBeanSwingJInternalFrame jInternalFrameParent=(AntiguedadesInventariosBeanSwingJInternalFrame)jInternalFrameDetalleFormAntiguedadesInventarios.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAntiguedadesInventariosActionPerformed(null);
			}
			
			AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.antiguedadesinventarios,new Object(),this.antiguedadesinventariosParameterGeneral,this.antiguedadesinventariosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAntiguedadesInventarios(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAntiguedadesInventarios(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAntiguedadesInventarios(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.antiguedadesinventarios)) {
			if(!esControlTabla) {
				if(AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);			
				}
				
				if(this.antiguedadesinventariosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAntiguedadesInventarios(this.antiguedadesinventariosReturnGeneral,this.antiguedadesinventariosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.antiguedadesinventariosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAntiguedadesInventarios(classes,this.antiguedadesinventariosReturnGeneral,this.antiguedadesinventariosBean,false);
					}
						
					if(this.antiguedadesinventariosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAntiguedadesInventarios(this.antiguedadesinventariosReturnGeneral.getAntiguedadesInventarios());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAntiguedadesInventarios(this.antiguedadesinventariosReturnGeneral.getAntiguedadesInventarios());	
					}
						
					if(this.antiguedadesinventariosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAntiguedadesInventarios(this.antiguedadesinventariosReturnGeneral.getAntiguedadesInventarios(),classes);//this.antiguedadesinventariosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAntiguedadesInventarios(this.antiguedadesinventarios,classes);//this.antiguedadesinventariosBean);									
				}
			
				if(AntiguedadesInventariosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAntiguedadesInventarios(this.antiguedadesinventarios,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAntiguedadesInventarios(this.antiguedadesinventarios);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.antiguedadesinventariosAnterior!=null) {
						this.antiguedadesinventarios=this.antiguedadesinventariosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.antiguedadesinventariosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.antiguedadesinventariosReturnGeneral.getAntiguedadesInventarios(),antiguedadesinventariosLogic.getAntiguedadesInventarioss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.antiguedadesinventariosReturnGeneral.getAntiguedadesInventarios(),this.antiguedadesinventarioss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAntiguedadesInventarios.repaint();
				
				//((AbstractTableModel) this.jTableDatosAntiguedadesInventarios.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAntiguedadesInventarios();
			}
		}
	}
	
	public void actualizarVisualTableDatosAntiguedadesInventarios() throws Exception {
		
		AntiguedadesInventariosModel antiguedadesinventariosModel=(AntiguedadesInventariosModel)this.jTableDatosAntiguedadesInventarios.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			antiguedadesinventariosModel.antiguedadesinventarioss=this.antiguedadesinventariosLogic.getAntiguedadesInventarioss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			antiguedadesinventariosModel.antiguedadesinventarioss=this.antiguedadesinventarioss;
		}
		
		
		((AntiguedadesInventariosModel) this.jTableDatosAntiguedadesInventarios.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAntiguedadesInventarios() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getantiguedadesinventariosAnterior(),this.antiguedadesinventariosLogic.getAntiguedadesInventarioss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getantiguedadesinventariosAnterior(),this.antiguedadesinventarioss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAntiguedadesInventarios();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventarios,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
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
										
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.antiguedadesinventarios,new Object(),generalEntityParameterGeneral,this.antiguedadesinventariosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.antiguedadesinventariosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AntiguedadesInventariosConstantesFunciones.getClassesRelationshipsOfAntiguedadesInventarios(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AntiguedadesInventariosConstantesFunciones.getClassesRelationshipsFromStringsOfAntiguedadesInventarios(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAntiguedadesInventarios(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AntiguedadesInventariosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.antiguedadesinventarios,new Object(),generalEntityParameterGeneral,this.antiguedadesinventariosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAntiguedadesInventarios(AntiguedadesInventariosBean antiguedadesinventariosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAntiguedadesInventarios(ArrayList<Classe> classes,AntiguedadesInventariosReturnGeneral antiguedadesinventariosReturnGeneral,AntiguedadesInventariosBean antiguedadesinventariosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventarios,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.antiguedadesinventarios)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios = new AntiguedadesInventariosDetalleFormJInternalFrame(jDesktopPane,this.antiguedadesinventariosSessionBean.getConGuardarRelaciones(),this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.setVisible(false);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.setSelected(false);						
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.antiguedadesinventariosLogic=this.antiguedadesinventariosLogic;
		
		this.cargarCombosFrameForeignKeyAntiguedadesInventarios("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAntiguedadesInventarios();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAntiguedadesInventarios();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAntiguedadesInventarios("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAntiguedadesInventarios();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAntiguedadesInventarios"));
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonModificarAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"ModificarAntiguedadesInventarios"));

		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonModificarToolBarAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"ModificarToolBarAntiguedadesInventarios"));
					
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemModificarAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"MenuItemModificarAntiguedadesInventarios"));		
		
		
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonActualizarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"ActualizarAntiguedadesInventarios"));
		
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonActualizarToolBarAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAntiguedadesInventarios"));
						
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemActualizarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAntiguedadesInventarios"));		
		
		
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonEliminarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"EliminarAntiguedadesInventarios"));
		
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonEliminarToolBarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"EliminarToolBarAntiguedadesInventarios"));
								
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemEliminarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAntiguedadesInventarios"));		
		
		
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonCancelarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"CancelarAntiguedadesInventarios"));
		
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonCancelarToolBarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"CancelarToolBarAntiguedadesInventarios"));
					
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemCancelarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAntiguedadesInventarios"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemDetalleCerrarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAntiguedadesInventarios"));		
		
		
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonGuardarCambiosToolBarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAntiguedadesInventarios"));
		
		
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonGuardarCambiosToolBarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAntiguedadesInventarios"));
		
		
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAntiguedadesInventarios"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonidAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"idAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_bodegaAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_bodegaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_empresaAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_empresaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_sucursalAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_sucursalAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_lineaAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_lineaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_grupoAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_grupoAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_categoriaAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_categoriaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_marcaAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_marcaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonfecha_ultima_venta_hastaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_venta_hastaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_sucursalAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_lineaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_linea_grupoAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_linea_categoriaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_linea_marcaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtoncodigoAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"codigoAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombreAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombreAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_bodegaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_unidadAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtoncantidad_disponibleAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonfecha_ultima_compraAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_compraAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonfecha_ultima_ventaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_ventaAntiguedadesInventariosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTabbedPaneRelacionesAntiguedadesInventarios.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAntiguedadesInventarios"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAntiguedadesInventarios"));
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAntiguedadesInventarios"));
		}
		
		this.jTableDatosAntiguedadesInventarios.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAntiguedadesInventarios"));
		
		this.jTableDatosAntiguedadesInventarios.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAntiguedadesInventarios"));
		
		this.jButtonNuevoAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"NuevoAntiguedadesInventarios"));
		
		this.jButtonDuplicarAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"DuplicarAntiguedadesInventarios"));
		
		this.jButtonCopiarAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"CopiarAntiguedadesInventarios"));
		
		this.jButtonVerFormAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"VerFormAntiguedadesInventarios"));
		
		
		this.jButtonNuevoToolBarAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"NuevoToolBarAntiguedadesInventarios"));
			
		this.jButtonDuplicarToolBarAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAntiguedadesInventarios"));
			
		this.jMenuItemNuevoAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAntiguedadesInventarios"));
			
		this.jMenuItemDuplicarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAntiguedadesInventarios"));		
		
		
		this.jButtonNuevoRelacionesAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAntiguedadesInventarios"));
		
		
		this.jButtonNuevoRelacionesToolBarAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAntiguedadesInventarios"));
			
		this.jMenuItemNuevoRelacionesAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAntiguedadesInventarios"));		
		
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonModificarAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"ModificarAntiguedadesInventarios"));
		}
		
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonModificarToolBarAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"ModificarToolBarAntiguedadesInventarios"));
			
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemModificarAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"MenuItemModificarAntiguedadesInventarios"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonActualizarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"ActualizarAntiguedadesInventarios"));
		}
		
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonActualizarToolBarAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAntiguedadesInventarios"));
				
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemActualizarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAntiguedadesInventarios"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonEliminarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"EliminarAntiguedadesInventarios"));
		}
		
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonEliminarToolBarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"EliminarToolBarAntiguedadesInventarios"));
						
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemEliminarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAntiguedadesInventarios"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonCancelarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"CancelarAntiguedadesInventarios"));
		}
		
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonCancelarToolBarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"CancelarToolBarAntiguedadesInventarios"));
			
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemCancelarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAntiguedadesInventarios"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAntiguedadesInventarios"));		
		
		
		this.jButtonCerrarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"CerrarAntiguedadesInventarios"));
		
		
		this.jButtonCerrarToolBarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"CerrarToolBarAntiguedadesInventarios"));
			
		this.jMenuItemCerrarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAntiguedadesInventarios"));
			
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jMenuItemDetalleCerrarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAntiguedadesInventarios"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonGuardarCambiosAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"GuardarCambiosAntiguedadesInventarios"));
		}
		
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonGuardarCambiosToolBarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAntiguedadesInventarios"));
		}
		
		this.jButtonCopiarToolBarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"CopiarToolBarAntiguedadesInventarios"));
			
		this.jButtonVerFormToolBarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"VerFormToolBarAntiguedadesInventarios"));
		
		this.jMenuItemGuardarCambiosAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAntiguedadesInventarios"));
			
		this.jMenuItemCopiarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAntiguedadesInventarios"));		
		
		this.jMenuItemVerFormAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAntiguedadesInventarios"));		
		
		
		this.jButtonGuardarCambiosTablaAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAntiguedadesInventarios"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAntiguedadesInventarios"));
			
		this.jMenuItemGuardarCambiosTablaAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAntiguedadesInventarios"));		
		
		
		
		this.jButtonRecargarInformacionAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"RecargarInformacionAntiguedadesInventarios"));
					
		this.jButtonRecargarInformacionToolBarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAntiguedadesInventarios"));
		
		this.jMenuItemRecargarInformacionAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAntiguedadesInventarios"));		
		
		
		
		this.jButtonAnterioresAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"AnterioresAntiguedadesInventarios"));
		
		
		this.jButtonAnterioresToolBarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAntiguedadesInventarios"));
		
		this.jMenuItemAnterioresAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAntiguedadesInventarios"));		
		
		
		this.jButtonSiguientesAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"SiguientesAntiguedadesInventarios"));
		
		
		this.jButtonSiguientesToolBarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAntiguedadesInventarios"));
			
		this.jMenuItemSiguientesAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAntiguedadesInventarios"));
			
		this.jMenuItemAbrirOrderByAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAntiguedadesInventarios"));
			
		this.jMenuItemMostrarOcultarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAntiguedadesInventarios"));
			
		this.jMenuItemDetalleAbrirOrderByAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAntiguedadesInventarios"));
			
		this.jMenuItemDetalleMostarOcultarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAntiguedadesInventarios"));		
		
		
		this.jButtonNuevoGuardarCambiosAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAntiguedadesInventarios"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAntiguedadesInventarios"));
			
		this.jMenuItemNuevoGuardarCambiosAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAntiguedadesInventarios"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAntiguedadesInventarios.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAntiguedadesInventarios"));

		this.jCheckBoxSeleccionadosAntiguedadesInventarios.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAntiguedadesInventarios"));
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAntiguedadesInventarios"));
		}
		
		
		this.jComboBoxTiposRelacionesAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"TiposRelacionesAntiguedadesInventarios"));
			
		this.jComboBoxTiposAccionesAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"TiposAccionesAntiguedadesInventarios"));
					
		this.jComboBoxTiposSeleccionarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAntiguedadesInventarios"));
			
		this.jTextFieldValorCampoGeneralAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAntiguedadesInventarios"));		
		
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonidAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"idAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_bodegaAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_bodegaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_empresaAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_empresaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_sucursalAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_sucursalAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_lineaAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_lineaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_grupoAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_grupoAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_categoriaAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_categoriaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_marcaAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_marcaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonfecha_ultima_venta_hastaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_venta_hastaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_sucursalAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_lineaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_linea_grupoAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_linea_categoriaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_linea_marcaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtoncodigoAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"codigoAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombreAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombreAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_bodegaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_unidadAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtoncantidad_disponibleAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonfecha_ultima_compraAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_compraAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonfecha_ultima_ventaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_ventaAntiguedadesInventariosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaAntiguedadesInventariosAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"BusquedaAntiguedadesInventariosAntiguedadesInventarios"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAntiguedadesInventarios!=null) {
				this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAntiguedadesInventarios"));
				this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAntiguedadesInventarios"));
				this.jInternalFrameReporteDinamicoAntiguedadesInventarios.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAntiguedadesInventarios"));
			}
			
			//this.jButtonCerrarReporteDinamicoAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAntiguedadesInventarios"));				
			//this.jButtonGenerarReporteDinamicoAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAntiguedadesInventarios"));
			//this.jButtonGenerarExcelReporteDinamicoAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAntiguedadesInventarios"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAntiguedadesInventarios!=null) {
				this.jInternalFrameImportacionAntiguedadesInventarios.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAntiguedadesInventarios"));
				this.jInternalFrameImportacionAntiguedadesInventarios.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAntiguedadesInventarios"));
				this.jInternalFrameImportacionAntiguedadesInventarios.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAntiguedadesInventarios"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"AbrirOrderByAntiguedadesInventarios"));
			
			this.jButtonAbrirOrderByToolBarAntiguedadesInventarios.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAntiguedadesInventarios"));			
			
			if(this.jInternalFrameOrderByAntiguedadesInventarios!=null) {
				this.jInternalFrameOrderByAntiguedadesInventarios.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAntiguedadesInventarios"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAntiguedadesInventarios.jTabbedPaneRelacionesAntiguedadesInventarios.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAntiguedadesInventarios"));
		
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
            		closingInternalFrameAntiguedadesInventarios();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAntiguedadesInventarios = (JInternalFrameBase)event.getSource();
	            	
	            AntiguedadesInventariosBeanSwingJInternalFrame jInternalFrameParent=(AntiguedadesInventariosBeanSwingJInternalFrame)jInternalFrameDetalleFormAntiguedadesInventarios.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAntiguedadesInventariosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAntiguedadesInventarios.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAntiguedadesInventariosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAntiguedadesInventarios.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAntiguedadesInventarios.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAntiguedadesInventariosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAntiguedadesInventariosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAntiguedadesInventariosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAntiguedadesInventarios";
		inputMap = this.jButtonNuevoAntiguedadesInventarios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAntiguedadesInventarios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAntiguedadesInventariosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAntiguedadesInventariosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAntiguedadesInventariosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAntiguedadesInventariosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAntiguedadesInventarios";
		inputMap = this.jButtonNuevoRelacionesAntiguedadesInventarios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAntiguedadesInventarios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAntiguedadesInventariosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAntiguedadesInventarios";
		inputMap = this.jButtonModificarAntiguedadesInventarios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAntiguedadesInventarios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAntiguedadesInventariosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAntiguedadesInventarios";
		inputMap = this.jButtonActualizarAntiguedadesInventarios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAntiguedadesInventarios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAntiguedadesInventariosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAntiguedadesInventarios";
		inputMap = this.jButtonEliminarAntiguedadesInventarios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAntiguedadesInventarios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAntiguedadesInventariosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAntiguedadesInventarios";
		inputMap = this.jButtonCancelarAntiguedadesInventarios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAntiguedadesInventarios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAntiguedadesInventariosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAntiguedadesInventarios";
		inputMap = this.jButtonCerrarAntiguedadesInventarios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAntiguedadesInventarios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAntiguedadesInventariosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonGuardarCambiosAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAntiguedadesInventarios";
		inputMap = this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonGuardarCambiosAntiguedadesInventarios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonGuardarCambiosAntiguedadesInventarios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAntiguedadesInventariosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAntiguedadesInventarios.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAntiguedadesInventariosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAntiguedadesInventarios.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAntiguedadesInventariosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAntiguedadesInventarios.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAntiguedadesInventariosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAntiguedadesInventarios.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAntiguedadesInventariosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonidAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"idAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_bodegaAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_bodegaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_empresaAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_empresaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_sucursalAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_sucursalAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_lineaAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_lineaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_grupoAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_grupoAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_categoriaAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_categoriaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaAntiguedadesInventariosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_marcaAntiguedadesInventariosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaAntiguedadesInventariosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonid_linea_marcaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonfecha_ultima_venta_hastaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_venta_hastaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_sucursalAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_lineaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_linea_grupoAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_linea_categoriaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_linea_marcaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtoncodigoAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"codigoAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombreAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombreAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_bodegaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonnombre_unidadAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtoncantidad_disponibleAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonfecha_ultima_compraAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_compraAntiguedadesInventariosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jButtonfecha_ultima_ventaAntiguedadesInventariosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_ventaAntiguedadesInventariosBusqueda"));
		
		
		this.jButtonBusquedaAntiguedadesInventariosAntiguedadesInventarios.addActionListener(new ButtonActionListener(this,"BusquedaAntiguedadesInventariosAntiguedadesInventarios"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAntiguedadesInventarios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAntiguedadesInventariosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAntiguedadesInventariosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAntiguedadesInventarios.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAntiguedadesInventarios(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(AntiguedadesInventarios antiguedadesinventariosAux:this.antiguedadesinventariosLogic.getAntiguedadesInventarioss()) {
					antiguedadesinventariosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AntiguedadesInventarios antiguedadesinventariosAux:antiguedadesinventarioss) {
					antiguedadesinventariosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAntiguedadesInventariosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAntiguedadesInventarios(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AntiguedadesInventarios antiguedadesinventariosAux:this.antiguedadesinventariosLogic.getAntiguedadesInventarioss()) {
						antiguedadesinventariosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AntiguedadesInventarios antiguedadesinventariosAux:antiguedadesinventarioss) {
						antiguedadesinventariosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(AntiguedadesInventarios antiguedadesinventariosAux:this.antiguedadesinventariosLogic.getAntiguedadesInventarioss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AntiguedadesInventarios antiguedadesinventariosAux:antiguedadesinventarioss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAntiguedadesInventarios(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAntiguedadesInventarios.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAntiguedadesInventarios.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAntiguedadesInventariosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAntiguedadesInventarios(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAntiguedadesInventarios.getSelectedRows();
			
			AntiguedadesInventarios antiguedadesinventariosLocal=new AntiguedadesInventarios();
			
			//this.seleccionarTodosAntiguedadesInventarios(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					antiguedadesinventariosLocal =(AntiguedadesInventarios) this.antiguedadesinventariosLogic.getAntiguedadesInventarioss().toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					antiguedadesinventariosLocal =(AntiguedadesInventarios) this.antiguedadesinventarioss.toArray()[this.jTableDatosAntiguedadesInventarios.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				antiguedadesinventariosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AntiguedadesInventarios antiguedadesinventariosAux:this.antiguedadesinventariosLogic.getAntiguedadesInventarioss()) {
						antiguedadesinventariosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AntiguedadesInventarios antiguedadesinventariosAux:antiguedadesinventarioss) {
						antiguedadesinventariosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAntiguedadesInventarios(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAntiguedadesInventarios.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAntiguedadesInventarios.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAntiguedadesInventarios,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAntiguedadesInventariosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAntiguedadesInventariosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAntiguedadesInventariosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAntiguedadesInventarios(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAntiguedadesInventarios.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AntiguedadesInventarios antiguedadesinventariosAux:this.antiguedadesinventariosLogic.getAntiguedadesInventarioss()) {
				
						if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA)) {
							existe=true;
							antiguedadesinventariosAux.setfecha_ultima_venta_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							antiguedadesinventariosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							antiguedadesinventariosAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							antiguedadesinventariosAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							antiguedadesinventariosAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							antiguedadesinventariosAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							antiguedadesinventariosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							antiguedadesinventariosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							antiguedadesinventariosAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							antiguedadesinventariosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
							existe=true;
							antiguedadesinventariosAux.setcantidad_disponible(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA)) {
							existe=true;
							antiguedadesinventariosAux.setfecha_ultima_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA)) {
							existe=true;
							antiguedadesinventariosAux.setfecha_ultima_venta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AntiguedadesInventarios antiguedadesinventariosAux:antiguedadesinventarioss) {
					
						if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA)) {
							existe=true;
							antiguedadesinventariosAux.setfecha_ultima_venta_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							antiguedadesinventariosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							antiguedadesinventariosAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							antiguedadesinventariosAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							antiguedadesinventariosAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							antiguedadesinventariosAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							antiguedadesinventariosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							antiguedadesinventariosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							antiguedadesinventariosAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							antiguedadesinventariosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
							existe=true;
							antiguedadesinventariosAux.setcantidad_disponible(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA)) {
							existe=true;
							antiguedadesinventariosAux.setfecha_ultima_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA)) {
							existe=true;
							antiguedadesinventariosAux.setfecha_ultima_venta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAntiguedadesInventarios(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAntiguedadesInventariosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAntiguedadesInventarios(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAntiguedadesInventarios=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAntiguedadesInventarios.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAntiguedadesInventarios) {				
					conSplash=true;//false;										
					
					//this.startProcessAntiguedadesInventarios(conSplash);
				
					this.generarReporteAntiguedadesInventariossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAntiguedadesInventarios.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAntiguedadesInventariossSeleccionados();
				//this.jComboBoxTiposAccionesAntiguedadesInventarios.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAntiguedadesInventariossSeleccionados(false);
				//this.jComboBoxTiposAccionesAntiguedadesInventarios.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAntiguedadesInventariossSeleccionados(true);
				//this.jComboBoxTiposAccionesAntiguedadesInventarios.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAntiguedadesInventarios();
				
				this.exportarAntiguedadesInventariossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAntiguedadesInventarios.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAntiguedadesInventarioss();
				//this.importarAntiguedadesInventarioss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAntiguedadesInventarios.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAntiguedadesInventarios();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAntiguedadesInventariossSeleccionados();
				//this.jComboBoxTiposAccionesAntiguedadesInventarios.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Antiguedades Inventarios", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAntiguedadesInventarios();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAntiguedadesInventarios)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAntiguedadesInventarios(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Antiguedades Inventarios",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAntiguedadesInventarios.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.setSelectedIndex(0);					
				}	
			} 			
			else if(AntiguedadesInventariosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAntiguedadesInventarios) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAntiguedadesInventarios(conSplash);
					
						//this.actualizarParametrosGeneralAntiguedadesInventarios();
						
						this.generarReporteProcesoAccionAntiguedadesInventariossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAntiguedadesInventarios.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AntiguedadesInventariosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Antiguedades InventariosES SELECCIONADOS?", "MANTENIMIENTO DE Antiguedades Inventarios", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAntiguedadesInventarios();
				
						this.actualizarParametrosGeneralAntiguedadesInventarios();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.antiguedadesinventariosReturnGeneral=antiguedadesinventariosLogic.procesarAccionAntiguedadesInventariossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.antiguedadesinventariosLogic.getAntiguedadesInventarioss(),this.antiguedadesinventariosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAntiguedadesInventariosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAntiguedadesInventarios.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAntiguedadesInventarios();
					
					AntiguedadesInventariosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAntiguedadesInventariosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAntiguedadesInventarios.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxTiposAccionesFormularioAntiguedadesInventarios.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAntiguedadesInventarios(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAntiguedadesInventariosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAntiguedadesInventarios();
			
			if(this.jInternalFrameDetalleFormAntiguedadesInventarios==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<AntiguedadesInventarios> antiguedadesinventariossSeleccionados=new ArrayList<AntiguedadesInventarios>();		
			AntiguedadesInventarios antiguedadesinventarios=new AntiguedadesInventarios();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAntiguedadesInventarios(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAntiguedadesInventarios.getSelectedItem();
			
			
			
			
			antiguedadesinventariossSeleccionados=this.getAntiguedadesInventariossSeleccionados(true);
			//this.sTipoAccion;
			
			if(antiguedadesinventariossSeleccionados.size()==1) {
				for(AntiguedadesInventarios antiguedadesinventariosAux:antiguedadesinventariossSeleccionados) {
					antiguedadesinventarios=antiguedadesinventariosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAntiguedadesInventarios();
			
      		//this.finishProcessAntiguedadesInventarios(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAntiguedadesInventariosReturnGeneral() throws Exception {
		if(this.antiguedadesinventariosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.antiguedadesinventariosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.antiguedadesinventariosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.antiguedadesinventariosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.antiguedadesinventariosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.antiguedadesinventariosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAntiguedadesInventarios(false);
		}
		
		if(this.antiguedadesinventariosReturnGeneral.getConRetornoLista() || this.antiguedadesinventariosReturnGeneral.getConRetornoObjeto()) {
			if(this.antiguedadesinventariosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.antiguedadesinventariosLogic.setAntiguedadesInventarioss(this.antiguedadesinventariosReturnGeneral.getAntiguedadesInventarioss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingAntiguedadesInventarios(false);
		}
	}
	
	public void actualizarParametrosGeneralAntiguedadesInventarios() throws Exception {
		
		
	}
	
	public ArrayList<AntiguedadesInventarios> getAntiguedadesInventariossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<AntiguedadesInventarios> antiguedadesinventariossSeleccionados=new ArrayList<AntiguedadesInventarios>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAntiguedadesInventarios) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(AntiguedadesInventarios antiguedadesinventariosAux:antiguedadesinventariosLogic.getAntiguedadesInventarioss()) {
					if(antiguedadesinventariosAux.getIsSelected()) {
						antiguedadesinventariossSeleccionados.add(antiguedadesinventariosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AntiguedadesInventarios antiguedadesinventariosAux:this.antiguedadesinventarioss) {
					if(antiguedadesinventariosAux.getIsSelected()) {
						antiguedadesinventariossSeleccionados.add(antiguedadesinventariosAux);				
					}
				}
			}
			
			if(antiguedadesinventariossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						antiguedadesinventariossSeleccionados.addAll(this.antiguedadesinventariosLogic.getAntiguedadesInventarioss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						antiguedadesinventariossSeleccionados.addAll(this.antiguedadesinventarioss);				
					}
				}
			}
		} else {
			antiguedadesinventariossSeleccionados.add(this.antiguedadesinventarios);
		}
		
		return antiguedadesinventariossSeleccionados;
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
	
	public void generarReporteAntiguedadesInventariossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAntiguedadesInventariossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAntiguedadesInventariossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAntiguedadesInventariossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAntiguedadesInventariossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Antiguedades Inventarios",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAntiguedadesInventariossSeleccionados() throws Exception {
		ArrayList<AntiguedadesInventarios> antiguedadesinventariossSeleccionados=new ArrayList<AntiguedadesInventarios>();		
		
		antiguedadesinventariossSeleccionados=this.getAntiguedadesInventariossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAntiguedadesInventarioss("Todos",antiguedadesinventariossSeleccionados);
		
	}	
	
	public void generarReporteNormalAntiguedadesInventariossSeleccionados() throws Exception {
		ArrayList<AntiguedadesInventarios> antiguedadesinventariossSeleccionados=new ArrayList<AntiguedadesInventarios>();		
		
		antiguedadesinventariossSeleccionados=this.getAntiguedadesInventariossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAntiguedadesInventarioss("Todos",antiguedadesinventariossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAntiguedadesInventariossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<AntiguedadesInventarios> antiguedadesinventariossSeleccionados=new ArrayList<AntiguedadesInventarios>();
		
		antiguedadesinventariossSeleccionados=this.getAntiguedadesInventariossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAntiguedadesInventarioss("Todos",antiguedadesinventariossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAntiguedadesInventariossSeleccionados() throws Exception {
		ArrayList<AntiguedadesInventarios> antiguedadesinventariossSeleccionados=new ArrayList<AntiguedadesInventarios>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAntiguedadesInventarios();
		
		
		antiguedadesinventariossSeleccionados=this.getAntiguedadesInventariossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAntiguedadesInventarios();
		
		
		//this.generarReporteAntiguedadesInventarioss("Todos",antiguedadesinventariossSeleccionados ,antiguedadesinventariosImplementable,antiguedadesinventariosImplementableHome);
	}
	
	public void mostrarImportacionAntiguedadesInventarioss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAntiguedadesInventarios();
		
		this.abrirFrameImportacionAntiguedadesInventarios();		
		
			
		//this.generarReporteAntiguedadesInventarioss("Todos",antiguedadesinventariossSeleccionados ,antiguedadesinventariosImplementable,antiguedadesinventariosImplementableHome);
	}
	
	public void importarAntiguedadesInventarioss() throws Exception {		
	
	}
	
	public void exportarAntiguedadesInventariossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAntiguedadesInventariossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAntiguedadesInventariossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAntiguedadesInventariossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Antiguedades Inventarios",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAntiguedadesInventariossSeleccionados() throws Exception {
		ArrayList<AntiguedadesInventarios> antiguedadesinventariossSeleccionados=new ArrayList<AntiguedadesInventarios>();		
		
		antiguedadesinventariossSeleccionados=this.getAntiguedadesInventariossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"antiguedadesinventarios."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAntiguedadesInventarios(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(AntiguedadesInventarios antiguedadesinventariosAux:antiguedadesinventariossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAntiguedadesInventarios(antiguedadesinventariosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//antiguedadesinventariosAux.setsDetalleGeneralEntityReporte(antiguedadesinventariosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Antiguedades Inventarios",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAntiguedadesInventarios(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventarios,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=antiguedadesinventarios.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getfecha_ultima_venta_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getnombre_sucursal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getnombre_linea();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getnombre_linea_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getnombre_linea_categoria();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getnombre_linea_marca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getnombre_bodega();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getcantidad_disponible().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getfecha_ultima_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=antiguedadesinventarios.getfecha_ultima_venta().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAntiguedadesInventariossSeleccionados() throws Exception {
		ArrayList<AntiguedadesInventarios> antiguedadesinventariossSeleccionados=new ArrayList<AntiguedadesInventarios>();		
		
		antiguedadesinventariossSeleccionados=this.getAntiguedadesInventariossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"antiguedadesinventarios.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("AntiguedadesInventarioss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAntiguedadesInventarios(row);				
				iRow++;
			}				
			
			for(AntiguedadesInventarios antiguedadesinventariosAux:antiguedadesinventariossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAntiguedadesInventarios(antiguedadesinventariosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Antiguedades Inventarios",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAntiguedadesInventariossSeleccionados() throws Exception {
		ArrayList<AntiguedadesInventarios> antiguedadesinventariossSeleccionados=new ArrayList<AntiguedadesInventarios>();		
		
		antiguedadesinventariossSeleccionados=this.getAntiguedadesInventariossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"antiguedadesinventarios.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("antiguedadesinventarioss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("antiguedadesinventarios");
			//elementRoot.appendChild(element);
		
			for(AntiguedadesInventarios antiguedadesinventariosAux:antiguedadesinventariossSeleccionados) {
				element = document.createElement("antiguedadesinventarios");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAntiguedadesInventarios(antiguedadesinventariosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Antiguedades Inventarios",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAntiguedadesInventarios(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventarios,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getfecha_ultima_venta_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getnombre_sucursal());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getnombre_linea());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getnombre_linea_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getnombre_linea_categoria());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getnombre_linea_marca());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getnombre_bodega());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getcantidad_disponible());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getfecha_ultima_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(antiguedadesinventarios.getfecha_ultima_venta());				
	}
	
	public void setFilaDatosExportarXmlAntiguedadesInventarios(AntiguedadesInventarios antiguedadesinventarios,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AntiguedadesInventariosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(antiguedadesinventarios.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AntiguedadesInventariosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(antiguedadesinventarios.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementbodega_descripcion = document.createElement(AntiguedadesInventariosConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(antiguedadesinventarios.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementempresa_descripcion = document.createElement(AntiguedadesInventariosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(antiguedadesinventarios.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(AntiguedadesInventariosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(antiguedadesinventarios.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementlinea_descripcion = document.createElement(AntiguedadesInventariosConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(antiguedadesinventarios.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(AntiguedadesInventariosConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(antiguedadesinventarios.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(AntiguedadesInventariosConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(antiguedadesinventarios.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(AntiguedadesInventariosConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(antiguedadesinventarios.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementfecha_ultima_venta_hasta = document.createElement(AntiguedadesInventariosConstantesFunciones.FECHAULTIMAVENTAHASTA);
		elementfecha_ultima_venta_hasta.appendChild(document.createTextNode(antiguedadesinventarios.getfecha_ultima_venta_hasta().toString().trim()));
		element.appendChild(elementfecha_ultima_venta_hasta);

		Element elementnombre_sucursal = document.createElement(AntiguedadesInventariosConstantesFunciones.NOMBRESUCURSAL);
		elementnombre_sucursal.appendChild(document.createTextNode(antiguedadesinventarios.getnombre_sucursal().trim()));
		element.appendChild(elementnombre_sucursal);

		Element elementnombre_linea = document.createElement(AntiguedadesInventariosConstantesFunciones.NOMBRELINEA);
		elementnombre_linea.appendChild(document.createTextNode(antiguedadesinventarios.getnombre_linea().trim()));
		element.appendChild(elementnombre_linea);

		Element elementnombre_linea_grupo = document.createElement(AntiguedadesInventariosConstantesFunciones.NOMBRELINEAGRUPO);
		elementnombre_linea_grupo.appendChild(document.createTextNode(antiguedadesinventarios.getnombre_linea_grupo().trim()));
		element.appendChild(elementnombre_linea_grupo);

		Element elementnombre_linea_categoria = document.createElement(AntiguedadesInventariosConstantesFunciones.NOMBRELINEACATEGORIA);
		elementnombre_linea_categoria.appendChild(document.createTextNode(antiguedadesinventarios.getnombre_linea_categoria().trim()));
		element.appendChild(elementnombre_linea_categoria);

		Element elementnombre_linea_marca = document.createElement(AntiguedadesInventariosConstantesFunciones.NOMBRELINEAMARCA);
		elementnombre_linea_marca.appendChild(document.createTextNode(antiguedadesinventarios.getnombre_linea_marca().trim()));
		element.appendChild(elementnombre_linea_marca);

		Element elementcodigo = document.createElement(AntiguedadesInventariosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(antiguedadesinventarios.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(AntiguedadesInventariosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(antiguedadesinventarios.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnombre_bodega = document.createElement(AntiguedadesInventariosConstantesFunciones.NOMBREBODEGA);
		elementnombre_bodega.appendChild(document.createTextNode(antiguedadesinventarios.getnombre_bodega().trim()));
		element.appendChild(elementnombre_bodega);

		Element elementnombre_unidad = document.createElement(AntiguedadesInventariosConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(antiguedadesinventarios.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementcantidad_disponible = document.createElement(AntiguedadesInventariosConstantesFunciones.CANTIDADDISPONIBLE);
		elementcantidad_disponible.appendChild(document.createTextNode(antiguedadesinventarios.getcantidad_disponible().toString().trim()));
		element.appendChild(elementcantidad_disponible);

		Element elementfecha_ultima_compra = document.createElement(AntiguedadesInventariosConstantesFunciones.FECHAULTIMACOMPRA);
		elementfecha_ultima_compra.appendChild(document.createTextNode(antiguedadesinventarios.getfecha_ultima_compra().toString().trim()));
		element.appendChild(elementfecha_ultima_compra);

		Element elementfecha_ultima_venta = document.createElement(AntiguedadesInventariosConstantesFunciones.FECHAULTIMAVENTA);
		elementfecha_ultima_venta.appendChild(document.createTextNode(antiguedadesinventarios.getfecha_ultima_venta().toString().trim()));
		element.appendChild(elementfecha_ultima_venta);
	}
	
	public void generarReporteGroupGenericoAntiguedadesInventariossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<AntiguedadesInventarios> antiguedadesinventariossSeleccionados=new ArrayList<AntiguedadesInventarios>();
		
		antiguedadesinventariossSeleccionados=this.getAntiguedadesInventariossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAntiguedadesInventarios(antiguedadesinventariossSeleccionados);
		
		this.generarReporteAntiguedadesInventarioss("Todos",antiguedadesinventariossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAntiguedadesInventarios(ArrayList<AntiguedadesInventarios> antiguedadesinventariossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(AntiguedadesInventarios antiguedadesinventariosAux:antiguedadesinventariossSeleccionados) {
				antiguedadesinventariosAux.setsDetalleGeneralEntityReporte(antiguedadesinventariosAux.toString());
			
				if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(antiguedadesinventariosAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(antiguedadesinventariosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(antiguedadesinventariosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(antiguedadesinventariosAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(antiguedadesinventariosAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(antiguedadesinventariosAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(antiguedadesinventariosAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(antiguedadesinventariosAux.getfecha_ultima_venta_hasta()));
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(antiguedadesinventariosAux.getnombre_sucursal());
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEA)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(antiguedadesinventariosAux.getnombre_linea());
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(antiguedadesinventariosAux.getnombre_linea_grupo());
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(antiguedadesinventariosAux.getnombre_linea_categoria());
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(antiguedadesinventariosAux.getnombre_linea_marca());
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(antiguedadesinventariosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(antiguedadesinventariosAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREBODEGA)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(antiguedadesinventariosAux.getnombre_bodega());
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(antiguedadesinventariosAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(antiguedadesinventariosAux.getcantidad_disponible().toString());
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMACOMPRA)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(antiguedadesinventariosAux.getfecha_ultima_compra()));
				}
				 else if(sTipoSeleccionar.equals(AntiguedadesInventariosConstantesFunciones.LABEL_FECHAULTIMAVENTA)) {
					existe=true;
					antiguedadesinventariosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(antiguedadesinventariosAux.getfecha_ultima_venta()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AntiguedadesInventariosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAntiguedadesInventarios(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAntiguedadesInventarios=true;
				this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios=true;
				this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios=true;
			}
			
			this.isVisibilidadCeldaModificarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaActualizarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaEliminarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaCancelarAntiguedadesInventarios=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAntiguedadesInventarios=true;
				} else {
					this.isVisibilidadCeldaGuardarAntiguedadesInventarios=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAntiguedadesInventarios=false;
			this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios=false;
			this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios=false;
			this.isVisibilidadCeldaModificarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaActualizarAntiguedadesInventarios=true;
			this.isVisibilidadCeldaEliminarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaCancelarAntiguedadesInventarios=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAntiguedadesInventarios=true;
				} else {
					this.isVisibilidadCeldaGuardarAntiguedadesInventarios=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAntiguedadesInventarios=false;
			this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios=false;
			this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios=false;
			this.isVisibilidadCeldaModificarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaActualizarAntiguedadesInventarios=true;
			this.isVisibilidadCeldaEliminarAntiguedadesInventarios=true;
			this.isVisibilidadCeldaCancelarAntiguedadesInventarios=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAntiguedadesInventarios=true;
				} else {
					this.isVisibilidadCeldaGuardarAntiguedadesInventarios=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAntiguedadesInventarios=false;
			this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios=false;
			this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios=false;
			this.isVisibilidadCeldaModificarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaActualizarAntiguedadesInventarios=true;
			this.isVisibilidadCeldaEliminarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaCancelarAntiguedadesInventarios=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAntiguedadesInventarios=false;
				} else {
					this.isVisibilidadCeldaGuardarAntiguedadesInventarios=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAntiguedadesInventarios=true;
			this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios=true;
			this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios=true;
			this.isVisibilidadCeldaModificarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaActualizarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaEliminarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaCancelarAntiguedadesInventarios=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAntiguedadesInventarios=true;
				} else {
					this.isVisibilidadCeldaGuardarAntiguedadesInventarios=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAntiguedadesInventarios=false;
			this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios=false;
			this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios=false;
			this.isVisibilidadCeldaActualizarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaEliminarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaCancelarAntiguedadesInventarios=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAntiguedadesInventarios=false;
				} else {
					this.isVisibilidadCeldaGuardarAntiguedadesInventarios=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAntiguedadesInventarios=false;
			this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios=false;
			this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios=false;
			this.isVisibilidadCeldaModificarAntiguedadesInventarios=true;
			this.isVisibilidadCeldaActualizarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaEliminarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaCancelarAntiguedadesInventarios=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAntiguedadesInventarios=false;
				} else {
					this.isVisibilidadCeldaGuardarAntiguedadesInventarios=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AntiguedadesInventariosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAntiguedadesInventarios=true;
			this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios=true;
			this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios=true;
		} else {
			this.actualizarEstadoPanelsAntiguedadesInventarios(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAntiguedadesInventarios=false;
			//this.isVisibilidadCeldaVerFormAntiguedadesInventarios=false;
			this.isVisibilidadCeldaDuplicarAntiguedadesInventarios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!antiguedadesinventariosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios=false;
		} else {
			this.isVisibilidadCeldaNuevoAntiguedadesInventarios=false;
			this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
			if(!antiguedadesinventariosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios=false;												
			}
			
			this.jButtonCerrarAntiguedadesInventarios.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios=false;
		}
		
		if(!this.permiteMantenimiento(this.antiguedadesinventarios)) {
			this.isVisibilidadCeldaActualizarAntiguedadesInventarios=false;
			this.isVisibilidadCeldaEliminarAntiguedadesInventarios=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoAntiguedadesInventarios=false;
		this.isVisibilidadCeldaNuevoRelacionesAntiguedadesInventarios=false;
		this.isVisibilidadCeldaGuardarCambiosAntiguedadesInventarios=false;
		//this.isVisibilidadCeldaModificarAntiguedadesInventarios=true;
		this.isVisibilidadCeldaActualizarAntiguedadesInventarios=false;
		this.isVisibilidadCeldaEliminarAntiguedadesInventarios=false;
		//this.isVisibilidadCeldaCancelarAntiguedadesInventarios=true;			
		this.isVisibilidadCeldaGuardarAntiguedadesInventarios=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAntiguedadesInventarios() {
	}
	
	public void actualizarEstadoPanelsAntiguedadesInventarios(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAntiguedadesInventarios!=null) {
				this.jScrollPanelDatosEdicionAntiguedadesInventarios.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAntiguedadesInventarios!=null) {
				this.jTabbedPaneBusquedasAntiguedadesInventarios.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAntiguedadesInventarios!=null) {
				this.jScrollPanelDatosAntiguedadesInventarios.setVisible(true);
			}
			
			if(this.jPanelPaginacionAntiguedadesInventarios!=null) {
				this.jPanelPaginacionAntiguedadesInventarios.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAntiguedadesInventarios!=null) {
				this.jPanelParametrosReportesAntiguedadesInventarios.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAntiguedadesInventarios!=null) {
				this.jScrollPanelDatosEdicionAntiguedadesInventarios.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAntiguedadesInventarios!=null) {
				this.jTabbedPaneBusquedasAntiguedadesInventarios.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAntiguedadesInventarios!=null) {
				this.jScrollPanelDatosAntiguedadesInventarios.setVisible(false);
			}
			
			if(this.jPanelPaginacionAntiguedadesInventarios!=null) {
				this.jPanelPaginacionAntiguedadesInventarios.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAntiguedadesInventarios!=null) {
				this.jPanelParametrosReportesAntiguedadesInventarios.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAntiguedadesInventarios!=null) {
				this.jScrollPanelDatosEdicionAntiguedadesInventarios.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAntiguedadesInventarios!=null) {
				this.jTabbedPaneBusquedasAntiguedadesInventarios.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAntiguedadesInventarios!=null) {
				this.jScrollPanelDatosAntiguedadesInventarios.setVisible(false);
			}
			
			if(this.jPanelPaginacionAntiguedadesInventarios!=null) {
				this.jPanelPaginacionAntiguedadesInventarios.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAntiguedadesInventarios!=null) {
				this.jPanelParametrosReportesAntiguedadesInventarios.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAntiguedadesInventarios!=null) {
				this.jScrollPanelDatosEdicionAntiguedadesInventarios.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAntiguedadesInventarios!=null) {
				this.jTabbedPaneBusquedasAntiguedadesInventarios.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAntiguedadesInventarios!=null) {
				this.jScrollPanelDatosAntiguedadesInventarios.setVisible(false);
			}
			
			if(this.jPanelPaginacionAntiguedadesInventarios!=null) {
				this.jPanelPaginacionAntiguedadesInventarios.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAntiguedadesInventarios!=null) {
				this.jPanelParametrosReportesAntiguedadesInventarios.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAntiguedadesInventarios!=null) {
				this.jScrollPanelDatosEdicionAntiguedadesInventarios.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAntiguedadesInventarios!=null) {
				this.jTabbedPaneBusquedasAntiguedadesInventarios.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAntiguedadesInventarios!=null) {
				this.jScrollPanelDatosAntiguedadesInventarios.setVisible(true);
			}
			
			if(this.jPanelPaginacionAntiguedadesInventarios!=null) {
				this.jPanelPaginacionAntiguedadesInventarios.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAntiguedadesInventarios!=null) {
				this.jPanelParametrosReportesAntiguedadesInventarios.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAntiguedadesInventarios!=null) {
				this.jScrollPanelDatosEdicionAntiguedadesInventarios.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAntiguedadesInventarios!=null) {
				this.jTabbedPaneBusquedasAntiguedadesInventarios.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAntiguedadesInventarios!=null) {
				this.jScrollPanelDatosAntiguedadesInventarios.setVisible(true);
			}
			
			if(this.jPanelPaginacionAntiguedadesInventarios!=null) {
				this.jPanelPaginacionAntiguedadesInventarios.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAntiguedadesInventarios!=null) {
				this.jPanelParametrosReportesAntiguedadesInventarios.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAntiguedadesInventarios!=null) {
				this.jScrollPanelDatosEdicionAntiguedadesInventarios.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAntiguedadesInventarios!=null) {
				this.jTabbedPaneBusquedasAntiguedadesInventarios.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAntiguedadesInventarios!=null) {
				this.jScrollPanelDatosAntiguedadesInventarios.setVisible(true);
			}
			
			if(this.jPanelPaginacionAntiguedadesInventarios!=null) {
				this.jPanelPaginacionAntiguedadesInventarios.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAntiguedadesInventarios!=null) {
				this.jPanelParametrosReportesAntiguedadesInventarios.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAntiguedadesInventarios!=null) {
					this.jTabbedPaneBusquedasAntiguedadesInventarios.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAntiguedadesInventarios!=null) {
				this.jPanelParametrosReportesAntiguedadesInventarios.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.antiguedadesinventariosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAntiguedadesInventarios!=null) {
				this.jTabbedPaneBusquedasAntiguedadesInventarios.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAntiguedadesInventarios!=null) {
				this.jPanelParametrosReportesAntiguedadesInventarios.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaAntiguedadesInventarios=isParaBodega;
			if(!this.isVisibilidadBusquedaAntiguedadesInventarios) {this.jTabbedPaneBusquedasAntiguedadesInventarios.remove(jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaAntiguedadesInventarios=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaAntiguedadesInventarios) {this.jTabbedPaneBusquedasAntiguedadesInventarios.remove(jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaAntiguedadesInventarios=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaAntiguedadesInventarios) {this.jTabbedPaneBusquedasAntiguedadesInventarios.remove(jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaAntiguedadesInventarios=isParaLinea;
			if(!this.isVisibilidadBusquedaAntiguedadesInventarios) {this.jTabbedPaneBusquedasAntiguedadesInventarios.remove(jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaAntiguedadesInventarios=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaAntiguedadesInventarios) {this.jTabbedPaneBusquedasAntiguedadesInventarios.remove(jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaAntiguedadesInventarios=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaAntiguedadesInventarios) {this.jTabbedPaneBusquedasAntiguedadesInventarios.remove(jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaAntiguedadesInventarios=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaAntiguedadesInventarios) {this.jTabbedPaneBusquedasAntiguedadesInventarios.remove(jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios);}
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
			
			this.inicializarActualizarBindingTablaAntiguedadesInventarios(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAntiguedadesInventarios() {
		this.updateBorderResaltarBusquedasFormularioAntiguedadesInventarios();
		this.updateVisibilidadBusquedasFormularioAntiguedadesInventarios();
		this.updateHabilitarBusquedasFormularioAntiguedadesInventarios();
	}
	
	public void updateBorderResaltarBusquedasFormularioAntiguedadesInventarios() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAntiguedadesInventarios.getComponents().length>0) {
	

		if(this.antiguedadesinventariosConstantesFunciones.resaltarBusquedaAntiguedadesInventariosAntiguedadesInventarios!=null) {
			index= this.jTabbedPaneBusquedasAntiguedadesInventarios.indexOfComponent(this.jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAntiguedadesInventarios.getComponent(index);
				jPanel.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarBusquedaAntiguedadesInventariosAntiguedadesInventarios);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAntiguedadesInventarios() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAntiguedadesInventarios.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAntiguedadesInventarios.indexOfComponent(this.jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAntiguedadesInventarios.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarBusquedaAntiguedadesInventariosAntiguedadesInventarios);
			if(!this.antiguedadesinventariosConstantesFunciones.mostrarBusquedaAntiguedadesInventariosAntiguedadesInventarios && index>-1) {
				this.jTabbedPaneBusquedasAntiguedadesInventarios.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAntiguedadesInventarios() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAntiguedadesInventarios.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAntiguedadesInventarios.indexOfComponent(this.jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAntiguedadesInventarios.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarBusquedaAntiguedadesInventariosAntiguedadesInventarios);
				this.jTabbedPaneBusquedasAntiguedadesInventarios.setEnabledAt(index,this.antiguedadesinventariosConstantesFunciones.activarBusquedaAntiguedadesInventariosAntiguedadesInventarios);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAntiguedadesInventarios(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaAntiguedadesInventarios")) {
			index= this.jTabbedPaneBusquedasAntiguedadesInventarios.indexOfComponent(this.jPanelBusquedaAntiguedadesInventariosAntiguedadesInventarios);

			this.jTabbedPaneBusquedasAntiguedadesInventarios.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAntiguedadesInventarios.getComponent(index);

			this.antiguedadesinventariosConstantesFunciones.setResaltarBusquedaAntiguedadesInventariosAntiguedadesInventarios(resaltar);

			jPanel.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarBusquedaAntiguedadesInventariosAntiguedadesInventarios);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarAntiguedadesInventarios.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAntiguedadesInventarios() throws Exception {

		if(this.jInternalFrameDetalleFormAntiguedadesInventarios==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAntiguedadesInventarios();
		this.updateVisibilidadResaltarControlesFormularioAntiguedadesInventarios();
		this.updateHabilitarResaltarControlesFormularioAntiguedadesInventarios();
		
	}
	
	public void updateBorderResaltarControlesFormularioAntiguedadesInventarios() throws Exception {
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.antiguedadesinventariosConstantesFunciones.resaltaridAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelidAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltaridAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarid_bodegaAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_bodegaAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarid_bodegaAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarid_empresaAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_empresaAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarid_empresaAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarid_sucursalAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_sucursalAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarid_sucursalAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarid_lineaAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_lineaAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarid_lineaAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarid_linea_grupoAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_grupoAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarid_linea_grupoAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarid_linea_categoriaAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_categoriaAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarid_linea_categoriaAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarid_linea_marcaAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_marcaAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarid_linea_marcaAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarfecha_ultima_venta_hastaAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_venta_hastaAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarfecha_ultima_venta_hastaAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_sucursalAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_sucursalAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_sucursalAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_lineaAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_lineaAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_lineaAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_linea_grupoAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_grupoAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_linea_grupoAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_linea_categoriaAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_categoriaAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_linea_categoriaAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_linea_marcaAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_marcaAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_linea_marcaAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarcodigoAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldcodigoAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarcodigoAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarnombreAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombreAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarnombreAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_bodegaAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_bodegaAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_bodegaAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_unidadAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldnombre_unidadAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarnombre_unidadAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarcantidad_disponibleAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldcantidad_disponibleAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarcantidad_disponibleAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarfecha_ultima_compraAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_compraAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarfecha_ultima_compraAntiguedadesInventarios);}
		if(this.antiguedadesinventariosConstantesFunciones.resaltarfecha_ultima_ventaAntiguedadesInventarios!=null && this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_ventaAntiguedadesInventarios.setBorder(this.antiguedadesinventariosConstantesFunciones.resaltarfecha_ultima_ventaAntiguedadesInventarios);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAntiguedadesInventarios() throws Exception {		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
	
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelidAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostraridAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelidAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostraridAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_bodegaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarid_bodegaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelid_bodegaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarid_bodegaAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_empresaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarid_empresaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelid_empresaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarid_empresaAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_sucursalAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarid_sucursalAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelid_sucursalAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarid_sucursalAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_lineaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarid_lineaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelid_lineaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarid_lineaAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_grupoAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarid_linea_grupoAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelid_linea_grupoAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarid_linea_grupoAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_categoriaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarid_linea_categoriaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelid_linea_categoriaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarid_linea_categoriaAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_marcaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarid_linea_marcaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelid_linea_marcaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarid_linea_marcaAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_venta_hastaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarfecha_ultima_venta_hastaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelfecha_ultima_venta_hastaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarfecha_ultima_venta_hastaAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_sucursalAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_sucursalAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelnombre_sucursalAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_sucursalAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_lineaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_lineaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelnombre_lineaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_lineaAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_grupoAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_linea_grupoAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelnombre_linea_grupoAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_linea_grupoAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_categoriaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_linea_categoriaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelnombre_linea_categoriaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_linea_categoriaAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_marcaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_linea_marcaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelnombre_linea_marcaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_linea_marcaAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldcodigoAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarcodigoAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelcodigoAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarcodigoAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombreAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarnombreAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelnombreAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarnombreAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_bodegaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_bodegaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelnombre_bodegaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_bodegaAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldnombre_unidadAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_unidadAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelnombre_unidadAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarnombre_unidadAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldcantidad_disponibleAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarcantidad_disponibleAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelcantidad_disponibleAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarcantidad_disponibleAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_compraAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarfecha_ultima_compraAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelfecha_ultima_compraAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarfecha_ultima_compraAntiguedadesInventarios);
		//this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_ventaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarfecha_ultima_ventaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jPanelfecha_ultima_ventaAntiguedadesInventarios.setVisible(this.antiguedadesinventariosConstantesFunciones.mostrarfecha_ultima_ventaAntiguedadesInventarios);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAntiguedadesInventarios() throws Exception {
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAntiguedadesInventarios!=null) {
	
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jLabelidAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activaridAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_bodegaAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarid_bodegaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_empresaAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarid_empresaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_sucursalAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarid_sucursalAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_lineaAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarid_lineaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_grupoAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarid_linea_grupoAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_categoriaAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarid_linea_categoriaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jComboBoxid_linea_marcaAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarid_linea_marcaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_venta_hastaAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarfecha_ultima_venta_hastaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_sucursalAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarnombre_sucursalAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_lineaAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarnombre_lineaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_grupoAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarnombre_linea_grupoAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_categoriaAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarnombre_linea_categoriaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_linea_marcaAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarnombre_linea_marcaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldcodigoAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarcodigoAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombreAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarnombreAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextAreanombre_bodegaAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarnombre_bodegaAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldnombre_unidadAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarnombre_unidadAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jTextFieldcantidad_disponibleAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarcantidad_disponibleAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_compraAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarfecha_ultima_compraAntiguedadesInventarios);
		this.jInternalFrameDetalleFormAntiguedadesInventarios.jDateChooserfecha_ultima_ventaAntiguedadesInventarios.setEnabled(this.antiguedadesinventariosConstantesFunciones.activarfecha_ultima_ventaAntiguedadesInventarios);
		}
	}
	
		
}