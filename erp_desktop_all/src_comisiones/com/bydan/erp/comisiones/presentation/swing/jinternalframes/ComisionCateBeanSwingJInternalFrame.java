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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;




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

import com.bydan.erp.comisiones.util.ComisionCateConstantesFunciones;
import com.bydan.erp.comisiones.util.ComisionCateParameterReturnGeneral;
//import com.bydan.erp.comisiones.util.ComisionCateParameterGeneral;
//import com.bydan.erp.comisiones.presentation.report.source.ComisionCateBean;
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

import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.comisiones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.comisiones.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.comisiones.business.entity.*;
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


import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

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
public class ComisionCateBeanSwingJInternalFrame extends ComisionCateJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ComisionCateBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ComisionCate> comisioncateValidator = new ClassValidator<ComisionCate>(ComisionCate.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ComisionCate comisioncate;	
	public ComisionCate comisioncateAux;
	public ComisionCate comisioncateAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ComisionCate comisioncateTotales;
	public Long idComisionCateActual;
	public Long iIdNuevoComisionCate=0L;
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

	public String sFinalQueryComboComisionConfig="";

	public List<ComisionConfig> comisionconfigsForeignKey;

	public List<ComisionConfig> getcomisionconfigsForeignKey() {
		return comisionconfigsForeignKey;
	}

	public void setcomisionconfigsForeignKey(List<ComisionConfig> comisionconfigsForeignKey) {
		this.comisionconfigsForeignKey = comisionconfigsForeignKey;
	}

	//OBJETO FK ACTUAL
	public ComisionConfig comisionconfigForeignKey;

	public ComisionConfig getcomisionconfigForeignKey() {
		return comisionconfigForeignKey;
	}

	public void setcomisionconfigForeignKey(ComisionConfig comisionconfigForeignKey) {
		this.comisionconfigForeignKey = comisionconfigForeignKey;
	}

	public String sFinalQueryComboVendedor="";

	public List<Vendedor> vendedorsForeignKey;

	public List<Vendedor> getvendedorsForeignKey() {
		return vendedorsForeignKey;
	}

	public void setvendedorsForeignKey(List<Vendedor> vendedorsForeignKey) {
		this.vendedorsForeignKey = vendedorsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Vendedor vendedorForeignKey;

	public Vendedor getvendedorForeignKey() {
		return vendedorForeignKey;
	}

	public void setvendedorForeignKey(Vendedor vendedorForeignKey) {
		this.vendedorForeignKey = vendedorForeignKey;
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

	public String sFinalQueryComboEstadoComision="";

	public List<EstadoComision> estadocomisionsForeignKey;

	public List<EstadoComision> getestadocomisionsForeignKey() {
		return estadocomisionsForeignKey;
	}

	public void setestadocomisionsForeignKey(List<EstadoComision> estadocomisionsForeignKey) {
		this.estadocomisionsForeignKey = estadocomisionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoComision estadocomisionForeignKey;

	public EstadoComision getestadocomisionForeignKey() {
		return estadocomisionForeignKey;
	}

	public void setestadocomisionForeignKey(EstadoComision estadocomisionForeignKey) {
		this.estadocomisionForeignKey = estadocomisionForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idVendedorActual=0L;

	public Long getidVendedorActual() {
		return idVendedorActual;
	}

	public void setidVendedorActual(Long idVendedorActual) {
		this.idVendedorActual= idVendedorActual;
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
	
	public Boolean isPermisoTodoComisionCate;
	public Boolean isPermisoNuevoComisionCate;
	public Boolean isPermisoActualizarComisionCate;
	public Boolean isPermisoActualizarOriginalComisionCate;
	public Boolean isPermisoEliminarComisionCate;
	public Boolean isPermisoGuardarCambiosComisionCate;
	public Boolean isPermisoConsultaComisionCate;
	public Boolean isPermisoBusquedaComisionCate;
	public Boolean isPermisoReporteComisionCate;
	public Boolean isPermisoPaginacionMedioComisionCate;
	public Boolean isPermisoPaginacionAltoComisionCate;
	public Boolean isPermisoPaginacionTodoComisionCate;
	public Boolean isPermisoCopiarComisionCate;
	public Boolean isPermisoVerFormComisionCate;
	public Boolean isPermisoDuplicarComisionCate;
	public Boolean isPermisoOrdenComisionCate;
	
	
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
	
	public ComisionCateParameterReturnGeneral comisioncateReturnGeneral;
	public ComisionCateParameterReturnGeneral comisioncateParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoComisionCate=false;
	public Boolean esParaAccionDesdeFormularioComisionCate=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ComisionCateSessionBeanAdditional comisioncateSessionBeanAdditional=null;
	
	public ComisionCateSessionBeanAdditional getComisionCateSessionBeanAdditional() {
		return this.comisioncateSessionBeanAdditional;
	}
	
	public void setComisionCateSessionBeanAdditional(ComisionCateSessionBeanAdditional comisioncateSessionBeanAdditional) {
		try {
			this.comisioncateSessionBeanAdditional=comisioncateSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ComisionCateBeanSwingJInternalFrameAdditional comisioncateBeanSwingJInternalFrameAdditional=null;
	//public class ComisionCateBeanSwingJInternalFrame
	
	public ComisionCateBeanSwingJInternalFrameAdditional getComisionCateBeanSwingJInternalFrameAdditional() {
		return this.comisioncateBeanSwingJInternalFrameAdditional;
	}
	
	public void setComisionCateBeanSwingJInternalFrameAdditional(ComisionCateBeanSwingJInternalFrameAdditional comisioncateBeanSwingJInternalFrameAdditional) {
		try {
			this.comisioncateBeanSwingJInternalFrameAdditional=comisioncateBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ComisionCateLogic comisioncateLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ComisionCate comisioncateBean;
	public ComisionCateConstantesFunciones comisioncateConstantesFunciones;
	//public ComisionCateParameterReturnGeneral comisioncateReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ComisionConfigLogic comisionconfigLogic;
	public VendedorLogic vendedorLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public EstadoComisionLogic estadocomisionLogic;
	
	//PARAMETROS
	
	
	//public List<ComisionCate> comisioncates;	
	//public List<ComisionCate> comisioncatesEliminados;
	//public List<ComisionCate> comisioncatesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoComisionCate=false;
	public Boolean isVisibilidadCeldaDuplicarComisionCate=true;
	public Boolean isVisibilidadCeldaCopiarComisionCate=true;
	public Boolean isVisibilidadCeldaVerFormComisionCate=true;
	public Boolean isVisibilidadCeldaOrdenComisionCate=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesComisionCate=false;
	public Boolean isVisibilidadCeldaModificarComisionCate=false;
	public Boolean isVisibilidadCeldaActualizarComisionCate=false;
	public Boolean isVisibilidadCeldaEliminarComisionCate=false;
	public Boolean isVisibilidadCeldaCancelarComisionCate=false;
	public Boolean isVisibilidadCeldaGuardarComisionCate=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosComisionCate=false;	
	
	
	public Boolean isVisibilidadFK_IdComisionConfig=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoComision=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdVendedor=false;
	
	public Long getiIdNuevoComisionCate() {
		return this.iIdNuevoComisionCate;
	}

	public void setiIdNuevoComisionCate(Long iIdNuevoComisionCate) {
		this.iIdNuevoComisionCate = iIdNuevoComisionCate;
	}
	
	public Long getidComisionCateActual() {
		return this.idComisionCateActual;
	}

	public void setidComisionCateActual(Long idComisionCateActual) {
		this.idComisionCateActual = idComisionCateActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ComisionCate getcomisioncate() {
		return this.comisioncate;
	}

	public void setcomisioncate(ComisionCate comisioncate) {
		this.comisioncate = comisioncate;
	}
	
	public ComisionCate getcomisioncateAux() {
		return this.comisioncateAux;
	}

	public void setcomisioncateAux(ComisionCate comisioncateAux) {
		this.comisioncateAux = comisioncateAux;
	}				
	
	public ComisionCate getcomisioncateAnterior() {
		return this.comisioncateAnterior;
	}

	public void setcomisioncateAnterior(ComisionCate comisioncateAnterior) {
		this.comisioncateAnterior = comisioncateAnterior;
	}	
	
	public ComisionCate getcomisioncateTotales() {
		return this.comisioncateTotales;
	}

	public void setcomisioncateTotales(ComisionCate comisioncateTotales) {
		this.comisioncateTotales = comisioncateTotales;
	}	
	
	public ComisionCate getcomisioncateBean() {
		return this.comisioncateBean;
	}

	public void setcomisioncateBean(ComisionCate comisioncateBean) {
		this.comisioncateBean = comisioncateBean;
	}	
	
	public ComisionCateParameterReturnGeneral getcomisioncateReturnGeneral() {
		return this.comisioncateReturnGeneral;
	}

	public void setcomisioncateReturnGeneral(ComisionCateParameterReturnGeneral comisioncateReturnGeneral) {
		this.comisioncateReturnGeneral = comisioncateReturnGeneral;
	}	
	
	
	public Long id_comision_configFK_IdComisionConfig=-1L;

	public Long getid_comision_configFK_IdComisionConfig() {
		return this.id_comision_configFK_IdComisionConfig;
	}

	public void setid_comision_configFK_IdComisionConfig(Long id_comision_configFK_IdComisionConfig) {
		this.id_comision_configFK_IdComisionConfig = id_comision_configFK_IdComisionConfig;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_comisionFK_IdEstadoComision=-1L;

	public Long getid_estado_comisionFK_IdEstadoComision() {
		return this.id_estado_comisionFK_IdEstadoComision;
	}

	public void setid_estado_comisionFK_IdEstadoComision(Long id_estado_comisionFK_IdEstadoComision) {
		this.id_estado_comisionFK_IdEstadoComision = id_estado_comisionFK_IdEstadoComision;
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

	public Long id_vendedorFK_IdVendedor=-1L;

	public Long getid_vendedorFK_IdVendedor() {
		return this.id_vendedorFK_IdVendedor;
	}

	public void setid_vendedorFK_IdVendedor(Long id_vendedorFK_IdVendedor) {
		this.id_vendedorFK_IdVendedor = id_vendedorFK_IdVendedor;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ComisionCateLogic getComisionCateLogic()	{		
		return comisioncateLogic;
	}

	public void setComisionCateLogic(ComisionCateLogic comisioncateLogic) {
		this.comisioncateLogic = comisioncateLogic;
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
	
	public Boolean getIsEsNuevoComisionCate() {
		return isEsNuevoComisionCate;
	}

	public void setIsEsNuevoComisionCate(Boolean isEsNuevoComisionCate) {
		this.isEsNuevoComisionCate = isEsNuevoComisionCate;
	}

	public Boolean getEsParaAccionDesdeFormularioComisionCate() {
		return esParaAccionDesdeFormularioComisionCate;
	}
	
	public void setEsParaAccionDesdeFormularioComisionCate(Boolean esParaAccionDesdeFormularioComisionCate) {
		this.esParaAccionDesdeFormularioComisionCate = esParaAccionDesdeFormularioComisionCate;
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

			if(this.comisioncateSessionBean==null) {
				this.comisioncateSessionBean=new ComisionCateSessionBean();
			}

			if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(comisioncateSessionBean.getlidEmpresaActual());
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

	public void cargarCombosComisionConfigsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.comisionconfigsForeignKey=new ArrayList<ComisionConfig>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ComisionConfigLogic comisionconfigLogic=new ComisionConfigLogic();

			//comisionconfigLogic.getComisionConfigDataAccess().setIsForForeingKeyData(true);

			if(this.comisioncateSessionBean==null) {
				this.comisioncateSessionBean=new ComisionCateSessionBean();
			}

			if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionComisionConfig()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comisionconfigLogic.getComisionConfigDataAccess().setIsForForeingKeyData(true);

					comisionconfigLogic.getTodosComisionConfigsWithConnection(sFinalQuery,new Pagination());

					this.comisionconfigsForeignKey=comisionconfigLogic.getComisionConfigs();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaComisionConfig(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionconfigLogic.getEntityWithConnection(comisioncateSessionBean.getlidComisionConfigActual());
					this.comisionconfigsForeignKey.add(comisionconfigLogic.getComisionConfig());
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

	public void cargarCombosVendedorsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.vendedorsForeignKey=new ArrayList<Vendedor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			VendedorLogic vendedorLogic=new VendedorLogic();

			//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

			if(this.comisioncateSessionBean==null) {
				this.comisioncateSessionBean=new ComisionCateSessionBean();
			}

			if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

					vendedorLogic.getTodosVendedorsWithConnection(sFinalQuery,new Pagination());

					this.vendedorsForeignKey=vendedorLogic.getVendedors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaVendedor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorLogic.getEntityWithConnection(comisioncateSessionBean.getlidVendedorActual());
					this.vendedorsForeignKey.add(vendedorLogic.getVendedor());
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

			if(this.comisioncateSessionBean==null) {
				this.comisioncateSessionBean=new ComisionCateSessionBean();
			}

			if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(comisioncateSessionBean.getlidLineaActual());
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

			if(this.comisioncateSessionBean==null) {
				this.comisioncateSessionBean=new ComisionCateSessionBean();
			}

			if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(comisioncateSessionBean.getlidLineaGrupoActual());
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

			if(this.comisioncateSessionBean==null) {
				this.comisioncateSessionBean=new ComisionCateSessionBean();
			}

			if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(comisioncateSessionBean.getlidLineaCategoriaActual());
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

	public void cargarCombosEstadoComisionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadocomisionsForeignKey=new ArrayList<EstadoComision>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoComisionLogic estadocomisionLogic=new EstadoComisionLogic();

			//estadocomisionLogic.getEstadoComisionDataAccess().setIsForForeingKeyData(true);

			if(this.comisioncateSessionBean==null) {
				this.comisioncateSessionBean=new ComisionCateSessionBean();
			}

			if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionEstadoComision()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadocomisionLogic.getEstadoComisionDataAccess().setIsForForeingKeyData(true);

					estadocomisionLogic.getTodosEstadoComisionsWithConnection(sFinalQuery,new Pagination());

					this.estadocomisionsForeignKey=estadocomisionLogic.getEstadoComisions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoComision(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocomisionLogic.getEntityWithConnection(comisioncateSessionBean.getlidEstadoComisionActual());
					this.estadocomisionsForeignKey.add(estadocomisionLogic.getEstadoComision());
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

					if(this.comisioncate!=null) {
						this.comisioncate.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						this.jInternalFrameDetalleFormComisionCate.jComboBoxid_empresaComisionCate.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaComisionCate.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						if(this.jInternalFrameDetalleFormComisionCate.jComboBoxid_empresaComisionCate.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_empresaComisionCate.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaComisionCateGenerico)throws Exception
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
				jComboBoxid_empresaComisionCateGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaComisionCateGenerico!=null && jComboBoxid_empresaComisionCateGenerico.getItemCount()>0) {
					jComboBoxid_empresaComisionCateGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualComisionConfigForeignKey(Long idComisionConfigSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			ComisionConfig  comisionconfigTemp=null;

			for(ComisionConfig comisionconfigAux:comisionconfigsForeignKey) {
				if(comisionconfigAux.getId()!=null && comisionconfigAux.getId().equals(idComisionConfigSeleccionado)) {
					comisionconfigTemp=comisionconfigAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(comisionconfigTemp!=null) {

					if(this.comisioncate!=null) {
						this.comisioncate.setComisionConfig(comisionconfigTemp);
					}

					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						this.jInternalFrameDetalleFormComisionCate.jComboBoxid_comision_configComisionCate.setSelectedItem(comisionconfigTemp);
					}
				} else {
					//jComboBoxid_comision_configComisionCate.setSelectedItem(comisionconfigTemp);
					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						if(this.jInternalFrameDetalleFormComisionCate.jComboBoxid_comision_configComisionCate.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_comision_configComisionCate.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdComisionConfig") || sFormularioTipoBusqueda.equals("Todos")){
					if(comisionconfigTemp!=null && jComboBoxid_comision_configFK_IdComisionConfigComisionCate!=null) {
						jComboBoxid_comision_configFK_IdComisionConfigComisionCate.setSelectedItem(comisionconfigTemp);
					} else {
						if(jComboBoxid_comision_configFK_IdComisionConfigComisionCate!=null) {
							//jComboBoxid_comision_configFK_IdComisionConfigComisionCate.setSelectedItem(comisionconfigTemp);
							if(jComboBoxid_comision_configFK_IdComisionConfigComisionCate.getItemCount()>0) {
								jComboBoxid_comision_configFK_IdComisionConfigComisionCate.setSelectedIndex(0);
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

	public String getActualComisionConfigForeignKeyDescripcion(Long idComisionConfigSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			ComisionConfig  comisionconfigTemp=null;

			for(ComisionConfig comisionconfigAux:comisionconfigsForeignKey) {
				if(comisionconfigAux.getId()!=null && comisionconfigAux.getId().equals(idComisionConfigSeleccionado)) {
					comisionconfigTemp=comisionconfigAux;
					break;
				}
			}


			sDescripcion=ComisionConfigConstantesFunciones.getComisionConfigDescripcion(comisionconfigTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualComisionConfigForeignKeyGenerico(Long idComisionConfigSeleccionado,JComboBox jComboBoxid_comision_configComisionCateGenerico)throws Exception
	{
		try
		{
			ComisionConfig  comisionconfigTemp=null;

			for(ComisionConfig comisionconfigAux:comisionconfigsForeignKey) {
				if(comisionconfigAux.getId()!=null && comisionconfigAux.getId().equals(idComisionConfigSeleccionado)) {
					comisionconfigTemp=comisionconfigAux;
					break;
				}
			}

			if(comisionconfigTemp!=null) {
				jComboBoxid_comision_configComisionCateGenerico.setSelectedItem(comisionconfigTemp);
			} else {
				if(jComboBoxid_comision_configComisionCateGenerico!=null && jComboBoxid_comision_configComisionCateGenerico.getItemCount()>0) {
					jComboBoxid_comision_configComisionCateGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualVendedorForeignKey(Long idVendedorSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(vendedorTemp!=null) {

					if(this.comisioncate!=null) {
						this.comisioncate.setVendedor(vendedorTemp);
					}

					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						this.jInternalFrameDetalleFormComisionCate.jComboBoxid_vendedorComisionCate.setSelectedItem(vendedorTemp);
					}
				} else {
					//jComboBoxid_vendedorComisionCate.setSelectedItem(vendedorTemp);
					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						if(this.jInternalFrameDetalleFormComisionCate.jComboBoxid_vendedorComisionCate.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_vendedorComisionCate.setSelectedIndex(0);
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

	public String getActualVendedorForeignKeyDescripcion(Long idVendedorSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}


			sDescripcion=VendedorConstantesFunciones.getVendedorDescripcion(vendedorTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualVendedorForeignKeyGenerico(Long idVendedorSeleccionado,JComboBox jComboBoxid_vendedorComisionCateGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(vendedorTemp!=null) {
				jComboBoxid_vendedorComisionCateGenerico.setSelectedItem(vendedorTemp);
			} else {
				if(jComboBoxid_vendedorComisionCateGenerico!=null && jComboBoxid_vendedorComisionCateGenerico.getItemCount()>0) {
					jComboBoxid_vendedorComisionCateGenerico.setSelectedIndex(0);
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

					if(this.comisioncate!=null) {
						this.comisioncate.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaComisionCate.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						if(this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaComisionCateGenerico)throws Exception
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
				jComboBoxid_lineaComisionCateGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaComisionCateGenerico!=null && jComboBoxid_lineaComisionCateGenerico.getItemCount()>0) {
					jComboBoxid_lineaComisionCateGenerico.setSelectedIndex(0);
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

					if(this.comisioncate!=null) {
						this.comisioncate.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoComisionCate.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						if(this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoComisionCateGenerico)throws Exception
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
				jComboBoxid_linea_grupoComisionCateGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoComisionCateGenerico!=null && jComboBoxid_linea_grupoComisionCateGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoComisionCateGenerico.setSelectedIndex(0);
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

					if(this.comisioncate!=null) {
						this.comisioncate.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_categoriaComisionCate.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaComisionCate.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						if(this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_categoriaComisionCate.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_categoriaComisionCate.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaComisionCateGenerico)throws Exception
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
				jComboBoxid_linea_categoriaComisionCateGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaComisionCateGenerico!=null && jComboBoxid_linea_categoriaComisionCateGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaComisionCateGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoComisionForeignKey(Long idEstadoComisionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoComision  estadocomisionTemp=null;

			for(EstadoComision estadocomisionAux:estadocomisionsForeignKey) {
				if(estadocomisionAux.getId()!=null && estadocomisionAux.getId().equals(idEstadoComisionSeleccionado)) {
					estadocomisionTemp=estadocomisionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadocomisionTemp!=null) {

					if(this.comisioncate!=null) {
						this.comisioncate.setEstadoComision(estadocomisionTemp);
					}

					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						this.jInternalFrameDetalleFormComisionCate.jComboBoxid_estado_comisionComisionCate.setSelectedItem(estadocomisionTemp);
					}
				} else {
					//jComboBoxid_estado_comisionComisionCate.setSelectedItem(estadocomisionTemp);
					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						if(this.jInternalFrameDetalleFormComisionCate.jComboBoxid_estado_comisionComisionCate.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_estado_comisionComisionCate.setSelectedIndex(0);
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

	public String getActualEstadoComisionForeignKeyDescripcion(Long idEstadoComisionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoComision  estadocomisionTemp=null;

			for(EstadoComision estadocomisionAux:estadocomisionsForeignKey) {
				if(estadocomisionAux.getId()!=null && estadocomisionAux.getId().equals(idEstadoComisionSeleccionado)) {
					estadocomisionTemp=estadocomisionAux;
					break;
				}
			}


			sDescripcion=EstadoComisionConstantesFunciones.getEstadoComisionDescripcion(estadocomisionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoComisionForeignKeyGenerico(Long idEstadoComisionSeleccionado,JComboBox jComboBoxid_estado_comisionComisionCateGenerico)throws Exception
	{
		try
		{
			EstadoComision  estadocomisionTemp=null;

			for(EstadoComision estadocomisionAux:estadocomisionsForeignKey) {
				if(estadocomisionAux.getId()!=null && estadocomisionAux.getId().equals(idEstadoComisionSeleccionado)) {
					estadocomisionTemp=estadocomisionAux;
					break;
				}
			}

			if(estadocomisionTemp!=null) {
				jComboBoxid_estado_comisionComisionCateGenerico.setSelectedItem(estadocomisionTemp);
			} else {
				if(jComboBoxid_estado_comisionComisionCateGenerico!=null && jComboBoxid_estado_comisionComisionCateGenerico.getItemCount()>0) {
					jComboBoxid_estado_comisionComisionCateGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ComisionCate comisioncate,JComboBox jComboBoxid_empresaComisionCateGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaComisionCateGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormComisionCate.jComboBoxid_empresaComisionCate.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaComisionCateGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				comisioncate.setid_empresa(empresaAux.getId());
				comisioncate.setempresa_descripcion(ComisionCateConstantesFunciones.getEmpresaDescripcion(empresaAux));
				comisioncate.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarComisionConfigForeignKey(ComisionCate comisioncate,JComboBox jComboBoxid_comision_configComisionCateGenerico)throws Exception
	{
		try
		{
			ComisionConfig  comisionconfigAux=new ComisionConfig();

			if(jComboBoxid_comision_configComisionCateGenerico==null) {
				comisionconfigAux=(ComisionConfig)this.jInternalFrameDetalleFormComisionCate.jComboBoxid_comision_configComisionCate.getSelectedItem();
			} else {
				comisionconfigAux=(ComisionConfig)jComboBoxid_comision_configComisionCateGenerico.getSelectedItem();
			}

			if(comisionconfigAux!=null && comisionconfigAux.getId()!=null) {
				comisioncate.setid_comision_config(comisionconfigAux.getId());
				comisioncate.setcomisionconfig_descripcion(ComisionCateConstantesFunciones.getComisionConfigDescripcion(comisionconfigAux));
				comisioncate.setComisionConfig(comisionconfigAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVendedorForeignKey(ComisionCate comisioncate,JComboBox jComboBoxid_vendedorComisionCateGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorAux=new Vendedor();

			if(jComboBoxid_vendedorComisionCateGenerico==null) {
				vendedorAux=(Vendedor)this.jInternalFrameDetalleFormComisionCate.jComboBoxid_vendedorComisionCate.getSelectedItem();
			} else {
				vendedorAux=(Vendedor)jComboBoxid_vendedorComisionCateGenerico.getSelectedItem();
			}

			if(vendedorAux!=null && vendedorAux.getId()!=null) {
				comisioncate.setid_vendedor(vendedorAux.getId());
				comisioncate.setvendedor_descripcion(ComisionCateConstantesFunciones.getVendedorDescripcion(vendedorAux));
				comisioncate.setVendedor(vendedorAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ComisionCate comisioncate,JComboBox jComboBoxid_lineaComisionCateGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaComisionCateGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaComisionCateGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				comisioncate.setid_linea(lineaAux.getId());
				comisioncate.setlinea_descripcion(ComisionCateConstantesFunciones.getLineaDescripcion(lineaAux));
				comisioncate.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ComisionCate comisioncate,JComboBox jComboBoxid_linea_grupoComisionCateGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoComisionCateGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoComisionCateGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				comisioncate.setid_linea_grupo(lineaAux.getId());
				comisioncate.setlineagrupo_descripcion(ComisionCateConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				comisioncate.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ComisionCate comisioncate,JComboBox jComboBoxid_linea_categoriaComisionCateGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaComisionCateGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_categoriaComisionCate.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaComisionCateGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				comisioncate.setid_linea_categoria(lineaAux.getId());
				comisioncate.setlineacategoria_descripcion(ComisionCateConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				comisioncate.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoComisionForeignKey(ComisionCate comisioncate,JComboBox jComboBoxid_estado_comisionComisionCateGenerico)throws Exception
	{
		try
		{
			EstadoComision  estadocomisionAux=new EstadoComision();

			if(jComboBoxid_estado_comisionComisionCateGenerico==null) {
				estadocomisionAux=(EstadoComision)this.jInternalFrameDetalleFormComisionCate.jComboBoxid_estado_comisionComisionCate.getSelectedItem();
			} else {
				estadocomisionAux=(EstadoComision)jComboBoxid_estado_comisionComisionCateGenerico.getSelectedItem();
			}

			if(estadocomisionAux!=null && estadocomisionAux.getId()!=null) {
				comisioncate.setid_estado_comision(estadocomisionAux.getId());
				comisioncate.setestadocomision_descripcion(ComisionCateConstantesFunciones.getEstadoComisionDescripcion(estadocomisionAux));
				comisioncate.setEstadoComision(estadocomisionAux);			}
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

					if(!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionCate!=null) { 
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_empresaComisionCate.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormComisionCate.jComboBoxid_empresaComisionCate.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionCate!=null) { 
					}

					if(!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameComisionConfigsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingComisionConfig=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionCate!=null) { 
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_comision_configComisionCate.removeAllItems();

							for(ComisionConfig comisionconfig:this.comisionconfigsForeignKey) {
								this.jInternalFrameDetalleFormComisionCate.jComboBoxid_comision_configComisionCate.addItem(comisionconfig);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionCate!=null) { 
					}

					if(!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdComisionConfig") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_comision_configFK_IdComisionConfigComisionCate.removeAllItems();

							for(ComisionConfig comisionconfig:this.comisionconfigsForeignKey) {
								this.jComboBoxid_comision_configFK_IdComisionConfigComisionCate.addItem(comisionconfig);
							}
						}

						if(!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameVendedorsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingVendedor=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionCate!=null) { 
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_vendedorComisionCate.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jInternalFrameDetalleFormComisionCate.jComboBoxid_vendedorComisionCate.addItem(vendedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionCate!=null) { 
					}

					if(!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionCate!=null) { 
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionCate!=null) { 
					}

					if(!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionCate!=null) { 
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionCate!=null) { 
					}

					if(!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionCate!=null) { 
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_categoriaComisionCate.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_categoriaComisionCate.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionCate!=null) { 
					}

					if(!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoComisionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoComision=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionCate!=null) { 
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_estado_comisionComisionCate.removeAllItems();

							for(EstadoComision estadocomision:this.estadocomisionsForeignKey) {
								this.jInternalFrameDetalleFormComisionCate.jComboBoxid_estado_comisionComisionCate.addItem(estadocomision);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionCate!=null) { 
					}

					if(!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComisionCate!=null) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_empresaComisionCate.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionCate!=null) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_empresaComisionCate.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameComisionConfigForeignKey(ComisionConfig comisionconfig,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComisionCate!=null) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_comision_configComisionCate.setSelectedItem(comisionconfig);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionCate!=null) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_comision_configComisionCate.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_comision_configFK_IdComisionConfigComisionCate.setSelectedItem(comisionconfig);
						} else {
							this.jComboBoxid_comision_configFK_IdComisionConfigComisionCate.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameVendedorForeignKey(Vendedor vendedor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComisionCate!=null) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_vendedorComisionCate.setSelectedItem(vendedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionCate!=null) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_vendedorComisionCate.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComisionCate!=null) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionCate!=null) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameLineaGrupoForeignKey(Linea lineagrupo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComisionCate!=null) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionCate!=null) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameLineaCategoriaForeignKey(Linea lineacategoria,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComisionCate!=null) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_categoriaComisionCate.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionCate!=null) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_categoriaComisionCate.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEstadoComisionForeignKey(EstadoComision estadocomision,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComisionCate!=null) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_estado_comisionComisionCate.setSelectedItem(estadocomision);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionCate!=null) {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxid_estado_comisionComisionCate.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesComisionCate() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ComisionCateConstantesFunciones.refrescarForeignKeysDescripcionesComisionCate(this.comisioncateLogic.getComisionCates());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ComisionCateConstantesFunciones.refrescarForeignKeysDescripcionesComisionCate(this.comisioncates);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(ComisionConfig.class));
		classes.add(new Classe(Vendedor.class));
		classes.add(new Classe(Linea.class));
		classes.add(new Classe(EstadoComision.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//comisioncateLogic.setComisionCates(this.comisioncates);
			comisioncateLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ComisionCateParameterReturnGeneral getComisionCateParameterGeneral() {
		return this.comisioncateParameterGeneral;
	}
	
	public void setComisionCateParameterGeneral(ComisionCateParameterReturnGeneral comisioncateParameterGeneral) {
		this.comisioncateParameterGeneral = comisioncateParameterGeneral;
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
	
	public Boolean getIsPermisoTodoComisionCate() {
		return isPermisoTodoComisionCate;
	}

	public void setIsPermisoTodoComisionCate(Boolean isPermisoTodoComisionCate) {
		this.isPermisoTodoComisionCate = isPermisoTodoComisionCate;
	}

	public Boolean getIsPermisoNuevoComisionCate() {
		return isPermisoNuevoComisionCate;
	}

	public void setIsPermisoNuevoComisionCate(Boolean isPermisoNuevoComisionCate) {
		this.isPermisoNuevoComisionCate = isPermisoNuevoComisionCate;
	}

	public Boolean getIsPermisoActualizarComisionCate() {
		return isPermisoActualizarComisionCate;
	}

	public void setIsPermisoActualizarComisionCate(Boolean isPermisoActualizarComisionCate) {
		this.isPermisoActualizarComisionCate = isPermisoActualizarComisionCate;
	}

	public Boolean getIsPermisoEliminarComisionCate() {
		return isPermisoEliminarComisionCate;
	}

	public void setIsPermisoEliminarComisionCate(Boolean isPermisoEliminarComisionCate) {
		this.isPermisoEliminarComisionCate = isPermisoEliminarComisionCate;
	}

	public Boolean getIsPermisoGuardarCambiosComisionCate() {
		return isPermisoGuardarCambiosComisionCate;
	}

	public void setIsPermisoGuardarCambiosComisionCate(Boolean isPermisoGuardarCambiosComisionCate) {
		this.isPermisoGuardarCambiosComisionCate = isPermisoGuardarCambiosComisionCate;
	}
	
	public Boolean getIsPermisoConsultaComisionCate() {
		return isPermisoConsultaComisionCate;
	}

	public void setIsPermisoConsultaComisionCate(Boolean isPermisoConsultaComisionCate) {
		this.isPermisoConsultaComisionCate = isPermisoConsultaComisionCate;
	}

	public Boolean getIsPermisoBusquedaComisionCate() {
		return isPermisoBusquedaComisionCate;
	}

	public void setIsPermisoBusquedaComisionCate(Boolean isPermisoBusquedaComisionCate) {
		this.isPermisoBusquedaComisionCate = isPermisoBusquedaComisionCate;
	}

	public Boolean getIsPermisoReporteComisionCate() {
		return isPermisoReporteComisionCate;
	}

	public void setIsPermisoReporteComisionCate(Boolean isPermisoReporteComisionCate) {
		this.isPermisoReporteComisionCate = isPermisoReporteComisionCate;
	}
	
	public Boolean getIsPermisoPaginacionMedioComisionCate() {
		return isPermisoPaginacionMedioComisionCate;
	}

	public void setIsPermisoPaginacionMedioComisionCate(Boolean isPermisoPaginacionMedioComisionCate) {
		this.isPermisoPaginacionMedioComisionCate = isPermisoPaginacionMedioComisionCate;
	}
	
	public Boolean getIsPermisoPaginacionTodoComisionCate() {
		return isPermisoPaginacionTodoComisionCate;
	}

	public void setIsPermisoPaginacionTodoComisionCate(Boolean isPermisoPaginacionTodoComisionCate) {
		this.isPermisoPaginacionTodoComisionCate = isPermisoPaginacionTodoComisionCate;
	}
	
	public Boolean getIsPermisoPaginacionAltoComisionCate() {
		return isPermisoPaginacionAltoComisionCate;
	}

	public void setIsPermisoPaginacionAltoComisionCate(Boolean isPermisoPaginacionAltoComisionCate) {
		this.isPermisoPaginacionAltoComisionCate = isPermisoPaginacionAltoComisionCate;
	}
	
	public Boolean getIsPermisoCopiarComisionCate() {
		return isPermisoCopiarComisionCate;
	}

	public void setIsPermisoCopiarComisionCate(Boolean isPermisoCopiarComisionCate) {
		this.isPermisoCopiarComisionCate = isPermisoCopiarComisionCate;
	}
	
	public Boolean getIsPermisoVerFormComisionCate() {
		return isPermisoVerFormComisionCate;
	}

	public void setIsPermisoVerFormComisionCate(Boolean isPermisoVerFormComisionCate) {
		this.isPermisoVerFormComisionCate = isPermisoVerFormComisionCate;
	}
	
	public Boolean getIsPermisoDuplicarComisionCate() {
		return isPermisoDuplicarComisionCate;
	}

	public void setIsPermisoDuplicarComisionCate(Boolean isPermisoDuplicarComisionCate) {
		this.isPermisoDuplicarComisionCate = isPermisoDuplicarComisionCate;
	}
	
	public Boolean getIsPermisoOrdenComisionCate() {
		return isPermisoOrdenComisionCate;
	}

	public void setIsPermisoOrdenComisionCate(Boolean isPermisoOrdenComisionCate) {
		this.isPermisoOrdenComisionCate = isPermisoOrdenComisionCate;
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
	
	public Boolean getIsVisibilidadCeldaNuevoComisionCate() {
		return isVisibilidadCeldaNuevoComisionCate;
	}

	public void setIsVisibilidadCeldaNuevoComisionCate(Boolean isVisibilidadCeldaNuevoComisionCate) {
		this.isVisibilidadCeldaNuevoComisionCate = isVisibilidadCeldaNuevoComisionCate;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarComisionCate() {
		return isVisibilidadCeldaDuplicarComisionCate;
	}

	public void setIsVisibilidadCeldaDuplicarComisionCate(Boolean isVisibilidadCeldaDuplicarComisionCate) {
		this.isVisibilidadCeldaDuplicarComisionCate = isVisibilidadCeldaDuplicarComisionCate;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarComisionCate() {
		return isVisibilidadCeldaCopiarComisionCate;
	}

	public void setIsVisibilidadCeldaCopiarComisionCate(Boolean isVisibilidadCeldaCopiarComisionCate) {
		this.isVisibilidadCeldaCopiarComisionCate = isVisibilidadCeldaCopiarComisionCate;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormComisionCate() {
		return isVisibilidadCeldaVerFormComisionCate;
	}

	public void setIsVisibilidadCeldaVerFormComisionCate(Boolean isVisibilidadCeldaVerFormComisionCate) {
		this.isVisibilidadCeldaVerFormComisionCate = isVisibilidadCeldaVerFormComisionCate;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenComisionCate() {
		return isVisibilidadCeldaOrdenComisionCate;
	}

	public void setIsVisibilidadCeldaOrdenComisionCate(Boolean isVisibilidadCeldaOrdenComisionCate) {
		this.isVisibilidadCeldaOrdenComisionCate = isVisibilidadCeldaOrdenComisionCate;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesComisionCate() {
		return isVisibilidadCeldaNuevoRelacionesComisionCate;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesComisionCate(Boolean isVisibilidadCeldaNuevoRelacionesComisionCate) {
		this.isVisibilidadCeldaNuevoRelacionesComisionCate = isVisibilidadCeldaNuevoRelacionesComisionCate;
	}
	
	public Boolean getIsVisibilidadCeldaModificarComisionCate() {
		return isVisibilidadCeldaModificarComisionCate;
	}

	public void setIsVisibilidadCeldaModificarComisionCate(Boolean isVisibilidadCeldaModificarComisionCate) {
		this.isVisibilidadCeldaModificarComisionCate = isVisibilidadCeldaModificarComisionCate;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarComisionCate() {
		return isVisibilidadCeldaActualizarComisionCate;
	}

	public void setIsVisibilidadCeldaActualizarComisionCate(Boolean isVisibilidadCeldaActualizarComisionCate) {
		this.isVisibilidadCeldaActualizarComisionCate = isVisibilidadCeldaActualizarComisionCate;
	}

	public Boolean getIsVisibilidadCeldaEliminarComisionCate() {
		return isVisibilidadCeldaEliminarComisionCate;
	}

	public void setIsVisibilidadCeldaEliminarComisionCate(Boolean isVisibilidadCeldaEliminarComisionCate) {
		this.isVisibilidadCeldaEliminarComisionCate = isVisibilidadCeldaEliminarComisionCate;
	}

	public Boolean getIsVisibilidadCeldaCancelarComisionCate() {
		return isVisibilidadCeldaCancelarComisionCate;
	}

	public void setIsVisibilidadCeldaCancelarComisionCate(Boolean isVisibilidadCeldaCancelarComisionCate) {
		this.isVisibilidadCeldaCancelarComisionCate = isVisibilidadCeldaCancelarComisionCate;
	}

	public Boolean getIsVisibilidadCeldaGuardarComisionCate() {
		return isVisibilidadCeldaGuardarComisionCate;
	}

	public void setIsVisibilidadCeldaGuardarComisionCate(Boolean isVisibilidadCeldaGuardarComisionCate) {
		this.isVisibilidadCeldaGuardarComisionCate = isVisibilidadCeldaGuardarComisionCate;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosComisionCate() {
		return isVisibilidadCeldaGuardarCambiosComisionCate;
	}

	public void setIsVisibilidadCeldaGuardarCambiosComisionCate(Boolean isVisibilidadCeldaGuardarCambiosComisionCate) {
		this.isVisibilidadCeldaGuardarCambiosComisionCate = isVisibilidadCeldaGuardarCambiosComisionCate;
	}
		
	public ComisionCateSessionBean getcomisioncateSessionBean() {
		return this.comisioncateSessionBean;
	}
	
	public void setcomisioncateSessionBean(ComisionCateSessionBean comisioncateSessionBean) {
		this.comisioncateSessionBean=comisioncateSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdComisionConfig() {
		return this.isVisibilidadFK_IdComisionConfig;
	}

	public void setisVisibilidadFK_IdComisionConfig(Boolean isVisibilidadFK_IdComisionConfig) {
		this.isVisibilidadFK_IdComisionConfig=isVisibilidadFK_IdComisionConfig;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoComision() {
		return this.isVisibilidadFK_IdEstadoComision;
	}

	public void setisVisibilidadFK_IdEstadoComision(Boolean isVisibilidadFK_IdEstadoComision) {
		this.isVisibilidadFK_IdEstadoComision=isVisibilidadFK_IdEstadoComision;
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

	public Boolean getisVisibilidadFK_IdVendedor() {
		return this.isVisibilidadFK_IdVendedor;
	}

	public void setisVisibilidadFK_IdVendedor(Boolean isVisibilidadFK_IdVendedor) {
		this.isVisibilidadFK_IdVendedor=isVisibilidadFK_IdVendedor;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysComisionCate(ComisionCate comisioncate)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(comisioncate,null);
				this.setActualParaGuardarComisionConfigForeignKey(comisioncate,null);
				this.setActualParaGuardarVendedorForeignKey(comisioncate,null);
				this.setActualParaGuardarLineaForeignKey(comisioncate,null);
				this.setActualParaGuardarLineaGrupoForeignKey(comisioncate,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(comisioncate,null);
				this.setActualParaGuardarEstadoComisionForeignKey(comisioncate,null);
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
	
	public void bugActualizarReferenciaActual(ComisionCate comisioncate,ComisionCate comisioncateAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalComisionCate(comisioncate);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		comisioncateAux.setId(comisioncate.getId());
		comisioncateAux.setVersionRow(comisioncate.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessComisionCate();
		
			int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ComisionCateJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualComisionCate(this.comisioncate,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = comisioncateValidator.getInvalidValues(this.comisioncate);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			comisioncateLogic.setDatosCliente(datosCliente);
			comisioncateLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				comisioncateAux=new  ComisionCate();
				
				comisioncateAux.setIsNew(true);
				comisioncateAux.setIsChanged(true);
				
				comisioncateAux.setComisionCateOriginal(this.comisioncate);
				
				comisioncateAux.setId(this.comisioncate.getId());	
				comisioncateAux.setVersionRow(this.comisioncate.getVersionRow());	
				comisioncateAux.setid_empresa(this.comisioncate.getid_empresa());	
				comisioncateAux.setid_comision_config(this.comisioncate.getid_comision_config());	
				comisioncateAux.setid_vendedor(this.comisioncate.getid_vendedor());	
				comisioncateAux.setid_linea(this.comisioncate.getid_linea());	
				comisioncateAux.setid_linea_grupo(this.comisioncate.getid_linea_grupo());	
				comisioncateAux.setid_linea_categoria(this.comisioncate.getid_linea_categoria());	
				comisioncateAux.setid_estado_comision(this.comisioncate.getid_estado_comision());	
				comisioncateAux.setporcentaje(this.comisioncate.getporcentaje());	
				comisioncateAux.setdescripcion(this.comisioncate.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comisioncateSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comisioncateSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(comisioncateAux,comisioncateLogic.getComisionCates());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisioncateAux,comisioncates);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.comisioncateSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisioncateSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisioncateLogic.saveComisionCates();//WithConnection
						//comisioncateLogic.getSetVersionRowComisionCates();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.comisioncate,comisioncateAux);
					
					this.refrescarForeignKeysDescripcionesComisionCate();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisioncateSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisioncateLogic.saveComisionCateRelaciones(comisioncateAux);//WithConnection
								//comisioncateLogic.getSetVersionRowComisionCates();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.comisioncate,comisioncateAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.comisioncateSessionBean.getEstaModoGuardarRelaciones() 
									|| this.comisioncateSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(comisioncateAux,comisioncateLogic.getComisionCates());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(comisioncateAux,comisioncates);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.comisioncate,comisioncateAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				comisioncateAux=new  ComisionCate();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.comisioncateSessionBean.getEsGuardarRelacionado() 
					|| (this.comisioncateSessionBean.getEsGuardarRelacionado() && this.comisioncate.getId()>=0)) {
						
					comisioncateAux.setIsNew(false);
				}
				
				comisioncateAux.setIsDeleted(false);
			
				comisioncateAux.setId(this.comisioncate.getId());	
				comisioncateAux.setVersionRow(this.comisioncate.getVersionRow());	
				comisioncateAux.setid_empresa(this.comisioncate.getid_empresa());	
				comisioncateAux.setid_comision_config(this.comisioncate.getid_comision_config());	
				comisioncateAux.setid_vendedor(this.comisioncate.getid_vendedor());	
				comisioncateAux.setid_linea(this.comisioncate.getid_linea());	
				comisioncateAux.setid_linea_grupo(this.comisioncate.getid_linea_grupo());	
				comisioncateAux.setid_linea_categoria(this.comisioncate.getid_linea_categoria());	
				comisioncateAux.setid_estado_comision(this.comisioncate.getid_estado_comision());	
				comisioncateAux.setporcentaje(this.comisioncate.getporcentaje());	
				comisioncateAux.setdescripcion(this.comisioncate.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comisioncateAux,comisioncateLogic.getComisionCates());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisioncateAux,comisioncates);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.comisioncateSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisioncateSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisioncateLogic.saveComisionCates();//WithConnection
						//comisioncateLogic.getSetVersionRowComisionCates();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.comisioncate,comisioncateAux);
					
					this.refrescarForeignKeysDescripcionesComisionCate();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisioncateSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisioncateLogic.saveComisionCateRelaciones(comisioncateAux);//WithConnection
								//comisioncateLogic.getSetVersionRowComisionCates();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.comisioncate,comisioncateAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.comisioncateSessionBean.getEstaModoGuardarRelaciones() 
									|| this.comisioncateSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(comisioncateAux,comisioncateLogic.getComisionCates());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(comisioncateAux,comisioncates);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.comisioncate,comisioncateAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				comisioncateAux=new  ComisionCate();
				
				comisioncateAux.setIsNew(false);
				comisioncateAux.setIsChanged(false);
				
				comisioncateAux.setIsDeleted(true);
				
				comisioncateAux.setId(this.comisioncate.getId());	
				comisioncateAux.setVersionRow(this.comisioncate.getVersionRow());	
				comisioncateAux.setid_empresa(this.comisioncate.getid_empresa());	
				comisioncateAux.setid_comision_config(this.comisioncate.getid_comision_config());	
				comisioncateAux.setid_vendedor(this.comisioncate.getid_vendedor());	
				comisioncateAux.setid_linea(this.comisioncate.getid_linea());	
				comisioncateAux.setid_linea_grupo(this.comisioncate.getid_linea_grupo());	
				comisioncateAux.setid_linea_categoria(this.comisioncate.getid_linea_categoria());	
				comisioncateAux.setid_estado_comision(this.comisioncate.getid_estado_comision());	
				comisioncateAux.setporcentaje(this.comisioncate.getporcentaje());	
				comisioncateAux.setdescripcion(this.comisioncate.getdescripcion());	
				
				if(this.comisioncateSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.comisioncateAux.getId()>=0) {	
						this.comisioncatesEliminados.add(comisioncateAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(comisioncateAux,comisioncateLogic.getComisionCates());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisioncateAux,comisioncates);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.comisioncateSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisioncateSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisioncateLogic.saveComisionCates();//WithConnection
						//comisioncateLogic.getSetVersionRowComisionCates();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisioncateSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisioncateLogic.saveComisionCateRelaciones(comisioncateAux);//WithConnection
								//comisioncateLogic.getSetVersionRowComisionCates();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.comisioncateSessionBean.getEstaModoGuardarRelaciones() 
								|| this.comisioncateSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(comisioncateAux,comisioncateLogic.getComisionCates());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(comisioncateAux,comisioncates);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.getComisionCates().addAll(this.comisioncatesEliminados);
					
					comisioncateLogic.saveComisionCates();//WithConnection
					//comisioncateLogic.getSetVersionRowComisionCates();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesComisionCate();
				
				this.comisioncatesEliminados= new ArrayList<ComisionCate>();		
			}
			
			if(this.comisioncateSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisioncateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Comision Cate GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Comision Cate",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.comisioncate=comisioncateAux;
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
      		//this.finishProcessComisionCate();
      	}
		
	}	
	
	public void actualizarRelaciones(ComisionCate comisioncateLocal) throws Exception {
		
		if(this.comisioncateSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ComisionCate comisioncateLocal) throws Exception {	
		if(this.comisioncateSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				comisioncateLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ComisionConfigDetalleFormJInternalFrame.class)) {
				ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrameLocal=(ComisionConfigBeanSwingJInternalFrame) ((ComisionConfigDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				comisionconfigBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoComisionConfig(comisionconfigBeanSwingJInternalFrameLocal.getcomisionconfig(),true);
				comisionconfigBeanSwingJInternalFrameLocal.actualizarLista(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig,this.comisionconfigsForeignKey);

				comisionconfigBeanSwingJInternalFrameLocal.actualizarRelaciones(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig);

				comisioncateLocal.setComisionConfig(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig);

				this.addItemDefectoCombosForeignKeyComisionConfig();
				this.cargarCombosFrameComisionConfigsForeignKey("Formulario");
				this.setActualComisionConfigForeignKey(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VendedorDetalleFormJInternalFrame.class)) {
				VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrameLocal=(VendedorBeanSwingJInternalFrame) ((VendedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vendedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVendedor(vendedorBeanSwingJInternalFrameLocal.getvendedor(),true);
				vendedorBeanSwingJInternalFrameLocal.actualizarLista(vendedorBeanSwingJInternalFrameLocal.vendedor,this.vendedorsForeignKey);

				vendedorBeanSwingJInternalFrameLocal.actualizarRelaciones(vendedorBeanSwingJInternalFrameLocal.vendedor);

				comisioncateLocal.setVendedor(vendedorBeanSwingJInternalFrameLocal.vendedor);

				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey("Formulario");
				this.setActualVendedorForeignKey(vendedorBeanSwingJInternalFrameLocal.vendedor.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				comisioncateLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				comisioncateLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				comisioncateLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoComisionDetalleFormJInternalFrame.class)) {
				EstadoComisionBeanSwingJInternalFrame estadocomisionBeanSwingJInternalFrameLocal=(EstadoComisionBeanSwingJInternalFrame) ((EstadoComisionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadocomisionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoComision(estadocomisionBeanSwingJInternalFrameLocal.getestadocomision(),true);
				estadocomisionBeanSwingJInternalFrameLocal.actualizarLista(estadocomisionBeanSwingJInternalFrameLocal.estadocomision,this.estadocomisionsForeignKey);

				estadocomisionBeanSwingJInternalFrameLocal.actualizarRelaciones(estadocomisionBeanSwingJInternalFrameLocal.estadocomision);

				comisioncateLocal.setEstadoComision(estadocomisionBeanSwingJInternalFrameLocal.estadocomision);

				this.addItemDefectoCombosForeignKeyEstadoComision();
				this.cargarCombosFrameEstadoComisionsForeignKey("Formulario");
				this.setActualEstadoComisionForeignKey(estadocomisionBeanSwingJInternalFrameLocal.estadocomision.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarComisionCateActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = comisioncateValidator.getInvalidValues(this.comisioncate);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ComisionCate comisioncate,List<ComisionCate> comisioncates) throws Exception {
		try	{		
			ComisionCateConstantesFunciones.actualizarLista(comisioncate,comisioncates,this.comisioncateSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ComisionCate comisioncate,List<ComisionCate> comisioncates) throws Exception {
		try	{			
			ComisionCateConstantesFunciones.actualizarSelectedLista(comisioncate,comisioncates);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ComisionCate> comisioncatesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				comisioncatesLocal=this.comisioncateLogic.getComisionCates();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				comisioncatesLocal=this.comisioncates;
			}
			//ARCHITECTURE
		
			for(ComisionCate comisioncateLocal:comisioncatesLocal) {
				if(this.permiteMantenimiento(comisioncateLocal) && comisioncateLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ComisionCateConstantesFunciones.getComisionCateLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ComisionCateConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionCate.jLabelid_empresaComisionCate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionCateConstantesFunciones.IDCOMISIONCONFIG)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionCate.jLabelid_comision_configComisionCate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionCateConstantesFunciones.IDVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionCate.jLabelid_vendedorComisionCate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionCateConstantesFunciones.IDLINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionCate.jLabelid_lineaComisionCate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionCateConstantesFunciones.IDLINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionCate.jLabelid_linea_grupoComisionCate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionCateConstantesFunciones.IDLINEACATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionCate.jLabelid_linea_categoriaComisionCate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionCateConstantesFunciones.IDESTADOCOMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionCate.jLabelid_estado_comisionComisionCate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionCateConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionCate.jLabelporcentajeComisionCate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionCateConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionCate.jLabeldescripcionComisionCate,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionCate.jLabelid_empresaComisionCate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionCate.jLabelid_comision_configComisionCate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionCate.jLabelid_vendedorComisionCate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionCate.jLabelid_lineaComisionCate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionCate.jLabelid_linea_grupoComisionCate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionCate.jLabelid_linea_categoriaComisionCate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionCate.jLabelid_estado_comisionComisionCate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionCate.jLabelporcentajeComisionCate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionCate.jLabeldescripcionComisionCate,"");
		
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
		this.iIdNuevoComisionCate--;	
		
		
		this.comisioncateAux=new ComisionCate();
		
		this.comisioncateAux.setId(this.iIdNuevoComisionCate);
		this.comisioncateAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comisioncateLogic.getComisionCates().add(this.comisioncateAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.comisioncates.add(this.comisioncateAux);
		}
		//ARCHITECTURE
		
		this.comisioncate=this.comisioncateAux;
		
		if(ComisionCateJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioComisionCate(this.comisioncate);
			this.setVariablesObjetoActualToFormularioForeignKeyComisionCate(this.comisioncate);
		}
				
		//this.setDefaultControlesComisionCate();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyComisionCate();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyComisionCate();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyComisionCate();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComisionCate(this.comisioncateBean,this.comisioncate,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ComisionCateConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.comisioncateSessionBean.getConGuardarRelaciones()) {
			classes=ComisionCateConstantesFunciones.getClassesRelationshipsOfComisionCate(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.comisioncateReturnGeneral=comisioncateLogic.procesarEventosComisionCatesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisioncateLogic.getComisionCates(),this.comisioncate,this.comisioncateParameterGeneral,this.isEsNuevoComisionCate,classes);//this.comisioncateLogic.getComisionCate()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanComisionCate(this.comisioncateReturnGeneral,this.comisioncateBean,false);
		
		if(this.comisioncateReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyComisionCate(this.comisioncateReturnGeneral.getComisionCate());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioComisionCate(this.comisioncateReturnGeneral.getComisionCate());
		}
		
		if(this.comisioncateReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioComisionCate(this.comisioncateReturnGeneral.getComisionCate(),classes);//this.comisioncateBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualComisionCate(this.comisioncate,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyComisionCate();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyComisionCate();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComisionCateBeanSwingJInternalFrameAdditional.RecargarFormComisionCate(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingComisionCate(false);
						
			if(comisioncateSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ComisionCateJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionCate();
			}
			
			this.actualizarVisualTableDatosComisionCate();
			
			this.jTableDatosComisionCate.setRowSelectionInterval(this.getIndiceNuevoComisionCate(), this.getIndiceNuevoComisionCate());
			
			this.seleccionarFilaTablaComisionCateActual();
						
			this.actualizarEstadoCeldasBotonesComisionCate("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesComisionCate(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormComisionCate.jTextFieldporcentajeComisionCate.setEnabled(isHabilitar && this.comisioncateConstantesFunciones.activarporcentajeComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jTextAreadescripcionComisionCate.setEnabled(isHabilitar && this.comisioncateConstantesFunciones.activardescripcionComisionCate);	
		//
		this.jInternalFrameDetalleFormComisionCate.jComboBoxid_empresaComisionCate.setEnabled(isHabilitar && this.comisioncateConstantesFunciones.activarid_empresaComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jComboBoxid_comision_configComisionCate.setEnabled(isHabilitar && this.comisioncateConstantesFunciones.activarid_comision_configComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jComboBoxid_vendedorComisionCate.setEnabled(isHabilitar && this.comisioncateConstantesFunciones.activarid_vendedorComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.setEnabled(isHabilitar && this.comisioncateConstantesFunciones.activarid_lineaComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.setEnabled(isHabilitar && this.comisioncateConstantesFunciones.activarid_linea_grupoComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_categoriaComisionCate.setEnabled(isHabilitar && this.comisioncateConstantesFunciones.activarid_linea_categoriaComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jComboBoxid_estado_comisionComisionCate.setEnabled(isHabilitar && this.comisioncateConstantesFunciones.activarid_estado_comisionComisionCate);
	};
	
	public void setDefaultControlesComisionCate() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoComisionCate(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.comisioncateSessionBean.setConGuardarRelaciones(true);			
			this.comisioncateSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormComisionCate.jTabbedPaneRelacionesComisionCate.setVisible(true);
			
					
		} else {
			//this.comisioncateSessionBean.setConGuardarRelaciones(false);			
			this.comisioncateSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormComisionCate.jTabbedPaneRelacionesComisionCate.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoComisionCate() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionCate comisioncateAux:this.comisioncateLogic.getComisionCates()) {
				if(comisioncateAux.getId().equals(this.iIdNuevoComisionCate)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionCate comisioncateAux:this.comisioncates) {
				if(comisioncateAux.getId().equals(this.iIdNuevoComisionCate)) {
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
	
	public int getIndiceActualComisionCate(ComisionCate comisioncate,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionCate comisioncateAux:this.comisioncateLogic.getComisionCates()) {
				if(comisioncateAux.getId().equals(comisioncate.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionCate comisioncateAux:this.comisioncates) {
				if(comisioncateAux.getId().equals(comisioncate.getId())) {
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
	
	public void setCamposBaseDesdeOriginalComisionCate(ComisionCate comisioncateOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionCate comisioncateAux:this.comisioncateLogic.getComisionCates()) {
				if(comisioncateAux.getComisionCateOriginal().getId().equals(comisioncateOriginal.getId())) {
					existe=true;
					comisioncateOriginal.setId(comisioncateAux.getId());
					comisioncateOriginal.setVersionRow(comisioncateAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionCate comisioncateAux:this.comisioncates) {
				if(comisioncateAux.getComisionCateOriginal().getId().equals(comisioncateOriginal.getId())) {
					existe=true;
					comisioncateOriginal.setId(comisioncateAux.getId());
					comisioncateOriginal.setVersionRow(comisioncateAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosComisionCate(Boolean esParaCancelar) throws Exception {
		comisioncatesAux=new ArrayList<ComisionCate>();
		comisioncateAux=new ComisionCate();
		
		if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComisionCate comisioncateAux:this.comisioncateLogic.getComisionCates()) {
					if(comisioncateAux.getId()<0) {
						comisioncatesAux.add(comisioncateAux);
					}		
				}
				this.iIdNuevoComisionCate=0L;
				this.comisioncateLogic.getComisionCates().removeAll(comisioncatesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionCate comisioncateAux:this.comisioncates) {
					if(comisioncateAux.getId()<0) {
						comisioncatesAux.add(comisioncateAux);
					}		
				}
				this.iIdNuevoComisionCate=0L;
				this.comisioncates.removeAll(comisioncatesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoComisionCate 
					&& this.comisioncateLogic.getComisionCates().size()>0
					) {
					comisioncateAux=this.comisioncateLogic.getComisionCates().get(this.comisioncateLogic.getComisionCates().size() - 1);
				
					if(comisioncateAux.getId()<0) {
						this.comisioncateLogic.getComisionCates().remove(comisioncateAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoComisionCate && this.comisioncates.size()>0) {
					comisioncateAux=this.comisioncates.get(this.comisioncates.size() - 1);
				
					if(comisioncateAux.getId()<0) {
						this.comisioncates.remove(comisioncateAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoComisionCate(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(comisioncate.getId()<0) {
				this.comisioncateLogic.getComisionCates().remove(this.comisioncate);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(comisioncate.getId()<0) {
				this.comisioncates.remove(this.comisioncate);
			}
		}			
	}
	
	public void setEstadosInicialesComisionCate(List<ComisionCate> comisioncatesAux) throws Exception {
		ComisionCateConstantesFunciones.setEstadosInicialesComisionCate(comisioncatesAux);
	}
	
	public void setEstadosInicialesComisionCate(ComisionCate comisioncateAux) throws Exception {
		ComisionCateConstantesFunciones.setEstadosInicialesComisionCate(comisioncateAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarComisionCateActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesComisionCate("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarComisionCateActual()) {
				if(!this.isEsNuevoComisionCate) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesComisionCate("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoComisionCate=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarComisionCateActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Comision Cate ?", "MANTENIMIENTO DE Comision Cate", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesComisionCate("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ComisionCate comisioncate) throws Exception {
		ComisionCateConstantesFunciones.seleccionarAsignar(this.comisioncate,comisioncate);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarComisionCate=this.isPermisoActualizarOriginalComisionCate;
			
			
			this.seleccionarAsignar(comisioncate);
			
			

			idVendedorActual=comisioncate.getid_vendedor();
			this.seleccionarVendedorActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComisionCateConstantesFunciones.quitarEspaciosComisionCate(this.comisioncate,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesComisionCate("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.comisioncateSessionBean.setsFuncionBusquedaRapida(this.comisioncateSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarVendedorActual() throws Exception {
		try	{
			Vendedor vendedorAux=new Vendedor();

			if(this.idVendedorActual != null && this.idVendedorActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorLogic.getEntityWithConnection(this.idVendedorActual);
					vendedorAux= vendedorLogic.getVendedor();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				vendedorsForeignKey=new ArrayList<Vendedor>();
				vendedorsForeignKey.add(vendedorAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoComisionCate) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosComisionCate(esParaCancelar);				
				this.cancelarNuevoComisionCate(esParaCancelar);								
			}
			
			this.comisioncate=new ComisionCate();
			
			this.inicializarComisionCate();
			
			this.actualizarEstadoCeldasBotonesComisionCate("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarComisionCate() throws Exception {
		try {
			ComisionCateConstantesFunciones.inicializarComisionCate(this.comisioncate);
			
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
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.comisioncateLogic.getComisionCates().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteComisionCates(String sAccionBusqueda,List<ComisionCate> comisioncatesParaReportes) throws Exception {
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
					sPathReporteFinal="ComisionCate"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ComisionCateMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ComisionCateMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ComisionCate"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Comision Cates");		
		parameters.put("busquedapor", ComisionCateConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceComisionCate=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ComisionCateConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ComisionCateConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceComisionCate=new JRBeanArrayDataSource(ComisionCateJInternalFrame.TraerComisionCateBeans(comisioncatesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceComisionCate);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ComisionCateConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ComisionCateConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ComisionCateBean.TraerComisionCateBeans(comisioncatesParaReportes).toArray()));
							
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
				this.generarExcelReporteComisionCates(sAccionBusqueda,sTipoArchivoReporte,comisioncatesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalComisionCates(sAccionBusqueda,sTipoArchivoReporte,comisioncatesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoComisionCateActionPerformed(null);
					//this.generarExcelReporteComisionCates(sAccionBusqueda,sTipoArchivoReporte,comisioncatesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalComisionCates(sAccionBusqueda,sTipoArchivoReporte,comisioncatesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesComisionCates(sAccionBusqueda,sTipoArchivoReporte,comisioncatesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesComisionCates(sAccionBusqueda,sTipoArchivoReporte,comisioncatesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteComisionCates(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionCate> comisioncatesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisioncate";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionCates");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComisionCate("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ComisionCate comisioncate : comisioncatesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ComisionCateConstantesFunciones.generarExcelReporteDataComisionCate("NORMAL",row,workbook,comisioncate,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisioncateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Cate",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderComisionCate(String sTipo,Row row,Workbook workbook) {
		
		ComisionCateConstantesFunciones.generarExcelReporteHeaderComisionCate(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalComisionCates(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionCate> comisioncatesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisioncate_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionCates");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ComisionCate comisioncate : comisioncatesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ComisionCateConstantesFunciones.getComisionCateDescripcion(comisioncate));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionCateConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisioncate.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionCateConstantesFunciones.LABEL_IDCOMISIONCONFIG))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDCOMISIONCONFIG);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisioncate.getcomisionconfig_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionCateConstantesFunciones.LABEL_IDVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisioncate.getvendedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionCateConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisioncate.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionCateConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisioncate.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionCateConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisioncate.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionCateConstantesFunciones.LABEL_IDESTADOCOMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDESTADOCOMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisioncate.getestadocomision_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionCateConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionCateConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisioncate.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionCateConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionCateConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisioncate.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisioncateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Cate",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesComisionCates(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionCate> comisioncatesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ComisionCate> comisioncatesRespaldo=null;
		
		classes=ComisionCateConstantesFunciones.getClassesRelationshipsOfComisionCate(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.comisioncateLogic.setDatosCliente(this.datosCliente);
		this.comisioncateLogic.setDatosDeep(this.datosDeep);
		this.comisioncateLogic.setIsConDeep(true);
		
		comisioncatesRespaldo=this.comisioncateLogic.getComisionCates();
		
		this.comisioncateLogic.setComisionCates(comisioncatesParaReportes);	
		this.comisioncateLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		comisioncatesParaReportes=this.comisioncateLogic.getComisionCates();
		this.comisioncateLogic.setComisionCates(comisioncatesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisioncate_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionCates");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComisionCate("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ComisionCate comisioncate : comisioncatesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderComisionCate("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ComisionCateConstantesFunciones.generarExcelReporteDataComisionCate("NORMAL",row,workbook,comisioncate,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ComisionCateConstantesFunciones.getComisionCateDescripcion(comisioncate));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisioncateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Cate",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoComisionCate.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionCate.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoComisionCate.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionCate.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessComisionCate() throws Exception {		
		this.startProcessComisionCate(true);
	}
	
	public void startProcessComisionCate(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasComisionCate ,this.jPanelParametrosReportesComisionCate, this.jScrollPanelDatosComisionCate,this.jPanelPaginacionComisionCate, this.jScrollPanelDatosEdicionComisionCate, this.jPanelAccionesComisionCate,this.jPanelAccionesFormularioComisionCate,this.jmenuBarComisionCate,this.jmenuBarDetalleComisionCate,this.jTtoolBarComisionCate,this.jTtoolBarDetalleComisionCate);		
		
		final JTabbedPane jTabbedPaneBusquedasComisionCate=this.jTabbedPaneBusquedasComisionCate; 
		
		final JPanel jPanelParametrosReportesComisionCate=this.jPanelParametrosReportesComisionCate;
		//final JScrollPane jScrollPanelDatosComisionCate=this.jScrollPanelDatosComisionCate;
		final JTable jTableDatosComisionCate=this.jTableDatosComisionCate;		
		final JPanel jPanelPaginacionComisionCate=this.jPanelPaginacionComisionCate;
		//final JScrollPane jScrollPanelDatosEdicionComisionCate=this.jScrollPanelDatosEdicionComisionCate;
		final JPanel jPanelAccionesComisionCate=this.jPanelAccionesComisionCate;
		
		JPanel jPanelCamposAuxiliarComisionCate=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarComisionCate=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) {
			jPanelCamposAuxiliarComisionCate=this.jInternalFrameDetalleFormComisionCate.jPanelCamposComisionCate;
			jPanelAccionesFormularioAuxiliarComisionCate=this.jInternalFrameDetalleFormComisionCate.jPanelAccionesFormularioComisionCate;
		}
		
		final JPanel jPanelCamposComisionCate=jPanelCamposAuxiliarComisionCate;
		final JPanel jPanelAccionesFormularioComisionCate=jPanelAccionesFormularioAuxiliarComisionCate;
		
		
		final JMenuBar jmenuBarComisionCate=this.jmenuBarComisionCate;
		final JToolBar jTtoolBarComisionCate=this.jTtoolBarComisionCate;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarComisionCate=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComisionCate=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) {
			jmenuBarDetalleAuxiliarComisionCate=this.jInternalFrameDetalleFormComisionCate.jmenuBarDetalleComisionCate;
			jTtoolBarDetalleAuxiliarComisionCate=this.jInternalFrameDetalleFormComisionCate.jTtoolBarDetalleComisionCate;
		}
		
		final JMenuBar jmenuBarDetalleComisionCate=jmenuBarDetalleAuxiliarComisionCate;
		final JToolBar jTtoolBarDetalleComisionCate=jTtoolBarDetalleAuxiliarComisionCate;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComisionCate;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComisionCate;
			processRunnable.jTableDatos=jTableDatosComisionCate;
			processRunnable.jPanelCampos=jPanelCamposComisionCate;
			processRunnable.jPanelPaginacion=jPanelPaginacionComisionCate;
			processRunnable.jPanelAcciones=jPanelAccionesComisionCate;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComisionCate;
			
			
			processRunnable.jmenuBar=jmenuBarComisionCate;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComisionCate;
			processRunnable.jTtoolBar=jTtoolBarComisionCate;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComisionCate;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComisionCate ,jPanelParametrosReportesComisionCate,jTableDatosComisionCate, /*jScrollPanelDatosComisionCate,*/jPanelCamposComisionCate,jPanelPaginacionComisionCate, /*jScrollPanelDatosEdicionComisionCate,*/ jPanelAccionesComisionCate,jPanelAccionesFormularioComisionCate,jmenuBarComisionCate,jmenuBarDetalleComisionCate,jTtoolBarComisionCate,jTtoolBarDetalleComisionCate);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComisionCate ,jPanelParametrosReportesComisionCate, jScrollPanelDatosComisionCate,jPanelPaginacionComisionCate, jScrollPanelDatosEdicionComisionCate, jPanelAccionesComisionCate,jPanelAccionesFormularioComisionCate,jmenuBarComisionCate,jmenuBarDetalleComisionCate,jTtoolBarComisionCate,jTtoolBarDetalleComisionCate);
						
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
	
	public void finishProcessComisionCate() {// throws Exception 
		this.finishProcessComisionCate(true);
	}
	
	public void finishProcessComisionCate(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasComisionCate ,this.jPanelParametrosReportesComisionCate, this.jScrollPanelDatosComisionCate,this.jPanelPaginacionComisionCate, this.jScrollPanelDatosEdicionComisionCate, this.jPanelAccionesComisionCate,this.jPanelAccionesFormularioComisionCate,this.jmenuBarComisionCate,this.jmenuBarDetalleComisionCate,this.jTtoolBarComisionCate,this.jTtoolBarDetalleComisionCate);		
		
		final JTabbedPane jTabbedPaneBusquedasComisionCate=this.jTabbedPaneBusquedasComisionCate; 
		
		final JPanel jPanelParametrosReportesComisionCate=this.jPanelParametrosReportesComisionCate;
		//final JScrollPane jScrollPanelDatosComisionCate=this.jScrollPanelDatosComisionCate;
		final JTable jTableDatosComisionCate=this.jTableDatosComisionCate;		
		final JPanel jPanelPaginacionComisionCate=this.jPanelPaginacionComisionCate;
		//final JScrollPane jScrollPanelDatosEdicionComisionCate=this.jScrollPanelDatosEdicionComisionCate;
		final JPanel jPanelAccionesComisionCate=this.jPanelAccionesComisionCate;
		
		JPanel jPanelCamposAuxiliarComisionCate=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarComisionCate=new JPanel();
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) {
			jPanelCamposAuxiliarComisionCate=this.jInternalFrameDetalleFormComisionCate.jPanelCamposComisionCate;
			jPanelAccionesFormularioAuxiliarComisionCate=this.jInternalFrameDetalleFormComisionCate.jPanelAccionesFormularioComisionCate;
		}
		
		final JPanel jPanelCamposComisionCate=jPanelCamposAuxiliarComisionCate;
		final JPanel jPanelAccionesFormularioComisionCate=jPanelAccionesFormularioAuxiliarComisionCate;
		
		
		final JMenuBar jmenuBarComisionCate=this.jmenuBarComisionCate;		
		final JToolBar jTtoolBarComisionCate=this.jTtoolBarComisionCate;
				
		JMenuBar jmenuBarDetalleAuxiliarComisionCate=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComisionCate=new JToolBar();
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) {
			jmenuBarDetalleAuxiliarComisionCate=this.jInternalFrameDetalleFormComisionCate.jmenuBarDetalleComisionCate;
			jTtoolBarDetalleAuxiliarComisionCate=this.jInternalFrameDetalleFormComisionCate.jTtoolBarDetalleComisionCate;		
		}
		
		final JMenuBar jmenuBarDetalleComisionCate=jmenuBarDetalleAuxiliarComisionCate;
		final JToolBar jTtoolBarDetalleComisionCate=jTtoolBarDetalleAuxiliarComisionCate;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComisionCate;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComisionCate;
			processRunnable.jTableDatos=jTableDatosComisionCate;
			processRunnable.jPanelCampos=jPanelCamposComisionCate;
			processRunnable.jPanelPaginacion=jPanelPaginacionComisionCate;
			processRunnable.jPanelAcciones=jPanelAccionesComisionCate;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComisionCate;
			
			
			processRunnable.jmenuBar=jmenuBarComisionCate;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComisionCate;
			processRunnable.jTtoolBar=jTtoolBarComisionCate;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComisionCate;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasComisionCate ,jPanelParametrosReportesComisionCate, jTableDatosComisionCate,/*jScrollPanelDatosComisionCate,*/jPanelCamposComisionCate,jPanelPaginacionComisionCate, /*jScrollPanelDatosEdicionComisionCate,*/ jPanelAccionesComisionCate,jPanelAccionesFormularioComisionCate,jmenuBarComisionCate,jmenuBarDetalleComisionCate,jTtoolBarComisionCate,jTtoolBarDetalleComisionCate));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesComisionCate(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarComisionCate(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuComisionCate(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarComisionCate(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarComisionCate,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleComisionCate,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuComisionCate(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarComisionCate,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleComisionCate,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.comisioncateConstantesFunciones.getsFinalQueryComisionCate();
		String  finalQueryPaginacionTodos=this.comisioncateConstantesFunciones.getsFinalQueryComisionCate();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ComisionCateConstantesFunciones.getArrayColumnasGlobalesNoComisionCate(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ComisionCateConstantesFunciones.getArrayColumnasGlobalesComisionCate(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ComisionCateConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.comisioncatesEliminados= new ArrayList<ComisionCate>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessComisionCate();
		
				///*ComisionCateSessionBean*/this.comisioncateSessionBean=new ComisionCateSessionBean();
			
			if(this.comisioncateSessionBean==null) {
				this.comisioncateSessionBean=new ComisionCateSessionBean();
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
					this.iNumeroPaginacion=ComisionCateConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ComisionCateConstantesFunciones.getClassesForeignKeysOfComisionCate(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/comisioncate."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			comisioncatesAux= new ArrayList<ComisionCate>();
			
				
			comisioncateLogic.setDatosCliente(this.datosCliente);
			comisioncateLogic.setDatosDeep(this.datosDeep);
			comisioncateLogic.setIsConDeep(true);
			
			
			comisioncateLogic.getComisionCateDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					comisioncateLogic.getTodosComisionCates(finalQueryGlobal,pagination);
					
					//comisioncateLogic.getTodosComisionCatesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(comisioncateLogic.getComisionCates()==null|| comisioncateLogic.getComisionCates().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisioncatesAux= new ArrayList<ComisionCate>();
							comisioncatesAux.addAll(comisioncateLogic.getComisionCates());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisioncatesAux= new ArrayList<ComisionCate>();
							comisioncatesAux.addAll(comisioncates);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisioncateLogic.getTodosComisionCates(finalQueryGlobal+"",this.pagination);												
							
							//comisioncateLogic.getTodosComisionCatesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteComisionCates("Todos",comisioncateLogic.getComisionCates() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisioncateLogic.setComisionCates(new ArrayList<ComisionCate>());					
							comisioncateLogic.getComisionCates().addAll(comisioncatesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisioncates=new ArrayList<ComisionCate>();
							comisioncates.addAll(comisioncatesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idComisionCate=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idComisionCate=this.idActual;
				
				} else if(this.idComisionCateActual!=null && this.idComisionCateActual!=0L) {
					idComisionCate=idComisionCateActual;
				}
				
					
				this.sDetalleReporte=ComisionCateConstantesFunciones.getDetalleIndicePorId(idComisionCate);
				
				this.comisioncates=new ArrayList<ComisionCate>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					comisioncateLogic.getEntity(idComisionCate);
					
					//comisioncateLogic.getEntityWithConnection(idComisionCate);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisioncateLogic.setComisionCates(new ArrayList<ComisionCate>());
					comisioncateLogic.getComisionCates().add(comisioncateLogic.getComisionCate());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisioncates=new ArrayList<ComisionCate>();
					this.comisioncates.add(comisioncate);
				}
				
				if(comisioncateLogic.getComisionCate()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdComisionConfig")) {
				this.sDetalleReporte=ComisionCateConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comisioncateLogic.getComisionCatesFK_IdComisionConfig(finalQueryGlobal,pagination,id_comision_configFK_IdComisionConfig);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionCateConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionCateConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comisioncateLogic.getComisionCates()==null||comisioncateLogic.getComisionCates().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comisioncates==null|| comisioncates.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comisioncatesAux=new ArrayList<ComisionCate>();
						comisioncatesAux.addAll(comisioncateLogic.getComisionCates());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisioncatesAux=new ArrayList<ComisionCate>();
							comisioncatesAux.addAll(comisioncates);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comisioncateLogic.getComisionCatesFK_IdComisionConfig(finalQueryGlobal,pagination,id_comision_configFK_IdComisionConfig);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionCateConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionCateConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComisionCates("FK_IdComisionConfig",comisioncateLogic.getComisionCates());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComisionCates("FK_IdComisionConfig",comisioncates);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comisioncateLogic.setComisionCates(new ArrayList<ComisionCate>());
						comisioncateLogic.getComisionCates().addAll(comisioncatesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisioncates=new ArrayList<ComisionCate>();
							comisioncates.addAll(comisioncatesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ComisionCateConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comisioncateLogic.getComisionCatesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionCateConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionCateConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comisioncateLogic.getComisionCates()==null||comisioncateLogic.getComisionCates().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comisioncates==null|| comisioncates.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comisioncatesAux=new ArrayList<ComisionCate>();
						comisioncatesAux.addAll(comisioncateLogic.getComisionCates());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisioncatesAux=new ArrayList<ComisionCate>();
							comisioncatesAux.addAll(comisioncates);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comisioncateLogic.getComisionCatesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionCateConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionCateConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComisionCates("FK_IdEmpresa",comisioncateLogic.getComisionCates());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComisionCates("FK_IdEmpresa",comisioncates);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comisioncateLogic.setComisionCates(new ArrayList<ComisionCate>());
						comisioncateLogic.getComisionCates().addAll(comisioncatesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisioncates=new ArrayList<ComisionCate>();
							comisioncates.addAll(comisioncatesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesComisionCate();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessComisionCate();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comisioncateLogic.getComisionCates().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisioncates.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comisioncateLogic.getComisionCates().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisioncates.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ComisionCate comisioncate) {
		Boolean permite=true;
		
		if(this.comisioncate.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ComisionCateConstantesFunciones.getOrderByListaComisionCate();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ComisionCateConstantesFunciones.getOrderByListaComisionCate();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionCate comisioncate:comisioncateLogic.getComisionCates()) {
				if(comisioncate.getsType().equals(Constantes2.S_TOTALES)) {
					comisioncateTotales=comisioncate;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionCate comisioncate:this.comisioncates) {
				if(comisioncate.getsType().equals(Constantes2.S_TOTALES)) {
					comisioncateTotales=comisioncate;
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
			this.comisioncateAux=new ComisionCate();
			this.comisioncateAux.setsType(Constantes2.S_TOTALES);
			this.comisioncateAux.setIsNew(false);
			this.comisioncateAux.setIsChanged(false);
			this.comisioncateAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ComisionCateConstantesFunciones.TotalizarValoresFilaComisionCate(this.comisioncateLogic.getComisionCates(),this.comisioncateAux);
				
				this.comisioncateLogic.getComisionCates().add(this.comisioncateAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ComisionCateConstantesFunciones.TotalizarValoresFilaComisionCate(this.comisioncates,this.comisioncateAux);
				
				this.comisioncates.add(this.comisioncateAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		comisioncateTotales=new ComisionCate();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comisioncateLogic.getComisionCates().remove(comisioncateTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comisioncates.remove(comisioncateTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		comisioncateTotales=new ComisionCate();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionCate comisioncate:comisioncateLogic.getComisionCates()) {
				if(comisioncate.getsType().equals(Constantes2.S_TOTALES)) {
					comisioncateTotales=comisioncate;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComisionCateConstantesFunciones.TotalizarValoresFilaComisionCate(this.comisioncateLogic.getComisionCates(),comisioncateTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionCate comisioncate:this.comisioncates) {
				if(comisioncate.getsType().equals(Constantes2.S_TOTALES)) {
					comisioncateTotales=comisioncate;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComisionCateConstantesFunciones.TotalizarValoresFilaComisionCate(this.comisioncates,comisioncateTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getComisionCatesFK_IdComisionConfig()throws Exception {
		try {
			sAccionBusqueda="FK_IdComisionConfig";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionCatesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionCatesFK_IdEstadoComision()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoComision";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionCatesFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionCatesFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionCatesFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionCatesFK_IdVendedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdVendedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getComisionCatesFK_IdComisionConfig(String sFinalQuery,Long id_comision_config)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisioncateLogic.getComisionCatesFK_IdComisionConfig(sFinalQuery,this.pagination,id_comision_config);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionCatesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisioncateLogic.getComisionCatesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionCatesFK_IdEstadoComision(String sFinalQuery,Long id_estado_comision)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisioncateLogic.getComisionCatesFK_IdEstadoComision(sFinalQuery,this.pagination,id_estado_comision);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionCatesFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisioncateLogic.getComisionCatesFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionCatesFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisioncateLogic.getComisionCatesFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionCatesFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisioncateLogic.getComisionCatesFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionCatesFK_IdVendedor(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisioncateLogic.getComisionCatesFK_IdVendedor(sFinalQuery,this.pagination,id_vendedor);
				
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
	
	public void inicializarPermisosComisionCate() {
		this.isPermisoTodoComisionCate=false;
		this.isPermisoNuevoComisionCate=false;
		this.isPermisoActualizarComisionCate=false;
		this.isPermisoActualizarOriginalComisionCate=false;
		this.isPermisoEliminarComisionCate=false;
		this.isPermisoGuardarCambiosComisionCate=false;
		this.isPermisoConsultaComisionCate=false;
		this.isPermisoBusquedaComisionCate=false;
		this.isPermisoReporteComisionCate=false;		
		this.isPermisoOrdenComisionCate=false;		
		this.isPermisoPaginacionMedioComisionCate=false;		
		this.isPermisoPaginacionAltoComisionCate=false;
		this.isPermisoPaginacionTodoComisionCate=false;
		this.isPermisoCopiarComisionCate=false;		
		this.isPermisoVerFormComisionCate=false;		
		this.isPermisoDuplicarComisionCate=false;		
		this.isPermisoOrdenComisionCate=false;		
	}
	
	public void setPermisosUsuarioComisionCate(Boolean isPermiso) {
		this.isPermisoTodoComisionCate=isPermiso;
		this.isPermisoNuevoComisionCate=isPermiso;
		this.isPermisoActualizarComisionCate=isPermiso;
		this.isPermisoActualizarOriginalComisionCate=isPermiso;
		this.isPermisoEliminarComisionCate=isPermiso;
		this.isPermisoGuardarCambiosComisionCate=isPermiso;
		this.isPermisoConsultaComisionCate=isPermiso;
		this.isPermisoBusquedaComisionCate=isPermiso;
		this.isPermisoReporteComisionCate=isPermiso;
		this.isPermisoOrdenComisionCate=isPermiso;		
		this.isPermisoPaginacionMedioComisionCate=isPermiso;		
		this.isPermisoPaginacionAltoComisionCate=isPermiso;		
		this.isPermisoPaginacionTodoComisionCate=isPermiso;		
		this.isPermisoCopiarComisionCate=isPermiso;		
		this.isPermisoVerFormComisionCate=isPermiso;		
		this.isPermisoDuplicarComisionCate=isPermiso;
		this.isPermisoOrdenComisionCate=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioComisionCate(Boolean isPermiso) {
		//this.isPermisoTodoComisionCate=isPermiso;
		this.isPermisoNuevoComisionCate=isPermiso;
		this.isPermisoActualizarComisionCate=isPermiso;
		this.isPermisoActualizarOriginalComisionCate=isPermiso;
		this.isPermisoEliminarComisionCate=isPermiso;
		this.isPermisoGuardarCambiosComisionCate=isPermiso;
		//this.isPermisoConsultaComisionCate=isPermiso;
		//this.isPermisoBusquedaComisionCate=isPermiso;
		//this.isPermisoReporteComisionCate=isPermiso;
		//this.isPermisoOrdenComisionCate=isPermiso;		
		//this.isPermisoPaginacionMedioComisionCate=isPermiso;		
		//this.isPermisoPaginacionAltoComisionCate=isPermiso;		
		//this.isPermisoPaginacionTodoComisionCate=isPermiso;		
		//this.isPermisoCopiarComisionCate=isPermiso;		
		//this.isPermisoDuplicarComisionCate=isPermiso;
		//this.isPermisoOrdenComisionCate=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioComisionCateClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ComisionCateJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebComisionCate(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioComisionCateClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioComisionCateClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionComisionCateClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioComisionCateClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioComisionCate() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ComisionCateJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.comisioncateSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ComisionCateConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoComisionCate=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarComisionCate=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalComisionCate=this.isPermisoActualizarComisionCate;
			this.isPermisoEliminarComisionCate=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosComisionCate=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaComisionCate=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaComisionCate=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoComisionCate=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteComisionCate=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComisionCate=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioComisionCate=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoComisionCate=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoComisionCate=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarComisionCate=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormComisionCate=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarComisionCate=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComisionCate=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.comisioncateSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosComisionCate.setToolTipText(this.jTableDatosComisionCate.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioComisionCate(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioComisionCate(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ComisionCateJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ComisionCateJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioComisionCate() throws Exception {
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
	public void inicializarCombosForeignKeyComisionCateListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.comisionconfigsForeignKey=new ArrayList();
				this.vendedorsForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.estadocomisionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyComisionCateListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ComisionCateJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyComisionCateListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyComisionConfigListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoComisionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyComisionConfigListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.comisionconfigsForeignKey==null||this.comisionconfigsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ComisionConfigConstantesFunciones.getArrayColumnasGlobalesComisionConfig(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ComisionConfigConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ComisionConfigConstantesFunciones.SFINALQUERY;

				this.cargarCombosComisionConfigsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyVendedorListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=VendedorConstantesFunciones.SFINALQUERY;

				this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
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
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "id_nivel_linea=1");

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

			if(cargarCombosDependencia && (this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0)) {
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

			if(cargarCombosDependencia && (this.lineacategoriasForeignKey==null||this.lineacategoriasForeignKey.size()<=0)) {
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

	public void cargarCombosForeignKeyEstadoComisionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadocomisionsForeignKey==null||this.estadocomisionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoComisionConstantesFunciones.getArrayColumnasGlobalesEstadoComision(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoComisionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoComisionConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoComisionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyComisionCateListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ComisionCateParameterReturnGeneral comisioncateReturnGeneral=new ComisionCateParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.comisioncateConstantesFunciones.cargarid_empresaComisionCate)
					 || (this.esRecargarFks && this.comisioncateConstantesFunciones.cargarid_empresaComisionCate)) {

					if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+comisioncateSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalComisionConfig="";

				if(((this.comisionconfigsForeignKey==null||this.comisionconfigsForeignKey.size()<=0) && this.comisioncateConstantesFunciones.cargarid_comision_configComisionCate)
					 || (this.esRecargarFks && this.comisioncateConstantesFunciones.cargarid_comision_configComisionCate)) {

					if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionComisionConfig()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ComisionConfigConstantesFunciones.getArrayColumnasGlobalesComisionConfig(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalComisionConfig=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ComisionConfigConstantesFunciones.TABLENAME);

						finalQueryGlobalComisionConfig=Funciones.GetFinalQueryAppend(finalQueryGlobalComisionConfig, "");
						finalQueryGlobalComisionConfig+=ComisionConfigConstantesFunciones.SFINALQUERY;

						//this.cargarCombosComisionConfigsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalComisionConfig=" WHERE " + ConstantesSql.ID + "="+comisioncateSessionBean.getlidComisionConfigActual();
					}
				} else {
					finalQueryGlobalComisionConfig="NONE";
				}


				String finalQueryGlobalVendedor="";

				if(((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0) && this.comisioncateConstantesFunciones.cargarid_vendedorComisionCate)
					 || (this.esRecargarFks && this.comisioncateConstantesFunciones.cargarid_vendedorComisionCate)) {

					if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalVendedor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

						finalQueryGlobalVendedor=Funciones.GetFinalQueryAppend(finalQueryGlobalVendedor, "");
						finalQueryGlobalVendedor+=VendedorConstantesFunciones.SFINALQUERY;

						//this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalVendedor=" WHERE " + ConstantesSql.ID + "="+comisioncateSessionBean.getlidVendedorActual();
					}
				} else {
					finalQueryGlobalVendedor="NONE";
				}


				String finalQueryGlobalLinea="";

				if(((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0) && this.comisioncateConstantesFunciones.cargarid_lineaComisionCate)
					 || (this.esRecargarFks && this.comisioncateConstantesFunciones.cargarid_lineaComisionCate)) {

					if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLinea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLinea=Funciones.GetFinalQueryAppend(finalQueryGlobalLinea, "id_nivel_linea=1");
						finalQueryGlobalLinea+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLinea=" WHERE " + ConstantesSql.ID + "="+comisioncateSessionBean.getlidLineaActual();
					}
				} else {
					finalQueryGlobalLinea="NONE";
				}


				String finalQueryGlobalLineaGrupo="";

				if(cargarCombosDependencia && ((this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0) && this.comisioncateConstantesFunciones.cargarid_linea_grupoComisionCate)
					 || (this.esRecargarFks && this.comisioncateConstantesFunciones.cargarid_linea_grupoComisionCate)) {

					if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLineaGrupo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLineaGrupo=Funciones.GetFinalQueryAppend(finalQueryGlobalLineaGrupo, "");
						finalQueryGlobalLineaGrupo+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLineaGrupo=" WHERE " + ConstantesSql.ID + "="+comisioncateSessionBean.getlidLineaGrupoActual();
					}
				} else {
					finalQueryGlobalLineaGrupo="NONE";
				}


				String finalQueryGlobalLineaCategoria="";

				if(cargarCombosDependencia && ((this.lineacategoriasForeignKey==null||this.lineacategoriasForeignKey.size()<=0) && this.comisioncateConstantesFunciones.cargarid_linea_categoriaComisionCate)
					 || (this.esRecargarFks && this.comisioncateConstantesFunciones.cargarid_linea_categoriaComisionCate)) {

					if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLineaCategoria=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLineaCategoria=Funciones.GetFinalQueryAppend(finalQueryGlobalLineaCategoria, "");
						finalQueryGlobalLineaCategoria+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineaCategoriasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLineaCategoria=" WHERE " + ConstantesSql.ID + "="+comisioncateSessionBean.getlidLineaCategoriaActual();
					}
				} else {
					finalQueryGlobalLineaCategoria="NONE";
				}


				String finalQueryGlobalEstadoComision="";

				if(((this.estadocomisionsForeignKey==null||this.estadocomisionsForeignKey.size()<=0) && this.comisioncateConstantesFunciones.cargarid_estado_comisionComisionCate)
					 || (this.esRecargarFks && this.comisioncateConstantesFunciones.cargarid_estado_comisionComisionCate)) {

					if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionEstadoComision()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoComisionConstantesFunciones.getArrayColumnasGlobalesEstadoComision(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoComision=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoComisionConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoComision=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoComision, "");
						finalQueryGlobalEstadoComision+=EstadoComisionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoComisionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoComision=" WHERE " + ConstantesSql.ID + "="+comisioncateSessionBean.getlidEstadoComisionActual();
					}
				} else {
					finalQueryGlobalEstadoComision="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				comisioncateReturnGeneral=comisioncateLogic.cargarCombosLoteForeignKeyComisionCate(finalQueryGlobalEmpresa,finalQueryGlobalComisionConfig,finalQueryGlobalVendedor,finalQueryGlobalLinea,finalQueryGlobalLineaGrupo,finalQueryGlobalLineaCategoria,finalQueryGlobalEstadoComision);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=comisioncateReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalComisionConfig.equals("NONE")) {
				this.comisionconfigsForeignKey=comisioncateReturnGeneral.getcomisionconfigsForeignKey();
			}

			if(!finalQueryGlobalVendedor.equals("NONE")) {
				this.vendedorsForeignKey=comisioncateReturnGeneral.getvendedorsForeignKey();
			}

			if(!finalQueryGlobalLinea.equals("NONE")) {
				this.lineasForeignKey=comisioncateReturnGeneral.getlineasForeignKey();
			}

			if(!finalQueryGlobalLineaGrupo.equals("NONE")) {
				this.lineagruposForeignKey=comisioncateReturnGeneral.getlineagruposForeignKey();
			}

			if(!finalQueryGlobalLineaCategoria.equals("NONE")) {
				this.lineacategoriasForeignKey=comisioncateReturnGeneral.getlineacategoriasForeignKey();
			}

			if(!finalQueryGlobalEstadoComision.equals("NONE")) {
				this.estadocomisionsForeignKey=comisioncateReturnGeneral.getestadocomisionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyComisionCate()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyComisionConfig();
			this.addItemDefectoCombosForeignKeyVendedor();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyEstadoComision();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.comisioncateSessionBean==null) {
				this.comisioncateSessionBean=new ComisionCateSessionBean();
			}

			if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyComisionConfig()throws Exception {
		try {

			if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionComisionConfig()) {
				ComisionConfig comisionconfig=new ComisionConfig();
				ComisionConfigConstantesFunciones.setComisionConfigDescripcion(comisionconfig,Constantes.SMENSAJE_ESCOJA_OPCION);
				comisionconfig.setId(null);

				if(!ComisionConfigConstantesFunciones.ExisteEnLista(this.comisionconfigsForeignKey,comisionconfig,true)) {

					this.comisionconfigsForeignKey.add(0,comisionconfig);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyVendedor()throws Exception {
		try {

			if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				Vendedor vendedor=new Vendedor();
				VendedorConstantesFunciones.setVendedorDescripcion(vendedor,Constantes.SMENSAJE_ESCOJA_OPCION);
				vendedor.setId(null);

				if(!VendedorConstantesFunciones.ExisteEnLista(this.vendedorsForeignKey,vendedor,true)) {

					this.vendedorsForeignKey.add(0,vendedor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

	public void addItemDefectoCombosForeignKeyEstadoComision()throws Exception {
		try {

			if(!this.comisioncateSessionBean.getisBusquedaDesdeForeignKeySesionEstadoComision()) {
				EstadoComision estadocomision=new EstadoComision();
				EstadoComisionConstantesFunciones.setEstadoComisionDescripcion(estadocomision,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadocomision.setId(null);

				if(!EstadoComisionConstantesFunciones.ExisteEnLista(this.estadocomisionsForeignKey,estadocomision,true)) {

					this.estadocomisionsForeignKey.add(0,estadocomision);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyComisionCate()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyLinea("Todos");
			this.initActionsCombosForeignKeyLineaGrupo("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyComisionCate(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyLinea(sFormularioTipoBusqueda);
			this.initActionsCombosForeignKeyLineaGrupo(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyLinea(JComboBox jComboBoxLineaGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Linea lineaLocal=(Linea)jComboBoxLineaGenerico.getSelectedItem();

			if(lineaLocal!=null  && lineaLocal.getId()!=null  && lineaLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_linea="+lineaLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboLineaGrupo=sFinalQueryCombo;

			this.lineagruposForeignKey=new ArrayList<Linea>();
			this.cargarCombosForeignKeyLineaGrupo(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyLineaGrupo(JComboBox jComboBoxLineaGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Linea lineaLocal=(Linea)jComboBoxLineaGenerico.getSelectedItem();

			if(lineaLocal!=null  && lineaLocal.getId()!=null  && lineaLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_linea_grupo="+lineaLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboLineaCategoria=sFinalQueryCombo;

			this.lineacategoriasForeignKey=new ArrayList<Linea>();
			this.cargarCombosForeignKeyLineaCategoria(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyLinea(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.addItemListener(new ComboBoxItemListener(this,"id_lineaComisionCate"));
						this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.addFocusListener(new ComboBoxFocusListener(this,"id_lineaComisionCate"));
					}
				} else {
					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.addActionListener(new ComboBoxActionListener(this,"id_lineaComisionCate"));
						this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.addFocusListener(new ComboBoxFocusListener(this,"id_lineaComisionCate"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void initActionsCombosForeignKeyLineaGrupo(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.addItemListener(new ComboBoxItemListener(this,"id_linea_grupoComisionCate"));
						this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.addFocusListener(new ComboBoxFocusListener(this,"id_linea_grupoComisionCate"));
					}
				} else {
					if(this.jInternalFrameDetalleFormComisionCate!=null) {
						this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.addActionListener(new ComboBoxActionListener(this,"id_linea_grupoComisionCate"));
						this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.addFocusListener(new ComboBoxFocusListener(this,"id_linea_grupoComisionCate"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyComisionCate()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyComisionCate();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyComisionCate(ComisionCate comisioncate)throws Exception {	
		try {
			
			this.setActualComisionConfigForeignKey(comisioncate.getid_comision_config(),false,"Formulario");
			this.setActualVendedorForeignKey(comisioncate.getid_vendedor(),false,"Formulario");
			this.setActualLineaForeignKey(comisioncate.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(comisioncate.getid_linea_grupo(),false,"Formulario");
			this.setActualLineaCategoriaForeignKey(comisioncate.getid_linea_categoria(),false,"Formulario");
			this.setActualEstadoComisionForeignKey(comisioncate.getid_estado_comision(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyComisionCate(ComisionCate comisioncate,String sTipoEvento)throws Exception {	
		try {
			
			

				if(comisioncate.getVendedor()!=null && !sTipoEvento.equals("id_vendedorComisionCate")) { //sTipoEvento Evita Bucle Infinito

					this.vendedorsForeignKey=new ArrayList<Vendedor>();
					this.vendedorsForeignKey.add(comisioncate.getVendedor());

					this.addItemDefectoCombosForeignKeyVendedor();
					this.cargarCombosFrameVendedorsForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyComisionCate()throws Exception {	
		try {
			
			this.setActualComisionConfigForeignKey(this.comisioncateConstantesFunciones.getid_comision_config(),false,"Formulario");
			this.setActualVendedorForeignKey(this.comisioncateConstantesFunciones.getid_vendedor(),false,"Formulario");
			this.setActualLineaForeignKey(this.comisioncateConstantesFunciones.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(this.comisioncateConstantesFunciones.getid_linea_grupo(),false,"Formulario");
			this.setActualLineaCategoriaForeignKey(this.comisioncateConstantesFunciones.getid_linea_categoria(),false,"Formulario");
			this.setActualEstadoComisionForeignKey(this.comisioncateConstantesFunciones.getid_estado_comision(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyComisionCate()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyComisionCate()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyComisionCate()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroComisionCate()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyComisionCate()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameComisionConfigsForeignKey("Todos");
			this.cargarCombosFrameVendedorsForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameEstadoComisionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyComisionCate(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameComisionConfigsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoComisionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyComisionCate()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormComisionCate.jComboBoxid_empresaComisionCate!=null && this.jInternalFrameDetalleFormComisionCate.jComboBoxid_empresaComisionCate.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionCate.jComboBoxid_empresaComisionCate.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionCate.jComboBoxid_comision_configComisionCate!=null && this.jInternalFrameDetalleFormComisionCate.jComboBoxid_comision_configComisionCate.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionCate.jComboBoxid_comision_configComisionCate.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionCate.jComboBoxid_vendedorComisionCate!=null && this.jInternalFrameDetalleFormComisionCate.jComboBoxid_vendedorComisionCate.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionCate.jComboBoxid_vendedorComisionCate.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate!=null && this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate!=null && this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_categoriaComisionCate!=null && this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_categoriaComisionCate.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_categoriaComisionCate.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionCate.jComboBoxid_estado_comisionComisionCate!=null && this.jInternalFrameDetalleFormComisionCate.jComboBoxid_estado_comisionComisionCate.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionCate.jComboBoxid_estado_comisionComisionCate.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	







	public void recargarFormComisionCateLinea(JComboBox<?> jComboBoxGenericoLinea,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormComisionCateid_linea_grupo(jComboBoxGenericoLinea,sFormularioTipoBusqueda,"Linea",false);
	}

	public void recargarFormComisionCateLineaGrupo(JComboBox<?> jComboBoxGenericoLinea,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormComisionCateid_linea_categoria(jComboBoxGenericoLinea,sFormularioTipoBusqueda,"LineaGrupo",false);
	}




	
	



	public void recargarFormComisionCateid_linea_grupo(JComboBox<?> jComboBoxGenericoLinea,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Linea")){
				this.setActualParaGuardarLineaForeignKey(this.comisioncate,jComboBoxGenericoLinea);
			}

			if(this.comisioncate.getid_linea()!=null && this.comisioncate.getid_linea()!=0L) {
				sFinalQuery+="  WHERE  id_linea="+this.comisioncate.getid_linea();
			} else {
				sFinalQuery+="  WHERE  id_linea=-1";
			}



			//BUCLE RECURSIVO
			this.setActualLineaGrupoForeignKey(this.comisioncate.getid_linea(),true,sFormularioTipoBusqueda);

			this.cargarCombosLineaGruposForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormComisionCateid_linea_categoria(JComboBox<?> jComboBoxGenericoLinea,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("LineaGrupo")){
				this.setActualParaGuardarLineaGrupoForeignKey(this.comisioncate,jComboBoxGenericoLinea);
			}

			if(this.comisioncate.getid_linea_grupo()!=null && this.comisioncate.getid_linea_grupo()!=0L) {
				sFinalQuery+="  WHERE  id_linea="+this.comisioncate.getid_linea_grupo();
			} else {
				sFinalQuery+="  WHERE  id_linea=-1";
			}



			//BUCLE RECURSIVO
			this.setActualLineaCategoriaForeignKey(this.comisioncate.getid_linea_grupo(),true,sFormularioTipoBusqueda);

			this.cargarCombosLineaCategoriasForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public ComisionCateBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ComisionCateBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ComisionCateBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.comisioncateSessionBean=new ComisionCateSessionBean(); 
		this.comisioncateConstantesFunciones=new ComisionCateConstantesFunciones(); 
		this.comisioncateBean=new ComisionCate();//(this.comisioncateConstantesFunciones); 		
		this.comisioncateReturnGeneral=new ComisionCateParameterReturnGeneral(); 
		
		this.comisioncateSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisioncateSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ComisionCateBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ComisionCateBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ComisionCateBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessComisionCate(true);
			
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
			
			this.comisioncateConstantesFunciones=new ComisionCateConstantesFunciones(); 
			this.comisioncateBean=new ComisionCate();//this.comisioncateConstantesFunciones); 			
			this.comisioncateReturnGeneral=new ComisionCateParameterReturnGeneral(); 
		
			ComisionCateBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comision Cate Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.comisioncate=new ComisionCate();
			this.comisioncates = new ArrayList<ComisionCate>();
			this.comisioncatesAux = new ArrayList<ComisionCate>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic=new ComisionCateLogic();
				this.comisioncateLogic.getNewConnexionToDeep("");
			}
			
			//this.comisioncateSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.comisioncateSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormComisionCate);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoComisionCate!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComisionCate);	
					}
					
					if(this.jInternalFrameImportacionComisionCate!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComisionCate);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByComisionCate!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByComisionCate);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormComisionCate!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormComisionCate);
				this.jInternalFrameDetalleFormComisionCate.setVisible(false);
				this.jInternalFrameDetalleFormComisionCate.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionCate!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComisionCate);
					this.jInternalFrameReporteDinamicoComisionCate.setVisible(false);
					this.jInternalFrameReporteDinamicoComisionCate.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionComisionCate!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionComisionCate);
					this.jInternalFrameImportacionComisionCate.setVisible(false);
					this.jInternalFrameImportacionComisionCate.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByComisionCate!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByComisionCate);
					this.jInternalFrameOrderByComisionCate.setVisible(false);
					this.jInternalFrameOrderByComisionCate.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idComisionCateActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ComisionCateConstantesFunciones.INUMEROPAGINACION;
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
			
			this.comisioncateReturnGeneral=new ComisionCateParameterReturnGeneral();
			
			this.comisioncateParameterGeneral=new ComisionCateParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.comisioncateLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ComisionCateJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.comisioncateSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComisionCateConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comisioncateSessionBean.getEsGuardarRelacionado(),this.comisioncateSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComisionCateConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comisioncateSessionBean.getEsGuardarRelacionado(),this.comisioncateSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoComisionCate=false;
			this.isVisibilidadCeldaDuplicarComisionCate=true;
			this.isVisibilidadCeldaCopiarComisionCate=true;
			this.isVisibilidadCeldaVerFormComisionCate=true;
			this.isVisibilidadCeldaOrdenComisionCate=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionCate=false;
			this.isVisibilidadCeldaModificarComisionCate=false;
			this.isVisibilidadCeldaActualizarComisionCate=false;
			this.isVisibilidadCeldaEliminarComisionCate=false;
			this.isVisibilidadCeldaCancelarComisionCate=false;
			this.isVisibilidadCeldaGuardarComisionCate=false;
			this.isVisibilidadCeldaGuardarCambiosComisionCate=false;
			
			
			this.isVisibilidadFK_IdComisionConfig=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoComision=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdVendedor=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesComisionCate("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosComisionCate();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioComisionCate(false);
			
			this.setPermisosUsuarioComisionCate();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisioncateSessionBean.getEsGuardarRelacionado() 
				|| (this.comisioncateSessionBean.getEsGuardarRelacionado() && this.comisioncateSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioComisionCateClasesRelacionadas();
			}
			
			if(this.comisioncateSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioComisionCateClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosComisionCate();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualComisionCate();
			}
			
			if(!this.isPermisoBusquedaComisionCate) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasComisionCate.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioComisionCate,this.isPermisoPaginacionMedioComisionCate,this.isPermisoPaginacionTodoComisionCate);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ComisionCateConstantesFunciones.getTiposSeleccionarComisionCate());
				
				this.tiposColumnasSelect=ComisionCateConstantesFunciones.getTiposSeleccionarComisionCate(true);
				
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
			//if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioComisionCate();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioComisionCate(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioComisionCate(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionCate() ;
			
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
			this.comisionconfigLogic=new ComisionConfigLogic();
			this.vendedorLogic=new VendedorLogic();
			this.lineaLogic=new LineaLogic();
			this.lineagrupoLogic=new LineaLogic();
			this.lineacategoriaLogic=new LineaLogic();
			this.estadocomisionLogic=new EstadoComisionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				comisioncateImplementable= (ComisionCateImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComisionCateConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				comisioncateImplementableHome= (ComisionCateImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComisionCateConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.comisioncates= new ArrayList<ComisionCate>();
			this.comisioncatesEliminados= new ArrayList<ComisionCate>();
						
			this.isEsNuevoComisionCate=false;
			this.esParaAccionDesdeFormularioComisionCate=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idVendedorActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.comisionconfigsForeignKey=new ArrayList<ComisionConfig>() ;
			this.vendedorsForeignKey=new ArrayList<Vendedor>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.estadocomisionsForeignKey=new ArrayList<EstadoComision>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyComisionCate(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroComisionCate();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ComisionCateBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ComisionCateConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesComisionCate("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingComisionCate(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormComisionCate!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioComisionCate();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioComisionCate();
			}
			
			ComisionCateBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasComisionCate.getTabCount(); i++) {
					this.jTabbedPaneBusquedasComisionCate.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasComisionCate.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessComisionCate(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ComisionCate: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectComisionCate() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesComisionCate")) {
				iIndex=this.jInternalFrameDetalleFormComisionCate.jTabbedPaneRelacionesComisionCate.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormComisionCate.jTabbedPaneRelacionesComisionCate.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessComisionCate();	
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
	
	public void cargarCombosForeignKeyComisionCate(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyComisionCate(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyComisionCate(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyComisionCateListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyComisionCate();
		
		this.cargarCombosFrameForeignKeyComisionCate();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyComisionCate();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyComisionCate();
		}
	}
	
	

	public void cargarCombosForeignKeyComisionConfig(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyComisionConfigListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyComisionConfig();
				this.cargarCombosFrameComisionConfigsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaComisionConfig(this.comisionconfigsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyVendedor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaVendedor(this.vendedorsForeignKey);

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
					this.initActionsCombosForeignKeyLinea("Todos");
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
					this.initActionsCombosForeignKeyLineaGrupo("Todos");
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
					this.initActionsCombosForeignKeyLineaGrupo("Todos");
				}

			this.recargarComboTablaLineaCategoria(this.lineacategoriasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoComision(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoComisionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoComision();
				this.cargarCombosFrameEstadoComisionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyLineaGrupo("Todos");
				}

			this.recargarComboTablaEstadoComision(this.estadocomisionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoComisionCateActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.comisioncateSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormComisionCate==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
			
			
			if(jTableDatosComisionCate.getRowCount()>=1) {
				jTableDatosComisionCate.removeRowSelectionInterval(0, jTableDatosComisionCate.getRowCount()-1);						
			}
			
			this.isEsNuevoComisionCate=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoComisionCate(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesComisionCate(true);			
			//this.comisioncate=new ComisionCate();
			//this.comisioncate.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionCate(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionCate() ;
			
			if(ComisionCateJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionCate(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.comisioncate);	
			this.actualizarInformacion("INFO_PADRE",false,this.comisioncate);				
			
			ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
			
			if(this.comisioncateSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ComisionCate: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarComisionCateActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ComisionCate> comisioncatesSeleccionados=new ArrayList<ComisionCate>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosComisionCate.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosComisionCate.getSelectedRows().length;			
			}
			
			comisioncatesSeleccionados=this.getComisionCatesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoComisionCate--;			
				//ComisionCate comisioncateAux= new ComisionCate();			
				//comisioncateAux.setId(this.iIdNuevoComisionCate);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ComisionCate comisioncateOrigen=new ComisionCate();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ComisionCate comisioncateOrigen : comisioncatesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							comisioncateOrigen =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisioncateOrigen =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaComisionCate();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.comisioncate.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosComisionCate(comisioncateOrigen,this.comisioncate,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comisioncateLogic.getComisionCates().add(this.comisioncateAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comisioncates.add(this.comisioncateAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaComisionCate(false);
				
				this.jTableDatosComisionCate.setRowSelectionInterval(this.getIndiceNuevoComisionCate(), this.getIndiceNuevoComisionCate());
				
				int iLastRow =  this.jTableDatosComisionCate.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComisionCate.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComisionCate.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionCate(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarComisionCateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ComisionCate> comisioncatesSeleccionados=new ArrayList<ComisionCate>();									
		
			ComisionCate comisioncateOrigen=new ComisionCate();
			ComisionCate comisioncateDestino=new ComisionCate();
				
			comisioncatesSeleccionados=this.getComisionCatesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosComisionCate.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || comisioncatesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosComisionCate.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisioncateOrigen =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comisioncateOrigen =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisioncateDestino =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comisioncateDestino =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				comisioncateOrigen =comisioncatesSeleccionados.get(0);
				comisioncateDestino =comisioncatesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosComisionCate(comisioncateOrigen,comisioncateDestino,true,false);
				
				comisioncateDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comisioncateDestino,comisioncateLogic.getComisionCates());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisioncateDestino,comisioncates);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaComisionCate(false);
				
				//this.jTableDatosComisionCate.setRowSelectionInterval(this.getIndiceNuevoComisionCate(), this.getIndiceNuevoComisionCate());
				
				int iLastRow =  this.jTableDatosComisionCate.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComisionCate.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComisionCate.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionCate(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormComisionCateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComisionCate==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormComisionCate.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarComisionCateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesComisionCate.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasComisionCate.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesComisionCate.setVisible(!isVisible);
			this.jPanelPaginacionComisionCate.setVisible(!isVisible);
			this.jPanelAccionesComisionCate.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarComisionCateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameComisionCate();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoComisionCateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoComisionCate();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionComisionCateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionComisionCate();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByComisionCateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByComisionCate();
			
			this.abrirFrameOrderByComisionCate();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByComisionCateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByComisionCate();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleComisionCate(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormComisionCate);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormComisionCate.isMaximum()) {
					this.jInternalFrameDetalleFormComisionCate.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormComisionCate.setSize(this.jInternalFrameDetalleFormComisionCate.iWidthFormulario,this.jInternalFrameDetalleFormComisionCate.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormComisionCate.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormComisionCate.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormComisionCate.isMaximum()) {
						this.jInternalFrameDetalleFormComisionCate.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormComisionCate.jContentPaneDetalleComisionCate.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormComisionCate.jTabbedPaneRelacionesComisionCate.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormComisionCate.jContentPaneDetalleComisionCate.getWidth(),ComisionCateConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComisionCate.jTabbedPaneRelacionesComisionCate.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormComisionCate.jContentPaneDetalleComisionCate.getWidth(),ComisionCateConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComisionCate.jTabbedPaneRelacionesComisionCate.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormComisionCate.jContentPaneDetalleComisionCate.getWidth(),ComisionCateConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormComisionCate.setVisible(true);
	        this.jInternalFrameDetalleFormComisionCate.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByComisionCate() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByComisionCate==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByComisionCate=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionCate,false,this);
				} else {
					this.jInternalFrameOrderByComisionCate=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionCate,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByComisionCate);
				this.jInternalFrameOrderByComisionCate.setVisible(false);
				this.jInternalFrameOrderByComisionCate.setSelected(false);
				
				this.jInternalFrameOrderByComisionCate.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComisionCate"));
				
				this.inicializarActualizarBindingTablaOrderByComisionCate();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionComisionCate() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionComisionCate==null) {
				
				this.jInternalFrameImportacionComisionCate=new ImportacionJInternalFrame(ComisionCateConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComisionCate);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionComisionCate);
				this.jInternalFrameImportacionComisionCate.setVisible(false);
				this.jInternalFrameImportacionComisionCate.setSelected(false);


				this.jInternalFrameImportacionComisionCate.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComisionCate"));
				this.jInternalFrameImportacionComisionCate.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComisionCate"));
				this.jInternalFrameImportacionComisionCate.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComisionCate"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoComisionCate() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoComisionCate==null) {
				this.jInternalFrameReporteDinamicoComisionCate=new ReporteDinamicoJInternalFrame(ComisionCateConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComisionCate);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComisionCate);
				this.jInternalFrameReporteDinamicoComisionCate.setVisible(false);
				this.jInternalFrameReporteDinamicoComisionCate.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoComisionCate.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionCate"));
				this.jInternalFrameReporteDinamicoComisionCate.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionCate"));
				this.jInternalFrameReporteDinamicoComisionCate.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionCate"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionCate();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleComisionCate() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormComisionCate);
			
	       	this.jInternalFrameDetalleFormComisionCate.setVisible(false);
	        this.jInternalFrameDetalleFormComisionCate.setSelected(false);
			
			//this.jInternalFrameDetalleFormComisionCate.dispose();
			//this.jInternalFrameDetalleFormComisionCate=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoComisionCate() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoComisionCate.setVisible(true);
	        this.jInternalFrameReporteDinamicoComisionCate.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionComisionCate() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionComisionCate.setVisible(true);
	        this.jInternalFrameImportacionComisionCate.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByComisionCate() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByComisionCate.setVisible(true);
	        this.jInternalFrameOrderByComisionCate.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByComisionCate() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByComisionCate.setVisible(false);
	        this.jInternalFrameOrderByComisionCate.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoComisionCate() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoComisionCate.setVisible(false);
	        this.jInternalFrameReporteDinamicoComisionCate.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionComisionCate() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionComisionCate.setVisible(false);
	        this.jInternalFrameImportacionComisionCate.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeVendedor(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeVendedor);
						VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.sTipoBusqueda="Vendedor";
						}

						vendedorBeanSwingJInternalFrame.getTodosVendedorArbol();
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setVendedors(vendedorBeanSwingJInternalFrame.vendedorsArbol);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.CargarTreeVendedor();
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setVisible(true);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.jInternalFrameParent=this;
						TitledBorder titledBorderComisionCate=(TitledBorder)this.jScrollPanelDatosComisionCate.getBorder();
						TitledBorder titledBorderVendedor=(TitledBorder)vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

						titledBorderVendedor.setTitle(titledBorderComisionCate.getTitle() + " -> Vendedor");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,vendedorBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(vendedorBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeVendedor(VendedorBeanSwingJInternalFrame jInternalFrameTreeVendedor) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeVendedor);
						jInternalFrameTreeVendedor.setVisible(false);
						jInternalFrameTreeVendedor.setSelected(false);
						//jInternalFrameTreeVendedor.dispose();
						//jInternalFrameTreeVendedor=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeLinea(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeLinea);
						LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.sTipoBusqueda="Linea";
						}

						lineaBeanSwingJInternalFrame.getTodosLineaArbol();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setLineas(lineaBeanSwingJInternalFrame.lineasArbol);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.CargarTreeLinea();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setVisible(true);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.jInternalFrameParent=this;
						TitledBorder titledBorderComisionCate=(TitledBorder)this.jScrollPanelDatosComisionCate.getBorder();
						TitledBorder titledBorderLinea=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLinea.setTitle(titledBorderComisionCate.getTitle() + " -> Linea");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeLinea(LineaBeanSwingJInternalFrame jInternalFrameTreeLinea) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeLinea);
						jInternalFrameTreeLinea.setVisible(false);
						jInternalFrameTreeLinea.setSelected(false);
						//jInternalFrameTreeLinea.dispose();
						//jInternalFrameTreeLinea=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeLineaGrupo(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeLinea);
						LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.sTipoBusqueda="LineaGrupo";
						}

						lineaBeanSwingJInternalFrame.getTodosLineaArbol();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setLineas(lineaBeanSwingJInternalFrame.lineasArbol);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.CargarTreeLinea();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setVisible(true);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.jInternalFrameParent=this;
						TitledBorder titledBorderComisionCate=(TitledBorder)this.jScrollPanelDatosComisionCate.getBorder();
						TitledBorder titledBorderLineaGrupo=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLineaGrupo.setTitle(titledBorderComisionCate.getTitle() + " -> Linea");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeLineaGrupo(LineaBeanSwingJInternalFrame jInternalFrameTreeLinea) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeLinea);
						jInternalFrameTreeLinea.setVisible(false);
						jInternalFrameTreeLinea.setSelected(false);
						//jInternalFrameTreeLinea.dispose();
						//jInternalFrameTreeLinea=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeLineaCategoria(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeLinea);
						LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.sTipoBusqueda="LineaCategoria";
						}

						lineaBeanSwingJInternalFrame.getTodosLineaArbol();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setLineas(lineaBeanSwingJInternalFrame.lineasArbol);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.CargarTreeLinea();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setVisible(true);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.jInternalFrameParent=this;
						TitledBorder titledBorderComisionCate=(TitledBorder)this.jScrollPanelDatosComisionCate.getBorder();
						TitledBorder titledBorderLineaCategoria=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLineaCategoria.setTitle(titledBorderComisionCate.getTitle() + " -> Linea");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeLineaCategoria(LineaBeanSwingJInternalFrame jInternalFrameTreeLinea) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeLinea);
						jInternalFrameTreeLinea.setVisible(false);
						jInternalFrameTreeLinea.setSelected(false);
						//jInternalFrameTreeLinea.dispose();
						//jInternalFrameTreeLinea=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarComisionCateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarComisionCate(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarComisionCate(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesComisionCate(true);
			//this.isEsNuevoComisionCate=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesComisionCate("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionCate(false) ;
			
			if(comisioncateSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ComisionCateJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionCate(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionCate(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaComisionCateActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarComisionCate(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComisionCate==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesComisionCate(true);
			//this.isEsNuevoComisionCate=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.comisioncate.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesComisionCate("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesComisionCate(false) ;
			
			if(ComisionCateJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionCate(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionCate(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Vendedor")) {
				if(!this.comisioncateConstantesFunciones.cargarid_vendedorComisionCate) {
					this.cargarCombosVendedorsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingComisionCate(false,false);
					this.cargarCombosFrameVendedorsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_vendedor (id);

				this.recargarComboTablaVendedor(this.vendedorsForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaComisionConfig(List<ComisionConfig> comisionconfigsForeignKey)throws Exception{
		TableColumn tableColumnComisionConfig=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,ComisionCateConstantesFunciones.LABEL_IDCOMISIONCONFIG));
		TableCellEditor tableCellEditorComisionConfig =tableColumnComisionConfig.getCellEditor();

		ComisionConfigTableCell comisionconfigTableCellFk=(ComisionConfigTableCell)tableCellEditorComisionConfig;

		if(comisionconfigTableCellFk!=null) {
			comisionconfigTableCellFk.setcomisionconfigsForeignKey(comisionconfigsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionCate.getSelectedRow();

		//if(intSelectedRow<=0) {
			//comisionconfigTableCellFk.setRowActual(intSelectedRow);
			//comisionconfigTableCellFk.setcomisionconfigsForeignKeyActual(comisionconfigsForeignKey);
		//}


		if(comisionconfigTableCellFk!=null) {
			comisionconfigTableCellFk.RecargarComisionConfigsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaVendedor(List<Vendedor> vendedorsForeignKey)throws Exception{
		TableColumn tableColumnVendedor=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,ComisionCateConstantesFunciones.LABEL_IDVENDEDOR));
		TableCellEditor tableCellEditorVendedor =tableColumnVendedor.getCellEditor();

		VendedorTableCell vendedorTableCellFk=(VendedorTableCell)tableCellEditorVendedor;

		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.setvendedorsForeignKey(vendedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionCate.getSelectedRow();

		//if(intSelectedRow<=0) {
			//vendedorTableCellFk.setRowActual(intSelectedRow);
			//vendedorTableCellFk.setvendedorsForeignKeyActual(vendedorsForeignKey);
		//}


		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.RecargarVendedorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,ComisionCateConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionCate.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,ComisionCateConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionCate.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,ComisionCateConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionCate.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineacategoriasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoComision(List<EstadoComision> estadocomisionsForeignKey)throws Exception{
		TableColumn tableColumnEstadoComision=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,ComisionCateConstantesFunciones.LABEL_IDESTADOCOMISION));
		TableCellEditor tableCellEditorEstadoComision =tableColumnEstadoComision.getCellEditor();

		EstadoComisionTableCell estadocomisionTableCellFk=(EstadoComisionTableCell)tableCellEditorEstadoComision;

		if(estadocomisionTableCellFk!=null) {
			estadocomisionTableCellFk.setestadocomisionsForeignKey(estadocomisionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionCate.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadocomisionTableCellFk.setRowActual(intSelectedRow);
			//estadocomisionTableCellFk.setestadocomisionsForeignKeyActual(estadocomisionsForeignKey);
		//}


		if(estadocomisionTableCellFk!=null) {
			estadocomisionTableCellFk.RecargarEstadoComisionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_vendedor (Long id) throws Exception {
		this.setActualVendedorForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarComisionCateActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesComisionCate(false);
			
			//if(!this.isEsNuevoComisionCate) {								
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ComisionCateJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualComisionCate(this.comisioncate,true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
				
			}
			
			if(this.permiteMantenimiento(this.comisioncate)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.comisioncateSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoComisionCate=true;
					this.inicializarActualizarBindingTablaComisionCate(false);
					this.isEsNuevoComisionCate=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoComisionCate=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoComisionCate=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComisionCate(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionCate(false);
				
				this.habilitarDeshabilitarControlesComisionCate(false);
			
												
				
				if(ComisionCateJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleComisionCate();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoComisionCateActionPerformed(evt,comisioncateSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualComisionCate(this.comisioncate,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosComisionCate.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,comisioncateSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.comisioncate.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ComisionCate.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionCate.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarComisionCateActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				this.comisioncate.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				this.comisioncate.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.comisioncate)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.comisioncateSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ComisionCateModel) this.jTableDatosComisionCate.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoComisionCate=true;
				this.inicializarActualizarBindingTablaComisionCate(false);
				this.isEsNuevoComisionCate=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComisionCate(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionCate(false);
				
				this.habilitarDeshabilitarControlesComisionCate(false);
				
				
				
				if(ComisionCateJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleComisionCate();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarComisionCateActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosComisionCate.getRowCount()>=1) {
				jTableDatosComisionCate.removeRowSelectionInterval(0, jTableDatosComisionCate.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesComisionCate(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaComisionCate(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionCate(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionCate(false) ;
			
			this.isEsNuevoComisionCate=false;
			
			if(ComisionCateJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleComisionCate();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosComisionCateActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingComisionCate(false);
				
				//SI ES MANUAL
				if(ComisionCateJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualComisionCate();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosComisionCateActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoComisionCate--;			
			//ComisionCate comisioncateAux= new ComisionCate();			
			//comisioncateAux.setId(this.iIdNuevoComisionCate);
			
			if(this.jInternalFrameDetalleFormComisionCate==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaComisionCate();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
			
			this.comisioncate.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.comisioncateLogic.getComisionCates().add(this.comisioncateAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.comisioncates.add(this.comisioncateAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaComisionCate(false);
			
			this.jTableDatosComisionCate.setRowSelectionInterval(this.getIndiceNuevoComisionCate(), this.getIndiceNuevoComisionCate());
			
			int iLastRow =  this.jTableDatosComisionCate.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosComisionCate.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosComisionCate.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaComisionCate(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionComisionCateActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingComisionCate(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionCate(false);
			
			//SI ES MANUAL
			if(ComisionCateJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionCate();
			}
			
			//this.abrirFrameTreeComisionCate();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionComisionCateActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Comision CateS ?", "MANTENIMIENTO DE Comision Cate", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionComisionCate.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralComisionCate();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.comisioncateReturnGeneral=comisioncateLogic.procesarImportacionComisionCatesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.comisioncateParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarComisionCateReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionComisionCateActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionComisionCate.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionComisionCate.setFileImportacion(this.jInternalFrameImportacionComisionCate.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionComisionCate.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionComisionCate.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionComisionCate.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionComisionCate.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoComisionCateActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ComisionCate> comisioncatesSeleccionados=new ArrayList<ComisionCate>();		

		comisioncatesSeleccionados=this.getComisionCatesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ComisionCateBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ComisionCateBaseDesign.jrxml";
			
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
			
			this.generarReporteComisionCates("Todos",comisioncatesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisioncateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Cate",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoComisionCate.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionCate.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComisionCateConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionCateConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ComisionConfig_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ComisionConfig_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ComisionConfig_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ComisionConfig_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionCateConstantesFunciones.LABEL_IDVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Vendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Vendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Vendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Vendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionCateConstantesFunciones.LABEL_IDLINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Linea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Linea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Linea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Linea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionCateConstantesFunciones.LABEL_IDLINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionCateConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionCateConstantesFunciones.LABEL_IDESTADOCOMISION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoComision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoComision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoComision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoComision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionCateConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionCateConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoComisionCate.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ComisionCateConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ComisionCateConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					sNombreCampoCategoria="id_comision_config";
					break;

				case ComisionCateConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoria="id_vendedor";
					break;

				case ComisionCateConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoria="id_linea";
					break;

				case ComisionCateConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoria="id_linea_grupo";
					break;

				case ComisionCateConstantesFunciones.LABEL_IDLINEACATEGORIA:
					sNombreCampoCategoria="id_linea_categoria";
					break;

				case ComisionCateConstantesFunciones.LABEL_IDESTADOCOMISION:
					sNombreCampoCategoria="id_estado_comision";
					break;

				case ComisionCateConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case ComisionCateConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ComisionCateConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ComisionCateConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					sNombreCampoCategoriaValor="id_comision_config";
					break;

				case ComisionCateConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoriaValor="id_vendedor";
					break;

				case ComisionCateConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoriaValor="id_linea";
					break;

				case ComisionCateConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoriaValor="id_linea_grupo";
					break;

				case ComisionCateConstantesFunciones.LABEL_IDLINEACATEGORIA:
					sNombreCampoCategoriaValor="id_linea_categoria";
					break;

				case ComisionCateConstantesFunciones.LABEL_IDESTADOCOMISION:
					sNombreCampoCategoriaValor="id_estado_comision";
					break;

				case ComisionCateConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case ComisionCateConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoComisionCate.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionCate.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComisionCateConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ComisionCateConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Configuracion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_comision_config");
					break;

				case ComisionCateConstantesFunciones.LABEL_IDVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_vendedor");
					break;

				case ComisionCateConstantesFunciones.LABEL_IDLINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea");
					break;

				case ComisionCateConstantesFunciones.LABEL_IDLINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_grupo");
					break;

				case ComisionCateConstantesFunciones.LABEL_IDLINEACATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_categoria");
					break;

				case ComisionCateConstantesFunciones.LABEL_IDESTADOCOMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_comision");
					break;

				case ComisionCateConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case ComisionCateConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoComisionCateActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ComisionCate> comisioncatesSeleccionados=new ArrayList<ComisionCate>();		
		
		comisioncatesSeleccionados=this.getComisionCatesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisioncate";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ComisionCates");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoComisionCate.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionCate.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ComisionCateConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ComisionCate comisioncate:comisioncatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisioncate.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionCateConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDCOMISIONCONFIG);
					iRow++;

					for(ComisionCate comisioncate:comisioncatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisioncate.getcomisionconfig_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionCateConstantesFunciones.LABEL_IDVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDVENDEDOR);
					iRow++;

					for(ComisionCate comisioncate:comisioncatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisioncate.getvendedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionCateConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ComisionCate comisioncate:comisioncatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisioncate.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionCateConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ComisionCate comisioncate:comisioncatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisioncate.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionCateConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ComisionCate comisioncate:comisioncatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisioncate.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionCateConstantesFunciones.LABEL_IDESTADOCOMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDESTADOCOMISION);
					iRow++;

					for(ComisionCate comisioncate:comisioncatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisioncate.getestadocomision_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionCateConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionCateConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(ComisionCate comisioncate:comisioncatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisioncate.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionCateConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionCateConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ComisionCate comisioncate:comisioncatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisioncate.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelComisionCate(row);				
			//	iRow++;
			//}				
			
			//for(ComisionCate comisioncateAux:comisioncatesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelComisionCate(comisioncateAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisioncateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Cate",JOptionPane.INFORMATION_MESSAGE);
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
				this.comisioncateLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionCate(false);
			
			//SI ES MANUAL
			if(ComisionCateJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionCate();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresComisionCateActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionCate(false);
			
			//SI ES MANUAL
			if(ComisionCateJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComisionCate();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesComisionCateActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionCate(false);
			
			//SI ES MANUAL
			if(ComisionCateJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComisionCate();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaComisionCate() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosComisionCate.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosComisionCate.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosComisionCate.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosComisionCate.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosComisionCate.setMinimumSize(dimensionMinimum);
		this.jTableDatosComisionCate.setMaximumSize(dimensionMaximum);
		this.jTableDatosComisionCate.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingComisionCate(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingComisionCate(esInicializar,true);
	}
	
	public void inicializarActualizarBindingComisionCate(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaComisionCate(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesComisionCate(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasComisionCate(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionCate(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesComisionCate(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ComisionCateJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ComisionCateJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualComisionCate() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaComisionCate();
		
		this.inicializarActualizarBindingBotonesManualComisionCate(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualComisionCate();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionCate() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualComisionCate(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualComisionCate(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosComisionCate.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosComisionCate.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteComisionCate.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormComisionCate!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormComisionCate.jCheckBoxPostAccionNuevoComisionCate.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormComisionCate.jCheckBoxPostAccionSinCerrarComisionCate.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormComisionCate.jCheckBoxPostAccionSinMensajeComisionCate.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosComisionCate.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosComisionCate.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteComisionCate.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormComisionCate!=null) {
				this.jInternalFrameDetalleFormComisionCate.jCheckBoxPostAccionNuevoComisionCate.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormComisionCate.jCheckBoxPostAccionSinCerrarComisionCate.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormComisionCate.jCheckBoxPostAccionSinMensajeComisionCate.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionComisionCate.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionComisionCate.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormComisionCate!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormComisionCate.jComboBoxTiposAccionesFormularioComisionCate.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesComisionCate.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoComisionCate!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesComisionCate.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesComisionCate.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarComisionCate.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesComisionCate.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoComisionCate!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesComisionCate.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralComisionCate.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesComisionCate(Boolean esInicializar) throws Exception {
		try	{	
			if(ComisionCateJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualComisionCate(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesComisionCate() throws Exception {
		try	{
			if(ComisionCateJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualComisionCate();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComisionCate() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormComisionCate.jComboBoxTiposAccionesFormularioComisionCate.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormComisionCate.jComboBoxTiposAccionesFormularioComisionCate.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualComisionCate() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesComisionCate.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesComisionCate.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesComisionCate.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesComisionCate.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesComisionCate.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesComisionCate.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionComisionCate.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionComisionCate.addItem(reporte);
			}
			
			
			if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionComisionCate.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionComisionCate.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesComisionCate.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesComisionCate.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesComisionCate.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesComisionCate.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormComisionCate.jComboBoxTiposAccionesFormularioComisionCate.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormComisionCate.jComboBoxTiposAccionesFormularioComisionCate.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarComisionCate.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarComisionCate.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarComisionCate.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionCate();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionCate() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComisionCate!=null) {
				this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComisionCate!=null) {
				this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoComisionCate!=null) {
				
				if(this.jInternalFrameReporteDinamicoComisionCate.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComisionCate.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionCate.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoComisionCate.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComisionCate.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionCate.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ComisionCateConstantesFunciones.getTiposSeleccionarComisionCate(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ComisionCateConstantesFunciones.getTiposSeleccionarComisionCate(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoComisionCate.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComisionCate.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ComisionCateConstantesFunciones.getTiposSeleccionarComisionCate(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionCate.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoComisionCate.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualComisionCate()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_comision_configFK_IdComisionConfigComisionCate.getSelectedItem()!=null){this.id_comision_configFK_IdComisionConfig=((ComisionConfig)this.jComboBoxid_comision_configFK_IdComisionConfigComisionCate.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasComisionCate(Boolean esInicializar) throws Exception {				
		if(ComisionCateJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualComisionCate();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaComisionCate() throws Exception {
		this.inicializarActualizarBindingTablaComisionCate(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByComisionCate() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByComisionCate.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByComisionCate.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionCate.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ComisionCatePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByComisionCate.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionCate.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ComisionCatePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosComisionCateOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCateOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ComisionCatePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByComisionCate.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionCate.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ComisionCatePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByComisionCate.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaComisionCate(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=comisioncateLogic.getComisionCates().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=comisioncates.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ComisionCateJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosComisionCate.setModel(new ComisionCateModel(this.comisioncateLogic.getComisionCates(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosComisionCate.setModel(new ComisionCateModel(this.comisioncates,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByComisionCate!=null && this.jInternalFrameOrderByComisionCate.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByComisionCate();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ComisionCatePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ComisionCateConstantesFunciones.SCLASSWEBTITULO,comisioncateConstantesFunciones.resaltarSeleccionarComisionCate,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ComisionCateConstantesFunciones.SCLASSWEBTITULO,comisioncateConstantesFunciones.resaltarSeleccionarComisionCate,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,ComisionCateConstantesFunciones.LABEL_ID));

		if(this.comisioncateConstantesFunciones.mostraridComisionCate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionCateConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisioncateConstantesFunciones.resaltaridComisionCate,this.comisioncateConstantesFunciones.activaridComisionCate,iSizeTabla,this,true,"idComisionCate","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisioncateConstantesFunciones.resaltaridComisionCate,this.comisioncateConstantesFunciones.activaridComisionCate,this,true,"idComisionCate","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,ComisionCateConstantesFunciones.LABEL_IDEMPRESA));

		if(this.comisioncateConstantesFunciones.mostrarid_empresaComisionCate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionCateConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.comisioncateConstantesFunciones.resaltarid_empresaComisionCate,this,this.comisioncateConstantesFunciones.activarid_empresaComisionCate,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.comisioncateConstantesFunciones.resaltarid_empresaComisionCate,this,this.comisioncateConstantesFunciones.activarid_empresaComisionCate,false,"id_empresaComisionCate","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionCatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,ComisionCateConstantesFunciones.LABEL_IDCOMISIONCONFIG));

		if(this.comisioncateConstantesFunciones.mostrarid_comision_configComisionCate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionCateConstantesFunciones.LABEL_IDCOMISIONCONFIG,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ComisionConfigTableCell(this.comisionconfigsForeignKey,this.comisioncateConstantesFunciones.resaltarid_comision_configComisionCate,this,this.comisioncateConstantesFunciones.activarid_comision_configComisionCate,iSizeTabla));
			tableColumn.setCellEditor(new ComisionConfigTableCell(this.comisionconfigsForeignKey,this.comisioncateConstantesFunciones.resaltarid_comision_configComisionCate,this,this.comisioncateConstantesFunciones.activarid_comision_configComisionCate,true,"id_comision_configComisionCate","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionCatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,ComisionCateConstantesFunciones.LABEL_IDVENDEDOR));

		if(this.comisioncateConstantesFunciones.mostrarid_vendedorComisionCate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionCateConstantesFunciones.LABEL_IDVENDEDOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new VendedorTableCell(this.vendedorsForeignKey,this.comisioncateConstantesFunciones.resaltarid_vendedorComisionCate,this,this.comisioncateConstantesFunciones.activarid_vendedorComisionCate,iSizeTabla));
			tableColumn.setCellEditor(new VendedorTableCell(this.vendedorsForeignKey,this.comisioncateConstantesFunciones.resaltarid_vendedorComisionCate,this,this.comisioncateConstantesFunciones.activarid_vendedorComisionCate,true,"id_vendedorComisionCate","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionCatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,ComisionCateConstantesFunciones.LABEL_IDLINEA));

		if(this.comisioncateConstantesFunciones.mostrarid_lineaComisionCate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionCateConstantesFunciones.LABEL_IDLINEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineasForeignKey,this.comisioncateConstantesFunciones.resaltarid_lineaComisionCate,this,this.comisioncateConstantesFunciones.activarid_lineaComisionCate,iSizeTabla));
			tableColumn.setCellEditor(new LineaTableCell(this.lineasForeignKey,this.comisioncateConstantesFunciones.resaltarid_lineaComisionCate,this,this.comisioncateConstantesFunciones.activarid_lineaComisionCate,true,"id_lineaComisionCate","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionCatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,ComisionCateConstantesFunciones.LABEL_IDLINEAGRUPO));

		if(this.comisioncateConstantesFunciones.mostrarid_linea_grupoComisionCate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionCateConstantesFunciones.LABEL_IDLINEAGRUPO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineagruposForeignKey,this.comisioncateConstantesFunciones.resaltarid_linea_grupoComisionCate,this,this.comisioncateConstantesFunciones.activarid_linea_grupoComisionCate,iSizeTabla));
			tableColumn.setCellEditor(new LineaTableCell(this.lineagruposForeignKey,this.comisioncateConstantesFunciones.resaltarid_linea_grupoComisionCate,this,this.comisioncateConstantesFunciones.activarid_linea_grupoComisionCate,true,"id_linea_grupoComisionCate","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionCatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,ComisionCateConstantesFunciones.LABEL_IDLINEACATEGORIA));

		if(this.comisioncateConstantesFunciones.mostrarid_linea_categoriaComisionCate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionCateConstantesFunciones.LABEL_IDLINEACATEGORIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineacategoriasForeignKey,this.comisioncateConstantesFunciones.resaltarid_linea_categoriaComisionCate,this,this.comisioncateConstantesFunciones.activarid_linea_categoriaComisionCate,iSizeTabla));
			tableColumn.setCellEditor(new LineaTableCell(this.lineacategoriasForeignKey,this.comisioncateConstantesFunciones.resaltarid_linea_categoriaComisionCate,this,this.comisioncateConstantesFunciones.activarid_linea_categoriaComisionCate,true,"id_linea_categoriaComisionCate","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionCatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,ComisionCateConstantesFunciones.LABEL_IDESTADOCOMISION));

		if(this.comisioncateConstantesFunciones.mostrarid_estado_comisionComisionCate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionCateConstantesFunciones.LABEL_IDESTADOCOMISION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoComisionTableCell(this.estadocomisionsForeignKey,this.comisioncateConstantesFunciones.resaltarid_estado_comisionComisionCate,this,this.comisioncateConstantesFunciones.activarid_estado_comisionComisionCate,iSizeTabla));
			tableColumn.setCellEditor(new EstadoComisionTableCell(this.estadocomisionsForeignKey,this.comisioncateConstantesFunciones.resaltarid_estado_comisionComisionCate,this,this.comisioncateConstantesFunciones.activarid_estado_comisionComisionCate,true,"id_estado_comisionComisionCate","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionCatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,ComisionCateConstantesFunciones.LABEL_PORCENTAJE));

		if(this.comisioncateConstantesFunciones.mostrarporcentajeComisionCate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionCateConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisioncateConstantesFunciones.resaltarporcentajeComisionCate,this.comisioncateConstantesFunciones.activarporcentajeComisionCate,iSizeTabla,this,true,"porcentajeComisionCate","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisioncateConstantesFunciones.resaltarporcentajeComisionCate,this.comisioncateConstantesFunciones.activarporcentajeComisionCate,this,true,"porcentajeComisionCate","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionCatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,ComisionCateConstantesFunciones.LABEL_DESCRIPCION));

		if(this.comisioncateConstantesFunciones.mostrardescripcionComisionCate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionCateConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comisioncateConstantesFunciones.resaltardescripcionComisionCate,this.comisioncateConstantesFunciones.activardescripcionComisionCate,iSizeTabla,this,true,"descripcionComisionCate","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisioncateConstantesFunciones.resaltardescripcionComisionCate,this.comisioncateConstantesFunciones.activardescripcionComisionCate,this,true,"descripcionComisionCate","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionCatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.comisioncateSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comisioncateSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comisioncateSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComisionCate.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comisioncateSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comisioncateSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComisionCate.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarComisionCate && this.isPermisoGuardarCambiosComisionCate) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.comisioncateSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.comisioncateSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosComisionCate.addColumn(tableColumn);
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
			
			this.jTableDatosComisionCate.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComisionCate && this.isPermisoGuardarCambiosComisionCate) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComisionCate && this.isPermisoGuardarCambiosComisionCate) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosComisionCate.moveColumn(this.jTableDatosComisionCate.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosComisionCate.moveColumn(this.jTableDatosComisionCate.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosComisionCate.moveColumn(this.jTableDatosComisionCate.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosComisionCate.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosComisionCate.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosComisionCate,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ComisionCateJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosComisionCate.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosComisionCate.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ComisionCateJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ComisionCateJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosComisionCate.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosComisionCate.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosComisionCate.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=comisioncateLogic.getComisionCates().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=comisioncates.size()-1;
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
		//this.jTableDatosComisionCate.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosComisionCate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosComisionCate();
			
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
				
				//this.isEsNuevoComisionCate=false;
					
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
			
				if(this.comisioncateSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormComisionCate==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComisionCate.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComisionCate.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.comisioncate.getsType().equals("DUPLICADO")
				   || this.comisioncate.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoComisionCate=true;
				
				} else {
					this.isEsNuevoComisionCate=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.comisioncateSessionBean.getEsGuardarRelacionado()) {
					if(this.comisioncate.getId()>=0 && !this.comisioncate.getIsNew()) {						
						this.isEsNuevoComisionCate=false;
						
					} else {
						this.isEsNuevoComisionCate=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoComisionCate(esRelaciones);						
				
				this.seleccionarComisionCate(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.comisioncate.getId()<0) {
					this.isEsNuevoComisionCate=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarComisionCate(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarComisionCate(evt,rowIndex);
				}	
				
				if(this.comisioncateSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ComisionCate: " + this.dDif); 
					}
				}								
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarComisionCate(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.comisioncate)) {
					if(this.comisioncate.getId()>0) {
						this.comisioncate.setIsDeleted(true);
						
						this.comisioncatesEliminados.add(this.comisioncate);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comisioncateLogic.getComisionCates().remove(this.comisioncate);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comisioncates.remove(this.comisioncate);				
					}
					
					
					((ComisionCateModel) this.jTableDatosComisionCate.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionCate(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarComisionCate(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoComisionCate) {
			
			if(this.jInternalFrameDetalleFormComisionCate==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComisionCate.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComisionCate.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ComisionCateJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioComisionCate(this.comisioncate);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.comisioncateConstantesFunciones.cargarid_empresaComisionCate || this.comisioncateConstantesFunciones.event_dependid_empresaComisionCate) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.comisioncate.getid_empresa());
									//this.inicializarActualizarBindingComisionCate(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(comisioncate.getEmpresa()!=null) {
							this.empresasForeignKey.add(comisioncate.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.comisioncate.getid_empresa(),false,"Formulario");

					//ComisionConfig
					if(!this.comisioncateConstantesFunciones.cargarid_comision_configComisionCate || this.comisioncateConstantesFunciones.event_dependid_comision_configComisionCate) {
						//this.cargarCombosComisionConfigsForeignKeyLista(" where id="+this.comisioncate.getid_comision_config());
									//this.inicializarActualizarBindingComisionCate(false,false);
						this.comisionconfigsForeignKey=new ArrayList<ComisionConfig>();

						if(comisioncate.getComisionConfig()!=null) {
							this.comisionconfigsForeignKey.add(comisioncate.getComisionConfig());
						}

						this.addItemDefectoCombosForeignKeyComisionConfig();
						this.cargarCombosFrameComisionConfigsForeignKey("Todos");
					}
					this.setActualComisionConfigForeignKey(this.comisioncate.getid_comision_config(),false,"Formulario");

					//Vendedor
					if(!this.comisioncateConstantesFunciones.cargarid_vendedorComisionCate || this.comisioncateConstantesFunciones.event_dependid_vendedorComisionCate) {
						//this.cargarCombosVendedorsForeignKeyLista(" where id="+this.comisioncate.getid_vendedor());
									//this.inicializarActualizarBindingComisionCate(false,false);
						this.vendedorsForeignKey=new ArrayList<Vendedor>();

						if(comisioncate.getVendedor()!=null) {
							this.vendedorsForeignKey.add(comisioncate.getVendedor());
						}

						this.addItemDefectoCombosForeignKeyVendedor();
						this.cargarCombosFrameVendedorsForeignKey("Todos");
					}
					this.setActualVendedorForeignKey(this.comisioncate.getid_vendedor(),false,"Formulario");

					//Linea
					if(!this.comisioncateConstantesFunciones.cargarid_lineaComisionCate || this.comisioncateConstantesFunciones.event_dependid_lineaComisionCate) {
						//this.cargarCombosLineasForeignKeyLista(" where id="+this.comisioncate.getid_linea());
									//this.inicializarActualizarBindingComisionCate(false,false);
						this.lineasForeignKey=new ArrayList<Linea>();

						if(comisioncate.getLinea()!=null) {
							this.lineasForeignKey.add(comisioncate.getLinea());
						}

						this.addItemDefectoCombosForeignKeyLinea();
						this.cargarCombosFrameLineasForeignKey("Todos");
					}
					this.setActualLineaForeignKey(this.comisioncate.getid_linea(),false,"Formulario");

					//LineaGrupo
					if(!this.comisioncateConstantesFunciones.cargarid_linea_grupoComisionCate || this.comisioncateConstantesFunciones.event_dependid_linea_grupoComisionCate) {
						//this.cargarCombosLineaGruposForeignKeyLista(" where id="+this.comisioncate.getid_linea_grupo());
									//this.inicializarActualizarBindingComisionCate(false,false);
						this.lineagruposForeignKey=new ArrayList<Linea>();

						if(comisioncate.getLineaGrupo()!=null) {
							this.lineagruposForeignKey.add(comisioncate.getLineaGrupo());
						}

						this.addItemDefectoCombosForeignKeyLineaGrupo();
						this.cargarCombosFrameLineaGruposForeignKey("Todos");
					}
					this.setActualLineaGrupoForeignKey(this.comisioncate.getid_linea_grupo(),false,"Formulario");

					//LineaCategoria
					if(!this.comisioncateConstantesFunciones.cargarid_linea_categoriaComisionCate || this.comisioncateConstantesFunciones.event_dependid_linea_categoriaComisionCate) {
						//this.cargarCombosLineaCategoriasForeignKeyLista(" where id="+this.comisioncate.getid_linea_categoria());
									//this.inicializarActualizarBindingComisionCate(false,false);
						this.lineacategoriasForeignKey=new ArrayList<Linea>();

						if(comisioncate.getLineaCategoria()!=null) {
							this.lineacategoriasForeignKey.add(comisioncate.getLineaCategoria());
						}

						this.addItemDefectoCombosForeignKeyLineaCategoria();
						this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
					}
					this.setActualLineaCategoriaForeignKey(this.comisioncate.getid_linea_categoria(),false,"Formulario");

					//EstadoComision
					if(!this.comisioncateConstantesFunciones.cargarid_estado_comisionComisionCate || this.comisioncateConstantesFunciones.event_dependid_estado_comisionComisionCate) {
						//this.cargarCombosEstadoComisionsForeignKeyLista(" where id="+this.comisioncate.getid_estado_comision());
									//this.inicializarActualizarBindingComisionCate(false,false);
						this.estadocomisionsForeignKey=new ArrayList<EstadoComision>();

						if(comisioncate.getEstadoComision()!=null) {
							this.estadocomisionsForeignKey.add(comisioncate.getEstadoComision());
						}

						this.addItemDefectoCombosForeignKeyEstadoComision();
						this.cargarCombosFrameEstadoComisionsForeignKey("Todos");
					}
					this.setActualEstadoComisionForeignKey(this.comisioncate.getid_estado_comision(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesComisionCate("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesComisionCate(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionCate() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoComisionCate(ComisionCate comisioncate) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoComisionCate(comisioncate,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoComisionCate(ComisionCate comisioncate,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioComisionCate(comisioncate);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyComisionCate(comisioncate,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyComisionCate(comisioncate);
	}
	
	public void setVariablesObjetoActualToFormularioComisionCate(ComisionCate comisioncate) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormComisionCate==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormComisionCate.jLabelidComisionCate.setText(comisioncate.getId().toString());
			this.jInternalFrameDetalleFormComisionCate.jTextFieldporcentajeComisionCate.setText(comisioncate.getporcentaje().toString());
			this.jInternalFrameDetalleFormComisionCate.jTextAreadescripcionComisionCate.setText(comisioncate.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ComisionCate comisioncateLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,comisioncateLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ComisionCate comisioncateLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				comisioncateLocal=this.comisioncate;
			} else {
				comisioncateLocal=this.comisioncateAnterior;
			}
		}
		
		if(this.permiteMantenimiento(comisioncateLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoComisionCate(comisioncateLocal,true);
					
					if(comisioncateSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(comisioncateLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.comisioncateSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(comisioncateLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoComisionCate(ComisionCate comisioncate,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComisionCate(comisioncate,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(comisioncate);
	}
	
	public void setVariablesFormularioToObjetoActualComisionCate(ComisionCate comisioncate,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComisionCate(comisioncate,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualComisionCate(ComisionCate comisioncate,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormComisionCate==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormComisionCate.jLabelidComisionCate.getText()==null || this.jInternalFrameDetalleFormComisionCate.jLabelidComisionCate.getText()=="" || this.jInternalFrameDetalleFormComisionCate.jLabelidComisionCate.getText()=="Id") {
				this.jInternalFrameDetalleFormComisionCate.jLabelidComisionCate.setText("0");
			}

			if(conColumnasBase) {comisioncate.setId(Long.parseLong(this.jInternalFrameDetalleFormComisionCate.jLabelidComisionCate.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionCateConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionCate.jLabelIdComisionCate,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisioncate.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormComisionCate.jTextFieldporcentajeComisionCate.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionCateConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionCate.jLabelporcentajeComisionCate,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisioncate.setdescripcion(this.jInternalFrameDetalleFormComisionCate.jTextAreadescripcionComisionCate.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionCateConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionCate.jLabeldescripcionComisionCate,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComisionCate(ComisionCate comisioncateBean,ComisionCate comisioncate,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && comisioncateBean.getid_comision_config()!=null && !comisioncateBean.getid_comision_config().equals(-1L))) {comisioncate.setid_comision_config(comisioncateBean.getid_comision_config());}
			if(conDefault || (!conDefault && comisioncateBean.getid_vendedor()!=null && !comisioncateBean.getid_vendedor().equals(-1L))) {comisioncate.setid_vendedor(comisioncateBean.getid_vendedor());}
			if(conDefault || (!conDefault && comisioncateBean.getid_linea()!=null && !comisioncateBean.getid_linea().equals(-1L))) {comisioncate.setid_linea(comisioncateBean.getid_linea());}
			if(conDefault || (!conDefault && comisioncateBean.getid_linea_grupo()!=null && !comisioncateBean.getid_linea_grupo().equals(-1L))) {comisioncate.setid_linea_grupo(comisioncateBean.getid_linea_grupo());}
			if(conDefault || (!conDefault && comisioncateBean.getid_linea_categoria()!=null && !comisioncateBean.getid_linea_categoria().equals(-1L))) {comisioncate.setid_linea_categoria(comisioncateBean.getid_linea_categoria());}
			if(conDefault || (!conDefault && comisioncateBean.getid_estado_comision()!=null && !comisioncateBean.getid_estado_comision().equals(-1L))) {comisioncate.setid_estado_comision(comisioncateBean.getid_estado_comision());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosComisionCate(ComisionCate comisioncateOrigen,ComisionCate comisioncate,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comisioncateOrigen.getId()!=null && !comisioncateOrigen.getId().equals(0L))) {comisioncate.setId(comisioncateOrigen.getId());}}
			if(conDefault || (!conDefault && comisioncateOrigen.getid_comision_config()!=null && !comisioncateOrigen.getid_comision_config().equals(-1L))) {comisioncate.setid_comision_config(comisioncateOrigen.getid_comision_config());}
			if(conDefault || (!conDefault && comisioncateOrigen.getid_vendedor()!=null && !comisioncateOrigen.getid_vendedor().equals(-1L))) {comisioncate.setid_vendedor(comisioncateOrigen.getid_vendedor());}
			if(conDefault || (!conDefault && comisioncateOrigen.getid_linea()!=null && !comisioncateOrigen.getid_linea().equals(-1L))) {comisioncate.setid_linea(comisioncateOrigen.getid_linea());}
			if(conDefault || (!conDefault && comisioncateOrigen.getid_linea_grupo()!=null && !comisioncateOrigen.getid_linea_grupo().equals(-1L))) {comisioncate.setid_linea_grupo(comisioncateOrigen.getid_linea_grupo());}
			if(conDefault || (!conDefault && comisioncateOrigen.getid_linea_categoria()!=null && !comisioncateOrigen.getid_linea_categoria().equals(-1L))) {comisioncate.setid_linea_categoria(comisioncateOrigen.getid_linea_categoria());}
			if(conDefault || (!conDefault && comisioncateOrigen.getid_estado_comision()!=null && !comisioncateOrigen.getid_estado_comision().equals(-1L))) {comisioncate.setid_estado_comision(comisioncateOrigen.getid_estado_comision());}
			if(conDefault || (!conDefault && comisioncateOrigen.getporcentaje()!=null && !comisioncateOrigen.getporcentaje().equals(0.0))) {comisioncate.setporcentaje(comisioncateOrigen.getporcentaje());}
			if(conDefault || (!conDefault && comisioncateOrigen.getdescripcion()!=null && !comisioncateOrigen.getdescripcion().equals(""))) {comisioncate.setdescripcion(comisioncateOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComisionCate(ComisionCate comisioncate) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComisionCate.jLabelidComisionCate.setText(comisioncate.getId().toString());
			this.jInternalFrameDetalleFormComisionCate.jTextFieldporcentajeComisionCate.setText(comisioncate.getporcentaje().toString());
			this.jInternalFrameDetalleFormComisionCate.jTextAreadescripcionComisionCate.setText(comisioncate.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComisionCate(ComisionCateBean comisioncateBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComisionCate.jLabelidComisionCate.setText(comisioncateBean.getId().toString());
			this.jInternalFrameDetalleFormComisionCate.jTextFieldporcentajeComisionCate.setText(comisioncateBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormComisionCate.jTextAreadescripcionComisionCate.setText(comisioncateBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanComisionCate(ComisionCateParameterReturnGeneral comisioncateReturnGeneral,ComisionCateBean comisioncateBean,Boolean conDefault) throws Exception { 
		try {
			ComisionCate comisioncateLocal=new ComisionCate();
			
			comisioncateLocal=comisioncateReturnGeneral.getComisionCate();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comisioncateLocal.getId()!=null && !comisioncateLocal.getId().equals(0L))) {comisioncateBean.setId(comisioncateLocal.getId());}}
			if(conDefault || (!conDefault && comisioncateLocal.getid_comision_config()!=null && !comisioncateLocal.getid_comision_config().equals(-1L))) {comisioncateBean.setid_comision_config(comisioncateLocal.getid_comision_config());}
			if(conDefault || (!conDefault && comisioncateLocal.getid_vendedor()!=null && !comisioncateLocal.getid_vendedor().equals(-1L))) {comisioncateBean.setid_vendedor(comisioncateLocal.getid_vendedor());}
			if(conDefault || (!conDefault && comisioncateLocal.getid_linea()!=null && !comisioncateLocal.getid_linea().equals(-1L))) {comisioncateBean.setid_linea(comisioncateLocal.getid_linea());}
			if(conDefault || (!conDefault && comisioncateLocal.getid_linea_grupo()!=null && !comisioncateLocal.getid_linea_grupo().equals(-1L))) {comisioncateBean.setid_linea_grupo(comisioncateLocal.getid_linea_grupo());}
			if(conDefault || (!conDefault && comisioncateLocal.getid_linea_categoria()!=null && !comisioncateLocal.getid_linea_categoria().equals(-1L))) {comisioncateBean.setid_linea_categoria(comisioncateLocal.getid_linea_categoria());}
			if(conDefault || (!conDefault && comisioncateLocal.getid_estado_comision()!=null && !comisioncateLocal.getid_estado_comision().equals(-1L))) {comisioncateBean.setid_estado_comision(comisioncateLocal.getid_estado_comision());}
			if(conDefault || (!conDefault && comisioncateLocal.getporcentaje()!=null && !comisioncateLocal.getporcentaje().equals(0.0))) {comisioncateBean.setporcentaje(comisioncateLocal.getporcentaje());}
			if(conDefault || (!conDefault && comisioncateLocal.getdescripcion()!=null && !comisioncateLocal.getdescripcion().equals(""))) {comisioncateBean.setdescripcion(comisioncateLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxComisionCateGenerico(Long idComisionCateSeleccionado,JComboBox jComboBoxComisionCate,List<ComisionCate> comisioncatesLocal)throws Exception {
		try {
			ComisionCate  comisioncateTemp=null;

			for(ComisionCate comisioncateAux:comisioncatesLocal) {
				if(comisioncateAux.getId()!=null && comisioncateAux.getId().equals(idComisionCateSeleccionado)) {
					comisioncateTemp=comisioncateAux;
					break;
				}
			}

			jComboBoxComisionCate.setSelectedItem(comisioncateTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxComisionCateGenerico(JComboBox jComboBoxComisionCate,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComisionCate.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxComisionCate.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComisionCate.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxComisionCate.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxComisionCate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxComisionCate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisioncate=(ComisionCate) comisioncateLogic.getComisionCates().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comisioncate =(ComisionCate) comisioncates.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!comisioncate.getIsNew() && !comisioncate.getIsChanged() && !comisioncate.getIsDeleted()) {
				sDescripcion=comisioncate.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=comisioncate.getempresa_descripcion();
			}
		}

		if(sTipo.equals("ComisionConfig")) {
			//sDescripcion=this.getActualComisionConfigForeignKeyDescripcion((Long)value);
			if(!comisioncate.getIsNew() && !comisioncate.getIsChanged() && !comisioncate.getIsDeleted()) {
				sDescripcion=comisioncate.getcomisionconfig_descripcion();
			} else {
				//sDescripcion=this.getActualComisionConfigForeignKeyDescripcion((Long)value);
				sDescripcion=comisioncate.getcomisionconfig_descripcion();
			}
		}

		if(sTipo.equals("Vendedor")) {
			//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
			if(!comisioncate.getIsNew() && !comisioncate.getIsChanged() && !comisioncate.getIsDeleted()) {
				sDescripcion=comisioncate.getvendedor_descripcion();
			} else {
				//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
				sDescripcion=comisioncate.getvendedor_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!comisioncate.getIsNew() && !comisioncate.getIsChanged() && !comisioncate.getIsDeleted()) {
				sDescripcion=comisioncate.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=comisioncate.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!comisioncate.getIsNew() && !comisioncate.getIsChanged() && !comisioncate.getIsDeleted()) {
				sDescripcion=comisioncate.getlineagrupo_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=comisioncate.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!comisioncate.getIsNew() && !comisioncate.getIsChanged() && !comisioncate.getIsDeleted()) {
				sDescripcion=comisioncate.getlineacategoria_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=comisioncate.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("EstadoComision")) {
			//sDescripcion=this.getActualEstadoComisionForeignKeyDescripcion((Long)value);
			if(!comisioncate.getIsNew() && !comisioncate.getIsChanged() && !comisioncate.getIsDeleted()) {
				sDescripcion=comisioncate.getestadocomision_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoComisionForeignKeyDescripcion((Long)value);
				sDescripcion=comisioncate.getestadocomision_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ComisionCate comisioncateRow=new ComisionCate();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisioncateRow=(ComisionCate) comisioncateLogic.getComisionCates().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comisioncateRow=(ComisionCate) comisioncates.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualComisionCate(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoComisionCate.setVisible((this.isVisibilidadCeldaNuevoComisionCate && this.isPermisoNuevoComisionCate));			
			this.jButtonDuplicarComisionCate.setVisible((this.isVisibilidadCeldaDuplicarComisionCate && this.isPermisoDuplicarComisionCate));			
			this.jButtonCopiarComisionCate.setVisible((this.isVisibilidadCeldaCopiarComisionCate && this.isPermisoCopiarComisionCate));
			this.jButtonVerFormComisionCate.setVisible((this.isVisibilidadCeldaVerFormComisionCate && this.isPermisoVerFormComisionCate));
			
			this.jButtonAbrirOrderByComisionCate.setVisible((this.isVisibilidadCeldaOrdenComisionCate && this.isPermisoOrdenComisionCate));			
			
			this.jButtonNuevoRelacionesComisionCate.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionCate && this.isPermisoNuevoComisionCate));			
			this.jButtonNuevoGuardarCambiosComisionCate.setVisible((this.isVisibilidadCeldaNuevoComisionCate && this.isPermisoNuevoComisionCate && this.isPermisoGuardarCambiosComisionCate));
			
			if(this.jInternalFrameDetalleFormComisionCate!=null) {
			this.jInternalFrameDetalleFormComisionCate.jButtonModificarComisionCate.setVisible((this.isVisibilidadCeldaModificarComisionCate && this.isPermisoActualizarComisionCate));	
			this.jInternalFrameDetalleFormComisionCate.jButtonActualizarComisionCate.setVisible((this.isVisibilidadCeldaActualizarComisionCate && this.isPermisoActualizarComisionCate));	
			this.jInternalFrameDetalleFormComisionCate.jButtonEliminarComisionCate.setVisible((this.isVisibilidadCeldaEliminarComisionCate && this.isPermisoEliminarComisionCate));
			this.jInternalFrameDetalleFormComisionCate.jButtonCancelarComisionCate.setVisible(this.isVisibilidadCeldaCancelarComisionCate);							
			this.jInternalFrameDetalleFormComisionCate.jButtonGuardarCambiosComisionCate.setVisible((this.isVisibilidadCeldaGuardarComisionCate && this.isPermisoGuardarCambiosComisionCate));			
			
			}
						
			this.jButtonGuardarCambiosTablaComisionCate.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionCate && this.isPermisoGuardarCambiosComisionCate));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarComisionCate.setVisible((this.isVisibilidadCeldaNuevoComisionCate && this.isPermisoNuevoComisionCate));						
			this.jButtonDuplicarToolBarComisionCate.setVisible((this.isVisibilidadCeldaDuplicarComisionCate && this.isPermisoDuplicarComisionCate));						
			this.jButtonCopiarToolBarComisionCate.setVisible((this.isVisibilidadCeldaCopiarComisionCate && this.isPermisoCopiarComisionCate));			
			this.jButtonVerFormToolBarComisionCate.setVisible((this.isVisibilidadCeldaVerFormComisionCate && this.isPermisoVerFormComisionCate));			
			this.jButtonAbrirOrderByToolBarComisionCate.setVisible((this.isVisibilidadCeldaOrdenComisionCate && this.isPermisoOrdenComisionCate));
			this.jButtonNuevoRelacionesToolBarComisionCate.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionCate && this.isPermisoNuevoComisionCate));			
			this.jButtonNuevoGuardarCambiosToolBarComisionCate.setVisible((this.isVisibilidadCeldaNuevoComisionCate && this.isPermisoNuevoComisionCate && this.isPermisoGuardarCambiosComisionCate));			
			
			if(this.jInternalFrameDetalleFormComisionCate!=null) {
			this.jInternalFrameDetalleFormComisionCate.jButtonModificarToolBarComisionCate.setVisible((this.isVisibilidadCeldaModificarComisionCate && this.isPermisoActualizarComisionCate));	
			this.jInternalFrameDetalleFormComisionCate.jButtonActualizarToolBarComisionCate.setVisible((this.isVisibilidadCeldaActualizarComisionCate  && this.isPermisoActualizarComisionCate));	
			this.jInternalFrameDetalleFormComisionCate.jButtonEliminarToolBarComisionCate.setVisible((this.isVisibilidadCeldaEliminarComisionCate && this.isPermisoEliminarComisionCate));
			this.jInternalFrameDetalleFormComisionCate.jButtonCancelarToolBarComisionCate.setVisible(this.isVisibilidadCeldaCancelarComisionCate);				
			this.jInternalFrameDetalleFormComisionCate.jButtonGuardarCambiosToolBarComisionCate.setVisible((this.isVisibilidadCeldaGuardarComisionCate && this.isPermisoGuardarCambiosComisionCate));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarComisionCate.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionCate && this.isPermisoGuardarCambiosComisionCate));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoComisionCate.setVisible((this.isVisibilidadCeldaNuevoComisionCate && this.isPermisoNuevoComisionCate));			
			this.jMenuItemDuplicarComisionCate.setVisible((this.isVisibilidadCeldaDuplicarComisionCate && this.isPermisoDuplicarComisionCate));			
			this.jMenuItemCopiarComisionCate.setVisible((this.isVisibilidadCeldaCopiarComisionCate && this.isPermisoCopiarComisionCate));			
			this.jMenuItemVerFormComisionCate.setVisible((this.isVisibilidadCeldaVerFormComisionCate && this.isPermisoVerFormComisionCate));			
			this.jMenuItemAbrirOrderByComisionCate.setVisible((this.isVisibilidadCeldaOrdenComisionCate && this.isPermisoOrdenComisionCate));			
			//this.jMenuItemMostrarOcultarComisionCate.setVisible((this.isVisibilidadCeldaOrdenComisionCate && this.isPermisoOrdenComisionCate));
			this.jMenuItemDetalleAbrirOrderByComisionCate.setVisible((this.isVisibilidadCeldaOrdenComisionCate && this.isPermisoOrdenComisionCate));			
			//this.jMenuItemDetalleMostrarOcultarComisionCate.setVisible((this.isVisibilidadCeldaOrdenComisionCate && this.isPermisoOrdenComisionCate));			
			this.jMenuItemNuevoRelacionesComisionCate.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionCate && this.isPermisoNuevoComisionCate));			
			this.jMenuItemNuevoGuardarCambiosComisionCate.setVisible((this.isVisibilidadCeldaNuevoComisionCate && this.isPermisoNuevoComisionCate && this.isPermisoGuardarCambiosComisionCate));									
			
			if(this.jInternalFrameDetalleFormComisionCate!=null) {
			this.jInternalFrameDetalleFormComisionCate.jMenuItemModificarComisionCate.setVisible((this.isVisibilidadCeldaModificarComisionCate && this.isPermisoActualizarComisionCate));	
			this.jInternalFrameDetalleFormComisionCate.jMenuItemActualizarComisionCate.setVisible((this.isVisibilidadCeldaActualizarComisionCate && this.isPermisoActualizarComisionCate));	
			this.jInternalFrameDetalleFormComisionCate.jMenuItemEliminarComisionCate.setVisible((this.isVisibilidadCeldaEliminarComisionCate && this.isPermisoEliminarComisionCate));
			this.jInternalFrameDetalleFormComisionCate.jMenuItemCancelarComisionCate.setVisible(this.isVisibilidadCeldaCancelarComisionCate);				
			}
			
			this.jMenuItemGuardarCambiosComisionCate.setVisible((this.isVisibilidadCeldaGuardarComisionCate && this.isPermisoGuardarCambiosComisionCate));						
			this.jMenuItemGuardarCambiosTablaComisionCate.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionCate && this.isPermisoGuardarCambiosComisionCate));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoComisionCate=this.jButtonNuevoComisionCate.isVisible();
			this.isVisibilidadCeldaDuplicarComisionCate=this.jButtonDuplicarComisionCate.isVisible();
			this.isVisibilidadCeldaCopiarComisionCate=this.jButtonCopiarComisionCate.isVisible();
			this.isVisibilidadCeldaVerFormComisionCate=this.jButtonVerFormComisionCate.isVisible();
			
			this.isVisibilidadCeldaOrdenComisionCate=this.jButtonAbrirOrderByComisionCate.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesComisionCate=this.jButtonNuevoRelacionesComisionCate.isVisible();
			this.isVisibilidadCeldaModificarComisionCate=this.jButtonModificarComisionCate.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionCate!=null) {
			this.isVisibilidadCeldaActualizarComisionCate=this.jInternalFrameDetalleFormComisionCate.jButtonActualizarComisionCate.isVisible();
			this.isVisibilidadCeldaEliminarComisionCate=this.jInternalFrameDetalleFormComisionCate.jButtonEliminarComisionCate.isVisible();
			this.isVisibilidadCeldaCancelarComisionCate=this.jInternalFrameDetalleFormComisionCate.jButtonCancelarComisionCate.isVisible();
			this.isVisibilidadCeldaGuardarComisionCate=this.jInternalFrameDetalleFormComisionCate.jButtonGuardarCambiosComisionCate.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosComisionCate=this.jButtonGuardarCambiosTablaComisionCate.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoComisionCate=this.jButtonNuevoToolBarComisionCate.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComisionCate=this.jButtonNuevoRelacionesToolBarComisionCate.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionCate!=null) {
			this.isVisibilidadCeldaModificarComisionCate=this.jInternalFrameDetalleFormComisionCate.jButtonModificarToolBarComisionCate.isVisible();
			this.isVisibilidadCeldaActualizarComisionCate=this.jInternalFrameDetalleFormComisionCate.jButtonActualizarToolBarComisionCate.isVisible();
			this.isVisibilidadCeldaEliminarComisionCate=this.jInternalFrameDetalleFormComisionCate.jButtonEliminarToolBarComisionCate.isVisible();
			this.isVisibilidadCeldaCancelarComisionCate=this.jInternalFrameDetalleFormComisionCate.jButtonCancelarToolBarComisionCate.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComisionCate=this.jButtonGuardarCambiosToolBarComisionCate.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComisionCate=this.jButtonGuardarCambiosTablaToolBarComisionCate.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoComisionCate=this.jMenuItemNuevoComisionCate.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComisionCate=this.jMenuItemNuevoRelacionesComisionCate.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionCate!=null) {
			this.isVisibilidadCeldaModificarComisionCate=this.jInternalFrameDetalleFormComisionCate.jMenuItemModificarComisionCate.isVisible();
			this.isVisibilidadCeldaActualizarComisionCate=this.jInternalFrameDetalleFormComisionCate.jMenuItemActualizarComisionCate.isVisible();
			this.isVisibilidadCeldaEliminarComisionCate=this.jInternalFrameDetalleFormComisionCate.jMenuItemEliminarComisionCate.isVisible();
			this.isVisibilidadCeldaCancelarComisionCate=this.jInternalFrameDetalleFormComisionCate.jMenuItemCancelarComisionCate.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComisionCate=this.jMenuItemGuardarCambiosComisionCate.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComisionCate=this.jMenuItemGuardarCambiosTablaComisionCate.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesComisionCate(Boolean esInicializar) {
		if(ComisionCateJInternalFrame.ISBINDING_MANUAL) {			
			if(this.comisioncateSessionBean.getConGuardarRelaciones()) {
				//if(this.comisioncateSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesComisionCate();
			}
			
			this.inicializarActualizarBindingBotonesManualComisionCate(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualComisionCate() {
		this.jButtonNuevoComisionCate.setVisible(this.isPermisoNuevoComisionCate);			
		this.jButtonDuplicarComisionCate.setVisible(this.isPermisoDuplicarComisionCate);			
		this.jButtonCopiarComisionCate.setVisible(this.isPermisoCopiarComisionCate);			
		this.jButtonVerFormComisionCate.setVisible(this.isPermisoVerFormComisionCate);			
		
		this.jButtonAbrirOrderByComisionCate.setVisible(this.isPermisoOrdenComisionCate);					
		
		this.jButtonNuevoRelacionesComisionCate.setVisible(this.isPermisoNuevoComisionCate);			
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionCate.jButtonModificarComisionCate.setVisible(this.isPermisoActualizarComisionCate);	
			this.jInternalFrameDetalleFormComisionCate.jButtonActualizarComisionCate.setVisible(this.isPermisoActualizarComisionCate);	
			this.jInternalFrameDetalleFormComisionCate.jButtonEliminarComisionCate.setVisible(this.isPermisoEliminarComisionCate);
			this.jInternalFrameDetalleFormComisionCate.jButtonCancelarComisionCate.setVisible(this.isVisibilidadCeldaCancelarComisionCate);						
			this.jInternalFrameDetalleFormComisionCate.jButtonGuardarCambiosComisionCate.setVisible(this.isPermisoGuardarCambiosComisionCate);							
		}
		
		this.jButtonGuardarCambiosTablaComisionCate.setVisible(this.isPermisoActualizarComisionCate);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleComisionCate() {
		this.jInternalFrameDetalleFormComisionCate.jButtonModificarComisionCate.setVisible(this.isPermisoActualizarComisionCate);	
		this.jInternalFrameDetalleFormComisionCate.jButtonActualizarComisionCate.setVisible(this.isPermisoActualizarComisionCate);	
		this.jInternalFrameDetalleFormComisionCate.jButtonEliminarComisionCate.setVisible(this.isPermisoEliminarComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jButtonCancelarComisionCate.setVisible(this.isVisibilidadCeldaCancelarComisionCate);							
		this.jInternalFrameDetalleFormComisionCate.jButtonGuardarCambiosComisionCate.setVisible((this.isVisibilidadCeldaGuardarComisionCate && this.isPermisoGuardarCambiosComisionCate));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosComisionCate() {
		if(ComisionCateJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualComisionCate();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesComisionCate() {
	}
	
	public void jTableDatosComisionCateListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarComisionCate(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidComisionCateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionCate(this.getcomisioncate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisioncate==null) {
						this.comisioncate = new ComisionCate();
					}

					this.setVariablesFormularioToObjetoActualComisionCate(this.comisioncate,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
				}

				if(this.comisioncate.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.comisioncate.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionCate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaComisionCateUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebComisionCate(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionCate.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionCate.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionCate(this.getcomisioncate(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.comisioncateLogic.getConnexion());

				if(this.comisioncate.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.comisioncate.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionCate=(TitledBorder)this.jScrollPanelDatosComisionCate.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderComisionCate.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaComisionCateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionCate(this.getcomisioncate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisioncate==null) {
						this.comisioncate = new ComisionCate();
					}

					this.setVariablesFormularioToObjetoActualComisionCate(this.comisioncate,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
				}

				if(this.comisioncate.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.comisioncate.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionCate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_comision_configComisionCateUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocomisionconfig=true;

			idTienePermisocomisionconfig=this.tienePermisosUsuarioEnPaginaWebComisionCate(ComisionConfigConstantesFunciones.CLASSNAME);

			if(idTienePermisocomisionconfig) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionCate.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionCate.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionCate(this.getcomisioncate(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);

				this.comisionconfigBeanSwingJInternalFrame=new ComisionConfigBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.comisionconfigBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.comisionconfigBeanSwingJInternalFrame.getComisionConfigLogic().setConnexion(this.comisioncateLogic.getConnexion());

				if(this.comisioncate.getid_comision_config()!=null) {
					this.comisionconfigBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.comisionconfigBeanSwingJInternalFrame.setIdActual(this.comisioncate.getid_comision_config());
					this.comisionconfigBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.comisionconfigBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.comisionconfigBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionConfig();
				}

				JInternalFrameBase jinternalFrame =this.comisionconfigBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionCate=(TitledBorder)this.jScrollPanelDatosComisionCate.getBorder();
				TitledBorder titledBordercomisionconfig=(TitledBorder)this.comisionconfigBeanSwingJInternalFrame.jScrollPanelDatosComisionConfig.getBorder();

				titledBordercomisionconfig.setTitle(titledBorderComisionCate.getTitle() + " -> Comision Config");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_comision_configComisionCateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionCate(this.getcomisioncate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisioncate==null) {
						this.comisioncate = new ComisionCate();
					}

					this.setVariablesFormularioToObjetoActualComisionCate(this.comisioncate,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
				}

				if(this.comisioncate.getid_comision_config()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_comision_config = "+this.comisioncate.getid_comision_config().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionCate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vendedorComisionCateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="Vendedor";

			if(!this.sFinalQueryGeneral_vendedor.equals("")) {
				this.vendedorBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_vendedor);
				this.vendedorBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.vendedorBeanSwingJInternalFrame.procesarBusqueda(this.vendedorBeanSwingJInternalFrame.sAccionBusqueda);
				this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingVendedor(false);
			}

			if(!this.sFinalQueryComboVendedor.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderComisionCate=null;
			TitledBorder titledBordervendedor=null;

			if(!this.jScrollPanelDatosComisionCate.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderComisionCate=(TitledBorder)this.jScrollPanelDatosComisionCate.getBorder();
				titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderComisionCate.getTitle() + " -> Vendedor");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_vendedorComisionCateUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovendedor=true;

			idTienePermisovendedor=this.tienePermisosUsuarioEnPaginaWebComisionCate(VendedorConstantesFunciones.CLASSNAME);

			if(idTienePermisovendedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionCate.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionCate.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionCate(this.getcomisioncate(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.comisioncateLogic.getConnexion());

				if(this.comisioncate.getid_vendedor()!=null) {
					this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vendedorBeanSwingJInternalFrame.setIdActual(this.comisioncate.getid_vendedor());
					this.vendedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor();
				}

				JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionCate=(TitledBorder)this.jScrollPanelDatosComisionCate.getBorder();
				TitledBorder titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderComisionCate.getTitle() + " -> Vendedor");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vendedorComisionCateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionCate(this.getcomisioncate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisioncate==null) {
						this.comisioncate = new ComisionCate();
					}

					this.setVariablesFormularioToObjetoActualComisionCate(this.comisioncate,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
				}

				if(this.comisioncate.getid_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vendedor = "+this.comisioncate.getid_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionCate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaComisionCateUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebComisionCate(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionCate.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionCate.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionCate(this.getcomisioncate(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.comisioncateLogic.getConnexion());

				if(this.comisioncate.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.comisioncate.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionCate=(TitledBorder)this.jScrollPanelDatosComisionCate.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderComisionCate.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaComisionCateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionCate(this.getcomisioncate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisioncate==null) {
						this.comisioncate = new ComisionCate();
					}

					this.setVariablesFormularioToObjetoActualComisionCate(this.comisioncate,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
				}

				if(this.comisioncate.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.comisioncate.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionCate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoComisionCateUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebComisionCate(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionCate.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionCate.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionCate(this.getcomisioncate(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.comisioncateLogic.getConnexion());

				if(this.comisioncate.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.comisioncate.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionCate=(TitledBorder)this.jScrollPanelDatosComisionCate.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderComisionCate.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoComisionCateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionCate(this.getcomisioncate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisioncate==null) {
						this.comisioncate = new ComisionCate();
					}

					this.setVariablesFormularioToObjetoActualComisionCate(this.comisioncate,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
				}

				if(this.comisioncate.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.comisioncate.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionCate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaComisionCateUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebComisionCate(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionCate.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionCate.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionCate(this.getcomisioncate(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.comisioncateLogic.getConnexion());

				if(this.comisioncate.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.comisioncate.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionCate=(TitledBorder)this.jScrollPanelDatosComisionCate.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderComisionCate.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaComisionCateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionCate(this.getcomisioncate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisioncate==null) {
						this.comisioncate = new ComisionCate();
					}

					this.setVariablesFormularioToObjetoActualComisionCate(this.comisioncate,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
				}

				if(this.comisioncate.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.comisioncate.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionCate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_comisionComisionCateUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadocomision=true;

			idTienePermisoestadocomision=this.tienePermisosUsuarioEnPaginaWebComisionCate(EstadoComisionConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadocomision) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionCate.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionCate.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionCate(this.getcomisioncate(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);

				this.estadocomisionBeanSwingJInternalFrame=new EstadoComisionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadocomisionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadocomisionBeanSwingJInternalFrame.getEstadoComisionLogic().setConnexion(this.comisioncateLogic.getConnexion());

				if(this.comisioncate.getid_estado_comision()!=null) {
					this.estadocomisionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadocomisionBeanSwingJInternalFrame.setIdActual(this.comisioncate.getid_estado_comision());
					this.estadocomisionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadocomisionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadocomisionBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoComision();
				}

				JInternalFrameBase jinternalFrame =this.estadocomisionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionCate=(TitledBorder)this.jScrollPanelDatosComisionCate.getBorder();
				TitledBorder titledBorderestadocomision=(TitledBorder)this.estadocomisionBeanSwingJInternalFrame.jScrollPanelDatosEstadoComision.getBorder();

				titledBorderestadocomision.setTitle(titledBorderComisionCate.getTitle() + " -> Estado Comision");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_comisionComisionCateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionCate(this.getcomisioncate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisioncate==null) {
						this.comisioncate = new ComisionCate();
					}

					this.setVariablesFormularioToObjetoActualComisionCate(this.comisioncate,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
				}

				if(this.comisioncate.getid_estado_comision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_comision = "+this.comisioncate.getid_estado_comision().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionCate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeComisionCateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionCate(this.getcomisioncate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisioncate==null) {
						this.comisioncate = new ComisionCate();
					}

					this.setVariablesFormularioToObjetoActualComisionCate(this.comisioncate,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
				}

				if(this.comisioncate.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.comisioncate.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionCate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionComisionCateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionCate(this.getcomisioncate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisioncate==null) {
						this.comisioncate = new ComisionCate();
					}

					this.setVariablesFormularioToObjetoActualComisionCate(this.comisioncate,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);
				}

				if(this.comisioncate.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.comisioncate.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionCate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdComisionConfigComisionCateActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionCate(false,false);

			this.getComisionCatesFK_IdComisionConfig();

			this.inicializarActualizarBindingComisionCate(false);

			//if(ComisionCateBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionCate(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaComisionCateActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionCate(false,false);

			this.getComisionCatesFK_IdEmpresa();

			this.inicializarActualizarBindingComisionCate(false);

			//if(ComisionCateBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionCate(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoComisionComisionCateActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionCate(false,false);

			this.getComisionCatesFK_IdEstadoComision();

			this.inicializarActualizarBindingComisionCate(false);

			//if(ComisionCateBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionCate(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaComisionCateActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionCate(false,false);

			this.getComisionCatesFK_IdLinea();

			this.inicializarActualizarBindingComisionCate(false);

			//if(ComisionCateBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionCate(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaComisionCateActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionCate(false,false);

			this.getComisionCatesFK_IdLineaCategoria();

			this.inicializarActualizarBindingComisionCate(false);

			//if(ComisionCateBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionCate(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoComisionCateActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionCate(false,false);

			this.getComisionCatesFK_IdLineaGrupo();

			this.inicializarActualizarBindingComisionCate(false);

			//if(ComisionCateBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionCate(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVendedorComisionCateActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionCate(false,false);

			this.getComisionCatesFK_IdVendedor();

			this.inicializarActualizarBindingComisionCate(false);

			//if(ComisionCateBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionCate(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisioncateLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameComisionCate() {
		if(this.jInternalFrameDetalleFormComisionCate!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) {
			this.jInternalFrameDetalleFormComisionCate.setVisible(false);	    			
			this.jInternalFrameDetalleFormComisionCate.dispose();
			this.jInternalFrameDetalleFormComisionCate=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoComisionCate!=null) {
			this.jInternalFrameReporteDinamicoComisionCate.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoComisionCate.dispose();
			this.jInternalFrameReporteDinamicoComisionCate=null;
		}
		
		if(this.jInternalFrameImportacionComisionCate!=null) {
			this.jInternalFrameImportacionComisionCate.setVisible(false);	    			
			this.jInternalFrameImportacionComisionCate.dispose();
			this.jInternalFrameImportacionComisionCate=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessComisionCate();
			
			ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
			
			
			if(sTipo.equals("NuevoComisionCate")) {
				jButtonNuevoComisionCateActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarComisionCate")) {
				jButtonDuplicarComisionCateActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarComisionCate")) {
				jButtonCopiarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("VerFormComisionCate")) {
				jButtonVerFormComisionCateActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarComisionCate")) {
				jButtonNuevoComisionCateActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarComisionCate")) {
				jButtonDuplicarComisionCateActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoComisionCate")) {
				jButtonNuevoComisionCateActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarComisionCate")) {
				jButtonDuplicarComisionCateActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesComisionCate")) {
				jButtonNuevoComisionCateActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarComisionCate")) {
				jButtonNuevoComisionCateActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesComisionCate")) {
				jButtonNuevoComisionCateActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarComisionCate")) {
				jButtonModificarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarComisionCate")) {
				jButtonModificarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarComisionCate")) {
				jButtonModificarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("ActualizarComisionCate")) {
				jButtonActualizarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarComisionCate")) {
				jButtonActualizarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarComisionCate")) {
				jButtonActualizarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("EliminarComisionCate")) {
				jButtonEliminarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarComisionCate")) {
				jButtonEliminarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarComisionCate")) {
				jButtonEliminarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("CancelarComisionCate")) {
				jButtonCancelarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarComisionCate")) {
				jButtonCancelarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarComisionCate")) {
				jButtonCancelarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("CerrarComisionCate")) {
				jButtonCerrarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarComisionCate")) {
				jButtonCerrarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarComisionCate")) {
				jButtonCerrarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarComisionCate")) {
				jButtonMostrarOcultarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarComisionCate")) {
				jButtonCancelarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosComisionCate")) {
				jButtonGuardarCambiosComisionCateActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarComisionCate")) {
				jButtonGuardarCambiosComisionCateActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarComisionCate")) {
				jButtonCopiarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarComisionCate")) {
				jButtonVerFormComisionCateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosComisionCate")) {
				jButtonGuardarCambiosComisionCateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarComisionCate")) {
				jButtonCopiarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormComisionCate")) {
				jButtonVerFormComisionCateActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaComisionCate")) {
				jButtonGuardarCambiosComisionCateActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarComisionCate")) {
				jButtonGuardarCambiosComisionCateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaComisionCate")) {
				jButtonGuardarCambiosComisionCateActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionComisionCate")) {
				jButtonRecargarInformacionComisionCateActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarComisionCate")) {
				jButtonRecargarInformacionComisionCateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionComisionCate")) {
				jButtonRecargarInformacionComisionCateActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresComisionCate")) {
				jButtonAnterioresComisionCateActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarComisionCate")) {
				jButtonAnterioresComisionCateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreComisionCate")) {
				jButtonAnterioresComisionCateActionPerformed(evt);
			} else if(sTipo.equals("SiguientesComisionCate")) {
				jButtonSiguientesComisionCateActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarComisionCate")) {
				jButtonSiguientesComisionCateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesComisionCate")) {
				jButtonSiguientesComisionCateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByComisionCate") || sTipo.equals("MenuItemDetalleAbrirOrderByComisionCate")) {
				jButtonAbrirOrderByComisionCateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarComisionCate") || sTipo.equals("MenuItemDetalleMostrarOcultarComisionCate")) {
				jButtonMostrarOcultarComisionCateActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosComisionCate")) {
				jButtonNuevoGuardarCambiosComisionCateActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarComisionCate")) {
				jButtonNuevoGuardarCambiosComisionCateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosComisionCate")) {
				jButtonNuevoGuardarCambiosComisionCateActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoComisionCate")) {
				jButtonCerrarReporteDinamicoComisionCateActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoComisionCate")) {
				jButtonGenerarReporteDinamicoComisionCateActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoComisionCate")) {
				
				jButtonGenerarExcelReporteDinamicoComisionCateActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionComisionCate")) {
				jButtonCerrarImportacionComisionCateActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionComisionCate")) {
				
				jButtonGenerarImportacionComisionCateActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionComisionCate")) {
				
				jButtonAbrirImportacionComisionCateActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesComisionCate")) {
				jComboBoxTiposAccionesComisionCateActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesComisionCate")) {
				jComboBoxTiposRelacionesComisionCateActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioComisionCate")) {
				jComboBoxTiposAccionesComisionCateActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarComisionCate")) {
				
				jComboBoxTiposSeleccionarComisionCateActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralComisionCate")) {
				jTextFieldValorCampoGeneralComisionCateActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByComisionCate")) {
				jButtonAbrirOrderByComisionCateActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarComisionCate")) {
				jButtonAbrirOrderByComisionCateActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByComisionCate")) {
				jButtonCerrarOrderByComisionCateActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComisionCateBusqueda")) {
				this.jButtonidComisionCateBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComisionCateUpdate")) {
				this.jButtonid_empresaComisionCateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComisionCateBusqueda")) {
				this.jButtonid_empresaComisionCateBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_comision_configComisionCateUpdate")) {
				this.jButtonid_comision_configComisionCateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_comision_configComisionCateBusqueda")) {
				this.jButtonid_comision_configComisionCateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_vendedorComisionCate")) {
				this.jButtonid_vendedorComisionCateActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_vendedorComisionCateArbol")) {
				this.abrirFrameTreeVendedor("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorComisionCateUpdate")) {
				this.jButtonid_vendedorComisionCateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorComisionCateBusqueda")) {
				this.jButtonid_vendedorComisionCateBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaComisionCateUpdate")) {
				this.jButtonid_lineaComisionCateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaComisionCateBusqueda")) {
				this.jButtonid_lineaComisionCateBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoComisionCateUpdate")) {
				this.jButtonid_linea_grupoComisionCateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoComisionCateBusqueda")) {
				this.jButtonid_linea_grupoComisionCateBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaComisionCateUpdate")) {
				this.jButtonid_linea_categoriaComisionCateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaComisionCateBusqueda")) {
				this.jButtonid_linea_categoriaComisionCateBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_comisionComisionCateUpdate")) {
				this.jButtonid_estado_comisionComisionCateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_comisionComisionCateBusqueda")) {
				this.jButtonid_estado_comisionComisionCateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeComisionCateBusqueda")) {
				this.jButtonporcentajeComisionCateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionComisionCateBusqueda")) {
				this.jButtondescripcionComisionCateBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdComisionConfigComisionCate")) {
				this.jButtonFK_IdComisionConfigComisionCateActionPerformed(evt);
			}
			
			;
			
			
			ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessComisionCate();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionCateActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisioncate);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisioncate);
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
				
				


				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionCate.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionCate.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ComisionCate comisioncateLocal=null;
			
			if(!this.getEsControlTabla()) {
				comisioncateLocal=this.comisioncate;
			} else {
				comisioncateLocal=this.comisioncateAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisioncate);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisioncate);
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
							
				
				


				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionCate.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionCate.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionCateActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateAnterior =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisioncateAnterior =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
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
			
			ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
			
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
			
			


			
			ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionCateActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisioncate);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisioncate);
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
								
						
				


				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionCate.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionCate.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisioncate);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisioncate);
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
								
				
				


				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionCate.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionCate.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionCateActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateAnterior =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisioncateAnterior =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisioncate);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisioncate);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionCateActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateAnterior =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisioncateAnterior =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionCateActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisioncate);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisioncate);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisioncate);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisioncate);
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
							
				
				


				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionCate.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionCate.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionCateActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisioncateAnterior =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comisioncateAnterior =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
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
			
			ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
			
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
			
			


			
			ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionCateActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisioncate);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisioncate);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisioncate);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisioncate);
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
								
				
				


				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionCate.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionCate.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionCateActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateAnterior =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisioncateAnterior =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionCateActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisioncate);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisioncate);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionCateActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisioncate);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisioncate);
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosComisionCate")) {
					jCheckBoxSeleccionarTodosComisionCateItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosComisionCate")) {
					jCheckBoxSeleccionadosComisionCateItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarComisionCate")) {
					
				}
				
				


				
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionCate.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionCate.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.comisioncate);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.comisioncate);
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
												
				
				


				
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionCate.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionCate.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionCateActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisioncateAnterior =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comisioncateAnterior =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionCateActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisioncate);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisioncate);
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
				
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
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
			
			ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
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
			
			


			if(sTipo.equals("id_lineaComisionCate")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate;
				}

				if(this.comisioncateSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionCateConstantesFunciones.getClassesRelationshipsOfComisionCate(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLinea(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionCate(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_linea_grupoComisionCate")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate;
				}

				if(this.comisioncateSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionCateConstantesFunciones.getClassesRelationshipsOfComisionCate(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLineaGrupo(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionCate(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			
			ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionCateActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisioncate);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisioncate);
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_lineaComisionCate")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate;
				}

				if(this.comisioncateSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionCateConstantesFunciones.getClassesRelationshipsOfComisionCate(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLinea(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionCate(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_linea_grupoComisionCate")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate;
				}

				if(this.comisioncateSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionCateConstantesFunciones.getClassesRelationshipsOfComisionCate(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLineaGrupo(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionCate(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionCate.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionCate.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisioncate);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisioncate);
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
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
				
				


			if(sTipo.equals("id_lineaComisionCate")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate;
				}

				if(this.comisioncateSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionCateConstantesFunciones.getClassesRelationshipsOfComisionCate(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLinea(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionCate(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_linea_grupoComisionCate")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate;
				}

				if(this.comisioncateSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionCateConstantesFunciones.getClassesRelationshipsOfComisionCate(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLineaGrupo(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionCate(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionCate.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionCate.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionCateActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisioncateAnterior =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisioncateAnterior =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarComisionCate")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosComisionCateListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosComisionCate.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.comisioncate =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.comisioncate =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.comisioncate);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarComisionCate")) {
				
				}
				
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarComisionCate")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosComisionCate.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarComisionCate")) {
			
			}
			
			ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessComisionCate();
			
			ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
			
			if(sTipo.equals("NuevoComisionCate")) {
				jButtonNuevoComisionCateActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarComisionCate")) {
				jButtonDuplicarComisionCateActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarComisionCate")) {
				jButtonCopiarComisionCateActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormComisionCate")) {
				jButtonVerFormComisionCateActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesComisionCate")) {
				jButtonNuevoComisionCateActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarComisionCate")) {
				jButtonModificarComisionCateActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarComisionCate")) {
				jButtonActualizarComisionCateActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarComisionCate")) {
				jButtonEliminarComisionCateActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaComisionCate")) {
				jButtonGuardarCambiosComisionCateActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarComisionCate")) {
				jButtonCancelarComisionCateActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarComisionCate")) {
				jButtonCerrarComisionCateActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosComisionCate")) {
				jButtonGuardarCambiosComisionCateActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosComisionCate")) {
				jButtonNuevoGuardarCambiosComisionCateActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByComisionCate")) {
				jButtonAbrirOrderByComisionCateActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionComisionCate")) {
				jButtonRecargarInformacionComisionCateActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresComisionCate")) {
				jButtonAnterioresComisionCateActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesComisionCate")) {
				jButtonSiguientesComisionCateActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComisionCateBusqueda")) {
				this.jButtonidComisionCateBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComisionCateUpdate")) {
				this.jButtonid_empresaComisionCateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComisionCateBusqueda")) {
				this.jButtonid_empresaComisionCateBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_comision_configComisionCateUpdate")) {
				this.jButtonid_comision_configComisionCateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_comision_configComisionCateBusqueda")) {
				this.jButtonid_comision_configComisionCateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_vendedorComisionCate")) {
				this.jButtonid_vendedorComisionCateActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_vendedorComisionCateArbol")) {
				this.abrirFrameTreeVendedor("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorComisionCateUpdate")) {
				this.jButtonid_vendedorComisionCateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorComisionCateBusqueda")) {
				this.jButtonid_vendedorComisionCateBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaComisionCateUpdate")) {
				this.jButtonid_lineaComisionCateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaComisionCateBusqueda")) {
				this.jButtonid_lineaComisionCateBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoComisionCateUpdate")) {
				this.jButtonid_linea_grupoComisionCateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoComisionCateBusqueda")) {
				this.jButtonid_linea_grupoComisionCateBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaComisionCateUpdate")) {
				this.jButtonid_linea_categoriaComisionCateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaComisionCateBusqueda")) {
				this.jButtonid_linea_categoriaComisionCateBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_comisionComisionCateUpdate")) {
				this.jButtonid_estado_comisionComisionCateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_comisionComisionCateBusqueda")) {
				this.jButtonid_estado_comisionComisionCateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeComisionCateBusqueda")) {
				this.jButtonporcentajeComisionCateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionComisionCateBusqueda")) {
				this.jButtondescripcionComisionCateBusquedaActionPerformed(evt);
			}
			
			ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessComisionCate();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameComisionCate")) {
				closingInternalFrameComisionCate();
				
			} else if(sTipo.equals("jButtonCancelarComisionCate")) {
				JInternalFrameBase jInternalFrameDetalleFormComisionCate = (JInternalFrameBase)evt.getSource();
	            	
	            ComisionCateBeanSwingJInternalFrame jInternalFrameParent=(ComisionCateBeanSwingJInternalFrame)jInternalFrameDetalleFormComisionCate.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarComisionCateActionPerformed(null);
			}
			
			ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comisioncate,new Object(),this.comisioncateParameterGeneral,this.comisioncateReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormComisionCate(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormComisionCate(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormComisionCate(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.comisioncate)) {
			if(!esControlTabla) {
				if(ComisionCateJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualComisionCate(this.comisioncate,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);			
				}
				
				if(this.comisioncateSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualComisionCate(this.comisioncate,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.comisioncateReturnGeneral=comisioncateLogic.procesarEventosComisionCatesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisioncateLogic.getComisionCates(),this.comisioncate,this.comisioncateParameterGeneral,this.isEsNuevoComisionCate,classes);//this.comisioncateLogic.getComisionCate()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanComisionCate(this.comisioncateReturnGeneral,this.comisioncateBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.comisioncateSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanComisionCate(classes,this.comisioncateReturnGeneral,this.comisioncateBean,false);
					}
						
					if(this.comisioncateReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyComisionCate(this.comisioncateReturnGeneral.getComisionCate());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioComisionCate(this.comisioncateReturnGeneral.getComisionCate());	
					}
						
					if(this.comisioncateReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioComisionCate(this.comisioncateReturnGeneral.getComisionCate(),classes);//this.comisioncateBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioComisionCate(this.comisioncate,classes);//this.comisioncateBean);									
				}
			
				if(ComisionCateJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualComisionCate(this.comisioncate,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionCate(this.comisioncate);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.comisioncateAnterior!=null) {
						this.comisioncate=this.comisioncateAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.comisioncateReturnGeneral=comisioncateLogic.procesarEventosComisionCatesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisioncateLogic.getComisionCates(),this.comisioncate,this.comisioncateParameterGeneral,this.isEsNuevoComisionCate,classes);//this.comisioncateLogic.getComisionCate()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comisioncateSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comisioncateSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.comisioncateReturnGeneral.getComisionCate(),comisioncateLogic.getComisionCates());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.comisioncateReturnGeneral.getComisionCate(),this.comisioncates);
				}
				//ARCHITECTURE
				
				//this.jTableDatosComisionCate.repaint();
				
				//((AbstractTableModel) this.jTableDatosComisionCate.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosComisionCate();
			}
		}
	}
	
	public void actualizarVisualTableDatosComisionCate() throws Exception {
		
		ComisionCateModel comisioncateModel=(ComisionCateModel)this.jTableDatosComisionCate.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisioncateModel.comisioncates=this.comisioncateLogic.getComisionCates();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			comisioncateModel.comisioncates=this.comisioncates;
		}
		
		
		((ComisionCateModel) this.jTableDatosComisionCate.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaComisionCate() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcomisioncateAnterior(),this.comisioncateLogic.getComisionCates());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcomisioncateAnterior(),this.comisioncates);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosComisionCate();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioComisionCate(ComisionCate comisioncate,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
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
										
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisioncate,new Object(),generalEntityParameterGeneral,this.comisioncateReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.comisioncateSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ComisionCateConstantesFunciones.getClassesRelationshipsOfComisionCate(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ComisionCateConstantesFunciones.getClassesRelationshipsFromStringsOfComisionCate(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormComisionCate(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ComisionCateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisioncate,new Object(),generalEntityParameterGeneral,this.comisioncateReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioComisionCate(ComisionCateBean comisioncateBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanComisionCate(ArrayList<Classe> classes,ComisionCateReturnGeneral comisioncateReturnGeneral,ComisionCateBean comisioncateBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualComisionCate(ComisionCate comisioncate,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.comisioncate)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormComisionCate = new ComisionCateDetalleFormJInternalFrame(jDesktopPane,this.comisioncateSessionBean.getConGuardarRelaciones(),this.comisioncateSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormComisionCate);
		this.jInternalFrameDetalleFormComisionCate.setVisible(false);
		this.jInternalFrameDetalleFormComisionCate.setSelected(false);						
		
		this.jInternalFrameDetalleFormComisionCate.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormComisionCate.comisioncateLogic=this.comisioncateLogic;
		
		this.cargarCombosFrameForeignKeyComisionCate("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleComisionCate();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComisionCate();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyComisionCate("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyComisionCate();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormComisionCate.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComisionCate"));
		
		this.jInternalFrameDetalleFormComisionCate.jButtonModificarComisionCate.addActionListener(new ButtonActionListener(this,"ModificarComisionCate"));

		
		this.jInternalFrameDetalleFormComisionCate.jButtonModificarToolBarComisionCate.addActionListener(new ButtonActionListener(this,"ModificarToolBarComisionCate"));
					
		this.jInternalFrameDetalleFormComisionCate.jMenuItemModificarComisionCate.addActionListener(new ButtonActionListener(this,"MenuItemModificarComisionCate"));		
		
		
		
		this.jInternalFrameDetalleFormComisionCate.jButtonActualizarComisionCate.addActionListener (new ButtonActionListener(this,"ActualizarComisionCate"));
		
		
		this.jInternalFrameDetalleFormComisionCate.jButtonActualizarToolBarComisionCate.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComisionCate"));
						
		this.jInternalFrameDetalleFormComisionCate.jMenuItemActualizarComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComisionCate"));		
		
		
		
		this.jInternalFrameDetalleFormComisionCate.jButtonEliminarComisionCate.addActionListener (new ButtonActionListener(this,"EliminarComisionCate"));
		
		
		this.jInternalFrameDetalleFormComisionCate.jButtonEliminarToolBarComisionCate.addActionListener (new ButtonActionListener(this,"EliminarToolBarComisionCate"));
								
		this.jInternalFrameDetalleFormComisionCate.jMenuItemEliminarComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComisionCate"));		
		
		
		
		this.jInternalFrameDetalleFormComisionCate.jButtonCancelarComisionCate.addActionListener (new ButtonActionListener(this,"CancelarComisionCate"));
		
		
		this.jInternalFrameDetalleFormComisionCate.jButtonCancelarToolBarComisionCate.addActionListener (new ButtonActionListener(this,"CancelarToolBarComisionCate"));
					
		this.jInternalFrameDetalleFormComisionCate.jMenuItemCancelarComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComisionCate"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormComisionCate.jMenuItemDetalleCerrarComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComisionCate"));		
		
		
		
		this.jInternalFrameDetalleFormComisionCate.jButtonGuardarCambiosToolBarComisionCate.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionCate"));
		
		
		
		this.jInternalFrameDetalleFormComisionCate.jButtonGuardarCambiosToolBarComisionCate.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionCate"));
		
		
		
		this.jInternalFrameDetalleFormComisionCate.jComboBoxTiposAccionesFormularioComisionCate.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComisionCate"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonidComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"idComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_empresaComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_empresaComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_comision_configComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_comision_configComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_comision_configComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_comision_configComisionCateBusqueda"));
		//jButtonid_vendedorComisionCate.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorComisionCateActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormComisionCate.jButtonid_vendedorComisionCate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionCate"));
		//jButtonid_vendedorComisionCateArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormComisionCate.jButtonid_vendedorComisionCateArbol.addActionListener(new ButtonActionListener(this,"id_vendedorComisionCateArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_vendedorComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_vendedorComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_lineaComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_lineaComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_lineaComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_linea_grupoComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_linea_grupoComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_linea_categoriaComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_linea_categoriaComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_estado_comisionComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_estado_comisionComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionCateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonporcentajeComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeComisionCateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtondescripcionComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComisionCateBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormComisionCate.jTabbedPaneRelacionesComisionCate.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComisionCate"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameComisionCate"));
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionCate.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComisionCate"));
		}
		
		this.jTableDatosComisionCate.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarComisionCate"));
		
		this.jTableDatosComisionCate.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarComisionCate"));
		
		this.jButtonNuevoComisionCate.addActionListener(new ButtonActionListener(this,"NuevoComisionCate"));
		
		this.jButtonDuplicarComisionCate.addActionListener(new ButtonActionListener(this,"DuplicarComisionCate"));
		
		this.jButtonCopiarComisionCate.addActionListener(new ButtonActionListener(this,"CopiarComisionCate"));
		
		this.jButtonVerFormComisionCate.addActionListener(new ButtonActionListener(this,"VerFormComisionCate"));
		
		
		this.jButtonNuevoToolBarComisionCate.addActionListener(new ButtonActionListener(this,"NuevoToolBarComisionCate"));
			
		this.jButtonDuplicarToolBarComisionCate.addActionListener(new ButtonActionListener(this,"DuplicarToolBarComisionCate"));
			
		this.jMenuItemNuevoComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemNuevoComisionCate"));
			
		this.jMenuItemDuplicarComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarComisionCate"));		
		
		
		this.jButtonNuevoRelacionesComisionCate.addActionListener (new ButtonActionListener(this,"NuevoRelacionesComisionCate"));
		
		
		this.jButtonNuevoRelacionesToolBarComisionCate.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarComisionCate"));
			
		this.jMenuItemNuevoRelacionesComisionCate.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesComisionCate"));		
		
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionCate.jButtonModificarComisionCate.addActionListener(new ButtonActionListener(this,"ModificarComisionCate"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionCate.jButtonModificarToolBarComisionCate.addActionListener(new ButtonActionListener(this,"ModificarToolBarComisionCate"));
			
			this.jInternalFrameDetalleFormComisionCate.jMenuItemModificarComisionCate.addActionListener(new ButtonActionListener(this,"MenuItemModificarComisionCate"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormComisionCate.jButtonActualizarComisionCate.addActionListener (new ButtonActionListener(this,"ActualizarComisionCate"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionCate.jButtonActualizarToolBarComisionCate.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComisionCate"));
				
			this.jInternalFrameDetalleFormComisionCate.jMenuItemActualizarComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComisionCate"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionCate.jButtonEliminarComisionCate.addActionListener (new ButtonActionListener(this,"EliminarComisionCate"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionCate.jButtonEliminarToolBarComisionCate.addActionListener (new ButtonActionListener(this,"EliminarToolBarComisionCate"));
						
			this.jInternalFrameDetalleFormComisionCate.jMenuItemEliminarComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComisionCate"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionCate.jButtonCancelarComisionCate.addActionListener (new ButtonActionListener(this,"CancelarComisionCate"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionCate.jButtonCancelarToolBarComisionCate.addActionListener (new ButtonActionListener(this,"CancelarToolBarComisionCate"));
			
			this.jInternalFrameDetalleFormComisionCate.jMenuItemCancelarComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComisionCate"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarComisionCate.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarComisionCate"));		
		
		
		this.jButtonCerrarComisionCate.addActionListener (new ButtonActionListener(this,"CerrarComisionCate"));
		
		
		this.jButtonCerrarToolBarComisionCate.addActionListener (new ButtonActionListener(this,"CerrarToolBarComisionCate"));
			
		this.jMenuItemCerrarComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemCerrarComisionCate"));
			
		if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionCate.jMenuItemDetalleCerrarComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComisionCate"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionCate.jButtonGuardarCambiosComisionCate.addActionListener (new ButtonActionListener(this,"GuardarCambiosComisionCate"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionCate.jButtonGuardarCambiosToolBarComisionCate.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionCate"));
		}
		
		this.jButtonCopiarToolBarComisionCate.addActionListener (new ButtonActionListener(this,"CopiarToolBarComisionCate"));
			
		this.jButtonVerFormToolBarComisionCate.addActionListener (new ButtonActionListener(this,"VerFormToolBarComisionCate"));
		
		this.jMenuItemGuardarCambiosComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosComisionCate"));
			
		this.jMenuItemCopiarComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemCopiarComisionCate"));		
		
		this.jMenuItemVerFormComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemVerFormComisionCate"));		
		
		
		this.jButtonGuardarCambiosTablaComisionCate.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComisionCate"));
		
		
		this.jButtonGuardarCambiosTablaToolBarComisionCate.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarComisionCate"));
			
		this.jMenuItemGuardarCambiosTablaComisionCate.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComisionCate"));		
		
		
		
		this.jButtonRecargarInformacionComisionCate.addActionListener (new ButtonActionListener(this,"RecargarInformacionComisionCate"));
					
		this.jButtonRecargarInformacionToolBarComisionCate.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarComisionCate"));
		
		this.jMenuItemRecargarInformacionComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionComisionCate"));		
		
		
		
		this.jButtonAnterioresComisionCate.addActionListener (new ButtonActionListener(this,"AnterioresComisionCate"));
		
		
		this.jButtonAnterioresToolBarComisionCate.addActionListener (new ButtonActionListener(this,"AnterioresToolBarComisionCate"));
		
		this.jMenuItemAnterioresComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresComisionCate"));		
		
		
		this.jButtonSiguientesComisionCate.addActionListener (new ButtonActionListener(this,"SiguientesComisionCate"));
		
		
		this.jButtonSiguientesToolBarComisionCate.addActionListener (new ButtonActionListener(this,"SiguientesToolBarComisionCate"));
			
		this.jMenuItemSiguientesComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesComisionCate"));
			
		this.jMenuItemAbrirOrderByComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByComisionCate"));
			
		this.jMenuItemMostrarOcultarComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarComisionCate"));
			
		this.jMenuItemDetalleAbrirOrderByComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByComisionCate"));
			
		this.jMenuItemDetalleMostarOcultarComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarComisionCate"));		
		
		
		this.jButtonNuevoGuardarCambiosComisionCate.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosComisionCate"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarComisionCate.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarComisionCate"));
			
		this.jMenuItemNuevoGuardarCambiosComisionCate.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosComisionCate"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosComisionCate.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosComisionCate"));

		this.jCheckBoxSeleccionadosComisionCate.addItemListener(new CheckBoxItemListener(this,"SeleccionadosComisionCate"));
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionCate.jComboBoxTiposAccionesFormularioComisionCate.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComisionCate"));
		}
		
		
		this.jComboBoxTiposRelacionesComisionCate.addActionListener (new ButtonActionListener(this,"TiposRelacionesComisionCate"));
			
		this.jComboBoxTiposAccionesComisionCate.addActionListener (new ButtonActionListener(this,"TiposAccionesComisionCate"));
					
		this.jComboBoxTiposSeleccionarComisionCate.addActionListener (new ButtonActionListener(this,"TiposSeleccionarComisionCate"));
			
		this.jTextFieldValorCampoGeneralComisionCate.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralComisionCate"));		
		
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonidComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"idComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_empresaComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_empresaComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_comision_configComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_comision_configComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_comision_configComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_comision_configComisionCateBusqueda"));
		//jButtonid_vendedorComisionCate.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorComisionCateActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormComisionCate.jButtonid_vendedorComisionCate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionCate"));
		//jButtonid_vendedorComisionCateArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormComisionCate.jButtonid_vendedorComisionCateArbol.addActionListener(new ButtonActionListener(this,"id_vendedorComisionCateArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_vendedorComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_vendedorComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_lineaComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_lineaComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_lineaComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_linea_grupoComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_linea_grupoComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_linea_categoriaComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_linea_categoriaComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_estado_comisionComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_estado_comisionComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionCateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonporcentajeComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeComisionCateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtondescripcionComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComisionCateBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdComisionConfigComisionCate.addActionListener(new ButtonActionListener(this,"FK_IdComisionConfigComisionCate"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoComisionCate!=null) {
				this.jInternalFrameReporteDinamicoComisionCate.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionCate"));
				this.jInternalFrameReporteDinamicoComisionCate.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionCate"));
				this.jInternalFrameReporteDinamicoComisionCate.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionCate"));
			}
			
			//this.jButtonCerrarReporteDinamicoComisionCate.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionCate"));				
			//this.jButtonGenerarReporteDinamicoComisionCate.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionCate"));
			//this.jButtonGenerarExcelReporteDinamicoComisionCate.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionCate"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionComisionCate!=null) {
				this.jInternalFrameImportacionComisionCate.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComisionCate"));
				this.jInternalFrameImportacionComisionCate.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComisionCate"));
				this.jInternalFrameImportacionComisionCate.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComisionCate"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByComisionCate.addActionListener (new ButtonActionListener(this,"AbrirOrderByComisionCate"));
			
			this.jButtonAbrirOrderByToolBarComisionCate.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarComisionCate"));			
			
			if(this.jInternalFrameOrderByComisionCate!=null) {
				this.jInternalFrameOrderByComisionCate.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComisionCate"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormComisionCate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionCate.jTabbedPaneRelacionesComisionCate.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComisionCate"));
		
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
            		closingInternalFrameComisionCate();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormComisionCate.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormComisionCate = (JInternalFrameBase)event.getSource();
	            	
	            ComisionCateBeanSwingJInternalFrame jInternalFrameParent=(ComisionCateBeanSwingJInternalFrame)jInternalFrameDetalleFormComisionCate.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarComisionCateActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosComisionCate.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosComisionCateListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosComisionCate.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosComisionCate.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionCateActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionCateActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionCateActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoComisionCate";
		inputMap = this.jButtonNuevoComisionCate.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoComisionCate.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComisionCateActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionCateActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionCateActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionCateActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesComisionCate";
		inputMap = this.jButtonNuevoRelacionesComisionCate.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesComisionCate.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComisionCateActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarComisionCate";
		inputMap = this.jButtonModificarComisionCate.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarComisionCate.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarComisionCateActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarComisionCate";
		inputMap = this.jButtonActualizarComisionCate.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarComisionCate.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarComisionCateActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarComisionCate";
		inputMap = this.jButtonEliminarComisionCate.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarComisionCate.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarComisionCateActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarComisionCate";
		inputMap = this.jButtonCancelarComisionCate.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarComisionCate.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarComisionCateActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarComisionCate";
		inputMap = this.jButtonCerrarComisionCate.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarComisionCate.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarComisionCateActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormComisionCate.jButtonGuardarCambiosComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosComisionCate";
		inputMap = this.jInternalFrameDetalleFormComisionCate.jButtonGuardarCambiosComisionCate.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormComisionCate.jButtonGuardarCambiosComisionCate.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosComisionCateActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosComisionCate.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosComisionCateItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesComisionCate.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesComisionCateActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarComisionCate.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarComisionCateActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralComisionCate.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralComisionCateActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonidComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"idComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_empresaComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_empresaComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_comision_configComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_comision_configComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_comision_configComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_comision_configComisionCateBusqueda"));
		//jButtonid_vendedorComisionCate.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorComisionCateActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormComisionCate.jButtonid_vendedorComisionCate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionCate"));
		//jButtonid_vendedorComisionCateArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormComisionCate.jButtonid_vendedorComisionCateArbol.addActionListener(new ButtonActionListener(this,"id_vendedorComisionCateArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_vendedorComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_vendedorComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_lineaComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_lineaComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_lineaComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_linea_grupoComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_linea_grupoComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_linea_categoriaComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_linea_categoriaComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaComisionCateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionCate.jButtonid_estado_comisionComisionCateUpdate.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionCateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonid_estado_comisionComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionCateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtonporcentajeComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeComisionCateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionCate.jButtondescripcionComisionCateBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComisionCateBusqueda"));
		
		
		this.jButtonFK_IdComisionConfigComisionCate.addActionListener(new ButtonActionListener(this,"FK_IdComisionConfigComisionCate"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionComisionCate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionComisionCateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarComisionCateActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarComisionCate.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosComisionCate(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ComisionCate comisioncateAux:this.comisioncateLogic.getComisionCates()) {
					comisioncateAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionCate comisioncateAux:comisioncates) {
					comisioncateAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosComisionCateItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComisionCate(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComisionCate comisioncateAux:this.comisioncateLogic.getComisionCates()) {
						comisioncateAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionCate comisioncateAux:comisioncates) {
						comisioncateAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ComisionCate comisioncateAux:this.comisioncateLogic.getComisionCates()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionCate comisioncateAux:comisioncates) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaComisionCate(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComisionCate.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComisionCate.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosComisionCateItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComisionCate(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosComisionCate.getSelectedRows();
			
			ComisionCate comisioncateLocal=new ComisionCate();
			
			//this.seleccionarTodosComisionCate(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisioncateLocal =(ComisionCate) this.comisioncateLogic.getComisionCates().toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					comisioncateLocal =(ComisionCate) this.comisioncates.toArray()[this.jTableDatosComisionCate.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				comisioncateLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComisionCate comisioncateAux:this.comisioncateLogic.getComisionCates()) {
						comisioncateAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionCate comisioncateAux:comisioncates) {
						comisioncateAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaComisionCate(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComisionCate.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComisionCate.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComisionCate,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualComisionCateItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarComisionCateParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralComisionCateActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingComisionCate(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralComisionCate.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComisionCate comisioncateAux:this.comisioncateLogic.getComisionCates()) {
				
						if(sTipoSeleccionar.equals(ComisionCateConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							comisioncateAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionCateConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							comisioncateAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionCate comisioncateAux:comisioncates) {
					
						if(sTipoSeleccionar.equals(ComisionCateConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							comisioncateAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionCateConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							comisioncateAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaComisionCate(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesComisionCateActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingComisionCate(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioComisionCate=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesComisionCate.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormComisionCate.jComboBoxTiposAccionesFormularioComisionCate.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteComisionCate) {				
					conSplash=true;//false;										
					
					//this.startProcessComisionCate(conSplash);
				
					this.generarReporteComisionCatesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionCate.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionCate.jComboBoxTiposAccionesFormularioComisionCate.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoComisionCatesSeleccionados();
				//this.jComboBoxTiposAccionesComisionCate.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComisionCatesSeleccionados(false);
				//this.jComboBoxTiposAccionesComisionCate.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComisionCatesSeleccionados(true);
				//this.jComboBoxTiposAccionesComisionCate.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComisionCate();
				
				this.exportarComisionCatesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionCate.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionCate.jComboBoxTiposAccionesFormularioComisionCate.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionComisionCates();
				//this.importarComisionCates();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionCate.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionCate.jComboBoxTiposAccionesFormularioComisionCate.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComisionCate();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelComisionCatesSeleccionados();
				//this.jComboBoxTiposAccionesComisionCate.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Comision Cate", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessComisionCate();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoComisionCate)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyComisionCate(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Comision Cate",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionCate.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionCate.jComboBoxTiposAccionesFormularioComisionCate.setSelectedIndex(0);					
				}	
			} 			
			else if(ComisionCateBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteComisionCate) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessComisionCate(conSplash);
					
						//this.actualizarParametrosGeneralComisionCate();
						
						this.generarReporteProcesoAccionComisionCatesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesComisionCate.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormComisionCate.jComboBoxTiposAccionesFormularioComisionCate.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ComisionCateBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Comision CateS SELECCIONADOS?", "MANTENIMIENTO DE Comision Cate", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessComisionCate();
				
						this.actualizarParametrosGeneralComisionCate();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.comisioncateReturnGeneral=comisioncateLogic.procesarAccionComisionCatesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.comisioncateLogic.getComisionCates(),this.comisioncateParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarComisionCateReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComisionCate.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComisionCate.jComboBoxTiposAccionesFormularioComisionCate.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralComisionCate();
					
					ComisionCateBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarComisionCateReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComisionCate.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComisionCate.jComboBoxTiposAccionesFormularioComisionCate.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessComisionCate(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesComisionCateActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessComisionCate();
			
			if(this.jInternalFrameDetalleFormComisionCate==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ComisionCate> comisioncatesSeleccionados=new ArrayList<ComisionCate>();		
			ComisionCate comisioncate=new ComisionCate();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingComisionCate(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesComisionCate.getSelectedItem();
			
			
			
			
			comisioncatesSeleccionados=this.getComisionCatesSeleccionados(true);
			//this.sTipoAccion;
			
			if(comisioncatesSeleccionados.size()==1) {
				for(ComisionCate comisioncateAux:comisioncatesSeleccionados) {
					comisioncate=comisioncateAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessComisionCate();
			
      		//this.finishProcessComisionCate(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarComisionCateReturnGeneral() throws Exception {
		if(this.comisioncateReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.comisioncateReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.comisioncateReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.comisioncateReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.comisioncateReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.comisioncateReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingComisionCate(false);
		}
		
		if(this.comisioncateReturnGeneral.getConRetornoLista() || this.comisioncateReturnGeneral.getConRetornoObjeto()) {
			if(this.comisioncateReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comisioncateLogic.setComisionCates(this.comisioncateReturnGeneral.getComisionCates());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.comisioncateReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comisioncateLogic.setComisionCate(this.comisioncateReturnGeneral.getComisionCate());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingComisionCate(false);
		}
	}
	
	public void actualizarParametrosGeneralComisionCate() throws Exception {
		
		
	}
	
	public ArrayList<ComisionCate> getComisionCatesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ComisionCate> comisioncatesSeleccionados=new ArrayList<ComisionCate>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioComisionCate) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ComisionCate comisioncateAux:comisioncateLogic.getComisionCates()) {
					if(comisioncateAux.getIsSelected()) {
						comisioncatesSeleccionados.add(comisioncateAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionCate comisioncateAux:this.comisioncates) {
					if(comisioncateAux.getIsSelected()) {
						comisioncatesSeleccionados.add(comisioncateAux);				
					}
				}
			}
			
			if(comisioncatesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						comisioncatesSeleccionados.addAll(this.comisioncateLogic.getComisionCates());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						comisioncatesSeleccionados.addAll(this.comisioncates);				
					}
				}
			}
		} else {
			comisioncatesSeleccionados.add(this.comisioncate);
		}
		
		return comisioncatesSeleccionados;
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
	
	public void generarReporteComisionCatesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalComisionCatesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoComisionCatesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComisionCatesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComisionCatesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Comision Cate",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesComisionCatesSeleccionados() throws Exception {
		ArrayList<ComisionCate> comisioncatesSeleccionados=new ArrayList<ComisionCate>();		
		
		comisioncatesSeleccionados=this.getComisionCatesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteComisionCates("Todos",comisioncatesSeleccionados);
		
	}	
	
	public void generarReporteNormalComisionCatesSeleccionados() throws Exception {
		ArrayList<ComisionCate> comisioncatesSeleccionados=new ArrayList<ComisionCate>();		
		
		comisioncatesSeleccionados=this.getComisionCatesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteComisionCates("Todos",comisioncatesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionComisionCatesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ComisionCate> comisioncatesSeleccionados=new ArrayList<ComisionCate>();
		
		comisioncatesSeleccionados=this.getComisionCatesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteComisionCates("Todos",comisioncatesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoComisionCatesSeleccionados() throws Exception {
		ArrayList<ComisionCate> comisioncatesSeleccionados=new ArrayList<ComisionCate>();		
		
		
		this.abrirInicializarFrameReporteDinamicoComisionCate();
		
		
		comisioncatesSeleccionados=this.getComisionCatesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoComisionCate();
		
		
		//this.generarReporteComisionCates("Todos",comisioncatesSeleccionados ,comisioncateImplementable,comisioncateImplementableHome);
	}
	
	public void mostrarImportacionComisionCates() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionComisionCate();
		
		this.abrirFrameImportacionComisionCate();		
		
			
		//this.generarReporteComisionCates("Todos",comisioncatesSeleccionados ,comisioncateImplementable,comisioncateImplementableHome);
	}
	
	public void importarComisionCates() throws Exception {		
	
	}
	
	public void exportarComisionCatesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelComisionCatesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoComisionCatesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlComisionCatesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Comision Cate",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoComisionCatesSeleccionados() throws Exception {
		ArrayList<ComisionCate> comisioncatesSeleccionados=new ArrayList<ComisionCate>();		
		
		comisioncatesSeleccionados=this.getComisionCatesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisioncate."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarComisionCate(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ComisionCate comisioncateAux:comisioncatesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarComisionCate(comisioncateAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//comisioncateAux.setsDetalleGeneralEntityReporte(comisioncateAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisioncateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Cate",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarComisionCate(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ComisionCateConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionCateConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionCateConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionCateConstantesFunciones.LABEL_IDCOMISIONCONFIG;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionCateConstantesFunciones.LABEL_IDVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionCateConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionCateConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionCateConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionCateConstantesFunciones.LABEL_IDESTADOCOMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionCateConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionCateConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarComisionCate(ComisionCate comisioncate,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=comisioncate.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=comisioncate.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisioncate.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisioncate.getcomisionconfig_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisioncate.getvendedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisioncate.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisioncate.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisioncate.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisioncate.getestadocomision_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisioncate.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisioncate.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelComisionCatesSeleccionados() throws Exception {
		ArrayList<ComisionCate> comisioncatesSeleccionados=new ArrayList<ComisionCate>();		
		
		comisioncatesSeleccionados=this.getComisionCatesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisioncate.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ComisionCates");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelComisionCate(row);				
				iRow++;
			}				
			
			for(ComisionCate comisioncateAux:comisioncatesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelComisionCate(comisioncateAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisioncateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Cate",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlComisionCatesSeleccionados() throws Exception {
		ArrayList<ComisionCate> comisioncatesSeleccionados=new ArrayList<ComisionCate>();		
		
		comisioncatesSeleccionados=this.getComisionCatesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisioncate.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("comisioncates");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("comisioncate");
			//elementRoot.appendChild(element);
		
			for(ComisionCate comisioncateAux:comisioncatesSeleccionados) {
				element = document.createElement("comisioncate");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlComisionCate(comisioncateAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisioncateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Cate",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelComisionCate(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionCateConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionCateConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDCOMISIONCONFIG);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionCateConstantesFunciones.LABEL_IDESTADOCOMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionCateConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionCateConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelComisionCate(ComisionCate comisioncate,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(comisioncate.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(comisioncate.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisioncate.getcomisionconfig_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisioncate.getvendedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisioncate.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisioncate.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisioncate.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisioncate.getestadocomision_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisioncate.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(comisioncate.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlComisionCate(ComisionCate comisioncate,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ComisionCateConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(comisioncate.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ComisionCateConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(comisioncate.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ComisionCateConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(comisioncate.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcomisionconfig_descripcion = document.createElement(ComisionCateConstantesFunciones.IDCOMISIONCONFIG);
		elementcomisionconfig_descripcion.appendChild(document.createTextNode(comisioncate.getcomisionconfig_descripcion()));
		element.appendChild(elementcomisionconfig_descripcion);

		Element elementvendedor_descripcion = document.createElement(ComisionCateConstantesFunciones.IDVENDEDOR);
		elementvendedor_descripcion.appendChild(document.createTextNode(comisioncate.getvendedor_descripcion()));
		element.appendChild(elementvendedor_descripcion);

		Element elementlinea_descripcion = document.createElement(ComisionCateConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(comisioncate.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ComisionCateConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(comisioncate.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ComisionCateConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(comisioncate.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementestadocomision_descripcion = document.createElement(ComisionCateConstantesFunciones.IDESTADOCOMISION);
		elementestadocomision_descripcion.appendChild(document.createTextNode(comisioncate.getestadocomision_descripcion()));
		element.appendChild(elementestadocomision_descripcion);

		Element elementporcentaje = document.createElement(ComisionCateConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(comisioncate.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementdescripcion = document.createElement(ComisionCateConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(comisioncate.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoComisionCatesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ComisionCate> comisioncatesSeleccionados=new ArrayList<ComisionCate>();
		
		comisioncatesSeleccionados=this.getComisionCatesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoComisionCate(comisioncatesSeleccionados);
		
		this.generarReporteComisionCates("Todos",comisioncatesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoComisionCate(ArrayList<ComisionCate> comisioncatesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ComisionCate comisioncateAux:comisioncatesSeleccionados) {
				comisioncateAux.setsDetalleGeneralEntityReporte(comisioncateAux.toString());
			
				if(sTipoSeleccionar.equals(ComisionCateConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					comisioncateAux.setsDescripcionGeneralEntityReporte1(comisioncateAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionCateConstantesFunciones.LABEL_IDCOMISIONCONFIG)) {
					existe=true;
					comisioncateAux.setsDescripcionGeneralEntityReporte1(comisioncateAux.getcomisionconfig_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionCateConstantesFunciones.LABEL_IDVENDEDOR)) {
					existe=true;
					comisioncateAux.setsDescripcionGeneralEntityReporte1(comisioncateAux.getvendedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionCateConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					comisioncateAux.setsDescripcionGeneralEntityReporte1(comisioncateAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionCateConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					comisioncateAux.setsDescripcionGeneralEntityReporte1(comisioncateAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionCateConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					comisioncateAux.setsDescripcionGeneralEntityReporte1(comisioncateAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionCateConstantesFunciones.LABEL_IDESTADOCOMISION)) {
					existe=true;
					comisioncateAux.setsDescripcionGeneralEntityReporte1(comisioncateAux.getestadocomision_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionCateConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					comisioncateAux.setsDescripcionGeneralEntityReporte1(comisioncateAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionCateConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesComisionCate(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoComisionCate=true;
				this.isVisibilidadCeldaNuevoRelacionesComisionCate=true;
				this.isVisibilidadCeldaGuardarCambiosComisionCate=true;
			}
			
			this.isVisibilidadCeldaModificarComisionCate=false;
			this.isVisibilidadCeldaActualizarComisionCate=false;
			this.isVisibilidadCeldaEliminarComisionCate=false;
			this.isVisibilidadCeldaCancelarComisionCate=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionCate=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionCate=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoComisionCate=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionCate=false;
			this.isVisibilidadCeldaGuardarCambiosComisionCate=false;
			this.isVisibilidadCeldaModificarComisionCate=false;
			this.isVisibilidadCeldaActualizarComisionCate=true;
			this.isVisibilidadCeldaEliminarComisionCate=false;
			this.isVisibilidadCeldaCancelarComisionCate=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionCate=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionCate=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoComisionCate=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionCate=false;
			this.isVisibilidadCeldaGuardarCambiosComisionCate=false;
			this.isVisibilidadCeldaModificarComisionCate=false;
			this.isVisibilidadCeldaActualizarComisionCate=true;
			this.isVisibilidadCeldaEliminarComisionCate=true;
			this.isVisibilidadCeldaCancelarComisionCate=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionCate=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionCate=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoComisionCate=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionCate=false;
			this.isVisibilidadCeldaGuardarCambiosComisionCate=false;
			this.isVisibilidadCeldaModificarComisionCate=false;
			this.isVisibilidadCeldaActualizarComisionCate=true;
			this.isVisibilidadCeldaEliminarComisionCate=false;
			this.isVisibilidadCeldaCancelarComisionCate=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionCate=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionCate=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoComisionCate=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionCate=true;
			this.isVisibilidadCeldaGuardarCambiosComisionCate=true;
			this.isVisibilidadCeldaModificarComisionCate=false;
			this.isVisibilidadCeldaActualizarComisionCate=false;
			this.isVisibilidadCeldaEliminarComisionCate=false;
			this.isVisibilidadCeldaCancelarComisionCate=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionCate=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionCate=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoComisionCate=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionCate=false;
			this.isVisibilidadCeldaGuardarCambiosComisionCate=false;
			this.isVisibilidadCeldaActualizarComisionCate=false;
			this.isVisibilidadCeldaEliminarComisionCate=false;
			this.isVisibilidadCeldaCancelarComisionCate=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionCate=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionCate=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoComisionCate=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionCate=false;
			this.isVisibilidadCeldaGuardarCambiosComisionCate=false;
			this.isVisibilidadCeldaModificarComisionCate=true;
			this.isVisibilidadCeldaActualizarComisionCate=false;
			this.isVisibilidadCeldaEliminarComisionCate=false;
			this.isVisibilidadCeldaCancelarComisionCate=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionCate=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionCate=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ComisionCateJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoComisionCate=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionCate=true;
			this.isVisibilidadCeldaGuardarCambiosComisionCate=true;
		} else {
			this.actualizarEstadoPanelsComisionCate(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarComisionCate=false;
			//this.isVisibilidadCeldaVerFormComisionCate=false;
			this.isVisibilidadCeldaDuplicarComisionCate=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!comisioncateSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesComisionCate=false;
		} else {
			this.isVisibilidadCeldaNuevoComisionCate=false;
			this.isVisibilidadCeldaGuardarCambiosComisionCate=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(comisioncateSessionBean.getEsGuardarRelacionado()) {
			if(!comisioncateSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesComisionCate=false;												
			}
			
			this.jButtonCerrarComisionCate.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesComisionCate=false;
		}
		
		if(!this.permiteMantenimiento(this.comisioncate)) {
			this.isVisibilidadCeldaActualizarComisionCate=false;
			this.isVisibilidadCeldaEliminarComisionCate=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesComisionCate() {
	}
	
	public void actualizarEstadoPanelsComisionCate(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionComisionCate!=null) {
				this.jScrollPanelDatosEdicionComisionCate.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionCate!=null) {
				this.jTabbedPaneBusquedasComisionCate.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionCate!=null) {
				this.jScrollPanelDatosComisionCate.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionCate!=null) {
				this.jPanelPaginacionComisionCate.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionCate!=null) {
				this.jPanelParametrosReportesComisionCate.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionComisionCate!=null) {
				this.jScrollPanelDatosEdicionComisionCate.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionCate!=null) {
				this.jTabbedPaneBusquedasComisionCate.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosComisionCate!=null) {
				this.jScrollPanelDatosComisionCate.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionCate!=null) {
				this.jPanelPaginacionComisionCate.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionCate!=null) {
				this.jPanelParametrosReportesComisionCate.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionComisionCate!=null) {
				this.jScrollPanelDatosEdicionComisionCate.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionCate!=null) {
				this.jTabbedPaneBusquedasComisionCate.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComisionCate!=null) {
				this.jScrollPanelDatosComisionCate.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionCate!=null) {
				this.jPanelPaginacionComisionCate.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionCate!=null) {
				this.jPanelParametrosReportesComisionCate.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionComisionCate!=null) {
				this.jScrollPanelDatosEdicionComisionCate.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionCate!=null) {
				this.jTabbedPaneBusquedasComisionCate.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComisionCate!=null) {
				this.jScrollPanelDatosComisionCate.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionCate!=null) {
				this.jPanelPaginacionComisionCate.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionCate!=null) {
				this.jPanelParametrosReportesComisionCate.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionComisionCate!=null) {
				this.jScrollPanelDatosEdicionComisionCate.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionCate!=null) {
				this.jTabbedPaneBusquedasComisionCate.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionCate!=null) {
				this.jScrollPanelDatosComisionCate.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionCate!=null) {
				this.jPanelPaginacionComisionCate.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionCate!=null) {
				this.jPanelParametrosReportesComisionCate.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionComisionCate!=null) {
				this.jScrollPanelDatosEdicionComisionCate.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionCate!=null) {
				this.jTabbedPaneBusquedasComisionCate.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionCate!=null) {
				this.jScrollPanelDatosComisionCate.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionCate!=null) {
				this.jPanelPaginacionComisionCate.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionCate!=null) {
				this.jPanelParametrosReportesComisionCate.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionComisionCate!=null) {
				this.jScrollPanelDatosEdicionComisionCate.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionCate!=null) {
				this.jTabbedPaneBusquedasComisionCate.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionCate!=null) {
				this.jScrollPanelDatosComisionCate.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionCate!=null) {
				this.jPanelPaginacionComisionCate.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionCate!=null) {
				this.jPanelParametrosReportesComisionCate.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.comisioncateSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasComisionCate!=null) {
					this.jTabbedPaneBusquedasComisionCate.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesComisionCate!=null) {
				this.jPanelParametrosReportesComisionCate.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.comisioncateSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionCate!=null) {
				this.jTabbedPaneBusquedasComisionCate.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesComisionCate!=null) {
				this.jPanelParametrosReportesComisionCate.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdComisionConfig=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionCate.remove(jPanelFK_IdComisionConfigComisionCate);}
		}
		
	}

	public void setVisibilidadBusquedasParaComisionConfig(Boolean isParaComisionConfig){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaComisionConfigNegation=!isParaComisionConfig;

			this.isVisibilidadFK_IdComisionConfig=isParaComisionConfig;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionCate.remove(jPanelFK_IdComisionConfigComisionCate);}
		}
		
	}

	public void setVisibilidadBusquedasParaVendedor(Boolean isParaVendedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVendedorNegation=!isParaVendedor;

			this.isVisibilidadFK_IdComisionConfig=isParaVendedorNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionCate.remove(jPanelFK_IdComisionConfigComisionCate);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadFK_IdComisionConfig=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionCate.remove(jPanelFK_IdComisionConfigComisionCate);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadFK_IdComisionConfig=isParaLineaGrupoNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionCate.remove(jPanelFK_IdComisionConfigComisionCate);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadFK_IdComisionConfig=isParaLineaCategoriaNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionCate.remove(jPanelFK_IdComisionConfigComisionCate);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoComision(Boolean isParaEstadoComision){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoComisionNegation=!isParaEstadoComision;

			this.isVisibilidadFK_IdComisionConfig=isParaEstadoComisionNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionCate.remove(jPanelFK_IdComisionConfigComisionCate);}
		}
		
	}
	
	
	
	

	public String registrarSesionComisionCateParaBusquedaVendedores() throws Exception {
		Boolean isPaginaPopupVendedor=false;

		try {

			if(comisioncateSessionBean==null) {
				comisioncateSessionBean=new ComisionCateSessionBean();
			}

			if(vendedorSessionBean==null) {
				vendedorSessionBean=new VendedorSessionBean();
			}

			vendedorSessionBean.setsPathNavegacionActual(comisioncateSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+VendedorConstantesFunciones.SCLASSWEBTITULO);
			vendedorSessionBean.setisPermiteRecargarInformacion(false);
			vendedorSessionBean.setisPaginaPopup(true);
			isPaginaPopupVendedor=vendedorSessionBean.getisPaginaPopup();
			vendedorSessionBean.setisPaginaPopup(false);
			vendedorSessionBean.setEstaModoBusqueda(true);
			vendedorSessionBean.setsFuncionBusquedaRapida("window.opener.comisioncateFuncionGeneral.setCombosCodigoDesdeBusquedaid_vendedor(TO_REPLACE);");
			vendedorSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeVendedor(true);
			vendedorSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeVendedor(ComisionCateConstantesFunciones.SNOMBREOPCION);
			//vendedorSessionBean.setisBusquedaDesdeForeignKeySesionComisionCate(true);
			//vendedorSessionBean.setlidComisionCateActual(this.idComisionCateActual);

			comisioncateSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyComisionCate(true);
			comisioncateSessionBean.setlIdComisionCateActualForeignKey(this.idComisionCateActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ComisionCateSessionBean comisioncateSessionBean=new ComisionCateSessionBean();
		
		if(this.comisioncateSessionBean==null) {
			this.comisioncateSessionBean=new ComisionCateSessionBean();
		}
		
		this.comisioncateSessionBean.setsUltimaBusquedaComisionCate(this.getsAccionBusqueda());
		this.comisioncateSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.comisioncateSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdComisionConfig")) {
			comisioncateSessionBean.setid_comision_config(this.getid_comision_configFK_IdComisionConfig());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			comisioncateSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ComisionCateSessionBean comisioncateSessionBean=new ComisionCateSessionBean();
		
		if(this.comisioncateSessionBean==null) {
			this.comisioncateSessionBean=new ComisionCateSessionBean();
		}
		
		if(this.comisioncateSessionBean.getsUltimaBusquedaComisionCate()!=null&&!this.comisioncateSessionBean.getsUltimaBusquedaComisionCate().equals("")) {
			this.setsAccionBusqueda(comisioncateSessionBean.getsUltimaBusquedaComisionCate());
			this.setiNumeroPaginacion(comisioncateSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(comisioncateSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdComisionConfig")) {
				this.setid_comision_configFK_IdComisionConfig(comisioncateSessionBean.getid_comision_config());
				comisioncateSessionBean.setid_comision_config(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(comisioncateSessionBean.getid_empresa());
				comisioncateSessionBean.setid_empresa(-1L);
			}
		}
		
		this.comisioncateSessionBean.setsUltimaBusquedaComisionCate("");
		this.comisioncateSessionBean.setiNumeroPaginacion(ComisionCateConstantesFunciones.INUMEROPAGINACION);
		this.comisioncateSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaComisionCate(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioComisionCate() {
		this.updateBorderResaltarBusquedasFormularioComisionCate();
		this.updateVisibilidadBusquedasFormularioComisionCate();
		this.updateHabilitarBusquedasFormularioComisionCate();
	}
	
	public void updateBorderResaltarBusquedasFormularioComisionCate() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasComisionCate.getComponents().length>0) {
	

		if(this.comisioncateConstantesFunciones.resaltarFK_IdComisionConfigComisionCate!=null) {
			index= this.jTabbedPaneBusquedasComisionCate.indexOfComponent(this.jPanelFK_IdComisionConfigComisionCate);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComisionCate.getComponent(index);
				jPanel.setBorder(this.comisioncateConstantesFunciones.resaltarFK_IdComisionConfigComisionCate);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioComisionCate() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasComisionCate.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComisionCate.indexOfComponent(this.jPanelFK_IdComisionConfigComisionCate);
			jPanel=(JPanel)this.jTabbedPaneBusquedasComisionCate.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.comisioncateConstantesFunciones.mostrarFK_IdComisionConfigComisionCate);
			if(!this.comisioncateConstantesFunciones.mostrarFK_IdComisionConfigComisionCate && index>-1) {
				this.jTabbedPaneBusquedasComisionCate.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioComisionCate() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasComisionCate.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComisionCate.indexOfComponent(this.jPanelFK_IdComisionConfigComisionCate);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasComisionCate.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.comisioncateConstantesFunciones.activarFK_IdComisionConfigComisionCate);
				this.jTabbedPaneBusquedasComisionCate.setEnabledAt(index,this.comisioncateConstantesFunciones.activarFK_IdComisionConfigComisionCate);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaComisionCate(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdComisionConfig")) {
			index= this.jTabbedPaneBusquedasComisionCate.indexOfComponent(this.jPanelFK_IdComisionConfigComisionCate);

			this.jTabbedPaneBusquedasComisionCate.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComisionCate.getComponent(index);

			this.comisioncateConstantesFunciones.setResaltarFK_IdComisionConfigComisionCate(resaltar);

			jPanel.setBorder(this.comisioncateConstantesFunciones.resaltarFK_IdComisionConfigComisionCate);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarComisionCate.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioComisionCate() throws Exception {

		if(this.jInternalFrameDetalleFormComisionCate==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioComisionCate();
		this.updateVisibilidadResaltarControlesFormularioComisionCate();
		this.updateHabilitarResaltarControlesFormularioComisionCate();
		
	}
	
	public void updateBorderResaltarControlesFormularioComisionCate() throws Exception {
		if(this.jInternalFrameDetalleFormComisionCate==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.comisioncateConstantesFunciones.resaltaridComisionCate!=null && this.jInternalFrameDetalleFormComisionCate!=null) {this.jInternalFrameDetalleFormComisionCate.jLabelidComisionCate.setBorder(this.comisioncateConstantesFunciones.resaltaridComisionCate);}
		if(this.comisioncateConstantesFunciones.resaltarid_empresaComisionCate!=null && this.jInternalFrameDetalleFormComisionCate!=null) {this.jInternalFrameDetalleFormComisionCate.jComboBoxid_empresaComisionCate.setBorder(this.comisioncateConstantesFunciones.resaltarid_empresaComisionCate);}
		if(this.comisioncateConstantesFunciones.resaltarid_comision_configComisionCate!=null && this.jInternalFrameDetalleFormComisionCate!=null) {this.jInternalFrameDetalleFormComisionCate.jComboBoxid_comision_configComisionCate.setBorder(this.comisioncateConstantesFunciones.resaltarid_comision_configComisionCate);}
		if(this.comisioncateConstantesFunciones.resaltarid_vendedorComisionCate!=null && this.jInternalFrameDetalleFormComisionCate!=null) {this.jInternalFrameDetalleFormComisionCate.jComboBoxid_vendedorComisionCate.setBorder(this.comisioncateConstantesFunciones.resaltarid_vendedorComisionCate);}
		if(this.comisioncateConstantesFunciones.resaltarid_lineaComisionCate!=null && this.jInternalFrameDetalleFormComisionCate!=null) {this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.setBorder(this.comisioncateConstantesFunciones.resaltarid_lineaComisionCate);}
		if(this.comisioncateConstantesFunciones.resaltarid_linea_grupoComisionCate!=null && this.jInternalFrameDetalleFormComisionCate!=null) {this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.setBorder(this.comisioncateConstantesFunciones.resaltarid_linea_grupoComisionCate);}
		if(this.comisioncateConstantesFunciones.resaltarid_linea_categoriaComisionCate!=null && this.jInternalFrameDetalleFormComisionCate!=null) {this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_categoriaComisionCate.setBorder(this.comisioncateConstantesFunciones.resaltarid_linea_categoriaComisionCate);}
		if(this.comisioncateConstantesFunciones.resaltarid_estado_comisionComisionCate!=null && this.jInternalFrameDetalleFormComisionCate!=null) {this.jInternalFrameDetalleFormComisionCate.jComboBoxid_estado_comisionComisionCate.setBorder(this.comisioncateConstantesFunciones.resaltarid_estado_comisionComisionCate);}
		if(this.comisioncateConstantesFunciones.resaltarporcentajeComisionCate!=null && this.jInternalFrameDetalleFormComisionCate!=null) {this.jInternalFrameDetalleFormComisionCate.jTextFieldporcentajeComisionCate.setBorder(this.comisioncateConstantesFunciones.resaltarporcentajeComisionCate);}
		if(this.comisioncateConstantesFunciones.resaltardescripcionComisionCate!=null && this.jInternalFrameDetalleFormComisionCate!=null) {this.jInternalFrameDetalleFormComisionCate.jTextAreadescripcionComisionCate.setBorder(this.comisioncateConstantesFunciones.resaltardescripcionComisionCate);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioComisionCate() throws Exception {		
		if(this.jInternalFrameDetalleFormComisionCate==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) {
	
		//this.jInternalFrameDetalleFormComisionCate.jLabelidComisionCate.setVisible(this.comisioncateConstantesFunciones.mostraridComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jPanelidComisionCate.setVisible(this.comisioncateConstantesFunciones.mostraridComisionCate);
		//this.jInternalFrameDetalleFormComisionCate.jComboBoxid_empresaComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrarid_empresaComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jPanelid_empresaComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrarid_empresaComisionCate);
		//this.jInternalFrameDetalleFormComisionCate.jComboBoxid_comision_configComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrarid_comision_configComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jPanelid_comision_configComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrarid_comision_configComisionCate);
		//this.jInternalFrameDetalleFormComisionCate.jComboBoxid_vendedorComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrarid_vendedorComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jPanelid_vendedorComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrarid_vendedorComisionCate);
			this.jInternalFrameDetalleFormComisionCate.jButtonid_vendedorComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrarid_vendedorComisionCate);
		//this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrarid_lineaComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jPanelid_lineaComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrarid_lineaComisionCate);
		//this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrarid_linea_grupoComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jPanelid_linea_grupoComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrarid_linea_grupoComisionCate);
		//this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_categoriaComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrarid_linea_categoriaComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jPanelid_linea_categoriaComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrarid_linea_categoriaComisionCate);
		//this.jInternalFrameDetalleFormComisionCate.jComboBoxid_estado_comisionComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrarid_estado_comisionComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jPanelid_estado_comisionComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrarid_estado_comisionComisionCate);
		//this.jInternalFrameDetalleFormComisionCate.jTextFieldporcentajeComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrarporcentajeComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jPanelporcentajeComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrarporcentajeComisionCate);
		//this.jInternalFrameDetalleFormComisionCate.jTextAreadescripcionComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrardescripcionComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jPaneldescripcionComisionCate.setVisible(this.comisioncateConstantesFunciones.mostrardescripcionComisionCate);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioComisionCate() throws Exception {
		if(this.jInternalFrameDetalleFormComisionCate==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComisionCate!=null) {
	
		this.jInternalFrameDetalleFormComisionCate.jLabelidComisionCate.setEnabled(this.comisioncateConstantesFunciones.activaridComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jComboBoxid_empresaComisionCate.setEnabled(this.comisioncateConstantesFunciones.activarid_empresaComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jComboBoxid_comision_configComisionCate.setEnabled(this.comisioncateConstantesFunciones.activarid_comision_configComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jComboBoxid_vendedorComisionCate.setEnabled(this.comisioncateConstantesFunciones.activarid_vendedorComisionCate);
			this.jInternalFrameDetalleFormComisionCate.jButtonid_vendedorComisionCate.setEnabled(this.comisioncateConstantesFunciones.activarid_vendedorComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jComboBoxid_lineaComisionCate.setEnabled(this.comisioncateConstantesFunciones.activarid_lineaComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_grupoComisionCate.setEnabled(this.comisioncateConstantesFunciones.activarid_linea_grupoComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jComboBoxid_linea_categoriaComisionCate.setEnabled(this.comisioncateConstantesFunciones.activarid_linea_categoriaComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jComboBoxid_estado_comisionComisionCate.setEnabled(this.comisioncateConstantesFunciones.activarid_estado_comisionComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jTextFieldporcentajeComisionCate.setEnabled(this.comisioncateConstantesFunciones.activarporcentajeComisionCate);
		this.jInternalFrameDetalleFormComisionCate.jTextAreadescripcionComisionCate.setEnabled(this.comisioncateConstantesFunciones.activardescripcionComisionCate);
		}
	}
	
		
}