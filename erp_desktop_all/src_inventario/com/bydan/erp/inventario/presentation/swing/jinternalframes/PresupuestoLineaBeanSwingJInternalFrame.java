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

import com.bydan.erp.inventario.util.PresupuestoLineaConstantesFunciones;
import com.bydan.erp.inventario.util.PresupuestoLineaParameterReturnGeneral;
//import com.bydan.erp.inventario.util.PresupuestoLineaParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.PresupuestoLineaBean;
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

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PresupuestoLineaBeanSwingJInternalFrame extends PresupuestoLineaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PresupuestoLineaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PresupuestoLinea> presupuestolineaValidator = new ClassValidator<PresupuestoLinea>(PresupuestoLinea.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PresupuestoLinea presupuestolinea;	
	public PresupuestoLinea presupuestolineaAux;
	public PresupuestoLinea presupuestolineaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PresupuestoLinea presupuestolineaTotales;
	public Long idPresupuestoLineaActual;
	public Long iIdNuevoPresupuestoLinea=0L;
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
	
	public Boolean isPermisoTodoPresupuestoLinea;
	public Boolean isPermisoNuevoPresupuestoLinea;
	public Boolean isPermisoActualizarPresupuestoLinea;
	public Boolean isPermisoActualizarOriginalPresupuestoLinea;
	public Boolean isPermisoEliminarPresupuestoLinea;
	public Boolean isPermisoGuardarCambiosPresupuestoLinea;
	public Boolean isPermisoConsultaPresupuestoLinea;
	public Boolean isPermisoBusquedaPresupuestoLinea;
	public Boolean isPermisoReportePresupuestoLinea;
	public Boolean isPermisoPaginacionMedioPresupuestoLinea;
	public Boolean isPermisoPaginacionAltoPresupuestoLinea;
	public Boolean isPermisoPaginacionTodoPresupuestoLinea;
	public Boolean isPermisoCopiarPresupuestoLinea;
	public Boolean isPermisoVerFormPresupuestoLinea;
	public Boolean isPermisoDuplicarPresupuestoLinea;
	public Boolean isPermisoOrdenPresupuestoLinea;
	
	
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
	
	public PresupuestoLineaParameterReturnGeneral presupuestolineaReturnGeneral;
	public PresupuestoLineaParameterReturnGeneral presupuestolineaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPresupuestoLinea=false;
	public Boolean esParaAccionDesdeFormularioPresupuestoLinea=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PresupuestoLineaSessionBeanAdditional presupuestolineaSessionBeanAdditional=null;
	
	public PresupuestoLineaSessionBeanAdditional getPresupuestoLineaSessionBeanAdditional() {
		return this.presupuestolineaSessionBeanAdditional;
	}
	
	public void setPresupuestoLineaSessionBeanAdditional(PresupuestoLineaSessionBeanAdditional presupuestolineaSessionBeanAdditional) {
		try {
			this.presupuestolineaSessionBeanAdditional=presupuestolineaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PresupuestoLineaBeanSwingJInternalFrameAdditional presupuestolineaBeanSwingJInternalFrameAdditional=null;
	//public class PresupuestoLineaBeanSwingJInternalFrame
	
	public PresupuestoLineaBeanSwingJInternalFrameAdditional getPresupuestoLineaBeanSwingJInternalFrameAdditional() {
		return this.presupuestolineaBeanSwingJInternalFrameAdditional;
	}
	
	public void setPresupuestoLineaBeanSwingJInternalFrameAdditional(PresupuestoLineaBeanSwingJInternalFrameAdditional presupuestolineaBeanSwingJInternalFrameAdditional) {
		try {
			this.presupuestolineaBeanSwingJInternalFrameAdditional=presupuestolineaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PresupuestoLineaLogic presupuestolineaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PresupuestoLinea presupuestolineaBean;
	public PresupuestoLineaConstantesFunciones presupuestolineaConstantesFunciones;
	//public PresupuestoLineaParameterReturnGeneral presupuestolineaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public LineaLogic lineaLogic;
	
	//PARAMETROS
	
	
	//public List<PresupuestoLinea> presupuestolineas;	
	//public List<PresupuestoLinea> presupuestolineasEliminados;
	//public List<PresupuestoLinea> presupuestolineasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPresupuestoLinea=false;
	public Boolean isVisibilidadCeldaDuplicarPresupuestoLinea=true;
	public Boolean isVisibilidadCeldaCopiarPresupuestoLinea=true;
	public Boolean isVisibilidadCeldaVerFormPresupuestoLinea=true;
	public Boolean isVisibilidadCeldaOrdenPresupuestoLinea=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPresupuestoLinea=false;
	public Boolean isVisibilidadCeldaModificarPresupuestoLinea=false;
	public Boolean isVisibilidadCeldaActualizarPresupuestoLinea=false;
	public Boolean isVisibilidadCeldaEliminarPresupuestoLinea=false;
	public Boolean isVisibilidadCeldaCancelarPresupuestoLinea=false;
	public Boolean isVisibilidadCeldaGuardarPresupuestoLinea=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPresupuestoLinea=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	
	public Long getiIdNuevoPresupuestoLinea() {
		return this.iIdNuevoPresupuestoLinea;
	}

	public void setiIdNuevoPresupuestoLinea(Long iIdNuevoPresupuestoLinea) {
		this.iIdNuevoPresupuestoLinea = iIdNuevoPresupuestoLinea;
	}
	
	public Long getidPresupuestoLineaActual() {
		return this.idPresupuestoLineaActual;
	}

	public void setidPresupuestoLineaActual(Long idPresupuestoLineaActual) {
		this.idPresupuestoLineaActual = idPresupuestoLineaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PresupuestoLinea getpresupuestolinea() {
		return this.presupuestolinea;
	}

	public void setpresupuestolinea(PresupuestoLinea presupuestolinea) {
		this.presupuestolinea = presupuestolinea;
	}
	
	public PresupuestoLinea getpresupuestolineaAux() {
		return this.presupuestolineaAux;
	}

	public void setpresupuestolineaAux(PresupuestoLinea presupuestolineaAux) {
		this.presupuestolineaAux = presupuestolineaAux;
	}				
	
	public PresupuestoLinea getpresupuestolineaAnterior() {
		return this.presupuestolineaAnterior;
	}

	public void setpresupuestolineaAnterior(PresupuestoLinea presupuestolineaAnterior) {
		this.presupuestolineaAnterior = presupuestolineaAnterior;
	}	
	
	public PresupuestoLinea getpresupuestolineaTotales() {
		return this.presupuestolineaTotales;
	}

	public void setpresupuestolineaTotales(PresupuestoLinea presupuestolineaTotales) {
		this.presupuestolineaTotales = presupuestolineaTotales;
	}	
	
	public PresupuestoLinea getpresupuestolineaBean() {
		return this.presupuestolineaBean;
	}

	public void setpresupuestolineaBean(PresupuestoLinea presupuestolineaBean) {
		this.presupuestolineaBean = presupuestolineaBean;
	}	
	
	public PresupuestoLineaParameterReturnGeneral getpresupuestolineaReturnGeneral() {
		return this.presupuestolineaReturnGeneral;
	}

	public void setpresupuestolineaReturnGeneral(PresupuestoLineaParameterReturnGeneral presupuestolineaReturnGeneral) {
		this.presupuestolineaReturnGeneral = presupuestolineaReturnGeneral;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PresupuestoLineaLogic getPresupuestoLineaLogic()	{		
		return presupuestolineaLogic;
	}

	public void setPresupuestoLineaLogic(PresupuestoLineaLogic presupuestolineaLogic) {
		this.presupuestolineaLogic = presupuestolineaLogic;
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
	
	public Boolean getIsEsNuevoPresupuestoLinea() {
		return isEsNuevoPresupuestoLinea;
	}

	public void setIsEsNuevoPresupuestoLinea(Boolean isEsNuevoPresupuestoLinea) {
		this.isEsNuevoPresupuestoLinea = isEsNuevoPresupuestoLinea;
	}

	public Boolean getEsParaAccionDesdeFormularioPresupuestoLinea() {
		return esParaAccionDesdeFormularioPresupuestoLinea;
	}
	
	public void setEsParaAccionDesdeFormularioPresupuestoLinea(Boolean esParaAccionDesdeFormularioPresupuestoLinea) {
		this.esParaAccionDesdeFormularioPresupuestoLinea = esParaAccionDesdeFormularioPresupuestoLinea;
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

			if(this.presupuestolineaSessionBean==null) {
				this.presupuestolineaSessionBean=new PresupuestoLineaSessionBean();
			}

			if(!this.presupuestolineaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(presupuestolineaSessionBean.getlidEmpresaActual());
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

			if(this.presupuestolineaSessionBean==null) {
				this.presupuestolineaSessionBean=new PresupuestoLineaSessionBean();
			}

			if(!this.presupuestolineaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(presupuestolineaSessionBean.getlidLineaActual());
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

					if(this.presupuestolinea!=null) {
						this.presupuestolinea.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
						this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_empresaPresupuestoLinea.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPresupuestoLinea.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_empresaPresupuestoLinea.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_empresaPresupuestoLinea.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPresupuestoLineaGenerico)throws Exception
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
				jComboBoxid_empresaPresupuestoLineaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPresupuestoLineaGenerico!=null && jComboBoxid_empresaPresupuestoLineaGenerico.getItemCount()>0) {
					jComboBoxid_empresaPresupuestoLineaGenerico.setSelectedIndex(0);
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

					if(this.presupuestolinea!=null) {
						this.presupuestolinea.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
						this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_lineaPresupuestoLinea.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaPresupuestoLinea.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_lineaPresupuestoLinea.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_lineaPresupuestoLinea.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdLinea") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaFK_IdLineaPresupuestoLinea!=null) {
						jComboBoxid_lineaFK_IdLineaPresupuestoLinea.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaFK_IdLineaPresupuestoLinea!=null) {
							//jComboBoxid_lineaFK_IdLineaPresupuestoLinea.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaFK_IdLineaPresupuestoLinea.getItemCount()>0) {
								jComboBoxid_lineaFK_IdLineaPresupuestoLinea.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaPresupuestoLineaGenerico)throws Exception
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
				jComboBoxid_lineaPresupuestoLineaGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaPresupuestoLineaGenerico!=null && jComboBoxid_lineaPresupuestoLineaGenerico.getItemCount()>0) {
					jComboBoxid_lineaPresupuestoLineaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PresupuestoLinea presupuestolinea,JComboBox jComboBoxid_empresaPresupuestoLineaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPresupuestoLineaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_empresaPresupuestoLinea.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPresupuestoLineaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				presupuestolinea.setid_empresa(empresaAux.getId());
				presupuestolinea.setempresa_descripcion(PresupuestoLineaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				presupuestolinea.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(PresupuestoLinea presupuestolinea,JComboBox jComboBoxid_lineaPresupuestoLineaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaPresupuestoLineaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_lineaPresupuestoLinea.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaPresupuestoLineaGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				presupuestolinea.setid_linea(lineaAux.getId());
				presupuestolinea.setlinea_descripcion(PresupuestoLineaConstantesFunciones.getLineaDescripcion(lineaAux));
				presupuestolinea.setLinea(lineaAux);			}
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

					if(!PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { 
							this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_empresaPresupuestoLinea.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_empresaPresupuestoLinea.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { 
					}

					if(!PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { 
							this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_lineaPresupuestoLinea.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_lineaPresupuestoLinea.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { 
					}

					if(!PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdLinea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaFK_IdLineaPresupuestoLinea.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaFK_IdLineaPresupuestoLinea.addItem(linea);
							}
						}

						if(!PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
							this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_empresaPresupuestoLinea.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
							this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_empresaPresupuestoLinea.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
							this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_lineaPresupuestoLinea.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
							this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_lineaPresupuestoLinea.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaFK_IdLineaPresupuestoLinea.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaFK_IdLineaPresupuestoLinea.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPresupuestoLinea() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PresupuestoLineaConstantesFunciones.refrescarForeignKeysDescripcionesPresupuestoLinea(this.presupuestolineaLogic.getPresupuestoLineas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PresupuestoLineaConstantesFunciones.refrescarForeignKeysDescripcionesPresupuestoLinea(this.presupuestolineas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Linea.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//presupuestolineaLogic.setPresupuestoLineas(this.presupuestolineas);
			presupuestolineaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PresupuestoLineaParameterReturnGeneral getPresupuestoLineaParameterGeneral() {
		return this.presupuestolineaParameterGeneral;
	}
	
	public void setPresupuestoLineaParameterGeneral(PresupuestoLineaParameterReturnGeneral presupuestolineaParameterGeneral) {
		this.presupuestolineaParameterGeneral = presupuestolineaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPresupuestoLinea() {
		return isPermisoTodoPresupuestoLinea;
	}

	public void setIsPermisoTodoPresupuestoLinea(Boolean isPermisoTodoPresupuestoLinea) {
		this.isPermisoTodoPresupuestoLinea = isPermisoTodoPresupuestoLinea;
	}

	public Boolean getIsPermisoNuevoPresupuestoLinea() {
		return isPermisoNuevoPresupuestoLinea;
	}

	public void setIsPermisoNuevoPresupuestoLinea(Boolean isPermisoNuevoPresupuestoLinea) {
		this.isPermisoNuevoPresupuestoLinea = isPermisoNuevoPresupuestoLinea;
	}

	public Boolean getIsPermisoActualizarPresupuestoLinea() {
		return isPermisoActualizarPresupuestoLinea;
	}

	public void setIsPermisoActualizarPresupuestoLinea(Boolean isPermisoActualizarPresupuestoLinea) {
		this.isPermisoActualizarPresupuestoLinea = isPermisoActualizarPresupuestoLinea;
	}

	public Boolean getIsPermisoEliminarPresupuestoLinea() {
		return isPermisoEliminarPresupuestoLinea;
	}

	public void setIsPermisoEliminarPresupuestoLinea(Boolean isPermisoEliminarPresupuestoLinea) {
		this.isPermisoEliminarPresupuestoLinea = isPermisoEliminarPresupuestoLinea;
	}

	public Boolean getIsPermisoGuardarCambiosPresupuestoLinea() {
		return isPermisoGuardarCambiosPresupuestoLinea;
	}

	public void setIsPermisoGuardarCambiosPresupuestoLinea(Boolean isPermisoGuardarCambiosPresupuestoLinea) {
		this.isPermisoGuardarCambiosPresupuestoLinea = isPermisoGuardarCambiosPresupuestoLinea;
	}
	
	public Boolean getIsPermisoConsultaPresupuestoLinea() {
		return isPermisoConsultaPresupuestoLinea;
	}

	public void setIsPermisoConsultaPresupuestoLinea(Boolean isPermisoConsultaPresupuestoLinea) {
		this.isPermisoConsultaPresupuestoLinea = isPermisoConsultaPresupuestoLinea;
	}

	public Boolean getIsPermisoBusquedaPresupuestoLinea() {
		return isPermisoBusquedaPresupuestoLinea;
	}

	public void setIsPermisoBusquedaPresupuestoLinea(Boolean isPermisoBusquedaPresupuestoLinea) {
		this.isPermisoBusquedaPresupuestoLinea = isPermisoBusquedaPresupuestoLinea;
	}

	public Boolean getIsPermisoReportePresupuestoLinea() {
		return isPermisoReportePresupuestoLinea;
	}

	public void setIsPermisoReportePresupuestoLinea(Boolean isPermisoReportePresupuestoLinea) {
		this.isPermisoReportePresupuestoLinea = isPermisoReportePresupuestoLinea;
	}
	
	public Boolean getIsPermisoPaginacionMedioPresupuestoLinea() {
		return isPermisoPaginacionMedioPresupuestoLinea;
	}

	public void setIsPermisoPaginacionMedioPresupuestoLinea(Boolean isPermisoPaginacionMedioPresupuestoLinea) {
		this.isPermisoPaginacionMedioPresupuestoLinea = isPermisoPaginacionMedioPresupuestoLinea;
	}
	
	public Boolean getIsPermisoPaginacionTodoPresupuestoLinea() {
		return isPermisoPaginacionTodoPresupuestoLinea;
	}

	public void setIsPermisoPaginacionTodoPresupuestoLinea(Boolean isPermisoPaginacionTodoPresupuestoLinea) {
		this.isPermisoPaginacionTodoPresupuestoLinea = isPermisoPaginacionTodoPresupuestoLinea;
	}
	
	public Boolean getIsPermisoPaginacionAltoPresupuestoLinea() {
		return isPermisoPaginacionAltoPresupuestoLinea;
	}

	public void setIsPermisoPaginacionAltoPresupuestoLinea(Boolean isPermisoPaginacionAltoPresupuestoLinea) {
		this.isPermisoPaginacionAltoPresupuestoLinea = isPermisoPaginacionAltoPresupuestoLinea;
	}
	
	public Boolean getIsPermisoCopiarPresupuestoLinea() {
		return isPermisoCopiarPresupuestoLinea;
	}

	public void setIsPermisoCopiarPresupuestoLinea(Boolean isPermisoCopiarPresupuestoLinea) {
		this.isPermisoCopiarPresupuestoLinea = isPermisoCopiarPresupuestoLinea;
	}
	
	public Boolean getIsPermisoVerFormPresupuestoLinea() {
		return isPermisoVerFormPresupuestoLinea;
	}

	public void setIsPermisoVerFormPresupuestoLinea(Boolean isPermisoVerFormPresupuestoLinea) {
		this.isPermisoVerFormPresupuestoLinea = isPermisoVerFormPresupuestoLinea;
	}
	
	public Boolean getIsPermisoDuplicarPresupuestoLinea() {
		return isPermisoDuplicarPresupuestoLinea;
	}

	public void setIsPermisoDuplicarPresupuestoLinea(Boolean isPermisoDuplicarPresupuestoLinea) {
		this.isPermisoDuplicarPresupuestoLinea = isPermisoDuplicarPresupuestoLinea;
	}
	
	public Boolean getIsPermisoOrdenPresupuestoLinea() {
		return isPermisoOrdenPresupuestoLinea;
	}

	public void setIsPermisoOrdenPresupuestoLinea(Boolean isPermisoOrdenPresupuestoLinea) {
		this.isPermisoOrdenPresupuestoLinea = isPermisoOrdenPresupuestoLinea;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPresupuestoLinea() {
		return isVisibilidadCeldaNuevoPresupuestoLinea;
	}

	public void setIsVisibilidadCeldaNuevoPresupuestoLinea(Boolean isVisibilidadCeldaNuevoPresupuestoLinea) {
		this.isVisibilidadCeldaNuevoPresupuestoLinea = isVisibilidadCeldaNuevoPresupuestoLinea;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPresupuestoLinea() {
		return isVisibilidadCeldaDuplicarPresupuestoLinea;
	}

	public void setIsVisibilidadCeldaDuplicarPresupuestoLinea(Boolean isVisibilidadCeldaDuplicarPresupuestoLinea) {
		this.isVisibilidadCeldaDuplicarPresupuestoLinea = isVisibilidadCeldaDuplicarPresupuestoLinea;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPresupuestoLinea() {
		return isVisibilidadCeldaCopiarPresupuestoLinea;
	}

	public void setIsVisibilidadCeldaCopiarPresupuestoLinea(Boolean isVisibilidadCeldaCopiarPresupuestoLinea) {
		this.isVisibilidadCeldaCopiarPresupuestoLinea = isVisibilidadCeldaCopiarPresupuestoLinea;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPresupuestoLinea() {
		return isVisibilidadCeldaVerFormPresupuestoLinea;
	}

	public void setIsVisibilidadCeldaVerFormPresupuestoLinea(Boolean isVisibilidadCeldaVerFormPresupuestoLinea) {
		this.isVisibilidadCeldaVerFormPresupuestoLinea = isVisibilidadCeldaVerFormPresupuestoLinea;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPresupuestoLinea() {
		return isVisibilidadCeldaOrdenPresupuestoLinea;
	}

	public void setIsVisibilidadCeldaOrdenPresupuestoLinea(Boolean isVisibilidadCeldaOrdenPresupuestoLinea) {
		this.isVisibilidadCeldaOrdenPresupuestoLinea = isVisibilidadCeldaOrdenPresupuestoLinea;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPresupuestoLinea() {
		return isVisibilidadCeldaNuevoRelacionesPresupuestoLinea;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPresupuestoLinea(Boolean isVisibilidadCeldaNuevoRelacionesPresupuestoLinea) {
		this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea = isVisibilidadCeldaNuevoRelacionesPresupuestoLinea;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPresupuestoLinea() {
		return isVisibilidadCeldaModificarPresupuestoLinea;
	}

	public void setIsVisibilidadCeldaModificarPresupuestoLinea(Boolean isVisibilidadCeldaModificarPresupuestoLinea) {
		this.isVisibilidadCeldaModificarPresupuestoLinea = isVisibilidadCeldaModificarPresupuestoLinea;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPresupuestoLinea() {
		return isVisibilidadCeldaActualizarPresupuestoLinea;
	}

	public void setIsVisibilidadCeldaActualizarPresupuestoLinea(Boolean isVisibilidadCeldaActualizarPresupuestoLinea) {
		this.isVisibilidadCeldaActualizarPresupuestoLinea = isVisibilidadCeldaActualizarPresupuestoLinea;
	}

	public Boolean getIsVisibilidadCeldaEliminarPresupuestoLinea() {
		return isVisibilidadCeldaEliminarPresupuestoLinea;
	}

	public void setIsVisibilidadCeldaEliminarPresupuestoLinea(Boolean isVisibilidadCeldaEliminarPresupuestoLinea) {
		this.isVisibilidadCeldaEliminarPresupuestoLinea = isVisibilidadCeldaEliminarPresupuestoLinea;
	}

	public Boolean getIsVisibilidadCeldaCancelarPresupuestoLinea() {
		return isVisibilidadCeldaCancelarPresupuestoLinea;
	}

	public void setIsVisibilidadCeldaCancelarPresupuestoLinea(Boolean isVisibilidadCeldaCancelarPresupuestoLinea) {
		this.isVisibilidadCeldaCancelarPresupuestoLinea = isVisibilidadCeldaCancelarPresupuestoLinea;
	}

	public Boolean getIsVisibilidadCeldaGuardarPresupuestoLinea() {
		return isVisibilidadCeldaGuardarPresupuestoLinea;
	}

	public void setIsVisibilidadCeldaGuardarPresupuestoLinea(Boolean isVisibilidadCeldaGuardarPresupuestoLinea) {
		this.isVisibilidadCeldaGuardarPresupuestoLinea = isVisibilidadCeldaGuardarPresupuestoLinea;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPresupuestoLinea() {
		return isVisibilidadCeldaGuardarCambiosPresupuestoLinea;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPresupuestoLinea(Boolean isVisibilidadCeldaGuardarCambiosPresupuestoLinea) {
		this.isVisibilidadCeldaGuardarCambiosPresupuestoLinea = isVisibilidadCeldaGuardarCambiosPresupuestoLinea;
	}
		
	public PresupuestoLineaSessionBean getpresupuestolineaSessionBean() {
		return this.presupuestolineaSessionBean;
	}
	
	public void setpresupuestolineaSessionBean(PresupuestoLineaSessionBean presupuestolineaSessionBean) {
		this.presupuestolineaSessionBean=presupuestolineaSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(PresupuestoLinea presupuestolinea)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(presupuestolinea,null);
				this.setActualParaGuardarLineaForeignKey(presupuestolinea,null);
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
	
	public void bugActualizarReferenciaActual(PresupuestoLinea presupuestolinea,PresupuestoLinea presupuestolineaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPresupuestoLinea(presupuestolinea);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		presupuestolineaAux.setId(presupuestolinea.getId());
		presupuestolineaAux.setVersionRow(presupuestolinea.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPresupuestoLinea();
		
			int intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.presupuestolinea,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = presupuestolineaValidator.getInvalidValues(this.presupuestolinea);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			presupuestolineaLogic.setDatosCliente(datosCliente);
			presupuestolineaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				presupuestolineaAux=new  PresupuestoLinea();
				
				presupuestolineaAux.setIsNew(true);
				presupuestolineaAux.setIsChanged(true);
				
				presupuestolineaAux.setPresupuestoLineaOriginal(this.presupuestolinea);
				
				presupuestolineaAux.setId(this.presupuestolinea.getId());	
				presupuestolineaAux.setVersionRow(this.presupuestolinea.getVersionRow());	
				presupuestolineaAux.setid_empresa(this.presupuestolinea.getid_empresa());	
				presupuestolineaAux.setid_linea(this.presupuestolinea.getid_linea());	
				presupuestolineaAux.setmargen(this.presupuestolinea.getmargen());	
				presupuestolineaAux.setdescuento(this.presupuestolinea.getdescuento());	
				presupuestolineaAux.setes_para_presupuesto(this.presupuestolinea.getes_para_presupuesto());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presupuestolineaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presupuestolineaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(presupuestolineaAux,presupuestolineaLogic.getPresupuestoLineas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestolineaAux,presupuestolineas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.presupuestolineaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presupuestolineaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestolineaLogic.savePresupuestoLineas();//WithConnection
						//presupuestolineaLogic.getSetVersionRowPresupuestoLineas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presupuestolinea,presupuestolineaAux);
					
					this.refrescarForeignKeysDescripcionesPresupuestoLinea();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presupuestolineaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presupuestolineaLogic.savePresupuestoLineaRelaciones(presupuestolineaAux);//WithConnection
								//presupuestolineaLogic.getSetVersionRowPresupuestoLineas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presupuestolinea,presupuestolineaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presupuestolineaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presupuestolineaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presupuestolineaAux,presupuestolineaLogic.getPresupuestoLineas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presupuestolineaAux,presupuestolineas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presupuestolinea,presupuestolineaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				presupuestolineaAux=new  PresupuestoLinea();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado() 
					|| (this.presupuestolineaSessionBean.getEsGuardarRelacionado() && this.presupuestolinea.getId()>=0)) {
						
					presupuestolineaAux.setIsNew(false);
				}
				
				presupuestolineaAux.setIsDeleted(false);
			
				presupuestolineaAux.setId(this.presupuestolinea.getId());	
				presupuestolineaAux.setVersionRow(this.presupuestolinea.getVersionRow());	
				presupuestolineaAux.setid_empresa(this.presupuestolinea.getid_empresa());	
				presupuestolineaAux.setid_linea(this.presupuestolinea.getid_linea());	
				presupuestolineaAux.setmargen(this.presupuestolinea.getmargen());	
				presupuestolineaAux.setdescuento(this.presupuestolinea.getdescuento());	
				presupuestolineaAux.setes_para_presupuesto(this.presupuestolinea.getes_para_presupuesto());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presupuestolineaAux,presupuestolineaLogic.getPresupuestoLineas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestolineaAux,presupuestolineas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.presupuestolineaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presupuestolineaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestolineaLogic.savePresupuestoLineas();//WithConnection
						//presupuestolineaLogic.getSetVersionRowPresupuestoLineas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presupuestolinea,presupuestolineaAux);
					
					this.refrescarForeignKeysDescripcionesPresupuestoLinea();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presupuestolineaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presupuestolineaLogic.savePresupuestoLineaRelaciones(presupuestolineaAux);//WithConnection
								//presupuestolineaLogic.getSetVersionRowPresupuestoLineas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presupuestolinea,presupuestolineaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presupuestolineaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presupuestolineaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presupuestolineaAux,presupuestolineaLogic.getPresupuestoLineas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presupuestolineaAux,presupuestolineas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presupuestolinea,presupuestolineaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				presupuestolineaAux=new  PresupuestoLinea();
				
				presupuestolineaAux.setIsNew(false);
				presupuestolineaAux.setIsChanged(false);
				
				presupuestolineaAux.setIsDeleted(true);
				
				presupuestolineaAux.setId(this.presupuestolinea.getId());	
				presupuestolineaAux.setVersionRow(this.presupuestolinea.getVersionRow());	
				presupuestolineaAux.setid_empresa(this.presupuestolinea.getid_empresa());	
				presupuestolineaAux.setid_linea(this.presupuestolinea.getid_linea());	
				presupuestolineaAux.setmargen(this.presupuestolinea.getmargen());	
				presupuestolineaAux.setdescuento(this.presupuestolinea.getdescuento());	
				presupuestolineaAux.setes_para_presupuesto(this.presupuestolinea.getes_para_presupuesto());	
				
				if(this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.presupuestolineaAux.getId()>=0) {	
						this.presupuestolineasEliminados.add(presupuestolineaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(presupuestolineaAux,presupuestolineaLogic.getPresupuestoLineas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestolineaAux,presupuestolineas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.presupuestolineaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presupuestolineaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestolineaLogic.savePresupuestoLineas();//WithConnection
						//presupuestolineaLogic.getSetVersionRowPresupuestoLineas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presupuestolineaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presupuestolineaLogic.savePresupuestoLineaRelaciones(presupuestolineaAux);//WithConnection
								//presupuestolineaLogic.getSetVersionRowPresupuestoLineas();//WithConnection
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
							if(this.presupuestolineaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.presupuestolineaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(presupuestolineaAux,presupuestolineaLogic.getPresupuestoLineas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(presupuestolineaAux,presupuestolineas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.getPresupuestoLineas().addAll(this.presupuestolineasEliminados);
					
					presupuestolineaLogic.savePresupuestoLineas();//WithConnection
					//presupuestolineaLogic.getSetVersionRowPresupuestoLineas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPresupuestoLinea();
				
				this.presupuestolineasEliminados= new ArrayList<PresupuestoLinea>();		
			}
			
			if(this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Presupuesto Linea GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Presupuesto Linea",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.presupuestolinea=presupuestolineaAux;
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
      		//this.finishProcessPresupuestoLinea();
      	}
		
	}	
	
	public void actualizarRelaciones(PresupuestoLinea presupuestolineaLocal) throws Exception {
		
		if(this.presupuestolineaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PresupuestoLinea presupuestolineaLocal) throws Exception {	
		if(this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				presupuestolineaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				presupuestolineaLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPresupuestoLineaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = presupuestolineaValidator.getInvalidValues(this.presupuestolinea);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PresupuestoLinea presupuestolinea,List<PresupuestoLinea> presupuestolineas) throws Exception {
		try	{		
			PresupuestoLineaConstantesFunciones.actualizarLista(presupuestolinea,presupuestolineas,this.presupuestolineaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PresupuestoLinea presupuestolinea,List<PresupuestoLinea> presupuestolineas) throws Exception {
		try	{			
			PresupuestoLineaConstantesFunciones.actualizarSelectedLista(presupuestolinea,presupuestolineas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PresupuestoLinea> presupuestolineasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				presupuestolineasLocal=this.presupuestolineaLogic.getPresupuestoLineas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				presupuestolineasLocal=this.presupuestolineas;
			}
			//ARCHITECTURE
		
			for(PresupuestoLinea presupuestolineaLocal:presupuestolineasLocal) {
				if(this.permiteMantenimiento(presupuestolineaLocal) && presupuestolineaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PresupuestoLineaConstantesFunciones.getPresupuestoLineaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PresupuestoLineaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoLinea.jLabelid_empresaPresupuestoLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoLineaConstantesFunciones.IDLINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoLinea.jLabelid_lineaPresupuestoLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoLineaConstantesFunciones.MARGEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoLinea.jLabelmargenPresupuestoLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoLineaConstantesFunciones.DESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoLinea.jLabeldescuentoPresupuestoLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoLineaConstantesFunciones.ESPARAPRESUPUESTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoLinea.jLabeles_para_presupuestoPresupuestoLinea,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoLinea.jLabelid_empresaPresupuestoLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoLinea.jLabelid_lineaPresupuestoLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoLinea.jLabelmargenPresupuestoLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoLinea.jLabeldescuentoPresupuestoLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoLinea.jLabeles_para_presupuestoPresupuestoLinea,"");
		
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
		this.iIdNuevoPresupuestoLinea--;	
		
		
		this.presupuestolineaAux=new PresupuestoLinea();
		
		this.presupuestolineaAux.setId(this.iIdNuevoPresupuestoLinea);
		this.presupuestolineaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presupuestolineaLogic.getPresupuestoLineas().add(this.presupuestolineaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.presupuestolineas.add(this.presupuestolineaAux);
		}
		//ARCHITECTURE
		
		this.presupuestolinea=this.presupuestolineaAux;
		
		if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPresupuestoLinea(this.presupuestolinea);
			this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoLinea(this.presupuestolinea);
		}
				
		//this.setDefaultControlesPresupuestoLinea();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPresupuestoLinea();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPresupuestoLinea();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestoLinea();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresupuestoLinea(this.presupuestolineaBean,this.presupuestolinea,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PresupuestoLineaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.presupuestolineaSessionBean.getConGuardarRelaciones()) {
			classes=PresupuestoLineaConstantesFunciones.getClassesRelationshipsOfPresupuestoLinea(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.presupuestolineaReturnGeneral=presupuestolineaLogic.procesarEventosPresupuestoLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presupuestolineaLogic.getPresupuestoLineas(),this.presupuestolinea,this.presupuestolineaParameterGeneral,this.isEsNuevoPresupuestoLinea,classes);//this.presupuestolineaLogic.getPresupuestoLinea()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPresupuestoLinea(this.presupuestolineaReturnGeneral,this.presupuestolineaBean,false);
		
		if(this.presupuestolineaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoLinea(this.presupuestolineaReturnGeneral.getPresupuestoLinea());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPresupuestoLinea(this.presupuestolineaReturnGeneral.getPresupuestoLinea());
		}
		
		if(this.presupuestolineaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPresupuestoLinea(this.presupuestolineaReturnGeneral.getPresupuestoLinea(),classes);//this.presupuestolineaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.presupuestolinea,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPresupuestoLinea();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPresupuestoLinea();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresupuestoLineaBeanSwingJInternalFrameAdditional.RecargarFormPresupuestoLinea(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPresupuestoLinea(false);
						
			if(presupuestolineaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestoLinea();
			}
			
			this.actualizarVisualTableDatosPresupuestoLinea();
			
			this.jTableDatosPresupuestoLinea.setRowSelectionInterval(this.getIndiceNuevoPresupuestoLinea(), this.getIndiceNuevoPresupuestoLinea());
			
			this.seleccionarFilaTablaPresupuestoLineaActual();
						
			this.actualizarEstadoCeldasBotonesPresupuestoLinea("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPresupuestoLinea(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPresupuestoLinea.jTextFieldmargenPresupuestoLinea.setEnabled(isHabilitar && this.presupuestolineaConstantesFunciones.activarmargenPresupuestoLinea);
		this.jInternalFrameDetalleFormPresupuestoLinea.jTextFielddescuentoPresupuestoLinea.setEnabled(isHabilitar && this.presupuestolineaConstantesFunciones.activardescuentoPresupuestoLinea);
		this.jInternalFrameDetalleFormPresupuestoLinea.jCheckBoxes_para_presupuestoPresupuestoLinea.setEnabled(isHabilitar && this.presupuestolineaConstantesFunciones.activares_para_presupuestoPresupuestoLinea);	
		//
		this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_empresaPresupuestoLinea.setEnabled(isHabilitar && this.presupuestolineaConstantesFunciones.activarid_empresaPresupuestoLinea);
		this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_lineaPresupuestoLinea.setEnabled(isHabilitar && this.presupuestolineaConstantesFunciones.activarid_lineaPresupuestoLinea);
	};
	
	public void setDefaultControlesPresupuestoLinea() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPresupuestoLinea(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.presupuestolineaSessionBean.setConGuardarRelaciones(true);			
			this.presupuestolineaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPresupuestoLinea.jTabbedPaneRelacionesPresupuestoLinea.setVisible(true);
			
					
		} else {
			//this.presupuestolineaSessionBean.setConGuardarRelaciones(false);			
			this.presupuestolineaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPresupuestoLinea.jTabbedPaneRelacionesPresupuestoLinea.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPresupuestoLinea() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoLinea presupuestolineaAux:this.presupuestolineaLogic.getPresupuestoLineas()) {
				if(presupuestolineaAux.getId().equals(this.iIdNuevoPresupuestoLinea)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoLinea presupuestolineaAux:this.presupuestolineas) {
				if(presupuestolineaAux.getId().equals(this.iIdNuevoPresupuestoLinea)) {
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
	
	public int getIndiceActualPresupuestoLinea(PresupuestoLinea presupuestolinea,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoLinea presupuestolineaAux:this.presupuestolineaLogic.getPresupuestoLineas()) {
				if(presupuestolineaAux.getId().equals(presupuestolinea.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoLinea presupuestolineaAux:this.presupuestolineas) {
				if(presupuestolineaAux.getId().equals(presupuestolinea.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPresupuestoLinea(PresupuestoLinea presupuestolineaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoLinea presupuestolineaAux:this.presupuestolineaLogic.getPresupuestoLineas()) {
				if(presupuestolineaAux.getPresupuestoLineaOriginal().getId().equals(presupuestolineaOriginal.getId())) {
					existe=true;
					presupuestolineaOriginal.setId(presupuestolineaAux.getId());
					presupuestolineaOriginal.setVersionRow(presupuestolineaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoLinea presupuestolineaAux:this.presupuestolineas) {
				if(presupuestolineaAux.getPresupuestoLineaOriginal().getId().equals(presupuestolineaOriginal.getId())) {
					existe=true;
					presupuestolineaOriginal.setId(presupuestolineaAux.getId());
					presupuestolineaOriginal.setVersionRow(presupuestolineaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPresupuestoLinea(Boolean esParaCancelar) throws Exception {
		presupuestolineasAux=new ArrayList<PresupuestoLinea>();
		presupuestolineaAux=new PresupuestoLinea();
		
		if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresupuestoLinea presupuestolineaAux:this.presupuestolineaLogic.getPresupuestoLineas()) {
					if(presupuestolineaAux.getId()<0) {
						presupuestolineasAux.add(presupuestolineaAux);
					}		
				}
				this.iIdNuevoPresupuestoLinea=0L;
				this.presupuestolineaLogic.getPresupuestoLineas().removeAll(presupuestolineasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoLinea presupuestolineaAux:this.presupuestolineas) {
					if(presupuestolineaAux.getId()<0) {
						presupuestolineasAux.add(presupuestolineaAux);
					}		
				}
				this.iIdNuevoPresupuestoLinea=0L;
				this.presupuestolineas.removeAll(presupuestolineasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPresupuestoLinea 
					&& this.presupuestolineaLogic.getPresupuestoLineas().size()>0
					) {
					presupuestolineaAux=this.presupuestolineaLogic.getPresupuestoLineas().get(this.presupuestolineaLogic.getPresupuestoLineas().size() - 1);
				
					if(presupuestolineaAux.getId()<0) {
						this.presupuestolineaLogic.getPresupuestoLineas().remove(presupuestolineaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPresupuestoLinea && this.presupuestolineas.size()>0) {
					presupuestolineaAux=this.presupuestolineas.get(this.presupuestolineas.size() - 1);
				
					if(presupuestolineaAux.getId()<0) {
						this.presupuestolineas.remove(presupuestolineaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPresupuestoLinea(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(presupuestolinea.getId()<0) {
				this.presupuestolineaLogic.getPresupuestoLineas().remove(this.presupuestolinea);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(presupuestolinea.getId()<0) {
				this.presupuestolineas.remove(this.presupuestolinea);
			}
		}			
	}
	
	public void setEstadosInicialesPresupuestoLinea(List<PresupuestoLinea> presupuestolineasAux) throws Exception {
		PresupuestoLineaConstantesFunciones.setEstadosInicialesPresupuestoLinea(presupuestolineasAux);
	}
	
	public void setEstadosInicialesPresupuestoLinea(PresupuestoLinea presupuestolineaAux) throws Exception {
		PresupuestoLineaConstantesFunciones.setEstadosInicialesPresupuestoLinea(presupuestolineaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPresupuestoLineaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPresupuestoLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPresupuestoLineaActual()) {
				if(!this.isEsNuevoPresupuestoLinea) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPresupuestoLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPresupuestoLinea=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPresupuestoLineaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Presupuesto Linea ?", "MANTENIMIENTO DE Presupuesto Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPresupuestoLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PresupuestoLinea presupuestolinea) throws Exception {
		PresupuestoLineaConstantesFunciones.seleccionarAsignar(this.presupuestolinea,presupuestolinea);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPresupuestoLinea=this.isPermisoActualizarOriginalPresupuestoLinea;
			
			
			this.seleccionarAsignar(presupuestolinea);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresupuestoLineaConstantesFunciones.quitarEspaciosPresupuestoLinea(this.presupuestolinea,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPresupuestoLinea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.presupuestolineaSessionBean.setsFuncionBusquedaRapida(this.presupuestolineaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPresupuestoLinea) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPresupuestoLinea(esParaCancelar);				
				this.cancelarNuevoPresupuestoLinea(esParaCancelar);								
			}
			
			this.presupuestolinea=new PresupuestoLinea();
			
			this.inicializarPresupuestoLinea();
			
			this.actualizarEstadoCeldasBotonesPresupuestoLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPresupuestoLinea() throws Exception {
		try {
			PresupuestoLineaConstantesFunciones.inicializarPresupuestoLinea(this.presupuestolinea);
			
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
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.presupuestolineaLogic.getPresupuestoLineas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePresupuestoLineas(String sAccionBusqueda,List<PresupuestoLinea> presupuestolineasParaReportes) throws Exception {
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
					sPathReporteFinal="PresupuestoLinea"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PresupuestoLineaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PresupuestoLineaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PresupuestoLinea"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Presupuesto Lineaes");		
		parameters.put("busquedapor", PresupuestoLineaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePresupuestoLinea=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PresupuestoLineaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PresupuestoLineaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePresupuestoLinea=new JRBeanArrayDataSource(PresupuestoLineaJInternalFrame.TraerPresupuestoLineaBeans(presupuestolineasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePresupuestoLinea);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PresupuestoLineaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PresupuestoLineaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PresupuestoLineaBean.TraerPresupuestoLineaBeans(presupuestolineasParaReportes).toArray()));
							
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
				this.generarExcelReportePresupuestoLineas(sAccionBusqueda,sTipoArchivoReporte,presupuestolineasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPresupuestoLineas(sAccionBusqueda,sTipoArchivoReporte,presupuestolineasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPresupuestoLineaActionPerformed(null);
					//this.generarExcelReportePresupuestoLineas(sAccionBusqueda,sTipoArchivoReporte,presupuestolineasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPresupuestoLineas(sAccionBusqueda,sTipoArchivoReporte,presupuestolineasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPresupuestoLineas(sAccionBusqueda,sTipoArchivoReporte,presupuestolineasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPresupuestoLineas(sAccionBusqueda,sTipoArchivoReporte,presupuestolineasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePresupuestoLineas(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestoLinea> presupuestolineasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestolinea";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestoLineas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresupuestoLinea("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PresupuestoLinea presupuestolinea : presupuestolineasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PresupuestoLineaConstantesFunciones.generarExcelReporteDataPresupuestoLinea("NORMAL",row,workbook,presupuestolinea,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Linea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPresupuestoLinea(String sTipo,Row row,Workbook workbook) {
		
		PresupuestoLineaConstantesFunciones.generarExcelReporteHeaderPresupuestoLinea(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPresupuestoLineas(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestoLinea> presupuestolineasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestolinea_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestoLineas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PresupuestoLinea presupuestolinea : presupuestolineasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PresupuestoLineaConstantesFunciones.getPresupuestoLineaDescripcion(presupuestolinea));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoLineaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoLineaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestolinea.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoLineaConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoLineaConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestolinea.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoLineaConstantesFunciones.LABEL_MARGEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoLineaConstantesFunciones.LABEL_MARGEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestolinea.getmargen());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoLineaConstantesFunciones.LABEL_DESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoLineaConstantesFunciones.LABEL_DESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestolinea.getdescuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(presupuestolinea.getes_para_presupuesto()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Linea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPresupuestoLineas(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestoLinea> presupuestolineasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PresupuestoLinea> presupuestolineasRespaldo=null;
		
		classes=PresupuestoLineaConstantesFunciones.getClassesRelationshipsOfPresupuestoLinea(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.presupuestolineaLogic.setDatosCliente(this.datosCliente);
		this.presupuestolineaLogic.setDatosDeep(this.datosDeep);
		this.presupuestolineaLogic.setIsConDeep(true);
		
		presupuestolineasRespaldo=this.presupuestolineaLogic.getPresupuestoLineas();
		
		this.presupuestolineaLogic.setPresupuestoLineas(presupuestolineasParaReportes);	
		this.presupuestolineaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		presupuestolineasParaReportes=this.presupuestolineaLogic.getPresupuestoLineas();
		this.presupuestolineaLogic.setPresupuestoLineas(presupuestolineasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestolinea_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestoLineas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresupuestoLinea("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PresupuestoLinea presupuestolinea : presupuestolineasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPresupuestoLinea("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PresupuestoLineaConstantesFunciones.generarExcelReporteDataPresupuestoLinea("NORMAL",row,workbook,presupuestolinea,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PresupuestoLineaConstantesFunciones.getPresupuestoLineaDescripcion(presupuestolinea));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Linea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPresupuestoLinea() throws Exception {		
		this.startProcessPresupuestoLinea(true);
	}
	
	public void startProcessPresupuestoLinea(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPresupuestoLinea ,this.jPanelParametrosReportesPresupuestoLinea, this.jScrollPanelDatosPresupuestoLinea,this.jPanelPaginacionPresupuestoLinea, this.jScrollPanelDatosEdicionPresupuestoLinea, this.jPanelAccionesPresupuestoLinea,this.jPanelAccionesFormularioPresupuestoLinea,this.jmenuBarPresupuestoLinea,this.jmenuBarDetallePresupuestoLinea,this.jTtoolBarPresupuestoLinea,this.jTtoolBarDetallePresupuestoLinea);		
		
		final JTabbedPane jTabbedPaneBusquedasPresupuestoLinea=this.jTabbedPaneBusquedasPresupuestoLinea; 
		
		final JPanel jPanelParametrosReportesPresupuestoLinea=this.jPanelParametrosReportesPresupuestoLinea;
		//final JScrollPane jScrollPanelDatosPresupuestoLinea=this.jScrollPanelDatosPresupuestoLinea;
		final JTable jTableDatosPresupuestoLinea=this.jTableDatosPresupuestoLinea;		
		final JPanel jPanelPaginacionPresupuestoLinea=this.jPanelPaginacionPresupuestoLinea;
		//final JScrollPane jScrollPanelDatosEdicionPresupuestoLinea=this.jScrollPanelDatosEdicionPresupuestoLinea;
		final JPanel jPanelAccionesPresupuestoLinea=this.jPanelAccionesPresupuestoLinea;
		
		JPanel jPanelCamposAuxiliarPresupuestoLinea=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPresupuestoLinea=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
			jPanelCamposAuxiliarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jPanelCamposPresupuestoLinea;
			jPanelAccionesFormularioAuxiliarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jPanelAccionesFormularioPresupuestoLinea;
		}
		
		final JPanel jPanelCamposPresupuestoLinea=jPanelCamposAuxiliarPresupuestoLinea;
		final JPanel jPanelAccionesFormularioPresupuestoLinea=jPanelAccionesFormularioAuxiliarPresupuestoLinea;
		
		
		final JMenuBar jmenuBarPresupuestoLinea=this.jmenuBarPresupuestoLinea;
		final JToolBar jTtoolBarPresupuestoLinea=this.jTtoolBarPresupuestoLinea;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPresupuestoLinea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresupuestoLinea=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
			jmenuBarDetalleAuxiliarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jmenuBarDetallePresupuestoLinea;
			jTtoolBarDetalleAuxiliarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jTtoolBarDetallePresupuestoLinea;
		}
		
		final JMenuBar jmenuBarDetallePresupuestoLinea=jmenuBarDetalleAuxiliarPresupuestoLinea;
		final JToolBar jTtoolBarDetallePresupuestoLinea=jTtoolBarDetalleAuxiliarPresupuestoLinea;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresupuestoLinea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresupuestoLinea;
			processRunnable.jTableDatos=jTableDatosPresupuestoLinea;
			processRunnable.jPanelCampos=jPanelCamposPresupuestoLinea;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresupuestoLinea;
			processRunnable.jPanelAcciones=jPanelAccionesPresupuestoLinea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresupuestoLinea;
			
			
			processRunnable.jmenuBar=jmenuBarPresupuestoLinea;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresupuestoLinea;
			processRunnable.jTtoolBar=jTtoolBarPresupuestoLinea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresupuestoLinea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresupuestoLinea ,jPanelParametrosReportesPresupuestoLinea,jTableDatosPresupuestoLinea, /*jScrollPanelDatosPresupuestoLinea,*/jPanelCamposPresupuestoLinea,jPanelPaginacionPresupuestoLinea, /*jScrollPanelDatosEdicionPresupuestoLinea,*/ jPanelAccionesPresupuestoLinea,jPanelAccionesFormularioPresupuestoLinea,jmenuBarPresupuestoLinea,jmenuBarDetallePresupuestoLinea,jTtoolBarPresupuestoLinea,jTtoolBarDetallePresupuestoLinea);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresupuestoLinea ,jPanelParametrosReportesPresupuestoLinea, jScrollPanelDatosPresupuestoLinea,jPanelPaginacionPresupuestoLinea, jScrollPanelDatosEdicionPresupuestoLinea, jPanelAccionesPresupuestoLinea,jPanelAccionesFormularioPresupuestoLinea,jmenuBarPresupuestoLinea,jmenuBarDetallePresupuestoLinea,jTtoolBarPresupuestoLinea,jTtoolBarDetallePresupuestoLinea);
						
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
	
	public void finishProcessPresupuestoLinea() {// throws Exception 
		this.finishProcessPresupuestoLinea(true);
	}
	
	public void finishProcessPresupuestoLinea(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPresupuestoLinea ,this.jPanelParametrosReportesPresupuestoLinea, this.jScrollPanelDatosPresupuestoLinea,this.jPanelPaginacionPresupuestoLinea, this.jScrollPanelDatosEdicionPresupuestoLinea, this.jPanelAccionesPresupuestoLinea,this.jPanelAccionesFormularioPresupuestoLinea,this.jmenuBarPresupuestoLinea,this.jmenuBarDetallePresupuestoLinea,this.jTtoolBarPresupuestoLinea,this.jTtoolBarDetallePresupuestoLinea);		
		
		final JTabbedPane jTabbedPaneBusquedasPresupuestoLinea=this.jTabbedPaneBusquedasPresupuestoLinea; 
		
		final JPanel jPanelParametrosReportesPresupuestoLinea=this.jPanelParametrosReportesPresupuestoLinea;
		//final JScrollPane jScrollPanelDatosPresupuestoLinea=this.jScrollPanelDatosPresupuestoLinea;
		final JTable jTableDatosPresupuestoLinea=this.jTableDatosPresupuestoLinea;		
		final JPanel jPanelPaginacionPresupuestoLinea=this.jPanelPaginacionPresupuestoLinea;
		//final JScrollPane jScrollPanelDatosEdicionPresupuestoLinea=this.jScrollPanelDatosEdicionPresupuestoLinea;
		final JPanel jPanelAccionesPresupuestoLinea=this.jPanelAccionesPresupuestoLinea;
		
		JPanel jPanelCamposAuxiliarPresupuestoLinea=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPresupuestoLinea=new JPanel();
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
			jPanelCamposAuxiliarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jPanelCamposPresupuestoLinea;
			jPanelAccionesFormularioAuxiliarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jPanelAccionesFormularioPresupuestoLinea;
		}
		
		final JPanel jPanelCamposPresupuestoLinea=jPanelCamposAuxiliarPresupuestoLinea;
		final JPanel jPanelAccionesFormularioPresupuestoLinea=jPanelAccionesFormularioAuxiliarPresupuestoLinea;
		
		
		final JMenuBar jmenuBarPresupuestoLinea=this.jmenuBarPresupuestoLinea;		
		final JToolBar jTtoolBarPresupuestoLinea=this.jTtoolBarPresupuestoLinea;
				
		JMenuBar jmenuBarDetalleAuxiliarPresupuestoLinea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresupuestoLinea=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
			jmenuBarDetalleAuxiliarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jmenuBarDetallePresupuestoLinea;
			jTtoolBarDetalleAuxiliarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jTtoolBarDetallePresupuestoLinea;		
		}
		
		final JMenuBar jmenuBarDetallePresupuestoLinea=jmenuBarDetalleAuxiliarPresupuestoLinea;
		final JToolBar jTtoolBarDetallePresupuestoLinea=jTtoolBarDetalleAuxiliarPresupuestoLinea;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresupuestoLinea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresupuestoLinea;
			processRunnable.jTableDatos=jTableDatosPresupuestoLinea;
			processRunnable.jPanelCampos=jPanelCamposPresupuestoLinea;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresupuestoLinea;
			processRunnable.jPanelAcciones=jPanelAccionesPresupuestoLinea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresupuestoLinea;
			
			
			processRunnable.jmenuBar=jmenuBarPresupuestoLinea;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresupuestoLinea;
			processRunnable.jTtoolBar=jTtoolBarPresupuestoLinea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresupuestoLinea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPresupuestoLinea ,jPanelParametrosReportesPresupuestoLinea, jTableDatosPresupuestoLinea,/*jScrollPanelDatosPresupuestoLinea,*/jPanelCamposPresupuestoLinea,jPanelPaginacionPresupuestoLinea, /*jScrollPanelDatosEdicionPresupuestoLinea,*/ jPanelAccionesPresupuestoLinea,jPanelAccionesFormularioPresupuestoLinea,jmenuBarPresupuestoLinea,jmenuBarDetallePresupuestoLinea,jTtoolBarPresupuestoLinea,jTtoolBarDetallePresupuestoLinea));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPresupuestoLinea(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPresupuestoLinea(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPresupuestoLinea(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPresupuestoLinea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPresupuestoLinea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePresupuestoLinea,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPresupuestoLinea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPresupuestoLinea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePresupuestoLinea,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.presupuestolineaConstantesFunciones.getsFinalQueryPresupuestoLinea();
		String  finalQueryPaginacionTodos=this.presupuestolineaConstantesFunciones.getsFinalQueryPresupuestoLinea();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PresupuestoLineaConstantesFunciones.getArrayColumnasGlobalesNoPresupuestoLinea(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PresupuestoLineaConstantesFunciones.getArrayColumnasGlobalesPresupuestoLinea(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PresupuestoLineaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.presupuestolineasEliminados= new ArrayList<PresupuestoLinea>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPresupuestoLinea();
		
				///*PresupuestoLineaSessionBean*/this.presupuestolineaSessionBean=new PresupuestoLineaSessionBean();
			
			if(this.presupuestolineaSessionBean==null) {
				this.presupuestolineaSessionBean=new PresupuestoLineaSessionBean();
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
					this.iNumeroPaginacion=PresupuestoLineaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PresupuestoLineaConstantesFunciones.getClassesForeignKeysOfPresupuestoLinea(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/presupuestolinea."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			presupuestolineasAux= new ArrayList<PresupuestoLinea>();
			
				
			presupuestolineaLogic.setDatosCliente(this.datosCliente);
			presupuestolineaLogic.setDatosDeep(this.datosDeep);
			presupuestolineaLogic.setIsConDeep(true);
			
			
			presupuestolineaLogic.getPresupuestoLineaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					presupuestolineaLogic.getTodosPresupuestoLineas(finalQueryGlobal,pagination);
					
					//presupuestolineaLogic.getTodosPresupuestoLineasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(presupuestolineaLogic.getPresupuestoLineas()==null|| presupuestolineaLogic.getPresupuestoLineas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presupuestolineasAux= new ArrayList<PresupuestoLinea>();
							presupuestolineasAux.addAll(presupuestolineaLogic.getPresupuestoLineas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestolineasAux= new ArrayList<PresupuestoLinea>();
							presupuestolineasAux.addAll(presupuestolineas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presupuestolineaLogic.getTodosPresupuestoLineas(finalQueryGlobal+"",this.pagination);												
							
							//presupuestolineaLogic.getTodosPresupuestoLineasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePresupuestoLineas("Todos",presupuestolineaLogic.getPresupuestoLineas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presupuestolineaLogic.setPresupuestoLineas(new ArrayList<PresupuestoLinea>());					
							presupuestolineaLogic.getPresupuestoLineas().addAll(presupuestolineasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestolineas=new ArrayList<PresupuestoLinea>();
							presupuestolineas.addAll(presupuestolineasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPresupuestoLinea=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPresupuestoLinea=this.idActual;
				
				} else if(this.idPresupuestoLineaActual!=null && this.idPresupuestoLineaActual!=0L) {
					idPresupuestoLinea=idPresupuestoLineaActual;
				}
				
					
				this.sDetalleReporte=PresupuestoLineaConstantesFunciones.getDetalleIndicePorId(idPresupuestoLinea);
				
				this.presupuestolineas=new ArrayList<PresupuestoLinea>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					presupuestolineaLogic.getEntity(idPresupuestoLinea);
					
					//presupuestolineaLogic.getEntityWithConnection(idPresupuestoLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestolineaLogic.setPresupuestoLineas(new ArrayList<PresupuestoLinea>());
					presupuestolineaLogic.getPresupuestoLineas().add(presupuestolineaLogic.getPresupuestoLinea());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestolineas=new ArrayList<PresupuestoLinea>();
					this.presupuestolineas.add(presupuestolinea);
				}
				
				if(presupuestolineaLogic.getPresupuestoLinea()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PresupuestoLineaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestolineaLogic.getPresupuestoLineasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoLineaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoLineaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestolineaLogic.getPresupuestoLineas()==null||presupuestolineaLogic.getPresupuestoLineas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestolineas==null|| presupuestolineas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestolineasAux=new ArrayList<PresupuestoLinea>();
						presupuestolineasAux.addAll(presupuestolineaLogic.getPresupuestoLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestolineasAux=new ArrayList<PresupuestoLinea>();
							presupuestolineasAux.addAll(presupuestolineas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestolineaLogic.getPresupuestoLineasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoLineaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoLineaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoLineas("FK_IdEmpresa",presupuestolineaLogic.getPresupuestoLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoLineas("FK_IdEmpresa",presupuestolineas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestolineaLogic.setPresupuestoLineas(new ArrayList<PresupuestoLinea>());
						presupuestolineaLogic.getPresupuestoLineas().addAll(presupuestolineasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestolineas=new ArrayList<PresupuestoLinea>();
							presupuestolineas.addAll(presupuestolineasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdLinea")) {
				this.sDetalleReporte=PresupuestoLineaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestolineaLogic.getPresupuestoLineasFK_IdLinea(finalQueryGlobal,pagination,id_lineaFK_IdLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoLineaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoLineaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestolineaLogic.getPresupuestoLineas()==null||presupuestolineaLogic.getPresupuestoLineas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestolineas==null|| presupuestolineas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestolineasAux=new ArrayList<PresupuestoLinea>();
						presupuestolineasAux.addAll(presupuestolineaLogic.getPresupuestoLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestolineasAux=new ArrayList<PresupuestoLinea>();
							presupuestolineasAux.addAll(presupuestolineas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestolineaLogic.getPresupuestoLineasFK_IdLinea(finalQueryGlobal,pagination,id_lineaFK_IdLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoLineaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoLineaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoLineas("FK_IdLinea",presupuestolineaLogic.getPresupuestoLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoLineas("FK_IdLinea",presupuestolineas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestolineaLogic.setPresupuestoLineas(new ArrayList<PresupuestoLinea>());
						presupuestolineaLogic.getPresupuestoLineas().addAll(presupuestolineasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestolineas=new ArrayList<PresupuestoLinea>();
							presupuestolineas.addAll(presupuestolineasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPresupuestoLinea();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPresupuestoLinea();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presupuestolineaLogic.getPresupuestoLineas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestolineas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presupuestolineaLogic.getPresupuestoLineas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestolineas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PresupuestoLinea presupuestolinea) {
		Boolean permite=true;
		
		if(this.presupuestolinea.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PresupuestoLineaConstantesFunciones.getOrderByListaPresupuestoLinea();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PresupuestoLineaConstantesFunciones.getOrderByListaPresupuestoLinea();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoLinea presupuestolinea:presupuestolineaLogic.getPresupuestoLineas()) {
				if(presupuestolinea.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestolineaTotales=presupuestolinea;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoLinea presupuestolinea:this.presupuestolineas) {
				if(presupuestolinea.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestolineaTotales=presupuestolinea;
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
			this.presupuestolineaAux=new PresupuestoLinea();
			this.presupuestolineaAux.setsType(Constantes2.S_TOTALES);
			this.presupuestolineaAux.setIsNew(false);
			this.presupuestolineaAux.setIsChanged(false);
			this.presupuestolineaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PresupuestoLineaConstantesFunciones.TotalizarValoresFilaPresupuestoLinea(this.presupuestolineaLogic.getPresupuestoLineas(),this.presupuestolineaAux);
				
				this.presupuestolineaLogic.getPresupuestoLineas().add(this.presupuestolineaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PresupuestoLineaConstantesFunciones.TotalizarValoresFilaPresupuestoLinea(this.presupuestolineas,this.presupuestolineaAux);
				
				this.presupuestolineas.add(this.presupuestolineaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		presupuestolineaTotales=new PresupuestoLinea();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presupuestolineaLogic.getPresupuestoLineas().remove(presupuestolineaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presupuestolineas.remove(presupuestolineaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		presupuestolineaTotales=new PresupuestoLinea();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoLinea presupuestolinea:presupuestolineaLogic.getPresupuestoLineas()) {
				if(presupuestolinea.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestolineaTotales=presupuestolinea;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresupuestoLineaConstantesFunciones.TotalizarValoresFilaPresupuestoLinea(this.presupuestolineaLogic.getPresupuestoLineas(),presupuestolineaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoLinea presupuestolinea:this.presupuestolineas) {
				if(presupuestolinea.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestolineaTotales=presupuestolinea;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresupuestoLineaConstantesFunciones.TotalizarValoresFilaPresupuestoLinea(this.presupuestolineas,presupuestolineaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPresupuestoLineasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoLineasFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPresupuestoLineasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestolineaLogic.getPresupuestoLineasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoLineasFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestolineaLogic.getPresupuestoLineasFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
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
	
	public void inicializarPermisosPresupuestoLinea() {
		this.isPermisoTodoPresupuestoLinea=false;
		this.isPermisoNuevoPresupuestoLinea=false;
		this.isPermisoActualizarPresupuestoLinea=false;
		this.isPermisoActualizarOriginalPresupuestoLinea=false;
		this.isPermisoEliminarPresupuestoLinea=false;
		this.isPermisoGuardarCambiosPresupuestoLinea=false;
		this.isPermisoConsultaPresupuestoLinea=false;
		this.isPermisoBusquedaPresupuestoLinea=false;
		this.isPermisoReportePresupuestoLinea=false;		
		this.isPermisoOrdenPresupuestoLinea=false;		
		this.isPermisoPaginacionMedioPresupuestoLinea=false;		
		this.isPermisoPaginacionAltoPresupuestoLinea=false;
		this.isPermisoPaginacionTodoPresupuestoLinea=false;
		this.isPermisoCopiarPresupuestoLinea=false;		
		this.isPermisoVerFormPresupuestoLinea=false;		
		this.isPermisoDuplicarPresupuestoLinea=false;		
		this.isPermisoOrdenPresupuestoLinea=false;		
	}
	
	public void setPermisosUsuarioPresupuestoLinea(Boolean isPermiso) {
		this.isPermisoTodoPresupuestoLinea=isPermiso;
		this.isPermisoNuevoPresupuestoLinea=isPermiso;
		this.isPermisoActualizarPresupuestoLinea=isPermiso;
		this.isPermisoActualizarOriginalPresupuestoLinea=isPermiso;
		this.isPermisoEliminarPresupuestoLinea=isPermiso;
		this.isPermisoGuardarCambiosPresupuestoLinea=isPermiso;
		this.isPermisoConsultaPresupuestoLinea=isPermiso;
		this.isPermisoBusquedaPresupuestoLinea=isPermiso;
		this.isPermisoReportePresupuestoLinea=isPermiso;
		this.isPermisoOrdenPresupuestoLinea=isPermiso;		
		this.isPermisoPaginacionMedioPresupuestoLinea=isPermiso;		
		this.isPermisoPaginacionAltoPresupuestoLinea=isPermiso;		
		this.isPermisoPaginacionTodoPresupuestoLinea=isPermiso;		
		this.isPermisoCopiarPresupuestoLinea=isPermiso;		
		this.isPermisoVerFormPresupuestoLinea=isPermiso;		
		this.isPermisoDuplicarPresupuestoLinea=isPermiso;
		this.isPermisoOrdenPresupuestoLinea=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPresupuestoLinea(Boolean isPermiso) {
		//this.isPermisoTodoPresupuestoLinea=isPermiso;
		this.isPermisoNuevoPresupuestoLinea=isPermiso;
		this.isPermisoActualizarPresupuestoLinea=isPermiso;
		this.isPermisoActualizarOriginalPresupuestoLinea=isPermiso;
		this.isPermisoEliminarPresupuestoLinea=isPermiso;
		this.isPermisoGuardarCambiosPresupuestoLinea=isPermiso;
		//this.isPermisoConsultaPresupuestoLinea=isPermiso;
		//this.isPermisoBusquedaPresupuestoLinea=isPermiso;
		//this.isPermisoReportePresupuestoLinea=isPermiso;
		//this.isPermisoOrdenPresupuestoLinea=isPermiso;		
		//this.isPermisoPaginacionMedioPresupuestoLinea=isPermiso;		
		//this.isPermisoPaginacionAltoPresupuestoLinea=isPermiso;		
		//this.isPermisoPaginacionTodoPresupuestoLinea=isPermiso;		
		//this.isPermisoCopiarPresupuestoLinea=isPermiso;		
		//this.isPermisoDuplicarPresupuestoLinea=isPermiso;
		//this.isPermisoOrdenPresupuestoLinea=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPresupuestoLineaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PresupuestoLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPresupuestoLinea(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPresupuestoLineaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPresupuestoLineaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPresupuestoLineaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPresupuestoLineaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPresupuestoLinea() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PresupuestoLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PresupuestoLineaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPresupuestoLinea=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPresupuestoLinea=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPresupuestoLinea=this.isPermisoActualizarPresupuestoLinea;
			this.isPermisoEliminarPresupuestoLinea=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPresupuestoLinea=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPresupuestoLinea=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPresupuestoLinea=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPresupuestoLinea=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePresupuestoLinea=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresupuestoLinea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPresupuestoLinea=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPresupuestoLinea=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPresupuestoLinea=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPresupuestoLinea=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPresupuestoLinea=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPresupuestoLinea=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresupuestoLinea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPresupuestoLinea.setToolTipText(this.jTableDatosPresupuestoLinea.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPresupuestoLinea(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPresupuestoLinea(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PresupuestoLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PresupuestoLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPresupuestoLinea() throws Exception {
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
	public void inicializarCombosForeignKeyPresupuestoLineaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPresupuestoLineaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PresupuestoLineaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPresupuestoLineaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyPresupuestoLineaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PresupuestoLineaParameterReturnGeneral presupuestolineaReturnGeneral=new PresupuestoLineaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.presupuestolineaConstantesFunciones.cargarid_empresaPresupuestoLinea)
					 || (this.esRecargarFks && this.presupuestolineaConstantesFunciones.cargarid_empresaPresupuestoLinea)) {

					if(!this.presupuestolineaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+presupuestolineaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalLinea="";

				if(((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0) && this.presupuestolineaConstantesFunciones.cargarid_lineaPresupuestoLinea)
					 || (this.esRecargarFks && this.presupuestolineaConstantesFunciones.cargarid_lineaPresupuestoLinea)) {

					if(!this.presupuestolineaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLinea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLinea=Funciones.GetFinalQueryAppend(finalQueryGlobalLinea, "");
						finalQueryGlobalLinea+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLinea=" WHERE " + ConstantesSql.ID + "="+presupuestolineaSessionBean.getlidLineaActual();
					}
				} else {
					finalQueryGlobalLinea="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				presupuestolineaReturnGeneral=presupuestolineaLogic.cargarCombosLoteForeignKeyPresupuestoLinea(finalQueryGlobalEmpresa,finalQueryGlobalLinea);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=presupuestolineaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalLinea.equals("NONE")) {
				this.lineasForeignKey=presupuestolineaReturnGeneral.getlineasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPresupuestoLinea()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyLinea();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.presupuestolineaSessionBean==null) {
				this.presupuestolineaSessionBean=new PresupuestoLineaSessionBean();
			}

			if(!this.presupuestolineaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.presupuestolineaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
	
	public void initActionsCombosTodosForeignKeyPresupuestoLinea()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPresupuestoLinea(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPresupuestoLinea()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestoLinea();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPresupuestoLinea(PresupuestoLinea presupuestolinea)throws Exception {	
		try {
			
			this.setActualLineaForeignKey(presupuestolinea.getid_linea(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPresupuestoLinea(PresupuestoLinea presupuestolinea,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPresupuestoLinea()throws Exception {	
		try {
			
			this.setActualLineaForeignKey(this.presupuestolineaConstantesFunciones.getid_linea(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestoLinea()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPresupuestoLinea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPresupuestoLinea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPresupuestoLinea()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPresupuestoLinea()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPresupuestoLinea(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPresupuestoLinea()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_empresaPresupuestoLinea!=null && this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_empresaPresupuestoLinea.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_empresaPresupuestoLinea.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_lineaPresupuestoLinea!=null && this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_lineaPresupuestoLinea.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_lineaPresupuestoLinea.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public PresupuestoLineaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PresupuestoLineaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PresupuestoLineaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.presupuestolineaSessionBean=new PresupuestoLineaSessionBean(); 
		this.presupuestolineaConstantesFunciones=new PresupuestoLineaConstantesFunciones(); 
		this.presupuestolineaBean=new PresupuestoLinea();//(this.presupuestolineaConstantesFunciones); 		
		this.presupuestolineaReturnGeneral=new PresupuestoLineaParameterReturnGeneral(); 
		
		this.presupuestolineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestolineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PresupuestoLineaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PresupuestoLineaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PresupuestoLineaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPresupuestoLinea(true);
			
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
			
			this.presupuestolineaConstantesFunciones=new PresupuestoLineaConstantesFunciones(); 
			this.presupuestolineaBean=new PresupuestoLinea();//this.presupuestolineaConstantesFunciones); 			
			this.presupuestolineaReturnGeneral=new PresupuestoLineaParameterReturnGeneral(); 
		
			PresupuestoLineaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Presupuesto Linea Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.presupuestolinea=new PresupuestoLinea();
			this.presupuestolineas = new ArrayList<PresupuestoLinea>();
			this.presupuestolineasAux = new ArrayList<PresupuestoLinea>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic=new PresupuestoLineaLogic();
				this.presupuestolineaLogic.getNewConnexionToDeep("");
			}
			
			//this.presupuestolineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.presupuestolineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPresupuestoLinea);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPresupuestoLinea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresupuestoLinea);	
					}
					
					if(this.jInternalFrameImportacionPresupuestoLinea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresupuestoLinea);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPresupuestoLinea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPresupuestoLinea);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPresupuestoLinea);
				this.jInternalFrameDetalleFormPresupuestoLinea.setVisible(false);
				this.jInternalFrameDetalleFormPresupuestoLinea.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestoLinea!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresupuestoLinea);
					this.jInternalFrameReporteDinamicoPresupuestoLinea.setVisible(false);
					this.jInternalFrameReporteDinamicoPresupuestoLinea.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPresupuestoLinea!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPresupuestoLinea);
					this.jInternalFrameImportacionPresupuestoLinea.setVisible(false);
					this.jInternalFrameImportacionPresupuestoLinea.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPresupuestoLinea!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPresupuestoLinea);
					this.jInternalFrameOrderByPresupuestoLinea.setVisible(false);
					this.jInternalFrameOrderByPresupuestoLinea.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPresupuestoLineaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PresupuestoLineaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.presupuestolineaReturnGeneral=new PresupuestoLineaParameterReturnGeneral();
			
			this.presupuestolineaParameterGeneral=new PresupuestoLineaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.presupuestolineaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PresupuestoLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresupuestoLineaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presupuestolineaSessionBean.getEsGuardarRelacionado(),this.presupuestolineaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresupuestoLineaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presupuestolineaSessionBean.getEsGuardarRelacionado(),this.presupuestolineaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPresupuestoLinea=false;
			this.isVisibilidadCeldaDuplicarPresupuestoLinea=true;
			this.isVisibilidadCeldaCopiarPresupuestoLinea=true;
			this.isVisibilidadCeldaVerFormPresupuestoLinea=true;
			this.isVisibilidadCeldaOrdenPresupuestoLinea=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea=false;
			this.isVisibilidadCeldaModificarPresupuestoLinea=false;
			this.isVisibilidadCeldaActualizarPresupuestoLinea=false;
			this.isVisibilidadCeldaEliminarPresupuestoLinea=false;
			this.isVisibilidadCeldaCancelarPresupuestoLinea=false;
			this.isVisibilidadCeldaGuardarPresupuestoLinea=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoLinea=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPresupuestoLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPresupuestoLinea();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPresupuestoLinea(false);
			
			this.setPermisosUsuarioPresupuestoLinea();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado() 
				|| (this.presupuestolineaSessionBean.getEsGuardarRelacionado() && this.presupuestolineaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPresupuestoLineaClasesRelacionadas();
			}
			
			if(this.presupuestolineaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPresupuestoLineaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPresupuestoLinea();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPresupuestoLinea();
			}
			
			if(!this.isPermisoBusquedaPresupuestoLinea) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPresupuestoLinea.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPresupuestoLinea,this.isPermisoPaginacionMedioPresupuestoLinea,this.isPermisoPaginacionTodoPresupuestoLinea);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PresupuestoLineaConstantesFunciones.getTiposSeleccionarPresupuestoLinea());
				
				this.tiposColumnasSelect=PresupuestoLineaConstantesFunciones.getTiposSeleccionarPresupuestoLinea(true);
				
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
			//if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPresupuestoLinea();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioPresupuestoLinea(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioPresupuestoLinea(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoLinea() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				presupuestolineaImplementable= (PresupuestoLineaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresupuestoLineaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				presupuestolineaImplementableHome= (PresupuestoLineaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresupuestoLineaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.presupuestolineas= new ArrayList<PresupuestoLinea>();
			this.presupuestolineasEliminados= new ArrayList<PresupuestoLinea>();
						
			this.isEsNuevoPresupuestoLinea=false;
			this.esParaAccionDesdeFormularioPresupuestoLinea=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPresupuestoLinea(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPresupuestoLinea();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PresupuestoLineaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PresupuestoLineaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPresupuestoLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPresupuestoLinea(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPresupuestoLinea();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPresupuestoLinea();
			}
			
			PresupuestoLineaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPresupuestoLinea.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPresupuestoLinea.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPresupuestoLinea.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPresupuestoLinea(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PresupuestoLinea: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPresupuestoLinea() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPresupuestoLinea")) {
				iIndex=this.jInternalFrameDetalleFormPresupuestoLinea.jTabbedPaneRelacionesPresupuestoLinea.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPresupuestoLinea.jTabbedPaneRelacionesPresupuestoLinea.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPresupuestoLinea();	
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
	
	public void cargarCombosForeignKeyPresupuestoLinea(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPresupuestoLinea(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPresupuestoLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPresupuestoLineaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPresupuestoLinea();
		
		this.cargarCombosFrameForeignKeyPresupuestoLinea();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPresupuestoLinea();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPresupuestoLinea();
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
	
	public void jButtonNuevoPresupuestoLineaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.presupuestolineaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPresupuestoLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
			
			
			if(jTableDatosPresupuestoLinea.getRowCount()>=1) {
				jTableDatosPresupuestoLinea.removeRowSelectionInterval(0, jTableDatosPresupuestoLinea.getRowCount()-1);						
			}
			
			this.isEsNuevoPresupuestoLinea=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPresupuestoLinea(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPresupuestoLinea(true);			
			//this.presupuestolinea=new PresupuestoLinea();
			//this.presupuestolinea.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestoLinea(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoLinea() ;
			
			if(PresupuestoLineaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestoLinea(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.presupuestolinea);	
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestolinea);				
			
			PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
			
			if(this.presupuestolineaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PresupuestoLinea: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPresupuestoLineaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PresupuestoLinea> presupuestolineasSeleccionados=new ArrayList<PresupuestoLinea>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPresupuestoLinea.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPresupuestoLinea.getSelectedRows().length;			
			}
			
			presupuestolineasSeleccionados=this.getPresupuestoLineasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPresupuestoLinea--;			
				//PresupuestoLinea presupuestolineaAux= new PresupuestoLinea();			
				//presupuestolineaAux.setId(this.iIdNuevoPresupuestoLinea);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PresupuestoLinea presupuestolineaOrigen=new PresupuestoLinea();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PresupuestoLinea presupuestolineaOrigen : presupuestolineasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							presupuestolineaOrigen =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestolineaOrigen =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPresupuestoLinea();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.presupuestolinea.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPresupuestoLinea(presupuestolineaOrigen,this.presupuestolinea,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presupuestolineaLogic.getPresupuestoLineas().add(this.presupuestolineaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presupuestolineas.add(this.presupuestolineaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPresupuestoLinea(false);
				
				this.jTableDatosPresupuestoLinea.setRowSelectionInterval(this.getIndiceNuevoPresupuestoLinea(), this.getIndiceNuevoPresupuestoLinea());
				
				int iLastRow =  this.jTableDatosPresupuestoLinea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresupuestoLinea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresupuestoLinea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestoLinea(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PresupuestoLinea> presupuestolineasSeleccionados=new ArrayList<PresupuestoLinea>();									
		
			PresupuestoLinea presupuestolineaOrigen=new PresupuestoLinea();
			PresupuestoLinea presupuestolineaDestino=new PresupuestoLinea();
				
			presupuestolineasSeleccionados=this.getPresupuestoLineasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPresupuestoLinea.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || presupuestolineasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPresupuestoLinea.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestolineaOrigen =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presupuestolineaOrigen =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestolineaDestino =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presupuestolineaDestino =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				presupuestolineaOrigen =presupuestolineasSeleccionados.get(0);
				presupuestolineaDestino =presupuestolineasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPresupuestoLinea(presupuestolineaOrigen,presupuestolineaDestino,true,false);
				
				presupuestolineaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presupuestolineaDestino,presupuestolineaLogic.getPresupuestoLineas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestolineaDestino,presupuestolineas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPresupuestoLinea(false);
				
				//this.jTableDatosPresupuestoLinea.setRowSelectionInterval(this.getIndiceNuevoPresupuestoLinea(), this.getIndiceNuevoPresupuestoLinea());
				
				int iLastRow =  this.jTableDatosPresupuestoLinea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresupuestoLinea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresupuestoLinea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestoLinea(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestoLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPresupuestoLinea.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPresupuestoLinea.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPresupuestoLinea.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPresupuestoLinea.setVisible(!isVisible);
			this.jPanelPaginacionPresupuestoLinea.setVisible(!isVisible);
			this.jPanelAccionesPresupuestoLinea.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePresupuestoLinea();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPresupuestoLinea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPresupuestoLinea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPresupuestoLinea();
			
			this.abrirFrameOrderByPresupuestoLinea();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPresupuestoLinea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePresupuestoLinea(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresupuestoLinea);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPresupuestoLinea.isMaximum()) {
					this.jInternalFrameDetalleFormPresupuestoLinea.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPresupuestoLinea.setSize(this.jInternalFrameDetalleFormPresupuestoLinea.iWidthFormulario,this.jInternalFrameDetalleFormPresupuestoLinea.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPresupuestoLinea.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPresupuestoLinea.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPresupuestoLinea.isMaximum()) {
						this.jInternalFrameDetalleFormPresupuestoLinea.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPresupuestoLinea.jContentPaneDetallePresupuestoLinea.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPresupuestoLinea.jTabbedPaneRelacionesPresupuestoLinea.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPresupuestoLinea.jContentPaneDetallePresupuestoLinea.getWidth(),PresupuestoLineaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresupuestoLinea.jTabbedPaneRelacionesPresupuestoLinea.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPresupuestoLinea.jContentPaneDetallePresupuestoLinea.getWidth(),PresupuestoLineaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresupuestoLinea.jTabbedPaneRelacionesPresupuestoLinea.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPresupuestoLinea.jContentPaneDetallePresupuestoLinea.getWidth(),PresupuestoLineaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPresupuestoLinea.setVisible(true);
	        this.jInternalFrameDetalleFormPresupuestoLinea.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPresupuestoLinea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPresupuestoLinea==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPresupuestoLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoLinea,false,this);
				} else {
					this.jInternalFrameOrderByPresupuestoLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoLinea,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPresupuestoLinea);
				this.jInternalFrameOrderByPresupuestoLinea.setVisible(false);
				this.jInternalFrameOrderByPresupuestoLinea.setSelected(false);
				
				this.jInternalFrameOrderByPresupuestoLinea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresupuestoLinea"));
				
				this.inicializarActualizarBindingTablaOrderByPresupuestoLinea();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPresupuestoLinea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPresupuestoLinea==null) {
				
				this.jInternalFrameImportacionPresupuestoLinea=new ImportacionJInternalFrame(PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresupuestoLinea);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPresupuestoLinea);
				this.jInternalFrameImportacionPresupuestoLinea.setVisible(false);
				this.jInternalFrameImportacionPresupuestoLinea.setSelected(false);


				this.jInternalFrameImportacionPresupuestoLinea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresupuestoLinea"));
				this.jInternalFrameImportacionPresupuestoLinea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresupuestoLinea"));
				this.jInternalFrameImportacionPresupuestoLinea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresupuestoLinea"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPresupuestoLinea() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPresupuestoLinea==null) {
				this.jInternalFrameReporteDinamicoPresupuestoLinea=new ReporteDinamicoJInternalFrame(PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresupuestoLinea);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresupuestoLinea);
				this.jInternalFrameReporteDinamicoPresupuestoLinea.setVisible(false);
				this.jInternalFrameReporteDinamicoPresupuestoLinea.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPresupuestoLinea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestoLinea"));
				this.jInternalFrameReporteDinamicoPresupuestoLinea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestoLinea"));
				this.jInternalFrameReporteDinamicoPresupuestoLinea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestoLinea"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestoLinea();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePresupuestoLinea() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresupuestoLinea);
			
	       	this.jInternalFrameDetalleFormPresupuestoLinea.setVisible(false);
	        this.jInternalFrameDetalleFormPresupuestoLinea.setSelected(false);
			
			//this.jInternalFrameDetalleFormPresupuestoLinea.dispose();
			//this.jInternalFrameDetalleFormPresupuestoLinea=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPresupuestoLinea() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPresupuestoLinea.setVisible(true);
	        this.jInternalFrameReporteDinamicoPresupuestoLinea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPresupuestoLinea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPresupuestoLinea.setVisible(true);
	        this.jInternalFrameImportacionPresupuestoLinea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPresupuestoLinea() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPresupuestoLinea.setVisible(true);
	        this.jInternalFrameOrderByPresupuestoLinea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPresupuestoLinea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPresupuestoLinea.setVisible(false);
	        this.jInternalFrameOrderByPresupuestoLinea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPresupuestoLinea() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPresupuestoLinea.setVisible(false);
	        this.jInternalFrameReporteDinamicoPresupuestoLinea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPresupuestoLinea() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPresupuestoLinea.setVisible(false);
	        this.jInternalFrameImportacionPresupuestoLinea.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderPresupuestoLinea=(TitledBorder)this.jScrollPanelDatosPresupuestoLinea.getBorder();
						TitledBorder titledBorderLinea=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLinea.setTitle(titledBorderPresupuestoLinea.getTitle() + " -> Linea");


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
	
	public void jButtonModificarPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPresupuestoLinea(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPresupuestoLinea(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPresupuestoLinea(true);
			//this.isEsNuevoPresupuestoLinea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPresupuestoLinea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestoLinea(false) ;
			
			if(presupuestolineaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PresupuestoLineaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestoLinea(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoLinea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPresupuestoLineaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPresupuestoLinea(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestoLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPresupuestoLinea(true);
			//this.isEsNuevoPresupuestoLinea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.presupuestolinea.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPresupuestoLinea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPresupuestoLinea(false) ;
			
			if(PresupuestoLineaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestoLinea(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoLinea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosPresupuestoLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoLinea,PresupuestoLineaConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresupuestoLinea.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPresupuestoLinea(false);
			
			//if(!this.isEsNuevoPresupuestoLinea) {								
				int intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.presupuestolinea,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);
				
			}
			
			if(this.permiteMantenimiento(this.presupuestolinea)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPresupuestoLinea=true;
					this.inicializarActualizarBindingTablaPresupuestoLinea(false);
					this.isEsNuevoPresupuestoLinea=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPresupuestoLinea=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPresupuestoLinea=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresupuestoLinea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestoLinea(false);
				
				this.habilitarDeshabilitarControlesPresupuestoLinea(false);
			
												
				
				if(PresupuestoLineaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePresupuestoLinea();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPresupuestoLineaActionPerformed(evt,presupuestolineaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPresupuestoLinea(this.presupuestolinea,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPresupuestoLinea.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,presupuestolineaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.presupuestolinea.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PresupuestoLinea.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoLinea.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				this.presupuestolinea.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				this.presupuestolinea.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.presupuestolinea)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PresupuestoLineaModel) this.jTableDatosPresupuestoLinea.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPresupuestoLinea=true;
				this.inicializarActualizarBindingTablaPresupuestoLinea(false);
				this.isEsNuevoPresupuestoLinea=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresupuestoLinea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestoLinea(false);
				
				this.habilitarDeshabilitarControlesPresupuestoLinea(false);
				
				
				
				if(PresupuestoLineaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePresupuestoLinea();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPresupuestoLinea.getRowCount()>=1) {
				jTableDatosPresupuestoLinea.removeRowSelectionInterval(0, jTableDatosPresupuestoLinea.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPresupuestoLinea(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPresupuestoLinea(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestoLinea(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoLinea(false) ;
			
			this.isEsNuevoPresupuestoLinea=false;
			
			if(PresupuestoLineaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePresupuestoLinea();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPresupuestoLinea(false);
				
				//SI ES MANUAL
				if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPresupuestoLinea();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPresupuestoLinea--;			
			//PresupuestoLinea presupuestolineaAux= new PresupuestoLinea();			
			//presupuestolineaAux.setId(this.iIdNuevoPresupuestoLinea);
			
			if(this.jInternalFrameDetalleFormPresupuestoLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPresupuestoLinea();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);
			
			this.presupuestolinea.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.presupuestolineaLogic.getPresupuestoLineas().add(this.presupuestolineaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.presupuestolineas.add(this.presupuestolineaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPresupuestoLinea(false);
			
			this.jTableDatosPresupuestoLinea.setRowSelectionInterval(this.getIndiceNuevoPresupuestoLinea(), this.getIndiceNuevoPresupuestoLinea());
			
			int iLastRow =  this.jTableDatosPresupuestoLinea.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPresupuestoLinea.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPresupuestoLinea.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPresupuestoLinea(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPresupuestoLinea(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoLinea(false);
			
			//SI ES MANUAL
			if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestoLinea();
			}
			
			//this.abrirFrameTreePresupuestoLinea();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Presupuesto LineaES ?", "MANTENIMIENTO DE Presupuesto Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPresupuestoLinea.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPresupuestoLinea();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.presupuestolineaReturnGeneral=presupuestolineaLogic.procesarImportacionPresupuestoLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.presupuestolineaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPresupuestoLineaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPresupuestoLinea.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPresupuestoLinea.setFileImportacion(this.jInternalFrameImportacionPresupuestoLinea.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPresupuestoLinea.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPresupuestoLinea.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPresupuestoLinea.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPresupuestoLinea.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PresupuestoLinea> presupuestolineasSeleccionados=new ArrayList<PresupuestoLinea>();		

		presupuestolineasSeleccionados=this.getPresupuestoLineasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PresupuestoLineaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PresupuestoLineaBaseDesign.jrxml";
			
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
			
			this.generarReportePresupuestoLineas("Todos",presupuestolineasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Linea",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresupuestoLineaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoLineaConstantesFunciones.LABEL_IDLINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Linea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Linea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Linea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Linea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoLineaConstantesFunciones.LABEL_MARGEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rgen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rgen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rgen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rgen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoLineaConstantesFunciones.LABEL_DESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ParaPresupuesto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ParaPresupuesto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ParaPresupuesto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ParaPresupuesto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPresupuestoLinea.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PresupuestoLineaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PresupuestoLineaConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoria="id_linea";
					break;

				case PresupuestoLineaConstantesFunciones.LABEL_MARGEN:
					sNombreCampoCategoria="margen";
					break;

				case PresupuestoLineaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoria="descuento";
					break;

				case PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO:
					sNombreCampoCategoria="es_para_presupuesto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PresupuestoLineaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PresupuestoLineaConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoriaValor="id_linea";
					break;

				case PresupuestoLineaConstantesFunciones.LABEL_MARGEN:
					sNombreCampoCategoriaValor="margen";
					break;

				case PresupuestoLineaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoriaValor="descuento";
					break;

				case PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO:
					sNombreCampoCategoriaValor="es_para_presupuesto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresupuestoLineaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PresupuestoLineaConstantesFunciones.LABEL_IDLINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea");
					break;

				case PresupuestoLineaConstantesFunciones.LABEL_MARGEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Margen",sNombreCampoCategoria,sNombreCampoCategoriaValor,"margen");
					break;

				case PresupuestoLineaConstantesFunciones.LABEL_DESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento");
					break;

				case PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Para Presupuesto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_para_presupuesto");
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
	
	public void jButtonGenerarExcelReporteDinamicoPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PresupuestoLinea> presupuestolineasSeleccionados=new ArrayList<PresupuestoLinea>();		
		
		presupuestolineasSeleccionados=this.getPresupuestoLineasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestolinea";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PresupuestoLineas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PresupuestoLineaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoLineaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PresupuestoLinea presupuestolinea:presupuestolineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestolinea.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoLineaConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoLineaConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(PresupuestoLinea presupuestolinea:presupuestolineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestolinea.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoLineaConstantesFunciones.LABEL_MARGEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoLineaConstantesFunciones.LABEL_MARGEN);
					iRow++;

					for(PresupuestoLinea presupuestolinea:presupuestolineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestolinea.getmargen());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoLineaConstantesFunciones.LABEL_DESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoLineaConstantesFunciones.LABEL_DESCUENTO);
					iRow++;

					for(PresupuestoLinea presupuestolinea:presupuestolineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestolinea.getdescuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO);
					iRow++;

					for(PresupuestoLinea presupuestolinea:presupuestolineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestolinea.getes_para_presupuesto());
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
			//	this.getFilaCabeceraExportarExcelPresupuestoLinea(row);				
			//	iRow++;
			//}				
			
			//for(PresupuestoLinea presupuestolineaAux:presupuestolineasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPresupuestoLinea(presupuestolineaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Linea",JOptionPane.INFORMATION_MESSAGE);
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
				this.presupuestolineaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoLinea(false);
			
			//SI ES MANUAL
			if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestoLinea();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoLinea(false);
			
			//SI ES MANUAL
			if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresupuestoLinea();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoLinea(false);
			
			//SI ES MANUAL
			if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresupuestoLinea();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPresupuestoLinea() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPresupuestoLinea.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPresupuestoLinea.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPresupuestoLinea.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPresupuestoLinea.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPresupuestoLinea.setMinimumSize(dimensionMinimum);
		this.jTableDatosPresupuestoLinea.setMaximumSize(dimensionMaximum);
		this.jTableDatosPresupuestoLinea.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPresupuestoLinea(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPresupuestoLinea(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPresupuestoLinea(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPresupuestoLinea(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPresupuestoLinea(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPresupuestoLinea(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoLinea(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPresupuestoLinea(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PresupuestoLineaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPresupuestoLinea() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPresupuestoLinea();
		
		this.inicializarActualizarBindingBotonesManualPresupuestoLinea(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPresupuestoLinea();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoLinea() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestoLinea(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestoLinea(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPresupuestoLinea.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPresupuestoLinea.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePresupuestoLinea.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPresupuestoLinea.jCheckBoxPostAccionNuevoPresupuestoLinea.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPresupuestoLinea.jCheckBoxPostAccionSinCerrarPresupuestoLinea.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPresupuestoLinea.jCheckBoxPostAccionSinMensajePresupuestoLinea.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPresupuestoLinea.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPresupuestoLinea.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePresupuestoLinea.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
				this.jInternalFrameDetalleFormPresupuestoLinea.jCheckBoxPostAccionNuevoPresupuestoLinea.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPresupuestoLinea.jCheckBoxPostAccionSinCerrarPresupuestoLinea.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPresupuestoLinea.jCheckBoxPostAccionSinMensajePresupuestoLinea.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPresupuestoLinea.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPresupuestoLinea.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxTiposAccionesFormularioPresupuestoLinea.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPresupuestoLinea.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPresupuestoLinea!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPresupuestoLinea.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPresupuestoLinea.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPresupuestoLinea.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPresupuestoLinea.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPresupuestoLinea!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPresupuestoLinea.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPresupuestoLinea.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPresupuestoLinea(Boolean esInicializar) throws Exception {
		try	{	
			if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestoLinea(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoLinea() throws Exception {
		try	{
			if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPresupuestoLinea();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresupuestoLinea() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxTiposAccionesFormularioPresupuestoLinea.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxTiposAccionesFormularioPresupuestoLinea.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPresupuestoLinea() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPresupuestoLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPresupuestoLinea.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPresupuestoLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPresupuestoLinea.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPresupuestoLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPresupuestoLinea.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPresupuestoLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPresupuestoLinea.addItem(reporte);
			}
			
			
			if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPresupuestoLinea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPresupuestoLinea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPresupuestoLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPresupuestoLinea.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPresupuestoLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPresupuestoLinea.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxTiposAccionesFormularioPresupuestoLinea.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxTiposAccionesFormularioPresupuestoLinea.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPresupuestoLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPresupuestoLinea.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPresupuestoLinea.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestoLinea();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestoLinea() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresupuestoLinea!=null) {
				this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresupuestoLinea!=null) {
				this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPresupuestoLinea!=null) {
				
				if(this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PresupuestoLineaConstantesFunciones.getTiposSeleccionarPresupuestoLinea(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PresupuestoLineaConstantesFunciones.getTiposSeleccionarPresupuestoLinea(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PresupuestoLineaConstantesFunciones.getTiposSeleccionarPresupuestoLinea(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestoLinea.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPresupuestoLinea.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPresupuestoLinea()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_lineaFK_IdLineaPresupuestoLinea.getSelectedItem()!=null){this.id_lineaFK_IdLinea=((Linea)this.jComboBoxid_lineaFK_IdLineaPresupuestoLinea.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPresupuestoLinea(Boolean esInicializar) throws Exception {				
		if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPresupuestoLinea();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPresupuestoLinea() throws Exception {
		this.inicializarActualizarBindingTablaPresupuestoLinea(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPresupuestoLinea() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPresupuestoLinea.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPresupuestoLinea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestoLinea.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PresupuestoLineaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPresupuestoLinea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestoLinea.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PresupuestoLineaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPresupuestoLineaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoLineaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PresupuestoLineaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPresupuestoLinea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestoLinea.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PresupuestoLineaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPresupuestoLinea.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPresupuestoLinea(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=presupuestolineaLogic.getPresupuestoLineas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=presupuestolineas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPresupuestoLinea.setModel(new PresupuestoLineaModel(this.presupuestolineaLogic.getPresupuestoLineas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPresupuestoLinea.setModel(new PresupuestoLineaModel(this.presupuestolineas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPresupuestoLinea!=null && this.jInternalFrameOrderByPresupuestoLinea.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPresupuestoLinea();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPresupuestoLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoLinea,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PresupuestoLineaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO,presupuestolineaConstantesFunciones.resaltarSeleccionarPresupuestoLinea,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO,presupuestolineaConstantesFunciones.resaltarSeleccionarPresupuestoLinea,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPresupuestoLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoLinea,PresupuestoLineaConstantesFunciones.LABEL_ID));

		if(this.presupuestolineaConstantesFunciones.mostraridPresupuestoLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoLineaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestolineaConstantesFunciones.resaltaridPresupuestoLinea,this.presupuestolineaConstantesFunciones.activaridPresupuestoLinea,iSizeTabla,this,true,"idPresupuestoLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestolineaConstantesFunciones.resaltaridPresupuestoLinea,this.presupuestolineaConstantesFunciones.activaridPresupuestoLinea,this,true,"idPresupuestoLinea","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoLinea,PresupuestoLineaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.presupuestolineaConstantesFunciones.mostrarid_empresaPresupuestoLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoLineaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.presupuestolineaConstantesFunciones.resaltarid_empresaPresupuestoLinea,this,this.presupuestolineaConstantesFunciones.activarid_empresaPresupuestoLinea,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.presupuestolineaConstantesFunciones.resaltarid_empresaPresupuestoLinea,this,this.presupuestolineaConstantesFunciones.activarid_empresaPresupuestoLinea,false,"id_empresaPresupuestoLinea","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoLinea,PresupuestoLineaConstantesFunciones.LABEL_IDLINEA));

		if(this.presupuestolineaConstantesFunciones.mostrarid_lineaPresupuestoLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoLineaConstantesFunciones.LABEL_IDLINEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineasForeignKey,this.presupuestolineaConstantesFunciones.resaltarid_lineaPresupuestoLinea,this,this.presupuestolineaConstantesFunciones.activarid_lineaPresupuestoLinea,iSizeTabla));
			tableColumn.setCellEditor(new LineaTableCell(this.lineasForeignKey,this.presupuestolineaConstantesFunciones.resaltarid_lineaPresupuestoLinea,this,this.presupuestolineaConstantesFunciones.activarid_lineaPresupuestoLinea,true,"id_lineaPresupuestoLinea","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoLinea,PresupuestoLineaConstantesFunciones.LABEL_MARGEN));

		if(this.presupuestolineaConstantesFunciones.mostrarmargenPresupuestoLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoLineaConstantesFunciones.LABEL_MARGEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestolineaConstantesFunciones.resaltarmargenPresupuestoLinea,this.presupuestolineaConstantesFunciones.activarmargenPresupuestoLinea,iSizeTabla,this,true,"margenPresupuestoLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestolineaConstantesFunciones.resaltarmargenPresupuestoLinea,this.presupuestolineaConstantesFunciones.activarmargenPresupuestoLinea,this,true,"margenPresupuestoLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoLinea,PresupuestoLineaConstantesFunciones.LABEL_DESCUENTO));

		if(this.presupuestolineaConstantesFunciones.mostrardescuentoPresupuestoLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoLineaConstantesFunciones.LABEL_DESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestolineaConstantesFunciones.resaltardescuentoPresupuestoLinea,this.presupuestolineaConstantesFunciones.activardescuentoPresupuestoLinea,iSizeTabla,this,true,"descuentoPresupuestoLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestolineaConstantesFunciones.resaltardescuentoPresupuestoLinea,this.presupuestolineaConstantesFunciones.activardescuentoPresupuestoLinea,this,true,"descuentoPresupuestoLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoLinea,PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO));

		if(this.presupuestolineaConstantesFunciones.mostrares_para_presupuestoPresupuestoLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.presupuestolineaConstantesFunciones.resaltares_para_presupuestoPresupuestoLinea,this.presupuestolineaConstantesFunciones.activares_para_presupuestoPresupuestoLinea,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.presupuestolineaConstantesFunciones.resaltares_para_presupuestoPresupuestoLinea,this.presupuestolineaConstantesFunciones.activares_para_presupuestoPresupuestoLinea,this,true,"es_para_presupuestoPresupuestoLinea","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presupuestolineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presupuestolineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresupuestoLinea.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presupuestolineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presupuestolineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresupuestoLinea.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPresupuestoLinea && this.isPermisoGuardarCambiosPresupuestoLinea) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.presupuestolineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.presupuestolineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPresupuestoLinea.addColumn(tableColumn);
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
			
			this.jTableDatosPresupuestoLinea.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresupuestoLinea && this.isPermisoGuardarCambiosPresupuestoLinea) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresupuestoLinea && this.isPermisoGuardarCambiosPresupuestoLinea) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPresupuestoLinea.moveColumn(this.jTableDatosPresupuestoLinea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPresupuestoLinea.moveColumn(this.jTableDatosPresupuestoLinea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPresupuestoLinea.moveColumn(this.jTableDatosPresupuestoLinea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPresupuestoLinea.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPresupuestoLinea.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPresupuestoLinea,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PresupuestoLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPresupuestoLinea.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPresupuestoLinea.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PresupuestoLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PresupuestoLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPresupuestoLinea.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPresupuestoLinea.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPresupuestoLinea.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=presupuestolineaLogic.getPresupuestoLineas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=presupuestolineas.size()-1;
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
		//this.jTableDatosPresupuestoLinea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPresupuestoLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPresupuestoLinea();
			
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
				
				//this.isEsNuevoPresupuestoLinea=false;
					
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
			
				if(this.presupuestolineaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPresupuestoLinea==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresupuestoLinea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresupuestoLinea.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.presupuestolinea.getsType().equals("DUPLICADO")
				   || this.presupuestolinea.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPresupuestoLinea=true;
				
				} else {
					this.isEsNuevoPresupuestoLinea=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
					if(this.presupuestolinea.getId()>=0 && !this.presupuestolinea.getIsNew()) {						
						this.isEsNuevoPresupuestoLinea=false;
						
					} else {
						this.isEsNuevoPresupuestoLinea=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPresupuestoLinea(esRelaciones);						
				
				this.seleccionarPresupuestoLinea(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.presupuestolinea.getId()<0) {
					this.isEsNuevoPresupuestoLinea=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPresupuestoLinea(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPresupuestoLinea(evt,rowIndex);
				}	
				
				if(this.presupuestolineaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PresupuestoLinea: " + this.dDif); 
					}
				}								
				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPresupuestoLinea(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.presupuestolinea)) {
					if(this.presupuestolinea.getId()>0) {
						this.presupuestolinea.setIsDeleted(true);
						
						this.presupuestolineasEliminados.add(this.presupuestolinea);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presupuestolineaLogic.getPresupuestoLineas().remove(this.presupuestolinea);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presupuestolineas.remove(this.presupuestolinea);				
					}
					
					
					((PresupuestoLineaModel) this.jTableDatosPresupuestoLinea.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestoLinea(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPresupuestoLinea(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPresupuestoLinea) {
			
			if(this.jInternalFrameDetalleFormPresupuestoLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresupuestoLinea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresupuestoLinea.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPresupuestoLinea(this.presupuestolinea);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.presupuestolineaConstantesFunciones.cargarid_empresaPresupuestoLinea || this.presupuestolineaConstantesFunciones.event_dependid_empresaPresupuestoLinea) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.presupuestolinea.getid_empresa());
									//this.inicializarActualizarBindingPresupuestoLinea(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(presupuestolinea.getEmpresa()!=null) {
							this.empresasForeignKey.add(presupuestolinea.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.presupuestolinea.getid_empresa(),false,"Formulario");

					//Linea
					if(!this.presupuestolineaConstantesFunciones.cargarid_lineaPresupuestoLinea || this.presupuestolineaConstantesFunciones.event_dependid_lineaPresupuestoLinea) {
						//this.cargarCombosLineasForeignKeyLista(" where id="+this.presupuestolinea.getid_linea());
									//this.inicializarActualizarBindingPresupuestoLinea(false,false);
						this.lineasForeignKey=new ArrayList<Linea>();

						if(presupuestolinea.getLinea()!=null) {
							this.lineasForeignKey.add(presupuestolinea.getLinea());
						}

						this.addItemDefectoCombosForeignKeyLinea();
						this.cargarCombosFrameLineasForeignKey("Todos");
					}
					this.setActualLineaForeignKey(this.presupuestolinea.getid_linea(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPresupuestoLinea("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPresupuestoLinea(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestoLinea() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresupuestoLinea(PresupuestoLinea presupuestolinea) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPresupuestoLinea(presupuestolinea,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresupuestoLinea(PresupuestoLinea presupuestolinea,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPresupuestoLinea(presupuestolinea);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPresupuestoLinea(presupuestolinea,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoLinea(presupuestolinea);
	}
	
	public void setVariablesObjetoActualToFormularioPresupuestoLinea(PresupuestoLinea presupuestolinea) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPresupuestoLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPresupuestoLinea.jLabelidPresupuestoLinea.setText(presupuestolinea.getId().toString());
			this.jInternalFrameDetalleFormPresupuestoLinea.jTextFieldmargenPresupuestoLinea.setText(presupuestolinea.getmargen().toString());
			this.jInternalFrameDetalleFormPresupuestoLinea.jTextFielddescuentoPresupuestoLinea.setText(presupuestolinea.getdescuento().toString());
			this.jInternalFrameDetalleFormPresupuestoLinea.jCheckBoxes_para_presupuestoPresupuestoLinea.setSelected(presupuestolinea.getes_para_presupuesto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PresupuestoLinea presupuestolineaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,presupuestolineaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PresupuestoLinea presupuestolineaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				presupuestolineaLocal=this.presupuestolinea;
			} else {
				presupuestolineaLocal=this.presupuestolineaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(presupuestolineaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPresupuestoLinea(presupuestolineaLocal,true);
					
					if(presupuestolineaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(presupuestolineaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(presupuestolineaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPresupuestoLinea(PresupuestoLinea presupuestolinea,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresupuestoLinea(presupuestolinea,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(presupuestolinea);
	}
	
	public void setVariablesFormularioToObjetoActualPresupuestoLinea(PresupuestoLinea presupuestolinea,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresupuestoLinea(presupuestolinea,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPresupuestoLinea(PresupuestoLinea presupuestolinea,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestoLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPresupuestoLinea.jLabelidPresupuestoLinea.getText()==null || this.jInternalFrameDetalleFormPresupuestoLinea.jLabelidPresupuestoLinea.getText()=="" || this.jInternalFrameDetalleFormPresupuestoLinea.jLabelidPresupuestoLinea.getText()=="Id") {
				this.jInternalFrameDetalleFormPresupuestoLinea.jLabelidPresupuestoLinea.setText("0");
			}

			if(conColumnasBase) {presupuestolinea.setId(Long.parseLong(this.jInternalFrameDetalleFormPresupuestoLinea.jLabelidPresupuestoLinea.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoLineaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoLinea.jLabelIdPresupuestoLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestolinea.setmargen(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestoLinea.jTextFieldmargenPresupuestoLinea.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoLineaConstantesFunciones.LABEL_MARGEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoLinea.jLabelmargenPresupuestoLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestolinea.setdescuento(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestoLinea.jTextFielddescuentoPresupuestoLinea.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoLineaConstantesFunciones.LABEL_DESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoLinea.jLabeldescuentoPresupuestoLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestolinea.setes_para_presupuesto(this.jInternalFrameDetalleFormPresupuestoLinea.jCheckBoxes_para_presupuestoPresupuestoLinea.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoLinea.jLabeles_para_presupuestoPresupuestoLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresupuestoLinea(PresupuestoLinea presupuestolineaBean,PresupuestoLinea presupuestolinea,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && presupuestolineaBean.getid_linea()!=null && !presupuestolineaBean.getid_linea().equals(-1L))) {presupuestolinea.setid_linea(presupuestolineaBean.getid_linea());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPresupuestoLinea(PresupuestoLinea presupuestolineaOrigen,PresupuestoLinea presupuestolinea,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presupuestolineaOrigen.getId()!=null && !presupuestolineaOrigen.getId().equals(0L))) {presupuestolinea.setId(presupuestolineaOrigen.getId());}}
			if(conDefault || (!conDefault && presupuestolineaOrigen.getid_linea()!=null && !presupuestolineaOrigen.getid_linea().equals(-1L))) {presupuestolinea.setid_linea(presupuestolineaOrigen.getid_linea());}
			if(conDefault || (!conDefault && presupuestolineaOrigen.getmargen()!=null && !presupuestolineaOrigen.getmargen().equals(0.0))) {presupuestolinea.setmargen(presupuestolineaOrigen.getmargen());}
			if(conDefault || (!conDefault && presupuestolineaOrigen.getdescuento()!=null && !presupuestolineaOrigen.getdescuento().equals(0.0))) {presupuestolinea.setdescuento(presupuestolineaOrigen.getdescuento());}
			if(conDefault || (!conDefault && presupuestolineaOrigen.getes_para_presupuesto()!=null && !presupuestolineaOrigen.getes_para_presupuesto().equals(false))) {presupuestolinea.setes_para_presupuesto(presupuestolineaOrigen.getes_para_presupuesto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresupuestoLinea(PresupuestoLinea presupuestolinea) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresupuestoLinea.jLabelidPresupuestoLinea.setText(presupuestolinea.getId().toString());
			this.jInternalFrameDetalleFormPresupuestoLinea.jTextFieldmargenPresupuestoLinea.setText(presupuestolinea.getmargen().toString());
			this.jInternalFrameDetalleFormPresupuestoLinea.jTextFielddescuentoPresupuestoLinea.setText(presupuestolinea.getdescuento().toString());
			this.jInternalFrameDetalleFormPresupuestoLinea.jCheckBoxes_para_presupuestoPresupuestoLinea.setSelected(presupuestolinea.getes_para_presupuesto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresupuestoLinea(PresupuestoLineaBean presupuestolineaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresupuestoLinea.jLabelidPresupuestoLinea.setText(presupuestolineaBean.getId().toString());
			this.jInternalFrameDetalleFormPresupuestoLinea.jTextFieldmargenPresupuestoLinea.setText(presupuestolineaBean.getmargen().toString());
			this.jInternalFrameDetalleFormPresupuestoLinea.jTextFielddescuentoPresupuestoLinea.setText(presupuestolineaBean.getdescuento().toString());
			this.jInternalFrameDetalleFormPresupuestoLinea.jCheckBoxes_para_presupuestoPresupuestoLinea.setSelected(presupuestolineaBean.getes_para_presupuesto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPresupuestoLinea(PresupuestoLineaParameterReturnGeneral presupuestolineaReturnGeneral,PresupuestoLineaBean presupuestolineaBean,Boolean conDefault) throws Exception { 
		try {
			PresupuestoLinea presupuestolineaLocal=new PresupuestoLinea();
			
			presupuestolineaLocal=presupuestolineaReturnGeneral.getPresupuestoLinea();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presupuestolineaLocal.getId()!=null && !presupuestolineaLocal.getId().equals(0L))) {presupuestolineaBean.setId(presupuestolineaLocal.getId());}}
			if(conDefault || (!conDefault && presupuestolineaLocal.getid_linea()!=null && !presupuestolineaLocal.getid_linea().equals(-1L))) {presupuestolineaBean.setid_linea(presupuestolineaLocal.getid_linea());}
			if(conDefault || (!conDefault && presupuestolineaLocal.getmargen()!=null && !presupuestolineaLocal.getmargen().equals(0.0))) {presupuestolineaBean.setmargen(presupuestolineaLocal.getmargen());}
			if(conDefault || (!conDefault && presupuestolineaLocal.getdescuento()!=null && !presupuestolineaLocal.getdescuento().equals(0.0))) {presupuestolineaBean.setdescuento(presupuestolineaLocal.getdescuento());}
			if(conDefault || (!conDefault && presupuestolineaLocal.getes_para_presupuesto()!=null && !presupuestolineaLocal.getes_para_presupuesto().equals(false))) {presupuestolineaBean.setes_para_presupuesto(presupuestolineaLocal.getes_para_presupuesto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPresupuestoLineaGenerico(Long idPresupuestoLineaSeleccionado,JComboBox jComboBoxPresupuestoLinea,List<PresupuestoLinea> presupuestolineasLocal)throws Exception {
		try {
			PresupuestoLinea  presupuestolineaTemp=null;

			for(PresupuestoLinea presupuestolineaAux:presupuestolineasLocal) {
				if(presupuestolineaAux.getId()!=null && presupuestolineaAux.getId().equals(idPresupuestoLineaSeleccionado)) {
					presupuestolineaTemp=presupuestolineaAux;
					break;
				}
			}

			jComboBoxPresupuestoLinea.setSelectedItem(presupuestolineaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPresupuestoLineaGenerico(JComboBox jComboBoxPresupuestoLinea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPresupuestoLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresupuestoLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPresupuestoLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresupuestoLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresupuestoLinea.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPresupuestoLinea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresupuestoLinea.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPresupuestoLinea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPresupuestoLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPresupuestoLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestolinea=(PresupuestoLinea) presupuestolineaLogic.getPresupuestoLineas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presupuestolinea =(PresupuestoLinea) presupuestolineas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!presupuestolinea.getIsNew() && !presupuestolinea.getIsChanged() && !presupuestolinea.getIsDeleted()) {
				sDescripcion=presupuestolinea.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestolinea.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!presupuestolinea.getIsNew() && !presupuestolinea.getIsChanged() && !presupuestolinea.getIsDeleted()) {
				sDescripcion=presupuestolinea.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestolinea.getlinea_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PresupuestoLinea presupuestolineaRow=new PresupuestoLinea();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestolineaRow=(PresupuestoLinea) presupuestolineaLogic.getPresupuestoLineas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presupuestolineaRow=(PresupuestoLinea) presupuestolineas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPresupuestoLinea(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPresupuestoLinea.setVisible((this.isVisibilidadCeldaNuevoPresupuestoLinea && this.isPermisoNuevoPresupuestoLinea));			
			this.jButtonDuplicarPresupuestoLinea.setVisible((this.isVisibilidadCeldaDuplicarPresupuestoLinea && this.isPermisoDuplicarPresupuestoLinea));			
			this.jButtonCopiarPresupuestoLinea.setVisible((this.isVisibilidadCeldaCopiarPresupuestoLinea && this.isPermisoCopiarPresupuestoLinea));
			this.jButtonVerFormPresupuestoLinea.setVisible((this.isVisibilidadCeldaVerFormPresupuestoLinea && this.isPermisoVerFormPresupuestoLinea));
			
			this.jButtonAbrirOrderByPresupuestoLinea.setVisible((this.isVisibilidadCeldaOrdenPresupuestoLinea && this.isPermisoOrdenPresupuestoLinea));			
			
			this.jButtonNuevoRelacionesPresupuestoLinea.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea && this.isPermisoNuevoPresupuestoLinea));			
			this.jButtonNuevoGuardarCambiosPresupuestoLinea.setVisible((this.isVisibilidadCeldaNuevoPresupuestoLinea && this.isPermisoNuevoPresupuestoLinea && this.isPermisoGuardarCambiosPresupuestoLinea));
			
			if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonModificarPresupuestoLinea.setVisible((this.isVisibilidadCeldaModificarPresupuestoLinea && this.isPermisoActualizarPresupuestoLinea));	
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonActualizarPresupuestoLinea.setVisible((this.isVisibilidadCeldaActualizarPresupuestoLinea && this.isPermisoActualizarPresupuestoLinea));	
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonEliminarPresupuestoLinea.setVisible((this.isVisibilidadCeldaEliminarPresupuestoLinea && this.isPermisoEliminarPresupuestoLinea));
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonCancelarPresupuestoLinea.setVisible(this.isVisibilidadCeldaCancelarPresupuestoLinea);							
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonGuardarCambiosPresupuestoLinea.setVisible((this.isVisibilidadCeldaGuardarPresupuestoLinea && this.isPermisoGuardarCambiosPresupuestoLinea));			
			
			}
						
			this.jButtonGuardarCambiosTablaPresupuestoLinea.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestoLinea && this.isPermisoGuardarCambiosPresupuestoLinea));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPresupuestoLinea.setVisible((this.isVisibilidadCeldaNuevoPresupuestoLinea && this.isPermisoNuevoPresupuestoLinea));						
			this.jButtonDuplicarToolBarPresupuestoLinea.setVisible((this.isVisibilidadCeldaDuplicarPresupuestoLinea && this.isPermisoDuplicarPresupuestoLinea));						
			this.jButtonCopiarToolBarPresupuestoLinea.setVisible((this.isVisibilidadCeldaCopiarPresupuestoLinea && this.isPermisoCopiarPresupuestoLinea));			
			this.jButtonVerFormToolBarPresupuestoLinea.setVisible((this.isVisibilidadCeldaVerFormPresupuestoLinea && this.isPermisoVerFormPresupuestoLinea));			
			this.jButtonAbrirOrderByToolBarPresupuestoLinea.setVisible((this.isVisibilidadCeldaOrdenPresupuestoLinea && this.isPermisoOrdenPresupuestoLinea));
			this.jButtonNuevoRelacionesToolBarPresupuestoLinea.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea && this.isPermisoNuevoPresupuestoLinea));			
			this.jButtonNuevoGuardarCambiosToolBarPresupuestoLinea.setVisible((this.isVisibilidadCeldaNuevoPresupuestoLinea && this.isPermisoNuevoPresupuestoLinea && this.isPermisoGuardarCambiosPresupuestoLinea));			
			
			if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonModificarToolBarPresupuestoLinea.setVisible((this.isVisibilidadCeldaModificarPresupuestoLinea && this.isPermisoActualizarPresupuestoLinea));	
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonActualizarToolBarPresupuestoLinea.setVisible((this.isVisibilidadCeldaActualizarPresupuestoLinea  && this.isPermisoActualizarPresupuestoLinea));	
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonEliminarToolBarPresupuestoLinea.setVisible((this.isVisibilidadCeldaEliminarPresupuestoLinea && this.isPermisoEliminarPresupuestoLinea));
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonCancelarToolBarPresupuestoLinea.setVisible(this.isVisibilidadCeldaCancelarPresupuestoLinea);				
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonGuardarCambiosToolBarPresupuestoLinea.setVisible((this.isVisibilidadCeldaGuardarPresupuestoLinea && this.isPermisoGuardarCambiosPresupuestoLinea));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPresupuestoLinea.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestoLinea && this.isPermisoGuardarCambiosPresupuestoLinea));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPresupuestoLinea.setVisible((this.isVisibilidadCeldaNuevoPresupuestoLinea && this.isPermisoNuevoPresupuestoLinea));			
			this.jMenuItemDuplicarPresupuestoLinea.setVisible((this.isVisibilidadCeldaDuplicarPresupuestoLinea && this.isPermisoDuplicarPresupuestoLinea));			
			this.jMenuItemCopiarPresupuestoLinea.setVisible((this.isVisibilidadCeldaCopiarPresupuestoLinea && this.isPermisoCopiarPresupuestoLinea));			
			this.jMenuItemVerFormPresupuestoLinea.setVisible((this.isVisibilidadCeldaVerFormPresupuestoLinea && this.isPermisoVerFormPresupuestoLinea));			
			this.jMenuItemAbrirOrderByPresupuestoLinea.setVisible((this.isVisibilidadCeldaOrdenPresupuestoLinea && this.isPermisoOrdenPresupuestoLinea));			
			//this.jMenuItemMostrarOcultarPresupuestoLinea.setVisible((this.isVisibilidadCeldaOrdenPresupuestoLinea && this.isPermisoOrdenPresupuestoLinea));
			this.jMenuItemDetalleAbrirOrderByPresupuestoLinea.setVisible((this.isVisibilidadCeldaOrdenPresupuestoLinea && this.isPermisoOrdenPresupuestoLinea));			
			//this.jMenuItemDetalleMostrarOcultarPresupuestoLinea.setVisible((this.isVisibilidadCeldaOrdenPresupuestoLinea && this.isPermisoOrdenPresupuestoLinea));			
			this.jMenuItemNuevoRelacionesPresupuestoLinea.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea && this.isPermisoNuevoPresupuestoLinea));			
			this.jMenuItemNuevoGuardarCambiosPresupuestoLinea.setVisible((this.isVisibilidadCeldaNuevoPresupuestoLinea && this.isPermisoNuevoPresupuestoLinea && this.isPermisoGuardarCambiosPresupuestoLinea));									
			
			if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
			this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemModificarPresupuestoLinea.setVisible((this.isVisibilidadCeldaModificarPresupuestoLinea && this.isPermisoActualizarPresupuestoLinea));	
			this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemActualizarPresupuestoLinea.setVisible((this.isVisibilidadCeldaActualizarPresupuestoLinea && this.isPermisoActualizarPresupuestoLinea));	
			this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemEliminarPresupuestoLinea.setVisible((this.isVisibilidadCeldaEliminarPresupuestoLinea && this.isPermisoEliminarPresupuestoLinea));
			this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemCancelarPresupuestoLinea.setVisible(this.isVisibilidadCeldaCancelarPresupuestoLinea);				
			}
			
			this.jMenuItemGuardarCambiosPresupuestoLinea.setVisible((this.isVisibilidadCeldaGuardarPresupuestoLinea && this.isPermisoGuardarCambiosPresupuestoLinea));						
			this.jMenuItemGuardarCambiosTablaPresupuestoLinea.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestoLinea && this.isPermisoGuardarCambiosPresupuestoLinea));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPresupuestoLinea=this.jButtonNuevoPresupuestoLinea.isVisible();
			this.isVisibilidadCeldaDuplicarPresupuestoLinea=this.jButtonDuplicarPresupuestoLinea.isVisible();
			this.isVisibilidadCeldaCopiarPresupuestoLinea=this.jButtonCopiarPresupuestoLinea.isVisible();
			this.isVisibilidadCeldaVerFormPresupuestoLinea=this.jButtonVerFormPresupuestoLinea.isVisible();
			
			this.isVisibilidadCeldaOrdenPresupuestoLinea=this.jButtonAbrirOrderByPresupuestoLinea.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea=this.jButtonNuevoRelacionesPresupuestoLinea.isVisible();
			this.isVisibilidadCeldaModificarPresupuestoLinea=this.jButtonModificarPresupuestoLinea.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
			this.isVisibilidadCeldaActualizarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jButtonActualizarPresupuestoLinea.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jButtonEliminarPresupuestoLinea.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jButtonCancelarPresupuestoLinea.isVisible();
			this.isVisibilidadCeldaGuardarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jButtonGuardarCambiosPresupuestoLinea.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPresupuestoLinea=this.jButtonGuardarCambiosTablaPresupuestoLinea.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPresupuestoLinea=this.jButtonNuevoToolBarPresupuestoLinea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea=this.jButtonNuevoRelacionesToolBarPresupuestoLinea.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
			this.isVisibilidadCeldaModificarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jButtonModificarToolBarPresupuestoLinea.isVisible();
			this.isVisibilidadCeldaActualizarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jButtonActualizarToolBarPresupuestoLinea.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jButtonEliminarToolBarPresupuestoLinea.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jButtonCancelarToolBarPresupuestoLinea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresupuestoLinea=this.jButtonGuardarCambiosToolBarPresupuestoLinea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresupuestoLinea=this.jButtonGuardarCambiosTablaToolBarPresupuestoLinea.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPresupuestoLinea=this.jMenuItemNuevoPresupuestoLinea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea=this.jMenuItemNuevoRelacionesPresupuestoLinea.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
			this.isVisibilidadCeldaModificarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemModificarPresupuestoLinea.isVisible();
			this.isVisibilidadCeldaActualizarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemActualizarPresupuestoLinea.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemEliminarPresupuestoLinea.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestoLinea=this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemCancelarPresupuestoLinea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresupuestoLinea=this.jMenuItemGuardarCambiosPresupuestoLinea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresupuestoLinea=this.jMenuItemGuardarCambiosTablaPresupuestoLinea.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPresupuestoLinea(Boolean esInicializar) {
		if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.presupuestolineaSessionBean.getConGuardarRelaciones()) {
				//if(this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPresupuestoLinea();
			}
			
			this.inicializarActualizarBindingBotonesManualPresupuestoLinea(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPresupuestoLinea() {
		this.jButtonNuevoPresupuestoLinea.setVisible(this.isPermisoNuevoPresupuestoLinea);			
		this.jButtonDuplicarPresupuestoLinea.setVisible(this.isPermisoDuplicarPresupuestoLinea);			
		this.jButtonCopiarPresupuestoLinea.setVisible(this.isPermisoCopiarPresupuestoLinea);			
		this.jButtonVerFormPresupuestoLinea.setVisible(this.isPermisoVerFormPresupuestoLinea);			
		
		this.jButtonAbrirOrderByPresupuestoLinea.setVisible(this.isPermisoOrdenPresupuestoLinea);					
		
		this.jButtonNuevoRelacionesPresupuestoLinea.setVisible(this.isPermisoNuevoPresupuestoLinea);			
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonModificarPresupuestoLinea.setVisible(this.isPermisoActualizarPresupuestoLinea);	
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonActualizarPresupuestoLinea.setVisible(this.isPermisoActualizarPresupuestoLinea);	
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonEliminarPresupuestoLinea.setVisible(this.isPermisoEliminarPresupuestoLinea);
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonCancelarPresupuestoLinea.setVisible(this.isVisibilidadCeldaCancelarPresupuestoLinea);						
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonGuardarCambiosPresupuestoLinea.setVisible(this.isPermisoGuardarCambiosPresupuestoLinea);							
		}
		
		this.jButtonGuardarCambiosTablaPresupuestoLinea.setVisible(this.isPermisoActualizarPresupuestoLinea);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePresupuestoLinea() {
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonModificarPresupuestoLinea.setVisible(this.isPermisoActualizarPresupuestoLinea);	
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonActualizarPresupuestoLinea.setVisible(this.isPermisoActualizarPresupuestoLinea);	
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonEliminarPresupuestoLinea.setVisible(this.isPermisoEliminarPresupuestoLinea);
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonCancelarPresupuestoLinea.setVisible(this.isVisibilidadCeldaCancelarPresupuestoLinea);							
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonGuardarCambiosPresupuestoLinea.setVisible((this.isVisibilidadCeldaGuardarPresupuestoLinea && this.isPermisoGuardarCambiosPresupuestoLinea));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPresupuestoLinea() {
		if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPresupuestoLinea();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPresupuestoLinea() {
	}
	
	public void jTableDatosPresupuestoLineaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPresupuestoLinea(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPresupuestoLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.getpresupuestolinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestolinea==null) {
						this.presupuestolinea = new PresupuestoLinea();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.presupuestolinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);
				}

				if(this.presupuestolinea.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.presupuestolinea.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPresupuestoLineaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPresupuestoLinea(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoLinea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoLinea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.getpresupuestolinea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.presupuestolineaLogic.getConnexion());

				if(this.presupuestolinea.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.presupuestolinea.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoLinea=(TitledBorder)this.jScrollPanelDatosPresupuestoLinea.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPresupuestoLinea.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPresupuestoLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.getpresupuestolinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestolinea==null) {
						this.presupuestolinea = new PresupuestoLinea();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.presupuestolinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);
				}

				if(this.presupuestolinea.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.presupuestolinea.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaPresupuestoLineaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebPresupuestoLinea(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoLinea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoLinea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.getpresupuestolinea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.presupuestolineaLogic.getConnexion());

				if(this.presupuestolinea.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.presupuestolinea.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoLinea=(TitledBorder)this.jScrollPanelDatosPresupuestoLinea.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderPresupuestoLinea.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaPresupuestoLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.getpresupuestolinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestolinea==null) {
						this.presupuestolinea = new PresupuestoLinea();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.presupuestolinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);
				}

				if(this.presupuestolinea.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.presupuestolinea.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmargenPresupuestoLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.getpresupuestolinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestolinea==null) {
						this.presupuestolinea = new PresupuestoLinea();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.presupuestolinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);
				}

				if(this.presupuestolinea.getmargen()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where margen = "+this.presupuestolinea.getmargen().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuentoPresupuestoLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.getpresupuestolinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestolinea==null) {
						this.presupuestolinea = new PresupuestoLinea();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.presupuestolinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);
				}

				if(this.presupuestolinea.getdescuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento = "+this.presupuestolinea.getdescuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_para_presupuestoPresupuestoLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.getpresupuestolinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestolinea==null) {
						this.presupuestolinea = new PresupuestoLinea();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.presupuestolinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);
				}

				if(this.presupuestolinea.getes_para_presupuesto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_para_presupuesto = "+this.presupuestolinea.getes_para_presupuesto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoLinea(false,false);

			this.getPresupuestoLineasFK_IdEmpresa();

			this.inicializarActualizarBindingPresupuestoLinea(false);

			//if(PresupuestoLineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaPresupuestoLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoLinea(false,false);

			this.getPresupuestoLineasFK_IdLinea();

			this.inicializarActualizarBindingPresupuestoLinea(false);

			//if(PresupuestoLineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestolineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePresupuestoLinea() {
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
			this.jInternalFrameDetalleFormPresupuestoLinea.setVisible(false);	    			
			this.jInternalFrameDetalleFormPresupuestoLinea.dispose();
			this.jInternalFrameDetalleFormPresupuestoLinea=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPresupuestoLinea!=null) {
			this.jInternalFrameReporteDinamicoPresupuestoLinea.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPresupuestoLinea.dispose();
			this.jInternalFrameReporteDinamicoPresupuestoLinea=null;
		}
		
		if(this.jInternalFrameImportacionPresupuestoLinea!=null) {
			this.jInternalFrameImportacionPresupuestoLinea.setVisible(false);	    			
			this.jInternalFrameImportacionPresupuestoLinea.dispose();
			this.jInternalFrameImportacionPresupuestoLinea=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPresupuestoLinea();
			
			PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
			
			
			if(sTipo.equals("NuevoPresupuestoLinea")) {
				jButtonNuevoPresupuestoLineaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPresupuestoLinea")) {
				jButtonDuplicarPresupuestoLineaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPresupuestoLinea")) {
				jButtonCopiarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("VerFormPresupuestoLinea")) {
				jButtonVerFormPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPresupuestoLinea")) {
				jButtonNuevoPresupuestoLineaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPresupuestoLinea")) {
				jButtonDuplicarPresupuestoLineaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPresupuestoLinea")) {
				jButtonNuevoPresupuestoLineaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPresupuestoLinea")) {
				jButtonDuplicarPresupuestoLineaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPresupuestoLinea")) {
				jButtonNuevoPresupuestoLineaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPresupuestoLinea")) {
				jButtonNuevoPresupuestoLineaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPresupuestoLinea")) {
				jButtonNuevoPresupuestoLineaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPresupuestoLinea")) {
				jButtonModificarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPresupuestoLinea")) {
				jButtonModificarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPresupuestoLinea")) {
				jButtonModificarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPresupuestoLinea")) {
				jButtonActualizarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPresupuestoLinea")) {
				jButtonActualizarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPresupuestoLinea")) {
				jButtonActualizarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("EliminarPresupuestoLinea")) {
				jButtonEliminarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPresupuestoLinea")) {
				jButtonEliminarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPresupuestoLinea")) {
				jButtonEliminarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("CancelarPresupuestoLinea")) {
				jButtonCancelarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPresupuestoLinea")) {
				jButtonCancelarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPresupuestoLinea")) {
				jButtonCancelarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("CerrarPresupuestoLinea")) {
				jButtonCerrarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPresupuestoLinea")) {
				jButtonCerrarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPresupuestoLinea")) {
				jButtonCerrarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPresupuestoLinea")) {
				jButtonMostrarOcultarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPresupuestoLinea")) {
				jButtonCancelarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPresupuestoLinea")) {
				jButtonGuardarCambiosPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPresupuestoLinea")) {
				jButtonGuardarCambiosPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPresupuestoLinea")) {
				jButtonCopiarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPresupuestoLinea")) {
				jButtonVerFormPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPresupuestoLinea")) {
				jButtonGuardarCambiosPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPresupuestoLinea")) {
				jButtonCopiarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPresupuestoLinea")) {
				jButtonVerFormPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPresupuestoLinea")) {
				jButtonGuardarCambiosPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPresupuestoLinea")) {
				jButtonGuardarCambiosPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPresupuestoLinea")) {
				jButtonGuardarCambiosPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPresupuestoLinea")) {
				jButtonRecargarInformacionPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPresupuestoLinea")) {
				jButtonRecargarInformacionPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPresupuestoLinea")) {
				jButtonRecargarInformacionPresupuestoLineaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPresupuestoLinea")) {
				jButtonAnterioresPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPresupuestoLinea")) {
				jButtonAnterioresPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePresupuestoLinea")) {
				jButtonAnterioresPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPresupuestoLinea")) {
				jButtonSiguientesPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPresupuestoLinea")) {
				jButtonSiguientesPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPresupuestoLinea")) {
				jButtonSiguientesPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPresupuestoLinea") || sTipo.equals("MenuItemDetalleAbrirOrderByPresupuestoLinea")) {
				jButtonAbrirOrderByPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPresupuestoLinea") || sTipo.equals("MenuItemDetalleMostrarOcultarPresupuestoLinea")) {
				jButtonMostrarOcultarPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPresupuestoLinea")) {
				jButtonNuevoGuardarCambiosPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPresupuestoLinea")) {
				jButtonNuevoGuardarCambiosPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPresupuestoLinea")) {
				jButtonNuevoGuardarCambiosPresupuestoLineaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPresupuestoLinea")) {
				jButtonCerrarReporteDinamicoPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPresupuestoLinea")) {
				jButtonGenerarReporteDinamicoPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPresupuestoLinea")) {
				
				jButtonGenerarExcelReporteDinamicoPresupuestoLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPresupuestoLinea")) {
				jButtonCerrarImportacionPresupuestoLineaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPresupuestoLinea")) {
				
				jButtonGenerarImportacionPresupuestoLineaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPresupuestoLinea")) {
				
				jButtonAbrirImportacionPresupuestoLineaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPresupuestoLinea")) {
				jComboBoxTiposAccionesPresupuestoLineaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPresupuestoLinea")) {
				jComboBoxTiposRelacionesPresupuestoLineaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPresupuestoLinea")) {
				jComboBoxTiposAccionesPresupuestoLineaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPresupuestoLinea")) {
				
				jComboBoxTiposSeleccionarPresupuestoLineaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPresupuestoLinea")) {
				jTextFieldValorCampoGeneralPresupuestoLineaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPresupuestoLinea")) {
				jButtonAbrirOrderByPresupuestoLineaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPresupuestoLinea")) {
				jButtonAbrirOrderByPresupuestoLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPresupuestoLinea")) {
				jButtonCerrarOrderByPresupuestoLineaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresupuestoLineaBusqueda")) {
				this.jButtonidPresupuestoLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresupuestoLineaUpdate")) {
				this.jButtonid_empresaPresupuestoLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresupuestoLineaBusqueda")) {
				this.jButtonid_empresaPresupuestoLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaPresupuestoLineaUpdate")) {
				this.jButtonid_lineaPresupuestoLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaPresupuestoLineaBusqueda")) {
				this.jButtonid_lineaPresupuestoLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("margenPresupuestoLineaBusqueda")) {
				this.jButtonmargenPresupuestoLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoPresupuestoLineaBusqueda")) {
				this.jButtondescuentoPresupuestoLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_para_presupuestoPresupuestoLineaBusqueda")) {
				this.jButtones_para_presupuestoPresupuestoLineaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdLineaPresupuestoLinea")) {
				this.jButtonFK_IdLineaPresupuestoLineaActionPerformed(evt);
			}
			
			;
			
			
			PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPresupuestoLinea();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoLineaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestolinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestolinea);
				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
				
				


				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PresupuestoLinea presupuestolineaLocal=null;
			
			if(!this.getEsControlTabla()) {
				presupuestolineaLocal=this.presupuestolinea;
			} else {
				presupuestolineaLocal=this.presupuestolineaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestolinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestolinea);
				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
							
				
				


				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaAnterior =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestolineaAnterior =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
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
			
			PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
			
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
			
			


			
			PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoLineaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestolinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestolinea);
				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
								
						
				


				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoLinea.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestolinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestolinea);
				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
								
				
				


				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaAnterior =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestolineaAnterior =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestolinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestolinea);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaAnterior =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestolineaAnterior =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoLineaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestolinea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestolinea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestolinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestolinea);
				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
							
				
				


				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoLinea.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoLineaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestolineaAnterior =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presupuestolineaAnterior =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
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
			
			PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
			
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
			
			


			
			PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoLineaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestolinea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestolinea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestolinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestolinea);
				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
								
				
				


				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaAnterior =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestolineaAnterior =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoLineaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestolinea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestolinea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoLineaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestolinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestolinea);
				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPresupuestoLinea")) {
					jCheckBoxSeleccionarTodosPresupuestoLineaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPresupuestoLinea")) {
					jCheckBoxSeleccionadosPresupuestoLineaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPresupuestoLinea")) {
					
				}
				
				


				
				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestolinea);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.presupuestolinea);
				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
												
				
				


				
				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoLineaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestolineaAnterior =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presupuestolineaAnterior =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoLineaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestolinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestolinea);
				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
				
				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
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
			
			PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
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
			
			


			
			PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoLineaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestolinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestolinea);
				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoLinea.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoLinea.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestolinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestolinea);
				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
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
				
				


				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoLinea.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestolineaAnterior =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestolineaAnterior =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPresupuestoLinea")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPresupuestoLineaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPresupuestoLinea.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.presupuestolinea =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.presupuestolinea =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.presupuestolinea);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPresupuestoLinea")) {
				
				}
				
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPresupuestoLinea")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPresupuestoLinea.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPresupuestoLinea")) {
			
			}
			
			PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPresupuestoLinea();
			
			PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
			
			if(sTipo.equals("NuevoPresupuestoLinea")) {
				jButtonNuevoPresupuestoLineaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPresupuestoLinea")) {
				jButtonDuplicarPresupuestoLineaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPresupuestoLinea")) {
				jButtonCopiarPresupuestoLineaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPresupuestoLinea")) {
				jButtonVerFormPresupuestoLineaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPresupuestoLinea")) {
				jButtonNuevoPresupuestoLineaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPresupuestoLinea")) {
				jButtonModificarPresupuestoLineaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPresupuestoLinea")) {
				jButtonActualizarPresupuestoLineaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPresupuestoLinea")) {
				jButtonEliminarPresupuestoLineaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPresupuestoLinea")) {
				jButtonGuardarCambiosPresupuestoLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPresupuestoLinea")) {
				jButtonCancelarPresupuestoLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPresupuestoLinea")) {
				jButtonCerrarPresupuestoLineaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPresupuestoLinea")) {
				jButtonGuardarCambiosPresupuestoLineaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPresupuestoLinea")) {
				jButtonNuevoGuardarCambiosPresupuestoLineaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPresupuestoLinea")) {
				jButtonAbrirOrderByPresupuestoLineaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPresupuestoLinea")) {
				jButtonRecargarInformacionPresupuestoLineaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPresupuestoLinea")) {
				jButtonAnterioresPresupuestoLineaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPresupuestoLinea")) {
				jButtonSiguientesPresupuestoLineaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresupuestoLineaBusqueda")) {
				this.jButtonidPresupuestoLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresupuestoLineaUpdate")) {
				this.jButtonid_empresaPresupuestoLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresupuestoLineaBusqueda")) {
				this.jButtonid_empresaPresupuestoLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaPresupuestoLineaUpdate")) {
				this.jButtonid_lineaPresupuestoLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaPresupuestoLineaBusqueda")) {
				this.jButtonid_lineaPresupuestoLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("margenPresupuestoLineaBusqueda")) {
				this.jButtonmargenPresupuestoLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoPresupuestoLineaBusqueda")) {
				this.jButtondescuentoPresupuestoLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_para_presupuestoPresupuestoLineaBusqueda")) {
				this.jButtones_para_presupuestoPresupuestoLineaBusquedaActionPerformed(evt);
			}
			
			PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPresupuestoLinea();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePresupuestoLinea")) {
				closingInternalFramePresupuestoLinea();
				
			} else if(sTipo.equals("jButtonCancelarPresupuestoLinea")) {
				JInternalFrameBase jInternalFrameDetalleFormPresupuestoLinea = (JInternalFrameBase)evt.getSource();
	            	
	            PresupuestoLineaBeanSwingJInternalFrame jInternalFrameParent=(PresupuestoLineaBeanSwingJInternalFrame)jInternalFrameDetalleFormPresupuestoLinea.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPresupuestoLineaActionPerformed(null);
			}
			
			PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presupuestolinea,new Object(),this.presupuestolineaParameterGeneral,this.presupuestolineaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPresupuestoLinea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPresupuestoLinea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPresupuestoLinea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.presupuestolinea)) {
			if(!esControlTabla) {
				if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.presupuestolinea,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);			
				}
				
				if(this.presupuestolineaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPresupuestoLinea(this.presupuestolinea,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presupuestolineaReturnGeneral=presupuestolineaLogic.procesarEventosPresupuestoLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestolineaLogic.getPresupuestoLineas(),this.presupuestolinea,this.presupuestolineaParameterGeneral,this.isEsNuevoPresupuestoLinea,classes);//this.presupuestolineaLogic.getPresupuestoLinea()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPresupuestoLinea(this.presupuestolineaReturnGeneral,this.presupuestolineaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.presupuestolineaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPresupuestoLinea(classes,this.presupuestolineaReturnGeneral,this.presupuestolineaBean,false);
					}
						
					if(this.presupuestolineaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoLinea(this.presupuestolineaReturnGeneral.getPresupuestoLinea());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPresupuestoLinea(this.presupuestolineaReturnGeneral.getPresupuestoLinea());	
					}
						
					if(this.presupuestolineaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPresupuestoLinea(this.presupuestolineaReturnGeneral.getPresupuestoLinea(),classes);//this.presupuestolineaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPresupuestoLinea(this.presupuestolinea,classes);//this.presupuestolineaBean);									
				}
			
				if(PresupuestoLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPresupuestoLinea(this.presupuestolinea,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoLinea(this.presupuestolinea);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.presupuestolineaAnterior!=null) {
						this.presupuestolinea=this.presupuestolineaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presupuestolineaReturnGeneral=presupuestolineaLogic.procesarEventosPresupuestoLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestolineaLogic.getPresupuestoLineas(),this.presupuestolinea,this.presupuestolineaParameterGeneral,this.isEsNuevoPresupuestoLinea,classes);//this.presupuestolineaLogic.getPresupuestoLinea()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presupuestolineaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presupuestolineaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.presupuestolineaReturnGeneral.getPresupuestoLinea(),presupuestolineaLogic.getPresupuestoLineas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.presupuestolineaReturnGeneral.getPresupuestoLinea(),this.presupuestolineas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPresupuestoLinea.repaint();
				
				//((AbstractTableModel) this.jTableDatosPresupuestoLinea.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPresupuestoLinea();
			}
		}
	}
	
	public void actualizarVisualTableDatosPresupuestoLinea() throws Exception {
		
		PresupuestoLineaModel presupuestolineaModel=(PresupuestoLineaModel)this.jTableDatosPresupuestoLinea.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestolineaModel.presupuestolineas=this.presupuestolineaLogic.getPresupuestoLineas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			presupuestolineaModel.presupuestolineas=this.presupuestolineas;
		}
		
		
		((PresupuestoLineaModel) this.jTableDatosPresupuestoLinea.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPresupuestoLinea() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpresupuestolineaAnterior(),this.presupuestolineaLogic.getPresupuestoLineas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpresupuestolineaAnterior(),this.presupuestolineas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPresupuestoLinea();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPresupuestoLinea(PresupuestoLinea presupuestolinea,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
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
										
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestolinea,new Object(),generalEntityParameterGeneral,this.presupuestolineaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.presupuestolineaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PresupuestoLineaConstantesFunciones.getClassesRelationshipsOfPresupuestoLinea(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PresupuestoLineaConstantesFunciones.getClassesRelationshipsFromStringsOfPresupuestoLinea(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPresupuestoLinea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PresupuestoLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestolinea,new Object(),generalEntityParameterGeneral,this.presupuestolineaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPresupuestoLinea(PresupuestoLineaBean presupuestolineaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPresupuestoLinea(ArrayList<Classe> classes,PresupuestoLineaReturnGeneral presupuestolineaReturnGeneral,PresupuestoLineaBean presupuestolineaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPresupuestoLinea(PresupuestoLinea presupuestolinea,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.presupuestolinea)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPresupuestoLinea = new PresupuestoLineaDetalleFormJInternalFrame(jDesktopPane,this.presupuestolineaSessionBean.getConGuardarRelaciones(),this.presupuestolineaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPresupuestoLinea);
		this.jInternalFrameDetalleFormPresupuestoLinea.setVisible(false);
		this.jInternalFrameDetalleFormPresupuestoLinea.setSelected(false);						
		
		this.jInternalFrameDetalleFormPresupuestoLinea.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPresupuestoLinea.presupuestolineaLogic=this.presupuestolineaLogic;
		
		this.cargarCombosFrameForeignKeyPresupuestoLinea("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePresupuestoLinea();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresupuestoLinea();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPresupuestoLinea("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPresupuestoLinea();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPresupuestoLinea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresupuestoLinea"));
		
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonModificarPresupuestoLinea.addActionListener(new ButtonActionListener(this,"ModificarPresupuestoLinea"));

		
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonModificarToolBarPresupuestoLinea.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresupuestoLinea"));
					
		this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemModificarPresupuestoLinea.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresupuestoLinea"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonActualizarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"ActualizarPresupuestoLinea"));
		
		
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonActualizarToolBarPresupuestoLinea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresupuestoLinea"));
						
		this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemActualizarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresupuestoLinea"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonEliminarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"EliminarPresupuestoLinea"));
		
		
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonEliminarToolBarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresupuestoLinea"));
								
		this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemEliminarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresupuestoLinea"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonCancelarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"CancelarPresupuestoLinea"));
		
		
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonCancelarToolBarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresupuestoLinea"));
					
		this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemCancelarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresupuestoLinea"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemDetalleCerrarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresupuestoLinea"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonGuardarCambiosToolBarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestoLinea"));
		
		
		
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonGuardarCambiosToolBarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestoLinea"));
		
		
		
		this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxTiposAccionesFormularioPresupuestoLinea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresupuestoLinea"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonidPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestoLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonid_empresaPresupuestoLineaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonid_empresaPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonid_lineaPresupuestoLineaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaPresupuestoLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonid_lineaPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaPresupuestoLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonmargenPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"margenPresupuestoLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtondescuentoPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoPresupuestoLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtones_para_presupuestoPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"es_para_presupuestoPresupuestoLineaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPresupuestoLinea.jTabbedPaneRelacionesPresupuestoLinea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresupuestoLinea"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePresupuestoLinea"));
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoLinea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresupuestoLinea"));
		}
		
		this.jTableDatosPresupuestoLinea.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPresupuestoLinea"));
		
		this.jTableDatosPresupuestoLinea.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPresupuestoLinea"));
		
		this.jButtonNuevoPresupuestoLinea.addActionListener(new ButtonActionListener(this,"NuevoPresupuestoLinea"));
		
		this.jButtonDuplicarPresupuestoLinea.addActionListener(new ButtonActionListener(this,"DuplicarPresupuestoLinea"));
		
		this.jButtonCopiarPresupuestoLinea.addActionListener(new ButtonActionListener(this,"CopiarPresupuestoLinea"));
		
		this.jButtonVerFormPresupuestoLinea.addActionListener(new ButtonActionListener(this,"VerFormPresupuestoLinea"));
		
		
		this.jButtonNuevoToolBarPresupuestoLinea.addActionListener(new ButtonActionListener(this,"NuevoToolBarPresupuestoLinea"));
			
		this.jButtonDuplicarToolBarPresupuestoLinea.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPresupuestoLinea"));
			
		this.jMenuItemNuevoPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPresupuestoLinea"));
			
		this.jMenuItemDuplicarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPresupuestoLinea"));		
		
		
		this.jButtonNuevoRelacionesPresupuestoLinea.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPresupuestoLinea"));
		
		
		this.jButtonNuevoRelacionesToolBarPresupuestoLinea.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPresupuestoLinea"));
			
		this.jMenuItemNuevoRelacionesPresupuestoLinea.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPresupuestoLinea"));		
		
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonModificarPresupuestoLinea.addActionListener(new ButtonActionListener(this,"ModificarPresupuestoLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonModificarToolBarPresupuestoLinea.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresupuestoLinea"));
			
			this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemModificarPresupuestoLinea.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresupuestoLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonActualizarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"ActualizarPresupuestoLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonActualizarToolBarPresupuestoLinea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresupuestoLinea"));
				
			this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemActualizarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresupuestoLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonEliminarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"EliminarPresupuestoLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonEliminarToolBarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresupuestoLinea"));
						
			this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemEliminarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresupuestoLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonCancelarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"CancelarPresupuestoLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonCancelarToolBarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresupuestoLinea"));
			
			this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemCancelarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresupuestoLinea"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPresupuestoLinea"));		
		
		
		this.jButtonCerrarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"CerrarPresupuestoLinea"));
		
		
		this.jButtonCerrarToolBarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"CerrarToolBarPresupuestoLinea"));
			
		this.jMenuItemCerrarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPresupuestoLinea"));
			
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoLinea.jMenuItemDetalleCerrarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresupuestoLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonGuardarCambiosPresupuestoLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosPresupuestoLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoLinea.jButtonGuardarCambiosToolBarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestoLinea"));
		}
		
		this.jButtonCopiarToolBarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"CopiarToolBarPresupuestoLinea"));
			
		this.jButtonVerFormToolBarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"VerFormToolBarPresupuestoLinea"));
		
		this.jMenuItemGuardarCambiosPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPresupuestoLinea"));
			
		this.jMenuItemCopiarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPresupuestoLinea"));		
		
		this.jMenuItemVerFormPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPresupuestoLinea"));		
		
		
		this.jButtonGuardarCambiosTablaPresupuestoLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresupuestoLinea"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPresupuestoLinea"));
			
		this.jMenuItemGuardarCambiosTablaPresupuestoLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresupuestoLinea"));		
		
		
		
		this.jButtonRecargarInformacionPresupuestoLinea.addActionListener (new ButtonActionListener(this,"RecargarInformacionPresupuestoLinea"));
					
		this.jButtonRecargarInformacionToolBarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPresupuestoLinea"));
		
		this.jMenuItemRecargarInformacionPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPresupuestoLinea"));		
		
		
		
		this.jButtonAnterioresPresupuestoLinea.addActionListener (new ButtonActionListener(this,"AnterioresPresupuestoLinea"));
		
		
		this.jButtonAnterioresToolBarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPresupuestoLinea"));
		
		this.jMenuItemAnterioresPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPresupuestoLinea"));		
		
		
		this.jButtonSiguientesPresupuestoLinea.addActionListener (new ButtonActionListener(this,"SiguientesPresupuestoLinea"));
		
		
		this.jButtonSiguientesToolBarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPresupuestoLinea"));
			
		this.jMenuItemSiguientesPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPresupuestoLinea"));
			
		this.jMenuItemAbrirOrderByPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPresupuestoLinea"));
			
		this.jMenuItemMostrarOcultarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPresupuestoLinea"));
			
		this.jMenuItemDetalleAbrirOrderByPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPresupuestoLinea"));
			
		this.jMenuItemDetalleMostarOcultarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPresupuestoLinea"));		
		
		
		this.jButtonNuevoGuardarCambiosPresupuestoLinea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPresupuestoLinea"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPresupuestoLinea"));
			
		this.jMenuItemNuevoGuardarCambiosPresupuestoLinea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPresupuestoLinea"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPresupuestoLinea.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPresupuestoLinea"));

		this.jCheckBoxSeleccionadosPresupuestoLinea.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPresupuestoLinea"));
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxTiposAccionesFormularioPresupuestoLinea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresupuestoLinea"));
		}
		
		
		this.jComboBoxTiposRelacionesPresupuestoLinea.addActionListener (new ButtonActionListener(this,"TiposRelacionesPresupuestoLinea"));
			
		this.jComboBoxTiposAccionesPresupuestoLinea.addActionListener (new ButtonActionListener(this,"TiposAccionesPresupuestoLinea"));
					
		this.jComboBoxTiposSeleccionarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPresupuestoLinea"));
			
		this.jTextFieldValorCampoGeneralPresupuestoLinea.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPresupuestoLinea"));		
		
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonidPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestoLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonid_empresaPresupuestoLineaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonid_empresaPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonid_lineaPresupuestoLineaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaPresupuestoLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonid_lineaPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaPresupuestoLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonmargenPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"margenPresupuestoLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtondescuentoPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoPresupuestoLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtones_para_presupuestoPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"es_para_presupuestoPresupuestoLineaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdLineaPresupuestoLinea.addActionListener(new ButtonActionListener(this,"FK_IdLineaPresupuestoLinea"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPresupuestoLinea!=null) {
				this.jInternalFrameReporteDinamicoPresupuestoLinea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestoLinea"));
				this.jInternalFrameReporteDinamicoPresupuestoLinea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestoLinea"));
				this.jInternalFrameReporteDinamicoPresupuestoLinea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestoLinea"));
			}
			
			//this.jButtonCerrarReporteDinamicoPresupuestoLinea.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestoLinea"));				
			//this.jButtonGenerarReporteDinamicoPresupuestoLinea.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestoLinea"));
			//this.jButtonGenerarExcelReporteDinamicoPresupuestoLinea.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestoLinea"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPresupuestoLinea!=null) {
				this.jInternalFrameImportacionPresupuestoLinea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresupuestoLinea"));
				this.jInternalFrameImportacionPresupuestoLinea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresupuestoLinea"));
				this.jInternalFrameImportacionPresupuestoLinea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresupuestoLinea"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPresupuestoLinea.addActionListener (new ButtonActionListener(this,"AbrirOrderByPresupuestoLinea"));
			
			this.jButtonAbrirOrderByToolBarPresupuestoLinea.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPresupuestoLinea"));			
			
			if(this.jInternalFrameOrderByPresupuestoLinea!=null) {
				this.jInternalFrameOrderByPresupuestoLinea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresupuestoLinea"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoLinea.jTabbedPaneRelacionesPresupuestoLinea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresupuestoLinea"));
		
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
            		closingInternalFramePresupuestoLinea();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPresupuestoLinea.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPresupuestoLinea = (JInternalFrameBase)event.getSource();
	            	
	            PresupuestoLineaBeanSwingJInternalFrame jInternalFrameParent=(PresupuestoLineaBeanSwingJInternalFrame)jInternalFrameDetalleFormPresupuestoLinea.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPresupuestoLineaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPresupuestoLinea.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPresupuestoLineaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPresupuestoLinea.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPresupuestoLinea.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoLineaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoLineaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoLineaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPresupuestoLinea";
		inputMap = this.jButtonNuevoPresupuestoLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPresupuestoLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresupuestoLineaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoLineaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoLineaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoLineaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPresupuestoLinea";
		inputMap = this.jButtonNuevoRelacionesPresupuestoLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPresupuestoLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresupuestoLineaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPresupuestoLinea";
		inputMap = this.jButtonModificarPresupuestoLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPresupuestoLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPresupuestoLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPresupuestoLinea";
		inputMap = this.jButtonActualizarPresupuestoLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPresupuestoLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPresupuestoLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPresupuestoLinea";
		inputMap = this.jButtonEliminarPresupuestoLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPresupuestoLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPresupuestoLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPresupuestoLinea";
		inputMap = this.jButtonCancelarPresupuestoLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPresupuestoLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPresupuestoLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPresupuestoLinea";
		inputMap = this.jButtonCerrarPresupuestoLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPresupuestoLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPresupuestoLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonGuardarCambiosPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPresupuestoLinea";
		inputMap = this.jInternalFrameDetalleFormPresupuestoLinea.jButtonGuardarCambiosPresupuestoLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonGuardarCambiosPresupuestoLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPresupuestoLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPresupuestoLinea.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPresupuestoLineaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPresupuestoLinea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPresupuestoLineaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPresupuestoLinea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPresupuestoLineaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPresupuestoLinea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPresupuestoLineaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonidPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestoLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonid_empresaPresupuestoLineaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonid_empresaPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonid_lineaPresupuestoLineaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaPresupuestoLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonid_lineaPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaPresupuestoLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtonmargenPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"margenPresupuestoLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtondescuentoPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoPresupuestoLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoLinea.jButtones_para_presupuestoPresupuestoLineaBusqueda.addActionListener(new ButtonActionListener(this,"es_para_presupuestoPresupuestoLineaBusqueda"));
		
		
		this.jButtonFK_IdLineaPresupuestoLinea.addActionListener(new ButtonActionListener(this,"FK_IdLineaPresupuestoLinea"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPresupuestoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPresupuestoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPresupuestoLineaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPresupuestoLinea.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPresupuestoLinea(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PresupuestoLinea presupuestolineaAux:this.presupuestolineaLogic.getPresupuestoLineas()) {
					presupuestolineaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoLinea presupuestolineaAux:presupuestolineas) {
					presupuestolineaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPresupuestoLineaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresupuestoLinea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresupuestoLinea presupuestolineaAux:this.presupuestolineaLogic.getPresupuestoLineas()) {
						presupuestolineaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestoLinea presupuestolineaAux:presupuestolineas) {
						presupuestolineaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PresupuestoLinea presupuestolineaAux:this.presupuestolineaLogic.getPresupuestoLineas()) {
					
						if(sTipoSeleccionar.equals(PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO)) {
							existe=true;
							presupuestolineaAux.setes_para_presupuesto(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestoLinea presupuestolineaAux:presupuestolineas) {
						
						if(sTipoSeleccionar.equals(PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO)) {
							existe=true;
							presupuestolineaAux.setes_para_presupuesto(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPresupuestoLinea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresupuestoLinea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresupuestoLinea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoLinea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPresupuestoLineaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresupuestoLinea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPresupuestoLinea.getSelectedRows();
			
			PresupuestoLinea presupuestolineaLocal=new PresupuestoLinea();
			
			//this.seleccionarTodosPresupuestoLinea(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestolineaLocal =(PresupuestoLinea) this.presupuestolineaLogic.getPresupuestoLineas().toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					presupuestolineaLocal =(PresupuestoLinea) this.presupuestolineas.toArray()[this.jTableDatosPresupuestoLinea.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				presupuestolineaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresupuestoLinea presupuestolineaAux:this.presupuestolineaLogic.getPresupuestoLineas()) {
						presupuestolineaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestoLinea presupuestolineaAux:presupuestolineas) {
						presupuestolineaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPresupuestoLinea(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresupuestoLinea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresupuestoLinea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoLinea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPresupuestoLineaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPresupuestoLineaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPresupuestoLineaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPresupuestoLinea(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPresupuestoLinea.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresupuestoLinea presupuestolineaAux:this.presupuestolineaLogic.getPresupuestoLineas()) {
				
						if(sTipoSeleccionar.equals(PresupuestoLineaConstantesFunciones.LABEL_MARGEN)) {
							existe=true;
							presupuestolineaAux.setmargen(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoLineaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							presupuestolineaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoLinea presupuestolineaAux:presupuestolineas) {
					
						if(sTipoSeleccionar.equals(PresupuestoLineaConstantesFunciones.LABEL_MARGEN)) {
							existe=true;
							presupuestolineaAux.setmargen(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoLineaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							presupuestolineaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPresupuestoLinea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPresupuestoLineaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPresupuestoLinea(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPresupuestoLinea=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPresupuestoLinea.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxTiposAccionesFormularioPresupuestoLinea.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePresupuestoLinea) {				
					conSplash=true;//false;										
					
					//this.startProcessPresupuestoLinea(conSplash);
				
					this.generarReportePresupuestoLineasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxTiposAccionesFormularioPresupuestoLinea.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPresupuestoLineasSeleccionados();
				//this.jComboBoxTiposAccionesPresupuestoLinea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresupuestoLineasSeleccionados(false);
				//this.jComboBoxTiposAccionesPresupuestoLinea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresupuestoLineasSeleccionados(true);
				//this.jComboBoxTiposAccionesPresupuestoLinea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresupuestoLinea();
				
				this.exportarPresupuestoLineasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxTiposAccionesFormularioPresupuestoLinea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPresupuestoLineas();
				//this.importarPresupuestoLineas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxTiposAccionesFormularioPresupuestoLinea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresupuestoLinea();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPresupuestoLineasSeleccionados();
				//this.jComboBoxTiposAccionesPresupuestoLinea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Presupuesto Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPresupuestoLinea();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPresupuestoLinea)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPresupuestoLinea(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Presupuesto Linea",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxTiposAccionesFormularioPresupuestoLinea.setSelectedIndex(0);					
				}	
			} 			
			else if(PresupuestoLineaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePresupuestoLinea) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPresupuestoLinea(conSplash);
					
						//this.actualizarParametrosGeneralPresupuestoLinea();
						
						this.generarReporteProcesoAccionPresupuestoLineasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPresupuestoLinea.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxTiposAccionesFormularioPresupuestoLinea.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PresupuestoLineaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Presupuesto LineaES SELECCIONADOS?", "MANTENIMIENTO DE Presupuesto Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPresupuestoLinea();
				
						this.actualizarParametrosGeneralPresupuestoLinea();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.presupuestolineaReturnGeneral=presupuestolineaLogic.procesarAccionPresupuestoLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.presupuestolineaLogic.getPresupuestoLineas(),this.presupuestolineaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPresupuestoLineaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresupuestoLinea.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxTiposAccionesFormularioPresupuestoLinea.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPresupuestoLinea();
					
					PresupuestoLineaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPresupuestoLineaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresupuestoLinea.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxTiposAccionesFormularioPresupuestoLinea.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPresupuestoLinea(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPresupuestoLineaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPresupuestoLinea();
			
			if(this.jInternalFrameDetalleFormPresupuestoLinea==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PresupuestoLinea> presupuestolineasSeleccionados=new ArrayList<PresupuestoLinea>();		
			PresupuestoLinea presupuestolinea=new PresupuestoLinea();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPresupuestoLinea(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPresupuestoLinea.getSelectedItem();
			
			
			
			
			presupuestolineasSeleccionados=this.getPresupuestoLineasSeleccionados(true);
			//this.sTipoAccion;
			
			if(presupuestolineasSeleccionados.size()==1) {
				for(PresupuestoLinea presupuestolineaAux:presupuestolineasSeleccionados) {
					presupuestolinea=presupuestolineaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPresupuestoLinea();
			
      		//this.finishProcessPresupuestoLinea(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPresupuestoLineaReturnGeneral() throws Exception {
		if(this.presupuestolineaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.presupuestolineaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.presupuestolineaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.presupuestolineaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.presupuestolineaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.presupuestolineaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPresupuestoLinea(false);
		}
		
		if(this.presupuestolineaReturnGeneral.getConRetornoLista() || this.presupuestolineaReturnGeneral.getConRetornoObjeto()) {
			if(this.presupuestolineaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presupuestolineaLogic.setPresupuestoLineas(this.presupuestolineaReturnGeneral.getPresupuestoLineas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.presupuestolineaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presupuestolineaLogic.setPresupuestoLinea(this.presupuestolineaReturnGeneral.getPresupuestoLinea());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPresupuestoLinea(false);
		}
	}
	
	public void actualizarParametrosGeneralPresupuestoLinea() throws Exception {
		
		
	}
	
	public ArrayList<PresupuestoLinea> getPresupuestoLineasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PresupuestoLinea> presupuestolineasSeleccionados=new ArrayList<PresupuestoLinea>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPresupuestoLinea) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PresupuestoLinea presupuestolineaAux:presupuestolineaLogic.getPresupuestoLineas()) {
					if(presupuestolineaAux.getIsSelected()) {
						presupuestolineasSeleccionados.add(presupuestolineaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoLinea presupuestolineaAux:this.presupuestolineas) {
					if(presupuestolineaAux.getIsSelected()) {
						presupuestolineasSeleccionados.add(presupuestolineaAux);				
					}
				}
			}
			
			if(presupuestolineasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						presupuestolineasSeleccionados.addAll(this.presupuestolineaLogic.getPresupuestoLineas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						presupuestolineasSeleccionados.addAll(this.presupuestolineas);				
					}
				}
			}
		} else {
			presupuestolineasSeleccionados.add(this.presupuestolinea);
		}
		
		return presupuestolineasSeleccionados;
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
	
	public void generarReportePresupuestoLineasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPresupuestoLineasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPresupuestoLineasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresupuestoLineasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresupuestoLineasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Presupuesto Linea",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPresupuestoLineasSeleccionados() throws Exception {
		ArrayList<PresupuestoLinea> presupuestolineasSeleccionados=new ArrayList<PresupuestoLinea>();		
		
		presupuestolineasSeleccionados=this.getPresupuestoLineasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePresupuestoLineas("Todos",presupuestolineasSeleccionados);
		
	}	
	
	public void generarReporteNormalPresupuestoLineasSeleccionados() throws Exception {
		ArrayList<PresupuestoLinea> presupuestolineasSeleccionados=new ArrayList<PresupuestoLinea>();		
		
		presupuestolineasSeleccionados=this.getPresupuestoLineasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePresupuestoLineas("Todos",presupuestolineasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPresupuestoLineasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PresupuestoLinea> presupuestolineasSeleccionados=new ArrayList<PresupuestoLinea>();
		
		presupuestolineasSeleccionados=this.getPresupuestoLineasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePresupuestoLineas("Todos",presupuestolineasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPresupuestoLineasSeleccionados() throws Exception {
		ArrayList<PresupuestoLinea> presupuestolineasSeleccionados=new ArrayList<PresupuestoLinea>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPresupuestoLinea();
		
		
		presupuestolineasSeleccionados=this.getPresupuestoLineasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPresupuestoLinea();
		
		
		//this.generarReportePresupuestoLineas("Todos",presupuestolineasSeleccionados ,presupuestolineaImplementable,presupuestolineaImplementableHome);
	}
	
	public void mostrarImportacionPresupuestoLineas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPresupuestoLinea();
		
		this.abrirFrameImportacionPresupuestoLinea();		
		
			
		//this.generarReportePresupuestoLineas("Todos",presupuestolineasSeleccionados ,presupuestolineaImplementable,presupuestolineaImplementableHome);
	}
	
	public void importarPresupuestoLineas() throws Exception {		
	
	}
	
	public void exportarPresupuestoLineasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPresupuestoLineasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPresupuestoLineasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPresupuestoLineasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Presupuesto Linea",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPresupuestoLineasSeleccionados() throws Exception {
		ArrayList<PresupuestoLinea> presupuestolineasSeleccionados=new ArrayList<PresupuestoLinea>();		
		
		presupuestolineasSeleccionados=this.getPresupuestoLineasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestolinea."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPresupuestoLinea(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PresupuestoLinea presupuestolineaAux:presupuestolineasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPresupuestoLinea(presupuestolineaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//presupuestolineaAux.setsDetalleGeneralEntityReporte(presupuestolineaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Linea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPresupuestoLinea(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PresupuestoLineaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoLineaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoLineaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoLineaConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoLineaConstantesFunciones.LABEL_MARGEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoLineaConstantesFunciones.LABEL_DESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPresupuestoLinea(PresupuestoLinea presupuestolinea,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=presupuestolinea.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestolinea.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestolinea.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestolinea.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestolinea.getmargen().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestolinea.getdescuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestolinea.getes_para_presupuesto().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPresupuestoLineasSeleccionados() throws Exception {
		ArrayList<PresupuestoLinea> presupuestolineasSeleccionados=new ArrayList<PresupuestoLinea>();		
		
		presupuestolineasSeleccionados=this.getPresupuestoLineasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestolinea.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PresupuestoLineas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPresupuestoLinea(row);				
				iRow++;
			}				
			
			for(PresupuestoLinea presupuestolineaAux:presupuestolineasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPresupuestoLinea(presupuestolineaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Linea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPresupuestoLineasSeleccionados() throws Exception {
		ArrayList<PresupuestoLinea> presupuestolineasSeleccionados=new ArrayList<PresupuestoLinea>();		
		
		presupuestolineasSeleccionados=this.getPresupuestoLineasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestolinea.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("presupuestolineas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("presupuestolinea");
			//elementRoot.appendChild(element);
		
			for(PresupuestoLinea presupuestolineaAux:presupuestolineasSeleccionados) {
				element = document.createElement("presupuestolinea");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPresupuestoLinea(presupuestolineaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Linea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPresupuestoLinea(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoLineaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoLineaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoLineaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoLineaConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoLineaConstantesFunciones.LABEL_MARGEN);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoLineaConstantesFunciones.LABEL_DESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPresupuestoLinea(PresupuestoLinea presupuestolinea,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestolinea.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestolinea.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestolinea.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestolinea.getmargen());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestolinea.getdescuento());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestolinea.getes_para_presupuesto());				
	}
	
	public void setFilaDatosExportarXmlPresupuestoLinea(PresupuestoLinea presupuestolinea,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PresupuestoLineaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(presupuestolinea.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PresupuestoLineaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(presupuestolinea.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PresupuestoLineaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(presupuestolinea.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementlinea_descripcion = document.createElement(PresupuestoLineaConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(presupuestolinea.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementmargen = document.createElement(PresupuestoLineaConstantesFunciones.MARGEN);
		elementmargen.appendChild(document.createTextNode(presupuestolinea.getmargen().toString().trim()));
		element.appendChild(elementmargen);

		Element elementdescuento = document.createElement(PresupuestoLineaConstantesFunciones.DESCUENTO);
		elementdescuento.appendChild(document.createTextNode(presupuestolinea.getdescuento().toString().trim()));
		element.appendChild(elementdescuento);

		Element elementes_para_presupuesto = document.createElement(PresupuestoLineaConstantesFunciones.ESPARAPRESUPUESTO);
		elementes_para_presupuesto.appendChild(document.createTextNode(presupuestolinea.getes_para_presupuesto().toString().trim()));
		element.appendChild(elementes_para_presupuesto);
	}
	
	public void generarReporteGroupGenericoPresupuestoLineasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PresupuestoLinea> presupuestolineasSeleccionados=new ArrayList<PresupuestoLinea>();
		
		presupuestolineasSeleccionados=this.getPresupuestoLineasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPresupuestoLinea(presupuestolineasSeleccionados);
		
		this.generarReportePresupuestoLineas("Todos",presupuestolineasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPresupuestoLinea(ArrayList<PresupuestoLinea> presupuestolineasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PresupuestoLinea presupuestolineaAux:presupuestolineasSeleccionados) {
				presupuestolineaAux.setsDetalleGeneralEntityReporte(presupuestolineaAux.toString());
			
				if(sTipoSeleccionar.equals(PresupuestoLineaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					presupuestolineaAux.setsDescripcionGeneralEntityReporte1(presupuestolineaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoLineaConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					presupuestolineaAux.setsDescripcionGeneralEntityReporte1(presupuestolineaAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoLineaConstantesFunciones.LABEL_ESPARAPRESUPUESTO)) {
					existe=true;
					presupuestolineaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(presupuestolineaAux.getes_para_presupuesto()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPresupuestoLinea(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPresupuestoLinea=true;
				this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea=true;
				this.isVisibilidadCeldaGuardarCambiosPresupuestoLinea=true;
			}
			
			this.isVisibilidadCeldaModificarPresupuestoLinea=false;
			this.isVisibilidadCeldaActualizarPresupuestoLinea=false;
			this.isVisibilidadCeldaEliminarPresupuestoLinea=false;
			this.isVisibilidadCeldaCancelarPresupuestoLinea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoLinea=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPresupuestoLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoLinea=false;
			this.isVisibilidadCeldaModificarPresupuestoLinea=false;
			this.isVisibilidadCeldaActualizarPresupuestoLinea=true;
			this.isVisibilidadCeldaEliminarPresupuestoLinea=false;
			this.isVisibilidadCeldaCancelarPresupuestoLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoLinea=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPresupuestoLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoLinea=false;
			this.isVisibilidadCeldaModificarPresupuestoLinea=false;
			this.isVisibilidadCeldaActualizarPresupuestoLinea=true;
			this.isVisibilidadCeldaEliminarPresupuestoLinea=true;
			this.isVisibilidadCeldaCancelarPresupuestoLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoLinea=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPresupuestoLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoLinea=false;
			this.isVisibilidadCeldaModificarPresupuestoLinea=false;
			this.isVisibilidadCeldaActualizarPresupuestoLinea=true;
			this.isVisibilidadCeldaEliminarPresupuestoLinea=false;
			this.isVisibilidadCeldaCancelarPresupuestoLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoLinea=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoLinea=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPresupuestoLinea=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea=true;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoLinea=true;
			this.isVisibilidadCeldaModificarPresupuestoLinea=false;
			this.isVisibilidadCeldaActualizarPresupuestoLinea=false;
			this.isVisibilidadCeldaEliminarPresupuestoLinea=false;
			this.isVisibilidadCeldaCancelarPresupuestoLinea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoLinea=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPresupuestoLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoLinea=false;
			this.isVisibilidadCeldaActualizarPresupuestoLinea=false;
			this.isVisibilidadCeldaEliminarPresupuestoLinea=false;
			this.isVisibilidadCeldaCancelarPresupuestoLinea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoLinea=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoLinea=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPresupuestoLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoLinea=false;
			this.isVisibilidadCeldaModificarPresupuestoLinea=true;
			this.isVisibilidadCeldaActualizarPresupuestoLinea=false;
			this.isVisibilidadCeldaEliminarPresupuestoLinea=false;
			this.isVisibilidadCeldaCancelarPresupuestoLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoLinea=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoLinea=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PresupuestoLineaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPresupuestoLinea=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea=true;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoLinea=true;
		} else {
			this.actualizarEstadoPanelsPresupuestoLinea(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPresupuestoLinea=false;
			//this.isVisibilidadCeldaVerFormPresupuestoLinea=false;
			this.isVisibilidadCeldaDuplicarPresupuestoLinea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!presupuestolineaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea=false;
		} else {
			this.isVisibilidadCeldaNuevoPresupuestoLinea=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoLinea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(presupuestolineaSessionBean.getEsGuardarRelacionado()) {
			if(!presupuestolineaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea=false;												
			}
			
			this.jButtonCerrarPresupuestoLinea.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoLinea=false;
		}
		
		if(!this.permiteMantenimiento(this.presupuestolinea)) {
			this.isVisibilidadCeldaActualizarPresupuestoLinea=false;
			this.isVisibilidadCeldaEliminarPresupuestoLinea=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPresupuestoLinea() {
	}
	
	public void actualizarEstadoPanelsPresupuestoLinea(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPresupuestoLinea!=null) {
				this.jScrollPanelDatosEdicionPresupuestoLinea.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoLinea!=null) {
				this.jTabbedPaneBusquedasPresupuestoLinea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoLinea!=null) {
				this.jScrollPanelDatosPresupuestoLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoLinea!=null) {
				this.jPanelPaginacionPresupuestoLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoLinea!=null) {
				this.jPanelParametrosReportesPresupuestoLinea.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPresupuestoLinea!=null) {
				this.jScrollPanelDatosEdicionPresupuestoLinea.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoLinea!=null) {
				this.jTabbedPaneBusquedasPresupuestoLinea.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPresupuestoLinea!=null) {
				this.jScrollPanelDatosPresupuestoLinea.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestoLinea!=null) {
				this.jPanelPaginacionPresupuestoLinea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestoLinea!=null) {
				this.jPanelParametrosReportesPresupuestoLinea.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPresupuestoLinea!=null) {
				this.jScrollPanelDatosEdicionPresupuestoLinea.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoLinea!=null) {
				this.jTabbedPaneBusquedasPresupuestoLinea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoLinea!=null) {
				this.jScrollPanelDatosPresupuestoLinea.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestoLinea!=null) {
				this.jPanelPaginacionPresupuestoLinea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestoLinea!=null) {
				this.jPanelParametrosReportesPresupuestoLinea.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPresupuestoLinea!=null) {
				this.jScrollPanelDatosEdicionPresupuestoLinea.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoLinea!=null) {
				this.jTabbedPaneBusquedasPresupuestoLinea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoLinea!=null) {
				this.jScrollPanelDatosPresupuestoLinea.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestoLinea!=null) {
				this.jPanelPaginacionPresupuestoLinea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestoLinea!=null) {
				this.jPanelParametrosReportesPresupuestoLinea.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPresupuestoLinea!=null) {
				this.jScrollPanelDatosEdicionPresupuestoLinea.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoLinea!=null) {
				this.jTabbedPaneBusquedasPresupuestoLinea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoLinea!=null) {
				this.jScrollPanelDatosPresupuestoLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoLinea!=null) {
				this.jPanelPaginacionPresupuestoLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoLinea!=null) {
				this.jPanelParametrosReportesPresupuestoLinea.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPresupuestoLinea!=null) {
				this.jScrollPanelDatosEdicionPresupuestoLinea.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoLinea!=null) {
				this.jTabbedPaneBusquedasPresupuestoLinea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoLinea!=null) {
				this.jScrollPanelDatosPresupuestoLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoLinea!=null) {
				this.jPanelPaginacionPresupuestoLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoLinea!=null) {
				this.jPanelParametrosReportesPresupuestoLinea.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPresupuestoLinea!=null) {
				this.jScrollPanelDatosEdicionPresupuestoLinea.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoLinea!=null) {
				this.jTabbedPaneBusquedasPresupuestoLinea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoLinea!=null) {
				this.jScrollPanelDatosPresupuestoLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoLinea!=null) {
				this.jPanelPaginacionPresupuestoLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoLinea!=null) {
				this.jPanelParametrosReportesPresupuestoLinea.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPresupuestoLinea!=null) {
					this.jTabbedPaneBusquedasPresupuestoLinea.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPresupuestoLinea!=null) {
				this.jPanelParametrosReportesPresupuestoLinea.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoLinea!=null) {
				this.jTabbedPaneBusquedasPresupuestoLinea.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPresupuestoLinea!=null) {
				this.jPanelParametrosReportesPresupuestoLinea.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdLinea=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasPresupuestoLinea.remove(jPanelFK_IdLineaPresupuestoLinea);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadFK_IdLinea=isParaLinea;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasPresupuestoLinea.remove(jPanelFK_IdLineaPresupuestoLinea);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PresupuestoLineaSessionBean presupuestolineaSessionBean=new PresupuestoLineaSessionBean();
		
		if(this.presupuestolineaSessionBean==null) {
			this.presupuestolineaSessionBean=new PresupuestoLineaSessionBean();
		}
		
		this.presupuestolineaSessionBean.setsUltimaBusquedaPresupuestoLinea(this.getsAccionBusqueda());
		this.presupuestolineaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.presupuestolineaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			presupuestolineaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdLinea")) {
			presupuestolineaSessionBean.setid_linea(this.getid_lineaFK_IdLinea());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PresupuestoLineaSessionBean presupuestolineaSessionBean=new PresupuestoLineaSessionBean();
		
		if(this.presupuestolineaSessionBean==null) {
			this.presupuestolineaSessionBean=new PresupuestoLineaSessionBean();
		}
		
		if(this.presupuestolineaSessionBean.getsUltimaBusquedaPresupuestoLinea()!=null&&!this.presupuestolineaSessionBean.getsUltimaBusquedaPresupuestoLinea().equals("")) {
			this.setsAccionBusqueda(presupuestolineaSessionBean.getsUltimaBusquedaPresupuestoLinea());
			this.setiNumeroPaginacion(presupuestolineaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(presupuestolineaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(presupuestolineaSessionBean.getid_empresa());
				presupuestolineaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdLinea")) {
				this.setid_lineaFK_IdLinea(presupuestolineaSessionBean.getid_linea());
				presupuestolineaSessionBean.setid_linea(-1L);
			}
		}
		
		this.presupuestolineaSessionBean.setsUltimaBusquedaPresupuestoLinea("");
		this.presupuestolineaSessionBean.setiNumeroPaginacion(PresupuestoLineaConstantesFunciones.INUMEROPAGINACION);
		this.presupuestolineaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPresupuestoLinea(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPresupuestoLinea() {
		this.updateBorderResaltarBusquedasFormularioPresupuestoLinea();
		this.updateVisibilidadBusquedasFormularioPresupuestoLinea();
		this.updateHabilitarBusquedasFormularioPresupuestoLinea();
	}
	
	public void updateBorderResaltarBusquedasFormularioPresupuestoLinea() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPresupuestoLinea.getComponents().length>0) {
	

		if(this.presupuestolineaConstantesFunciones.resaltarFK_IdLineaPresupuestoLinea!=null) {
			index= this.jTabbedPaneBusquedasPresupuestoLinea.indexOfComponent(this.jPanelFK_IdLineaPresupuestoLinea);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoLinea.getComponent(index);
				jPanel.setBorder(this.presupuestolineaConstantesFunciones.resaltarFK_IdLineaPresupuestoLinea);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPresupuestoLinea() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPresupuestoLinea.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresupuestoLinea.indexOfComponent(this.jPanelFK_IdLineaPresupuestoLinea);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoLinea.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presupuestolineaConstantesFunciones.mostrarFK_IdLineaPresupuestoLinea);
			if(!this.presupuestolineaConstantesFunciones.mostrarFK_IdLineaPresupuestoLinea && index>-1) {
				this.jTabbedPaneBusquedasPresupuestoLinea.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPresupuestoLinea() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPresupuestoLinea.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresupuestoLinea.indexOfComponent(this.jPanelFK_IdLineaPresupuestoLinea);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoLinea.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presupuestolineaConstantesFunciones.activarFK_IdLineaPresupuestoLinea);
				this.jTabbedPaneBusquedasPresupuestoLinea.setEnabledAt(index,this.presupuestolineaConstantesFunciones.activarFK_IdLineaPresupuestoLinea);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPresupuestoLinea(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdLinea")) {
			index= this.jTabbedPaneBusquedasPresupuestoLinea.indexOfComponent(this.jPanelFK_IdLineaPresupuestoLinea);

			this.jTabbedPaneBusquedasPresupuestoLinea.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoLinea.getComponent(index);

			this.presupuestolineaConstantesFunciones.setResaltarFK_IdLineaPresupuestoLinea(resaltar);

			jPanel.setBorder(this.presupuestolineaConstantesFunciones.resaltarFK_IdLineaPresupuestoLinea);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPresupuestoLinea.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPresupuestoLinea() throws Exception {

		if(this.jInternalFrameDetalleFormPresupuestoLinea==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPresupuestoLinea();
		this.updateVisibilidadResaltarControlesFormularioPresupuestoLinea();
		this.updateHabilitarResaltarControlesFormularioPresupuestoLinea();
		
	}
	
	public void updateBorderResaltarControlesFormularioPresupuestoLinea() throws Exception {
		if(this.jInternalFrameDetalleFormPresupuestoLinea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.presupuestolineaConstantesFunciones.resaltaridPresupuestoLinea!=null && this.jInternalFrameDetalleFormPresupuestoLinea!=null) {this.jInternalFrameDetalleFormPresupuestoLinea.jLabelidPresupuestoLinea.setBorder(this.presupuestolineaConstantesFunciones.resaltaridPresupuestoLinea);}
		if(this.presupuestolineaConstantesFunciones.resaltarid_empresaPresupuestoLinea!=null && this.jInternalFrameDetalleFormPresupuestoLinea!=null) {this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_empresaPresupuestoLinea.setBorder(this.presupuestolineaConstantesFunciones.resaltarid_empresaPresupuestoLinea);}
		if(this.presupuestolineaConstantesFunciones.resaltarid_lineaPresupuestoLinea!=null && this.jInternalFrameDetalleFormPresupuestoLinea!=null) {this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_lineaPresupuestoLinea.setBorder(this.presupuestolineaConstantesFunciones.resaltarid_lineaPresupuestoLinea);}
		if(this.presupuestolineaConstantesFunciones.resaltarmargenPresupuestoLinea!=null && this.jInternalFrameDetalleFormPresupuestoLinea!=null) {this.jInternalFrameDetalleFormPresupuestoLinea.jTextFieldmargenPresupuestoLinea.setBorder(this.presupuestolineaConstantesFunciones.resaltarmargenPresupuestoLinea);}
		if(this.presupuestolineaConstantesFunciones.resaltardescuentoPresupuestoLinea!=null && this.jInternalFrameDetalleFormPresupuestoLinea!=null) {this.jInternalFrameDetalleFormPresupuestoLinea.jTextFielddescuentoPresupuestoLinea.setBorder(this.presupuestolineaConstantesFunciones.resaltardescuentoPresupuestoLinea);}
		if(this.presupuestolineaConstantesFunciones.resaltares_para_presupuestoPresupuestoLinea!=null && this.jInternalFrameDetalleFormPresupuestoLinea!=null) {this.jInternalFrameDetalleFormPresupuestoLinea.jCheckBoxes_para_presupuestoPresupuestoLinea.setBorderPainted(true);this.jInternalFrameDetalleFormPresupuestoLinea.jCheckBoxes_para_presupuestoPresupuestoLinea.setBorder(this.presupuestolineaConstantesFunciones.resaltares_para_presupuestoPresupuestoLinea);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPresupuestoLinea() throws Exception {		
		if(this.jInternalFrameDetalleFormPresupuestoLinea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
	
		//this.jInternalFrameDetalleFormPresupuestoLinea.jLabelidPresupuestoLinea.setVisible(this.presupuestolineaConstantesFunciones.mostraridPresupuestoLinea);
		this.jInternalFrameDetalleFormPresupuestoLinea.jPanelidPresupuestoLinea.setVisible(this.presupuestolineaConstantesFunciones.mostraridPresupuestoLinea);
		//this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_empresaPresupuestoLinea.setVisible(this.presupuestolineaConstantesFunciones.mostrarid_empresaPresupuestoLinea);
		this.jInternalFrameDetalleFormPresupuestoLinea.jPanelid_empresaPresupuestoLinea.setVisible(this.presupuestolineaConstantesFunciones.mostrarid_empresaPresupuestoLinea);
		//this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_lineaPresupuestoLinea.setVisible(this.presupuestolineaConstantesFunciones.mostrarid_lineaPresupuestoLinea);
		this.jInternalFrameDetalleFormPresupuestoLinea.jPanelid_lineaPresupuestoLinea.setVisible(this.presupuestolineaConstantesFunciones.mostrarid_lineaPresupuestoLinea);
		//this.jInternalFrameDetalleFormPresupuestoLinea.jTextFieldmargenPresupuestoLinea.setVisible(this.presupuestolineaConstantesFunciones.mostrarmargenPresupuestoLinea);
		this.jInternalFrameDetalleFormPresupuestoLinea.jPanelmargenPresupuestoLinea.setVisible(this.presupuestolineaConstantesFunciones.mostrarmargenPresupuestoLinea);
		//this.jInternalFrameDetalleFormPresupuestoLinea.jTextFielddescuentoPresupuestoLinea.setVisible(this.presupuestolineaConstantesFunciones.mostrardescuentoPresupuestoLinea);
		this.jInternalFrameDetalleFormPresupuestoLinea.jPaneldescuentoPresupuestoLinea.setVisible(this.presupuestolineaConstantesFunciones.mostrardescuentoPresupuestoLinea);
		//this.jInternalFrameDetalleFormPresupuestoLinea.jCheckBoxes_para_presupuestoPresupuestoLinea.setVisible(this.presupuestolineaConstantesFunciones.mostrares_para_presupuestoPresupuestoLinea);
		this.jInternalFrameDetalleFormPresupuestoLinea.jPaneles_para_presupuestoPresupuestoLinea.setVisible(this.presupuestolineaConstantesFunciones.mostrares_para_presupuestoPresupuestoLinea);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPresupuestoLinea() throws Exception {
		if(this.jInternalFrameDetalleFormPresupuestoLinea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresupuestoLinea!=null) {
	
		this.jInternalFrameDetalleFormPresupuestoLinea.jLabelidPresupuestoLinea.setEnabled(this.presupuestolineaConstantesFunciones.activaridPresupuestoLinea);
		this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_empresaPresupuestoLinea.setEnabled(this.presupuestolineaConstantesFunciones.activarid_empresaPresupuestoLinea);
		this.jInternalFrameDetalleFormPresupuestoLinea.jComboBoxid_lineaPresupuestoLinea.setEnabled(this.presupuestolineaConstantesFunciones.activarid_lineaPresupuestoLinea);
		this.jInternalFrameDetalleFormPresupuestoLinea.jTextFieldmargenPresupuestoLinea.setEnabled(this.presupuestolineaConstantesFunciones.activarmargenPresupuestoLinea);
		this.jInternalFrameDetalleFormPresupuestoLinea.jTextFielddescuentoPresupuestoLinea.setEnabled(this.presupuestolineaConstantesFunciones.activardescuentoPresupuestoLinea);
		this.jInternalFrameDetalleFormPresupuestoLinea.jCheckBoxes_para_presupuestoPresupuestoLinea.setEnabled(this.presupuestolineaConstantesFunciones.activares_para_presupuestoPresupuestoLinea);
		}
	}
	
		
}