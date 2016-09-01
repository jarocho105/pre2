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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




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

import com.bydan.erp.seguridad.util.CampoConstantesFunciones;
import com.bydan.erp.seguridad.util.CampoParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.CampoParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.CampoBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
public class CampoBeanSwingJInternalFrame extends CampoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CampoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Campo> campoValidator = new ClassValidator<Campo>(Campo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Campo campo;	
	public Campo campoAux;
	public Campo campoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Campo campoTotales;
	public Long idCampoActual;
	public Long iIdNuevoCampo=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboOpcion="";

	public List<Opcion> opcionsForeignKey;

	public List<Opcion> getopcionsForeignKey() {
		return opcionsForeignKey;
	}

	public void setopcionsForeignKey(List<Opcion> opcionsForeignKey) {
		this.opcionsForeignKey = opcionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Opcion opcionForeignKey;

	public Opcion getopcionForeignKey() {
		return opcionForeignKey;
	}

	public void setopcionForeignKey(Opcion opcionForeignKey) {
		this.opcionForeignKey = opcionForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosPerfilCampo=false;

	public Boolean getIsTienePermisosPerfilCampo() {
		return isTienePermisosPerfilCampo;
	}

	public void setIsTienePermisosPerfilCampo(Boolean isTienePermisosPerfilCampo) {
		this.isTienePermisosPerfilCampo= isTienePermisosPerfilCampo;
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
	
	public Boolean isPermisoTodoCampo;
	public Boolean isPermisoNuevoCampo;
	public Boolean isPermisoActualizarCampo;
	public Boolean isPermisoActualizarOriginalCampo;
	public Boolean isPermisoEliminarCampo;
	public Boolean isPermisoGuardarCambiosCampo;
	public Boolean isPermisoConsultaCampo;
	public Boolean isPermisoBusquedaCampo;
	public Boolean isPermisoReporteCampo;
	public Boolean isPermisoPaginacionMedioCampo;
	public Boolean isPermisoPaginacionAltoCampo;
	public Boolean isPermisoPaginacionTodoCampo;
	public Boolean isPermisoCopiarCampo;
	public Boolean isPermisoVerFormCampo;
	public Boolean isPermisoDuplicarCampo;
	public Boolean isPermisoOrdenCampo;
	
	
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
	
	public CampoParameterReturnGeneral campoReturnGeneral;
	public CampoParameterReturnGeneral campoParameterGeneral;
	
	

	public PerfilCampoLogic perfilcampoLogic=null;

	public PerfilCampoLogic getPerfilCampoLogic() {
		return perfilcampoLogic;
	}

	public void setPerfilCampoLogic(PerfilCampoLogic perfilcampoLogic) {
		this.perfilcampoLogic = perfilcampoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCampo=false;
	public Boolean esParaAccionDesdeFormularioCampo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CampoSessionBeanAdditional campoSessionBeanAdditional=null;
	
	public CampoSessionBeanAdditional getCampoSessionBeanAdditional() {
		return this.campoSessionBeanAdditional;
	}
	
	public void setCampoSessionBeanAdditional(CampoSessionBeanAdditional campoSessionBeanAdditional) {
		try {
			this.campoSessionBeanAdditional=campoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CampoBeanSwingJInternalFrameAdditional campoBeanSwingJInternalFrameAdditional=null;
	//public class CampoBeanSwingJInternalFrame
	
	public CampoBeanSwingJInternalFrameAdditional getCampoBeanSwingJInternalFrameAdditional() {
		return this.campoBeanSwingJInternalFrameAdditional;
	}
	
	public void setCampoBeanSwingJInternalFrameAdditional(CampoBeanSwingJInternalFrameAdditional campoBeanSwingJInternalFrameAdditional) {
		try {
			this.campoBeanSwingJInternalFrameAdditional=campoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CampoLogic campoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Campo campoBean;
	public CampoConstantesFunciones campoConstantesFunciones;
	//public CampoParameterReturnGeneral campoReturnGeneral;
	
	//FK
	
	public OpcionLogic opcionLogic;
	
	//PARAMETROS
	
	
	//public List<Campo> campos;	
	//public List<Campo> camposEliminados;
	//public List<Campo> camposAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCampo=false;
	public Boolean isVisibilidadCeldaDuplicarCampo=true;
	public Boolean isVisibilidadCeldaCopiarCampo=true;
	public Boolean isVisibilidadCeldaVerFormCampo=true;
	public Boolean isVisibilidadCeldaOrdenCampo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCampo=false;
	public Boolean isVisibilidadCeldaModificarCampo=false;
	public Boolean isVisibilidadCeldaActualizarCampo=false;
	public Boolean isVisibilidadCeldaEliminarCampo=false;
	public Boolean isVisibilidadCeldaCancelarCampo=false;
	public Boolean isVisibilidadCeldaGuardarCampo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCampo=false;	
	
	
	public Boolean isVisibilidadFK_IdOpcion=false;
	
	public Long getiIdNuevoCampo() {
		return this.iIdNuevoCampo;
	}

	public void setiIdNuevoCampo(Long iIdNuevoCampo) {
		this.iIdNuevoCampo = iIdNuevoCampo;
	}
	
	public Long getidCampoActual() {
		return this.idCampoActual;
	}

	public void setidCampoActual(Long idCampoActual) {
		this.idCampoActual = idCampoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Campo getcampo() {
		return this.campo;
	}

	public void setcampo(Campo campo) {
		this.campo = campo;
	}
	
	public Campo getcampoAux() {
		return this.campoAux;
	}

	public void setcampoAux(Campo campoAux) {
		this.campoAux = campoAux;
	}				
	
	public Campo getcampoAnterior() {
		return this.campoAnterior;
	}

	public void setcampoAnterior(Campo campoAnterior) {
		this.campoAnterior = campoAnterior;
	}	
	
	public Campo getcampoTotales() {
		return this.campoTotales;
	}

	public void setcampoTotales(Campo campoTotales) {
		this.campoTotales = campoTotales;
	}	
	
	public Campo getcampoBean() {
		return this.campoBean;
	}

	public void setcampoBean(Campo campoBean) {
		this.campoBean = campoBean;
	}	
	
	public CampoParameterReturnGeneral getcampoReturnGeneral() {
		return this.campoReturnGeneral;
	}

	public void setcampoReturnGeneral(CampoParameterReturnGeneral campoReturnGeneral) {
		this.campoReturnGeneral = campoReturnGeneral;
	}	
	
	
	public Long id_opcionFK_IdOpcion=-1L;

	public Long getid_opcionFK_IdOpcion() {
		return this.id_opcionFK_IdOpcion;
	}

	public void setid_opcionFK_IdOpcion(Long id_opcionFK_IdOpcion) {
		this.id_opcionFK_IdOpcion = id_opcionFK_IdOpcion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CampoLogic getCampoLogic()	{		
		return campoLogic;
	}

	public void setCampoLogic(CampoLogic campoLogic) {
		this.campoLogic = campoLogic;
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
	
	public Boolean getIsEsNuevoCampo() {
		return isEsNuevoCampo;
	}

	public void setIsEsNuevoCampo(Boolean isEsNuevoCampo) {
		this.isEsNuevoCampo = isEsNuevoCampo;
	}

	public Boolean getEsParaAccionDesdeFormularioCampo() {
		return esParaAccionDesdeFormularioCampo;
	}
	
	public void setEsParaAccionDesdeFormularioCampo(Boolean esParaAccionDesdeFormularioCampo) {
		this.esParaAccionDesdeFormularioCampo = esParaAccionDesdeFormularioCampo;
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
	
	
	public void cargarCombosOpcionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.opcionsForeignKey=new ArrayList<Opcion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			OpcionLogic opcionLogic=new OpcionLogic();

			opcionLogic.getOpcionDataAccess().setIsForForeingKeyData(true);

			if(this.campoSessionBean==null) {
				this.campoSessionBean=new CampoSessionBean();
			}

			if(!this.campoSessionBean.getisBusquedaDesdeForeignKeySesionOpcion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.getOpcionDataAccess().setIsForForeingKeyData(true);

					opcionLogic.getTodosOpcionsWithConnection(sFinalQuery,new Pagination());

					this.opcionsForeignKey=opcionLogic.getOpcions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaOpcion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.getEntityWithConnection(campoSessionBean.getlidOpcionActual());
					this.opcionsForeignKey.add(opcionLogic.getOpcion());
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

	
	
	public void setActualOpcionForeignKey(Long idOpcionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Opcion  opcionTemp=null;

			for(Opcion opcionAux:opcionsForeignKey) {
				if(opcionAux.getId()!=null && opcionAux.getId().equals(idOpcionSeleccionado)) {
					opcionTemp=opcionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(opcionTemp!=null) {

					if(this.campo!=null) {
						this.campo.setOpcion(opcionTemp);
					}

					if(this.jInternalFrameDetalleFormCampo!=null) {
						this.jInternalFrameDetalleFormCampo.jComboBoxid_opcionCampo.setSelectedItem(opcionTemp);
					}
				} else {
					//jComboBoxid_opcionCampo.setSelectedItem(opcionTemp);
					if(this.jInternalFrameDetalleFormCampo!=null) {
						if(this.jInternalFrameDetalleFormCampo.jComboBoxid_opcionCampo.getItemCount()>0) {
							this.jInternalFrameDetalleFormCampo.jComboBoxid_opcionCampo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdOpcion") || sFormularioTipoBusqueda.equals("Todos")){
					if(opcionTemp!=null && jComboBoxid_opcionFK_IdOpcionCampo!=null) {
						jComboBoxid_opcionFK_IdOpcionCampo.setSelectedItem(opcionTemp);
					} else {
						if(jComboBoxid_opcionFK_IdOpcionCampo!=null) {
							//jComboBoxid_opcionFK_IdOpcionCampo.setSelectedItem(opcionTemp);
							if(jComboBoxid_opcionFK_IdOpcionCampo.getItemCount()>0) {
								jComboBoxid_opcionFK_IdOpcionCampo.setSelectedIndex(0);
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

	public String getActualOpcionForeignKeyDescripcion(Long idOpcionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Opcion  opcionTemp=null;

			for(Opcion opcionAux:opcionsForeignKey) {
				if(opcionAux.getId()!=null && opcionAux.getId().equals(idOpcionSeleccionado)) {
					opcionTemp=opcionAux;
					break;
				}
			}


			sDescripcion=OpcionConstantesFunciones.getOpcionDescripcion(opcionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualOpcionForeignKeyGenerico(Long idOpcionSeleccionado,JComboBox jComboBoxid_opcionCampoGenerico)throws Exception
	{
		try
		{
			Opcion  opcionTemp=null;

			for(Opcion opcionAux:opcionsForeignKey) {
				if(opcionAux.getId()!=null && opcionAux.getId().equals(idOpcionSeleccionado)) {
					opcionTemp=opcionAux;
					break;
				}
			}

			if(opcionTemp!=null) {
				jComboBoxid_opcionCampoGenerico.setSelectedItem(opcionTemp);
			} else {
				if(jComboBoxid_opcionCampoGenerico!=null && jComboBoxid_opcionCampoGenerico.getItemCount()>0) {
					jComboBoxid_opcionCampoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarOpcionForeignKey(Campo campo,JComboBox jComboBoxid_opcionCampoGenerico)throws Exception
	{
		try
		{
			Opcion  opcionAux=new Opcion();

			if(jComboBoxid_opcionCampoGenerico==null) {
				opcionAux=(Opcion)this.jInternalFrameDetalleFormCampo.jComboBoxid_opcionCampo.getSelectedItem();
			} else {
				opcionAux=(Opcion)jComboBoxid_opcionCampoGenerico.getSelectedItem();
			}

			if(opcionAux!=null && opcionAux.getId()!=null) {
				campo.setid_opcion(opcionAux.getId());
				campo.setopcion_descripcion(CampoConstantesFunciones.getOpcionDescripcion(opcionAux));
				campo.setOpcion(opcionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameOpcionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingOpcion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CampoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCampo!=null) { 
							this.jInternalFrameDetalleFormCampo.jComboBoxid_opcionCampo.removeAllItems();

							for(Opcion opcion:this.opcionsForeignKey) {
								this.jInternalFrameDetalleFormCampo.jComboBoxid_opcionCampo.addItem(opcion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCampo!=null) { 
					}

					if(!CampoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdOpcion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CampoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_opcionFK_IdOpcionCampo.removeAllItems();

							for(Opcion opcion:this.opcionsForeignKey) {
								this.jComboBoxid_opcionFK_IdOpcionCampo.addItem(opcion);
							}
						}

						if(!CampoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameOpcionForeignKey(Opcion opcion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCampo!=null) {
							this.jInternalFrameDetalleFormCampo.jComboBoxid_opcionCampo.setSelectedItem(opcion);
						}
					} else {
						if(this.jInternalFrameDetalleFormCampo!=null) {
							this.jInternalFrameDetalleFormCampo.jComboBoxid_opcionCampo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_opcionFK_IdOpcionCampo.setSelectedItem(opcion);
						} else {
							this.jComboBoxid_opcionFK_IdOpcionCampo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCampo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CampoConstantesFunciones.refrescarForeignKeysDescripcionesCampo(this.campoLogic.getCampos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CampoConstantesFunciones.refrescarForeignKeysDescripcionesCampo(this.campos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Opcion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//campoLogic.setCampos(this.campos);
			campoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CampoParameterReturnGeneral getCampoParameterGeneral() {
		return this.campoParameterGeneral;
	}
	
	public void setCampoParameterGeneral(CampoParameterReturnGeneral campoParameterGeneral) {
		this.campoParameterGeneral = campoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCampo() {
		return isPermisoTodoCampo;
	}

	public void setIsPermisoTodoCampo(Boolean isPermisoTodoCampo) {
		this.isPermisoTodoCampo = isPermisoTodoCampo;
	}

	public Boolean getIsPermisoNuevoCampo() {
		return isPermisoNuevoCampo;
	}

	public void setIsPermisoNuevoCampo(Boolean isPermisoNuevoCampo) {
		this.isPermisoNuevoCampo = isPermisoNuevoCampo;
	}

	public Boolean getIsPermisoActualizarCampo() {
		return isPermisoActualizarCampo;
	}

	public void setIsPermisoActualizarCampo(Boolean isPermisoActualizarCampo) {
		this.isPermisoActualizarCampo = isPermisoActualizarCampo;
	}

	public Boolean getIsPermisoEliminarCampo() {
		return isPermisoEliminarCampo;
	}

	public void setIsPermisoEliminarCampo(Boolean isPermisoEliminarCampo) {
		this.isPermisoEliminarCampo = isPermisoEliminarCampo;
	}

	public Boolean getIsPermisoGuardarCambiosCampo() {
		return isPermisoGuardarCambiosCampo;
	}

	public void setIsPermisoGuardarCambiosCampo(Boolean isPermisoGuardarCambiosCampo) {
		this.isPermisoGuardarCambiosCampo = isPermisoGuardarCambiosCampo;
	}
	
	public Boolean getIsPermisoConsultaCampo() {
		return isPermisoConsultaCampo;
	}

	public void setIsPermisoConsultaCampo(Boolean isPermisoConsultaCampo) {
		this.isPermisoConsultaCampo = isPermisoConsultaCampo;
	}

	public Boolean getIsPermisoBusquedaCampo() {
		return isPermisoBusquedaCampo;
	}

	public void setIsPermisoBusquedaCampo(Boolean isPermisoBusquedaCampo) {
		this.isPermisoBusquedaCampo = isPermisoBusquedaCampo;
	}

	public Boolean getIsPermisoReporteCampo() {
		return isPermisoReporteCampo;
	}

	public void setIsPermisoReporteCampo(Boolean isPermisoReporteCampo) {
		this.isPermisoReporteCampo = isPermisoReporteCampo;
	}
	
	public Boolean getIsPermisoPaginacionMedioCampo() {
		return isPermisoPaginacionMedioCampo;
	}

	public void setIsPermisoPaginacionMedioCampo(Boolean isPermisoPaginacionMedioCampo) {
		this.isPermisoPaginacionMedioCampo = isPermisoPaginacionMedioCampo;
	}
	
	public Boolean getIsPermisoPaginacionTodoCampo() {
		return isPermisoPaginacionTodoCampo;
	}

	public void setIsPermisoPaginacionTodoCampo(Boolean isPermisoPaginacionTodoCampo) {
		this.isPermisoPaginacionTodoCampo = isPermisoPaginacionTodoCampo;
	}
	
	public Boolean getIsPermisoPaginacionAltoCampo() {
		return isPermisoPaginacionAltoCampo;
	}

	public void setIsPermisoPaginacionAltoCampo(Boolean isPermisoPaginacionAltoCampo) {
		this.isPermisoPaginacionAltoCampo = isPermisoPaginacionAltoCampo;
	}
	
	public Boolean getIsPermisoCopiarCampo() {
		return isPermisoCopiarCampo;
	}

	public void setIsPermisoCopiarCampo(Boolean isPermisoCopiarCampo) {
		this.isPermisoCopiarCampo = isPermisoCopiarCampo;
	}
	
	public Boolean getIsPermisoVerFormCampo() {
		return isPermisoVerFormCampo;
	}

	public void setIsPermisoVerFormCampo(Boolean isPermisoVerFormCampo) {
		this.isPermisoVerFormCampo = isPermisoVerFormCampo;
	}
	
	public Boolean getIsPermisoDuplicarCampo() {
		return isPermisoDuplicarCampo;
	}

	public void setIsPermisoDuplicarCampo(Boolean isPermisoDuplicarCampo) {
		this.isPermisoDuplicarCampo = isPermisoDuplicarCampo;
	}
	
	public Boolean getIsPermisoOrdenCampo() {
		return isPermisoOrdenCampo;
	}

	public void setIsPermisoOrdenCampo(Boolean isPermisoOrdenCampo) {
		this.isPermisoOrdenCampo = isPermisoOrdenCampo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCampo() {
		return isVisibilidadCeldaNuevoCampo;
	}

	public void setIsVisibilidadCeldaNuevoCampo(Boolean isVisibilidadCeldaNuevoCampo) {
		this.isVisibilidadCeldaNuevoCampo = isVisibilidadCeldaNuevoCampo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCampo() {
		return isVisibilidadCeldaDuplicarCampo;
	}

	public void setIsVisibilidadCeldaDuplicarCampo(Boolean isVisibilidadCeldaDuplicarCampo) {
		this.isVisibilidadCeldaDuplicarCampo = isVisibilidadCeldaDuplicarCampo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCampo() {
		return isVisibilidadCeldaCopiarCampo;
	}

	public void setIsVisibilidadCeldaCopiarCampo(Boolean isVisibilidadCeldaCopiarCampo) {
		this.isVisibilidadCeldaCopiarCampo = isVisibilidadCeldaCopiarCampo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCampo() {
		return isVisibilidadCeldaVerFormCampo;
	}

	public void setIsVisibilidadCeldaVerFormCampo(Boolean isVisibilidadCeldaVerFormCampo) {
		this.isVisibilidadCeldaVerFormCampo = isVisibilidadCeldaVerFormCampo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCampo() {
		return isVisibilidadCeldaOrdenCampo;
	}

	public void setIsVisibilidadCeldaOrdenCampo(Boolean isVisibilidadCeldaOrdenCampo) {
		this.isVisibilidadCeldaOrdenCampo = isVisibilidadCeldaOrdenCampo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCampo() {
		return isVisibilidadCeldaNuevoRelacionesCampo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCampo(Boolean isVisibilidadCeldaNuevoRelacionesCampo) {
		this.isVisibilidadCeldaNuevoRelacionesCampo = isVisibilidadCeldaNuevoRelacionesCampo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCampo() {
		return isVisibilidadCeldaModificarCampo;
	}

	public void setIsVisibilidadCeldaModificarCampo(Boolean isVisibilidadCeldaModificarCampo) {
		this.isVisibilidadCeldaModificarCampo = isVisibilidadCeldaModificarCampo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCampo() {
		return isVisibilidadCeldaActualizarCampo;
	}

	public void setIsVisibilidadCeldaActualizarCampo(Boolean isVisibilidadCeldaActualizarCampo) {
		this.isVisibilidadCeldaActualizarCampo = isVisibilidadCeldaActualizarCampo;
	}

	public Boolean getIsVisibilidadCeldaEliminarCampo() {
		return isVisibilidadCeldaEliminarCampo;
	}

	public void setIsVisibilidadCeldaEliminarCampo(Boolean isVisibilidadCeldaEliminarCampo) {
		this.isVisibilidadCeldaEliminarCampo = isVisibilidadCeldaEliminarCampo;
	}

	public Boolean getIsVisibilidadCeldaCancelarCampo() {
		return isVisibilidadCeldaCancelarCampo;
	}

	public void setIsVisibilidadCeldaCancelarCampo(Boolean isVisibilidadCeldaCancelarCampo) {
		this.isVisibilidadCeldaCancelarCampo = isVisibilidadCeldaCancelarCampo;
	}

	public Boolean getIsVisibilidadCeldaGuardarCampo() {
		return isVisibilidadCeldaGuardarCampo;
	}

	public void setIsVisibilidadCeldaGuardarCampo(Boolean isVisibilidadCeldaGuardarCampo) {
		this.isVisibilidadCeldaGuardarCampo = isVisibilidadCeldaGuardarCampo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCampo() {
		return isVisibilidadCeldaGuardarCambiosCampo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCampo(Boolean isVisibilidadCeldaGuardarCambiosCampo) {
		this.isVisibilidadCeldaGuardarCambiosCampo = isVisibilidadCeldaGuardarCambiosCampo;
	}
		
	public CampoSessionBean getcampoSessionBean() {
		return this.campoSessionBean;
	}
	
	public void setcampoSessionBean(CampoSessionBean campoSessionBean) {
		this.campoSessionBean=campoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdOpcion() {
		return this.isVisibilidadFK_IdOpcion;
	}

	public void setisVisibilidadFK_IdOpcion(Boolean isVisibilidadFK_IdOpcion) {
		this.isVisibilidadFK_IdOpcion=isVisibilidadFK_IdOpcion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCampo(Campo campo)throws Exception {
		try {
			
				this.setActualParaGuardarOpcionForeignKey(campo,null);
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
	
	public void bugActualizarReferenciaActual(Campo campo,Campo campoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCampo(campo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		campoAux.setId(campo.getId());
		campoAux.setVersionRow(campo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCampo();
		
			int intSelectedRow = this.jTableDatosCampo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campo =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.campo =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCampo(this.campo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = campoValidator.getInvalidValues(this.campo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			campoLogic.setDatosCliente(datosCliente);
			campoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				campoAux=new  Campo();
				
				campoAux.setIsNew(true);
				campoAux.setIsChanged(true);
				
				campoAux.setCampoOriginal(this.campo);
				
				campoAux.setId(this.campo.getId());	
				campoAux.setVersionRow(this.campo.getVersionRow());	
				campoAux.setid_opcion(this.campo.getid_opcion());	
				campoAux.setcodigo(this.campo.getcodigo());	
				campoAux.setnombre(this.campo.getnombre());	
				campoAux.setdescripcion(this.campo.getdescripcion());	
				campoAux.setestado(this.campo.getestado());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.campoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.campoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(campoAux,campoLogic.getCampos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(campoAux,campos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.campoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.campoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						campoLogic.saveCampos();//WithConnection
						//campoLogic.getSetVersionRowCampos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.campo,campoAux);
					
					this.refrescarForeignKeysDescripcionesCampo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.campoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoLogic.getPerfilCampos().addAll(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcamposEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampos.addAll(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcamposEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.campoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								campoLogic.saveCampoRelaciones(campoAux,this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoLogic.getPerfilCampos());//WithConnection
								//campoLogic.getSetVersionRowCampos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.campo,campoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoLogic.setPerfilCampos(new ArrayList<PerfilCampo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampos= new ArrayList<PerfilCampo>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();}
							campoAux.setPerfilCampos(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoLogic.getPerfilCampos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.campoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.campoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(campoAux,campoLogic.getCampos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(campoAux,campos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.campo,campoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				campoAux=new  Campo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.campoSessionBean.getEsGuardarRelacionado() 
					|| (this.campoSessionBean.getEsGuardarRelacionado() && this.campo.getId()>=0)) {
						
					campoAux.setIsNew(false);
				}
				
				campoAux.setIsDeleted(false);
			
				campoAux.setId(this.campo.getId());	
				campoAux.setVersionRow(this.campo.getVersionRow());	
				campoAux.setid_opcion(this.campo.getid_opcion());	
				campoAux.setcodigo(this.campo.getcodigo());	
				campoAux.setnombre(this.campo.getnombre());	
				campoAux.setdescripcion(this.campo.getdescripcion());	
				campoAux.setestado(this.campo.getestado());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(campoAux,campoLogic.getCampos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(campoAux,campos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.campoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.campoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						campoLogic.saveCampos();//WithConnection
						//campoLogic.getSetVersionRowCampos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.campo,campoAux);
					
					this.refrescarForeignKeysDescripcionesCampo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.campoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoLogic.getPerfilCampos().addAll(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcamposEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampos.addAll(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcamposEliminados);
						}
						//ARCHITECTURE
						
						if(!this.campoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								campoLogic.saveCampoRelaciones(campoAux,this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoLogic.getPerfilCampos());//WithConnection
								//campoLogic.getSetVersionRowCampos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.campo,campoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoLogic.setPerfilCampos(new ArrayList<PerfilCampo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampos= new ArrayList<PerfilCampo>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();}
							campoAux.setPerfilCampos(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoLogic.getPerfilCampos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.campoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.campoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(campoAux,campoLogic.getCampos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(campoAux,campos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.campo,campoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				campoAux=new  Campo();
				
				campoAux.setIsNew(false);
				campoAux.setIsChanged(false);
				
				campoAux.setIsDeleted(true);
				
				campoAux.setId(this.campo.getId());	
				campoAux.setVersionRow(this.campo.getVersionRow());	
				campoAux.setid_opcion(this.campo.getid_opcion());	
				campoAux.setcodigo(this.campo.getcodigo());	
				campoAux.setnombre(this.campo.getnombre());	
				campoAux.setdescripcion(this.campo.getdescripcion());	
				campoAux.setestado(this.campo.getestado());	
				
				if(this.campoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.campoAux.getId()>=0) {	
						this.camposEliminados.add(campoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(campoAux,campoLogic.getCampos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(campoAux,campos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.campoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.campoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						campoLogic.saveCampos();//WithConnection
						//campoLogic.getSetVersionRowCampos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.campoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoLogic.getPerfilCampos().addAll(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcamposEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampos.addAll(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcamposEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.campoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								campoLogic.saveCampoRelaciones(campoAux,this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoLogic.getPerfilCampos());//WithConnection
								//campoLogic.getSetVersionRowCampos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoLogic.setPerfilCampos(new ArrayList<PerfilCampo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampos= new ArrayList<PerfilCampo>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();}
							campoAux.setPerfilCampos(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoLogic.getPerfilCampos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.campoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.campoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(campoAux,campoLogic.getCampos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(campoAux,campos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.getCampos().addAll(this.camposEliminados);
					
					campoLogic.saveCampos();//WithConnection
					//campoLogic.getSetVersionRowCampos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCampo();
				
				this.camposEliminados= new ArrayList<Campo>();		
			}
			
			if(this.campoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.campoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Campo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Campo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.campo=campoAux;
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
      		//this.finishProcessCampo();
      	}
		
	}	
	
	public void actualizarRelaciones(Campo campoLocal) throws Exception {
		
		if(this.campoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				campoLocal.setPerfilCampos(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoLogic.getPerfilCampos());
			
			} else {
			
				campoLocal.setPerfilCampos(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Campo campoLocal) throws Exception {	
		if(this.campoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(OpcionDetalleFormJInternalFrame.class)) {
				OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrameLocal=(OpcionBeanSwingJInternalFrame) ((OpcionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				opcionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoOpcion(opcionBeanSwingJInternalFrameLocal.getopcion(),true);
				opcionBeanSwingJInternalFrameLocal.actualizarLista(opcionBeanSwingJInternalFrameLocal.opcion,this.opcionsForeignKey);

				opcionBeanSwingJInternalFrameLocal.actualizarRelaciones(opcionBeanSwingJInternalFrameLocal.opcion);

				campoLocal.setOpcion(opcionBeanSwingJInternalFrameLocal.opcion);

				this.addItemDefectoCombosForeignKeyOpcion();
				this.cargarCombosFrameOpcionsForeignKey("Formulario");
				this.setActualOpcionForeignKey(opcionBeanSwingJInternalFrameLocal.opcion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCampoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCampo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.campo =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.campo =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = campoValidator.getInvalidValues(this.campo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Campo campo,List<Campo> campos) throws Exception {
		try	{		
			CampoConstantesFunciones.actualizarLista(campo,campos,this.campoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Campo campo,List<Campo> campos) throws Exception {
		try	{			
			CampoConstantesFunciones.actualizarSelectedLista(campo,campos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Campo> camposLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				camposLocal=this.campoLogic.getCampos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				camposLocal=this.campos;
			}
			//ARCHITECTURE
		
			for(Campo campoLocal:camposLocal) {
				if(this.permiteMantenimiento(campoLocal) && campoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CampoConstantesFunciones.getCampoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CampoConstantesFunciones.IDOPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCampo.jLabelid_opcionCampo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CampoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCampo.jLabelcodigoCampo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CampoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCampo.jLabelnombreCampo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CampoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCampo.jLabeldescripcionCampo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CampoConstantesFunciones.ESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCampo.jLabelestadoCampo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCampo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCampo.jLabelid_opcionCampo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCampo.jLabelcodigoCampo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCampo.jLabelnombreCampo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCampo.jLabeldescripcionCampo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCampo.jLabelestadoCampo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("PerfilCampo")) {
			if(this.campo==null) {
				this.campo= new Campo();
			}

			if(this.campoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCampo
				this.setVariablesFormularioToObjetoActualCampo(this.campo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);

				this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.getperfilcampo().setCampo(this.campo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoCampo--;	
		
		
		this.campoAux=new Campo();
		
		this.campoAux.setId(this.iIdNuevoCampo);
		this.campoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.campoLogic.getCampos().add(this.campoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.campos.add(this.campoAux);
		}
		//ARCHITECTURE
		
		this.campo=this.campoAux;
		
		if(CampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCampo(this.campo);
			this.setVariablesObjetoActualToFormularioForeignKeyCampo(this.campo);
		}
				
		//this.setDefaultControlesCampo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCampo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCampo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCampo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCampo(this.campoBean,this.campo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CampoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.campoSessionBean.getConGuardarRelaciones()) {
			classes=CampoConstantesFunciones.getClassesRelationshipsOfCampo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.campoReturnGeneral=campoLogic.procesarEventosCamposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.campoLogic.getCampos(),this.campo,this.campoParameterGeneral,this.isEsNuevoCampo,classes);//this.campoLogic.getCampo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCampo(this.campoReturnGeneral,this.campoBean,false);
		
		if(this.campoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCampo(this.campoReturnGeneral.getCampo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCampo(this.campoReturnGeneral.getCampo());
		}
		
		if(this.campoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCampo(this.campoReturnGeneral.getCampo(),classes);//this.campoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCampo(this.campo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCampo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCampo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CampoBeanSwingJInternalFrameAdditional.RecargarFormCampo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCampo(false);
						
			if(campoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoSessionBean.getEsGuardarRelacionado() && PerfilCampoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPerfilCampoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(CampoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCampo();
			}
			
			this.actualizarVisualTableDatosCampo();
			
			this.jTableDatosCampo.setRowSelectionInterval(this.getIndiceNuevoCampo(), this.getIndiceNuevoCampo());
			
			this.seleccionarFilaTablaCampoActual();
						
			this.actualizarEstadoCeldasBotonesCampo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCampo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCampo.jTextFieldcodigoCampo.setEnabled(isHabilitar && this.campoConstantesFunciones.activarcodigoCampo);
		this.jInternalFrameDetalleFormCampo.jTextAreanombreCampo.setEnabled(isHabilitar && this.campoConstantesFunciones.activarnombreCampo);
		this.jInternalFrameDetalleFormCampo.jTextAreadescripcionCampo.setEnabled(isHabilitar && this.campoConstantesFunciones.activardescripcionCampo);
		this.jInternalFrameDetalleFormCampo.jCheckBoxestadoCampo.setEnabled(isHabilitar && this.campoConstantesFunciones.activarestadoCampo);	
		
		this.jInternalFrameDetalleFormCampo.jComboBoxid_opcionCampo.setEnabled(isHabilitar && this.campoConstantesFunciones.activarid_opcionCampo);
	};
	
	public void setDefaultControlesCampo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCampo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.campoSessionBean.setConGuardarRelaciones(true);			
			this.campoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCampo.jTabbedPaneRelacionesCampo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.campoSessionBean.setConGuardarRelaciones(false);			
			this.campoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCampo.jTabbedPaneRelacionesCampo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoCampo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Campo campoAux:this.campoLogic.getCampos()) {
				if(campoAux.getId().equals(this.iIdNuevoCampo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Campo campoAux:this.campos) {
				if(campoAux.getId().equals(this.iIdNuevoCampo)) {
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
	
	public int getIndiceActualCampo(Campo campo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Campo campoAux:this.campoLogic.getCampos()) {
				if(campoAux.getId().equals(campo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Campo campoAux:this.campos) {
				if(campoAux.getId().equals(campo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCampo(Campo campoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Campo campoAux:this.campoLogic.getCampos()) {
				if(campoAux.getCampoOriginal().getId().equals(campoOriginal.getId())) {
					existe=true;
					campoOriginal.setId(campoAux.getId());
					campoOriginal.setVersionRow(campoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Campo campoAux:this.campos) {
				if(campoAux.getCampoOriginal().getId().equals(campoOriginal.getId())) {
					existe=true;
					campoOriginal.setId(campoAux.getId());
					campoOriginal.setVersionRow(campoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCampo(Boolean esParaCancelar) throws Exception {
		camposAux=new ArrayList<Campo>();
		campoAux=new Campo();
		
		if(!this.campoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Campo campoAux:this.campoLogic.getCampos()) {
					if(campoAux.getId()<0) {
						camposAux.add(campoAux);
					}		
				}
				this.iIdNuevoCampo=0L;
				this.campoLogic.getCampos().removeAll(camposAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Campo campoAux:this.campos) {
					if(campoAux.getId()<0) {
						camposAux.add(campoAux);
					}		
				}
				this.iIdNuevoCampo=0L;
				this.campos.removeAll(camposAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCampo 
					&& this.campoLogic.getCampos().size()>0
					) {
					campoAux=this.campoLogic.getCampos().get(this.campoLogic.getCampos().size() - 1);
				
					if(campoAux.getId()<0) {
						this.campoLogic.getCampos().remove(campoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCampo && this.campos.size()>0) {
					campoAux=this.campos.get(this.campos.size() - 1);
				
					if(campoAux.getId()<0) {
						this.campos.remove(campoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCampo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(campo.getId()<0) {
				this.campoLogic.getCampos().remove(this.campo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(campo.getId()<0) {
				this.campos.remove(this.campo);
			}
		}			
	}
	
	public void setEstadosInicialesCampo(List<Campo> camposAux) throws Exception {
		CampoConstantesFunciones.setEstadosInicialesCampo(camposAux);
	}
	
	public void setEstadosInicialesCampo(Campo campoAux) throws Exception {
		CampoConstantesFunciones.setEstadosInicialesCampo(campoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCampoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCampo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCampoActual()) {
				if(!this.isEsNuevoCampo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCampo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCampo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCampoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Campo ?", "MANTENIMIENTO DE Campo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCampo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Campo campo) throws Exception {
		CampoConstantesFunciones.seleccionarAsignar(this.campo,campo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCampo=this.isPermisoActualizarOriginalCampo;
			
			
			this.seleccionarAsignar(campo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CampoConstantesFunciones.quitarEspaciosCampo(this.campo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCampo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.campoSessionBean.setsFuncionBusquedaRapida(this.campoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCampo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCampo(esParaCancelar);				
				this.cancelarNuevoCampo(esParaCancelar);								
			}
			
			this.campo=new Campo();
			
			this.inicializarCampo();
			
			this.actualizarEstadoCeldasBotonesCampo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCampo() throws Exception {
		try {
			CampoConstantesFunciones.inicializarCampo(this.campo);
			
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
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.campoLogic.getCampos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCampos(String sAccionBusqueda,List<Campo> camposParaReportes) throws Exception {
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
					sPathReporteFinal="Campo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CampoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CampoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Campo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Campos");		
		parameters.put("busquedapor", CampoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(PerfilCampo.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					CampoLogic campoLogicAuxiliar=new CampoLogic();
					campoLogicAuxiliar.setDatosCliente(campoLogic.getDatosCliente());				
					campoLogicAuxiliar.setCampos(camposParaReportes);
					
					campoLogicAuxiliar.cargarRelacionesLoteForeignKeyCampoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					camposParaReportes=campoLogicAuxiliar.getCampos();
					
					//campoLogic.getNewConnexionToDeep();
					
					//for (Campo campo:camposParaReportes) {
					//	campoLogic.deepLoad(campo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//campoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//campoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePerfilCampo = AuxiliarReportes.class.getResourceAsStream("PerfilCampoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_perfilcampo", reportFilePerfilCampo);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCampo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CampoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CampoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCampo=new JRBeanArrayDataSource(CampoJInternalFrame.TraerCampoBeans(camposParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCampo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CampoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CampoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CampoBean.TraerCampoBeans(camposParaReportes).toArray()));
							
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
				this.generarExcelReporteCampos(sAccionBusqueda,sTipoArchivoReporte,camposParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCampos(sAccionBusqueda,sTipoArchivoReporte,camposParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCampoActionPerformed(null);
					//this.generarExcelReporteCampos(sAccionBusqueda,sTipoArchivoReporte,camposParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCampos(sAccionBusqueda,sTipoArchivoReporte,camposParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCampos(sAccionBusqueda,sTipoArchivoReporte,camposParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCampos(sAccionBusqueda,sTipoArchivoReporte,camposParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCampos(String sAccionBusqueda,String sTipoArchivoReporte,List<Campo> camposParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"campo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Campos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCampo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Campo campo : camposParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CampoConstantesFunciones.generarExcelReporteDataCampo("NORMAL",row,workbook,campo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.campoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Campo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCampo(String sTipo,Row row,Workbook workbook) {
		
		CampoConstantesFunciones.generarExcelReporteHeaderCampo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCampos(String sAccionBusqueda,String sTipoArchivoReporte,List<Campo> camposParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"campo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Campos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Campo campo : camposParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CampoConstantesFunciones.getCampoDescripcion(campo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CampoConstantesFunciones.LABEL_IDOPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CampoConstantesFunciones.LABEL_IDOPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(campo.getopcion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CampoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CampoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(campo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CampoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CampoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(campo.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CampoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CampoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(campo.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CampoConstantesFunciones.LABEL_ESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CampoConstantesFunciones.LABEL_ESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(campo.getestado()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.campoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Campo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCampos(String sAccionBusqueda,String sTipoArchivoReporte,List<Campo> camposParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Campo> camposRespaldo=null;
		
		classes=CampoConstantesFunciones.getClassesRelationshipsOfCampo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.campoLogic.setDatosCliente(this.datosCliente);
		this.campoLogic.setDatosDeep(this.datosDeep);
		this.campoLogic.setIsConDeep(true);
		
		camposRespaldo=this.campoLogic.getCampos();
		
		this.campoLogic.setCampos(camposParaReportes);	
		this.campoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		camposParaReportes=this.campoLogic.getCampos();
		this.campoLogic.setCampos(camposRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"campo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Campos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCampo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Campo campo : camposParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCampo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CampoConstantesFunciones.generarExcelReporteDataCampo("NORMAL",row,workbook,campo,cellStyleDataAux);
		
			
			


				//PerfilCampo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PerfilCampoConstantesFunciones.SCLASSWEBTITULO))) {

				if(campo.getPerfilCampos()!=null && campo.getPerfilCampos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PerfilCampoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PerfilCampoConstantesFunciones.generarExcelReporteHeaderPerfilCampo("RELACIONADO",row,workbook);
				}

				if(campo.getPerfilCampos()!=null) {
					i2=0;
					for(PerfilCampo perfilcampo : campo.getPerfilCampos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PerfilCampoConstantesFunciones.generarExcelReporteDataPerfilCampo("RELACIONADO",row,workbook,perfilcampo,cellStyleDataAuxHijo);
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
		cell.setCellValue(CampoConstantesFunciones.getCampoDescripcion(campo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.campoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Campo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCampo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCampo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCampo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCampo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCampo() throws Exception {		
		this.startProcessCampo(true);
	}
	
	public void startProcessCampo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCampo ,this.jPanelParametrosReportesCampo, this.jScrollPanelDatosCampo,this.jPanelPaginacionCampo, this.jScrollPanelDatosEdicionCampo, this.jPanelAccionesCampo,this.jPanelAccionesFormularioCampo,this.jmenuBarCampo,this.jmenuBarDetalleCampo,this.jTtoolBarCampo,this.jTtoolBarDetalleCampo);		
		
		final JTabbedPane jTabbedPaneBusquedasCampo=this.jTabbedPaneBusquedasCampo; 
		
		final JPanel jPanelParametrosReportesCampo=this.jPanelParametrosReportesCampo;
		//final JScrollPane jScrollPanelDatosCampo=this.jScrollPanelDatosCampo;
		final JTable jTableDatosCampo=this.jTableDatosCampo;		
		final JPanel jPanelPaginacionCampo=this.jPanelPaginacionCampo;
		//final JScrollPane jScrollPanelDatosEdicionCampo=this.jScrollPanelDatosEdicionCampo;
		final JPanel jPanelAccionesCampo=this.jPanelAccionesCampo;
		
		JPanel jPanelCamposAuxiliarCampo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCampo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCampo!=null) {
			jPanelCamposAuxiliarCampo=this.jInternalFrameDetalleFormCampo.jPanelCamposCampo;
			jPanelAccionesFormularioAuxiliarCampo=this.jInternalFrameDetalleFormCampo.jPanelAccionesFormularioCampo;
		}
		
		final JPanel jPanelCamposCampo=jPanelCamposAuxiliarCampo;
		final JPanel jPanelAccionesFormularioCampo=jPanelAccionesFormularioAuxiliarCampo;
		
		
		final JMenuBar jmenuBarCampo=this.jmenuBarCampo;
		final JToolBar jTtoolBarCampo=this.jTtoolBarCampo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCampo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCampo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCampo!=null) {
			jmenuBarDetalleAuxiliarCampo=this.jInternalFrameDetalleFormCampo.jmenuBarDetalleCampo;
			jTtoolBarDetalleAuxiliarCampo=this.jInternalFrameDetalleFormCampo.jTtoolBarDetalleCampo;
		}
		
		final JMenuBar jmenuBarDetalleCampo=jmenuBarDetalleAuxiliarCampo;
		final JToolBar jTtoolBarDetalleCampo=jTtoolBarDetalleAuxiliarCampo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCampo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCampo;
			processRunnable.jTableDatos=jTableDatosCampo;
			processRunnable.jPanelCampos=jPanelCamposCampo;
			processRunnable.jPanelPaginacion=jPanelPaginacionCampo;
			processRunnable.jPanelAcciones=jPanelAccionesCampo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCampo;
			
			
			processRunnable.jmenuBar=jmenuBarCampo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCampo;
			processRunnable.jTtoolBar=jTtoolBarCampo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCampo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCampo ,jPanelParametrosReportesCampo,jTableDatosCampo, /*jScrollPanelDatosCampo,*/jPanelCamposCampo,jPanelPaginacionCampo, /*jScrollPanelDatosEdicionCampo,*/ jPanelAccionesCampo,jPanelAccionesFormularioCampo,jmenuBarCampo,jmenuBarDetalleCampo,jTtoolBarCampo,jTtoolBarDetalleCampo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCampo ,jPanelParametrosReportesCampo, jScrollPanelDatosCampo,jPanelPaginacionCampo, jScrollPanelDatosEdicionCampo, jPanelAccionesCampo,jPanelAccionesFormularioCampo,jmenuBarCampo,jmenuBarDetalleCampo,jTtoolBarCampo,jTtoolBarDetalleCampo);
						
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
	
	public void finishProcessCampo() {// throws Exception 
		this.finishProcessCampo(true);
	}
	
	public void finishProcessCampo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCampo ,this.jPanelParametrosReportesCampo, this.jScrollPanelDatosCampo,this.jPanelPaginacionCampo, this.jScrollPanelDatosEdicionCampo, this.jPanelAccionesCampo,this.jPanelAccionesFormularioCampo,this.jmenuBarCampo,this.jmenuBarDetalleCampo,this.jTtoolBarCampo,this.jTtoolBarDetalleCampo);		
		
		final JTabbedPane jTabbedPaneBusquedasCampo=this.jTabbedPaneBusquedasCampo; 
		
		final JPanel jPanelParametrosReportesCampo=this.jPanelParametrosReportesCampo;
		//final JScrollPane jScrollPanelDatosCampo=this.jScrollPanelDatosCampo;
		final JTable jTableDatosCampo=this.jTableDatosCampo;		
		final JPanel jPanelPaginacionCampo=this.jPanelPaginacionCampo;
		//final JScrollPane jScrollPanelDatosEdicionCampo=this.jScrollPanelDatosEdicionCampo;
		final JPanel jPanelAccionesCampo=this.jPanelAccionesCampo;
		
		JPanel jPanelCamposAuxiliarCampo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCampo=new JPanel();
		
		if(this.jInternalFrameDetalleFormCampo!=null) {
			jPanelCamposAuxiliarCampo=this.jInternalFrameDetalleFormCampo.jPanelCamposCampo;
			jPanelAccionesFormularioAuxiliarCampo=this.jInternalFrameDetalleFormCampo.jPanelAccionesFormularioCampo;
		}
		
		final JPanel jPanelCamposCampo=jPanelCamposAuxiliarCampo;
		final JPanel jPanelAccionesFormularioCampo=jPanelAccionesFormularioAuxiliarCampo;
		
		
		final JMenuBar jmenuBarCampo=this.jmenuBarCampo;		
		final JToolBar jTtoolBarCampo=this.jTtoolBarCampo;
				
		JMenuBar jmenuBarDetalleAuxiliarCampo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCampo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCampo!=null) {
			jmenuBarDetalleAuxiliarCampo=this.jInternalFrameDetalleFormCampo.jmenuBarDetalleCampo;
			jTtoolBarDetalleAuxiliarCampo=this.jInternalFrameDetalleFormCampo.jTtoolBarDetalleCampo;		
		}
		
		final JMenuBar jmenuBarDetalleCampo=jmenuBarDetalleAuxiliarCampo;
		final JToolBar jTtoolBarDetalleCampo=jTtoolBarDetalleAuxiliarCampo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCampo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCampo;
			processRunnable.jTableDatos=jTableDatosCampo;
			processRunnable.jPanelCampos=jPanelCamposCampo;
			processRunnable.jPanelPaginacion=jPanelPaginacionCampo;
			processRunnable.jPanelAcciones=jPanelAccionesCampo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCampo;
			
			
			processRunnable.jmenuBar=jmenuBarCampo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCampo;
			processRunnable.jTtoolBar=jTtoolBarCampo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCampo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCampo ,jPanelParametrosReportesCampo, jTableDatosCampo,/*jScrollPanelDatosCampo,*/jPanelCamposCampo,jPanelPaginacionCampo, /*jScrollPanelDatosEdicionCampo,*/ jPanelAccionesCampo,jPanelAccionesFormularioCampo,jmenuBarCampo,jmenuBarDetalleCampo,jTtoolBarCampo,jTtoolBarDetalleCampo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCampo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCampo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCampo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCampo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCampo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCampo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCampo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCampo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCampo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.campoConstantesFunciones.getsFinalQueryCampo();
		String  finalQueryPaginacionTodos=this.campoConstantesFunciones.getsFinalQueryCampo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CampoConstantesFunciones.getArrayColumnasGlobalesNoCampo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CampoConstantesFunciones.getArrayColumnasGlobalesCampo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CampoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.camposEliminados= new ArrayList<Campo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCampo();
		
				///*CampoSessionBean*/this.campoSessionBean=new CampoSessionBean();
			
			if(this.campoSessionBean==null) {
				this.campoSessionBean=new CampoSessionBean();
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
					this.iNumeroPaginacion=CampoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CampoConstantesFunciones.getClassesForeignKeysOfCampo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/campo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			camposAux= new ArrayList<Campo>();
			
				
			campoLogic.setDatosCliente(this.datosCliente);
			campoLogic.setDatosDeep(this.datosDeep);
			campoLogic.setIsConDeep(true);
			
			
			campoLogic.getCampoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					campoLogic.getTodosCampos(finalQueryGlobal,pagination);
					
					//campoLogic.getTodosCamposWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(campoLogic.getCampos()==null|| campoLogic.getCampos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							camposAux= new ArrayList<Campo>();
							camposAux.addAll(campoLogic.getCampos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							camposAux= new ArrayList<Campo>();
							camposAux.addAll(campos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							campoLogic.getTodosCampos(finalQueryGlobal+"",this.pagination);												
							
							//campoLogic.getTodosCamposWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCampos("Todos",campoLogic.getCampos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							campoLogic.setCampos(new ArrayList<Campo>());					
							campoLogic.getCampos().addAll(camposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							campos=new ArrayList<Campo>();
							campos.addAll(camposAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCampo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCampo=this.idActual;
				
				} else if(this.idCampoActual!=null && this.idCampoActual!=0L) {
					idCampo=idCampoActual;
				}
				
					
				this.sDetalleReporte=CampoConstantesFunciones.getDetalleIndicePorId(idCampo);
				
				this.campos=new ArrayList<Campo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					campoLogic.getEntity(idCampo);
					
					//campoLogic.getEntityWithConnection(idCampo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					campoLogic.setCampos(new ArrayList<Campo>());
					campoLogic.getCampos().add(campoLogic.getCampo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.campos=new ArrayList<Campo>();
					this.campos.add(campo);
				}
				
				if(campoLogic.getCampo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdOpcion")) {
				this.sDetalleReporte=CampoConstantesFunciones.getDetalleIndiceFK_IdOpcion(id_opcionFK_IdOpcion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					campoLogic.getCamposFK_IdOpcion(finalQueryGlobal,pagination,id_opcionFK_IdOpcion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CampoConstantesFunciones.getDetalleIndiceFK_IdOpcion(id_opcionFK_IdOpcion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CampoConstantesFunciones.getDetalleIndiceFK_IdOpcion(id_opcionFK_IdOpcion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=campoLogic.getCampos()==null||campoLogic.getCampos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=campos==null|| campos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						camposAux=new ArrayList<Campo>();
						camposAux.addAll(campoLogic.getCampos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							camposAux=new ArrayList<Campo>();
							camposAux.addAll(campos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							campoLogic.getCamposFK_IdOpcion(finalQueryGlobal,pagination,id_opcionFK_IdOpcion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CampoConstantesFunciones.getDetalleIndiceFK_IdOpcion(id_opcionFK_IdOpcion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CampoConstantesFunciones.getDetalleIndiceFK_IdOpcion(id_opcionFK_IdOpcion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCampos("FK_IdOpcion",campoLogic.getCampos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCampos("FK_IdOpcion",campos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						campoLogic.setCampos(new ArrayList<Campo>());
						campoLogic.getCampos().addAll(camposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							campos=new ArrayList<Campo>();
							campos.addAll(camposAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCampo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCampo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=campoLogic.getCampos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=campos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=campoLogic.getCampos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=campos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Campo campo) {
		Boolean permite=true;
		
		if(this.campo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CampoConstantesFunciones.getOrderByListaCampo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CampoConstantesFunciones.getOrderByListaCampo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Campo campo:campoLogic.getCampos()) {
				if(campo.getsType().equals(Constantes2.S_TOTALES)) {
					campoTotales=campo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Campo campo:this.campos) {
				if(campo.getsType().equals(Constantes2.S_TOTALES)) {
					campoTotales=campo;
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
			this.campoAux=new Campo();
			this.campoAux.setsType(Constantes2.S_TOTALES);
			this.campoAux.setIsNew(false);
			this.campoAux.setIsChanged(false);
			this.campoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CampoConstantesFunciones.TotalizarValoresFilaCampo(this.campoLogic.getCampos(),this.campoAux);
				
				this.campoLogic.getCampos().add(this.campoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CampoConstantesFunciones.TotalizarValoresFilaCampo(this.campos,this.campoAux);
				
				this.campos.add(this.campoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		campoTotales=new Campo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.campoLogic.getCampos().remove(campoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.campos.remove(campoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		campoTotales=new Campo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Campo campo:campoLogic.getCampos()) {
				if(campo.getsType().equals(Constantes2.S_TOTALES)) {
					campoTotales=campo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CampoConstantesFunciones.TotalizarValoresFilaCampo(this.campoLogic.getCampos(),campoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Campo campo:this.campos) {
				if(campo.getsType().equals(Constantes2.S_TOTALES)) {
					campoTotales=campo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CampoConstantesFunciones.TotalizarValoresFilaCampo(this.campos,campoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCamposFK_IdOpcion()throws Exception {
		try {
			sAccionBusqueda="FK_IdOpcion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCamposFK_IdOpcion(String sFinalQuery,Long id_opcion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					campoLogic.getCamposFK_IdOpcion(sFinalQuery,this.pagination,id_opcion);
				
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
	
	public void inicializarPermisosCampo() {
		this.isPermisoTodoCampo=false;
		this.isPermisoNuevoCampo=false;
		this.isPermisoActualizarCampo=false;
		this.isPermisoActualizarOriginalCampo=false;
		this.isPermisoEliminarCampo=false;
		this.isPermisoGuardarCambiosCampo=false;
		this.isPermisoConsultaCampo=false;
		this.isPermisoBusquedaCampo=false;
		this.isPermisoReporteCampo=false;		
		this.isPermisoOrdenCampo=false;		
		this.isPermisoPaginacionMedioCampo=false;		
		this.isPermisoPaginacionAltoCampo=false;
		this.isPermisoPaginacionTodoCampo=false;
		this.isPermisoCopiarCampo=false;		
		this.isPermisoVerFormCampo=false;		
		this.isPermisoDuplicarCampo=false;		
		this.isPermisoOrdenCampo=false;		
	}
	
	public void setPermisosUsuarioCampo(Boolean isPermiso) {
		this.isPermisoTodoCampo=isPermiso;
		this.isPermisoNuevoCampo=isPermiso;
		this.isPermisoActualizarCampo=isPermiso;
		this.isPermisoActualizarOriginalCampo=isPermiso;
		this.isPermisoEliminarCampo=isPermiso;
		this.isPermisoGuardarCambiosCampo=isPermiso;
		this.isPermisoConsultaCampo=isPermiso;
		this.isPermisoBusquedaCampo=isPermiso;
		this.isPermisoReporteCampo=isPermiso;
		this.isPermisoOrdenCampo=isPermiso;		
		this.isPermisoPaginacionMedioCampo=isPermiso;		
		this.isPermisoPaginacionAltoCampo=isPermiso;		
		this.isPermisoPaginacionTodoCampo=isPermiso;		
		this.isPermisoCopiarCampo=isPermiso;		
		this.isPermisoVerFormCampo=isPermiso;		
		this.isPermisoDuplicarCampo=isPermiso;
		this.isPermisoOrdenCampo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCampo(Boolean isPermiso) {
		//this.isPermisoTodoCampo=isPermiso;
		this.isPermisoNuevoCampo=isPermiso;
		this.isPermisoActualizarCampo=isPermiso;
		this.isPermisoActualizarOriginalCampo=isPermiso;
		this.isPermisoEliminarCampo=isPermiso;
		this.isPermisoGuardarCambiosCampo=isPermiso;
		//this.isPermisoConsultaCampo=isPermiso;
		//this.isPermisoBusquedaCampo=isPermiso;
		//this.isPermisoReporteCampo=isPermiso;
		//this.isPermisoOrdenCampo=isPermiso;		
		//this.isPermisoPaginacionMedioCampo=isPermiso;		
		//this.isPermisoPaginacionAltoCampo=isPermiso;		
		//this.isPermisoPaginacionTodoCampo=isPermiso;		
		//this.isPermisoCopiarCampo=isPermiso;		
		//this.isPermisoDuplicarCampo=isPermiso;
		//this.isPermisoOrdenCampo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCampoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PerfilCampoConstantesFunciones.SNOMBREOPCION);
		
		if(CampoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPerfilCampo=false;
		this.isTienePermisosPerfilCampo=this.verificarGetPermisosUsuarioOpcionCampoClaseRelacionada(this.opcionsRelacionadas,PerfilCampoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebCampo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCampoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPerfilCampo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioCampoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCampoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCampoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPerfilCampo && this.jInternalFrameDetalleFormCampo!=null && this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCampo.jTabbedPaneRelacionesCampo.remove(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioCampo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CampoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.campoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CampoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCampo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCampo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCampo=this.isPermisoActualizarCampo;
			this.isPermisoEliminarCampo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCampo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCampo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCampo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCampo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCampo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCampo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCampo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCampo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCampo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCampo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCampo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCampo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCampo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.campoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCampo.setToolTipText(this.jTableDatosCampo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCampo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCampo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CampoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CampoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCampo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPerfilCampo && this.campoConstantesFunciones.mostrarPerfilCampoCampo && !CampoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Perfil Campo");
			reporte.setsDescripcion("Perfil Campo");
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
	public void inicializarCombosForeignKeyCampoListas()throws Exception {
		try	{						
			
				this.opcionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCampoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CampoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCampoListas(false);
			} else {
			
				this.cargarCombosForeignKeyOpcionListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyOpcionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.opcionsForeignKey==null||this.opcionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=OpcionConstantesFunciones.getArrayColumnasGlobalesOpcion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,OpcionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=OpcionConstantesFunciones.SFINALQUERY;

				this.cargarCombosOpcionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCampoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CampoParameterReturnGeneral campoReturnGeneral=new CampoParameterReturnGeneral();
						
			


				String finalQueryGlobalOpcion="";

				if(((this.opcionsForeignKey==null||this.opcionsForeignKey.size()<=0) && this.campoConstantesFunciones.cargarid_opcionCampo)
					 || (this.esRecargarFks && this.campoConstantesFunciones.cargarid_opcionCampo)) {

					if(!this.campoSessionBean.getisBusquedaDesdeForeignKeySesionOpcion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=OpcionConstantesFunciones.getArrayColumnasGlobalesOpcion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalOpcion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,OpcionConstantesFunciones.TABLENAME);

						finalQueryGlobalOpcion=Funciones.GetFinalQueryAppend(finalQueryGlobalOpcion, "");
						finalQueryGlobalOpcion+=OpcionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosOpcionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalOpcion=" WHERE " + ConstantesSql.ID + "="+campoSessionBean.getlidOpcionActual();
					}
				} else {
					finalQueryGlobalOpcion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				campoReturnGeneral=campoLogic.cargarCombosLoteForeignKeyCampo(finalQueryGlobalOpcion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalOpcion.equals("NONE")) {
				this.opcionsForeignKey=campoReturnGeneral.getopcionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCampo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyOpcion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyOpcion()throws Exception {
		try {
			if(this.campoSessionBean==null) {
				this.campoSessionBean=new CampoSessionBean();
			}

			if(!this.campoSessionBean.getisBusquedaDesdeForeignKeySesionOpcion()) {
				Opcion opcion=new Opcion();
				OpcionConstantesFunciones.setOpcionDescripcion(opcion,Constantes.SMENSAJE_ESCOJA_OPCION);
				opcion.setId(null);

				if(!OpcionConstantesFunciones.ExisteEnLista(this.opcionsForeignKey,opcion,true)) {

					this.opcionsForeignKey.add(0,opcion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCampo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCampo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCampo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCampo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCampo(Campo campo)throws Exception {	
		try {
			
			this.setActualOpcionForeignKey(campo.getid_opcion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCampo(Campo campo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCampo()throws Exception {	
		try {
			
			this.setActualOpcionForeignKey(this.campoConstantesFunciones.getid_opcion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCampo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCampo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCampo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCampo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCampo()throws Exception {
		try {
			

			this.cargarCombosFrameOpcionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCampo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameOpcionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCampo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCampo.jComboBoxid_opcionCampo!=null && this.jInternalFrameDetalleFormCampo.jComboBoxid_opcionCampo.getItemCount()>0) {
				this.jInternalFrameDetalleFormCampo.jComboBoxid_opcionCampo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public CampoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CampoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CampoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.campoSessionBean=new CampoSessionBean(); 
		this.campoConstantesFunciones=new CampoConstantesFunciones(); 
		this.campoBean=new Campo();//(this.campoConstantesFunciones); 		
		this.campoReturnGeneral=new CampoParameterReturnGeneral(); 
		
		this.campoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.campoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CampoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CampoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CampoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCampo(true);
			
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
			
			this.campoConstantesFunciones=new CampoConstantesFunciones(); 
			this.campoBean=new Campo();//this.campoConstantesFunciones); 			
			this.campoReturnGeneral=new CampoParameterReturnGeneral(); 
		
			CampoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Campo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.campo=new Campo();
			this.campos = new ArrayList<Campo>();
			this.camposAux = new ArrayList<Campo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic=new CampoLogic();
				this.campoLogic.getNewConnexionToDeep("");
			}
			
			//this.campoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.campoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCampo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCampo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCampo);	
					}
					
					if(this.jInternalFrameImportacionCampo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCampo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCampo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCampo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCampo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCampo);
				this.jInternalFrameDetalleFormCampo.setVisible(false);
				this.jInternalFrameDetalleFormCampo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCampo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCampo);
					this.jInternalFrameReporteDinamicoCampo.setVisible(false);
					this.jInternalFrameReporteDinamicoCampo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCampo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCampo);
					this.jInternalFrameImportacionCampo.setVisible(false);
					this.jInternalFrameImportacionCampo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCampo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCampo);
					this.jInternalFrameOrderByCampo.setVisible(false);
					this.jInternalFrameOrderByCampo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCampoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CampoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.campoReturnGeneral=new CampoParameterReturnGeneral();
			
			this.campoParameterGeneral=new CampoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.campoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.campoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CampoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.campoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PerfilCampoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CampoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.campoSessionBean.getEsGuardarRelacionado(),this.campoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CampoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.campoSessionBean.getEsGuardarRelacionado(),this.campoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCampo=false;
			this.isVisibilidadCeldaDuplicarCampo=true;
			this.isVisibilidadCeldaCopiarCampo=true;
			this.isVisibilidadCeldaVerFormCampo=true;
			this.isVisibilidadCeldaOrdenCampo=true;
			this.isVisibilidadCeldaNuevoRelacionesCampo=false;
			this.isVisibilidadCeldaModificarCampo=false;
			this.isVisibilidadCeldaActualizarCampo=false;
			this.isVisibilidadCeldaEliminarCampo=false;
			this.isVisibilidadCeldaCancelarCampo=false;
			this.isVisibilidadCeldaGuardarCampo=false;
			this.isVisibilidadCeldaGuardarCambiosCampo=false;
			
			
			this.isVisibilidadFK_IdOpcion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCampo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCampo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCampo(false);
			
			this.setPermisosUsuarioCampo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.campoSessionBean.getEsGuardarRelacionado() 
				|| (this.campoSessionBean.getEsGuardarRelacionado() && this.campoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCampoClasesRelacionadas();
			}
			
			if(this.campoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCampoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CampoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCampo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCampo();
			}
			
			if(!this.isPermisoBusquedaCampo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCampo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.campoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCampo,this.isPermisoPaginacionMedioCampo,this.isPermisoPaginacionTodoCampo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CampoConstantesFunciones.getTiposSeleccionarCampo());
				
				this.tiposColumnasSelect=CampoConstantesFunciones.getTiposSeleccionarCampo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectCampo();				
				//this.tiposRelacionesSelect=CampoConstantesFunciones.getTiposRelacionesCampo(true);
				
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
			//if(!this.campoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCampo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCampo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCampo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCampo() ;
			
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
			
			
			this.perfilcampoLogic=new PerfilCampoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.opcionLogic=new OpcionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				campoImplementable= (CampoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CampoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				campoImplementableHome= (CampoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CampoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.campos= new ArrayList<Campo>();
			this.camposEliminados= new ArrayList<Campo>();
						
			this.isEsNuevoCampo=false;
			this.esParaAccionDesdeFormularioCampo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.opcionsForeignKey=new ArrayList<Opcion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCampo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCampo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.campoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CampoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CampoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCampo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCampo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCampo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCampo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCampo();
			}
			
			CampoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCampo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCampo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCampo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCampo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Campo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCampo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PerfilCampoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PerfilCampoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCampo")) {
				iIndex=this.jInternalFrameDetalleFormCampo.jTabbedPaneRelacionesCampo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCampo.jTabbedPaneRelacionesCampo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCampo.getSelectedRow();	
				
				

				if(sTitle.equals("Perfil Campos")) {
					if(!PerfilCampoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCampo();

						this.cargarParteTabPanelRelacionadaPerfilCampo(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCampo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaPerfilCampo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCampo.cargarSessionConBeanSwingJInternalFramePerfilCampo(false,true,iIndex);
		this.jButtonPerfilCampoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPerfilCampo();

		//this.jTabbedPaneRelacionesCampo.updateUI();
		//this.jTabbedPaneRelacionesCampo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCampo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("PerfilCampo")) {
				int row=this.jTableDatosCampo.getSelectedRow();
				jButtonPerfilCampoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.campoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Perfil Campo")) {

					if(this.isTienePermisosPerfilCampo && this.campoConstantesFunciones.mostrarPerfilCampoCampo && !CampoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Perfil Campos"+"("+PerfilCampoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Perfil Campos");

						if(campoConstantesFunciones.resaltarPerfilCampoCampo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(campoConstantesFunciones.resaltarPerfilCampoCampo);
						}

						jmenuItem.setEnabled(this.campoConstantesFunciones.activarPerfilCampoCampo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PerfilCampo"));

						

						this.jInternalFrameDetalleFormCampo.jmenuDetalleCampo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyCampo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCampo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCampo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCampoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCampo();
		
		this.cargarCombosFrameForeignKeyCampo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCampo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCampo();
		}
	}
	
	

	public void cargarCombosForeignKeyOpcion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyOpcionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyOpcion();
				this.cargarCombosFrameOpcionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaOpcion(this.opcionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCampoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.campoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCampo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
			
			
			if(jTableDatosCampo.getRowCount()>=1) {
				jTableDatosCampo.removeRowSelectionInterval(0, jTableDatosCampo.getRowCount()-1);						
			}
			
			this.isEsNuevoCampo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCampo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCampo(true);			
			//this.campo=new Campo();
			//this.campo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCampo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCampo() ;
			
			if(CampoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCampo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.campo);	
			this.actualizarInformacion("INFO_PADRE",false,this.campo);				
			
			CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
			
			if(this.campoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Campo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCampoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Campo> camposSeleccionados=new ArrayList<Campo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCampo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCampo.getSelectedRows().length;			
			}
			
			camposSeleccionados=this.getCamposSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCampo--;			
				//Campo campoAux= new Campo();			
				//campoAux.setId(this.iIdNuevoCampo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Campo campoOrigen=new Campo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Campo campoOrigen : camposSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCampo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							campoOrigen =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							campoOrigen =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCampo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.campo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCampo(campoOrigen,this.campo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.campoLogic.getCampos().add(this.campoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.campos.add(this.campoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCampo(false);
				
				this.jTableDatosCampo.setRowSelectionInterval(this.getIndiceNuevoCampo(), this.getIndiceNuevoCampo());
				
				int iLastRow =  this.jTableDatosCampo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCampo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCampo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCampo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Campo> camposSeleccionados=new ArrayList<Campo>();									
		
			Campo campoOrigen=new Campo();
			Campo campoDestino=new Campo();
				
			camposSeleccionados=this.getCamposSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCampo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || camposSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCampo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						campoOrigen =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						campoOrigen =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						campoDestino =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						campoDestino =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				campoOrigen =camposSeleccionados.get(0);
				campoDestino =camposSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCampo(campoOrigen,campoDestino,true,false);
				
				campoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(campoDestino,campoLogic.getCampos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(campoDestino,campos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCampo(false);
				
				//this.jTableDatosCampo.setRowSelectionInterval(this.getIndiceNuevoCampo(), this.getIndiceNuevoCampo());
				
				int iLastRow =  this.jTableDatosCampo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCampo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCampo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCampo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCampo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCampo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCampo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCampo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCampo.setVisible(!isVisible);
			this.jPanelPaginacionCampo.setVisible(!isVisible);
			this.jPanelAccionesCampo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCampo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCampo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCampo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCampo();
			
			this.abrirFrameOrderByCampo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCampo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCampo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCampo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCampo.isMaximum()) {
					this.jInternalFrameDetalleFormCampo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCampo.setSize(this.jInternalFrameDetalleFormCampo.iWidthFormulario,this.jInternalFrameDetalleFormCampo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCampo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCampo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCampo.isMaximum()) {
						this.jInternalFrameDetalleFormCampo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCampo.jContentPaneDetalleCampo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCampo.jTabbedPaneRelacionesCampo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCampo.jContentPaneDetalleCampo.getWidth(),CampoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCampo.jTabbedPaneRelacionesCampo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCampo.jContentPaneDetalleCampo.getWidth(),CampoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCampo.jTabbedPaneRelacionesCampo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCampo.jContentPaneDetalleCampo.getWidth(),CampoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(PerfilCampoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPerfilCampo();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCampo.setVisible(true);
	        this.jInternalFrameDetalleFormCampo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCampo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCampo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCampo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCampo,false,this);
				} else {
					this.jInternalFrameOrderByCampo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCampo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCampo);
				this.jInternalFrameOrderByCampo.setVisible(false);
				this.jInternalFrameOrderByCampo.setSelected(false);
				
				this.jInternalFrameOrderByCampo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCampo"));
				
				this.inicializarActualizarBindingTablaOrderByCampo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCampo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCampo==null) {
				
				this.jInternalFrameImportacionCampo=new ImportacionJInternalFrame(CampoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCampo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCampo);
				this.jInternalFrameImportacionCampo.setVisible(false);
				this.jInternalFrameImportacionCampo.setSelected(false);


				this.jInternalFrameImportacionCampo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCampo"));
				this.jInternalFrameImportacionCampo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCampo"));
				this.jInternalFrameImportacionCampo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCampo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCampo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCampo==null) {
				this.jInternalFrameReporteDinamicoCampo=new ReporteDinamicoJInternalFrame(CampoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCampo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCampo);
				this.jInternalFrameReporteDinamicoCampo.setVisible(false);
				this.jInternalFrameReporteDinamicoCampo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCampo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCampo"));
				this.jInternalFrameReporteDinamicoCampo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCampo"));
				this.jInternalFrameReporteDinamicoCampo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCampo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCampo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaPerfilCampo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.jScrollPanelDatosPerfilCampo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCampo.jContentPaneDetalleCampo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.jScrollPanelDatosPerfilCampo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.jScrollPanelDatosPerfilCampo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.jScrollPanelDatosPerfilCampo.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleCampo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCampo);
			
	       	this.jInternalFrameDetalleFormCampo.setVisible(false);
	        this.jInternalFrameDetalleFormCampo.setSelected(false);
			
			//this.jInternalFrameDetalleFormCampo.dispose();
			//this.jInternalFrameDetalleFormCampo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCampo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCampo.setVisible(true);
	        this.jInternalFrameReporteDinamicoCampo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCampo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCampo.setVisible(true);
	        this.jInternalFrameImportacionCampo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCampo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCampo.setVisible(true);
	        this.jInternalFrameOrderByCampo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCampo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCampo.setVisible(false);
	        this.jInternalFrameOrderByCampo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCampo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCampo.setVisible(false);
	        this.jInternalFrameReporteDinamicoCampo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCampo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCampo.setVisible(false);
	        this.jInternalFrameImportacionCampo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeOpcion(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeOpcion);
						OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame=new OpcionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						opcionBeanSwingJInternalFrame.setJInternalFrameParent(this);
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.sTipoBusqueda="Opcion";
						}

						opcionBeanSwingJInternalFrame.getTodosOpcionArbol();
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.setOpcions(opcionBeanSwingJInternalFrame.opcionsArbol);
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.CargarTreeOpcion();
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.setVisible(true);
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.jInternalFrameParent=this;
						TitledBorder titledBorderCampo=(TitledBorder)this.jScrollPanelDatosCampo.getBorder();
						TitledBorder titledBorderOpcion=(TitledBorder)opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.getBorder();

						titledBorderOpcion.setTitle(titledBorderCampo.getTitle() + " -> Opcion");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,opcionBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(opcionBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeOpcion(OpcionBeanSwingJInternalFrame jInternalFrameTreeOpcion) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeOpcion);
						jInternalFrameTreeOpcion.setVisible(false);
						jInternalFrameTreeOpcion.setSelected(false);
						//jInternalFrameTreeOpcion.dispose();
						//jInternalFrameTreeOpcion=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCampo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCampo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCampo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCampo(true);
			//this.isEsNuevoCampo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campo =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.campo =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCampo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCampo(false) ;
			
			if(campoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoSessionBean.getEsGuardarRelacionado() && PerfilCampoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPerfilCampoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(CampoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCampo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCampo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCampoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCampo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campo =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.campo =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCampo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCampo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCampo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCampo(true);
			//this.isEsNuevoCampo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campo =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.campo =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.campo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCampo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCampo(false) ;
			
			if(CampoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCampo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCampo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaOpcion(List<Opcion> opcionsForeignKey)throws Exception{
		TableColumn tableColumnOpcion=this.jTableDatosCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCampo,CampoConstantesFunciones.LABEL_IDOPCION));
		TableCellEditor tableCellEditorOpcion =tableColumnOpcion.getCellEditor();

		OpcionTableCell opcionTableCellFk=(OpcionTableCell)tableCellEditorOpcion;

		if(opcionTableCellFk!=null) {
			opcionTableCellFk.setopcionsForeignKey(opcionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCampo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//opcionTableCellFk.setRowActual(intSelectedRow);
			//opcionTableCellFk.setopcionsForeignKeyActual(opcionsForeignKey);
		//}


		if(opcionTableCellFk!=null) {
			opcionTableCellFk.RecargarOpcionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCampoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCampo(false);
			
			//if(!this.isEsNuevoCampo) {								
				int intSelectedRow = this.jTableDatosCampo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campo =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.campo =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCampo(this.campo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);
				
			}
			
			if(this.permiteMantenimiento(this.campo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.campoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCampo=true;
					this.inicializarActualizarBindingTablaCampo(false);
					this.isEsNuevoCampo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCampo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCampo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCampo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCampo(false);
				
				this.habilitarDeshabilitarControlesCampo(false);
			
												
				
				if(CampoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCampo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCampoActionPerformed(evt,campoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCampo(this.campo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCampo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,campoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.campo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Campo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Campo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCampoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCampo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campo =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				this.campo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.campo =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				this.campo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.campo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.campoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CampoModel) this.jTableDatosCampo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCampo=true;
				this.inicializarActualizarBindingTablaCampo(false);
				this.isEsNuevoCampo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCampo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCampo(false);
				
				this.habilitarDeshabilitarControlesCampo(false);
				
				
				
				if(CampoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCampo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCampoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCampo.getRowCount()>=1) {
				jTableDatosCampo.removeRowSelectionInterval(0, jTableDatosCampo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCampo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCampo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCampo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCampo(false) ;
			
			this.isEsNuevoCampo=false;
			
			if(CampoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCampo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCampoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCampo(false);
				
				//SI ES MANUAL
				if(CampoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCampo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCampoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCampo--;			
			//Campo campoAux= new Campo();			
			//campoAux.setId(this.iIdNuevoCampo);
			
			if(this.jInternalFrameDetalleFormCampo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCampo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);
			
			this.campo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.campoLogic.getCampos().add(this.campoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.campos.add(this.campoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCampo(false);
			
			this.jTableDatosCampo.setRowSelectionInterval(this.getIndiceNuevoCampo(), this.getIndiceNuevoCampo());
			
			int iLastRow =  this.jTableDatosCampo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCampo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCampo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCampo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCampoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCampo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCampo(false);
			
			//SI ES MANUAL
			if(CampoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCampo();
			}
			
			//this.abrirFrameTreeCampo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCampoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE CampoS ?", "MANTENIMIENTO DE Campo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCampo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCampo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.campoReturnGeneral=campoLogic.procesarImportacionCamposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.campoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCampoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCampoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCampo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCampo.setFileImportacion(this.jInternalFrameImportacionCampo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCampo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCampo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCampo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCampo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCampoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Campo> camposSeleccionados=new ArrayList<Campo>();		

		camposSeleccionados=this.getCamposSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCampo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCampo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CampoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CampoBaseDesign.jrxml";
			
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
			
			this.generarReporteCampos("Todos",camposSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.campoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Campo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCampo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCampo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CampoConstantesFunciones.LABEL_IDOPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Opcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Opcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Opcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Opcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CampoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CampoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CampoConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CampoConstantesFunciones.LABEL_ESTADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tado_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCampo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCampo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCampo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CampoConstantesFunciones.LABEL_IDOPCION:
					sNombreCampoCategoria="id_opcion";
					break;

				case CampoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CampoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CampoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case CampoConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCampo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CampoConstantesFunciones.LABEL_IDOPCION:
					sNombreCampoCategoriaValor="id_opcion";
					break;

				case CampoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CampoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CampoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case CampoConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoriaValor="estado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCampo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCampo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CampoConstantesFunciones.LABEL_IDOPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Opcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_opcion");
					break;

				case CampoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CampoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CampoConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case CampoConstantesFunciones.LABEL_ESTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"estado");
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
	
	public void jButtonGenerarExcelReporteDinamicoCampoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Campo> camposSeleccionados=new ArrayList<Campo>();		
		
		camposSeleccionados=this.getCamposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"campo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Campos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCampo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCampo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CampoConstantesFunciones.LABEL_IDOPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CampoConstantesFunciones.LABEL_IDOPCION);
					iRow++;

					for(Campo campo:camposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(campo.getopcion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CampoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CampoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Campo campo:camposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(campo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CampoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CampoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Campo campo:camposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(campo.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CampoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CampoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Campo campo:camposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(campo.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CampoConstantesFunciones.LABEL_ESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CampoConstantesFunciones.LABEL_ESTADO);
					iRow++;

					for(Campo campo:camposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(campo.getestado());
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
			//	this.getFilaCabeceraExportarExcelCampo(row);				
			//	iRow++;
			//}				
			
			//for(Campo campoAux:camposSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCampo(campoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.campoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Campo",JOptionPane.INFORMATION_MESSAGE);
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
				this.campoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCampo(false);
			
			//SI ES MANUAL
			if(CampoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCampo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCampoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCampo(false);
			
			//SI ES MANUAL
			if(CampoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCampo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCampoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCampo(false);
			
			//SI ES MANUAL
			if(CampoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCampo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCampo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCampo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCampo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCampo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCampo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCampo.setMinimumSize(dimensionMinimum);
		this.jTableDatosCampo.setMaximumSize(dimensionMaximum);
		this.jTableDatosCampo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCampo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCampo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCampo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCampo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCampo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.campoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCampo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCampo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCampo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CampoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CampoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCampo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCampo();
		
		this.inicializarActualizarBindingBotonesManualCampo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.campoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCampo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCampo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCampo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCampo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCampo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCampo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCampo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCampo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCampo.jCheckBoxPostAccionNuevoCampo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCampo.jCheckBoxPostAccionSinCerrarCampo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCampo.jCheckBoxPostAccionSinMensajeCampo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCampo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCampo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCampo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCampo!=null) {
				this.jInternalFrameDetalleFormCampo.jCheckBoxPostAccionNuevoCampo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCampo.jCheckBoxPostAccionSinCerrarCampo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCampo.jCheckBoxPostAccionSinMensajeCampo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCampo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCampo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCampo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCampo.jComboBoxTiposAccionesFormularioCampo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCampo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCampo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCampo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCampo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCampo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCampo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCampo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCampo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCampo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCampo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCampo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCampo(Boolean esInicializar) throws Exception {
		try	{	
			if(CampoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCampo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCampo() throws Exception {
		try	{
			if(CampoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCampo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCampo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCampo.jComboBoxTiposAccionesFormularioCampo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCampo.jComboBoxTiposAccionesFormularioCampo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCampo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCampo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCampo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCampo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCampo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCampo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCampo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCampo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCampo.addItem(reporte);
			}
			
			
			if(!this.campoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCampo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCampo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCampo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCampo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCampo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCampo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCampo.jComboBoxTiposAccionesFormularioCampo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCampo.jComboBoxTiposAccionesFormularioCampo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCampo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCampo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCampo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCampo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCampo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCampo!=null) {
				this.jInternalFrameReporteDinamicoCampo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCampo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCampo!=null) {
				this.jInternalFrameReporteDinamicoCampo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCampo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCampo!=null) {
				
				if(this.jInternalFrameReporteDinamicoCampo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCampo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCampo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCampo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCampo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCampo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCampo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_opcionFK_IdOpcionCampo.getSelectedItem()!=null){this.id_opcionFK_IdOpcion=((Opcion)this.jComboBoxid_opcionFK_IdOpcionCampo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCampo(Boolean esInicializar) throws Exception {				
		if(CampoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCampo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCampo() throws Exception {
		this.inicializarActualizarBindingTablaCampo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCampo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCampo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCampo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCampo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CampoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCampo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCampo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CampoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCampoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCampoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CampoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCampo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCampo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CampoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCampo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCampo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=campoLogic.getCampos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=campos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCampo.setModel(new CampoModel(this.campoLogic.getCampos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCampo.setModel(new CampoModel(this.campos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCampo!=null && this.jInternalFrameOrderByCampo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCampo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCampo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CampoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CampoConstantesFunciones.SCLASSWEBTITULO,campoConstantesFunciones.resaltarSeleccionarCampo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CampoConstantesFunciones.SCLASSWEBTITULO,campoConstantesFunciones.resaltarSeleccionarCampo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCampo,CampoConstantesFunciones.LABEL_ID));

		if(this.campoConstantesFunciones.mostraridCampo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CampoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.campoConstantesFunciones.resaltaridCampo,this.campoConstantesFunciones.activaridCampo,this,true,"idCampo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.campoConstantesFunciones.resaltaridCampo,this.campoConstantesFunciones.activaridCampo,this,true,"idCampo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCampo,CampoConstantesFunciones.LABEL_IDOPCION));

		if(this.campoConstantesFunciones.mostrarid_opcionCampo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CampoConstantesFunciones.LABEL_IDOPCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new OpcionTableCell(this.opcionsForeignKey,this.campoConstantesFunciones.resaltarid_opcionCampo,this,this.campoConstantesFunciones.activarid_opcionCampo));
			tableColumn.setCellEditor(new OpcionTableCell(this.opcionsForeignKey,this.campoConstantesFunciones.resaltarid_opcionCampo,this,this.campoConstantesFunciones.activarid_opcionCampo,true,"id_opcionCampo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CampoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCampo,CampoConstantesFunciones.LABEL_CODIGO));

		if(this.campoConstantesFunciones.mostrarcodigoCampo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CampoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.campoConstantesFunciones.resaltarcodigoCampo,this.campoConstantesFunciones.activarcodigoCampo,this,true,"codigoCampo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.campoConstantesFunciones.resaltarcodigoCampo,this.campoConstantesFunciones.activarcodigoCampo,this,true,"codigoCampo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CampoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCampo,CampoConstantesFunciones.LABEL_NOMBRE));

		if(this.campoConstantesFunciones.mostrarnombreCampo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CampoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.campoConstantesFunciones.resaltarnombreCampo,this.campoConstantesFunciones.activarnombreCampo,this,true,"nombreCampo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.campoConstantesFunciones.resaltarnombreCampo,this.campoConstantesFunciones.activarnombreCampo,this,true,"nombreCampo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CampoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCampo,CampoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.campoConstantesFunciones.mostrardescripcionCampo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CampoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.campoConstantesFunciones.resaltardescripcionCampo,this.campoConstantesFunciones.activardescripcionCampo,this,true,"descripcionCampo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.campoConstantesFunciones.resaltardescripcionCampo,this.campoConstantesFunciones.activardescripcionCampo,this,true,"descripcionCampo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CampoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCampo,CampoConstantesFunciones.LABEL_ESTADO));

		if(this.campoConstantesFunciones.mostrarestadoCampo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CampoConstantesFunciones.LABEL_ESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.campoConstantesFunciones.resaltarestadoCampo,this.campoConstantesFunciones.activarestadoCampo));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.campoConstantesFunciones.resaltarestadoCampo,this.campoConstantesFunciones.activarestadoCampo,this,true,"estadoCampo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CampoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.campoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPerfilCampo && this.campoConstantesFunciones.mostrarPerfilCampoCampo && !CampoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Perfil Campos");
				tableColumn.setHeaderValue("Perfil Campos");
				tableColumn.setCellRenderer(new PerfilCampoTableCell(campoConstantesFunciones.resaltarPerfilCampoCampo,this,this.campoConstantesFunciones.activarPerfilCampoCampo));
				tableColumn.setCellEditor(new PerfilCampoTableCell(campoConstantesFunciones.resaltarPerfilCampoCampo,this,this.campoConstantesFunciones.activarPerfilCampoCampo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCampo.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.campoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.campoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCampo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.campoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.campoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCampo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCampo && this.isPermisoGuardarCambiosCampo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.campoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.campoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCampo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.campoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosCampo.addColumn(tableColumn);
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
			
			this.jTableDatosCampo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCampo && this.isPermisoGuardarCambiosCampo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.campoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCampo && this.isPermisoGuardarCambiosCampo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCampo.moveColumn(this.jTableDatosCampo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCampo.moveColumn(this.jTableDatosCampo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.campoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosCampo.moveColumn(this.jTableDatosCampo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCampo.moveColumn(this.jTableDatosCampo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCampo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCampo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCampo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCampo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCampo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCampo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCampo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCampo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=campoLogic.getCampos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=campos.size()-1;
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
		//this.jTableDatosCampo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCampo();
			
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
				
				//this.isEsNuevoCampo=false;
					
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
			
				if(this.campoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCampo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCampo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCampo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campo =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.campo =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.campo.getsType().equals("DUPLICADO")
				   || this.campo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCampo=true;
				
				} else {
					this.isEsNuevoCampo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.campoSessionBean.getEsGuardarRelacionado()) {
					if(this.campo.getId()>=0 && !this.campo.getIsNew()) {						
						this.isEsNuevoCampo=false;
						
					} else {
						this.isEsNuevoCampo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCampo(esRelaciones);						
				
				this.seleccionarCampo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.campo.getId()<0) {
					this.isEsNuevoCampo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCampo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCampo(evt,rowIndex);
				}	
				
				if(this.campoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Campo: " + this.dDif); 
					}
				}								
				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCampo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.campo)) {
					if(this.campo.getId()>0) {
						this.campo.setIsDeleted(true);
						
						this.camposEliminados.add(this.campo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.campoLogic.getCampos().remove(this.campo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.campos.remove(this.campo);				
					}
					
					
					((CampoModel) this.jTableDatosCampo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCampo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCampo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCampo) {
			
			if(this.jInternalFrameDetalleFormCampo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCampo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCampo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campo =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.campo =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCampo(this.campo);
				}
				
				//ARCHITECTURE
				try {
					

					//Opcion
					if(!this.campoConstantesFunciones.cargarid_opcionCampo || this.campoConstantesFunciones.event_dependid_opcionCampo) {
						//this.cargarCombosOpcionsForeignKeyLista(" where id="+this.campo.getid_opcion());
									//this.inicializarActualizarBindingCampo(false,false);
						this.opcionsForeignKey=new ArrayList<Opcion>();

						if(campo.getOpcion()!=null) {
							this.opcionsForeignKey.add(campo.getOpcion());
						}

						this.addItemDefectoCombosForeignKeyOpcion();
						this.cargarCombosFrameOpcionsForeignKey("Todos");
					}
					this.setActualOpcionForeignKey(this.campo.getid_opcion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCampo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCampo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCampo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCampo(Campo campo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCampo(campo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCampo(Campo campo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCampo(campo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCampo(campo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCampo(campo);
	}
	
	public void setVariablesObjetoActualToFormularioCampo(Campo campo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCampo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCampo.jLabelidCampo.setText(campo.getId().toString());
			this.jInternalFrameDetalleFormCampo.jTextFieldcodigoCampo.setText(campo.getcodigo());
			this.jInternalFrameDetalleFormCampo.jTextAreanombreCampo.setText(campo.getnombre());
			this.jInternalFrameDetalleFormCampo.jTextAreadescripcionCampo.setText(campo.getdescripcion());
			this.jInternalFrameDetalleFormCampo.jCheckBoxestadoCampo.setSelected(campo.getestado());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Campo campoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,campoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Campo campoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				campoLocal=this.campo;
			} else {
				campoLocal=this.campoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(campoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCampo(campoLocal,true);
					
					if(campoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(campoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.campoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(campoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCampo(Campo campo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCampo(campo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCampo(campo);
	}
	
	public void setVariablesFormularioToObjetoActualCampo(Campo campo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCampo(campo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCampo(Campo campo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCampo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCampo.jLabelidCampo.getText()==null || this.jInternalFrameDetalleFormCampo.jLabelidCampo.getText()=="" || this.jInternalFrameDetalleFormCampo.jLabelidCampo.getText()=="Id") {
				this.jInternalFrameDetalleFormCampo.jLabelidCampo.setText("0");
			}

			if(conColumnasBase) {campo.setId(Long.parseLong(this.jInternalFrameDetalleFormCampo.jLabelidCampo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CampoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCampo.jLabelIdCampo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			campo.setcodigo(this.jInternalFrameDetalleFormCampo.jTextFieldcodigoCampo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CampoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCampo.jLabelcodigoCampo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			campo.setnombre(this.jInternalFrameDetalleFormCampo.jTextAreanombreCampo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CampoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCampo.jLabelnombreCampo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			campo.setdescripcion(this.jInternalFrameDetalleFormCampo.jTextAreadescripcionCampo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CampoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCampo.jLabeldescripcionCampo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			campo.setestado(this.jInternalFrameDetalleFormCampo.jCheckBoxestadoCampo.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CampoConstantesFunciones.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCampo.jLabelestadoCampo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCampo(Campo campoBean,Campo campo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && campoBean.getid_opcion()!=null && !campoBean.getid_opcion().equals(-1L))) {campo.setid_opcion(campoBean.getid_opcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCampo(Campo campoOrigen,Campo campo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && campoOrigen.getId()!=null && !campoOrigen.getId().equals(0L))) {campo.setId(campoOrigen.getId());}}
			if(conDefault || (!conDefault && campoOrigen.getid_opcion()!=null && !campoOrigen.getid_opcion().equals(-1L))) {campo.setid_opcion(campoOrigen.getid_opcion());}
			if(conDefault || (!conDefault && campoOrigen.getcodigo()!=null && !campoOrigen.getcodigo().equals(""))) {campo.setcodigo(campoOrigen.getcodigo());}
			if(conDefault || (!conDefault && campoOrigen.getnombre()!=null && !campoOrigen.getnombre().equals(""))) {campo.setnombre(campoOrigen.getnombre());}
			if(conDefault || (!conDefault && campoOrigen.getdescripcion()!=null && !campoOrigen.getdescripcion().equals(""))) {campo.setdescripcion(campoOrigen.getdescripcion());}
			if(conDefault || (!conDefault && campoOrigen.getestado()!=null && !campoOrigen.getestado().equals(false))) {campo.setestado(campoOrigen.getestado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCampo(Campo campo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCampo.jLabelidCampo.setText(campo.getId().toString());
			this.jInternalFrameDetalleFormCampo.jTextFieldcodigoCampo.setText(campo.getcodigo());
			this.jInternalFrameDetalleFormCampo.jTextAreanombreCampo.setText(campo.getnombre());
			this.jInternalFrameDetalleFormCampo.jTextAreadescripcionCampo.setText(campo.getdescripcion());
			this.jInternalFrameDetalleFormCampo.jCheckBoxestadoCampo.setSelected(campo.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCampo(CampoBean campoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCampo.jLabelidCampo.setText(campoBean.getId().toString());
			this.jInternalFrameDetalleFormCampo.jTextFieldcodigoCampo.setText(campoBean.getcodigo());
			this.jInternalFrameDetalleFormCampo.jTextAreanombreCampo.setText(campoBean.getnombre());
			this.jInternalFrameDetalleFormCampo.jTextAreadescripcionCampo.setText(campoBean.getdescripcion());
			this.jInternalFrameDetalleFormCampo.jCheckBoxestadoCampo.setSelected(campoBean.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCampo(CampoParameterReturnGeneral campoReturnGeneral,CampoBean campoBean,Boolean conDefault) throws Exception { 
		try {
			Campo campoLocal=new Campo();
			
			campoLocal=campoReturnGeneral.getCampo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && campoLocal.getId()!=null && !campoLocal.getId().equals(0L))) {campoBean.setId(campoLocal.getId());}}
			if(conDefault || (!conDefault && campoLocal.getid_opcion()!=null && !campoLocal.getid_opcion().equals(-1L))) {campoBean.setid_opcion(campoLocal.getid_opcion());}
			if(conDefault || (!conDefault && campoLocal.getcodigo()!=null && !campoLocal.getcodigo().equals(""))) {campoBean.setcodigo(campoLocal.getcodigo());}
			if(conDefault || (!conDefault && campoLocal.getnombre()!=null && !campoLocal.getnombre().equals(""))) {campoBean.setnombre(campoLocal.getnombre());}
			if(conDefault || (!conDefault && campoLocal.getdescripcion()!=null && !campoLocal.getdescripcion().equals(""))) {campoBean.setdescripcion(campoLocal.getdescripcion());}
			if(conDefault || (!conDefault && campoLocal.getestado()!=null && !campoLocal.getestado().equals(false))) {campoBean.setestado(campoLocal.getestado());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCampoGenerico(Long idCampoSeleccionado,JComboBox jComboBoxCampo,List<Campo> camposLocal)throws Exception {
		try {
			Campo  campoTemp=null;

			for(Campo campoAux:camposLocal) {
				if(campoAux.getId()!=null && campoAux.getId().equals(idCampoSeleccionado)) {
					campoTemp=campoAux;
					break;
				}
			}

			jComboBoxCampo.setSelectedItem(campoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCampoGenerico(JComboBox jComboBoxCampo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCampo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCampo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCampo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCampo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("PerfilCampo")) {
			jButtonPerfilCampoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			campo=(Campo) campoLogic.getCampos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			campo =(Campo) campos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Opcion")) {
			//sDescripcion=this.getActualOpcionForeignKeyDescripcion((Long)value);
			if(!campo.getIsNew() && !campo.getIsChanged() && !campo.getIsDeleted()) {
				sDescripcion=campo.getopcion_descripcion();
			} else {
				//sDescripcion=this.getActualOpcionForeignKeyDescripcion((Long)value);
				sDescripcion=campo.getopcion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Campo campoRow=new Campo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			campoRow=(Campo) campoLogic.getCampos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			campoRow=(Campo) campos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPerfilCampoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Campo campo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCampo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.campo = (Campo)this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.campo = (Campo)this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(campo!=null) {
						this.campo = campo;
					} else {
						this.campo = new Campo();
					}
				}

				if(this.isTienePermisosPerfilCampo && this.permiteMantenimiento(this.campo)) {
					PerfilCampoBeanSwingJInternalFrame perfilcampoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFramePopup=new PerfilCampoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						perfilcampoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFramePopup;
					} else {
						perfilcampoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame;
					}

					List<Campo> campos=new ArrayList<Campo>();
					campos.add(this.campo);
					if(!esRelacionado) {
						//perfilcampoBeanSwingJInternalFrame.perfilcampoSessionBean.setConGuardarRelaciones(false);
						//perfilcampoBeanSwingJInternalFrame.perfilcampoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					perfilcampoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCampo.cargarPerfilCampoBeanSwingJInternalFrame(campos,this.campo,perfilcampoBeanSwingJInternalFrame,/*conInicializar,*/perfilcampoBeanSwingJInternalFrame.perfilcampoSessionBean.getConGuardarRelaciones(),perfilcampoBeanSwingJInternalFrame.perfilcampoSessionBean.getEsGuardarRelacionado());
					perfilcampoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						perfilcampoBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilCampo("no_relacionado");

						perfilcampoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PerfilCampoConstantesFunciones.ITAMANIOFILATABLA + (PerfilCampoConstantesFunciones.ITAMANIOFILATABLA/2));

						perfilcampoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCampo=(TitledBorder)this.jScrollPanelDatosCampo.getBorder();
						TitledBorder titledBorderPerfilCampo=(TitledBorder)perfilcampoBeanSwingJInternalFrame.jScrollPanelDatosPerfilCampo.getBorder();

						titledBorderPerfilCampo.setTitle(titledBorderCampo.getTitle() + " -> Perfil Campo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,perfilcampoBeanSwingJInternalFrame);
						}

						perfilcampoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(perfilcampoBeanSwingJInternalFrame);

						perfilcampoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.campoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Perfil Campo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCampo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCampo.setVisible((this.isVisibilidadCeldaNuevoCampo && this.isPermisoNuevoCampo));			
			this.jButtonDuplicarCampo.setVisible((this.isVisibilidadCeldaDuplicarCampo && this.isPermisoDuplicarCampo));			
			this.jButtonCopiarCampo.setVisible((this.isVisibilidadCeldaCopiarCampo && this.isPermisoCopiarCampo));
			this.jButtonVerFormCampo.setVisible((this.isVisibilidadCeldaVerFormCampo && this.isPermisoVerFormCampo));
			
			this.jButtonAbrirOrderByCampo.setVisible((this.isVisibilidadCeldaOrdenCampo && this.isPermisoOrdenCampo));			
			
			this.jButtonNuevoRelacionesCampo.setVisible((this.isVisibilidadCeldaNuevoRelacionesCampo && this.isPermisoNuevoCampo));			
			this.jButtonNuevoGuardarCambiosCampo.setVisible((this.isVisibilidadCeldaNuevoCampo && this.isPermisoNuevoCampo && this.isPermisoGuardarCambiosCampo));
			
			if(this.jInternalFrameDetalleFormCampo!=null) {
			this.jInternalFrameDetalleFormCampo.jButtonModificarCampo.setVisible((this.isVisibilidadCeldaModificarCampo && this.isPermisoActualizarCampo));	
			this.jInternalFrameDetalleFormCampo.jButtonActualizarCampo.setVisible((this.isVisibilidadCeldaActualizarCampo && this.isPermisoActualizarCampo));	
			this.jInternalFrameDetalleFormCampo.jButtonEliminarCampo.setVisible((this.isVisibilidadCeldaEliminarCampo && this.isPermisoEliminarCampo));
			this.jInternalFrameDetalleFormCampo.jButtonCancelarCampo.setVisible(this.isVisibilidadCeldaCancelarCampo);							
			this.jInternalFrameDetalleFormCampo.jButtonGuardarCambiosCampo.setVisible((this.isVisibilidadCeldaGuardarCampo && this.isPermisoGuardarCambiosCampo));			
			
			}
						
			this.jButtonGuardarCambiosTablaCampo.setVisible((this.isVisibilidadCeldaGuardarCambiosCampo && this.isPermisoGuardarCambiosCampo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCampo.setVisible((this.isVisibilidadCeldaNuevoCampo && this.isPermisoNuevoCampo));						
			this.jButtonDuplicarToolBarCampo.setVisible((this.isVisibilidadCeldaDuplicarCampo && this.isPermisoDuplicarCampo));						
			this.jButtonCopiarToolBarCampo.setVisible((this.isVisibilidadCeldaCopiarCampo && this.isPermisoCopiarCampo));			
			this.jButtonVerFormToolBarCampo.setVisible((this.isVisibilidadCeldaVerFormCampo && this.isPermisoVerFormCampo));			
			this.jButtonAbrirOrderByToolBarCampo.setVisible((this.isVisibilidadCeldaOrdenCampo && this.isPermisoOrdenCampo));
			this.jButtonNuevoRelacionesToolBarCampo.setVisible((this.isVisibilidadCeldaNuevoRelacionesCampo && this.isPermisoNuevoCampo));			
			this.jButtonNuevoGuardarCambiosToolBarCampo.setVisible((this.isVisibilidadCeldaNuevoCampo && this.isPermisoNuevoCampo && this.isPermisoGuardarCambiosCampo));			
			
			if(this.jInternalFrameDetalleFormCampo!=null) {
			this.jInternalFrameDetalleFormCampo.jButtonModificarToolBarCampo.setVisible((this.isVisibilidadCeldaModificarCampo && this.isPermisoActualizarCampo));	
			this.jInternalFrameDetalleFormCampo.jButtonActualizarToolBarCampo.setVisible((this.isVisibilidadCeldaActualizarCampo  && this.isPermisoActualizarCampo));	
			this.jInternalFrameDetalleFormCampo.jButtonEliminarToolBarCampo.setVisible((this.isVisibilidadCeldaEliminarCampo && this.isPermisoEliminarCampo));
			this.jInternalFrameDetalleFormCampo.jButtonCancelarToolBarCampo.setVisible(this.isVisibilidadCeldaCancelarCampo);				
			this.jInternalFrameDetalleFormCampo.jButtonGuardarCambiosToolBarCampo.setVisible((this.isVisibilidadCeldaGuardarCampo && this.isPermisoGuardarCambiosCampo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCampo.setVisible((this.isVisibilidadCeldaGuardarCambiosCampo && this.isPermisoGuardarCambiosCampo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCampo.setVisible((this.isVisibilidadCeldaNuevoCampo && this.isPermisoNuevoCampo));			
			this.jMenuItemDuplicarCampo.setVisible((this.isVisibilidadCeldaDuplicarCampo && this.isPermisoDuplicarCampo));			
			this.jMenuItemCopiarCampo.setVisible((this.isVisibilidadCeldaCopiarCampo && this.isPermisoCopiarCampo));			
			this.jMenuItemVerFormCampo.setVisible((this.isVisibilidadCeldaVerFormCampo && this.isPermisoVerFormCampo));			
			this.jMenuItemAbrirOrderByCampo.setVisible((this.isVisibilidadCeldaOrdenCampo && this.isPermisoOrdenCampo));			
			//this.jMenuItemMostrarOcultarCampo.setVisible((this.isVisibilidadCeldaOrdenCampo && this.isPermisoOrdenCampo));
			this.jMenuItemDetalleAbrirOrderByCampo.setVisible((this.isVisibilidadCeldaOrdenCampo && this.isPermisoOrdenCampo));			
			//this.jMenuItemDetalleMostrarOcultarCampo.setVisible((this.isVisibilidadCeldaOrdenCampo && this.isPermisoOrdenCampo));			
			this.jMenuItemNuevoRelacionesCampo.setVisible((this.isVisibilidadCeldaNuevoRelacionesCampo && this.isPermisoNuevoCampo));			
			this.jMenuItemNuevoGuardarCambiosCampo.setVisible((this.isVisibilidadCeldaNuevoCampo && this.isPermisoNuevoCampo && this.isPermisoGuardarCambiosCampo));									
			
			if(this.jInternalFrameDetalleFormCampo!=null) {
			this.jInternalFrameDetalleFormCampo.jMenuItemModificarCampo.setVisible((this.isVisibilidadCeldaModificarCampo && this.isPermisoActualizarCampo));	
			this.jInternalFrameDetalleFormCampo.jMenuItemActualizarCampo.setVisible((this.isVisibilidadCeldaActualizarCampo && this.isPermisoActualizarCampo));	
			this.jInternalFrameDetalleFormCampo.jMenuItemEliminarCampo.setVisible((this.isVisibilidadCeldaEliminarCampo && this.isPermisoEliminarCampo));
			this.jInternalFrameDetalleFormCampo.jMenuItemCancelarCampo.setVisible(this.isVisibilidadCeldaCancelarCampo);				
			}
			
			this.jMenuItemGuardarCambiosCampo.setVisible((this.isVisibilidadCeldaGuardarCampo && this.isPermisoGuardarCambiosCampo));						
			this.jMenuItemGuardarCambiosTablaCampo.setVisible((this.isVisibilidadCeldaGuardarCambiosCampo && this.isPermisoGuardarCambiosCampo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCampo=this.jButtonNuevoCampo.isVisible();
			this.isVisibilidadCeldaDuplicarCampo=this.jButtonDuplicarCampo.isVisible();
			this.isVisibilidadCeldaCopiarCampo=this.jButtonCopiarCampo.isVisible();
			this.isVisibilidadCeldaVerFormCampo=this.jButtonVerFormCampo.isVisible();
			
			this.isVisibilidadCeldaOrdenCampo=this.jButtonAbrirOrderByCampo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCampo=this.jButtonNuevoRelacionesCampo.isVisible();
			this.isVisibilidadCeldaModificarCampo=this.jButtonModificarCampo.isVisible();
			
			if(this.jInternalFrameDetalleFormCampo!=null) {
			this.isVisibilidadCeldaActualizarCampo=this.jInternalFrameDetalleFormCampo.jButtonActualizarCampo.isVisible();
			this.isVisibilidadCeldaEliminarCampo=this.jInternalFrameDetalleFormCampo.jButtonEliminarCampo.isVisible();
			this.isVisibilidadCeldaCancelarCampo=this.jInternalFrameDetalleFormCampo.jButtonCancelarCampo.isVisible();
			this.isVisibilidadCeldaGuardarCampo=this.jInternalFrameDetalleFormCampo.jButtonGuardarCambiosCampo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCampo=this.jButtonGuardarCambiosTablaCampo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCampo=this.jButtonNuevoToolBarCampo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCampo=this.jButtonNuevoRelacionesToolBarCampo.isVisible();
			
			if(this.jInternalFrameDetalleFormCampo!=null) {
			this.isVisibilidadCeldaModificarCampo=this.jInternalFrameDetalleFormCampo.jButtonModificarToolBarCampo.isVisible();
			this.isVisibilidadCeldaActualizarCampo=this.jInternalFrameDetalleFormCampo.jButtonActualizarToolBarCampo.isVisible();
			this.isVisibilidadCeldaEliminarCampo=this.jInternalFrameDetalleFormCampo.jButtonEliminarToolBarCampo.isVisible();
			this.isVisibilidadCeldaCancelarCampo=this.jInternalFrameDetalleFormCampo.jButtonCancelarToolBarCampo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCampo=this.jButtonGuardarCambiosToolBarCampo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCampo=this.jButtonGuardarCambiosTablaToolBarCampo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCampo=this.jMenuItemNuevoCampo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCampo=this.jMenuItemNuevoRelacionesCampo.isVisible();
			
			if(this.jInternalFrameDetalleFormCampo!=null) {
			this.isVisibilidadCeldaModificarCampo=this.jInternalFrameDetalleFormCampo.jMenuItemModificarCampo.isVisible();
			this.isVisibilidadCeldaActualizarCampo=this.jInternalFrameDetalleFormCampo.jMenuItemActualizarCampo.isVisible();
			this.isVisibilidadCeldaEliminarCampo=this.jInternalFrameDetalleFormCampo.jMenuItemEliminarCampo.isVisible();
			this.isVisibilidadCeldaCancelarCampo=this.jInternalFrameDetalleFormCampo.jMenuItemCancelarCampo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCampo=this.jMenuItemGuardarCambiosCampo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCampo=this.jMenuItemGuardarCambiosTablaCampo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCampo(Boolean esInicializar) {
		if(CampoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.campoSessionBean.getConGuardarRelaciones()) {
				//if(this.campoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCampo();
			}
			
			this.inicializarActualizarBindingBotonesManualCampo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCampo() {
		this.jButtonNuevoCampo.setVisible(this.isPermisoNuevoCampo);			
		this.jButtonDuplicarCampo.setVisible(this.isPermisoDuplicarCampo);			
		this.jButtonCopiarCampo.setVisible(this.isPermisoCopiarCampo);			
		this.jButtonVerFormCampo.setVisible(this.isPermisoVerFormCampo);			
		
		this.jButtonAbrirOrderByCampo.setVisible(this.isPermisoOrdenCampo);					
		
		this.jButtonNuevoRelacionesCampo.setVisible(this.isPermisoNuevoCampo);			
		
		if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCampo.jButtonModificarCampo.setVisible(this.isPermisoActualizarCampo);	
			this.jInternalFrameDetalleFormCampo.jButtonActualizarCampo.setVisible(this.isPermisoActualizarCampo);	
			this.jInternalFrameDetalleFormCampo.jButtonEliminarCampo.setVisible(this.isPermisoEliminarCampo);
			this.jInternalFrameDetalleFormCampo.jButtonCancelarCampo.setVisible(this.isVisibilidadCeldaCancelarCampo);						
			this.jInternalFrameDetalleFormCampo.jButtonGuardarCambiosCampo.setVisible(this.isPermisoGuardarCambiosCampo);							
		}
		
		this.jButtonGuardarCambiosTablaCampo.setVisible(this.isPermisoActualizarCampo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCampo() {
		this.jInternalFrameDetalleFormCampo.jButtonModificarCampo.setVisible(this.isPermisoActualizarCampo);	
		this.jInternalFrameDetalleFormCampo.jButtonActualizarCampo.setVisible(this.isPermisoActualizarCampo);	
		this.jInternalFrameDetalleFormCampo.jButtonEliminarCampo.setVisible(this.isPermisoEliminarCampo);
		this.jInternalFrameDetalleFormCampo.jButtonCancelarCampo.setVisible(this.isVisibilidadCeldaCancelarCampo);							
		this.jInternalFrameDetalleFormCampo.jButtonGuardarCambiosCampo.setVisible((this.isVisibilidadCeldaGuardarCampo && this.isPermisoGuardarCambiosCampo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCampo() {
		if(CampoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCampo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCampo() {
	}
	
	public void jTableDatosCampoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCampo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCampoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCampo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCampo(this.getcampo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.campo =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.campo =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.campo==null) {
						this.campo = new Campo();
					}

					this.setVariablesFormularioToObjetoActualCampo(this.campo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);
				}

				if(this.campo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.campo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCampo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_opcionCampoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoopcion=true;

			idTienePermisoopcion=this.tienePermisosUsuarioEnPaginaWebCampo(OpcionConstantesFunciones.CLASSNAME);

			if(idTienePermisoopcion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCampo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCampo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCampo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campo =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.campo =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCampo(this.getcampo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);

				this.opcionBeanSwingJInternalFrame=new OpcionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.opcionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.opcionBeanSwingJInternalFrame.getOpcionLogic().setConnexion(this.campoLogic.getConnexion());

				if(this.campo.getid_opcion()!=null) {
					this.opcionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.opcionBeanSwingJInternalFrame.setIdActual(this.campo.getid_opcion());
					this.opcionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.opcionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.opcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaOpcion();
				}

				JInternalFrameBase jinternalFrame =this.opcionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCampo=(TitledBorder)this.jScrollPanelDatosCampo.getBorder();
				TitledBorder titledBorderopcion=(TitledBorder)this.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.getBorder();

				titledBorderopcion.setTitle(titledBorderCampo.getTitle() + " -> Opcion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_opcionCampoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCampo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCampo(this.getcampo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.campo =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.campo =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.campo==null) {
						this.campo = new Campo();
					}

					this.setVariablesFormularioToObjetoActualCampo(this.campo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);
				}

				if(this.campo.getid_opcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_opcion = "+this.campo.getid_opcion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCampo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCampoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCampo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCampo(this.getcampo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.campo =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.campo =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.campo==null) {
						this.campo = new Campo();
					}

					this.setVariablesFormularioToObjetoActualCampo(this.campo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);
				}

				if(this.campo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.campo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCampo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCampoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCampo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCampo(this.getcampo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.campo =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.campo =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.campo==null) {
						this.campo = new Campo();
					}

					this.setVariablesFormularioToObjetoActualCampo(this.campo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);
				}

				if(this.campo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.campo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCampo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionCampoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCampo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCampo(this.getcampo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.campo =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.campo =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.campo==null) {
						this.campo = new Campo();
					}

					this.setVariablesFormularioToObjetoActualCampo(this.campo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);
				}

				if(this.campo.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.campo.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCampo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonestadoCampoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCampo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCampo(this.getcampo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.campo =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.campo =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.campo==null) {
						this.campo = new Campo();
					}

					this.setVariablesFormularioToObjetoActualCampo(this.campo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);
				}

				if(this.campo.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado = "+this.campo.getestado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCampo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdOpcionCampoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCampo(false,false);

			this.getCamposFK_IdOpcion();

			this.inicializarActualizarBindingCampo(false);

			//if(CampoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCampo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.campoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCampo() {
		if(this.jInternalFrameDetalleFormCampo!=null) {
		

		if(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormCampo!=null) {
			this.jInternalFrameDetalleFormCampo.setVisible(false);	    			
			this.jInternalFrameDetalleFormCampo.dispose();
			this.jInternalFrameDetalleFormCampo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCampo!=null) {
			this.jInternalFrameReporteDinamicoCampo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCampo.dispose();
			this.jInternalFrameReporteDinamicoCampo=null;
		}
		
		if(this.jInternalFrameImportacionCampo!=null) {
			this.jInternalFrameImportacionCampo.setVisible(false);	    			
			this.jInternalFrameImportacionCampo.dispose();
			this.jInternalFrameImportacionCampo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCampo();
			
			CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
			
			
			if(sTipo.equals("NuevoCampo")) {
				jButtonNuevoCampoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCampo")) {
				jButtonDuplicarCampoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCampo")) {
				jButtonCopiarCampoActionPerformed(evt);
			} else if(sTipo.equals("VerFormCampo")) {
				jButtonVerFormCampoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCampo")) {
				jButtonNuevoCampoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCampo")) {
				jButtonDuplicarCampoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCampo")) {
				jButtonNuevoCampoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCampo")) {
				jButtonDuplicarCampoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCampo")) {
				jButtonNuevoCampoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCampo")) {
				jButtonNuevoCampoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCampo")) {
				jButtonNuevoCampoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCampo")) {
				jButtonModificarCampoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCampo")) {
				jButtonModificarCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCampo")) {
				jButtonModificarCampoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCampo")) {
				jButtonActualizarCampoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCampo")) {
				jButtonActualizarCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCampo")) {
				jButtonActualizarCampoActionPerformed(evt);
			} else if(sTipo.equals("EliminarCampo")) {
				jButtonEliminarCampoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCampo")) {
				jButtonEliminarCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCampo")) {
				jButtonEliminarCampoActionPerformed(evt);
			} else if(sTipo.equals("CancelarCampo")) {
				jButtonCancelarCampoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCampo")) {
				jButtonCancelarCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCampo")) {
				jButtonCancelarCampoActionPerformed(evt);
			} else if(sTipo.equals("CerrarCampo")) {
				jButtonCerrarCampoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCampo")) {
				jButtonCerrarCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCampo")) {
				jButtonCerrarCampoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCampo")) {
				jButtonMostrarOcultarCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCampo")) {
				jButtonCancelarCampoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCampo")) {
				jButtonGuardarCambiosCampoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCampo")) {
				jButtonGuardarCambiosCampoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCampo")) {
				jButtonCopiarCampoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCampo")) {
				jButtonVerFormCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCampo")) {
				jButtonGuardarCambiosCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCampo")) {
				jButtonCopiarCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCampo")) {
				jButtonVerFormCampoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCampo")) {
				jButtonGuardarCambiosCampoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCampo")) {
				jButtonGuardarCambiosCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCampo")) {
				jButtonGuardarCambiosCampoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCampo")) {
				jButtonRecargarInformacionCampoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCampo")) {
				jButtonRecargarInformacionCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCampo")) {
				jButtonRecargarInformacionCampoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCampo")) {
				jButtonAnterioresCampoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCampo")) {
				jButtonAnterioresCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCampo")) {
				jButtonAnterioresCampoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCampo")) {
				jButtonSiguientesCampoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCampo")) {
				jButtonSiguientesCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCampo")) {
				jButtonSiguientesCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCampo") || sTipo.equals("MenuItemDetalleAbrirOrderByCampo")) {
				jButtonAbrirOrderByCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCampo") || sTipo.equals("MenuItemDetalleMostrarOcultarCampo")) {
				jButtonMostrarOcultarCampoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCampo")) {
				jButtonNuevoGuardarCambiosCampoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCampo")) {
				jButtonNuevoGuardarCambiosCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCampo")) {
				jButtonNuevoGuardarCambiosCampoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCampo")) {
				jButtonCerrarReporteDinamicoCampoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCampo")) {
				jButtonGenerarReporteDinamicoCampoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCampo")) {
				
				jButtonGenerarExcelReporteDinamicoCampoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCampo")) {
				jButtonCerrarImportacionCampoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCampo")) {
				
				jButtonGenerarImportacionCampoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCampo")) {
				
				jButtonAbrirImportacionCampoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCampo")) {
				jComboBoxTiposAccionesCampoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCampo")) {
				jComboBoxTiposRelacionesCampoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCampo")) {
				jComboBoxTiposAccionesCampoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCampo")) {
				
				jComboBoxTiposSeleccionarCampoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCampo")) {
				jTextFieldValorCampoGeneralCampoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCampo")) {
				jButtonAbrirOrderByCampoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCampo")) {
				jButtonAbrirOrderByCampoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCampo")) {
				jButtonCerrarOrderByCampoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCampoBusqueda")) {
				this.jButtonidCampoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_opcionCampoUpdate")) {
				this.jButtonid_opcionCampoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_opcionCampoBusqueda")) {
				this.jButtonid_opcionCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCampoBusqueda")) {
				this.jButtoncodigoCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCampoBusqueda")) {
				this.jButtonnombreCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCampoBusqueda")) {
				this.jButtondescripcionCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoCampoBusqueda")) {
				this.jButtonestadoCampoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdOpcionCampo")) {
				this.jButtonFK_IdOpcionCampoActionPerformed(evt);
			}
			
			;
			
			
			CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCampo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCampoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.campo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.campo);
				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
				
				


				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Campo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Campo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Campo campoLocal=null;
			
			if(!this.getEsControlTabla()) {
				campoLocal=this.campo;
			} else {
				campoLocal=this.campoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.campo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.campo);
				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
							
				
				


				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Campo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Campo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCampoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCampo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoAnterior =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.campoAnterior =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
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
			
			CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
			
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
			
			


			
			CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCampoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.campo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.campo);
				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
								
						
				


				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Campo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Campo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.campo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.campo);
				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
								
				
				


				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Campo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Campo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCampoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCampo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoAnterior =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.campoAnterior =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.campo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.campo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCampoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCampo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoAnterior =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.campoAnterior =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCampoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.campo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.campo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.campo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.campo);
				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
							
				
				


				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Campo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Campo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCampoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCampo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.campoAnterior =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.campoAnterior =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
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
			
			CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
			
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
			
			


			
			CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCampoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.campo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.campo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.campo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.campo);
				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
								
				
				


				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Campo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Campo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCampoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCampo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoAnterior =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.campoAnterior =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCampoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.campo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.campo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCampoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.campo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.campo);
				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCampo")) {
					jCheckBoxSeleccionarTodosCampoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCampo")) {
					jCheckBoxSeleccionadosCampoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCampo")) {
					
				}
				
				


				
				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Campo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Campo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.campo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.campo);
				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
												
				
				


				
				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Campo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Campo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCampoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCampo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.campoAnterior =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.campoAnterior =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCampoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.campo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.campo);
				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
				
				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
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
			
			CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
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
			
			


			
			CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCampoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.campo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.campo);
				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Campo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Campo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.campo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.campo);
				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
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
				
				


				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Campo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Campo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCampoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCampo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.campoAnterior =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.campoAnterior =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCampo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCampoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCampo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.campo =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.campo =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.campo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCampo")) {
				
				}
				
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCampo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCampo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCampo")) {
			
			}
			
			CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCampo();
			
			CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
			
			if(sTipo.equals("NuevoCampo")) {
				jButtonNuevoCampoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCampo")) {
				jButtonDuplicarCampoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCampo")) {
				jButtonCopiarCampoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCampo")) {
				jButtonVerFormCampoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCampo")) {
				jButtonNuevoCampoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCampo")) {
				jButtonModificarCampoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCampo")) {
				jButtonActualizarCampoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCampo")) {
				jButtonEliminarCampoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCampo")) {
				jButtonGuardarCambiosCampoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCampo")) {
				jButtonCancelarCampoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCampo")) {
				jButtonCerrarCampoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCampo")) {
				jButtonGuardarCambiosCampoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCampo")) {
				jButtonNuevoGuardarCambiosCampoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCampo")) {
				jButtonAbrirOrderByCampoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCampo")) {
				jButtonRecargarInformacionCampoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCampo")) {
				jButtonAnterioresCampoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCampo")) {
				jButtonSiguientesCampoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCampoBusqueda")) {
				this.jButtonidCampoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_opcionCampoUpdate")) {
				this.jButtonid_opcionCampoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_opcionCampoBusqueda")) {
				this.jButtonid_opcionCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCampoBusqueda")) {
				this.jButtoncodigoCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCampoBusqueda")) {
				this.jButtonnombreCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCampoBusqueda")) {
				this.jButtondescripcionCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoCampoBusqueda")) {
				this.jButtonestadoCampoBusquedaActionPerformed(evt);
			}
			
			CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCampo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCampo")) {
				closingInternalFrameCampo();
				
			} else if(sTipo.equals("jButtonCancelarCampo")) {
				JInternalFrameBase jInternalFrameDetalleFormCampo = (JInternalFrameBase)evt.getSource();
	            	
	            CampoBeanSwingJInternalFrame jInternalFrameParent=(CampoBeanSwingJInternalFrame)jInternalFrameDetalleFormCampo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCampoActionPerformed(null);
			}
			
			CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.campo,new Object(),this.campoParameterGeneral,this.campoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCampo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCampo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCampo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.campo)) {
			if(!esControlTabla) {
				if(CampoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCampo(this.campo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);			
				}
				
				if(this.campoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCampo(this.campo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.campoReturnGeneral=campoLogic.procesarEventosCamposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.campoLogic.getCampos(),this.campo,this.campoParameterGeneral,this.isEsNuevoCampo,classes);//this.campoLogic.getCampo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCampo(this.campoReturnGeneral,this.campoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.campoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCampo(classes,this.campoReturnGeneral,this.campoBean,false);
					}
						
					if(this.campoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCampo(this.campoReturnGeneral.getCampo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCampo(this.campoReturnGeneral.getCampo());	
					}
						
					if(this.campoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCampo(this.campoReturnGeneral.getCampo(),classes);//this.campoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCampo(this.campo,classes);//this.campoBean);									
				}
			
				if(CampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCampo(this.campo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCampo(this.campo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.campoAnterior!=null) {
						this.campo=this.campoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.campoReturnGeneral=campoLogic.procesarEventosCamposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.campoLogic.getCampos(),this.campo,this.campoParameterGeneral,this.isEsNuevoCampo,classes);//this.campoLogic.getCampo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.campoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.campoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.campoReturnGeneral.getCampo(),campoLogic.getCampos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.campoReturnGeneral.getCampo(),this.campos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCampo.repaint();
				
				//((AbstractTableModel) this.jTableDatosCampo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCampo();
			}
		}
	}
	
	public void actualizarVisualTableDatosCampo() throws Exception {
		
		CampoModel campoModel=(CampoModel)this.jTableDatosCampo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			campoModel.campos=this.campoLogic.getCampos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			campoModel.campos=this.campos;
		}
		
		
		((CampoModel) this.jTableDatosCampo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCampo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcampoAnterior(),this.campoLogic.getCampos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcampoAnterior(),this.campos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCampo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCampo(Campo campo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilCampo.class)) {
					this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoLogic.setPerfilCampos(campo.getPerfilCampos());
					this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilCampo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
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
										
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.campo,new Object(),generalEntityParameterGeneral,this.campoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.campoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CampoConstantesFunciones.getClassesRelationshipsOfCampo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CampoConstantesFunciones.getClassesRelationshipsFromStringsOfCampo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCampo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.campo,new Object(),generalEntityParameterGeneral,this.campoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCampo(CampoBean campoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilCampo.class)) {
					this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoLogic.setPerfilCampos(campo.getPerfilCampos());
					this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilCampo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCampo(ArrayList<Classe> classes,CampoReturnGeneral campoReturnGeneral,CampoBean campoBean,Boolean conDefault) throws Exception {
		
			this.campoBean.setPerfilCampos(campoReturnGeneral.getCampo().getPerfilCampos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCampo(Campo campo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilCampo.class)) {
					campo.setPerfilCampos(this.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.perfilcampoLogic.getPerfilCampos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.campo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCampo = new CampoDetalleFormJInternalFrame(jDesktopPane,this.campoSessionBean.getConGuardarRelaciones(),this.campoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCampo);
		this.jInternalFrameDetalleFormCampo.setVisible(false);
		this.jInternalFrameDetalleFormCampo.setSelected(false);						
		
		this.jInternalFrameDetalleFormCampo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCampo.campoLogic=this.campoLogic;
		
		this.cargarCombosFrameForeignKeyCampo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCampo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCampo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCampo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCampo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCampo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCampo"));
		
		this.jInternalFrameDetalleFormCampo.jButtonModificarCampo.addActionListener(new ButtonActionListener(this,"ModificarCampo"));

		
		this.jInternalFrameDetalleFormCampo.jButtonModificarToolBarCampo.addActionListener(new ButtonActionListener(this,"ModificarToolBarCampo"));
					
		this.jInternalFrameDetalleFormCampo.jMenuItemModificarCampo.addActionListener(new ButtonActionListener(this,"MenuItemModificarCampo"));		
		
		
		
		this.jInternalFrameDetalleFormCampo.jButtonActualizarCampo.addActionListener (new ButtonActionListener(this,"ActualizarCampo"));
		
		
		this.jInternalFrameDetalleFormCampo.jButtonActualizarToolBarCampo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCampo"));
						
		this.jInternalFrameDetalleFormCampo.jMenuItemActualizarCampo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCampo"));		
		
		
		
		this.jInternalFrameDetalleFormCampo.jButtonEliminarCampo.addActionListener (new ButtonActionListener(this,"EliminarCampo"));
		
		
		this.jInternalFrameDetalleFormCampo.jButtonEliminarToolBarCampo.addActionListener (new ButtonActionListener(this,"EliminarToolBarCampo"));
								
		this.jInternalFrameDetalleFormCampo.jMenuItemEliminarCampo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCampo"));		
		
		
		
		this.jInternalFrameDetalleFormCampo.jButtonCancelarCampo.addActionListener (new ButtonActionListener(this,"CancelarCampo"));
		
		
		this.jInternalFrameDetalleFormCampo.jButtonCancelarToolBarCampo.addActionListener (new ButtonActionListener(this,"CancelarToolBarCampo"));
					
		this.jInternalFrameDetalleFormCampo.jMenuItemCancelarCampo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCampo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCampo.jMenuItemDetalleCerrarCampo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCampo"));		
		
		
		
		this.jInternalFrameDetalleFormCampo.jButtonGuardarCambiosToolBarCampo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCampo"));
		
		
		
		this.jInternalFrameDetalleFormCampo.jButtonGuardarCambiosToolBarCampo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCampo"));
		
		
		
		this.jInternalFrameDetalleFormCampo.jComboBoxTiposAccionesFormularioCampo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCampo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtonidCampoBusqueda.addActionListener(new ButtonActionListener(this,"idCampoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCampo.jButtonid_opcionCampoUpdate.addActionListener(new ButtonActionListener(this,"id_opcionCampoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtonid_opcionCampoBusqueda.addActionListener(new ButtonActionListener(this,"id_opcionCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtoncodigoCampoBusqueda.addActionListener(new ButtonActionListener(this,"codigoCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtonnombreCampoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtondescripcionCampoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtonestadoCampoBusqueda.addActionListener(new ButtonActionListener(this,"estadoCampoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCampo.jTabbedPaneRelacionesCampo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCampo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCampo"));
		
		if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCampo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCampo"));
		}
		
		this.jTableDatosCampo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCampo"));
		
		this.jTableDatosCampo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCampo"));
		
		this.jButtonNuevoCampo.addActionListener(new ButtonActionListener(this,"NuevoCampo"));
		
		this.jButtonDuplicarCampo.addActionListener(new ButtonActionListener(this,"DuplicarCampo"));
		
		this.jButtonCopiarCampo.addActionListener(new ButtonActionListener(this,"CopiarCampo"));
		
		this.jButtonVerFormCampo.addActionListener(new ButtonActionListener(this,"VerFormCampo"));
		
		
		this.jButtonNuevoToolBarCampo.addActionListener(new ButtonActionListener(this,"NuevoToolBarCampo"));
			
		this.jButtonDuplicarToolBarCampo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCampo"));
			
		this.jMenuItemNuevoCampo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCampo"));
			
		this.jMenuItemDuplicarCampo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCampo"));		
		
		
		this.jButtonNuevoRelacionesCampo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCampo"));
		
		
		this.jButtonNuevoRelacionesToolBarCampo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCampo"));
			
		this.jMenuItemNuevoRelacionesCampo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCampo"));		
		
		
		if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCampo.jButtonModificarCampo.addActionListener(new ButtonActionListener(this,"ModificarCampo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCampo.jButtonModificarToolBarCampo.addActionListener(new ButtonActionListener(this,"ModificarToolBarCampo"));
			
			this.jInternalFrameDetalleFormCampo.jMenuItemModificarCampo.addActionListener(new ButtonActionListener(this,"MenuItemModificarCampo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCampo.jButtonActualizarCampo.addActionListener (new ButtonActionListener(this,"ActualizarCampo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCampo.jButtonActualizarToolBarCampo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCampo"));
				
			this.jInternalFrameDetalleFormCampo.jMenuItemActualizarCampo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCampo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCampo.jButtonEliminarCampo.addActionListener (new ButtonActionListener(this,"EliminarCampo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCampo.jButtonEliminarToolBarCampo.addActionListener (new ButtonActionListener(this,"EliminarToolBarCampo"));
						
			this.jInternalFrameDetalleFormCampo.jMenuItemEliminarCampo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCampo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCampo.jButtonCancelarCampo.addActionListener (new ButtonActionListener(this,"CancelarCampo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCampo.jButtonCancelarToolBarCampo.addActionListener (new ButtonActionListener(this,"CancelarToolBarCampo"));
			
			this.jInternalFrameDetalleFormCampo.jMenuItemCancelarCampo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCampo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCampo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCampo"));		
		
		
		this.jButtonCerrarCampo.addActionListener (new ButtonActionListener(this,"CerrarCampo"));
		
		
		this.jButtonCerrarToolBarCampo.addActionListener (new ButtonActionListener(this,"CerrarToolBarCampo"));
			
		this.jMenuItemCerrarCampo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCampo"));
			
		if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCampo.jMenuItemDetalleCerrarCampo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCampo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCampo.jButtonGuardarCambiosCampo.addActionListener (new ButtonActionListener(this,"GuardarCambiosCampo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCampo.jButtonGuardarCambiosToolBarCampo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCampo"));
		}
		
		this.jButtonCopiarToolBarCampo.addActionListener (new ButtonActionListener(this,"CopiarToolBarCampo"));
			
		this.jButtonVerFormToolBarCampo.addActionListener (new ButtonActionListener(this,"VerFormToolBarCampo"));
		
		this.jMenuItemGuardarCambiosCampo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCampo"));
			
		this.jMenuItemCopiarCampo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCampo"));		
		
		this.jMenuItemVerFormCampo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCampo"));		
		
		
		this.jButtonGuardarCambiosTablaCampo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCampo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCampo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCampo"));
			
		this.jMenuItemGuardarCambiosTablaCampo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCampo"));		
		
		
		
		this.jButtonRecargarInformacionCampo.addActionListener (new ButtonActionListener(this,"RecargarInformacionCampo"));
					
		this.jButtonRecargarInformacionToolBarCampo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCampo"));
		
		this.jMenuItemRecargarInformacionCampo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCampo"));		
		
		
		
		this.jButtonAnterioresCampo.addActionListener (new ButtonActionListener(this,"AnterioresCampo"));
		
		
		this.jButtonAnterioresToolBarCampo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCampo"));
		
		this.jMenuItemAnterioresCampo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCampo"));		
		
		
		this.jButtonSiguientesCampo.addActionListener (new ButtonActionListener(this,"SiguientesCampo"));
		
		
		this.jButtonSiguientesToolBarCampo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCampo"));
			
		this.jMenuItemSiguientesCampo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCampo"));
			
		this.jMenuItemAbrirOrderByCampo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCampo"));
			
		this.jMenuItemMostrarOcultarCampo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCampo"));
			
		this.jMenuItemDetalleAbrirOrderByCampo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCampo"));
			
		this.jMenuItemDetalleMostarOcultarCampo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCampo"));		
		
		
		this.jButtonNuevoGuardarCambiosCampo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCampo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCampo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCampo"));
			
		this.jMenuItemNuevoGuardarCambiosCampo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCampo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCampo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCampo"));

		this.jCheckBoxSeleccionadosCampo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCampo"));
		
		if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCampo.jComboBoxTiposAccionesFormularioCampo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCampo"));
		}
		
		
		this.jComboBoxTiposRelacionesCampo.addActionListener (new ButtonActionListener(this,"TiposRelacionesCampo"));
			
		this.jComboBoxTiposAccionesCampo.addActionListener (new ButtonActionListener(this,"TiposAccionesCampo"));
					
		this.jComboBoxTiposSeleccionarCampo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCampo"));
			
		this.jTextFieldValorCampoGeneralCampo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCampo"));		
		
		
		if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtonidCampoBusqueda.addActionListener(new ButtonActionListener(this,"idCampoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCampo.jButtonid_opcionCampoUpdate.addActionListener(new ButtonActionListener(this,"id_opcionCampoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtonid_opcionCampoBusqueda.addActionListener(new ButtonActionListener(this,"id_opcionCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtoncodigoCampoBusqueda.addActionListener(new ButtonActionListener(this,"codigoCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtonnombreCampoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtondescripcionCampoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtonestadoCampoBusqueda.addActionListener(new ButtonActionListener(this,"estadoCampoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdOpcionCampo.addActionListener(new ButtonActionListener(this,"FK_IdOpcionCampo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCampo!=null) {
				this.jInternalFrameReporteDinamicoCampo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCampo"));
				this.jInternalFrameReporteDinamicoCampo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCampo"));
				this.jInternalFrameReporteDinamicoCampo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCampo"));
			}
			
			//this.jButtonCerrarReporteDinamicoCampo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCampo"));				
			//this.jButtonGenerarReporteDinamicoCampo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCampo"));
			//this.jButtonGenerarExcelReporteDinamicoCampo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCampo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCampo!=null) {
				this.jInternalFrameImportacionCampo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCampo"));
				this.jInternalFrameImportacionCampo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCampo"));
				this.jInternalFrameImportacionCampo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCampo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCampo.addActionListener (new ButtonActionListener(this,"AbrirOrderByCampo"));
			
			this.jButtonAbrirOrderByToolBarCampo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCampo"));			
			
			if(this.jInternalFrameOrderByCampo!=null) {
				this.jInternalFrameOrderByCampo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCampo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCampo.jTabbedPaneRelacionesCampo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCampo"));
		
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
            		closingInternalFrameCampo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCampo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCampo = (JInternalFrameBase)event.getSource();
	            	
	            CampoBeanSwingJInternalFrame jInternalFrameParent=(CampoBeanSwingJInternalFrame)jInternalFrameDetalleFormCampo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCampoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCampo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCampoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCampo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCampo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCampoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCampoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCampoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCampo";
		inputMap = this.jButtonNuevoCampo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCampo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCampoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCampoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCampoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCampoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCampo";
		inputMap = this.jButtonNuevoRelacionesCampo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCampo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCampoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCampo";
		inputMap = this.jButtonModificarCampo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCampo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCampoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCampo";
		inputMap = this.jButtonActualizarCampo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCampo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCampoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCampo";
		inputMap = this.jButtonEliminarCampo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCampo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCampoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCampo";
		inputMap = this.jButtonCancelarCampo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCampo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCampoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCampo";
		inputMap = this.jButtonCerrarCampo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCampo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCampoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCampo.jButtonGuardarCambiosCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCampo";
		inputMap = this.jInternalFrameDetalleFormCampo.jButtonGuardarCambiosCampo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCampo.jButtonGuardarCambiosCampo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCampoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCampo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCampoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCampo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCampoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCampo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCampoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCampo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCampoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtonidCampoBusqueda.addActionListener(new ButtonActionListener(this,"idCampoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCampo.jButtonid_opcionCampoUpdate.addActionListener(new ButtonActionListener(this,"id_opcionCampoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtonid_opcionCampoBusqueda.addActionListener(new ButtonActionListener(this,"id_opcionCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtoncodigoCampoBusqueda.addActionListener(new ButtonActionListener(this,"codigoCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtonnombreCampoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtondescripcionCampoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCampo.jButtonestadoCampoBusqueda.addActionListener(new ButtonActionListener(this,"estadoCampoBusqueda"));
		
		
		this.jButtonFK_IdOpcionCampo.addActionListener(new ButtonActionListener(this,"FK_IdOpcionCampo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCampoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCampo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCampo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Campo campoAux:this.campoLogic.getCampos()) {
					campoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Campo campoAux:campos) {
					campoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCampoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCampo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Campo campoAux:this.campoLogic.getCampos()) {
						campoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Campo campoAux:campos) {
						campoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Campo campoAux:this.campoLogic.getCampos()) {
					
						if(sTipoSeleccionar.equals(CampoConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							campoAux.setestado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Campo campoAux:campos) {
						
						if(sTipoSeleccionar.equals(CampoConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							campoAux.setestado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCampo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCampo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCampo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCampo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCampoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCampo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCampo.getSelectedRows();
			
			Campo campoLocal=new Campo();
			
			//this.seleccionarTodosCampo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					campoLocal =(Campo) this.campoLogic.getCampos().toArray()[this.jTableDatosCampo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					campoLocal =(Campo) this.campos.toArray()[this.jTableDatosCampo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				campoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Campo campoAux:this.campoLogic.getCampos()) {
						campoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Campo campoAux:campos) {
						campoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCampo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCampo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCampo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCampo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCampoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCampoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCampoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCampo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCampo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Campo campoAux:this.campoLogic.getCampos()) {
				
						if(sTipoSeleccionar.equals(CampoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							campoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CampoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							campoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CampoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							campoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Campo campoAux:campos) {
					
						if(sTipoSeleccionar.equals(CampoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							campoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CampoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							campoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CampoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							campoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCampo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCampoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCampo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCampo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCampo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCampo.jComboBoxTiposAccionesFormularioCampo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCampo) {				
					conSplash=true;//false;										
					
					//this.startProcessCampo(conSplash);
				
					this.generarReporteCamposSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCampo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCampo.jComboBoxTiposAccionesFormularioCampo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCamposSeleccionados();
				//this.jComboBoxTiposAccionesCampo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCamposSeleccionados(false);
				//this.jComboBoxTiposAccionesCampo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCamposSeleccionados(true);
				//this.jComboBoxTiposAccionesCampo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCampo();
				
				this.exportarCamposSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCampo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCampo.jComboBoxTiposAccionesFormularioCampo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCampos();
				//this.importarCampos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCampo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCampo.jComboBoxTiposAccionesFormularioCampo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCampo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCamposSeleccionados();
				//this.jComboBoxTiposAccionesCampo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Campo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCampo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCampo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCampo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Campo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCampo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCampo.jComboBoxTiposAccionesFormularioCampo.setSelectedIndex(0);					
				}	
			} 			
			else if(CampoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCampo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCampo(conSplash);
					
						//this.actualizarParametrosGeneralCampo();
						
						this.generarReporteProcesoAccionCamposSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCampo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCampo.jComboBoxTiposAccionesFormularioCampo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CampoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO CampoS SELECCIONADOS?", "MANTENIMIENTO DE Campo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCampo();
				
						this.actualizarParametrosGeneralCampo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.campoReturnGeneral=campoLogic.procesarAccionCamposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.campoLogic.getCampos(),this.campoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCampoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCampo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCampo.jComboBoxTiposAccionesFormularioCampo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCampo();
					
					CampoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCampoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCampo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCampo.jComboBoxTiposAccionesFormularioCampo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCampo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCampoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCampo();
			
			if(this.jInternalFrameDetalleFormCampo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Campo> camposSeleccionados=new ArrayList<Campo>();		
			Campo campo=new Campo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCampo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCampo.getSelectedItem();
			
			
			
			
			camposSeleccionados=this.getCamposSeleccionados(true);
			//this.sTipoAccion;
			
			if(camposSeleccionados.size()==1) {
				for(Campo campoAux:camposSeleccionados) {
					campo=campoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Perfil Campo")) {
					jButtonPerfilCampoActionPerformed(null,rowIndex,true,false,campo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCampo();
			
      		//this.finishProcessCampo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCampoReturnGeneral() throws Exception {
		if(this.campoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.campoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.campoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.campoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.campoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.campoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCampo(false);
		}
		
		if(this.campoReturnGeneral.getConRetornoLista() || this.campoReturnGeneral.getConRetornoObjeto()) {
			if(this.campoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.campoLogic.setCampos(this.campoReturnGeneral.getCampos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.campoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.campoLogic.setCampo(this.campoReturnGeneral.getCampo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCampo(false);
		}
	}
	
	public void actualizarParametrosGeneralCampo() throws Exception {
		
		
	}
	
	public ArrayList<Campo> getCamposSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Campo> camposSeleccionados=new ArrayList<Campo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCampo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Campo campoAux:campoLogic.getCampos()) {
					if(campoAux.getIsSelected()) {
						camposSeleccionados.add(campoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Campo campoAux:this.campos) {
					if(campoAux.getIsSelected()) {
						camposSeleccionados.add(campoAux);				
					}
				}
			}
			
			if(camposSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						camposSeleccionados.addAll(this.campoLogic.getCampos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						camposSeleccionados.addAll(this.campos);				
					}
				}
			}
		} else {
			camposSeleccionados.add(this.campo);
		}
		
		return camposSeleccionados;
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
	
	public void generarReporteCamposSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCamposSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCamposSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCamposSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCamposSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesCamposSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Campo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCamposSeleccionados() throws Exception {
		ArrayList<Campo> camposSeleccionados=new ArrayList<Campo>();		
		
		camposSeleccionados=this.getCamposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCampos("Todos",camposSeleccionados);
		
	}	
	
	public void generarReporteNormalCamposSeleccionados() throws Exception {
		ArrayList<Campo> camposSeleccionados=new ArrayList<Campo>();		
		
		camposSeleccionados=this.getCamposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCampos("Todos",camposSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCamposSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Campo> camposSeleccionados=new ArrayList<Campo>();
		
		camposSeleccionados=this.getCamposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCampos("Todos",camposSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCamposSeleccionados() throws Exception {
		ArrayList<Campo> camposSeleccionados=new ArrayList<Campo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCampo();
		
		
		camposSeleccionados=this.getCamposSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCampo();
		
		
		//this.generarReporteCampos("Todos",camposSeleccionados ,campoImplementable,campoImplementableHome);
	}
	
	public void mostrarImportacionCampos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCampo();
		
		this.abrirFrameImportacionCampo();		
		
			
		//this.generarReporteCampos("Todos",camposSeleccionados ,campoImplementable,campoImplementableHome);
	}
	
	public void importarCampos() throws Exception {		
	
	}
	
	public void exportarCamposSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCamposSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCamposSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCamposSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Campo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCamposSeleccionados() throws Exception {
		ArrayList<Campo> camposSeleccionados=new ArrayList<Campo>();		
		
		camposSeleccionados=this.getCamposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"campo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCampo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Campo campoAux:camposSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCampo(campoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//campoAux.setsDetalleGeneralEntityReporte(campoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.campoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Campo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCampo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CampoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CampoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CampoConstantesFunciones.LABEL_IDOPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CampoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CampoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CampoConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CampoConstantesFunciones.LABEL_ESTADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCampo(Campo campo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=campo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=campo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=campo.getopcion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=campo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=campo.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=campo.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=campo.getestado().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCamposSeleccionados() throws Exception {
		ArrayList<Campo> camposSeleccionados=new ArrayList<Campo>();		
		
		camposSeleccionados=this.getCamposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"campo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Campos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCampo(row);				
				iRow++;
			}				
			
			for(Campo campoAux:camposSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCampo(campoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.campoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Campo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCamposSeleccionados() throws Exception {
		ArrayList<Campo> camposSeleccionados=new ArrayList<Campo>();		
		
		camposSeleccionados=this.getCamposSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"campo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("campos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("campo");
			//elementRoot.appendChild(element);
		
			for(Campo campoAux:camposSeleccionados) {
				element = document.createElement("campo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCampo(campoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.campoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Campo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCampo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CampoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CampoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CampoConstantesFunciones.LABEL_IDOPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CampoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CampoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CampoConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CampoConstantesFunciones.LABEL_ESTADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCampo(Campo campo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(campo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(campo.getopcion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(campo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(campo.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(campo.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(campo.getestado());				
	}
	
	public void setFilaDatosExportarXmlCampo(Campo campo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CampoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(campo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CampoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(campo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementopcion_descripcion = document.createElement(CampoConstantesFunciones.IDOPCION);
		elementopcion_descripcion.appendChild(document.createTextNode(campo.getopcion_descripcion()));
		element.appendChild(elementopcion_descripcion);

		Element elementcodigo = document.createElement(CampoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(campo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(CampoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(campo.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(CampoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(campo.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementestado = document.createElement(CampoConstantesFunciones.ESTADO);
		elementestado.appendChild(document.createTextNode(campo.getestado().toString().trim()));
		element.appendChild(elementestado);
	}
	
	public void generarReporteGroupGenericoCamposSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Campo> camposSeleccionados=new ArrayList<Campo>();
		
		camposSeleccionados=this.getCamposSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCampo(camposSeleccionados);
		
		this.generarReporteCampos("Todos",camposSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCampo(ArrayList<Campo> camposSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Campo campoAux:camposSeleccionados) {
				campoAux.setsDetalleGeneralEntityReporte(campoAux.toString());
			
				if(sTipoSeleccionar.equals(CampoConstantesFunciones.LABEL_IDOPCION)) {
					existe=true;
					campoAux.setsDescripcionGeneralEntityReporte1(campoAux.getopcion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CampoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					campoAux.setsDescripcionGeneralEntityReporte1(campoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CampoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					campoAux.setsDescripcionGeneralEntityReporte1(campoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CampoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					campoAux.setsDescripcionGeneralEntityReporte1(campoAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(CampoConstantesFunciones.LABEL_ESTADO)) {
					existe=true;
					campoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(campoAux.getestado()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CampoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCampo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCampo=true;
				this.isVisibilidadCeldaNuevoRelacionesCampo=true;
				this.isVisibilidadCeldaGuardarCambiosCampo=true;
			}
			
			this.isVisibilidadCeldaModificarCampo=false;
			this.isVisibilidadCeldaActualizarCampo=false;
			this.isVisibilidadCeldaEliminarCampo=false;
			this.isVisibilidadCeldaCancelarCampo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCampo=true;
				} else {
					this.isVisibilidadCeldaGuardarCampo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCampo=false;
			this.isVisibilidadCeldaNuevoRelacionesCampo=false;
			this.isVisibilidadCeldaGuardarCambiosCampo=false;
			this.isVisibilidadCeldaModificarCampo=false;
			this.isVisibilidadCeldaActualizarCampo=true;
			this.isVisibilidadCeldaEliminarCampo=false;
			this.isVisibilidadCeldaCancelarCampo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCampo=true;
				} else {
					this.isVisibilidadCeldaGuardarCampo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCampo=false;
			this.isVisibilidadCeldaNuevoRelacionesCampo=false;
			this.isVisibilidadCeldaGuardarCambiosCampo=false;
			this.isVisibilidadCeldaModificarCampo=false;
			this.isVisibilidadCeldaActualizarCampo=true;
			this.isVisibilidadCeldaEliminarCampo=true;
			this.isVisibilidadCeldaCancelarCampo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCampo=true;
				} else {
					this.isVisibilidadCeldaGuardarCampo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCampo=false;
			this.isVisibilidadCeldaNuevoRelacionesCampo=false;
			this.isVisibilidadCeldaGuardarCambiosCampo=false;
			this.isVisibilidadCeldaModificarCampo=false;
			this.isVisibilidadCeldaActualizarCampo=true;
			this.isVisibilidadCeldaEliminarCampo=false;
			this.isVisibilidadCeldaCancelarCampo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCampo=false;
				} else {
					this.isVisibilidadCeldaGuardarCampo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCampo=true;
			this.isVisibilidadCeldaNuevoRelacionesCampo=true;
			this.isVisibilidadCeldaGuardarCambiosCampo=true;
			this.isVisibilidadCeldaModificarCampo=false;
			this.isVisibilidadCeldaActualizarCampo=false;
			this.isVisibilidadCeldaEliminarCampo=false;
			this.isVisibilidadCeldaCancelarCampo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCampo=true;
				} else {
					this.isVisibilidadCeldaGuardarCampo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCampo=false;
			this.isVisibilidadCeldaNuevoRelacionesCampo=false;
			this.isVisibilidadCeldaGuardarCambiosCampo=false;
			this.isVisibilidadCeldaActualizarCampo=false;
			this.isVisibilidadCeldaEliminarCampo=false;
			this.isVisibilidadCeldaCancelarCampo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCampo=false;
				} else {
					this.isVisibilidadCeldaGuardarCampo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCampo=false;
			this.isVisibilidadCeldaNuevoRelacionesCampo=false;
			this.isVisibilidadCeldaGuardarCambiosCampo=false;
			this.isVisibilidadCeldaModificarCampo=true;
			this.isVisibilidadCeldaActualizarCampo=false;
			this.isVisibilidadCeldaEliminarCampo=false;
			this.isVisibilidadCeldaCancelarCampo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCampo=false;
				} else {
					this.isVisibilidadCeldaGuardarCampo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CampoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCampo=true;
			this.isVisibilidadCeldaNuevoRelacionesCampo=true;
			this.isVisibilidadCeldaGuardarCambiosCampo=true;
		} else {
			this.actualizarEstadoPanelsCampo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCampo=false;
			//this.isVisibilidadCeldaVerFormCampo=false;
			this.isVisibilidadCeldaDuplicarCampo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!campoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCampo=false;
		} else {
			this.isVisibilidadCeldaNuevoCampo=false;
			this.isVisibilidadCeldaGuardarCambiosCampo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(campoSessionBean.getEsGuardarRelacionado()) {
			if(!campoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCampo=false;												
			}
			
			this.jButtonCerrarCampo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCampo=false;
		}
		
		if(!this.permiteMantenimiento(this.campo)) {
			this.isVisibilidadCeldaActualizarCampo=false;
			this.isVisibilidadCeldaEliminarCampo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCampo() {
		this.isVisibilidadCeldaNuevoCampo=false;
		this.isVisibilidadCeldaGuardarCambiosCampo=false;
	}
	
	public void actualizarEstadoPanelsCampo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCampo!=null) {
				this.jScrollPanelDatosEdicionCampo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCampo!=null) {
				this.jTabbedPaneBusquedasCampo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCampo!=null) {
				this.jScrollPanelDatosCampo.setVisible(true);
			}
			
			if(this.jPanelPaginacionCampo!=null) {
				this.jPanelPaginacionCampo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCampo!=null) {
				this.jPanelParametrosReportesCampo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCampo!=null) {
				this.jScrollPanelDatosEdicionCampo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCampo!=null) {
				this.jTabbedPaneBusquedasCampo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCampo!=null) {
				this.jScrollPanelDatosCampo.setVisible(false);
			}
			
			if(this.jPanelPaginacionCampo!=null) {
				this.jPanelPaginacionCampo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCampo!=null) {
				this.jPanelParametrosReportesCampo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCampo!=null) {
				this.jScrollPanelDatosEdicionCampo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCampo!=null) {
				this.jTabbedPaneBusquedasCampo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCampo!=null) {
				this.jScrollPanelDatosCampo.setVisible(false);
			}
			
			if(this.jPanelPaginacionCampo!=null) {
				this.jPanelPaginacionCampo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCampo!=null) {
				this.jPanelParametrosReportesCampo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCampo!=null) {
				this.jScrollPanelDatosEdicionCampo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCampo!=null) {
				this.jTabbedPaneBusquedasCampo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCampo!=null) {
				this.jScrollPanelDatosCampo.setVisible(false);
			}
			
			if(this.jPanelPaginacionCampo!=null) {
				this.jPanelPaginacionCampo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCampo!=null) {
				this.jPanelParametrosReportesCampo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCampo!=null) {
				this.jScrollPanelDatosEdicionCampo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCampo!=null) {
				this.jTabbedPaneBusquedasCampo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCampo!=null) {
				this.jScrollPanelDatosCampo.setVisible(true);
			}
			
			if(this.jPanelPaginacionCampo!=null) {
				this.jPanelPaginacionCampo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCampo!=null) {
				this.jPanelParametrosReportesCampo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCampo!=null) {
				this.jScrollPanelDatosEdicionCampo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCampo!=null) {
				this.jTabbedPaneBusquedasCampo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCampo!=null) {
				this.jScrollPanelDatosCampo.setVisible(true);
			}
			
			if(this.jPanelPaginacionCampo!=null) {
				this.jPanelPaginacionCampo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCampo!=null) {
				this.jPanelParametrosReportesCampo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCampo!=null) {
				this.jScrollPanelDatosEdicionCampo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCampo!=null) {
				this.jTabbedPaneBusquedasCampo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCampo!=null) {
				this.jScrollPanelDatosCampo.setVisible(true);
			}
			
			if(this.jPanelPaginacionCampo!=null) {
				this.jPanelPaginacionCampo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCampo!=null) {
				this.jPanelParametrosReportesCampo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.campoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCampo!=null) {
					this.jTabbedPaneBusquedasCampo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCampo!=null) {
				this.jPanelParametrosReportesCampo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.campoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCampo!=null) {
				this.jTabbedPaneBusquedasCampo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCampo!=null) {
				this.jPanelParametrosReportesCampo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaOpcion(Boolean isParaOpcion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaOpcionNegation=!isParaOpcion;

			this.isVisibilidadFK_IdOpcion=isParaOpcion;
			if(!this.isVisibilidadFK_IdOpcion) {this.jTabbedPaneBusquedasCampo.remove(jPanelFK_IdOpcionCampo);}
		}
		
	}
	
	

	public String registrarSesionCampoParaPerfilCampos() throws Exception {
		Boolean isPaginaPopupPerfilCampo=false;

		try {

			if(this.campoSessionBean==null) {
				this.campoSessionBean=new CampoSessionBean();
			}

			if(this.jInternalFrameDetalleFormCampo.perfilcampoSessionBean==null) {
				this.jInternalFrameDetalleFormCampo.perfilcampoSessionBean=new PerfilCampoSessionBean();
			}

			this.jInternalFrameDetalleFormCampo.perfilcampoSessionBean.setsPathNavegacionActual(campoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PerfilCampoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCampo.perfilcampoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPerfilCampo=this.jInternalFrameDetalleFormCampo.perfilcampoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCampo.perfilcampoSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormCampo.perfilcampoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePerfilCampo(false);
			this.jInternalFrameDetalleFormCampo.perfilcampoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePerfilCampo(CampoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCampo.perfilcampoSessionBean.setisBusquedaDesdeForeignKeySesionCampo(true);
			this.jInternalFrameDetalleFormCampo.perfilcampoSessionBean.setlidCampoActual(this.idCampoActual);

			campoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCampo(true);
			campoSessionBean.setlIdCampoActualForeignKey(this.idCampoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CampoSessionBean campoSessionBean=new CampoSessionBean();
		
		if(this.campoSessionBean==null) {
			this.campoSessionBean=new CampoSessionBean();
		}
		
		this.campoSessionBean.setsUltimaBusquedaCampo(this.getsAccionBusqueda());
		this.campoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.campoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdOpcion")) {
			campoSessionBean.setid_opcion(this.getid_opcionFK_IdOpcion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CampoSessionBean campoSessionBean=new CampoSessionBean();
		
		if(this.campoSessionBean==null) {
			this.campoSessionBean=new CampoSessionBean();
		}
		
		if(this.campoSessionBean.getsUltimaBusquedaCampo()!=null&&!this.campoSessionBean.getsUltimaBusquedaCampo().equals("")) {
			this.setsAccionBusqueda(campoSessionBean.getsUltimaBusquedaCampo());
			this.setiNumeroPaginacion(campoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(campoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdOpcion")) {
				this.setid_opcionFK_IdOpcion(campoSessionBean.getid_opcion());
				campoSessionBean.setid_opcion(-1L);
			}
		}
		
		this.campoSessionBean.setsUltimaBusquedaCampo("");
		this.campoSessionBean.setiNumeroPaginacion(CampoConstantesFunciones.INUMEROPAGINACION);
		this.campoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCampo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCampo() {
		this.updateBorderResaltarBusquedasFormularioCampo();
		this.updateVisibilidadBusquedasFormularioCampo();
		this.updateHabilitarBusquedasFormularioCampo();
	}
	
	public void updateBorderResaltarBusquedasFormularioCampo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCampo.getComponents().length>0) {
	

		if(this.campoConstantesFunciones.resaltarFK_IdOpcionCampo!=null) {
			index= this.jTabbedPaneBusquedasCampo.indexOfComponent(this.jPanelFK_IdOpcionCampo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCampo.getComponent(index);
				jPanel.setBorder(this.campoConstantesFunciones.resaltarFK_IdOpcionCampo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCampo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCampo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCampo.indexOfComponent(this.jPanelFK_IdOpcionCampo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCampo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.campoConstantesFunciones.mostrarFK_IdOpcionCampo);
			if(!this.campoConstantesFunciones.mostrarFK_IdOpcionCampo && index>-1) {
				this.jTabbedPaneBusquedasCampo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCampo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCampo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCampo.indexOfComponent(this.jPanelFK_IdOpcionCampo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCampo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.campoConstantesFunciones.activarFK_IdOpcionCampo);
				this.jTabbedPaneBusquedasCampo.setEnabledAt(index,this.campoConstantesFunciones.activarFK_IdOpcionCampo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCampo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdOpcion")) {
			index= this.jTabbedPaneBusquedasCampo.indexOfComponent(this.jPanelFK_IdOpcionCampo);

			this.jTabbedPaneBusquedasCampo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCampo.getComponent(index);

			this.campoConstantesFunciones.setResaltarFK_IdOpcionCampo(resaltar);

			jPanel.setBorder(this.campoConstantesFunciones.resaltarFK_IdOpcionCampo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCampo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCampo() throws Exception {

		if(this.jInternalFrameDetalleFormCampo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCampo();
		this.updateVisibilidadResaltarControlesFormularioCampo();
		this.updateHabilitarResaltarControlesFormularioCampo();
		
	}
	
	public void updateBorderResaltarControlesFormularioCampo() throws Exception {
		if(this.jInternalFrameDetalleFormCampo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.campoConstantesFunciones.resaltaridCampo!=null && this.jInternalFrameDetalleFormCampo!=null) {this.jInternalFrameDetalleFormCampo.jLabelidCampo.setBorder(this.campoConstantesFunciones.resaltaridCampo);}
		if(this.campoConstantesFunciones.resaltarid_opcionCampo!=null && this.jInternalFrameDetalleFormCampo!=null) {this.jInternalFrameDetalleFormCampo.jComboBoxid_opcionCampo.setBorder(this.campoConstantesFunciones.resaltarid_opcionCampo);}
		if(this.campoConstantesFunciones.resaltarcodigoCampo!=null && this.jInternalFrameDetalleFormCampo!=null) {this.jInternalFrameDetalleFormCampo.jTextFieldcodigoCampo.setBorder(this.campoConstantesFunciones.resaltarcodigoCampo);}
		if(this.campoConstantesFunciones.resaltarnombreCampo!=null && this.jInternalFrameDetalleFormCampo!=null) {this.jInternalFrameDetalleFormCampo.jTextAreanombreCampo.setBorder(this.campoConstantesFunciones.resaltarnombreCampo);}
		if(this.campoConstantesFunciones.resaltardescripcionCampo!=null && this.jInternalFrameDetalleFormCampo!=null) {this.jInternalFrameDetalleFormCampo.jTextAreadescripcionCampo.setBorder(this.campoConstantesFunciones.resaltardescripcionCampo);}
		if(this.campoConstantesFunciones.resaltarestadoCampo!=null && this.jInternalFrameDetalleFormCampo!=null) {this.jInternalFrameDetalleFormCampo.jCheckBoxestadoCampo.setBorderPainted(true);this.jInternalFrameDetalleFormCampo.jCheckBoxestadoCampo.setBorder(this.campoConstantesFunciones.resaltarestadoCampo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCampo() throws Exception {		
		if(this.jInternalFrameDetalleFormCampo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCampo!=null) {
	
		//this.jInternalFrameDetalleFormCampo.jLabelidCampo.setVisible(this.campoConstantesFunciones.mostraridCampo);
		this.jInternalFrameDetalleFormCampo.jPanelidCampo.setVisible(this.campoConstantesFunciones.mostraridCampo);
		//this.jInternalFrameDetalleFormCampo.jComboBoxid_opcionCampo.setVisible(this.campoConstantesFunciones.mostrarid_opcionCampo);
		this.jInternalFrameDetalleFormCampo.jPanelid_opcionCampo.setVisible(this.campoConstantesFunciones.mostrarid_opcionCampo);
		//this.jInternalFrameDetalleFormCampo.jTextFieldcodigoCampo.setVisible(this.campoConstantesFunciones.mostrarcodigoCampo);
		this.jInternalFrameDetalleFormCampo.jPanelcodigoCampo.setVisible(this.campoConstantesFunciones.mostrarcodigoCampo);
		//this.jInternalFrameDetalleFormCampo.jTextAreanombreCampo.setVisible(this.campoConstantesFunciones.mostrarnombreCampo);
		this.jInternalFrameDetalleFormCampo.jPanelnombreCampo.setVisible(this.campoConstantesFunciones.mostrarnombreCampo);
		//this.jInternalFrameDetalleFormCampo.jTextAreadescripcionCampo.setVisible(this.campoConstantesFunciones.mostrardescripcionCampo);
		this.jInternalFrameDetalleFormCampo.jPaneldescripcionCampo.setVisible(this.campoConstantesFunciones.mostrardescripcionCampo);
		//this.jInternalFrameDetalleFormCampo.jCheckBoxestadoCampo.setVisible(this.campoConstantesFunciones.mostrarestadoCampo);
		this.jInternalFrameDetalleFormCampo.jPanelestadoCampo.setVisible(this.campoConstantesFunciones.mostrarestadoCampo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCampo() throws Exception {
		if(this.jInternalFrameDetalleFormCampo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCampo!=null) {
	
		this.jInternalFrameDetalleFormCampo.jLabelidCampo.setEnabled(this.campoConstantesFunciones.activaridCampo);
		this.jInternalFrameDetalleFormCampo.jComboBoxid_opcionCampo.setEnabled(this.campoConstantesFunciones.activarid_opcionCampo);
		this.jInternalFrameDetalleFormCampo.jTextFieldcodigoCampo.setEnabled(this.campoConstantesFunciones.activarcodigoCampo);
		this.jInternalFrameDetalleFormCampo.jTextAreanombreCampo.setEnabled(this.campoConstantesFunciones.activarnombreCampo);
		this.jInternalFrameDetalleFormCampo.jTextAreadescripcionCampo.setEnabled(this.campoConstantesFunciones.activardescripcionCampo);
		this.jInternalFrameDetalleFormCampo.jCheckBoxestadoCampo.setEnabled(this.campoConstantesFunciones.activarestadoCampo);
		}
	}
	
		
}