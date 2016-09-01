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

import com.bydan.erp.inventario.util.ParametroInvenConstantesFunciones;
import com.bydan.erp.inventario.util.ParametroInvenParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ParametroInvenParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.ParametroInvenBean;
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
public class ParametroInvenBeanSwingJInternalFrame extends ParametroInvenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParametroInvenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ParametroInven> parametroinvenValidator = new ClassValidator<ParametroInven>(ParametroInven.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ParametroInven parametroinven;	
	public ParametroInven parametroinvenAux;
	public ParametroInven parametroinvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ParametroInven parametroinvenTotales;
	public Long idParametroInvenActual;
	public Long iIdNuevoParametroInven=0L;
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
	
	public Boolean isPermisoTodoParametroInven;
	public Boolean isPermisoNuevoParametroInven;
	public Boolean isPermisoActualizarParametroInven;
	public Boolean isPermisoActualizarOriginalParametroInven;
	public Boolean isPermisoEliminarParametroInven;
	public Boolean isPermisoGuardarCambiosParametroInven;
	public Boolean isPermisoConsultaParametroInven;
	public Boolean isPermisoBusquedaParametroInven;
	public Boolean isPermisoReporteParametroInven;
	public Boolean isPermisoPaginacionMedioParametroInven;
	public Boolean isPermisoPaginacionAltoParametroInven;
	public Boolean isPermisoPaginacionTodoParametroInven;
	public Boolean isPermisoCopiarParametroInven;
	public Boolean isPermisoVerFormParametroInven;
	public Boolean isPermisoDuplicarParametroInven;
	public Boolean isPermisoOrdenParametroInven;
	
	
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
	
	public ParametroInvenParameterReturnGeneral parametroinvenReturnGeneral;
	public ParametroInvenParameterReturnGeneral parametroinvenParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParametroInven=false;
	public Boolean esParaAccionDesdeFormularioParametroInven=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParametroInvenSessionBeanAdditional parametroinvenSessionBeanAdditional=null;
	
	public ParametroInvenSessionBeanAdditional getParametroInvenSessionBeanAdditional() {
		return this.parametroinvenSessionBeanAdditional;
	}
	
	public void setParametroInvenSessionBeanAdditional(ParametroInvenSessionBeanAdditional parametroinvenSessionBeanAdditional) {
		try {
			this.parametroinvenSessionBeanAdditional=parametroinvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParametroInvenBeanSwingJInternalFrameAdditional parametroinvenBeanSwingJInternalFrameAdditional=null;
	//public class ParametroInvenBeanSwingJInternalFrame
	
	public ParametroInvenBeanSwingJInternalFrameAdditional getParametroInvenBeanSwingJInternalFrameAdditional() {
		return this.parametroinvenBeanSwingJInternalFrameAdditional;
	}
	
	public void setParametroInvenBeanSwingJInternalFrameAdditional(ParametroInvenBeanSwingJInternalFrameAdditional parametroinvenBeanSwingJInternalFrameAdditional) {
		try {
			this.parametroinvenBeanSwingJInternalFrameAdditional=parametroinvenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParametroInvenLogic parametroinvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ParametroInven parametroinvenBean;
	public ParametroInvenConstantesFunciones parametroinvenConstantesFunciones;
	//public ParametroInvenParameterReturnGeneral parametroinvenReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ParametroInven> parametroinvens;	
	//public List<ParametroInven> parametroinvensEliminados;
	//public List<ParametroInven> parametroinvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParametroInven=false;
	public Boolean isVisibilidadCeldaDuplicarParametroInven=true;
	public Boolean isVisibilidadCeldaCopiarParametroInven=true;
	public Boolean isVisibilidadCeldaVerFormParametroInven=true;
	public Boolean isVisibilidadCeldaOrdenParametroInven=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParametroInven=false;
	public Boolean isVisibilidadCeldaModificarParametroInven=false;
	public Boolean isVisibilidadCeldaActualizarParametroInven=false;
	public Boolean isVisibilidadCeldaEliminarParametroInven=false;
	public Boolean isVisibilidadCeldaCancelarParametroInven=false;
	public Boolean isVisibilidadCeldaGuardarParametroInven=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParametroInven=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoParametroInven() {
		return this.iIdNuevoParametroInven;
	}

	public void setiIdNuevoParametroInven(Long iIdNuevoParametroInven) {
		this.iIdNuevoParametroInven = iIdNuevoParametroInven;
	}
	
	public Long getidParametroInvenActual() {
		return this.idParametroInvenActual;
	}

	public void setidParametroInvenActual(Long idParametroInvenActual) {
		this.idParametroInvenActual = idParametroInvenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ParametroInven getparametroinven() {
		return this.parametroinven;
	}

	public void setparametroinven(ParametroInven parametroinven) {
		this.parametroinven = parametroinven;
	}
	
	public ParametroInven getparametroinvenAux() {
		return this.parametroinvenAux;
	}

	public void setparametroinvenAux(ParametroInven parametroinvenAux) {
		this.parametroinvenAux = parametroinvenAux;
	}				
	
	public ParametroInven getparametroinvenAnterior() {
		return this.parametroinvenAnterior;
	}

	public void setparametroinvenAnterior(ParametroInven parametroinvenAnterior) {
		this.parametroinvenAnterior = parametroinvenAnterior;
	}	
	
	public ParametroInven getparametroinvenTotales() {
		return this.parametroinvenTotales;
	}

	public void setparametroinvenTotales(ParametroInven parametroinvenTotales) {
		this.parametroinvenTotales = parametroinvenTotales;
	}	
	
	public ParametroInven getparametroinvenBean() {
		return this.parametroinvenBean;
	}

	public void setparametroinvenBean(ParametroInven parametroinvenBean) {
		this.parametroinvenBean = parametroinvenBean;
	}	
	
	public ParametroInvenParameterReturnGeneral getparametroinvenReturnGeneral() {
		return this.parametroinvenReturnGeneral;
	}

	public void setparametroinvenReturnGeneral(ParametroInvenParameterReturnGeneral parametroinvenReturnGeneral) {
		this.parametroinvenReturnGeneral = parametroinvenReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ParametroInvenLogic getParametroInvenLogic()	{		
		return parametroinvenLogic;
	}

	public void setParametroInvenLogic(ParametroInvenLogic parametroinvenLogic) {
		this.parametroinvenLogic = parametroinvenLogic;
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
	
	public Boolean getIsEsNuevoParametroInven() {
		return isEsNuevoParametroInven;
	}

	public void setIsEsNuevoParametroInven(Boolean isEsNuevoParametroInven) {
		this.isEsNuevoParametroInven = isEsNuevoParametroInven;
	}

	public Boolean getEsParaAccionDesdeFormularioParametroInven() {
		return esParaAccionDesdeFormularioParametroInven;
	}
	
	public void setEsParaAccionDesdeFormularioParametroInven(Boolean esParaAccionDesdeFormularioParametroInven) {
		this.esParaAccionDesdeFormularioParametroInven = esParaAccionDesdeFormularioParametroInven;
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

			if(this.parametroinvenSessionBean==null) {
				this.parametroinvenSessionBean=new ParametroInvenSessionBean();
			}

			if(!this.parametroinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(parametroinvenSessionBean.getlidEmpresaActual());
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

					if(this.parametroinven!=null) {
						this.parametroinven.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroInven!=null) {
						this.jInternalFrameDetalleFormParametroInven.jComboBoxid_empresaParametroInven.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaParametroInven.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormParametroInven!=null) {
						if(this.jInternalFrameDetalleFormParametroInven.jComboBoxid_empresaParametroInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroInven.jComboBoxid_empresaParametroInven.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaParametroInvenGenerico)throws Exception
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
				jComboBoxid_empresaParametroInvenGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaParametroInvenGenerico!=null && jComboBoxid_empresaParametroInvenGenerico.getItemCount()>0) {
					jComboBoxid_empresaParametroInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ParametroInven parametroinven,JComboBox jComboBoxid_empresaParametroInvenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaParametroInvenGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormParametroInven.jComboBoxid_empresaParametroInven.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaParametroInvenGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				parametroinven.setid_empresa(empresaAux.getId());
				parametroinven.setempresa_descripcion(ParametroInvenConstantesFunciones.getEmpresaDescripcion(empresaAux));
				parametroinven.setEmpresa(empresaAux);			}
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

					if(!ParametroInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroInven!=null) { 
							this.jInternalFrameDetalleFormParametroInven.jComboBoxid_empresaParametroInven.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormParametroInven.jComboBoxid_empresaParametroInven.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroInven!=null) { 
					}

					if(!ParametroInvenJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormParametroInven!=null) {
							this.jInternalFrameDetalleFormParametroInven.jComboBoxid_empresaParametroInven.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroInven!=null) {
							this.jInternalFrameDetalleFormParametroInven.jComboBoxid_empresaParametroInven.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesParametroInven() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParametroInvenConstantesFunciones.refrescarForeignKeysDescripcionesParametroInven(this.parametroinvenLogic.getParametroInvens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParametroInvenConstantesFunciones.refrescarForeignKeysDescripcionesParametroInven(this.parametroinvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parametroinvenLogic.setParametroInvens(this.parametroinvens);
			parametroinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParametroInvenParameterReturnGeneral getParametroInvenParameterGeneral() {
		return this.parametroinvenParameterGeneral;
	}
	
	public void setParametroInvenParameterGeneral(ParametroInvenParameterReturnGeneral parametroinvenParameterGeneral) {
		this.parametroinvenParameterGeneral = parametroinvenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParametroInven() {
		return isPermisoTodoParametroInven;
	}

	public void setIsPermisoTodoParametroInven(Boolean isPermisoTodoParametroInven) {
		this.isPermisoTodoParametroInven = isPermisoTodoParametroInven;
	}

	public Boolean getIsPermisoNuevoParametroInven() {
		return isPermisoNuevoParametroInven;
	}

	public void setIsPermisoNuevoParametroInven(Boolean isPermisoNuevoParametroInven) {
		this.isPermisoNuevoParametroInven = isPermisoNuevoParametroInven;
	}

	public Boolean getIsPermisoActualizarParametroInven() {
		return isPermisoActualizarParametroInven;
	}

	public void setIsPermisoActualizarParametroInven(Boolean isPermisoActualizarParametroInven) {
		this.isPermisoActualizarParametroInven = isPermisoActualizarParametroInven;
	}

	public Boolean getIsPermisoEliminarParametroInven() {
		return isPermisoEliminarParametroInven;
	}

	public void setIsPermisoEliminarParametroInven(Boolean isPermisoEliminarParametroInven) {
		this.isPermisoEliminarParametroInven = isPermisoEliminarParametroInven;
	}

	public Boolean getIsPermisoGuardarCambiosParametroInven() {
		return isPermisoGuardarCambiosParametroInven;
	}

	public void setIsPermisoGuardarCambiosParametroInven(Boolean isPermisoGuardarCambiosParametroInven) {
		this.isPermisoGuardarCambiosParametroInven = isPermisoGuardarCambiosParametroInven;
	}
	
	public Boolean getIsPermisoConsultaParametroInven() {
		return isPermisoConsultaParametroInven;
	}

	public void setIsPermisoConsultaParametroInven(Boolean isPermisoConsultaParametroInven) {
		this.isPermisoConsultaParametroInven = isPermisoConsultaParametroInven;
	}

	public Boolean getIsPermisoBusquedaParametroInven() {
		return isPermisoBusquedaParametroInven;
	}

	public void setIsPermisoBusquedaParametroInven(Boolean isPermisoBusquedaParametroInven) {
		this.isPermisoBusquedaParametroInven = isPermisoBusquedaParametroInven;
	}

	public Boolean getIsPermisoReporteParametroInven() {
		return isPermisoReporteParametroInven;
	}

	public void setIsPermisoReporteParametroInven(Boolean isPermisoReporteParametroInven) {
		this.isPermisoReporteParametroInven = isPermisoReporteParametroInven;
	}
	
	public Boolean getIsPermisoPaginacionMedioParametroInven() {
		return isPermisoPaginacionMedioParametroInven;
	}

	public void setIsPermisoPaginacionMedioParametroInven(Boolean isPermisoPaginacionMedioParametroInven) {
		this.isPermisoPaginacionMedioParametroInven = isPermisoPaginacionMedioParametroInven;
	}
	
	public Boolean getIsPermisoPaginacionTodoParametroInven() {
		return isPermisoPaginacionTodoParametroInven;
	}

	public void setIsPermisoPaginacionTodoParametroInven(Boolean isPermisoPaginacionTodoParametroInven) {
		this.isPermisoPaginacionTodoParametroInven = isPermisoPaginacionTodoParametroInven;
	}
	
	public Boolean getIsPermisoPaginacionAltoParametroInven() {
		return isPermisoPaginacionAltoParametroInven;
	}

	public void setIsPermisoPaginacionAltoParametroInven(Boolean isPermisoPaginacionAltoParametroInven) {
		this.isPermisoPaginacionAltoParametroInven = isPermisoPaginacionAltoParametroInven;
	}
	
	public Boolean getIsPermisoCopiarParametroInven() {
		return isPermisoCopiarParametroInven;
	}

	public void setIsPermisoCopiarParametroInven(Boolean isPermisoCopiarParametroInven) {
		this.isPermisoCopiarParametroInven = isPermisoCopiarParametroInven;
	}
	
	public Boolean getIsPermisoVerFormParametroInven() {
		return isPermisoVerFormParametroInven;
	}

	public void setIsPermisoVerFormParametroInven(Boolean isPermisoVerFormParametroInven) {
		this.isPermisoVerFormParametroInven = isPermisoVerFormParametroInven;
	}
	
	public Boolean getIsPermisoDuplicarParametroInven() {
		return isPermisoDuplicarParametroInven;
	}

	public void setIsPermisoDuplicarParametroInven(Boolean isPermisoDuplicarParametroInven) {
		this.isPermisoDuplicarParametroInven = isPermisoDuplicarParametroInven;
	}
	
	public Boolean getIsPermisoOrdenParametroInven() {
		return isPermisoOrdenParametroInven;
	}

	public void setIsPermisoOrdenParametroInven(Boolean isPermisoOrdenParametroInven) {
		this.isPermisoOrdenParametroInven = isPermisoOrdenParametroInven;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParametroInven() {
		return isVisibilidadCeldaNuevoParametroInven;
	}

	public void setIsVisibilidadCeldaNuevoParametroInven(Boolean isVisibilidadCeldaNuevoParametroInven) {
		this.isVisibilidadCeldaNuevoParametroInven = isVisibilidadCeldaNuevoParametroInven;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParametroInven() {
		return isVisibilidadCeldaDuplicarParametroInven;
	}

	public void setIsVisibilidadCeldaDuplicarParametroInven(Boolean isVisibilidadCeldaDuplicarParametroInven) {
		this.isVisibilidadCeldaDuplicarParametroInven = isVisibilidadCeldaDuplicarParametroInven;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParametroInven() {
		return isVisibilidadCeldaCopiarParametroInven;
	}

	public void setIsVisibilidadCeldaCopiarParametroInven(Boolean isVisibilidadCeldaCopiarParametroInven) {
		this.isVisibilidadCeldaCopiarParametroInven = isVisibilidadCeldaCopiarParametroInven;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParametroInven() {
		return isVisibilidadCeldaVerFormParametroInven;
	}

	public void setIsVisibilidadCeldaVerFormParametroInven(Boolean isVisibilidadCeldaVerFormParametroInven) {
		this.isVisibilidadCeldaVerFormParametroInven = isVisibilidadCeldaVerFormParametroInven;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParametroInven() {
		return isVisibilidadCeldaOrdenParametroInven;
	}

	public void setIsVisibilidadCeldaOrdenParametroInven(Boolean isVisibilidadCeldaOrdenParametroInven) {
		this.isVisibilidadCeldaOrdenParametroInven = isVisibilidadCeldaOrdenParametroInven;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParametroInven() {
		return isVisibilidadCeldaNuevoRelacionesParametroInven;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParametroInven(Boolean isVisibilidadCeldaNuevoRelacionesParametroInven) {
		this.isVisibilidadCeldaNuevoRelacionesParametroInven = isVisibilidadCeldaNuevoRelacionesParametroInven;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParametroInven() {
		return isVisibilidadCeldaModificarParametroInven;
	}

	public void setIsVisibilidadCeldaModificarParametroInven(Boolean isVisibilidadCeldaModificarParametroInven) {
		this.isVisibilidadCeldaModificarParametroInven = isVisibilidadCeldaModificarParametroInven;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParametroInven() {
		return isVisibilidadCeldaActualizarParametroInven;
	}

	public void setIsVisibilidadCeldaActualizarParametroInven(Boolean isVisibilidadCeldaActualizarParametroInven) {
		this.isVisibilidadCeldaActualizarParametroInven = isVisibilidadCeldaActualizarParametroInven;
	}

	public Boolean getIsVisibilidadCeldaEliminarParametroInven() {
		return isVisibilidadCeldaEliminarParametroInven;
	}

	public void setIsVisibilidadCeldaEliminarParametroInven(Boolean isVisibilidadCeldaEliminarParametroInven) {
		this.isVisibilidadCeldaEliminarParametroInven = isVisibilidadCeldaEliminarParametroInven;
	}

	public Boolean getIsVisibilidadCeldaCancelarParametroInven() {
		return isVisibilidadCeldaCancelarParametroInven;
	}

	public void setIsVisibilidadCeldaCancelarParametroInven(Boolean isVisibilidadCeldaCancelarParametroInven) {
		this.isVisibilidadCeldaCancelarParametroInven = isVisibilidadCeldaCancelarParametroInven;
	}

	public Boolean getIsVisibilidadCeldaGuardarParametroInven() {
		return isVisibilidadCeldaGuardarParametroInven;
	}

	public void setIsVisibilidadCeldaGuardarParametroInven(Boolean isVisibilidadCeldaGuardarParametroInven) {
		this.isVisibilidadCeldaGuardarParametroInven = isVisibilidadCeldaGuardarParametroInven;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParametroInven() {
		return isVisibilidadCeldaGuardarCambiosParametroInven;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParametroInven(Boolean isVisibilidadCeldaGuardarCambiosParametroInven) {
		this.isVisibilidadCeldaGuardarCambiosParametroInven = isVisibilidadCeldaGuardarCambiosParametroInven;
	}
		
	public ParametroInvenSessionBean getparametroinvenSessionBean() {
		return this.parametroinvenSessionBean;
	}
	
	public void setparametroinvenSessionBean(ParametroInvenSessionBean parametroinvenSessionBean) {
		this.parametroinvenSessionBean=parametroinvenSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParametroInven(ParametroInven parametroinven)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(parametroinven,null);
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
	
	public void bugActualizarReferenciaActual(ParametroInven parametroinven,ParametroInven parametroinvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParametroInven(parametroinven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parametroinvenAux.setId(parametroinven.getId());
		parametroinvenAux.setVersionRow(parametroinven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParametroInven();
		
			int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParametroInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parametroinvenValidator.getInvalidValues(this.parametroinven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parametroinvenLogic.setDatosCliente(datosCliente);
			parametroinvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parametroinvenAux=new  ParametroInven();
				
				parametroinvenAux.setIsNew(true);
				parametroinvenAux.setIsChanged(true);
				
				parametroinvenAux.setParametroInvenOriginal(this.parametroinven);
				
				parametroinvenAux.setId(this.parametroinven.getId());	
				parametroinvenAux.setVersionRow(this.parametroinven.getVersionRow());	
				parametroinvenAux.setid_empresa(this.parametroinven.getid_empresa());	
				parametroinvenAux.setsecuencial_pedido(this.parametroinven.getsecuencial_pedido());	
				parametroinvenAux.setnumero_serie(this.parametroinven.getnumero_serie());	
				parametroinvenAux.setnumero_decimales(this.parametroinven.getnumero_decimales());	
				parametroinvenAux.setnumero_items_requisicion(this.parametroinven.getnumero_items_requisicion());	
				parametroinvenAux.setcon_cuenta_contable(this.parametroinven.getcon_cuenta_contable());	
				parametroinvenAux.setcon_cuenta_contable_linea(this.parametroinven.getcon_cuenta_contable_linea());	
				parametroinvenAux.setcon_cuenta_banco(this.parametroinven.getcon_cuenta_banco());	
				parametroinvenAux.setcon_copiar_producto(this.parametroinven.getcon_copiar_producto());	
				parametroinvenAux.setcon_crear_producto_sucursal(this.parametroinven.getcon_crear_producto_sucursal());	
				parametroinvenAux.setcon_crear_lista_precio_sucursal_bodega(this.parametroinven.getcon_crear_lista_precio_sucursal_bodega());	
				parametroinvenAux.setcon_compras_aprobacion(this.parametroinven.getcon_compras_aprobacion());	
				parametroinvenAux.setcon_envio_mail(this.parametroinven.getcon_envio_mail());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametroinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametroinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parametroinvenAux,parametroinvenLogic.getParametroInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroinvenAux,parametroinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parametroinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametroinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroinvenLogic.saveParametroInvens();//WithConnection
						//parametroinvenLogic.getSetVersionRowParametroInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametroinven,parametroinvenAux);
					
					this.refrescarForeignKeysDescripcionesParametroInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametroinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametroinvenLogic.saveParametroInvenRelaciones(parametroinvenAux);//WithConnection
								//parametroinvenLogic.getSetVersionRowParametroInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametroinven,parametroinvenAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametroinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametroinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametroinvenAux,parametroinvenLogic.getParametroInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametroinvenAux,parametroinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametroinven,parametroinvenAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parametroinvenAux=new  ParametroInven();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parametroinvenSessionBean.getEsGuardarRelacionado() 
					|| (this.parametroinvenSessionBean.getEsGuardarRelacionado() && this.parametroinven.getId()>=0)) {
						
					parametroinvenAux.setIsNew(false);
				}
				
				parametroinvenAux.setIsDeleted(false);
			
				parametroinvenAux.setId(this.parametroinven.getId());	
				parametroinvenAux.setVersionRow(this.parametroinven.getVersionRow());	
				parametroinvenAux.setid_empresa(this.parametroinven.getid_empresa());	
				parametroinvenAux.setsecuencial_pedido(this.parametroinven.getsecuencial_pedido());	
				parametroinvenAux.setnumero_serie(this.parametroinven.getnumero_serie());	
				parametroinvenAux.setnumero_decimales(this.parametroinven.getnumero_decimales());	
				parametroinvenAux.setnumero_items_requisicion(this.parametroinven.getnumero_items_requisicion());	
				parametroinvenAux.setcon_cuenta_contable(this.parametroinven.getcon_cuenta_contable());	
				parametroinvenAux.setcon_cuenta_contable_linea(this.parametroinven.getcon_cuenta_contable_linea());	
				parametroinvenAux.setcon_cuenta_banco(this.parametroinven.getcon_cuenta_banco());	
				parametroinvenAux.setcon_copiar_producto(this.parametroinven.getcon_copiar_producto());	
				parametroinvenAux.setcon_crear_producto_sucursal(this.parametroinven.getcon_crear_producto_sucursal());	
				parametroinvenAux.setcon_crear_lista_precio_sucursal_bodega(this.parametroinven.getcon_crear_lista_precio_sucursal_bodega());	
				parametroinvenAux.setcon_compras_aprobacion(this.parametroinven.getcon_compras_aprobacion());	
				parametroinvenAux.setcon_envio_mail(this.parametroinven.getcon_envio_mail());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametroinvenAux,parametroinvenLogic.getParametroInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroinvenAux,parametroinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parametroinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametroinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroinvenLogic.saveParametroInvens();//WithConnection
						//parametroinvenLogic.getSetVersionRowParametroInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametroinven,parametroinvenAux);
					
					this.refrescarForeignKeysDescripcionesParametroInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametroinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametroinvenLogic.saveParametroInvenRelaciones(parametroinvenAux);//WithConnection
								//parametroinvenLogic.getSetVersionRowParametroInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametroinven,parametroinvenAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametroinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametroinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametroinvenAux,parametroinvenLogic.getParametroInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametroinvenAux,parametroinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametroinven,parametroinvenAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parametroinvenAux=new  ParametroInven();
				
				parametroinvenAux.setIsNew(false);
				parametroinvenAux.setIsChanged(false);
				
				parametroinvenAux.setIsDeleted(true);
				
				parametroinvenAux.setId(this.parametroinven.getId());	
				parametroinvenAux.setVersionRow(this.parametroinven.getVersionRow());	
				parametroinvenAux.setid_empresa(this.parametroinven.getid_empresa());	
				parametroinvenAux.setsecuencial_pedido(this.parametroinven.getsecuencial_pedido());	
				parametroinvenAux.setnumero_serie(this.parametroinven.getnumero_serie());	
				parametroinvenAux.setnumero_decimales(this.parametroinven.getnumero_decimales());	
				parametroinvenAux.setnumero_items_requisicion(this.parametroinven.getnumero_items_requisicion());	
				parametroinvenAux.setcon_cuenta_contable(this.parametroinven.getcon_cuenta_contable());	
				parametroinvenAux.setcon_cuenta_contable_linea(this.parametroinven.getcon_cuenta_contable_linea());	
				parametroinvenAux.setcon_cuenta_banco(this.parametroinven.getcon_cuenta_banco());	
				parametroinvenAux.setcon_copiar_producto(this.parametroinven.getcon_copiar_producto());	
				parametroinvenAux.setcon_crear_producto_sucursal(this.parametroinven.getcon_crear_producto_sucursal());	
				parametroinvenAux.setcon_crear_lista_precio_sucursal_bodega(this.parametroinven.getcon_crear_lista_precio_sucursal_bodega());	
				parametroinvenAux.setcon_compras_aprobacion(this.parametroinven.getcon_compras_aprobacion());	
				parametroinvenAux.setcon_envio_mail(this.parametroinven.getcon_envio_mail());	
				
				if(this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parametroinvenAux.getId()>=0) {	
						this.parametroinvensEliminados.add(parametroinvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parametroinvenAux,parametroinvenLogic.getParametroInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroinvenAux,parametroinvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parametroinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametroinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroinvenLogic.saveParametroInvens();//WithConnection
						//parametroinvenLogic.getSetVersionRowParametroInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametroinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametroinvenLogic.saveParametroInvenRelaciones(parametroinvenAux);//WithConnection
								//parametroinvenLogic.getSetVersionRowParametroInvens();//WithConnection
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
							if(this.parametroinvenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.parametroinvenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(parametroinvenAux,parametroinvenLogic.getParametroInvens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(parametroinvenAux,parametroinvens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.getParametroInvens().addAll(this.parametroinvensEliminados);
					
					parametroinvenLogic.saveParametroInvens();//WithConnection
					//parametroinvenLogic.getSetVersionRowParametroInvens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesParametroInven();
				
				this.parametroinvensEliminados= new ArrayList<ParametroInven>();		
			}
			
			if(this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parametro Inven GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Inven",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parametroinven=parametroinvenAux;
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
      		//this.finishProcessParametroInven();
      	}
		
	}	
	
	public void actualizarRelaciones(ParametroInven parametroinvenLocal) throws Exception {
		
		if(this.parametroinvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ParametroInven parametroinvenLocal) throws Exception {	
		if(this.parametroinvenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				parametroinvenLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarParametroInvenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parametroinvenValidator.getInvalidValues(this.parametroinven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroInven parametroinven,List<ParametroInven> parametroinvens) throws Exception {
		try	{		
			ParametroInvenConstantesFunciones.actualizarLista(parametroinven,parametroinvens,this.parametroinvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroInven parametroinven,List<ParametroInven> parametroinvens) throws Exception {
		try	{			
			ParametroInvenConstantesFunciones.actualizarSelectedLista(parametroinven,parametroinvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroInven> parametroinvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parametroinvensLocal=this.parametroinvenLogic.getParametroInvens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parametroinvensLocal=this.parametroinvens;
			}
			//ARCHITECTURE
		
			for(ParametroInven parametroinvenLocal:parametroinvensLocal) {
				if(this.permiteMantenimiento(parametroinvenLocal) && parametroinvenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParametroInvenConstantesFunciones.getParametroInvenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParametroInvenConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelid_empresaParametroInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroInvenConstantesFunciones.SECUENCIALPEDIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelsecuencial_pedidoParametroInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroInvenConstantesFunciones.NUMEROSERIE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelnumero_serieParametroInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroInvenConstantesFunciones.NUMERODECIMALES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelnumero_decimalesParametroInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroInvenConstantesFunciones.NUMEROITEMSREQUISICION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelnumero_items_requisicionParametroInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroInvenConstantesFunciones.CONCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelcon_cuenta_contableParametroInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroInvenConstantesFunciones.CONCUENTACONTABLELINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelcon_cuenta_contable_lineaParametroInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroInvenConstantesFunciones.CONCUENTABANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelcon_cuenta_bancoParametroInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroInvenConstantesFunciones.CONCOPIARPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelcon_copiar_productoParametroInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroInvenConstantesFunciones.CONCREARPRODUCTOSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelcon_crear_producto_sucursalParametroInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroInvenConstantesFunciones.CONCREARLISTAPRECIOSUCURSALBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelcon_crear_lista_precio_sucursal_bodegaParametroInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroInvenConstantesFunciones.CONCOMPRASAPROBACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelcon_compras_aprobacionParametroInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroInvenConstantesFunciones.CONENVIOMAIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelcon_envio_mailParametroInven,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroInven.jLabelid_empresaParametroInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroInven.jLabelsecuencial_pedidoParametroInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroInven.jLabelnumero_serieParametroInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroInven.jLabelnumero_decimalesParametroInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroInven.jLabelnumero_items_requisicionParametroInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroInven.jLabelcon_cuenta_contableParametroInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroInven.jLabelcon_cuenta_contable_lineaParametroInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroInven.jLabelcon_cuenta_bancoParametroInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroInven.jLabelcon_copiar_productoParametroInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroInven.jLabelcon_crear_producto_sucursalParametroInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroInven.jLabelcon_crear_lista_precio_sucursal_bodegaParametroInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroInven.jLabelcon_compras_aprobacionParametroInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroInven.jLabelcon_envio_mailParametroInven,"");
		
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
		this.iIdNuevoParametroInven--;	
		
		
		this.parametroinvenAux=new ParametroInven();
		
		this.parametroinvenAux.setId(this.iIdNuevoParametroInven);
		this.parametroinvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametroinvenLogic.getParametroInvens().add(this.parametroinvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parametroinvens.add(this.parametroinvenAux);
		}
		//ARCHITECTURE
		
		this.parametroinven=this.parametroinvenAux;
		
		if(ParametroInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParametroInven(this.parametroinven);
			this.setVariablesObjetoActualToFormularioForeignKeyParametroInven(this.parametroinven);
		}
				
		//this.setDefaultControlesParametroInven();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParametroInven();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParametroInven();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroInven();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroInven(this.parametroinvenBean,this.parametroinven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParametroInvenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parametroinvenSessionBean.getConGuardarRelaciones()) {
			classes=ParametroInvenConstantesFunciones.getClassesRelationshipsOfParametroInven(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parametroinvenReturnGeneral=parametroinvenLogic.procesarEventosParametroInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametroinvenLogic.getParametroInvens(),this.parametroinven,this.parametroinvenParameterGeneral,this.isEsNuevoParametroInven,classes);//this.parametroinvenLogic.getParametroInven()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParametroInven(this.parametroinvenReturnGeneral,this.parametroinvenBean,false);
		
		if(this.parametroinvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParametroInven(this.parametroinvenReturnGeneral.getParametroInven());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParametroInven(this.parametroinvenReturnGeneral.getParametroInven());
		}
		
		if(this.parametroinvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParametroInven(this.parametroinvenReturnGeneral.getParametroInven(),classes);//this.parametroinvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParametroInven();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParametroInven();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroInvenBeanSwingJInternalFrameAdditional.RecargarFormParametroInven(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParametroInven(false);
						
			if(parametroinvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParametroInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroInven();
			}
			
			this.actualizarVisualTableDatosParametroInven();
			
			this.jTableDatosParametroInven.setRowSelectionInterval(this.getIndiceNuevoParametroInven(), this.getIndiceNuevoParametroInven());
			
			this.seleccionarFilaTablaParametroInvenActual();
						
			this.actualizarEstadoCeldasBotonesParametroInven("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParametroInven(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormParametroInven.jTextFieldsecuencial_pedidoParametroInven.setEnabled(isHabilitar && this.parametroinvenConstantesFunciones.activarsecuencial_pedidoParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_serieParametroInven.setEnabled(isHabilitar && this.parametroinvenConstantesFunciones.activarnumero_serieParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_decimalesParametroInven.setEnabled(isHabilitar && this.parametroinvenConstantesFunciones.activarnumero_decimalesParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_items_requisicionParametroInven.setEnabled(isHabilitar && this.parametroinvenConstantesFunciones.activarnumero_items_requisicionParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contableParametroInven.setEnabled(isHabilitar && this.parametroinvenConstantesFunciones.activarcon_cuenta_contableParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contable_lineaParametroInven.setEnabled(isHabilitar && this.parametroinvenConstantesFunciones.activarcon_cuenta_contable_lineaParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_bancoParametroInven.setEnabled(isHabilitar && this.parametroinvenConstantesFunciones.activarcon_cuenta_bancoParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_copiar_productoParametroInven.setEnabled(isHabilitar && this.parametroinvenConstantesFunciones.activarcon_copiar_productoParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_producto_sucursalParametroInven.setEnabled(isHabilitar && this.parametroinvenConstantesFunciones.activarcon_crear_producto_sucursalParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven.setEnabled(isHabilitar && this.parametroinvenConstantesFunciones.activarcon_crear_lista_precio_sucursal_bodegaParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_compras_aprobacionParametroInven.setEnabled(isHabilitar && this.parametroinvenConstantesFunciones.activarcon_compras_aprobacionParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_envio_mailParametroInven.setEnabled(isHabilitar && this.parametroinvenConstantesFunciones.activarcon_envio_mailParametroInven);	
		//
		this.jInternalFrameDetalleFormParametroInven.jComboBoxid_empresaParametroInven.setEnabled(isHabilitar && this.parametroinvenConstantesFunciones.activarid_empresaParametroInven);
	};
	
	public void setDefaultControlesParametroInven() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParametroInven(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parametroinvenSessionBean.setConGuardarRelaciones(true);			
			this.parametroinvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParametroInven.jTabbedPaneRelacionesParametroInven.setVisible(true);
			
					
		} else {
			//this.parametroinvenSessionBean.setConGuardarRelaciones(false);			
			this.parametroinvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParametroInven.jTabbedPaneRelacionesParametroInven.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParametroInven() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroInven parametroinvenAux:this.parametroinvenLogic.getParametroInvens()) {
				if(parametroinvenAux.getId().equals(this.iIdNuevoParametroInven)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroInven parametroinvenAux:this.parametroinvens) {
				if(parametroinvenAux.getId().equals(this.iIdNuevoParametroInven)) {
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
	
	public int getIndiceActualParametroInven(ParametroInven parametroinven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroInven parametroinvenAux:this.parametroinvenLogic.getParametroInvens()) {
				if(parametroinvenAux.getId().equals(parametroinven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroInven parametroinvenAux:this.parametroinvens) {
				if(parametroinvenAux.getId().equals(parametroinven.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParametroInven(ParametroInven parametroinvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroInven parametroinvenAux:this.parametroinvenLogic.getParametroInvens()) {
				if(parametroinvenAux.getParametroInvenOriginal().getId().equals(parametroinvenOriginal.getId())) {
					existe=true;
					parametroinvenOriginal.setId(parametroinvenAux.getId());
					parametroinvenOriginal.setVersionRow(parametroinvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroInven parametroinvenAux:this.parametroinvens) {
				if(parametroinvenAux.getParametroInvenOriginal().getId().equals(parametroinvenOriginal.getId())) {
					existe=true;
					parametroinvenOriginal.setId(parametroinvenAux.getId());
					parametroinvenOriginal.setVersionRow(parametroinvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParametroInven(Boolean esParaCancelar) throws Exception {
		parametroinvensAux=new ArrayList<ParametroInven>();
		parametroinvenAux=new ParametroInven();
		
		if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroInven parametroinvenAux:this.parametroinvenLogic.getParametroInvens()) {
					if(parametroinvenAux.getId()<0) {
						parametroinvensAux.add(parametroinvenAux);
					}		
				}
				this.iIdNuevoParametroInven=0L;
				this.parametroinvenLogic.getParametroInvens().removeAll(parametroinvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroInven parametroinvenAux:this.parametroinvens) {
					if(parametroinvenAux.getId()<0) {
						parametroinvensAux.add(parametroinvenAux);
					}		
				}
				this.iIdNuevoParametroInven=0L;
				this.parametroinvens.removeAll(parametroinvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParametroInven 
					&& this.parametroinvenLogic.getParametroInvens().size()>0
					) {
					parametroinvenAux=this.parametroinvenLogic.getParametroInvens().get(this.parametroinvenLogic.getParametroInvens().size() - 1);
				
					if(parametroinvenAux.getId()<0) {
						this.parametroinvenLogic.getParametroInvens().remove(parametroinvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParametroInven && this.parametroinvens.size()>0) {
					parametroinvenAux=this.parametroinvens.get(this.parametroinvens.size() - 1);
				
					if(parametroinvenAux.getId()<0) {
						this.parametroinvens.remove(parametroinvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParametroInven(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parametroinven.getId()<0) {
				this.parametroinvenLogic.getParametroInvens().remove(this.parametroinven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parametroinven.getId()<0) {
				this.parametroinvens.remove(this.parametroinven);
			}
		}			
	}
	
	public void setEstadosInicialesParametroInven(List<ParametroInven> parametroinvensAux) throws Exception {
		ParametroInvenConstantesFunciones.setEstadosInicialesParametroInven(parametroinvensAux);
	}
	
	public void setEstadosInicialesParametroInven(ParametroInven parametroinvenAux) throws Exception {
		ParametroInvenConstantesFunciones.setEstadosInicialesParametroInven(parametroinvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParametroInvenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParametroInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParametroInvenActual()) {
				if(!this.isEsNuevoParametroInven) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParametroInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParametroInven=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParametroInvenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parametro Inven ?", "MANTENIMIENTO DE Parametro Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParametroInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ParametroInven parametroinven) throws Exception {
		ParametroInvenConstantesFunciones.seleccionarAsignar(this.parametroinven,parametroinven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParametroInven=this.isPermisoActualizarOriginalParametroInven;
			
			
			this.seleccionarAsignar(parametroinven);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroInvenConstantesFunciones.quitarEspaciosParametroInven(this.parametroinven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParametroInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parametroinvenSessionBean.setsFuncionBusquedaRapida(this.parametroinvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoParametroInven) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParametroInven(esParaCancelar);				
				this.cancelarNuevoParametroInven(esParaCancelar);								
			}
			
			this.parametroinven=new ParametroInven();
			
			this.inicializarParametroInven();
			
			this.actualizarEstadoCeldasBotonesParametroInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParametroInven() throws Exception {
		try {
			ParametroInvenConstantesFunciones.inicializarParametroInven(this.parametroinven);
			
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
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parametroinvenLogic.getParametroInvens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParametroInvens(String sAccionBusqueda,List<ParametroInven> parametroinvensParaReportes) throws Exception {
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
					sPathReporteFinal="ParametroInven"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParametroInvenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParametroInvenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ParametroInven"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parametro Invenes");		
		parameters.put("busquedapor", ParametroInvenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParametroInven=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParametroInvenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParametroInvenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParametroInven=new JRBeanArrayDataSource(ParametroInvenJInternalFrame.TraerParametroInvenBeans(parametroinvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParametroInven);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParametroInvenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParametroInvenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParametroInvenBean.TraerParametroInvenBeans(parametroinvensParaReportes).toArray()));
							
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
				this.generarExcelReporteParametroInvens(sAccionBusqueda,sTipoArchivoReporte,parametroinvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParametroInvens(sAccionBusqueda,sTipoArchivoReporte,parametroinvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParametroInvenActionPerformed(null);
					//this.generarExcelReporteParametroInvens(sAccionBusqueda,sTipoArchivoReporte,parametroinvensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParametroInvens(sAccionBusqueda,sTipoArchivoReporte,parametroinvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParametroInvens(sAccionBusqueda,sTipoArchivoReporte,parametroinvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParametroInvens(sAccionBusqueda,sTipoArchivoReporte,parametroinvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParametroInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroInven> parametroinvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroinven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroInvens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroInven("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ParametroInven parametroinven : parametroinvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParametroInvenConstantesFunciones.generarExcelReporteDataParametroInven("NORMAL",row,workbook,parametroinven,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParametroInven(String sTipo,Row row,Workbook workbook) {
		
		ParametroInvenConstantesFunciones.generarExcelReporteHeaderParametroInven(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParametroInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroInven> parametroinvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroinven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ParametroInven parametroinven : parametroinvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParametroInvenConstantesFunciones.getParametroInvenDescripcion(parametroinven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroInvenConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroinven.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroinven.getsecuencial_pedido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroinven.getnumero_serie());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroinven.getnumero_decimales());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroinven.getnumero_items_requisicion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametroinven.getcon_cuenta_contable()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametroinven.getcon_cuenta_contable_linea()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametroinven.getcon_cuenta_banco()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametroinven.getcon_copiar_producto()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametroinven.getcon_crear_producto_sucursal()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametroinven.getcon_crear_lista_precio_sucursal_bodega()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametroinven.getcon_compras_aprobacion()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametroinven.getcon_envio_mail()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParametroInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroInven> parametroinvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ParametroInven> parametroinvensRespaldo=null;
		
		classes=ParametroInvenConstantesFunciones.getClassesRelationshipsOfParametroInven(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parametroinvenLogic.setDatosCliente(this.datosCliente);
		this.parametroinvenLogic.setDatosDeep(this.datosDeep);
		this.parametroinvenLogic.setIsConDeep(true);
		
		parametroinvensRespaldo=this.parametroinvenLogic.getParametroInvens();
		
		this.parametroinvenLogic.setParametroInvens(parametroinvensParaReportes);	
		this.parametroinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parametroinvensParaReportes=this.parametroinvenLogic.getParametroInvens();
		this.parametroinvenLogic.setParametroInvens(parametroinvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroinven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroInven("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ParametroInven parametroinven : parametroinvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParametroInven("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParametroInvenConstantesFunciones.generarExcelReporteDataParametroInven("NORMAL",row,workbook,parametroinven,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParametroInvenConstantesFunciones.getParametroInvenDescripcion(parametroinven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroInven.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroInven.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParametroInven() throws Exception {		
		this.startProcessParametroInven(true);
	}
	
	public void startProcessParametroInven(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasParametroInven ,this.jPanelParametrosReportesParametroInven, this.jScrollPanelDatosParametroInven,this.jPanelPaginacionParametroInven, this.jScrollPanelDatosEdicionParametroInven, this.jPanelAccionesParametroInven,this.jPanelAccionesFormularioParametroInven,this.jmenuBarParametroInven,this.jmenuBarDetalleParametroInven,this.jTtoolBarParametroInven,this.jTtoolBarDetalleParametroInven);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroInven=this.jTabbedPaneBusquedasParametroInven; 
		
		final JPanel jPanelParametrosReportesParametroInven=this.jPanelParametrosReportesParametroInven;
		//final JScrollPane jScrollPanelDatosParametroInven=this.jScrollPanelDatosParametroInven;
		final JTable jTableDatosParametroInven=this.jTableDatosParametroInven;		
		final JPanel jPanelPaginacionParametroInven=this.jPanelPaginacionParametroInven;
		//final JScrollPane jScrollPanelDatosEdicionParametroInven=this.jScrollPanelDatosEdicionParametroInven;
		final JPanel jPanelAccionesParametroInven=this.jPanelAccionesParametroInven;
		
		JPanel jPanelCamposAuxiliarParametroInven=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParametroInven=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) {
			jPanelCamposAuxiliarParametroInven=this.jInternalFrameDetalleFormParametroInven.jPanelCamposParametroInven;
			jPanelAccionesFormularioAuxiliarParametroInven=this.jInternalFrameDetalleFormParametroInven.jPanelAccionesFormularioParametroInven;
		}
		
		final JPanel jPanelCamposParametroInven=jPanelCamposAuxiliarParametroInven;
		final JPanel jPanelAccionesFormularioParametroInven=jPanelAccionesFormularioAuxiliarParametroInven;
		
		
		final JMenuBar jmenuBarParametroInven=this.jmenuBarParametroInven;
		final JToolBar jTtoolBarParametroInven=this.jTtoolBarParametroInven;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParametroInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroInven=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) {
			jmenuBarDetalleAuxiliarParametroInven=this.jInternalFrameDetalleFormParametroInven.jmenuBarDetalleParametroInven;
			jTtoolBarDetalleAuxiliarParametroInven=this.jInternalFrameDetalleFormParametroInven.jTtoolBarDetalleParametroInven;
		}
		
		final JMenuBar jmenuBarDetalleParametroInven=jmenuBarDetalleAuxiliarParametroInven;
		final JToolBar jTtoolBarDetalleParametroInven=jTtoolBarDetalleAuxiliarParametroInven;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroInven;
			processRunnable.jTableDatos=jTableDatosParametroInven;
			processRunnable.jPanelCampos=jPanelCamposParametroInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroInven;
			processRunnable.jPanelAcciones=jPanelAccionesParametroInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroInven;
			
			
			processRunnable.jmenuBar=jmenuBarParametroInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroInven;
			processRunnable.jTtoolBar=jTtoolBarParametroInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroInven ,jPanelParametrosReportesParametroInven,jTableDatosParametroInven, /*jScrollPanelDatosParametroInven,*/jPanelCamposParametroInven,jPanelPaginacionParametroInven, /*jScrollPanelDatosEdicionParametroInven,*/ jPanelAccionesParametroInven,jPanelAccionesFormularioParametroInven,jmenuBarParametroInven,jmenuBarDetalleParametroInven,jTtoolBarParametroInven,jTtoolBarDetalleParametroInven);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroInven ,jPanelParametrosReportesParametroInven, jScrollPanelDatosParametroInven,jPanelPaginacionParametroInven, jScrollPanelDatosEdicionParametroInven, jPanelAccionesParametroInven,jPanelAccionesFormularioParametroInven,jmenuBarParametroInven,jmenuBarDetalleParametroInven,jTtoolBarParametroInven,jTtoolBarDetalleParametroInven);
						
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
	
	public void finishProcessParametroInven() {// throws Exception 
		this.finishProcessParametroInven(true);
	}
	
	public void finishProcessParametroInven(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasParametroInven ,this.jPanelParametrosReportesParametroInven, this.jScrollPanelDatosParametroInven,this.jPanelPaginacionParametroInven, this.jScrollPanelDatosEdicionParametroInven, this.jPanelAccionesParametroInven,this.jPanelAccionesFormularioParametroInven,this.jmenuBarParametroInven,this.jmenuBarDetalleParametroInven,this.jTtoolBarParametroInven,this.jTtoolBarDetalleParametroInven);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroInven=this.jTabbedPaneBusquedasParametroInven; 
		
		final JPanel jPanelParametrosReportesParametroInven=this.jPanelParametrosReportesParametroInven;
		//final JScrollPane jScrollPanelDatosParametroInven=this.jScrollPanelDatosParametroInven;
		final JTable jTableDatosParametroInven=this.jTableDatosParametroInven;		
		final JPanel jPanelPaginacionParametroInven=this.jPanelPaginacionParametroInven;
		//final JScrollPane jScrollPanelDatosEdicionParametroInven=this.jScrollPanelDatosEdicionParametroInven;
		final JPanel jPanelAccionesParametroInven=this.jPanelAccionesParametroInven;
		
		JPanel jPanelCamposAuxiliarParametroInven=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParametroInven=new JPanel();
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) {
			jPanelCamposAuxiliarParametroInven=this.jInternalFrameDetalleFormParametroInven.jPanelCamposParametroInven;
			jPanelAccionesFormularioAuxiliarParametroInven=this.jInternalFrameDetalleFormParametroInven.jPanelAccionesFormularioParametroInven;
		}
		
		final JPanel jPanelCamposParametroInven=jPanelCamposAuxiliarParametroInven;
		final JPanel jPanelAccionesFormularioParametroInven=jPanelAccionesFormularioAuxiliarParametroInven;
		
		
		final JMenuBar jmenuBarParametroInven=this.jmenuBarParametroInven;		
		final JToolBar jTtoolBarParametroInven=this.jTtoolBarParametroInven;
				
		JMenuBar jmenuBarDetalleAuxiliarParametroInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroInven=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) {
			jmenuBarDetalleAuxiliarParametroInven=this.jInternalFrameDetalleFormParametroInven.jmenuBarDetalleParametroInven;
			jTtoolBarDetalleAuxiliarParametroInven=this.jInternalFrameDetalleFormParametroInven.jTtoolBarDetalleParametroInven;		
		}
		
		final JMenuBar jmenuBarDetalleParametroInven=jmenuBarDetalleAuxiliarParametroInven;
		final JToolBar jTtoolBarDetalleParametroInven=jTtoolBarDetalleAuxiliarParametroInven;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroInven;
			processRunnable.jTableDatos=jTableDatosParametroInven;
			processRunnable.jPanelCampos=jPanelCamposParametroInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroInven;
			processRunnable.jPanelAcciones=jPanelAccionesParametroInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroInven;
			
			
			processRunnable.jmenuBar=jmenuBarParametroInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroInven;
			processRunnable.jTtoolBar=jTtoolBarParametroInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParametroInven ,jPanelParametrosReportesParametroInven, jTableDatosParametroInven,/*jScrollPanelDatosParametroInven,*/jPanelCamposParametroInven,jPanelPaginacionParametroInven, /*jScrollPanelDatosEdicionParametroInven,*/ jPanelAccionesParametroInven,jPanelAccionesFormularioParametroInven,jmenuBarParametroInven,jmenuBarDetalleParametroInven,jTtoolBarParametroInven,jTtoolBarDetalleParametroInven));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParametroInven(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParametroInven(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParametroInven(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParametroInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParametroInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParametroInven,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParametroInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParametroInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParametroInven,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parametroinvenConstantesFunciones.getsFinalQueryParametroInven();
		String  finalQueryPaginacionTodos=this.parametroinvenConstantesFunciones.getsFinalQueryParametroInven();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParametroInvenConstantesFunciones.getArrayColumnasGlobalesNoParametroInven(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParametroInvenConstantesFunciones.getArrayColumnasGlobalesParametroInven(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParametroInvenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parametroinvensEliminados= new ArrayList<ParametroInven>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParametroInven();
		
				///*ParametroInvenSessionBean*/this.parametroinvenSessionBean=new ParametroInvenSessionBean();
			
			if(this.parametroinvenSessionBean==null) {
				this.parametroinvenSessionBean=new ParametroInvenSessionBean();
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
					this.iNumeroPaginacion=ParametroInvenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParametroInvenConstantesFunciones.getClassesForeignKeysOfParametroInven(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parametroinven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parametroinvensAux= new ArrayList<ParametroInven>();
			
				
			parametroinvenLogic.setDatosCliente(this.datosCliente);
			parametroinvenLogic.setDatosDeep(this.datosDeep);
			parametroinvenLogic.setIsConDeep(true);
			
			
			parametroinvenLogic.getParametroInvenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parametroinvenLogic.getTodosParametroInvens(finalQueryGlobal,pagination);
					
					//parametroinvenLogic.getTodosParametroInvensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parametroinvenLogic.getParametroInvens()==null|| parametroinvenLogic.getParametroInvens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametroinvensAux= new ArrayList<ParametroInven>();
							parametroinvensAux.addAll(parametroinvenLogic.getParametroInvens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroinvensAux= new ArrayList<ParametroInven>();
							parametroinvensAux.addAll(parametroinvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametroinvenLogic.getTodosParametroInvens(finalQueryGlobal+"",this.pagination);												
							
							//parametroinvenLogic.getTodosParametroInvensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParametroInvens("Todos",parametroinvenLogic.getParametroInvens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametroinvenLogic.setParametroInvens(new ArrayList<ParametroInven>());					
							parametroinvenLogic.getParametroInvens().addAll(parametroinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroinvens=new ArrayList<ParametroInven>();
							parametroinvens.addAll(parametroinvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParametroInven=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParametroInven=this.idActual;
				
				} else if(this.idParametroInvenActual!=null && this.idParametroInvenActual!=0L) {
					idParametroInven=idParametroInvenActual;
				}
				
					
				this.sDetalleReporte=ParametroInvenConstantesFunciones.getDetalleIndicePorId(idParametroInven);
				
				this.parametroinvens=new ArrayList<ParametroInven>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parametroinvenLogic.getEntity(idParametroInven);
					
					//parametroinvenLogic.getEntityWithConnection(idParametroInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroinvenLogic.setParametroInvens(new ArrayList<ParametroInven>());
					parametroinvenLogic.getParametroInvens().add(parametroinvenLogic.getParametroInven());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroinvens=new ArrayList<ParametroInven>();
					this.parametroinvens.add(parametroinven);
				}
				
				if(parametroinvenLogic.getParametroInven()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ParametroInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametroinvenLogic.getParametroInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametroinvenLogic.getParametroInvens()==null||parametroinvenLogic.getParametroInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametroinvens==null|| parametroinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroinvensAux=new ArrayList<ParametroInven>();
						parametroinvensAux.addAll(parametroinvenLogic.getParametroInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroinvensAux=new ArrayList<ParametroInven>();
							parametroinvensAux.addAll(parametroinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametroinvenLogic.getParametroInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroInvens("FK_IdEmpresa",parametroinvenLogic.getParametroInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroInvens("FK_IdEmpresa",parametroinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroinvenLogic.setParametroInvens(new ArrayList<ParametroInven>());
						parametroinvenLogic.getParametroInvens().addAll(parametroinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroinvens=new ArrayList<ParametroInven>();
							parametroinvens.addAll(parametroinvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParametroInven();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParametroInven();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametroinvenLogic.getParametroInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroinvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametroinvenLogic.getParametroInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroinvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ParametroInven parametroinven) {
		Boolean permite=true;
		
		if(this.parametroinven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParametroInvenConstantesFunciones.getOrderByListaParametroInven();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParametroInvenConstantesFunciones.getOrderByListaParametroInven();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroInven parametroinven:parametroinvenLogic.getParametroInvens()) {
				if(parametroinven.getsType().equals(Constantes2.S_TOTALES)) {
					parametroinvenTotales=parametroinven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroInven parametroinven:this.parametroinvens) {
				if(parametroinven.getsType().equals(Constantes2.S_TOTALES)) {
					parametroinvenTotales=parametroinven;
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
			this.parametroinvenAux=new ParametroInven();
			this.parametroinvenAux.setsType(Constantes2.S_TOTALES);
			this.parametroinvenAux.setIsNew(false);
			this.parametroinvenAux.setIsChanged(false);
			this.parametroinvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParametroInvenConstantesFunciones.TotalizarValoresFilaParametroInven(this.parametroinvenLogic.getParametroInvens(),this.parametroinvenAux);
				
				this.parametroinvenLogic.getParametroInvens().add(this.parametroinvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParametroInvenConstantesFunciones.TotalizarValoresFilaParametroInven(this.parametroinvens,this.parametroinvenAux);
				
				this.parametroinvens.add(this.parametroinvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametroinvenTotales=new ParametroInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametroinvenLogic.getParametroInvens().remove(parametroinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametroinvens.remove(parametroinvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametroinvenTotales=new ParametroInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroInven parametroinven:parametroinvenLogic.getParametroInvens()) {
				if(parametroinven.getsType().equals(Constantes2.S_TOTALES)) {
					parametroinvenTotales=parametroinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroInvenConstantesFunciones.TotalizarValoresFilaParametroInven(this.parametroinvenLogic.getParametroInvens(),parametroinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroInven parametroinven:this.parametroinvens) {
				if(parametroinven.getsType().equals(Constantes2.S_TOTALES)) {
					parametroinvenTotales=parametroinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroInvenConstantesFunciones.TotalizarValoresFilaParametroInven(this.parametroinvens,parametroinvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getParametroInvensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getParametroInvensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroinvenLogic.getParametroInvensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosParametroInven() {
		this.isPermisoTodoParametroInven=false;
		this.isPermisoNuevoParametroInven=false;
		this.isPermisoActualizarParametroInven=false;
		this.isPermisoActualizarOriginalParametroInven=false;
		this.isPermisoEliminarParametroInven=false;
		this.isPermisoGuardarCambiosParametroInven=false;
		this.isPermisoConsultaParametroInven=false;
		this.isPermisoBusquedaParametroInven=false;
		this.isPermisoReporteParametroInven=false;		
		this.isPermisoOrdenParametroInven=false;		
		this.isPermisoPaginacionMedioParametroInven=false;		
		this.isPermisoPaginacionAltoParametroInven=false;
		this.isPermisoPaginacionTodoParametroInven=false;
		this.isPermisoCopiarParametroInven=false;		
		this.isPermisoVerFormParametroInven=false;		
		this.isPermisoDuplicarParametroInven=false;		
		this.isPermisoOrdenParametroInven=false;		
	}
	
	public void setPermisosUsuarioParametroInven(Boolean isPermiso) {
		this.isPermisoTodoParametroInven=isPermiso;
		this.isPermisoNuevoParametroInven=isPermiso;
		this.isPermisoActualizarParametroInven=isPermiso;
		this.isPermisoActualizarOriginalParametroInven=isPermiso;
		this.isPermisoEliminarParametroInven=isPermiso;
		this.isPermisoGuardarCambiosParametroInven=isPermiso;
		this.isPermisoConsultaParametroInven=isPermiso;
		this.isPermisoBusquedaParametroInven=isPermiso;
		this.isPermisoReporteParametroInven=isPermiso;
		this.isPermisoOrdenParametroInven=isPermiso;		
		this.isPermisoPaginacionMedioParametroInven=isPermiso;		
		this.isPermisoPaginacionAltoParametroInven=isPermiso;		
		this.isPermisoPaginacionTodoParametroInven=isPermiso;		
		this.isPermisoCopiarParametroInven=isPermiso;		
		this.isPermisoVerFormParametroInven=isPermiso;		
		this.isPermisoDuplicarParametroInven=isPermiso;
		this.isPermisoOrdenParametroInven=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParametroInven(Boolean isPermiso) {
		//this.isPermisoTodoParametroInven=isPermiso;
		this.isPermisoNuevoParametroInven=isPermiso;
		this.isPermisoActualizarParametroInven=isPermiso;
		this.isPermisoActualizarOriginalParametroInven=isPermiso;
		this.isPermisoEliminarParametroInven=isPermiso;
		this.isPermisoGuardarCambiosParametroInven=isPermiso;
		//this.isPermisoConsultaParametroInven=isPermiso;
		//this.isPermisoBusquedaParametroInven=isPermiso;
		//this.isPermisoReporteParametroInven=isPermiso;
		//this.isPermisoOrdenParametroInven=isPermiso;		
		//this.isPermisoPaginacionMedioParametroInven=isPermiso;		
		//this.isPermisoPaginacionAltoParametroInven=isPermiso;		
		//this.isPermisoPaginacionTodoParametroInven=isPermiso;		
		//this.isPermisoCopiarParametroInven=isPermiso;		
		//this.isPermisoDuplicarParametroInven=isPermiso;
		//this.isPermisoOrdenParametroInven=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParametroInvenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParametroInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebParametroInven(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParametroInvenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParametroInvenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParametroInvenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParametroInvenClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParametroInven() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParametroInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParametroInvenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParametroInven=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParametroInven=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParametroInven=this.isPermisoActualizarParametroInven;
			this.isPermisoEliminarParametroInven=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParametroInven=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParametroInven=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParametroInven=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParametroInven=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParametroInven=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParametroInven=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParametroInven=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParametroInven=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParametroInven=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParametroInven=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParametroInven=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParametroInven.setToolTipText(this.jTableDatosParametroInven.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParametroInven(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParametroInven(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParametroInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParametroInven() throws Exception {
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
	public void inicializarCombosForeignKeyParametroInvenListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParametroInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParametroInvenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParametroInvenListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyParametroInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ParametroInvenParameterReturnGeneral parametroinvenReturnGeneral=new ParametroInvenParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.parametroinvenConstantesFunciones.cargarid_empresaParametroInven)
					 || (this.esRecargarFks && this.parametroinvenConstantesFunciones.cargarid_empresaParametroInven)) {

					if(!this.parametroinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+parametroinvenSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				parametroinvenReturnGeneral=parametroinvenLogic.cargarCombosLoteForeignKeyParametroInven(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=parametroinvenReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParametroInven()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.parametroinvenSessionBean==null) {
				this.parametroinvenSessionBean=new ParametroInvenSessionBean();
			}

			if(!this.parametroinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyParametroInven()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParametroInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParametroInven()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroInven();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParametroInven(ParametroInven parametroinven)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParametroInven(ParametroInven parametroinven,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParametroInven()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParametroInven()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParametroInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParametroInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParametroInven()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParametroInven()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParametroInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParametroInven()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormParametroInven.jComboBoxid_empresaParametroInven!=null && this.jInternalFrameDetalleFormParametroInven.jComboBoxid_empresaParametroInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroInven.jComboBoxid_empresaParametroInven.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ParametroInvenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroInvenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroInvenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parametroinvenSessionBean=new ParametroInvenSessionBean(); 
		this.parametroinvenConstantesFunciones=new ParametroInvenConstantesFunciones(); 
		this.parametroinvenBean=new ParametroInven();//(this.parametroinvenConstantesFunciones); 		
		this.parametroinvenReturnGeneral=new ParametroInvenParameterReturnGeneral(); 
		
		this.parametroinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParametroInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParametroInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParametroInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParametroInven(true);
			
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
			
			this.parametroinvenConstantesFunciones=new ParametroInvenConstantesFunciones(); 
			this.parametroinvenBean=new ParametroInven();//this.parametroinvenConstantesFunciones); 			
			this.parametroinvenReturnGeneral=new ParametroInvenParameterReturnGeneral(); 
		
			ParametroInvenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Inven Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.parametroinven=new ParametroInven();
			this.parametroinvens = new ArrayList<ParametroInven>();
			this.parametroinvensAux = new ArrayList<ParametroInven>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic=new ParametroInvenLogic();
				this.parametroinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.parametroinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parametroinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParametroInven);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParametroInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroInven);	
					}
					
					if(this.jInternalFrameImportacionParametroInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroInven);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParametroInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParametroInven);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParametroInven!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroInven);
				this.jInternalFrameDetalleFormParametroInven.setVisible(false);
				this.jInternalFrameDetalleFormParametroInven.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroInven);
					this.jInternalFrameReporteDinamicoParametroInven.setVisible(false);
					this.jInternalFrameReporteDinamicoParametroInven.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParametroInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParametroInven);
					this.jInternalFrameImportacionParametroInven.setVisible(false);
					this.jInternalFrameImportacionParametroInven.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParametroInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParametroInven);
					this.jInternalFrameOrderByParametroInven.setVisible(false);
					this.jInternalFrameOrderByParametroInven.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParametroInvenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParametroInvenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parametroinvenReturnGeneral=new ParametroInvenParameterReturnGeneral();
			
			this.parametroinvenParameterGeneral=new ParametroInvenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parametroinvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParametroInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametroinvenSessionBean.getEsGuardarRelacionado(),this.parametroinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametroinvenSessionBean.getEsGuardarRelacionado(),this.parametroinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParametroInven=false;
			this.isVisibilidadCeldaDuplicarParametroInven=true;
			this.isVisibilidadCeldaCopiarParametroInven=true;
			this.isVisibilidadCeldaVerFormParametroInven=true;
			this.isVisibilidadCeldaOrdenParametroInven=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroInven=false;
			this.isVisibilidadCeldaModificarParametroInven=false;
			this.isVisibilidadCeldaActualizarParametroInven=false;
			this.isVisibilidadCeldaEliminarParametroInven=false;
			this.isVisibilidadCeldaCancelarParametroInven=false;
			this.isVisibilidadCeldaGuardarParametroInven=false;
			this.isVisibilidadCeldaGuardarCambiosParametroInven=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParametroInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParametroInven();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParametroInven(false);
			
			this.setPermisosUsuarioParametroInven();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametroinvenSessionBean.getEsGuardarRelacionado() 
				|| (this.parametroinvenSessionBean.getEsGuardarRelacionado() && this.parametroinvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParametroInvenClasesRelacionadas();
			}
			
			if(this.parametroinvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParametroInvenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParametroInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParametroInven();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParametroInven();
			}
			
			if(!this.isPermisoBusquedaParametroInven) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasParametroInven.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParametroInven,this.isPermisoPaginacionMedioParametroInven,this.isPermisoPaginacionTodoParametroInven);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParametroInvenConstantesFunciones.getTiposSeleccionarParametroInven());
				
				this.tiposColumnasSelect=ParametroInvenConstantesFunciones.getTiposSeleccionarParametroInven(true);
				
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
			//if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParametroInven();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioParametroInven(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioParametroInven(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroInven() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				parametroinvenImplementable= (ParametroInvenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parametroinvenImplementableHome= (ParametroInvenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parametroinvens= new ArrayList<ParametroInven>();
			this.parametroinvensEliminados= new ArrayList<ParametroInven>();
						
			this.isEsNuevoParametroInven=false;
			this.esParaAccionDesdeFormularioParametroInven=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParametroInven(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParametroInven();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParametroInvenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParametroInvenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParametroInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParametroInven(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParametroInven!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParametroInven();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParametroInven();
			}
			
			ParametroInvenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasParametroInven.getTabCount(); i++) {
					this.jTabbedPaneBusquedasParametroInven.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasParametroInven.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParametroInven(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ParametroInven: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParametroInven() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParametroInven")) {
				iIndex=this.jInternalFrameDetalleFormParametroInven.jTabbedPaneRelacionesParametroInven.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParametroInven.jTabbedPaneRelacionesParametroInven.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParametroInven();	
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
	
	public void cargarCombosForeignKeyParametroInven(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParametroInven(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParametroInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParametroInvenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParametroInven();
		
		this.cargarCombosFrameForeignKeyParametroInven();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParametroInven();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParametroInven();
		}
	}
	
	
	
	public void jButtonNuevoParametroInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parametroinvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParametroInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
			
			
			if(jTableDatosParametroInven.getRowCount()>=1) {
				jTableDatosParametroInven.removeRowSelectionInterval(0, jTableDatosParametroInven.getRowCount()-1);						
			}
			
			this.isEsNuevoParametroInven=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParametroInven(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParametroInven(true);			
			//this.parametroinven=new ParametroInven();
			//this.parametroinven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroInven(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroInven() ;
			
			if(ParametroInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroInven(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parametroinven);	
			this.actualizarInformacion("INFO_PADRE",false,this.parametroinven);				
			
			ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
			
			if(this.parametroinvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ParametroInven: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParametroInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ParametroInven> parametroinvensSeleccionados=new ArrayList<ParametroInven>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParametroInven.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParametroInven.getSelectedRows().length;			
			}
			
			parametroinvensSeleccionados=this.getParametroInvensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParametroInven--;			
				//ParametroInven parametroinvenAux= new ParametroInven();			
				//parametroinvenAux.setId(this.iIdNuevoParametroInven);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ParametroInven parametroinvenOrigen=new ParametroInven();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ParametroInven parametroinvenOrigen : parametroinvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parametroinvenOrigen =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroinvenOrigen =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParametroInven();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parametroinven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParametroInven(parametroinvenOrigen,this.parametroinven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametroinvenLogic.getParametroInvens().add(this.parametroinvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametroinvens.add(this.parametroinvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParametroInven(false);
				
				this.jTableDatosParametroInven.setRowSelectionInterval(this.getIndiceNuevoParametroInven(), this.getIndiceNuevoParametroInven());
				
				int iLastRow =  this.jTableDatosParametroInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroInven(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParametroInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ParametroInven> parametroinvensSeleccionados=new ArrayList<ParametroInven>();									
		
			ParametroInven parametroinvenOrigen=new ParametroInven();
			ParametroInven parametroinvenDestino=new ParametroInven();
				
			parametroinvensSeleccionados=this.getParametroInvensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParametroInven.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parametroinvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParametroInven.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroinvenOrigen =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametroinvenOrigen =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroinvenDestino =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametroinvenDestino =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parametroinvenOrigen =parametroinvensSeleccionados.get(0);
				parametroinvenDestino =parametroinvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParametroInven(parametroinvenOrigen,parametroinvenDestino,true,false);
				
				parametroinvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametroinvenDestino,parametroinvenLogic.getParametroInvens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroinvenDestino,parametroinvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParametroInven(false);
				
				//this.jTableDatosParametroInven.setRowSelectionInterval(this.getIndiceNuevoParametroInven(), this.getIndiceNuevoParametroInven());
				
				int iLastRow =  this.jTableDatosParametroInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroInven(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParametroInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParametroInven.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParametroInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParametroInven.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasParametroInven.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesParametroInven.setVisible(!isVisible);
			this.jPanelPaginacionParametroInven.setVisible(!isVisible);
			this.jPanelAccionesParametroInven.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParametroInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParametroInven();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParametroInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParametroInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParametroInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParametroInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParametroInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParametroInven();
			
			this.abrirFrameOrderByParametroInven();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParametroInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParametroInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParametroInven(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroInven);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParametroInven.isMaximum()) {
					this.jInternalFrameDetalleFormParametroInven.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParametroInven.setSize(this.jInternalFrameDetalleFormParametroInven.iWidthFormulario,this.jInternalFrameDetalleFormParametroInven.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParametroInven.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParametroInven.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParametroInven.isMaximum()) {
						this.jInternalFrameDetalleFormParametroInven.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParametroInven.jContentPaneDetalleParametroInven.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParametroInven.jTabbedPaneRelacionesParametroInven.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParametroInven.jContentPaneDetalleParametroInven.getWidth(),ParametroInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroInven.jTabbedPaneRelacionesParametroInven.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParametroInven.jContentPaneDetalleParametroInven.getWidth(),ParametroInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroInven.jTabbedPaneRelacionesParametroInven.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParametroInven.jContentPaneDetalleParametroInven.getWidth(),ParametroInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParametroInven.setVisible(true);
	        this.jInternalFrameDetalleFormParametroInven.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParametroInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParametroInven==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParametroInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroInven,false,this);
				} else {
					this.jInternalFrameOrderByParametroInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroInven,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParametroInven);
				this.jInternalFrameOrderByParametroInven.setVisible(false);
				this.jInternalFrameOrderByParametroInven.setSelected(false);
				
				this.jInternalFrameOrderByParametroInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroInven"));
				
				this.inicializarActualizarBindingTablaOrderByParametroInven();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParametroInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParametroInven==null) {
				
				this.jInternalFrameImportacionParametroInven=new ImportacionJInternalFrame(ParametroInvenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroInven);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParametroInven);
				this.jInternalFrameImportacionParametroInven.setVisible(false);
				this.jInternalFrameImportacionParametroInven.setSelected(false);


				this.jInternalFrameImportacionParametroInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroInven"));
				this.jInternalFrameImportacionParametroInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroInven"));
				this.jInternalFrameImportacionParametroInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroInven"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParametroInven() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParametroInven==null) {
				this.jInternalFrameReporteDinamicoParametroInven=new ReporteDinamicoJInternalFrame(ParametroInvenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroInven);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroInven);
				this.jInternalFrameReporteDinamicoParametroInven.setVisible(false);
				this.jInternalFrameReporteDinamicoParametroInven.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParametroInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroInven"));
				this.jInternalFrameReporteDinamicoParametroInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroInven"));
				this.jInternalFrameReporteDinamicoParametroInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroInven"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroInven();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleParametroInven() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroInven);
			
	       	this.jInternalFrameDetalleFormParametroInven.setVisible(false);
	        this.jInternalFrameDetalleFormParametroInven.setSelected(false);
			
			//this.jInternalFrameDetalleFormParametroInven.dispose();
			//this.jInternalFrameDetalleFormParametroInven=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParametroInven() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParametroInven.setVisible(true);
	        this.jInternalFrameReporteDinamicoParametroInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParametroInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParametroInven.setVisible(true);
	        this.jInternalFrameImportacionParametroInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParametroInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParametroInven.setVisible(true);
	        this.jInternalFrameOrderByParametroInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParametroInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParametroInven.setVisible(false);
	        this.jInternalFrameOrderByParametroInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParametroInven() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParametroInven.setVisible(false);
	        this.jInternalFrameReporteDinamicoParametroInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParametroInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParametroInven.setVisible(false);
	        this.jInternalFrameImportacionParametroInven.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarParametroInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParametroInven(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParametroInven(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParametroInven(true);
			//this.isEsNuevoParametroInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParametroInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroInven(false) ;
			
			if(parametroinvenSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParametroInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroInven(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParametroInvenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParametroInven(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParametroInven(true);
			//this.isEsNuevoParametroInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parametroinven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParametroInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParametroInven(false) ;
			
			if(ParametroInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroInven(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarParametroInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParametroInven(false);
			
			//if(!this.isEsNuevoParametroInven) {								
				int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParametroInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
				
			}
			
			if(this.permiteMantenimiento(this.parametroinven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParametroInven=true;
					this.inicializarActualizarBindingTablaParametroInven(false);
					this.isEsNuevoParametroInven=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParametroInven=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParametroInven=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroInven(false);
				
				this.habilitarDeshabilitarControlesParametroInven(false);
			
												
				
				if(ParametroInvenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParametroInven();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParametroInvenActionPerformed(evt,parametroinvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParametroInven(this.parametroinven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParametroInven.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parametroinvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parametroinven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ParametroInven.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroInven.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParametroInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				this.parametroinven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				this.parametroinven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parametroinven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParametroInvenModel) this.jTableDatosParametroInven.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParametroInven=true;
				this.inicializarActualizarBindingTablaParametroInven(false);
				this.isEsNuevoParametroInven=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroInven(false);
				
				this.habilitarDeshabilitarControlesParametroInven(false);
				
				
				
				if(ParametroInvenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParametroInven();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParametroInvenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParametroInven.getRowCount()>=1) {
				jTableDatosParametroInven.removeRowSelectionInterval(0, jTableDatosParametroInven.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParametroInven(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParametroInven(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroInven(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroInven(false) ;
			
			this.isEsNuevoParametroInven=false;
			
			if(ParametroInvenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParametroInven();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParametroInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParametroInven(false);
				
				//SI ES MANUAL
				if(ParametroInvenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParametroInven();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParametroInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParametroInven--;			
			//ParametroInven parametroinvenAux= new ParametroInven();			
			//parametroinvenAux.setId(this.iIdNuevoParametroInven);
			
			if(this.jInternalFrameDetalleFormParametroInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParametroInven();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
			
			this.parametroinven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parametroinvenLogic.getParametroInvens().add(this.parametroinvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parametroinvens.add(this.parametroinvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParametroInven(false);
			
			this.jTableDatosParametroInven.setRowSelectionInterval(this.getIndiceNuevoParametroInven(), this.getIndiceNuevoParametroInven());
			
			int iLastRow =  this.jTableDatosParametroInven.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParametroInven.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParametroInven.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParametroInven(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParametroInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametroInven(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroInven(false);
			
			//SI ES MANUAL
			if(ParametroInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroInven();
			}
			
			//this.abrirFrameTreeParametroInven();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParametroInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Parametro InvenES ?", "MANTENIMIENTO DE Parametro Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParametroInven.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParametroInven();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parametroinvenReturnGeneral=parametroinvenLogic.procesarImportacionParametroInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parametroinvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParametroInvenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParametroInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParametroInven.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParametroInven.setFileImportacion(this.jInternalFrameImportacionParametroInven.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParametroInven.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParametroInven.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParametroInven.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParametroInven.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParametroInvenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ParametroInven> parametroinvensSeleccionados=new ArrayList<ParametroInven>();		

		parametroinvensSeleccionados=this.getParametroInvensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParametroInvenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParametroInvenBaseDesign.jrxml";
			
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
			
			this.generarReporteParametroInvens("Todos",parametroinvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Inven",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParametroInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroInvenConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencialPedido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencialPedido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencialPedido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencialPedido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroSerie_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroSerie_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroSerie_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroSerie_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDecimales_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDecimales_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDecimales_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDecimales_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroItemsRequisicion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroItemsRequisicion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroItemsRequisicion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroItemsRequisicion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nCuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nCuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nCuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nCuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nCuentaContableLinea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nCuentaContableLinea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nCuentaContableLinea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nCuentaContableLinea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nCuentaBanco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nCuentaBanco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nCuentaBanco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nCuentaBanco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nCopiarProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nCopiarProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nCopiarProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nCopiarProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nCrearProductoSucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nCrearProductoSucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nCrearProductoSucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nCrearProductoSucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nCrearListaPrecioSucursalBodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nCrearListaPrecioSucursalBodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nCrearListaPrecioSucursalBodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nCrearListaPrecioSucursalBodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nComprasAprobacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nComprasAprobacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nComprasAprobacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nComprasAprobacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nEnvioMail_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nEnvioMail_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nEnvioMail_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nEnvioMail_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoParametroInven.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParametroInven.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParametroInven.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParametroInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO:
					sNombreCampoCategoria="secuencial_pedido";
					break;

				case ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE:
					sNombreCampoCategoria="numero_serie";
					break;

				case ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES:
					sNombreCampoCategoria="numero_decimales";
					break;

				case ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION:
					sNombreCampoCategoria="numero_items_requisicion";
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE:
					sNombreCampoCategoria="con_cuenta_contable";
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA:
					sNombreCampoCategoria="con_cuenta_contable_linea";
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO:
					sNombreCampoCategoria="con_cuenta_banco";
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO:
					sNombreCampoCategoria="con_copiar_producto";
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL:
					sNombreCampoCategoria="con_crear_producto_sucursal";
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA:
					sNombreCampoCategoria="con_crear_lista_precio_sucursal_bodega";
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION:
					sNombreCampoCategoria="con_compras_aprobacion";
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL:
					sNombreCampoCategoria="con_envio_mail";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParametroInven.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParametroInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO:
					sNombreCampoCategoriaValor="secuencial_pedido";
					break;

				case ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE:
					sNombreCampoCategoriaValor="numero_serie";
					break;

				case ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES:
					sNombreCampoCategoriaValor="numero_decimales";
					break;

				case ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION:
					sNombreCampoCategoriaValor="numero_items_requisicion";
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE:
					sNombreCampoCategoriaValor="con_cuenta_contable";
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA:
					sNombreCampoCategoriaValor="con_cuenta_contable_linea";
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO:
					sNombreCampoCategoriaValor="con_cuenta_banco";
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO:
					sNombreCampoCategoriaValor="con_copiar_producto";
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL:
					sNombreCampoCategoriaValor="con_crear_producto_sucursal";
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA:
					sNombreCampoCategoriaValor="con_crear_lista_precio_sucursal_bodega";
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION:
					sNombreCampoCategoriaValor="con_compras_aprobacion";
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL:
					sNombreCampoCategoriaValor="con_envio_mail";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParametroInven.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroInven.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroInvenConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial Pedido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial_pedido");
					break;

				case ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Serie",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_serie");
					break;

				case ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Decimales",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_decimales");
					break;

				case ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Items Requisicion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_items_requisicion");
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_cuenta_contable");
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Cuenta Contable Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_cuenta_contable_linea");
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Cuenta Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_cuenta_banco");
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Copiar Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_copiar_producto");
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Crear Producto Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_crear_producto_sucursal");
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Crear Lista Precio Sucursal Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_crear_lista_precio_sucursal_bodega");
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Compras Aprobacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_compras_aprobacion");
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Envio Mail",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_envio_mail");
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
	
	public void jButtonGenerarExcelReporteDinamicoParametroInvenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ParametroInven> parametroinvensSeleccionados=new ArrayList<ParametroInven>();		
		
		parametroinvensSeleccionados=this.getParametroInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroinven";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ParametroInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParametroInven.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParametroInvenConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ParametroInven parametroinven:parametroinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroinven.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO);
					iRow++;

					for(ParametroInven parametroinven:parametroinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroinven.getsecuencial_pedido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE);
					iRow++;

					for(ParametroInven parametroinven:parametroinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroinven.getnumero_serie());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES);
					iRow++;

					for(ParametroInven parametroinven:parametroinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroinven.getnumero_decimales());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION);
					iRow++;

					for(ParametroInven parametroinven:parametroinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroinven.getnumero_items_requisicion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE);
					iRow++;

					for(ParametroInven parametroinven:parametroinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroinven.getcon_cuenta_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA);
					iRow++;

					for(ParametroInven parametroinven:parametroinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroinven.getcon_cuenta_contable_linea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO);
					iRow++;

					for(ParametroInven parametroinven:parametroinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroinven.getcon_cuenta_banco());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO);
					iRow++;

					for(ParametroInven parametroinven:parametroinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroinven.getcon_copiar_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL);
					iRow++;

					for(ParametroInven parametroinven:parametroinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroinven.getcon_crear_producto_sucursal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA);
					iRow++;

					for(ParametroInven parametroinven:parametroinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroinven.getcon_crear_lista_precio_sucursal_bodega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION);
					iRow++;

					for(ParametroInven parametroinven:parametroinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroinven.getcon_compras_aprobacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL);
					iRow++;

					for(ParametroInven parametroinven:parametroinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroinven.getcon_envio_mail());
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
			//	this.getFilaCabeceraExportarExcelParametroInven(row);				
			//	iRow++;
			//}				
			
			//for(ParametroInven parametroinvenAux:parametroinvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParametroInven(parametroinvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Inven",JOptionPane.INFORMATION_MESSAGE);
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
				this.parametroinvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroInven(false);
			
			//SI ES MANUAL
			if(ParametroInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroInven();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParametroInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroInven(false);
			
			//SI ES MANUAL
			if(ParametroInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroInven();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParametroInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroInven(false);
			
			//SI ES MANUAL
			if(ParametroInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroInven();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParametroInven() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParametroInven.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParametroInven.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParametroInven.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParametroInven.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParametroInven.setMinimumSize(dimensionMinimum);
		this.jTableDatosParametroInven.setMaximumSize(dimensionMaximum);
		this.jTableDatosParametroInven.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParametroInven(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParametroInven(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParametroInven(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParametroInven(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParametroInven(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParametroInven(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroInven(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParametroInven(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParametroInvenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParametroInvenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParametroInven() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParametroInven();
		
		this.inicializarActualizarBindingBotonesManualParametroInven(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParametroInven();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroInven() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParametroInven(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParametroInven(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParametroInven.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParametroInven.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParametroInven.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParametroInven!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParametroInven.jCheckBoxPostAccionNuevoParametroInven.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParametroInven.jCheckBoxPostAccionSinCerrarParametroInven.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParametroInven.jCheckBoxPostAccionSinMensajeParametroInven.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParametroInven.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParametroInven.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParametroInven.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParametroInven!=null) {
				this.jInternalFrameDetalleFormParametroInven.jCheckBoxPostAccionNuevoParametroInven.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParametroInven.jCheckBoxPostAccionSinCerrarParametroInven.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParametroInven.jCheckBoxPostAccionSinMensajeParametroInven.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParametroInven.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParametroInven.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParametroInven!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParametroInven.jComboBoxTiposAccionesFormularioParametroInven.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParametroInven.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParametroInven!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParametroInven.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParametroInven.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParametroInven.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParametroInven.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParametroInven!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParametroInven.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParametroInven.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParametroInven(Boolean esInicializar) throws Exception {
		try	{	
			if(ParametroInvenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParametroInven(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParametroInven() throws Exception {
		try	{
			if(ParametroInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroInven();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroInven() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParametroInven.jComboBoxTiposAccionesFormularioParametroInven.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParametroInven.jComboBoxTiposAccionesFormularioParametroInven.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroInven() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParametroInven.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParametroInven.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParametroInven.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParametroInven.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParametroInven.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParametroInven.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParametroInven.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParametroInven.addItem(reporte);
			}
			
			
			if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParametroInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParametroInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParametroInven.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParametroInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParametroInven.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParametroInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParametroInven.jComboBoxTiposAccionesFormularioParametroInven.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParametroInven.jComboBoxTiposAccionesFormularioParametroInven.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParametroInven.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParametroInven.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParametroInven.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroInven();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroInven() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroInven!=null) {
				this.jInternalFrameReporteDinamicoParametroInven.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroInven.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroInven!=null) {
				this.jInternalFrameReporteDinamicoParametroInven.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroInven.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParametroInven!=null) {
				
				if(this.jInternalFrameReporteDinamicoParametroInven.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroInven.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroInven.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParametroInven.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroInven.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroInven.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParametroInven()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParametroInven(Boolean esInicializar) throws Exception {				
		if(ParametroInvenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParametroInven();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParametroInven() throws Exception {
		this.inicializarActualizarBindingTablaParametroInven(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParametroInven() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParametroInven.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParametroInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroInven.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParametroInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroInven.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParametroInvenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroInvenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParametroInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroInven.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParametroInven.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParametroInven(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parametroinvenLogic.getParametroInvens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parametroinvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParametroInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParametroInven.setModel(new ParametroInvenModel(this.parametroinvenLogic.getParametroInvens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParametroInven.setModel(new ParametroInvenModel(this.parametroinvens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParametroInven!=null && this.jInternalFrameOrderByParametroInven.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParametroInven();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParametroInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroInven,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO,parametroinvenConstantesFunciones.resaltarSeleccionarParametroInven,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO,parametroinvenConstantesFunciones.resaltarSeleccionarParametroInven,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParametroInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroInven,ParametroInvenConstantesFunciones.LABEL_ID));

		if(this.parametroinvenConstantesFunciones.mostraridParametroInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroInvenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametroinvenConstantesFunciones.resaltaridParametroInven,this.parametroinvenConstantesFunciones.activaridParametroInven,this,true,"idParametroInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametroinvenConstantesFunciones.resaltaridParametroInven,this.parametroinvenConstantesFunciones.activaridParametroInven,this,true,"idParametroInven","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroInven,ParametroInvenConstantesFunciones.LABEL_IDEMPRESA));

		if(this.parametroinvenConstantesFunciones.mostrarid_empresaParametroInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroInvenConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.parametroinvenConstantesFunciones.resaltarid_empresaParametroInven,this,this.parametroinvenConstantesFunciones.activarid_empresaParametroInven));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.parametroinvenConstantesFunciones.resaltarid_empresaParametroInven,this,this.parametroinvenConstantesFunciones.activarid_empresaParametroInven,false,"id_empresaParametroInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroInven,ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO));

		if(this.parametroinvenConstantesFunciones.mostrarsecuencial_pedidoParametroInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametroinvenConstantesFunciones.resaltarsecuencial_pedidoParametroInven,this.parametroinvenConstantesFunciones.activarsecuencial_pedidoParametroInven,this,true,"secuencial_pedidoParametroInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametroinvenConstantesFunciones.resaltarsecuencial_pedidoParametroInven,this.parametroinvenConstantesFunciones.activarsecuencial_pedidoParametroInven,this,true,"secuencial_pedidoParametroInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroInven,ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE));

		if(this.parametroinvenConstantesFunciones.mostrarnumero_serieParametroInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametroinvenConstantesFunciones.resaltarnumero_serieParametroInven,this.parametroinvenConstantesFunciones.activarnumero_serieParametroInven,this,true,"numero_serieParametroInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametroinvenConstantesFunciones.resaltarnumero_serieParametroInven,this.parametroinvenConstantesFunciones.activarnumero_serieParametroInven,this,true,"numero_serieParametroInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroInven,ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES));

		if(this.parametroinvenConstantesFunciones.mostrarnumero_decimalesParametroInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametroinvenConstantesFunciones.resaltarnumero_decimalesParametroInven,this.parametroinvenConstantesFunciones.activarnumero_decimalesParametroInven,this,true,"numero_decimalesParametroInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametroinvenConstantesFunciones.resaltarnumero_decimalesParametroInven,this.parametroinvenConstantesFunciones.activarnumero_decimalesParametroInven,this,true,"numero_decimalesParametroInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroInven,ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION));

		if(this.parametroinvenConstantesFunciones.mostrarnumero_items_requisicionParametroInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametroinvenConstantesFunciones.resaltarnumero_items_requisicionParametroInven,this.parametroinvenConstantesFunciones.activarnumero_items_requisicionParametroInven,this,true,"numero_items_requisicionParametroInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametroinvenConstantesFunciones.resaltarnumero_items_requisicionParametroInven,this.parametroinvenConstantesFunciones.activarnumero_items_requisicionParametroInven,this,true,"numero_items_requisicionParametroInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroInven,ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE));

		if(this.parametroinvenConstantesFunciones.mostrarcon_cuenta_contableParametroInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametroinvenConstantesFunciones.resaltarcon_cuenta_contableParametroInven,this.parametroinvenConstantesFunciones.activarcon_cuenta_contableParametroInven));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametroinvenConstantesFunciones.resaltarcon_cuenta_contableParametroInven,this.parametroinvenConstantesFunciones.activarcon_cuenta_contableParametroInven,this,true,"con_cuenta_contableParametroInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroInven,ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA));

		if(this.parametroinvenConstantesFunciones.mostrarcon_cuenta_contable_lineaParametroInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametroinvenConstantesFunciones.resaltarcon_cuenta_contable_lineaParametroInven,this.parametroinvenConstantesFunciones.activarcon_cuenta_contable_lineaParametroInven));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametroinvenConstantesFunciones.resaltarcon_cuenta_contable_lineaParametroInven,this.parametroinvenConstantesFunciones.activarcon_cuenta_contable_lineaParametroInven,this,true,"con_cuenta_contable_lineaParametroInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroInven,ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO));

		if(this.parametroinvenConstantesFunciones.mostrarcon_cuenta_bancoParametroInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametroinvenConstantesFunciones.resaltarcon_cuenta_bancoParametroInven,this.parametroinvenConstantesFunciones.activarcon_cuenta_bancoParametroInven));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametroinvenConstantesFunciones.resaltarcon_cuenta_bancoParametroInven,this.parametroinvenConstantesFunciones.activarcon_cuenta_bancoParametroInven,this,true,"con_cuenta_bancoParametroInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroInven,ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO));

		if(this.parametroinvenConstantesFunciones.mostrarcon_copiar_productoParametroInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametroinvenConstantesFunciones.resaltarcon_copiar_productoParametroInven,this.parametroinvenConstantesFunciones.activarcon_copiar_productoParametroInven));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametroinvenConstantesFunciones.resaltarcon_copiar_productoParametroInven,this.parametroinvenConstantesFunciones.activarcon_copiar_productoParametroInven,this,true,"con_copiar_productoParametroInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroInven,ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL));

		if(this.parametroinvenConstantesFunciones.mostrarcon_crear_producto_sucursalParametroInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametroinvenConstantesFunciones.resaltarcon_crear_producto_sucursalParametroInven,this.parametroinvenConstantesFunciones.activarcon_crear_producto_sucursalParametroInven));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametroinvenConstantesFunciones.resaltarcon_crear_producto_sucursalParametroInven,this.parametroinvenConstantesFunciones.activarcon_crear_producto_sucursalParametroInven,this,true,"con_crear_producto_sucursalParametroInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroInven,ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA));

		if(this.parametroinvenConstantesFunciones.mostrarcon_crear_lista_precio_sucursal_bodegaParametroInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametroinvenConstantesFunciones.resaltarcon_crear_lista_precio_sucursal_bodegaParametroInven,this.parametroinvenConstantesFunciones.activarcon_crear_lista_precio_sucursal_bodegaParametroInven));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametroinvenConstantesFunciones.resaltarcon_crear_lista_precio_sucursal_bodegaParametroInven,this.parametroinvenConstantesFunciones.activarcon_crear_lista_precio_sucursal_bodegaParametroInven,this,true,"con_crear_lista_precio_sucursal_bodegaParametroInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroInven,ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION));

		if(this.parametroinvenConstantesFunciones.mostrarcon_compras_aprobacionParametroInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametroinvenConstantesFunciones.resaltarcon_compras_aprobacionParametroInven,this.parametroinvenConstantesFunciones.activarcon_compras_aprobacionParametroInven));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametroinvenConstantesFunciones.resaltarcon_compras_aprobacionParametroInven,this.parametroinvenConstantesFunciones.activarcon_compras_aprobacionParametroInven,this,true,"con_compras_aprobacionParametroInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroInven,ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL));

		if(this.parametroinvenConstantesFunciones.mostrarcon_envio_mailParametroInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametroinvenConstantesFunciones.resaltarcon_envio_mailParametroInven,this.parametroinvenConstantesFunciones.activarcon_envio_mailParametroInven));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametroinvenConstantesFunciones.resaltarcon_envio_mailParametroInven,this.parametroinvenConstantesFunciones.activarcon_envio_mailParametroInven,this,true,"con_envio_mailParametroInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametroinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametroinvenSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroInven.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametroinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametroinvenSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroInven.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParametroInven && this.isPermisoGuardarCambiosParametroInven) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parametroinvenSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parametroinvenSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParametroInven.addColumn(tableColumn);
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
			
			this.jTableDatosParametroInven.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroInven && this.isPermisoGuardarCambiosParametroInven) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroInven && this.isPermisoGuardarCambiosParametroInven) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParametroInven.moveColumn(this.jTableDatosParametroInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParametroInven.moveColumn(this.jTableDatosParametroInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParametroInven.moveColumn(this.jTableDatosParametroInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParametroInven.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParametroInven.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParametroInven,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParametroInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParametroInven.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParametroInven.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParametroInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParametroInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParametroInven.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParametroInven.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParametroInven.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parametroinvenLogic.getParametroInvens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parametroinvens.size()-1;
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
		//this.jTableDatosParametroInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParametroInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParametroInven();
			
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
				
				//this.isEsNuevoParametroInven=false;
					
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
			
				if(this.parametroinvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParametroInven==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroInven.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parametroinven.getsType().equals("DUPLICADO")
				   || this.parametroinven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParametroInven=true;
				
				} else {
					this.isEsNuevoParametroInven=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
					if(this.parametroinven.getId()>=0 && !this.parametroinven.getIsNew()) {						
						this.isEsNuevoParametroInven=false;
						
					} else {
						this.isEsNuevoParametroInven=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParametroInven(esRelaciones);						
				
				this.seleccionarParametroInven(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parametroinven.getId()<0) {
					this.isEsNuevoParametroInven=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParametroInven(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParametroInven(evt,rowIndex);
				}	
				
				if(this.parametroinvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ParametroInven: " + this.dDif); 
					}
				}								
				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParametroInven(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parametroinven)) {
					if(this.parametroinven.getId()>0) {
						this.parametroinven.setIsDeleted(true);
						
						this.parametroinvensEliminados.add(this.parametroinven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametroinvenLogic.getParametroInvens().remove(this.parametroinven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametroinvens.remove(this.parametroinven);				
					}
					
					
					((ParametroInvenModel) this.jTableDatosParametroInven.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroInven(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParametroInven(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParametroInven) {
			
			if(this.jInternalFrameDetalleFormParametroInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroInven.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParametroInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParametroInven(this.parametroinven);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.parametroinvenConstantesFunciones.cargarid_empresaParametroInven || this.parametroinvenConstantesFunciones.event_dependid_empresaParametroInven) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.parametroinven.getid_empresa());
									//this.inicializarActualizarBindingParametroInven(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(parametroinven.getEmpresa()!=null) {
							this.empresasForeignKey.add(parametroinven.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.parametroinven.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParametroInven("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParametroInven(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroInven() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroInven(ParametroInven parametroinven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParametroInven(parametroinven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroInven(ParametroInven parametroinven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParametroInven(parametroinven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParametroInven(parametroinven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParametroInven(parametroinven);
	}
	
	public void setVariablesObjetoActualToFormularioParametroInven(ParametroInven parametroinven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParametroInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParametroInven.jLabelidParametroInven.setText(parametroinven.getId().toString());
			this.jInternalFrameDetalleFormParametroInven.jTextFieldsecuencial_pedidoParametroInven.setText(parametroinven.getsecuencial_pedido().toString());
			this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_serieParametroInven.setText(parametroinven.getnumero_serie().toString());
			this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_decimalesParametroInven.setText(parametroinven.getnumero_decimales().toString());
			this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_items_requisicionParametroInven.setText(parametroinven.getnumero_items_requisicion().toString());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contableParametroInven.setSelected(parametroinven.getcon_cuenta_contable());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contable_lineaParametroInven.setSelected(parametroinven.getcon_cuenta_contable_linea());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_bancoParametroInven.setSelected(parametroinven.getcon_cuenta_banco());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_copiar_productoParametroInven.setSelected(parametroinven.getcon_copiar_producto());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_producto_sucursalParametroInven.setSelected(parametroinven.getcon_crear_producto_sucursal());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven.setSelected(parametroinven.getcon_crear_lista_precio_sucursal_bodega());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_compras_aprobacionParametroInven.setSelected(parametroinven.getcon_compras_aprobacion());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_envio_mailParametroInven.setSelected(parametroinven.getcon_envio_mail());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ParametroInven parametroinvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parametroinvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ParametroInven parametroinvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parametroinvenLocal=this.parametroinven;
			} else {
				parametroinvenLocal=this.parametroinvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parametroinvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParametroInven(parametroinvenLocal,true);
					
					if(parametroinvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parametroinvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parametroinvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParametroInven(ParametroInven parametroinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroInven(parametroinven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(parametroinven);
	}
	
	public void setVariablesFormularioToObjetoActualParametroInven(ParametroInven parametroinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroInven(parametroinven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParametroInven(ParametroInven parametroinven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParametroInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParametroInven.jLabelidParametroInven.getText()==null || this.jInternalFrameDetalleFormParametroInven.jLabelidParametroInven.getText()=="" || this.jInternalFrameDetalleFormParametroInven.jLabelidParametroInven.getText()=="Id") {
				this.jInternalFrameDetalleFormParametroInven.jLabelidParametroInven.setText("0");
			}

			if(conColumnasBase) {parametroinven.setId(Long.parseLong(this.jInternalFrameDetalleFormParametroInven.jLabelidParametroInven.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroInvenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelIdParametroInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroinven.setsecuencial_pedido(Integer.parseInt(this.jInternalFrameDetalleFormParametroInven.jTextFieldsecuencial_pedidoParametroInven.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelsecuencial_pedidoParametroInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroinven.setnumero_serie(Integer.parseInt(this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_serieParametroInven.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelnumero_serieParametroInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroinven.setnumero_decimales(Integer.parseInt(this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_decimalesParametroInven.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelnumero_decimalesParametroInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroinven.setnumero_items_requisicion(Integer.parseInt(this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_items_requisicionParametroInven.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelnumero_items_requisicionParametroInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroinven.setcon_cuenta_contable(this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contableParametroInven.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelcon_cuenta_contableParametroInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroinven.setcon_cuenta_contable_linea(this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contable_lineaParametroInven.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelcon_cuenta_contable_lineaParametroInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroinven.setcon_cuenta_banco(this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_bancoParametroInven.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelcon_cuenta_bancoParametroInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroinven.setcon_copiar_producto(this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_copiar_productoParametroInven.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelcon_copiar_productoParametroInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroinven.setcon_crear_producto_sucursal(this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_producto_sucursalParametroInven.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelcon_crear_producto_sucursalParametroInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroinven.setcon_crear_lista_precio_sucursal_bodega(this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelcon_crear_lista_precio_sucursal_bodegaParametroInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroinven.setcon_compras_aprobacion(this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_compras_aprobacionParametroInven.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelcon_compras_aprobacionParametroInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroinven.setcon_envio_mail(this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_envio_mailParametroInven.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroInven.jLabelcon_envio_mailParametroInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroInven(ParametroInven parametroinvenBean,ParametroInven parametroinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParametroInven(ParametroInven parametroinvenOrigen,ParametroInven parametroinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametroinvenOrigen.getId()!=null && !parametroinvenOrigen.getId().equals(0L))) {parametroinven.setId(parametroinvenOrigen.getId());}}
			if(conDefault || (!conDefault && parametroinvenOrigen.getsecuencial_pedido()!=null && !parametroinvenOrigen.getsecuencial_pedido().equals(0))) {parametroinven.setsecuencial_pedido(parametroinvenOrigen.getsecuencial_pedido());}
			if(conDefault || (!conDefault && parametroinvenOrigen.getnumero_serie()!=null && !parametroinvenOrigen.getnumero_serie().equals(0))) {parametroinven.setnumero_serie(parametroinvenOrigen.getnumero_serie());}
			if(conDefault || (!conDefault && parametroinvenOrigen.getnumero_decimales()!=null && !parametroinvenOrigen.getnumero_decimales().equals(0))) {parametroinven.setnumero_decimales(parametroinvenOrigen.getnumero_decimales());}
			if(conDefault || (!conDefault && parametroinvenOrigen.getnumero_items_requisicion()!=null && !parametroinvenOrigen.getnumero_items_requisicion().equals(0))) {parametroinven.setnumero_items_requisicion(parametroinvenOrigen.getnumero_items_requisicion());}
			if(conDefault || (!conDefault && parametroinvenOrigen.getcon_cuenta_contable()!=null && !parametroinvenOrigen.getcon_cuenta_contable().equals(false))) {parametroinven.setcon_cuenta_contable(parametroinvenOrigen.getcon_cuenta_contable());}
			if(conDefault || (!conDefault && parametroinvenOrigen.getcon_cuenta_contable_linea()!=null && !parametroinvenOrigen.getcon_cuenta_contable_linea().equals(false))) {parametroinven.setcon_cuenta_contable_linea(parametroinvenOrigen.getcon_cuenta_contable_linea());}
			if(conDefault || (!conDefault && parametroinvenOrigen.getcon_cuenta_banco()!=null && !parametroinvenOrigen.getcon_cuenta_banco().equals(false))) {parametroinven.setcon_cuenta_banco(parametroinvenOrigen.getcon_cuenta_banco());}
			if(conDefault || (!conDefault && parametroinvenOrigen.getcon_copiar_producto()!=null && !parametroinvenOrigen.getcon_copiar_producto().equals(false))) {parametroinven.setcon_copiar_producto(parametroinvenOrigen.getcon_copiar_producto());}
			if(conDefault || (!conDefault && parametroinvenOrigen.getcon_crear_producto_sucursal()!=null && !parametroinvenOrigen.getcon_crear_producto_sucursal().equals(false))) {parametroinven.setcon_crear_producto_sucursal(parametroinvenOrigen.getcon_crear_producto_sucursal());}
			if(conDefault || (!conDefault && parametroinvenOrigen.getcon_crear_lista_precio_sucursal_bodega()!=null && !parametroinvenOrigen.getcon_crear_lista_precio_sucursal_bodega().equals(false))) {parametroinven.setcon_crear_lista_precio_sucursal_bodega(parametroinvenOrigen.getcon_crear_lista_precio_sucursal_bodega());}
			if(conDefault || (!conDefault && parametroinvenOrigen.getcon_compras_aprobacion()!=null && !parametroinvenOrigen.getcon_compras_aprobacion().equals(false))) {parametroinven.setcon_compras_aprobacion(parametroinvenOrigen.getcon_compras_aprobacion());}
			if(conDefault || (!conDefault && parametroinvenOrigen.getcon_envio_mail()!=null && !parametroinvenOrigen.getcon_envio_mail().equals(false))) {parametroinven.setcon_envio_mail(parametroinvenOrigen.getcon_envio_mail());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroInven(ParametroInven parametroinven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroInven.jLabelidParametroInven.setText(parametroinven.getId().toString());
			this.jInternalFrameDetalleFormParametroInven.jTextFieldsecuencial_pedidoParametroInven.setText(parametroinven.getsecuencial_pedido().toString());
			this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_serieParametroInven.setText(parametroinven.getnumero_serie().toString());
			this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_decimalesParametroInven.setText(parametroinven.getnumero_decimales().toString());
			this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_items_requisicionParametroInven.setText(parametroinven.getnumero_items_requisicion().toString());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contableParametroInven.setSelected(parametroinven.getcon_cuenta_contable());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contable_lineaParametroInven.setSelected(parametroinven.getcon_cuenta_contable_linea());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_bancoParametroInven.setSelected(parametroinven.getcon_cuenta_banco());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_copiar_productoParametroInven.setSelected(parametroinven.getcon_copiar_producto());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_producto_sucursalParametroInven.setSelected(parametroinven.getcon_crear_producto_sucursal());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven.setSelected(parametroinven.getcon_crear_lista_precio_sucursal_bodega());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_compras_aprobacionParametroInven.setSelected(parametroinven.getcon_compras_aprobacion());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_envio_mailParametroInven.setSelected(parametroinven.getcon_envio_mail());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroInven(ParametroInvenBean parametroinvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroInven.jLabelidParametroInven.setText(parametroinvenBean.getId().toString());
			this.jInternalFrameDetalleFormParametroInven.jTextFieldsecuencial_pedidoParametroInven.setText(parametroinvenBean.getsecuencial_pedido().toString());
			this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_serieParametroInven.setText(parametroinvenBean.getnumero_serie().toString());
			this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_decimalesParametroInven.setText(parametroinvenBean.getnumero_decimales().toString());
			this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_items_requisicionParametroInven.setText(parametroinvenBean.getnumero_items_requisicion().toString());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contableParametroInven.setSelected(parametroinvenBean.getcon_cuenta_contable());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contable_lineaParametroInven.setSelected(parametroinvenBean.getcon_cuenta_contable_linea());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_bancoParametroInven.setSelected(parametroinvenBean.getcon_cuenta_banco());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_copiar_productoParametroInven.setSelected(parametroinvenBean.getcon_copiar_producto());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_producto_sucursalParametroInven.setSelected(parametroinvenBean.getcon_crear_producto_sucursal());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven.setSelected(parametroinvenBean.getcon_crear_lista_precio_sucursal_bodega());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_compras_aprobacionParametroInven.setSelected(parametroinvenBean.getcon_compras_aprobacion());
			this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_envio_mailParametroInven.setSelected(parametroinvenBean.getcon_envio_mail());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParametroInven(ParametroInvenParameterReturnGeneral parametroinvenReturnGeneral,ParametroInvenBean parametroinvenBean,Boolean conDefault) throws Exception { 
		try {
			ParametroInven parametroinvenLocal=new ParametroInven();
			
			parametroinvenLocal=parametroinvenReturnGeneral.getParametroInven();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametroinvenLocal.getId()!=null && !parametroinvenLocal.getId().equals(0L))) {parametroinvenBean.setId(parametroinvenLocal.getId());}}
			if(conDefault || (!conDefault && parametroinvenLocal.getsecuencial_pedido()!=null && !parametroinvenLocal.getsecuencial_pedido().equals(0))) {parametroinvenBean.setsecuencial_pedido(parametroinvenLocal.getsecuencial_pedido());}
			if(conDefault || (!conDefault && parametroinvenLocal.getnumero_serie()!=null && !parametroinvenLocal.getnumero_serie().equals(0))) {parametroinvenBean.setnumero_serie(parametroinvenLocal.getnumero_serie());}
			if(conDefault || (!conDefault && parametroinvenLocal.getnumero_decimales()!=null && !parametroinvenLocal.getnumero_decimales().equals(0))) {parametroinvenBean.setnumero_decimales(parametroinvenLocal.getnumero_decimales());}
			if(conDefault || (!conDefault && parametroinvenLocal.getnumero_items_requisicion()!=null && !parametroinvenLocal.getnumero_items_requisicion().equals(0))) {parametroinvenBean.setnumero_items_requisicion(parametroinvenLocal.getnumero_items_requisicion());}
			if(conDefault || (!conDefault && parametroinvenLocal.getcon_cuenta_contable()!=null && !parametroinvenLocal.getcon_cuenta_contable().equals(false))) {parametroinvenBean.setcon_cuenta_contable(parametroinvenLocal.getcon_cuenta_contable());}
			if(conDefault || (!conDefault && parametroinvenLocal.getcon_cuenta_contable_linea()!=null && !parametroinvenLocal.getcon_cuenta_contable_linea().equals(false))) {parametroinvenBean.setcon_cuenta_contable_linea(parametroinvenLocal.getcon_cuenta_contable_linea());}
			if(conDefault || (!conDefault && parametroinvenLocal.getcon_cuenta_banco()!=null && !parametroinvenLocal.getcon_cuenta_banco().equals(false))) {parametroinvenBean.setcon_cuenta_banco(parametroinvenLocal.getcon_cuenta_banco());}
			if(conDefault || (!conDefault && parametroinvenLocal.getcon_copiar_producto()!=null && !parametroinvenLocal.getcon_copiar_producto().equals(false))) {parametroinvenBean.setcon_copiar_producto(parametroinvenLocal.getcon_copiar_producto());}
			if(conDefault || (!conDefault && parametroinvenLocal.getcon_crear_producto_sucursal()!=null && !parametroinvenLocal.getcon_crear_producto_sucursal().equals(false))) {parametroinvenBean.setcon_crear_producto_sucursal(parametroinvenLocal.getcon_crear_producto_sucursal());}
			if(conDefault || (!conDefault && parametroinvenLocal.getcon_crear_lista_precio_sucursal_bodega()!=null && !parametroinvenLocal.getcon_crear_lista_precio_sucursal_bodega().equals(false))) {parametroinvenBean.setcon_crear_lista_precio_sucursal_bodega(parametroinvenLocal.getcon_crear_lista_precio_sucursal_bodega());}
			if(conDefault || (!conDefault && parametroinvenLocal.getcon_compras_aprobacion()!=null && !parametroinvenLocal.getcon_compras_aprobacion().equals(false))) {parametroinvenBean.setcon_compras_aprobacion(parametroinvenLocal.getcon_compras_aprobacion());}
			if(conDefault || (!conDefault && parametroinvenLocal.getcon_envio_mail()!=null && !parametroinvenLocal.getcon_envio_mail().equals(false))) {parametroinvenBean.setcon_envio_mail(parametroinvenLocal.getcon_envio_mail());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParametroInvenGenerico(Long idParametroInvenSeleccionado,JComboBox jComboBoxParametroInven,List<ParametroInven> parametroinvensLocal)throws Exception {
		try {
			ParametroInven  parametroinvenTemp=null;

			for(ParametroInven parametroinvenAux:parametroinvensLocal) {
				if(parametroinvenAux.getId()!=null && parametroinvenAux.getId().equals(idParametroInvenSeleccionado)) {
					parametroinvenTemp=parametroinvenAux;
					break;
				}
			}

			jComboBoxParametroInven.setSelectedItem(parametroinvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParametroInvenGenerico(JComboBox jComboBoxParametroInven,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroInven.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroInven.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametroinven=(ParametroInven) parametroinvenLogic.getParametroInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametroinven =(ParametroInven) parametroinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!parametroinven.getIsNew() && !parametroinven.getIsChanged() && !parametroinven.getIsDeleted()) {
				sDescripcion=parametroinven.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=parametroinven.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroInven parametroinvenRow=new ParametroInven();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametroinvenRow=(ParametroInven) parametroinvenLogic.getParametroInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametroinvenRow=(ParametroInven) parametroinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParametroInven(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParametroInven.setVisible((this.isVisibilidadCeldaNuevoParametroInven && this.isPermisoNuevoParametroInven));			
			this.jButtonDuplicarParametroInven.setVisible((this.isVisibilidadCeldaDuplicarParametroInven && this.isPermisoDuplicarParametroInven));			
			this.jButtonCopiarParametroInven.setVisible((this.isVisibilidadCeldaCopiarParametroInven && this.isPermisoCopiarParametroInven));
			this.jButtonVerFormParametroInven.setVisible((this.isVisibilidadCeldaVerFormParametroInven && this.isPermisoVerFormParametroInven));
			
			this.jButtonAbrirOrderByParametroInven.setVisible((this.isVisibilidadCeldaOrdenParametroInven && this.isPermisoOrdenParametroInven));			
			
			this.jButtonNuevoRelacionesParametroInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroInven && this.isPermisoNuevoParametroInven));			
			this.jButtonNuevoGuardarCambiosParametroInven.setVisible((this.isVisibilidadCeldaNuevoParametroInven && this.isPermisoNuevoParametroInven && this.isPermisoGuardarCambiosParametroInven));
			
			if(this.jInternalFrameDetalleFormParametroInven!=null) {
			this.jInternalFrameDetalleFormParametroInven.jButtonModificarParametroInven.setVisible((this.isVisibilidadCeldaModificarParametroInven && this.isPermisoActualizarParametroInven));	
			this.jInternalFrameDetalleFormParametroInven.jButtonActualizarParametroInven.setVisible((this.isVisibilidadCeldaActualizarParametroInven && this.isPermisoActualizarParametroInven));	
			this.jInternalFrameDetalleFormParametroInven.jButtonEliminarParametroInven.setVisible((this.isVisibilidadCeldaEliminarParametroInven && this.isPermisoEliminarParametroInven));
			this.jInternalFrameDetalleFormParametroInven.jButtonCancelarParametroInven.setVisible(this.isVisibilidadCeldaCancelarParametroInven);							
			this.jInternalFrameDetalleFormParametroInven.jButtonGuardarCambiosParametroInven.setVisible((this.isVisibilidadCeldaGuardarParametroInven && this.isPermisoGuardarCambiosParametroInven));			
			
			}
						
			this.jButtonGuardarCambiosTablaParametroInven.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroInven && this.isPermisoGuardarCambiosParametroInven));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParametroInven.setVisible((this.isVisibilidadCeldaNuevoParametroInven && this.isPermisoNuevoParametroInven));						
			this.jButtonDuplicarToolBarParametroInven.setVisible((this.isVisibilidadCeldaDuplicarParametroInven && this.isPermisoDuplicarParametroInven));						
			this.jButtonCopiarToolBarParametroInven.setVisible((this.isVisibilidadCeldaCopiarParametroInven && this.isPermisoCopiarParametroInven));			
			this.jButtonVerFormToolBarParametroInven.setVisible((this.isVisibilidadCeldaVerFormParametroInven && this.isPermisoVerFormParametroInven));			
			this.jButtonAbrirOrderByToolBarParametroInven.setVisible((this.isVisibilidadCeldaOrdenParametroInven && this.isPermisoOrdenParametroInven));
			this.jButtonNuevoRelacionesToolBarParametroInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroInven && this.isPermisoNuevoParametroInven));			
			this.jButtonNuevoGuardarCambiosToolBarParametroInven.setVisible((this.isVisibilidadCeldaNuevoParametroInven && this.isPermisoNuevoParametroInven && this.isPermisoGuardarCambiosParametroInven));			
			
			if(this.jInternalFrameDetalleFormParametroInven!=null) {
			this.jInternalFrameDetalleFormParametroInven.jButtonModificarToolBarParametroInven.setVisible((this.isVisibilidadCeldaModificarParametroInven && this.isPermisoActualizarParametroInven));	
			this.jInternalFrameDetalleFormParametroInven.jButtonActualizarToolBarParametroInven.setVisible((this.isVisibilidadCeldaActualizarParametroInven  && this.isPermisoActualizarParametroInven));	
			this.jInternalFrameDetalleFormParametroInven.jButtonEliminarToolBarParametroInven.setVisible((this.isVisibilidadCeldaEliminarParametroInven && this.isPermisoEliminarParametroInven));
			this.jInternalFrameDetalleFormParametroInven.jButtonCancelarToolBarParametroInven.setVisible(this.isVisibilidadCeldaCancelarParametroInven);				
			this.jInternalFrameDetalleFormParametroInven.jButtonGuardarCambiosToolBarParametroInven.setVisible((this.isVisibilidadCeldaGuardarParametroInven && this.isPermisoGuardarCambiosParametroInven));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParametroInven.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroInven && this.isPermisoGuardarCambiosParametroInven));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParametroInven.setVisible((this.isVisibilidadCeldaNuevoParametroInven && this.isPermisoNuevoParametroInven));			
			this.jMenuItemDuplicarParametroInven.setVisible((this.isVisibilidadCeldaDuplicarParametroInven && this.isPermisoDuplicarParametroInven));			
			this.jMenuItemCopiarParametroInven.setVisible((this.isVisibilidadCeldaCopiarParametroInven && this.isPermisoCopiarParametroInven));			
			this.jMenuItemVerFormParametroInven.setVisible((this.isVisibilidadCeldaVerFormParametroInven && this.isPermisoVerFormParametroInven));			
			this.jMenuItemAbrirOrderByParametroInven.setVisible((this.isVisibilidadCeldaOrdenParametroInven && this.isPermisoOrdenParametroInven));			
			//this.jMenuItemMostrarOcultarParametroInven.setVisible((this.isVisibilidadCeldaOrdenParametroInven && this.isPermisoOrdenParametroInven));
			this.jMenuItemDetalleAbrirOrderByParametroInven.setVisible((this.isVisibilidadCeldaOrdenParametroInven && this.isPermisoOrdenParametroInven));			
			//this.jMenuItemDetalleMostrarOcultarParametroInven.setVisible((this.isVisibilidadCeldaOrdenParametroInven && this.isPermisoOrdenParametroInven));			
			this.jMenuItemNuevoRelacionesParametroInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroInven && this.isPermisoNuevoParametroInven));			
			this.jMenuItemNuevoGuardarCambiosParametroInven.setVisible((this.isVisibilidadCeldaNuevoParametroInven && this.isPermisoNuevoParametroInven && this.isPermisoGuardarCambiosParametroInven));									
			
			if(this.jInternalFrameDetalleFormParametroInven!=null) {
			this.jInternalFrameDetalleFormParametroInven.jMenuItemModificarParametroInven.setVisible((this.isVisibilidadCeldaModificarParametroInven && this.isPermisoActualizarParametroInven));	
			this.jInternalFrameDetalleFormParametroInven.jMenuItemActualizarParametroInven.setVisible((this.isVisibilidadCeldaActualizarParametroInven && this.isPermisoActualizarParametroInven));	
			this.jInternalFrameDetalleFormParametroInven.jMenuItemEliminarParametroInven.setVisible((this.isVisibilidadCeldaEliminarParametroInven && this.isPermisoEliminarParametroInven));
			this.jInternalFrameDetalleFormParametroInven.jMenuItemCancelarParametroInven.setVisible(this.isVisibilidadCeldaCancelarParametroInven);				
			}
			
			this.jMenuItemGuardarCambiosParametroInven.setVisible((this.isVisibilidadCeldaGuardarParametroInven && this.isPermisoGuardarCambiosParametroInven));						
			this.jMenuItemGuardarCambiosTablaParametroInven.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroInven && this.isPermisoGuardarCambiosParametroInven));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParametroInven=this.jButtonNuevoParametroInven.isVisible();
			this.isVisibilidadCeldaDuplicarParametroInven=this.jButtonDuplicarParametroInven.isVisible();
			this.isVisibilidadCeldaCopiarParametroInven=this.jButtonCopiarParametroInven.isVisible();
			this.isVisibilidadCeldaVerFormParametroInven=this.jButtonVerFormParametroInven.isVisible();
			
			this.isVisibilidadCeldaOrdenParametroInven=this.jButtonAbrirOrderByParametroInven.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParametroInven=this.jButtonNuevoRelacionesParametroInven.isVisible();
			this.isVisibilidadCeldaModificarParametroInven=this.jButtonModificarParametroInven.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroInven!=null) {
			this.isVisibilidadCeldaActualizarParametroInven=this.jInternalFrameDetalleFormParametroInven.jButtonActualizarParametroInven.isVisible();
			this.isVisibilidadCeldaEliminarParametroInven=this.jInternalFrameDetalleFormParametroInven.jButtonEliminarParametroInven.isVisible();
			this.isVisibilidadCeldaCancelarParametroInven=this.jInternalFrameDetalleFormParametroInven.jButtonCancelarParametroInven.isVisible();
			this.isVisibilidadCeldaGuardarParametroInven=this.jInternalFrameDetalleFormParametroInven.jButtonGuardarCambiosParametroInven.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParametroInven=this.jButtonGuardarCambiosTablaParametroInven.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParametroInven=this.jButtonNuevoToolBarParametroInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroInven=this.jButtonNuevoRelacionesToolBarParametroInven.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroInven!=null) {
			this.isVisibilidadCeldaModificarParametroInven=this.jInternalFrameDetalleFormParametroInven.jButtonModificarToolBarParametroInven.isVisible();
			this.isVisibilidadCeldaActualizarParametroInven=this.jInternalFrameDetalleFormParametroInven.jButtonActualizarToolBarParametroInven.isVisible();
			this.isVisibilidadCeldaEliminarParametroInven=this.jInternalFrameDetalleFormParametroInven.jButtonEliminarToolBarParametroInven.isVisible();
			this.isVisibilidadCeldaCancelarParametroInven=this.jInternalFrameDetalleFormParametroInven.jButtonCancelarToolBarParametroInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroInven=this.jButtonGuardarCambiosToolBarParametroInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroInven=this.jButtonGuardarCambiosTablaToolBarParametroInven.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParametroInven=this.jMenuItemNuevoParametroInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroInven=this.jMenuItemNuevoRelacionesParametroInven.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroInven!=null) {
			this.isVisibilidadCeldaModificarParametroInven=this.jInternalFrameDetalleFormParametroInven.jMenuItemModificarParametroInven.isVisible();
			this.isVisibilidadCeldaActualizarParametroInven=this.jInternalFrameDetalleFormParametroInven.jMenuItemActualizarParametroInven.isVisible();
			this.isVisibilidadCeldaEliminarParametroInven=this.jInternalFrameDetalleFormParametroInven.jMenuItemEliminarParametroInven.isVisible();
			this.isVisibilidadCeldaCancelarParametroInven=this.jInternalFrameDetalleFormParametroInven.jMenuItemCancelarParametroInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroInven=this.jMenuItemGuardarCambiosParametroInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroInven=this.jMenuItemGuardarCambiosTablaParametroInven.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParametroInven(Boolean esInicializar) {
		if(ParametroInvenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parametroinvenSessionBean.getConGuardarRelaciones()) {
				//if(this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParametroInven();
			}
			
			this.inicializarActualizarBindingBotonesManualParametroInven(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParametroInven() {
		this.jButtonNuevoParametroInven.setVisible(this.isPermisoNuevoParametroInven);			
		this.jButtonDuplicarParametroInven.setVisible(this.isPermisoDuplicarParametroInven);			
		this.jButtonCopiarParametroInven.setVisible(this.isPermisoCopiarParametroInven);			
		this.jButtonVerFormParametroInven.setVisible(this.isPermisoVerFormParametroInven);			
		
		this.jButtonAbrirOrderByParametroInven.setVisible(this.isPermisoOrdenParametroInven);					
		
		this.jButtonNuevoRelacionesParametroInven.setVisible(this.isPermisoNuevoParametroInven);			
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroInven.jButtonModificarParametroInven.setVisible(this.isPermisoActualizarParametroInven);	
			this.jInternalFrameDetalleFormParametroInven.jButtonActualizarParametroInven.setVisible(this.isPermisoActualizarParametroInven);	
			this.jInternalFrameDetalleFormParametroInven.jButtonEliminarParametroInven.setVisible(this.isPermisoEliminarParametroInven);
			this.jInternalFrameDetalleFormParametroInven.jButtonCancelarParametroInven.setVisible(this.isVisibilidadCeldaCancelarParametroInven);						
			this.jInternalFrameDetalleFormParametroInven.jButtonGuardarCambiosParametroInven.setVisible(this.isPermisoGuardarCambiosParametroInven);							
		}
		
		this.jButtonGuardarCambiosTablaParametroInven.setVisible(this.isPermisoActualizarParametroInven);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroInven() {
		this.jInternalFrameDetalleFormParametroInven.jButtonModificarParametroInven.setVisible(this.isPermisoActualizarParametroInven);	
		this.jInternalFrameDetalleFormParametroInven.jButtonActualizarParametroInven.setVisible(this.isPermisoActualizarParametroInven);	
		this.jInternalFrameDetalleFormParametroInven.jButtonEliminarParametroInven.setVisible(this.isPermisoEliminarParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jButtonCancelarParametroInven.setVisible(this.isVisibilidadCeldaCancelarParametroInven);							
		this.jInternalFrameDetalleFormParametroInven.jButtonGuardarCambiosParametroInven.setVisible((this.isVisibilidadCeldaGuardarParametroInven && this.isPermisoGuardarCambiosParametroInven));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParametroInven() {
		if(ParametroInvenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParametroInven();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParametroInven() {
	}
	
	public void jTableDatosParametroInvenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParametroInven(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParametroInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroInven(this.getparametroinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroinven==null) {
						this.parametroinven = new ParametroInven();
					}

					this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
				}

				if(this.parametroinven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parametroinven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaParametroInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebParametroInven(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroInven(this.getparametroinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.parametroinvenLogic.getConnexion());

				if(this.parametroinven.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.parametroinven.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroInven=(TitledBorder)this.jScrollPanelDatosParametroInven.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderParametroInven.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaParametroInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroInven(this.getparametroinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroinven==null) {
						this.parametroinven = new ParametroInven();
					}

					this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
				}

				if(this.parametroinven.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.parametroinven.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencial_pedidoParametroInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroInven(this.getparametroinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroinven==null) {
						this.parametroinven = new ParametroInven();
					}

					this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
				}

				if(this.parametroinven.getsecuencial_pedido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial_pedido = "+this.parametroinven.getsecuencial_pedido().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_serieParametroInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroInven(this.getparametroinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroinven==null) {
						this.parametroinven = new ParametroInven();
					}

					this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
				}

				if(this.parametroinven.getnumero_serie()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_serie = "+this.parametroinven.getnumero_serie().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_decimalesParametroInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroInven(this.getparametroinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroinven==null) {
						this.parametroinven = new ParametroInven();
					}

					this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
				}

				if(this.parametroinven.getnumero_decimales()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_decimales = "+this.parametroinven.getnumero_decimales().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_items_requisicionParametroInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroInven(this.getparametroinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroinven==null) {
						this.parametroinven = new ParametroInven();
					}

					this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
				}

				if(this.parametroinven.getnumero_items_requisicion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_items_requisicion = "+this.parametroinven.getnumero_items_requisicion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_cuenta_contableParametroInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroInven(this.getparametroinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroinven==null) {
						this.parametroinven = new ParametroInven();
					}

					this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
				}

				if(this.parametroinven.getcon_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_cuenta_contable = "+this.parametroinven.getcon_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_cuenta_contable_lineaParametroInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroInven(this.getparametroinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroinven==null) {
						this.parametroinven = new ParametroInven();
					}

					this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
				}

				if(this.parametroinven.getcon_cuenta_contable_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_cuenta_contable_linea = "+this.parametroinven.getcon_cuenta_contable_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_cuenta_bancoParametroInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroInven(this.getparametroinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroinven==null) {
						this.parametroinven = new ParametroInven();
					}

					this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
				}

				if(this.parametroinven.getcon_cuenta_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_cuenta_banco = "+this.parametroinven.getcon_cuenta_banco().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_copiar_productoParametroInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroInven(this.getparametroinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroinven==null) {
						this.parametroinven = new ParametroInven();
					}

					this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
				}

				if(this.parametroinven.getcon_copiar_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_copiar_producto = "+this.parametroinven.getcon_copiar_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_crear_producto_sucursalParametroInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroInven(this.getparametroinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroinven==null) {
						this.parametroinven = new ParametroInven();
					}

					this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
				}

				if(this.parametroinven.getcon_crear_producto_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_crear_producto_sucursal = "+this.parametroinven.getcon_crear_producto_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_crear_lista_precio_sucursal_bodegaParametroInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroInven(this.getparametroinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroinven==null) {
						this.parametroinven = new ParametroInven();
					}

					this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
				}

				if(this.parametroinven.getcon_crear_lista_precio_sucursal_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_crear_lista_precio_sucursal_bodega = "+this.parametroinven.getcon_crear_lista_precio_sucursal_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_compras_aprobacionParametroInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroInven(this.getparametroinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroinven==null) {
						this.parametroinven = new ParametroInven();
					}

					this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
				}

				if(this.parametroinven.getcon_compras_aprobacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_compras_aprobacion = "+this.parametroinven.getcon_compras_aprobacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_envio_mailParametroInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroInven(this.getparametroinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroinven==null) {
						this.parametroinven = new ParametroInven();
					}

					this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);
				}

				if(this.parametroinven.getcon_envio_mail()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_envio_mail = "+this.parametroinven.getcon_envio_mail().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaParametroInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroInven(false,false);

			this.getParametroInvensFK_IdEmpresa();

			this.inicializarActualizarBindingParametroInven(false);

			//if(ParametroInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameParametroInven() {
		if(this.jInternalFrameDetalleFormParametroInven!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) {
			this.jInternalFrameDetalleFormParametroInven.setVisible(false);	    			
			this.jInternalFrameDetalleFormParametroInven.dispose();
			this.jInternalFrameDetalleFormParametroInven=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParametroInven!=null) {
			this.jInternalFrameReporteDinamicoParametroInven.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParametroInven.dispose();
			this.jInternalFrameReporteDinamicoParametroInven=null;
		}
		
		if(this.jInternalFrameImportacionParametroInven!=null) {
			this.jInternalFrameImportacionParametroInven.setVisible(false);	    			
			this.jInternalFrameImportacionParametroInven.dispose();
			this.jInternalFrameImportacionParametroInven=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParametroInven();
			
			ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoParametroInven")) {
				jButtonNuevoParametroInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParametroInven")) {
				jButtonDuplicarParametroInvenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParametroInven")) {
				jButtonCopiarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormParametroInven")) {
				jButtonVerFormParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParametroInven")) {
				jButtonNuevoParametroInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParametroInven")) {
				jButtonDuplicarParametroInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParametroInven")) {
				jButtonNuevoParametroInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParametroInven")) {
				jButtonDuplicarParametroInvenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParametroInven")) {
				jButtonNuevoParametroInvenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParametroInven")) {
				jButtonNuevoParametroInvenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParametroInven")) {
				jButtonNuevoParametroInvenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParametroInven")) {
				jButtonModificarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParametroInven")) {
				jButtonModificarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParametroInven")) {
				jButtonModificarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParametroInven")) {
				jButtonActualizarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParametroInven")) {
				jButtonActualizarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParametroInven")) {
				jButtonActualizarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarParametroInven")) {
				jButtonEliminarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParametroInven")) {
				jButtonEliminarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParametroInven")) {
				jButtonEliminarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarParametroInven")) {
				jButtonCancelarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParametroInven")) {
				jButtonCancelarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParametroInven")) {
				jButtonCancelarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarParametroInven")) {
				jButtonCerrarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParametroInven")) {
				jButtonCerrarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParametroInven")) {
				jButtonCerrarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParametroInven")) {
				jButtonMostrarOcultarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParametroInven")) {
				jButtonCancelarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParametroInven")) {
				jButtonGuardarCambiosParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParametroInven")) {
				jButtonGuardarCambiosParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParametroInven")) {
				jButtonCopiarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParametroInven")) {
				jButtonVerFormParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParametroInven")) {
				jButtonGuardarCambiosParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParametroInven")) {
				jButtonCopiarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParametroInven")) {
				jButtonVerFormParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParametroInven")) {
				jButtonGuardarCambiosParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParametroInven")) {
				jButtonGuardarCambiosParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParametroInven")) {
				jButtonGuardarCambiosParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParametroInven")) {
				jButtonRecargarInformacionParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParametroInven")) {
				jButtonRecargarInformacionParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParametroInven")) {
				jButtonRecargarInformacionParametroInvenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParametroInven")) {
				jButtonAnterioresParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParametroInven")) {
				jButtonAnterioresParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParametroInven")) {
				jButtonAnterioresParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParametroInven")) {
				jButtonSiguientesParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParametroInven")) {
				jButtonSiguientesParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParametroInven")) {
				jButtonSiguientesParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParametroInven") || sTipo.equals("MenuItemDetalleAbrirOrderByParametroInven")) {
				jButtonAbrirOrderByParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParametroInven") || sTipo.equals("MenuItemDetalleMostrarOcultarParametroInven")) {
				jButtonMostrarOcultarParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParametroInven")) {
				jButtonNuevoGuardarCambiosParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParametroInven")) {
				jButtonNuevoGuardarCambiosParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParametroInven")) {
				jButtonNuevoGuardarCambiosParametroInvenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParametroInven")) {
				jButtonCerrarReporteDinamicoParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParametroInven")) {
				jButtonGenerarReporteDinamicoParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParametroInven")) {
				
				jButtonGenerarExcelReporteDinamicoParametroInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParametroInven")) {
				jButtonCerrarImportacionParametroInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParametroInven")) {
				
				jButtonGenerarImportacionParametroInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParametroInven")) {
				
				jButtonAbrirImportacionParametroInvenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParametroInven")) {
				jComboBoxTiposAccionesParametroInvenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParametroInven")) {
				jComboBoxTiposRelacionesParametroInvenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParametroInven")) {
				jComboBoxTiposAccionesParametroInvenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParametroInven")) {
				
				jComboBoxTiposSeleccionarParametroInvenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParametroInven")) {
				jTextFieldValorCampoGeneralParametroInvenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParametroInven")) {
				jButtonAbrirOrderByParametroInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParametroInven")) {
				jButtonAbrirOrderByParametroInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParametroInven")) {
				jButtonCerrarOrderByParametroInvenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroInvenBusqueda")) {
				this.jButtonidParametroInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroInvenUpdate")) {
				this.jButtonid_empresaParametroInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroInvenBusqueda")) {
				this.jButtonid_empresaParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencial_pedidoParametroInvenBusqueda")) {
				this.jButtonsecuencial_pedidoParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_serieParametroInvenBusqueda")) {
				this.jButtonnumero_serieParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_decimalesParametroInvenBusqueda")) {
				this.jButtonnumero_decimalesParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_items_requisicionParametroInvenBusqueda")) {
				this.jButtonnumero_items_requisicionParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_cuenta_contableParametroInvenBusqueda")) {
				this.jButtoncon_cuenta_contableParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_cuenta_contable_lineaParametroInvenBusqueda")) {
				this.jButtoncon_cuenta_contable_lineaParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_cuenta_bancoParametroInvenBusqueda")) {
				this.jButtoncon_cuenta_bancoParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_copiar_productoParametroInvenBusqueda")) {
				this.jButtoncon_copiar_productoParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_crear_producto_sucursalParametroInvenBusqueda")) {
				this.jButtoncon_crear_producto_sucursalParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda")) {
				this.jButtoncon_crear_lista_precio_sucursal_bodegaParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_compras_aprobacionParametroInvenBusqueda")) {
				this.jButtoncon_compras_aprobacionParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_envio_mailParametroInvenBusqueda")) {
				this.jButtoncon_envio_mailParametroInvenBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParametroInven();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroinven);
				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
				
				


				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ParametroInven parametroinvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametroinvenLocal=this.parametroinven;
			} else {
				parametroinvenLocal=this.parametroinvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroinven);
				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
							
				
				


				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenAnterior =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroinvenAnterior =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
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
			
			ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
			
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
			
			


			
			ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroinven);
				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
								
						
				


				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroInven.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroinven);
				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
								
				
				


				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenAnterior =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroinvenAnterior =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroinven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenAnterior =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroinvenAnterior =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametroinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroinven);
				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
							
				
				


				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroInven.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroinvenAnterior =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametroinvenAnterior =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
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
			
			ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
			
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
			
			


			
			ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroInvenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametroinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroinven);
				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
								
				
				


				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenAnterior =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroinvenAnterior =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametroinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroinven);
				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParametroInven")) {
					jCheckBoxSeleccionarTodosParametroInvenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParametroInven")) {
					jCheckBoxSeleccionadosParametroInvenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParametroInven")) {
					
				}
				
				


				
				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroinven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parametroinven);
				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
												
				
				


				
				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroinvenAnterior =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametroinvenAnterior =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroInvenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroinven);
				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
				
				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
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
			
			ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
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
			
			


			
			ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroinven);
				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroInven.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroInven.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroinven);
				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
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
				
				


				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroInven.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroinvenAnterior =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroinvenAnterior =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParametroInven")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParametroInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParametroInven.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parametroinven =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parametroinven =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parametroinven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParametroInven")) {
				
				}
				
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParametroInven")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParametroInven.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParametroInven")) {
			
			}
			
			ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParametroInven();
			
			ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
			
			if(sTipo.equals("NuevoParametroInven")) {
				jButtonNuevoParametroInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParametroInven")) {
				jButtonDuplicarParametroInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParametroInven")) {
				jButtonCopiarParametroInvenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParametroInven")) {
				jButtonVerFormParametroInvenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParametroInven")) {
				jButtonNuevoParametroInvenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParametroInven")) {
				jButtonModificarParametroInvenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParametroInven")) {
				jButtonActualizarParametroInvenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParametroInven")) {
				jButtonEliminarParametroInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParametroInven")) {
				jButtonGuardarCambiosParametroInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParametroInven")) {
				jButtonCancelarParametroInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParametroInven")) {
				jButtonCerrarParametroInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParametroInven")) {
				jButtonGuardarCambiosParametroInvenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParametroInven")) {
				jButtonNuevoGuardarCambiosParametroInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParametroInven")) {
				jButtonAbrirOrderByParametroInvenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParametroInven")) {
				jButtonRecargarInformacionParametroInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParametroInven")) {
				jButtonAnterioresParametroInvenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParametroInven")) {
				jButtonSiguientesParametroInvenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroInvenBusqueda")) {
				this.jButtonidParametroInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroInvenUpdate")) {
				this.jButtonid_empresaParametroInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroInvenBusqueda")) {
				this.jButtonid_empresaParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencial_pedidoParametroInvenBusqueda")) {
				this.jButtonsecuencial_pedidoParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_serieParametroInvenBusqueda")) {
				this.jButtonnumero_serieParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_decimalesParametroInvenBusqueda")) {
				this.jButtonnumero_decimalesParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_items_requisicionParametroInvenBusqueda")) {
				this.jButtonnumero_items_requisicionParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_cuenta_contableParametroInvenBusqueda")) {
				this.jButtoncon_cuenta_contableParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_cuenta_contable_lineaParametroInvenBusqueda")) {
				this.jButtoncon_cuenta_contable_lineaParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_cuenta_bancoParametroInvenBusqueda")) {
				this.jButtoncon_cuenta_bancoParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_copiar_productoParametroInvenBusqueda")) {
				this.jButtoncon_copiar_productoParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_crear_producto_sucursalParametroInvenBusqueda")) {
				this.jButtoncon_crear_producto_sucursalParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda")) {
				this.jButtoncon_crear_lista_precio_sucursal_bodegaParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_compras_aprobacionParametroInvenBusqueda")) {
				this.jButtoncon_compras_aprobacionParametroInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_envio_mailParametroInvenBusqueda")) {
				this.jButtoncon_envio_mailParametroInvenBusquedaActionPerformed(evt);
			}
			
			ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParametroInven();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParametroInven")) {
				closingInternalFrameParametroInven();
				
			} else if(sTipo.equals("jButtonCancelarParametroInven")) {
				JInternalFrameBase jInternalFrameDetalleFormParametroInven = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroInvenBeanSwingJInternalFrame jInternalFrameParent=(ParametroInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroInven.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParametroInvenActionPerformed(null);
			}
			
			ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametroinven,new Object(),this.parametroinvenParameterGeneral,this.parametroinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParametroInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParametroInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParametroInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parametroinven)) {
			if(!esControlTabla) {
				if(ParametroInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);			
				}
				
				if(this.parametroinvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParametroInven(this.parametroinven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametroinvenReturnGeneral=parametroinvenLogic.procesarEventosParametroInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroinvenLogic.getParametroInvens(),this.parametroinven,this.parametroinvenParameterGeneral,this.isEsNuevoParametroInven,classes);//this.parametroinvenLogic.getParametroInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParametroInven(this.parametroinvenReturnGeneral,this.parametroinvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parametroinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParametroInven(classes,this.parametroinvenReturnGeneral,this.parametroinvenBean,false);
					}
						
					if(this.parametroinvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParametroInven(this.parametroinvenReturnGeneral.getParametroInven());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParametroInven(this.parametroinvenReturnGeneral.getParametroInven());	
					}
						
					if(this.parametroinvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParametroInven(this.parametroinvenReturnGeneral.getParametroInven(),classes);//this.parametroinvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParametroInven(this.parametroinven,classes);//this.parametroinvenBean);									
				}
			
				if(ParametroInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParametroInven(this.parametroinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroInven(this.parametroinven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parametroinvenAnterior!=null) {
						this.parametroinven=this.parametroinvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametroinvenReturnGeneral=parametroinvenLogic.procesarEventosParametroInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroinvenLogic.getParametroInvens(),this.parametroinven,this.parametroinvenParameterGeneral,this.isEsNuevoParametroInven,classes);//this.parametroinvenLogic.getParametroInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametroinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametroinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parametroinvenReturnGeneral.getParametroInven(),parametroinvenLogic.getParametroInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parametroinvenReturnGeneral.getParametroInven(),this.parametroinvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParametroInven.repaint();
				
				//((AbstractTableModel) this.jTableDatosParametroInven.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParametroInven();
			}
		}
	}
	
	public void actualizarVisualTableDatosParametroInven() throws Exception {
		
		ParametroInvenModel parametroinvenModel=(ParametroInvenModel)this.jTableDatosParametroInven.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametroinvenModel.parametroinvens=this.parametroinvenLogic.getParametroInvens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parametroinvenModel.parametroinvens=this.parametroinvens;
		}
		
		
		((ParametroInvenModel) this.jTableDatosParametroInven.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParametroInven() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparametroinvenAnterior(),this.parametroinvenLogic.getParametroInvens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparametroinvenAnterior(),this.parametroinvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParametroInven();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParametroInven(ParametroInven parametroinven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
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
										
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroinven,new Object(),generalEntityParameterGeneral,this.parametroinvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parametroinvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParametroInvenConstantesFunciones.getClassesRelationshipsOfParametroInven(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParametroInvenConstantesFunciones.getClassesRelationshipsFromStringsOfParametroInven(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParametroInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParametroInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroinven,new Object(),generalEntityParameterGeneral,this.parametroinvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParametroInven(ParametroInvenBean parametroinvenBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParametroInven(ArrayList<Classe> classes,ParametroInvenReturnGeneral parametroinvenReturnGeneral,ParametroInvenBean parametroinvenBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParametroInven(ParametroInven parametroinven,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametroinven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParametroInven = new ParametroInvenDetalleFormJInternalFrame(jDesktopPane,this.parametroinvenSessionBean.getConGuardarRelaciones(),this.parametroinvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroInven);
		this.jInternalFrameDetalleFormParametroInven.setVisible(false);
		this.jInternalFrameDetalleFormParametroInven.setSelected(false);						
		
		this.jInternalFrameDetalleFormParametroInven.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParametroInven.parametroinvenLogic=this.parametroinvenLogic;
		
		this.cargarCombosFrameForeignKeyParametroInven("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroInven();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroInven();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParametroInven("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParametroInven();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParametroInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroInven"));
		
		this.jInternalFrameDetalleFormParametroInven.jButtonModificarParametroInven.addActionListener(new ButtonActionListener(this,"ModificarParametroInven"));

		
		this.jInternalFrameDetalleFormParametroInven.jButtonModificarToolBarParametroInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroInven"));
					
		this.jInternalFrameDetalleFormParametroInven.jMenuItemModificarParametroInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroInven"));		
		
		
		
		this.jInternalFrameDetalleFormParametroInven.jButtonActualizarParametroInven.addActionListener (new ButtonActionListener(this,"ActualizarParametroInven"));
		
		
		this.jInternalFrameDetalleFormParametroInven.jButtonActualizarToolBarParametroInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroInven"));
						
		this.jInternalFrameDetalleFormParametroInven.jMenuItemActualizarParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroInven"));		
		
		
		
		this.jInternalFrameDetalleFormParametroInven.jButtonEliminarParametroInven.addActionListener (new ButtonActionListener(this,"EliminarParametroInven"));
		
		
		this.jInternalFrameDetalleFormParametroInven.jButtonEliminarToolBarParametroInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroInven"));
								
		this.jInternalFrameDetalleFormParametroInven.jMenuItemEliminarParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroInven"));		
		
		
		
		this.jInternalFrameDetalleFormParametroInven.jButtonCancelarParametroInven.addActionListener (new ButtonActionListener(this,"CancelarParametroInven"));
		
		
		this.jInternalFrameDetalleFormParametroInven.jButtonCancelarToolBarParametroInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroInven"));
					
		this.jInternalFrameDetalleFormParametroInven.jMenuItemCancelarParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroInven"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParametroInven.jMenuItemDetalleCerrarParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroInven"));		
		
		
		
		this.jInternalFrameDetalleFormParametroInven.jButtonGuardarCambiosToolBarParametroInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroInven"));
		
		
		
		this.jInternalFrameDetalleFormParametroInven.jButtonGuardarCambiosToolBarParametroInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroInven"));
		
		
		
		this.jInternalFrameDetalleFormParametroInven.jComboBoxTiposAccionesFormularioParametroInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroInven"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonidParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"idParametroInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroInven.jButtonid_empresaParametroInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonid_empresaParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonsecuencial_pedidoParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"secuencial_pedidoParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonnumero_serieParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonnumero_decimalesParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_decimalesParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonnumero_items_requisicionParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_items_requisicionParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_cuenta_contableParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_cuenta_contableParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_cuenta_contable_lineaParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_cuenta_contable_lineaParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_cuenta_bancoParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_cuenta_bancoParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_copiar_productoParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_copiar_productoParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_crear_producto_sucursalParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_crear_producto_sucursalParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_compras_aprobacionParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_compras_aprobacionParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_envio_mailParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_envio_mailParametroInvenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParametroInven.jTabbedPaneRelacionesParametroInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroInven"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParametroInven"));
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroInven"));
		}
		
		this.jTableDatosParametroInven.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParametroInven"));
		
		this.jTableDatosParametroInven.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParametroInven"));
		
		this.jButtonNuevoParametroInven.addActionListener(new ButtonActionListener(this,"NuevoParametroInven"));
		
		this.jButtonDuplicarParametroInven.addActionListener(new ButtonActionListener(this,"DuplicarParametroInven"));
		
		this.jButtonCopiarParametroInven.addActionListener(new ButtonActionListener(this,"CopiarParametroInven"));
		
		this.jButtonVerFormParametroInven.addActionListener(new ButtonActionListener(this,"VerFormParametroInven"));
		
		
		this.jButtonNuevoToolBarParametroInven.addActionListener(new ButtonActionListener(this,"NuevoToolBarParametroInven"));
			
		this.jButtonDuplicarToolBarParametroInven.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParametroInven"));
			
		this.jMenuItemNuevoParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParametroInven"));
			
		this.jMenuItemDuplicarParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParametroInven"));		
		
		
		this.jButtonNuevoRelacionesParametroInven.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParametroInven"));
		
		
		this.jButtonNuevoRelacionesToolBarParametroInven.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParametroInven"));
			
		this.jMenuItemNuevoRelacionesParametroInven.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParametroInven"));		
		
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroInven.jButtonModificarParametroInven.addActionListener(new ButtonActionListener(this,"ModificarParametroInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroInven.jButtonModificarToolBarParametroInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroInven"));
			
			this.jInternalFrameDetalleFormParametroInven.jMenuItemModificarParametroInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParametroInven.jButtonActualizarParametroInven.addActionListener (new ButtonActionListener(this,"ActualizarParametroInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroInven.jButtonActualizarToolBarParametroInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroInven"));
				
			this.jInternalFrameDetalleFormParametroInven.jMenuItemActualizarParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroInven.jButtonEliminarParametroInven.addActionListener (new ButtonActionListener(this,"EliminarParametroInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroInven.jButtonEliminarToolBarParametroInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroInven"));
						
			this.jInternalFrameDetalleFormParametroInven.jMenuItemEliminarParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroInven.jButtonCancelarParametroInven.addActionListener (new ButtonActionListener(this,"CancelarParametroInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroInven.jButtonCancelarToolBarParametroInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroInven"));
			
			this.jInternalFrameDetalleFormParametroInven.jMenuItemCancelarParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroInven"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParametroInven.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParametroInven"));		
		
		
		this.jButtonCerrarParametroInven.addActionListener (new ButtonActionListener(this,"CerrarParametroInven"));
		
		
		this.jButtonCerrarToolBarParametroInven.addActionListener (new ButtonActionListener(this,"CerrarToolBarParametroInven"));
			
		this.jMenuItemCerrarParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParametroInven"));
			
		if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroInven.jMenuItemDetalleCerrarParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroInven.jButtonGuardarCambiosParametroInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosParametroInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroInven.jButtonGuardarCambiosToolBarParametroInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroInven"));
		}
		
		this.jButtonCopiarToolBarParametroInven.addActionListener (new ButtonActionListener(this,"CopiarToolBarParametroInven"));
			
		this.jButtonVerFormToolBarParametroInven.addActionListener (new ButtonActionListener(this,"VerFormToolBarParametroInven"));
		
		this.jMenuItemGuardarCambiosParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParametroInven"));
			
		this.jMenuItemCopiarParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParametroInven"));		
		
		this.jMenuItemVerFormParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParametroInven"));		
		
		
		this.jButtonGuardarCambiosTablaParametroInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroInven"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParametroInven"));
			
		this.jMenuItemGuardarCambiosTablaParametroInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroInven"));		
		
		
		
		this.jButtonRecargarInformacionParametroInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionParametroInven"));
					
		this.jButtonRecargarInformacionToolBarParametroInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParametroInven"));
		
		this.jMenuItemRecargarInformacionParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParametroInven"));		
		
		
		
		this.jButtonAnterioresParametroInven.addActionListener (new ButtonActionListener(this,"AnterioresParametroInven"));
		
		
		this.jButtonAnterioresToolBarParametroInven.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParametroInven"));
		
		this.jMenuItemAnterioresParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParametroInven"));		
		
		
		this.jButtonSiguientesParametroInven.addActionListener (new ButtonActionListener(this,"SiguientesParametroInven"));
		
		
		this.jButtonSiguientesToolBarParametroInven.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParametroInven"));
			
		this.jMenuItemSiguientesParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParametroInven"));
			
		this.jMenuItemAbrirOrderByParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParametroInven"));
			
		this.jMenuItemMostrarOcultarParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParametroInven"));
			
		this.jMenuItemDetalleAbrirOrderByParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParametroInven"));
			
		this.jMenuItemDetalleMostarOcultarParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParametroInven"));		
		
		
		this.jButtonNuevoGuardarCambiosParametroInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParametroInven"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParametroInven"));
			
		this.jMenuItemNuevoGuardarCambiosParametroInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParametroInven"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParametroInven.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParametroInven"));

		this.jCheckBoxSeleccionadosParametroInven.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParametroInven"));
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroInven.jComboBoxTiposAccionesFormularioParametroInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroInven"));
		}
		
		
		this.jComboBoxTiposRelacionesParametroInven.addActionListener (new ButtonActionListener(this,"TiposRelacionesParametroInven"));
			
		this.jComboBoxTiposAccionesParametroInven.addActionListener (new ButtonActionListener(this,"TiposAccionesParametroInven"));
					
		this.jComboBoxTiposSeleccionarParametroInven.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParametroInven"));
			
		this.jTextFieldValorCampoGeneralParametroInven.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParametroInven"));		
		
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonidParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"idParametroInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroInven.jButtonid_empresaParametroInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonid_empresaParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonsecuencial_pedidoParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"secuencial_pedidoParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonnumero_serieParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonnumero_decimalesParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_decimalesParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonnumero_items_requisicionParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_items_requisicionParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_cuenta_contableParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_cuenta_contableParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_cuenta_contable_lineaParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_cuenta_contable_lineaParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_cuenta_bancoParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_cuenta_bancoParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_copiar_productoParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_copiar_productoParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_crear_producto_sucursalParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_crear_producto_sucursalParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_compras_aprobacionParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_compras_aprobacionParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_envio_mailParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_envio_mailParametroInvenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParametroInven!=null) {
				this.jInternalFrameReporteDinamicoParametroInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroInven"));
				this.jInternalFrameReporteDinamicoParametroInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroInven"));
				this.jInternalFrameReporteDinamicoParametroInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroInven"));
			}
			
			//this.jButtonCerrarReporteDinamicoParametroInven.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroInven"));				
			//this.jButtonGenerarReporteDinamicoParametroInven.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroInven"));
			//this.jButtonGenerarExcelReporteDinamicoParametroInven.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroInven"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParametroInven!=null) {
				this.jInternalFrameImportacionParametroInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroInven"));
				this.jInternalFrameImportacionParametroInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroInven"));
				this.jInternalFrameImportacionParametroInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroInven"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParametroInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByParametroInven"));
			
			this.jButtonAbrirOrderByToolBarParametroInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParametroInven"));			
			
			if(this.jInternalFrameOrderByParametroInven!=null) {
				this.jInternalFrameOrderByParametroInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroInven"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParametroInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroInven.jTabbedPaneRelacionesParametroInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroInven"));
		
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
            		closingInternalFrameParametroInven();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParametroInven.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParametroInven = (JInternalFrameBase)event.getSource();
	            	
	            ParametroInvenBeanSwingJInternalFrame jInternalFrameParent=(ParametroInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroInven.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParametroInvenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParametroInven.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParametroInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParametroInven.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParametroInven.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParametroInven";
		inputMap = this.jButtonNuevoParametroInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParametroInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroInvenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParametroInven";
		inputMap = this.jButtonNuevoRelacionesParametroInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParametroInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroInvenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParametroInven";
		inputMap = this.jButtonModificarParametroInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParametroInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParametroInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParametroInven";
		inputMap = this.jButtonActualizarParametroInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParametroInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParametroInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParametroInven";
		inputMap = this.jButtonEliminarParametroInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParametroInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParametroInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParametroInven";
		inputMap = this.jButtonCancelarParametroInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParametroInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParametroInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParametroInven";
		inputMap = this.jButtonCerrarParametroInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParametroInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParametroInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParametroInven.jButtonGuardarCambiosParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParametroInven";
		inputMap = this.jInternalFrameDetalleFormParametroInven.jButtonGuardarCambiosParametroInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParametroInven.jButtonGuardarCambiosParametroInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParametroInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParametroInven.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParametroInvenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParametroInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParametroInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParametroInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParametroInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParametroInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParametroInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonidParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"idParametroInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroInven.jButtonid_empresaParametroInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonid_empresaParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonsecuencial_pedidoParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"secuencial_pedidoParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonnumero_serieParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonnumero_decimalesParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_decimalesParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtonnumero_items_requisicionParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_items_requisicionParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_cuenta_contableParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_cuenta_contableParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_cuenta_contable_lineaParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_cuenta_contable_lineaParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_cuenta_bancoParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_cuenta_bancoParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_copiar_productoParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_copiar_productoParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_crear_producto_sucursalParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_crear_producto_sucursalParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_compras_aprobacionParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_compras_aprobacionParametroInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroInven.jButtoncon_envio_mailParametroInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_envio_mailParametroInvenBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParametroInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParametroInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParametroInvenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParametroInven.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParametroInven(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ParametroInven parametroinvenAux:this.parametroinvenLogic.getParametroInvens()) {
					parametroinvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroInven parametroinvenAux:parametroinvens) {
					parametroinvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParametroInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroInven parametroinvenAux:this.parametroinvenLogic.getParametroInvens()) {
						parametroinvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroInven parametroinvenAux:parametroinvens) {
						parametroinvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ParametroInven parametroinvenAux:this.parametroinvenLogic.getParametroInvens()) {
					
						if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE)) {
							existe=true;
							parametroinvenAux.setcon_cuenta_contable(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA)) {
							existe=true;
							parametroinvenAux.setcon_cuenta_contable_linea(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO)) {
							existe=true;
							parametroinvenAux.setcon_cuenta_banco(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO)) {
							existe=true;
							parametroinvenAux.setcon_copiar_producto(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL)) {
							existe=true;
							parametroinvenAux.setcon_crear_producto_sucursal(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA)) {
							existe=true;
							parametroinvenAux.setcon_crear_lista_precio_sucursal_bodega(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION)) {
							existe=true;
							parametroinvenAux.setcon_compras_aprobacion(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL)) {
							existe=true;
							parametroinvenAux.setcon_envio_mail(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroInven parametroinvenAux:parametroinvens) {
						
						if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE)) {
							existe=true;
							parametroinvenAux.setcon_cuenta_contable(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA)) {
							existe=true;
							parametroinvenAux.setcon_cuenta_contable_linea(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO)) {
							existe=true;
							parametroinvenAux.setcon_cuenta_banco(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO)) {
							existe=true;
							parametroinvenAux.setcon_copiar_producto(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL)) {
							existe=true;
							parametroinvenAux.setcon_crear_producto_sucursal(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA)) {
							existe=true;
							parametroinvenAux.setcon_crear_lista_precio_sucursal_bodega(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION)) {
							existe=true;
							parametroinvenAux.setcon_compras_aprobacion(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL)) {
							existe=true;
							parametroinvenAux.setcon_envio_mail(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParametroInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParametroInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParametroInven.getSelectedRows();
			
			ParametroInven parametroinvenLocal=new ParametroInven();
			
			//this.seleccionarTodosParametroInven(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroinvenLocal =(ParametroInven) this.parametroinvenLogic.getParametroInvens().toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parametroinvenLocal =(ParametroInven) this.parametroinvens.toArray()[this.jTableDatosParametroInven.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parametroinvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroInven parametroinvenAux:this.parametroinvenLogic.getParametroInvens()) {
						parametroinvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroInven parametroinvenAux:parametroinvens) {
						parametroinvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParametroInven(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParametroInvenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParametroInvenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParametroInvenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParametroInven(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParametroInven.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroInven parametroinvenAux:this.parametroinvenLogic.getParametroInvens()) {
				
						if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO)) {
							existe=true;
							parametroinvenAux.setsecuencial_pedido(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE)) {
							existe=true;
							parametroinvenAux.setnumero_serie(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES)) {
							existe=true;
							parametroinvenAux.setnumero_decimales(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION)) {
							existe=true;
							parametroinvenAux.setnumero_items_requisicion(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroInven parametroinvenAux:parametroinvens) {
					
						if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO)) {
							existe=true;
							parametroinvenAux.setsecuencial_pedido(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE)) {
							existe=true;
							parametroinvenAux.setnumero_serie(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES)) {
							existe=true;
							parametroinvenAux.setnumero_decimales(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION)) {
							existe=true;
							parametroinvenAux.setnumero_items_requisicion(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParametroInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParametroInvenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParametroInven(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParametroInven=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParametroInven.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParametroInven.jComboBoxTiposAccionesFormularioParametroInven.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParametroInven) {				
					conSplash=true;//false;										
					
					//this.startProcessParametroInven(conSplash);
				
					this.generarReporteParametroInvensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroInven.jComboBoxTiposAccionesFormularioParametroInven.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParametroInvensSeleccionados();
				//this.jComboBoxTiposAccionesParametroInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroInvensSeleccionados(false);
				//this.jComboBoxTiposAccionesParametroInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroInvensSeleccionados(true);
				//this.jComboBoxTiposAccionesParametroInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroInven();
				
				this.exportarParametroInvensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroInven.jComboBoxTiposAccionesFormularioParametroInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParametroInvens();
				//this.importarParametroInvens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroInven.jComboBoxTiposAccionesFormularioParametroInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroInven();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParametroInvensSeleccionados();
				//this.jComboBoxTiposAccionesParametroInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parametro Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParametroInven();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParametroInven)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParametroInven(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Inven",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroInven.jComboBoxTiposAccionesFormularioParametroInven.setSelectedIndex(0);					
				}	
			} 			
			else if(ParametroInvenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParametroInven) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParametroInven(conSplash);
					
						//this.actualizarParametrosGeneralParametroInven();
						
						this.generarReporteProcesoAccionParametroInvensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParametroInven.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParametroInven.jComboBoxTiposAccionesFormularioParametroInven.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParametroInvenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Parametro InvenES SELECCIONADOS?", "MANTENIMIENTO DE Parametro Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParametroInven();
				
						this.actualizarParametrosGeneralParametroInven();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parametroinvenReturnGeneral=parametroinvenLogic.procesarAccionParametroInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parametroinvenLogic.getParametroInvens(),this.parametroinvenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParametroInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroInven.jComboBoxTiposAccionesFormularioParametroInven.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParametroInven();
					
					ParametroInvenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParametroInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroInven.jComboBoxTiposAccionesFormularioParametroInven.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParametroInven(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParametroInvenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParametroInven();
			
			if(this.jInternalFrameDetalleFormParametroInven==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ParametroInven> parametroinvensSeleccionados=new ArrayList<ParametroInven>();		
			ParametroInven parametroinven=new ParametroInven();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParametroInven(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParametroInven.getSelectedItem();
			
			
			
			
			parametroinvensSeleccionados=this.getParametroInvensSeleccionados(true);
			//this.sTipoAccion;
			
			if(parametroinvensSeleccionados.size()==1) {
				for(ParametroInven parametroinvenAux:parametroinvensSeleccionados) {
					parametroinven=parametroinvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParametroInven();
			
      		//this.finishProcessParametroInven(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParametroInvenReturnGeneral() throws Exception {
		if(this.parametroinvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parametroinvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parametroinvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parametroinvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parametroinvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parametroinvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParametroInven(false);
		}
		
		if(this.parametroinvenReturnGeneral.getConRetornoLista() || this.parametroinvenReturnGeneral.getConRetornoObjeto()) {
			if(this.parametroinvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametroinvenLogic.setParametroInvens(this.parametroinvenReturnGeneral.getParametroInvens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parametroinvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametroinvenLogic.setParametroInven(this.parametroinvenReturnGeneral.getParametroInven());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParametroInven(false);
		}
	}
	
	public void actualizarParametrosGeneralParametroInven() throws Exception {
		
		
	}
	
	public ArrayList<ParametroInven> getParametroInvensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroInven> parametroinvensSeleccionados=new ArrayList<ParametroInven>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParametroInven) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ParametroInven parametroinvenAux:parametroinvenLogic.getParametroInvens()) {
					if(parametroinvenAux.getIsSelected()) {
						parametroinvensSeleccionados.add(parametroinvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroInven parametroinvenAux:this.parametroinvens) {
					if(parametroinvenAux.getIsSelected()) {
						parametroinvensSeleccionados.add(parametroinvenAux);				
					}
				}
			}
			
			if(parametroinvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parametroinvensSeleccionados.addAll(this.parametroinvenLogic.getParametroInvens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parametroinvensSeleccionados.addAll(this.parametroinvens);				
					}
				}
			}
		} else {
			parametroinvensSeleccionados.add(this.parametroinven);
		}
		
		return parametroinvensSeleccionados;
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
	
	public void generarReporteParametroInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParametroInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParametroInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroInvensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroInvensSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parametro Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParametroInvensSeleccionados() throws Exception {
		ArrayList<ParametroInven> parametroinvensSeleccionados=new ArrayList<ParametroInven>();		
		
		parametroinvensSeleccionados=this.getParametroInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParametroInvens("Todos",parametroinvensSeleccionados);
		
	}	
	
	public void generarReporteNormalParametroInvensSeleccionados() throws Exception {
		ArrayList<ParametroInven> parametroinvensSeleccionados=new ArrayList<ParametroInven>();		
		
		parametroinvensSeleccionados=this.getParametroInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParametroInvens("Todos",parametroinvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParametroInvensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ParametroInven> parametroinvensSeleccionados=new ArrayList<ParametroInven>();
		
		parametroinvensSeleccionados=this.getParametroInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParametroInvens("Todos",parametroinvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParametroInvensSeleccionados() throws Exception {
		ArrayList<ParametroInven> parametroinvensSeleccionados=new ArrayList<ParametroInven>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParametroInven();
		
		
		parametroinvensSeleccionados=this.getParametroInvensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParametroInven();
		
		
		//this.generarReporteParametroInvens("Todos",parametroinvensSeleccionados ,parametroinvenImplementable,parametroinvenImplementableHome);
	}
	
	public void mostrarImportacionParametroInvens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParametroInven();
		
		this.abrirFrameImportacionParametroInven();		
		
			
		//this.generarReporteParametroInvens("Todos",parametroinvensSeleccionados ,parametroinvenImplementable,parametroinvenImplementableHome);
	}
	
	public void importarParametroInvens() throws Exception {		
	
	}
	
	public void exportarParametroInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParametroInvensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParametroInvensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParametroInvensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parametro Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParametroInvensSeleccionados() throws Exception {
		ArrayList<ParametroInven> parametroinvensSeleccionados=new ArrayList<ParametroInven>();		
		
		parametroinvensSeleccionados=this.getParametroInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroinven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParametroInven(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ParametroInven parametroinvenAux:parametroinvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParametroInven(parametroinvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parametroinvenAux.setsDetalleGeneralEntityReporte(parametroinvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParametroInven(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParametroInvenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroInvenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroInvenConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParametroInven(ParametroInven parametroinven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametroinven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroinven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroinven.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroinven.getsecuencial_pedido().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroinven.getnumero_serie().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroinven.getnumero_decimales().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroinven.getnumero_items_requisicion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroinven.getcon_cuenta_contable().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroinven.getcon_cuenta_contable_linea().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroinven.getcon_cuenta_banco().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroinven.getcon_copiar_producto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroinven.getcon_crear_producto_sucursal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroinven.getcon_crear_lista_precio_sucursal_bodega().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroinven.getcon_compras_aprobacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroinven.getcon_envio_mail().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParametroInvensSeleccionados() throws Exception {
		ArrayList<ParametroInven> parametroinvensSeleccionados=new ArrayList<ParametroInven>();		
		
		parametroinvensSeleccionados=this.getParametroInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroinven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ParametroInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParametroInven(row);				
				iRow++;
			}				
			
			for(ParametroInven parametroinvenAux:parametroinvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParametroInven(parametroinvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParametroInvensSeleccionados() throws Exception {
		ArrayList<ParametroInven> parametroinvensSeleccionados=new ArrayList<ParametroInven>();		
		
		parametroinvensSeleccionados=this.getParametroInvensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroinven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parametroinvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametroinven");
			//elementRoot.appendChild(element);
		
			for(ParametroInven parametroinvenAux:parametroinvensSeleccionados) {
				element = document.createElement("parametroinven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParametroInven(parametroinvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParametroInven(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParametroInven(ParametroInven parametroinven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parametroinven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroinven.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroinven.getsecuencial_pedido());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroinven.getnumero_serie());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroinven.getnumero_decimales());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroinven.getnumero_items_requisicion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroinven.getcon_cuenta_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroinven.getcon_cuenta_contable_linea());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroinven.getcon_cuenta_banco());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroinven.getcon_copiar_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroinven.getcon_crear_producto_sucursal());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroinven.getcon_crear_lista_precio_sucursal_bodega());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroinven.getcon_compras_aprobacion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroinven.getcon_envio_mail());				
	}
	
	public void setFilaDatosExportarXmlParametroInven(ParametroInven parametroinven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParametroInvenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parametroinven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroInvenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametroinven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ParametroInvenConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(parametroinven.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsecuencial_pedido = document.createElement(ParametroInvenConstantesFunciones.SECUENCIALPEDIDO);
		elementsecuencial_pedido.appendChild(document.createTextNode(parametroinven.getsecuencial_pedido().toString().trim()));
		element.appendChild(elementsecuencial_pedido);

		Element elementnumero_serie = document.createElement(ParametroInvenConstantesFunciones.NUMEROSERIE);
		elementnumero_serie.appendChild(document.createTextNode(parametroinven.getnumero_serie().toString().trim()));
		element.appendChild(elementnumero_serie);

		Element elementnumero_decimales = document.createElement(ParametroInvenConstantesFunciones.NUMERODECIMALES);
		elementnumero_decimales.appendChild(document.createTextNode(parametroinven.getnumero_decimales().toString().trim()));
		element.appendChild(elementnumero_decimales);

		Element elementnumero_items_requisicion = document.createElement(ParametroInvenConstantesFunciones.NUMEROITEMSREQUISICION);
		elementnumero_items_requisicion.appendChild(document.createTextNode(parametroinven.getnumero_items_requisicion().toString().trim()));
		element.appendChild(elementnumero_items_requisicion);

		Element elementcon_cuenta_contable = document.createElement(ParametroInvenConstantesFunciones.CONCUENTACONTABLE);
		elementcon_cuenta_contable.appendChild(document.createTextNode(parametroinven.getcon_cuenta_contable().toString().trim()));
		element.appendChild(elementcon_cuenta_contable);

		Element elementcon_cuenta_contable_linea = document.createElement(ParametroInvenConstantesFunciones.CONCUENTACONTABLELINEA);
		elementcon_cuenta_contable_linea.appendChild(document.createTextNode(parametroinven.getcon_cuenta_contable_linea().toString().trim()));
		element.appendChild(elementcon_cuenta_contable_linea);

		Element elementcon_cuenta_banco = document.createElement(ParametroInvenConstantesFunciones.CONCUENTABANCO);
		elementcon_cuenta_banco.appendChild(document.createTextNode(parametroinven.getcon_cuenta_banco().toString().trim()));
		element.appendChild(elementcon_cuenta_banco);

		Element elementcon_copiar_producto = document.createElement(ParametroInvenConstantesFunciones.CONCOPIARPRODUCTO);
		elementcon_copiar_producto.appendChild(document.createTextNode(parametroinven.getcon_copiar_producto().toString().trim()));
		element.appendChild(elementcon_copiar_producto);

		Element elementcon_crear_producto_sucursal = document.createElement(ParametroInvenConstantesFunciones.CONCREARPRODUCTOSUCURSAL);
		elementcon_crear_producto_sucursal.appendChild(document.createTextNode(parametroinven.getcon_crear_producto_sucursal().toString().trim()));
		element.appendChild(elementcon_crear_producto_sucursal);

		Element elementcon_crear_lista_precio_sucursal_bodega = document.createElement(ParametroInvenConstantesFunciones.CONCREARLISTAPRECIOSUCURSALBODEGA);
		elementcon_crear_lista_precio_sucursal_bodega.appendChild(document.createTextNode(parametroinven.getcon_crear_lista_precio_sucursal_bodega().toString().trim()));
		element.appendChild(elementcon_crear_lista_precio_sucursal_bodega);

		Element elementcon_compras_aprobacion = document.createElement(ParametroInvenConstantesFunciones.CONCOMPRASAPROBACION);
		elementcon_compras_aprobacion.appendChild(document.createTextNode(parametroinven.getcon_compras_aprobacion().toString().trim()));
		element.appendChild(elementcon_compras_aprobacion);

		Element elementcon_envio_mail = document.createElement(ParametroInvenConstantesFunciones.CONENVIOMAIL);
		elementcon_envio_mail.appendChild(document.createTextNode(parametroinven.getcon_envio_mail().toString().trim()));
		element.appendChild(elementcon_envio_mail);
	}
	
	public void generarReporteGroupGenericoParametroInvensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ParametroInven> parametroinvensSeleccionados=new ArrayList<ParametroInven>();
		
		parametroinvensSeleccionados=this.getParametroInvensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParametroInven(parametroinvensSeleccionados);
		
		this.generarReporteParametroInvens("Todos",parametroinvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParametroInven(ArrayList<ParametroInven> parametroinvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroInven parametroinvenAux:parametroinvensSeleccionados) {
				parametroinvenAux.setsDetalleGeneralEntityReporte(parametroinvenAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					parametroinvenAux.setsDescripcionGeneralEntityReporte1(parametroinvenAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO)) {
					existe=true;
					parametroinvenAux.setsDescripcionGeneralEntityReporte1(parametroinvenAux.getsecuencial_pedido().toString());
				}
				 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE)) {
					existe=true;
					parametroinvenAux.setsDescripcionGeneralEntityReporte1(parametroinvenAux.getnumero_serie().toString());
				}
				 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES)) {
					existe=true;
					parametroinvenAux.setsDescripcionGeneralEntityReporte1(parametroinvenAux.getnumero_decimales().toString());
				}
				 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION)) {
					existe=true;
					parametroinvenAux.setsDescripcionGeneralEntityReporte1(parametroinvenAux.getnumero_items_requisicion().toString());
				}
				 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE)) {
					existe=true;
					parametroinvenAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametroinvenAux.getcon_cuenta_contable()));
				}
				 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA)) {
					existe=true;
					parametroinvenAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametroinvenAux.getcon_cuenta_contable_linea()));
				}
				 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO)) {
					existe=true;
					parametroinvenAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametroinvenAux.getcon_cuenta_banco()));
				}
				 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO)) {
					existe=true;
					parametroinvenAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametroinvenAux.getcon_copiar_producto()));
				}
				 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL)) {
					existe=true;
					parametroinvenAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametroinvenAux.getcon_crear_producto_sucursal()));
				}
				 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA)) {
					existe=true;
					parametroinvenAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametroinvenAux.getcon_crear_lista_precio_sucursal_bodega()));
				}
				 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION)) {
					existe=true;
					parametroinvenAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametroinvenAux.getcon_compras_aprobacion()));
				}
				 else if(sTipoSeleccionar.equals(ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL)) {
					existe=true;
					parametroinvenAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametroinvenAux.getcon_envio_mail()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParametroInven(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParametroInven=true;
				this.isVisibilidadCeldaNuevoRelacionesParametroInven=true;
				this.isVisibilidadCeldaGuardarCambiosParametroInven=true;
			}
			
			this.isVisibilidadCeldaModificarParametroInven=false;
			this.isVisibilidadCeldaActualizarParametroInven=false;
			this.isVisibilidadCeldaEliminarParametroInven=false;
			this.isVisibilidadCeldaCancelarParametroInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroInven=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroInven=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParametroInven=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroInven=false;
			this.isVisibilidadCeldaGuardarCambiosParametroInven=false;
			this.isVisibilidadCeldaModificarParametroInven=false;
			this.isVisibilidadCeldaActualizarParametroInven=true;
			this.isVisibilidadCeldaEliminarParametroInven=false;
			this.isVisibilidadCeldaCancelarParametroInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroInven=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroInven=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParametroInven=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroInven=false;
			this.isVisibilidadCeldaGuardarCambiosParametroInven=false;
			this.isVisibilidadCeldaModificarParametroInven=false;
			this.isVisibilidadCeldaActualizarParametroInven=true;
			this.isVisibilidadCeldaEliminarParametroInven=true;
			this.isVisibilidadCeldaCancelarParametroInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroInven=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroInven=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParametroInven=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroInven=false;
			this.isVisibilidadCeldaGuardarCambiosParametroInven=false;
			this.isVisibilidadCeldaModificarParametroInven=false;
			this.isVisibilidadCeldaActualizarParametroInven=true;
			this.isVisibilidadCeldaEliminarParametroInven=false;
			this.isVisibilidadCeldaCancelarParametroInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroInven=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroInven=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParametroInven=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroInven=true;
			this.isVisibilidadCeldaGuardarCambiosParametroInven=true;
			this.isVisibilidadCeldaModificarParametroInven=false;
			this.isVisibilidadCeldaActualizarParametroInven=false;
			this.isVisibilidadCeldaEliminarParametroInven=false;
			this.isVisibilidadCeldaCancelarParametroInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroInven=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroInven=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParametroInven=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroInven=false;
			this.isVisibilidadCeldaGuardarCambiosParametroInven=false;
			this.isVisibilidadCeldaActualizarParametroInven=false;
			this.isVisibilidadCeldaEliminarParametroInven=false;
			this.isVisibilidadCeldaCancelarParametroInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroInven=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroInven=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParametroInven=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroInven=false;
			this.isVisibilidadCeldaGuardarCambiosParametroInven=false;
			this.isVisibilidadCeldaModificarParametroInven=true;
			this.isVisibilidadCeldaActualizarParametroInven=false;
			this.isVisibilidadCeldaEliminarParametroInven=false;
			this.isVisibilidadCeldaCancelarParametroInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroInven=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroInven=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParametroInvenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParametroInven=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroInven=true;
			this.isVisibilidadCeldaGuardarCambiosParametroInven=true;
		} else {
			this.actualizarEstadoPanelsParametroInven(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParametroInven=false;
			//this.isVisibilidadCeldaVerFormParametroInven=false;
			this.isVisibilidadCeldaDuplicarParametroInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parametroinvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParametroInven=false;
		} else {
			this.isVisibilidadCeldaNuevoParametroInven=false;
			this.isVisibilidadCeldaGuardarCambiosParametroInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametroinvenSessionBean.getEsGuardarRelacionado()) {
			if(!parametroinvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParametroInven=false;												
			}
			
			this.jButtonCerrarParametroInven.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParametroInven=false;
		}
		
		if(!this.permiteMantenimiento(this.parametroinven)) {
			this.isVisibilidadCeldaActualizarParametroInven=false;
			this.isVisibilidadCeldaEliminarParametroInven=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParametroInven() {
	}
	
	public void actualizarEstadoPanelsParametroInven(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParametroInven!=null) {
				this.jScrollPanelDatosEdicionParametroInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroInven!=null) {
				this.jTabbedPaneBusquedasParametroInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroInven!=null) {
				this.jScrollPanelDatosParametroInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroInven!=null) {
				this.jPanelPaginacionParametroInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroInven!=null) {
				this.jPanelParametrosReportesParametroInven.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParametroInven!=null) {
				this.jScrollPanelDatosEdicionParametroInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroInven!=null) {
				this.jTabbedPaneBusquedasParametroInven.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosParametroInven!=null) {
				this.jScrollPanelDatosParametroInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroInven!=null) {
				this.jPanelPaginacionParametroInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroInven!=null) {
				this.jPanelParametrosReportesParametroInven.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParametroInven!=null) {
				this.jScrollPanelDatosEdicionParametroInven.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroInven!=null) {
				this.jTabbedPaneBusquedasParametroInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroInven!=null) {
				this.jScrollPanelDatosParametroInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroInven!=null) {
				this.jPanelPaginacionParametroInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroInven!=null) {
				this.jPanelParametrosReportesParametroInven.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParametroInven!=null) {
				this.jScrollPanelDatosEdicionParametroInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroInven!=null) {
				this.jTabbedPaneBusquedasParametroInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroInven!=null) {
				this.jScrollPanelDatosParametroInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroInven!=null) {
				this.jPanelPaginacionParametroInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroInven!=null) {
				this.jPanelParametrosReportesParametroInven.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParametroInven!=null) {
				this.jScrollPanelDatosEdicionParametroInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroInven!=null) {
				this.jTabbedPaneBusquedasParametroInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroInven!=null) {
				this.jScrollPanelDatosParametroInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroInven!=null) {
				this.jPanelPaginacionParametroInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroInven!=null) {
				this.jPanelParametrosReportesParametroInven.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParametroInven!=null) {
				this.jScrollPanelDatosEdicionParametroInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroInven!=null) {
				this.jTabbedPaneBusquedasParametroInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroInven!=null) {
				this.jScrollPanelDatosParametroInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroInven!=null) {
				this.jPanelPaginacionParametroInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroInven!=null) {
				this.jPanelParametrosReportesParametroInven.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParametroInven!=null) {
				this.jScrollPanelDatosEdicionParametroInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroInven!=null) {
				this.jTabbedPaneBusquedasParametroInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroInven!=null) {
				this.jScrollPanelDatosParametroInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroInven!=null) {
				this.jPanelPaginacionParametroInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroInven!=null) {
				this.jPanelParametrosReportesParametroInven.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasParametroInven!=null) {
					this.jTabbedPaneBusquedasParametroInven.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesParametroInven!=null) {
				this.jPanelParametrosReportesParametroInven.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroInven!=null) {
				this.jTabbedPaneBusquedasParametroInven.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesParametroInven!=null) {
				this.jPanelParametrosReportesParametroInven.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParametroInvenSessionBean parametroinvenSessionBean=new ParametroInvenSessionBean();
		
		if(this.parametroinvenSessionBean==null) {
			this.parametroinvenSessionBean=new ParametroInvenSessionBean();
		}
		
		this.parametroinvenSessionBean.setsUltimaBusquedaParametroInven(this.getsAccionBusqueda());
		this.parametroinvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parametroinvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			parametroinvenSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParametroInvenSessionBean parametroinvenSessionBean=new ParametroInvenSessionBean();
		
		if(this.parametroinvenSessionBean==null) {
			this.parametroinvenSessionBean=new ParametroInvenSessionBean();
		}
		
		if(this.parametroinvenSessionBean.getsUltimaBusquedaParametroInven()!=null&&!this.parametroinvenSessionBean.getsUltimaBusquedaParametroInven().equals("")) {
			this.setsAccionBusqueda(parametroinvenSessionBean.getsUltimaBusquedaParametroInven());
			this.setiNumeroPaginacion(parametroinvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parametroinvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(parametroinvenSessionBean.getid_empresa());
				parametroinvenSessionBean.setid_empresa(-1L);
			}
		}
		
		this.parametroinvenSessionBean.setsUltimaBusquedaParametroInven("");
		this.parametroinvenSessionBean.setiNumeroPaginacion(ParametroInvenConstantesFunciones.INUMEROPAGINACION);
		this.parametroinvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParametroInven(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParametroInven() {
		this.updateBorderResaltarBusquedasFormularioParametroInven();
		this.updateVisibilidadBusquedasFormularioParametroInven();
		this.updateHabilitarBusquedasFormularioParametroInven();
	}
	
	public void updateBorderResaltarBusquedasFormularioParametroInven() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasParametroInven.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioParametroInven() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasParametroInven.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioParametroInven() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasParametroInven.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaParametroInven(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarParametroInven.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioParametroInven() throws Exception {

		if(this.jInternalFrameDetalleFormParametroInven==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParametroInven();
		this.updateVisibilidadResaltarControlesFormularioParametroInven();
		this.updateHabilitarResaltarControlesFormularioParametroInven();
		
	}
	
	public void updateBorderResaltarControlesFormularioParametroInven() throws Exception {
		if(this.jInternalFrameDetalleFormParametroInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parametroinvenConstantesFunciones.resaltaridParametroInven!=null && this.jInternalFrameDetalleFormParametroInven!=null) {this.jInternalFrameDetalleFormParametroInven.jLabelidParametroInven.setBorder(this.parametroinvenConstantesFunciones.resaltaridParametroInven);}
		if(this.parametroinvenConstantesFunciones.resaltarid_empresaParametroInven!=null && this.jInternalFrameDetalleFormParametroInven!=null) {this.jInternalFrameDetalleFormParametroInven.jComboBoxid_empresaParametroInven.setBorder(this.parametroinvenConstantesFunciones.resaltarid_empresaParametroInven);}
		if(this.parametroinvenConstantesFunciones.resaltarsecuencial_pedidoParametroInven!=null && this.jInternalFrameDetalleFormParametroInven!=null) {this.jInternalFrameDetalleFormParametroInven.jTextFieldsecuencial_pedidoParametroInven.setBorder(this.parametroinvenConstantesFunciones.resaltarsecuencial_pedidoParametroInven);}
		if(this.parametroinvenConstantesFunciones.resaltarnumero_serieParametroInven!=null && this.jInternalFrameDetalleFormParametroInven!=null) {this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_serieParametroInven.setBorder(this.parametroinvenConstantesFunciones.resaltarnumero_serieParametroInven);}
		if(this.parametroinvenConstantesFunciones.resaltarnumero_decimalesParametroInven!=null && this.jInternalFrameDetalleFormParametroInven!=null) {this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_decimalesParametroInven.setBorder(this.parametroinvenConstantesFunciones.resaltarnumero_decimalesParametroInven);}
		if(this.parametroinvenConstantesFunciones.resaltarnumero_items_requisicionParametroInven!=null && this.jInternalFrameDetalleFormParametroInven!=null) {this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_items_requisicionParametroInven.setBorder(this.parametroinvenConstantesFunciones.resaltarnumero_items_requisicionParametroInven);}
		if(this.parametroinvenConstantesFunciones.resaltarcon_cuenta_contableParametroInven!=null && this.jInternalFrameDetalleFormParametroInven!=null) {this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contableParametroInven.setBorderPainted(true);this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contableParametroInven.setBorder(this.parametroinvenConstantesFunciones.resaltarcon_cuenta_contableParametroInven);}
		if(this.parametroinvenConstantesFunciones.resaltarcon_cuenta_contable_lineaParametroInven!=null && this.jInternalFrameDetalleFormParametroInven!=null) {this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contable_lineaParametroInven.setBorderPainted(true);this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contable_lineaParametroInven.setBorder(this.parametroinvenConstantesFunciones.resaltarcon_cuenta_contable_lineaParametroInven);}
		if(this.parametroinvenConstantesFunciones.resaltarcon_cuenta_bancoParametroInven!=null && this.jInternalFrameDetalleFormParametroInven!=null) {this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_bancoParametroInven.setBorderPainted(true);this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_bancoParametroInven.setBorder(this.parametroinvenConstantesFunciones.resaltarcon_cuenta_bancoParametroInven);}
		if(this.parametroinvenConstantesFunciones.resaltarcon_copiar_productoParametroInven!=null && this.jInternalFrameDetalleFormParametroInven!=null) {this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_copiar_productoParametroInven.setBorderPainted(true);this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_copiar_productoParametroInven.setBorder(this.parametroinvenConstantesFunciones.resaltarcon_copiar_productoParametroInven);}
		if(this.parametroinvenConstantesFunciones.resaltarcon_crear_producto_sucursalParametroInven!=null && this.jInternalFrameDetalleFormParametroInven!=null) {this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_producto_sucursalParametroInven.setBorderPainted(true);this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_producto_sucursalParametroInven.setBorder(this.parametroinvenConstantesFunciones.resaltarcon_crear_producto_sucursalParametroInven);}
		if(this.parametroinvenConstantesFunciones.resaltarcon_crear_lista_precio_sucursal_bodegaParametroInven!=null && this.jInternalFrameDetalleFormParametroInven!=null) {this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven.setBorderPainted(true);this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven.setBorder(this.parametroinvenConstantesFunciones.resaltarcon_crear_lista_precio_sucursal_bodegaParametroInven);}
		if(this.parametroinvenConstantesFunciones.resaltarcon_compras_aprobacionParametroInven!=null && this.jInternalFrameDetalleFormParametroInven!=null) {this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_compras_aprobacionParametroInven.setBorderPainted(true);this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_compras_aprobacionParametroInven.setBorder(this.parametroinvenConstantesFunciones.resaltarcon_compras_aprobacionParametroInven);}
		if(this.parametroinvenConstantesFunciones.resaltarcon_envio_mailParametroInven!=null && this.jInternalFrameDetalleFormParametroInven!=null) {this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_envio_mailParametroInven.setBorderPainted(true);this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_envio_mailParametroInven.setBorder(this.parametroinvenConstantesFunciones.resaltarcon_envio_mailParametroInven);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParametroInven() throws Exception {		
		if(this.jInternalFrameDetalleFormParametroInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) {
	
		//this.jInternalFrameDetalleFormParametroInven.jLabelidParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostraridParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jPanelidParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostraridParametroInven);
		//this.jInternalFrameDetalleFormParametroInven.jComboBoxid_empresaParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarid_empresaParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jPanelid_empresaParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarid_empresaParametroInven);
		//this.jInternalFrameDetalleFormParametroInven.jTextFieldsecuencial_pedidoParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarsecuencial_pedidoParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jPanelsecuencial_pedidoParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarsecuencial_pedidoParametroInven);
		//this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_serieParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarnumero_serieParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jPanelnumero_serieParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarnumero_serieParametroInven);
		//this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_decimalesParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarnumero_decimalesParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jPanelnumero_decimalesParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarnumero_decimalesParametroInven);
		//this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_items_requisicionParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarnumero_items_requisicionParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jPanelnumero_items_requisicionParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarnumero_items_requisicionParametroInven);
		//this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contableParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarcon_cuenta_contableParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jPanelcon_cuenta_contableParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarcon_cuenta_contableParametroInven);
		//this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contable_lineaParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarcon_cuenta_contable_lineaParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jPanelcon_cuenta_contable_lineaParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarcon_cuenta_contable_lineaParametroInven);
		//this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_bancoParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarcon_cuenta_bancoParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jPanelcon_cuenta_bancoParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarcon_cuenta_bancoParametroInven);
		//this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_copiar_productoParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarcon_copiar_productoParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jPanelcon_copiar_productoParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarcon_copiar_productoParametroInven);
		//this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_producto_sucursalParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarcon_crear_producto_sucursalParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jPanelcon_crear_producto_sucursalParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarcon_crear_producto_sucursalParametroInven);
		//this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarcon_crear_lista_precio_sucursal_bodegaParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jPanelcon_crear_lista_precio_sucursal_bodegaParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarcon_crear_lista_precio_sucursal_bodegaParametroInven);
		//this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_compras_aprobacionParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarcon_compras_aprobacionParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jPanelcon_compras_aprobacionParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarcon_compras_aprobacionParametroInven);
		//this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_envio_mailParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarcon_envio_mailParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jPanelcon_envio_mailParametroInven.setVisible(this.parametroinvenConstantesFunciones.mostrarcon_envio_mailParametroInven);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParametroInven() throws Exception {
		if(this.jInternalFrameDetalleFormParametroInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroInven!=null) {
	
		this.jInternalFrameDetalleFormParametroInven.jLabelidParametroInven.setEnabled(this.parametroinvenConstantesFunciones.activaridParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jComboBoxid_empresaParametroInven.setEnabled(this.parametroinvenConstantesFunciones.activarid_empresaParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jTextFieldsecuencial_pedidoParametroInven.setEnabled(this.parametroinvenConstantesFunciones.activarsecuencial_pedidoParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_serieParametroInven.setEnabled(this.parametroinvenConstantesFunciones.activarnumero_serieParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_decimalesParametroInven.setEnabled(this.parametroinvenConstantesFunciones.activarnumero_decimalesParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jTextFieldnumero_items_requisicionParametroInven.setEnabled(this.parametroinvenConstantesFunciones.activarnumero_items_requisicionParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contableParametroInven.setEnabled(this.parametroinvenConstantesFunciones.activarcon_cuenta_contableParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_contable_lineaParametroInven.setEnabled(this.parametroinvenConstantesFunciones.activarcon_cuenta_contable_lineaParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_cuenta_bancoParametroInven.setEnabled(this.parametroinvenConstantesFunciones.activarcon_cuenta_bancoParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_copiar_productoParametroInven.setEnabled(this.parametroinvenConstantesFunciones.activarcon_copiar_productoParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_producto_sucursalParametroInven.setEnabled(this.parametroinvenConstantesFunciones.activarcon_crear_producto_sucursalParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven.setEnabled(this.parametroinvenConstantesFunciones.activarcon_crear_lista_precio_sucursal_bodegaParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_compras_aprobacionParametroInven.setEnabled(this.parametroinvenConstantesFunciones.activarcon_compras_aprobacionParametroInven);
		this.jInternalFrameDetalleFormParametroInven.jCheckBoxcon_envio_mailParametroInven.setEnabled(this.parametroinvenConstantesFunciones.activarcon_envio_mailParametroInven);
		}
	}
	
		
}