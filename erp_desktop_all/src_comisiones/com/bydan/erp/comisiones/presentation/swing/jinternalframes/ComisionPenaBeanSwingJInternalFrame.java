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

import com.bydan.erp.comisiones.util.ComisionPenaConstantesFunciones;
import com.bydan.erp.comisiones.util.ComisionPenaParameterReturnGeneral;
//import com.bydan.erp.comisiones.util.ComisionPenaParameterGeneral;
//import com.bydan.erp.comisiones.presentation.report.source.ComisionPenaBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.comisiones.business.entity.*;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ComisionPenaBeanSwingJInternalFrame extends ComisionPenaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ComisionPenaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ComisionPena> comisionpenaValidator = new ClassValidator<ComisionPena>(ComisionPena.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ComisionPena comisionpena;	
	public ComisionPena comisionpenaAux;
	public ComisionPena comisionpenaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ComisionPena comisionpenaTotales;
	public Long idComisionPenaActual;
	public Long iIdNuevoComisionPena=0L;
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
	
	public Boolean isPermisoTodoComisionPena;
	public Boolean isPermisoNuevoComisionPena;
	public Boolean isPermisoActualizarComisionPena;
	public Boolean isPermisoActualizarOriginalComisionPena;
	public Boolean isPermisoEliminarComisionPena;
	public Boolean isPermisoGuardarCambiosComisionPena;
	public Boolean isPermisoConsultaComisionPena;
	public Boolean isPermisoBusquedaComisionPena;
	public Boolean isPermisoReporteComisionPena;
	public Boolean isPermisoPaginacionMedioComisionPena;
	public Boolean isPermisoPaginacionAltoComisionPena;
	public Boolean isPermisoPaginacionTodoComisionPena;
	public Boolean isPermisoCopiarComisionPena;
	public Boolean isPermisoVerFormComisionPena;
	public Boolean isPermisoDuplicarComisionPena;
	public Boolean isPermisoOrdenComisionPena;
	
	
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
	
	public ComisionPenaParameterReturnGeneral comisionpenaReturnGeneral;
	public ComisionPenaParameterReturnGeneral comisionpenaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoComisionPena=false;
	public Boolean esParaAccionDesdeFormularioComisionPena=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ComisionPenaSessionBeanAdditional comisionpenaSessionBeanAdditional=null;
	
	public ComisionPenaSessionBeanAdditional getComisionPenaSessionBeanAdditional() {
		return this.comisionpenaSessionBeanAdditional;
	}
	
	public void setComisionPenaSessionBeanAdditional(ComisionPenaSessionBeanAdditional comisionpenaSessionBeanAdditional) {
		try {
			this.comisionpenaSessionBeanAdditional=comisionpenaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ComisionPenaBeanSwingJInternalFrameAdditional comisionpenaBeanSwingJInternalFrameAdditional=null;
	//public class ComisionPenaBeanSwingJInternalFrame
	
	public ComisionPenaBeanSwingJInternalFrameAdditional getComisionPenaBeanSwingJInternalFrameAdditional() {
		return this.comisionpenaBeanSwingJInternalFrameAdditional;
	}
	
	public void setComisionPenaBeanSwingJInternalFrameAdditional(ComisionPenaBeanSwingJInternalFrameAdditional comisionpenaBeanSwingJInternalFrameAdditional) {
		try {
			this.comisionpenaBeanSwingJInternalFrameAdditional=comisionpenaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ComisionPenaLogic comisionpenaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ComisionPena comisionpenaBean;
	public ComisionPenaConstantesFunciones comisionpenaConstantesFunciones;
	//public ComisionPenaParameterReturnGeneral comisionpenaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ComisionConfigLogic comisionconfigLogic;
	
	//PARAMETROS
	
	
	//public List<ComisionPena> comisionpenas;	
	//public List<ComisionPena> comisionpenasEliminados;
	//public List<ComisionPena> comisionpenasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoComisionPena=false;
	public Boolean isVisibilidadCeldaDuplicarComisionPena=true;
	public Boolean isVisibilidadCeldaCopiarComisionPena=true;
	public Boolean isVisibilidadCeldaVerFormComisionPena=true;
	public Boolean isVisibilidadCeldaOrdenComisionPena=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesComisionPena=false;
	public Boolean isVisibilidadCeldaModificarComisionPena=false;
	public Boolean isVisibilidadCeldaActualizarComisionPena=false;
	public Boolean isVisibilidadCeldaEliminarComisionPena=false;
	public Boolean isVisibilidadCeldaCancelarComisionPena=false;
	public Boolean isVisibilidadCeldaGuardarComisionPena=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosComisionPena=false;	
	
	
	public Boolean isVisibilidadFK_IdComisionConfig=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoComisionPena() {
		return this.iIdNuevoComisionPena;
	}

	public void setiIdNuevoComisionPena(Long iIdNuevoComisionPena) {
		this.iIdNuevoComisionPena = iIdNuevoComisionPena;
	}
	
	public Long getidComisionPenaActual() {
		return this.idComisionPenaActual;
	}

	public void setidComisionPenaActual(Long idComisionPenaActual) {
		this.idComisionPenaActual = idComisionPenaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ComisionPena getcomisionpena() {
		return this.comisionpena;
	}

	public void setcomisionpena(ComisionPena comisionpena) {
		this.comisionpena = comisionpena;
	}
	
	public ComisionPena getcomisionpenaAux() {
		return this.comisionpenaAux;
	}

	public void setcomisionpenaAux(ComisionPena comisionpenaAux) {
		this.comisionpenaAux = comisionpenaAux;
	}				
	
	public ComisionPena getcomisionpenaAnterior() {
		return this.comisionpenaAnterior;
	}

	public void setcomisionpenaAnterior(ComisionPena comisionpenaAnterior) {
		this.comisionpenaAnterior = comisionpenaAnterior;
	}	
	
	public ComisionPena getcomisionpenaTotales() {
		return this.comisionpenaTotales;
	}

	public void setcomisionpenaTotales(ComisionPena comisionpenaTotales) {
		this.comisionpenaTotales = comisionpenaTotales;
	}	
	
	public ComisionPena getcomisionpenaBean() {
		return this.comisionpenaBean;
	}

	public void setcomisionpenaBean(ComisionPena comisionpenaBean) {
		this.comisionpenaBean = comisionpenaBean;
	}	
	
	public ComisionPenaParameterReturnGeneral getcomisionpenaReturnGeneral() {
		return this.comisionpenaReturnGeneral;
	}

	public void setcomisionpenaReturnGeneral(ComisionPenaParameterReturnGeneral comisionpenaReturnGeneral) {
		this.comisionpenaReturnGeneral = comisionpenaReturnGeneral;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ComisionPenaLogic getComisionPenaLogic()	{		
		return comisionpenaLogic;
	}

	public void setComisionPenaLogic(ComisionPenaLogic comisionpenaLogic) {
		this.comisionpenaLogic = comisionpenaLogic;
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
	
	public Boolean getIsEsNuevoComisionPena() {
		return isEsNuevoComisionPena;
	}

	public void setIsEsNuevoComisionPena(Boolean isEsNuevoComisionPena) {
		this.isEsNuevoComisionPena = isEsNuevoComisionPena;
	}

	public Boolean getEsParaAccionDesdeFormularioComisionPena() {
		return esParaAccionDesdeFormularioComisionPena;
	}
	
	public void setEsParaAccionDesdeFormularioComisionPena(Boolean esParaAccionDesdeFormularioComisionPena) {
		this.esParaAccionDesdeFormularioComisionPena = esParaAccionDesdeFormularioComisionPena;
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

			if(this.comisionpenaSessionBean==null) {
				this.comisionpenaSessionBean=new ComisionPenaSessionBean();
			}

			if(!this.comisionpenaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(comisionpenaSessionBean.getlidEmpresaActual());
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

			if(this.comisionpenaSessionBean==null) {
				this.comisionpenaSessionBean=new ComisionPenaSessionBean();
			}

			if(!this.comisionpenaSessionBean.getisBusquedaDesdeForeignKeySesionComisionConfig()) {
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
					comisionconfigLogic.getEntityWithConnection(comisionpenaSessionBean.getlidComisionConfigActual());
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

					if(this.comisionpena!=null) {
						this.comisionpena.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormComisionPena!=null) {
						this.jInternalFrameDetalleFormComisionPena.jComboBoxid_empresaComisionPena.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaComisionPena.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormComisionPena!=null) {
						if(this.jInternalFrameDetalleFormComisionPena.jComboBoxid_empresaComisionPena.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionPena.jComboBoxid_empresaComisionPena.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaComisionPenaGenerico)throws Exception
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
				jComboBoxid_empresaComisionPenaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaComisionPenaGenerico!=null && jComboBoxid_empresaComisionPenaGenerico.getItemCount()>0) {
					jComboBoxid_empresaComisionPenaGenerico.setSelectedIndex(0);
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

					if(this.comisionpena!=null) {
						this.comisionpena.setComisionConfig(comisionconfigTemp);
					}

					if(this.jInternalFrameDetalleFormComisionPena!=null) {
						this.jInternalFrameDetalleFormComisionPena.jComboBoxid_comision_configComisionPena.setSelectedItem(comisionconfigTemp);
					}
				} else {
					//jComboBoxid_comision_configComisionPena.setSelectedItem(comisionconfigTemp);
					if(this.jInternalFrameDetalleFormComisionPena!=null) {
						if(this.jInternalFrameDetalleFormComisionPena.jComboBoxid_comision_configComisionPena.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionPena.jComboBoxid_comision_configComisionPena.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdComisionConfig") || sFormularioTipoBusqueda.equals("Todos")){
					if(comisionconfigTemp!=null && jComboBoxid_comision_configFK_IdComisionConfigComisionPena!=null) {
						jComboBoxid_comision_configFK_IdComisionConfigComisionPena.setSelectedItem(comisionconfigTemp);
					} else {
						if(jComboBoxid_comision_configFK_IdComisionConfigComisionPena!=null) {
							//jComboBoxid_comision_configFK_IdComisionConfigComisionPena.setSelectedItem(comisionconfigTemp);
							if(jComboBoxid_comision_configFK_IdComisionConfigComisionPena.getItemCount()>0) {
								jComboBoxid_comision_configFK_IdComisionConfigComisionPena.setSelectedIndex(0);
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
	public void setActualComisionConfigForeignKeyGenerico(Long idComisionConfigSeleccionado,JComboBox jComboBoxid_comision_configComisionPenaGenerico)throws Exception
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
				jComboBoxid_comision_configComisionPenaGenerico.setSelectedItem(comisionconfigTemp);
			} else {
				if(jComboBoxid_comision_configComisionPenaGenerico!=null && jComboBoxid_comision_configComisionPenaGenerico.getItemCount()>0) {
					jComboBoxid_comision_configComisionPenaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ComisionPena comisionpena,JComboBox jComboBoxid_empresaComisionPenaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaComisionPenaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormComisionPena.jComboBoxid_empresaComisionPena.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaComisionPenaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				comisionpena.setid_empresa(empresaAux.getId());
				comisionpena.setempresa_descripcion(ComisionPenaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				comisionpena.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarComisionConfigForeignKey(ComisionPena comisionpena,JComboBox jComboBoxid_comision_configComisionPenaGenerico)throws Exception
	{
		try
		{
			ComisionConfig  comisionconfigAux=new ComisionConfig();

			if(jComboBoxid_comision_configComisionPenaGenerico==null) {
				comisionconfigAux=(ComisionConfig)this.jInternalFrameDetalleFormComisionPena.jComboBoxid_comision_configComisionPena.getSelectedItem();
			} else {
				comisionconfigAux=(ComisionConfig)jComboBoxid_comision_configComisionPenaGenerico.getSelectedItem();
			}

			if(comisionconfigAux!=null && comisionconfigAux.getId()!=null) {
				comisionpena.setid_comision_config(comisionconfigAux.getId());
				comisionpena.setcomisionconfig_descripcion(ComisionPenaConstantesFunciones.getComisionConfigDescripcion(comisionconfigAux));
				comisionpena.setComisionConfig(comisionconfigAux);			}
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

					if(!ComisionPenaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionPena!=null) { 
							this.jInternalFrameDetalleFormComisionPena.jComboBoxid_empresaComisionPena.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormComisionPena.jComboBoxid_empresaComisionPena.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionPena!=null) { 
					}

					if(!ComisionPenaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComisionPenaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionPena!=null) { 
							this.jInternalFrameDetalleFormComisionPena.jComboBoxid_comision_configComisionPena.removeAllItems();

							for(ComisionConfig comisionconfig:this.comisionconfigsForeignKey) {
								this.jInternalFrameDetalleFormComisionPena.jComboBoxid_comision_configComisionPena.addItem(comisionconfig);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionPena!=null) { 
					}

					if(!ComisionPenaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdComisionConfig") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ComisionPenaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_comision_configFK_IdComisionConfigComisionPena.removeAllItems();

							for(ComisionConfig comisionconfig:this.comisionconfigsForeignKey) {
								this.jComboBoxid_comision_configFK_IdComisionConfigComisionPena.addItem(comisionconfig);
							}
						}

						if(!ComisionPenaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormComisionPena!=null) {
							this.jInternalFrameDetalleFormComisionPena.jComboBoxid_empresaComisionPena.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionPena!=null) {
							this.jInternalFrameDetalleFormComisionPena.jComboBoxid_empresaComisionPena.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComisionPena!=null) {
							this.jInternalFrameDetalleFormComisionPena.jComboBoxid_comision_configComisionPena.setSelectedItem(comisionconfig);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionPena!=null) {
							this.jInternalFrameDetalleFormComisionPena.jComboBoxid_comision_configComisionPena.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_comision_configFK_IdComisionConfigComisionPena.setSelectedItem(comisionconfig);
						} else {
							this.jComboBoxid_comision_configFK_IdComisionConfigComisionPena.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesComisionPena() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ComisionPenaConstantesFunciones.refrescarForeignKeysDescripcionesComisionPena(this.comisionpenaLogic.getComisionPenas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ComisionPenaConstantesFunciones.refrescarForeignKeysDescripcionesComisionPena(this.comisionpenas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(ComisionConfig.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//comisionpenaLogic.setComisionPenas(this.comisionpenas);
			comisionpenaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ComisionPenaParameterReturnGeneral getComisionPenaParameterGeneral() {
		return this.comisionpenaParameterGeneral;
	}
	
	public void setComisionPenaParameterGeneral(ComisionPenaParameterReturnGeneral comisionpenaParameterGeneral) {
		this.comisionpenaParameterGeneral = comisionpenaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoComisionPena() {
		return isPermisoTodoComisionPena;
	}

	public void setIsPermisoTodoComisionPena(Boolean isPermisoTodoComisionPena) {
		this.isPermisoTodoComisionPena = isPermisoTodoComisionPena;
	}

	public Boolean getIsPermisoNuevoComisionPena() {
		return isPermisoNuevoComisionPena;
	}

	public void setIsPermisoNuevoComisionPena(Boolean isPermisoNuevoComisionPena) {
		this.isPermisoNuevoComisionPena = isPermisoNuevoComisionPena;
	}

	public Boolean getIsPermisoActualizarComisionPena() {
		return isPermisoActualizarComisionPena;
	}

	public void setIsPermisoActualizarComisionPena(Boolean isPermisoActualizarComisionPena) {
		this.isPermisoActualizarComisionPena = isPermisoActualizarComisionPena;
	}

	public Boolean getIsPermisoEliminarComisionPena() {
		return isPermisoEliminarComisionPena;
	}

	public void setIsPermisoEliminarComisionPena(Boolean isPermisoEliminarComisionPena) {
		this.isPermisoEliminarComisionPena = isPermisoEliminarComisionPena;
	}

	public Boolean getIsPermisoGuardarCambiosComisionPena() {
		return isPermisoGuardarCambiosComisionPena;
	}

	public void setIsPermisoGuardarCambiosComisionPena(Boolean isPermisoGuardarCambiosComisionPena) {
		this.isPermisoGuardarCambiosComisionPena = isPermisoGuardarCambiosComisionPena;
	}
	
	public Boolean getIsPermisoConsultaComisionPena() {
		return isPermisoConsultaComisionPena;
	}

	public void setIsPermisoConsultaComisionPena(Boolean isPermisoConsultaComisionPena) {
		this.isPermisoConsultaComisionPena = isPermisoConsultaComisionPena;
	}

	public Boolean getIsPermisoBusquedaComisionPena() {
		return isPermisoBusquedaComisionPena;
	}

	public void setIsPermisoBusquedaComisionPena(Boolean isPermisoBusquedaComisionPena) {
		this.isPermisoBusquedaComisionPena = isPermisoBusquedaComisionPena;
	}

	public Boolean getIsPermisoReporteComisionPena() {
		return isPermisoReporteComisionPena;
	}

	public void setIsPermisoReporteComisionPena(Boolean isPermisoReporteComisionPena) {
		this.isPermisoReporteComisionPena = isPermisoReporteComisionPena;
	}
	
	public Boolean getIsPermisoPaginacionMedioComisionPena() {
		return isPermisoPaginacionMedioComisionPena;
	}

	public void setIsPermisoPaginacionMedioComisionPena(Boolean isPermisoPaginacionMedioComisionPena) {
		this.isPermisoPaginacionMedioComisionPena = isPermisoPaginacionMedioComisionPena;
	}
	
	public Boolean getIsPermisoPaginacionTodoComisionPena() {
		return isPermisoPaginacionTodoComisionPena;
	}

	public void setIsPermisoPaginacionTodoComisionPena(Boolean isPermisoPaginacionTodoComisionPena) {
		this.isPermisoPaginacionTodoComisionPena = isPermisoPaginacionTodoComisionPena;
	}
	
	public Boolean getIsPermisoPaginacionAltoComisionPena() {
		return isPermisoPaginacionAltoComisionPena;
	}

	public void setIsPermisoPaginacionAltoComisionPena(Boolean isPermisoPaginacionAltoComisionPena) {
		this.isPermisoPaginacionAltoComisionPena = isPermisoPaginacionAltoComisionPena;
	}
	
	public Boolean getIsPermisoCopiarComisionPena() {
		return isPermisoCopiarComisionPena;
	}

	public void setIsPermisoCopiarComisionPena(Boolean isPermisoCopiarComisionPena) {
		this.isPermisoCopiarComisionPena = isPermisoCopiarComisionPena;
	}
	
	public Boolean getIsPermisoVerFormComisionPena() {
		return isPermisoVerFormComisionPena;
	}

	public void setIsPermisoVerFormComisionPena(Boolean isPermisoVerFormComisionPena) {
		this.isPermisoVerFormComisionPena = isPermisoVerFormComisionPena;
	}
	
	public Boolean getIsPermisoDuplicarComisionPena() {
		return isPermisoDuplicarComisionPena;
	}

	public void setIsPermisoDuplicarComisionPena(Boolean isPermisoDuplicarComisionPena) {
		this.isPermisoDuplicarComisionPena = isPermisoDuplicarComisionPena;
	}
	
	public Boolean getIsPermisoOrdenComisionPena() {
		return isPermisoOrdenComisionPena;
	}

	public void setIsPermisoOrdenComisionPena(Boolean isPermisoOrdenComisionPena) {
		this.isPermisoOrdenComisionPena = isPermisoOrdenComisionPena;
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
	
	public Boolean getIsVisibilidadCeldaNuevoComisionPena() {
		return isVisibilidadCeldaNuevoComisionPena;
	}

	public void setIsVisibilidadCeldaNuevoComisionPena(Boolean isVisibilidadCeldaNuevoComisionPena) {
		this.isVisibilidadCeldaNuevoComisionPena = isVisibilidadCeldaNuevoComisionPena;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarComisionPena() {
		return isVisibilidadCeldaDuplicarComisionPena;
	}

	public void setIsVisibilidadCeldaDuplicarComisionPena(Boolean isVisibilidadCeldaDuplicarComisionPena) {
		this.isVisibilidadCeldaDuplicarComisionPena = isVisibilidadCeldaDuplicarComisionPena;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarComisionPena() {
		return isVisibilidadCeldaCopiarComisionPena;
	}

	public void setIsVisibilidadCeldaCopiarComisionPena(Boolean isVisibilidadCeldaCopiarComisionPena) {
		this.isVisibilidadCeldaCopiarComisionPena = isVisibilidadCeldaCopiarComisionPena;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormComisionPena() {
		return isVisibilidadCeldaVerFormComisionPena;
	}

	public void setIsVisibilidadCeldaVerFormComisionPena(Boolean isVisibilidadCeldaVerFormComisionPena) {
		this.isVisibilidadCeldaVerFormComisionPena = isVisibilidadCeldaVerFormComisionPena;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenComisionPena() {
		return isVisibilidadCeldaOrdenComisionPena;
	}

	public void setIsVisibilidadCeldaOrdenComisionPena(Boolean isVisibilidadCeldaOrdenComisionPena) {
		this.isVisibilidadCeldaOrdenComisionPena = isVisibilidadCeldaOrdenComisionPena;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesComisionPena() {
		return isVisibilidadCeldaNuevoRelacionesComisionPena;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesComisionPena(Boolean isVisibilidadCeldaNuevoRelacionesComisionPena) {
		this.isVisibilidadCeldaNuevoRelacionesComisionPena = isVisibilidadCeldaNuevoRelacionesComisionPena;
	}
	
	public Boolean getIsVisibilidadCeldaModificarComisionPena() {
		return isVisibilidadCeldaModificarComisionPena;
	}

	public void setIsVisibilidadCeldaModificarComisionPena(Boolean isVisibilidadCeldaModificarComisionPena) {
		this.isVisibilidadCeldaModificarComisionPena = isVisibilidadCeldaModificarComisionPena;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarComisionPena() {
		return isVisibilidadCeldaActualizarComisionPena;
	}

	public void setIsVisibilidadCeldaActualizarComisionPena(Boolean isVisibilidadCeldaActualizarComisionPena) {
		this.isVisibilidadCeldaActualizarComisionPena = isVisibilidadCeldaActualizarComisionPena;
	}

	public Boolean getIsVisibilidadCeldaEliminarComisionPena() {
		return isVisibilidadCeldaEliminarComisionPena;
	}

	public void setIsVisibilidadCeldaEliminarComisionPena(Boolean isVisibilidadCeldaEliminarComisionPena) {
		this.isVisibilidadCeldaEliminarComisionPena = isVisibilidadCeldaEliminarComisionPena;
	}

	public Boolean getIsVisibilidadCeldaCancelarComisionPena() {
		return isVisibilidadCeldaCancelarComisionPena;
	}

	public void setIsVisibilidadCeldaCancelarComisionPena(Boolean isVisibilidadCeldaCancelarComisionPena) {
		this.isVisibilidadCeldaCancelarComisionPena = isVisibilidadCeldaCancelarComisionPena;
	}

	public Boolean getIsVisibilidadCeldaGuardarComisionPena() {
		return isVisibilidadCeldaGuardarComisionPena;
	}

	public void setIsVisibilidadCeldaGuardarComisionPena(Boolean isVisibilidadCeldaGuardarComisionPena) {
		this.isVisibilidadCeldaGuardarComisionPena = isVisibilidadCeldaGuardarComisionPena;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosComisionPena() {
		return isVisibilidadCeldaGuardarCambiosComisionPena;
	}

	public void setIsVisibilidadCeldaGuardarCambiosComisionPena(Boolean isVisibilidadCeldaGuardarCambiosComisionPena) {
		this.isVisibilidadCeldaGuardarCambiosComisionPena = isVisibilidadCeldaGuardarCambiosComisionPena;
	}
		
	public ComisionPenaSessionBean getcomisionpenaSessionBean() {
		return this.comisionpenaSessionBean;
	}
	
	public void setcomisionpenaSessionBean(ComisionPenaSessionBean comisionpenaSessionBean) {
		this.comisionpenaSessionBean=comisionpenaSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysComisionPena(ComisionPena comisionpena)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(comisionpena,null);
				this.setActualParaGuardarComisionConfigForeignKey(comisionpena,null);
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
	
	public void bugActualizarReferenciaActual(ComisionPena comisionpena,ComisionPena comisionpenaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalComisionPena(comisionpena);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		comisionpenaAux.setId(comisionpena.getId());
		comisionpenaAux.setVersionRow(comisionpena.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessComisionPena();
		
			int intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ComisionPenaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualComisionPena(this.comisionpena,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = comisionpenaValidator.getInvalidValues(this.comisionpena);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			comisionpenaLogic.setDatosCliente(datosCliente);
			comisionpenaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				comisionpenaAux=new  ComisionPena();
				
				comisionpenaAux.setIsNew(true);
				comisionpenaAux.setIsChanged(true);
				
				comisionpenaAux.setComisionPenaOriginal(this.comisionpena);
				
				comisionpenaAux.setId(this.comisionpena.getId());	
				comisionpenaAux.setVersionRow(this.comisionpena.getVersionRow());	
				comisionpenaAux.setid_empresa(this.comisionpena.getid_empresa());	
				comisionpenaAux.setid_comision_config(this.comisionpena.getid_comision_config());	
				comisionpenaAux.setnum_dias_inicio(this.comisionpena.getnum_dias_inicio());	
				comisionpenaAux.setnum_dias_fin(this.comisionpena.getnum_dias_fin());	
				comisionpenaAux.setporcentaje(this.comisionpena.getporcentaje());	
				comisionpenaAux.setdescripcion(this.comisionpena.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comisionpenaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comisionpenaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(comisionpenaAux,comisionpenaLogic.getComisionPenas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionpenaAux,comisionpenas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.comisionpenaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionpenaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionpenaLogic.saveComisionPenas();//WithConnection
						//comisionpenaLogic.getSetVersionRowComisionPenas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.comisionpena,comisionpenaAux);
					
					this.refrescarForeignKeysDescripcionesComisionPena();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionpenaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionpenaLogic.saveComisionPenaRelaciones(comisionpenaAux);//WithConnection
								//comisionpenaLogic.getSetVersionRowComisionPenas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.comisionpena,comisionpenaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.comisionpenaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.comisionpenaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(comisionpenaAux,comisionpenaLogic.getComisionPenas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(comisionpenaAux,comisionpenas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.comisionpena,comisionpenaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				comisionpenaAux=new  ComisionPena();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.comisionpenaSessionBean.getEsGuardarRelacionado() 
					|| (this.comisionpenaSessionBean.getEsGuardarRelacionado() && this.comisionpena.getId()>=0)) {
						
					comisionpenaAux.setIsNew(false);
				}
				
				comisionpenaAux.setIsDeleted(false);
			
				comisionpenaAux.setId(this.comisionpena.getId());	
				comisionpenaAux.setVersionRow(this.comisionpena.getVersionRow());	
				comisionpenaAux.setid_empresa(this.comisionpena.getid_empresa());	
				comisionpenaAux.setid_comision_config(this.comisionpena.getid_comision_config());	
				comisionpenaAux.setnum_dias_inicio(this.comisionpena.getnum_dias_inicio());	
				comisionpenaAux.setnum_dias_fin(this.comisionpena.getnum_dias_fin());	
				comisionpenaAux.setporcentaje(this.comisionpena.getporcentaje());	
				comisionpenaAux.setdescripcion(this.comisionpena.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comisionpenaAux,comisionpenaLogic.getComisionPenas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionpenaAux,comisionpenas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.comisionpenaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionpenaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionpenaLogic.saveComisionPenas();//WithConnection
						//comisionpenaLogic.getSetVersionRowComisionPenas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.comisionpena,comisionpenaAux);
					
					this.refrescarForeignKeysDescripcionesComisionPena();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionpenaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionpenaLogic.saveComisionPenaRelaciones(comisionpenaAux);//WithConnection
								//comisionpenaLogic.getSetVersionRowComisionPenas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.comisionpena,comisionpenaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.comisionpenaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.comisionpenaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(comisionpenaAux,comisionpenaLogic.getComisionPenas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(comisionpenaAux,comisionpenas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.comisionpena,comisionpenaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				comisionpenaAux=new  ComisionPena();
				
				comisionpenaAux.setIsNew(false);
				comisionpenaAux.setIsChanged(false);
				
				comisionpenaAux.setIsDeleted(true);
				
				comisionpenaAux.setId(this.comisionpena.getId());	
				comisionpenaAux.setVersionRow(this.comisionpena.getVersionRow());	
				comisionpenaAux.setid_empresa(this.comisionpena.getid_empresa());	
				comisionpenaAux.setid_comision_config(this.comisionpena.getid_comision_config());	
				comisionpenaAux.setnum_dias_inicio(this.comisionpena.getnum_dias_inicio());	
				comisionpenaAux.setnum_dias_fin(this.comisionpena.getnum_dias_fin());	
				comisionpenaAux.setporcentaje(this.comisionpena.getporcentaje());	
				comisionpenaAux.setdescripcion(this.comisionpena.getdescripcion());	
				
				if(this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.comisionpenaAux.getId()>=0) {	
						this.comisionpenasEliminados.add(comisionpenaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(comisionpenaAux,comisionpenaLogic.getComisionPenas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionpenaAux,comisionpenas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.comisionpenaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionpenaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionpenaLogic.saveComisionPenas();//WithConnection
						//comisionpenaLogic.getSetVersionRowComisionPenas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionpenaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionpenaLogic.saveComisionPenaRelaciones(comisionpenaAux);//WithConnection
								//comisionpenaLogic.getSetVersionRowComisionPenas();//WithConnection
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
							if(this.comisionpenaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.comisionpenaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(comisionpenaAux,comisionpenaLogic.getComisionPenas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(comisionpenaAux,comisionpenas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.getComisionPenas().addAll(this.comisionpenasEliminados);
					
					comisionpenaLogic.saveComisionPenas();//WithConnection
					//comisionpenaLogic.getSetVersionRowComisionPenas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesComisionPena();
				
				this.comisionpenasEliminados= new ArrayList<ComisionPena>();		
			}
			
			if(this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionpenaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Penalidad Comision GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Penalidad Comision",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.comisionpena=comisionpenaAux;
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
      		//this.finishProcessComisionPena();
      	}
		
	}	
	
	public void actualizarRelaciones(ComisionPena comisionpenaLocal) throws Exception {
		
		if(this.comisionpenaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ComisionPena comisionpenaLocal) throws Exception {	
		if(this.comisionpenaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				comisionpenaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ComisionConfigDetalleFormJInternalFrame.class)) {
				ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrameLocal=(ComisionConfigBeanSwingJInternalFrame) ((ComisionConfigDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				comisionconfigBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoComisionConfig(comisionconfigBeanSwingJInternalFrameLocal.getcomisionconfig(),true);
				comisionconfigBeanSwingJInternalFrameLocal.actualizarLista(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig,this.comisionconfigsForeignKey);

				comisionconfigBeanSwingJInternalFrameLocal.actualizarRelaciones(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig);

				comisionpenaLocal.setComisionConfig(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig);

				this.addItemDefectoCombosForeignKeyComisionConfig();
				this.cargarCombosFrameComisionConfigsForeignKey("Formulario");
				this.setActualComisionConfigForeignKey(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarComisionPenaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = comisionpenaValidator.getInvalidValues(this.comisionpena);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ComisionPena comisionpena,List<ComisionPena> comisionpenas) throws Exception {
		try	{		
			ComisionPenaConstantesFunciones.actualizarLista(comisionpena,comisionpenas,this.comisionpenaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ComisionPena comisionpena,List<ComisionPena> comisionpenas) throws Exception {
		try	{			
			ComisionPenaConstantesFunciones.actualizarSelectedLista(comisionpena,comisionpenas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ComisionPena> comisionpenasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				comisionpenasLocal=this.comisionpenaLogic.getComisionPenas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				comisionpenasLocal=this.comisionpenas;
			}
			//ARCHITECTURE
		
			for(ComisionPena comisionpenaLocal:comisionpenasLocal) {
				if(this.permiteMantenimiento(comisionpenaLocal) && comisionpenaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ComisionPenaConstantesFunciones.getComisionPenaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ComisionPenaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionPena.jLabelid_empresaComisionPena,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionPenaConstantesFunciones.IDCOMISIONCONFIG)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionPena.jLabelid_comision_configComisionPena,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionPenaConstantesFunciones.NUMDIASINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionPena.jLabelnum_dias_inicioComisionPena,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionPenaConstantesFunciones.NUMDIASFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionPena.jLabelnum_dias_finComisionPena,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionPenaConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionPena.jLabelporcentajeComisionPena,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionPenaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionPena.jLabeldescripcionComisionPena,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionPena.jLabelid_empresaComisionPena,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionPena.jLabelid_comision_configComisionPena,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionPena.jLabelnum_dias_inicioComisionPena,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionPena.jLabelnum_dias_finComisionPena,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionPena.jLabelporcentajeComisionPena,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionPena.jLabeldescripcionComisionPena,"");
		
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
		this.iIdNuevoComisionPena--;	
		
		
		this.comisionpenaAux=new ComisionPena();
		
		this.comisionpenaAux.setId(this.iIdNuevoComisionPena);
		this.comisionpenaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comisionpenaLogic.getComisionPenas().add(this.comisionpenaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.comisionpenas.add(this.comisionpenaAux);
		}
		//ARCHITECTURE
		
		this.comisionpena=this.comisionpenaAux;
		
		if(ComisionPenaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioComisionPena(this.comisionpena);
			this.setVariablesObjetoActualToFormularioForeignKeyComisionPena(this.comisionpena);
		}
				
		//this.setDefaultControlesComisionPena();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyComisionPena();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyComisionPena();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyComisionPena();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComisionPena(this.comisionpenaBean,this.comisionpena,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ComisionPenaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.comisionpenaSessionBean.getConGuardarRelaciones()) {
			classes=ComisionPenaConstantesFunciones.getClassesRelationshipsOfComisionPena(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.comisionpenaReturnGeneral=comisionpenaLogic.procesarEventosComisionPenasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisionpenaLogic.getComisionPenas(),this.comisionpena,this.comisionpenaParameterGeneral,this.isEsNuevoComisionPena,classes);//this.comisionpenaLogic.getComisionPena()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanComisionPena(this.comisionpenaReturnGeneral,this.comisionpenaBean,false);
		
		if(this.comisionpenaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyComisionPena(this.comisionpenaReturnGeneral.getComisionPena());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioComisionPena(this.comisionpenaReturnGeneral.getComisionPena());
		}
		
		if(this.comisionpenaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioComisionPena(this.comisionpenaReturnGeneral.getComisionPena(),classes);//this.comisionpenaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualComisionPena(this.comisionpena,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyComisionPena();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyComisionPena();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComisionPenaBeanSwingJInternalFrameAdditional.RecargarFormComisionPena(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingComisionPena(false);
						
			if(comisionpenaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ComisionPenaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionPena();
			}
			
			this.actualizarVisualTableDatosComisionPena();
			
			this.jTableDatosComisionPena.setRowSelectionInterval(this.getIndiceNuevoComisionPena(), this.getIndiceNuevoComisionPena());
			
			this.seleccionarFilaTablaComisionPenaActual();
						
			this.actualizarEstadoCeldasBotonesComisionPena("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesComisionPena(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormComisionPena.jTextFieldnum_dias_inicioComisionPena.setEnabled(isHabilitar && this.comisionpenaConstantesFunciones.activarnum_dias_inicioComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jTextFieldnum_dias_finComisionPena.setEnabled(isHabilitar && this.comisionpenaConstantesFunciones.activarnum_dias_finComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jTextFieldporcentajeComisionPena.setEnabled(isHabilitar && this.comisionpenaConstantesFunciones.activarporcentajeComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jTextAreadescripcionComisionPena.setEnabled(isHabilitar && this.comisionpenaConstantesFunciones.activardescripcionComisionPena);	
		//
		this.jInternalFrameDetalleFormComisionPena.jComboBoxid_empresaComisionPena.setEnabled(isHabilitar && this.comisionpenaConstantesFunciones.activarid_empresaComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jComboBoxid_comision_configComisionPena.setEnabled(isHabilitar && this.comisionpenaConstantesFunciones.activarid_comision_configComisionPena);
	};
	
	public void setDefaultControlesComisionPena() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoComisionPena(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.comisionpenaSessionBean.setConGuardarRelaciones(true);			
			this.comisionpenaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormComisionPena.jTabbedPaneRelacionesComisionPena.setVisible(true);
			
					
		} else {
			//this.comisionpenaSessionBean.setConGuardarRelaciones(false);			
			this.comisionpenaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormComisionPena.jTabbedPaneRelacionesComisionPena.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoComisionPena() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionPena comisionpenaAux:this.comisionpenaLogic.getComisionPenas()) {
				if(comisionpenaAux.getId().equals(this.iIdNuevoComisionPena)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionPena comisionpenaAux:this.comisionpenas) {
				if(comisionpenaAux.getId().equals(this.iIdNuevoComisionPena)) {
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
	
	public int getIndiceActualComisionPena(ComisionPena comisionpena,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionPena comisionpenaAux:this.comisionpenaLogic.getComisionPenas()) {
				if(comisionpenaAux.getId().equals(comisionpena.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionPena comisionpenaAux:this.comisionpenas) {
				if(comisionpenaAux.getId().equals(comisionpena.getId())) {
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
	
	public void setCamposBaseDesdeOriginalComisionPena(ComisionPena comisionpenaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionPena comisionpenaAux:this.comisionpenaLogic.getComisionPenas()) {
				if(comisionpenaAux.getComisionPenaOriginal().getId().equals(comisionpenaOriginal.getId())) {
					existe=true;
					comisionpenaOriginal.setId(comisionpenaAux.getId());
					comisionpenaOriginal.setVersionRow(comisionpenaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionPena comisionpenaAux:this.comisionpenas) {
				if(comisionpenaAux.getComisionPenaOriginal().getId().equals(comisionpenaOriginal.getId())) {
					existe=true;
					comisionpenaOriginal.setId(comisionpenaAux.getId());
					comisionpenaOriginal.setVersionRow(comisionpenaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosComisionPena(Boolean esParaCancelar) throws Exception {
		comisionpenasAux=new ArrayList<ComisionPena>();
		comisionpenaAux=new ComisionPena();
		
		if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComisionPena comisionpenaAux:this.comisionpenaLogic.getComisionPenas()) {
					if(comisionpenaAux.getId()<0) {
						comisionpenasAux.add(comisionpenaAux);
					}		
				}
				this.iIdNuevoComisionPena=0L;
				this.comisionpenaLogic.getComisionPenas().removeAll(comisionpenasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionPena comisionpenaAux:this.comisionpenas) {
					if(comisionpenaAux.getId()<0) {
						comisionpenasAux.add(comisionpenaAux);
					}		
				}
				this.iIdNuevoComisionPena=0L;
				this.comisionpenas.removeAll(comisionpenasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoComisionPena 
					&& this.comisionpenaLogic.getComisionPenas().size()>0
					) {
					comisionpenaAux=this.comisionpenaLogic.getComisionPenas().get(this.comisionpenaLogic.getComisionPenas().size() - 1);
				
					if(comisionpenaAux.getId()<0) {
						this.comisionpenaLogic.getComisionPenas().remove(comisionpenaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoComisionPena && this.comisionpenas.size()>0) {
					comisionpenaAux=this.comisionpenas.get(this.comisionpenas.size() - 1);
				
					if(comisionpenaAux.getId()<0) {
						this.comisionpenas.remove(comisionpenaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoComisionPena(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(comisionpena.getId()<0) {
				this.comisionpenaLogic.getComisionPenas().remove(this.comisionpena);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(comisionpena.getId()<0) {
				this.comisionpenas.remove(this.comisionpena);
			}
		}			
	}
	
	public void setEstadosInicialesComisionPena(List<ComisionPena> comisionpenasAux) throws Exception {
		ComisionPenaConstantesFunciones.setEstadosInicialesComisionPena(comisionpenasAux);
	}
	
	public void setEstadosInicialesComisionPena(ComisionPena comisionpenaAux) throws Exception {
		ComisionPenaConstantesFunciones.setEstadosInicialesComisionPena(comisionpenaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarComisionPenaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesComisionPena("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarComisionPenaActual()) {
				if(!this.isEsNuevoComisionPena) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesComisionPena("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoComisionPena=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarComisionPenaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Penalidad Comision ?", "MANTENIMIENTO DE Penalidad Comision", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesComisionPena("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ComisionPena comisionpena) throws Exception {
		ComisionPenaConstantesFunciones.seleccionarAsignar(this.comisionpena,comisionpena);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarComisionPena=this.isPermisoActualizarOriginalComisionPena;
			
			
			this.seleccionarAsignar(comisionpena);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComisionPenaConstantesFunciones.quitarEspaciosComisionPena(this.comisionpena,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesComisionPena("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.comisionpenaSessionBean.setsFuncionBusquedaRapida(this.comisionpenaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoComisionPena) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosComisionPena(esParaCancelar);				
				this.cancelarNuevoComisionPena(esParaCancelar);								
			}
			
			this.comisionpena=new ComisionPena();
			
			this.inicializarComisionPena();
			
			this.actualizarEstadoCeldasBotonesComisionPena("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarComisionPena() throws Exception {
		try {
			ComisionPenaConstantesFunciones.inicializarComisionPena(this.comisionpena);
			
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
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.comisionpenaLogic.getComisionPenas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteComisionPenas(String sAccionBusqueda,List<ComisionPena> comisionpenasParaReportes) throws Exception {
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
					sPathReporteFinal="ComisionPena"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ComisionPenaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ComisionPenaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ComisionPena"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Penalidad Comisions");		
		parameters.put("busquedapor", ComisionPenaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceComisionPena=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ComisionPenaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ComisionPenaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceComisionPena=new JRBeanArrayDataSource(ComisionPenaJInternalFrame.TraerComisionPenaBeans(comisionpenasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceComisionPena);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ComisionPenaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ComisionPenaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ComisionPenaBean.TraerComisionPenaBeans(comisionpenasParaReportes).toArray()));
							
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
				this.generarExcelReporteComisionPenas(sAccionBusqueda,sTipoArchivoReporte,comisionpenasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalComisionPenas(sAccionBusqueda,sTipoArchivoReporte,comisionpenasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoComisionPenaActionPerformed(null);
					//this.generarExcelReporteComisionPenas(sAccionBusqueda,sTipoArchivoReporte,comisionpenasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalComisionPenas(sAccionBusqueda,sTipoArchivoReporte,comisionpenasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesComisionPenas(sAccionBusqueda,sTipoArchivoReporte,comisionpenasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesComisionPenas(sAccionBusqueda,sTipoArchivoReporte,comisionpenasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteComisionPenas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionPena> comisionpenasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionpena";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionPenas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComisionPena("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ComisionPena comisionpena : comisionpenasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ComisionPenaConstantesFunciones.generarExcelReporteDataComisionPena("NORMAL",row,workbook,comisionpena,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionpenaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Penalidad Comision",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderComisionPena(String sTipo,Row row,Workbook workbook) {
		
		ComisionPenaConstantesFunciones.generarExcelReporteHeaderComisionPena(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalComisionPenas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionPena> comisionpenasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionpena_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionPenas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ComisionPena comisionpena : comisionpenasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ComisionPenaConstantesFunciones.getComisionPenaDescripcion(comisionpena));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionPenaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionpena.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionPenaConstantesFunciones.LABEL_IDCOMISIONCONFIG))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_IDCOMISIONCONFIG);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionpena.getcomisionconfig_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionpena.getnum_dias_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionpena.getnum_dias_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionPenaConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionpena.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionPenaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionpena.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionpenaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Penalidad Comision",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesComisionPenas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionPena> comisionpenasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ComisionPena> comisionpenasRespaldo=null;
		
		classes=ComisionPenaConstantesFunciones.getClassesRelationshipsOfComisionPena(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.comisionpenaLogic.setDatosCliente(this.datosCliente);
		this.comisionpenaLogic.setDatosDeep(this.datosDeep);
		this.comisionpenaLogic.setIsConDeep(true);
		
		comisionpenasRespaldo=this.comisionpenaLogic.getComisionPenas();
		
		this.comisionpenaLogic.setComisionPenas(comisionpenasParaReportes);	
		this.comisionpenaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		comisionpenasParaReportes=this.comisionpenaLogic.getComisionPenas();
		this.comisionpenaLogic.setComisionPenas(comisionpenasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionpena_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionPenas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComisionPena("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ComisionPena comisionpena : comisionpenasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderComisionPena("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ComisionPenaConstantesFunciones.generarExcelReporteDataComisionPena("NORMAL",row,workbook,comisionpena,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ComisionPenaConstantesFunciones.getComisionPenaDescripcion(comisionpena));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionpenaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Penalidad Comision",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoComisionPena.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionPena.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoComisionPena.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionPena.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessComisionPena() throws Exception {		
		this.startProcessComisionPena(true);
	}
	
	public void startProcessComisionPena(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasComisionPena ,this.jPanelParametrosReportesComisionPena, this.jScrollPanelDatosComisionPena,this.jPanelPaginacionComisionPena, this.jScrollPanelDatosEdicionComisionPena, this.jPanelAccionesComisionPena,this.jPanelAccionesFormularioComisionPena,this.jmenuBarComisionPena,this.jmenuBarDetalleComisionPena,this.jTtoolBarComisionPena,this.jTtoolBarDetalleComisionPena);		
		
		final JTabbedPane jTabbedPaneBusquedasComisionPena=this.jTabbedPaneBusquedasComisionPena; 
		
		final JPanel jPanelParametrosReportesComisionPena=this.jPanelParametrosReportesComisionPena;
		//final JScrollPane jScrollPanelDatosComisionPena=this.jScrollPanelDatosComisionPena;
		final JTable jTableDatosComisionPena=this.jTableDatosComisionPena;		
		final JPanel jPanelPaginacionComisionPena=this.jPanelPaginacionComisionPena;
		//final JScrollPane jScrollPanelDatosEdicionComisionPena=this.jScrollPanelDatosEdicionComisionPena;
		final JPanel jPanelAccionesComisionPena=this.jPanelAccionesComisionPena;
		
		JPanel jPanelCamposAuxiliarComisionPena=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarComisionPena=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) {
			jPanelCamposAuxiliarComisionPena=this.jInternalFrameDetalleFormComisionPena.jPanelCamposComisionPena;
			jPanelAccionesFormularioAuxiliarComisionPena=this.jInternalFrameDetalleFormComisionPena.jPanelAccionesFormularioComisionPena;
		}
		
		final JPanel jPanelCamposComisionPena=jPanelCamposAuxiliarComisionPena;
		final JPanel jPanelAccionesFormularioComisionPena=jPanelAccionesFormularioAuxiliarComisionPena;
		
		
		final JMenuBar jmenuBarComisionPena=this.jmenuBarComisionPena;
		final JToolBar jTtoolBarComisionPena=this.jTtoolBarComisionPena;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarComisionPena=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComisionPena=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) {
			jmenuBarDetalleAuxiliarComisionPena=this.jInternalFrameDetalleFormComisionPena.jmenuBarDetalleComisionPena;
			jTtoolBarDetalleAuxiliarComisionPena=this.jInternalFrameDetalleFormComisionPena.jTtoolBarDetalleComisionPena;
		}
		
		final JMenuBar jmenuBarDetalleComisionPena=jmenuBarDetalleAuxiliarComisionPena;
		final JToolBar jTtoolBarDetalleComisionPena=jTtoolBarDetalleAuxiliarComisionPena;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComisionPena;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComisionPena;
			processRunnable.jTableDatos=jTableDatosComisionPena;
			processRunnable.jPanelCampos=jPanelCamposComisionPena;
			processRunnable.jPanelPaginacion=jPanelPaginacionComisionPena;
			processRunnable.jPanelAcciones=jPanelAccionesComisionPena;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComisionPena;
			
			
			processRunnable.jmenuBar=jmenuBarComisionPena;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComisionPena;
			processRunnable.jTtoolBar=jTtoolBarComisionPena;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComisionPena;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComisionPena ,jPanelParametrosReportesComisionPena,jTableDatosComisionPena, /*jScrollPanelDatosComisionPena,*/jPanelCamposComisionPena,jPanelPaginacionComisionPena, /*jScrollPanelDatosEdicionComisionPena,*/ jPanelAccionesComisionPena,jPanelAccionesFormularioComisionPena,jmenuBarComisionPena,jmenuBarDetalleComisionPena,jTtoolBarComisionPena,jTtoolBarDetalleComisionPena);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComisionPena ,jPanelParametrosReportesComisionPena, jScrollPanelDatosComisionPena,jPanelPaginacionComisionPena, jScrollPanelDatosEdicionComisionPena, jPanelAccionesComisionPena,jPanelAccionesFormularioComisionPena,jmenuBarComisionPena,jmenuBarDetalleComisionPena,jTtoolBarComisionPena,jTtoolBarDetalleComisionPena);
						
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
	
	public void finishProcessComisionPena() {// throws Exception 
		this.finishProcessComisionPena(true);
	}
	
	public void finishProcessComisionPena(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasComisionPena ,this.jPanelParametrosReportesComisionPena, this.jScrollPanelDatosComisionPena,this.jPanelPaginacionComisionPena, this.jScrollPanelDatosEdicionComisionPena, this.jPanelAccionesComisionPena,this.jPanelAccionesFormularioComisionPena,this.jmenuBarComisionPena,this.jmenuBarDetalleComisionPena,this.jTtoolBarComisionPena,this.jTtoolBarDetalleComisionPena);		
		
		final JTabbedPane jTabbedPaneBusquedasComisionPena=this.jTabbedPaneBusquedasComisionPena; 
		
		final JPanel jPanelParametrosReportesComisionPena=this.jPanelParametrosReportesComisionPena;
		//final JScrollPane jScrollPanelDatosComisionPena=this.jScrollPanelDatosComisionPena;
		final JTable jTableDatosComisionPena=this.jTableDatosComisionPena;		
		final JPanel jPanelPaginacionComisionPena=this.jPanelPaginacionComisionPena;
		//final JScrollPane jScrollPanelDatosEdicionComisionPena=this.jScrollPanelDatosEdicionComisionPena;
		final JPanel jPanelAccionesComisionPena=this.jPanelAccionesComisionPena;
		
		JPanel jPanelCamposAuxiliarComisionPena=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarComisionPena=new JPanel();
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) {
			jPanelCamposAuxiliarComisionPena=this.jInternalFrameDetalleFormComisionPena.jPanelCamposComisionPena;
			jPanelAccionesFormularioAuxiliarComisionPena=this.jInternalFrameDetalleFormComisionPena.jPanelAccionesFormularioComisionPena;
		}
		
		final JPanel jPanelCamposComisionPena=jPanelCamposAuxiliarComisionPena;
		final JPanel jPanelAccionesFormularioComisionPena=jPanelAccionesFormularioAuxiliarComisionPena;
		
		
		final JMenuBar jmenuBarComisionPena=this.jmenuBarComisionPena;		
		final JToolBar jTtoolBarComisionPena=this.jTtoolBarComisionPena;
				
		JMenuBar jmenuBarDetalleAuxiliarComisionPena=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComisionPena=new JToolBar();
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) {
			jmenuBarDetalleAuxiliarComisionPena=this.jInternalFrameDetalleFormComisionPena.jmenuBarDetalleComisionPena;
			jTtoolBarDetalleAuxiliarComisionPena=this.jInternalFrameDetalleFormComisionPena.jTtoolBarDetalleComisionPena;		
		}
		
		final JMenuBar jmenuBarDetalleComisionPena=jmenuBarDetalleAuxiliarComisionPena;
		final JToolBar jTtoolBarDetalleComisionPena=jTtoolBarDetalleAuxiliarComisionPena;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComisionPena;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComisionPena;
			processRunnable.jTableDatos=jTableDatosComisionPena;
			processRunnable.jPanelCampos=jPanelCamposComisionPena;
			processRunnable.jPanelPaginacion=jPanelPaginacionComisionPena;
			processRunnable.jPanelAcciones=jPanelAccionesComisionPena;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComisionPena;
			
			
			processRunnable.jmenuBar=jmenuBarComisionPena;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComisionPena;
			processRunnable.jTtoolBar=jTtoolBarComisionPena;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComisionPena;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasComisionPena ,jPanelParametrosReportesComisionPena, jTableDatosComisionPena,/*jScrollPanelDatosComisionPena,*/jPanelCamposComisionPena,jPanelPaginacionComisionPena, /*jScrollPanelDatosEdicionComisionPena,*/ jPanelAccionesComisionPena,jPanelAccionesFormularioComisionPena,jmenuBarComisionPena,jmenuBarDetalleComisionPena,jTtoolBarComisionPena,jTtoolBarDetalleComisionPena));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesComisionPena(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarComisionPena(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuComisionPena(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarComisionPena(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarComisionPena,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleComisionPena,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuComisionPena(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarComisionPena,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleComisionPena,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.comisionpenaConstantesFunciones.getsFinalQueryComisionPena();
		String  finalQueryPaginacionTodos=this.comisionpenaConstantesFunciones.getsFinalQueryComisionPena();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ComisionPenaConstantesFunciones.getArrayColumnasGlobalesNoComisionPena(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ComisionPenaConstantesFunciones.getArrayColumnasGlobalesComisionPena(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ComisionPenaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.comisionpenasEliminados= new ArrayList<ComisionPena>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessComisionPena();
		
				///*ComisionPenaSessionBean*/this.comisionpenaSessionBean=new ComisionPenaSessionBean();
			
			if(this.comisionpenaSessionBean==null) {
				this.comisionpenaSessionBean=new ComisionPenaSessionBean();
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
					this.iNumeroPaginacion=ComisionPenaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ComisionPenaConstantesFunciones.getClassesForeignKeysOfComisionPena(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/comisionpena."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			comisionpenasAux= new ArrayList<ComisionPena>();
			
				
			comisionpenaLogic.setDatosCliente(this.datosCliente);
			comisionpenaLogic.setDatosDeep(this.datosDeep);
			comisionpenaLogic.setIsConDeep(true);
			
			
			comisionpenaLogic.getComisionPenaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					comisionpenaLogic.getTodosComisionPenas(finalQueryGlobal,pagination);
					
					//comisionpenaLogic.getTodosComisionPenasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(comisionpenaLogic.getComisionPenas()==null|| comisionpenaLogic.getComisionPenas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionpenasAux= new ArrayList<ComisionPena>();
							comisionpenasAux.addAll(comisionpenaLogic.getComisionPenas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionpenasAux= new ArrayList<ComisionPena>();
							comisionpenasAux.addAll(comisionpenas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionpenaLogic.getTodosComisionPenas(finalQueryGlobal+"",this.pagination);												
							
							//comisionpenaLogic.getTodosComisionPenasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteComisionPenas("Todos",comisionpenaLogic.getComisionPenas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionpenaLogic.setComisionPenas(new ArrayList<ComisionPena>());					
							comisionpenaLogic.getComisionPenas().addAll(comisionpenasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionpenas=new ArrayList<ComisionPena>();
							comisionpenas.addAll(comisionpenasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idComisionPena=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idComisionPena=this.idActual;
				
				} else if(this.idComisionPenaActual!=null && this.idComisionPenaActual!=0L) {
					idComisionPena=idComisionPenaActual;
				}
				
					
				this.sDetalleReporte=ComisionPenaConstantesFunciones.getDetalleIndicePorId(idComisionPena);
				
				this.comisionpenas=new ArrayList<ComisionPena>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					comisionpenaLogic.getEntity(idComisionPena);
					
					//comisionpenaLogic.getEntityWithConnection(idComisionPena);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionpenaLogic.setComisionPenas(new ArrayList<ComisionPena>());
					comisionpenaLogic.getComisionPenas().add(comisionpenaLogic.getComisionPena());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionpenas=new ArrayList<ComisionPena>();
					this.comisionpenas.add(comisionpena);
				}
				
				if(comisionpenaLogic.getComisionPena()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdComisionConfig")) {
				this.sDetalleReporte=ComisionPenaConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comisionpenaLogic.getComisionPenasFK_IdComisionConfig(finalQueryGlobal,pagination,id_comision_configFK_IdComisionConfig);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionPenaConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionPenaConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comisionpenaLogic.getComisionPenas()==null||comisionpenaLogic.getComisionPenas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comisionpenas==null|| comisionpenas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionpenasAux=new ArrayList<ComisionPena>();
						comisionpenasAux.addAll(comisionpenaLogic.getComisionPenas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionpenasAux=new ArrayList<ComisionPena>();
							comisionpenasAux.addAll(comisionpenas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comisionpenaLogic.getComisionPenasFK_IdComisionConfig(finalQueryGlobal,pagination,id_comision_configFK_IdComisionConfig);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionPenaConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionPenaConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComisionPenas("FK_IdComisionConfig",comisionpenaLogic.getComisionPenas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComisionPenas("FK_IdComisionConfig",comisionpenas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionpenaLogic.setComisionPenas(new ArrayList<ComisionPena>());
						comisionpenaLogic.getComisionPenas().addAll(comisionpenasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionpenas=new ArrayList<ComisionPena>();
							comisionpenas.addAll(comisionpenasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ComisionPenaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comisionpenaLogic.getComisionPenasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionPenaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionPenaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comisionpenaLogic.getComisionPenas()==null||comisionpenaLogic.getComisionPenas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comisionpenas==null|| comisionpenas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionpenasAux=new ArrayList<ComisionPena>();
						comisionpenasAux.addAll(comisionpenaLogic.getComisionPenas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionpenasAux=new ArrayList<ComisionPena>();
							comisionpenasAux.addAll(comisionpenas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comisionpenaLogic.getComisionPenasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionPenaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionPenaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComisionPenas("FK_IdEmpresa",comisionpenaLogic.getComisionPenas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComisionPenas("FK_IdEmpresa",comisionpenas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionpenaLogic.setComisionPenas(new ArrayList<ComisionPena>());
						comisionpenaLogic.getComisionPenas().addAll(comisionpenasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionpenas=new ArrayList<ComisionPena>();
							comisionpenas.addAll(comisionpenasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesComisionPena();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessComisionPena();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comisionpenaLogic.getComisionPenas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisionpenas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comisionpenaLogic.getComisionPenas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisionpenas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ComisionPena comisionpena) {
		Boolean permite=true;
		
		if(this.comisionpena.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ComisionPenaConstantesFunciones.getOrderByListaComisionPena();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ComisionPenaConstantesFunciones.getOrderByListaComisionPena();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionPena comisionpena:comisionpenaLogic.getComisionPenas()) {
				if(comisionpena.getsType().equals(Constantes2.S_TOTALES)) {
					comisionpenaTotales=comisionpena;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionPena comisionpena:this.comisionpenas) {
				if(comisionpena.getsType().equals(Constantes2.S_TOTALES)) {
					comisionpenaTotales=comisionpena;
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
			this.comisionpenaAux=new ComisionPena();
			this.comisionpenaAux.setsType(Constantes2.S_TOTALES);
			this.comisionpenaAux.setIsNew(false);
			this.comisionpenaAux.setIsChanged(false);
			this.comisionpenaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ComisionPenaConstantesFunciones.TotalizarValoresFilaComisionPena(this.comisionpenaLogic.getComisionPenas(),this.comisionpenaAux);
				
				this.comisionpenaLogic.getComisionPenas().add(this.comisionpenaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ComisionPenaConstantesFunciones.TotalizarValoresFilaComisionPena(this.comisionpenas,this.comisionpenaAux);
				
				this.comisionpenas.add(this.comisionpenaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		comisionpenaTotales=new ComisionPena();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comisionpenaLogic.getComisionPenas().remove(comisionpenaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comisionpenas.remove(comisionpenaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		comisionpenaTotales=new ComisionPena();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionPena comisionpena:comisionpenaLogic.getComisionPenas()) {
				if(comisionpena.getsType().equals(Constantes2.S_TOTALES)) {
					comisionpenaTotales=comisionpena;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComisionPenaConstantesFunciones.TotalizarValoresFilaComisionPena(this.comisionpenaLogic.getComisionPenas(),comisionpenaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionPena comisionpena:this.comisionpenas) {
				if(comisionpena.getsType().equals(Constantes2.S_TOTALES)) {
					comisionpenaTotales=comisionpena;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComisionPenaConstantesFunciones.TotalizarValoresFilaComisionPena(this.comisionpenas,comisionpenaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getComisionPenasFK_IdComisionConfig()throws Exception {
		try {
			sAccionBusqueda="FK_IdComisionConfig";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionPenasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getComisionPenasFK_IdComisionConfig(String sFinalQuery,Long id_comision_config)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionpenaLogic.getComisionPenasFK_IdComisionConfig(sFinalQuery,this.pagination,id_comision_config);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionPenasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionpenaLogic.getComisionPenasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosComisionPena() {
		this.isPermisoTodoComisionPena=false;
		this.isPermisoNuevoComisionPena=false;
		this.isPermisoActualizarComisionPena=false;
		this.isPermisoActualizarOriginalComisionPena=false;
		this.isPermisoEliminarComisionPena=false;
		this.isPermisoGuardarCambiosComisionPena=false;
		this.isPermisoConsultaComisionPena=false;
		this.isPermisoBusquedaComisionPena=false;
		this.isPermisoReporteComisionPena=false;		
		this.isPermisoOrdenComisionPena=false;		
		this.isPermisoPaginacionMedioComisionPena=false;		
		this.isPermisoPaginacionAltoComisionPena=false;
		this.isPermisoPaginacionTodoComisionPena=false;
		this.isPermisoCopiarComisionPena=false;		
		this.isPermisoVerFormComisionPena=false;		
		this.isPermisoDuplicarComisionPena=false;		
		this.isPermisoOrdenComisionPena=false;		
	}
	
	public void setPermisosUsuarioComisionPena(Boolean isPermiso) {
		this.isPermisoTodoComisionPena=isPermiso;
		this.isPermisoNuevoComisionPena=isPermiso;
		this.isPermisoActualizarComisionPena=isPermiso;
		this.isPermisoActualizarOriginalComisionPena=isPermiso;
		this.isPermisoEliminarComisionPena=isPermiso;
		this.isPermisoGuardarCambiosComisionPena=isPermiso;
		this.isPermisoConsultaComisionPena=isPermiso;
		this.isPermisoBusquedaComisionPena=isPermiso;
		this.isPermisoReporteComisionPena=isPermiso;
		this.isPermisoOrdenComisionPena=isPermiso;		
		this.isPermisoPaginacionMedioComisionPena=isPermiso;		
		this.isPermisoPaginacionAltoComisionPena=isPermiso;		
		this.isPermisoPaginacionTodoComisionPena=isPermiso;		
		this.isPermisoCopiarComisionPena=isPermiso;		
		this.isPermisoVerFormComisionPena=isPermiso;		
		this.isPermisoDuplicarComisionPena=isPermiso;
		this.isPermisoOrdenComisionPena=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioComisionPena(Boolean isPermiso) {
		//this.isPermisoTodoComisionPena=isPermiso;
		this.isPermisoNuevoComisionPena=isPermiso;
		this.isPermisoActualizarComisionPena=isPermiso;
		this.isPermisoActualizarOriginalComisionPena=isPermiso;
		this.isPermisoEliminarComisionPena=isPermiso;
		this.isPermisoGuardarCambiosComisionPena=isPermiso;
		//this.isPermisoConsultaComisionPena=isPermiso;
		//this.isPermisoBusquedaComisionPena=isPermiso;
		//this.isPermisoReporteComisionPena=isPermiso;
		//this.isPermisoOrdenComisionPena=isPermiso;		
		//this.isPermisoPaginacionMedioComisionPena=isPermiso;		
		//this.isPermisoPaginacionAltoComisionPena=isPermiso;		
		//this.isPermisoPaginacionTodoComisionPena=isPermiso;		
		//this.isPermisoCopiarComisionPena=isPermiso;		
		//this.isPermisoDuplicarComisionPena=isPermiso;
		//this.isPermisoOrdenComisionPena=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioComisionPenaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ComisionPenaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebComisionPena(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioComisionPenaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioComisionPenaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionComisionPenaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioComisionPenaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioComisionPena() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ComisionPenaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ComisionPenaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoComisionPena=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarComisionPena=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalComisionPena=this.isPermisoActualizarComisionPena;
			this.isPermisoEliminarComisionPena=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosComisionPena=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaComisionPena=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaComisionPena=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoComisionPena=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteComisionPena=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComisionPena=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioComisionPena=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoComisionPena=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoComisionPena=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarComisionPena=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormComisionPena=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarComisionPena=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComisionPena=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosComisionPena.setToolTipText(this.jTableDatosComisionPena.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioComisionPena(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioComisionPena(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ComisionPenaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ComisionPenaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioComisionPena() throws Exception {
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
	public void inicializarCombosForeignKeyComisionPenaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.comisionconfigsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyComisionPenaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ComisionPenaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyComisionPenaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyComisionConfigListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyComisionPenaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ComisionPenaParameterReturnGeneral comisionpenaReturnGeneral=new ComisionPenaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.comisionpenaConstantesFunciones.cargarid_empresaComisionPena)
					 || (this.esRecargarFks && this.comisionpenaConstantesFunciones.cargarid_empresaComisionPena)) {

					if(!this.comisionpenaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+comisionpenaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalComisionConfig="";

				if(((this.comisionconfigsForeignKey==null||this.comisionconfigsForeignKey.size()<=0) && this.comisionpenaConstantesFunciones.cargarid_comision_configComisionPena)
					 || (this.esRecargarFks && this.comisionpenaConstantesFunciones.cargarid_comision_configComisionPena)) {

					if(!this.comisionpenaSessionBean.getisBusquedaDesdeForeignKeySesionComisionConfig()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ComisionConfigConstantesFunciones.getArrayColumnasGlobalesComisionConfig(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalComisionConfig=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ComisionConfigConstantesFunciones.TABLENAME);

						finalQueryGlobalComisionConfig=Funciones.GetFinalQueryAppend(finalQueryGlobalComisionConfig, "");
						finalQueryGlobalComisionConfig+=ComisionConfigConstantesFunciones.SFINALQUERY;

						//this.cargarCombosComisionConfigsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalComisionConfig=" WHERE " + ConstantesSql.ID + "="+comisionpenaSessionBean.getlidComisionConfigActual();
					}
				} else {
					finalQueryGlobalComisionConfig="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				comisionpenaReturnGeneral=comisionpenaLogic.cargarCombosLoteForeignKeyComisionPena(finalQueryGlobalEmpresa,finalQueryGlobalComisionConfig);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=comisionpenaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalComisionConfig.equals("NONE")) {
				this.comisionconfigsForeignKey=comisionpenaReturnGeneral.getcomisionconfigsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyComisionPena()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyComisionConfig();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.comisionpenaSessionBean==null) {
				this.comisionpenaSessionBean=new ComisionPenaSessionBean();
			}

			if(!this.comisionpenaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.comisionpenaSessionBean.getisBusquedaDesdeForeignKeySesionComisionConfig()) {
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
	
	public void initActionsCombosTodosForeignKeyComisionPena()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyComisionPena(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyComisionPena()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyComisionPena();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyComisionPena(ComisionPena comisionpena)throws Exception {	
		try {
			
			this.setActualComisionConfigForeignKey(comisionpena.getid_comision_config(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyComisionPena(ComisionPena comisionpena,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyComisionPena()throws Exception {	
		try {
			
			this.setActualComisionConfigForeignKey(this.comisionpenaConstantesFunciones.getid_comision_config(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyComisionPena()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyComisionPena()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyComisionPena()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroComisionPena()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyComisionPena()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameComisionConfigsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyComisionPena(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameComisionConfigsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyComisionPena()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormComisionPena.jComboBoxid_empresaComisionPena!=null && this.jInternalFrameDetalleFormComisionPena.jComboBoxid_empresaComisionPena.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionPena.jComboBoxid_empresaComisionPena.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionPena.jComboBoxid_comision_configComisionPena!=null && this.jInternalFrameDetalleFormComisionPena.jComboBoxid_comision_configComisionPena.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionPena.jComboBoxid_comision_configComisionPena.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public ComisionPenaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ComisionPenaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ComisionPenaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.comisionpenaSessionBean=new ComisionPenaSessionBean(); 
		this.comisionpenaConstantesFunciones=new ComisionPenaConstantesFunciones(); 
		this.comisionpenaBean=new ComisionPena();//(this.comisionpenaConstantesFunciones); 		
		this.comisionpenaReturnGeneral=new ComisionPenaParameterReturnGeneral(); 
		
		this.comisionpenaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionpenaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ComisionPenaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ComisionPenaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ComisionPenaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessComisionPena(true);
			
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
			
			this.comisionpenaConstantesFunciones=new ComisionPenaConstantesFunciones(); 
			this.comisionpenaBean=new ComisionPena();//this.comisionpenaConstantesFunciones); 			
			this.comisionpenaReturnGeneral=new ComisionPenaParameterReturnGeneral(); 
		
			ComisionPenaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Penalidad Comision Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.comisionpena=new ComisionPena();
			this.comisionpenas = new ArrayList<ComisionPena>();
			this.comisionpenasAux = new ArrayList<ComisionPena>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic=new ComisionPenaLogic();
				this.comisionpenaLogic.getNewConnexionToDeep("");
			}
			
			//this.comisionpenaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.comisionpenaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormComisionPena);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoComisionPena!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComisionPena);	
					}
					
					if(this.jInternalFrameImportacionComisionPena!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComisionPena);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByComisionPena!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByComisionPena);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormComisionPena!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormComisionPena);
				this.jInternalFrameDetalleFormComisionPena.setVisible(false);
				this.jInternalFrameDetalleFormComisionPena.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionPena!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComisionPena);
					this.jInternalFrameReporteDinamicoComisionPena.setVisible(false);
					this.jInternalFrameReporteDinamicoComisionPena.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionComisionPena!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionComisionPena);
					this.jInternalFrameImportacionComisionPena.setVisible(false);
					this.jInternalFrameImportacionComisionPena.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByComisionPena!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByComisionPena);
					this.jInternalFrameOrderByComisionPena.setVisible(false);
					this.jInternalFrameOrderByComisionPena.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idComisionPenaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ComisionPenaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.comisionpenaReturnGeneral=new ComisionPenaParameterReturnGeneral();
			
			this.comisionpenaParameterGeneral=new ComisionPenaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.comisionpenaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ComisionPenaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComisionPenaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comisionpenaSessionBean.getEsGuardarRelacionado(),this.comisionpenaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComisionPenaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comisionpenaSessionBean.getEsGuardarRelacionado(),this.comisionpenaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoComisionPena=false;
			this.isVisibilidadCeldaDuplicarComisionPena=true;
			this.isVisibilidadCeldaCopiarComisionPena=true;
			this.isVisibilidadCeldaVerFormComisionPena=true;
			this.isVisibilidadCeldaOrdenComisionPena=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionPena=false;
			this.isVisibilidadCeldaModificarComisionPena=false;
			this.isVisibilidadCeldaActualizarComisionPena=false;
			this.isVisibilidadCeldaEliminarComisionPena=false;
			this.isVisibilidadCeldaCancelarComisionPena=false;
			this.isVisibilidadCeldaGuardarComisionPena=false;
			this.isVisibilidadCeldaGuardarCambiosComisionPena=false;
			
			
			this.isVisibilidadFK_IdComisionConfig=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesComisionPena("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosComisionPena();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioComisionPena(false);
			
			this.setPermisosUsuarioComisionPena();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionpenaSessionBean.getEsGuardarRelacionado() 
				|| (this.comisionpenaSessionBean.getEsGuardarRelacionado() && this.comisionpenaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioComisionPenaClasesRelacionadas();
			}
			
			if(this.comisionpenaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioComisionPenaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ComisionPenaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosComisionPena();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualComisionPena();
			}
			
			if(!this.isPermisoBusquedaComisionPena) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasComisionPena.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioComisionPena,this.isPermisoPaginacionMedioComisionPena,this.isPermisoPaginacionTodoComisionPena);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ComisionPenaConstantesFunciones.getTiposSeleccionarComisionPena());
				
				this.tiposColumnasSelect=ComisionPenaConstantesFunciones.getTiposSeleccionarComisionPena(true);
				
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
			//if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioComisionPena();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioComisionPena(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioComisionPena(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionPena() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				comisionpenaImplementable= (ComisionPenaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComisionPenaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				comisionpenaImplementableHome= (ComisionPenaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComisionPenaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.comisionpenas= new ArrayList<ComisionPena>();
			this.comisionpenasEliminados= new ArrayList<ComisionPena>();
						
			this.isEsNuevoComisionPena=false;
			this.esParaAccionDesdeFormularioComisionPena=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.comisionconfigsForeignKey=new ArrayList<ComisionConfig>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyComisionPena(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroComisionPena();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ComisionPenaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ComisionPenaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesComisionPena("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingComisionPena(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormComisionPena!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioComisionPena();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioComisionPena();
			}
			
			ComisionPenaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasComisionPena.getTabCount(); i++) {
					this.jTabbedPaneBusquedasComisionPena.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasComisionPena.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessComisionPena(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ComisionPena: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectComisionPena() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesComisionPena")) {
				iIndex=this.jInternalFrameDetalleFormComisionPena.jTabbedPaneRelacionesComisionPena.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormComisionPena.jTabbedPaneRelacionesComisionPena.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessComisionPena();	
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
	
	public void cargarCombosForeignKeyComisionPena(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyComisionPena(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyComisionPena(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyComisionPenaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyComisionPena();
		
		this.cargarCombosFrameForeignKeyComisionPena();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyComisionPena();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyComisionPena();
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
	
	public void jButtonNuevoComisionPenaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.comisionpenaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormComisionPena==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
			
			
			if(jTableDatosComisionPena.getRowCount()>=1) {
				jTableDatosComisionPena.removeRowSelectionInterval(0, jTableDatosComisionPena.getRowCount()-1);						
			}
			
			this.isEsNuevoComisionPena=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoComisionPena(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesComisionPena(true);			
			//this.comisionpena=new ComisionPena();
			//this.comisionpena.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionPena(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionPena() ;
			
			if(ComisionPenaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionPena(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.comisionpena);	
			this.actualizarInformacion("INFO_PADRE",false,this.comisionpena);				
			
			ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
			
			if(this.comisionpenaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ComisionPena: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarComisionPenaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ComisionPena> comisionpenasSeleccionados=new ArrayList<ComisionPena>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosComisionPena.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosComisionPena.getSelectedRows().length;			
			}
			
			comisionpenasSeleccionados=this.getComisionPenasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoComisionPena--;			
				//ComisionPena comisionpenaAux= new ComisionPena();			
				//comisionpenaAux.setId(this.iIdNuevoComisionPena);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ComisionPena comisionpenaOrigen=new ComisionPena();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ComisionPena comisionpenaOrigen : comisionpenasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							comisionpenaOrigen =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionpenaOrigen =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaComisionPena();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.comisionpena.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosComisionPena(comisionpenaOrigen,this.comisionpena,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comisionpenaLogic.getComisionPenas().add(this.comisionpenaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comisionpenas.add(this.comisionpenaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaComisionPena(false);
				
				this.jTableDatosComisionPena.setRowSelectionInterval(this.getIndiceNuevoComisionPena(), this.getIndiceNuevoComisionPena());
				
				int iLastRow =  this.jTableDatosComisionPena.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComisionPena.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComisionPena.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionPena(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarComisionPenaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ComisionPena> comisionpenasSeleccionados=new ArrayList<ComisionPena>();									
		
			ComisionPena comisionpenaOrigen=new ComisionPena();
			ComisionPena comisionpenaDestino=new ComisionPena();
				
			comisionpenasSeleccionados=this.getComisionPenasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosComisionPena.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || comisionpenasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosComisionPena.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionpenaOrigen =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comisionpenaOrigen =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionpenaDestino =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comisionpenaDestino =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				comisionpenaOrigen =comisionpenasSeleccionados.get(0);
				comisionpenaDestino =comisionpenasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosComisionPena(comisionpenaOrigen,comisionpenaDestino,true,false);
				
				comisionpenaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comisionpenaDestino,comisionpenaLogic.getComisionPenas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionpenaDestino,comisionpenas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaComisionPena(false);
				
				//this.jTableDatosComisionPena.setRowSelectionInterval(this.getIndiceNuevoComisionPena(), this.getIndiceNuevoComisionPena());
				
				int iLastRow =  this.jTableDatosComisionPena.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComisionPena.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComisionPena.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionPena(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormComisionPenaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComisionPena==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormComisionPena.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarComisionPenaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesComisionPena.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasComisionPena.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesComisionPena.setVisible(!isVisible);
			this.jPanelPaginacionComisionPena.setVisible(!isVisible);
			this.jPanelAccionesComisionPena.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarComisionPenaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameComisionPena();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoComisionPenaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoComisionPena();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionComisionPenaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionComisionPena();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByComisionPenaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByComisionPena();
			
			this.abrirFrameOrderByComisionPena();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByComisionPenaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByComisionPena();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleComisionPena(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormComisionPena);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormComisionPena.isMaximum()) {
					this.jInternalFrameDetalleFormComisionPena.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormComisionPena.setSize(this.jInternalFrameDetalleFormComisionPena.iWidthFormulario,this.jInternalFrameDetalleFormComisionPena.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormComisionPena.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormComisionPena.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormComisionPena.isMaximum()) {
						this.jInternalFrameDetalleFormComisionPena.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormComisionPena.jContentPaneDetalleComisionPena.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormComisionPena.jTabbedPaneRelacionesComisionPena.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormComisionPena.jContentPaneDetalleComisionPena.getWidth(),ComisionPenaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComisionPena.jTabbedPaneRelacionesComisionPena.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormComisionPena.jContentPaneDetalleComisionPena.getWidth(),ComisionPenaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComisionPena.jTabbedPaneRelacionesComisionPena.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormComisionPena.jContentPaneDetalleComisionPena.getWidth(),ComisionPenaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormComisionPena.setVisible(true);
	        this.jInternalFrameDetalleFormComisionPena.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByComisionPena() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByComisionPena==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByComisionPena=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionPena,false,this);
				} else {
					this.jInternalFrameOrderByComisionPena=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionPena,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByComisionPena);
				this.jInternalFrameOrderByComisionPena.setVisible(false);
				this.jInternalFrameOrderByComisionPena.setSelected(false);
				
				this.jInternalFrameOrderByComisionPena.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComisionPena"));
				
				this.inicializarActualizarBindingTablaOrderByComisionPena();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionComisionPena() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionComisionPena==null) {
				
				this.jInternalFrameImportacionComisionPena=new ImportacionJInternalFrame(ComisionPenaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComisionPena);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionComisionPena);
				this.jInternalFrameImportacionComisionPena.setVisible(false);
				this.jInternalFrameImportacionComisionPena.setSelected(false);


				this.jInternalFrameImportacionComisionPena.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComisionPena"));
				this.jInternalFrameImportacionComisionPena.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComisionPena"));
				this.jInternalFrameImportacionComisionPena.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComisionPena"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoComisionPena() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoComisionPena==null) {
				this.jInternalFrameReporteDinamicoComisionPena=new ReporteDinamicoJInternalFrame(ComisionPenaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComisionPena);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComisionPena);
				this.jInternalFrameReporteDinamicoComisionPena.setVisible(false);
				this.jInternalFrameReporteDinamicoComisionPena.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoComisionPena.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionPena"));
				this.jInternalFrameReporteDinamicoComisionPena.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionPena"));
				this.jInternalFrameReporteDinamicoComisionPena.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionPena"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionPena();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleComisionPena() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormComisionPena);
			
	       	this.jInternalFrameDetalleFormComisionPena.setVisible(false);
	        this.jInternalFrameDetalleFormComisionPena.setSelected(false);
			
			//this.jInternalFrameDetalleFormComisionPena.dispose();
			//this.jInternalFrameDetalleFormComisionPena=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoComisionPena() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoComisionPena.setVisible(true);
	        this.jInternalFrameReporteDinamicoComisionPena.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionComisionPena() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionComisionPena.setVisible(true);
	        this.jInternalFrameImportacionComisionPena.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByComisionPena() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByComisionPena.setVisible(true);
	        this.jInternalFrameOrderByComisionPena.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByComisionPena() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByComisionPena.setVisible(false);
	        this.jInternalFrameOrderByComisionPena.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoComisionPena() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoComisionPena.setVisible(false);
	        this.jInternalFrameReporteDinamicoComisionPena.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionComisionPena() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionComisionPena.setVisible(false);
	        this.jInternalFrameImportacionComisionPena.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarComisionPenaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarComisionPena(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarComisionPena(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesComisionPena(true);
			//this.isEsNuevoComisionPena=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesComisionPena("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionPena(false) ;
			
			if(comisionpenaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ComisionPenaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionPena(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionPena(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaComisionPenaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarComisionPena(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComisionPena==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesComisionPena(true);
			//this.isEsNuevoComisionPena=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.comisionpena.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesComisionPena("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesComisionPena(false) ;
			
			if(ComisionPenaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionPena(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionPena(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaComisionConfig(List<ComisionConfig> comisionconfigsForeignKey)throws Exception{
		TableColumn tableColumnComisionConfig=this.jTableDatosComisionPena.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionPena,ComisionPenaConstantesFunciones.LABEL_IDCOMISIONCONFIG));
		TableCellEditor tableCellEditorComisionConfig =tableColumnComisionConfig.getCellEditor();

		ComisionConfigTableCell comisionconfigTableCellFk=(ComisionConfigTableCell)tableCellEditorComisionConfig;

		if(comisionconfigTableCellFk!=null) {
			comisionconfigTableCellFk.setcomisionconfigsForeignKey(comisionconfigsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionPena.getSelectedRow();

		//if(intSelectedRow<=0) {
			//comisionconfigTableCellFk.setRowActual(intSelectedRow);
			//comisionconfigTableCellFk.setcomisionconfigsForeignKeyActual(comisionconfigsForeignKey);
		//}


		if(comisionconfigTableCellFk!=null) {
			comisionconfigTableCellFk.RecargarComisionConfigsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarComisionPenaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesComisionPena(false);
			
			//if(!this.isEsNuevoComisionPena) {								
				int intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ComisionPenaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualComisionPena(this.comisionpena,true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
				
			}
			
			if(this.permiteMantenimiento(this.comisionpena)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoComisionPena=true;
					this.inicializarActualizarBindingTablaComisionPena(false);
					this.isEsNuevoComisionPena=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoComisionPena=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoComisionPena=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComisionPena(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionPena(false);
				
				this.habilitarDeshabilitarControlesComisionPena(false);
			
												
				
				if(ComisionPenaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleComisionPena();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoComisionPenaActionPerformed(evt,comisionpenaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualComisionPena(this.comisionpena,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosComisionPena.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,comisionpenaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.comisionpena.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ComisionPena.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionPena.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarComisionPenaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				this.comisionpena.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				this.comisionpena.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.comisionpena)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ComisionPenaModel) this.jTableDatosComisionPena.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoComisionPena=true;
				this.inicializarActualizarBindingTablaComisionPena(false);
				this.isEsNuevoComisionPena=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComisionPena(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionPena(false);
				
				this.habilitarDeshabilitarControlesComisionPena(false);
				
				
				
				if(ComisionPenaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleComisionPena();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarComisionPenaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosComisionPena.getRowCount()>=1) {
				jTableDatosComisionPena.removeRowSelectionInterval(0, jTableDatosComisionPena.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesComisionPena(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaComisionPena(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionPena(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionPena(false) ;
			
			this.isEsNuevoComisionPena=false;
			
			if(ComisionPenaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleComisionPena();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosComisionPenaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingComisionPena(false);
				
				//SI ES MANUAL
				if(ComisionPenaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualComisionPena();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosComisionPenaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoComisionPena--;			
			//ComisionPena comisionpenaAux= new ComisionPena();			
			//comisionpenaAux.setId(this.iIdNuevoComisionPena);
			
			if(this.jInternalFrameDetalleFormComisionPena==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaComisionPena();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
			
			this.comisionpena.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.comisionpenaLogic.getComisionPenas().add(this.comisionpenaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.comisionpenas.add(this.comisionpenaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaComisionPena(false);
			
			this.jTableDatosComisionPena.setRowSelectionInterval(this.getIndiceNuevoComisionPena(), this.getIndiceNuevoComisionPena());
			
			int iLastRow =  this.jTableDatosComisionPena.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosComisionPena.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosComisionPena.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaComisionPena(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionComisionPenaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingComisionPena(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionPena(false);
			
			//SI ES MANUAL
			if(ComisionPenaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionPena();
			}
			
			//this.abrirFrameTreeComisionPena();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionComisionPenaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Penalidad ComisionS ?", "MANTENIMIENTO DE Penalidad Comision", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionComisionPena.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralComisionPena();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.comisionpenaReturnGeneral=comisionpenaLogic.procesarImportacionComisionPenasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.comisionpenaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarComisionPenaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionComisionPenaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionComisionPena.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionComisionPena.setFileImportacion(this.jInternalFrameImportacionComisionPena.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionComisionPena.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionComisionPena.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionComisionPena.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionComisionPena.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoComisionPenaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ComisionPena> comisionpenasSeleccionados=new ArrayList<ComisionPena>();		

		comisionpenasSeleccionados=this.getComisionPenasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ComisionPenaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ComisionPenaBaseDesign.jrxml";
			
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
			
			this.generarReporteComisionPenas("Todos",comisionpenasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionpenaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Penalidad Comision",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoComisionPena.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionPena.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComisionPenaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionPenaConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ComisionConfig_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ComisionConfig_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ComisionConfig_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ComisionConfig_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mDiasInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mDiasInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mDiasInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mDiasInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mDiasFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mDiasFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mDiasFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mDiasFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionPenaConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionPenaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoComisionPena.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ComisionPenaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ComisionPenaConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					sNombreCampoCategoria="id_comision_config";
					break;

				case ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO:
					sNombreCampoCategoria="num_dias_inicio";
					break;

				case ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN:
					sNombreCampoCategoria="num_dias_fin";
					break;

				case ComisionPenaConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case ComisionPenaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ComisionPenaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ComisionPenaConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					sNombreCampoCategoriaValor="id_comision_config";
					break;

				case ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO:
					sNombreCampoCategoriaValor="num_dias_inicio";
					break;

				case ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN:
					sNombreCampoCategoriaValor="num_dias_fin";
					break;

				case ComisionPenaConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case ComisionPenaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoComisionPena.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionPena.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComisionPenaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ComisionPenaConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Configuracion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_comision_config");
					break;

				case ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Num Dias Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"num_dias_inicio");
					break;

				case ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Num Dias Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"num_dias_fin");
					break;

				case ComisionPenaConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case ComisionPenaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoComisionPenaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ComisionPena> comisionpenasSeleccionados=new ArrayList<ComisionPena>();		
		
		comisionpenasSeleccionados=this.getComisionPenasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionpena";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ComisionPenas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoComisionPena.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionPena.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ComisionPenaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ComisionPena comisionpena:comisionpenasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionpena.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionPenaConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_IDCOMISIONCONFIG);
					iRow++;

					for(ComisionPena comisionpena:comisionpenasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionpena.getcomisionconfig_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO);
					iRow++;

					for(ComisionPena comisionpena:comisionpenasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionpena.getnum_dias_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN);
					iRow++;

					for(ComisionPena comisionpena:comisionpenasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionpena.getnum_dias_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionPenaConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(ComisionPena comisionpena:comisionpenasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionpena.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionPenaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ComisionPena comisionpena:comisionpenasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionpena.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelComisionPena(row);				
			//	iRow++;
			//}				
			
			//for(ComisionPena comisionpenaAux:comisionpenasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelComisionPena(comisionpenaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionpenaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Penalidad Comision",JOptionPane.INFORMATION_MESSAGE);
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
				this.comisionpenaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionPena(false);
			
			//SI ES MANUAL
			if(ComisionPenaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionPena();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresComisionPenaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionPena(false);
			
			//SI ES MANUAL
			if(ComisionPenaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComisionPena();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesComisionPenaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionPena(false);
			
			//SI ES MANUAL
			if(ComisionPenaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComisionPena();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaComisionPena() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosComisionPena.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosComisionPena.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosComisionPena.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosComisionPena.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosComisionPena.setMinimumSize(dimensionMinimum);
		this.jTableDatosComisionPena.setMaximumSize(dimensionMaximum);
		this.jTableDatosComisionPena.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingComisionPena(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingComisionPena(esInicializar,true);
	}
	
	public void inicializarActualizarBindingComisionPena(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaComisionPena(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesComisionPena(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasComisionPena(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionPena(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesComisionPena(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ComisionPenaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ComisionPenaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualComisionPena() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaComisionPena();
		
		this.inicializarActualizarBindingBotonesManualComisionPena(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualComisionPena();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionPena() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualComisionPena(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualComisionPena(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosComisionPena.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosComisionPena.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteComisionPena.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormComisionPena!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormComisionPena.jCheckBoxPostAccionNuevoComisionPena.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormComisionPena.jCheckBoxPostAccionSinCerrarComisionPena.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormComisionPena.jCheckBoxPostAccionSinMensajeComisionPena.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosComisionPena.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosComisionPena.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteComisionPena.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormComisionPena!=null) {
				this.jInternalFrameDetalleFormComisionPena.jCheckBoxPostAccionNuevoComisionPena.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormComisionPena.jCheckBoxPostAccionSinCerrarComisionPena.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormComisionPena.jCheckBoxPostAccionSinMensajeComisionPena.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionComisionPena.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionComisionPena.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormComisionPena!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormComisionPena.jComboBoxTiposAccionesFormularioComisionPena.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesComisionPena.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoComisionPena!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesComisionPena.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesComisionPena.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarComisionPena.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesComisionPena.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoComisionPena!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesComisionPena.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralComisionPena.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesComisionPena(Boolean esInicializar) throws Exception {
		try	{	
			if(ComisionPenaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualComisionPena(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesComisionPena() throws Exception {
		try	{
			if(ComisionPenaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualComisionPena();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComisionPena() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormComisionPena.jComboBoxTiposAccionesFormularioComisionPena.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormComisionPena.jComboBoxTiposAccionesFormularioComisionPena.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualComisionPena() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesComisionPena.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesComisionPena.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesComisionPena.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesComisionPena.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesComisionPena.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesComisionPena.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionComisionPena.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionComisionPena.addItem(reporte);
			}
			
			
			if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionComisionPena.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionComisionPena.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesComisionPena.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesComisionPena.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesComisionPena.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesComisionPena.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormComisionPena.jComboBoxTiposAccionesFormularioComisionPena.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormComisionPena.jComboBoxTiposAccionesFormularioComisionPena.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarComisionPena.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarComisionPena.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarComisionPena.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionPena();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionPena() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComisionPena!=null) {
				this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComisionPena!=null) {
				this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoComisionPena!=null) {
				
				if(this.jInternalFrameReporteDinamicoComisionPena.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComisionPena.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionPena.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoComisionPena.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComisionPena.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionPena.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ComisionPenaConstantesFunciones.getTiposSeleccionarComisionPena(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ComisionPenaConstantesFunciones.getTiposSeleccionarComisionPena(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoComisionPena.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComisionPena.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ComisionPenaConstantesFunciones.getTiposSeleccionarComisionPena(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionPena.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoComisionPena.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualComisionPena()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_comision_configFK_IdComisionConfigComisionPena.getSelectedItem()!=null){this.id_comision_configFK_IdComisionConfig=((ComisionConfig)this.jComboBoxid_comision_configFK_IdComisionConfigComisionPena.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasComisionPena(Boolean esInicializar) throws Exception {				
		if(ComisionPenaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualComisionPena();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaComisionPena() throws Exception {
		this.inicializarActualizarBindingTablaComisionPena(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByComisionPena() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByComisionPena.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByComisionPena.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionPena.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ComisionPenaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByComisionPena.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionPena.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ComisionPenaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosComisionPenaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionPenaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ComisionPenaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByComisionPena.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionPena.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ComisionPenaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByComisionPena.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaComisionPena(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=comisionpenaLogic.getComisionPenas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=comisionpenas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ComisionPenaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosComisionPena.setModel(new ComisionPenaModel(this.comisionpenaLogic.getComisionPenas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosComisionPena.setModel(new ComisionPenaModel(this.comisionpenas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByComisionPena!=null && this.jInternalFrameOrderByComisionPena.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByComisionPena();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosComisionPena.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionPena,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ComisionPenaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO,comisionpenaConstantesFunciones.resaltarSeleccionarComisionPena,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO,comisionpenaConstantesFunciones.resaltarSeleccionarComisionPena,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosComisionPena.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionPena,ComisionPenaConstantesFunciones.LABEL_ID));

		if(this.comisionpenaConstantesFunciones.mostraridComisionPena && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionPenaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisionpenaConstantesFunciones.resaltaridComisionPena,this.comisionpenaConstantesFunciones.activaridComisionPena,iSizeTabla,this,true,"idComisionPena","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionpenaConstantesFunciones.resaltaridComisionPena,this.comisionpenaConstantesFunciones.activaridComisionPena,this,true,"idComisionPena","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionPena.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionPena,ComisionPenaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.comisionpenaConstantesFunciones.mostrarid_empresaComisionPena && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionPenaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.comisionpenaConstantesFunciones.resaltarid_empresaComisionPena,this,this.comisionpenaConstantesFunciones.activarid_empresaComisionPena,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.comisionpenaConstantesFunciones.resaltarid_empresaComisionPena,this,this.comisionpenaConstantesFunciones.activarid_empresaComisionPena,false,"id_empresaComisionPena","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionPenaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionPena.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionPena,ComisionPenaConstantesFunciones.LABEL_IDCOMISIONCONFIG));

		if(this.comisionpenaConstantesFunciones.mostrarid_comision_configComisionPena && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionPenaConstantesFunciones.LABEL_IDCOMISIONCONFIG,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ComisionConfigTableCell(this.comisionconfigsForeignKey,this.comisionpenaConstantesFunciones.resaltarid_comision_configComisionPena,this,this.comisionpenaConstantesFunciones.activarid_comision_configComisionPena,iSizeTabla));
			tableColumn.setCellEditor(new ComisionConfigTableCell(this.comisionconfigsForeignKey,this.comisionpenaConstantesFunciones.resaltarid_comision_configComisionPena,this,this.comisionpenaConstantesFunciones.activarid_comision_configComisionPena,true,"id_comision_configComisionPena","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionPenaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionPena.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionPena,ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO));

		if(this.comisionpenaConstantesFunciones.mostrarnum_dias_inicioComisionPena && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisionpenaConstantesFunciones.resaltarnum_dias_inicioComisionPena,this.comisionpenaConstantesFunciones.activarnum_dias_inicioComisionPena,iSizeTabla,this,true,"num_dias_inicioComisionPena","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionpenaConstantesFunciones.resaltarnum_dias_inicioComisionPena,this.comisionpenaConstantesFunciones.activarnum_dias_inicioComisionPena,this,true,"num_dias_inicioComisionPena","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionPenaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionPena.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionPena,ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN));

		if(this.comisionpenaConstantesFunciones.mostrarnum_dias_finComisionPena && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisionpenaConstantesFunciones.resaltarnum_dias_finComisionPena,this.comisionpenaConstantesFunciones.activarnum_dias_finComisionPena,iSizeTabla,this,true,"num_dias_finComisionPena","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionpenaConstantesFunciones.resaltarnum_dias_finComisionPena,this.comisionpenaConstantesFunciones.activarnum_dias_finComisionPena,this,true,"num_dias_finComisionPena","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionPenaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionPena.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionPena,ComisionPenaConstantesFunciones.LABEL_PORCENTAJE));

		if(this.comisionpenaConstantesFunciones.mostrarporcentajeComisionPena && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionPenaConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisionpenaConstantesFunciones.resaltarporcentajeComisionPena,this.comisionpenaConstantesFunciones.activarporcentajeComisionPena,iSizeTabla,this,true,"porcentajeComisionPena","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionpenaConstantesFunciones.resaltarporcentajeComisionPena,this.comisionpenaConstantesFunciones.activarporcentajeComisionPena,this,true,"porcentajeComisionPena","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionPenaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionPena.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionPena,ComisionPenaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.comisionpenaConstantesFunciones.mostrardescripcionComisionPena && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionPenaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comisionpenaConstantesFunciones.resaltardescripcionComisionPena,this.comisionpenaConstantesFunciones.activardescripcionComisionPena,iSizeTabla,this,true,"descripcionComisionPena","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionpenaConstantesFunciones.resaltardescripcionComisionPena,this.comisionpenaConstantesFunciones.activardescripcionComisionPena,this,true,"descripcionComisionPena","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionPenaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comisionpenaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comisionpenaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComisionPena.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comisionpenaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comisionpenaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComisionPena.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarComisionPena && this.isPermisoGuardarCambiosComisionPena) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.comisionpenaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.comisionpenaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosComisionPena.addColumn(tableColumn);
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
			
			this.jTableDatosComisionPena.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComisionPena && this.isPermisoGuardarCambiosComisionPena) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComisionPena && this.isPermisoGuardarCambiosComisionPena) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosComisionPena.moveColumn(this.jTableDatosComisionPena.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosComisionPena.moveColumn(this.jTableDatosComisionPena.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosComisionPena.moveColumn(this.jTableDatosComisionPena.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosComisionPena.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosComisionPena.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosComisionPena,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ComisionPenaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosComisionPena.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosComisionPena.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ComisionPenaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ComisionPenaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosComisionPena.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosComisionPena.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosComisionPena.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=comisionpenaLogic.getComisionPenas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=comisionpenas.size()-1;
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
		//this.jTableDatosComisionPena.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosComisionPena.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosComisionPena();
			
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
				
				//this.isEsNuevoComisionPena=false;
					
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
			
				if(this.comisionpenaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormComisionPena==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComisionPena.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComisionPena.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.comisionpena.getsType().equals("DUPLICADO")
				   || this.comisionpena.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoComisionPena=true;
				
				} else {
					this.isEsNuevoComisionPena=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
					if(this.comisionpena.getId()>=0 && !this.comisionpena.getIsNew()) {						
						this.isEsNuevoComisionPena=false;
						
					} else {
						this.isEsNuevoComisionPena=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoComisionPena(esRelaciones);						
				
				this.seleccionarComisionPena(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.comisionpena.getId()<0) {
					this.isEsNuevoComisionPena=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarComisionPena(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarComisionPena(evt,rowIndex);
				}	
				
				if(this.comisionpenaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ComisionPena: " + this.dDif); 
					}
				}								
				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarComisionPena(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.comisionpena)) {
					if(this.comisionpena.getId()>0) {
						this.comisionpena.setIsDeleted(true);
						
						this.comisionpenasEliminados.add(this.comisionpena);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comisionpenaLogic.getComisionPenas().remove(this.comisionpena);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comisionpenas.remove(this.comisionpena);				
					}
					
					
					((ComisionPenaModel) this.jTableDatosComisionPena.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionPena(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarComisionPena(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoComisionPena) {
			
			if(this.jInternalFrameDetalleFormComisionPena==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComisionPena.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComisionPena.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ComisionPenaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioComisionPena(this.comisionpena);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.comisionpenaConstantesFunciones.cargarid_empresaComisionPena || this.comisionpenaConstantesFunciones.event_dependid_empresaComisionPena) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.comisionpena.getid_empresa());
									//this.inicializarActualizarBindingComisionPena(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(comisionpena.getEmpresa()!=null) {
							this.empresasForeignKey.add(comisionpena.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.comisionpena.getid_empresa(),false,"Formulario");

					//ComisionConfig
					if(!this.comisionpenaConstantesFunciones.cargarid_comision_configComisionPena || this.comisionpenaConstantesFunciones.event_dependid_comision_configComisionPena) {
						//this.cargarCombosComisionConfigsForeignKeyLista(" where id="+this.comisionpena.getid_comision_config());
									//this.inicializarActualizarBindingComisionPena(false,false);
						this.comisionconfigsForeignKey=new ArrayList<ComisionConfig>();

						if(comisionpena.getComisionConfig()!=null) {
							this.comisionconfigsForeignKey.add(comisionpena.getComisionConfig());
						}

						this.addItemDefectoCombosForeignKeyComisionConfig();
						this.cargarCombosFrameComisionConfigsForeignKey("Todos");
					}
					this.setActualComisionConfigForeignKey(this.comisionpena.getid_comision_config(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesComisionPena("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesComisionPena(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionPena() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoComisionPena(ComisionPena comisionpena) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoComisionPena(comisionpena,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoComisionPena(ComisionPena comisionpena,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioComisionPena(comisionpena);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyComisionPena(comisionpena,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyComisionPena(comisionpena);
	}
	
	public void setVariablesObjetoActualToFormularioComisionPena(ComisionPena comisionpena) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormComisionPena==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormComisionPena.jLabelidComisionPena.setText(comisionpena.getId().toString());
			this.jInternalFrameDetalleFormComisionPena.jTextFieldnum_dias_inicioComisionPena.setText(comisionpena.getnum_dias_inicio().toString());
			this.jInternalFrameDetalleFormComisionPena.jTextFieldnum_dias_finComisionPena.setText(comisionpena.getnum_dias_fin().toString());
			this.jInternalFrameDetalleFormComisionPena.jTextFieldporcentajeComisionPena.setText(comisionpena.getporcentaje().toString());
			this.jInternalFrameDetalleFormComisionPena.jTextAreadescripcionComisionPena.setText(comisionpena.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ComisionPena comisionpenaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,comisionpenaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ComisionPena comisionpenaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				comisionpenaLocal=this.comisionpena;
			} else {
				comisionpenaLocal=this.comisionpenaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(comisionpenaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoComisionPena(comisionpenaLocal,true);
					
					if(comisionpenaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(comisionpenaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(comisionpenaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoComisionPena(ComisionPena comisionpena,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComisionPena(comisionpena,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(comisionpena);
	}
	
	public void setVariablesFormularioToObjetoActualComisionPena(ComisionPena comisionpena,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComisionPena(comisionpena,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualComisionPena(ComisionPena comisionpena,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormComisionPena==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormComisionPena.jLabelidComisionPena.getText()==null || this.jInternalFrameDetalleFormComisionPena.jLabelidComisionPena.getText()=="" || this.jInternalFrameDetalleFormComisionPena.jLabelidComisionPena.getText()=="Id") {
				this.jInternalFrameDetalleFormComisionPena.jLabelidComisionPena.setText("0");
			}

			if(conColumnasBase) {comisionpena.setId(Long.parseLong(this.jInternalFrameDetalleFormComisionPena.jLabelidComisionPena.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionPenaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionPena.jLabelIdComisionPena,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionpena.setnum_dias_inicio(Integer.parseInt(this.jInternalFrameDetalleFormComisionPena.jTextFieldnum_dias_inicioComisionPena.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionPena.jLabelnum_dias_inicioComisionPena,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionpena.setnum_dias_fin(Integer.parseInt(this.jInternalFrameDetalleFormComisionPena.jTextFieldnum_dias_finComisionPena.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionPena.jLabelnum_dias_finComisionPena,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionpena.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormComisionPena.jTextFieldporcentajeComisionPena.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionPenaConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionPena.jLabelporcentajeComisionPena,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionpena.setdescripcion(this.jInternalFrameDetalleFormComisionPena.jTextAreadescripcionComisionPena.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionPenaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionPena.jLabeldescripcionComisionPena,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComisionPena(ComisionPena comisionpenaBean,ComisionPena comisionpena,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && comisionpenaBean.getid_comision_config()!=null && !comisionpenaBean.getid_comision_config().equals(-1L))) {comisionpena.setid_comision_config(comisionpenaBean.getid_comision_config());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosComisionPena(ComisionPena comisionpenaOrigen,ComisionPena comisionpena,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comisionpenaOrigen.getId()!=null && !comisionpenaOrigen.getId().equals(0L))) {comisionpena.setId(comisionpenaOrigen.getId());}}
			if(conDefault || (!conDefault && comisionpenaOrigen.getid_comision_config()!=null && !comisionpenaOrigen.getid_comision_config().equals(-1L))) {comisionpena.setid_comision_config(comisionpenaOrigen.getid_comision_config());}
			if(conDefault || (!conDefault && comisionpenaOrigen.getnum_dias_inicio()!=null && !comisionpenaOrigen.getnum_dias_inicio().equals(0))) {comisionpena.setnum_dias_inicio(comisionpenaOrigen.getnum_dias_inicio());}
			if(conDefault || (!conDefault && comisionpenaOrigen.getnum_dias_fin()!=null && !comisionpenaOrigen.getnum_dias_fin().equals(0))) {comisionpena.setnum_dias_fin(comisionpenaOrigen.getnum_dias_fin());}
			if(conDefault || (!conDefault && comisionpenaOrigen.getporcentaje()!=null && !comisionpenaOrigen.getporcentaje().equals(0.0))) {comisionpena.setporcentaje(comisionpenaOrigen.getporcentaje());}
			if(conDefault || (!conDefault && comisionpenaOrigen.getdescripcion()!=null && !comisionpenaOrigen.getdescripcion().equals(""))) {comisionpena.setdescripcion(comisionpenaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComisionPena(ComisionPena comisionpena) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComisionPena.jLabelidComisionPena.setText(comisionpena.getId().toString());
			this.jInternalFrameDetalleFormComisionPena.jTextFieldnum_dias_inicioComisionPena.setText(comisionpena.getnum_dias_inicio().toString());
			this.jInternalFrameDetalleFormComisionPena.jTextFieldnum_dias_finComisionPena.setText(comisionpena.getnum_dias_fin().toString());
			this.jInternalFrameDetalleFormComisionPena.jTextFieldporcentajeComisionPena.setText(comisionpena.getporcentaje().toString());
			this.jInternalFrameDetalleFormComisionPena.jTextAreadescripcionComisionPena.setText(comisionpena.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComisionPena(ComisionPenaBean comisionpenaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComisionPena.jLabelidComisionPena.setText(comisionpenaBean.getId().toString());
			this.jInternalFrameDetalleFormComisionPena.jTextFieldnum_dias_inicioComisionPena.setText(comisionpenaBean.getnum_dias_inicio().toString());
			this.jInternalFrameDetalleFormComisionPena.jTextFieldnum_dias_finComisionPena.setText(comisionpenaBean.getnum_dias_fin().toString());
			this.jInternalFrameDetalleFormComisionPena.jTextFieldporcentajeComisionPena.setText(comisionpenaBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormComisionPena.jTextAreadescripcionComisionPena.setText(comisionpenaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanComisionPena(ComisionPenaParameterReturnGeneral comisionpenaReturnGeneral,ComisionPenaBean comisionpenaBean,Boolean conDefault) throws Exception { 
		try {
			ComisionPena comisionpenaLocal=new ComisionPena();
			
			comisionpenaLocal=comisionpenaReturnGeneral.getComisionPena();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comisionpenaLocal.getId()!=null && !comisionpenaLocal.getId().equals(0L))) {comisionpenaBean.setId(comisionpenaLocal.getId());}}
			if(conDefault || (!conDefault && comisionpenaLocal.getid_comision_config()!=null && !comisionpenaLocal.getid_comision_config().equals(-1L))) {comisionpenaBean.setid_comision_config(comisionpenaLocal.getid_comision_config());}
			if(conDefault || (!conDefault && comisionpenaLocal.getnum_dias_inicio()!=null && !comisionpenaLocal.getnum_dias_inicio().equals(0))) {comisionpenaBean.setnum_dias_inicio(comisionpenaLocal.getnum_dias_inicio());}
			if(conDefault || (!conDefault && comisionpenaLocal.getnum_dias_fin()!=null && !comisionpenaLocal.getnum_dias_fin().equals(0))) {comisionpenaBean.setnum_dias_fin(comisionpenaLocal.getnum_dias_fin());}
			if(conDefault || (!conDefault && comisionpenaLocal.getporcentaje()!=null && !comisionpenaLocal.getporcentaje().equals(0.0))) {comisionpenaBean.setporcentaje(comisionpenaLocal.getporcentaje());}
			if(conDefault || (!conDefault && comisionpenaLocal.getdescripcion()!=null && !comisionpenaLocal.getdescripcion().equals(""))) {comisionpenaBean.setdescripcion(comisionpenaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxComisionPenaGenerico(Long idComisionPenaSeleccionado,JComboBox jComboBoxComisionPena,List<ComisionPena> comisionpenasLocal)throws Exception {
		try {
			ComisionPena  comisionpenaTemp=null;

			for(ComisionPena comisionpenaAux:comisionpenasLocal) {
				if(comisionpenaAux.getId()!=null && comisionpenaAux.getId().equals(idComisionPenaSeleccionado)) {
					comisionpenaTemp=comisionpenaAux;
					break;
				}
			}

			jComboBoxComisionPena.setSelectedItem(comisionpenaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxComisionPenaGenerico(JComboBox jComboBoxComisionPena,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxComisionPena.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComisionPena.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxComisionPena.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComisionPena.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComisionPena.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxComisionPena.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComisionPena.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxComisionPena.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxComisionPena.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxComisionPena.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisionpena=(ComisionPena) comisionpenaLogic.getComisionPenas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comisionpena =(ComisionPena) comisionpenas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!comisionpena.getIsNew() && !comisionpena.getIsChanged() && !comisionpena.getIsDeleted()) {
				sDescripcion=comisionpena.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=comisionpena.getempresa_descripcion();
			}
		}

		if(sTipo.equals("ComisionConfig")) {
			//sDescripcion=this.getActualComisionConfigForeignKeyDescripcion((Long)value);
			if(!comisionpena.getIsNew() && !comisionpena.getIsChanged() && !comisionpena.getIsDeleted()) {
				sDescripcion=comisionpena.getcomisionconfig_descripcion();
			} else {
				//sDescripcion=this.getActualComisionConfigForeignKeyDescripcion((Long)value);
				sDescripcion=comisionpena.getcomisionconfig_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ComisionPena comisionpenaRow=new ComisionPena();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisionpenaRow=(ComisionPena) comisionpenaLogic.getComisionPenas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comisionpenaRow=(ComisionPena) comisionpenas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualComisionPena(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoComisionPena.setVisible((this.isVisibilidadCeldaNuevoComisionPena && this.isPermisoNuevoComisionPena));			
			this.jButtonDuplicarComisionPena.setVisible((this.isVisibilidadCeldaDuplicarComisionPena && this.isPermisoDuplicarComisionPena));			
			this.jButtonCopiarComisionPena.setVisible((this.isVisibilidadCeldaCopiarComisionPena && this.isPermisoCopiarComisionPena));
			this.jButtonVerFormComisionPena.setVisible((this.isVisibilidadCeldaVerFormComisionPena && this.isPermisoVerFormComisionPena));
			
			this.jButtonAbrirOrderByComisionPena.setVisible((this.isVisibilidadCeldaOrdenComisionPena && this.isPermisoOrdenComisionPena));			
			
			this.jButtonNuevoRelacionesComisionPena.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionPena && this.isPermisoNuevoComisionPena));			
			this.jButtonNuevoGuardarCambiosComisionPena.setVisible((this.isVisibilidadCeldaNuevoComisionPena && this.isPermisoNuevoComisionPena && this.isPermisoGuardarCambiosComisionPena));
			
			if(this.jInternalFrameDetalleFormComisionPena!=null) {
			this.jInternalFrameDetalleFormComisionPena.jButtonModificarComisionPena.setVisible((this.isVisibilidadCeldaModificarComisionPena && this.isPermisoActualizarComisionPena));	
			this.jInternalFrameDetalleFormComisionPena.jButtonActualizarComisionPena.setVisible((this.isVisibilidadCeldaActualizarComisionPena && this.isPermisoActualizarComisionPena));	
			this.jInternalFrameDetalleFormComisionPena.jButtonEliminarComisionPena.setVisible((this.isVisibilidadCeldaEliminarComisionPena && this.isPermisoEliminarComisionPena));
			this.jInternalFrameDetalleFormComisionPena.jButtonCancelarComisionPena.setVisible(this.isVisibilidadCeldaCancelarComisionPena);							
			this.jInternalFrameDetalleFormComisionPena.jButtonGuardarCambiosComisionPena.setVisible((this.isVisibilidadCeldaGuardarComisionPena && this.isPermisoGuardarCambiosComisionPena));			
			
			}
						
			this.jButtonGuardarCambiosTablaComisionPena.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionPena && this.isPermisoGuardarCambiosComisionPena));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarComisionPena.setVisible((this.isVisibilidadCeldaNuevoComisionPena && this.isPermisoNuevoComisionPena));						
			this.jButtonDuplicarToolBarComisionPena.setVisible((this.isVisibilidadCeldaDuplicarComisionPena && this.isPermisoDuplicarComisionPena));						
			this.jButtonCopiarToolBarComisionPena.setVisible((this.isVisibilidadCeldaCopiarComisionPena && this.isPermisoCopiarComisionPena));			
			this.jButtonVerFormToolBarComisionPena.setVisible((this.isVisibilidadCeldaVerFormComisionPena && this.isPermisoVerFormComisionPena));			
			this.jButtonAbrirOrderByToolBarComisionPena.setVisible((this.isVisibilidadCeldaOrdenComisionPena && this.isPermisoOrdenComisionPena));
			this.jButtonNuevoRelacionesToolBarComisionPena.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionPena && this.isPermisoNuevoComisionPena));			
			this.jButtonNuevoGuardarCambiosToolBarComisionPena.setVisible((this.isVisibilidadCeldaNuevoComisionPena && this.isPermisoNuevoComisionPena && this.isPermisoGuardarCambiosComisionPena));			
			
			if(this.jInternalFrameDetalleFormComisionPena!=null) {
			this.jInternalFrameDetalleFormComisionPena.jButtonModificarToolBarComisionPena.setVisible((this.isVisibilidadCeldaModificarComisionPena && this.isPermisoActualizarComisionPena));	
			this.jInternalFrameDetalleFormComisionPena.jButtonActualizarToolBarComisionPena.setVisible((this.isVisibilidadCeldaActualizarComisionPena  && this.isPermisoActualizarComisionPena));	
			this.jInternalFrameDetalleFormComisionPena.jButtonEliminarToolBarComisionPena.setVisible((this.isVisibilidadCeldaEliminarComisionPena && this.isPermisoEliminarComisionPena));
			this.jInternalFrameDetalleFormComisionPena.jButtonCancelarToolBarComisionPena.setVisible(this.isVisibilidadCeldaCancelarComisionPena);				
			this.jInternalFrameDetalleFormComisionPena.jButtonGuardarCambiosToolBarComisionPena.setVisible((this.isVisibilidadCeldaGuardarComisionPena && this.isPermisoGuardarCambiosComisionPena));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarComisionPena.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionPena && this.isPermisoGuardarCambiosComisionPena));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoComisionPena.setVisible((this.isVisibilidadCeldaNuevoComisionPena && this.isPermisoNuevoComisionPena));			
			this.jMenuItemDuplicarComisionPena.setVisible((this.isVisibilidadCeldaDuplicarComisionPena && this.isPermisoDuplicarComisionPena));			
			this.jMenuItemCopiarComisionPena.setVisible((this.isVisibilidadCeldaCopiarComisionPena && this.isPermisoCopiarComisionPena));			
			this.jMenuItemVerFormComisionPena.setVisible((this.isVisibilidadCeldaVerFormComisionPena && this.isPermisoVerFormComisionPena));			
			this.jMenuItemAbrirOrderByComisionPena.setVisible((this.isVisibilidadCeldaOrdenComisionPena && this.isPermisoOrdenComisionPena));			
			//this.jMenuItemMostrarOcultarComisionPena.setVisible((this.isVisibilidadCeldaOrdenComisionPena && this.isPermisoOrdenComisionPena));
			this.jMenuItemDetalleAbrirOrderByComisionPena.setVisible((this.isVisibilidadCeldaOrdenComisionPena && this.isPermisoOrdenComisionPena));			
			//this.jMenuItemDetalleMostrarOcultarComisionPena.setVisible((this.isVisibilidadCeldaOrdenComisionPena && this.isPermisoOrdenComisionPena));			
			this.jMenuItemNuevoRelacionesComisionPena.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionPena && this.isPermisoNuevoComisionPena));			
			this.jMenuItemNuevoGuardarCambiosComisionPena.setVisible((this.isVisibilidadCeldaNuevoComisionPena && this.isPermisoNuevoComisionPena && this.isPermisoGuardarCambiosComisionPena));									
			
			if(this.jInternalFrameDetalleFormComisionPena!=null) {
			this.jInternalFrameDetalleFormComisionPena.jMenuItemModificarComisionPena.setVisible((this.isVisibilidadCeldaModificarComisionPena && this.isPermisoActualizarComisionPena));	
			this.jInternalFrameDetalleFormComisionPena.jMenuItemActualizarComisionPena.setVisible((this.isVisibilidadCeldaActualizarComisionPena && this.isPermisoActualizarComisionPena));	
			this.jInternalFrameDetalleFormComisionPena.jMenuItemEliminarComisionPena.setVisible((this.isVisibilidadCeldaEliminarComisionPena && this.isPermisoEliminarComisionPena));
			this.jInternalFrameDetalleFormComisionPena.jMenuItemCancelarComisionPena.setVisible(this.isVisibilidadCeldaCancelarComisionPena);				
			}
			
			this.jMenuItemGuardarCambiosComisionPena.setVisible((this.isVisibilidadCeldaGuardarComisionPena && this.isPermisoGuardarCambiosComisionPena));						
			this.jMenuItemGuardarCambiosTablaComisionPena.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionPena && this.isPermisoGuardarCambiosComisionPena));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoComisionPena=this.jButtonNuevoComisionPena.isVisible();
			this.isVisibilidadCeldaDuplicarComisionPena=this.jButtonDuplicarComisionPena.isVisible();
			this.isVisibilidadCeldaCopiarComisionPena=this.jButtonCopiarComisionPena.isVisible();
			this.isVisibilidadCeldaVerFormComisionPena=this.jButtonVerFormComisionPena.isVisible();
			
			this.isVisibilidadCeldaOrdenComisionPena=this.jButtonAbrirOrderByComisionPena.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesComisionPena=this.jButtonNuevoRelacionesComisionPena.isVisible();
			this.isVisibilidadCeldaModificarComisionPena=this.jButtonModificarComisionPena.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionPena!=null) {
			this.isVisibilidadCeldaActualizarComisionPena=this.jInternalFrameDetalleFormComisionPena.jButtonActualizarComisionPena.isVisible();
			this.isVisibilidadCeldaEliminarComisionPena=this.jInternalFrameDetalleFormComisionPena.jButtonEliminarComisionPena.isVisible();
			this.isVisibilidadCeldaCancelarComisionPena=this.jInternalFrameDetalleFormComisionPena.jButtonCancelarComisionPena.isVisible();
			this.isVisibilidadCeldaGuardarComisionPena=this.jInternalFrameDetalleFormComisionPena.jButtonGuardarCambiosComisionPena.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosComisionPena=this.jButtonGuardarCambiosTablaComisionPena.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoComisionPena=this.jButtonNuevoToolBarComisionPena.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComisionPena=this.jButtonNuevoRelacionesToolBarComisionPena.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionPena!=null) {
			this.isVisibilidadCeldaModificarComisionPena=this.jInternalFrameDetalleFormComisionPena.jButtonModificarToolBarComisionPena.isVisible();
			this.isVisibilidadCeldaActualizarComisionPena=this.jInternalFrameDetalleFormComisionPena.jButtonActualizarToolBarComisionPena.isVisible();
			this.isVisibilidadCeldaEliminarComisionPena=this.jInternalFrameDetalleFormComisionPena.jButtonEliminarToolBarComisionPena.isVisible();
			this.isVisibilidadCeldaCancelarComisionPena=this.jInternalFrameDetalleFormComisionPena.jButtonCancelarToolBarComisionPena.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComisionPena=this.jButtonGuardarCambiosToolBarComisionPena.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComisionPena=this.jButtonGuardarCambiosTablaToolBarComisionPena.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoComisionPena=this.jMenuItemNuevoComisionPena.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComisionPena=this.jMenuItemNuevoRelacionesComisionPena.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionPena!=null) {
			this.isVisibilidadCeldaModificarComisionPena=this.jInternalFrameDetalleFormComisionPena.jMenuItemModificarComisionPena.isVisible();
			this.isVisibilidadCeldaActualizarComisionPena=this.jInternalFrameDetalleFormComisionPena.jMenuItemActualizarComisionPena.isVisible();
			this.isVisibilidadCeldaEliminarComisionPena=this.jInternalFrameDetalleFormComisionPena.jMenuItemEliminarComisionPena.isVisible();
			this.isVisibilidadCeldaCancelarComisionPena=this.jInternalFrameDetalleFormComisionPena.jMenuItemCancelarComisionPena.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComisionPena=this.jMenuItemGuardarCambiosComisionPena.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComisionPena=this.jMenuItemGuardarCambiosTablaComisionPena.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesComisionPena(Boolean esInicializar) {
		if(ComisionPenaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.comisionpenaSessionBean.getConGuardarRelaciones()) {
				//if(this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesComisionPena();
			}
			
			this.inicializarActualizarBindingBotonesManualComisionPena(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualComisionPena() {
		this.jButtonNuevoComisionPena.setVisible(this.isPermisoNuevoComisionPena);			
		this.jButtonDuplicarComisionPena.setVisible(this.isPermisoDuplicarComisionPena);			
		this.jButtonCopiarComisionPena.setVisible(this.isPermisoCopiarComisionPena);			
		this.jButtonVerFormComisionPena.setVisible(this.isPermisoVerFormComisionPena);			
		
		this.jButtonAbrirOrderByComisionPena.setVisible(this.isPermisoOrdenComisionPena);					
		
		this.jButtonNuevoRelacionesComisionPena.setVisible(this.isPermisoNuevoComisionPena);			
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionPena.jButtonModificarComisionPena.setVisible(this.isPermisoActualizarComisionPena);	
			this.jInternalFrameDetalleFormComisionPena.jButtonActualizarComisionPena.setVisible(this.isPermisoActualizarComisionPena);	
			this.jInternalFrameDetalleFormComisionPena.jButtonEliminarComisionPena.setVisible(this.isPermisoEliminarComisionPena);
			this.jInternalFrameDetalleFormComisionPena.jButtonCancelarComisionPena.setVisible(this.isVisibilidadCeldaCancelarComisionPena);						
			this.jInternalFrameDetalleFormComisionPena.jButtonGuardarCambiosComisionPena.setVisible(this.isPermisoGuardarCambiosComisionPena);							
		}
		
		this.jButtonGuardarCambiosTablaComisionPena.setVisible(this.isPermisoActualizarComisionPena);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleComisionPena() {
		this.jInternalFrameDetalleFormComisionPena.jButtonModificarComisionPena.setVisible(this.isPermisoActualizarComisionPena);	
		this.jInternalFrameDetalleFormComisionPena.jButtonActualizarComisionPena.setVisible(this.isPermisoActualizarComisionPena);	
		this.jInternalFrameDetalleFormComisionPena.jButtonEliminarComisionPena.setVisible(this.isPermisoEliminarComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jButtonCancelarComisionPena.setVisible(this.isVisibilidadCeldaCancelarComisionPena);							
		this.jInternalFrameDetalleFormComisionPena.jButtonGuardarCambiosComisionPena.setVisible((this.isVisibilidadCeldaGuardarComisionPena && this.isPermisoGuardarCambiosComisionPena));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosComisionPena() {
		if(ComisionPenaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualComisionPena();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesComisionPena() {
	}
	
	public void jTableDatosComisionPenaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarComisionPena(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidComisionPenaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionPena(this.getcomisionpena(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionpena==null) {
						this.comisionpena = new ComisionPena();
					}

					this.setVariablesFormularioToObjetoActualComisionPena(this.comisionpena,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
				}

				if(this.comisionpena.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.comisionpena.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionPena(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaComisionPenaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebComisionPena(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionPena.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionPena.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionPena(this.getcomisionpena(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.comisionpenaLogic.getConnexion());

				if(this.comisionpena.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.comisionpena.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionPena=(TitledBorder)this.jScrollPanelDatosComisionPena.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderComisionPena.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaComisionPenaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionPena(this.getcomisionpena(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionpena==null) {
						this.comisionpena = new ComisionPena();
					}

					this.setVariablesFormularioToObjetoActualComisionPena(this.comisionpena,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
				}

				if(this.comisionpena.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.comisionpena.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionPena(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_comision_configComisionPenaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocomisionconfig=true;

			idTienePermisocomisionconfig=this.tienePermisosUsuarioEnPaginaWebComisionPena(ComisionConfigConstantesFunciones.CLASSNAME);

			if(idTienePermisocomisionconfig) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionPena.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionPena.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionPena(this.getcomisionpena(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);

				this.comisionconfigBeanSwingJInternalFrame=new ComisionConfigBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.comisionconfigBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.comisionconfigBeanSwingJInternalFrame.getComisionConfigLogic().setConnexion(this.comisionpenaLogic.getConnexion());

				if(this.comisionpena.getid_comision_config()!=null) {
					this.comisionconfigBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.comisionconfigBeanSwingJInternalFrame.setIdActual(this.comisionpena.getid_comision_config());
					this.comisionconfigBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.comisionconfigBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.comisionconfigBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionConfig();
				}

				JInternalFrameBase jinternalFrame =this.comisionconfigBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionPena=(TitledBorder)this.jScrollPanelDatosComisionPena.getBorder();
				TitledBorder titledBordercomisionconfig=(TitledBorder)this.comisionconfigBeanSwingJInternalFrame.jScrollPanelDatosComisionConfig.getBorder();

				titledBordercomisionconfig.setTitle(titledBorderComisionPena.getTitle() + " -> Comision Config");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_comision_configComisionPenaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionPena(this.getcomisionpena(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionpena==null) {
						this.comisionpena = new ComisionPena();
					}

					this.setVariablesFormularioToObjetoActualComisionPena(this.comisionpena,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
				}

				if(this.comisionpena.getid_comision_config()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_comision_config = "+this.comisionpena.getid_comision_config().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionPena(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnum_dias_inicioComisionPenaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionPena(this.getcomisionpena(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionpena==null) {
						this.comisionpena = new ComisionPena();
					}

					this.setVariablesFormularioToObjetoActualComisionPena(this.comisionpena,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
				}

				if(this.comisionpena.getnum_dias_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where num_dias_inicio = "+this.comisionpena.getnum_dias_inicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionPena(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnum_dias_finComisionPenaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionPena(this.getcomisionpena(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionpena==null) {
						this.comisionpena = new ComisionPena();
					}

					this.setVariablesFormularioToObjetoActualComisionPena(this.comisionpena,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
				}

				if(this.comisionpena.getnum_dias_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where num_dias_fin = "+this.comisionpena.getnum_dias_fin().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionPena(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeComisionPenaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionPena(this.getcomisionpena(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionpena==null) {
						this.comisionpena = new ComisionPena();
					}

					this.setVariablesFormularioToObjetoActualComisionPena(this.comisionpena,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
				}

				if(this.comisionpena.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.comisionpena.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionPena(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionComisionPenaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionPena(this.getcomisionpena(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionpena==null) {
						this.comisionpena = new ComisionPena();
					}

					this.setVariablesFormularioToObjetoActualComisionPena(this.comisionpena,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);
				}

				if(this.comisionpena.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.comisionpena.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionPena(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdComisionConfigComisionPenaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionPena(false,false);

			this.getComisionPenasFK_IdComisionConfig();

			this.inicializarActualizarBindingComisionPena(false);

			//if(ComisionPenaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionPena(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaComisionPenaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionPena(false,false);

			this.getComisionPenasFK_IdEmpresa();

			this.inicializarActualizarBindingComisionPena(false);

			//if(ComisionPenaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionPena(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionpenaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameComisionPena() {
		if(this.jInternalFrameDetalleFormComisionPena!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) {
			this.jInternalFrameDetalleFormComisionPena.setVisible(false);	    			
			this.jInternalFrameDetalleFormComisionPena.dispose();
			this.jInternalFrameDetalleFormComisionPena=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoComisionPena!=null) {
			this.jInternalFrameReporteDinamicoComisionPena.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoComisionPena.dispose();
			this.jInternalFrameReporteDinamicoComisionPena=null;
		}
		
		if(this.jInternalFrameImportacionComisionPena!=null) {
			this.jInternalFrameImportacionComisionPena.setVisible(false);	    			
			this.jInternalFrameImportacionComisionPena.dispose();
			this.jInternalFrameImportacionComisionPena=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessComisionPena();
			
			ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
			
			
			if(sTipo.equals("NuevoComisionPena")) {
				jButtonNuevoComisionPenaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarComisionPena")) {
				jButtonDuplicarComisionPenaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarComisionPena")) {
				jButtonCopiarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("VerFormComisionPena")) {
				jButtonVerFormComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarComisionPena")) {
				jButtonNuevoComisionPenaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarComisionPena")) {
				jButtonDuplicarComisionPenaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoComisionPena")) {
				jButtonNuevoComisionPenaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarComisionPena")) {
				jButtonDuplicarComisionPenaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesComisionPena")) {
				jButtonNuevoComisionPenaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarComisionPena")) {
				jButtonNuevoComisionPenaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesComisionPena")) {
				jButtonNuevoComisionPenaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarComisionPena")) {
				jButtonModificarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarComisionPena")) {
				jButtonModificarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarComisionPena")) {
				jButtonModificarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarComisionPena")) {
				jButtonActualizarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarComisionPena")) {
				jButtonActualizarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarComisionPena")) {
				jButtonActualizarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("EliminarComisionPena")) {
				jButtonEliminarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarComisionPena")) {
				jButtonEliminarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarComisionPena")) {
				jButtonEliminarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("CancelarComisionPena")) {
				jButtonCancelarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarComisionPena")) {
				jButtonCancelarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarComisionPena")) {
				jButtonCancelarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("CerrarComisionPena")) {
				jButtonCerrarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarComisionPena")) {
				jButtonCerrarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarComisionPena")) {
				jButtonCerrarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarComisionPena")) {
				jButtonMostrarOcultarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarComisionPena")) {
				jButtonCancelarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosComisionPena")) {
				jButtonGuardarCambiosComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarComisionPena")) {
				jButtonGuardarCambiosComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarComisionPena")) {
				jButtonCopiarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarComisionPena")) {
				jButtonVerFormComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosComisionPena")) {
				jButtonGuardarCambiosComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarComisionPena")) {
				jButtonCopiarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormComisionPena")) {
				jButtonVerFormComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaComisionPena")) {
				jButtonGuardarCambiosComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarComisionPena")) {
				jButtonGuardarCambiosComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaComisionPena")) {
				jButtonGuardarCambiosComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionComisionPena")) {
				jButtonRecargarInformacionComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarComisionPena")) {
				jButtonRecargarInformacionComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionComisionPena")) {
				jButtonRecargarInformacionComisionPenaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresComisionPena")) {
				jButtonAnterioresComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarComisionPena")) {
				jButtonAnterioresComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreComisionPena")) {
				jButtonAnterioresComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesComisionPena")) {
				jButtonSiguientesComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarComisionPena")) {
				jButtonSiguientesComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesComisionPena")) {
				jButtonSiguientesComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByComisionPena") || sTipo.equals("MenuItemDetalleAbrirOrderByComisionPena")) {
				jButtonAbrirOrderByComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarComisionPena") || sTipo.equals("MenuItemDetalleMostrarOcultarComisionPena")) {
				jButtonMostrarOcultarComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosComisionPena")) {
				jButtonNuevoGuardarCambiosComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarComisionPena")) {
				jButtonNuevoGuardarCambiosComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosComisionPena")) {
				jButtonNuevoGuardarCambiosComisionPenaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoComisionPena")) {
				jButtonCerrarReporteDinamicoComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoComisionPena")) {
				jButtonGenerarReporteDinamicoComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoComisionPena")) {
				
				jButtonGenerarExcelReporteDinamicoComisionPenaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionComisionPena")) {
				jButtonCerrarImportacionComisionPenaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionComisionPena")) {
				
				jButtonGenerarImportacionComisionPenaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionComisionPena")) {
				
				jButtonAbrirImportacionComisionPenaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesComisionPena")) {
				jComboBoxTiposAccionesComisionPenaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesComisionPena")) {
				jComboBoxTiposRelacionesComisionPenaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioComisionPena")) {
				jComboBoxTiposAccionesComisionPenaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarComisionPena")) {
				
				jComboBoxTiposSeleccionarComisionPenaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralComisionPena")) {
				jTextFieldValorCampoGeneralComisionPenaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByComisionPena")) {
				jButtonAbrirOrderByComisionPenaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarComisionPena")) {
				jButtonAbrirOrderByComisionPenaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByComisionPena")) {
				jButtonCerrarOrderByComisionPenaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComisionPenaBusqueda")) {
				this.jButtonidComisionPenaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComisionPenaUpdate")) {
				this.jButtonid_empresaComisionPenaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComisionPenaBusqueda")) {
				this.jButtonid_empresaComisionPenaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_comision_configComisionPenaUpdate")) {
				this.jButtonid_comision_configComisionPenaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_comision_configComisionPenaBusqueda")) {
				this.jButtonid_comision_configComisionPenaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("num_dias_inicioComisionPenaBusqueda")) {
				this.jButtonnum_dias_inicioComisionPenaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("num_dias_finComisionPenaBusqueda")) {
				this.jButtonnum_dias_finComisionPenaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeComisionPenaBusqueda")) {
				this.jButtonporcentajeComisionPenaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionComisionPenaBusqueda")) {
				this.jButtondescripcionComisionPenaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdComisionConfigComisionPena")) {
				this.jButtonFK_IdComisionConfigComisionPenaActionPerformed(evt);
			}
			
			;
			
			
			ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessComisionPena();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionPenaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionpena);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionpena);
				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
				
				


				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionPena.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionPena.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ComisionPena comisionpenaLocal=null;
			
			if(!this.getEsControlTabla()) {
				comisionpenaLocal=this.comisionpena;
			} else {
				comisionpenaLocal=this.comisionpenaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionpena);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionpena);
				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
							
				
				


				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionPena.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionPena.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionPenaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaAnterior =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionpenaAnterior =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
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
			
			ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
			
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
			
			


			
			ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionPenaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionpena);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionpena);
				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
								
						
				


				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionPena.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionPena.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionpena);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionpena);
				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
								
				
				


				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionPena.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionPena.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionPenaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaAnterior =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionpenaAnterior =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionpena);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionpena);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionPenaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaAnterior =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionpenaAnterior =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionPenaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionpena);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisionpena);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionpena);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionpena);
				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
							
				
				


				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionPena.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionPena.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionPenaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionpenaAnterior =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comisionpenaAnterior =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
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
			
			ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
			
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
			
			


			
			ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionPenaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionpena);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisionpena);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionpena);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionpena);
				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
								
				
				


				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionPena.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionPena.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionPenaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaAnterior =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionpenaAnterior =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionPenaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionpena);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisionpena);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionPenaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionpena);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionpena);
				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosComisionPena")) {
					jCheckBoxSeleccionarTodosComisionPenaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosComisionPena")) {
					jCheckBoxSeleccionadosComisionPenaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarComisionPena")) {
					
				}
				
				


				
				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionPena.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionPena.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionpena);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.comisionpena);
				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
												
				
				


				
				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionPena.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionPena.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionPenaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionpenaAnterior =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comisionpenaAnterior =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionPenaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionpena);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionpena);
				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
				
				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
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
			
			ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
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
			
			


			
			ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionPenaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionpena);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionpena);
				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionPena.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionPena.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionpena);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionpena);
				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
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
				
				


				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionPena.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionPena.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionPenaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionpenaAnterior =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionpenaAnterior =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarComisionPena")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosComisionPenaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosComisionPena.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.comisionpena =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.comisionpena =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.comisionpena);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarComisionPena")) {
				
				}
				
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarComisionPena")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosComisionPena.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarComisionPena")) {
			
			}
			
			ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessComisionPena();
			
			ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
			
			if(sTipo.equals("NuevoComisionPena")) {
				jButtonNuevoComisionPenaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarComisionPena")) {
				jButtonDuplicarComisionPenaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarComisionPena")) {
				jButtonCopiarComisionPenaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormComisionPena")) {
				jButtonVerFormComisionPenaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesComisionPena")) {
				jButtonNuevoComisionPenaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarComisionPena")) {
				jButtonModificarComisionPenaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarComisionPena")) {
				jButtonActualizarComisionPenaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarComisionPena")) {
				jButtonEliminarComisionPenaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaComisionPena")) {
				jButtonGuardarCambiosComisionPenaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarComisionPena")) {
				jButtonCancelarComisionPenaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarComisionPena")) {
				jButtonCerrarComisionPenaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosComisionPena")) {
				jButtonGuardarCambiosComisionPenaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosComisionPena")) {
				jButtonNuevoGuardarCambiosComisionPenaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByComisionPena")) {
				jButtonAbrirOrderByComisionPenaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionComisionPena")) {
				jButtonRecargarInformacionComisionPenaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresComisionPena")) {
				jButtonAnterioresComisionPenaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesComisionPena")) {
				jButtonSiguientesComisionPenaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComisionPenaBusqueda")) {
				this.jButtonidComisionPenaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComisionPenaUpdate")) {
				this.jButtonid_empresaComisionPenaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComisionPenaBusqueda")) {
				this.jButtonid_empresaComisionPenaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_comision_configComisionPenaUpdate")) {
				this.jButtonid_comision_configComisionPenaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_comision_configComisionPenaBusqueda")) {
				this.jButtonid_comision_configComisionPenaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("num_dias_inicioComisionPenaBusqueda")) {
				this.jButtonnum_dias_inicioComisionPenaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("num_dias_finComisionPenaBusqueda")) {
				this.jButtonnum_dias_finComisionPenaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeComisionPenaBusqueda")) {
				this.jButtonporcentajeComisionPenaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionComisionPenaBusqueda")) {
				this.jButtondescripcionComisionPenaBusquedaActionPerformed(evt);
			}
			
			ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessComisionPena();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameComisionPena")) {
				closingInternalFrameComisionPena();
				
			} else if(sTipo.equals("jButtonCancelarComisionPena")) {
				JInternalFrameBase jInternalFrameDetalleFormComisionPena = (JInternalFrameBase)evt.getSource();
	            	
	            ComisionPenaBeanSwingJInternalFrame jInternalFrameParent=(ComisionPenaBeanSwingJInternalFrame)jInternalFrameDetalleFormComisionPena.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarComisionPenaActionPerformed(null);
			}
			
			ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comisionpena,new Object(),this.comisionpenaParameterGeneral,this.comisionpenaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormComisionPena(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormComisionPena(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormComisionPena(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.comisionpena)) {
			if(!esControlTabla) {
				if(ComisionPenaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualComisionPena(this.comisionpena,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);			
				}
				
				if(this.comisionpenaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualComisionPena(this.comisionpena,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.comisionpenaReturnGeneral=comisionpenaLogic.procesarEventosComisionPenasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionpenaLogic.getComisionPenas(),this.comisionpena,this.comisionpenaParameterGeneral,this.isEsNuevoComisionPena,classes);//this.comisionpenaLogic.getComisionPena()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanComisionPena(this.comisionpenaReturnGeneral,this.comisionpenaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.comisionpenaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanComisionPena(classes,this.comisionpenaReturnGeneral,this.comisionpenaBean,false);
					}
						
					if(this.comisionpenaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyComisionPena(this.comisionpenaReturnGeneral.getComisionPena());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioComisionPena(this.comisionpenaReturnGeneral.getComisionPena());	
					}
						
					if(this.comisionpenaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioComisionPena(this.comisionpenaReturnGeneral.getComisionPena(),classes);//this.comisionpenaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioComisionPena(this.comisionpena,classes);//this.comisionpenaBean);									
				}
			
				if(ComisionPenaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualComisionPena(this.comisionpena,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionPena(this.comisionpena);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.comisionpenaAnterior!=null) {
						this.comisionpena=this.comisionpenaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.comisionpenaReturnGeneral=comisionpenaLogic.procesarEventosComisionPenasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionpenaLogic.getComisionPenas(),this.comisionpena,this.comisionpenaParameterGeneral,this.isEsNuevoComisionPena,classes);//this.comisionpenaLogic.getComisionPena()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comisionpenaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comisionpenaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.comisionpenaReturnGeneral.getComisionPena(),comisionpenaLogic.getComisionPenas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.comisionpenaReturnGeneral.getComisionPena(),this.comisionpenas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosComisionPena.repaint();
				
				//((AbstractTableModel) this.jTableDatosComisionPena.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosComisionPena();
			}
		}
	}
	
	public void actualizarVisualTableDatosComisionPena() throws Exception {
		
		ComisionPenaModel comisionpenaModel=(ComisionPenaModel)this.jTableDatosComisionPena.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisionpenaModel.comisionpenas=this.comisionpenaLogic.getComisionPenas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			comisionpenaModel.comisionpenas=this.comisionpenas;
		}
		
		
		((ComisionPenaModel) this.jTableDatosComisionPena.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaComisionPena() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcomisionpenaAnterior(),this.comisionpenaLogic.getComisionPenas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcomisionpenaAnterior(),this.comisionpenas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosComisionPena();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioComisionPena(ComisionPena comisionpena,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
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
										
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionpena,new Object(),generalEntityParameterGeneral,this.comisionpenaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.comisionpenaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ComisionPenaConstantesFunciones.getClassesRelationshipsOfComisionPena(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ComisionPenaConstantesFunciones.getClassesRelationshipsFromStringsOfComisionPena(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormComisionPena(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ComisionPenaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionpena,new Object(),generalEntityParameterGeneral,this.comisionpenaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioComisionPena(ComisionPenaBean comisionpenaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanComisionPena(ArrayList<Classe> classes,ComisionPenaReturnGeneral comisionpenaReturnGeneral,ComisionPenaBean comisionpenaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualComisionPena(ComisionPena comisionpena,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.comisionpena)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormComisionPena = new ComisionPenaDetalleFormJInternalFrame(jDesktopPane,this.comisionpenaSessionBean.getConGuardarRelaciones(),this.comisionpenaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormComisionPena);
		this.jInternalFrameDetalleFormComisionPena.setVisible(false);
		this.jInternalFrameDetalleFormComisionPena.setSelected(false);						
		
		this.jInternalFrameDetalleFormComisionPena.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormComisionPena.comisionpenaLogic=this.comisionpenaLogic;
		
		this.cargarCombosFrameForeignKeyComisionPena("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleComisionPena();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComisionPena();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyComisionPena("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyComisionPena();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormComisionPena.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComisionPena"));
		
		this.jInternalFrameDetalleFormComisionPena.jButtonModificarComisionPena.addActionListener(new ButtonActionListener(this,"ModificarComisionPena"));

		
		this.jInternalFrameDetalleFormComisionPena.jButtonModificarToolBarComisionPena.addActionListener(new ButtonActionListener(this,"ModificarToolBarComisionPena"));
					
		this.jInternalFrameDetalleFormComisionPena.jMenuItemModificarComisionPena.addActionListener(new ButtonActionListener(this,"MenuItemModificarComisionPena"));		
		
		
		
		this.jInternalFrameDetalleFormComisionPena.jButtonActualizarComisionPena.addActionListener (new ButtonActionListener(this,"ActualizarComisionPena"));
		
		
		this.jInternalFrameDetalleFormComisionPena.jButtonActualizarToolBarComisionPena.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComisionPena"));
						
		this.jInternalFrameDetalleFormComisionPena.jMenuItemActualizarComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComisionPena"));		
		
		
		
		this.jInternalFrameDetalleFormComisionPena.jButtonEliminarComisionPena.addActionListener (new ButtonActionListener(this,"EliminarComisionPena"));
		
		
		this.jInternalFrameDetalleFormComisionPena.jButtonEliminarToolBarComisionPena.addActionListener (new ButtonActionListener(this,"EliminarToolBarComisionPena"));
								
		this.jInternalFrameDetalleFormComisionPena.jMenuItemEliminarComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComisionPena"));		
		
		
		
		this.jInternalFrameDetalleFormComisionPena.jButtonCancelarComisionPena.addActionListener (new ButtonActionListener(this,"CancelarComisionPena"));
		
		
		this.jInternalFrameDetalleFormComisionPena.jButtonCancelarToolBarComisionPena.addActionListener (new ButtonActionListener(this,"CancelarToolBarComisionPena"));
					
		this.jInternalFrameDetalleFormComisionPena.jMenuItemCancelarComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComisionPena"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormComisionPena.jMenuItemDetalleCerrarComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComisionPena"));		
		
		
		
		this.jInternalFrameDetalleFormComisionPena.jButtonGuardarCambiosToolBarComisionPena.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionPena"));
		
		
		
		this.jInternalFrameDetalleFormComisionPena.jButtonGuardarCambiosToolBarComisionPena.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionPena"));
		
		
		
		this.jInternalFrameDetalleFormComisionPena.jComboBoxTiposAccionesFormularioComisionPena.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComisionPena"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonidComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"idComisionPenaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionPena.jButtonid_empresaComisionPenaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionPenaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonid_empresaComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionPenaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionPena.jButtonid_comision_configComisionPenaUpdate.addActionListener(new ButtonActionListener(this,"id_comision_configComisionPenaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonid_comision_configComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"id_comision_configComisionPenaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonnum_dias_inicioComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"num_dias_inicioComisionPenaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonnum_dias_finComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"num_dias_finComisionPenaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonporcentajeComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeComisionPenaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtondescripcionComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComisionPenaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormComisionPena.jTabbedPaneRelacionesComisionPena.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComisionPena"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameComisionPena"));
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionPena.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComisionPena"));
		}
		
		this.jTableDatosComisionPena.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarComisionPena"));
		
		this.jTableDatosComisionPena.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarComisionPena"));
		
		this.jButtonNuevoComisionPena.addActionListener(new ButtonActionListener(this,"NuevoComisionPena"));
		
		this.jButtonDuplicarComisionPena.addActionListener(new ButtonActionListener(this,"DuplicarComisionPena"));
		
		this.jButtonCopiarComisionPena.addActionListener(new ButtonActionListener(this,"CopiarComisionPena"));
		
		this.jButtonVerFormComisionPena.addActionListener(new ButtonActionListener(this,"VerFormComisionPena"));
		
		
		this.jButtonNuevoToolBarComisionPena.addActionListener(new ButtonActionListener(this,"NuevoToolBarComisionPena"));
			
		this.jButtonDuplicarToolBarComisionPena.addActionListener(new ButtonActionListener(this,"DuplicarToolBarComisionPena"));
			
		this.jMenuItemNuevoComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemNuevoComisionPena"));
			
		this.jMenuItemDuplicarComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarComisionPena"));		
		
		
		this.jButtonNuevoRelacionesComisionPena.addActionListener (new ButtonActionListener(this,"NuevoRelacionesComisionPena"));
		
		
		this.jButtonNuevoRelacionesToolBarComisionPena.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarComisionPena"));
			
		this.jMenuItemNuevoRelacionesComisionPena.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesComisionPena"));		
		
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionPena.jButtonModificarComisionPena.addActionListener(new ButtonActionListener(this,"ModificarComisionPena"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionPena.jButtonModificarToolBarComisionPena.addActionListener(new ButtonActionListener(this,"ModificarToolBarComisionPena"));
			
			this.jInternalFrameDetalleFormComisionPena.jMenuItemModificarComisionPena.addActionListener(new ButtonActionListener(this,"MenuItemModificarComisionPena"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormComisionPena.jButtonActualizarComisionPena.addActionListener (new ButtonActionListener(this,"ActualizarComisionPena"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionPena.jButtonActualizarToolBarComisionPena.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComisionPena"));
				
			this.jInternalFrameDetalleFormComisionPena.jMenuItemActualizarComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComisionPena"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionPena.jButtonEliminarComisionPena.addActionListener (new ButtonActionListener(this,"EliminarComisionPena"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionPena.jButtonEliminarToolBarComisionPena.addActionListener (new ButtonActionListener(this,"EliminarToolBarComisionPena"));
						
			this.jInternalFrameDetalleFormComisionPena.jMenuItemEliminarComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComisionPena"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionPena.jButtonCancelarComisionPena.addActionListener (new ButtonActionListener(this,"CancelarComisionPena"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionPena.jButtonCancelarToolBarComisionPena.addActionListener (new ButtonActionListener(this,"CancelarToolBarComisionPena"));
			
			this.jInternalFrameDetalleFormComisionPena.jMenuItemCancelarComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComisionPena"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarComisionPena.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarComisionPena"));		
		
		
		this.jButtonCerrarComisionPena.addActionListener (new ButtonActionListener(this,"CerrarComisionPena"));
		
		
		this.jButtonCerrarToolBarComisionPena.addActionListener (new ButtonActionListener(this,"CerrarToolBarComisionPena"));
			
		this.jMenuItemCerrarComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemCerrarComisionPena"));
			
		if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionPena.jMenuItemDetalleCerrarComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComisionPena"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionPena.jButtonGuardarCambiosComisionPena.addActionListener (new ButtonActionListener(this,"GuardarCambiosComisionPena"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionPena.jButtonGuardarCambiosToolBarComisionPena.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionPena"));
		}
		
		this.jButtonCopiarToolBarComisionPena.addActionListener (new ButtonActionListener(this,"CopiarToolBarComisionPena"));
			
		this.jButtonVerFormToolBarComisionPena.addActionListener (new ButtonActionListener(this,"VerFormToolBarComisionPena"));
		
		this.jMenuItemGuardarCambiosComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosComisionPena"));
			
		this.jMenuItemCopiarComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemCopiarComisionPena"));		
		
		this.jMenuItemVerFormComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemVerFormComisionPena"));		
		
		
		this.jButtonGuardarCambiosTablaComisionPena.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComisionPena"));
		
		
		this.jButtonGuardarCambiosTablaToolBarComisionPena.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarComisionPena"));
			
		this.jMenuItemGuardarCambiosTablaComisionPena.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComisionPena"));		
		
		
		
		this.jButtonRecargarInformacionComisionPena.addActionListener (new ButtonActionListener(this,"RecargarInformacionComisionPena"));
					
		this.jButtonRecargarInformacionToolBarComisionPena.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarComisionPena"));
		
		this.jMenuItemRecargarInformacionComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionComisionPena"));		
		
		
		
		this.jButtonAnterioresComisionPena.addActionListener (new ButtonActionListener(this,"AnterioresComisionPena"));
		
		
		this.jButtonAnterioresToolBarComisionPena.addActionListener (new ButtonActionListener(this,"AnterioresToolBarComisionPena"));
		
		this.jMenuItemAnterioresComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresComisionPena"));		
		
		
		this.jButtonSiguientesComisionPena.addActionListener (new ButtonActionListener(this,"SiguientesComisionPena"));
		
		
		this.jButtonSiguientesToolBarComisionPena.addActionListener (new ButtonActionListener(this,"SiguientesToolBarComisionPena"));
			
		this.jMenuItemSiguientesComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesComisionPena"));
			
		this.jMenuItemAbrirOrderByComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByComisionPena"));
			
		this.jMenuItemMostrarOcultarComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarComisionPena"));
			
		this.jMenuItemDetalleAbrirOrderByComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByComisionPena"));
			
		this.jMenuItemDetalleMostarOcultarComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarComisionPena"));		
		
		
		this.jButtonNuevoGuardarCambiosComisionPena.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosComisionPena"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarComisionPena.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarComisionPena"));
			
		this.jMenuItemNuevoGuardarCambiosComisionPena.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosComisionPena"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosComisionPena.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosComisionPena"));

		this.jCheckBoxSeleccionadosComisionPena.addItemListener(new CheckBoxItemListener(this,"SeleccionadosComisionPena"));
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionPena.jComboBoxTiposAccionesFormularioComisionPena.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComisionPena"));
		}
		
		
		this.jComboBoxTiposRelacionesComisionPena.addActionListener (new ButtonActionListener(this,"TiposRelacionesComisionPena"));
			
		this.jComboBoxTiposAccionesComisionPena.addActionListener (new ButtonActionListener(this,"TiposAccionesComisionPena"));
					
		this.jComboBoxTiposSeleccionarComisionPena.addActionListener (new ButtonActionListener(this,"TiposSeleccionarComisionPena"));
			
		this.jTextFieldValorCampoGeneralComisionPena.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralComisionPena"));		
		
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonidComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"idComisionPenaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionPena.jButtonid_empresaComisionPenaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionPenaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonid_empresaComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionPenaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionPena.jButtonid_comision_configComisionPenaUpdate.addActionListener(new ButtonActionListener(this,"id_comision_configComisionPenaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonid_comision_configComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"id_comision_configComisionPenaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonnum_dias_inicioComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"num_dias_inicioComisionPenaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonnum_dias_finComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"num_dias_finComisionPenaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonporcentajeComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeComisionPenaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtondescripcionComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComisionPenaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdComisionConfigComisionPena.addActionListener(new ButtonActionListener(this,"FK_IdComisionConfigComisionPena"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoComisionPena!=null) {
				this.jInternalFrameReporteDinamicoComisionPena.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionPena"));
				this.jInternalFrameReporteDinamicoComisionPena.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionPena"));
				this.jInternalFrameReporteDinamicoComisionPena.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionPena"));
			}
			
			//this.jButtonCerrarReporteDinamicoComisionPena.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionPena"));				
			//this.jButtonGenerarReporteDinamicoComisionPena.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionPena"));
			//this.jButtonGenerarExcelReporteDinamicoComisionPena.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionPena"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionComisionPena!=null) {
				this.jInternalFrameImportacionComisionPena.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComisionPena"));
				this.jInternalFrameImportacionComisionPena.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComisionPena"));
				this.jInternalFrameImportacionComisionPena.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComisionPena"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByComisionPena.addActionListener (new ButtonActionListener(this,"AbrirOrderByComisionPena"));
			
			this.jButtonAbrirOrderByToolBarComisionPena.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarComisionPena"));			
			
			if(this.jInternalFrameOrderByComisionPena!=null) {
				this.jInternalFrameOrderByComisionPena.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComisionPena"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormComisionPena!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionPena.jTabbedPaneRelacionesComisionPena.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComisionPena"));
		
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
            		closingInternalFrameComisionPena();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormComisionPena.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormComisionPena = (JInternalFrameBase)event.getSource();
	            	
	            ComisionPenaBeanSwingJInternalFrame jInternalFrameParent=(ComisionPenaBeanSwingJInternalFrame)jInternalFrameDetalleFormComisionPena.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarComisionPenaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosComisionPena.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosComisionPenaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosComisionPena.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosComisionPena.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionPenaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionPenaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionPenaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoComisionPena";
		inputMap = this.jButtonNuevoComisionPena.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoComisionPena.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComisionPenaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionPenaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionPenaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionPenaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesComisionPena";
		inputMap = this.jButtonNuevoRelacionesComisionPena.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesComisionPena.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComisionPenaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarComisionPena";
		inputMap = this.jButtonModificarComisionPena.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarComisionPena.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarComisionPenaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarComisionPena";
		inputMap = this.jButtonActualizarComisionPena.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarComisionPena.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarComisionPenaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarComisionPena";
		inputMap = this.jButtonEliminarComisionPena.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarComisionPena.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarComisionPenaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarComisionPena";
		inputMap = this.jButtonCancelarComisionPena.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarComisionPena.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarComisionPenaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarComisionPena";
		inputMap = this.jButtonCerrarComisionPena.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarComisionPena.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarComisionPenaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormComisionPena.jButtonGuardarCambiosComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosComisionPena";
		inputMap = this.jInternalFrameDetalleFormComisionPena.jButtonGuardarCambiosComisionPena.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormComisionPena.jButtonGuardarCambiosComisionPena.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosComisionPenaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosComisionPena.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosComisionPenaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesComisionPena.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesComisionPenaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarComisionPena.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarComisionPenaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralComisionPena.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralComisionPenaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonidComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"idComisionPenaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionPena.jButtonid_empresaComisionPenaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionPenaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonid_empresaComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionPenaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionPena.jButtonid_comision_configComisionPenaUpdate.addActionListener(new ButtonActionListener(this,"id_comision_configComisionPenaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonid_comision_configComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"id_comision_configComisionPenaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonnum_dias_inicioComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"num_dias_inicioComisionPenaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonnum_dias_finComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"num_dias_finComisionPenaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtonporcentajeComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeComisionPenaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionPena.jButtondescripcionComisionPenaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComisionPenaBusqueda"));
		
		
		this.jButtonFK_IdComisionConfigComisionPena.addActionListener(new ButtonActionListener(this,"FK_IdComisionConfigComisionPena"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionComisionPena.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionComisionPenaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarComisionPenaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarComisionPena.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosComisionPena(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ComisionPena comisionpenaAux:this.comisionpenaLogic.getComisionPenas()) {
					comisionpenaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionPena comisionpenaAux:comisionpenas) {
					comisionpenaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosComisionPenaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComisionPena(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComisionPena comisionpenaAux:this.comisionpenaLogic.getComisionPenas()) {
						comisionpenaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionPena comisionpenaAux:comisionpenas) {
						comisionpenaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ComisionPena comisionpenaAux:this.comisionpenaLogic.getComisionPenas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionPena comisionpenaAux:comisionpenas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaComisionPena(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComisionPena.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComisionPena.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComisionPena,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosComisionPenaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComisionPena(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosComisionPena.getSelectedRows();
			
			ComisionPena comisionpenaLocal=new ComisionPena();
			
			//this.seleccionarTodosComisionPena(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionpenaLocal =(ComisionPena) this.comisionpenaLogic.getComisionPenas().toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					comisionpenaLocal =(ComisionPena) this.comisionpenas.toArray()[this.jTableDatosComisionPena.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				comisionpenaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComisionPena comisionpenaAux:this.comisionpenaLogic.getComisionPenas()) {
						comisionpenaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionPena comisionpenaAux:comisionpenas) {
						comisionpenaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaComisionPena(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComisionPena.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComisionPena.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComisionPena,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualComisionPenaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarComisionPenaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralComisionPenaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingComisionPena(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralComisionPena.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComisionPena comisionpenaAux:this.comisionpenaLogic.getComisionPenas()) {
				
						if(sTipoSeleccionar.equals(ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO)) {
							existe=true;
							comisionpenaAux.setnum_dias_inicio(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN)) {
							existe=true;
							comisionpenaAux.setnum_dias_fin(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionPenaConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							comisionpenaAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionPenaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							comisionpenaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionPena comisionpenaAux:comisionpenas) {
					
						if(sTipoSeleccionar.equals(ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO)) {
							existe=true;
							comisionpenaAux.setnum_dias_inicio(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN)) {
							existe=true;
							comisionpenaAux.setnum_dias_fin(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionPenaConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							comisionpenaAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionPenaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							comisionpenaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaComisionPena(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesComisionPenaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingComisionPena(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioComisionPena=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesComisionPena.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormComisionPena.jComboBoxTiposAccionesFormularioComisionPena.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteComisionPena) {				
					conSplash=true;//false;										
					
					//this.startProcessComisionPena(conSplash);
				
					this.generarReporteComisionPenasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionPena.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionPena.jComboBoxTiposAccionesFormularioComisionPena.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoComisionPenasSeleccionados();
				//this.jComboBoxTiposAccionesComisionPena.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComisionPenasSeleccionados(false);
				//this.jComboBoxTiposAccionesComisionPena.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComisionPenasSeleccionados(true);
				//this.jComboBoxTiposAccionesComisionPena.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComisionPena();
				
				this.exportarComisionPenasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionPena.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionPena.jComboBoxTiposAccionesFormularioComisionPena.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionComisionPenas();
				//this.importarComisionPenas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionPena.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionPena.jComboBoxTiposAccionesFormularioComisionPena.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComisionPena();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelComisionPenasSeleccionados();
				//this.jComboBoxTiposAccionesComisionPena.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Penalidad Comision", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessComisionPena();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoComisionPena)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyComisionPena(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Penalidad Comision",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionPena.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionPena.jComboBoxTiposAccionesFormularioComisionPena.setSelectedIndex(0);					
				}	
			} 			
			else if(ComisionPenaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteComisionPena) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessComisionPena(conSplash);
					
						//this.actualizarParametrosGeneralComisionPena();
						
						this.generarReporteProcesoAccionComisionPenasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesComisionPena.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormComisionPena.jComboBoxTiposAccionesFormularioComisionPena.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ComisionPenaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Penalidad ComisionS SELECCIONADOS?", "MANTENIMIENTO DE Penalidad Comision", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessComisionPena();
				
						this.actualizarParametrosGeneralComisionPena();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.comisionpenaReturnGeneral=comisionpenaLogic.procesarAccionComisionPenasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.comisionpenaLogic.getComisionPenas(),this.comisionpenaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarComisionPenaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComisionPena.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComisionPena.jComboBoxTiposAccionesFormularioComisionPena.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralComisionPena();
					
					ComisionPenaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarComisionPenaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComisionPena.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComisionPena.jComboBoxTiposAccionesFormularioComisionPena.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessComisionPena(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesComisionPenaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessComisionPena();
			
			if(this.jInternalFrameDetalleFormComisionPena==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ComisionPena> comisionpenasSeleccionados=new ArrayList<ComisionPena>();		
			ComisionPena comisionpena=new ComisionPena();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingComisionPena(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesComisionPena.getSelectedItem();
			
			
			
			
			comisionpenasSeleccionados=this.getComisionPenasSeleccionados(true);
			//this.sTipoAccion;
			
			if(comisionpenasSeleccionados.size()==1) {
				for(ComisionPena comisionpenaAux:comisionpenasSeleccionados) {
					comisionpena=comisionpenaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessComisionPena();
			
      		//this.finishProcessComisionPena(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarComisionPenaReturnGeneral() throws Exception {
		if(this.comisionpenaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.comisionpenaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.comisionpenaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.comisionpenaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.comisionpenaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.comisionpenaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingComisionPena(false);
		}
		
		if(this.comisionpenaReturnGeneral.getConRetornoLista() || this.comisionpenaReturnGeneral.getConRetornoObjeto()) {
			if(this.comisionpenaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comisionpenaLogic.setComisionPenas(this.comisionpenaReturnGeneral.getComisionPenas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.comisionpenaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comisionpenaLogic.setComisionPena(this.comisionpenaReturnGeneral.getComisionPena());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingComisionPena(false);
		}
	}
	
	public void actualizarParametrosGeneralComisionPena() throws Exception {
		
		
	}
	
	public ArrayList<ComisionPena> getComisionPenasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ComisionPena> comisionpenasSeleccionados=new ArrayList<ComisionPena>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioComisionPena) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ComisionPena comisionpenaAux:comisionpenaLogic.getComisionPenas()) {
					if(comisionpenaAux.getIsSelected()) {
						comisionpenasSeleccionados.add(comisionpenaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionPena comisionpenaAux:this.comisionpenas) {
					if(comisionpenaAux.getIsSelected()) {
						comisionpenasSeleccionados.add(comisionpenaAux);				
					}
				}
			}
			
			if(comisionpenasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						comisionpenasSeleccionados.addAll(this.comisionpenaLogic.getComisionPenas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						comisionpenasSeleccionados.addAll(this.comisionpenas);				
					}
				}
			}
		} else {
			comisionpenasSeleccionados.add(this.comisionpena);
		}
		
		return comisionpenasSeleccionados;
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
	
	public void generarReporteComisionPenasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalComisionPenasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoComisionPenasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComisionPenasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComisionPenasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Penalidad Comision",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesComisionPenasSeleccionados() throws Exception {
		ArrayList<ComisionPena> comisionpenasSeleccionados=new ArrayList<ComisionPena>();		
		
		comisionpenasSeleccionados=this.getComisionPenasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteComisionPenas("Todos",comisionpenasSeleccionados);
		
	}	
	
	public void generarReporteNormalComisionPenasSeleccionados() throws Exception {
		ArrayList<ComisionPena> comisionpenasSeleccionados=new ArrayList<ComisionPena>();		
		
		comisionpenasSeleccionados=this.getComisionPenasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteComisionPenas("Todos",comisionpenasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionComisionPenasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ComisionPena> comisionpenasSeleccionados=new ArrayList<ComisionPena>();
		
		comisionpenasSeleccionados=this.getComisionPenasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteComisionPenas("Todos",comisionpenasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoComisionPenasSeleccionados() throws Exception {
		ArrayList<ComisionPena> comisionpenasSeleccionados=new ArrayList<ComisionPena>();		
		
		
		this.abrirInicializarFrameReporteDinamicoComisionPena();
		
		
		comisionpenasSeleccionados=this.getComisionPenasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoComisionPena();
		
		
		//this.generarReporteComisionPenas("Todos",comisionpenasSeleccionados ,comisionpenaImplementable,comisionpenaImplementableHome);
	}
	
	public void mostrarImportacionComisionPenas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionComisionPena();
		
		this.abrirFrameImportacionComisionPena();		
		
			
		//this.generarReporteComisionPenas("Todos",comisionpenasSeleccionados ,comisionpenaImplementable,comisionpenaImplementableHome);
	}
	
	public void importarComisionPenas() throws Exception {		
	
	}
	
	public void exportarComisionPenasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelComisionPenasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoComisionPenasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlComisionPenasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Penalidad Comision",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoComisionPenasSeleccionados() throws Exception {
		ArrayList<ComisionPena> comisionpenasSeleccionados=new ArrayList<ComisionPena>();		
		
		comisionpenasSeleccionados=this.getComisionPenasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionpena."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarComisionPena(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ComisionPena comisionpenaAux:comisionpenasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarComisionPena(comisionpenaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//comisionpenaAux.setsDetalleGeneralEntityReporte(comisionpenaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionpenaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Penalidad Comision",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarComisionPena(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ComisionPenaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionPenaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionPenaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionPenaConstantesFunciones.LABEL_IDCOMISIONCONFIG;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionPenaConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionPenaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarComisionPena(ComisionPena comisionpena,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=comisionpena.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionpena.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionpena.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionpena.getcomisionconfig_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionpena.getnum_dias_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionpena.getnum_dias_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionpena.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionpena.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelComisionPenasSeleccionados() throws Exception {
		ArrayList<ComisionPena> comisionpenasSeleccionados=new ArrayList<ComisionPena>();		
		
		comisionpenasSeleccionados=this.getComisionPenasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionpena.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ComisionPenas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelComisionPena(row);				
				iRow++;
			}				
			
			for(ComisionPena comisionpenaAux:comisionpenasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelComisionPena(comisionpenaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionpenaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Penalidad Comision",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlComisionPenasSeleccionados() throws Exception {
		ArrayList<ComisionPena> comisionpenasSeleccionados=new ArrayList<ComisionPena>();		
		
		comisionpenasSeleccionados=this.getComisionPenasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionpena.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("comisionpenas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("comisionpena");
			//elementRoot.appendChild(element);
		
			for(ComisionPena comisionpenaAux:comisionpenasSeleccionados) {
				element = document.createElement("comisionpena");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlComisionPena(comisionpenaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionpenaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Penalidad Comision",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelComisionPena(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_IDCOMISIONCONFIG);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionPenaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelComisionPena(ComisionPena comisionpena,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(comisionpena.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionpena.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionpena.getcomisionconfig_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionpena.getnum_dias_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionpena.getnum_dias_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionpena.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionpena.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlComisionPena(ComisionPena comisionpena,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ComisionPenaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(comisionpena.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ComisionPenaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(comisionpena.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ComisionPenaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(comisionpena.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcomisionconfig_descripcion = document.createElement(ComisionPenaConstantesFunciones.IDCOMISIONCONFIG);
		elementcomisionconfig_descripcion.appendChild(document.createTextNode(comisionpena.getcomisionconfig_descripcion()));
		element.appendChild(elementcomisionconfig_descripcion);

		Element elementnum_dias_inicio = document.createElement(ComisionPenaConstantesFunciones.NUMDIASINICIO);
		elementnum_dias_inicio.appendChild(document.createTextNode(comisionpena.getnum_dias_inicio().toString().trim()));
		element.appendChild(elementnum_dias_inicio);

		Element elementnum_dias_fin = document.createElement(ComisionPenaConstantesFunciones.NUMDIASFIN);
		elementnum_dias_fin.appendChild(document.createTextNode(comisionpena.getnum_dias_fin().toString().trim()));
		element.appendChild(elementnum_dias_fin);

		Element elementporcentaje = document.createElement(ComisionPenaConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(comisionpena.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementdescripcion = document.createElement(ComisionPenaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(comisionpena.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoComisionPenasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ComisionPena> comisionpenasSeleccionados=new ArrayList<ComisionPena>();
		
		comisionpenasSeleccionados=this.getComisionPenasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoComisionPena(comisionpenasSeleccionados);
		
		this.generarReporteComisionPenas("Todos",comisionpenasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoComisionPena(ArrayList<ComisionPena> comisionpenasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ComisionPena comisionpenaAux:comisionpenasSeleccionados) {
				comisionpenaAux.setsDetalleGeneralEntityReporte(comisionpenaAux.toString());
			
				if(sTipoSeleccionar.equals(ComisionPenaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					comisionpenaAux.setsDescripcionGeneralEntityReporte1(comisionpenaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionPenaConstantesFunciones.LABEL_IDCOMISIONCONFIG)) {
					existe=true;
					comisionpenaAux.setsDescripcionGeneralEntityReporte1(comisionpenaAux.getcomisionconfig_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionPenaConstantesFunciones.LABEL_NUMDIASINICIO)) {
					existe=true;
					comisionpenaAux.setsDescripcionGeneralEntityReporte1(comisionpenaAux.getnum_dias_inicio().toString());
				}
				 else if(sTipoSeleccionar.equals(ComisionPenaConstantesFunciones.LABEL_NUMDIASFIN)) {
					existe=true;
					comisionpenaAux.setsDescripcionGeneralEntityReporte1(comisionpenaAux.getnum_dias_fin().toString());
				}
				 else if(sTipoSeleccionar.equals(ComisionPenaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					comisionpenaAux.setsDescripcionGeneralEntityReporte1(comisionpenaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionPenaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesComisionPena(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoComisionPena=true;
				this.isVisibilidadCeldaNuevoRelacionesComisionPena=true;
				this.isVisibilidadCeldaGuardarCambiosComisionPena=true;
			}
			
			this.isVisibilidadCeldaModificarComisionPena=false;
			this.isVisibilidadCeldaActualizarComisionPena=false;
			this.isVisibilidadCeldaEliminarComisionPena=false;
			this.isVisibilidadCeldaCancelarComisionPena=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionPena=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionPena=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoComisionPena=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionPena=false;
			this.isVisibilidadCeldaGuardarCambiosComisionPena=false;
			this.isVisibilidadCeldaModificarComisionPena=false;
			this.isVisibilidadCeldaActualizarComisionPena=true;
			this.isVisibilidadCeldaEliminarComisionPena=false;
			this.isVisibilidadCeldaCancelarComisionPena=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionPena=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionPena=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoComisionPena=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionPena=false;
			this.isVisibilidadCeldaGuardarCambiosComisionPena=false;
			this.isVisibilidadCeldaModificarComisionPena=false;
			this.isVisibilidadCeldaActualizarComisionPena=true;
			this.isVisibilidadCeldaEliminarComisionPena=true;
			this.isVisibilidadCeldaCancelarComisionPena=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionPena=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionPena=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoComisionPena=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionPena=false;
			this.isVisibilidadCeldaGuardarCambiosComisionPena=false;
			this.isVisibilidadCeldaModificarComisionPena=false;
			this.isVisibilidadCeldaActualizarComisionPena=true;
			this.isVisibilidadCeldaEliminarComisionPena=false;
			this.isVisibilidadCeldaCancelarComisionPena=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionPena=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionPena=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoComisionPena=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionPena=true;
			this.isVisibilidadCeldaGuardarCambiosComisionPena=true;
			this.isVisibilidadCeldaModificarComisionPena=false;
			this.isVisibilidadCeldaActualizarComisionPena=false;
			this.isVisibilidadCeldaEliminarComisionPena=false;
			this.isVisibilidadCeldaCancelarComisionPena=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionPena=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionPena=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoComisionPena=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionPena=false;
			this.isVisibilidadCeldaGuardarCambiosComisionPena=false;
			this.isVisibilidadCeldaActualizarComisionPena=false;
			this.isVisibilidadCeldaEliminarComisionPena=false;
			this.isVisibilidadCeldaCancelarComisionPena=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionPena=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionPena=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoComisionPena=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionPena=false;
			this.isVisibilidadCeldaGuardarCambiosComisionPena=false;
			this.isVisibilidadCeldaModificarComisionPena=true;
			this.isVisibilidadCeldaActualizarComisionPena=false;
			this.isVisibilidadCeldaEliminarComisionPena=false;
			this.isVisibilidadCeldaCancelarComisionPena=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionPena=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionPena=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ComisionPenaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoComisionPena=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionPena=true;
			this.isVisibilidadCeldaGuardarCambiosComisionPena=true;
		} else {
			this.actualizarEstadoPanelsComisionPena(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarComisionPena=false;
			//this.isVisibilidadCeldaVerFormComisionPena=false;
			this.isVisibilidadCeldaDuplicarComisionPena=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!comisionpenaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesComisionPena=false;
		} else {
			this.isVisibilidadCeldaNuevoComisionPena=false;
			this.isVisibilidadCeldaGuardarCambiosComisionPena=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(comisionpenaSessionBean.getEsGuardarRelacionado()) {
			if(!comisionpenaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesComisionPena=false;												
			}
			
			this.jButtonCerrarComisionPena.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesComisionPena=false;
		}
		
		if(!this.permiteMantenimiento(this.comisionpena)) {
			this.isVisibilidadCeldaActualizarComisionPena=false;
			this.isVisibilidadCeldaEliminarComisionPena=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesComisionPena() {
	}
	
	public void actualizarEstadoPanelsComisionPena(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionComisionPena!=null) {
				this.jScrollPanelDatosEdicionComisionPena.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionPena!=null) {
				this.jTabbedPaneBusquedasComisionPena.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionPena!=null) {
				this.jScrollPanelDatosComisionPena.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionPena!=null) {
				this.jPanelPaginacionComisionPena.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionPena!=null) {
				this.jPanelParametrosReportesComisionPena.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionComisionPena!=null) {
				this.jScrollPanelDatosEdicionComisionPena.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionPena!=null) {
				this.jTabbedPaneBusquedasComisionPena.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosComisionPena!=null) {
				this.jScrollPanelDatosComisionPena.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionPena!=null) {
				this.jPanelPaginacionComisionPena.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionPena!=null) {
				this.jPanelParametrosReportesComisionPena.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionComisionPena!=null) {
				this.jScrollPanelDatosEdicionComisionPena.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionPena!=null) {
				this.jTabbedPaneBusquedasComisionPena.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComisionPena!=null) {
				this.jScrollPanelDatosComisionPena.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionPena!=null) {
				this.jPanelPaginacionComisionPena.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionPena!=null) {
				this.jPanelParametrosReportesComisionPena.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionComisionPena!=null) {
				this.jScrollPanelDatosEdicionComisionPena.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionPena!=null) {
				this.jTabbedPaneBusquedasComisionPena.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComisionPena!=null) {
				this.jScrollPanelDatosComisionPena.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionPena!=null) {
				this.jPanelPaginacionComisionPena.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionPena!=null) {
				this.jPanelParametrosReportesComisionPena.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionComisionPena!=null) {
				this.jScrollPanelDatosEdicionComisionPena.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionPena!=null) {
				this.jTabbedPaneBusquedasComisionPena.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionPena!=null) {
				this.jScrollPanelDatosComisionPena.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionPena!=null) {
				this.jPanelPaginacionComisionPena.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionPena!=null) {
				this.jPanelParametrosReportesComisionPena.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionComisionPena!=null) {
				this.jScrollPanelDatosEdicionComisionPena.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionPena!=null) {
				this.jTabbedPaneBusquedasComisionPena.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionPena!=null) {
				this.jScrollPanelDatosComisionPena.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionPena!=null) {
				this.jPanelPaginacionComisionPena.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionPena!=null) {
				this.jPanelParametrosReportesComisionPena.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionComisionPena!=null) {
				this.jScrollPanelDatosEdicionComisionPena.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionPena!=null) {
				this.jTabbedPaneBusquedasComisionPena.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionPena!=null) {
				this.jScrollPanelDatosComisionPena.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionPena!=null) {
				this.jPanelPaginacionComisionPena.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionPena!=null) {
				this.jPanelParametrosReportesComisionPena.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasComisionPena!=null) {
					this.jTabbedPaneBusquedasComisionPena.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesComisionPena!=null) {
				this.jPanelParametrosReportesComisionPena.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionPena!=null) {
				this.jTabbedPaneBusquedasComisionPena.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesComisionPena!=null) {
				this.jPanelParametrosReportesComisionPena.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdComisionConfig=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionPena.remove(jPanelFK_IdComisionConfigComisionPena);}
		}
		
	}

	public void setVisibilidadBusquedasParaComisionConfig(Boolean isParaComisionConfig){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaComisionConfigNegation=!isParaComisionConfig;

			this.isVisibilidadFK_IdComisionConfig=isParaComisionConfig;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionPena.remove(jPanelFK_IdComisionConfigComisionPena);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ComisionPenaSessionBean comisionpenaSessionBean=new ComisionPenaSessionBean();
		
		if(this.comisionpenaSessionBean==null) {
			this.comisionpenaSessionBean=new ComisionPenaSessionBean();
		}
		
		this.comisionpenaSessionBean.setsUltimaBusquedaComisionPena(this.getsAccionBusqueda());
		this.comisionpenaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.comisionpenaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdComisionConfig")) {
			comisionpenaSessionBean.setid_comision_config(this.getid_comision_configFK_IdComisionConfig());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			comisionpenaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ComisionPenaSessionBean comisionpenaSessionBean=new ComisionPenaSessionBean();
		
		if(this.comisionpenaSessionBean==null) {
			this.comisionpenaSessionBean=new ComisionPenaSessionBean();
		}
		
		if(this.comisionpenaSessionBean.getsUltimaBusquedaComisionPena()!=null&&!this.comisionpenaSessionBean.getsUltimaBusquedaComisionPena().equals("")) {
			this.setsAccionBusqueda(comisionpenaSessionBean.getsUltimaBusquedaComisionPena());
			this.setiNumeroPaginacion(comisionpenaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(comisionpenaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdComisionConfig")) {
				this.setid_comision_configFK_IdComisionConfig(comisionpenaSessionBean.getid_comision_config());
				comisionpenaSessionBean.setid_comision_config(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(comisionpenaSessionBean.getid_empresa());
				comisionpenaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.comisionpenaSessionBean.setsUltimaBusquedaComisionPena("");
		this.comisionpenaSessionBean.setiNumeroPaginacion(ComisionPenaConstantesFunciones.INUMEROPAGINACION);
		this.comisionpenaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaComisionPena(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioComisionPena() {
		this.updateBorderResaltarBusquedasFormularioComisionPena();
		this.updateVisibilidadBusquedasFormularioComisionPena();
		this.updateHabilitarBusquedasFormularioComisionPena();
	}
	
	public void updateBorderResaltarBusquedasFormularioComisionPena() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasComisionPena.getComponents().length>0) {
	

		if(this.comisionpenaConstantesFunciones.resaltarFK_IdComisionConfigComisionPena!=null) {
			index= this.jTabbedPaneBusquedasComisionPena.indexOfComponent(this.jPanelFK_IdComisionConfigComisionPena);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComisionPena.getComponent(index);
				jPanel.setBorder(this.comisionpenaConstantesFunciones.resaltarFK_IdComisionConfigComisionPena);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioComisionPena() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasComisionPena.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComisionPena.indexOfComponent(this.jPanelFK_IdComisionConfigComisionPena);
			jPanel=(JPanel)this.jTabbedPaneBusquedasComisionPena.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.comisionpenaConstantesFunciones.mostrarFK_IdComisionConfigComisionPena);
			if(!this.comisionpenaConstantesFunciones.mostrarFK_IdComisionConfigComisionPena && index>-1) {
				this.jTabbedPaneBusquedasComisionPena.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioComisionPena() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasComisionPena.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComisionPena.indexOfComponent(this.jPanelFK_IdComisionConfigComisionPena);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasComisionPena.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.comisionpenaConstantesFunciones.activarFK_IdComisionConfigComisionPena);
				this.jTabbedPaneBusquedasComisionPena.setEnabledAt(index,this.comisionpenaConstantesFunciones.activarFK_IdComisionConfigComisionPena);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaComisionPena(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdComisionConfig")) {
			index= this.jTabbedPaneBusquedasComisionPena.indexOfComponent(this.jPanelFK_IdComisionConfigComisionPena);

			this.jTabbedPaneBusquedasComisionPena.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComisionPena.getComponent(index);

			this.comisionpenaConstantesFunciones.setResaltarFK_IdComisionConfigComisionPena(resaltar);

			jPanel.setBorder(this.comisionpenaConstantesFunciones.resaltarFK_IdComisionConfigComisionPena);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarComisionPena.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioComisionPena() throws Exception {

		if(this.jInternalFrameDetalleFormComisionPena==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioComisionPena();
		this.updateVisibilidadResaltarControlesFormularioComisionPena();
		this.updateHabilitarResaltarControlesFormularioComisionPena();
		
	}
	
	public void updateBorderResaltarControlesFormularioComisionPena() throws Exception {
		if(this.jInternalFrameDetalleFormComisionPena==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.comisionpenaConstantesFunciones.resaltaridComisionPena!=null && this.jInternalFrameDetalleFormComisionPena!=null) {this.jInternalFrameDetalleFormComisionPena.jLabelidComisionPena.setBorder(this.comisionpenaConstantesFunciones.resaltaridComisionPena);}
		if(this.comisionpenaConstantesFunciones.resaltarid_empresaComisionPena!=null && this.jInternalFrameDetalleFormComisionPena!=null) {this.jInternalFrameDetalleFormComisionPena.jComboBoxid_empresaComisionPena.setBorder(this.comisionpenaConstantesFunciones.resaltarid_empresaComisionPena);}
		if(this.comisionpenaConstantesFunciones.resaltarid_comision_configComisionPena!=null && this.jInternalFrameDetalleFormComisionPena!=null) {this.jInternalFrameDetalleFormComisionPena.jComboBoxid_comision_configComisionPena.setBorder(this.comisionpenaConstantesFunciones.resaltarid_comision_configComisionPena);}
		if(this.comisionpenaConstantesFunciones.resaltarnum_dias_inicioComisionPena!=null && this.jInternalFrameDetalleFormComisionPena!=null) {this.jInternalFrameDetalleFormComisionPena.jTextFieldnum_dias_inicioComisionPena.setBorder(this.comisionpenaConstantesFunciones.resaltarnum_dias_inicioComisionPena);}
		if(this.comisionpenaConstantesFunciones.resaltarnum_dias_finComisionPena!=null && this.jInternalFrameDetalleFormComisionPena!=null) {this.jInternalFrameDetalleFormComisionPena.jTextFieldnum_dias_finComisionPena.setBorder(this.comisionpenaConstantesFunciones.resaltarnum_dias_finComisionPena);}
		if(this.comisionpenaConstantesFunciones.resaltarporcentajeComisionPena!=null && this.jInternalFrameDetalleFormComisionPena!=null) {this.jInternalFrameDetalleFormComisionPena.jTextFieldporcentajeComisionPena.setBorder(this.comisionpenaConstantesFunciones.resaltarporcentajeComisionPena);}
		if(this.comisionpenaConstantesFunciones.resaltardescripcionComisionPena!=null && this.jInternalFrameDetalleFormComisionPena!=null) {this.jInternalFrameDetalleFormComisionPena.jTextAreadescripcionComisionPena.setBorder(this.comisionpenaConstantesFunciones.resaltardescripcionComisionPena);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioComisionPena() throws Exception {		
		if(this.jInternalFrameDetalleFormComisionPena==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) {
	
		//this.jInternalFrameDetalleFormComisionPena.jLabelidComisionPena.setVisible(this.comisionpenaConstantesFunciones.mostraridComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jPanelidComisionPena.setVisible(this.comisionpenaConstantesFunciones.mostraridComisionPena);
		//this.jInternalFrameDetalleFormComisionPena.jComboBoxid_empresaComisionPena.setVisible(this.comisionpenaConstantesFunciones.mostrarid_empresaComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jPanelid_empresaComisionPena.setVisible(this.comisionpenaConstantesFunciones.mostrarid_empresaComisionPena);
		//this.jInternalFrameDetalleFormComisionPena.jComboBoxid_comision_configComisionPena.setVisible(this.comisionpenaConstantesFunciones.mostrarid_comision_configComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jPanelid_comision_configComisionPena.setVisible(this.comisionpenaConstantesFunciones.mostrarid_comision_configComisionPena);
		//this.jInternalFrameDetalleFormComisionPena.jTextFieldnum_dias_inicioComisionPena.setVisible(this.comisionpenaConstantesFunciones.mostrarnum_dias_inicioComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jPanelnum_dias_inicioComisionPena.setVisible(this.comisionpenaConstantesFunciones.mostrarnum_dias_inicioComisionPena);
		//this.jInternalFrameDetalleFormComisionPena.jTextFieldnum_dias_finComisionPena.setVisible(this.comisionpenaConstantesFunciones.mostrarnum_dias_finComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jPanelnum_dias_finComisionPena.setVisible(this.comisionpenaConstantesFunciones.mostrarnum_dias_finComisionPena);
		//this.jInternalFrameDetalleFormComisionPena.jTextFieldporcentajeComisionPena.setVisible(this.comisionpenaConstantesFunciones.mostrarporcentajeComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jPanelporcentajeComisionPena.setVisible(this.comisionpenaConstantesFunciones.mostrarporcentajeComisionPena);
		//this.jInternalFrameDetalleFormComisionPena.jTextAreadescripcionComisionPena.setVisible(this.comisionpenaConstantesFunciones.mostrardescripcionComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jPaneldescripcionComisionPena.setVisible(this.comisionpenaConstantesFunciones.mostrardescripcionComisionPena);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioComisionPena() throws Exception {
		if(this.jInternalFrameDetalleFormComisionPena==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComisionPena!=null) {
	
		this.jInternalFrameDetalleFormComisionPena.jLabelidComisionPena.setEnabled(this.comisionpenaConstantesFunciones.activaridComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jComboBoxid_empresaComisionPena.setEnabled(this.comisionpenaConstantesFunciones.activarid_empresaComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jComboBoxid_comision_configComisionPena.setEnabled(this.comisionpenaConstantesFunciones.activarid_comision_configComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jTextFieldnum_dias_inicioComisionPena.setEnabled(this.comisionpenaConstantesFunciones.activarnum_dias_inicioComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jTextFieldnum_dias_finComisionPena.setEnabled(this.comisionpenaConstantesFunciones.activarnum_dias_finComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jTextFieldporcentajeComisionPena.setEnabled(this.comisionpenaConstantesFunciones.activarporcentajeComisionPena);
		this.jInternalFrameDetalleFormComisionPena.jTextAreadescripcionComisionPena.setEnabled(this.comisionpenaConstantesFunciones.activardescripcionComisionPena);
		}
	}
	
		
}