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

import com.bydan.erp.inventario.util.MedidaProduConstantesFunciones;
import com.bydan.erp.inventario.util.MedidaProduParameterReturnGeneral;
//import com.bydan.erp.inventario.util.MedidaProduParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.MedidaProduBean;
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
public class MedidaProduBeanSwingJInternalFrame extends MedidaProduJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(MedidaProduBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<MedidaProdu> medidaproduValidator = new ClassValidator<MedidaProdu>(MedidaProdu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public MedidaProdu medidaprodu;	
	public MedidaProdu medidaproduAux;
	public MedidaProdu medidaproduAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public MedidaProdu medidaproduTotales;
	public Long idMedidaProduActual;
	public Long iIdNuevoMedidaProdu=0L;
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
	
	public Boolean isPermisoTodoMedidaProdu;
	public Boolean isPermisoNuevoMedidaProdu;
	public Boolean isPermisoActualizarMedidaProdu;
	public Boolean isPermisoActualizarOriginalMedidaProdu;
	public Boolean isPermisoEliminarMedidaProdu;
	public Boolean isPermisoGuardarCambiosMedidaProdu;
	public Boolean isPermisoConsultaMedidaProdu;
	public Boolean isPermisoBusquedaMedidaProdu;
	public Boolean isPermisoReporteMedidaProdu;
	public Boolean isPermisoPaginacionMedioMedidaProdu;
	public Boolean isPermisoPaginacionAltoMedidaProdu;
	public Boolean isPermisoPaginacionTodoMedidaProdu;
	public Boolean isPermisoCopiarMedidaProdu;
	public Boolean isPermisoVerFormMedidaProdu;
	public Boolean isPermisoDuplicarMedidaProdu;
	public Boolean isPermisoOrdenMedidaProdu;
	
	
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
	
	public MedidaProduParameterReturnGeneral medidaproduReturnGeneral;
	public MedidaProduParameterReturnGeneral medidaproduParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoMedidaProdu=false;
	public Boolean esParaAccionDesdeFormularioMedidaProdu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected MedidaProduSessionBeanAdditional medidaproduSessionBeanAdditional=null;
	
	public MedidaProduSessionBeanAdditional getMedidaProduSessionBeanAdditional() {
		return this.medidaproduSessionBeanAdditional;
	}
	
	public void setMedidaProduSessionBeanAdditional(MedidaProduSessionBeanAdditional medidaproduSessionBeanAdditional) {
		try {
			this.medidaproduSessionBeanAdditional=medidaproduSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected MedidaProduBeanSwingJInternalFrameAdditional medidaproduBeanSwingJInternalFrameAdditional=null;
	//public class MedidaProduBeanSwingJInternalFrame
	
	public MedidaProduBeanSwingJInternalFrameAdditional getMedidaProduBeanSwingJInternalFrameAdditional() {
		return this.medidaproduBeanSwingJInternalFrameAdditional;
	}
	
	public void setMedidaProduBeanSwingJInternalFrameAdditional(MedidaProduBeanSwingJInternalFrameAdditional medidaproduBeanSwingJInternalFrameAdditional) {
		try {
			this.medidaproduBeanSwingJInternalFrameAdditional=medidaproduBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public MedidaProduLogic medidaproduLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public MedidaProdu medidaproduBean;
	public MedidaProduConstantesFunciones medidaproduConstantesFunciones;
	//public MedidaProduParameterReturnGeneral medidaproduReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<MedidaProdu> medidaprodus;	
	//public List<MedidaProdu> medidaprodusEliminados;
	//public List<MedidaProdu> medidaprodusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoMedidaProdu=false;
	public Boolean isVisibilidadCeldaDuplicarMedidaProdu=true;
	public Boolean isVisibilidadCeldaCopiarMedidaProdu=true;
	public Boolean isVisibilidadCeldaVerFormMedidaProdu=true;
	public Boolean isVisibilidadCeldaOrdenMedidaProdu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesMedidaProdu=false;
	public Boolean isVisibilidadCeldaModificarMedidaProdu=false;
	public Boolean isVisibilidadCeldaActualizarMedidaProdu=false;
	public Boolean isVisibilidadCeldaEliminarMedidaProdu=false;
	public Boolean isVisibilidadCeldaCancelarMedidaProdu=false;
	public Boolean isVisibilidadCeldaGuardarMedidaProdu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosMedidaProdu=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoMedidaProdu() {
		return this.iIdNuevoMedidaProdu;
	}

	public void setiIdNuevoMedidaProdu(Long iIdNuevoMedidaProdu) {
		this.iIdNuevoMedidaProdu = iIdNuevoMedidaProdu;
	}
	
	public Long getidMedidaProduActual() {
		return this.idMedidaProduActual;
	}

	public void setidMedidaProduActual(Long idMedidaProduActual) {
		this.idMedidaProduActual = idMedidaProduActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public MedidaProdu getmedidaprodu() {
		return this.medidaprodu;
	}

	public void setmedidaprodu(MedidaProdu medidaprodu) {
		this.medidaprodu = medidaprodu;
	}
	
	public MedidaProdu getmedidaproduAux() {
		return this.medidaproduAux;
	}

	public void setmedidaproduAux(MedidaProdu medidaproduAux) {
		this.medidaproduAux = medidaproduAux;
	}				
	
	public MedidaProdu getmedidaproduAnterior() {
		return this.medidaproduAnterior;
	}

	public void setmedidaproduAnterior(MedidaProdu medidaproduAnterior) {
		this.medidaproduAnterior = medidaproduAnterior;
	}	
	
	public MedidaProdu getmedidaproduTotales() {
		return this.medidaproduTotales;
	}

	public void setmedidaproduTotales(MedidaProdu medidaproduTotales) {
		this.medidaproduTotales = medidaproduTotales;
	}	
	
	public MedidaProdu getmedidaproduBean() {
		return this.medidaproduBean;
	}

	public void setmedidaproduBean(MedidaProdu medidaproduBean) {
		this.medidaproduBean = medidaproduBean;
	}	
	
	public MedidaProduParameterReturnGeneral getmedidaproduReturnGeneral() {
		return this.medidaproduReturnGeneral;
	}

	public void setmedidaproduReturnGeneral(MedidaProduParameterReturnGeneral medidaproduReturnGeneral) {
		this.medidaproduReturnGeneral = medidaproduReturnGeneral;
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
	
	
	public MedidaProduLogic getMedidaProduLogic()	{		
		return medidaproduLogic;
	}

	public void setMedidaProduLogic(MedidaProduLogic medidaproduLogic) {
		this.medidaproduLogic = medidaproduLogic;
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
	
	public Boolean getIsEsNuevoMedidaProdu() {
		return isEsNuevoMedidaProdu;
	}

	public void setIsEsNuevoMedidaProdu(Boolean isEsNuevoMedidaProdu) {
		this.isEsNuevoMedidaProdu = isEsNuevoMedidaProdu;
	}

	public Boolean getEsParaAccionDesdeFormularioMedidaProdu() {
		return esParaAccionDesdeFormularioMedidaProdu;
	}
	
	public void setEsParaAccionDesdeFormularioMedidaProdu(Boolean esParaAccionDesdeFormularioMedidaProdu) {
		this.esParaAccionDesdeFormularioMedidaProdu = esParaAccionDesdeFormularioMedidaProdu;
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

			if(this.medidaproduSessionBean==null) {
				this.medidaproduSessionBean=new MedidaProduSessionBean();
			}

			if(!this.medidaproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(medidaproduSessionBean.getlidEmpresaActual());
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

					if(this.medidaprodu!=null) {
						this.medidaprodu.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
						this.jInternalFrameDetalleFormMedidaProdu.jComboBoxid_empresaMedidaProdu.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaMedidaProdu.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
						if(this.jInternalFrameDetalleFormMedidaProdu.jComboBoxid_empresaMedidaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormMedidaProdu.jComboBoxid_empresaMedidaProdu.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaMedidaProduGenerico)throws Exception
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
				jComboBoxid_empresaMedidaProduGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaMedidaProduGenerico!=null && jComboBoxid_empresaMedidaProduGenerico.getItemCount()>0) {
					jComboBoxid_empresaMedidaProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(MedidaProdu medidaprodu,JComboBox jComboBoxid_empresaMedidaProduGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaMedidaProduGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormMedidaProdu.jComboBoxid_empresaMedidaProdu.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaMedidaProduGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				medidaprodu.setid_empresa(empresaAux.getId());
				medidaprodu.setempresa_descripcion(MedidaProduConstantesFunciones.getEmpresaDescripcion(empresaAux));
				medidaprodu.setEmpresa(empresaAux);			}
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

					if(!MedidaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMedidaProdu!=null) { 
							this.jInternalFrameDetalleFormMedidaProdu.jComboBoxid_empresaMedidaProdu.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormMedidaProdu.jComboBoxid_empresaMedidaProdu.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMedidaProdu!=null) { 
					}

					if(!MedidaProduJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
							this.jInternalFrameDetalleFormMedidaProdu.jComboBoxid_empresaMedidaProdu.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
							this.jInternalFrameDetalleFormMedidaProdu.jComboBoxid_empresaMedidaProdu.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesMedidaProdu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			MedidaProduConstantesFunciones.refrescarForeignKeysDescripcionesMedidaProdu(this.medidaproduLogic.getMedidaProdus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			MedidaProduConstantesFunciones.refrescarForeignKeysDescripcionesMedidaProdu(this.medidaprodus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//medidaproduLogic.setMedidaProdus(this.medidaprodus);
			medidaproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public MedidaProduParameterReturnGeneral getMedidaProduParameterGeneral() {
		return this.medidaproduParameterGeneral;
	}
	
	public void setMedidaProduParameterGeneral(MedidaProduParameterReturnGeneral medidaproduParameterGeneral) {
		this.medidaproduParameterGeneral = medidaproduParameterGeneral;
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
	
	public Boolean getIsPermisoTodoMedidaProdu() {
		return isPermisoTodoMedidaProdu;
	}

	public void setIsPermisoTodoMedidaProdu(Boolean isPermisoTodoMedidaProdu) {
		this.isPermisoTodoMedidaProdu = isPermisoTodoMedidaProdu;
	}

	public Boolean getIsPermisoNuevoMedidaProdu() {
		return isPermisoNuevoMedidaProdu;
	}

	public void setIsPermisoNuevoMedidaProdu(Boolean isPermisoNuevoMedidaProdu) {
		this.isPermisoNuevoMedidaProdu = isPermisoNuevoMedidaProdu;
	}

	public Boolean getIsPermisoActualizarMedidaProdu() {
		return isPermisoActualizarMedidaProdu;
	}

	public void setIsPermisoActualizarMedidaProdu(Boolean isPermisoActualizarMedidaProdu) {
		this.isPermisoActualizarMedidaProdu = isPermisoActualizarMedidaProdu;
	}

	public Boolean getIsPermisoEliminarMedidaProdu() {
		return isPermisoEliminarMedidaProdu;
	}

	public void setIsPermisoEliminarMedidaProdu(Boolean isPermisoEliminarMedidaProdu) {
		this.isPermisoEliminarMedidaProdu = isPermisoEliminarMedidaProdu;
	}

	public Boolean getIsPermisoGuardarCambiosMedidaProdu() {
		return isPermisoGuardarCambiosMedidaProdu;
	}

	public void setIsPermisoGuardarCambiosMedidaProdu(Boolean isPermisoGuardarCambiosMedidaProdu) {
		this.isPermisoGuardarCambiosMedidaProdu = isPermisoGuardarCambiosMedidaProdu;
	}
	
	public Boolean getIsPermisoConsultaMedidaProdu() {
		return isPermisoConsultaMedidaProdu;
	}

	public void setIsPermisoConsultaMedidaProdu(Boolean isPermisoConsultaMedidaProdu) {
		this.isPermisoConsultaMedidaProdu = isPermisoConsultaMedidaProdu;
	}

	public Boolean getIsPermisoBusquedaMedidaProdu() {
		return isPermisoBusquedaMedidaProdu;
	}

	public void setIsPermisoBusquedaMedidaProdu(Boolean isPermisoBusquedaMedidaProdu) {
		this.isPermisoBusquedaMedidaProdu = isPermisoBusquedaMedidaProdu;
	}

	public Boolean getIsPermisoReporteMedidaProdu() {
		return isPermisoReporteMedidaProdu;
	}

	public void setIsPermisoReporteMedidaProdu(Boolean isPermisoReporteMedidaProdu) {
		this.isPermisoReporteMedidaProdu = isPermisoReporteMedidaProdu;
	}
	
	public Boolean getIsPermisoPaginacionMedioMedidaProdu() {
		return isPermisoPaginacionMedioMedidaProdu;
	}

	public void setIsPermisoPaginacionMedioMedidaProdu(Boolean isPermisoPaginacionMedioMedidaProdu) {
		this.isPermisoPaginacionMedioMedidaProdu = isPermisoPaginacionMedioMedidaProdu;
	}
	
	public Boolean getIsPermisoPaginacionTodoMedidaProdu() {
		return isPermisoPaginacionTodoMedidaProdu;
	}

	public void setIsPermisoPaginacionTodoMedidaProdu(Boolean isPermisoPaginacionTodoMedidaProdu) {
		this.isPermisoPaginacionTodoMedidaProdu = isPermisoPaginacionTodoMedidaProdu;
	}
	
	public Boolean getIsPermisoPaginacionAltoMedidaProdu() {
		return isPermisoPaginacionAltoMedidaProdu;
	}

	public void setIsPermisoPaginacionAltoMedidaProdu(Boolean isPermisoPaginacionAltoMedidaProdu) {
		this.isPermisoPaginacionAltoMedidaProdu = isPermisoPaginacionAltoMedidaProdu;
	}
	
	public Boolean getIsPermisoCopiarMedidaProdu() {
		return isPermisoCopiarMedidaProdu;
	}

	public void setIsPermisoCopiarMedidaProdu(Boolean isPermisoCopiarMedidaProdu) {
		this.isPermisoCopiarMedidaProdu = isPermisoCopiarMedidaProdu;
	}
	
	public Boolean getIsPermisoVerFormMedidaProdu() {
		return isPermisoVerFormMedidaProdu;
	}

	public void setIsPermisoVerFormMedidaProdu(Boolean isPermisoVerFormMedidaProdu) {
		this.isPermisoVerFormMedidaProdu = isPermisoVerFormMedidaProdu;
	}
	
	public Boolean getIsPermisoDuplicarMedidaProdu() {
		return isPermisoDuplicarMedidaProdu;
	}

	public void setIsPermisoDuplicarMedidaProdu(Boolean isPermisoDuplicarMedidaProdu) {
		this.isPermisoDuplicarMedidaProdu = isPermisoDuplicarMedidaProdu;
	}
	
	public Boolean getIsPermisoOrdenMedidaProdu() {
		return isPermisoOrdenMedidaProdu;
	}

	public void setIsPermisoOrdenMedidaProdu(Boolean isPermisoOrdenMedidaProdu) {
		this.isPermisoOrdenMedidaProdu = isPermisoOrdenMedidaProdu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoMedidaProdu() {
		return isVisibilidadCeldaNuevoMedidaProdu;
	}

	public void setIsVisibilidadCeldaNuevoMedidaProdu(Boolean isVisibilidadCeldaNuevoMedidaProdu) {
		this.isVisibilidadCeldaNuevoMedidaProdu = isVisibilidadCeldaNuevoMedidaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarMedidaProdu() {
		return isVisibilidadCeldaDuplicarMedidaProdu;
	}

	public void setIsVisibilidadCeldaDuplicarMedidaProdu(Boolean isVisibilidadCeldaDuplicarMedidaProdu) {
		this.isVisibilidadCeldaDuplicarMedidaProdu = isVisibilidadCeldaDuplicarMedidaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarMedidaProdu() {
		return isVisibilidadCeldaCopiarMedidaProdu;
	}

	public void setIsVisibilidadCeldaCopiarMedidaProdu(Boolean isVisibilidadCeldaCopiarMedidaProdu) {
		this.isVisibilidadCeldaCopiarMedidaProdu = isVisibilidadCeldaCopiarMedidaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormMedidaProdu() {
		return isVisibilidadCeldaVerFormMedidaProdu;
	}

	public void setIsVisibilidadCeldaVerFormMedidaProdu(Boolean isVisibilidadCeldaVerFormMedidaProdu) {
		this.isVisibilidadCeldaVerFormMedidaProdu = isVisibilidadCeldaVerFormMedidaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenMedidaProdu() {
		return isVisibilidadCeldaOrdenMedidaProdu;
	}

	public void setIsVisibilidadCeldaOrdenMedidaProdu(Boolean isVisibilidadCeldaOrdenMedidaProdu) {
		this.isVisibilidadCeldaOrdenMedidaProdu = isVisibilidadCeldaOrdenMedidaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesMedidaProdu() {
		return isVisibilidadCeldaNuevoRelacionesMedidaProdu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesMedidaProdu(Boolean isVisibilidadCeldaNuevoRelacionesMedidaProdu) {
		this.isVisibilidadCeldaNuevoRelacionesMedidaProdu = isVisibilidadCeldaNuevoRelacionesMedidaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarMedidaProdu() {
		return isVisibilidadCeldaModificarMedidaProdu;
	}

	public void setIsVisibilidadCeldaModificarMedidaProdu(Boolean isVisibilidadCeldaModificarMedidaProdu) {
		this.isVisibilidadCeldaModificarMedidaProdu = isVisibilidadCeldaModificarMedidaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarMedidaProdu() {
		return isVisibilidadCeldaActualizarMedidaProdu;
	}

	public void setIsVisibilidadCeldaActualizarMedidaProdu(Boolean isVisibilidadCeldaActualizarMedidaProdu) {
		this.isVisibilidadCeldaActualizarMedidaProdu = isVisibilidadCeldaActualizarMedidaProdu;
	}

	public Boolean getIsVisibilidadCeldaEliminarMedidaProdu() {
		return isVisibilidadCeldaEliminarMedidaProdu;
	}

	public void setIsVisibilidadCeldaEliminarMedidaProdu(Boolean isVisibilidadCeldaEliminarMedidaProdu) {
		this.isVisibilidadCeldaEliminarMedidaProdu = isVisibilidadCeldaEliminarMedidaProdu;
	}

	public Boolean getIsVisibilidadCeldaCancelarMedidaProdu() {
		return isVisibilidadCeldaCancelarMedidaProdu;
	}

	public void setIsVisibilidadCeldaCancelarMedidaProdu(Boolean isVisibilidadCeldaCancelarMedidaProdu) {
		this.isVisibilidadCeldaCancelarMedidaProdu = isVisibilidadCeldaCancelarMedidaProdu;
	}

	public Boolean getIsVisibilidadCeldaGuardarMedidaProdu() {
		return isVisibilidadCeldaGuardarMedidaProdu;
	}

	public void setIsVisibilidadCeldaGuardarMedidaProdu(Boolean isVisibilidadCeldaGuardarMedidaProdu) {
		this.isVisibilidadCeldaGuardarMedidaProdu = isVisibilidadCeldaGuardarMedidaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosMedidaProdu() {
		return isVisibilidadCeldaGuardarCambiosMedidaProdu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosMedidaProdu(Boolean isVisibilidadCeldaGuardarCambiosMedidaProdu) {
		this.isVisibilidadCeldaGuardarCambiosMedidaProdu = isVisibilidadCeldaGuardarCambiosMedidaProdu;
	}
		
	public MedidaProduSessionBean getmedidaproduSessionBean() {
		return this.medidaproduSessionBean;
	}
	
	public void setmedidaproduSessionBean(MedidaProduSessionBean medidaproduSessionBean) {
		this.medidaproduSessionBean=medidaproduSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysMedidaProdu(MedidaProdu medidaprodu)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(medidaprodu,null);
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
	
	public void bugActualizarReferenciaActual(MedidaProdu medidaprodu,MedidaProdu medidaproduAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalMedidaProdu(medidaprodu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		medidaproduAux.setId(medidaprodu.getId());
		medidaproduAux.setVersionRow(medidaprodu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessMedidaProdu();
		
			int intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaprodu =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.medidaprodu =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(MedidaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualMedidaProdu(this.medidaprodu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysMedidaProdu(this.medidaprodu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = medidaproduValidator.getInvalidValues(this.medidaprodu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			medidaproduLogic.setDatosCliente(datosCliente);
			medidaproduLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				medidaproduAux=new  MedidaProdu();
				
				medidaproduAux.setIsNew(true);
				medidaproduAux.setIsChanged(true);
				
				medidaproduAux.setMedidaProduOriginal(this.medidaprodu);
				
				medidaproduAux.setId(this.medidaprodu.getId());	
				medidaproduAux.setVersionRow(this.medidaprodu.getVersionRow());	
				medidaproduAux.setid_empresa(this.medidaprodu.getid_empresa());	
				medidaproduAux.setnombre(this.medidaprodu.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.medidaproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.medidaproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(medidaproduAux,medidaproduLogic.getMedidaProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(medidaproduAux,medidaprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.medidaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.medidaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						medidaproduLogic.saveMedidaProdus();//WithConnection
						//medidaproduLogic.getSetVersionRowMedidaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.medidaprodu,medidaproduAux);
					
					this.refrescarForeignKeysDescripcionesMedidaProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.medidaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								medidaproduLogic.saveMedidaProduRelaciones(medidaproduAux);//WithConnection
								//medidaproduLogic.getSetVersionRowMedidaProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.medidaprodu,medidaproduAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.medidaproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.medidaproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(medidaproduAux,medidaproduLogic.getMedidaProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(medidaproduAux,medidaprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.medidaprodu,medidaproduAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				medidaproduAux=new  MedidaProdu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.medidaproduSessionBean.getEsGuardarRelacionado() 
					|| (this.medidaproduSessionBean.getEsGuardarRelacionado() && this.medidaprodu.getId()>=0)) {
						
					medidaproduAux.setIsNew(false);
				}
				
				medidaproduAux.setIsDeleted(false);
			
				medidaproduAux.setId(this.medidaprodu.getId());	
				medidaproduAux.setVersionRow(this.medidaprodu.getVersionRow());	
				medidaproduAux.setid_empresa(this.medidaprodu.getid_empresa());	
				medidaproduAux.setnombre(this.medidaprodu.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(medidaproduAux,medidaproduLogic.getMedidaProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(medidaproduAux,medidaprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.medidaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.medidaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						medidaproduLogic.saveMedidaProdus();//WithConnection
						//medidaproduLogic.getSetVersionRowMedidaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.medidaprodu,medidaproduAux);
					
					this.refrescarForeignKeysDescripcionesMedidaProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.medidaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								medidaproduLogic.saveMedidaProduRelaciones(medidaproduAux);//WithConnection
								//medidaproduLogic.getSetVersionRowMedidaProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.medidaprodu,medidaproduAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.medidaproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.medidaproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(medidaproduAux,medidaproduLogic.getMedidaProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(medidaproduAux,medidaprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.medidaprodu,medidaproduAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				medidaproduAux=new  MedidaProdu();
				
				medidaproduAux.setIsNew(false);
				medidaproduAux.setIsChanged(false);
				
				medidaproduAux.setIsDeleted(true);
				
				medidaproduAux.setId(this.medidaprodu.getId());	
				medidaproduAux.setVersionRow(this.medidaprodu.getVersionRow());	
				medidaproduAux.setid_empresa(this.medidaprodu.getid_empresa());	
				medidaproduAux.setnombre(this.medidaprodu.getnombre());	
				
				if(this.medidaproduSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.medidaproduAux.getId()>=0) {	
						this.medidaprodusEliminados.add(medidaproduAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(medidaproduAux,medidaproduLogic.getMedidaProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(medidaproduAux,medidaprodus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.medidaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.medidaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						medidaproduLogic.saveMedidaProdus();//WithConnection
						//medidaproduLogic.getSetVersionRowMedidaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.medidaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								medidaproduLogic.saveMedidaProduRelaciones(medidaproduAux);//WithConnection
								//medidaproduLogic.getSetVersionRowMedidaProdus();//WithConnection
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
							if(this.medidaproduSessionBean.getEstaModoGuardarRelaciones() 
								|| this.medidaproduSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(medidaproduAux,medidaproduLogic.getMedidaProdus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(medidaproduAux,medidaprodus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduLogic.getMedidaProdus().addAll(this.medidaprodusEliminados);
					
					medidaproduLogic.saveMedidaProdus();//WithConnection
					//medidaproduLogic.getSetVersionRowMedidaProdus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesMedidaProdu();
				
				this.medidaprodusEliminados= new ArrayList<MedidaProdu>();		
			}
			
			if(this.medidaproduSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.medidaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Medida Produ GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Medida Produ",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.medidaprodu=medidaproduAux;
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
      		//this.finishProcessMedidaProdu();
      	}
		
	}	
	
	public void actualizarRelaciones(MedidaProdu medidaproduLocal) throws Exception {
		
		if(this.medidaproduSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(MedidaProdu medidaproduLocal) throws Exception {	
		if(this.medidaproduSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				medidaproduLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarMedidaProduActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.medidaprodu =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.medidaprodu =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = medidaproduValidator.getInvalidValues(this.medidaprodu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(MedidaProdu medidaprodu,List<MedidaProdu> medidaprodus) throws Exception {
		try	{		
			MedidaProduConstantesFunciones.actualizarLista(medidaprodu,medidaprodus,this.medidaproduSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(MedidaProdu medidaprodu,List<MedidaProdu> medidaprodus) throws Exception {
		try	{			
			MedidaProduConstantesFunciones.actualizarSelectedLista(medidaprodu,medidaprodus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<MedidaProdu> medidaprodusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				medidaprodusLocal=this.medidaproduLogic.getMedidaProdus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				medidaprodusLocal=this.medidaprodus;
			}
			//ARCHITECTURE
		
			for(MedidaProdu medidaproduLocal:medidaprodusLocal) {
				if(this.permiteMantenimiento(medidaproduLocal) && medidaproduLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+MedidaProduConstantesFunciones.getMedidaProduLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(MedidaProduConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMedidaProdu.jLabelid_empresaMedidaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MedidaProduConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMedidaProdu.jLabelnombreMedidaProdu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMedidaProdu.jLabelid_empresaMedidaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMedidaProdu.jLabelnombreMedidaProdu,"");
		
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
		this.iIdNuevoMedidaProdu--;	
		
		
		this.medidaproduAux=new MedidaProdu();
		
		this.medidaproduAux.setId(this.iIdNuevoMedidaProdu);
		this.medidaproduAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.medidaproduLogic.getMedidaProdus().add(this.medidaproduAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.medidaprodus.add(this.medidaproduAux);
		}
		//ARCHITECTURE
		
		this.medidaprodu=this.medidaproduAux;
		
		if(MedidaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioMedidaProdu(this.medidaprodu);
			this.setVariablesObjetoActualToFormularioForeignKeyMedidaProdu(this.medidaprodu);
		}
				
		//this.setDefaultControlesMedidaProdu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyMedidaProdu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyMedidaProdu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyMedidaProdu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMedidaProdu(this.medidaproduBean,this.medidaprodu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysMedidaProdu(this.medidaprodu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(MedidaProduConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.medidaproduSessionBean.getConGuardarRelaciones()) {
			classes=MedidaProduConstantesFunciones.getClassesRelationshipsOfMedidaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.medidaproduReturnGeneral=medidaproduLogic.procesarEventosMedidaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.medidaproduLogic.getMedidaProdus(),this.medidaprodu,this.medidaproduParameterGeneral,this.isEsNuevoMedidaProdu,classes);//this.medidaproduLogic.getMedidaProdu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanMedidaProdu(this.medidaproduReturnGeneral,this.medidaproduBean,false);
		
		if(this.medidaproduReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyMedidaProdu(this.medidaproduReturnGeneral.getMedidaProdu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioMedidaProdu(this.medidaproduReturnGeneral.getMedidaProdu());
		}
		
		if(this.medidaproduReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioMedidaProdu(this.medidaproduReturnGeneral.getMedidaProdu(),classes);//this.medidaproduBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualMedidaProdu(this.medidaprodu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyMedidaProdu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyMedidaProdu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MedidaProduBeanSwingJInternalFrameAdditional.RecargarFormMedidaProdu(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingMedidaProdu(false);
						
			if(medidaproduSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(MedidaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMedidaProdu();
			}
			
			this.actualizarVisualTableDatosMedidaProdu();
			
			this.jTableDatosMedidaProdu.setRowSelectionInterval(this.getIndiceNuevoMedidaProdu(), this.getIndiceNuevoMedidaProdu());
			
			this.seleccionarFilaTablaMedidaProduActual();
						
			this.actualizarEstadoCeldasBotonesMedidaProdu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesMedidaProdu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormMedidaProdu.jTextAreanombreMedidaProdu.setEnabled(isHabilitar && this.medidaproduConstantesFunciones.activarnombreMedidaProdu);	
		//
		this.jInternalFrameDetalleFormMedidaProdu.jComboBoxid_empresaMedidaProdu.setEnabled(isHabilitar && this.medidaproduConstantesFunciones.activarid_empresaMedidaProdu);
	};
	
	public void setDefaultControlesMedidaProdu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoMedidaProdu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.medidaproduSessionBean.setConGuardarRelaciones(true);			
			this.medidaproduSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormMedidaProdu.jTabbedPaneRelacionesMedidaProdu.setVisible(true);
			
					
		} else {
			//this.medidaproduSessionBean.setConGuardarRelaciones(false);			
			this.medidaproduSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormMedidaProdu.jTabbedPaneRelacionesMedidaProdu.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoMedidaProdu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MedidaProdu medidaproduAux:this.medidaproduLogic.getMedidaProdus()) {
				if(medidaproduAux.getId().equals(this.iIdNuevoMedidaProdu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MedidaProdu medidaproduAux:this.medidaprodus) {
				if(medidaproduAux.getId().equals(this.iIdNuevoMedidaProdu)) {
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
	
	public int getIndiceActualMedidaProdu(MedidaProdu medidaprodu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MedidaProdu medidaproduAux:this.medidaproduLogic.getMedidaProdus()) {
				if(medidaproduAux.getId().equals(medidaprodu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MedidaProdu medidaproduAux:this.medidaprodus) {
				if(medidaproduAux.getId().equals(medidaprodu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalMedidaProdu(MedidaProdu medidaproduOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MedidaProdu medidaproduAux:this.medidaproduLogic.getMedidaProdus()) {
				if(medidaproduAux.getMedidaProduOriginal().getId().equals(medidaproduOriginal.getId())) {
					existe=true;
					medidaproduOriginal.setId(medidaproduAux.getId());
					medidaproduOriginal.setVersionRow(medidaproduAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MedidaProdu medidaproduAux:this.medidaprodus) {
				if(medidaproduAux.getMedidaProduOriginal().getId().equals(medidaproduOriginal.getId())) {
					existe=true;
					medidaproduOriginal.setId(medidaproduAux.getId());
					medidaproduOriginal.setVersionRow(medidaproduAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosMedidaProdu(Boolean esParaCancelar) throws Exception {
		medidaprodusAux=new ArrayList<MedidaProdu>();
		medidaproduAux=new MedidaProdu();
		
		if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MedidaProdu medidaproduAux:this.medidaproduLogic.getMedidaProdus()) {
					if(medidaproduAux.getId()<0) {
						medidaprodusAux.add(medidaproduAux);
					}		
				}
				this.iIdNuevoMedidaProdu=0L;
				this.medidaproduLogic.getMedidaProdus().removeAll(medidaprodusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MedidaProdu medidaproduAux:this.medidaprodus) {
					if(medidaproduAux.getId()<0) {
						medidaprodusAux.add(medidaproduAux);
					}		
				}
				this.iIdNuevoMedidaProdu=0L;
				this.medidaprodus.removeAll(medidaprodusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoMedidaProdu 
					&& this.medidaproduLogic.getMedidaProdus().size()>0
					) {
					medidaproduAux=this.medidaproduLogic.getMedidaProdus().get(this.medidaproduLogic.getMedidaProdus().size() - 1);
				
					if(medidaproduAux.getId()<0) {
						this.medidaproduLogic.getMedidaProdus().remove(medidaproduAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoMedidaProdu && this.medidaprodus.size()>0) {
					medidaproduAux=this.medidaprodus.get(this.medidaprodus.size() - 1);
				
					if(medidaproduAux.getId()<0) {
						this.medidaprodus.remove(medidaproduAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoMedidaProdu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(medidaprodu.getId()<0) {
				this.medidaproduLogic.getMedidaProdus().remove(this.medidaprodu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(medidaprodu.getId()<0) {
				this.medidaprodus.remove(this.medidaprodu);
			}
		}			
	}
	
	public void setEstadosInicialesMedidaProdu(List<MedidaProdu> medidaprodusAux) throws Exception {
		MedidaProduConstantesFunciones.setEstadosInicialesMedidaProdu(medidaprodusAux);
	}
	
	public void setEstadosInicialesMedidaProdu(MedidaProdu medidaproduAux) throws Exception {
		MedidaProduConstantesFunciones.setEstadosInicialesMedidaProdu(medidaproduAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarMedidaProduActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesMedidaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarMedidaProduActual()) {
				if(!this.isEsNuevoMedidaProdu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesMedidaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoMedidaProdu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarMedidaProduActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Medida Produ ?", "MANTENIMIENTO DE Medida Produ", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesMedidaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(MedidaProdu medidaprodu) throws Exception {
		MedidaProduConstantesFunciones.seleccionarAsignar(this.medidaprodu,medidaprodu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarMedidaProdu=this.isPermisoActualizarOriginalMedidaProdu;
			
			
			this.seleccionarAsignar(medidaprodu);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MedidaProduConstantesFunciones.quitarEspaciosMedidaProdu(this.medidaprodu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesMedidaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.medidaproduSessionBean.setsFuncionBusquedaRapida(this.medidaproduSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoMedidaProdu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosMedidaProdu(esParaCancelar);				
				this.cancelarNuevoMedidaProdu(esParaCancelar);								
			}
			
			this.medidaprodu=new MedidaProdu();
			
			this.inicializarMedidaProdu();
			
			this.actualizarEstadoCeldasBotonesMedidaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarMedidaProdu() throws Exception {
		try {
			MedidaProduConstantesFunciones.inicializarMedidaProdu(this.medidaprodu);
			
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
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.medidaproduLogic.getMedidaProdus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteMedidaProdus(String sAccionBusqueda,List<MedidaProdu> medidaprodusParaReportes) throws Exception {
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
					sPathReporteFinal="MedidaProdu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="MedidaProduMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("MedidaProduMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="MedidaProdu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Medida Produs");		
		parameters.put("busquedapor", MedidaProduConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceMedidaProdu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			MedidaProduConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			MedidaProduConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceMedidaProdu=new JRBeanArrayDataSource(MedidaProduJInternalFrame.TraerMedidaProduBeans(medidaprodusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceMedidaProdu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+MedidaProduConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+MedidaProduConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(MedidaProduBean.TraerMedidaProduBeans(medidaprodusParaReportes).toArray()));
							
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
				this.generarExcelReporteMedidaProdus(sAccionBusqueda,sTipoArchivoReporte,medidaprodusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalMedidaProdus(sAccionBusqueda,sTipoArchivoReporte,medidaprodusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoMedidaProduActionPerformed(null);
					//this.generarExcelReporteMedidaProdus(sAccionBusqueda,sTipoArchivoReporte,medidaprodusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalMedidaProdus(sAccionBusqueda,sTipoArchivoReporte,medidaprodusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesMedidaProdus(sAccionBusqueda,sTipoArchivoReporte,medidaprodusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesMedidaProdus(sAccionBusqueda,sTipoArchivoReporte,medidaprodusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteMedidaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<MedidaProdu> medidaprodusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"medidaprodu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MedidaProdus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMedidaProdu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(MedidaProdu medidaprodu : medidaprodusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			MedidaProduConstantesFunciones.generarExcelReporteDataMedidaProdu("NORMAL",row,workbook,medidaprodu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.medidaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Medida Produ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderMedidaProdu(String sTipo,Row row,Workbook workbook) {
		
		MedidaProduConstantesFunciones.generarExcelReporteHeaderMedidaProdu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalMedidaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<MedidaProdu> medidaprodusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"medidaprodu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MedidaProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(MedidaProdu medidaprodu : medidaprodusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(MedidaProduConstantesFunciones.getMedidaProduDescripcion(medidaprodu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MedidaProduConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MedidaProduConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(medidaprodu.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MedidaProduConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MedidaProduConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(medidaprodu.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.medidaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Medida Produ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesMedidaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<MedidaProdu> medidaprodusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<MedidaProdu> medidaprodusRespaldo=null;
		
		classes=MedidaProduConstantesFunciones.getClassesRelationshipsOfMedidaProdu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.medidaproduLogic.setDatosCliente(this.datosCliente);
		this.medidaproduLogic.setDatosDeep(this.datosDeep);
		this.medidaproduLogic.setIsConDeep(true);
		
		medidaprodusRespaldo=this.medidaproduLogic.getMedidaProdus();
		
		this.medidaproduLogic.setMedidaProdus(medidaprodusParaReportes);	
		this.medidaproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		medidaprodusParaReportes=this.medidaproduLogic.getMedidaProdus();
		this.medidaproduLogic.setMedidaProdus(medidaprodusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"medidaprodu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MedidaProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMedidaProdu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(MedidaProdu medidaprodu : medidaprodusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderMedidaProdu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			MedidaProduConstantesFunciones.generarExcelReporteDataMedidaProdu("NORMAL",row,workbook,medidaprodu,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(MedidaProduConstantesFunciones.getMedidaProduDescripcion(medidaprodu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.medidaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Medida Produ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoMedidaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMedidaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoMedidaProdu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMedidaProdu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessMedidaProdu() throws Exception {		
		this.startProcessMedidaProdu(true);
	}
	
	public void startProcessMedidaProdu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasMedidaProdu ,this.jPanelParametrosReportesMedidaProdu, this.jScrollPanelDatosMedidaProdu,this.jPanelPaginacionMedidaProdu, this.jScrollPanelDatosEdicionMedidaProdu, this.jPanelAccionesMedidaProdu,this.jPanelAccionesFormularioMedidaProdu,this.jmenuBarMedidaProdu,this.jmenuBarDetalleMedidaProdu,this.jTtoolBarMedidaProdu,this.jTtoolBarDetalleMedidaProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasMedidaProdu=this.jTabbedPaneBusquedasMedidaProdu; 
		
		final JPanel jPanelParametrosReportesMedidaProdu=this.jPanelParametrosReportesMedidaProdu;
		//final JScrollPane jScrollPanelDatosMedidaProdu=this.jScrollPanelDatosMedidaProdu;
		final JTable jTableDatosMedidaProdu=this.jTableDatosMedidaProdu;		
		final JPanel jPanelPaginacionMedidaProdu=this.jPanelPaginacionMedidaProdu;
		//final JScrollPane jScrollPanelDatosEdicionMedidaProdu=this.jScrollPanelDatosEdicionMedidaProdu;
		final JPanel jPanelAccionesMedidaProdu=this.jPanelAccionesMedidaProdu;
		
		JPanel jPanelCamposAuxiliarMedidaProdu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarMedidaProdu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
			jPanelCamposAuxiliarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jPanelCamposMedidaProdu;
			jPanelAccionesFormularioAuxiliarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jPanelAccionesFormularioMedidaProdu;
		}
		
		final JPanel jPanelCamposMedidaProdu=jPanelCamposAuxiliarMedidaProdu;
		final JPanel jPanelAccionesFormularioMedidaProdu=jPanelAccionesFormularioAuxiliarMedidaProdu;
		
		
		final JMenuBar jmenuBarMedidaProdu=this.jmenuBarMedidaProdu;
		final JToolBar jTtoolBarMedidaProdu=this.jTtoolBarMedidaProdu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarMedidaProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMedidaProdu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
			jmenuBarDetalleAuxiliarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jmenuBarDetalleMedidaProdu;
			jTtoolBarDetalleAuxiliarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jTtoolBarDetalleMedidaProdu;
		}
		
		final JMenuBar jmenuBarDetalleMedidaProdu=jmenuBarDetalleAuxiliarMedidaProdu;
		final JToolBar jTtoolBarDetalleMedidaProdu=jTtoolBarDetalleAuxiliarMedidaProdu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMedidaProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMedidaProdu;
			processRunnable.jTableDatos=jTableDatosMedidaProdu;
			processRunnable.jPanelCampos=jPanelCamposMedidaProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionMedidaProdu;
			processRunnable.jPanelAcciones=jPanelAccionesMedidaProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMedidaProdu;
			
			
			processRunnable.jmenuBar=jmenuBarMedidaProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMedidaProdu;
			processRunnable.jTtoolBar=jTtoolBarMedidaProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMedidaProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMedidaProdu ,jPanelParametrosReportesMedidaProdu,jTableDatosMedidaProdu, /*jScrollPanelDatosMedidaProdu,*/jPanelCamposMedidaProdu,jPanelPaginacionMedidaProdu, /*jScrollPanelDatosEdicionMedidaProdu,*/ jPanelAccionesMedidaProdu,jPanelAccionesFormularioMedidaProdu,jmenuBarMedidaProdu,jmenuBarDetalleMedidaProdu,jTtoolBarMedidaProdu,jTtoolBarDetalleMedidaProdu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMedidaProdu ,jPanelParametrosReportesMedidaProdu, jScrollPanelDatosMedidaProdu,jPanelPaginacionMedidaProdu, jScrollPanelDatosEdicionMedidaProdu, jPanelAccionesMedidaProdu,jPanelAccionesFormularioMedidaProdu,jmenuBarMedidaProdu,jmenuBarDetalleMedidaProdu,jTtoolBarMedidaProdu,jTtoolBarDetalleMedidaProdu);
						
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
	
	public void finishProcessMedidaProdu() {// throws Exception 
		this.finishProcessMedidaProdu(true);
	}
	
	public void finishProcessMedidaProdu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasMedidaProdu ,this.jPanelParametrosReportesMedidaProdu, this.jScrollPanelDatosMedidaProdu,this.jPanelPaginacionMedidaProdu, this.jScrollPanelDatosEdicionMedidaProdu, this.jPanelAccionesMedidaProdu,this.jPanelAccionesFormularioMedidaProdu,this.jmenuBarMedidaProdu,this.jmenuBarDetalleMedidaProdu,this.jTtoolBarMedidaProdu,this.jTtoolBarDetalleMedidaProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasMedidaProdu=this.jTabbedPaneBusquedasMedidaProdu; 
		
		final JPanel jPanelParametrosReportesMedidaProdu=this.jPanelParametrosReportesMedidaProdu;
		//final JScrollPane jScrollPanelDatosMedidaProdu=this.jScrollPanelDatosMedidaProdu;
		final JTable jTableDatosMedidaProdu=this.jTableDatosMedidaProdu;		
		final JPanel jPanelPaginacionMedidaProdu=this.jPanelPaginacionMedidaProdu;
		//final JScrollPane jScrollPanelDatosEdicionMedidaProdu=this.jScrollPanelDatosEdicionMedidaProdu;
		final JPanel jPanelAccionesMedidaProdu=this.jPanelAccionesMedidaProdu;
		
		JPanel jPanelCamposAuxiliarMedidaProdu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarMedidaProdu=new JPanel();
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
			jPanelCamposAuxiliarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jPanelCamposMedidaProdu;
			jPanelAccionesFormularioAuxiliarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jPanelAccionesFormularioMedidaProdu;
		}
		
		final JPanel jPanelCamposMedidaProdu=jPanelCamposAuxiliarMedidaProdu;
		final JPanel jPanelAccionesFormularioMedidaProdu=jPanelAccionesFormularioAuxiliarMedidaProdu;
		
		
		final JMenuBar jmenuBarMedidaProdu=this.jmenuBarMedidaProdu;		
		final JToolBar jTtoolBarMedidaProdu=this.jTtoolBarMedidaProdu;
				
		JMenuBar jmenuBarDetalleAuxiliarMedidaProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMedidaProdu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
			jmenuBarDetalleAuxiliarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jmenuBarDetalleMedidaProdu;
			jTtoolBarDetalleAuxiliarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jTtoolBarDetalleMedidaProdu;		
		}
		
		final JMenuBar jmenuBarDetalleMedidaProdu=jmenuBarDetalleAuxiliarMedidaProdu;
		final JToolBar jTtoolBarDetalleMedidaProdu=jTtoolBarDetalleAuxiliarMedidaProdu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMedidaProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMedidaProdu;
			processRunnable.jTableDatos=jTableDatosMedidaProdu;
			processRunnable.jPanelCampos=jPanelCamposMedidaProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionMedidaProdu;
			processRunnable.jPanelAcciones=jPanelAccionesMedidaProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMedidaProdu;
			
			
			processRunnable.jmenuBar=jmenuBarMedidaProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMedidaProdu;
			processRunnable.jTtoolBar=jTtoolBarMedidaProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMedidaProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasMedidaProdu ,jPanelParametrosReportesMedidaProdu, jTableDatosMedidaProdu,/*jScrollPanelDatosMedidaProdu,*/jPanelCamposMedidaProdu,jPanelPaginacionMedidaProdu, /*jScrollPanelDatosEdicionMedidaProdu,*/ jPanelAccionesMedidaProdu,jPanelAccionesFormularioMedidaProdu,jmenuBarMedidaProdu,jmenuBarDetalleMedidaProdu,jTtoolBarMedidaProdu,jTtoolBarDetalleMedidaProdu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesMedidaProdu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarMedidaProdu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuMedidaProdu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarMedidaProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarMedidaProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleMedidaProdu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuMedidaProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarMedidaProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleMedidaProdu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.medidaproduConstantesFunciones.getsFinalQueryMedidaProdu();
		String  finalQueryPaginacionTodos=this.medidaproduConstantesFunciones.getsFinalQueryMedidaProdu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=MedidaProduConstantesFunciones.getArrayColumnasGlobalesNoMedidaProdu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=MedidaProduConstantesFunciones.getArrayColumnasGlobalesMedidaProdu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,MedidaProduConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.medidaprodusEliminados= new ArrayList<MedidaProdu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessMedidaProdu();
		
				///*MedidaProduSessionBean*/this.medidaproduSessionBean=new MedidaProduSessionBean();
			
			if(this.medidaproduSessionBean==null) {
				this.medidaproduSessionBean=new MedidaProduSessionBean();
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
					this.iNumeroPaginacion=MedidaProduConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=MedidaProduConstantesFunciones.getClassesForeignKeysOfMedidaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/medidaprodu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			medidaprodusAux= new ArrayList<MedidaProdu>();
			
				
			medidaproduLogic.setDatosCliente(this.datosCliente);
			medidaproduLogic.setDatosDeep(this.datosDeep);
			medidaproduLogic.setIsConDeep(true);
			
			
			medidaproduLogic.getMedidaProduDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					medidaproduLogic.getTodosMedidaProdus(finalQueryGlobal,pagination);
					
					//medidaproduLogic.getTodosMedidaProdusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(medidaproduLogic.getMedidaProdus()==null|| medidaproduLogic.getMedidaProdus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							medidaprodusAux= new ArrayList<MedidaProdu>();
							medidaprodusAux.addAll(medidaproduLogic.getMedidaProdus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							medidaprodusAux= new ArrayList<MedidaProdu>();
							medidaprodusAux.addAll(medidaprodus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							medidaproduLogic.getTodosMedidaProdus(finalQueryGlobal+"",this.pagination);												
							
							//medidaproduLogic.getTodosMedidaProdusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteMedidaProdus("Todos",medidaproduLogic.getMedidaProdus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							medidaproduLogic.setMedidaProdus(new ArrayList<MedidaProdu>());					
							medidaproduLogic.getMedidaProdus().addAll(medidaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							medidaprodus=new ArrayList<MedidaProdu>();
							medidaprodus.addAll(medidaprodusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idMedidaProdu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idMedidaProdu=this.idActual;
				
				} else if(this.idMedidaProduActual!=null && this.idMedidaProduActual!=0L) {
					idMedidaProdu=idMedidaProduActual;
				}
				
					
				this.sDetalleReporte=MedidaProduConstantesFunciones.getDetalleIndicePorId(idMedidaProdu);
				
				this.medidaprodus=new ArrayList<MedidaProdu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					medidaproduLogic.getEntity(idMedidaProdu);
					
					//medidaproduLogic.getEntityWithConnection(idMedidaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					medidaproduLogic.setMedidaProdus(new ArrayList<MedidaProdu>());
					medidaproduLogic.getMedidaProdus().add(medidaproduLogic.getMedidaProdu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.medidaprodus=new ArrayList<MedidaProdu>();
					this.medidaprodus.add(medidaprodu);
				}
				
				if(medidaproduLogic.getMedidaProdu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=MedidaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					medidaproduLogic.getMedidaProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MedidaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MedidaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=medidaproduLogic.getMedidaProdus()==null||medidaproduLogic.getMedidaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=medidaprodus==null|| medidaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						medidaprodusAux=new ArrayList<MedidaProdu>();
						medidaprodusAux.addAll(medidaproduLogic.getMedidaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							medidaprodusAux=new ArrayList<MedidaProdu>();
							medidaprodusAux.addAll(medidaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							medidaproduLogic.getMedidaProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MedidaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MedidaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMedidaProdus("FK_IdEmpresa",medidaproduLogic.getMedidaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMedidaProdus("FK_IdEmpresa",medidaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						medidaproduLogic.setMedidaProdus(new ArrayList<MedidaProdu>());
						medidaproduLogic.getMedidaProdus().addAll(medidaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							medidaprodus=new ArrayList<MedidaProdu>();
							medidaprodus.addAll(medidaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesMedidaProdu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessMedidaProdu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=medidaproduLogic.getMedidaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=medidaprodus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=medidaproduLogic.getMedidaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=medidaprodus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(MedidaProdu medidaprodu) {
		Boolean permite=true;
		
		if(this.medidaprodu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=MedidaProduConstantesFunciones.getOrderByListaMedidaProdu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=MedidaProduConstantesFunciones.getOrderByListaMedidaProdu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MedidaProdu medidaprodu:medidaproduLogic.getMedidaProdus()) {
				if(medidaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					medidaproduTotales=medidaprodu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MedidaProdu medidaprodu:this.medidaprodus) {
				if(medidaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					medidaproduTotales=medidaprodu;
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
			this.medidaproduAux=new MedidaProdu();
			this.medidaproduAux.setsType(Constantes2.S_TOTALES);
			this.medidaproduAux.setIsNew(false);
			this.medidaproduAux.setIsChanged(false);
			this.medidaproduAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				MedidaProduConstantesFunciones.TotalizarValoresFilaMedidaProdu(this.medidaproduLogic.getMedidaProdus(),this.medidaproduAux);
				
				this.medidaproduLogic.getMedidaProdus().add(this.medidaproduAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				MedidaProduConstantesFunciones.TotalizarValoresFilaMedidaProdu(this.medidaprodus,this.medidaproduAux);
				
				this.medidaprodus.add(this.medidaproduAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		medidaproduTotales=new MedidaProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.medidaproduLogic.getMedidaProdus().remove(medidaproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.medidaprodus.remove(medidaproduTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		medidaproduTotales=new MedidaProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MedidaProdu medidaprodu:medidaproduLogic.getMedidaProdus()) {
				if(medidaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					medidaproduTotales=medidaprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MedidaProduConstantesFunciones.TotalizarValoresFilaMedidaProdu(this.medidaproduLogic.getMedidaProdus(),medidaproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MedidaProdu medidaprodu:this.medidaprodus) {
				if(medidaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					medidaproduTotales=medidaprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MedidaProduConstantesFunciones.TotalizarValoresFilaMedidaProdu(this.medidaprodus,medidaproduTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getMedidaProdusFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getMedidaProdusFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					medidaproduLogic.getMedidaProdusFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosMedidaProdu() {
		this.isPermisoTodoMedidaProdu=false;
		this.isPermisoNuevoMedidaProdu=false;
		this.isPermisoActualizarMedidaProdu=false;
		this.isPermisoActualizarOriginalMedidaProdu=false;
		this.isPermisoEliminarMedidaProdu=false;
		this.isPermisoGuardarCambiosMedidaProdu=false;
		this.isPermisoConsultaMedidaProdu=false;
		this.isPermisoBusquedaMedidaProdu=false;
		this.isPermisoReporteMedidaProdu=false;		
		this.isPermisoOrdenMedidaProdu=false;		
		this.isPermisoPaginacionMedioMedidaProdu=false;		
		this.isPermisoPaginacionAltoMedidaProdu=false;
		this.isPermisoPaginacionTodoMedidaProdu=false;
		this.isPermisoCopiarMedidaProdu=false;		
		this.isPermisoVerFormMedidaProdu=false;		
		this.isPermisoDuplicarMedidaProdu=false;		
		this.isPermisoOrdenMedidaProdu=false;		
	}
	
	public void setPermisosUsuarioMedidaProdu(Boolean isPermiso) {
		this.isPermisoTodoMedidaProdu=isPermiso;
		this.isPermisoNuevoMedidaProdu=isPermiso;
		this.isPermisoActualizarMedidaProdu=isPermiso;
		this.isPermisoActualizarOriginalMedidaProdu=isPermiso;
		this.isPermisoEliminarMedidaProdu=isPermiso;
		this.isPermisoGuardarCambiosMedidaProdu=isPermiso;
		this.isPermisoConsultaMedidaProdu=isPermiso;
		this.isPermisoBusquedaMedidaProdu=isPermiso;
		this.isPermisoReporteMedidaProdu=isPermiso;
		this.isPermisoOrdenMedidaProdu=isPermiso;		
		this.isPermisoPaginacionMedioMedidaProdu=isPermiso;		
		this.isPermisoPaginacionAltoMedidaProdu=isPermiso;		
		this.isPermisoPaginacionTodoMedidaProdu=isPermiso;		
		this.isPermisoCopiarMedidaProdu=isPermiso;		
		this.isPermisoVerFormMedidaProdu=isPermiso;		
		this.isPermisoDuplicarMedidaProdu=isPermiso;
		this.isPermisoOrdenMedidaProdu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioMedidaProdu(Boolean isPermiso) {
		//this.isPermisoTodoMedidaProdu=isPermiso;
		this.isPermisoNuevoMedidaProdu=isPermiso;
		this.isPermisoActualizarMedidaProdu=isPermiso;
		this.isPermisoActualizarOriginalMedidaProdu=isPermiso;
		this.isPermisoEliminarMedidaProdu=isPermiso;
		this.isPermisoGuardarCambiosMedidaProdu=isPermiso;
		//this.isPermisoConsultaMedidaProdu=isPermiso;
		//this.isPermisoBusquedaMedidaProdu=isPermiso;
		//this.isPermisoReporteMedidaProdu=isPermiso;
		//this.isPermisoOrdenMedidaProdu=isPermiso;		
		//this.isPermisoPaginacionMedioMedidaProdu=isPermiso;		
		//this.isPermisoPaginacionAltoMedidaProdu=isPermiso;		
		//this.isPermisoPaginacionTodoMedidaProdu=isPermiso;		
		//this.isPermisoCopiarMedidaProdu=isPermiso;		
		//this.isPermisoDuplicarMedidaProdu=isPermiso;
		//this.isPermisoOrdenMedidaProdu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioMedidaProduClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(MedidaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebMedidaProdu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioMedidaProduClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioMedidaProduClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionMedidaProduClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioMedidaProduClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioMedidaProdu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(MedidaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.medidaproduSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, MedidaProduConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoMedidaProdu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarMedidaProdu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalMedidaProdu=this.isPermisoActualizarMedidaProdu;
			this.isPermisoEliminarMedidaProdu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosMedidaProdu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaMedidaProdu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaMedidaProdu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoMedidaProdu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteMedidaProdu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMedidaProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioMedidaProdu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoMedidaProdu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoMedidaProdu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarMedidaProdu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormMedidaProdu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarMedidaProdu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMedidaProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.medidaproduSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosMedidaProdu.setToolTipText(this.jTableDatosMedidaProdu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioMedidaProdu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioMedidaProdu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(MedidaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(MedidaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioMedidaProdu() throws Exception {
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
	public void inicializarCombosForeignKeyMedidaProduListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyMedidaProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(MedidaProduJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyMedidaProduListas(false);
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
	
	public void cargarCombosLoteForeignKeyMedidaProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			MedidaProduParameterReturnGeneral medidaproduReturnGeneral=new MedidaProduParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.medidaproduConstantesFunciones.cargarid_empresaMedidaProdu)
					 || (this.esRecargarFks && this.medidaproduConstantesFunciones.cargarid_empresaMedidaProdu)) {

					if(!this.medidaproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+medidaproduSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				medidaproduReturnGeneral=medidaproduLogic.cargarCombosLoteForeignKeyMedidaProdu(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=medidaproduReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyMedidaProdu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.medidaproduSessionBean==null) {
				this.medidaproduSessionBean=new MedidaProduSessionBean();
			}

			if(!this.medidaproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyMedidaProdu()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyMedidaProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyMedidaProdu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyMedidaProdu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyMedidaProdu(MedidaProdu medidaprodu)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyMedidaProdu(MedidaProdu medidaprodu,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyMedidaProdu()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyMedidaProdu()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyMedidaProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyMedidaProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroMedidaProdu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyMedidaProdu()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyMedidaProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyMedidaProdu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormMedidaProdu.jComboBoxid_empresaMedidaProdu!=null && this.jInternalFrameDetalleFormMedidaProdu.jComboBoxid_empresaMedidaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormMedidaProdu.jComboBoxid_empresaMedidaProdu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public MedidaProduBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public MedidaProduBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public MedidaProduBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.medidaproduSessionBean=new MedidaProduSessionBean(); 
		this.medidaproduConstantesFunciones=new MedidaProduConstantesFunciones(); 
		this.medidaproduBean=new MedidaProdu();//(this.medidaproduConstantesFunciones); 		
		this.medidaproduReturnGeneral=new MedidaProduParameterReturnGeneral(); 
		
		this.medidaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.medidaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public MedidaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public MedidaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public MedidaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessMedidaProdu(true);
			
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
			
			this.medidaproduConstantesFunciones=new MedidaProduConstantesFunciones(); 
			this.medidaproduBean=new MedidaProdu();//this.medidaproduConstantesFunciones); 			
			this.medidaproduReturnGeneral=new MedidaProduParameterReturnGeneral(); 
		
			MedidaProduBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Medida Produ Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.medidaprodu=new MedidaProdu();
			this.medidaprodus = new ArrayList<MedidaProdu>();
			this.medidaprodusAux = new ArrayList<MedidaProdu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic=new MedidaProduLogic();
				this.medidaproduLogic.getNewConnexionToDeep("");
			}
			
			//this.medidaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.medidaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormMedidaProdu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoMedidaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMedidaProdu);	
					}
					
					if(this.jInternalFrameImportacionMedidaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMedidaProdu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByMedidaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByMedidaProdu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormMedidaProdu);
				this.jInternalFrameDetalleFormMedidaProdu.setVisible(false);
				this.jInternalFrameDetalleFormMedidaProdu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoMedidaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMedidaProdu);
					this.jInternalFrameReporteDinamicoMedidaProdu.setVisible(false);
					this.jInternalFrameReporteDinamicoMedidaProdu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionMedidaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionMedidaProdu);
					this.jInternalFrameImportacionMedidaProdu.setVisible(false);
					this.jInternalFrameImportacionMedidaProdu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByMedidaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByMedidaProdu);
					this.jInternalFrameOrderByMedidaProdu.setVisible(false);
					this.jInternalFrameOrderByMedidaProdu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idMedidaProduActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=MedidaProduConstantesFunciones.INUMEROPAGINACION;
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
			
			this.medidaproduReturnGeneral=new MedidaProduParameterReturnGeneral();
			
			this.medidaproduParameterGeneral=new MedidaProduParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.medidaproduLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {
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
			
			if(MedidaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.medidaproduSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MedidaProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.medidaproduSessionBean.getEsGuardarRelacionado(),this.medidaproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MedidaProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.medidaproduSessionBean.getEsGuardarRelacionado(),this.medidaproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoMedidaProdu=false;
			this.isVisibilidadCeldaDuplicarMedidaProdu=true;
			this.isVisibilidadCeldaCopiarMedidaProdu=true;
			this.isVisibilidadCeldaVerFormMedidaProdu=true;
			this.isVisibilidadCeldaOrdenMedidaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesMedidaProdu=false;
			this.isVisibilidadCeldaModificarMedidaProdu=false;
			this.isVisibilidadCeldaActualizarMedidaProdu=false;
			this.isVisibilidadCeldaEliminarMedidaProdu=false;
			this.isVisibilidadCeldaCancelarMedidaProdu=false;
			this.isVisibilidadCeldaGuardarMedidaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosMedidaProdu=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesMedidaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosMedidaProdu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioMedidaProdu(false);
			
			this.setPermisosUsuarioMedidaProdu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.medidaproduSessionBean.getEsGuardarRelacionado() 
				|| (this.medidaproduSessionBean.getEsGuardarRelacionado() && this.medidaproduSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioMedidaProduClasesRelacionadas();
			}
			
			if(this.medidaproduSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioMedidaProduClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!MedidaProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosMedidaProdu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualMedidaProdu();
			}
			
			if(!this.isPermisoBusquedaMedidaProdu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasMedidaProdu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioMedidaProdu,this.isPermisoPaginacionMedioMedidaProdu,this.isPermisoPaginacionTodoMedidaProdu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(MedidaProduConstantesFunciones.getTiposSeleccionarMedidaProdu());
				
				this.tiposColumnasSelect=MedidaProduConstantesFunciones.getTiposSeleccionarMedidaProdu(true);
				
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
			//if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioMedidaProdu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioMedidaProdu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioMedidaProdu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesMedidaProdu() ;
			
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
				medidaproduImplementable= (MedidaProduImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MedidaProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				medidaproduImplementableHome= (MedidaProduImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MedidaProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.medidaprodus= new ArrayList<MedidaProdu>();
			this.medidaprodusEliminados= new ArrayList<MedidaProdu>();
						
			this.isEsNuevoMedidaProdu=false;
			this.esParaAccionDesdeFormularioMedidaProdu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyMedidaProdu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroMedidaProdu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			MedidaProduBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=MedidaProduConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesMedidaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingMedidaProdu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormMedidaProdu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioMedidaProdu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioMedidaProdu();
			}
			
			MedidaProduBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasMedidaProdu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasMedidaProdu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasMedidaProdu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessMedidaProdu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga MedidaProdu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectMedidaProdu() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesMedidaProdu")) {
				iIndex=this.jInternalFrameDetalleFormMedidaProdu.jTabbedPaneRelacionesMedidaProdu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormMedidaProdu.jTabbedPaneRelacionesMedidaProdu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessMedidaProdu();	
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
	
	public void cargarCombosForeignKeyMedidaProdu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyMedidaProdu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyMedidaProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyMedidaProduListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyMedidaProdu();
		
		this.cargarCombosFrameForeignKeyMedidaProdu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyMedidaProdu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyMedidaProdu();
		}
	}
	
	
	
	public void jButtonNuevoMedidaProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.medidaproduSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormMedidaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
			
			
			if(jTableDatosMedidaProdu.getRowCount()>=1) {
				jTableDatosMedidaProdu.removeRowSelectionInterval(0, jTableDatosMedidaProdu.getRowCount()-1);						
			}
			
			this.isEsNuevoMedidaProdu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoMedidaProdu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesMedidaProdu(true);			
			//this.medidaprodu=new MedidaProdu();
			//this.medidaprodu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMedidaProdu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMedidaProdu() ;
			
			if(MedidaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMedidaProdu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.medidaprodu);	
			this.actualizarInformacion("INFO_PADRE",false,this.medidaprodu);				
			
			MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
			
			if(this.medidaproduSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar MedidaProdu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarMedidaProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<MedidaProdu> medidaprodusSeleccionados=new ArrayList<MedidaProdu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosMedidaProdu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosMedidaProdu.getSelectedRows().length;			
			}
			
			medidaprodusSeleccionados=this.getMedidaProdusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoMedidaProdu--;			
				//MedidaProdu medidaproduAux= new MedidaProdu();			
				//medidaproduAux.setId(this.iIdNuevoMedidaProdu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//MedidaProdu medidaproduOrigen=new MedidaProdu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(MedidaProdu medidaproduOrigen : medidaprodusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							medidaproduOrigen =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							medidaproduOrigen =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaMedidaProdu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.medidaprodu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosMedidaProdu(medidaproduOrigen,this.medidaprodu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysMedidaProdu(this.medidaprodu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.medidaproduLogic.getMedidaProdus().add(this.medidaproduAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.medidaprodus.add(this.medidaproduAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaMedidaProdu(false);
				
				this.jTableDatosMedidaProdu.setRowSelectionInterval(this.getIndiceNuevoMedidaProdu(), this.getIndiceNuevoMedidaProdu());
				
				int iLastRow =  this.jTableDatosMedidaProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMedidaProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMedidaProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMedidaProdu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarMedidaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<MedidaProdu> medidaprodusSeleccionados=new ArrayList<MedidaProdu>();									
		
			MedidaProdu medidaproduOrigen=new MedidaProdu();
			MedidaProdu medidaproduDestino=new MedidaProdu();
				
			medidaprodusSeleccionados=this.getMedidaProdusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosMedidaProdu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || medidaprodusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosMedidaProdu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						medidaproduOrigen =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						medidaproduOrigen =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						medidaproduDestino =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						medidaproduDestino =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				medidaproduOrigen =medidaprodusSeleccionados.get(0);
				medidaproduDestino =medidaprodusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosMedidaProdu(medidaproduOrigen,medidaproduDestino,true,false);
				
				medidaproduDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(medidaproduDestino,medidaproduLogic.getMedidaProdus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(medidaproduDestino,medidaprodus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaMedidaProdu(false);
				
				//this.jTableDatosMedidaProdu.setRowSelectionInterval(this.getIndiceNuevoMedidaProdu(), this.getIndiceNuevoMedidaProdu());
				
				int iLastRow =  this.jTableDatosMedidaProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMedidaProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMedidaProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMedidaProdu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormMedidaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMedidaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormMedidaProdu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarMedidaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesMedidaProdu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasMedidaProdu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesMedidaProdu.setVisible(!isVisible);
			this.jPanelPaginacionMedidaProdu.setVisible(!isVisible);
			this.jPanelAccionesMedidaProdu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarMedidaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameMedidaProdu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoMedidaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoMedidaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionMedidaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionMedidaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByMedidaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByMedidaProdu();
			
			this.abrirFrameOrderByMedidaProdu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByMedidaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByMedidaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleMedidaProdu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormMedidaProdu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormMedidaProdu.isMaximum()) {
					this.jInternalFrameDetalleFormMedidaProdu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormMedidaProdu.setSize(this.jInternalFrameDetalleFormMedidaProdu.iWidthFormulario,this.jInternalFrameDetalleFormMedidaProdu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormMedidaProdu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormMedidaProdu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormMedidaProdu.isMaximum()) {
						this.jInternalFrameDetalleFormMedidaProdu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormMedidaProdu.jContentPaneDetalleMedidaProdu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormMedidaProdu.jTabbedPaneRelacionesMedidaProdu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormMedidaProdu.jContentPaneDetalleMedidaProdu.getWidth(),MedidaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMedidaProdu.jTabbedPaneRelacionesMedidaProdu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormMedidaProdu.jContentPaneDetalleMedidaProdu.getWidth(),MedidaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMedidaProdu.jTabbedPaneRelacionesMedidaProdu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormMedidaProdu.jContentPaneDetalleMedidaProdu.getWidth(),MedidaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormMedidaProdu.setVisible(true);
	        this.jInternalFrameDetalleFormMedidaProdu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByMedidaProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByMedidaProdu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByMedidaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMedidaProdu,false,this);
				} else {
					this.jInternalFrameOrderByMedidaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMedidaProdu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByMedidaProdu);
				this.jInternalFrameOrderByMedidaProdu.setVisible(false);
				this.jInternalFrameOrderByMedidaProdu.setSelected(false);
				
				this.jInternalFrameOrderByMedidaProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMedidaProdu"));
				
				this.inicializarActualizarBindingTablaOrderByMedidaProdu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionMedidaProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionMedidaProdu==null) {
				
				this.jInternalFrameImportacionMedidaProdu=new ImportacionJInternalFrame(MedidaProduConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMedidaProdu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionMedidaProdu);
				this.jInternalFrameImportacionMedidaProdu.setVisible(false);
				this.jInternalFrameImportacionMedidaProdu.setSelected(false);


				this.jInternalFrameImportacionMedidaProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMedidaProdu"));
				this.jInternalFrameImportacionMedidaProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMedidaProdu"));
				this.jInternalFrameImportacionMedidaProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMedidaProdu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoMedidaProdu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoMedidaProdu==null) {
				this.jInternalFrameReporteDinamicoMedidaProdu=new ReporteDinamicoJInternalFrame(MedidaProduConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMedidaProdu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMedidaProdu);
				this.jInternalFrameReporteDinamicoMedidaProdu.setVisible(false);
				this.jInternalFrameReporteDinamicoMedidaProdu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoMedidaProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMedidaProdu"));
				this.jInternalFrameReporteDinamicoMedidaProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMedidaProdu"));
				this.jInternalFrameReporteDinamicoMedidaProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMedidaProdu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMedidaProdu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleMedidaProdu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormMedidaProdu);
			
	       	this.jInternalFrameDetalleFormMedidaProdu.setVisible(false);
	        this.jInternalFrameDetalleFormMedidaProdu.setSelected(false);
			
			//this.jInternalFrameDetalleFormMedidaProdu.dispose();
			//this.jInternalFrameDetalleFormMedidaProdu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoMedidaProdu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoMedidaProdu.setVisible(true);
	        this.jInternalFrameReporteDinamicoMedidaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionMedidaProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionMedidaProdu.setVisible(true);
	        this.jInternalFrameImportacionMedidaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByMedidaProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByMedidaProdu.setVisible(true);
	        this.jInternalFrameOrderByMedidaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByMedidaProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByMedidaProdu.setVisible(false);
	        this.jInternalFrameOrderByMedidaProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoMedidaProdu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoMedidaProdu.setVisible(false);
	        this.jInternalFrameReporteDinamicoMedidaProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionMedidaProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionMedidaProdu.setVisible(false);
	        this.jInternalFrameImportacionMedidaProdu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarMedidaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarMedidaProdu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarMedidaProdu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesMedidaProdu(true);
			//this.isEsNuevoMedidaProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaprodu =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.medidaprodu =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesMedidaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMedidaProdu(false) ;
			
			if(medidaproduSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(MedidaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMedidaProdu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMedidaProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaMedidaProduActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaprodu =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.medidaprodu =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarMedidaProdu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMedidaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesMedidaProdu(true);
			//this.isEsNuevoMedidaProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaprodu =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.medidaprodu =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.medidaprodu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesMedidaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesMedidaProdu(false) ;
			
			if(MedidaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMedidaProdu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMedidaProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarMedidaProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesMedidaProdu(false);
			
			//if(!this.isEsNuevoMedidaProdu) {								
				int intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaprodu =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.medidaprodu =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(MedidaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualMedidaProdu(this.medidaprodu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysMedidaProdu(this.medidaprodu);
				
			}
			
			if(this.permiteMantenimiento(this.medidaprodu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.medidaproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoMedidaProdu=true;
					this.inicializarActualizarBindingTablaMedidaProdu(false);
					this.isEsNuevoMedidaProdu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoMedidaProdu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoMedidaProdu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMedidaProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMedidaProdu(false);
				
				this.habilitarDeshabilitarControlesMedidaProdu(false);
			
												
				
				if(MedidaProduJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleMedidaProdu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoMedidaProduActionPerformed(evt,medidaproduSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualMedidaProdu(this.medidaprodu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosMedidaProdu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,medidaproduSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.medidaprodu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(MedidaProdu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MedidaProdu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarMedidaProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaprodu =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				this.medidaprodu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.medidaprodu =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				this.medidaprodu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.medidaprodu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.medidaproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((MedidaProduModel) this.jTableDatosMedidaProdu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoMedidaProdu=true;
				this.inicializarActualizarBindingTablaMedidaProdu(false);
				this.isEsNuevoMedidaProdu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMedidaProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMedidaProdu(false);
				
				this.habilitarDeshabilitarControlesMedidaProdu(false);
				
				
				
				if(MedidaProduJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleMedidaProdu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarMedidaProduActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosMedidaProdu.getRowCount()>=1) {
				jTableDatosMedidaProdu.removeRowSelectionInterval(0, jTableDatosMedidaProdu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesMedidaProdu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaMedidaProdu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMedidaProdu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMedidaProdu(false) ;
			
			this.isEsNuevoMedidaProdu=false;
			
			if(MedidaProduJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleMedidaProdu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosMedidaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingMedidaProdu(false);
				
				//SI ES MANUAL
				if(MedidaProduJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualMedidaProdu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosMedidaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoMedidaProdu--;			
			//MedidaProdu medidaproduAux= new MedidaProdu();			
			//medidaproduAux.setId(this.iIdNuevoMedidaProdu);
			
			if(this.jInternalFrameDetalleFormMedidaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaMedidaProdu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysMedidaProdu(this.medidaprodu);
			
			this.medidaprodu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.medidaproduLogic.getMedidaProdus().add(this.medidaproduAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.medidaprodus.add(this.medidaproduAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaMedidaProdu(false);
			
			this.jTableDatosMedidaProdu.setRowSelectionInterval(this.getIndiceNuevoMedidaProdu(), this.getIndiceNuevoMedidaProdu());
			
			int iLastRow =  this.jTableDatosMedidaProdu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosMedidaProdu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosMedidaProdu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaMedidaProdu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionMedidaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingMedidaProdu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMedidaProdu(false);
			
			//SI ES MANUAL
			if(MedidaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMedidaProdu();
			}
			
			//this.abrirFrameTreeMedidaProdu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionMedidaProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Medida ProduS ?", "MANTENIMIENTO DE Medida Produ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionMedidaProdu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralMedidaProdu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.medidaproduReturnGeneral=medidaproduLogic.procesarImportacionMedidaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.medidaproduParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarMedidaProduReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionMedidaProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionMedidaProdu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionMedidaProdu.setFileImportacion(this.jInternalFrameImportacionMedidaProdu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionMedidaProdu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionMedidaProdu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionMedidaProdu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionMedidaProdu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoMedidaProduActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<MedidaProdu> medidaprodusSeleccionados=new ArrayList<MedidaProdu>();		

		medidaprodusSeleccionados=this.getMedidaProdusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMedidaProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMedidaProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("MedidaProduBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"MedidaProduBaseDesign.jrxml";
			
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
			
			this.generarReporteMedidaProdus("Todos",medidaprodusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.medidaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Medida Produ",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoMedidaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMedidaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MedidaProduConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MedidaProduConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoMedidaProdu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoMedidaProdu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoMedidaProdu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case MedidaProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case MedidaProduConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoMedidaProdu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case MedidaProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case MedidaProduConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoMedidaProdu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMedidaProdu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MedidaProduConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case MedidaProduConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoMedidaProduActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<MedidaProdu> medidaprodusSeleccionados=new ArrayList<MedidaProdu>();		
		
		medidaprodusSeleccionados=this.getMedidaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"medidaprodu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("MedidaProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoMedidaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoMedidaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case MedidaProduConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MedidaProduConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(MedidaProdu medidaprodu:medidaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(medidaprodu.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MedidaProduConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MedidaProduConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(MedidaProdu medidaprodu:medidaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(medidaprodu.getnombre());
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
			//	this.getFilaCabeceraExportarExcelMedidaProdu(row);				
			//	iRow++;
			//}				
			
			//for(MedidaProdu medidaproduAux:medidaprodusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelMedidaProdu(medidaproduAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.medidaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Medida Produ",JOptionPane.INFORMATION_MESSAGE);
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
				this.medidaproduLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMedidaProdu(false);
			
			//SI ES MANUAL
			if(MedidaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMedidaProdu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresMedidaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMedidaProdu(false);
			
			//SI ES MANUAL
			if(MedidaProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMedidaProdu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesMedidaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMedidaProdu(false);
			
			//SI ES MANUAL
			if(MedidaProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMedidaProdu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaMedidaProdu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosMedidaProdu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosMedidaProdu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosMedidaProdu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosMedidaProdu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosMedidaProdu.setMinimumSize(dimensionMinimum);
		this.jTableDatosMedidaProdu.setMaximumSize(dimensionMaximum);
		this.jTableDatosMedidaProdu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingMedidaProdu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingMedidaProdu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingMedidaProdu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaMedidaProdu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesMedidaProdu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasMedidaProdu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMedidaProdu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesMedidaProdu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !MedidaProduJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!MedidaProduJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualMedidaProdu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaMedidaProdu();
		
		this.inicializarActualizarBindingBotonesManualMedidaProdu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualMedidaProdu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMedidaProdu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualMedidaProdu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualMedidaProdu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosMedidaProdu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosMedidaProdu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteMedidaProdu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormMedidaProdu.jCheckBoxPostAccionNuevoMedidaProdu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormMedidaProdu.jCheckBoxPostAccionSinCerrarMedidaProdu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormMedidaProdu.jCheckBoxPostAccionSinMensajeMedidaProdu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosMedidaProdu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosMedidaProdu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteMedidaProdu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
				this.jInternalFrameDetalleFormMedidaProdu.jCheckBoxPostAccionNuevoMedidaProdu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormMedidaProdu.jCheckBoxPostAccionSinCerrarMedidaProdu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormMedidaProdu.jCheckBoxPostAccionSinMensajeMedidaProdu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionMedidaProdu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionMedidaProdu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormMedidaProdu.jComboBoxTiposAccionesFormularioMedidaProdu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesMedidaProdu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoMedidaProdu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMedidaProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesMedidaProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesMedidaProdu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarMedidaProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesMedidaProdu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoMedidaProdu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMedidaProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesMedidaProdu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralMedidaProdu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesMedidaProdu(Boolean esInicializar) throws Exception {
		try	{	
			if(MedidaProduJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualMedidaProdu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesMedidaProdu() throws Exception {
		try	{
			if(MedidaProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualMedidaProdu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMedidaProdu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormMedidaProdu.jComboBoxTiposAccionesFormularioMedidaProdu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormMedidaProdu.jComboBoxTiposAccionesFormularioMedidaProdu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualMedidaProdu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesMedidaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesMedidaProdu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesMedidaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesMedidaProdu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesMedidaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesMedidaProdu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionMedidaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionMedidaProdu.addItem(reporte);
			}
			
			
			if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionMedidaProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionMedidaProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesMedidaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesMedidaProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesMedidaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesMedidaProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormMedidaProdu.jComboBoxTiposAccionesFormularioMedidaProdu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormMedidaProdu.jComboBoxTiposAccionesFormularioMedidaProdu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarMedidaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarMedidaProdu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarMedidaProdu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMedidaProdu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMedidaProdu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMedidaProdu!=null) {
				this.jInternalFrameReporteDinamicoMedidaProdu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoMedidaProdu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMedidaProdu!=null) {
				this.jInternalFrameReporteDinamicoMedidaProdu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoMedidaProdu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoMedidaProdu!=null) {
				
				if(this.jInternalFrameReporteDinamicoMedidaProdu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMedidaProdu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMedidaProdu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoMedidaProdu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMedidaProdu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMedidaProdu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualMedidaProdu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasMedidaProdu(Boolean esInicializar) throws Exception {				
		if(MedidaProduJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualMedidaProdu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaMedidaProdu() throws Exception {
		this.inicializarActualizarBindingTablaMedidaProdu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByMedidaProdu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByMedidaProdu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByMedidaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMedidaProdu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new MedidaProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByMedidaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMedidaProdu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new MedidaProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosMedidaProduOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMedidaProduOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new MedidaProduPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByMedidaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMedidaProdu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new MedidaProduPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByMedidaProdu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaMedidaProdu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=medidaproduLogic.getMedidaProdus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=medidaprodus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(MedidaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosMedidaProdu.setModel(new MedidaProduModel(this.medidaproduLogic.getMedidaProdus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosMedidaProdu.setModel(new MedidaProduModel(this.medidaprodus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByMedidaProdu!=null && this.jInternalFrameOrderByMedidaProdu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByMedidaProdu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosMedidaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMedidaProdu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new MedidaProduPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+MedidaProduConstantesFunciones.SCLASSWEBTITULO,medidaproduConstantesFunciones.resaltarSeleccionarMedidaProdu,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+MedidaProduConstantesFunciones.SCLASSWEBTITULO,medidaproduConstantesFunciones.resaltarSeleccionarMedidaProdu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosMedidaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMedidaProdu,MedidaProduConstantesFunciones.LABEL_ID));

		if(this.medidaproduConstantesFunciones.mostraridMedidaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MedidaProduConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.medidaproduConstantesFunciones.resaltaridMedidaProdu,this.medidaproduConstantesFunciones.activaridMedidaProdu,this,true,"idMedidaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.medidaproduConstantesFunciones.resaltaridMedidaProdu,this.medidaproduConstantesFunciones.activaridMedidaProdu,this,true,"idMedidaProdu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMedidaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMedidaProdu,MedidaProduConstantesFunciones.LABEL_IDEMPRESA));

		if(this.medidaproduConstantesFunciones.mostrarid_empresaMedidaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MedidaProduConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.medidaproduConstantesFunciones.resaltarid_empresaMedidaProdu,this,this.medidaproduConstantesFunciones.activarid_empresaMedidaProdu));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.medidaproduConstantesFunciones.resaltarid_empresaMedidaProdu,this,this.medidaproduConstantesFunciones.activarid_empresaMedidaProdu,false,"id_empresaMedidaProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MedidaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMedidaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMedidaProdu,MedidaProduConstantesFunciones.LABEL_NOMBRE));

		if(this.medidaproduConstantesFunciones.mostrarnombreMedidaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MedidaProduConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.medidaproduConstantesFunciones.resaltarnombreMedidaProdu,this.medidaproduConstantesFunciones.activarnombreMedidaProdu,this,true,"nombreMedidaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.medidaproduConstantesFunciones.resaltarnombreMedidaProdu,this.medidaproduConstantesFunciones.activarnombreMedidaProdu,this,true,"nombreMedidaProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MedidaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.medidaproduSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.medidaproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.medidaproduSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMedidaProdu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.medidaproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.medidaproduSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMedidaProdu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarMedidaProdu && this.isPermisoGuardarCambiosMedidaProdu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.medidaproduSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.medidaproduSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosMedidaProdu.addColumn(tableColumn);
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
			
			this.jTableDatosMedidaProdu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMedidaProdu && this.isPermisoGuardarCambiosMedidaProdu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMedidaProdu && this.isPermisoGuardarCambiosMedidaProdu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosMedidaProdu.moveColumn(this.jTableDatosMedidaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosMedidaProdu.moveColumn(this.jTableDatosMedidaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosMedidaProdu.moveColumn(this.jTableDatosMedidaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosMedidaProdu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosMedidaProdu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosMedidaProdu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!MedidaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosMedidaProdu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosMedidaProdu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!MedidaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!MedidaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosMedidaProdu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosMedidaProdu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosMedidaProdu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=medidaproduLogic.getMedidaProdus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=medidaprodus.size()-1;
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
		//this.jTableDatosMedidaProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosMedidaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosMedidaProdu();
			
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
				
				//this.isEsNuevoMedidaProdu=false;
					
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
			
				if(this.medidaproduSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormMedidaProdu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMedidaProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMedidaProdu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaprodu =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.medidaprodu =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.medidaprodu.getsType().equals("DUPLICADO")
				   || this.medidaprodu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoMedidaProdu=true;
				
				} else {
					this.isEsNuevoMedidaProdu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {
					if(this.medidaprodu.getId()>=0 && !this.medidaprodu.getIsNew()) {						
						this.isEsNuevoMedidaProdu=false;
						
					} else {
						this.isEsNuevoMedidaProdu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoMedidaProdu(esRelaciones);						
				
				this.seleccionarMedidaProdu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.medidaprodu.getId()<0) {
					this.isEsNuevoMedidaProdu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarMedidaProdu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarMedidaProdu(evt,rowIndex);
				}	
				
				if(this.medidaproduSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion MedidaProdu: " + this.dDif); 
					}
				}								
				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarMedidaProdu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.medidaprodu)) {
					if(this.medidaprodu.getId()>0) {
						this.medidaprodu.setIsDeleted(true);
						
						this.medidaprodusEliminados.add(this.medidaprodu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.medidaproduLogic.getMedidaProdus().remove(this.medidaprodu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.medidaprodus.remove(this.medidaprodu);				
					}
					
					
					((MedidaProduModel) this.jTableDatosMedidaProdu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaMedidaProdu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarMedidaProdu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoMedidaProdu) {
			
			if(this.jInternalFrameDetalleFormMedidaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMedidaProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMedidaProdu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaprodu =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.medidaprodu =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(MedidaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioMedidaProdu(this.medidaprodu);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.medidaproduConstantesFunciones.cargarid_empresaMedidaProdu || this.medidaproduConstantesFunciones.event_dependid_empresaMedidaProdu) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.medidaprodu.getid_empresa());
									//this.inicializarActualizarBindingMedidaProdu(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(medidaprodu.getEmpresa()!=null) {
							this.empresasForeignKey.add(medidaprodu.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.medidaprodu.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesMedidaProdu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesMedidaProdu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMedidaProdu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoMedidaProdu(MedidaProdu medidaprodu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoMedidaProdu(medidaprodu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoMedidaProdu(MedidaProdu medidaprodu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioMedidaProdu(medidaprodu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyMedidaProdu(medidaprodu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyMedidaProdu(medidaprodu);
	}
	
	public void setVariablesObjetoActualToFormularioMedidaProdu(MedidaProdu medidaprodu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormMedidaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormMedidaProdu.jLabelidMedidaProdu.setText(medidaprodu.getId().toString());
			this.jInternalFrameDetalleFormMedidaProdu.jTextAreanombreMedidaProdu.setText(medidaprodu.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,MedidaProdu medidaproduLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,medidaproduLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,MedidaProdu medidaproduLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				medidaproduLocal=this.medidaprodu;
			} else {
				medidaproduLocal=this.medidaproduAnterior;
			}
		}
		
		if(this.permiteMantenimiento(medidaproduLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoMedidaProdu(medidaproduLocal,true);
					
					if(medidaproduSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(medidaproduLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.medidaproduSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(medidaproduLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoMedidaProdu(MedidaProdu medidaprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMedidaProdu(medidaprodu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysMedidaProdu(medidaprodu);
	}
	
	public void setVariablesFormularioToObjetoActualMedidaProdu(MedidaProdu medidaprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMedidaProdu(medidaprodu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualMedidaProdu(MedidaProdu medidaprodu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormMedidaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormMedidaProdu.jLabelidMedidaProdu.getText()==null || this.jInternalFrameDetalleFormMedidaProdu.jLabelidMedidaProdu.getText()=="" || this.jInternalFrameDetalleFormMedidaProdu.jLabelidMedidaProdu.getText()=="Id") {
				this.jInternalFrameDetalleFormMedidaProdu.jLabelidMedidaProdu.setText("0");
			}

			if(conColumnasBase) {medidaprodu.setId(Long.parseLong(this.jInternalFrameDetalleFormMedidaProdu.jLabelidMedidaProdu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MedidaProduConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMedidaProdu.jLabelIdMedidaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			medidaprodu.setnombre(this.jInternalFrameDetalleFormMedidaProdu.jTextAreanombreMedidaProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MedidaProduConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMedidaProdu.jLabelnombreMedidaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMedidaProdu(MedidaProdu medidaproduBean,MedidaProdu medidaprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosMedidaProdu(MedidaProdu medidaproduOrigen,MedidaProdu medidaprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && medidaproduOrigen.getId()!=null && !medidaproduOrigen.getId().equals(0L))) {medidaprodu.setId(medidaproduOrigen.getId());}}
			if(conDefault || (!conDefault && medidaproduOrigen.getnombre()!=null && !medidaproduOrigen.getnombre().equals(""))) {medidaprodu.setnombre(medidaproduOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMedidaProdu(MedidaProdu medidaprodu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMedidaProdu.jLabelidMedidaProdu.setText(medidaprodu.getId().toString());
			this.jInternalFrameDetalleFormMedidaProdu.jTextAreanombreMedidaProdu.setText(medidaprodu.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMedidaProdu(MedidaProduBean medidaproduBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMedidaProdu.jLabelidMedidaProdu.setText(medidaproduBean.getId().toString());
			this.jInternalFrameDetalleFormMedidaProdu.jTextAreanombreMedidaProdu.setText(medidaproduBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanMedidaProdu(MedidaProduParameterReturnGeneral medidaproduReturnGeneral,MedidaProduBean medidaproduBean,Boolean conDefault) throws Exception { 
		try {
			MedidaProdu medidaproduLocal=new MedidaProdu();
			
			medidaproduLocal=medidaproduReturnGeneral.getMedidaProdu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && medidaproduLocal.getId()!=null && !medidaproduLocal.getId().equals(0L))) {medidaproduBean.setId(medidaproduLocal.getId());}}
			if(conDefault || (!conDefault && medidaproduLocal.getnombre()!=null && !medidaproduLocal.getnombre().equals(""))) {medidaproduBean.setnombre(medidaproduLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxMedidaProduGenerico(Long idMedidaProduSeleccionado,JComboBox jComboBoxMedidaProdu,List<MedidaProdu> medidaprodusLocal)throws Exception {
		try {
			MedidaProdu  medidaproduTemp=null;

			for(MedidaProdu medidaproduAux:medidaprodusLocal) {
				if(medidaproduAux.getId()!=null && medidaproduAux.getId().equals(idMedidaProduSeleccionado)) {
					medidaproduTemp=medidaproduAux;
					break;
				}
			}

			jComboBoxMedidaProdu.setSelectedItem(medidaproduTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxMedidaProduGenerico(JComboBox jComboBoxMedidaProdu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxMedidaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMedidaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxMedidaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMedidaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMedidaProdu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxMedidaProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMedidaProdu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxMedidaProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxMedidaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxMedidaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			medidaprodu=(MedidaProdu) medidaproduLogic.getMedidaProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			medidaprodu =(MedidaProdu) medidaprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!medidaprodu.getIsNew() && !medidaprodu.getIsChanged() && !medidaprodu.getIsDeleted()) {
				sDescripcion=medidaprodu.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=medidaprodu.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		MedidaProdu medidaproduRow=new MedidaProdu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			medidaproduRow=(MedidaProdu) medidaproduLogic.getMedidaProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			medidaproduRow=(MedidaProdu) medidaprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualMedidaProdu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoMedidaProdu.setVisible((this.isVisibilidadCeldaNuevoMedidaProdu && this.isPermisoNuevoMedidaProdu));			
			this.jButtonDuplicarMedidaProdu.setVisible((this.isVisibilidadCeldaDuplicarMedidaProdu && this.isPermisoDuplicarMedidaProdu));			
			this.jButtonCopiarMedidaProdu.setVisible((this.isVisibilidadCeldaCopiarMedidaProdu && this.isPermisoCopiarMedidaProdu));
			this.jButtonVerFormMedidaProdu.setVisible((this.isVisibilidadCeldaVerFormMedidaProdu && this.isPermisoVerFormMedidaProdu));
			
			this.jButtonAbrirOrderByMedidaProdu.setVisible((this.isVisibilidadCeldaOrdenMedidaProdu && this.isPermisoOrdenMedidaProdu));			
			
			this.jButtonNuevoRelacionesMedidaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesMedidaProdu && this.isPermisoNuevoMedidaProdu));			
			this.jButtonNuevoGuardarCambiosMedidaProdu.setVisible((this.isVisibilidadCeldaNuevoMedidaProdu && this.isPermisoNuevoMedidaProdu && this.isPermisoGuardarCambiosMedidaProdu));
			
			if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
			this.jInternalFrameDetalleFormMedidaProdu.jButtonModificarMedidaProdu.setVisible((this.isVisibilidadCeldaModificarMedidaProdu && this.isPermisoActualizarMedidaProdu));	
			this.jInternalFrameDetalleFormMedidaProdu.jButtonActualizarMedidaProdu.setVisible((this.isVisibilidadCeldaActualizarMedidaProdu && this.isPermisoActualizarMedidaProdu));	
			this.jInternalFrameDetalleFormMedidaProdu.jButtonEliminarMedidaProdu.setVisible((this.isVisibilidadCeldaEliminarMedidaProdu && this.isPermisoEliminarMedidaProdu));
			this.jInternalFrameDetalleFormMedidaProdu.jButtonCancelarMedidaProdu.setVisible(this.isVisibilidadCeldaCancelarMedidaProdu);							
			this.jInternalFrameDetalleFormMedidaProdu.jButtonGuardarCambiosMedidaProdu.setVisible((this.isVisibilidadCeldaGuardarMedidaProdu && this.isPermisoGuardarCambiosMedidaProdu));			
			
			}
						
			this.jButtonGuardarCambiosTablaMedidaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosMedidaProdu && this.isPermisoGuardarCambiosMedidaProdu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarMedidaProdu.setVisible((this.isVisibilidadCeldaNuevoMedidaProdu && this.isPermisoNuevoMedidaProdu));						
			this.jButtonDuplicarToolBarMedidaProdu.setVisible((this.isVisibilidadCeldaDuplicarMedidaProdu && this.isPermisoDuplicarMedidaProdu));						
			this.jButtonCopiarToolBarMedidaProdu.setVisible((this.isVisibilidadCeldaCopiarMedidaProdu && this.isPermisoCopiarMedidaProdu));			
			this.jButtonVerFormToolBarMedidaProdu.setVisible((this.isVisibilidadCeldaVerFormMedidaProdu && this.isPermisoVerFormMedidaProdu));			
			this.jButtonAbrirOrderByToolBarMedidaProdu.setVisible((this.isVisibilidadCeldaOrdenMedidaProdu && this.isPermisoOrdenMedidaProdu));
			this.jButtonNuevoRelacionesToolBarMedidaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesMedidaProdu && this.isPermisoNuevoMedidaProdu));			
			this.jButtonNuevoGuardarCambiosToolBarMedidaProdu.setVisible((this.isVisibilidadCeldaNuevoMedidaProdu && this.isPermisoNuevoMedidaProdu && this.isPermisoGuardarCambiosMedidaProdu));			
			
			if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
			this.jInternalFrameDetalleFormMedidaProdu.jButtonModificarToolBarMedidaProdu.setVisible((this.isVisibilidadCeldaModificarMedidaProdu && this.isPermisoActualizarMedidaProdu));	
			this.jInternalFrameDetalleFormMedidaProdu.jButtonActualizarToolBarMedidaProdu.setVisible((this.isVisibilidadCeldaActualizarMedidaProdu  && this.isPermisoActualizarMedidaProdu));	
			this.jInternalFrameDetalleFormMedidaProdu.jButtonEliminarToolBarMedidaProdu.setVisible((this.isVisibilidadCeldaEliminarMedidaProdu && this.isPermisoEliminarMedidaProdu));
			this.jInternalFrameDetalleFormMedidaProdu.jButtonCancelarToolBarMedidaProdu.setVisible(this.isVisibilidadCeldaCancelarMedidaProdu);				
			this.jInternalFrameDetalleFormMedidaProdu.jButtonGuardarCambiosToolBarMedidaProdu.setVisible((this.isVisibilidadCeldaGuardarMedidaProdu && this.isPermisoGuardarCambiosMedidaProdu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarMedidaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosMedidaProdu && this.isPermisoGuardarCambiosMedidaProdu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoMedidaProdu.setVisible((this.isVisibilidadCeldaNuevoMedidaProdu && this.isPermisoNuevoMedidaProdu));			
			this.jMenuItemDuplicarMedidaProdu.setVisible((this.isVisibilidadCeldaDuplicarMedidaProdu && this.isPermisoDuplicarMedidaProdu));			
			this.jMenuItemCopiarMedidaProdu.setVisible((this.isVisibilidadCeldaCopiarMedidaProdu && this.isPermisoCopiarMedidaProdu));			
			this.jMenuItemVerFormMedidaProdu.setVisible((this.isVisibilidadCeldaVerFormMedidaProdu && this.isPermisoVerFormMedidaProdu));			
			this.jMenuItemAbrirOrderByMedidaProdu.setVisible((this.isVisibilidadCeldaOrdenMedidaProdu && this.isPermisoOrdenMedidaProdu));			
			//this.jMenuItemMostrarOcultarMedidaProdu.setVisible((this.isVisibilidadCeldaOrdenMedidaProdu && this.isPermisoOrdenMedidaProdu));
			this.jMenuItemDetalleAbrirOrderByMedidaProdu.setVisible((this.isVisibilidadCeldaOrdenMedidaProdu && this.isPermisoOrdenMedidaProdu));			
			//this.jMenuItemDetalleMostrarOcultarMedidaProdu.setVisible((this.isVisibilidadCeldaOrdenMedidaProdu && this.isPermisoOrdenMedidaProdu));			
			this.jMenuItemNuevoRelacionesMedidaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesMedidaProdu && this.isPermisoNuevoMedidaProdu));			
			this.jMenuItemNuevoGuardarCambiosMedidaProdu.setVisible((this.isVisibilidadCeldaNuevoMedidaProdu && this.isPermisoNuevoMedidaProdu && this.isPermisoGuardarCambiosMedidaProdu));									
			
			if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
			this.jInternalFrameDetalleFormMedidaProdu.jMenuItemModificarMedidaProdu.setVisible((this.isVisibilidadCeldaModificarMedidaProdu && this.isPermisoActualizarMedidaProdu));	
			this.jInternalFrameDetalleFormMedidaProdu.jMenuItemActualizarMedidaProdu.setVisible((this.isVisibilidadCeldaActualizarMedidaProdu && this.isPermisoActualizarMedidaProdu));	
			this.jInternalFrameDetalleFormMedidaProdu.jMenuItemEliminarMedidaProdu.setVisible((this.isVisibilidadCeldaEliminarMedidaProdu && this.isPermisoEliminarMedidaProdu));
			this.jInternalFrameDetalleFormMedidaProdu.jMenuItemCancelarMedidaProdu.setVisible(this.isVisibilidadCeldaCancelarMedidaProdu);				
			}
			
			this.jMenuItemGuardarCambiosMedidaProdu.setVisible((this.isVisibilidadCeldaGuardarMedidaProdu && this.isPermisoGuardarCambiosMedidaProdu));						
			this.jMenuItemGuardarCambiosTablaMedidaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosMedidaProdu && this.isPermisoGuardarCambiosMedidaProdu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoMedidaProdu=this.jButtonNuevoMedidaProdu.isVisible();
			this.isVisibilidadCeldaDuplicarMedidaProdu=this.jButtonDuplicarMedidaProdu.isVisible();
			this.isVisibilidadCeldaCopiarMedidaProdu=this.jButtonCopiarMedidaProdu.isVisible();
			this.isVisibilidadCeldaVerFormMedidaProdu=this.jButtonVerFormMedidaProdu.isVisible();
			
			this.isVisibilidadCeldaOrdenMedidaProdu=this.jButtonAbrirOrderByMedidaProdu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesMedidaProdu=this.jButtonNuevoRelacionesMedidaProdu.isVisible();
			this.isVisibilidadCeldaModificarMedidaProdu=this.jButtonModificarMedidaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
			this.isVisibilidadCeldaActualizarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jButtonActualizarMedidaProdu.isVisible();
			this.isVisibilidadCeldaEliminarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jButtonEliminarMedidaProdu.isVisible();
			this.isVisibilidadCeldaCancelarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jButtonCancelarMedidaProdu.isVisible();
			this.isVisibilidadCeldaGuardarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jButtonGuardarCambiosMedidaProdu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosMedidaProdu=this.jButtonGuardarCambiosTablaMedidaProdu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoMedidaProdu=this.jButtonNuevoToolBarMedidaProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMedidaProdu=this.jButtonNuevoRelacionesToolBarMedidaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
			this.isVisibilidadCeldaModificarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jButtonModificarToolBarMedidaProdu.isVisible();
			this.isVisibilidadCeldaActualizarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jButtonActualizarToolBarMedidaProdu.isVisible();
			this.isVisibilidadCeldaEliminarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jButtonEliminarToolBarMedidaProdu.isVisible();
			this.isVisibilidadCeldaCancelarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jButtonCancelarToolBarMedidaProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMedidaProdu=this.jButtonGuardarCambiosToolBarMedidaProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMedidaProdu=this.jButtonGuardarCambiosTablaToolBarMedidaProdu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoMedidaProdu=this.jMenuItemNuevoMedidaProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMedidaProdu=this.jMenuItemNuevoRelacionesMedidaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
			this.isVisibilidadCeldaModificarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jMenuItemModificarMedidaProdu.isVisible();
			this.isVisibilidadCeldaActualizarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jMenuItemActualizarMedidaProdu.isVisible();
			this.isVisibilidadCeldaEliminarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jMenuItemEliminarMedidaProdu.isVisible();
			this.isVisibilidadCeldaCancelarMedidaProdu=this.jInternalFrameDetalleFormMedidaProdu.jMenuItemCancelarMedidaProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMedidaProdu=this.jMenuItemGuardarCambiosMedidaProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMedidaProdu=this.jMenuItemGuardarCambiosTablaMedidaProdu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesMedidaProdu(Boolean esInicializar) {
		if(MedidaProduJInternalFrame.ISBINDING_MANUAL) {			
			if(this.medidaproduSessionBean.getConGuardarRelaciones()) {
				//if(this.medidaproduSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesMedidaProdu();
			}
			
			this.inicializarActualizarBindingBotonesManualMedidaProdu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualMedidaProdu() {
		this.jButtonNuevoMedidaProdu.setVisible(this.isPermisoNuevoMedidaProdu);			
		this.jButtonDuplicarMedidaProdu.setVisible(this.isPermisoDuplicarMedidaProdu);			
		this.jButtonCopiarMedidaProdu.setVisible(this.isPermisoCopiarMedidaProdu);			
		this.jButtonVerFormMedidaProdu.setVisible(this.isPermisoVerFormMedidaProdu);			
		
		this.jButtonAbrirOrderByMedidaProdu.setVisible(this.isPermisoOrdenMedidaProdu);					
		
		this.jButtonNuevoRelacionesMedidaProdu.setVisible(this.isPermisoNuevoMedidaProdu);			
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMedidaProdu.jButtonModificarMedidaProdu.setVisible(this.isPermisoActualizarMedidaProdu);	
			this.jInternalFrameDetalleFormMedidaProdu.jButtonActualizarMedidaProdu.setVisible(this.isPermisoActualizarMedidaProdu);	
			this.jInternalFrameDetalleFormMedidaProdu.jButtonEliminarMedidaProdu.setVisible(this.isPermisoEliminarMedidaProdu);
			this.jInternalFrameDetalleFormMedidaProdu.jButtonCancelarMedidaProdu.setVisible(this.isVisibilidadCeldaCancelarMedidaProdu);						
			this.jInternalFrameDetalleFormMedidaProdu.jButtonGuardarCambiosMedidaProdu.setVisible(this.isPermisoGuardarCambiosMedidaProdu);							
		}
		
		this.jButtonGuardarCambiosTablaMedidaProdu.setVisible(this.isPermisoActualizarMedidaProdu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleMedidaProdu() {
		this.jInternalFrameDetalleFormMedidaProdu.jButtonModificarMedidaProdu.setVisible(this.isPermisoActualizarMedidaProdu);	
		this.jInternalFrameDetalleFormMedidaProdu.jButtonActualizarMedidaProdu.setVisible(this.isPermisoActualizarMedidaProdu);	
		this.jInternalFrameDetalleFormMedidaProdu.jButtonEliminarMedidaProdu.setVisible(this.isPermisoEliminarMedidaProdu);
		this.jInternalFrameDetalleFormMedidaProdu.jButtonCancelarMedidaProdu.setVisible(this.isVisibilidadCeldaCancelarMedidaProdu);							
		this.jInternalFrameDetalleFormMedidaProdu.jButtonGuardarCambiosMedidaProdu.setVisible((this.isVisibilidadCeldaGuardarMedidaProdu && this.isPermisoGuardarCambiosMedidaProdu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosMedidaProdu() {
		if(MedidaProduJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualMedidaProdu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesMedidaProdu() {
	}
	
	public void jTableDatosMedidaProduListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarMedidaProdu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidMedidaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMedidaProdu(this.getmedidaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMedidaProdu(this.medidaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.medidaprodu =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.medidaprodu =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.medidaprodu==null) {
						this.medidaprodu = new MedidaProdu();
					}

					this.setVariablesFormularioToObjetoActualMedidaProdu(this.medidaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMedidaProdu(this.medidaprodu);
				}

				if(this.medidaprodu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.medidaprodu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMedidaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaMedidaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebMedidaProdu(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMedidaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMedidaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaprodu =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.medidaprodu =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMedidaProdu(this.getmedidaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMedidaProdu(this.medidaprodu);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.medidaproduLogic.getConnexion());

				if(this.medidaprodu.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.medidaprodu.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMedidaProdu=(TitledBorder)this.jScrollPanelDatosMedidaProdu.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderMedidaProdu.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaMedidaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMedidaProdu(this.getmedidaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMedidaProdu(this.medidaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.medidaprodu =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.medidaprodu =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.medidaprodu==null) {
						this.medidaprodu = new MedidaProdu();
					}

					this.setVariablesFormularioToObjetoActualMedidaProdu(this.medidaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMedidaProdu(this.medidaprodu);
				}

				if(this.medidaprodu.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.medidaprodu.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMedidaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreMedidaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMedidaProdu(this.getmedidaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMedidaProdu(this.medidaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.medidaprodu =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.medidaprodu =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.medidaprodu==null) {
						this.medidaprodu = new MedidaProdu();
					}

					this.setVariablesFormularioToObjetoActualMedidaProdu(this.medidaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMedidaProdu(this.medidaprodu);
				}

				if(this.medidaprodu.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.medidaprodu.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMedidaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaMedidaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMedidaProdu(false,false);

			this.getMedidaProdusFK_IdEmpresa();

			this.inicializarActualizarBindingMedidaProdu(false);

			//if(MedidaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMedidaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.medidaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameMedidaProdu() {
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
			this.jInternalFrameDetalleFormMedidaProdu.setVisible(false);	    			
			this.jInternalFrameDetalleFormMedidaProdu.dispose();
			this.jInternalFrameDetalleFormMedidaProdu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoMedidaProdu!=null) {
			this.jInternalFrameReporteDinamicoMedidaProdu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoMedidaProdu.dispose();
			this.jInternalFrameReporteDinamicoMedidaProdu=null;
		}
		
		if(this.jInternalFrameImportacionMedidaProdu!=null) {
			this.jInternalFrameImportacionMedidaProdu.setVisible(false);	    			
			this.jInternalFrameImportacionMedidaProdu.dispose();
			this.jInternalFrameImportacionMedidaProdu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessMedidaProdu();
			
			MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
			
			
			if(sTipo.equals("NuevoMedidaProdu")) {
				jButtonNuevoMedidaProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarMedidaProdu")) {
				jButtonDuplicarMedidaProduActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarMedidaProdu")) {
				jButtonCopiarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormMedidaProdu")) {
				jButtonVerFormMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarMedidaProdu")) {
				jButtonNuevoMedidaProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarMedidaProdu")) {
				jButtonDuplicarMedidaProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoMedidaProdu")) {
				jButtonNuevoMedidaProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarMedidaProdu")) {
				jButtonDuplicarMedidaProduActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesMedidaProdu")) {
				jButtonNuevoMedidaProduActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarMedidaProdu")) {
				jButtonNuevoMedidaProduActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesMedidaProdu")) {
				jButtonNuevoMedidaProduActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarMedidaProdu")) {
				jButtonModificarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarMedidaProdu")) {
				jButtonModificarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarMedidaProdu")) {
				jButtonModificarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarMedidaProdu")) {
				jButtonActualizarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarMedidaProdu")) {
				jButtonActualizarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarMedidaProdu")) {
				jButtonActualizarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarMedidaProdu")) {
				jButtonEliminarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarMedidaProdu")) {
				jButtonEliminarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarMedidaProdu")) {
				jButtonEliminarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarMedidaProdu")) {
				jButtonCancelarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarMedidaProdu")) {
				jButtonCancelarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarMedidaProdu")) {
				jButtonCancelarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarMedidaProdu")) {
				jButtonCerrarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarMedidaProdu")) {
				jButtonCerrarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarMedidaProdu")) {
				jButtonCerrarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarMedidaProdu")) {
				jButtonMostrarOcultarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarMedidaProdu")) {
				jButtonCancelarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosMedidaProdu")) {
				jButtonGuardarCambiosMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarMedidaProdu")) {
				jButtonGuardarCambiosMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarMedidaProdu")) {
				jButtonCopiarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarMedidaProdu")) {
				jButtonVerFormMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosMedidaProdu")) {
				jButtonGuardarCambiosMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarMedidaProdu")) {
				jButtonCopiarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormMedidaProdu")) {
				jButtonVerFormMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaMedidaProdu")) {
				jButtonGuardarCambiosMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarMedidaProdu")) {
				jButtonGuardarCambiosMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaMedidaProdu")) {
				jButtonGuardarCambiosMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionMedidaProdu")) {
				jButtonRecargarInformacionMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarMedidaProdu")) {
				jButtonRecargarInformacionMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionMedidaProdu")) {
				jButtonRecargarInformacionMedidaProduActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresMedidaProdu")) {
				jButtonAnterioresMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarMedidaProdu")) {
				jButtonAnterioresMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreMedidaProdu")) {
				jButtonAnterioresMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesMedidaProdu")) {
				jButtonSiguientesMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarMedidaProdu")) {
				jButtonSiguientesMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesMedidaProdu")) {
				jButtonSiguientesMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByMedidaProdu") || sTipo.equals("MenuItemDetalleAbrirOrderByMedidaProdu")) {
				jButtonAbrirOrderByMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarMedidaProdu") || sTipo.equals("MenuItemDetalleMostrarOcultarMedidaProdu")) {
				jButtonMostrarOcultarMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosMedidaProdu")) {
				jButtonNuevoGuardarCambiosMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarMedidaProdu")) {
				jButtonNuevoGuardarCambiosMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosMedidaProdu")) {
				jButtonNuevoGuardarCambiosMedidaProduActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoMedidaProdu")) {
				jButtonCerrarReporteDinamicoMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoMedidaProdu")) {
				jButtonGenerarReporteDinamicoMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoMedidaProdu")) {
				
				jButtonGenerarExcelReporteDinamicoMedidaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionMedidaProdu")) {
				jButtonCerrarImportacionMedidaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionMedidaProdu")) {
				
				jButtonGenerarImportacionMedidaProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionMedidaProdu")) {
				
				jButtonAbrirImportacionMedidaProduActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesMedidaProdu")) {
				jComboBoxTiposAccionesMedidaProduActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesMedidaProdu")) {
				jComboBoxTiposRelacionesMedidaProduActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioMedidaProdu")) {
				jComboBoxTiposAccionesMedidaProduActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarMedidaProdu")) {
				
				jComboBoxTiposSeleccionarMedidaProduActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralMedidaProdu")) {
				jTextFieldValorCampoGeneralMedidaProduActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByMedidaProdu")) {
				jButtonAbrirOrderByMedidaProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarMedidaProdu")) {
				jButtonAbrirOrderByMedidaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByMedidaProdu")) {
				jButtonCerrarOrderByMedidaProduActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMedidaProduBusqueda")) {
				this.jButtonidMedidaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMedidaProduUpdate")) {
				this.jButtonid_empresaMedidaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMedidaProduBusqueda")) {
				this.jButtonid_empresaMedidaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreMedidaProduBusqueda")) {
				this.jButtonnombreMedidaProduBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessMedidaProdu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMedidaProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.medidaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.medidaprodu);
				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
				
				


				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MedidaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MedidaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			MedidaProdu medidaproduLocal=null;
			
			if(!this.getEsControlTabla()) {
				medidaproduLocal=this.medidaprodu;
			} else {
				medidaproduLocal=this.medidaproduAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.medidaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.medidaprodu);
				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
							
				
				


				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MedidaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MedidaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMedidaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduAnterior =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.medidaproduAnterior =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
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
			
			MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
			
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
			
			


			
			MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMedidaProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.medidaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.medidaprodu);
				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
								
						
				


				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MedidaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MedidaProdu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.medidaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.medidaprodu);
				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
								
				
				


				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MedidaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MedidaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMedidaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduAnterior =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.medidaproduAnterior =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.medidaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.medidaprodu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMedidaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduAnterior =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.medidaproduAnterior =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMedidaProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.medidaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.medidaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.medidaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.medidaprodu);
				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
							
				
				


				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MedidaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MedidaProdu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMedidaProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.medidaproduAnterior =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.medidaproduAnterior =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
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
			
			MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
			
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
			
			


			
			MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMedidaProduActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.medidaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.medidaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.medidaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.medidaprodu);
				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
								
				
				


				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MedidaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MedidaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMedidaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduAnterior =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.medidaproduAnterior =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMedidaProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.medidaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.medidaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMedidaProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.medidaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.medidaprodu);
				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosMedidaProdu")) {
					jCheckBoxSeleccionarTodosMedidaProduItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosMedidaProdu")) {
					jCheckBoxSeleccionadosMedidaProduItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarMedidaProdu")) {
					
				}
				
				


				
				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MedidaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MedidaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.medidaprodu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.medidaprodu);
				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
												
				
				


				
				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MedidaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MedidaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMedidaProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.medidaproduAnterior =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.medidaproduAnterior =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMedidaProduActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.medidaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.medidaprodu);
				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
				
				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
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
			
			MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
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
			
			


			
			MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMedidaProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.medidaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.medidaprodu);
				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MedidaProdu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MedidaProdu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.medidaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.medidaprodu);
				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
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
				
				


				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MedidaProdu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MedidaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMedidaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.medidaproduAnterior =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.medidaproduAnterior =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarMedidaProdu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosMedidaProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosMedidaProdu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.medidaprodu =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.medidaprodu =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.medidaprodu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarMedidaProdu")) {
				
				}
				
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarMedidaProdu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosMedidaProdu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarMedidaProdu")) {
			
			}
			
			MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessMedidaProdu();
			
			MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
			
			if(sTipo.equals("NuevoMedidaProdu")) {
				jButtonNuevoMedidaProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarMedidaProdu")) {
				jButtonDuplicarMedidaProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarMedidaProdu")) {
				jButtonCopiarMedidaProduActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormMedidaProdu")) {
				jButtonVerFormMedidaProduActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesMedidaProdu")) {
				jButtonNuevoMedidaProduActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarMedidaProdu")) {
				jButtonModificarMedidaProduActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarMedidaProdu")) {
				jButtonActualizarMedidaProduActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarMedidaProdu")) {
				jButtonEliminarMedidaProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaMedidaProdu")) {
				jButtonGuardarCambiosMedidaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarMedidaProdu")) {
				jButtonCancelarMedidaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarMedidaProdu")) {
				jButtonCerrarMedidaProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosMedidaProdu")) {
				jButtonGuardarCambiosMedidaProduActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosMedidaProdu")) {
				jButtonNuevoGuardarCambiosMedidaProduActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByMedidaProdu")) {
				jButtonAbrirOrderByMedidaProduActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionMedidaProdu")) {
				jButtonRecargarInformacionMedidaProduActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresMedidaProdu")) {
				jButtonAnterioresMedidaProduActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesMedidaProdu")) {
				jButtonSiguientesMedidaProduActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMedidaProduBusqueda")) {
				this.jButtonidMedidaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMedidaProduUpdate")) {
				this.jButtonid_empresaMedidaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMedidaProduBusqueda")) {
				this.jButtonid_empresaMedidaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreMedidaProduBusqueda")) {
				this.jButtonnombreMedidaProduBusquedaActionPerformed(evt);
			}
			
			MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessMedidaProdu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameMedidaProdu")) {
				closingInternalFrameMedidaProdu();
				
			} else if(sTipo.equals("jButtonCancelarMedidaProdu")) {
				JInternalFrameBase jInternalFrameDetalleFormMedidaProdu = (JInternalFrameBase)evt.getSource();
	            	
	            MedidaProduBeanSwingJInternalFrame jInternalFrameParent=(MedidaProduBeanSwingJInternalFrame)jInternalFrameDetalleFormMedidaProdu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarMedidaProduActionPerformed(null);
			}
			
			MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.medidaprodu,new Object(),this.medidaproduParameterGeneral,this.medidaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormMedidaProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormMedidaProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormMedidaProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.medidaprodu)) {
			if(!esControlTabla) {
				if(MedidaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualMedidaProdu(this.medidaprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMedidaProdu(this.medidaprodu);			
				}
				
				if(this.medidaproduSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualMedidaProdu(this.medidaprodu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.medidaproduReturnGeneral=medidaproduLogic.procesarEventosMedidaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.medidaproduLogic.getMedidaProdus(),this.medidaprodu,this.medidaproduParameterGeneral,this.isEsNuevoMedidaProdu,classes);//this.medidaproduLogic.getMedidaProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanMedidaProdu(this.medidaproduReturnGeneral,this.medidaproduBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.medidaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanMedidaProdu(classes,this.medidaproduReturnGeneral,this.medidaproduBean,false);
					}
						
					if(this.medidaproduReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyMedidaProdu(this.medidaproduReturnGeneral.getMedidaProdu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioMedidaProdu(this.medidaproduReturnGeneral.getMedidaProdu());	
					}
						
					if(this.medidaproduReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioMedidaProdu(this.medidaproduReturnGeneral.getMedidaProdu(),classes);//this.medidaproduBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioMedidaProdu(this.medidaprodu,classes);//this.medidaproduBean);									
				}
			
				if(MedidaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualMedidaProdu(this.medidaprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMedidaProdu(this.medidaprodu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.medidaproduAnterior!=null) {
						this.medidaprodu=this.medidaproduAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.medidaproduReturnGeneral=medidaproduLogic.procesarEventosMedidaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.medidaproduLogic.getMedidaProdus(),this.medidaprodu,this.medidaproduParameterGeneral,this.isEsNuevoMedidaProdu,classes);//this.medidaproduLogic.getMedidaProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.medidaproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.medidaproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.medidaproduReturnGeneral.getMedidaProdu(),medidaproduLogic.getMedidaProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.medidaproduReturnGeneral.getMedidaProdu(),this.medidaprodus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosMedidaProdu.repaint();
				
				//((AbstractTableModel) this.jTableDatosMedidaProdu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosMedidaProdu();
			}
		}
	}
	
	public void actualizarVisualTableDatosMedidaProdu() throws Exception {
		
		MedidaProduModel medidaproduModel=(MedidaProduModel)this.jTableDatosMedidaProdu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			medidaproduModel.medidaprodus=this.medidaproduLogic.getMedidaProdus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			medidaproduModel.medidaprodus=this.medidaprodus;
		}
		
		
		((MedidaProduModel) this.jTableDatosMedidaProdu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaMedidaProdu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmedidaproduAnterior(),this.medidaproduLogic.getMedidaProdus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmedidaproduAnterior(),this.medidaprodus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosMedidaProdu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioMedidaProdu(MedidaProdu medidaprodu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
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
										
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.medidaprodu,new Object(),generalEntityParameterGeneral,this.medidaproduReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.medidaproduSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=MedidaProduConstantesFunciones.getClassesRelationshipsOfMedidaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=MedidaProduConstantesFunciones.getClassesRelationshipsFromStringsOfMedidaProdu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormMedidaProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				MedidaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.medidaprodu,new Object(),generalEntityParameterGeneral,this.medidaproduReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioMedidaProdu(MedidaProduBean medidaproduBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanMedidaProdu(ArrayList<Classe> classes,MedidaProduReturnGeneral medidaproduReturnGeneral,MedidaProduBean medidaproduBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualMedidaProdu(MedidaProdu medidaprodu,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.medidaprodu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormMedidaProdu = new MedidaProduDetalleFormJInternalFrame(jDesktopPane,this.medidaproduSessionBean.getConGuardarRelaciones(),this.medidaproduSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormMedidaProdu);
		this.jInternalFrameDetalleFormMedidaProdu.setVisible(false);
		this.jInternalFrameDetalleFormMedidaProdu.setSelected(false);						
		
		this.jInternalFrameDetalleFormMedidaProdu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormMedidaProdu.medidaproduLogic=this.medidaproduLogic;
		
		this.cargarCombosFrameForeignKeyMedidaProdu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleMedidaProdu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMedidaProdu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyMedidaProdu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyMedidaProdu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormMedidaProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMedidaProdu"));
		
		this.jInternalFrameDetalleFormMedidaProdu.jButtonModificarMedidaProdu.addActionListener(new ButtonActionListener(this,"ModificarMedidaProdu"));

		
		this.jInternalFrameDetalleFormMedidaProdu.jButtonModificarToolBarMedidaProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarMedidaProdu"));
					
		this.jInternalFrameDetalleFormMedidaProdu.jMenuItemModificarMedidaProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarMedidaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormMedidaProdu.jButtonActualizarMedidaProdu.addActionListener (new ButtonActionListener(this,"ActualizarMedidaProdu"));
		
		
		this.jInternalFrameDetalleFormMedidaProdu.jButtonActualizarToolBarMedidaProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMedidaProdu"));
						
		this.jInternalFrameDetalleFormMedidaProdu.jMenuItemActualizarMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMedidaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormMedidaProdu.jButtonEliminarMedidaProdu.addActionListener (new ButtonActionListener(this,"EliminarMedidaProdu"));
		
		
		this.jInternalFrameDetalleFormMedidaProdu.jButtonEliminarToolBarMedidaProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarMedidaProdu"));
								
		this.jInternalFrameDetalleFormMedidaProdu.jMenuItemEliminarMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMedidaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormMedidaProdu.jButtonCancelarMedidaProdu.addActionListener (new ButtonActionListener(this,"CancelarMedidaProdu"));
		
		
		this.jInternalFrameDetalleFormMedidaProdu.jButtonCancelarToolBarMedidaProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarMedidaProdu"));
					
		this.jInternalFrameDetalleFormMedidaProdu.jMenuItemCancelarMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMedidaProdu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormMedidaProdu.jMenuItemDetalleCerrarMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMedidaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormMedidaProdu.jButtonGuardarCambiosToolBarMedidaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMedidaProdu"));
		
		
		
		this.jInternalFrameDetalleFormMedidaProdu.jButtonGuardarCambiosToolBarMedidaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMedidaProdu"));
		
		
		
		this.jInternalFrameDetalleFormMedidaProdu.jComboBoxTiposAccionesFormularioMedidaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMedidaProdu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMedidaProdu.jButtonidMedidaProduBusqueda.addActionListener(new ButtonActionListener(this,"idMedidaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMedidaProdu.jButtonid_empresaMedidaProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMedidaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMedidaProdu.jButtonid_empresaMedidaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMedidaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMedidaProdu.jButtonnombreMedidaProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreMedidaProduBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormMedidaProdu.jTabbedPaneRelacionesMedidaProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMedidaProdu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameMedidaProdu"));
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMedidaProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMedidaProdu"));
		}
		
		this.jTableDatosMedidaProdu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarMedidaProdu"));
		
		this.jTableDatosMedidaProdu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarMedidaProdu"));
		
		this.jButtonNuevoMedidaProdu.addActionListener(new ButtonActionListener(this,"NuevoMedidaProdu"));
		
		this.jButtonDuplicarMedidaProdu.addActionListener(new ButtonActionListener(this,"DuplicarMedidaProdu"));
		
		this.jButtonCopiarMedidaProdu.addActionListener(new ButtonActionListener(this,"CopiarMedidaProdu"));
		
		this.jButtonVerFormMedidaProdu.addActionListener(new ButtonActionListener(this,"VerFormMedidaProdu"));
		
		
		this.jButtonNuevoToolBarMedidaProdu.addActionListener(new ButtonActionListener(this,"NuevoToolBarMedidaProdu"));
			
		this.jButtonDuplicarToolBarMedidaProdu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarMedidaProdu"));
			
		this.jMenuItemNuevoMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoMedidaProdu"));
			
		this.jMenuItemDuplicarMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarMedidaProdu"));		
		
		
		this.jButtonNuevoRelacionesMedidaProdu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesMedidaProdu"));
		
		
		this.jButtonNuevoRelacionesToolBarMedidaProdu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarMedidaProdu"));
			
		this.jMenuItemNuevoRelacionesMedidaProdu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesMedidaProdu"));		
		
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMedidaProdu.jButtonModificarMedidaProdu.addActionListener(new ButtonActionListener(this,"ModificarMedidaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMedidaProdu.jButtonModificarToolBarMedidaProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarMedidaProdu"));
			
			this.jInternalFrameDetalleFormMedidaProdu.jMenuItemModificarMedidaProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarMedidaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormMedidaProdu.jButtonActualizarMedidaProdu.addActionListener (new ButtonActionListener(this,"ActualizarMedidaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMedidaProdu.jButtonActualizarToolBarMedidaProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMedidaProdu"));
				
			this.jInternalFrameDetalleFormMedidaProdu.jMenuItemActualizarMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMedidaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMedidaProdu.jButtonEliminarMedidaProdu.addActionListener (new ButtonActionListener(this,"EliminarMedidaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMedidaProdu.jButtonEliminarToolBarMedidaProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarMedidaProdu"));
						
			this.jInternalFrameDetalleFormMedidaProdu.jMenuItemEliminarMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMedidaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMedidaProdu.jButtonCancelarMedidaProdu.addActionListener (new ButtonActionListener(this,"CancelarMedidaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMedidaProdu.jButtonCancelarToolBarMedidaProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarMedidaProdu"));
			
			this.jInternalFrameDetalleFormMedidaProdu.jMenuItemCancelarMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMedidaProdu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarMedidaProdu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarMedidaProdu"));		
		
		
		this.jButtonCerrarMedidaProdu.addActionListener (new ButtonActionListener(this,"CerrarMedidaProdu"));
		
		
		this.jButtonCerrarToolBarMedidaProdu.addActionListener (new ButtonActionListener(this,"CerrarToolBarMedidaProdu"));
			
		this.jMenuItemCerrarMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarMedidaProdu"));
			
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMedidaProdu.jMenuItemDetalleCerrarMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMedidaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMedidaProdu.jButtonGuardarCambiosMedidaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosMedidaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMedidaProdu.jButtonGuardarCambiosToolBarMedidaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMedidaProdu"));
		}
		
		this.jButtonCopiarToolBarMedidaProdu.addActionListener (new ButtonActionListener(this,"CopiarToolBarMedidaProdu"));
			
		this.jButtonVerFormToolBarMedidaProdu.addActionListener (new ButtonActionListener(this,"VerFormToolBarMedidaProdu"));
		
		this.jMenuItemGuardarCambiosMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosMedidaProdu"));
			
		this.jMenuItemCopiarMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarMedidaProdu"));		
		
		this.jMenuItemVerFormMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormMedidaProdu"));		
		
		
		this.jButtonGuardarCambiosTablaMedidaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMedidaProdu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarMedidaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarMedidaProdu"));
			
		this.jMenuItemGuardarCambiosTablaMedidaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMedidaProdu"));		
		
		
		
		this.jButtonRecargarInformacionMedidaProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionMedidaProdu"));
					
		this.jButtonRecargarInformacionToolBarMedidaProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarMedidaProdu"));
		
		this.jMenuItemRecargarInformacionMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionMedidaProdu"));		
		
		
		
		this.jButtonAnterioresMedidaProdu.addActionListener (new ButtonActionListener(this,"AnterioresMedidaProdu"));
		
		
		this.jButtonAnterioresToolBarMedidaProdu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarMedidaProdu"));
		
		this.jMenuItemAnterioresMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresMedidaProdu"));		
		
		
		this.jButtonSiguientesMedidaProdu.addActionListener (new ButtonActionListener(this,"SiguientesMedidaProdu"));
		
		
		this.jButtonSiguientesToolBarMedidaProdu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarMedidaProdu"));
			
		this.jMenuItemSiguientesMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesMedidaProdu"));
			
		this.jMenuItemAbrirOrderByMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByMedidaProdu"));
			
		this.jMenuItemMostrarOcultarMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarMedidaProdu"));
			
		this.jMenuItemDetalleAbrirOrderByMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByMedidaProdu"));
			
		this.jMenuItemDetalleMostarOcultarMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarMedidaProdu"));		
		
		
		this.jButtonNuevoGuardarCambiosMedidaProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosMedidaProdu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarMedidaProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarMedidaProdu"));
			
		this.jMenuItemNuevoGuardarCambiosMedidaProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosMedidaProdu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosMedidaProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosMedidaProdu"));

		this.jCheckBoxSeleccionadosMedidaProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosMedidaProdu"));
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMedidaProdu.jComboBoxTiposAccionesFormularioMedidaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMedidaProdu"));
		}
		
		
		this.jComboBoxTiposRelacionesMedidaProdu.addActionListener (new ButtonActionListener(this,"TiposRelacionesMedidaProdu"));
			
		this.jComboBoxTiposAccionesMedidaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesMedidaProdu"));
					
		this.jComboBoxTiposSeleccionarMedidaProdu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarMedidaProdu"));
			
		this.jTextFieldValorCampoGeneralMedidaProdu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralMedidaProdu"));		
		
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMedidaProdu.jButtonidMedidaProduBusqueda.addActionListener(new ButtonActionListener(this,"idMedidaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMedidaProdu.jButtonid_empresaMedidaProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMedidaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMedidaProdu.jButtonid_empresaMedidaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMedidaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMedidaProdu.jButtonnombreMedidaProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreMedidaProduBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoMedidaProdu!=null) {
				this.jInternalFrameReporteDinamicoMedidaProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMedidaProdu"));
				this.jInternalFrameReporteDinamicoMedidaProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMedidaProdu"));
				this.jInternalFrameReporteDinamicoMedidaProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMedidaProdu"));
			}
			
			//this.jButtonCerrarReporteDinamicoMedidaProdu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMedidaProdu"));				
			//this.jButtonGenerarReporteDinamicoMedidaProdu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMedidaProdu"));
			//this.jButtonGenerarExcelReporteDinamicoMedidaProdu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMedidaProdu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionMedidaProdu!=null) {
				this.jInternalFrameImportacionMedidaProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMedidaProdu"));
				this.jInternalFrameImportacionMedidaProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMedidaProdu"));
				this.jInternalFrameImportacionMedidaProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMedidaProdu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByMedidaProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByMedidaProdu"));
			
			this.jButtonAbrirOrderByToolBarMedidaProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarMedidaProdu"));			
			
			if(this.jInternalFrameOrderByMedidaProdu!=null) {
				this.jInternalFrameOrderByMedidaProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMedidaProdu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMedidaProdu.jTabbedPaneRelacionesMedidaProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMedidaProdu"));
		
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
            		closingInternalFrameMedidaProdu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormMedidaProdu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormMedidaProdu = (JInternalFrameBase)event.getSource();
	            	
	            MedidaProduBeanSwingJInternalFrame jInternalFrameParent=(MedidaProduBeanSwingJInternalFrame)jInternalFrameDetalleFormMedidaProdu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarMedidaProduActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosMedidaProdu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosMedidaProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosMedidaProdu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosMedidaProdu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMedidaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMedidaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMedidaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoMedidaProdu";
		inputMap = this.jButtonNuevoMedidaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoMedidaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMedidaProduActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMedidaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMedidaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMedidaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesMedidaProdu";
		inputMap = this.jButtonNuevoRelacionesMedidaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesMedidaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMedidaProduActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarMedidaProdu";
		inputMap = this.jButtonModificarMedidaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarMedidaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarMedidaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarMedidaProdu";
		inputMap = this.jButtonActualizarMedidaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarMedidaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarMedidaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarMedidaProdu";
		inputMap = this.jButtonEliminarMedidaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarMedidaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarMedidaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarMedidaProdu";
		inputMap = this.jButtonCancelarMedidaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarMedidaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarMedidaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarMedidaProdu";
		inputMap = this.jButtonCerrarMedidaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarMedidaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarMedidaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormMedidaProdu.jButtonGuardarCambiosMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosMedidaProdu";
		inputMap = this.jInternalFrameDetalleFormMedidaProdu.jButtonGuardarCambiosMedidaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormMedidaProdu.jButtonGuardarCambiosMedidaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosMedidaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosMedidaProdu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosMedidaProduItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesMedidaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesMedidaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarMedidaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarMedidaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralMedidaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralMedidaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMedidaProdu.jButtonidMedidaProduBusqueda.addActionListener(new ButtonActionListener(this,"idMedidaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMedidaProdu.jButtonid_empresaMedidaProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMedidaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMedidaProdu.jButtonid_empresaMedidaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMedidaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMedidaProdu.jButtonnombreMedidaProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreMedidaProduBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionMedidaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionMedidaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarMedidaProduActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarMedidaProdu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosMedidaProdu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(MedidaProdu medidaproduAux:this.medidaproduLogic.getMedidaProdus()) {
					medidaproduAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MedidaProdu medidaproduAux:medidaprodus) {
					medidaproduAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosMedidaProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMedidaProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MedidaProdu medidaproduAux:this.medidaproduLogic.getMedidaProdus()) {
						medidaproduAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MedidaProdu medidaproduAux:medidaprodus) {
						medidaproduAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(MedidaProdu medidaproduAux:this.medidaproduLogic.getMedidaProdus()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MedidaProdu medidaproduAux:medidaprodus) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaMedidaProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMedidaProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMedidaProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMedidaProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosMedidaProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMedidaProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosMedidaProdu.getSelectedRows();
			
			MedidaProdu medidaproduLocal=new MedidaProdu();
			
			//this.seleccionarTodosMedidaProdu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					medidaproduLocal =(MedidaProdu) this.medidaproduLogic.getMedidaProdus().toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					medidaproduLocal =(MedidaProdu) this.medidaprodus.toArray()[this.jTableDatosMedidaProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				medidaproduLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MedidaProdu medidaproduAux:this.medidaproduLogic.getMedidaProdus()) {
						medidaproduAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MedidaProdu medidaproduAux:medidaprodus) {
						medidaproduAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaMedidaProdu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMedidaProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMedidaProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMedidaProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualMedidaProduItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarMedidaProduParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralMedidaProduActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingMedidaProdu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralMedidaProdu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MedidaProdu medidaproduAux:this.medidaproduLogic.getMedidaProdus()) {
				
						if(sTipoSeleccionar.equals(MedidaProduConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							medidaproduAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MedidaProdu medidaproduAux:medidaprodus) {
					
						if(sTipoSeleccionar.equals(MedidaProduConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							medidaproduAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaMedidaProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesMedidaProduActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingMedidaProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioMedidaProdu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesMedidaProdu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormMedidaProdu.jComboBoxTiposAccionesFormularioMedidaProdu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteMedidaProdu) {				
					conSplash=true;//false;										
					
					//this.startProcessMedidaProdu(conSplash);
				
					this.generarReporteMedidaProdusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMedidaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMedidaProdu.jComboBoxTiposAccionesFormularioMedidaProdu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoMedidaProdusSeleccionados();
				//this.jComboBoxTiposAccionesMedidaProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMedidaProdusSeleccionados(false);
				//this.jComboBoxTiposAccionesMedidaProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMedidaProdusSeleccionados(true);
				//this.jComboBoxTiposAccionesMedidaProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMedidaProdu();
				
				this.exportarMedidaProdusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMedidaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMedidaProdu.jComboBoxTiposAccionesFormularioMedidaProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionMedidaProdus();
				//this.importarMedidaProdus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMedidaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMedidaProdu.jComboBoxTiposAccionesFormularioMedidaProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMedidaProdu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelMedidaProdusSeleccionados();
				//this.jComboBoxTiposAccionesMedidaProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Medida Produ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessMedidaProdu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoMedidaProdu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyMedidaProdu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Medida Produ",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMedidaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMedidaProdu.jComboBoxTiposAccionesFormularioMedidaProdu.setSelectedIndex(0);					
				}	
			} 			
			else if(MedidaProduBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteMedidaProdu) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessMedidaProdu(conSplash);
					
						//this.actualizarParametrosGeneralMedidaProdu();
						
						this.generarReporteProcesoAccionMedidaProdusSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesMedidaProdu.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormMedidaProdu.jComboBoxTiposAccionesFormularioMedidaProdu.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(MedidaProduBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Medida ProduS SELECCIONADOS?", "MANTENIMIENTO DE Medida Produ", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessMedidaProdu();
				
						this.actualizarParametrosGeneralMedidaProdu();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.medidaproduReturnGeneral=medidaproduLogic.procesarAccionMedidaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.medidaproduLogic.getMedidaProdus(),this.medidaproduParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarMedidaProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMedidaProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMedidaProdu.jComboBoxTiposAccionesFormularioMedidaProdu.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralMedidaProdu();
					
					MedidaProduBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarMedidaProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMedidaProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMedidaProdu.jComboBoxTiposAccionesFormularioMedidaProdu.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessMedidaProdu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesMedidaProduActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessMedidaProdu();
			
			if(this.jInternalFrameDetalleFormMedidaProdu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<MedidaProdu> medidaprodusSeleccionados=new ArrayList<MedidaProdu>();		
			MedidaProdu medidaprodu=new MedidaProdu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingMedidaProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesMedidaProdu.getSelectedItem();
			
			
			
			
			medidaprodusSeleccionados=this.getMedidaProdusSeleccionados(true);
			//this.sTipoAccion;
			
			if(medidaprodusSeleccionados.size()==1) {
				for(MedidaProdu medidaproduAux:medidaprodusSeleccionados) {
					medidaprodu=medidaproduAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessMedidaProdu();
			
      		//this.finishProcessMedidaProdu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarMedidaProduReturnGeneral() throws Exception {
		if(this.medidaproduReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.medidaproduReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.medidaproduReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.medidaproduReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.medidaproduReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.medidaproduReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingMedidaProdu(false);
		}
		
		if(this.medidaproduReturnGeneral.getConRetornoLista() || this.medidaproduReturnGeneral.getConRetornoObjeto()) {
			if(this.medidaproduReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.medidaproduLogic.setMedidaProdus(this.medidaproduReturnGeneral.getMedidaProdus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.medidaproduReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.medidaproduLogic.setMedidaProdu(this.medidaproduReturnGeneral.getMedidaProdu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingMedidaProdu(false);
		}
	}
	
	public void actualizarParametrosGeneralMedidaProdu() throws Exception {
		
		
	}
	
	public ArrayList<MedidaProdu> getMedidaProdusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<MedidaProdu> medidaprodusSeleccionados=new ArrayList<MedidaProdu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioMedidaProdu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(MedidaProdu medidaproduAux:medidaproduLogic.getMedidaProdus()) {
					if(medidaproduAux.getIsSelected()) {
						medidaprodusSeleccionados.add(medidaproduAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MedidaProdu medidaproduAux:this.medidaprodus) {
					if(medidaproduAux.getIsSelected()) {
						medidaprodusSeleccionados.add(medidaproduAux);				
					}
				}
			}
			
			if(medidaprodusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						medidaprodusSeleccionados.addAll(this.medidaproduLogic.getMedidaProdus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						medidaprodusSeleccionados.addAll(this.medidaprodus);				
					}
				}
			}
		} else {
			medidaprodusSeleccionados.add(this.medidaprodu);
		}
		
		return medidaprodusSeleccionados;
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
	
	public void generarReporteMedidaProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalMedidaProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoMedidaProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMedidaProdusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMedidaProdusSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Medida Produ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesMedidaProdusSeleccionados() throws Exception {
		ArrayList<MedidaProdu> medidaprodusSeleccionados=new ArrayList<MedidaProdu>();		
		
		medidaprodusSeleccionados=this.getMedidaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteMedidaProdus("Todos",medidaprodusSeleccionados);
		
	}	
	
	public void generarReporteNormalMedidaProdusSeleccionados() throws Exception {
		ArrayList<MedidaProdu> medidaprodusSeleccionados=new ArrayList<MedidaProdu>();		
		
		medidaprodusSeleccionados=this.getMedidaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteMedidaProdus("Todos",medidaprodusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionMedidaProdusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<MedidaProdu> medidaprodusSeleccionados=new ArrayList<MedidaProdu>();
		
		medidaprodusSeleccionados=this.getMedidaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteMedidaProdus("Todos",medidaprodusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoMedidaProdusSeleccionados() throws Exception {
		ArrayList<MedidaProdu> medidaprodusSeleccionados=new ArrayList<MedidaProdu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoMedidaProdu();
		
		
		medidaprodusSeleccionados=this.getMedidaProdusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoMedidaProdu();
		
		
		//this.generarReporteMedidaProdus("Todos",medidaprodusSeleccionados ,medidaproduImplementable,medidaproduImplementableHome);
	}
	
	public void mostrarImportacionMedidaProdus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionMedidaProdu();
		
		this.abrirFrameImportacionMedidaProdu();		
		
			
		//this.generarReporteMedidaProdus("Todos",medidaprodusSeleccionados ,medidaproduImplementable,medidaproduImplementableHome);
	}
	
	public void importarMedidaProdus() throws Exception {		
	
	}
	
	public void exportarMedidaProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelMedidaProdusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoMedidaProdusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlMedidaProdusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Medida Produ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoMedidaProdusSeleccionados() throws Exception {
		ArrayList<MedidaProdu> medidaprodusSeleccionados=new ArrayList<MedidaProdu>();		
		
		medidaprodusSeleccionados=this.getMedidaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"medidaprodu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarMedidaProdu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(MedidaProdu medidaproduAux:medidaprodusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarMedidaProdu(medidaproduAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//medidaproduAux.setsDetalleGeneralEntityReporte(medidaproduAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.medidaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Medida Produ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarMedidaProdu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=MedidaProduConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MedidaProduConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MedidaProduConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MedidaProduConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarMedidaProdu(MedidaProdu medidaprodu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=medidaprodu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=medidaprodu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=medidaprodu.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=medidaprodu.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelMedidaProdusSeleccionados() throws Exception {
		ArrayList<MedidaProdu> medidaprodusSeleccionados=new ArrayList<MedidaProdu>();		
		
		medidaprodusSeleccionados=this.getMedidaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"medidaprodu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("MedidaProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelMedidaProdu(row);				
				iRow++;
			}				
			
			for(MedidaProdu medidaproduAux:medidaprodusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelMedidaProdu(medidaproduAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.medidaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Medida Produ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlMedidaProdusSeleccionados() throws Exception {
		ArrayList<MedidaProdu> medidaprodusSeleccionados=new ArrayList<MedidaProdu>();		
		
		medidaprodusSeleccionados=this.getMedidaProdusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"medidaprodu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("medidaprodus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("medidaprodu");
			//elementRoot.appendChild(element);
		
			for(MedidaProdu medidaproduAux:medidaprodusSeleccionados) {
				element = document.createElement("medidaprodu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlMedidaProdu(medidaproduAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.medidaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Medida Produ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelMedidaProdu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(MedidaProduConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(MedidaProduConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(MedidaProduConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(MedidaProduConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelMedidaProdu(MedidaProdu medidaprodu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(medidaprodu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(medidaprodu.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(medidaprodu.getnombre());				
	}
	
	public void setFilaDatosExportarXmlMedidaProdu(MedidaProdu medidaprodu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(MedidaProduConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(medidaprodu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(MedidaProduConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(medidaprodu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(MedidaProduConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(medidaprodu.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(MedidaProduConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(medidaprodu.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoMedidaProdusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<MedidaProdu> medidaprodusSeleccionados=new ArrayList<MedidaProdu>();
		
		medidaprodusSeleccionados=this.getMedidaProdusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoMedidaProdu(medidaprodusSeleccionados);
		
		this.generarReporteMedidaProdus("Todos",medidaprodusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoMedidaProdu(ArrayList<MedidaProdu> medidaprodusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(MedidaProdu medidaproduAux:medidaprodusSeleccionados) {
				medidaproduAux.setsDetalleGeneralEntityReporte(medidaproduAux.toString());
			
				if(sTipoSeleccionar.equals(MedidaProduConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					medidaproduAux.setsDescripcionGeneralEntityReporte1(medidaproduAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MedidaProduConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					medidaproduAux.setsDescripcionGeneralEntityReporte1(medidaproduAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MedidaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesMedidaProdu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoMedidaProdu=true;
				this.isVisibilidadCeldaNuevoRelacionesMedidaProdu=true;
				this.isVisibilidadCeldaGuardarCambiosMedidaProdu=true;
			}
			
			this.isVisibilidadCeldaModificarMedidaProdu=false;
			this.isVisibilidadCeldaActualizarMedidaProdu=false;
			this.isVisibilidadCeldaEliminarMedidaProdu=false;
			this.isVisibilidadCeldaCancelarMedidaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMedidaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarMedidaProdu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoMedidaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesMedidaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosMedidaProdu=false;
			this.isVisibilidadCeldaModificarMedidaProdu=false;
			this.isVisibilidadCeldaActualizarMedidaProdu=true;
			this.isVisibilidadCeldaEliminarMedidaProdu=false;
			this.isVisibilidadCeldaCancelarMedidaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMedidaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarMedidaProdu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoMedidaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesMedidaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosMedidaProdu=false;
			this.isVisibilidadCeldaModificarMedidaProdu=false;
			this.isVisibilidadCeldaActualizarMedidaProdu=true;
			this.isVisibilidadCeldaEliminarMedidaProdu=true;
			this.isVisibilidadCeldaCancelarMedidaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMedidaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarMedidaProdu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoMedidaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesMedidaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosMedidaProdu=false;
			this.isVisibilidadCeldaModificarMedidaProdu=false;
			this.isVisibilidadCeldaActualizarMedidaProdu=true;
			this.isVisibilidadCeldaEliminarMedidaProdu=false;
			this.isVisibilidadCeldaCancelarMedidaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMedidaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarMedidaProdu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoMedidaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesMedidaProdu=true;
			this.isVisibilidadCeldaGuardarCambiosMedidaProdu=true;
			this.isVisibilidadCeldaModificarMedidaProdu=false;
			this.isVisibilidadCeldaActualizarMedidaProdu=false;
			this.isVisibilidadCeldaEliminarMedidaProdu=false;
			this.isVisibilidadCeldaCancelarMedidaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMedidaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarMedidaProdu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoMedidaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesMedidaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosMedidaProdu=false;
			this.isVisibilidadCeldaActualizarMedidaProdu=false;
			this.isVisibilidadCeldaEliminarMedidaProdu=false;
			this.isVisibilidadCeldaCancelarMedidaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMedidaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarMedidaProdu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoMedidaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesMedidaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosMedidaProdu=false;
			this.isVisibilidadCeldaModificarMedidaProdu=true;
			this.isVisibilidadCeldaActualizarMedidaProdu=false;
			this.isVisibilidadCeldaEliminarMedidaProdu=false;
			this.isVisibilidadCeldaCancelarMedidaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMedidaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarMedidaProdu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(MedidaProduJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoMedidaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesMedidaProdu=true;
			this.isVisibilidadCeldaGuardarCambiosMedidaProdu=true;
		} else {
			this.actualizarEstadoPanelsMedidaProdu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarMedidaProdu=false;
			//this.isVisibilidadCeldaVerFormMedidaProdu=false;
			this.isVisibilidadCeldaDuplicarMedidaProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!medidaproduSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesMedidaProdu=false;
		} else {
			this.isVisibilidadCeldaNuevoMedidaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosMedidaProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(medidaproduSessionBean.getEsGuardarRelacionado()) {
			if(!medidaproduSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesMedidaProdu=false;												
			}
			
			this.jButtonCerrarMedidaProdu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesMedidaProdu=false;
		}
		
		if(!this.permiteMantenimiento(this.medidaprodu)) {
			this.isVisibilidadCeldaActualizarMedidaProdu=false;
			this.isVisibilidadCeldaEliminarMedidaProdu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesMedidaProdu() {
	}
	
	public void actualizarEstadoPanelsMedidaProdu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionMedidaProdu!=null) {
				this.jScrollPanelDatosEdicionMedidaProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMedidaProdu!=null) {
				this.jTabbedPaneBusquedasMedidaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMedidaProdu!=null) {
				this.jScrollPanelDatosMedidaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionMedidaProdu!=null) {
				this.jPanelPaginacionMedidaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMedidaProdu!=null) {
				this.jPanelParametrosReportesMedidaProdu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionMedidaProdu!=null) {
				this.jScrollPanelDatosEdicionMedidaProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMedidaProdu!=null) {
				this.jTabbedPaneBusquedasMedidaProdu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosMedidaProdu!=null) {
				this.jScrollPanelDatosMedidaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionMedidaProdu!=null) {
				this.jPanelPaginacionMedidaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMedidaProdu!=null) {
				this.jPanelParametrosReportesMedidaProdu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionMedidaProdu!=null) {
				this.jScrollPanelDatosEdicionMedidaProdu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMedidaProdu!=null) {
				this.jTabbedPaneBusquedasMedidaProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMedidaProdu!=null) {
				this.jScrollPanelDatosMedidaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionMedidaProdu!=null) {
				this.jPanelPaginacionMedidaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMedidaProdu!=null) {
				this.jPanelParametrosReportesMedidaProdu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionMedidaProdu!=null) {
				this.jScrollPanelDatosEdicionMedidaProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMedidaProdu!=null) {
				this.jTabbedPaneBusquedasMedidaProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMedidaProdu!=null) {
				this.jScrollPanelDatosMedidaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionMedidaProdu!=null) {
				this.jPanelPaginacionMedidaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMedidaProdu!=null) {
				this.jPanelParametrosReportesMedidaProdu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionMedidaProdu!=null) {
				this.jScrollPanelDatosEdicionMedidaProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMedidaProdu!=null) {
				this.jTabbedPaneBusquedasMedidaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMedidaProdu!=null) {
				this.jScrollPanelDatosMedidaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionMedidaProdu!=null) {
				this.jPanelPaginacionMedidaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMedidaProdu!=null) {
				this.jPanelParametrosReportesMedidaProdu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionMedidaProdu!=null) {
				this.jScrollPanelDatosEdicionMedidaProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMedidaProdu!=null) {
				this.jTabbedPaneBusquedasMedidaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMedidaProdu!=null) {
				this.jScrollPanelDatosMedidaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionMedidaProdu!=null) {
				this.jPanelPaginacionMedidaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMedidaProdu!=null) {
				this.jPanelParametrosReportesMedidaProdu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionMedidaProdu!=null) {
				this.jScrollPanelDatosEdicionMedidaProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMedidaProdu!=null) {
				this.jTabbedPaneBusquedasMedidaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMedidaProdu!=null) {
				this.jScrollPanelDatosMedidaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionMedidaProdu!=null) {
				this.jPanelPaginacionMedidaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMedidaProdu!=null) {
				this.jPanelParametrosReportesMedidaProdu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.medidaproduSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasMedidaProdu!=null) {
					this.jTabbedPaneBusquedasMedidaProdu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesMedidaProdu!=null) {
				this.jPanelParametrosReportesMedidaProdu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.medidaproduSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMedidaProdu!=null) {
				this.jTabbedPaneBusquedasMedidaProdu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesMedidaProdu!=null) {
				this.jPanelParametrosReportesMedidaProdu.setVisible(true);
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
		
		//MedidaProduSessionBean medidaproduSessionBean=new MedidaProduSessionBean();
		
		if(this.medidaproduSessionBean==null) {
			this.medidaproduSessionBean=new MedidaProduSessionBean();
		}
		
		this.medidaproduSessionBean.setsUltimaBusquedaMedidaProdu(this.getsAccionBusqueda());
		this.medidaproduSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.medidaproduSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			medidaproduSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//MedidaProduSessionBean medidaproduSessionBean=new MedidaProduSessionBean();
		
		if(this.medidaproduSessionBean==null) {
			this.medidaproduSessionBean=new MedidaProduSessionBean();
		}
		
		if(this.medidaproduSessionBean.getsUltimaBusquedaMedidaProdu()!=null&&!this.medidaproduSessionBean.getsUltimaBusquedaMedidaProdu().equals("")) {
			this.setsAccionBusqueda(medidaproduSessionBean.getsUltimaBusquedaMedidaProdu());
			this.setiNumeroPaginacion(medidaproduSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(medidaproduSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(medidaproduSessionBean.getid_empresa());
				medidaproduSessionBean.setid_empresa(-1L);
			}
		}
		
		this.medidaproduSessionBean.setsUltimaBusquedaMedidaProdu("");
		this.medidaproduSessionBean.setiNumeroPaginacion(MedidaProduConstantesFunciones.INUMEROPAGINACION);
		this.medidaproduSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaMedidaProdu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioMedidaProdu() {
		this.updateBorderResaltarBusquedasFormularioMedidaProdu();
		this.updateVisibilidadBusquedasFormularioMedidaProdu();
		this.updateHabilitarBusquedasFormularioMedidaProdu();
	}
	
	public void updateBorderResaltarBusquedasFormularioMedidaProdu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasMedidaProdu.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioMedidaProdu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasMedidaProdu.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioMedidaProdu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasMedidaProdu.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaMedidaProdu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarMedidaProdu.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioMedidaProdu() throws Exception {

		if(this.jInternalFrameDetalleFormMedidaProdu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioMedidaProdu();
		this.updateVisibilidadResaltarControlesFormularioMedidaProdu();
		this.updateHabilitarResaltarControlesFormularioMedidaProdu();
		
	}
	
	public void updateBorderResaltarControlesFormularioMedidaProdu() throws Exception {
		if(this.jInternalFrameDetalleFormMedidaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.medidaproduConstantesFunciones.resaltaridMedidaProdu!=null && this.jInternalFrameDetalleFormMedidaProdu!=null) {this.jInternalFrameDetalleFormMedidaProdu.jLabelidMedidaProdu.setBorder(this.medidaproduConstantesFunciones.resaltaridMedidaProdu);}
		if(this.medidaproduConstantesFunciones.resaltarid_empresaMedidaProdu!=null && this.jInternalFrameDetalleFormMedidaProdu!=null) {this.jInternalFrameDetalleFormMedidaProdu.jComboBoxid_empresaMedidaProdu.setBorder(this.medidaproduConstantesFunciones.resaltarid_empresaMedidaProdu);}
		if(this.medidaproduConstantesFunciones.resaltarnombreMedidaProdu!=null && this.jInternalFrameDetalleFormMedidaProdu!=null) {this.jInternalFrameDetalleFormMedidaProdu.jTextAreanombreMedidaProdu.setBorder(this.medidaproduConstantesFunciones.resaltarnombreMedidaProdu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioMedidaProdu() throws Exception {		
		if(this.jInternalFrameDetalleFormMedidaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
	
		//this.jInternalFrameDetalleFormMedidaProdu.jLabelidMedidaProdu.setVisible(this.medidaproduConstantesFunciones.mostraridMedidaProdu);
		this.jInternalFrameDetalleFormMedidaProdu.jPanelidMedidaProdu.setVisible(this.medidaproduConstantesFunciones.mostraridMedidaProdu);
		//this.jInternalFrameDetalleFormMedidaProdu.jComboBoxid_empresaMedidaProdu.setVisible(this.medidaproduConstantesFunciones.mostrarid_empresaMedidaProdu);
		this.jInternalFrameDetalleFormMedidaProdu.jPanelid_empresaMedidaProdu.setVisible(this.medidaproduConstantesFunciones.mostrarid_empresaMedidaProdu);
		//this.jInternalFrameDetalleFormMedidaProdu.jTextAreanombreMedidaProdu.setVisible(this.medidaproduConstantesFunciones.mostrarnombreMedidaProdu);
		this.jInternalFrameDetalleFormMedidaProdu.jPanelnombreMedidaProdu.setVisible(this.medidaproduConstantesFunciones.mostrarnombreMedidaProdu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioMedidaProdu() throws Exception {
		if(this.jInternalFrameDetalleFormMedidaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMedidaProdu!=null) {
	
		this.jInternalFrameDetalleFormMedidaProdu.jLabelidMedidaProdu.setEnabled(this.medidaproduConstantesFunciones.activaridMedidaProdu);
		this.jInternalFrameDetalleFormMedidaProdu.jComboBoxid_empresaMedidaProdu.setEnabled(this.medidaproduConstantesFunciones.activarid_empresaMedidaProdu);
		this.jInternalFrameDetalleFormMedidaProdu.jTextAreanombreMedidaProdu.setEnabled(this.medidaproduConstantesFunciones.activarnombreMedidaProdu);
		}
	}
	
		
}