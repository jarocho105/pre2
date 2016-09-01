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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;




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

import com.bydan.erp.tesoreria.util.TipoCuentaBancoConstantesFunciones;
import com.bydan.erp.tesoreria.util.TipoCuentaBancoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.TipoCuentaBancoParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.TipoCuentaBancoBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoCuentaBancoBeanSwingJInternalFrame extends TipoCuentaBancoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCuentaBancoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCuentaBanco> tipocuentabancoValidator = new ClassValidator<TipoCuentaBanco>(TipoCuentaBanco.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCuentaBanco tipocuentabanco;	
	public TipoCuentaBanco tipocuentabancoAux;
	public TipoCuentaBanco tipocuentabancoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCuentaBanco tipocuentabancoTotales;
	public Long idTipoCuentaBancoActual;
	public Long iIdNuevoTipoCuentaBanco=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosReferenciaBancaria=false;

	public Boolean getIsTienePermisosReferenciaBancaria() {
		return isTienePermisosReferenciaBancaria;
	}

	public void setIsTienePermisosReferenciaBancaria(Boolean isTienePermisosReferenciaBancaria) {
		this.isTienePermisosReferenciaBancaria= isTienePermisosReferenciaBancaria;
	}


	public Boolean isTienePermisosTipoCuentaBancoGeneral=false;

	public Boolean getIsTienePermisosTipoCuentaBancoGeneral() {
		return isTienePermisosTipoCuentaBancoGeneral;
	}

	public void setIsTienePermisosTipoCuentaBancoGeneral(Boolean isTienePermisosTipoCuentaBancoGeneral) {
		this.isTienePermisosTipoCuentaBancoGeneral= isTienePermisosTipoCuentaBancoGeneral;
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
	
	public Boolean isPermisoTodoTipoCuentaBanco;
	public Boolean isPermisoNuevoTipoCuentaBanco;
	public Boolean isPermisoActualizarTipoCuentaBanco;
	public Boolean isPermisoActualizarOriginalTipoCuentaBanco;
	public Boolean isPermisoEliminarTipoCuentaBanco;
	public Boolean isPermisoGuardarCambiosTipoCuentaBanco;
	public Boolean isPermisoConsultaTipoCuentaBanco;
	public Boolean isPermisoBusquedaTipoCuentaBanco;
	public Boolean isPermisoReporteTipoCuentaBanco;
	public Boolean isPermisoPaginacionMedioTipoCuentaBanco;
	public Boolean isPermisoPaginacionAltoTipoCuentaBanco;
	public Boolean isPermisoPaginacionTodoTipoCuentaBanco;
	public Boolean isPermisoCopiarTipoCuentaBanco;
	public Boolean isPermisoVerFormTipoCuentaBanco;
	public Boolean isPermisoDuplicarTipoCuentaBanco;
	public Boolean isPermisoOrdenTipoCuentaBanco;
	
	
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
	
	public TipoCuentaBancoParameterReturnGeneral tipocuentabancoReturnGeneral;
	public TipoCuentaBancoParameterReturnGeneral tipocuentabancoParameterGeneral;
	
	

	public ReferenciaBancariaLogic referenciabancariaLogic=null;

	public ReferenciaBancariaLogic getReferenciaBancariaLogic() {
		return referenciabancariaLogic;
	}

	public void setReferenciaBancariaLogic(ReferenciaBancariaLogic referenciabancariaLogic) {
		this.referenciabancariaLogic = referenciabancariaLogic;
	}


	public TipoCuentaBancoGeneralLogic tipocuentabancogeneralLogic=null;

	public TipoCuentaBancoGeneralLogic getTipoCuentaBancoGeneralLogic() {
		return tipocuentabancogeneralLogic;
	}

	public void setTipoCuentaBancoGeneralLogic(TipoCuentaBancoGeneralLogic tipocuentabancogeneralLogic) {
		this.tipocuentabancogeneralLogic = tipocuentabancogeneralLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCuentaBanco=false;
	public Boolean esParaAccionDesdeFormularioTipoCuentaBanco=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoCuentaBancoSessionBeanAdditional tipocuentabancoSessionBeanAdditional=null;
	
	public TipoCuentaBancoSessionBeanAdditional getTipoCuentaBancoSessionBeanAdditional() {
		return this.tipocuentabancoSessionBeanAdditional;
	}
	
	public void setTipoCuentaBancoSessionBeanAdditional(TipoCuentaBancoSessionBeanAdditional tipocuentabancoSessionBeanAdditional) {
		try {
			this.tipocuentabancoSessionBeanAdditional=tipocuentabancoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoCuentaBancoBeanSwingJInternalFrameAdditional tipocuentabancoBeanSwingJInternalFrameAdditional=null;
	//public class TipoCuentaBancoBeanSwingJInternalFrame
	
	public TipoCuentaBancoBeanSwingJInternalFrameAdditional getTipoCuentaBancoBeanSwingJInternalFrameAdditional() {
		return this.tipocuentabancoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoCuentaBancoBeanSwingJInternalFrameAdditional(TipoCuentaBancoBeanSwingJInternalFrameAdditional tipocuentabancoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipocuentabancoBeanSwingJInternalFrameAdditional=tipocuentabancoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCuentaBancoLogic tipocuentabancoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCuentaBanco tipocuentabancoBean;
	public TipoCuentaBancoConstantesFunciones tipocuentabancoConstantesFunciones;
	//public TipoCuentaBancoParameterReturnGeneral tipocuentabancoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoCuentaBanco> tipocuentabancos;	
	//public List<TipoCuentaBanco> tipocuentabancosEliminados;
	//public List<TipoCuentaBanco> tipocuentabancosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCuentaBanco=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCuentaBanco=true;
	public Boolean isVisibilidadCeldaCopiarTipoCuentaBanco=true;
	public Boolean isVisibilidadCeldaVerFormTipoCuentaBanco=true;
	public Boolean isVisibilidadCeldaOrdenTipoCuentaBanco=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco=false;
	public Boolean isVisibilidadCeldaModificarTipoCuentaBanco=false;
	public Boolean isVisibilidadCeldaActualizarTipoCuentaBanco=false;
	public Boolean isVisibilidadCeldaEliminarTipoCuentaBanco=false;
	public Boolean isVisibilidadCeldaCancelarTipoCuentaBanco=false;
	public Boolean isVisibilidadCeldaGuardarTipoCuentaBanco=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCuentaBanco=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoCuentaBanco() {
		return this.iIdNuevoTipoCuentaBanco;
	}

	public void setiIdNuevoTipoCuentaBanco(Long iIdNuevoTipoCuentaBanco) {
		this.iIdNuevoTipoCuentaBanco = iIdNuevoTipoCuentaBanco;
	}
	
	public Long getidTipoCuentaBancoActual() {
		return this.idTipoCuentaBancoActual;
	}

	public void setidTipoCuentaBancoActual(Long idTipoCuentaBancoActual) {
		this.idTipoCuentaBancoActual = idTipoCuentaBancoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCuentaBanco gettipocuentabanco() {
		return this.tipocuentabanco;
	}

	public void settipocuentabanco(TipoCuentaBanco tipocuentabanco) {
		this.tipocuentabanco = tipocuentabanco;
	}
	
	public TipoCuentaBanco gettipocuentabancoAux() {
		return this.tipocuentabancoAux;
	}

	public void settipocuentabancoAux(TipoCuentaBanco tipocuentabancoAux) {
		this.tipocuentabancoAux = tipocuentabancoAux;
	}				
	
	public TipoCuentaBanco gettipocuentabancoAnterior() {
		return this.tipocuentabancoAnterior;
	}

	public void settipocuentabancoAnterior(TipoCuentaBanco tipocuentabancoAnterior) {
		this.tipocuentabancoAnterior = tipocuentabancoAnterior;
	}	
	
	public TipoCuentaBanco gettipocuentabancoTotales() {
		return this.tipocuentabancoTotales;
	}

	public void settipocuentabancoTotales(TipoCuentaBanco tipocuentabancoTotales) {
		this.tipocuentabancoTotales = tipocuentabancoTotales;
	}	
	
	public TipoCuentaBanco gettipocuentabancoBean() {
		return this.tipocuentabancoBean;
	}

	public void settipocuentabancoBean(TipoCuentaBanco tipocuentabancoBean) {
		this.tipocuentabancoBean = tipocuentabancoBean;
	}	
	
	public TipoCuentaBancoParameterReturnGeneral gettipocuentabancoReturnGeneral() {
		return this.tipocuentabancoReturnGeneral;
	}

	public void settipocuentabancoReturnGeneral(TipoCuentaBancoParameterReturnGeneral tipocuentabancoReturnGeneral) {
		this.tipocuentabancoReturnGeneral = tipocuentabancoReturnGeneral;
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
	
	
	public TipoCuentaBancoLogic getTipoCuentaBancoLogic()	{		
		return tipocuentabancoLogic;
	}

	public void setTipoCuentaBancoLogic(TipoCuentaBancoLogic tipocuentabancoLogic) {
		this.tipocuentabancoLogic = tipocuentabancoLogic;
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
	
	public Boolean getIsEsNuevoTipoCuentaBanco() {
		return isEsNuevoTipoCuentaBanco;
	}

	public void setIsEsNuevoTipoCuentaBanco(Boolean isEsNuevoTipoCuentaBanco) {
		this.isEsNuevoTipoCuentaBanco = isEsNuevoTipoCuentaBanco;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCuentaBanco() {
		return esParaAccionDesdeFormularioTipoCuentaBanco;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCuentaBanco(Boolean esParaAccionDesdeFormularioTipoCuentaBanco) {
		this.esParaAccionDesdeFormularioTipoCuentaBanco = esParaAccionDesdeFormularioTipoCuentaBanco;
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

			if(this.tipocuentabancoSessionBean==null) {
				this.tipocuentabancoSessionBean=new TipoCuentaBancoSessionBean();
			}

			if(!this.tipocuentabancoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipocuentabancoSessionBean.getlidEmpresaActual());
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

					if(this.tipocuentabanco!=null) {
						this.tipocuentabanco.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
						this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxid_empresaTipoCuentaBanco.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoCuentaBanco.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
						if(this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxid_empresaTipoCuentaBanco.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxid_empresaTipoCuentaBanco.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoCuentaBancoGenerico)throws Exception
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
				jComboBoxid_empresaTipoCuentaBancoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoCuentaBancoGenerico!=null && jComboBoxid_empresaTipoCuentaBancoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoCuentaBancoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoCuentaBanco tipocuentabanco,JComboBox jComboBoxid_empresaTipoCuentaBancoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoCuentaBancoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxid_empresaTipoCuentaBanco.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoCuentaBancoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipocuentabanco.setid_empresa(empresaAux.getId());
				tipocuentabanco.setempresa_descripcion(TipoCuentaBancoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipocuentabanco.setEmpresa(empresaAux);			}
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

					if(!TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { 
							this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxid_empresaTipoCuentaBanco.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxid_empresaTipoCuentaBanco.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { 
					}

					if(!TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
							this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxid_empresaTipoCuentaBanco.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
							this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxid_empresaTipoCuentaBanco.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoCuentaBanco() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCuentaBancoConstantesFunciones.refrescarForeignKeysDescripcionesTipoCuentaBanco(this.tipocuentabancoLogic.getTipoCuentaBancos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCuentaBancoConstantesFunciones.refrescarForeignKeysDescripcionesTipoCuentaBanco(this.tipocuentabancos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocuentabancoLogic.setTipoCuentaBancos(this.tipocuentabancos);
			tipocuentabancoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCuentaBancoParameterReturnGeneral getTipoCuentaBancoParameterGeneral() {
		return this.tipocuentabancoParameterGeneral;
	}
	
	public void setTipoCuentaBancoParameterGeneral(TipoCuentaBancoParameterReturnGeneral tipocuentabancoParameterGeneral) {
		this.tipocuentabancoParameterGeneral = tipocuentabancoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCuentaBanco() {
		return isPermisoTodoTipoCuentaBanco;
	}

	public void setIsPermisoTodoTipoCuentaBanco(Boolean isPermisoTodoTipoCuentaBanco) {
		this.isPermisoTodoTipoCuentaBanco = isPermisoTodoTipoCuentaBanco;
	}

	public Boolean getIsPermisoNuevoTipoCuentaBanco() {
		return isPermisoNuevoTipoCuentaBanco;
	}

	public void setIsPermisoNuevoTipoCuentaBanco(Boolean isPermisoNuevoTipoCuentaBanco) {
		this.isPermisoNuevoTipoCuentaBanco = isPermisoNuevoTipoCuentaBanco;
	}

	public Boolean getIsPermisoActualizarTipoCuentaBanco() {
		return isPermisoActualizarTipoCuentaBanco;
	}

	public void setIsPermisoActualizarTipoCuentaBanco(Boolean isPermisoActualizarTipoCuentaBanco) {
		this.isPermisoActualizarTipoCuentaBanco = isPermisoActualizarTipoCuentaBanco;
	}

	public Boolean getIsPermisoEliminarTipoCuentaBanco() {
		return isPermisoEliminarTipoCuentaBanco;
	}

	public void setIsPermisoEliminarTipoCuentaBanco(Boolean isPermisoEliminarTipoCuentaBanco) {
		this.isPermisoEliminarTipoCuentaBanco = isPermisoEliminarTipoCuentaBanco;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCuentaBanco() {
		return isPermisoGuardarCambiosTipoCuentaBanco;
	}

	public void setIsPermisoGuardarCambiosTipoCuentaBanco(Boolean isPermisoGuardarCambiosTipoCuentaBanco) {
		this.isPermisoGuardarCambiosTipoCuentaBanco = isPermisoGuardarCambiosTipoCuentaBanco;
	}
	
	public Boolean getIsPermisoConsultaTipoCuentaBanco() {
		return isPermisoConsultaTipoCuentaBanco;
	}

	public void setIsPermisoConsultaTipoCuentaBanco(Boolean isPermisoConsultaTipoCuentaBanco) {
		this.isPermisoConsultaTipoCuentaBanco = isPermisoConsultaTipoCuentaBanco;
	}

	public Boolean getIsPermisoBusquedaTipoCuentaBanco() {
		return isPermisoBusquedaTipoCuentaBanco;
	}

	public void setIsPermisoBusquedaTipoCuentaBanco(Boolean isPermisoBusquedaTipoCuentaBanco) {
		this.isPermisoBusquedaTipoCuentaBanco = isPermisoBusquedaTipoCuentaBanco;
	}

	public Boolean getIsPermisoReporteTipoCuentaBanco() {
		return isPermisoReporteTipoCuentaBanco;
	}

	public void setIsPermisoReporteTipoCuentaBanco(Boolean isPermisoReporteTipoCuentaBanco) {
		this.isPermisoReporteTipoCuentaBanco = isPermisoReporteTipoCuentaBanco;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCuentaBanco() {
		return isPermisoPaginacionMedioTipoCuentaBanco;
	}

	public void setIsPermisoPaginacionMedioTipoCuentaBanco(Boolean isPermisoPaginacionMedioTipoCuentaBanco) {
		this.isPermisoPaginacionMedioTipoCuentaBanco = isPermisoPaginacionMedioTipoCuentaBanco;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCuentaBanco() {
		return isPermisoPaginacionTodoTipoCuentaBanco;
	}

	public void setIsPermisoPaginacionTodoTipoCuentaBanco(Boolean isPermisoPaginacionTodoTipoCuentaBanco) {
		this.isPermisoPaginacionTodoTipoCuentaBanco = isPermisoPaginacionTodoTipoCuentaBanco;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCuentaBanco() {
		return isPermisoPaginacionAltoTipoCuentaBanco;
	}

	public void setIsPermisoPaginacionAltoTipoCuentaBanco(Boolean isPermisoPaginacionAltoTipoCuentaBanco) {
		this.isPermisoPaginacionAltoTipoCuentaBanco = isPermisoPaginacionAltoTipoCuentaBanco;
	}
	
	public Boolean getIsPermisoCopiarTipoCuentaBanco() {
		return isPermisoCopiarTipoCuentaBanco;
	}

	public void setIsPermisoCopiarTipoCuentaBanco(Boolean isPermisoCopiarTipoCuentaBanco) {
		this.isPermisoCopiarTipoCuentaBanco = isPermisoCopiarTipoCuentaBanco;
	}
	
	public Boolean getIsPermisoVerFormTipoCuentaBanco() {
		return isPermisoVerFormTipoCuentaBanco;
	}

	public void setIsPermisoVerFormTipoCuentaBanco(Boolean isPermisoVerFormTipoCuentaBanco) {
		this.isPermisoVerFormTipoCuentaBanco = isPermisoVerFormTipoCuentaBanco;
	}
	
	public Boolean getIsPermisoDuplicarTipoCuentaBanco() {
		return isPermisoDuplicarTipoCuentaBanco;
	}

	public void setIsPermisoDuplicarTipoCuentaBanco(Boolean isPermisoDuplicarTipoCuentaBanco) {
		this.isPermisoDuplicarTipoCuentaBanco = isPermisoDuplicarTipoCuentaBanco;
	}
	
	public Boolean getIsPermisoOrdenTipoCuentaBanco() {
		return isPermisoOrdenTipoCuentaBanco;
	}

	public void setIsPermisoOrdenTipoCuentaBanco(Boolean isPermisoOrdenTipoCuentaBanco) {
		this.isPermisoOrdenTipoCuentaBanco = isPermisoOrdenTipoCuentaBanco;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCuentaBanco() {
		return isVisibilidadCeldaNuevoTipoCuentaBanco;
	}

	public void setIsVisibilidadCeldaNuevoTipoCuentaBanco(Boolean isVisibilidadCeldaNuevoTipoCuentaBanco) {
		this.isVisibilidadCeldaNuevoTipoCuentaBanco = isVisibilidadCeldaNuevoTipoCuentaBanco;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCuentaBanco() {
		return isVisibilidadCeldaDuplicarTipoCuentaBanco;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCuentaBanco(Boolean isVisibilidadCeldaDuplicarTipoCuentaBanco) {
		this.isVisibilidadCeldaDuplicarTipoCuentaBanco = isVisibilidadCeldaDuplicarTipoCuentaBanco;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCuentaBanco() {
		return isVisibilidadCeldaCopiarTipoCuentaBanco;
	}

	public void setIsVisibilidadCeldaCopiarTipoCuentaBanco(Boolean isVisibilidadCeldaCopiarTipoCuentaBanco) {
		this.isVisibilidadCeldaCopiarTipoCuentaBanco = isVisibilidadCeldaCopiarTipoCuentaBanco;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCuentaBanco() {
		return isVisibilidadCeldaVerFormTipoCuentaBanco;
	}

	public void setIsVisibilidadCeldaVerFormTipoCuentaBanco(Boolean isVisibilidadCeldaVerFormTipoCuentaBanco) {
		this.isVisibilidadCeldaVerFormTipoCuentaBanco = isVisibilidadCeldaVerFormTipoCuentaBanco;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCuentaBanco() {
		return isVisibilidadCeldaOrdenTipoCuentaBanco;
	}

	public void setIsVisibilidadCeldaOrdenTipoCuentaBanco(Boolean isVisibilidadCeldaOrdenTipoCuentaBanco) {
		this.isVisibilidadCeldaOrdenTipoCuentaBanco = isVisibilidadCeldaOrdenTipoCuentaBanco;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCuentaBanco() {
		return isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCuentaBanco(Boolean isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco = isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCuentaBanco() {
		return isVisibilidadCeldaModificarTipoCuentaBanco;
	}

	public void setIsVisibilidadCeldaModificarTipoCuentaBanco(Boolean isVisibilidadCeldaModificarTipoCuentaBanco) {
		this.isVisibilidadCeldaModificarTipoCuentaBanco = isVisibilidadCeldaModificarTipoCuentaBanco;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCuentaBanco() {
		return isVisibilidadCeldaActualizarTipoCuentaBanco;
	}

	public void setIsVisibilidadCeldaActualizarTipoCuentaBanco(Boolean isVisibilidadCeldaActualizarTipoCuentaBanco) {
		this.isVisibilidadCeldaActualizarTipoCuentaBanco = isVisibilidadCeldaActualizarTipoCuentaBanco;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCuentaBanco() {
		return isVisibilidadCeldaEliminarTipoCuentaBanco;
	}

	public void setIsVisibilidadCeldaEliminarTipoCuentaBanco(Boolean isVisibilidadCeldaEliminarTipoCuentaBanco) {
		this.isVisibilidadCeldaEliminarTipoCuentaBanco = isVisibilidadCeldaEliminarTipoCuentaBanco;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCuentaBanco() {
		return isVisibilidadCeldaCancelarTipoCuentaBanco;
	}

	public void setIsVisibilidadCeldaCancelarTipoCuentaBanco(Boolean isVisibilidadCeldaCancelarTipoCuentaBanco) {
		this.isVisibilidadCeldaCancelarTipoCuentaBanco = isVisibilidadCeldaCancelarTipoCuentaBanco;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCuentaBanco() {
		return isVisibilidadCeldaGuardarTipoCuentaBanco;
	}

	public void setIsVisibilidadCeldaGuardarTipoCuentaBanco(Boolean isVisibilidadCeldaGuardarTipoCuentaBanco) {
		this.isVisibilidadCeldaGuardarTipoCuentaBanco = isVisibilidadCeldaGuardarTipoCuentaBanco;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCuentaBanco() {
		return isVisibilidadCeldaGuardarCambiosTipoCuentaBanco;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCuentaBanco(Boolean isVisibilidadCeldaGuardarCambiosTipoCuentaBanco) {
		this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco = isVisibilidadCeldaGuardarCambiosTipoCuentaBanco;
	}
		
	public TipoCuentaBancoSessionBean gettipocuentabancoSessionBean() {
		return this.tipocuentabancoSessionBean;
	}
	
	public void settipocuentabancoSessionBean(TipoCuentaBancoSessionBean tipocuentabancoSessionBean) {
		this.tipocuentabancoSessionBean=tipocuentabancoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(TipoCuentaBanco tipocuentabanco)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipocuentabanco,null);
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
	
	public void bugActualizarReferenciaActual(TipoCuentaBanco tipocuentabanco,TipoCuentaBanco tipocuentabancoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCuentaBanco(tipocuentabanco);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocuentabancoAux.setId(tipocuentabanco.getId());
		tipocuentabancoAux.setVersionRow(tipocuentabanco.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCuentaBanco();
		
			int intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCuentaBanco(this.tipocuentabanco,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocuentabancoValidator.getInvalidValues(this.tipocuentabanco);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocuentabancoLogic.setDatosCliente(datosCliente);
			tipocuentabancoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocuentabancoAux=new  TipoCuentaBanco();
				
				tipocuentabancoAux.setIsNew(true);
				tipocuentabancoAux.setIsChanged(true);
				
				tipocuentabancoAux.setTipoCuentaBancoOriginal(this.tipocuentabanco);
				
				tipocuentabancoAux.setId(this.tipocuentabanco.getId());	
				tipocuentabancoAux.setVersionRow(this.tipocuentabanco.getVersionRow());	
				tipocuentabancoAux.setid_empresa(this.tipocuentabanco.getid_empresa());	
				tipocuentabancoAux.setcodigo(this.tipocuentabanco.getcodigo());	
				tipocuentabancoAux.setnombre(this.tipocuentabanco.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocuentabancoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocuentabancoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocuentabancoAux,tipocuentabancoLogic.getTipoCuentaBancos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuentabancoAux,tipocuentabancos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocuentabancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocuentabancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancoLogic.saveTipoCuentaBancos();//WithConnection
						//tipocuentabancoLogic.getSetVersionRowTipoCuentaBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocuentabanco,tipocuentabancoAux);
					
					this.refrescarForeignKeysDescripcionesTipoCuentaBanco();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocuentabancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias().addAll(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariasEliminados);
							this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().addAll(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancarias.addAll(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariasEliminados);
							this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogenerals.addAll(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocuentabancoLogic.saveTipoCuentaBancoRelaciones(tipocuentabancoAux,this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias(),this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());//WithConnection
								//tipocuentabancoLogic.getSetVersionRowTipoCuentaBancos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocuentabanco,tipocuentabancoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.setReferenciaBancarias(new ArrayList<ReferenciaBancaria>());
							this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(new ArrayList<TipoCuentaBancoGeneral>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancarias= new ArrayList<ReferenciaBancaria>();
							this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogenerals= new ArrayList<TipoCuentaBancoGeneral>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocuentabancoAux.setReferenciaBancarias(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias());

							if(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocuentabancoAux.setTipoCuentaBancoGenerals(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocuentabancoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocuentabancoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocuentabancoAux,tipocuentabancoLogic.getTipoCuentaBancos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocuentabancoAux,tipocuentabancos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocuentabanco,tipocuentabancoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocuentabancoAux=new  TipoCuentaBanco();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocuentabancoSessionBean.getEsGuardarRelacionado() && this.tipocuentabanco.getId()>=0)) {
						
					tipocuentabancoAux.setIsNew(false);
				}
				
				tipocuentabancoAux.setIsDeleted(false);
			
				tipocuentabancoAux.setId(this.tipocuentabanco.getId());	
				tipocuentabancoAux.setVersionRow(this.tipocuentabanco.getVersionRow());	
				tipocuentabancoAux.setid_empresa(this.tipocuentabanco.getid_empresa());	
				tipocuentabancoAux.setcodigo(this.tipocuentabanco.getcodigo());	
				tipocuentabancoAux.setnombre(this.tipocuentabanco.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocuentabancoAux,tipocuentabancoLogic.getTipoCuentaBancos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuentabancoAux,tipocuentabancos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocuentabancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocuentabancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancoLogic.saveTipoCuentaBancos();//WithConnection
						//tipocuentabancoLogic.getSetVersionRowTipoCuentaBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocuentabanco,tipocuentabancoAux);
					
					this.refrescarForeignKeysDescripcionesTipoCuentaBanco();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocuentabancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias().addAll(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariasEliminados);
							this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().addAll(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancarias.addAll(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariasEliminados);
							this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogenerals.addAll(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocuentabancoLogic.saveTipoCuentaBancoRelaciones(tipocuentabancoAux,this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias(),this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());//WithConnection
								//tipocuentabancoLogic.getSetVersionRowTipoCuentaBancos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocuentabanco,tipocuentabancoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.setReferenciaBancarias(new ArrayList<ReferenciaBancaria>());
							this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(new ArrayList<TipoCuentaBancoGeneral>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancarias= new ArrayList<ReferenciaBancaria>();
							this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogenerals= new ArrayList<TipoCuentaBancoGeneral>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocuentabancoAux.setReferenciaBancarias(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias());

							if(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocuentabancoAux.setTipoCuentaBancoGenerals(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocuentabancoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocuentabancoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocuentabancoAux,tipocuentabancoLogic.getTipoCuentaBancos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocuentabancoAux,tipocuentabancos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocuentabanco,tipocuentabancoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocuentabancoAux=new  TipoCuentaBanco();
				
				tipocuentabancoAux.setIsNew(false);
				tipocuentabancoAux.setIsChanged(false);
				
				tipocuentabancoAux.setIsDeleted(true);
				
				tipocuentabancoAux.setId(this.tipocuentabanco.getId());	
				tipocuentabancoAux.setVersionRow(this.tipocuentabanco.getVersionRow());	
				tipocuentabancoAux.setid_empresa(this.tipocuentabanco.getid_empresa());	
				tipocuentabancoAux.setcodigo(this.tipocuentabanco.getcodigo());	
				tipocuentabancoAux.setnombre(this.tipocuentabanco.getnombre());	
				
				if(this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocuentabancoAux.getId()>=0) {	
						this.tipocuentabancosEliminados.add(tipocuentabancoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocuentabancoAux,tipocuentabancoLogic.getTipoCuentaBancos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuentabancoAux,tipocuentabancos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocuentabancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocuentabancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancoLogic.saveTipoCuentaBancos();//WithConnection
						//tipocuentabancoLogic.getSetVersionRowTipoCuentaBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocuentabancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias().addAll(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariasEliminados);
							this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().addAll(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancarias.addAll(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariasEliminados);
							this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogenerals.addAll(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocuentabancoLogic.saveTipoCuentaBancoRelaciones(tipocuentabancoAux,this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias(),this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());//WithConnection
								//tipocuentabancoLogic.getSetVersionRowTipoCuentaBancos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.setReferenciaBancarias(new ArrayList<ReferenciaBancaria>());
							this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(new ArrayList<TipoCuentaBancoGeneral>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancarias= new ArrayList<ReferenciaBancaria>();
							this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogenerals= new ArrayList<TipoCuentaBancoGeneral>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocuentabancoAux.setReferenciaBancarias(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias());

							if(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocuentabancoAux.setTipoCuentaBancoGenerals(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocuentabancoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocuentabancoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocuentabancoAux,tipocuentabancoLogic.getTipoCuentaBancos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocuentabancoAux,tipocuentabancos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.getTipoCuentaBancos().addAll(this.tipocuentabancosEliminados);
					
					tipocuentabancoLogic.saveTipoCuentaBancos();//WithConnection
					//tipocuentabancoLogic.getSetVersionRowTipoCuentaBancos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoCuentaBanco();
				
				this.tipocuentabancosEliminados= new ArrayList<TipoCuentaBanco>();		
			}
			
			if(this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Cuenta Banco GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocuentabanco=tipocuentabancoAux;
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
      		//this.finishProcessTipoCuentaBanco();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCuentaBanco tipocuentabancoLocal) throws Exception {
		
		if(this.tipocuentabancoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipocuentabancoLocal.setReferenciaBancarias(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias());
				tipocuentabancoLocal.setTipoCuentaBancoGenerals(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
			
			} else {
			
				tipocuentabancoLocal.setReferenciaBancarias(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancarias);
				tipocuentabancoLocal.setTipoCuentaBancoGenerals(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogenerals);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCuentaBanco tipocuentabancoLocal) throws Exception {	
		if(this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipocuentabancoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoCuentaBancoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocuentabancoValidator.getInvalidValues(this.tipocuentabanco);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCuentaBanco tipocuentabanco,List<TipoCuentaBanco> tipocuentabancos) throws Exception {
		try	{		
			TipoCuentaBancoConstantesFunciones.actualizarLista(tipocuentabanco,tipocuentabancos,this.tipocuentabancoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCuentaBanco tipocuentabanco,List<TipoCuentaBanco> tipocuentabancos) throws Exception {
		try	{			
			TipoCuentaBancoConstantesFunciones.actualizarSelectedLista(tipocuentabanco,tipocuentabancos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCuentaBanco> tipocuentabancosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocuentabancosLocal=this.tipocuentabancoLogic.getTipoCuentaBancos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocuentabancosLocal=this.tipocuentabancos;
			}
			//ARCHITECTURE
		
			for(TipoCuentaBanco tipocuentabancoLocal:tipocuentabancosLocal) {
				if(this.permiteMantenimiento(tipocuentabancoLocal) && tipocuentabancoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCuentaBancoConstantesFunciones.getTipoCuentaBancoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCuentaBancoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelid_empresaTipoCuentaBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCuentaBancoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelcodigoTipoCuentaBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCuentaBancoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelnombreTipoCuentaBanco,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelid_empresaTipoCuentaBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelcodigoTipoCuentaBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelnombreTipoCuentaBanco,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ReferenciaBancaria")) {
			if(this.tipocuentabanco==null) {
				this.tipocuentabanco= new TipoCuentaBanco();
			}

			if(this.tipocuentabancoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCuentaBanco
				this.setVariablesFormularioToObjetoActualTipoCuentaBanco(this.tipocuentabanco,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);

				this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.getreferenciabancaria().setTipoCuentaBanco(this.tipocuentabanco);
			}

			return;
		}
		 else  if(sTipo.equals("TipoCuentaBancoGeneral")) {
			if(this.tipocuentabanco==null) {
				this.tipocuentabanco= new TipoCuentaBanco();
			}

			if(this.tipocuentabancoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCuentaBanco
				this.setVariablesFormularioToObjetoActualTipoCuentaBanco(this.tipocuentabanco,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);

				this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.gettipocuentabancogeneral().setTipoCuentaBanco(this.tipocuentabanco);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoCuentaBanco--;	
		
		
		this.tipocuentabancoAux=new TipoCuentaBanco();
		
		this.tipocuentabancoAux.setId(this.iIdNuevoTipoCuentaBanco);
		this.tipocuentabancoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocuentabancoLogic.getTipoCuentaBancos().add(this.tipocuentabancoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocuentabancos.add(this.tipocuentabancoAux);
		}
		//ARCHITECTURE
		
		this.tipocuentabanco=this.tipocuentabancoAux;
		
		if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCuentaBanco(this.tipocuentabanco);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCuentaBanco(this.tipocuentabanco);
		}
				
		//this.setDefaultControlesTipoCuentaBanco();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCuentaBanco();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCuentaBanco();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCuentaBanco();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCuentaBanco(this.tipocuentabancoBean,this.tipocuentabanco,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocuentabancoSessionBean.getConGuardarRelaciones()) {
			classes=TipoCuentaBancoConstantesFunciones.getClassesRelationshipsOfTipoCuentaBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocuentabancoReturnGeneral=tipocuentabancoLogic.procesarEventosTipoCuentaBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocuentabancoLogic.getTipoCuentaBancos(),this.tipocuentabanco,this.tipocuentabancoParameterGeneral,this.isEsNuevoTipoCuentaBanco,classes);//this.tipocuentabancoLogic.getTipoCuentaBanco()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCuentaBanco(this.tipocuentabancoReturnGeneral,this.tipocuentabancoBean,false);
		
		if(this.tipocuentabancoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCuentaBanco(this.tipocuentabancoReturnGeneral.getTipoCuentaBanco());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCuentaBanco(this.tipocuentabancoReturnGeneral.getTipoCuentaBanco());
		}
		
		if(this.tipocuentabancoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCuentaBanco(this.tipocuentabancoReturnGeneral.getTipoCuentaBanco(),classes);//this.tipocuentabancoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCuentaBanco(this.tipocuentabanco,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCuentaBanco();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCuentaBanco();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.RecargarFormTipoCuentaBanco(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCuentaBanco(false);
						
			if(tipocuentabancoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.getEsGuardarRelacionado() && ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonReferenciaBancariaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado() && TipoCuentaBancoGeneralJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTipoCuentaBancoGeneralActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCuentaBanco();
			}
			
			this.actualizarVisualTableDatosTipoCuentaBanco();
			
			this.jTableDatosTipoCuentaBanco.setRowSelectionInterval(this.getIndiceNuevoTipoCuentaBanco(), this.getIndiceNuevoTipoCuentaBanco());
			
			this.seleccionarFilaTablaTipoCuentaBancoActual();
						
			this.actualizarEstadoCeldasBotonesTipoCuentaBanco("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCuentaBanco(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCuentaBanco.jTextFieldcodigoTipoCuentaBanco.setEnabled(isHabilitar && this.tipocuentabancoConstantesFunciones.activarcodigoTipoCuentaBanco);
		this.jInternalFrameDetalleFormTipoCuentaBanco.jTextAreanombreTipoCuentaBanco.setEnabled(isHabilitar && this.tipocuentabancoConstantesFunciones.activarnombreTipoCuentaBanco);	
		//
		this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxid_empresaTipoCuentaBanco.setEnabled(isHabilitar && this.tipocuentabancoConstantesFunciones.activarid_empresaTipoCuentaBanco);
	};
	
	public void setDefaultControlesTipoCuentaBanco() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCuentaBanco(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocuentabancoSessionBean.setConGuardarRelaciones(true);			
			this.tipocuentabancoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCuentaBanco.jTabbedPaneRelacionesTipoCuentaBanco.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipocuentabancoSessionBean.setConGuardarRelaciones(false);			
			this.tipocuentabancoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCuentaBanco.jTabbedPaneRelacionesTipoCuentaBanco.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoCuentaBanco() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaBanco tipocuentabancoAux:this.tipocuentabancoLogic.getTipoCuentaBancos()) {
				if(tipocuentabancoAux.getId().equals(this.iIdNuevoTipoCuentaBanco)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaBanco tipocuentabancoAux:this.tipocuentabancos) {
				if(tipocuentabancoAux.getId().equals(this.iIdNuevoTipoCuentaBanco)) {
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
	
	public int getIndiceActualTipoCuentaBanco(TipoCuentaBanco tipocuentabanco,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaBanco tipocuentabancoAux:this.tipocuentabancoLogic.getTipoCuentaBancos()) {
				if(tipocuentabancoAux.getId().equals(tipocuentabanco.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaBanco tipocuentabancoAux:this.tipocuentabancos) {
				if(tipocuentabancoAux.getId().equals(tipocuentabanco.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCuentaBanco(TipoCuentaBanco tipocuentabancoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaBanco tipocuentabancoAux:this.tipocuentabancoLogic.getTipoCuentaBancos()) {
				if(tipocuentabancoAux.getTipoCuentaBancoOriginal().getId().equals(tipocuentabancoOriginal.getId())) {
					existe=true;
					tipocuentabancoOriginal.setId(tipocuentabancoAux.getId());
					tipocuentabancoOriginal.setVersionRow(tipocuentabancoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaBanco tipocuentabancoAux:this.tipocuentabancos) {
				if(tipocuentabancoAux.getTipoCuentaBancoOriginal().getId().equals(tipocuentabancoOriginal.getId())) {
					existe=true;
					tipocuentabancoOriginal.setId(tipocuentabancoAux.getId());
					tipocuentabancoOriginal.setVersionRow(tipocuentabancoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCuentaBanco(Boolean esParaCancelar) throws Exception {
		tipocuentabancosAux=new ArrayList<TipoCuentaBanco>();
		tipocuentabancoAux=new TipoCuentaBanco();
		
		if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCuentaBanco tipocuentabancoAux:this.tipocuentabancoLogic.getTipoCuentaBancos()) {
					if(tipocuentabancoAux.getId()<0) {
						tipocuentabancosAux.add(tipocuentabancoAux);
					}		
				}
				this.iIdNuevoTipoCuentaBanco=0L;
				this.tipocuentabancoLogic.getTipoCuentaBancos().removeAll(tipocuentabancosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuentaBanco tipocuentabancoAux:this.tipocuentabancos) {
					if(tipocuentabancoAux.getId()<0) {
						tipocuentabancosAux.add(tipocuentabancoAux);
					}		
				}
				this.iIdNuevoTipoCuentaBanco=0L;
				this.tipocuentabancos.removeAll(tipocuentabancosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCuentaBanco 
					&& this.tipocuentabancoLogic.getTipoCuentaBancos().size()>0
					) {
					tipocuentabancoAux=this.tipocuentabancoLogic.getTipoCuentaBancos().get(this.tipocuentabancoLogic.getTipoCuentaBancos().size() - 1);
				
					if(tipocuentabancoAux.getId()<0) {
						this.tipocuentabancoLogic.getTipoCuentaBancos().remove(tipocuentabancoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCuentaBanco && this.tipocuentabancos.size()>0) {
					tipocuentabancoAux=this.tipocuentabancos.get(this.tipocuentabancos.size() - 1);
				
					if(tipocuentabancoAux.getId()<0) {
						this.tipocuentabancos.remove(tipocuentabancoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCuentaBanco(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocuentabanco.getId()<0) {
				this.tipocuentabancoLogic.getTipoCuentaBancos().remove(this.tipocuentabanco);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocuentabanco.getId()<0) {
				this.tipocuentabancos.remove(this.tipocuentabanco);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCuentaBanco(List<TipoCuentaBanco> tipocuentabancosAux) throws Exception {
		TipoCuentaBancoConstantesFunciones.setEstadosInicialesTipoCuentaBanco(tipocuentabancosAux);
	}
	
	public void setEstadosInicialesTipoCuentaBanco(TipoCuentaBanco tipocuentabancoAux) throws Exception {
		TipoCuentaBancoConstantesFunciones.setEstadosInicialesTipoCuentaBanco(tipocuentabancoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCuentaBancoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCuentaBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCuentaBancoActual()) {
				if(!this.isEsNuevoTipoCuentaBanco) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCuentaBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCuentaBanco=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCuentaBancoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Cuenta Banco ?", "MANTENIMIENTO DE Tipo Cuenta Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCuentaBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCuentaBanco tipocuentabanco) throws Exception {
		TipoCuentaBancoConstantesFunciones.seleccionarAsignar(this.tipocuentabanco,tipocuentabanco);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCuentaBanco=this.isPermisoActualizarOriginalTipoCuentaBanco;
			
			
			this.seleccionarAsignar(tipocuentabanco);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCuentaBancoConstantesFunciones.quitarEspaciosTipoCuentaBanco(this.tipocuentabanco,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCuentaBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocuentabancoSessionBean.setsFuncionBusquedaRapida(this.tipocuentabancoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCuentaBanco) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCuentaBanco(esParaCancelar);				
				this.cancelarNuevoTipoCuentaBanco(esParaCancelar);								
			}
			
			this.tipocuentabanco=new TipoCuentaBanco();
			
			this.inicializarTipoCuentaBanco();
			
			this.actualizarEstadoCeldasBotonesTipoCuentaBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCuentaBanco() throws Exception {
		try {
			TipoCuentaBancoConstantesFunciones.inicializarTipoCuentaBanco(this.tipocuentabanco);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocuentabancoLogic.getTipoCuentaBancos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCuentaBancos(String sAccionBusqueda,List<TipoCuentaBanco> tipocuentabancosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCuentaBanco"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCuentaBancoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCuentaBancoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCuentaBanco"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Cuenta Bancos");		
		parameters.put("busquedapor", TipoCuentaBancoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ReferenciaBancaria.class));
			classes.add(new Classe(TipoCuentaBancoGeneral.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoCuentaBancoLogic tipocuentabancoLogicAuxiliar=new TipoCuentaBancoLogic();
					tipocuentabancoLogicAuxiliar.setDatosCliente(tipocuentabancoLogic.getDatosCliente());				
					tipocuentabancoLogicAuxiliar.setTipoCuentaBancos(tipocuentabancosParaReportes);
					
					tipocuentabancoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoCuentaBancoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipocuentabancosParaReportes=tipocuentabancoLogicAuxiliar.getTipoCuentaBancos();
					
					//tipocuentabancoLogic.getNewConnexionToDeep();
					
					//for (TipoCuentaBanco tipocuentabanco:tipocuentabancosParaReportes) {
					//	tipocuentabancoLogic.deepLoad(tipocuentabanco, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipocuentabancoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipocuentabancoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileReferenciaBancaria = AuxiliarReportes.class.getResourceAsStream("ReferenciaBancariaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_referenciabancaria", reportFileReferenciaBancaria);

			InputStream reportFileTipoCuentaBancoGeneral = AuxiliarReportes.class.getResourceAsStream("TipoCuentaBancoGeneralDetalleRelacionesDesign.jasper");
			parameters.put("subreport_tipocuentabancogeneral", reportFileTipoCuentaBancoGeneral);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCuentaBanco=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCuentaBancoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCuentaBancoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCuentaBanco=new JRBeanArrayDataSource(TipoCuentaBancoJInternalFrame.TraerTipoCuentaBancoBeans(tipocuentabancosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCuentaBanco);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCuentaBancoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCuentaBancoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCuentaBancoBean.TraerTipoCuentaBancoBeans(tipocuentabancosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCuentaBancos(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCuentaBancos(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCuentaBancoActionPerformed(null);
					//this.generarExcelReporteTipoCuentaBancos(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCuentaBancos(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCuentaBancos(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCuentaBancos(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCuentaBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCuentaBanco> tipocuentabancosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabanco";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCuentaBancos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCuentaBanco("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCuentaBanco tipocuentabanco : tipocuentabancosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCuentaBancoConstantesFunciones.generarExcelReporteDataTipoCuentaBanco("NORMAL",row,workbook,tipocuentabanco,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCuentaBanco(String sTipo,Row row,Workbook workbook) {
		
		TipoCuentaBancoConstantesFunciones.generarExcelReporteHeaderTipoCuentaBanco(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCuentaBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCuentaBanco> tipocuentabancosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabanco_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCuentaBancos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCuentaBanco tipocuentabanco : tipocuentabancosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCuentaBancoConstantesFunciones.getTipoCuentaBancoDescripcion(tipocuentabanco));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCuentaBancoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCuentaBancoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocuentabanco.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCuentaBancoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCuentaBancoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocuentabanco.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocuentabanco.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCuentaBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCuentaBanco> tipocuentabancosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCuentaBanco> tipocuentabancosRespaldo=null;
		
		classes=TipoCuentaBancoConstantesFunciones.getClassesRelationshipsOfTipoCuentaBanco(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocuentabancoLogic.setDatosCliente(this.datosCliente);
		this.tipocuentabancoLogic.setDatosDeep(this.datosDeep);
		this.tipocuentabancoLogic.setIsConDeep(true);
		
		tipocuentabancosRespaldo=this.tipocuentabancoLogic.getTipoCuentaBancos();
		
		this.tipocuentabancoLogic.setTipoCuentaBancos(tipocuentabancosParaReportes);	
		this.tipocuentabancoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocuentabancosParaReportes=this.tipocuentabancoLogic.getTipoCuentaBancos();
		this.tipocuentabancoLogic.setTipoCuentaBancos(tipocuentabancosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabanco_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCuentaBancos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCuentaBanco("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCuentaBanco tipocuentabanco : tipocuentabancosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCuentaBanco("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCuentaBancoConstantesFunciones.generarExcelReporteDataTipoCuentaBanco("NORMAL",row,workbook,tipocuentabanco,cellStyleDataAux);
		
			
			


				//ReferenciaBancaria
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocuentabanco.getReferenciaBancarias()!=null && tipocuentabanco.getReferenciaBancarias().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ReferenciaBancariaConstantesFunciones.generarExcelReporteHeaderReferenciaBancaria("RELACIONADO",row,workbook);
				}

				if(tipocuentabanco.getReferenciaBancarias()!=null) {
					i2=0;
					for(ReferenciaBancaria referenciabancaria : tipocuentabanco.getReferenciaBancarias()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ReferenciaBancariaConstantesFunciones.generarExcelReporteDataReferenciaBancaria("RELACIONADO",row,workbook,referenciabancaria,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//TipoCuentaBancoGeneral
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocuentabanco.getTipoCuentaBancoGenerals()!=null && tipocuentabanco.getTipoCuentaBancoGenerals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TipoCuentaBancoGeneralConstantesFunciones.generarExcelReporteHeaderTipoCuentaBancoGeneral("RELACIONADO",row,workbook);
				}

				if(tipocuentabanco.getTipoCuentaBancoGenerals()!=null) {
					i2=0;
					for(TipoCuentaBancoGeneral tipocuentabancogeneral : tipocuentabanco.getTipoCuentaBancoGenerals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TipoCuentaBancoGeneralConstantesFunciones.generarExcelReporteDataTipoCuentaBancoGeneral("RELACIONADO",row,workbook,tipocuentabancogeneral,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoCuentaBancoConstantesFunciones.getTipoCuentaBancoDescripcion(tipocuentabanco));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCuentaBanco() throws Exception {		
		this.startProcessTipoCuentaBanco(true);
	}
	
	public void startProcessTipoCuentaBanco(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoCuentaBanco ,this.jPanelParametrosReportesTipoCuentaBanco, this.jScrollPanelDatosTipoCuentaBanco,this.jPanelPaginacionTipoCuentaBanco, this.jScrollPanelDatosEdicionTipoCuentaBanco, this.jPanelAccionesTipoCuentaBanco,this.jPanelAccionesFormularioTipoCuentaBanco,this.jmenuBarTipoCuentaBanco,this.jmenuBarDetalleTipoCuentaBanco,this.jTtoolBarTipoCuentaBanco,this.jTtoolBarDetalleTipoCuentaBanco);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCuentaBanco=this.jTabbedPaneBusquedasTipoCuentaBanco; 
		
		final JPanel jPanelParametrosReportesTipoCuentaBanco=this.jPanelParametrosReportesTipoCuentaBanco;
		//final JScrollPane jScrollPanelDatosTipoCuentaBanco=this.jScrollPanelDatosTipoCuentaBanco;
		final JTable jTableDatosTipoCuentaBanco=this.jTableDatosTipoCuentaBanco;		
		final JPanel jPanelPaginacionTipoCuentaBanco=this.jPanelPaginacionTipoCuentaBanco;
		//final JScrollPane jScrollPanelDatosEdicionTipoCuentaBanco=this.jScrollPanelDatosEdicionTipoCuentaBanco;
		final JPanel jPanelAccionesTipoCuentaBanco=this.jPanelAccionesTipoCuentaBanco;
		
		JPanel jPanelCamposAuxiliarTipoCuentaBanco=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCuentaBanco=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
			jPanelCamposAuxiliarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jPanelCamposTipoCuentaBanco;
			jPanelAccionesFormularioAuxiliarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jPanelAccionesFormularioTipoCuentaBanco;
		}
		
		final JPanel jPanelCamposTipoCuentaBanco=jPanelCamposAuxiliarTipoCuentaBanco;
		final JPanel jPanelAccionesFormularioTipoCuentaBanco=jPanelAccionesFormularioAuxiliarTipoCuentaBanco;
		
		
		final JMenuBar jmenuBarTipoCuentaBanco=this.jmenuBarTipoCuentaBanco;
		final JToolBar jTtoolBarTipoCuentaBanco=this.jTtoolBarTipoCuentaBanco;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCuentaBanco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCuentaBanco=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
			jmenuBarDetalleAuxiliarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jmenuBarDetalleTipoCuentaBanco;
			jTtoolBarDetalleAuxiliarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jTtoolBarDetalleTipoCuentaBanco;
		}
		
		final JMenuBar jmenuBarDetalleTipoCuentaBanco=jmenuBarDetalleAuxiliarTipoCuentaBanco;
		final JToolBar jTtoolBarDetalleTipoCuentaBanco=jTtoolBarDetalleAuxiliarTipoCuentaBanco;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCuentaBanco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCuentaBanco;
			processRunnable.jTableDatos=jTableDatosTipoCuentaBanco;
			processRunnable.jPanelCampos=jPanelCamposTipoCuentaBanco;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCuentaBanco;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCuentaBanco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCuentaBanco;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCuentaBanco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCuentaBanco;
			processRunnable.jTtoolBar=jTtoolBarTipoCuentaBanco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCuentaBanco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCuentaBanco ,jPanelParametrosReportesTipoCuentaBanco,jTableDatosTipoCuentaBanco, /*jScrollPanelDatosTipoCuentaBanco,*/jPanelCamposTipoCuentaBanco,jPanelPaginacionTipoCuentaBanco, /*jScrollPanelDatosEdicionTipoCuentaBanco,*/ jPanelAccionesTipoCuentaBanco,jPanelAccionesFormularioTipoCuentaBanco,jmenuBarTipoCuentaBanco,jmenuBarDetalleTipoCuentaBanco,jTtoolBarTipoCuentaBanco,jTtoolBarDetalleTipoCuentaBanco);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCuentaBanco ,jPanelParametrosReportesTipoCuentaBanco, jScrollPanelDatosTipoCuentaBanco,jPanelPaginacionTipoCuentaBanco, jScrollPanelDatosEdicionTipoCuentaBanco, jPanelAccionesTipoCuentaBanco,jPanelAccionesFormularioTipoCuentaBanco,jmenuBarTipoCuentaBanco,jmenuBarDetalleTipoCuentaBanco,jTtoolBarTipoCuentaBanco,jTtoolBarDetalleTipoCuentaBanco);
						
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
	
	public void finishProcessTipoCuentaBanco() {// throws Exception 
		this.finishProcessTipoCuentaBanco(true);
	}
	
	public void finishProcessTipoCuentaBanco(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoCuentaBanco ,this.jPanelParametrosReportesTipoCuentaBanco, this.jScrollPanelDatosTipoCuentaBanco,this.jPanelPaginacionTipoCuentaBanco, this.jScrollPanelDatosEdicionTipoCuentaBanco, this.jPanelAccionesTipoCuentaBanco,this.jPanelAccionesFormularioTipoCuentaBanco,this.jmenuBarTipoCuentaBanco,this.jmenuBarDetalleTipoCuentaBanco,this.jTtoolBarTipoCuentaBanco,this.jTtoolBarDetalleTipoCuentaBanco);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCuentaBanco=this.jTabbedPaneBusquedasTipoCuentaBanco; 
		
		final JPanel jPanelParametrosReportesTipoCuentaBanco=this.jPanelParametrosReportesTipoCuentaBanco;
		//final JScrollPane jScrollPanelDatosTipoCuentaBanco=this.jScrollPanelDatosTipoCuentaBanco;
		final JTable jTableDatosTipoCuentaBanco=this.jTableDatosTipoCuentaBanco;		
		final JPanel jPanelPaginacionTipoCuentaBanco=this.jPanelPaginacionTipoCuentaBanco;
		//final JScrollPane jScrollPanelDatosEdicionTipoCuentaBanco=this.jScrollPanelDatosEdicionTipoCuentaBanco;
		final JPanel jPanelAccionesTipoCuentaBanco=this.jPanelAccionesTipoCuentaBanco;
		
		JPanel jPanelCamposAuxiliarTipoCuentaBanco=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCuentaBanco=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
			jPanelCamposAuxiliarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jPanelCamposTipoCuentaBanco;
			jPanelAccionesFormularioAuxiliarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jPanelAccionesFormularioTipoCuentaBanco;
		}
		
		final JPanel jPanelCamposTipoCuentaBanco=jPanelCamposAuxiliarTipoCuentaBanco;
		final JPanel jPanelAccionesFormularioTipoCuentaBanco=jPanelAccionesFormularioAuxiliarTipoCuentaBanco;
		
		
		final JMenuBar jmenuBarTipoCuentaBanco=this.jmenuBarTipoCuentaBanco;		
		final JToolBar jTtoolBarTipoCuentaBanco=this.jTtoolBarTipoCuentaBanco;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCuentaBanco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCuentaBanco=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
			jmenuBarDetalleAuxiliarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jmenuBarDetalleTipoCuentaBanco;
			jTtoolBarDetalleAuxiliarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jTtoolBarDetalleTipoCuentaBanco;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCuentaBanco=jmenuBarDetalleAuxiliarTipoCuentaBanco;
		final JToolBar jTtoolBarDetalleTipoCuentaBanco=jTtoolBarDetalleAuxiliarTipoCuentaBanco;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCuentaBanco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCuentaBanco;
			processRunnable.jTableDatos=jTableDatosTipoCuentaBanco;
			processRunnable.jPanelCampos=jPanelCamposTipoCuentaBanco;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCuentaBanco;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCuentaBanco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCuentaBanco;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCuentaBanco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCuentaBanco;
			processRunnable.jTtoolBar=jTtoolBarTipoCuentaBanco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCuentaBanco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCuentaBanco ,jPanelParametrosReportesTipoCuentaBanco, jTableDatosTipoCuentaBanco,/*jScrollPanelDatosTipoCuentaBanco,*/jPanelCamposTipoCuentaBanco,jPanelPaginacionTipoCuentaBanco, /*jScrollPanelDatosEdicionTipoCuentaBanco,*/ jPanelAccionesTipoCuentaBanco,jPanelAccionesFormularioTipoCuentaBanco,jmenuBarTipoCuentaBanco,jmenuBarDetalleTipoCuentaBanco,jTtoolBarTipoCuentaBanco,jTtoolBarDetalleTipoCuentaBanco));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCuentaBanco(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCuentaBanco(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCuentaBanco(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCuentaBanco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCuentaBanco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCuentaBanco,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCuentaBanco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCuentaBanco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCuentaBanco,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocuentabancoConstantesFunciones.getsFinalQueryTipoCuentaBanco();
		String  finalQueryPaginacionTodos=this.tipocuentabancoConstantesFunciones.getsFinalQueryTipoCuentaBanco();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCuentaBancoConstantesFunciones.getArrayColumnasGlobalesNoTipoCuentaBanco(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCuentaBancoConstantesFunciones.getArrayColumnasGlobalesTipoCuentaBanco(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCuentaBancoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocuentabancosEliminados= new ArrayList<TipoCuentaBanco>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCuentaBanco();
		
				///*TipoCuentaBancoSessionBean*/this.tipocuentabancoSessionBean=new TipoCuentaBancoSessionBean();
			
			if(this.tipocuentabancoSessionBean==null) {
				this.tipocuentabancoSessionBean=new TipoCuentaBancoSessionBean();
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
					this.iNumeroPaginacion=TipoCuentaBancoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCuentaBancoConstantesFunciones.getClassesForeignKeysOfTipoCuentaBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocuentabanco."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocuentabancosAux= new ArrayList<TipoCuentaBanco>();
			
				
			tipocuentabancoLogic.setDatosCliente(this.datosCliente);
			tipocuentabancoLogic.setDatosDeep(this.datosDeep);
			tipocuentabancoLogic.setIsConDeep(true);
			
			
			tipocuentabancoLogic.getTipoCuentaBancoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocuentabancoLogic.getTodosTipoCuentaBancos(finalQueryGlobal,pagination);
					
					//tipocuentabancoLogic.getTodosTipoCuentaBancosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocuentabancoLogic.getTipoCuentaBancos()==null|| tipocuentabancoLogic.getTipoCuentaBancos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocuentabancosAux= new ArrayList<TipoCuentaBanco>();
							tipocuentabancosAux.addAll(tipocuentabancoLogic.getTipoCuentaBancos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentabancosAux= new ArrayList<TipoCuentaBanco>();
							tipocuentabancosAux.addAll(tipocuentabancos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocuentabancoLogic.getTodosTipoCuentaBancos(finalQueryGlobal+"",this.pagination);												
							
							//tipocuentabancoLogic.getTodosTipoCuentaBancosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCuentaBancos("Todos",tipocuentabancoLogic.getTipoCuentaBancos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocuentabancoLogic.setTipoCuentaBancos(new ArrayList<TipoCuentaBanco>());					
							tipocuentabancoLogic.getTipoCuentaBancos().addAll(tipocuentabancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentabancos=new ArrayList<TipoCuentaBanco>();
							tipocuentabancos.addAll(tipocuentabancosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCuentaBanco=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCuentaBanco=this.idActual;
				
				} else if(this.idTipoCuentaBancoActual!=null && this.idTipoCuentaBancoActual!=0L) {
					idTipoCuentaBanco=idTipoCuentaBancoActual;
				}
				
					
				this.sDetalleReporte=TipoCuentaBancoConstantesFunciones.getDetalleIndicePorId(idTipoCuentaBanco);
				
				this.tipocuentabancos=new ArrayList<TipoCuentaBanco>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocuentabancoLogic.getEntity(idTipoCuentaBanco);
					
					//tipocuentabancoLogic.getEntityWithConnection(idTipoCuentaBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentabancoLogic.setTipoCuentaBancos(new ArrayList<TipoCuentaBanco>());
					tipocuentabancoLogic.getTipoCuentaBancos().add(tipocuentabancoLogic.getTipoCuentaBanco());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocuentabancos=new ArrayList<TipoCuentaBanco>();
					this.tipocuentabancos.add(tipocuentabanco);
				}
				
				if(tipocuentabancoLogic.getTipoCuentaBanco()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoCuentaBancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocuentabancoLogic.getTipoCuentaBancosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCuentaBancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCuentaBancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocuentabancoLogic.getTipoCuentaBancos()==null||tipocuentabancoLogic.getTipoCuentaBancos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocuentabancos==null|| tipocuentabancos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancosAux=new ArrayList<TipoCuentaBanco>();
						tipocuentabancosAux.addAll(tipocuentabancoLogic.getTipoCuentaBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentabancosAux=new ArrayList<TipoCuentaBanco>();
							tipocuentabancosAux.addAll(tipocuentabancos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocuentabancoLogic.getTipoCuentaBancosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCuentaBancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCuentaBancoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCuentaBancos("FK_IdEmpresa",tipocuentabancoLogic.getTipoCuentaBancos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCuentaBancos("FK_IdEmpresa",tipocuentabancos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancoLogic.setTipoCuentaBancos(new ArrayList<TipoCuentaBanco>());
						tipocuentabancoLogic.getTipoCuentaBancos().addAll(tipocuentabancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentabancos=new ArrayList<TipoCuentaBanco>();
							tipocuentabancos.addAll(tipocuentabancosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCuentaBanco();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCuentaBanco();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocuentabancoLogic.getTipoCuentaBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocuentabancos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocuentabancoLogic.getTipoCuentaBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocuentabancos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCuentaBanco tipocuentabanco) {
		Boolean permite=true;
		
		if(this.tipocuentabanco.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCuentaBancoConstantesFunciones.getOrderByListaTipoCuentaBanco();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCuentaBancoConstantesFunciones.getOrderByListaTipoCuentaBanco();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaBanco tipocuentabanco:tipocuentabancoLogic.getTipoCuentaBancos()) {
				if(tipocuentabanco.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuentabancoTotales=tipocuentabanco;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaBanco tipocuentabanco:this.tipocuentabancos) {
				if(tipocuentabanco.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuentabancoTotales=tipocuentabanco;
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
			this.tipocuentabancoAux=new TipoCuentaBanco();
			this.tipocuentabancoAux.setsType(Constantes2.S_TOTALES);
			this.tipocuentabancoAux.setIsNew(false);
			this.tipocuentabancoAux.setIsChanged(false);
			this.tipocuentabancoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCuentaBancoConstantesFunciones.TotalizarValoresFilaTipoCuentaBanco(this.tipocuentabancoLogic.getTipoCuentaBancos(),this.tipocuentabancoAux);
				
				this.tipocuentabancoLogic.getTipoCuentaBancos().add(this.tipocuentabancoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCuentaBancoConstantesFunciones.TotalizarValoresFilaTipoCuentaBanco(this.tipocuentabancos,this.tipocuentabancoAux);
				
				this.tipocuentabancos.add(this.tipocuentabancoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocuentabancoTotales=new TipoCuentaBanco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocuentabancoLogic.getTipoCuentaBancos().remove(tipocuentabancoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocuentabancos.remove(tipocuentabancoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocuentabancoTotales=new TipoCuentaBanco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaBanco tipocuentabanco:tipocuentabancoLogic.getTipoCuentaBancos()) {
				if(tipocuentabanco.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuentabancoTotales=tipocuentabanco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCuentaBancoConstantesFunciones.TotalizarValoresFilaTipoCuentaBanco(this.tipocuentabancoLogic.getTipoCuentaBancos(),tipocuentabancoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaBanco tipocuentabanco:this.tipocuentabancos) {
				if(tipocuentabanco.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuentabancoTotales=tipocuentabanco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCuentaBancoConstantesFunciones.TotalizarValoresFilaTipoCuentaBanco(this.tipocuentabancos,tipocuentabancoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoCuentaBancosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoCuentaBancosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentabancoLogic.getTipoCuentaBancosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoCuentaBanco() {
		this.isPermisoTodoTipoCuentaBanco=false;
		this.isPermisoNuevoTipoCuentaBanco=false;
		this.isPermisoActualizarTipoCuentaBanco=false;
		this.isPermisoActualizarOriginalTipoCuentaBanco=false;
		this.isPermisoEliminarTipoCuentaBanco=false;
		this.isPermisoGuardarCambiosTipoCuentaBanco=false;
		this.isPermisoConsultaTipoCuentaBanco=false;
		this.isPermisoBusquedaTipoCuentaBanco=false;
		this.isPermisoReporteTipoCuentaBanco=false;		
		this.isPermisoOrdenTipoCuentaBanco=false;		
		this.isPermisoPaginacionMedioTipoCuentaBanco=false;		
		this.isPermisoPaginacionAltoTipoCuentaBanco=false;
		this.isPermisoPaginacionTodoTipoCuentaBanco=false;
		this.isPermisoCopiarTipoCuentaBanco=false;		
		this.isPermisoVerFormTipoCuentaBanco=false;		
		this.isPermisoDuplicarTipoCuentaBanco=false;		
		this.isPermisoOrdenTipoCuentaBanco=false;		
	}
	
	public void setPermisosUsuarioTipoCuentaBanco(Boolean isPermiso) {
		this.isPermisoTodoTipoCuentaBanco=isPermiso;
		this.isPermisoNuevoTipoCuentaBanco=isPermiso;
		this.isPermisoActualizarTipoCuentaBanco=isPermiso;
		this.isPermisoActualizarOriginalTipoCuentaBanco=isPermiso;
		this.isPermisoEliminarTipoCuentaBanco=isPermiso;
		this.isPermisoGuardarCambiosTipoCuentaBanco=isPermiso;
		this.isPermisoConsultaTipoCuentaBanco=isPermiso;
		this.isPermisoBusquedaTipoCuentaBanco=isPermiso;
		this.isPermisoReporteTipoCuentaBanco=isPermiso;
		this.isPermisoOrdenTipoCuentaBanco=isPermiso;		
		this.isPermisoPaginacionMedioTipoCuentaBanco=isPermiso;		
		this.isPermisoPaginacionAltoTipoCuentaBanco=isPermiso;		
		this.isPermisoPaginacionTodoTipoCuentaBanco=isPermiso;		
		this.isPermisoCopiarTipoCuentaBanco=isPermiso;		
		this.isPermisoVerFormTipoCuentaBanco=isPermiso;		
		this.isPermisoDuplicarTipoCuentaBanco=isPermiso;
		this.isPermisoOrdenTipoCuentaBanco=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCuentaBanco(Boolean isPermiso) {
		//this.isPermisoTodoTipoCuentaBanco=isPermiso;
		this.isPermisoNuevoTipoCuentaBanco=isPermiso;
		this.isPermisoActualizarTipoCuentaBanco=isPermiso;
		this.isPermisoActualizarOriginalTipoCuentaBanco=isPermiso;
		this.isPermisoEliminarTipoCuentaBanco=isPermiso;
		this.isPermisoGuardarCambiosTipoCuentaBanco=isPermiso;
		//this.isPermisoConsultaTipoCuentaBanco=isPermiso;
		//this.isPermisoBusquedaTipoCuentaBanco=isPermiso;
		//this.isPermisoReporteTipoCuentaBanco=isPermiso;
		//this.isPermisoOrdenTipoCuentaBanco=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCuentaBanco=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCuentaBanco=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCuentaBanco=isPermiso;		
		//this.isPermisoCopiarTipoCuentaBanco=isPermiso;		
		//this.isPermisoDuplicarTipoCuentaBanco=isPermiso;
		//this.isPermisoOrdenTipoCuentaBanco=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCuentaBancoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ReferenciaBancariaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(TipoCuentaBancoGeneralConstantesFunciones.SNOMBREOPCION);
		
		if(TipoCuentaBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosReferenciaBancaria=false;
		this.isTienePermisosReferenciaBancaria=this.verificarGetPermisosUsuarioOpcionTipoCuentaBancoClaseRelacionada(this.opcionsRelacionadas,ReferenciaBancariaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosTipoCuentaBancoGeneral=false;
		this.isTienePermisosTipoCuentaBancoGeneral=this.verificarGetPermisosUsuarioOpcionTipoCuentaBancoClaseRelacionada(this.opcionsRelacionadas,TipoCuentaBancoGeneralConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCuentaBanco(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCuentaBancoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosReferenciaBancaria=conPermiso;
		this.isTienePermisosTipoCuentaBancoGeneral=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCuentaBancoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCuentaBancoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCuentaBancoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosReferenciaBancaria && this.jInternalFrameDetalleFormTipoCuentaBanco!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jTabbedPaneRelacionesTipoCuentaBanco.remove(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosTipoCuentaBancoGeneral && this.jInternalFrameDetalleFormTipoCuentaBanco!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jTabbedPaneRelacionesTipoCuentaBanco.remove(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoCuentaBanco() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCuentaBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCuentaBancoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCuentaBanco=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCuentaBanco=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCuentaBanco=this.isPermisoActualizarTipoCuentaBanco;
			this.isPermisoEliminarTipoCuentaBanco=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCuentaBanco=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCuentaBanco=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCuentaBanco=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCuentaBanco=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCuentaBanco=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCuentaBanco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCuentaBanco=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCuentaBanco=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCuentaBanco=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCuentaBanco=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCuentaBanco=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCuentaBanco=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCuentaBanco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCuentaBanco.setToolTipText(this.jTableDatosTipoCuentaBanco.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCuentaBanco(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCuentaBanco(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCuentaBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCuentaBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCuentaBanco() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosReferenciaBancaria && this.tipocuentabancoConstantesFunciones.mostrarReferenciaBancariaTipoCuentaBanco && !TipoCuentaBancoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Referencia Bancaria");
			reporte.setsDescripcion("Referencia Bancaria");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosTipoCuentaBancoGeneral && this.tipocuentabancoConstantesFunciones.mostrarTipoCuentaBancoGeneralTipoCuentaBanco && !TipoCuentaBancoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Tipo Cuenta Banco General");
			reporte.setsDescripcion("Tipo Cuenta Banco General");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyTipoCuentaBancoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCuentaBancoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCuentaBancoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCuentaBancoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoCuentaBancoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoCuentaBancoParameterReturnGeneral tipocuentabancoReturnGeneral=new TipoCuentaBancoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipocuentabancoConstantesFunciones.cargarid_empresaTipoCuentaBanco)
					 || (this.esRecargarFks && this.tipocuentabancoConstantesFunciones.cargarid_empresaTipoCuentaBanco)) {

					if(!this.tipocuentabancoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipocuentabancoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipocuentabancoReturnGeneral=tipocuentabancoLogic.cargarCombosLoteForeignKeyTipoCuentaBanco(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipocuentabancoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCuentaBanco()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipocuentabancoSessionBean==null) {
				this.tipocuentabancoSessionBean=new TipoCuentaBancoSessionBean();
			}

			if(!this.tipocuentabancoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoCuentaBanco()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCuentaBanco(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCuentaBanco()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCuentaBanco();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCuentaBanco(TipoCuentaBanco tipocuentabanco)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCuentaBanco(TipoCuentaBanco tipocuentabanco,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCuentaBanco()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCuentaBanco()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCuentaBanco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCuentaBanco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCuentaBanco()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCuentaBanco()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCuentaBanco(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCuentaBanco()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxid_empresaTipoCuentaBanco!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxid_empresaTipoCuentaBanco.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxid_empresaTipoCuentaBanco.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoCuentaBancoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCuentaBancoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCuentaBancoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocuentabancoSessionBean=new TipoCuentaBancoSessionBean(); 
		this.tipocuentabancoConstantesFunciones=new TipoCuentaBancoConstantesFunciones(); 
		this.tipocuentabancoBean=new TipoCuentaBanco();//(this.tipocuentabancoConstantesFunciones); 		
		this.tipocuentabancoReturnGeneral=new TipoCuentaBancoParameterReturnGeneral(); 
		
		this.tipocuentabancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocuentabancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCuentaBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCuentaBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCuentaBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCuentaBanco(true);
			
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
			
			this.tipocuentabancoConstantesFunciones=new TipoCuentaBancoConstantesFunciones(); 
			this.tipocuentabancoBean=new TipoCuentaBanco();//this.tipocuentabancoConstantesFunciones); 			
			this.tipocuentabancoReturnGeneral=new TipoCuentaBancoParameterReturnGeneral(); 
		
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Cuenta Banco Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocuentabanco=new TipoCuentaBanco();
			this.tipocuentabancos = new ArrayList<TipoCuentaBanco>();
			this.tipocuentabancosAux = new ArrayList<TipoCuentaBanco>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic=new TipoCuentaBancoLogic();
				this.tipocuentabancoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocuentabancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocuentabancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCuentaBanco);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCuentaBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCuentaBanco);	
					}
					
					if(this.jInternalFrameImportacionTipoCuentaBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCuentaBanco);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCuentaBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCuentaBanco);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCuentaBanco);
				this.jInternalFrameDetalleFormTipoCuentaBanco.setVisible(false);
				this.jInternalFrameDetalleFormTipoCuentaBanco.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCuentaBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCuentaBanco);
					this.jInternalFrameReporteDinamicoTipoCuentaBanco.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCuentaBanco.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCuentaBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCuentaBanco);
					this.jInternalFrameImportacionTipoCuentaBanco.setVisible(false);
					this.jInternalFrameImportacionTipoCuentaBanco.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCuentaBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCuentaBanco);
					this.jInternalFrameOrderByTipoCuentaBanco.setVisible(false);
					this.jInternalFrameOrderByTipoCuentaBanco.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCuentaBancoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCuentaBancoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocuentabancoReturnGeneral=new TipoCuentaBancoParameterReturnGeneral();
			
			this.tipocuentabancoParameterGeneral=new TipoCuentaBancoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocuentabancoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCuentaBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ReferenciaBancariaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(TipoCuentaBancoGeneralConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCuentaBancoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocuentabancoSessionBean.getEsGuardarRelacionado(),this.tipocuentabancoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCuentaBancoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocuentabancoSessionBean.getEsGuardarRelacionado(),this.tipocuentabancoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCuentaBanco=false;
			this.isVisibilidadCeldaDuplicarTipoCuentaBanco=true;
			this.isVisibilidadCeldaCopiarTipoCuentaBanco=true;
			this.isVisibilidadCeldaVerFormTipoCuentaBanco=true;
			this.isVisibilidadCeldaOrdenTipoCuentaBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco=false;
			this.isVisibilidadCeldaModificarTipoCuentaBanco=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBanco=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBanco=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBanco=false;
			this.isVisibilidadCeldaGuardarTipoCuentaBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCuentaBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCuentaBanco();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCuentaBanco(false);
			
			this.setPermisosUsuarioTipoCuentaBanco();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocuentabancoSessionBean.getEsGuardarRelacionado() && this.tipocuentabancoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCuentaBancoClasesRelacionadas();
			}
			
			if(this.tipocuentabancoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCuentaBancoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCuentaBanco();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCuentaBanco();
			}
			
			if(!this.isPermisoBusquedaTipoCuentaBanco) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoCuentaBanco.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCuentaBanco,this.isPermisoPaginacionMedioTipoCuentaBanco,this.isPermisoPaginacionTodoTipoCuentaBanco);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCuentaBancoConstantesFunciones.getTiposSeleccionarTipoCuentaBanco());
				
				this.tiposColumnasSelect=TipoCuentaBancoConstantesFunciones.getTiposSeleccionarTipoCuentaBanco(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoCuentaBanco();				
				//this.tiposRelacionesSelect=TipoCuentaBancoConstantesFunciones.getTiposRelacionesTipoCuentaBanco(true);
				
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
			//if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCuentaBanco();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoCuentaBanco(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoCuentaBanco(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuentaBanco() ;
			
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
			
			
			this.referenciabancariaLogic=new ReferenciaBancariaLogic();
			this.tipocuentabancogeneralLogic=new TipoCuentaBancoGeneralLogic(); 
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
				tipocuentabancoImplementable= (TipoCuentaBancoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCuentaBancoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocuentabancoImplementableHome= (TipoCuentaBancoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCuentaBancoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocuentabancos= new ArrayList<TipoCuentaBanco>();
			this.tipocuentabancosEliminados= new ArrayList<TipoCuentaBanco>();
						
			this.isEsNuevoTipoCuentaBanco=false;
			this.esParaAccionDesdeFormularioTipoCuentaBanco=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCuentaBanco(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCuentaBanco();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCuentaBancoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCuentaBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCuentaBanco(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCuentaBanco();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCuentaBanco();
			}
			
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoCuentaBanco.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoCuentaBanco.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoCuentaBanco.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCuentaBanco(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCuentaBanco: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCuentaBanco() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCuentaBanco")) {
				iIndex=this.jInternalFrameDetalleFormTipoCuentaBanco.jTabbedPaneRelacionesTipoCuentaBanco.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCuentaBanco.jTabbedPaneRelacionesTipoCuentaBanco.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();	
				
				

				if(sTitle.equals("Referencia Bancarias")) {
					if(!ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCuentaBanco();

						this.cargarParteTabPanelRelacionadaReferenciaBancaria(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Tipo Cuenta Banco Generales")) {
					if(!TipoCuentaBancoGeneralJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCuentaBanco();

						this.cargarParteTabPanelRelacionadaTipoCuentaBancoGeneral(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCuentaBanco();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaReferenciaBancaria(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCuentaBanco.cargarSessionConBeanSwingJInternalFrameReferenciaBancaria(false,true,iIndex);
		this.jButtonReferenciaBancariaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaReferenciaBancaria();

		//this.jTabbedPaneRelacionesTipoCuentaBanco.updateUI();
		//this.jTabbedPaneRelacionesTipoCuentaBanco.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCuentaBanco.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaTipoCuentaBancoGeneral(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCuentaBanco.cargarSessionConBeanSwingJInternalFrameTipoCuentaBancoGeneral(false,true,iIndex);
		this.jButtonTipoCuentaBancoGeneralActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTipoCuentaBancoGeneral();

		//this.jTabbedPaneRelacionesTipoCuentaBanco.updateUI();
		//this.jTabbedPaneRelacionesTipoCuentaBanco.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCuentaBanco.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ReferenciaBancaria")) {
				int row=this.jTableDatosTipoCuentaBanco.getSelectedRow();
				jButtonReferenciaBancariaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("TipoCuentaBancoGeneral")) {
				int row=this.jTableDatosTipoCuentaBanco.getSelectedRow();
				jButtonTipoCuentaBancoGeneralActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Referencia Bancaria")) {

					if(this.isTienePermisosReferenciaBancaria && this.tipocuentabancoConstantesFunciones.mostrarReferenciaBancariaTipoCuentaBanco && !TipoCuentaBancoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Referencia Bancarias"+"("+ReferenciaBancariaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Referencia Bancarias");

						if(tipocuentabancoConstantesFunciones.resaltarReferenciaBancariaTipoCuentaBanco!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocuentabancoConstantesFunciones.resaltarReferenciaBancariaTipoCuentaBanco);
						}

						jmenuItem.setEnabled(this.tipocuentabancoConstantesFunciones.activarReferenciaBancariaTipoCuentaBanco);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ReferenciaBancaria"));

						

						this.jInternalFrameDetalleFormTipoCuentaBanco.jmenuDetalleTipoCuentaBanco.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Tipo Cuenta Banco General")) {

					if(this.isTienePermisosTipoCuentaBancoGeneral && this.tipocuentabancoConstantesFunciones.mostrarTipoCuentaBancoGeneralTipoCuentaBanco && !TipoCuentaBancoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Tipo Cuenta Banco Generales"+"("+TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Tipo Cuenta Banco Generales");

						if(tipocuentabancoConstantesFunciones.resaltarTipoCuentaBancoGeneralTipoCuentaBanco!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocuentabancoConstantesFunciones.resaltarTipoCuentaBancoGeneralTipoCuentaBanco);
						}

						jmenuItem.setEnabled(this.tipocuentabancoConstantesFunciones.activarTipoCuentaBancoGeneralTipoCuentaBanco);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TipoCuentaBancoGeneral"));

						

						this.jInternalFrameDetalleFormTipoCuentaBanco.jmenuDetalleTipoCuentaBanco.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoCuentaBanco(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCuentaBanco(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCuentaBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCuentaBancoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCuentaBanco();
		
		this.cargarCombosFrameForeignKeyTipoCuentaBanco();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCuentaBanco();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCuentaBanco();
		}
	}
	
	
	
	public void jButtonNuevoTipoCuentaBancoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocuentabancoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
			
			
			if(jTableDatosTipoCuentaBanco.getRowCount()>=1) {
				jTableDatosTipoCuentaBanco.removeRowSelectionInterval(0, jTableDatosTipoCuentaBanco.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCuentaBanco=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCuentaBanco(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCuentaBanco(true);			
			//this.tipocuentabanco=new TipoCuentaBanco();
			//this.tipocuentabanco.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCuentaBanco(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuentaBanco() ;
			
			if(TipoCuentaBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCuentaBanco(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocuentabanco);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabanco);				
			
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
			
			if(this.tipocuentabancoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCuentaBanco: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCuentaBancoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCuentaBanco> tipocuentabancosSeleccionados=new ArrayList<TipoCuentaBanco>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCuentaBanco.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCuentaBanco.getSelectedRows().length;			
			}
			
			tipocuentabancosSeleccionados=this.getTipoCuentaBancosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCuentaBanco--;			
				//TipoCuentaBanco tipocuentabancoAux= new TipoCuentaBanco();			
				//tipocuentabancoAux.setId(this.iIdNuevoTipoCuentaBanco);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCuentaBanco tipocuentabancoOrigen=new TipoCuentaBanco();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCuentaBanco tipocuentabancoOrigen : tipocuentabancosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocuentabancoOrigen =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentabancoOrigen =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCuentaBanco();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocuentabanco.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCuentaBanco(tipocuentabancoOrigen,this.tipocuentabanco,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocuentabancoLogic.getTipoCuentaBancos().add(this.tipocuentabancoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocuentabancos.add(this.tipocuentabancoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCuentaBanco(false);
				
				this.jTableDatosTipoCuentaBanco.setRowSelectionInterval(this.getIndiceNuevoTipoCuentaBanco(), this.getIndiceNuevoTipoCuentaBanco());
				
				int iLastRow =  this.jTableDatosTipoCuentaBanco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCuentaBanco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCuentaBanco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCuentaBanco(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCuentaBanco> tipocuentabancosSeleccionados=new ArrayList<TipoCuentaBanco>();									
		
			TipoCuentaBanco tipocuentabancoOrigen=new TipoCuentaBanco();
			TipoCuentaBanco tipocuentabancoDestino=new TipoCuentaBanco();
				
			tipocuentabancosSeleccionados=this.getTipoCuentaBancosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCuentaBanco.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocuentabancosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCuentaBanco.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancoOrigen =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocuentabancoOrigen =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancoDestino =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocuentabancoDestino =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocuentabancoOrigen =tipocuentabancosSeleccionados.get(0);
				tipocuentabancoDestino =tipocuentabancosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCuentaBanco(tipocuentabancoOrigen,tipocuentabancoDestino,true,false);
				
				tipocuentabancoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocuentabancoDestino,tipocuentabancoLogic.getTipoCuentaBancos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuentabancoDestino,tipocuentabancos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCuentaBanco(false);
				
				//this.jTableDatosTipoCuentaBanco.setRowSelectionInterval(this.getIndiceNuevoTipoCuentaBanco(), this.getIndiceNuevoTipoCuentaBanco());
				
				int iLastRow =  this.jTableDatosTipoCuentaBanco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCuentaBanco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCuentaBanco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCuentaBanco(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCuentaBanco.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCuentaBanco.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoCuentaBanco.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoCuentaBanco.setVisible(!isVisible);
			this.jPanelPaginacionTipoCuentaBanco.setVisible(!isVisible);
			this.jPanelAccionesTipoCuentaBanco.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCuentaBanco();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCuentaBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCuentaBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCuentaBanco();
			
			this.abrirFrameOrderByTipoCuentaBanco();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCuentaBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCuentaBanco(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCuentaBanco);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCuentaBanco.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCuentaBanco.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCuentaBanco.setSize(this.jInternalFrameDetalleFormTipoCuentaBanco.iWidthFormulario,this.jInternalFrameDetalleFormTipoCuentaBanco.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCuentaBanco.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCuentaBanco.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCuentaBanco.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCuentaBanco.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCuentaBanco.jContentPaneDetalleTipoCuentaBanco.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCuentaBanco.jTabbedPaneRelacionesTipoCuentaBanco.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCuentaBanco.jContentPaneDetalleTipoCuentaBanco.getWidth(),TipoCuentaBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCuentaBanco.jTabbedPaneRelacionesTipoCuentaBanco.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCuentaBanco.jContentPaneDetalleTipoCuentaBanco.getWidth(),TipoCuentaBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCuentaBanco.jTabbedPaneRelacionesTipoCuentaBanco.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCuentaBanco.jContentPaneDetalleTipoCuentaBanco.getWidth(),TipoCuentaBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaReferenciaBancaria();
					}

					if(TipoCuentaBancoGeneralJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTipoCuentaBancoGeneral();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCuentaBanco.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCuentaBanco.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCuentaBanco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCuentaBanco==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCuentaBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuentaBanco,false,this);
				} else {
					this.jInternalFrameOrderByTipoCuentaBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuentaBanco,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCuentaBanco);
				this.jInternalFrameOrderByTipoCuentaBanco.setVisible(false);
				this.jInternalFrameOrderByTipoCuentaBanco.setSelected(false);
				
				this.jInternalFrameOrderByTipoCuentaBanco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCuentaBanco"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCuentaBanco();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCuentaBanco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCuentaBanco==null) {
				
				this.jInternalFrameImportacionTipoCuentaBanco=new ImportacionJInternalFrame(TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCuentaBanco);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCuentaBanco);
				this.jInternalFrameImportacionTipoCuentaBanco.setVisible(false);
				this.jInternalFrameImportacionTipoCuentaBanco.setSelected(false);


				this.jInternalFrameImportacionTipoCuentaBanco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCuentaBanco"));
				this.jInternalFrameImportacionTipoCuentaBanco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCuentaBanco"));
				this.jInternalFrameImportacionTipoCuentaBanco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCuentaBanco"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCuentaBanco() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCuentaBanco==null) {
				this.jInternalFrameReporteDinamicoTipoCuentaBanco=new ReporteDinamicoJInternalFrame(TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCuentaBanco);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCuentaBanco);
				this.jInternalFrameReporteDinamicoTipoCuentaBanco.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCuentaBanco.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCuentaBanco"));
				this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCuentaBanco"));
				this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCuentaBanco"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCuentaBanco();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaReferenciaBancaria() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.jScrollPanelDatosReferenciaBancaria.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCuentaBanco.jContentPaneDetalleTipoCuentaBanco.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.jScrollPanelDatosReferenciaBancaria.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.jScrollPanelDatosReferenciaBancaria.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.jScrollPanelDatosReferenciaBancaria.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaTipoCuentaBancoGeneral() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.jScrollPanelDatosTipoCuentaBancoGeneral.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCuentaBanco.jContentPaneDetalleTipoCuentaBanco.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.jScrollPanelDatosTipoCuentaBancoGeneral.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.jScrollPanelDatosTipoCuentaBancoGeneral.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.jScrollPanelDatosTipoCuentaBancoGeneral.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoCuentaBanco() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCuentaBanco);
			
	       	this.jInternalFrameDetalleFormTipoCuentaBanco.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCuentaBanco.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCuentaBanco.dispose();
			//this.jInternalFrameDetalleFormTipoCuentaBanco=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCuentaBanco() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCuentaBanco.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCuentaBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCuentaBanco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCuentaBanco.setVisible(true);
	        this.jInternalFrameImportacionTipoCuentaBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCuentaBanco() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCuentaBanco.setVisible(true);
	        this.jInternalFrameOrderByTipoCuentaBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCuentaBanco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCuentaBanco.setVisible(false);
	        this.jInternalFrameOrderByTipoCuentaBanco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCuentaBanco() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCuentaBanco.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCuentaBanco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCuentaBanco() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCuentaBanco.setVisible(false);
	        this.jInternalFrameImportacionTipoCuentaBanco.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCuentaBanco(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCuentaBanco(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCuentaBanco(true);
			//this.isEsNuevoTipoCuentaBanco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCuentaBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCuentaBanco(false) ;
			
			if(tipocuentabancoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.getEsGuardarRelacionado() && ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonReferenciaBancariaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado() && TipoCuentaBancoGeneralJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTipoCuentaBancoGeneralActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoCuentaBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCuentaBanco(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuentaBanco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCuentaBancoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCuentaBanco(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCuentaBanco(true);
			//this.isEsNuevoTipoCuentaBanco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocuentabanco.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCuentaBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCuentaBanco(false) ;
			
			if(TipoCuentaBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCuentaBanco(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuentaBanco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCuentaBanco(false);
			
			//if(!this.isEsNuevoTipoCuentaBanco) {								
				int intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCuentaBanco(this.tipocuentabanco,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);
				
			}
			
			if(this.permiteMantenimiento(this.tipocuentabanco)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCuentaBanco=true;
					this.inicializarActualizarBindingTablaTipoCuentaBanco(false);
					this.isEsNuevoTipoCuentaBanco=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCuentaBanco=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCuentaBanco=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCuentaBanco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCuentaBanco(false);
				
				this.habilitarDeshabilitarControlesTipoCuentaBanco(false);
			
												
				
				if(TipoCuentaBancoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCuentaBanco();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCuentaBancoActionPerformed(evt,tipocuentabancoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCuentaBanco(this.tipocuentabanco,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCuentaBanco.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocuentabancoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocuentabanco.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBanco.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBanco.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				this.tipocuentabanco.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				this.tipocuentabanco.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocuentabanco)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCuentaBancoModel) this.jTableDatosTipoCuentaBanco.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCuentaBanco=true;
				this.inicializarActualizarBindingTablaTipoCuentaBanco(false);
				this.isEsNuevoTipoCuentaBanco=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCuentaBanco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCuentaBanco(false);
				
				this.habilitarDeshabilitarControlesTipoCuentaBanco(false);
				
				
				
				if(TipoCuentaBancoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCuentaBanco();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCuentaBanco.getRowCount()>=1) {
				jTableDatosTipoCuentaBanco.removeRowSelectionInterval(0, jTableDatosTipoCuentaBanco.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCuentaBanco(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCuentaBanco(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCuentaBanco(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuentaBanco(false) ;
			
			this.isEsNuevoTipoCuentaBanco=false;
			
			if(TipoCuentaBancoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCuentaBanco();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCuentaBanco(false);
				
				//SI ES MANUAL
				if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCuentaBanco();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCuentaBanco--;			
			//TipoCuentaBanco tipocuentabancoAux= new TipoCuentaBanco();			
			//tipocuentabancoAux.setId(this.iIdNuevoTipoCuentaBanco);
			
			if(this.jInternalFrameDetalleFormTipoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCuentaBanco();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);
			
			this.tipocuentabanco.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocuentabancoLogic.getTipoCuentaBancos().add(this.tipocuentabancoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocuentabancos.add(this.tipocuentabancoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCuentaBanco(false);
			
			this.jTableDatosTipoCuentaBanco.setRowSelectionInterval(this.getIndiceNuevoTipoCuentaBanco(), this.getIndiceNuevoTipoCuentaBanco());
			
			int iLastRow =  this.jTableDatosTipoCuentaBanco.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCuentaBanco.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCuentaBanco.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCuentaBanco(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCuentaBanco(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuentaBanco(false);
			
			//SI ES MANUAL
			if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCuentaBanco();
			}
			
			//this.abrirFrameTreeTipoCuentaBanco();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Cuenta BancoS ?", "MANTENIMIENTO DE Tipo Cuenta Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCuentaBanco.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCuentaBanco();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocuentabancoReturnGeneral=tipocuentabancoLogic.procesarImportacionTipoCuentaBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocuentabancoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCuentaBancoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCuentaBanco.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCuentaBanco.setFileImportacion(this.jInternalFrameImportacionTipoCuentaBanco.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCuentaBanco.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCuentaBanco.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCuentaBanco.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCuentaBanco.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCuentaBanco> tipocuentabancosSeleccionados=new ArrayList<TipoCuentaBanco>();		

		tipocuentabancosSeleccionados=this.getTipoCuentaBancosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCuentaBancoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCuentaBancoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCuentaBancos("Todos",tipocuentabancosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCuentaBancoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCuentaBancoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCuentaBancoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoCuentaBancoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCuentaBancoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoCuentaBancoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCuentaBancoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoCuentaBancoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCuentaBanco> tipocuentabancosSeleccionados=new ArrayList<TipoCuentaBanco>();		
		
		tipocuentabancosSeleccionados=this.getTipoCuentaBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabanco";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCuentaBancos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCuentaBancoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCuentaBancoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoCuentaBanco tipocuentabanco:tipocuentabancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocuentabanco.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCuentaBancoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCuentaBancoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoCuentaBanco tipocuentabanco:tipocuentabancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocuentabanco.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCuentaBanco tipocuentabanco:tipocuentabancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocuentabanco.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCuentaBanco(row);				
			//	iRow++;
			//}				
			
			//for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCuentaBanco(tipocuentabancoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocuentabancoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuentaBanco(false);
			
			//SI ES MANUAL
			if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCuentaBanco();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuentaBanco(false);
			
			//SI ES MANUAL
			if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCuentaBanco();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuentaBanco(false);
			
			//SI ES MANUAL
			if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCuentaBanco();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCuentaBanco() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCuentaBanco.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCuentaBanco.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCuentaBanco.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCuentaBanco.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCuentaBanco.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCuentaBanco.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCuentaBanco.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCuentaBanco(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCuentaBanco(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCuentaBanco(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCuentaBanco(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCuentaBanco(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCuentaBanco(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuentaBanco(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCuentaBanco(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCuentaBanco() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCuentaBanco();
		
		this.inicializarActualizarBindingBotonesManualTipoCuentaBanco(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCuentaBanco();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuentaBanco() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCuentaBanco(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCuentaBanco(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCuentaBanco.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCuentaBanco.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCuentaBanco.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCuentaBanco.jCheckBoxPostAccionNuevoTipoCuentaBanco.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCuentaBanco.jCheckBoxPostAccionSinCerrarTipoCuentaBanco.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCuentaBanco.jCheckBoxPostAccionSinMensajeTipoCuentaBanco.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCuentaBanco.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCuentaBanco.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCuentaBanco.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
				this.jInternalFrameDetalleFormTipoCuentaBanco.jCheckBoxPostAccionNuevoTipoCuentaBanco.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCuentaBanco.jCheckBoxPostAccionSinCerrarTipoCuentaBanco.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCuentaBanco.jCheckBoxPostAccionSinMensajeTipoCuentaBanco.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCuentaBanco.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCuentaBanco.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxTiposAccionesFormularioTipoCuentaBanco.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCuentaBanco.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCuentaBanco!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCuentaBanco.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCuentaBanco.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCuentaBanco.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCuentaBanco.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCuentaBanco!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCuentaBanco.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCuentaBanco.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCuentaBanco(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCuentaBanco(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuentaBanco() throws Exception {
		try	{
			if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCuentaBanco();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCuentaBanco() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxTiposAccionesFormularioTipoCuentaBanco.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxTiposAccionesFormularioTipoCuentaBanco.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCuentaBanco() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCuentaBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCuentaBanco.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCuentaBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCuentaBanco.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCuentaBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCuentaBanco.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCuentaBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCuentaBanco.addItem(reporte);
			}
			
			
			if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCuentaBanco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCuentaBanco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCuentaBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCuentaBanco.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCuentaBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCuentaBanco.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxTiposAccionesFormularioTipoCuentaBanco.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxTiposAccionesFormularioTipoCuentaBanco.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCuentaBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCuentaBanco.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCuentaBanco.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCuentaBanco();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCuentaBanco() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCuentaBanco!=null) {
				this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCuentaBanco!=null) {
				this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCuentaBanco!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCuentaBanco()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCuentaBanco(Boolean esInicializar) throws Exception {				
		if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCuentaBanco();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCuentaBanco() throws Exception {
		this.inicializarActualizarBindingTablaTipoCuentaBanco(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCuentaBanco() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCuentaBanco.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCuentaBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCuentaBanco.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCuentaBancoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCuentaBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCuentaBanco.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCuentaBancoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCuentaBancoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCuentaBancoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCuentaBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCuentaBanco.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCuentaBancoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCuentaBanco.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCuentaBanco(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocuentabancoLogic.getTipoCuentaBancos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocuentabancos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCuentaBanco.setModel(new TipoCuentaBancoModel(this.tipocuentabancoLogic.getTipoCuentaBancos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCuentaBanco.setModel(new TipoCuentaBancoModel(this.tipocuentabancos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCuentaBanco!=null && this.jInternalFrameOrderByTipoCuentaBanco.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCuentaBanco();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCuentaBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBanco,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCuentaBancoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO,tipocuentabancoConstantesFunciones.resaltarSeleccionarTipoCuentaBanco,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCuentaBancoConstantesFunciones.SCLASSWEBTITULO,tipocuentabancoConstantesFunciones.resaltarSeleccionarTipoCuentaBanco,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCuentaBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBanco,TipoCuentaBancoConstantesFunciones.LABEL_ID));

		if(this.tipocuentabancoConstantesFunciones.mostraridTipoCuentaBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuentaBancoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocuentabancoConstantesFunciones.resaltaridTipoCuentaBanco,this.tipocuentabancoConstantesFunciones.activaridTipoCuentaBanco,this,true,"idTipoCuentaBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocuentabancoConstantesFunciones.resaltaridTipoCuentaBanco,this.tipocuentabancoConstantesFunciones.activaridTipoCuentaBanco,this,true,"idTipoCuentaBanco","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCuentaBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBanco,TipoCuentaBancoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipocuentabancoConstantesFunciones.mostrarid_empresaTipoCuentaBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuentaBancoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipocuentabancoConstantesFunciones.resaltarid_empresaTipoCuentaBanco,this,this.tipocuentabancoConstantesFunciones.activarid_empresaTipoCuentaBanco));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipocuentabancoConstantesFunciones.resaltarid_empresaTipoCuentaBanco,this,this.tipocuentabancoConstantesFunciones.activarid_empresaTipoCuentaBanco,false,"id_empresaTipoCuentaBanco","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCuentaBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCuentaBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBanco,TipoCuentaBancoConstantesFunciones.LABEL_CODIGO));

		if(this.tipocuentabancoConstantesFunciones.mostrarcodigoTipoCuentaBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuentaBancoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocuentabancoConstantesFunciones.resaltarcodigoTipoCuentaBanco,this.tipocuentabancoConstantesFunciones.activarcodigoTipoCuentaBanco,this,true,"codigoTipoCuentaBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocuentabancoConstantesFunciones.resaltarcodigoTipoCuentaBanco,this.tipocuentabancoConstantesFunciones.activarcodigoTipoCuentaBanco,this,true,"codigoTipoCuentaBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCuentaBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCuentaBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBanco,TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocuentabancoConstantesFunciones.mostrarnombreTipoCuentaBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocuentabancoConstantesFunciones.resaltarnombreTipoCuentaBanco,this.tipocuentabancoConstantesFunciones.activarnombreTipoCuentaBanco,this,true,"nombreTipoCuentaBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocuentabancoConstantesFunciones.resaltarnombreTipoCuentaBanco,this.tipocuentabancoConstantesFunciones.activarnombreTipoCuentaBanco,this,true,"nombreTipoCuentaBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCuentaBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosReferenciaBancaria && this.tipocuentabancoConstantesFunciones.mostrarReferenciaBancariaTipoCuentaBanco && !TipoCuentaBancoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Referencia Bancarias");
				tableColumn.setHeaderValue("Referencia Bancarias");
				tableColumn.setCellRenderer(new ReferenciaBancariaTableCell(tipocuentabancoConstantesFunciones.resaltarReferenciaBancariaTipoCuentaBanco,this,this.tipocuentabancoConstantesFunciones.activarReferenciaBancariaTipoCuentaBanco));
				tableColumn.setCellEditor(new ReferenciaBancariaTableCell(tipocuentabancoConstantesFunciones.resaltarReferenciaBancariaTipoCuentaBanco,this,this.tipocuentabancoConstantesFunciones.activarReferenciaBancariaTipoCuentaBanco));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCuentaBanco.addColumn(tableColumn);
			}

			if(this.isTienePermisosTipoCuentaBancoGeneral && this.tipocuentabancoConstantesFunciones.mostrarTipoCuentaBancoGeneralTipoCuentaBanco && !TipoCuentaBancoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Tipo Cuenta Banco Generales");
				tableColumn.setHeaderValue("Tipo Cuenta Banco Generales");
				tableColumn.setCellRenderer(new TipoCuentaBancoGeneralTableCell(tipocuentabancoConstantesFunciones.resaltarTipoCuentaBancoGeneralTipoCuentaBanco,this,this.tipocuentabancoConstantesFunciones.activarTipoCuentaBancoGeneralTipoCuentaBanco));
				tableColumn.setCellEditor(new TipoCuentaBancoGeneralTableCell(tipocuentabancoConstantesFunciones.resaltarTipoCuentaBancoGeneralTipoCuentaBanco,this,this.tipocuentabancoConstantesFunciones.activarTipoCuentaBancoGeneralTipoCuentaBanco));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCuentaBanco.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocuentabancoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocuentabancoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCuentaBanco.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocuentabancoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocuentabancoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCuentaBanco.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCuentaBanco && this.isPermisoGuardarCambiosTipoCuentaBanco) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocuentabancoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocuentabancoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCuentaBanco.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipocuentabancoSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoCuentaBanco.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCuentaBanco.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCuentaBanco && this.isPermisoGuardarCambiosTipoCuentaBanco) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocuentabancoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCuentaBanco && this.isPermisoGuardarCambiosTipoCuentaBanco) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCuentaBanco.moveColumn(this.jTableDatosTipoCuentaBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCuentaBanco.moveColumn(this.jTableDatosTipoCuentaBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocuentabancoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoCuentaBanco.moveColumn(this.jTableDatosTipoCuentaBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCuentaBanco.moveColumn(this.jTableDatosTipoCuentaBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCuentaBanco.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCuentaBanco.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCuentaBanco,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCuentaBanco.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCuentaBanco.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCuentaBanco.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCuentaBanco.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCuentaBanco.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocuentabancoLogic.getTipoCuentaBancos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocuentabancos.size()-1;
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
		//this.jTableDatosTipoCuentaBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCuentaBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCuentaBanco();
			
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
				
				//this.isEsNuevoTipoCuentaBanco=false;
					
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
			
				if(this.tipocuentabancoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCuentaBanco==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCuentaBanco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCuentaBanco.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocuentabanco.getsType().equals("DUPLICADO")
				   || this.tipocuentabanco.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCuentaBanco=true;
				
				} else {
					this.isEsNuevoTipoCuentaBanco=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocuentabanco.getId()>=0 && !this.tipocuentabanco.getIsNew()) {						
						this.isEsNuevoTipoCuentaBanco=false;
						
					} else {
						this.isEsNuevoTipoCuentaBanco=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCuentaBanco(esRelaciones);						
				
				this.seleccionarTipoCuentaBanco(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocuentabanco.getId()<0) {
					this.isEsNuevoTipoCuentaBanco=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCuentaBanco(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCuentaBanco(evt,rowIndex);
				}	
				
				if(this.tipocuentabancoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCuentaBanco: " + this.dDif); 
					}
				}								
				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCuentaBanco(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocuentabanco)) {
					if(this.tipocuentabanco.getId()>0) {
						this.tipocuentabanco.setIsDeleted(true);
						
						this.tipocuentabancosEliminados.add(this.tipocuentabanco);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocuentabancoLogic.getTipoCuentaBancos().remove(this.tipocuentabanco);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocuentabancos.remove(this.tipocuentabanco);				
					}
					
					
					((TipoCuentaBancoModel) this.jTableDatosTipoCuentaBanco.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCuentaBanco(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCuentaBanco(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCuentaBanco) {
			
			if(this.jInternalFrameDetalleFormTipoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCuentaBanco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCuentaBanco.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCuentaBanco(this.tipocuentabanco);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipocuentabancoConstantesFunciones.cargarid_empresaTipoCuentaBanco || this.tipocuentabancoConstantesFunciones.event_dependid_empresaTipoCuentaBanco) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipocuentabanco.getid_empresa());
									//this.inicializarActualizarBindingTipoCuentaBanco(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipocuentabanco.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipocuentabanco.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipocuentabanco.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCuentaBanco("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCuentaBanco(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCuentaBanco() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCuentaBanco(TipoCuentaBanco tipocuentabanco) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCuentaBanco(tipocuentabanco,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCuentaBanco(TipoCuentaBanco tipocuentabanco,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCuentaBanco(tipocuentabanco);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCuentaBanco(tipocuentabanco,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCuentaBanco(tipocuentabanco);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCuentaBanco(TipoCuentaBanco tipocuentabanco) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelidTipoCuentaBanco.setText(tipocuentabanco.getId().toString());
			this.jInternalFrameDetalleFormTipoCuentaBanco.jTextFieldcodigoTipoCuentaBanco.setText(tipocuentabanco.getcodigo());
			this.jInternalFrameDetalleFormTipoCuentaBanco.jTextAreanombreTipoCuentaBanco.setText(tipocuentabanco.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCuentaBanco tipocuentabancoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocuentabancoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCuentaBanco tipocuentabancoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocuentabancoLocal=this.tipocuentabanco;
			} else {
				tipocuentabancoLocal=this.tipocuentabancoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocuentabancoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCuentaBanco(tipocuentabancoLocal,true);
					
					if(tipocuentabancoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocuentabancoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocuentabancoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCuentaBanco(TipoCuentaBanco tipocuentabanco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCuentaBanco(tipocuentabanco,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(tipocuentabanco);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCuentaBanco(TipoCuentaBanco tipocuentabanco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCuentaBanco(tipocuentabanco,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCuentaBanco(TipoCuentaBanco tipocuentabanco,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelidTipoCuentaBanco.getText()==null || this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelidTipoCuentaBanco.getText()=="" || this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelidTipoCuentaBanco.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelidTipoCuentaBanco.setText("0");
			}

			if(conColumnasBase) {tipocuentabanco.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelidTipoCuentaBanco.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCuentaBancoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelIdTipoCuentaBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocuentabanco.setcodigo(this.jInternalFrameDetalleFormTipoCuentaBanco.jTextFieldcodigoTipoCuentaBanco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCuentaBancoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelcodigoTipoCuentaBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocuentabanco.setnombre(this.jInternalFrameDetalleFormTipoCuentaBanco.jTextAreanombreTipoCuentaBanco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelnombreTipoCuentaBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCuentaBanco(TipoCuentaBanco tipocuentabancoBean,TipoCuentaBanco tipocuentabanco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCuentaBanco(TipoCuentaBanco tipocuentabancoOrigen,TipoCuentaBanco tipocuentabanco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocuentabancoOrigen.getId()!=null && !tipocuentabancoOrigen.getId().equals(0L))) {tipocuentabanco.setId(tipocuentabancoOrigen.getId());}}
			if(conDefault || (!conDefault && tipocuentabancoOrigen.getcodigo()!=null && !tipocuentabancoOrigen.getcodigo().equals(""))) {tipocuentabanco.setcodigo(tipocuentabancoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocuentabancoOrigen.getnombre()!=null && !tipocuentabancoOrigen.getnombre().equals(""))) {tipocuentabanco.setnombre(tipocuentabancoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCuentaBanco(TipoCuentaBanco tipocuentabanco) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelidTipoCuentaBanco.setText(tipocuentabanco.getId().toString());
			this.jInternalFrameDetalleFormTipoCuentaBanco.jTextFieldcodigoTipoCuentaBanco.setText(tipocuentabanco.getcodigo());
			this.jInternalFrameDetalleFormTipoCuentaBanco.jTextAreanombreTipoCuentaBanco.setText(tipocuentabanco.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCuentaBanco(TipoCuentaBancoBean tipocuentabancoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelidTipoCuentaBanco.setText(tipocuentabancoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCuentaBanco.jTextFieldcodigoTipoCuentaBanco.setText(tipocuentabancoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoCuentaBanco.jTextAreanombreTipoCuentaBanco.setText(tipocuentabancoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCuentaBanco(TipoCuentaBancoParameterReturnGeneral tipocuentabancoReturnGeneral,TipoCuentaBancoBean tipocuentabancoBean,Boolean conDefault) throws Exception { 
		try {
			TipoCuentaBanco tipocuentabancoLocal=new TipoCuentaBanco();
			
			tipocuentabancoLocal=tipocuentabancoReturnGeneral.getTipoCuentaBanco();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocuentabancoLocal.getId()!=null && !tipocuentabancoLocal.getId().equals(0L))) {tipocuentabancoBean.setId(tipocuentabancoLocal.getId());}}
			if(conDefault || (!conDefault && tipocuentabancoLocal.getcodigo()!=null && !tipocuentabancoLocal.getcodigo().equals(""))) {tipocuentabancoBean.setcodigo(tipocuentabancoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocuentabancoLocal.getnombre()!=null && !tipocuentabancoLocal.getnombre().equals(""))) {tipocuentabancoBean.setnombre(tipocuentabancoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCuentaBancoGenerico(Long idTipoCuentaBancoSeleccionado,JComboBox jComboBoxTipoCuentaBanco,List<TipoCuentaBanco> tipocuentabancosLocal)throws Exception {
		try {
			TipoCuentaBanco  tipocuentabancoTemp=null;

			for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancosLocal) {
				if(tipocuentabancoAux.getId()!=null && tipocuentabancoAux.getId().equals(idTipoCuentaBancoSeleccionado)) {
					tipocuentabancoTemp=tipocuentabancoAux;
					break;
				}
			}

			jComboBoxTipoCuentaBanco.setSelectedItem(tipocuentabancoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCuentaBancoGenerico(JComboBox jComboBoxTipoCuentaBanco,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCuentaBanco.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCuentaBanco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCuentaBanco.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCuentaBanco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ReferenciaBancaria")) {
			jButtonReferenciaBancariaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("TipoCuentaBancoGeneral")) {
			jButtonTipoCuentaBancoGeneralActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocuentabanco=(TipoCuentaBanco) tipocuentabancoLogic.getTipoCuentaBancos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocuentabanco =(TipoCuentaBanco) tipocuentabancos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipocuentabanco.getIsNew() && !tipocuentabanco.getIsChanged() && !tipocuentabanco.getIsDeleted()) {
				sDescripcion=tipocuentabanco.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipocuentabanco.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCuentaBanco tipocuentabancoRow=new TipoCuentaBanco();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocuentabancoRow=(TipoCuentaBanco) tipocuentabancoLogic.getTipoCuentaBancos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocuentabancoRow=(TipoCuentaBanco) tipocuentabancos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonReferenciaBancariaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCuentaBanco tipocuentabanco) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCuentaBanco==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabanco = (TipoCuentaBanco)this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocuentabanco = (TipoCuentaBanco)this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocuentabanco!=null) {
						this.tipocuentabanco = tipocuentabanco;
					} else {
						this.tipocuentabanco = new TipoCuentaBanco();
					}
				}

				if(this.isTienePermisosReferenciaBancaria && this.permiteMantenimiento(this.tipocuentabanco)) {
					ReferenciaBancariaBeanSwingJInternalFrame referenciabancariaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFramePopup=new ReferenciaBancariaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						referenciabancariaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFramePopup;
					} else {
						referenciabancariaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame;
					}

					List<TipoCuentaBanco> tipocuentabancos=new ArrayList<TipoCuentaBanco>();
					tipocuentabancos.add(this.tipocuentabanco);
					if(!esRelacionado) {
						//referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setConGuardarRelaciones(false);
						//referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					referenciabancariaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCuentaBanco.cargarReferenciaBancariaBeanSwingJInternalFrame(tipocuentabancos,this.tipocuentabanco,referenciabancariaBeanSwingJInternalFrame,/*conInicializar,*/referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.getConGuardarRelaciones(),referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.getEsGuardarRelacionado());
					referenciabancariaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						referenciabancariaBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaBancaria("no_relacionado");

						referenciabancariaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ReferenciaBancariaConstantesFunciones.ITAMANIOFILATABLA + (ReferenciaBancariaConstantesFunciones.ITAMANIOFILATABLA/2));

						referenciabancariaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCuentaBanco=(TitledBorder)this.jScrollPanelDatosTipoCuentaBanco.getBorder();
						TitledBorder titledBorderReferenciaBancaria=(TitledBorder)referenciabancariaBeanSwingJInternalFrame.jScrollPanelDatosReferenciaBancaria.getBorder();

						titledBorderReferenciaBancaria.setTitle(titledBorderTipoCuentaBanco.getTitle() + " -> Referencia Bancaria");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,referenciabancariaBeanSwingJInternalFrame);
						}

						referenciabancariaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(referenciabancariaBeanSwingJInternalFrame);

						referenciabancariaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocuentabancoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Referencia Bancaria",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonTipoCuentaBancoGeneralActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCuentaBanco tipocuentabanco) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCuentaBanco==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabanco = (TipoCuentaBanco)this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocuentabanco = (TipoCuentaBanco)this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocuentabanco!=null) {
						this.tipocuentabanco = tipocuentabanco;
					} else {
						this.tipocuentabanco = new TipoCuentaBanco();
					}
				}

				if(this.isTienePermisosTipoCuentaBancoGeneral && this.permiteMantenimiento(this.tipocuentabanco)) {
					TipoCuentaBancoGeneralBeanSwingJInternalFrame tipocuentabancogeneralBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFramePopup=new TipoCuentaBancoGeneralBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						tipocuentabancogeneralBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFramePopup;
					} else {
						tipocuentabancogeneralBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame;
					}

					List<TipoCuentaBanco> tipocuentabancos=new ArrayList<TipoCuentaBanco>();
					tipocuentabancos.add(this.tipocuentabanco);
					if(!esRelacionado) {
						//tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.setConGuardarRelaciones(false);
						//tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					tipocuentabancogeneralBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCuentaBanco.cargarTipoCuentaBancoGeneralBeanSwingJInternalFrame(tipocuentabancos,this.tipocuentabanco,tipocuentabancogeneralBeanSwingJInternalFrame,/*conInicializar,*/tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.getConGuardarRelaciones(),tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());
					tipocuentabancogeneralBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						tipocuentabancogeneralBeanSwingJInternalFrame.actualizarEstadoPanelsTipoCuentaBancoGeneral("no_relacionado");

						tipocuentabancogeneralBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TipoCuentaBancoGeneralConstantesFunciones.ITAMANIOFILATABLA + (TipoCuentaBancoGeneralConstantesFunciones.ITAMANIOFILATABLA/2));

						tipocuentabancogeneralBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCuentaBanco=(TitledBorder)this.jScrollPanelDatosTipoCuentaBanco.getBorder();
						TitledBorder titledBorderTipoCuentaBancoGeneral=(TitledBorder)tipocuentabancogeneralBeanSwingJInternalFrame.jScrollPanelDatosTipoCuentaBancoGeneral.getBorder();

						titledBorderTipoCuentaBancoGeneral.setTitle(titledBorderTipoCuentaBanco.getTitle() + " -> Tipo Cuenta Banco General");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,tipocuentabancogeneralBeanSwingJInternalFrame);
						}

						tipocuentabancogeneralBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(tipocuentabancogeneralBeanSwingJInternalFrame);

						tipocuentabancogeneralBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocuentabancoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Tipo Cuenta Banco General",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCuentaBanco(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBanco && this.isPermisoNuevoTipoCuentaBanco));			
			this.jButtonDuplicarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaDuplicarTipoCuentaBanco && this.isPermisoDuplicarTipoCuentaBanco));			
			this.jButtonCopiarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaCopiarTipoCuentaBanco && this.isPermisoCopiarTipoCuentaBanco));
			this.jButtonVerFormTipoCuentaBanco.setVisible((this.isVisibilidadCeldaVerFormTipoCuentaBanco && this.isPermisoVerFormTipoCuentaBanco));
			
			this.jButtonAbrirOrderByTipoCuentaBanco.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBanco && this.isPermisoOrdenTipoCuentaBanco));			
			
			this.jButtonNuevoRelacionesTipoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco && this.isPermisoNuevoTipoCuentaBanco));			
			this.jButtonNuevoGuardarCambiosTipoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBanco && this.isPermisoNuevoTipoCuentaBanco && this.isPermisoGuardarCambiosTipoCuentaBanco));
			
			if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonModificarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaModificarTipoCuentaBanco && this.isPermisoActualizarTipoCuentaBanco));	
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonActualizarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaActualizarTipoCuentaBanco && this.isPermisoActualizarTipoCuentaBanco));	
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonEliminarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaEliminarTipoCuentaBanco && this.isPermisoEliminarTipoCuentaBanco));
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonCancelarTipoCuentaBanco.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaBanco);							
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonGuardarCambiosTipoCuentaBanco.setVisible((this.isVisibilidadCeldaGuardarTipoCuentaBanco && this.isPermisoGuardarCambiosTipoCuentaBanco));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCuentaBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco && this.isPermisoGuardarCambiosTipoCuentaBanco));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBanco && this.isPermisoNuevoTipoCuentaBanco));						
			this.jButtonDuplicarToolBarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaDuplicarTipoCuentaBanco && this.isPermisoDuplicarTipoCuentaBanco));						
			this.jButtonCopiarToolBarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaCopiarTipoCuentaBanco && this.isPermisoCopiarTipoCuentaBanco));			
			this.jButtonVerFormToolBarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaVerFormTipoCuentaBanco && this.isPermisoVerFormTipoCuentaBanco));			
			this.jButtonAbrirOrderByToolBarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBanco && this.isPermisoOrdenTipoCuentaBanco));
			this.jButtonNuevoRelacionesToolBarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco && this.isPermisoNuevoTipoCuentaBanco));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBanco && this.isPermisoNuevoTipoCuentaBanco && this.isPermisoGuardarCambiosTipoCuentaBanco));			
			
			if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonModificarToolBarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaModificarTipoCuentaBanco && this.isPermisoActualizarTipoCuentaBanco));	
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonActualizarToolBarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaActualizarTipoCuentaBanco  && this.isPermisoActualizarTipoCuentaBanco));	
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonEliminarToolBarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaEliminarTipoCuentaBanco && this.isPermisoEliminarTipoCuentaBanco));
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonCancelarToolBarTipoCuentaBanco.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaBanco);				
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonGuardarCambiosToolBarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaGuardarTipoCuentaBanco && this.isPermisoGuardarCambiosTipoCuentaBanco));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco && this.isPermisoGuardarCambiosTipoCuentaBanco));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBanco && this.isPermisoNuevoTipoCuentaBanco));			
			this.jMenuItemDuplicarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaDuplicarTipoCuentaBanco && this.isPermisoDuplicarTipoCuentaBanco));			
			this.jMenuItemCopiarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaCopiarTipoCuentaBanco && this.isPermisoCopiarTipoCuentaBanco));			
			this.jMenuItemVerFormTipoCuentaBanco.setVisible((this.isVisibilidadCeldaVerFormTipoCuentaBanco && this.isPermisoVerFormTipoCuentaBanco));			
			this.jMenuItemAbrirOrderByTipoCuentaBanco.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBanco && this.isPermisoOrdenTipoCuentaBanco));			
			//this.jMenuItemMostrarOcultarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBanco && this.isPermisoOrdenTipoCuentaBanco));
			this.jMenuItemDetalleAbrirOrderByTipoCuentaBanco.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBanco && this.isPermisoOrdenTipoCuentaBanco));			
			//this.jMenuItemDetalleMostrarOcultarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBanco && this.isPermisoOrdenTipoCuentaBanco));			
			this.jMenuItemNuevoRelacionesTipoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco && this.isPermisoNuevoTipoCuentaBanco));			
			this.jMenuItemNuevoGuardarCambiosTipoCuentaBanco.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBanco && this.isPermisoNuevoTipoCuentaBanco && this.isPermisoGuardarCambiosTipoCuentaBanco));									
			
			if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemModificarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaModificarTipoCuentaBanco && this.isPermisoActualizarTipoCuentaBanco));	
			this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemActualizarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaActualizarTipoCuentaBanco && this.isPermisoActualizarTipoCuentaBanco));	
			this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemEliminarTipoCuentaBanco.setVisible((this.isVisibilidadCeldaEliminarTipoCuentaBanco && this.isPermisoEliminarTipoCuentaBanco));
			this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemCancelarTipoCuentaBanco.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaBanco);				
			}
			
			this.jMenuItemGuardarCambiosTipoCuentaBanco.setVisible((this.isVisibilidadCeldaGuardarTipoCuentaBanco && this.isPermisoGuardarCambiosTipoCuentaBanco));						
			this.jMenuItemGuardarCambiosTablaTipoCuentaBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco && this.isPermisoGuardarCambiosTipoCuentaBanco));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCuentaBanco=this.jButtonNuevoTipoCuentaBanco.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCuentaBanco=this.jButtonDuplicarTipoCuentaBanco.isVisible();
			this.isVisibilidadCeldaCopiarTipoCuentaBanco=this.jButtonCopiarTipoCuentaBanco.isVisible();
			this.isVisibilidadCeldaVerFormTipoCuentaBanco=this.jButtonVerFormTipoCuentaBanco.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCuentaBanco=this.jButtonAbrirOrderByTipoCuentaBanco.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco=this.jButtonNuevoRelacionesTipoCuentaBanco.isVisible();
			this.isVisibilidadCeldaModificarTipoCuentaBanco=this.jButtonModificarTipoCuentaBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
			this.isVisibilidadCeldaActualizarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonActualizarTipoCuentaBanco.isVisible();
			this.isVisibilidadCeldaEliminarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonEliminarTipoCuentaBanco.isVisible();
			this.isVisibilidadCeldaCancelarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonCancelarTipoCuentaBanco.isVisible();
			this.isVisibilidadCeldaGuardarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonGuardarCambiosTipoCuentaBanco.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco=this.jButtonGuardarCambiosTablaTipoCuentaBanco.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCuentaBanco=this.jButtonNuevoToolBarTipoCuentaBanco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco=this.jButtonNuevoRelacionesToolBarTipoCuentaBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
			this.isVisibilidadCeldaModificarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonModificarToolBarTipoCuentaBanco.isVisible();
			this.isVisibilidadCeldaActualizarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonActualizarToolBarTipoCuentaBanco.isVisible();
			this.isVisibilidadCeldaEliminarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonEliminarToolBarTipoCuentaBanco.isVisible();
			this.isVisibilidadCeldaCancelarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonCancelarToolBarTipoCuentaBanco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCuentaBanco=this.jButtonGuardarCambiosToolBarTipoCuentaBanco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco=this.jButtonGuardarCambiosTablaToolBarTipoCuentaBanco.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCuentaBanco=this.jMenuItemNuevoTipoCuentaBanco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco=this.jMenuItemNuevoRelacionesTipoCuentaBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
			this.isVisibilidadCeldaModificarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemModificarTipoCuentaBanco.isVisible();
			this.isVisibilidadCeldaActualizarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemActualizarTipoCuentaBanco.isVisible();
			this.isVisibilidadCeldaEliminarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemEliminarTipoCuentaBanco.isVisible();
			this.isVisibilidadCeldaCancelarTipoCuentaBanco=this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemCancelarTipoCuentaBanco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCuentaBanco=this.jMenuItemGuardarCambiosTipoCuentaBanco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco=this.jMenuItemGuardarCambiosTablaTipoCuentaBanco.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCuentaBanco(Boolean esInicializar) {
		if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocuentabancoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCuentaBanco();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCuentaBanco(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCuentaBanco() {
		this.jButtonNuevoTipoCuentaBanco.setVisible(this.isPermisoNuevoTipoCuentaBanco);			
		this.jButtonDuplicarTipoCuentaBanco.setVisible(this.isPermisoDuplicarTipoCuentaBanco);			
		this.jButtonCopiarTipoCuentaBanco.setVisible(this.isPermisoCopiarTipoCuentaBanco);			
		this.jButtonVerFormTipoCuentaBanco.setVisible(this.isPermisoVerFormTipoCuentaBanco);			
		
		this.jButtonAbrirOrderByTipoCuentaBanco.setVisible(this.isPermisoOrdenTipoCuentaBanco);					
		
		this.jButtonNuevoRelacionesTipoCuentaBanco.setVisible(this.isPermisoNuevoTipoCuentaBanco);			
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonModificarTipoCuentaBanco.setVisible(this.isPermisoActualizarTipoCuentaBanco);	
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonActualizarTipoCuentaBanco.setVisible(this.isPermisoActualizarTipoCuentaBanco);	
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonEliminarTipoCuentaBanco.setVisible(this.isPermisoEliminarTipoCuentaBanco);
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonCancelarTipoCuentaBanco.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaBanco);						
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonGuardarCambiosTipoCuentaBanco.setVisible(this.isPermisoGuardarCambiosTipoCuentaBanco);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCuentaBanco.setVisible(this.isPermisoActualizarTipoCuentaBanco);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCuentaBanco() {
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonModificarTipoCuentaBanco.setVisible(this.isPermisoActualizarTipoCuentaBanco);	
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonActualizarTipoCuentaBanco.setVisible(this.isPermisoActualizarTipoCuentaBanco);	
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonEliminarTipoCuentaBanco.setVisible(this.isPermisoEliminarTipoCuentaBanco);
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonCancelarTipoCuentaBanco.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaBanco);							
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonGuardarCambiosTipoCuentaBanco.setVisible((this.isVisibilidadCeldaGuardarTipoCuentaBanco && this.isPermisoGuardarCambiosTipoCuentaBanco));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCuentaBanco() {
		if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCuentaBanco();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCuentaBanco() {
	}
	
	public void jTableDatosTipoCuentaBancoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCuentaBanco(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCuentaBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuentaBanco(this.gettipocuentabanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuentabanco==null) {
						this.tipocuentabanco = new TipoCuentaBanco();
					}

					this.setVariablesFormularioToObjetoActualTipoCuentaBanco(this.tipocuentabanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);
				}

				if(this.tipocuentabanco.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocuentabanco.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuentaBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoCuentaBancoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoCuentaBanco(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoCuentaBanco.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoCuentaBanco.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoCuentaBanco(this.gettipocuentabanco(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipocuentabancoLogic.getConnexion());

				if(this.tipocuentabanco.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipocuentabanco.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoCuentaBanco=(TitledBorder)this.jScrollPanelDatosTipoCuentaBanco.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoCuentaBanco.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoCuentaBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuentaBanco(this.gettipocuentabanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuentabanco==null) {
						this.tipocuentabanco = new TipoCuentaBanco();
					}

					this.setVariablesFormularioToObjetoActualTipoCuentaBanco(this.tipocuentabanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);
				}

				if(this.tipocuentabanco.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipocuentabanco.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuentaBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoCuentaBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuentaBanco(this.gettipocuentabanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuentabanco==null) {
						this.tipocuentabanco = new TipoCuentaBanco();
					}

					this.setVariablesFormularioToObjetoActualTipoCuentaBanco(this.tipocuentabanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);
				}

				if(this.tipocuentabanco.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocuentabanco.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuentaBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCuentaBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuentaBanco(this.gettipocuentabanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuentabanco==null) {
						this.tipocuentabanco = new TipoCuentaBanco();
					}

					this.setVariablesFormularioToObjetoActualTipoCuentaBanco(this.tipocuentabanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);
				}

				if(this.tipocuentabanco.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocuentabanco.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuentaBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoCuentaBancoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCuentaBanco(false,false);

			this.getTipoCuentaBancosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoCuentaBanco(false);

			//if(TipoCuentaBancoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCuentaBanco(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoCuentaBanco() {
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
		

		if(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCuentaBanco.dispose();
			this.jInternalFrameDetalleFormTipoCuentaBanco=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCuentaBanco!=null) {
			this.jInternalFrameReporteDinamicoTipoCuentaBanco.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCuentaBanco.dispose();
			this.jInternalFrameReporteDinamicoTipoCuentaBanco=null;
		}
		
		if(this.jInternalFrameImportacionTipoCuentaBanco!=null) {
			this.jInternalFrameImportacionTipoCuentaBanco.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCuentaBanco.dispose();
			this.jInternalFrameImportacionTipoCuentaBanco=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCuentaBanco();
			
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCuentaBanco")) {
				jButtonNuevoTipoCuentaBancoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCuentaBanco")) {
				jButtonDuplicarTipoCuentaBancoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCuentaBanco")) {
				jButtonCopiarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCuentaBanco")) {
				jButtonVerFormTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCuentaBanco")) {
				jButtonNuevoTipoCuentaBancoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCuentaBanco")) {
				jButtonDuplicarTipoCuentaBancoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCuentaBanco")) {
				jButtonNuevoTipoCuentaBancoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCuentaBanco")) {
				jButtonDuplicarTipoCuentaBancoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCuentaBanco")) {
				jButtonNuevoTipoCuentaBancoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCuentaBanco")) {
				jButtonNuevoTipoCuentaBancoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCuentaBanco")) {
				jButtonNuevoTipoCuentaBancoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCuentaBanco")) {
				jButtonModificarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCuentaBanco")) {
				jButtonModificarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCuentaBanco")) {
				jButtonModificarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCuentaBanco")) {
				jButtonActualizarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCuentaBanco")) {
				jButtonActualizarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCuentaBanco")) {
				jButtonActualizarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCuentaBanco")) {
				jButtonEliminarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCuentaBanco")) {
				jButtonEliminarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCuentaBanco")) {
				jButtonEliminarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCuentaBanco")) {
				jButtonCancelarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCuentaBanco")) {
				jButtonCancelarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCuentaBanco")) {
				jButtonCancelarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCuentaBanco")) {
				jButtonCerrarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCuentaBanco")) {
				jButtonCerrarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCuentaBanco")) {
				jButtonCerrarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCuentaBanco")) {
				jButtonMostrarOcultarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCuentaBanco")) {
				jButtonCancelarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCuentaBanco")) {
				jButtonGuardarCambiosTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCuentaBanco")) {
				jButtonGuardarCambiosTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCuentaBanco")) {
				jButtonCopiarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCuentaBanco")) {
				jButtonVerFormTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCuentaBanco")) {
				jButtonGuardarCambiosTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCuentaBanco")) {
				jButtonCopiarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCuentaBanco")) {
				jButtonVerFormTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCuentaBanco")) {
				jButtonGuardarCambiosTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCuentaBanco")) {
				jButtonGuardarCambiosTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCuentaBanco")) {
				jButtonGuardarCambiosTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCuentaBanco")) {
				jButtonRecargarInformacionTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCuentaBanco")) {
				jButtonRecargarInformacionTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCuentaBanco")) {
				jButtonRecargarInformacionTipoCuentaBancoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCuentaBanco")) {
				jButtonAnterioresTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCuentaBanco")) {
				jButtonAnterioresTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCuentaBanco")) {
				jButtonAnterioresTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCuentaBanco")) {
				jButtonSiguientesTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCuentaBanco")) {
				jButtonSiguientesTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCuentaBanco")) {
				jButtonSiguientesTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCuentaBanco") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCuentaBanco")) {
				jButtonAbrirOrderByTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCuentaBanco") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCuentaBanco")) {
				jButtonMostrarOcultarTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCuentaBanco")) {
				jButtonNuevoGuardarCambiosTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCuentaBanco")) {
				jButtonNuevoGuardarCambiosTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCuentaBanco")) {
				jButtonNuevoGuardarCambiosTipoCuentaBancoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCuentaBanco")) {
				jButtonCerrarReporteDinamicoTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCuentaBanco")) {
				jButtonGenerarReporteDinamicoTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCuentaBanco")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCuentaBanco")) {
				jButtonCerrarImportacionTipoCuentaBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCuentaBanco")) {
				
				jButtonGenerarImportacionTipoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCuentaBanco")) {
				
				jButtonAbrirImportacionTipoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCuentaBanco")) {
				jComboBoxTiposAccionesTipoCuentaBancoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCuentaBanco")) {
				jComboBoxTiposRelacionesTipoCuentaBancoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCuentaBanco")) {
				jComboBoxTiposAccionesTipoCuentaBancoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCuentaBanco")) {
				
				jComboBoxTiposSeleccionarTipoCuentaBancoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCuentaBanco")) {
				jTextFieldValorCampoGeneralTipoCuentaBancoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCuentaBanco")) {
				jButtonAbrirOrderByTipoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCuentaBanco")) {
				jButtonAbrirOrderByTipoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCuentaBanco")) {
				jButtonCerrarOrderByTipoCuentaBancoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCuentaBancoBusqueda")) {
				this.jButtonidTipoCuentaBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoCuentaBancoUpdate")) {
				this.jButtonid_empresaTipoCuentaBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoCuentaBancoBusqueda")) {
				this.jButtonid_empresaTipoCuentaBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCuentaBancoBusqueda")) {
				this.jButtoncodigoTipoCuentaBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCuentaBancoBusqueda")) {
				this.jButtonnombreTipoCuentaBancoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCuentaBanco();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabanco);
				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
				
				


				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCuentaBanco tipocuentabancoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocuentabancoLocal=this.tipocuentabanco;
			} else {
				tipocuentabancoLocal=this.tipocuentabancoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabanco);
				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
							
				
				


				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoAnterior =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancoAnterior =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
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
			
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
			
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
			
			


			
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabanco);
				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
								
						
				


				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBanco.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabanco);
				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
								
				
				


				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoAnterior =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancoAnterior =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabanco);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoAnterior =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancoAnterior =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabanco);
				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
							
				
				


				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBanco.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancoAnterior =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocuentabancoAnterior =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
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
			
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
			
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
			
			


			
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabanco);
				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
								
				
				


				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoAnterior =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancoAnterior =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabanco);
				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCuentaBanco")) {
					jCheckBoxSeleccionarTodosTipoCuentaBancoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCuentaBanco")) {
					jCheckBoxSeleccionadosTipoCuentaBancoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCuentaBanco")) {
					
				}
				
				


				
				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabanco);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabanco);
				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
												
				
				


				
				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancoAnterior =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocuentabancoAnterior =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabanco);
				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
				
				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
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
			
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
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
			
			


			
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabanco);
				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBanco.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBanco.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabanco);
				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
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
				
				


				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBanco.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoAnterior =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancoAnterior =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCuentaBanco")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCuentaBancoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCuentaBanco.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocuentabanco =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocuentabanco);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCuentaBanco")) {
				
				}
				
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCuentaBanco")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCuentaBanco.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCuentaBanco")) {
			
			}
			
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCuentaBanco();
			
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCuentaBanco")) {
				jButtonNuevoTipoCuentaBancoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCuentaBanco")) {
				jButtonDuplicarTipoCuentaBancoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCuentaBanco")) {
				jButtonCopiarTipoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCuentaBanco")) {
				jButtonVerFormTipoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCuentaBanco")) {
				jButtonNuevoTipoCuentaBancoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCuentaBanco")) {
				jButtonModificarTipoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCuentaBanco")) {
				jButtonActualizarTipoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCuentaBanco")) {
				jButtonEliminarTipoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCuentaBanco")) {
				jButtonGuardarCambiosTipoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCuentaBanco")) {
				jButtonCancelarTipoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCuentaBanco")) {
				jButtonCerrarTipoCuentaBancoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCuentaBanco")) {
				jButtonGuardarCambiosTipoCuentaBancoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCuentaBanco")) {
				jButtonNuevoGuardarCambiosTipoCuentaBancoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCuentaBanco")) {
				jButtonAbrirOrderByTipoCuentaBancoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCuentaBanco")) {
				jButtonRecargarInformacionTipoCuentaBancoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCuentaBanco")) {
				jButtonAnterioresTipoCuentaBancoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCuentaBanco")) {
				jButtonSiguientesTipoCuentaBancoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCuentaBancoBusqueda")) {
				this.jButtonidTipoCuentaBancoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoCuentaBancoUpdate")) {
				this.jButtonid_empresaTipoCuentaBancoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoCuentaBancoBusqueda")) {
				this.jButtonid_empresaTipoCuentaBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCuentaBancoBusqueda")) {
				this.jButtoncodigoTipoCuentaBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCuentaBancoBusqueda")) {
				this.jButtonnombreTipoCuentaBancoBusquedaActionPerformed(evt);
			}
			
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCuentaBanco();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCuentaBanco")) {
				closingInternalFrameTipoCuentaBanco();
				
			} else if(sTipo.equals("jButtonCancelarTipoCuentaBanco")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCuentaBanco = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCuentaBancoBeanSwingJInternalFrame jInternalFrameParent=(TipoCuentaBancoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCuentaBanco.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCuentaBancoActionPerformed(null);
			}
			
			TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocuentabanco,new Object(),this.tipocuentabancoParameterGeneral,this.tipocuentabancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCuentaBanco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCuentaBanco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCuentaBanco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocuentabanco)) {
			if(!esControlTabla) {
				if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCuentaBanco(this.tipocuentabanco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);			
				}
				
				if(this.tipocuentabancoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCuentaBanco(this.tipocuentabanco,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocuentabancoReturnGeneral=tipocuentabancoLogic.procesarEventosTipoCuentaBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuentabancoLogic.getTipoCuentaBancos(),this.tipocuentabanco,this.tipocuentabancoParameterGeneral,this.isEsNuevoTipoCuentaBanco,classes);//this.tipocuentabancoLogic.getTipoCuentaBanco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCuentaBanco(this.tipocuentabancoReturnGeneral,this.tipocuentabancoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocuentabancoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCuentaBanco(classes,this.tipocuentabancoReturnGeneral,this.tipocuentabancoBean,false);
					}
						
					if(this.tipocuentabancoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCuentaBanco(this.tipocuentabancoReturnGeneral.getTipoCuentaBanco());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCuentaBanco(this.tipocuentabancoReturnGeneral.getTipoCuentaBanco());	
					}
						
					if(this.tipocuentabancoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCuentaBanco(this.tipocuentabancoReturnGeneral.getTipoCuentaBanco(),classes);//this.tipocuentabancoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCuentaBanco(this.tipocuentabanco,classes);//this.tipocuentabancoBean);									
				}
			
				if(TipoCuentaBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCuentaBanco(this.tipocuentabanco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBanco(this.tipocuentabanco);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocuentabancoAnterior!=null) {
						this.tipocuentabanco=this.tipocuentabancoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocuentabancoReturnGeneral=tipocuentabancoLogic.procesarEventosTipoCuentaBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuentabancoLogic.getTipoCuentaBancos(),this.tipocuentabanco,this.tipocuentabancoParameterGeneral,this.isEsNuevoTipoCuentaBanco,classes);//this.tipocuentabancoLogic.getTipoCuentaBanco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocuentabancoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocuentabancoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocuentabancoReturnGeneral.getTipoCuentaBanco(),tipocuentabancoLogic.getTipoCuentaBancos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocuentabancoReturnGeneral.getTipoCuentaBanco(),this.tipocuentabancos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCuentaBanco.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCuentaBanco.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCuentaBanco();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCuentaBanco() throws Exception {
		
		TipoCuentaBancoModel tipocuentabancoModel=(TipoCuentaBancoModel)this.jTableDatosTipoCuentaBanco.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocuentabancoModel.tipocuentabancos=this.tipocuentabancoLogic.getTipoCuentaBancos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocuentabancoModel.tipocuentabancos=this.tipocuentabancos;
		}
		
		
		((TipoCuentaBancoModel) this.jTableDatosTipoCuentaBanco.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCuentaBanco() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocuentabancoAnterior(),this.tipocuentabancoLogic.getTipoCuentaBancos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocuentabancoAnterior(),this.tipocuentabancos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCuentaBanco();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCuentaBanco(TipoCuentaBanco tipocuentabanco,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaBancaria.class)) {
					this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.setReferenciaBancarias(tipocuentabanco.getReferenciaBancarias());
					this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaBancaria(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TipoCuentaBancoGeneral.class)) {
					this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(tipocuentabanco.getTipoCuentaBancoGenerals());
					this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
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
										
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuentabanco,new Object(),generalEntityParameterGeneral,this.tipocuentabancoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocuentabancoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCuentaBancoConstantesFunciones.getClassesRelationshipsOfTipoCuentaBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCuentaBancoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCuentaBanco(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCuentaBanco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCuentaBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuentabanco,new Object(),generalEntityParameterGeneral,this.tipocuentabancoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCuentaBanco(TipoCuentaBancoBean tipocuentabancoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaBancaria.class)) {
					this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.setReferenciaBancarias(tipocuentabanco.getReferenciaBancarias());
					this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaBancaria(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TipoCuentaBancoGeneral.class)) {
					this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(tipocuentabanco.getTipoCuentaBancoGenerals());
					this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCuentaBanco(ArrayList<Classe> classes,TipoCuentaBancoReturnGeneral tipocuentabancoReturnGeneral,TipoCuentaBancoBean tipocuentabancoBean,Boolean conDefault) throws Exception {
		
			this.tipocuentabancoBean.setReferenciaBancarias(tipocuentabancoReturnGeneral.getTipoCuentaBanco().getReferenciaBancarias());
			this.tipocuentabancoBean.setTipoCuentaBancoGenerals(tipocuentabancoReturnGeneral.getTipoCuentaBanco().getTipoCuentaBancoGenerals());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCuentaBanco(TipoCuentaBanco tipocuentabanco,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaBancaria.class)) {
					tipocuentabanco.setReferenciaBancarias(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TipoCuentaBancoGeneral.class)) {
					tipocuentabanco.setTipoCuentaBancoGenerals(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralBeanSwingJInternalFrame.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipocuentabanco)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCuentaBanco = new TipoCuentaBancoDetalleFormJInternalFrame(jDesktopPane,this.tipocuentabancoSessionBean.getConGuardarRelaciones(),this.tipocuentabancoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCuentaBanco);
		this.jInternalFrameDetalleFormTipoCuentaBanco.setVisible(false);
		this.jInternalFrameDetalleFormTipoCuentaBanco.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCuentaBanco.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancoLogic=this.tipocuentabancoLogic;
		
		this.cargarCombosFrameForeignKeyTipoCuentaBanco("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCuentaBanco();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCuentaBanco();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCuentaBanco("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCuentaBanco();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCuentaBanco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCuentaBanco"));
		
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonModificarTipoCuentaBanco.addActionListener(new ButtonActionListener(this,"ModificarTipoCuentaBanco"));

		
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonModificarToolBarTipoCuentaBanco.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCuentaBanco"));
					
		this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemModificarTipoCuentaBanco.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCuentaBanco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonActualizarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"ActualizarTipoCuentaBanco"));
		
		
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonActualizarToolBarTipoCuentaBanco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCuentaBanco"));
						
		this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemActualizarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCuentaBanco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonEliminarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"EliminarTipoCuentaBanco"));
		
		
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonEliminarToolBarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCuentaBanco"));
								
		this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemEliminarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCuentaBanco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonCancelarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"CancelarTipoCuentaBanco"));
		
		
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonCancelarToolBarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCuentaBanco"));
					
		this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemCancelarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCuentaBanco"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemDetalleCerrarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCuentaBanco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonGuardarCambiosToolBarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCuentaBanco"));
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonGuardarCambiosToolBarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCuentaBanco"));
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxTiposAccionesFormularioTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCuentaBanco"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonidTipoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCuentaBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonid_empresaTipoCuentaBancoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuentaBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonid_empresaTipoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuentaBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtoncodigoTipoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCuentaBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonnombreTipoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCuentaBancoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCuentaBanco.jTabbedPaneRelacionesTipoCuentaBanco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCuentaBanco"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCuentaBanco"));
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCuentaBanco"));
		}
		
		this.jTableDatosTipoCuentaBanco.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCuentaBanco"));
		
		this.jTableDatosTipoCuentaBanco.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCuentaBanco"));
		
		this.jButtonNuevoTipoCuentaBanco.addActionListener(new ButtonActionListener(this,"NuevoTipoCuentaBanco"));
		
		this.jButtonDuplicarTipoCuentaBanco.addActionListener(new ButtonActionListener(this,"DuplicarTipoCuentaBanco"));
		
		this.jButtonCopiarTipoCuentaBanco.addActionListener(new ButtonActionListener(this,"CopiarTipoCuentaBanco"));
		
		this.jButtonVerFormTipoCuentaBanco.addActionListener(new ButtonActionListener(this,"VerFormTipoCuentaBanco"));
		
		
		this.jButtonNuevoToolBarTipoCuentaBanco.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCuentaBanco"));
			
		this.jButtonDuplicarToolBarTipoCuentaBanco.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCuentaBanco"));
			
		this.jMenuItemNuevoTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCuentaBanco"));
			
		this.jMenuItemDuplicarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCuentaBanco"));		
		
		
		this.jButtonNuevoRelacionesTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCuentaBanco"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCuentaBanco.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCuentaBanco"));
			
		this.jMenuItemNuevoRelacionesTipoCuentaBanco.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCuentaBanco"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonModificarTipoCuentaBanco.addActionListener(new ButtonActionListener(this,"ModificarTipoCuentaBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonModificarToolBarTipoCuentaBanco.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCuentaBanco"));
			
			this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemModificarTipoCuentaBanco.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCuentaBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonActualizarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"ActualizarTipoCuentaBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonActualizarToolBarTipoCuentaBanco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCuentaBanco"));
				
			this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemActualizarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCuentaBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonEliminarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"EliminarTipoCuentaBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonEliminarToolBarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCuentaBanco"));
						
			this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemEliminarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCuentaBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonCancelarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"CancelarTipoCuentaBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonCancelarToolBarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCuentaBanco"));
			
			this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemCancelarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCuentaBanco"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCuentaBanco"));		
		
		
		this.jButtonCerrarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"CerrarTipoCuentaBanco"));
		
		
		this.jButtonCerrarToolBarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCuentaBanco"));
			
		this.jMenuItemCerrarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCuentaBanco"));
			
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jMenuItemDetalleCerrarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCuentaBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonGuardarCambiosTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCuentaBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonGuardarCambiosToolBarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCuentaBanco"));
		}
		
		this.jButtonCopiarToolBarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCuentaBanco"));
			
		this.jButtonVerFormToolBarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCuentaBanco"));
		
		this.jMenuItemGuardarCambiosTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCuentaBanco"));
			
		this.jMenuItemCopiarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCuentaBanco"));		
		
		this.jMenuItemVerFormTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCuentaBanco"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCuentaBanco"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCuentaBanco"));
			
		this.jMenuItemGuardarCambiosTablaTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCuentaBanco"));		
		
		
		
		this.jButtonRecargarInformacionTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCuentaBanco"));
					
		this.jButtonRecargarInformacionToolBarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCuentaBanco"));
		
		this.jMenuItemRecargarInformacionTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCuentaBanco"));		
		
		
		
		this.jButtonAnterioresTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"AnterioresTipoCuentaBanco"));
		
		
		this.jButtonAnterioresToolBarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCuentaBanco"));
		
		this.jMenuItemAnterioresTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCuentaBanco"));		
		
		
		this.jButtonSiguientesTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"SiguientesTipoCuentaBanco"));
		
		
		this.jButtonSiguientesToolBarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCuentaBanco"));
			
		this.jMenuItemSiguientesTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCuentaBanco"));
			
		this.jMenuItemAbrirOrderByTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCuentaBanco"));
			
		this.jMenuItemMostrarOcultarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCuentaBanco"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCuentaBanco"));
			
		this.jMenuItemDetalleMostarOcultarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCuentaBanco"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCuentaBanco"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCuentaBanco"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCuentaBanco"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCuentaBanco.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCuentaBanco"));

		this.jCheckBoxSeleccionadosTipoCuentaBanco.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCuentaBanco"));
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxTiposAccionesFormularioTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCuentaBanco"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCuentaBanco"));
			
		this.jComboBoxTiposAccionesTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCuentaBanco"));
					
		this.jComboBoxTiposSeleccionarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCuentaBanco"));
			
		this.jTextFieldValorCampoGeneralTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCuentaBanco"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonidTipoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCuentaBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonid_empresaTipoCuentaBancoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuentaBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonid_empresaTipoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuentaBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtoncodigoTipoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCuentaBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonnombreTipoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCuentaBancoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCuentaBanco!=null) {
				this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCuentaBanco"));
				this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCuentaBanco"));
				this.jInternalFrameReporteDinamicoTipoCuentaBanco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCuentaBanco"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCuentaBanco"));				
			//this.jButtonGenerarReporteDinamicoTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCuentaBanco"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCuentaBanco"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCuentaBanco!=null) {
				this.jInternalFrameImportacionTipoCuentaBanco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCuentaBanco"));
				this.jInternalFrameImportacionTipoCuentaBanco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCuentaBanco"));
				this.jInternalFrameImportacionTipoCuentaBanco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCuentaBanco"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCuentaBanco"));
			
			this.jButtonAbrirOrderByToolBarTipoCuentaBanco.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCuentaBanco"));			
			
			if(this.jInternalFrameOrderByTipoCuentaBanco!=null) {
				this.jInternalFrameOrderByTipoCuentaBanco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCuentaBanco"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBanco.jTabbedPaneRelacionesTipoCuentaBanco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCuentaBanco"));
		
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
            		closingInternalFrameTipoCuentaBanco();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCuentaBanco.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCuentaBanco = (JInternalFrameBase)event.getSource();
	            	
	            TipoCuentaBancoBeanSwingJInternalFrame jInternalFrameParent=(TipoCuentaBancoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCuentaBanco.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCuentaBancoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCuentaBanco.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCuentaBancoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCuentaBanco.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCuentaBanco.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCuentaBanco";
		inputMap = this.jButtonNuevoTipoCuentaBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCuentaBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCuentaBancoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCuentaBanco";
		inputMap = this.jButtonNuevoRelacionesTipoCuentaBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCuentaBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCuentaBancoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCuentaBanco";
		inputMap = this.jButtonModificarTipoCuentaBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCuentaBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCuentaBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCuentaBanco";
		inputMap = this.jButtonActualizarTipoCuentaBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCuentaBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCuentaBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCuentaBanco";
		inputMap = this.jButtonEliminarTipoCuentaBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCuentaBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCuentaBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCuentaBanco";
		inputMap = this.jButtonCancelarTipoCuentaBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCuentaBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCuentaBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCuentaBanco";
		inputMap = this.jButtonCerrarTipoCuentaBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCuentaBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCuentaBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonGuardarCambiosTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCuentaBanco";
		inputMap = this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonGuardarCambiosTipoCuentaBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonGuardarCambiosTipoCuentaBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCuentaBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCuentaBanco.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCuentaBancoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCuentaBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCuentaBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCuentaBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCuentaBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCuentaBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCuentaBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonidTipoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCuentaBancoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonid_empresaTipoCuentaBancoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuentaBancoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonid_empresaTipoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuentaBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtoncodigoTipoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCuentaBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBanco.jButtonnombreTipoCuentaBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCuentaBancoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCuentaBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCuentaBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCuentaBancoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCuentaBanco.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCuentaBanco(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCuentaBanco tipocuentabancoAux:this.tipocuentabancoLogic.getTipoCuentaBancos()) {
					tipocuentabancoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancos) {
					tipocuentabancoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCuentaBancoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCuentaBanco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCuentaBanco tipocuentabancoAux:this.tipocuentabancoLogic.getTipoCuentaBancos()) {
						tipocuentabancoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancos) {
						tipocuentabancoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCuentaBanco tipocuentabancoAux:this.tipocuentabancoLogic.getTipoCuentaBancos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCuentaBanco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCuentaBanco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCuentaBanco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBanco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCuentaBancoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCuentaBanco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCuentaBanco.getSelectedRows();
			
			TipoCuentaBanco tipocuentabancoLocal=new TipoCuentaBanco();
			
			//this.seleccionarTodosTipoCuentaBanco(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentabancoLocal =(TipoCuentaBanco) this.tipocuentabancoLogic.getTipoCuentaBancos().toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocuentabancoLocal =(TipoCuentaBanco) this.tipocuentabancos.toArray()[this.jTableDatosTipoCuentaBanco.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocuentabancoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCuentaBanco tipocuentabancoAux:this.tipocuentabancoLogic.getTipoCuentaBancos()) {
						tipocuentabancoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancos) {
						tipocuentabancoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCuentaBanco(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCuentaBanco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCuentaBanco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBanco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCuentaBancoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCuentaBancoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCuentaBancoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCuentaBanco(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCuentaBanco.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCuentaBanco tipocuentabancoAux:this.tipocuentabancoLogic.getTipoCuentaBancos()) {
				
						if(sTipoSeleccionar.equals(TipoCuentaBancoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocuentabancoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocuentabancoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancos) {
					
						if(sTipoSeleccionar.equals(TipoCuentaBancoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocuentabancoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocuentabancoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCuentaBanco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCuentaBancoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCuentaBanco(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCuentaBanco=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCuentaBanco.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxTiposAccionesFormularioTipoCuentaBanco.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCuentaBanco) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCuentaBanco(conSplash);
				
					this.generarReporteTipoCuentaBancosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuentaBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxTiposAccionesFormularioTipoCuentaBanco.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCuentaBancosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCuentaBanco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCuentaBancosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCuentaBanco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCuentaBancosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCuentaBanco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCuentaBanco();
				
				this.exportarTipoCuentaBancosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuentaBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxTiposAccionesFormularioTipoCuentaBanco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCuentaBancos();
				//this.importarTipoCuentaBancos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuentaBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxTiposAccionesFormularioTipoCuentaBanco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCuentaBanco();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCuentaBancosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCuentaBanco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Cuenta Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCuentaBanco();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCuentaBanco)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCuentaBanco(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuentaBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxTiposAccionesFormularioTipoCuentaBanco.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoCuentaBancoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoCuentaBanco) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoCuentaBanco(conSplash);
					
						//this.actualizarParametrosGeneralTipoCuentaBanco();
						
						this.generarReporteProcesoAccionTipoCuentaBancosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoCuentaBanco.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxTiposAccionesFormularioTipoCuentaBanco.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoCuentaBancoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Cuenta BancoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Cuenta Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoCuentaBanco();
				
						this.actualizarParametrosGeneralTipoCuentaBanco();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipocuentabancoReturnGeneral=tipocuentabancoLogic.procesarAccionTipoCuentaBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipocuentabancoLogic.getTipoCuentaBancos(),this.tipocuentabancoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoCuentaBancoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCuentaBanco.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxTiposAccionesFormularioTipoCuentaBanco.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCuentaBanco();
					
					TipoCuentaBancoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoCuentaBancoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCuentaBanco.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxTiposAccionesFormularioTipoCuentaBanco.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCuentaBanco(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCuentaBancoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCuentaBanco();
			
			if(this.jInternalFrameDetalleFormTipoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCuentaBanco> tipocuentabancosSeleccionados=new ArrayList<TipoCuentaBanco>();		
			TipoCuentaBanco tipocuentabanco=new TipoCuentaBanco();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCuentaBanco(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCuentaBanco.getSelectedItem();
			
			
			
			
			tipocuentabancosSeleccionados=this.getTipoCuentaBancosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocuentabancosSeleccionados.size()==1) {
				for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancosSeleccionados) {
					tipocuentabanco=tipocuentabancoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Referencia Bancaria")) {
					jButtonReferenciaBancariaActionPerformed(null,rowIndex,true,false,tipocuentabanco);
				}
				else if(this.sTipoRelacion.equals("Tipo Cuenta Banco General")) {
					jButtonTipoCuentaBancoGeneralActionPerformed(null,rowIndex,true,false,tipocuentabanco);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCuentaBanco();
			
      		//this.finishProcessTipoCuentaBanco(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCuentaBancoReturnGeneral() throws Exception {
		if(this.tipocuentabancoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocuentabancoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocuentabancoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocuentabancoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocuentabancoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocuentabancoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCuentaBanco(false);
		}
		
		if(this.tipocuentabancoReturnGeneral.getConRetornoLista() || this.tipocuentabancoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocuentabancoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocuentabancoLogic.setTipoCuentaBancos(this.tipocuentabancoReturnGeneral.getTipoCuentaBancos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocuentabancoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocuentabancoLogic.setTipoCuentaBanco(this.tipocuentabancoReturnGeneral.getTipoCuentaBanco());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCuentaBanco(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCuentaBanco() throws Exception {
		
		
	}
	
	public ArrayList<TipoCuentaBanco> getTipoCuentaBancosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCuentaBanco> tipocuentabancosSeleccionados=new ArrayList<TipoCuentaBanco>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCuentaBanco) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancoLogic.getTipoCuentaBancos()) {
					if(tipocuentabancoAux.getIsSelected()) {
						tipocuentabancosSeleccionados.add(tipocuentabancoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuentaBanco tipocuentabancoAux:this.tipocuentabancos) {
					if(tipocuentabancoAux.getIsSelected()) {
						tipocuentabancosSeleccionados.add(tipocuentabancoAux);				
					}
				}
			}
			
			if(tipocuentabancosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocuentabancosSeleccionados.addAll(this.tipocuentabancoLogic.getTipoCuentaBancos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocuentabancosSeleccionados.addAll(this.tipocuentabancos);				
					}
				}
			}
		} else {
			tipocuentabancosSeleccionados.add(this.tipocuentabanco);
		}
		
		return tipocuentabancosSeleccionados;
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
	
	public void generarReporteTipoCuentaBancosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCuentaBancosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCuentaBancosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCuentaBancosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCuentaBancosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoCuentaBancosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Cuenta Banco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCuentaBancosSeleccionados() throws Exception {
		ArrayList<TipoCuentaBanco> tipocuentabancosSeleccionados=new ArrayList<TipoCuentaBanco>();		
		
		tipocuentabancosSeleccionados=this.getTipoCuentaBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCuentaBancos("Todos",tipocuentabancosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCuentaBancosSeleccionados() throws Exception {
		ArrayList<TipoCuentaBanco> tipocuentabancosSeleccionados=new ArrayList<TipoCuentaBanco>();		
		
		tipocuentabancosSeleccionados=this.getTipoCuentaBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCuentaBancos("Todos",tipocuentabancosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCuentaBancosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCuentaBanco> tipocuentabancosSeleccionados=new ArrayList<TipoCuentaBanco>();
		
		tipocuentabancosSeleccionados=this.getTipoCuentaBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCuentaBancos("Todos",tipocuentabancosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCuentaBancosSeleccionados() throws Exception {
		ArrayList<TipoCuentaBanco> tipocuentabancosSeleccionados=new ArrayList<TipoCuentaBanco>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCuentaBanco();
		
		
		tipocuentabancosSeleccionados=this.getTipoCuentaBancosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCuentaBanco();
		
		
		//this.generarReporteTipoCuentaBancos("Todos",tipocuentabancosSeleccionados ,tipocuentabancoImplementable,tipocuentabancoImplementableHome);
	}
	
	public void mostrarImportacionTipoCuentaBancos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCuentaBanco();
		
		this.abrirFrameImportacionTipoCuentaBanco();		
		
			
		//this.generarReporteTipoCuentaBancos("Todos",tipocuentabancosSeleccionados ,tipocuentabancoImplementable,tipocuentabancoImplementableHome);
	}
	
	public void importarTipoCuentaBancos() throws Exception {		
	
	}
	
	public void exportarTipoCuentaBancosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCuentaBancosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCuentaBancosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCuentaBancosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Cuenta Banco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCuentaBancosSeleccionados() throws Exception {
		ArrayList<TipoCuentaBanco> tipocuentabancosSeleccionados=new ArrayList<TipoCuentaBanco>();		
		
		tipocuentabancosSeleccionados=this.getTipoCuentaBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabanco."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCuentaBanco(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCuentaBanco(tipocuentabancoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocuentabancoAux.setsDetalleGeneralEntityReporte(tipocuentabancoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCuentaBanco(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCuentaBancoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuentaBancoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuentaBancoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuentaBancoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCuentaBanco(TipoCuentaBanco tipocuentabanco,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocuentabanco.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuentabanco.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuentabanco.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuentabanco.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuentabanco.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCuentaBancosSeleccionados() throws Exception {
		ArrayList<TipoCuentaBanco> tipocuentabancosSeleccionados=new ArrayList<TipoCuentaBanco>();		
		
		tipocuentabancosSeleccionados=this.getTipoCuentaBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabanco.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCuentaBancos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCuentaBanco(row);				
				iRow++;
			}				
			
			for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCuentaBanco(tipocuentabancoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCuentaBancosSeleccionados() throws Exception {
		ArrayList<TipoCuentaBanco> tipocuentabancosSeleccionados=new ArrayList<TipoCuentaBanco>();		
		
		tipocuentabancosSeleccionados=this.getTipoCuentaBancosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabanco.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocuentabancos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocuentabanco");
			//elementRoot.appendChild(element);
		
			for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancosSeleccionados) {
				element = document.createElement("tipocuentabanco");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCuentaBanco(tipocuentabancoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCuentaBanco(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaBancoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaBancoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaBancoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaBancoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCuentaBanco(TipoCuentaBanco tipocuentabanco,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuentabanco.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuentabanco.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuentabanco.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuentabanco.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCuentaBanco(TipoCuentaBanco tipocuentabanco,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCuentaBancoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocuentabanco.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCuentaBancoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocuentabanco.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoCuentaBancoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipocuentabanco.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoCuentaBancoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocuentabanco.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoCuentaBancoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocuentabanco.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoCuentaBancosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCuentaBanco> tipocuentabancosSeleccionados=new ArrayList<TipoCuentaBanco>();
		
		tipocuentabancosSeleccionados=this.getTipoCuentaBancosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCuentaBanco(tipocuentabancosSeleccionados);
		
		this.generarReporteTipoCuentaBancos("Todos",tipocuentabancosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCuentaBanco(ArrayList<TipoCuentaBanco> tipocuentabancosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancosSeleccionados) {
				tipocuentabancoAux.setsDetalleGeneralEntityReporte(tipocuentabancoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCuentaBancoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipocuentabancoAux.setsDescripcionGeneralEntityReporte1(tipocuentabancoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoCuentaBancoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocuentabancoAux.setsDescripcionGeneralEntityReporte1(tipocuentabancoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoCuentaBancoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocuentabancoAux.setsDescripcionGeneralEntityReporte1(tipocuentabancoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCuentaBanco(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCuentaBanco=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCuentaBanco=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBanco=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBanco=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBanco=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCuentaBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco=false;
			this.isVisibilidadCeldaModificarTipoCuentaBanco=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBanco=true;
			this.isVisibilidadCeldaEliminarTipoCuentaBanco=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBanco=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCuentaBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco=false;
			this.isVisibilidadCeldaModificarTipoCuentaBanco=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBanco=true;
			this.isVisibilidadCeldaEliminarTipoCuentaBanco=true;
			this.isVisibilidadCeldaCancelarTipoCuentaBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBanco=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCuentaBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco=false;
			this.isVisibilidadCeldaModificarTipoCuentaBanco=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBanco=true;
			this.isVisibilidadCeldaEliminarTipoCuentaBanco=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBanco=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCuentaBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco=true;
			this.isVisibilidadCeldaModificarTipoCuentaBanco=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBanco=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBanco=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBanco=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCuentaBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBanco=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBanco=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBanco=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCuentaBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco=false;
			this.isVisibilidadCeldaModificarTipoCuentaBanco=true;
			this.isVisibilidadCeldaActualizarTipoCuentaBanco=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBanco=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBanco=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCuentaBancoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCuentaBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco=true;
		} else {
			this.actualizarEstadoPanelsTipoCuentaBanco(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCuentaBanco=false;
			//this.isVisibilidadCeldaVerFormTipoCuentaBanco=false;
			this.isVisibilidadCeldaDuplicarTipoCuentaBanco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocuentabancoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCuentaBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
			if(!tipocuentabancoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco=false;												
			}
			
			this.jButtonCerrarTipoCuentaBanco.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBanco=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocuentabanco)) {
			this.isVisibilidadCeldaActualizarTipoCuentaBanco=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBanco=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCuentaBanco() {
		this.isVisibilidadCeldaNuevoTipoCuentaBanco=false;
		this.isVisibilidadCeldaGuardarCambiosTipoCuentaBanco=false;
	}
	
	public void actualizarEstadoPanelsTipoCuentaBanco(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCuentaBanco!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBanco.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaBanco!=null) {
				this.jTabbedPaneBusquedasTipoCuentaBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBanco!=null) {
				this.jScrollPanelDatosTipoCuentaBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuentaBanco!=null) {
				this.jPanelPaginacionTipoCuentaBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBanco!=null) {
				this.jPanelParametrosReportesTipoCuentaBanco.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCuentaBanco!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBanco.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaBanco!=null) {
				this.jTabbedPaneBusquedasTipoCuentaBanco.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCuentaBanco!=null) {
				this.jScrollPanelDatosTipoCuentaBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCuentaBanco!=null) {
				this.jPanelPaginacionTipoCuentaBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBanco!=null) {
				this.jPanelParametrosReportesTipoCuentaBanco.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCuentaBanco!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBanco.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaBanco!=null) {
				this.jTabbedPaneBusquedasTipoCuentaBanco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBanco!=null) {
				this.jScrollPanelDatosTipoCuentaBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCuentaBanco!=null) {
				this.jPanelPaginacionTipoCuentaBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBanco!=null) {
				this.jPanelParametrosReportesTipoCuentaBanco.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCuentaBanco!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBanco.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaBanco!=null) {
				this.jTabbedPaneBusquedasTipoCuentaBanco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBanco!=null) {
				this.jScrollPanelDatosTipoCuentaBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCuentaBanco!=null) {
				this.jPanelPaginacionTipoCuentaBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBanco!=null) {
				this.jPanelParametrosReportesTipoCuentaBanco.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCuentaBanco!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBanco.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaBanco!=null) {
				this.jTabbedPaneBusquedasTipoCuentaBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBanco!=null) {
				this.jScrollPanelDatosTipoCuentaBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuentaBanco!=null) {
				this.jPanelPaginacionTipoCuentaBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBanco!=null) {
				this.jPanelParametrosReportesTipoCuentaBanco.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCuentaBanco!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBanco.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaBanco!=null) {
				this.jTabbedPaneBusquedasTipoCuentaBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBanco!=null) {
				this.jScrollPanelDatosTipoCuentaBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuentaBanco!=null) {
				this.jPanelPaginacionTipoCuentaBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBanco!=null) {
				this.jPanelParametrosReportesTipoCuentaBanco.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCuentaBanco!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBanco.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaBanco!=null) {
				this.jTabbedPaneBusquedasTipoCuentaBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBanco!=null) {
				this.jScrollPanelDatosTipoCuentaBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuentaBanco!=null) {
				this.jPanelPaginacionTipoCuentaBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBanco!=null) {
				this.jPanelParametrosReportesTipoCuentaBanco.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoCuentaBanco!=null) {
					this.jTabbedPaneBusquedasTipoCuentaBanco.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBanco!=null) {
				this.jPanelParametrosReportesTipoCuentaBanco.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocuentabancoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaBanco!=null) {
				this.jTabbedPaneBusquedasTipoCuentaBanco.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBanco!=null) {
				this.jPanelParametrosReportesTipoCuentaBanco.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoCuentaBancoParaReferenciaBancarias() throws Exception {
		Boolean isPaginaPopupReferenciaBancaria=false;

		try {

			if(this.tipocuentabancoSessionBean==null) {
				this.tipocuentabancoSessionBean=new TipoCuentaBancoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaSessionBean.setsPathNavegacionActual(tipocuentabancoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupReferenciaBancaria=this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeReferenciaBancaria(false);
			this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaBancaria(TipoCuentaBancoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuentaBanco(true);
			this.jInternalFrameDetalleFormTipoCuentaBanco.referenciabancariaSessionBean.setlidTipoCuentaBancoActual(this.idTipoCuentaBancoActual);

			tipocuentabancoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBanco(true);
			tipocuentabancoSessionBean.setlIdTipoCuentaBancoActualForeignKey(this.idTipoCuentaBancoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoCuentaBancoParaTipoCuentaBancoGenerales() throws Exception {
		Boolean isPaginaPopupTipoCuentaBancoGeneral=false;

		try {

			if(this.tipocuentabancoSessionBean==null) {
				this.tipocuentabancoSessionBean=new TipoCuentaBancoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralSessionBean.setsPathNavegacionActual(tipocuentabancoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral(true);
			this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoCuentaBancoGeneral(TipoCuentaBancoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuentaBanco(true);
			this.jInternalFrameDetalleFormTipoCuentaBanco.tipocuentabancogeneralSessionBean.setlidTipoCuentaBancoActual(this.idTipoCuentaBancoActual);

			tipocuentabancoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBanco(true);
			tipocuentabancoSessionBean.setlIdTipoCuentaBancoActualForeignKey(this.idTipoCuentaBancoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCuentaBancoSessionBean tipocuentabancoSessionBean=new TipoCuentaBancoSessionBean();
		
		if(this.tipocuentabancoSessionBean==null) {
			this.tipocuentabancoSessionBean=new TipoCuentaBancoSessionBean();
		}
		
		this.tipocuentabancoSessionBean.setsUltimaBusquedaTipoCuentaBanco(this.getsAccionBusqueda());
		this.tipocuentabancoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocuentabancoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipocuentabancoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCuentaBancoSessionBean tipocuentabancoSessionBean=new TipoCuentaBancoSessionBean();
		
		if(this.tipocuentabancoSessionBean==null) {
			this.tipocuentabancoSessionBean=new TipoCuentaBancoSessionBean();
		}
		
		if(this.tipocuentabancoSessionBean.getsUltimaBusquedaTipoCuentaBanco()!=null&&!this.tipocuentabancoSessionBean.getsUltimaBusquedaTipoCuentaBanco().equals("")) {
			this.setsAccionBusqueda(tipocuentabancoSessionBean.getsUltimaBusquedaTipoCuentaBanco());
			this.setiNumeroPaginacion(tipocuentabancoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocuentabancoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipocuentabancoSessionBean.getid_empresa());
				tipocuentabancoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipocuentabancoSessionBean.setsUltimaBusquedaTipoCuentaBanco("");
		this.tipocuentabancoSessionBean.setiNumeroPaginacion(TipoCuentaBancoConstantesFunciones.INUMEROPAGINACION);
		this.tipocuentabancoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCuentaBanco(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCuentaBanco() {
		this.updateBorderResaltarBusquedasFormularioTipoCuentaBanco();
		this.updateVisibilidadBusquedasFormularioTipoCuentaBanco();
		this.updateHabilitarBusquedasFormularioTipoCuentaBanco();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCuentaBanco() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoCuentaBanco.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCuentaBanco() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoCuentaBanco.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoCuentaBanco() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoCuentaBanco.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoCuentaBanco(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoCuentaBanco.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoCuentaBanco() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCuentaBanco();
		this.updateVisibilidadResaltarControlesFormularioTipoCuentaBanco();
		this.updateHabilitarResaltarControlesFormularioTipoCuentaBanco();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCuentaBanco() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocuentabancoConstantesFunciones.resaltaridTipoCuentaBanco!=null && this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelidTipoCuentaBanco.setBorder(this.tipocuentabancoConstantesFunciones.resaltaridTipoCuentaBanco);}
		if(this.tipocuentabancoConstantesFunciones.resaltarid_empresaTipoCuentaBanco!=null && this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxid_empresaTipoCuentaBanco.setBorder(this.tipocuentabancoConstantesFunciones.resaltarid_empresaTipoCuentaBanco);}
		if(this.tipocuentabancoConstantesFunciones.resaltarcodigoTipoCuentaBanco!=null && this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {this.jInternalFrameDetalleFormTipoCuentaBanco.jTextFieldcodigoTipoCuentaBanco.setBorder(this.tipocuentabancoConstantesFunciones.resaltarcodigoTipoCuentaBanco);}
		if(this.tipocuentabancoConstantesFunciones.resaltarnombreTipoCuentaBanco!=null && this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {this.jInternalFrameDetalleFormTipoCuentaBanco.jTextAreanombreTipoCuentaBanco.setBorder(this.tipocuentabancoConstantesFunciones.resaltarnombreTipoCuentaBanco);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCuentaBanco() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
	
		//this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelidTipoCuentaBanco.setVisible(this.tipocuentabancoConstantesFunciones.mostraridTipoCuentaBanco);
		this.jInternalFrameDetalleFormTipoCuentaBanco.jPanelidTipoCuentaBanco.setVisible(this.tipocuentabancoConstantesFunciones.mostraridTipoCuentaBanco);
		//this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxid_empresaTipoCuentaBanco.setVisible(this.tipocuentabancoConstantesFunciones.mostrarid_empresaTipoCuentaBanco);
		this.jInternalFrameDetalleFormTipoCuentaBanco.jPanelid_empresaTipoCuentaBanco.setVisible(this.tipocuentabancoConstantesFunciones.mostrarid_empresaTipoCuentaBanco);
		//this.jInternalFrameDetalleFormTipoCuentaBanco.jTextFieldcodigoTipoCuentaBanco.setVisible(this.tipocuentabancoConstantesFunciones.mostrarcodigoTipoCuentaBanco);
		this.jInternalFrameDetalleFormTipoCuentaBanco.jPanelcodigoTipoCuentaBanco.setVisible(this.tipocuentabancoConstantesFunciones.mostrarcodigoTipoCuentaBanco);
		//this.jInternalFrameDetalleFormTipoCuentaBanco.jTextAreanombreTipoCuentaBanco.setVisible(this.tipocuentabancoConstantesFunciones.mostrarnombreTipoCuentaBanco);
		this.jInternalFrameDetalleFormTipoCuentaBanco.jPanelnombreTipoCuentaBanco.setVisible(this.tipocuentabancoConstantesFunciones.mostrarnombreTipoCuentaBanco);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCuentaBanco() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCuentaBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCuentaBanco!=null) {
	
		this.jInternalFrameDetalleFormTipoCuentaBanco.jLabelidTipoCuentaBanco.setEnabled(this.tipocuentabancoConstantesFunciones.activaridTipoCuentaBanco);
		this.jInternalFrameDetalleFormTipoCuentaBanco.jComboBoxid_empresaTipoCuentaBanco.setEnabled(this.tipocuentabancoConstantesFunciones.activarid_empresaTipoCuentaBanco);
		this.jInternalFrameDetalleFormTipoCuentaBanco.jTextFieldcodigoTipoCuentaBanco.setEnabled(this.tipocuentabancoConstantesFunciones.activarcodigoTipoCuentaBanco);
		this.jInternalFrameDetalleFormTipoCuentaBanco.jTextAreanombreTipoCuentaBanco.setEnabled(this.tipocuentabancoConstantesFunciones.activarnombreTipoCuentaBanco);
		}
	}
	
		
}